/*    */ import com.google.gson.JsonObject;
/*    */ import com.mojang.authlib.GameProfile;
/*    */ import java.io.File;
/*    */ 
/*    */ 
/*    */ public class vu
/*    */   extends vt<GameProfile, vv>
/*    */ {
/*    */   public vu(File ☃) {
/* 10 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   protected vs<GameProfile> a(JsonObject ☃) {
/* 15 */     return new vv(☃);
/*    */   }
/*    */   
/*    */   public boolean a(GameProfile ☃) {
/* 19 */     return d(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public String[] a() {
/* 24 */     String[] ☃ = new String[e().size()];
/* 25 */     int i = 0;
/* 26 */     for (vs<GameProfile> vs : e()) {
/* 27 */       ☃[i++] = ((GameProfile)vs.g()).getName();
/*    */     }
/* 29 */     return ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   protected String b(GameProfile ☃) {
/* 34 */     return ☃.getId().toString();
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\vu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */