/*    */ import java.io.IOException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class jh
/*    */   implements iv<iy>
/*    */ {
/*    */   private int a;
/*    */   private el b;
/*    */   private int c;
/*    */   
/*    */   public jh() {}
/*    */   
/*    */   public jh(int ☃, el el1, int i) {
/* 19 */     this.a = ☃;
/* 20 */     this.b = el1;
/* 21 */     this.c = i;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(hy ☃) throws IOException {
/* 26 */     this.a = ☃.g();
/* 27 */     this.b = ☃.e();
/* 28 */     this.c = ☃.readUnsignedByte();
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(hy ☃) throws IOException {
/* 33 */     ☃.d(this.a);
/* 34 */     ☃.a(this.b);
/* 35 */     ☃.writeByte(this.c);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(iy ☃) {
/* 40 */     ☃.a(this);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\jh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */