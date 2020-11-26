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
/*     */ public class ape
/*     */   extends aok
/*     */ {
/*  29 */   private static final or<Byte> h = ou.a((Class)ape.class, ot.a);
/*     */   
/*  31 */   private ate aw = new ate(atf.eX);
/*     */   
/*     */   private boolean ax;
/*     */   public int g;
/*     */   
/*     */   public ape(axy ☃) {
/*  37 */     super(aev.aQ, ☃);
/*     */   }
/*     */   
/*     */   public ape(axy ☃, afa afa1, ate ate1) {
/*  41 */     super(aev.aQ, afa1, ☃);
/*  42 */     this.aw = ate1.i();
/*  43 */     this.ab.b(h, Byte.valueOf((byte)awg.f(ate1)));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void x_() {
/*  52 */     super.x_();
/*     */     
/*  54 */     this.ab.a(h, Byte.valueOf((byte)0));
/*     */   }
/*     */ 
/*     */   
/*     */   public void R_() {
/*  59 */     if (this.c > 4) {
/*  60 */       this.ax = true;
/*     */     }
/*     */     
/*  63 */     aer ☃ = k();
/*  64 */     if ((this.ax || q()) && ☃ != null) {
/*  65 */       int i = ((Byte)this.ab.<Byte>a(h)).byteValue();
/*  66 */       if (i > 0 && !r()) {
/*  67 */         if (!this.m.B && this.d == aok.a.b) {
/*  68 */           a(l(), 0.1F);
/*     */         }
/*  70 */         V();
/*  71 */       } else if (i > 0) {
/*  72 */         o(true);
/*  73 */         cee cee = new cee(☃.q - this.q, ☃.r + ☃.bF() - this.r, ☃.s - this.s);
/*  74 */         this.r += cee.c * 0.015D * i;
/*  75 */         if (this.m.B) {
/*  76 */           this.O = this.r;
/*     */         }
/*  78 */         cee = cee.a();
/*  79 */         double d = 0.05D * i;
/*  80 */         this.t += cee.b * d - this.t * 0.05D;
/*  81 */         this.u += cee.c * d - this.u * 0.05D;
/*  82 */         this.v += cee.d * d - this.v * 0.05D;
/*     */         
/*  84 */         if (this.g == 0) {
/*  85 */           a(wj.jJ, 10.0F, 1.0F);
/*     */         }
/*     */         
/*  88 */         this.g++;
/*     */       } 
/*     */     } 
/*     */     
/*  92 */     super.R_();
/*     */   }
/*     */   
/*     */   private boolean r() {
/*  96 */     aer ☃ = k();
/*  97 */     if (☃ == null || !☃.aF()) {
/*  98 */       return false;
/*     */     }
/* 100 */     if (☃ instanceof tf && ((tf)☃).t()) {
/* 101 */       return false;
/*     */     }
/* 103 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   protected ate l() {
/* 108 */     return this.aw.i();
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   protected aer a(cee ☃, cee cee1) {
/* 114 */     if (this.ax) {
/* 115 */       return null;
/*     */     }
/* 117 */     return super.a(☃, cee1);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b(ceb ☃) {
/* 122 */     aer aer1 = ☃.d;
/* 123 */     float f1 = 8.0F;
/*     */     
/* 125 */     if (aer1 instanceof afa) {
/* 126 */       afa afa = (afa)aer1;
/* 127 */       f1 += awg.a(this.aw, afa.cA());
/*     */     } 
/*     */     
/* 130 */     aer aer2 = k();
/* 131 */     aea aea = aea.a(this, (aer2 == null) ? this : aer2);
/*     */     
/* 133 */     this.ax = true;
/* 134 */     wi wi = wj.jH;
/* 135 */     if (aer1.a(aea, f1) && 
/* 136 */       aer1 instanceof afa) {
/* 137 */       afa afa = (afa)aer1;
/* 138 */       if (aer2 instanceof afa) {
/* 139 */         awg.a(afa, aer2);
/* 140 */         awg.b((afa)aer2, afa);
/*     */       } 
/* 142 */       a(afa);
/*     */     } 
/*     */     
/* 145 */     this.t *= -0.009999999776482582D;
/* 146 */     this.u *= -0.10000000149011612D;
/* 147 */     this.v *= -0.009999999776482582D;
/*     */     
/* 149 */     float f2 = 1.0F;
/* 150 */     if (this.m.Y() && awg.h(this.aw)) {
/* 151 */       el el = aer1.bH();
/* 152 */       if (this.m.e(el)) {
/* 153 */         amj amj = new amj(this.m, el.o() + 0.5D, el.p(), el.q() + 0.5D, false);
/* 154 */         amj.d((aer2 instanceof tf) ? (tf)aer2 : null);
/* 155 */         this.m.d(amj);
/* 156 */         wi = wj.jO;
/* 157 */         f2 = 5.0F;
/*     */       } 
/*     */     } 
/* 160 */     a(wi, f2, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi i() {
/* 165 */     return wj.jI;
/*     */   }
/*     */ 
/*     */   
/*     */   public void d(aog ☃) {
/* 170 */     aer aer = k();
/*     */     
/* 172 */     if (aer != null && aer.bt() != ☃.bt()) {
/*     */       return;
/*     */     }
/* 175 */     super.d(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(gy ☃) {
/* 180 */     super.a(☃);
/*     */     
/* 182 */     if (☃.c("Trident", 10)) {
/* 183 */       this.aw = ate.a(☃.p("Trident"));
/*     */     }
/* 185 */     this.ax = ☃.q("DealtDamage");
/*     */     
/* 187 */     this.ab.b(h, Byte.valueOf((byte)awg.f(this.aw)));
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(gy ☃) {
/* 192 */     super.b(☃);
/*     */     
/* 194 */     ☃.a("Trident", this.aw.b(new gy()));
/* 195 */     ☃.a("DealtDamage", this.ax);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void f() {
/* 200 */     int ☃ = ((Byte)this.ab.<Byte>a(h)).byteValue();
/*     */     
/* 202 */     if (this.d != aok.a.b || ☃ <= 0) {
/* 203 */       super.f();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected float p() {
/* 209 */     return 0.99F;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\ape.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */