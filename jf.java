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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class jf
/*    */   implements iv<iy>
/*    */ {
/*    */   private int a;
/*    */   private int b;
/*    */   
/*    */   public jf() {}
/*    */   
/*    */   public jf(aer ☃, int i) {
/* 26 */     this.a = ☃.Q();
/* 27 */     this.b = i;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(hy ☃) throws IOException {
/* 32 */     this.a = ☃.g();
/* 33 */     this.b = ☃.readUnsignedByte();
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(hy ☃) throws IOException {
/* 38 */     ☃.d(this.a);
/* 39 */     ☃.writeByte(this.b);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(iy ☃) {
/* 44 */     ☃.a(this);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\jf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */