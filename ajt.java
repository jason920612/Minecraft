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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ajt
/*     */   extends ajq
/*     */ {
/*     */   protected ajt(aev<?> ☃, axy axy1) {
/*  32 */     super(☃, axy1);
/*  33 */     a(0.9F, 1.4F);
/*     */   }
/*     */   
/*     */   public ajt(axy ☃) {
/*  37 */     this(aev.j, ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void n() {
/*  42 */     this.by.a(0, new agm(this));
/*  43 */     this.by.a(1, new aho(this, 2.0D));
/*  44 */     this.by.a(2, new agi(this, 1.0D));
/*  45 */     this.by.a(3, new aic(this, 1.25D, avh.a(new axx[] { atf.S }, ), false));
/*  46 */     this.by.a(4, new ags(this, 1.25D));
/*  47 */     this.by.a(5, new aih(this, 1.0D));
/*  48 */     this.by.a(6, new ahb(this, (Class)aog.class, 6.0F));
/*  49 */     this.by.a(7, new ahq(this));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void bZ() {
/*  54 */     super.bZ();
/*     */     
/*  56 */     a(ank.a).a(10.0D);
/*  57 */     a(ank.d).a(0.20000000298023224D);
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi D() {
/*  62 */     return wj.aT;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi d(aea ☃) {
/*  67 */     return wj.aV;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi cs() {
/*  72 */     return wj.aU;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(el ☃, blc blc1) {
/*  77 */     a(wj.aX, 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   protected float cD() {
/*  82 */     return 0.4F;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   protected pc G() {
/*  88 */     return ccl.S;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(aog ☃, adk adk1) {
/*  93 */     ate ate = ☃.b(adk1);
/*  94 */     if (ate.b() == atf.aw && !☃.bV.d && !y_()) {
/*  95 */       ☃.a(wj.aW, 1.0F, 1.0F);
/*     */ 
/*     */       
/*  98 */       ate.g(1);
/*  99 */       if (ate.a()) {
/* 100 */         ☃.a(adk1, new ate(atf.aK));
/* 101 */       } else if (!☃.bB.e(new ate(atf.aK))) {
/* 102 */         ☃.a(new ate(atf.aK), false);
/*     */       } 
/*     */       
/* 105 */       return true;
/*     */     } 
/* 107 */     return super.a(☃, adk1);
/*     */   }
/*     */ 
/*     */   
/*     */   public ajt b(aeo ☃) {
/* 112 */     return new ajt(this.m);
/*     */   }
/*     */ 
/*     */   
/*     */   public float bF() {
/* 117 */     if (y_()) {
/* 118 */       return this.I;
/*     */     }
/* 120 */     return 1.3F;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\ajt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */