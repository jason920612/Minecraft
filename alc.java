/*     */ import java.util.Optional;
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
/*     */ public class alc
/*     */   extends aer
/*     */ {
/*  22 */   private static final or<Optional<el>> b = ou.a((Class)alc.class, ot.m);
/*  23 */   private static final or<Boolean> c = ou.a((Class)alc.class, ot.i);
/*     */   
/*     */   public int a;
/*     */   
/*     */   public alc(axy ☃) {
/*  28 */     super(aev.q, ☃);
/*  29 */     this.j = true;
/*  30 */     a(2.0F, 2.0F);
/*     */     
/*  32 */     this.a = this.T.nextInt(100000);
/*     */   }
/*     */   
/*     */   public alc(axy ☃, double d1, double d2, double d3) {
/*  36 */     this(☃);
/*  37 */     b(d1, d2, d3);
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean ak() {
/*  42 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void x_() {
/*  47 */     T().a(b, Optional.empty());
/*  48 */     T().a(c, Boolean.valueOf(true));
/*     */   }
/*     */ 
/*     */   
/*     */   public void R_() {
/*  53 */     this.n = this.q;
/*  54 */     this.o = this.r;
/*  55 */     this.p = this.s;
/*  56 */     this.a++;
/*     */     
/*  58 */     if (!this.m.B) {
/*  59 */       el ☃ = new el(this);
/*  60 */       if (this.m.t instanceof boi && this.m.a_(☃).f()) {
/*  61 */         this.m.a(☃, bct.ch.p());
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b(gy ☃) {
/*  68 */     if (f() != null) {
/*  69 */       ☃.a("BeamTarget", hk.a(f()));
/*     */     }
/*  71 */     ☃.a("ShowBottom", i());
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(gy ☃) {
/*  76 */     if (☃.c("BeamTarget", 10)) {
/*  77 */       a(hk.c(☃.p("BeamTarget")));
/*     */     }
/*  79 */     if (☃.c("ShowBottom", 1)) {
/*  80 */       a(☃.q("ShowBottom"));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean aB() {
/*  86 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(aea ☃, float f) {
/*  91 */     if (b(☃)) {
/*  92 */       return false;
/*     */     }
/*  94 */     if (☃.k() instanceof ald) {
/*  95 */       return false;
/*     */     }
/*  97 */     if (!this.G && !this.m.B) {
/*  98 */       V();
/*     */       
/* 100 */       if (!this.m.B) {
/* 101 */         if (!☃.d()) {
/* 102 */           this.m.a((aer)null, this.q, this.r, this.s, 6.0F, true);
/*     */         }
/* 104 */         a(☃);
/*     */       } 
/*     */     } 
/* 107 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void S() {
/* 112 */     a(aea.n);
/* 113 */     super.S();
/*     */   }
/*     */   
/*     */   private void a(aea ☃) {
/* 117 */     if (this.m.t instanceof boi) {
/* 118 */       boi boi = (boi)this.m.t;
/* 119 */       boh boh = boi.r();
/* 120 */       if (boh != null) {
/* 121 */         boh.a(this, ☃);
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(@Nullable el ☃) {
/* 127 */     T().b(b, Optional.ofNullable(☃));
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public el f() {
/* 132 */     return ((Optional<el>)T().<Optional<el>>a(b)).orElse(null);
/*     */   }
/*     */   
/*     */   public void a(boolean ☃) {
/* 136 */     T().b(c, Boolean.valueOf(☃));
/*     */   }
/*     */   
/*     */   public boolean i() {
/* 140 */     return ((Boolean)T().<Boolean>a(c)).booleanValue();
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\alc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */