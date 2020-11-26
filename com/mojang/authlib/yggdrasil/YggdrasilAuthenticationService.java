/*     */ package com.mojang.authlib.yggdrasil;
/*     */ 
/*     */ import com.google.gson.Gson;
/*     */ import com.google.gson.GsonBuilder;
/*     */ import com.google.gson.JsonDeserializationContext;
/*     */ import com.google.gson.JsonDeserializer;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonParseException;
/*     */ import com.google.gson.JsonSerializationContext;
/*     */ import com.google.gson.JsonSerializer;
/*     */ import com.mojang.authlib.Agent;
/*     */ import com.mojang.authlib.GameProfile;
/*     */ import com.mojang.authlib.GameProfileRepository;
/*     */ import com.mojang.authlib.HttpAuthenticationService;
/*     */ import com.mojang.authlib.UserAuthentication;
/*     */ import com.mojang.authlib.exceptions.AuthenticationException;
/*     */ import com.mojang.authlib.exceptions.AuthenticationUnavailableException;
/*     */ import com.mojang.authlib.exceptions.InvalidCredentialsException;
/*     */ import com.mojang.authlib.exceptions.UserMigratedException;
/*     */ import com.mojang.authlib.minecraft.MinecraftSessionService;
/*     */ import com.mojang.authlib.properties.PropertyMap;
/*     */ import com.mojang.authlib.yggdrasil.response.ProfileSearchResultsResponse;
/*     */ import com.mojang.authlib.yggdrasil.response.Response;
/*     */ import com.mojang.util.UUIDTypeAdapter;
/*     */ import java.io.IOException;
/*     */ import java.lang.reflect.Type;
/*     */ import java.net.Proxy;
/*     */ import java.net.URL;
/*     */ import java.util.UUID;
/*     */ import org.apache.commons.lang3.StringUtils;
/*     */ 
/*     */ public class YggdrasilAuthenticationService
/*     */   extends HttpAuthenticationService {
/*     */   private final String clientToken;
/*     */   private final Gson gson;
/*     */   
/*     */   public YggdrasilAuthenticationService(Proxy proxy, String clientToken) {
/*  39 */     super(proxy);
/*  40 */     this.clientToken = clientToken;
/*  41 */     GsonBuilder builder = new GsonBuilder();
/*  42 */     builder.registerTypeAdapter(GameProfile.class, new GameProfileSerializer());
/*  43 */     builder.registerTypeAdapter(PropertyMap.class, new PropertyMap.Serializer());
/*  44 */     builder.registerTypeAdapter(UUID.class, new UUIDTypeAdapter());
/*  45 */     builder.registerTypeAdapter(ProfileSearchResultsResponse.class, new ProfileSearchResultsResponse.Serializer());
/*  46 */     this.gson = builder.create();
/*     */   }
/*     */ 
/*     */   
/*     */   public UserAuthentication createUserAuthentication(Agent agent) {
/*  51 */     return (UserAuthentication)new YggdrasilUserAuthentication(this, agent);
/*     */   }
/*     */ 
/*     */   
/*     */   public MinecraftSessionService createMinecraftSessionService() {
/*  56 */     return (MinecraftSessionService)new YggdrasilMinecraftSessionService(this);
/*     */   }
/*     */ 
/*     */   
/*     */   public GameProfileRepository createProfileRepository() {
/*  61 */     return new YggdrasilGameProfileRepository(this);
/*     */   }
/*     */   
/*     */   protected <T extends Response> T makeRequest(URL url, Object input, Class<T> classOfT) throws AuthenticationException {
/*     */     try {
/*  66 */       String jsonResult = (input == null) ? performGetRequest(url) : performPostRequest(url, this.gson.toJson(input), "application/json");
/*  67 */       Response response = (Response)this.gson.fromJson(jsonResult, classOfT);
/*     */       
/*  69 */       if (response == null) {
/*  70 */         return null;
/*     */       }
/*     */       
/*  73 */       if (StringUtils.isNotBlank(response.getError())) {
/*  74 */         if ("UserMigratedException".equals(response.getCause()))
/*  75 */           throw new UserMigratedException(response.getErrorMessage()); 
/*  76 */         if ("ForbiddenOperationException".equals(response.getError())) {
/*  77 */           throw new InvalidCredentialsException(response.getErrorMessage());
/*     */         }
/*  79 */         throw new AuthenticationException(response.getErrorMessage());
/*     */       } 
/*     */ 
/*     */       
/*  83 */       return (T)response;
/*  84 */     } catch (IOException e) {
/*  85 */       throw new AuthenticationUnavailableException("Cannot contact authentication server", e);
/*  86 */     } catch (IllegalStateException e) {
/*  87 */       throw new AuthenticationUnavailableException("Cannot contact authentication server", e);
/*  88 */     } catch (JsonParseException e) {
/*  89 */       throw new AuthenticationUnavailableException("Cannot contact authentication server", e);
/*     */     } 
/*     */   }
/*     */   
/*     */   public String getClientToken() {
/*  94 */     return this.clientToken;
/*     */   }
/*     */   
/*     */   private static class GameProfileSerializer
/*     */     implements JsonSerializer<GameProfile>, JsonDeserializer<GameProfile> {
/*     */     public GameProfile deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
/* 100 */       JsonObject object = (JsonObject)json;
/* 101 */       UUID id = object.has("id") ? (UUID)context.deserialize(object.get("id"), UUID.class) : null;
/* 102 */       String name = object.has("name") ? object.getAsJsonPrimitive("name").getAsString() : null;
/* 103 */       return new GameProfile(id, name);
/*     */     }
/*     */     private GameProfileSerializer() {}
/*     */     
/*     */     public JsonElement serialize(GameProfile src, Type typeOfSrc, JsonSerializationContext context) {
/* 108 */       JsonObject result = new JsonObject();
/* 109 */       if (src.getId() != null) {
/* 110 */         result.add("id", context.serialize(src.getId()));
/*     */       }
/* 112 */       if (src.getName() != null) {
/* 113 */         result.addProperty("name", src.getName());
/*     */       }
/* 115 */       return (JsonElement)result;
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\com\mojang\authlib\yggdrasil\YggdrasilAuthenticationService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */