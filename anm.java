/*     */ import java.util.Random;
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
/*     */ 
/*     */ 
/*     */ public class anm
/*     */   extends ang
/*     */ {
/*     */   private b a;
/*     */   
/*     */   public anm(axy ☃) {
/*  37 */     super(aev.aj, ☃);
/*  38 */     a(0.4F, 0.3F);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void n() {
/*  43 */     this.a = new b(this);
/*     */     
/*  45 */     this.by.a(1, new agm(this));
/*     */     
/*  47 */     this.by.a(3, this.a);
/*     */     
/*  49 */     this.by.a(4, new ahe(this, 1.0D, false));
/*  50 */     this.by.a(5, new a(this));
/*     */     
/*  52 */     this.bz.a(1, new ail(this, true, new Class[0]));
/*  53 */     this.bz.a(2, new aio<>(this, aog.class, true));
/*     */   }
/*     */ 
/*     */   
/*     */   public double aI() {
/*  58 */     return 0.1D;
/*     */   }
/*     */ 
/*     */   
/*     */   public float bF() {
/*  63 */     return 0.1F;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void bZ() {
/*  68 */     super.bZ();
/*     */     
/*  70 */     a(ank.a).a(8.0D);
/*  71 */     a(ank.d).a(0.25D);
/*  72 */     a(ank.f).a(1.0D);
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean ak() {
/*  77 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi D() {
/*  82 */     return wj.ip;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi d(aea ☃) {
/*  87 */     return wj.ir;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi cs() {
/*  92 */     return wj.iq;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(el ☃, blc blc1) {
/*  97 */     a(wj.is, 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(aea ☃, float f) {
/* 102 */     if (b(☃)) {
/* 103 */       return false;
/*     */     }
/* 105 */     if ((☃ instanceof aeb || ☃ == aea.o) && this.a != null) {
/* 106 */       this.a.g();
/*     */     }
/* 108 */     return super.a(☃, f);
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   protected pc G() {
/* 114 */     return ccl.B;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void R_() {
/* 120 */     this.aQ = this.w;
/*     */     
/* 122 */     super.R_();
/*     */   }
/*     */ 
/*     */   
/*     */   public void k(float ☃) {
/* 127 */     this.w = ☃;
/* 128 */     super.k(☃);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public float a(el ☃, ayc ayc1) {
/* 134 */     if (bfl.k(ayc1.a_(☃.b()))) {
/* 135 */       return 10.0F;
/*     */     }
/* 137 */     return super.a(☃, ayc1);
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean K_() {
/* 142 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(axz ☃, boolean bool) {
/* 147 */     if (super.a(☃, bool)) {
/* 148 */       aog aog = ☃.b(this, 5.0D);
/* 149 */       return (aog == null);
/*     */     } 
/* 151 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public afd cA() {
/* 156 */     return afd.c;
/*     */   }
/*     */   
/*     */   static class b extends agt {
/*     */     private final anm a;
/*     */     private int b;
/*     */     
/*     */     public b(anm ☃) {
/* 164 */       this.a = ☃;
/*     */     }
/*     */     
/*     */     public void g() {
/* 168 */       if (this.b == 0) {
/* 169 */         this.b = 20;
/*     */       }
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 175 */       return (this.b > 0);
/*     */     }
/*     */ 
/*     */     
/*     */     public void e() {
/* 180 */       this.b--;
/* 181 */       if (this.b <= 0) {
/* 182 */         axy ☃ = this.a.m;
/* 183 */         Random random = this.a.ce();
/*     */ 
/*     */         
/* 186 */         el el = new el(this.a);
/*     */         
/*     */         int i;
/* 189 */         for (i = 0; i <= 5 && i >= -5; i = ((i <= 0) ? 1 : 0) - i) {
/* 190 */           int j; for (j = 0; j <= 10 && j >= -10; j = ((j <= 0) ? 1 : 0) - j) {
/* 191 */             int k; for (k = 0; k <= 10 && k >= -10; k = ((k <= 0) ? 1 : 0) - k) {
/* 192 */               el el1 = el.a(j, i, k);
/* 193 */               blc blc = ☃.a_(el1);
/*     */               
/* 195 */               bcs bcs = blc.c();
/* 196 */               if (bcs instanceof bfl) {
/* 197 */                 if (☃.X().b("mobGriefing")) {
/* 198 */                   ☃.a(el1, true);
/*     */                 } else {
/* 200 */                   ☃.a(el1, ((bfl)bcs).d().p(), 3);
/*     */                 } 
/* 202 */                 if (random.nextBoolean())
/*     */                   // Byte code: goto -> 238 
/*     */               } 
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   static class a
/*     */     extends ahr {
/*     */     private eq h;
/*     */     private boolean i;
/*     */     
/*     */     public a(anm ☃) {
/* 218 */       super(☃, 1.0D, 10);
/*     */       
/* 220 */       a(1);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 225 */       if (this.a.v() != null) {
/* 226 */         return false;
/*     */       }
/* 228 */       if (!this.a.t().p()) {
/* 229 */         return false;
/*     */       }
/*     */       
/* 232 */       Random ☃ = this.a.ce();
/* 233 */       if (this.a.m.X().b("mobGriefing") && ☃.nextInt(10) == 0) {
/* 234 */         this.h = eq.a(☃);
/*     */         
/* 236 */         el el = (new el(this.a.q, this.a.r + 0.5D, this.a.s)).a(this.h);
/* 237 */         blc blc = this.a.m.a_(el);
/* 238 */         if (bfl.k(blc)) {
/* 239 */           this.i = true;
/* 240 */           return true;
/*     */         } 
/*     */       } 
/*     */       
/* 244 */       this.i = false;
/* 245 */       return super.a();
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean b() {
/* 250 */       if (this.i) {
/* 251 */         return false;
/*     */       }
/* 253 */       return super.b();
/*     */     }
/*     */ 
/*     */     
/*     */     public void c() {
/* 258 */       if (!this.i) {
/* 259 */         super.c();
/*     */         
/*     */         return;
/*     */       } 
/* 263 */       axz ☃ = this.a.m;
/* 264 */       el el = (new el(this.a.q, this.a.r + 0.5D, this.a.s)).a(this.h);
/* 265 */       blc blc = ☃.a_(el);
/*     */       
/* 267 */       if (bfl.k(blc)) {
/* 268 */         ☃.a(el, bfl.f(blc.c()), 3);
/* 269 */         this.a.B();
/* 270 */         this.a.V();
/*     */       } 
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\anm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */