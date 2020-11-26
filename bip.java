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
/*     */ 
/*     */ 
/*     */ public class bip
/*     */   extends bcs
/*     */ {
/*  36 */   private static final cew c = bcs.a(3.0D, 0.0D, 3.0D, 12.0D, 7.0D, 12.0D);
/*  37 */   private static final cew o = bcs.a(1.0D, 0.0D, 1.0D, 15.0D, 7.0D, 15.0D);
/*     */   
/*  39 */   public static final bmj a = bma.ad;
/*  40 */   public static final bmj b = bma.ac;
/*     */   
/*     */   public bip(bcs.c ☃) {
/*  43 */     super(☃);
/*  44 */     v(((blc)this.m.b()).a(a, Integer.valueOf(0)).a(b, Integer.valueOf(1)));
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(axy ☃, el el1, aer aer1) {
/*  49 */     a(☃, el1, aer1, 100);
/*  50 */     super.a(☃, el1, aer1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(axy ☃, el el1, aer aer1, float f) {
/*  55 */     if (!(aer1 instanceof anw)) {
/*  56 */       a(☃, el1, aer1, 3);
/*     */     }
/*     */     
/*  59 */     super.a(☃, el1, aer1, f);
/*     */   }
/*     */   
/*     */   private void a(axy ☃, el el1, aer aer1, int i) {
/*  63 */     if (!a(☃, aer1)) {
/*  64 */       super.a(☃, el1, aer1);
/*     */       
/*     */       return;
/*     */     } 
/*  68 */     if (!☃.B && ☃.s.nextInt(i) == 0) {
/*  69 */       a(☃, el1, ☃.a_(el1));
/*     */     }
/*     */   }
/*     */   
/*     */   private void a(axy ☃, el el1, blc blc1) {
/*  74 */     ☃.a((aog)null, el1, wj.ka, wk.e, 0.7F, 0.9F + ☃.s.nextFloat() * 0.2F);
/*  75 */     int i = ((Integer)blc1.c(b)).intValue();
/*  76 */     if (i <= 1) {
/*     */       
/*  78 */       ☃.a(el1, false);
/*     */     } else {
/*     */       
/*  81 */       ☃.a(el1, blc1.a(b, Integer.valueOf(i - 1)), 2);
/*  82 */       ☃.b(2001, el1, bcs.l(blc1));
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(blc ☃, axy axy1, el el1, Random random) {
/*  88 */     if (a(axy1) && 
/*  89 */       a(axy1, el1)) {
/*  90 */       int i = ((Integer)☃.c(a)).intValue();
/*  91 */       if (i < 2) {
/*  92 */         axy1.a((aog)null, el1, wj.kb, wk.e, 0.7F, 0.9F + random.nextFloat() * 0.2F);
/*  93 */         axy1.a(el1, ☃.a(a, Integer.valueOf(i + 1)), 2);
/*     */       } else {
/*     */         
/*  96 */         axy1.a((aog)null, el1, wj.kc, wk.e, 0.7F, 0.9F + random.nextFloat() * 0.2F);
/*  97 */         axy1.g(el1);
/*     */         
/*  99 */         if (!axy1.B) {
/* 100 */           for (int j = 0; j < ((Integer)☃.c(b)).intValue(); j++) {
/* 101 */             axy1.b(2001, el1, bcs.l(☃));
/* 102 */             akk akk = new akk(axy1);
/* 103 */             akk.b_(-24000);
/* 104 */             akk.g(el1);
/* 105 */             akk.b(el1.o() + 0.3D + j * 0.2D, el1.p(), el1.q() + 0.3D, 0.0F, 0.0F);
/* 106 */             axy1.a(akk);
/*     */           } 
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private boolean a(axk ☃, el el1) {
/* 115 */     return (☃.a_(el1.b()).c() == bct.D);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(blc ☃, axy axy1, el el1, blc blc1) {
/* 120 */     if (a(axy1, el1) && !axy1.B) {
/* 121 */       axy1.b(2005, el1, 0);
/*     */     }
/*     */   }
/*     */   
/*     */   private boolean a(axy ☃) {
/* 126 */     float f = ☃.k(1.0F);
/*     */     
/* 128 */     if (f < 0.69D && f > 0.65D) {
/* 129 */       return true;
/*     */     }
/* 131 */     return (☃.s.nextInt(500) == 0);
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean X_() {
/* 136 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(axy ☃, aog aog1, el el1, blc blc1, @Nullable bji bji1, ate ate1) {
/* 141 */     super.a(☃, aog1, el1, blc1, bji1, ate1);
/*     */     
/* 143 */     a(☃, el1, blc1);
/*     */   }
/*     */ 
/*     */   
/*     */   public axx a(blc ☃, axy axy1, el el1, int i) {
/* 148 */     return atf.a;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃, ark ark1) {
/* 153 */     if (ark1.i().b() == h() && ((Integer)☃.c(b)).intValue() < 4) {
/* 154 */       return true;
/*     */     }
/* 156 */     return super.a(☃, ark1);
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public blc a(ark ☃) {
/* 162 */     blc blc = ☃.k().a_(☃.a());
/* 163 */     if (blc.c() == this) {
/* 164 */       return blc.a(b, Integer.valueOf(Math.min(4, ((Integer)blc.c(b)).intValue() + 1)));
/*     */     }
/*     */     
/* 167 */     return super.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public axl c() {
/* 172 */     return axl.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃) {
/* 177 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public cew a(blc ☃, axk axk1, el el1) {
/* 182 */     if (((Integer)☃.c(b)).intValue() > 1) {
/* 183 */       return o;
/*     */     }
/*     */     
/* 186 */     return c;
/*     */   }
/*     */ 
/*     */   
/*     */   public blb a(axk ☃, blc blc1, el el1, eq eq1) {
/* 191 */     return blb.i;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(ble.a<bcs, blc> ☃) {
/* 196 */     ☃.a((bmm<?>[])new bmm[] { a, b });
/*     */   }
/*     */   
/*     */   private boolean a(axy ☃, aer aer1) {
/* 200 */     if (aer1 instanceof akk) {
/* 201 */       return false;
/*     */     }
/*     */     
/* 204 */     if (aer1 instanceof afa && !(aer1 instanceof aog)) {
/* 205 */       return ☃.X().b("mobGriefing");
/*     */     }
/*     */     
/* 208 */     return true;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bip.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */