/*     */ package com.mojang.authlib.yggdrasil;
/*     */ import com.google.common.collect.Multimap;
/*     */ import com.mojang.authlib.Agent;
/*     */ import com.mojang.authlib.AuthenticationService;
/*     */ import com.mojang.authlib.GameProfile;
/*     */ import com.mojang.authlib.HttpAuthenticationService;
/*     */ import com.mojang.authlib.HttpUserAuthentication;
/*     */ import com.mojang.authlib.UserType;
/*     */ import com.mojang.authlib.exceptions.AuthenticationException;
/*     */ import com.mojang.authlib.exceptions.InvalidCredentialsException;
/*     */ import com.mojang.authlib.yggdrasil.request.AuthenticationRequest;
/*     */ import com.mojang.authlib.yggdrasil.request.RefreshRequest;
/*     */ import com.mojang.authlib.yggdrasil.request.ValidateRequest;
/*     */ import com.mojang.authlib.yggdrasil.response.AuthenticationResponse;
/*     */ import com.mojang.authlib.yggdrasil.response.RefreshResponse;
/*     */ import com.mojang.authlib.yggdrasil.response.Response;
/*     */ import com.mojang.authlib.yggdrasil.response.User;
/*     */ import java.net.URL;
/*     */ import java.util.Arrays;
/*     */ import java.util.Map;
/*     */ import org.apache.commons.lang3.ArrayUtils;
/*     */ import org.apache.commons.lang3.StringUtils;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ public class YggdrasilUserAuthentication extends HttpUserAuthentication {
/*  27 */   private static final Logger LOGGER = LogManager.getLogger();
/*     */   private static final String BASE_URL = "https://authserver.mojang.com/";
/*  29 */   private static final URL ROUTE_AUTHENTICATE = HttpAuthenticationService.constantURL("https://authserver.mojang.com/authenticate");
/*  30 */   private static final URL ROUTE_REFRESH = HttpAuthenticationService.constantURL("https://authserver.mojang.com/refresh");
/*  31 */   private static final URL ROUTE_VALIDATE = HttpAuthenticationService.constantURL("https://authserver.mojang.com/validate");
/*  32 */   private static final URL ROUTE_INVALIDATE = HttpAuthenticationService.constantURL("https://authserver.mojang.com/invalidate");
/*  33 */   private static final URL ROUTE_SIGNOUT = HttpAuthenticationService.constantURL("https://authserver.mojang.com/signout");
/*     */   
/*     */   private static final String STORAGE_KEY_ACCESS_TOKEN = "accessToken";
/*     */   
/*     */   private final Agent agent;
/*     */   private GameProfile[] profiles;
/*     */   private String accessToken;
/*     */   private boolean isOnline;
/*     */   
/*     */   public YggdrasilUserAuthentication(YggdrasilAuthenticationService authenticationService, Agent agent) {
/*  43 */     super(authenticationService);
/*  44 */     this.agent = agent;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean canLogIn() {
/*  49 */     return (!canPlayOnline() && StringUtils.isNotBlank(getUsername()) && (StringUtils.isNotBlank(getPassword()) || StringUtils.isNotBlank(getAuthenticatedToken())));
/*     */   }
/*     */ 
/*     */   
/*     */   public void logIn() throws AuthenticationException {
/*  54 */     if (StringUtils.isBlank(getUsername())) {
/*  55 */       throw new InvalidCredentialsException("Invalid username");
/*     */     }
/*     */     
/*  58 */     if (StringUtils.isNotBlank(getAuthenticatedToken())) {
/*  59 */       logInWithToken();
/*  60 */     } else if (StringUtils.isNotBlank(getPassword())) {
/*  61 */       logInWithPassword();
/*     */     } else {
/*  63 */       throw new InvalidCredentialsException("Invalid password");
/*     */     } 
/*     */   }
/*     */   
/*     */   protected void logInWithPassword() throws AuthenticationException {
/*  68 */     if (StringUtils.isBlank(getUsername())) {
/*  69 */       throw new InvalidCredentialsException("Invalid username");
/*     */     }
/*  71 */     if (StringUtils.isBlank(getPassword())) {
/*  72 */       throw new InvalidCredentialsException("Invalid password");
/*     */     }
/*     */     
/*  75 */     LOGGER.info("Logging in with username & password");
/*     */     
/*  77 */     AuthenticationRequest request = new AuthenticationRequest(this, getUsername(), getPassword());
/*  78 */     AuthenticationResponse response = getAuthenticationService().<AuthenticationResponse>makeRequest(ROUTE_AUTHENTICATE, request, AuthenticationResponse.class);
/*     */     
/*  80 */     if (!response.getClientToken().equals(getAuthenticationService().getClientToken())) {
/*  81 */       throw new AuthenticationException("Server requested we change our client token. Don't know how to handle this!");
/*     */     }
/*     */     
/*  84 */     if (response.getSelectedProfile() != null) {
/*  85 */       setUserType(response.getSelectedProfile().isLegacy() ? UserType.LEGACY : UserType.MOJANG);
/*  86 */     } else if (ArrayUtils.isNotEmpty((Object[])response.getAvailableProfiles())) {
/*  87 */       setUserType(response.getAvailableProfiles()[0].isLegacy() ? UserType.LEGACY : UserType.MOJANG);
/*     */     } 
/*     */     
/*  90 */     User user = response.getUser();
/*     */     
/*  92 */     if (user != null && user.getId() != null) {
/*  93 */       setUserid(user.getId());
/*     */     } else {
/*  95 */       setUserid(getUsername());
/*     */     } 
/*     */     
/*  98 */     this.isOnline = true;
/*  99 */     this.accessToken = response.getAccessToken();
/* 100 */     this.profiles = response.getAvailableProfiles();
/* 101 */     setSelectedProfile(response.getSelectedProfile());
/* 102 */     getModifiableUserProperties().clear();
/*     */     
/* 104 */     updateUserProperties(user);
/*     */   }
/*     */   
/*     */   protected void updateUserProperties(User user) {
/* 108 */     if (user == null) {
/*     */       return;
/*     */     }
/*     */     
/* 112 */     if (user.getProperties() != null) {
/* 113 */       getModifiableUserProperties().putAll((Multimap)user.getProperties());
/*     */     }
/*     */   }
/*     */   
/*     */   protected void logInWithToken() throws AuthenticationException {
/* 118 */     if (StringUtils.isBlank(getUserID())) {
/* 119 */       if (StringUtils.isBlank(getUsername())) {
/* 120 */         setUserid(getUsername());
/*     */       } else {
/* 122 */         throw new InvalidCredentialsException("Invalid uuid & username");
/*     */       } 
/*     */     }
/* 125 */     if (StringUtils.isBlank(getAuthenticatedToken())) {
/* 126 */       throw new InvalidCredentialsException("Invalid access token");
/*     */     }
/*     */     
/* 129 */     LOGGER.info("Logging in with access token");
/*     */     
/* 131 */     if (checkTokenValidity()) {
/* 132 */       LOGGER.debug("Skipping refresh call as we're safely logged in.");
/* 133 */       this.isOnline = true;
/*     */       
/*     */       return;
/*     */     } 
/* 137 */     RefreshRequest request = new RefreshRequest(this);
/* 138 */     RefreshResponse response = getAuthenticationService().<RefreshResponse>makeRequest(ROUTE_REFRESH, request, RefreshResponse.class);
/*     */     
/* 140 */     if (!response.getClientToken().equals(getAuthenticationService().getClientToken())) {
/* 141 */       throw new AuthenticationException("Server requested we change our client token. Don't know how to handle this!");
/*     */     }
/*     */     
/* 144 */     if (response.getSelectedProfile() != null) {
/* 145 */       setUserType(response.getSelectedProfile().isLegacy() ? UserType.LEGACY : UserType.MOJANG);
/* 146 */     } else if (ArrayUtils.isNotEmpty((Object[])response.getAvailableProfiles())) {
/* 147 */       setUserType(response.getAvailableProfiles()[0].isLegacy() ? UserType.LEGACY : UserType.MOJANG);
/*     */     } 
/*     */     
/* 150 */     if (response.getUser() != null && response.getUser().getId() != null) {
/* 151 */       setUserid(response.getUser().getId());
/*     */     } else {
/* 153 */       setUserid(getUsername());
/*     */     } 
/*     */     
/* 156 */     this.isOnline = true;
/* 157 */     this.accessToken = response.getAccessToken();
/* 158 */     this.profiles = response.getAvailableProfiles();
/* 159 */     setSelectedProfile(response.getSelectedProfile());
/* 160 */     getModifiableUserProperties().clear();
/*     */     
/* 162 */     updateUserProperties(response.getUser());
/*     */   }
/*     */   
/*     */   protected boolean checkTokenValidity() throws AuthenticationException {
/* 166 */     ValidateRequest request = new ValidateRequest(this);
/*     */     try {
/* 168 */       getAuthenticationService().makeRequest(ROUTE_VALIDATE, request, Response.class);
/* 169 */       return true;
/* 170 */     } catch (AuthenticationException ignored) {
/* 171 */       return false;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void logOut() {
/* 177 */     super.logOut();
/*     */     
/* 179 */     this.accessToken = null;
/* 180 */     this.profiles = null;
/* 181 */     this.isOnline = false;
/*     */   }
/*     */ 
/*     */   
/*     */   public GameProfile[] getAvailableProfiles() {
/* 186 */     return this.profiles;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isLoggedIn() {
/* 191 */     return StringUtils.isNotBlank(this.accessToken);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean canPlayOnline() {
/* 196 */     return (isLoggedIn() && getSelectedProfile() != null && this.isOnline);
/*     */   }
/*     */ 
/*     */   
/*     */   public void selectGameProfile(GameProfile profile) throws AuthenticationException {
/* 201 */     if (!isLoggedIn()) {
/* 202 */       throw new AuthenticationException("Cannot change game profile whilst not logged in");
/*     */     }
/* 204 */     if (getSelectedProfile() != null) {
/* 205 */       throw new AuthenticationException("Cannot change game profile. You must log out and back in.");
/*     */     }
/* 207 */     if (profile == null || !ArrayUtils.contains((Object[])this.profiles, profile)) {
/* 208 */       throw new IllegalArgumentException("Invalid profile '" + profile + "'");
/*     */     }
/*     */     
/* 211 */     RefreshRequest request = new RefreshRequest(this, profile);
/* 212 */     RefreshResponse response = getAuthenticationService().<RefreshResponse>makeRequest(ROUTE_REFRESH, request, RefreshResponse.class);
/*     */     
/* 214 */     if (!response.getClientToken().equals(getAuthenticationService().getClientToken())) {
/* 215 */       throw new AuthenticationException("Server requested we change our client token. Don't know how to handle this!");
/*     */     }
/*     */     
/* 218 */     this.isOnline = true;
/* 219 */     this.accessToken = response.getAccessToken();
/* 220 */     setSelectedProfile(response.getSelectedProfile());
/*     */   }
/*     */ 
/*     */   
/*     */   public void loadFromStorage(Map<String, Object> credentials) {
/* 225 */     super.loadFromStorage(credentials);
/*     */     
/* 227 */     this.accessToken = String.valueOf(credentials.get("accessToken"));
/*     */   }
/*     */ 
/*     */   
/*     */   public Map<String, Object> saveForStorage() {
/* 232 */     Map<String, Object> result = super.saveForStorage();
/*     */     
/* 234 */     if (StringUtils.isNotBlank(getAuthenticatedToken())) {
/* 235 */       result.put("accessToken", getAuthenticatedToken());
/*     */     }
/*     */     
/* 238 */     return result;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   public String getSessionToken() {
/* 246 */     if (isLoggedIn() && getSelectedProfile() != null && canPlayOnline()) {
/* 247 */       return String.format("token:%s:%s", new Object[] { getAuthenticatedToken(), getSelectedProfile().getId() });
/*     */     }
/* 249 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getAuthenticatedToken() {
/* 255 */     return this.accessToken;
/*     */   }
/*     */   
/*     */   public Agent getAgent() {
/* 259 */     return this.agent;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 264 */     return "YggdrasilAuthenticationService{agent=" + this.agent + ", profiles=" + 
/*     */       
/* 266 */       Arrays.toString((Object[])this.profiles) + ", selectedProfile=" + 
/* 267 */       getSelectedProfile() + ", username='" + 
/* 268 */       getUsername() + '\'' + ", isLoggedIn=" + 
/* 269 */       isLoggedIn() + ", userType=" + 
/* 270 */       getUserType() + ", canPlayOnline=" + 
/* 271 */       canPlayOnline() + ", accessToken='" + this.accessToken + '\'' + ", clientToken='" + 
/*     */       
/* 273 */       getAuthenticationService().getClientToken() + '\'' + '}';
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public YggdrasilAuthenticationService getAuthenticationService() {
/* 279 */     return (YggdrasilAuthenticationService)super.getAuthenticationService();
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\com\mojang\authlib\yggdrasil\YggdrasilUserAuthentication.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */