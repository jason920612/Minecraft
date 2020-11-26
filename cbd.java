/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class cbd
/*    */ {
/*    */   protected axk a;
/*    */   protected afb b;
/* 12 */   protected final xm<cbc> c = new xm<>();
/*    */   
/*    */   protected int d;
/*    */   
/*    */   protected int e;
/*    */   
/*    */   protected int f;
/*    */   
/*    */   protected boolean g;
/*    */   protected boolean h;
/*    */   protected boolean i;
/*    */   
/*    */   public void a(axk ☃, afb afb1) {
/* 25 */     this.a = ☃;
/* 26 */     this.b = afb1;
/* 27 */     this.c.c();
/*    */     
/* 29 */     this.d = xq.d(afb1.H + 1.0F);
/* 30 */     this.e = xq.d(afb1.I + 1.0F);
/* 31 */     this.f = xq.d(afb1.H + 1.0F);
/*    */   }
/*    */   
/*    */   public void a() {
/* 35 */     this.a = null;
/* 36 */     this.b = null;
/*    */   }
/*    */   
/*    */   protected cbc a(int ☃, int i, int j) {
/* 40 */     int k = cbc.b(☃, i, j);
/* 41 */     cbc cbc = this.c.a(k);
/*    */     
/* 43 */     if (cbc == null) {
/* 44 */       cbc = new cbc(☃, i, j);
/* 45 */       this.c.a(k, cbc);
/*    */     } 
/*    */     
/* 48 */     return cbc;
/*    */   }
/*    */   
/*    */   public abstract cbc b();
/*    */   
/*    */   public abstract cbc a(double paramDouble1, double paramDouble2, double paramDouble3);
/*    */   
/*    */   public abstract int a(cbc[] paramArrayOfcbc, cbc paramcbc1, cbc paramcbc2, float paramFloat);
/*    */   
/*    */   public abstract cba a(axk paramaxk, int paramInt1, int paramInt2, int paramInt3, afb paramafb, int paramInt4, int paramInt5, int paramInt6, boolean paramBoolean1, boolean paramBoolean2);
/*    */   
/*    */   public abstract cba a(axk paramaxk, int paramInt1, int paramInt2, int paramInt3);
/*    */   
/*    */   public void a(boolean ☃) {
/* 62 */     this.g = ☃;
/*    */   }
/*    */   
/*    */   public void b(boolean ☃) {
/* 66 */     this.h = ☃;
/*    */   }
/*    */   
/*    */   public void c(boolean ☃) {
/* 70 */     this.i = ☃;
/*    */   }
/*    */   
/*    */   public boolean c() {
/* 74 */     return this.g;
/*    */   }
/*    */   
/*    */   public boolean d() {
/* 78 */     return this.h;
/*    */   }
/*    */   
/*    */   public boolean e() {
/* 82 */     return this.i;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\cbd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */