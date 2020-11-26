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
/*     */ public class aku
/*     */   extends ako
/*     */ {
/*  25 */   private final akv bM = new akv(this);
/*     */   
/*     */   private boolean bN;
/*     */   
/*     */   private int bO;
/*     */   
/*     */   public aku(axy ☃) {
/*  32 */     super(aev.al, ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void bZ() {
/*  37 */     super.bZ();
/*     */     
/*  39 */     a(ank.a).a(15.0D);
/*  40 */     a(ank.d).a(0.20000000298023224D);
/*  41 */     a(bC).a(ed());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void dI() {}
/*     */ 
/*     */ 
/*     */   
/*     */   protected wi D() {
/*  51 */     super.D();
/*  52 */     if (a(ww.a)) {
/*  53 */       return wj.iz;
/*     */     }
/*  55 */     return wj.iv;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected wi cs() {
/*  61 */     super.cs();
/*  62 */     return wj.iw;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi d(aea ☃) {
/*  67 */     super.d(☃);
/*  68 */     return wj.ix;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi ad() {
/*  73 */     if (this.A) {
/*  74 */       if (aX()) {
/*  75 */         this.bL++;
/*  76 */         if (this.bL > 5 && this.bL % 3 == 0)
/*  77 */           return wj.iA; 
/*  78 */         if (this.bL <= 5) {
/*  79 */           return wj.iC;
/*     */         }
/*     */       } else {
/*  82 */         return wj.iC;
/*     */       } 
/*     */     }
/*  85 */     return wj.iy;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void d(float ☃) {
/*  90 */     if (this.A) {
/*  91 */       super.d(0.3F);
/*     */     } else {
/*  93 */       super.d(Math.min(0.1F, ☃ * 25.0F));
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void ea() {
/*  99 */     if (an()) {
/* 100 */       a(wj.iB, 0.4F, 1.0F);
/*     */     } else {
/* 102 */       super.ea();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public afd cA() {
/* 108 */     return afd.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public double aJ() {
/* 113 */     return super.aJ() - 0.1875D;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   protected pc G() {
/* 119 */     return ccl.R;
/*     */   }
/*     */ 
/*     */   
/*     */   public void k() {
/* 124 */     super.k();
/*     */     
/* 126 */     if (dy() && this.bO++ >= 18000) {
/* 127 */       V();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(gy ☃) {
/* 133 */     super.b(☃);
/*     */     
/* 135 */     ☃.a("SkeletonTrap", dy());
/* 136 */     ☃.b("SkeletonTrapTime", this.bO);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(gy ☃) {
/* 141 */     super.a(☃);
/*     */     
/* 143 */     s(☃.q("SkeletonTrap"));
/* 144 */     this.bO = ☃.h("SkeletonTrapTime");
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean aY() {
/* 149 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   protected float cJ() {
/* 154 */     return 0.96F;
/*     */   }
/*     */   
/*     */   public boolean dy() {
/* 158 */     return this.bN;
/*     */   }
/*     */   
/*     */   public void s(boolean ☃) {
/* 162 */     if (☃ == this.bN) {
/*     */       return;
/*     */     }
/*     */     
/* 166 */     this.bN = ☃;
/* 167 */     if (☃) {
/* 168 */       this.by.a(1, this.bM);
/*     */     } else {
/* 170 */       this.by.a(this.bM);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public aeo a(aeo ☃) {
/* 177 */     return new aku(this.m);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(aog ☃, adk adk1) {
/* 182 */     ate ate = ☃.b(adk1);
/* 183 */     if (ate.b() instanceof auc) {
/* 184 */       return super.a(☃, adk1);
/*     */     }
/*     */     
/* 187 */     if (!dJ()) {
/* 188 */       return false;
/*     */     }
/*     */     
/* 191 */     if (y_()) {
/* 192 */       return super.a(☃, adk1);
/*     */     }
/*     */     
/* 195 */     if (☃.aZ()) {
/* 196 */       c(☃);
/* 197 */       return true;
/*     */     } 
/*     */     
/* 200 */     if (aX()) {
/* 201 */       return super.a(☃, adk1);
/*     */     }
/*     */     
/* 204 */     if (!ate.a()) {
/* 205 */       if (ate.b() == atf.aA && !dV()) {
/* 206 */         c(☃);
/* 207 */         return true;
/*     */       } 
/*     */       
/* 210 */       if (ate.a(☃, this, adk1)) {
/* 211 */         return true;
/*     */       }
/*     */     } 
/*     */     
/* 215 */     g(☃);
/* 216 */     return true;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\aku.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */