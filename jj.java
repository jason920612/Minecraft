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
/*    */ public class jj
/*    */   implements iv<iy>
/*    */ {
/*    */   private el a;
/*    */   private int b;
/*    */   private int c;
/*    */   private bcs d;
/*    */   
/*    */   public jj() {}
/*    */   
/*    */   public jj(el ☃, bcs bcs1, int i, int j) {
/* 22 */     this.a = ☃;
/* 23 */     this.d = bcs1;
/* 24 */     this.b = i;
/* 25 */     this.c = j;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(hy ☃) throws IOException {
/* 30 */     this.a = ☃.e();
/* 31 */     this.b = ☃.readUnsignedByte();
/* 32 */     this.c = ☃.readUnsignedByte();
/*    */     
/* 34 */     this.d = fc.g.a(☃.g());
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(hy ☃) throws IOException {
/* 39 */     ☃.a(this.a);
/* 40 */     ☃.writeByte(this.b);
/* 41 */     ☃.writeByte(this.c);
/* 42 */     ☃.d(fc.g.a(this.d));
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(iy ☃) {
/* 47 */     ☃.a(this);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\jj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */