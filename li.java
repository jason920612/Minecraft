/*    */ import java.io.IOException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class li
/*    */   implements iv<iy>
/*    */ {
/*    */   private int a;
/*    */   private int b;
/*    */   private int c;
/*    */   private int d;
/*    */   
/*    */   public li() {}
/*    */   
/*    */   public li(aer ☃) {
/* 19 */     this(☃.Q(), ☃.t, ☃.u, ☃.v);
/*    */   }
/*    */   
/*    */   public li(int ☃, double d1, double d2, double d3) {
/* 23 */     this.a = ☃;
/* 24 */     double d = 3.9D;
/* 25 */     if (d1 < -3.9D) {
/* 26 */       d1 = -3.9D;
/*    */     }
/* 28 */     if (d2 < -3.9D) {
/* 29 */       d2 = -3.9D;
/*    */     }
/* 31 */     if (d3 < -3.9D) {
/* 32 */       d3 = -3.9D;
/*    */     }
/* 34 */     if (d1 > 3.9D) {
/* 35 */       d1 = 3.9D;
/*    */     }
/* 37 */     if (d2 > 3.9D) {
/* 38 */       d2 = 3.9D;
/*    */     }
/* 40 */     if (d3 > 3.9D) {
/* 41 */       d3 = 3.9D;
/*    */     }
/* 43 */     this.b = (int)(d1 * 8000.0D);
/* 44 */     this.c = (int)(d2 * 8000.0D);
/* 45 */     this.d = (int)(d3 * 8000.0D);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(hy ☃) throws IOException {
/* 50 */     this.a = ☃.g();
/* 51 */     this.b = ☃.readShort();
/* 52 */     this.c = ☃.readShort();
/* 53 */     this.d = ☃.readShort();
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(hy ☃) throws IOException {
/* 58 */     ☃.d(this.a);
/* 59 */     ☃.writeShort(this.b);
/* 60 */     ☃.writeShort(this.c);
/* 61 */     ☃.writeShort(this.d);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(iy ☃) {
/* 66 */     ☃.a(this);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\li.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */