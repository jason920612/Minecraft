/*    */ import java.io.IOException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ja
/*    */   implements iv<iy>
/*    */ {
/*    */   private int a;
/*    */   private double b;
/*    */   private double c;
/*    */   private double d;
/*    */   private int e;
/*    */   
/*    */   public ja() {}
/*    */   
/*    */   public ja(aex ☃) {
/* 22 */     this.a = ☃.Q();
/* 23 */     this.b = ☃.q;
/* 24 */     this.c = ☃.r;
/* 25 */     this.d = ☃.s;
/* 26 */     this.e = ☃.f();
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(hy ☃) throws IOException {
/* 31 */     this.a = ☃.g();
/* 32 */     this.b = ☃.readDouble();
/* 33 */     this.c = ☃.readDouble();
/* 34 */     this.d = ☃.readDouble();
/* 35 */     this.e = ☃.readShort();
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(hy ☃) throws IOException {
/* 40 */     ☃.d(this.a);
/* 41 */     ☃.writeDouble(this.b);
/* 42 */     ☃.writeDouble(this.c);
/* 43 */     ☃.writeDouble(this.d);
/* 44 */     ☃.writeShort(this.e);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(iy ☃) {
/* 49 */     ☃.a(this);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\ja.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */