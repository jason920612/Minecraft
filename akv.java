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
/*    */ public class akv
/*    */   extends agt
/*    */ {
/*    */   private final aku a;
/*    */   
/*    */   public akv(aku ☃) {
/* 18 */     this.a = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a() {
/* 23 */     return this.a.m.a(this.a.q, this.a.r, this.a.s, 10.0D);
/*    */   }
/*    */ 
/*    */   
/*    */   public void e() {
/* 28 */     adj ☃ = this.a.m.h(new el(this.a));
/* 29 */     this.a.s(false);
/* 30 */     this.a.u(true);
/* 31 */     this.a.b_(0);
/* 32 */     this.a.m.d(new amj(this.a.m, this.a.q, this.a.r, this.a.s, true));
/* 33 */     ann ann = a(☃, this.a);
/* 34 */     ann.m(this.a);
/*    */     
/* 36 */     for (int i = 0; i < 3; i++) {
/* 37 */       ako ako = a(☃);
/* 38 */       ann ann1 = a(☃, ako);
/* 39 */       ann1.m(ako);
/* 40 */       ako.f(this.a.ce().nextGaussian() * 0.5D, 0.0D, this.a.ce().nextGaussian() * 0.5D);
/*    */     } 
/*    */   }
/*    */   
/*    */   private ako a(adj ☃) {
/* 45 */     aku aku1 = new aku(this.a.m);
/* 46 */     aku1.a(☃, (afj)null, (gy)null);
/* 47 */     aku1.b(this.a.q, this.a.r, this.a.s);
/* 48 */     aku1.Y = 60;
/* 49 */     aku1.di();
/* 50 */     aku1.u(true);
/* 51 */     aku1.b_(0);
/* 52 */     aku1.m.a(aku1);
/* 53 */     return aku1;
/*    */   }
/*    */   
/*    */   private ann a(adj ☃, ako ako1) {
/* 57 */     ann ann = new ann(ako1.m);
/* 58 */     ann.a(☃, (afj)null, (gy)null);
/* 59 */     ann.b(ako1.q, ako1.r, ako1.s);
/* 60 */     ann.Y = 60;
/* 61 */     ann.di();
/*    */     
/* 63 */     if (ann.b(aew.f).a()) {
/* 64 */       ann.a(aew.f, new ate(atf.ac));
/*    */     }
/*    */     
/* 67 */     ann.a(aew.a, awg.a(ann.ce(), ann.cB(), (int)(5.0F + ☃.d() * ann.ce().nextInt(18)), false));
/* 68 */     ann.a(aew.f, awg.a(ann.ce(), ann.b(aew.f), (int)(5.0F + ☃.d() * ann.ce().nextInt(18)), false));
/*    */     
/* 70 */     ann.m.a(ann);
/* 71 */     return ann;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\akv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */