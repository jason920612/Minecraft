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
/*     */ public abstract class akn
/*     */   extends ako
/*     */ {
/*  23 */   private static final or<Boolean> bM = ou.a((Class)akn.class, ot.i);
/*     */ 
/*     */   
/*     */   protected akn(aev<?> ☃, axy axy1) {
/*  27 */     super(☃, axy1);
/*     */     
/*  29 */     this.bK = false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void x_() {
/*  34 */     super.x_();
/*     */     
/*  36 */     this.ab.a(bM, Boolean.valueOf(false));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void bZ() {
/*  41 */     super.bZ();
/*     */     
/*  43 */     a(ank.a).a(ec());
/*  44 */     a(ank.d).a(0.17499999701976776D);
/*  45 */     a(bC).a(0.5D);
/*     */   }
/*     */   
/*     */   public boolean dz() {
/*  49 */     return ((Boolean)this.ab.<Boolean>a(bM)).booleanValue();
/*     */   }
/*     */   
/*     */   public void t(boolean ☃) {
/*  53 */     this.ab.b(bM, Boolean.valueOf(☃));
/*     */   }
/*     */ 
/*     */   
/*     */   protected int dA() {
/*  58 */     if (dz()) {
/*  59 */       return 17;
/*     */     }
/*  61 */     return super.dA();
/*     */   }
/*     */ 
/*     */   
/*     */   public double aJ() {
/*  66 */     return super.aJ() - 0.25D;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi dB() {
/*  71 */     super.dB();
/*     */     
/*  73 */     return wj.bp;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(aea ☃) {
/*  78 */     super.a(☃);
/*     */     
/*  80 */     if (dz()) {
/*  81 */       if (!this.m.B) {
/*  82 */         a(bct.ck);
/*     */       }
/*  84 */       t(false);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(gy ☃) {
/*  90 */     super.b(☃);
/*     */     
/*  92 */     ☃.a("ChestedHorse", dz());
/*  93 */     if (dz()) {
/*  94 */       he he = new he();
/*     */       
/*  96 */       for (int i = 2; i < this.bH.T_(); i++) {
/*  97 */         ate ate = this.bH.a(i);
/*     */         
/*  99 */         if (!ate.a()) {
/* 100 */           gy gy1 = new gy();
/*     */           
/* 102 */           gy1.a("Slot", (byte)i);
/*     */           
/* 104 */           ate.b(gy1);
/* 105 */           he.a(gy1);
/*     */         } 
/*     */       } 
/* 108 */       ☃.a("Items", he);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(gy ☃) {
/* 114 */     super.a(☃);
/*     */     
/* 116 */     t(☃.q("ChestedHorse"));
/*     */     
/* 118 */     if (dz()) {
/* 119 */       he he = ☃.d("Items", 10);
/* 120 */       dR();
/*     */       
/* 122 */       for (int i = 0; i < he.size(); i++) {
/* 123 */         gy gy1 = he.e(i);
/* 124 */         int j = gy1.f("Slot") & 0xFF;
/*     */         
/* 126 */         if (j >= 2 && j < this.bH.T_()) {
/* 127 */           this.bH.a(j, ate.a(gy1));
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 132 */     dS();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c(int ☃, ate ate1) {
/* 137 */     if (☃ == 499) {
/* 138 */       if (dz() && ate1.a()) {
/* 139 */         t(false);
/* 140 */         dR();
/* 141 */         return true;
/*     */       } 
/* 143 */       if (!dz() && ate1.b() == bct.ck.h()) {
/* 144 */         t(true);
/* 145 */         dR();
/* 146 */         return true;
/*     */       } 
/*     */     } 
/* 149 */     return super.c(☃, ate1);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(aog ☃, adk adk1) {
/* 154 */     ate ate = ☃.b(adk1);
/* 155 */     if (ate.b() instanceof auc) {
/* 156 */       return super.a(☃, adk1);
/*     */     }
/*     */     
/* 159 */     if (!y_()) {
/* 160 */       if (dJ() && ☃.aZ()) {
/* 161 */         c(☃);
/* 162 */         return true;
/*     */       } 
/*     */       
/* 165 */       if (aX()) {
/* 166 */         return super.a(☃, adk1);
/*     */       }
/*     */     } 
/*     */     
/* 170 */     if (!ate.a()) {
/* 171 */       boolean bool = b(☃, ate);
/*     */       
/* 173 */       if (!bool) {
/* 174 */         if (!dJ() || ate.b() == atf.ed) {
/* 175 */           if (ate.a(☃, this, adk1)) {
/* 176 */             return true;
/*     */           }
/* 178 */           dZ();
/* 179 */           return true;
/*     */         } 
/*     */         
/* 182 */         if (!dz() && ate.b() == bct.ck.h()) {
/* 183 */           t(true);
/* 184 */           dC();
/* 185 */           bool = true;
/* 186 */           dR();
/*     */         } 
/*     */         
/* 189 */         if (!y_() && !dV() && ate.b() == atf.aA) {
/* 190 */           c(☃);
/* 191 */           return true;
/*     */         } 
/*     */       } 
/*     */       
/* 195 */       if (bool) {
/* 196 */         if (!☃.bV.d) {
/* 197 */           ate.g(1);
/*     */         }
/* 199 */         return true;
/*     */       } 
/*     */     } 
/* 202 */     if (y_()) {
/* 203 */       return super.a(☃, adk1);
/*     */     }
/*     */     
/* 206 */     g(☃);
/*     */     
/* 208 */     return true;
/*     */   }
/*     */   
/*     */   protected void dC() {
/* 212 */     a(wj.bq, 1.0F, (this.T.nextFloat() - this.T.nextFloat()) * 0.2F + 1.0F);
/*     */   }
/*     */   
/*     */   public int dH() {
/* 216 */     return 5;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\akn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */