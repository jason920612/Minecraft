/*    */ import com.mojang.authlib.GameProfile;
/*    */ import java.io.IOException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class of
/*    */   implements iv<od>
/*    */ {
/*    */   private GameProfile a;
/*    */   
/*    */   public of() {}
/*    */   
/*    */   public of(GameProfile ☃) {
/* 18 */     this.a = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(hy ☃) throws IOException {
/* 23 */     this.a = new GameProfile(null, ☃.e(16));
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(hy ☃) throws IOException {
/* 28 */     ☃.a(this.a.getName());
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(od ☃) {
/* 33 */     ☃.a(this);
/*    */   }
/*    */   
/*    */   public GameProfile b() {
/* 37 */     return this.a;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\of.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */