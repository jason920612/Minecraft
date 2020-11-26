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
/*    */ public class la
/*    */   implements iv<iy>
/*    */ {
/*    */   private int a;
/*    */   private byte b;
/*    */   
/*    */   public la() {}
/*    */   
/*    */   public la(aer ☃, byte b) {
/* 20 */     this.a = ☃.Q();
/* 21 */     this.b = b;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(hy ☃) throws IOException {
/* 26 */     this.a = ☃.g();
/* 27 */     this.b = ☃.readByte();
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(hy ☃) throws IOException {
/* 32 */     ☃.d(this.a);
/* 33 */     ☃.writeByte(this.b);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(iy ☃) {
/* 38 */     ☃.a(this);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\la.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */