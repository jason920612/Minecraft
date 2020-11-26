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
/*    */ public class ks
/*    */   implements iv<iy>
/*    */ {
/*    */   private double a;
/*    */   private double b;
/*    */   private double c;
/*    */   private int d;
/*    */   private ca.a e;
/*    */   private ca.a f;
/*    */   private boolean g;
/*    */   
/*    */   public ks() {}
/*    */   
/*    */   public ks(ca.a ☃, double d1, double d2, double d3) {
/* 27 */     this.e = ☃;
/* 28 */     this.a = d1;
/* 29 */     this.b = d2;
/* 30 */     this.c = d3;
/*    */   }
/*    */   
/*    */   public ks(ca.a ☃, aer aer1, ca.a a1) {
/* 34 */     this.e = ☃;
/* 35 */     this.d = aer1.Q();
/* 36 */     this.f = a1;
/* 37 */     cee cee = a1.a(aer1);
/* 38 */     this.a = cee.b;
/* 39 */     this.b = cee.c;
/* 40 */     this.c = cee.d;
/* 41 */     this.g = true;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(hy ☃) throws IOException {
/* 46 */     this.e = ☃.<ca.a>a(ca.a.class);
/* 47 */     this.a = ☃.readDouble();
/* 48 */     this.b = ☃.readDouble();
/* 49 */     this.c = ☃.readDouble();
/* 50 */     if (☃.readBoolean()) {
/* 51 */       this.g = true;
/* 52 */       this.d = ☃.g();
/* 53 */       this.f = ☃.<ca.a>a(ca.a.class);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(hy ☃) throws IOException {
/* 59 */     ☃.a(this.e);
/* 60 */     ☃.writeDouble(this.a);
/* 61 */     ☃.writeDouble(this.b);
/* 62 */     ☃.writeDouble(this.c);
/* 63 */     ☃.writeBoolean(this.g);
/* 64 */     if (this.g) {
/* 65 */       ☃.d(this.d);
/* 66 */       ☃.a(this.f);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(iy ☃) {
/* 72 */     ☃.a(this);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\ks.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */