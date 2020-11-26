/*     */ import java.util.List;
/*     */ import java.util.function.Predicate;
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
/*     */ public class akc
/*     */   extends ajn
/*     */ {
/*  32 */   private static final or<Integer> a = ou.a((Class)akc.class, ot.b); private int b; private int c; private static final Predicate<afa> bC; private float bD;
/*     */   private float bE;
/*     */   
/*     */   static {
/*  36 */     bC = (☃ -> (☃ == null) ? false : (
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  41 */       (☃ instanceof aog && (((aog)☃).t() || ((aog)☃).u())) ? false : ((☃.cA() != afd.e))));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void x_() {
/*     */     super.x_();
/*     */     this.ab.a(a, Integer.valueOf(0));
/*     */   }
/*     */ 
/*     */   
/*     */   public akc(axy ☃) {
/*  53 */     super(aev.aa, ☃);
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
/*  85 */     this.bD = -1.0F;
/*     */     a(0.7F, 0.7F);
/*     */   } public int dA() {
/*     */     return ((Integer)this.ab.<Integer>a(a)).intValue();
/*     */   } protected final void a(float ☃, float f1) {
/*  90 */     boolean bool = (this.bD > 0.0F);
/*     */     
/*  92 */     this.bD = ☃;
/*  93 */     this.bE = f1;
/*     */     
/*  95 */     if (!bool)
/*  96 */       a(1.0F); 
/*     */   } public void b(int ☃) {
/*     */     this.ab.b(a, Integer.valueOf(☃));
/*     */     d(☃);
/*     */   }
/* 101 */   private void a(float ☃) { super.a(this.bD * ☃, this.bE * ☃); }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(or<?> ☃) {
/* 106 */     d(dA());
/*     */     
/* 108 */     super.a(☃); }
/*     */   private void d(int ☃) { float f = 1.0F; if (☃ == 1) {
/*     */       f = 0.7F;
/*     */     } else if (☃ == 0) {
/*     */       f = 0.5F;
/* 113 */     }  a(f); } public void b(gy ☃) { super.b(☃);
/*     */     
/* 115 */     ☃.b("PuffState", dA()); }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(gy ☃) {
/* 120 */     super.a(☃);
/*     */     
/* 122 */     b(☃.h("PuffState"));
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   protected pc G() {
/* 128 */     return ccl.aF;
/*     */   }
/*     */ 
/*     */   
/*     */   protected ate l() {
/* 133 */     return new ate(atf.aL);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void n() {
/* 138 */     super.n();
/*     */     
/* 140 */     this.by.a(1, new a(this));
/*     */   }
/*     */ 
/*     */   
/*     */   public void R_() {
/* 145 */     if (aF() && !this.m.B) {
/* 146 */       if (this.b > 0) {
/*     */         
/* 148 */         if (dA() == 0) {
/* 149 */           a(wj.ho, cD(), cE());
/* 150 */           b(1);
/*     */         }
/* 152 */         else if (this.b > 40 && dA() == 1) {
/* 153 */           a(wj.ho, cD(), cE());
/* 154 */           b(2);
/*     */         } 
/*     */ 
/*     */         
/* 158 */         this.b++;
/* 159 */       } else if (dA() != 0) {
/*     */         
/* 161 */         if (this.c > 60 && dA() == 2) {
/* 162 */           a(wj.hn, cD(), cE());
/* 163 */           b(1);
/* 164 */         } else if (this.c > 100 && dA() == 1) {
/* 165 */           a(wj.hn, cD(), cE());
/* 166 */           b(0);
/*     */         } 
/*     */         
/* 169 */         this.c++;
/*     */       } 
/*     */     }
/* 172 */     super.R_();
/*     */   }
/*     */ 
/*     */   
/*     */   public void k() {
/* 177 */     super.k();
/*     */     
/* 179 */     if (dA() > 0) {
/* 180 */       List<afb> ☃ = (List)this.m.a((Class)afb.class, bD().g(0.3D), bC);
/* 181 */       for (afb afb : ☃) {
/* 182 */         if (afb.aF()) {
/* 183 */           a(afb);
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(afb ☃) {
/* 190 */     int i = dA();
/* 191 */     if (☃.a(aea.a(this), (1 + i))) {
/* 192 */       ☃.c(new aek(aem.s, 60 * i, 0));
/* 193 */       a(wj.hs, 1.0F, 1.0F);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void d(aog ☃) {
/* 199 */     int i = dA();
/* 200 */     if (☃ instanceof tf && i > 0 && 
/* 201 */       ☃.a(aea.a(this), (1 + i))) {
/* 202 */       ((tf)☃).a.a(new ke(9, 0.0F));
/* 203 */       ☃.c(new aek(aem.s, 60 * i, 0));
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected wi D() {
/* 210 */     return wj.hm;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi cs() {
/* 215 */     return wj.hp;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi d(aea ☃) {
/* 220 */     return wj.hr;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi dz() {
/* 225 */     return wj.hq;
/*     */   }
/*     */   
/*     */   static class a extends agt {
/*     */     private final akc a;
/*     */     
/*     */     public a(akc ☃) {
/* 232 */       this.a = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 237 */       List<afa> ☃ = this.a.m.a(afa.class, this.a.bD().g(2.0D), akc.dB());
/*     */       
/* 239 */       return !☃.isEmpty();
/*     */     }
/*     */ 
/*     */     
/*     */     public void c() {
/* 244 */       akc.a(this.a, 1);
/* 245 */       akc.b(this.a, 0);
/*     */     }
/*     */ 
/*     */     
/*     */     public void d() {
/* 250 */       akc.a(this.a, 0);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean b() {
/* 255 */       List<afa> ☃ = this.a.m.a(afa.class, this.a.bD().g(2.0D), akc.dB());
/*     */       
/* 257 */       return !☃.isEmpty();
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\akc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */