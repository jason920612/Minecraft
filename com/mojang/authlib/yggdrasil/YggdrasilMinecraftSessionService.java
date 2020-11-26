/*     */ package com.mojang.authlib.yggdrasil;
/*     */ import com.google.common.cache.CacheBuilder;
/*     */ import com.google.common.cache.CacheLoader;
/*     */ import com.google.common.cache.LoadingCache;
/*     */ import com.google.common.collect.Iterables;
/*     */ import com.google.common.collect.Multimap;
/*     */ import com.google.gson.Gson;
/*     */ import com.google.gson.GsonBuilder;
/*     */ import com.google.gson.JsonParseException;
/*     */ import com.mojang.authlib.AuthenticationService;
/*     */ import com.mojang.authlib.GameProfile;
/*     */ import com.mojang.authlib.HttpAuthenticationService;
/*     */ import com.mojang.authlib.exceptions.AuthenticationException;
/*     */ import com.mojang.authlib.exceptions.AuthenticationUnavailableException;
/*     */ import com.mojang.authlib.minecraft.HttpMinecraftSessionService;
/*     */ import com.mojang.authlib.minecraft.InsecureTextureException;
/*     */ import com.mojang.authlib.minecraft.MinecraftProfileTexture;
/*     */ import com.mojang.authlib.properties.Property;
/*     */ import com.mojang.authlib.yggdrasil.request.JoinMinecraftServerRequest;
/*     */ import com.mojang.authlib.yggdrasil.response.HasJoinedMinecraftServerResponse;
/*     */ import com.mojang.authlib.yggdrasil.response.MinecraftProfilePropertiesResponse;
/*     */ import com.mojang.authlib.yggdrasil.response.MinecraftTexturesPayload;
/*     */ import com.mojang.authlib.yggdrasil.response.Response;
/*     */ import com.mojang.util.UUIDTypeAdapter;
/*     */ import java.net.InetAddress;
/*     */ import java.net.URI;
/*     */ import java.net.URISyntaxException;
/*     */ import java.net.URL;
/*     */ import java.security.KeyFactory;
/*     */ import java.security.PublicKey;
/*     */ import java.security.spec.X509EncodedKeySpec;
/*     */ import java.util.HashMap;
/*     */ import java.util.Map;
/*     */ import java.util.UUID;
/*     */ import java.util.concurrent.TimeUnit;
/*     */ import org.apache.commons.codec.Charsets;
/*     */ import org.apache.commons.codec.binary.Base64;
/*     */ import org.apache.commons.io.IOUtils;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ public class YggdrasilMinecraftSessionService extends HttpMinecraftSessionService {
/*  43 */   private static final String[] WHITELISTED_DOMAINS = new String[] { ".minecraft.net", ".mojang.com" };
/*     */ 
/*     */ 
/*     */   
/*  47 */   private static final Logger LOGGER = LogManager.getLogger();
/*     */   private static final String BASE_URL = "https://sessionserver.mojang.com/session/minecraft/";
/*  49 */   private static final URL JOIN_URL = HttpAuthenticationService.constantURL("https://sessionserver.mojang.com/session/minecraft/join");
/*  50 */   private static final URL CHECK_URL = HttpAuthenticationService.constantURL("https://sessionserver.mojang.com/session/minecraft/hasJoined");
/*     */   
/*     */   private final PublicKey publicKey;
/*  53 */   private final Gson gson = (new GsonBuilder()).registerTypeAdapter(UUID.class, new UUIDTypeAdapter()).create();
/*     */   
/*  55 */   private final LoadingCache<GameProfile, GameProfile> insecureProfiles = CacheBuilder.newBuilder()
/*  56 */     .expireAfterWrite(6L, TimeUnit.HOURS)
/*  57 */     .build(new CacheLoader<GameProfile, GameProfile>()
/*     */       {
/*     */         public GameProfile load(GameProfile key) throws Exception {
/*  60 */           return YggdrasilMinecraftSessionService.this.fillGameProfile(key, false);
/*     */         }
/*     */       });
/*     */   
/*     */   protected YggdrasilMinecraftSessionService(YggdrasilAuthenticationService authenticationService) {
/*  65 */     super(authenticationService);
/*     */     
/*     */     try {
/*  68 */       X509EncodedKeySpec spec = new X509EncodedKeySpec(IOUtils.toByteArray(YggdrasilMinecraftSessionService.class.getResourceAsStream("/yggdrasil_session_pubkey.der")));
/*  69 */       KeyFactory keyFactory = KeyFactory.getInstance("RSA");
/*  70 */       this.publicKey = keyFactory.generatePublic(spec);
/*  71 */     } catch (Exception ignored) {
/*  72 */       throw new Error("Missing/invalid yggdrasil public key!");
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void joinServer(GameProfile profile, String authenticationToken, String serverId) throws AuthenticationException {
/*  78 */     JoinMinecraftServerRequest request = new JoinMinecraftServerRequest();
/*  79 */     request.accessToken = authenticationToken;
/*  80 */     request.selectedProfile = profile.getId();
/*  81 */     request.serverId = serverId;
/*     */     
/*  83 */     getAuthenticationService().makeRequest(JOIN_URL, request, Response.class);
/*     */   }
/*     */ 
/*     */   
/*     */   public GameProfile hasJoinedServer(GameProfile user, String serverId, InetAddress address) throws AuthenticationUnavailableException {
/*  88 */     Map<String, Object> arguments = new HashMap<>();
/*     */     
/*  90 */     arguments.put("username", user.getName());
/*  91 */     arguments.put("serverId", serverId);
/*     */     
/*  93 */     if (address != null) {
/*  94 */       arguments.put("ip", address.getHostAddress());
/*     */     }
/*     */     
/*  97 */     URL url = HttpAuthenticationService.concatenateURL(CHECK_URL, HttpAuthenticationService.buildQuery(arguments));
/*     */     
/*     */     try {
/* 100 */       HasJoinedMinecraftServerResponse response = getAuthenticationService().<HasJoinedMinecraftServerResponse>makeRequest(url, null, HasJoinedMinecraftServerResponse.class);
/*     */       
/* 102 */       if (response != null && response.getId() != null) {
/* 103 */         GameProfile result = new GameProfile(response.getId(), user.getName());
/*     */         
/* 105 */         if (response.getProperties() != null) {
/* 106 */           result.getProperties().putAll((Multimap)response.getProperties());
/*     */         }
/*     */         
/* 109 */         return result;
/*     */       } 
/* 111 */       return null;
/*     */     }
/* 113 */     catch (AuthenticationUnavailableException e) {
/* 114 */       throw e;
/* 115 */     } catch (AuthenticationException ignored) {
/* 116 */       return null;
/*     */     } 
/*     */   }
/*     */   
/*     */   public Map<MinecraftProfileTexture.Type, MinecraftProfileTexture> getTextures(GameProfile profile, boolean requireSecure) {
/*     */     MinecraftTexturesPayload result;
/* 122 */     Property textureProperty = (Property)Iterables.getFirst(profile.getProperties().get("textures"), null);
/*     */     
/* 124 */     if (textureProperty == null) {
/* 125 */       return new HashMap<>();
/*     */     }
/*     */     
/* 128 */     if (requireSecure) {
/* 129 */       if (!textureProperty.hasSignature()) {
/* 130 */         LOGGER.error("Signature is missing from textures payload");
/* 131 */         throw new InsecureTextureException("Signature is missing from textures payload");
/*     */       } 
/*     */       
/* 134 */       if (!textureProperty.isSignatureValid(this.publicKey)) {
/* 135 */         LOGGER.error("Textures payload has been tampered with (signature invalid)");
/* 136 */         throw new InsecureTextureException("Textures payload has been tampered with (signature invalid)");
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/*     */     try {
/* 142 */       String json = new String(Base64.decodeBase64(textureProperty.getValue()), Charsets.UTF_8);
/* 143 */       result = (MinecraftTexturesPayload)this.gson.fromJson(json, MinecraftTexturesPayload.class);
/* 144 */     } catch (JsonParseException e) {
/* 145 */       LOGGER.error("Could not decode textures payload", (Throwable)e);
/* 146 */       return new HashMap<>();
/*     */     } 
/*     */     
/* 149 */     if (result == null || result.getTextures() == null) {
/* 150 */       return new HashMap<>();
/*     */     }
/*     */     
/* 153 */     for (Map.Entry<MinecraftProfileTexture.Type, MinecraftProfileTexture> entry : (Iterable<Map.Entry<MinecraftProfileTexture.Type, MinecraftProfileTexture>>)result.getTextures().entrySet()) {
/* 154 */       if (!isWhitelistedDomain(((MinecraftProfileTexture)entry.getValue()).getUrl())) {
/* 155 */         LOGGER.error("Textures payload has been tampered with (non-whitelisted domain)");
/* 156 */         return new HashMap<>();
/*     */       } 
/*     */     } 
/*     */     
/* 160 */     return result.getTextures();
/*     */   }
/*     */ 
/*     */   
/*     */   public GameProfile fillProfileProperties(GameProfile profile, boolean requireSecure) {
/* 165 */     if (profile.getId() == null) {
/* 166 */       return profile;
/*     */     }
/*     */     
/* 169 */     if (!requireSecure) {
/* 170 */       return (GameProfile)this.insecureProfiles.getUnchecked(profile);
/*     */     }
/*     */     
/* 173 */     return fillGameProfile(profile, true);
/*     */   }
/*     */   
/*     */   protected GameProfile fillGameProfile(GameProfile profile, boolean requireSecure) {
/*     */     try {
/* 178 */       URL url = HttpAuthenticationService.constantURL("https://sessionserver.mojang.com/session/minecraft/profile/" + UUIDTypeAdapter.fromUUID(profile.getId()));
/* 179 */       url = HttpAuthenticationService.concatenateURL(url, "unsigned=" + (!requireSecure ? 1 : 0));
/* 180 */       MinecraftProfilePropertiesResponse response = getAuthenticationService().<MinecraftProfilePropertiesResponse>makeRequest(url, null, MinecraftProfilePropertiesResponse.class);
/*     */       
/* 182 */       if (response == null) {
/* 183 */         LOGGER.debug("Couldn't fetch profile properties for " + profile + " as the profile does not exist");
/* 184 */         return profile;
/*     */       } 
/* 186 */       GameProfile result = new GameProfile(response.getId(), response.getName());
/* 187 */       result.getProperties().putAll((Multimap)response.getProperties());
/* 188 */       profile.getProperties().putAll((Multimap)response.getProperties());
/* 189 */       LOGGER.debug("Successfully fetched profile properties for " + profile);
/* 190 */       return result;
/*     */     }
/* 192 */     catch (AuthenticationException e) {
/* 193 */       LOGGER.warn("Couldn't look up profile properties for " + profile, (Throwable)e);
/* 194 */       return profile;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public YggdrasilAuthenticationService getAuthenticationService() {
/* 200 */     return (YggdrasilAuthenticationService)super.getAuthenticationService();
/*     */   }
/*     */   
/*     */   private static boolean isWhitelistedDomain(String url) {
/* 204 */     URI uri = null;
/*     */     
/*     */     try {
/* 207 */       uri = new URI(url);
/* 208 */     } catch (URISyntaxException ignored) {
/* 209 */       throw new IllegalArgumentException("Invalid URL '" + url + "'");
/*     */     } 
/*     */     
/* 212 */     String domain = uri.getHost();
/*     */     
/* 214 */     for (int i = 0; i < WHITELISTED_DOMAINS.length; i++) {
/* 215 */       if (domain.endsWith(WHITELISTED_DOMAINS[i])) {
/* 216 */         return true;
/*     */       }
/*     */     } 
/* 219 */     return false;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\com\mojang\authlib\yggdrasil\YggdrasilMinecraftSessionService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */