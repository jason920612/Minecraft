/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ahd
/*     */   extends agt
/*     */ {
/*     */   private final aob a;
/*     */   private aob b;
/*     */   private final axy c;
/*     */   private int d;
/*     */   private ajg e;
/*     */   
/*     */   public ahd(aob ☃) {
/*  19 */     this.a = ☃;
/*  20 */     this.c = ☃.m;
/*  21 */     a(3);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a() {
/*  26 */     if (this.a.i() != 0) {
/*  27 */       return false;
/*     */     }
/*  29 */     if (this.a.ce().nextInt(500) != 0) {
/*  30 */       return false;
/*     */     }
/*     */     
/*  33 */     this.e = this.c.af().a(new el(this.a), 0);
/*  34 */     if (this.e == null) {
/*  35 */       return false;
/*     */     }
/*  37 */     if (!g() || !this.a.u(true)) {
/*  38 */       return false;
/*     */     }
/*     */     
/*  41 */     aer ☃ = this.c.a((Class)aob.class, this.a.bD().c(8.0D, 3.0D, 8.0D), this.a);
/*  42 */     if (☃ == null) {
/*  43 */       return false;
/*     */     }
/*     */     
/*  46 */     this.b = (aob)☃;
/*  47 */     if (this.b.i() != 0 || !this.b.u(true)) {
/*  48 */       return false;
/*     */     }
/*     */     
/*  51 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void c() {
/*  56 */     this.d = 300;
/*  57 */     this.a.s(true);
/*     */   }
/*     */ 
/*     */   
/*     */   public void d() {
/*  62 */     this.e = null;
/*  63 */     this.b = null;
/*  64 */     this.a.s(false);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b() {
/*  69 */     return (this.d >= 0 && g() && this.a.i() == 0 && this.a.u(false));
/*     */   }
/*     */ 
/*     */   
/*     */   public void e() {
/*  74 */     this.d--;
/*  75 */     this.a.p().a(this.b, 10.0F, 30.0F);
/*     */     
/*  77 */     if (this.a.h(this.b) > 2.25D) {
/*  78 */       this.a.t().a(this.b, 0.25D);
/*     */     }
/*  80 */     else if (this.d == 0 && this.b.dz()) {
/*  81 */       i();
/*     */     } 
/*     */ 
/*     */     
/*  85 */     if (this.a.ce().nextInt(35) == 0) {
/*  86 */       this.c.a(this.a, (byte)12);
/*     */     }
/*     */   }
/*     */   
/*     */   private boolean g() {
/*  91 */     if (!this.e.i()) {
/*  92 */       return false;
/*     */     }
/*     */     
/*  95 */     int ☃ = (int)(this.e.c() * 0.35D);
/*  96 */     return (this.e.e() < ☃);
/*     */   }
/*     */   
/*     */   private void i() {
/* 100 */     aob ☃ = this.a.b(this.b);
/* 101 */     this.b.b_(6000);
/* 102 */     this.a.b_(6000);
/* 103 */     this.b.v(false);
/* 104 */     this.a.v(false);
/* 105 */     ☃.b_(-24000);
/* 106 */     ☃.b(this.a.q, this.a.r, this.a.s, 0.0F, 0.0F);
/* 107 */     this.c.a(☃);
/* 108 */     this.c.a(☃, (byte)12);
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\ahd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */