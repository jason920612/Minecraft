/*    */ import com.mojang.authlib.GameProfile;
/*    */ import java.io.IOException;
/*    */ import java.util.UUID;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class nz
/*    */   implements iv<nx>
/*    */ {
/*    */   private GameProfile a;
/*    */   
/*    */   public nz() {}
/*    */   
/*    */   public nz(GameProfile ☃) {
/* 19 */     this.a = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(hy ☃) throws IOException {
/* 24 */     String str1 = ☃.e(36);
/* 25 */     String str2 = ☃.e(16);
/* 26 */     UUID uUID = UUID.fromString(str1);
/* 27 */     this.a = new GameProfile(uUID, str2);
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(hy ☃) throws IOException {
/* 32 */     UUID uUID = this.a.getId();
/* 33 */     ☃.a((uUID == null) ? "" : uUID.toString());
/* 34 */     ☃.a(this.a.getName());
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(nx ☃) {
/* 39 */     ☃.a(this);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\nz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */