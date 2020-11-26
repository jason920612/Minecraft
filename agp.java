/*     */ import java.util.List;
/*     */ import java.util.function.Predicate;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class agp
/*     */   extends agt
/*     */ {
/*     */   private final afb a;
/*     */   private final Predicate<afb> b;
/*     */   private afb c;
/*     */   private final double d;
/*     */   private final aiw e;
/*     */   private int f;
/*     */   private final float g;
/*     */   private float h;
/*     */   private final float i;
/*     */   
/*     */   public agp(afb ☃, double d, float f1, float f2) {
/*  26 */     this.a = ☃;
/*  27 */     this.b = (afb1 -> (afb1 != null && ☃.getClass() != afb1.getClass()));
/*  28 */     this.d = d;
/*  29 */     this.e = ☃.t();
/*  30 */     this.g = f1;
/*  31 */     this.i = f2;
/*     */     
/*  33 */     a(3);
/*     */     
/*  35 */     if (!(☃.t() instanceof aiv) && !(☃.t() instanceof aiu)) {
/*  36 */       throw new IllegalArgumentException("Unsupported mob type for FollowMobGoal");
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a() {
/*  42 */     List<afb> ☃ = this.a.m.a(afb.class, this.a.bD().g(this.i), this.b);
/*  43 */     if (!☃.isEmpty()) {
/*  44 */       for (afb afb1 : ☃) {
/*  45 */         if (afb1.bd()) {
/*     */           continue;
/*     */         }
/*     */         
/*  49 */         this.c = afb1;
/*  50 */         return true;
/*     */       } 
/*     */     }
/*  53 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b() {
/*  58 */     return (this.c != null && !this.e.p() && this.a.h(this.c) > (this.g * this.g));
/*     */   }
/*     */ 
/*     */   
/*     */   public void c() {
/*  63 */     this.f = 0;
/*  64 */     this.h = this.a.a(cba.g);
/*  65 */     this.a.a(cba.g, 0.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public void d() {
/*  70 */     this.c = null;
/*  71 */     this.e.q();
/*  72 */     this.a.a(cba.g, this.h);
/*     */   }
/*     */ 
/*     */   
/*     */   public void e() {
/*  77 */     if (this.c == null || this.a.dm()) {
/*     */       return;
/*     */     }
/*     */     
/*  81 */     this.a.p().a(this.c, 10.0F, this.a.K());
/*     */     
/*  83 */     if (--this.f > 0) {
/*     */       return;
/*     */     }
/*  86 */     this.f = 10;
/*     */     
/*  88 */     double ☃ = this.a.q - this.c.q;
/*  89 */     double d1 = this.a.r - this.c.r;
/*  90 */     double d2 = this.a.s - this.c.s;
/*     */     
/*  92 */     double d3 = ☃ * ☃ + d1 * d1 + d2 * d2;
/*  93 */     if (d3 <= (this.g * this.g)) {
/*  94 */       this.e.q();
/*     */       
/*  96 */       aga aga = this.c.p();
/*  97 */       if (d3 <= this.g || (aga.e() == this.a.q && aga.f() == this.a.r && aga.g() == this.a.s)) {
/*  98 */         double d4 = this.c.q - this.a.q;
/*  99 */         double d5 = this.c.s - this.a.s;
/* 100 */         this.e.a(this.a.q - d4, this.a.r, this.a.s - d5, this.d);
/*     */       } 
/*     */       
/*     */       return;
/*     */     } 
/* 105 */     this.e.a(this.c, this.d);
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\agp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */