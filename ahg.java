/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.List;
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
/*     */ public class ahg
/*     */   extends agt
/*     */ {
/*     */   private final afg a;
/*     */   private final double b;
/*     */   private cbe c;
/*     */   private ajf d;
/*     */   private final boolean e;
/*  23 */   private final List<ajf> f = Lists.newArrayList();
/*     */   
/*     */   public ahg(afg ☃, double d, boolean bool) {
/*  26 */     this.a = ☃;
/*  27 */     this.b = d;
/*  28 */     this.e = bool;
/*  29 */     a(1);
/*     */     
/*  31 */     if (!(☃.t() instanceof aiv)) {
/*  32 */       throw new IllegalArgumentException("Unsupported mob for MoveThroughVillageGoal");
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a() {
/*  38 */     g();
/*     */     
/*  40 */     if (this.e && this.a.m.L()) {
/*  41 */       return false;
/*     */     }
/*     */     
/*  44 */     ajg ☃ = this.a.m.af().a(new el(this.a), 0);
/*  45 */     if (☃ == null) {
/*  46 */       return false;
/*     */     }
/*     */     
/*  49 */     this.d = a(☃);
/*  50 */     if (this.d == null) {
/*  51 */       return false;
/*     */     }
/*     */     
/*  54 */     aiv aiv = (aiv)this.a.t();
/*  55 */     boolean bool = aiv.g();
/*  56 */     aiv.a(false);
/*  57 */     this.c = aiv.b(this.d.d());
/*  58 */     aiv.a(bool);
/*  59 */     if (this.c != null) {
/*  60 */       return true;
/*     */     }
/*     */     
/*  63 */     cee cee = ajd.a(this.a, 10, 7, new cee(this.d.d().o(), this.d.d().p(), this.d.d().q()));
/*  64 */     if (cee == null) {
/*  65 */       return false;
/*     */     }
/*  67 */     aiv.a(false);
/*  68 */     this.c = this.a.t().a(cee.b, cee.c, cee.d);
/*  69 */     aiv.a(bool);
/*  70 */     return (this.c != null);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b() {
/*  75 */     if (this.a.t().p()) {
/*  76 */       return false;
/*     */     }
/*  78 */     float ☃ = this.a.H + 4.0F;
/*  79 */     return (this.a.c(this.d.d()) > (☃ * ☃));
/*     */   }
/*     */ 
/*     */   
/*     */   public void c() {
/*  84 */     this.a.t().a(this.c, this.b);
/*     */   }
/*     */ 
/*     */   
/*     */   public void d() {
/*  89 */     if (this.a.t().p() || this.a.c(this.d.d()) < 16.0D) {
/*  90 */       this.f.add(this.d);
/*     */     }
/*     */   }
/*     */   
/*     */   private ajf a(ajg ☃) {
/*  95 */     ajf ajf1 = null;
/*  96 */     int i = Integer.MAX_VALUE;
/*  97 */     List<ajf> list = ☃.f();
/*  98 */     for (ajf ajf2 : list) {
/*  99 */       int j = ajf2.b(xq.c(this.a.q), xq.c(this.a.r), xq.c(this.a.s));
/* 100 */       if (j >= i || 
/* 101 */         a(ajf2)) {
/*     */         continue;
/*     */       }
/* 104 */       ajf1 = ajf2;
/* 105 */       i = j;
/*     */     } 
/*     */     
/* 108 */     return ajf1;
/*     */   }
/*     */   
/*     */   private boolean a(ajf ☃) {
/* 112 */     for (ajf ajf1 : this.f) {
/* 113 */       if (☃.d().equals(ajf1.d())) {
/* 114 */         return true;
/*     */       }
/*     */     } 
/* 117 */     return false;
/*     */   }
/*     */   
/*     */   private void g() {
/* 121 */     if (this.f.size() > 15)
/* 122 */       this.f.remove(0); 
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\ahg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */