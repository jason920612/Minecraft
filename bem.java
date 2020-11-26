/*     */ import java.util.Random;
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
/*     */ public class bem
/*     */   extends bcm
/*     */   implements bcz, bfv
/*     */ {
/*  37 */   public static final bme a = bfi.D;
/*  38 */   public static final bmb b = bma.y;
/*  39 */   protected static final cew c = bcs.a(1.0D, 0.0D, 1.0D, 15.0D, 14.0D, 15.0D);
/*     */   
/*     */   protected bem(bcs.c ☃) {
/*  42 */     super(☃);
/*  43 */     v(((blc)this.m.b()).a(a, eq.c).a(b, Boolean.valueOf(false)));
/*     */   }
/*     */ 
/*     */   
/*     */   public cew a(blc ☃, axk axk1, el el1) {
/*  48 */     return c;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃) {
/*  53 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public bgy c(blc ☃) {
/*  63 */     return bgy.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public axx a(blc ☃, axy axy1, el el1, int i) {
/*  68 */     return bct.ce;
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(blc ☃, Random random) {
/*  73 */     return 8;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean X_() {
/*  78 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public blc a(ark ☃) {
/*  83 */     byw byw = ☃.k().b(☃.a());
/*  84 */     return p().a(a, ☃.f().d()).a(b, Boolean.valueOf((byw.c() == byy.c)));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃, axy axy1, el el1, aog aog1, adk adk1, eq eq1, float f1, float f2, float f3) {
/*  89 */     aqq aqq = aog1.dz();
/*  90 */     bji bji = axy1.f(el1);
/*  91 */     if (aqq == null || !(bji instanceof bjt)) {
/*  92 */       return true;
/*     */     }
/*     */     
/*  95 */     if (axy1.a_(el1.a()).l()) {
/*  96 */       return true;
/*     */     }
/*     */     
/*  99 */     if (axy1.B) {
/* 100 */       return true;
/*     */     }
/*     */     
/* 103 */     aqq.a((bjt)bji);
/* 104 */     aog1.a(aqq);
/* 105 */     aog1.a(ws.ah);
/*     */     
/* 107 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public bji a(axk ☃) {
/* 112 */     return new bjt();
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public blc a(blc ☃, bhb bhb1) {
/* 134 */     return ☃.a(a, bhb1.a((eq)☃.c(a)));
/*     */   }
/*     */ 
/*     */   
/*     */   public blc a(blc ☃, bfz bfz1) {
/* 139 */     return ☃.a(bfz1.a((eq)☃.c(a)));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(ble.a<bcs, blc> ☃) {
/* 144 */     ☃.a((bmm<?>[])new bmm[] { a, b });
/*     */   }
/*     */ 
/*     */   
/*     */   public blb a(axk ☃, blc blc1, el el1, eq eq1) {
/* 149 */     return blb.i;
/*     */   }
/*     */ 
/*     */   
/*     */   public byv a(axz ☃, el el1, blc blc1) {
/* 154 */     if (((Boolean)blc1.c(b)).booleanValue()) {
/* 155 */       ☃.a(el1, blc1.a(b, Boolean.valueOf(false)), 3);
/* 156 */       return byy.c;
/*     */     } 
/* 158 */     return byy.a;
/*     */   }
/*     */ 
/*     */   
/*     */   public byw h(blc ☃) {
/* 163 */     if (((Boolean)☃.c(b)).booleanValue()) {
/* 164 */       return byy.c.a(false);
/*     */     }
/* 166 */     return super.h(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(axk ☃, el el1, blc blc1, byv byv1) {
/* 171 */     return (!((Boolean)blc1.c(b)).booleanValue() && byv1 == byy.c);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(axz ☃, el el1, blc blc1, byw byw1) {
/* 176 */     if (!((Boolean)blc1.c(b)).booleanValue() && byw1.c() == byy.c) {
/* 177 */       if (!☃.e()) {
/* 178 */         ☃.a(el1, blc1.a(b, Boolean.valueOf(true)), 3);
/* 179 */         ☃.I().a(el1, byy.c, byy.c.a(☃));
/*     */       } 
/* 181 */       return true;
/*     */     } 
/* 183 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public blc a(blc ☃, eq eq1, blc blc1, axz axz1, el el1, el el2) {
/* 188 */     if (((Boolean)☃.c(b)).booleanValue()) {
/* 189 */       axz1.I().a(el1, byy.c, byy.c.a(axz1));
/*     */     }
/* 191 */     return super.a(☃, eq1, blc1, axz1, el1, el2);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃, axk axk1, el el1, cbf cbf1) {
/* 196 */     return false;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bem.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */