/*    */ import java.io.IOException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ky
/*    */   implements iv<iy>
/*    */ {
/*    */   private String a;
/*    */   private String b;
/*    */   
/*    */   public ky() {}
/*    */   
/*    */   public ky(String ☃, String str1) {
/* 20 */     this.a = ☃;
/* 21 */     this.b = str1;
/*    */     
/* 23 */     if (str1.length() > 40) {
/* 24 */       throw new IllegalArgumentException("Hash is too long (max 40, was " + str1.length() + ")");
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(hy ☃) throws IOException {
/* 30 */     this.a = ☃.e(32767);
/* 31 */     this.b = ☃.e(40);
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(hy ☃) throws IOException {
/* 36 */     ☃.a(this.a);
/* 37 */     ☃.a(this.b);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(iy ☃) {
/* 42 */     ☃.a(this);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\ky.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */