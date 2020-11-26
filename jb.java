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
/*    */ public class jb
/*    */   implements iv<iy>
/*    */ {
/*    */   private int a;
/*    */   private double b;
/*    */   private double c;
/*    */   private double d;
/*    */   private int e;
/*    */   
/*    */   public jb() {}
/*    */   
/*    */   public jb(aer ☃) {
/* 25 */     this.a = ☃.Q();
/* 26 */     this.b = ☃.q;
/* 27 */     this.c = ☃.r;
/* 28 */     this.d = ☃.s;
/* 29 */     if (☃ instanceof amj) {
/* 30 */       this.e = 1;
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(hy ☃) throws IOException {
/* 36 */     this.a = ☃.g();
/* 37 */     this.e = ☃.readByte();
/* 38 */     this.b = ☃.readDouble();
/* 39 */     this.c = ☃.readDouble();
/* 40 */     this.d = ☃.readDouble();
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(hy ☃) throws IOException {
/* 45 */     ☃.d(this.a);
/* 46 */     ☃.writeByte(this.e);
/* 47 */     ☃.writeDouble(this.b);
/* 48 */     ☃.writeDouble(this.c);
/* 49 */     ☃.writeDouble(this.d);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(iy ☃) {
/* 54 */     ☃.a(this);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\jb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */