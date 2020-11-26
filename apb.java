/*     */ import javax.annotation.Nullable;
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
/*     */ 
/*     */ 
/*     */ public class apb
/*     */   extends aoz
/*     */ {
/*     */   private afa e;
/*     */   
/*     */   public apb(axy ☃) {
/*  26 */     super(aev.ax, ☃);
/*     */   }
/*     */   
/*     */   public apb(axy ☃, afa afa1) {
/*  30 */     super(aev.ax, afa1, ☃);
/*  31 */     this.e = afa1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(ceb ☃) {
/*  40 */     afa afa1 = i();
/*     */     
/*  42 */     if (☃.d != null) {
/*  43 */       if (☃.d == this.e) {
/*     */         return;
/*     */       }
/*  46 */       ☃.d.a(aea.b(this, afa1), 0.0F);
/*     */     } 
/*     */     
/*  49 */     if (☃.a == ceb.a.b) {
/*  50 */       el el = ☃.a();
/*  51 */       bji bji = this.m.f(el);
/*  52 */       if (bji instanceof bkg) {
/*  53 */         bkg bkg = (bkg)bji;
/*  54 */         if (afa1 != null) {
/*  55 */           if (afa1 instanceof tf) {
/*  56 */             p.d.a((tf)afa1, this.m.a_(el));
/*     */           }
/*  58 */           bkg.a(afa1);
/*  59 */           V();
/*     */           return;
/*     */         } 
/*  62 */         bkg.a(this);
/*     */         
/*     */         return;
/*     */       } 
/*     */     } 
/*     */     
/*  68 */     for (int i = 0; i < 32; i++) {
/*  69 */       this.m.a(fm.K, this.q, this.r + this.T.nextDouble() * 2.0D, this.s, this.T.nextGaussian(), 0.0D, this.T.nextGaussian());
/*     */     }
/*     */     
/*  72 */     if (!this.m.B) {
/*  73 */       if (afa1 instanceof tf) {
/*  74 */         tf tf = (tf)afa1;
/*     */         
/*  76 */         if (tf.a.a().g() && tf.m == this.m && !tf.cL()) {
/*  77 */           if (this.T.nextFloat() < 0.05F && this.m.X().b("doMobSpawning")) {
/*  78 */             amx amx = new amx(this.m);
/*  79 */             amx.a(true);
/*  80 */             amx.b(afa1.q, afa1.r, afa1.s, afa1.w, afa1.x);
/*  81 */             this.m.a(amx);
/*     */           } 
/*     */           
/*  84 */           if (afa1.aW()) {
/*  85 */             afa1.S_();
/*     */           }
/*  87 */           afa1.a(this.q, this.r, this.s);
/*  88 */           afa1.M = 0.0F;
/*  89 */           afa1.a(aea.k, 5.0F);
/*     */         } 
/*  91 */       } else if (afa1 != null) {
/*  92 */         afa1.a(this.q, this.r, this.s);
/*  93 */         afa1.M = 0.0F;
/*     */       } 
/*  95 */       V();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void R_() {
/* 101 */     afa ☃ = i();
/* 102 */     if (☃ != null && ☃ instanceof aog && !☃.aF()) {
/* 103 */       V();
/*     */     } else {
/* 105 */       super.R_();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public aer a(bod ☃) {
/* 112 */     if (this.c.ap != ☃) {
/* 113 */       this.c = null;
/*     */     }
/* 115 */     return super.a(☃);
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\apb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */