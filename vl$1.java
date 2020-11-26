/*    */ import com.mojang.authlib.GameProfile;
/*    */ import com.mojang.authlib.ProfileLookupCallback;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ final class null
/*    */   implements ProfileLookupCallback
/*    */ {
/*    */   null(GameProfile[] paramArrayOfGameProfile) {}
/*    */   
/*    */   public void onProfileLookupSucceeded(GameProfile ☃) {
/* 71 */     this.a[0] = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public void onProfileLookupFailed(GameProfile ☃, Exception exception) {
/* 76 */     this.a[0] = null;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\vl$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */