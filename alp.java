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
/*     */ 
/*     */ 
/*     */ public class alp
/*     */   extends alg
/*     */ {
/*     */   private int b;
/*     */   private int c;
/*     */   private aep d;
/*     */   
/*     */   public alp(ald ☃) {
/*  23 */     super(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b() {
/*  28 */     this.b++;
/*     */     
/*  30 */     if (this.b % 2 == 0 && this.b < 10) {
/*  31 */       cee ☃ = this.a.a(1.0F).a();
/*  32 */       ☃.b(-0.7853982F);
/*  33 */       double d1 = this.a.bD.q;
/*  34 */       double d2 = this.a.bD.r + (this.a.bD.I / 2.0F);
/*  35 */       double d3 = this.a.bD.s;
/*  36 */       for (int i = 0; i < 8; i++) {
/*  37 */         double d4 = d1 + this.a.ce().nextGaussian() / 2.0D;
/*  38 */         double d5 = d2 + this.a.ce().nextGaussian() / 2.0D;
/*  39 */         double d6 = d3 + this.a.ce().nextGaussian() / 2.0D;
/*  40 */         for (int j = 0; j < 6; j++) {
/*  41 */           this.a.m.a(fm.j, d4, d5, d6, -☃.b * 0.07999999821186066D * j, -☃.c * 0.6000000238418579D, -☃.d * 0.07999999821186066D * j);
/*     */         }
/*  43 */         ☃.b(0.19634955F);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void c() {
/*  50 */     this.b++;
/*     */     
/*  52 */     if (this.b >= 200) {
/*  53 */       if (this.c >= 4) {
/*  54 */         this.a.dr().a(alt.e);
/*     */       } else {
/*  56 */         this.a.dr().a(alt.g);
/*     */       } 
/*  58 */     } else if (this.b == 10) {
/*  59 */       cee ☃ = (new cee(this.a.bD.q - this.a.q, 0.0D, this.a.bD.s - this.a.s)).a();
/*  60 */       float f = 5.0F;
/*  61 */       double d1 = this.a.bD.q + ☃.b * 5.0D / 2.0D;
/*  62 */       double d2 = this.a.bD.s + ☃.d * 5.0D / 2.0D;
/*  63 */       double d3 = this.a.bD.r + (this.a.bD.I / 2.0F);
/*     */       
/*  65 */       el.a a = new el.a(xq.c(d1), xq.c(d3), xq.c(d2));
/*  66 */       while (this.a.m.c(a)) {
/*  67 */         d3--;
/*  68 */         a.c(xq.c(d1), xq.c(d3), xq.c(d2));
/*     */       } 
/*  70 */       d3 = (xq.c(d3) + 1);
/*  71 */       this.d = new aep(this.a.m, d1, d3, d2);
/*  72 */       this.d.a(this.a);
/*  73 */       this.d.a(5.0F);
/*  74 */       this.d.b(200);
/*  75 */       this.d.a(fm.j);
/*  76 */       this.d.a(new aek(aem.g));
/*  77 */       this.a.m.a(this.d);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void d() {
/*  83 */     this.b = 0;
/*  84 */     this.c++;
/*     */   }
/*     */ 
/*     */   
/*     */   public void e() {
/*  89 */     if (this.d != null) {
/*  90 */       this.d.V();
/*  91 */       this.d = null;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public alt<alp> i() {
/*  97 */     return alt.f;
/*     */   }
/*     */   
/*     */   public void j() {
/* 101 */     this.c = 0;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\alp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */