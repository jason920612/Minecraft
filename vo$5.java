/*     */ import com.mojang.authlib.GameProfile;
/*     */ import com.mojang.authlib.ProfileLookupCallback;
/*     */ import java.io.File;
/*     */ import java.util.UUID;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ final class null
/*     */   implements ProfileLookupCallback
/*     */ {
/*     */   null(so paramso, File paramFile1, File paramFile2, File paramFile3, String[] paramArrayOfString) {}
/*     */   
/*     */   public void onProfileLookupSucceeded(GameProfile ☃) {
/* 302 */     this.a.ar().a(☃);
/* 303 */     UUID uUID = ☃.getId();
/* 304 */     if (uUID == null) {
/* 305 */       throw new vo.a("Missing UUID for user profile " + ☃.getName(), null);
/*     */     }
/* 307 */     a(this.b, a(☃), uUID.toString());
/*     */   }
/*     */ 
/*     */   
/*     */   public void onProfileLookupFailed(GameProfile ☃, Exception exception) {
/* 312 */     vo.a().warn("Could not lookup user uuid for {}", ☃.getName(), exception);
/* 313 */     if (exception instanceof com.mojang.authlib.yggdrasil.ProfileNotFoundException) {
/* 314 */       String str = a(☃);
/* 315 */       a(this.c, str, str);
/*     */     } else {
/* 317 */       throw new vo.a("Could not request user " + ☃.getName() + " from backend systems", exception, null);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(File ☃, String str1, String str2) {
/* 322 */     File file1 = new File(this.d, str1 + ".dat");
/* 323 */     File file2 = new File(☃, str2 + ".dat");
/* 324 */     vo.a(☃);
/* 325 */     if (!file1.renameTo(file2)) {
/* 326 */       throw new vo.a("Could not convert file for " + str1, null);
/*     */     }
/*     */   }
/*     */   
/*     */   private String a(GameProfile ☃) {
/* 331 */     String str = null;
/* 332 */     for (String str1 : this.e) {
/* 333 */       if (str1 != null && str1.equalsIgnoreCase(☃.getName())) {
/* 334 */         str = str1;
/*     */         break;
/*     */       } 
/*     */     } 
/* 338 */     if (str == null) {
/* 339 */       throw new vo.a("Could not find the filename for " + ☃.getName() + " anymore", null);
/*     */     }
/* 341 */     return str;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\vo$5.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */