/*    */ import com.google.gson.JsonObject;
/*    */ import com.mojang.authlib.GameProfile;
/*    */ import java.io.File;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class vq
/*    */   extends vt<GameProfile, vr>
/*    */ {
/*    */   public vq(File ☃) {
/* 11 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   protected vs<GameProfile> a(JsonObject ☃) {
/* 16 */     return new vr(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public String[] a() {
/* 21 */     String[] ☃ = new String[e().size()];
/* 22 */     int i = 0;
/* 23 */     for (vs<GameProfile> vs : e()) {
/* 24 */       ☃[i++] = ((GameProfile)vs.g()).getName();
/*    */     }
/* 26 */     return ☃;
/*    */   }
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
/*    */   public boolean b(GameProfile ☃) {
/* 40 */     vr vr = b(☃);
/*    */     
/* 42 */     if (vr != null) {
/* 43 */       return vr.b();
/*    */     }
/*    */     
/* 46 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   protected String c(GameProfile ☃) {
/* 51 */     return ☃.getId().toString();
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\vq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */