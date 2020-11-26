/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ahb
/*    */   extends agt
/*    */ {
/*    */   protected afb a;
/*    */   protected aer b;
/*    */   protected float c;
/*    */   private int e;
/*    */   private final float f;
/*    */   protected Class<? extends aer> d;
/*    */   
/*    */   public ahb(afb ☃, Class<? extends aer> clazz, float f) {
/* 18 */     this(☃, clazz, f, 0.02F);
/*    */   }
/*    */   
/*    */   public ahb(afb ☃, Class<? extends aer> clazz, float f1, float f2) {
/* 22 */     this.a = ☃;
/* 23 */     this.d = clazz;
/* 24 */     this.c = f1;
/* 25 */     this.f = f2;
/* 26 */     a(2);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a() {
/* 31 */     if (this.a.ce().nextFloat() >= this.f) {
/* 32 */       return false;
/*    */     }
/*    */     
/* 35 */     if (this.a.v() != null) {
/* 36 */       this.b = this.a.v();
/*    */     }
/* 38 */     if (this.d == aog.class) {
/* 39 */       this.b = this.a.m.a(this.a.q, this.a.r, this.a.s, this.c, aeu.f.and(aeu.b(this.a)));
/*    */     } else {
/* 41 */       this.b = this.a.m.a(this.d, this.a.bD().c(this.c, 3.0D, this.c), this.a);
/*    */     } 
/*    */     
/* 44 */     return (this.b != null);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean b() {
/* 49 */     if (!this.b.aF()) {
/* 50 */       return false;
/*    */     }
/* 52 */     if (this.a.h(this.b) > (this.c * this.c)) {
/* 53 */       return false;
/*    */     }
/* 55 */     return (this.e > 0);
/*    */   }
/*    */ 
/*    */   
/*    */   public void c() {
/* 60 */     this.e = 40 + this.a.ce().nextInt(40);
/*    */   }
/*    */ 
/*    */   
/*    */   public void d() {
/* 65 */     this.b = null;
/*    */   }
/*    */ 
/*    */   
/*    */   public void e() {
/* 70 */     this.a.p().a(this.b.q, this.b.r + this.b.bF(), this.b.s, this.a.L(), this.a.K());
/* 71 */     this.e--;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\ahb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */