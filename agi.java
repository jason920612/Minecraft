/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class agi
/*     */   extends agt
/*     */ {
/*     */   protected final ajq a;
/*     */   private final Class<? extends ajq> d;
/*     */   protected axy b;
/*     */   protected ajq c;
/*     */   private int e;
/*     */   private final double f;
/*     */   
/*     */   public agi(ajq ☃, double d) {
/*  26 */     this(☃, d, (Class)☃.getClass());
/*     */   }
/*     */   
/*     */   public agi(ajq ☃, double d, Class<? extends ajq> clazz) {
/*  30 */     this.a = ☃;
/*  31 */     this.b = ☃.m;
/*  32 */     this.d = clazz;
/*  33 */     this.f = d;
/*  34 */     a(3);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a() {
/*  39 */     if (!this.a.dF()) {
/*  40 */       return false;
/*     */     }
/*  42 */     this.c = i();
/*  43 */     return (this.c != null);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b() {
/*  48 */     return (this.c.aF() && this.c.dF() && this.e < 60);
/*     */   }
/*     */ 
/*     */   
/*     */   public void d() {
/*  53 */     this.c = null;
/*  54 */     this.e = 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public void e() {
/*  59 */     this.a.p().a(this.c, 10.0F, this.a.K());
/*  60 */     this.a.t().a(this.c, this.f);
/*  61 */     this.e++;
/*  62 */     if (this.e >= 60 && this.a.h(this.c) < 9.0D) {
/*  63 */       g();
/*     */     }
/*     */   }
/*     */   
/*     */   private ajq i() {
/*  68 */     List<ajq> ☃ = this.b.a(this.d, this.a.bD().g(8.0D));
/*  69 */     double d = Double.MAX_VALUE;
/*  70 */     ajq ajq1 = null;
/*  71 */     for (ajq ajq2 : ☃) {
/*  72 */       if (this.a.a(ajq2) && this.a.h(ajq2) < d) {
/*  73 */         ajq1 = ajq2;
/*  74 */         d = this.a.h(ajq2);
/*     */       } 
/*     */     } 
/*  77 */     return ajq1;
/*     */   }
/*     */   
/*     */   protected void g() {
/*  81 */     aeo ☃ = this.a.a(this.c);
/*  82 */     if (☃ == null) {
/*     */       return;
/*     */     }
/*     */     
/*  86 */     tf tf = this.a.dE();
/*  87 */     if (tf == null && this.c.dE() != null) {
/*  88 */       tf = this.c.dE();
/*     */     }
/*     */     
/*  91 */     if (tf != null) {
/*  92 */       tf.a(ws.N);
/*     */       
/*  94 */       p.o.a(tf, this.a, this.c, ☃);
/*     */     } 
/*     */     
/*  97 */     this.a.b_(6000);
/*  98 */     this.c.b_(6000);
/*  99 */     this.a.dG();
/* 100 */     this.c.dG();
/* 101 */     ☃.b_(-24000);
/* 102 */     ☃.b(this.a.q, this.a.r, this.a.s, 0.0F, 0.0F);
/* 103 */     this.b.a(☃);
/*     */     
/* 105 */     Random random = this.a.ce();
/* 106 */     for (int i = 0; i < 7; i++) {
/* 107 */       double d1 = random.nextGaussian() * 0.02D;
/* 108 */       double d2 = random.nextGaussian() * 0.02D;
/* 109 */       double d3 = random.nextGaussian() * 0.02D;
/*     */       
/* 111 */       double d4 = random.nextDouble() * this.a.H * 2.0D - this.a.H;
/* 112 */       double d5 = 0.5D + random.nextDouble() * this.a.I;
/* 113 */       double d6 = random.nextDouble() * this.a.H * 2.0D - this.a.H;
/*     */       
/* 115 */       this.b.a(fm.A, this.a.q + d4, this.a.r + d5, this.a.s + d6, d1, d2, d3);
/*     */     } 
/*     */     
/* 118 */     if (this.b.X().b("doMobLoot"))
/* 119 */       this.b.a(new aex(this.b, this.a.q, this.a.r, this.a.s, random.nextInt(7) + 1)); 
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\agi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */