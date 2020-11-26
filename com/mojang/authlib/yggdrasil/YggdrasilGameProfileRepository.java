/*    */ package com.mojang.authlib.yggdrasil;
/*    */ 
/*    */ import com.google.common.base.Strings;
/*    */ import com.google.common.collect.Iterables;
/*    */ import com.google.common.collect.Sets;
/*    */ import com.mojang.authlib.Agent;
/*    */ import com.mojang.authlib.GameProfile;
/*    */ import com.mojang.authlib.GameProfileRepository;
/*    */ import com.mojang.authlib.HttpAuthenticationService;
/*    */ import com.mojang.authlib.ProfileLookupCallback;
/*    */ import com.mojang.authlib.exceptions.AuthenticationException;
/*    */ import com.mojang.authlib.yggdrasil.response.ProfileSearchResultsResponse;
/*    */ import java.util.List;
/*    */ import java.util.Set;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ 
/*    */ public class YggdrasilGameProfileRepository
/*    */   implements GameProfileRepository {
/* 20 */   private static final Logger LOGGER = LogManager.getLogger();
/*    */   
/*    */   private static final String BASE_URL = "https://api.mojang.com/";
/*    */   private static final String SEARCH_PAGE_URL = "https://api.mojang.com/profiles/";
/*    */   private static final int ENTRIES_PER_PAGE = 2;
/*    */   private static final int MAX_FAIL_COUNT = 3;
/*    */   private static final int DELAY_BETWEEN_PAGES = 100;
/*    */   private static final int DELAY_BETWEEN_FAILURES = 750;
/*    */   private final YggdrasilAuthenticationService authenticationService;
/*    */   
/*    */   public YggdrasilGameProfileRepository(YggdrasilAuthenticationService authenticationService) {
/* 31 */     this.authenticationService = authenticationService;
/*    */   }
/*    */ 
/*    */   
/*    */   public void findProfilesByNames(String[] names, Agent agent, ProfileLookupCallback callback) {
/* 36 */     Set<String> criteria = Sets.newHashSet();
/*    */     
/* 38 */     for (String name : names) {
/* 39 */       if (!Strings.isNullOrEmpty(name)) {
/* 40 */         criteria.add(name.toLowerCase());
/*    */       }
/*    */     } 
/*    */     
/* 44 */     int page = 0;
/*    */     
/* 46 */     label48: for (List<String> request : (Iterable<List<String>>)Iterables.partition(criteria, 2)) {
/* 47 */       int failCount = 0;
/*    */ 
/*    */       
/*    */       while (true) {
/* 51 */         boolean failed = false;
/*    */         
/*    */         try {
/* 54 */           ProfileSearchResultsResponse response = this.authenticationService.<ProfileSearchResultsResponse>makeRequest(HttpAuthenticationService.constantURL("https://api.mojang.com/profiles/" + agent.getName().toLowerCase()), request, ProfileSearchResultsResponse.class);
/* 55 */           failCount = 0;
/*    */           
/* 57 */           LOGGER.debug("Page {} returned {} results, parsing", Integer.valueOf(0), Integer.valueOf((response.getProfiles()).length));
/*    */           
/* 59 */           Set<String> missing = Sets.newHashSet(request);
/* 60 */           for (GameProfile profile : response.getProfiles()) {
/* 61 */             LOGGER.debug("Successfully looked up profile {}", profile);
/* 62 */             missing.remove(profile.getName().toLowerCase());
/* 63 */             callback.onProfileLookupSucceeded(profile);
/*    */           } 
/*    */           
/* 66 */           for (String name : missing) {
/* 67 */             LOGGER.debug("Couldn't find profile {}", name);
/* 68 */             callback.onProfileLookupFailed(new GameProfile(null, name), new ProfileNotFoundException("Server did not find the requested profile"));
/*    */           } 
/*    */           
/*    */           try {
/* 72 */             Thread.sleep(100L);
/* 73 */           } catch (InterruptedException interruptedException) {}
/*    */         }
/* 75 */         catch (AuthenticationException e) {
/* 76 */           failCount++;
/*    */           
/* 78 */           if (failCount == 3) {
/* 79 */             for (String name : request) {
/* 80 */               LOGGER.debug("Couldn't find profile {} because of a server error", name);
/* 81 */               callback.onProfileLookupFailed(new GameProfile(null, name), (Exception)e);
/*    */             } 
/*    */           } else {
/*    */             try {
/* 85 */               Thread.sleep(750L);
/* 86 */             } catch (InterruptedException interruptedException) {}
/*    */             
/* 88 */             failed = true;
/*    */           } 
/*    */         } 
/* 91 */         if (!failed)
/*    */           continue label48; 
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\com\mojang\authlib\yggdrasil\YggdrasilGameProfileRepository.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */