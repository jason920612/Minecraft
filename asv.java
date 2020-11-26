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
/*     */ 
/*     */ 
/*     */ public class asv
/*     */   extends ata
/*     */ {
/*     */   private final int a;
/*     */   private final float b;
/*     */   private final boolean c;
/*     */   private boolean d;
/*     */   private boolean e;
/*     */   private aek k;
/*     */   private float l;
/*     */   
/*     */   public asv(int ☃, float f, boolean bool, ata.a a1) {
/*  29 */     super(a1);
/*  30 */     this.a = ☃;
/*  31 */     this.c = bool;
/*  32 */     this.b = f;
/*     */   }
/*     */ 
/*     */   
/*     */   public ate a(ate ☃, axy axy1, afa afa1) {
/*  37 */     if (afa1 instanceof aog) {
/*  38 */       aog aog = (aog)afa1;
/*  39 */       aog.dw().a(this, ☃);
/*  40 */       axy1.a((aog)null, aog.q, aog.r, aog.s, wj.gT, wk.h, 0.5F, axy1.s.nextFloat() * 0.1F + 0.9F);
/*     */       
/*  42 */       a(☃, axy1, aog);
/*  43 */       aog.b(ws.c.b(this));
/*     */       
/*  45 */       if (aog instanceof tf) {
/*  46 */         p.z.a((tf)aog, ☃);
/*     */       }
/*     */     } 
/*     */     
/*  50 */     ☃.g(1);
/*     */     
/*  52 */     return ☃;
/*     */   }
/*     */   
/*     */   protected void a(ate ☃, axy axy1, aog aog1) {
/*  56 */     if (!axy1.B && this.k != null && axy1.s.nextFloat() < this.l) {
/*  57 */       aog1.c(new aek(this.k));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public int c(ate ☃) {
/*  63 */     return this.e ? 16 : 32;
/*     */   }
/*     */ 
/*     */   
/*     */   public auo d(ate ☃) {
/*  68 */     return auo.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public adn<ate> a(axy ☃, aog aog1, adk adk1) {
/*  73 */     ate ate = aog1.b(adk1);
/*  74 */     if (aog1.q(this.d)) {
/*  75 */       aog1.c(adk1);
/*  76 */       return new adn<>(adm.a, ate);
/*     */     } 
/*  78 */     return new adn<>(adm.c, ate);
/*     */   }
/*     */   
/*     */   public int e(ate ☃) {
/*  82 */     return this.a;
/*     */   }
/*     */   
/*     */   public float f(ate ☃) {
/*  86 */     return this.b;
/*     */   }
/*     */   
/*     */   public boolean d() {
/*  90 */     return this.c;
/*     */   }
/*     */   
/*     */   public asv a(aek ☃, float f) {
/*  94 */     this.k = ☃;
/*  95 */     this.l = f;
/*  96 */     return this;
/*     */   }
/*     */   
/*     */   public asv e() {
/* 100 */     this.d = true;
/* 101 */     return this;
/*     */   }
/*     */   
/*     */   public asv f() {
/* 105 */     this.e = true;
/* 106 */     return this;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\asv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */