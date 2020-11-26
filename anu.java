/*     */ import java.util.List;
/*     */ import java.util.UUID;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class anu
/*     */   extends ang
/*     */   implements anj
/*     */ {
/*  44 */   private static final UUID a = UUID.fromString("5CD17E52-A79A-43D3-A529-90FDE04B181E");
/*  45 */   private static final afo b = (new afo(a, "Drinking speed penalty", -0.25D, 0)).a(false);
/*     */   
/*  47 */   private static final or<Boolean> c = ou.a((Class)anu.class, ot.i);
/*     */   
/*     */   private int bC;
/*     */   
/*     */   public anu(axy ☃) {
/*  52 */     super(aev.aE, ☃);
/*  53 */     a(0.6F, 1.95F);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void n() {
/*  58 */     this.by.a(1, new agm(this));
/*  59 */     this.by.a(2, new aht(this, 1.0D, 60, 10.0F));
/*  60 */     this.by.a(2, new aih(this, 1.0D));
/*  61 */     this.by.a(3, new ahb(this, (Class)aog.class, 8.0F));
/*  62 */     this.by.a(3, new ahq(this));
/*     */     
/*  64 */     this.bz.a(1, new ail(this, false, new Class[0]));
/*  65 */     this.bz.a(2, new aio<>(this, aog.class, true));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void x_() {
/*  70 */     super.x_();
/*     */     
/*  72 */     T().a(c, Boolean.valueOf(false));
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi D() {
/*  77 */     return wj.kE;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi d(aea ☃) {
/*  82 */     return wj.kH;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi cs() {
/*  87 */     return wj.kF;
/*     */   }
/*     */   
/*     */   public void a(boolean ☃) {
/*  91 */     T().b(c, Boolean.valueOf(☃));
/*     */   }
/*     */   
/*     */   public boolean l() {
/*  95 */     return ((Boolean)T().<Boolean>a(c)).booleanValue();
/*     */   }
/*     */ 
/*     */   
/*     */   protected void bZ() {
/* 100 */     super.bZ();
/*     */     
/* 102 */     a(ank.a).a(26.0D);
/* 103 */     a(ank.d).a(0.25D);
/*     */   }
/*     */ 
/*     */   
/*     */   public void k() {
/* 108 */     if (!this.m.B) {
/* 109 */       if (l()) {
/* 110 */         if (this.bC-- <= 0) {
/* 111 */           a(false);
/* 112 */           ate ☃ = cB();
/* 113 */           a(aew.a, ate.a);
/*     */           
/* 115 */           if (☃.b() == atf.cn) {
/* 116 */             List<aek> list = auv.a(☃);
/* 117 */             if (list != null) {
/* 118 */               for (aek aek : list) {
/* 119 */                 c(new aek(aek));
/*     */               }
/*     */             }
/*     */           } 
/*     */           
/* 124 */           a(ank.d).c(b);
/*     */         } 
/*     */       } else {
/* 127 */         aut ☃ = null;
/*     */         
/* 129 */         if (this.T.nextFloat() < 0.15F && a(ww.a) && !a(aem.m)) {
/* 130 */           ☃ = auw.x;
/* 131 */         } else if (this.T.nextFloat() < 0.15F && (aV() || (cr() != null && cr().p())) && !a(aem.l)) {
/* 132 */           ☃ = auw.m;
/* 133 */         } else if (this.T.nextFloat() < 0.05F && cq() < cw()) {
/* 134 */           ☃ = auw.z;
/* 135 */         } else if (this.T.nextFloat() < 0.5F && v() != null && !a(aem.a) && v().h(this) > 121.0D) {
/* 136 */           ☃ = auw.o;
/*     */         } 
/*     */         
/* 139 */         if (☃ != null) {
/* 140 */           a(aew.a, auv.a(new ate(atf.cn), ☃));
/* 141 */           this.bC = cB().k();
/* 142 */           a(true);
/* 143 */           this.m.a((aog)null, this.q, this.r, this.s, wj.kG, bV(), 1.0F, 0.8F + this.T.nextFloat() * 0.4F);
/* 144 */           afn afn = a(ank.d);
/* 145 */           afn.c(b);
/* 146 */           afn.b(b);
/*     */         } 
/*     */       } 
/*     */       
/* 150 */       if (this.T.nextFloat() < 7.5E-4F) {
/* 151 */         this.m.a(this, (byte)15);
/*     */       }
/*     */     } 
/*     */     
/* 155 */     super.k();
/*     */   }
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
/*     */   protected float c(aea ☃, float f) {
/* 171 */     f = super.c(☃, f);
/*     */     
/* 173 */     if (☃.k() == this) {
/* 174 */       f = 0.0F;
/*     */     }
/* 176 */     if (☃.t()) {
/* 177 */       f = (float)(f * 0.15D);
/*     */     }
/*     */     
/* 180 */     return f;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   protected pc G() {
/* 186 */     return ccl.v;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(afa ☃, float f) {
/* 191 */     if (l()) {
/*     */       return;
/*     */     }
/*     */     
/* 195 */     double d1 = ☃.r + ☃.bF() - 1.100000023841858D;
/* 196 */     double d2 = ☃.q + ☃.t - this.q;
/* 197 */     double d3 = d1 - this.r;
/* 198 */     double d4 = ☃.s + ☃.v - this.s;
/* 199 */     float f1 = xq.a(d2 * d2 + d4 * d4);
/*     */     
/* 201 */     aut aut = auw.B;
/* 202 */     if (f1 >= 8.0F && !☃.a(aem.b)) {
/* 203 */       aut = auw.r;
/* 204 */     } else if (☃.cq() >= 8.0F && !☃.a(aem.s)) {
/* 205 */       aut = auw.D;
/* 206 */     } else if (f1 <= 3.0F && !☃.a(aem.r) && this.T.nextFloat() < 0.25F) {
/* 207 */       aut = auw.M;
/*     */     } 
/*     */     
/* 210 */     apd apd = new apd(this.m, this, auv.a(new ate(atf.co), aut));
/* 211 */     apd.x -= -20.0F;
/* 212 */     apd.c(d2, d3 + (f1 * 0.2F), d4, 0.75F, 8.0F);
/* 213 */     this.m.a((aog)null, this.q, this.r, this.s, wj.kI, bV(), 1.0F, 0.8F + this.T.nextFloat() * 0.4F);
/*     */     
/* 215 */     this.m.a(apd);
/*     */   }
/*     */ 
/*     */   
/*     */   public float bF() {
/* 220 */     return 1.62F;
/*     */   }
/*     */   
/*     */   public void s(boolean ☃) {}
/*     */ }


/* Location:              F:\dw\server.jar!\anu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */