/*     */ import java.util.List;
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
/*     */ public class bdn
/*     */   extends bea
/*     */   implements ben
/*     */ {
/*  28 */   public static final bmh<bmd> a = bma.aq;
/*     */   
/*     */   public bdn(bcs.c ☃) {
/*  31 */     super(☃);
/*  32 */     v(((blc)this.m.b()).a(D, eq.c).a(c, Boolean.valueOf(false)).a(a, bmd.a));
/*     */   }
/*     */ 
/*     */   
/*     */   protected int k(blc ☃) {
/*  37 */     return 2;
/*     */   }
/*     */ 
/*     */   
/*     */   protected int b(axk ☃, el el1, blc blc1) {
/*  42 */     bji bji = ☃.f(el1);
/*  43 */     if (bji instanceof bjn) {
/*  44 */       return ((bjn)bji).c();
/*     */     }
/*     */     
/*  47 */     return 0;
/*     */   }
/*     */   
/*     */   private int e(axy ☃, el el1, blc blc1) {
/*  51 */     if (blc1.c(a) == bmd.b) {
/*  52 */       return Math.max(b(☃, el1, blc1) - b(☃, el1, blc1), 0);
/*     */     }
/*     */     
/*  55 */     return b(☃, el1, blc1);
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean a(axy ☃, el el1, blc blc1) {
/*  60 */     int i = b(☃, el1, blc1);
/*  61 */     if (i >= 15) {
/*  62 */       return true;
/*     */     }
/*  64 */     if (i == 0) {
/*  65 */       return false;
/*     */     }
/*     */     
/*  68 */     return (i >= b(☃, el1, blc1));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(axy ☃, el el1) {
/*  73 */     ☃.n(el1);
/*     */   }
/*     */ 
/*     */   
/*     */   protected int b(axy ☃, el el1, blc blc1) {
/*  78 */     int i = super.b(☃, el1, blc1);
/*     */     
/*  80 */     eq eq = (eq)blc1.c(D);
/*  81 */     el el2 = el1.a(eq);
/*  82 */     blc blc2 = ☃.a_(el2);
/*     */     
/*  84 */     if (blc2.n()) {
/*  85 */       i = blc2.a(☃, el2);
/*  86 */     } else if (i < 15 && blc2.l()) {
/*  87 */       el2 = el2.a(eq);
/*  88 */       blc2 = ☃.a_(el2);
/*     */       
/*  90 */       if (blc2.n()) {
/*  91 */         i = blc2.a(☃, el2);
/*  92 */       } else if (blc2.f()) {
/*  93 */         amb amb = a(☃, eq, el2);
/*  94 */         if (amb != null) {
/*  95 */           i = amb.q();
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 100 */     return i;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private amb a(axy ☃, eq eq1, el el1) {
/* 105 */     List<amb> list = ☃.a(amb.class, new cea(el1.o(), el1.p(), el1.q(), (el1.o() + 1), (el1.p() + 1), (el1.q() + 1)), amb1 -> (amb1 != null && amb1.bA() == ☃));
/*     */     
/* 107 */     if (list.size() == 1) {
/* 108 */       return list.get(0);
/*     */     }
/*     */     
/* 111 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃, axy axy1, el el1, aog aog1, adk adk1, eq eq1, float f1, float f2, float f3) {
/* 116 */     if (!aog1.bV.e) {
/* 117 */       return false;
/*     */     }
/*     */     
/* 120 */     ☃ = ☃.a(a);
/* 121 */     float f = (☃.c(a) == bmd.b) ? 0.55F : 0.5F;
/* 122 */     axy1.a(aog1, el1, wj.aN, wk.e, 0.3F, f);
/*     */     
/* 124 */     axy1.a(el1, ☃, 2);
/* 125 */     f(axy1, el1, ☃);
/* 126 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void c(axy ☃, el el1, blc blc1) {
/* 131 */     if (☃.J().b(el1, this)) {
/*     */       return;
/*     */     }
/*     */     
/* 135 */     int i = e(☃, el1, blc1);
/* 136 */     bji bji = ☃.f(el1);
/* 137 */     int j = (bji instanceof bjn) ? ((bjn)bji).c() : 0;
/*     */     
/* 139 */     if (i != j || ((Boolean)blc1.c(c)).booleanValue() != a(☃, el1, blc1)) {
/*     */       
/* 141 */       ayq ayq = c(☃, el1, blc1) ? ayq.c : ayq.d;
/* 142 */       ☃.J().a(el1, this, 2, ayq);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void f(axy ☃, el el1, blc blc1) {
/* 147 */     int i = e(☃, el1, blc1);
/*     */     
/* 149 */     bji bji = ☃.f(el1);
/* 150 */     int j = 0;
/* 151 */     if (bji instanceof bjn) {
/* 152 */       bjn bjn = (bjn)bji;
/*     */       
/* 154 */       j = bjn.c();
/* 155 */       bjn.a(i);
/*     */     } 
/*     */     
/* 158 */     if (j != i || blc1.c(a) == bmd.a) {
/* 159 */       boolean bool1 = a(☃, el1, blc1);
/* 160 */       boolean bool2 = ((Boolean)blc1.c(c)).booleanValue();
/*     */       
/* 162 */       if (bool2 && !bool1) {
/* 163 */         ☃.a(el1, blc1.a(c, Boolean.valueOf(false)), 2);
/* 164 */       } else if (!bool2 && bool1) {
/* 165 */         ☃.a(el1, blc1.a(c, Boolean.valueOf(true)), 2);
/*     */       } 
/*     */       
/* 168 */       d(☃, el1, blc1);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(blc ☃, axy axy1, el el1, Random random) {
/* 174 */     f(axy1, el1, ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃, axy axy1, el el1, int i, int j) {
/* 179 */     super.a(☃, axy1, el1, i, j);
/*     */     
/* 181 */     bji bji = axy1.f(el1);
/* 182 */     return (bji != null && bji.c(i, j));
/*     */   }
/*     */ 
/*     */   
/*     */   public bji a(axk ☃) {
/* 187 */     return new bjn();
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(ble.a<bcs, blc> ☃) {
/* 192 */     ☃.a((bmm<?>[])new bmm[] { D, a, c });
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bdn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */