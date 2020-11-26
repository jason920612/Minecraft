/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class aht
/*    */   extends agt
/*    */ {
/*    */   private final afb a;
/*    */   private final anj b;
/*    */   private afa c;
/* 13 */   private int d = -1;
/*    */   private final double e;
/*    */   private int f;
/*    */   private final int g;
/*    */   private final int h;
/*    */   private final float i;
/*    */   private final float j;
/*    */   
/*    */   public aht(anj ☃, double d, int i, float f) {
/* 22 */     this(☃, d, i, i, f);
/*    */   }
/*    */   
/*    */   public aht(anj ☃, double d, int i, int j, float f) {
/* 26 */     if (!(☃ instanceof afa)) {
/* 27 */       throw new IllegalArgumentException("ArrowAttackGoal requires Mob implements RangedAttackMob");
/*    */     }
/* 29 */     this.b = ☃;
/* 30 */     this.a = (afb)☃;
/* 31 */     this.e = d;
/* 32 */     this.g = i;
/* 33 */     this.h = j;
/* 34 */     this.i = f;
/* 35 */     this.j = f * f;
/* 36 */     a(3);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a() {
/* 41 */     afa ☃ = this.a.v();
/* 42 */     if (☃ == null) {
/* 43 */       return false;
/*    */     }
/* 45 */     this.c = ☃;
/* 46 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean b() {
/* 51 */     return (a() || !this.a.t().p());
/*    */   }
/*    */ 
/*    */   
/*    */   public void d() {
/* 56 */     this.c = null;
/* 57 */     this.f = 0;
/* 58 */     this.d = -1;
/*    */   }
/*    */ 
/*    */   
/*    */   public void e() {
/* 63 */     double ☃ = this.a.d(this.c.q, (this.c.bD()).b, this.c.s);
/* 64 */     boolean bool = this.a.u().a(this.c);
/*    */     
/* 66 */     if (bool) {
/* 67 */       this.f++;
/*    */     } else {
/* 69 */       this.f = 0;
/*    */     } 
/*    */     
/* 72 */     if (☃ > this.j || this.f < 20) {
/* 73 */       this.a.t().a(this.c, this.e);
/*    */     } else {
/* 75 */       this.a.t().q();
/*    */     } 
/*    */     
/* 78 */     this.a.p().a(this.c, 30.0F, 30.0F);
/*    */     
/* 80 */     if (--this.d == 0) {
/* 81 */       if (!bool) {
/*    */         return;
/*    */       }
/*    */       
/* 85 */       float f1 = xq.a(☃) / this.i;
/* 86 */       float f2 = f1;
/* 87 */       f2 = xq.a(f2, 0.1F, 1.0F);
/*    */       
/* 89 */       this.b.a(this.c, f2);
/* 90 */       this.d = xq.d(f1 * (this.h - this.g) + this.g);
/* 91 */     } else if (this.d < 0) {
/* 92 */       float f = xq.a(☃) / this.i;
/* 93 */       this.d = xq.d(f * (this.h - this.g) + this.g);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\aht.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */