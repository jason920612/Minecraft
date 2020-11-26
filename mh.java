/*    */ import java.io.IOException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class mh
/*    */   implements iv<me>
/*    */ {
/*    */   private String a;
/*    */   
/*    */   public mh() {}
/*    */   
/*    */   public mh(String ☃) {
/* 18 */     if (☃.length() > 256) {
/* 19 */       ☃ = ☃.substring(0, 256);
/*    */     }
/*    */     
/* 22 */     this.a = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(hy ☃) throws IOException {
/* 27 */     this.a = ☃.e(256);
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(hy ☃) throws IOException {
/* 32 */     ☃.a(this.a);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(me ☃) {
/* 37 */     ☃.a(this);
/*    */   }
/*    */   
/*    */   public String b() {
/* 41 */     return this.a;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\mh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */