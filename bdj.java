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
/*     */ public class bdj
/*     */   extends bgj
/*     */ {
/*     */   protected bdj(bcs.c ☃) {
/*  22 */     super(0.3125F, ☃);
/*     */     
/*  24 */     v(((blc)this.m.b()).a(a, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)).a(o, Boolean.valueOf(false)).a(p, Boolean.valueOf(false)).a(q, Boolean.valueOf(false)));
/*     */   }
/*     */ 
/*     */   
/*     */   public blc a(ark ☃) {
/*  29 */     return a(☃.k(), ☃.a());
/*     */   }
/*     */   
/*     */   public blc a(axk ☃, el el1) {
/*  33 */     bcs bcs1 = ☃.a_(el1.b()).c();
/*  34 */     bcs bcs2 = ☃.a_(el1.a()).c();
/*  35 */     bcs bcs3 = ☃.a_(el1.c()).c();
/*  36 */     bcs bcs4 = ☃.a_(el1.f()).c();
/*  37 */     bcs bcs5 = ☃.a_(el1.d()).c();
/*  38 */     bcs bcs6 = ☃.a_(el1.e()).c();
/*     */     
/*  40 */     return p()
/*  41 */       .a(q, Boolean.valueOf((bcs1 == this || bcs1 == bct.hZ || bcs1 == bct.eg)))
/*  42 */       .a(p, Boolean.valueOf((bcs2 == this || bcs2 == bct.hZ)))
/*  43 */       .a(a, Boolean.valueOf((bcs3 == this || bcs3 == bct.hZ)))
/*  44 */       .a(b, Boolean.valueOf((bcs4 == this || bcs4 == bct.hZ)))
/*  45 */       .a(c, Boolean.valueOf((bcs5 == this || bcs5 == bct.hZ)))
/*  46 */       .a(o, Boolean.valueOf((bcs6 == this || bcs6 == bct.hZ)));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public blc a(blc ☃, eq eq1, blc blc1, axz axz1, el el1, el el2) {
/*  52 */     if (!☃.a(axz1, el1)) {
/*  53 */       axz1.J().a(el1, this, 1);
/*  54 */       return super.a(☃, eq1, blc1, axz1, el1, el2);
/*     */     } 
/*     */     
/*  57 */     bcs bcs = blc1.c();
/*  58 */     boolean bool = (bcs == this || bcs == bct.hZ || (eq1 == eq.a && bcs == bct.eg));
/*     */     
/*  60 */     return ☃.a(r.get(eq1), Boolean.valueOf(bool));
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(blc ☃, axy axy1, el el1, Random random) {
/*  65 */     if (!☃.a(axy1, el1)) {
/*  66 */       axy1.a(el1, true);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public axx a(blc ☃, axy axy1, el el1, int i) {
/*  72 */     return atf.eM;
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(blc ☃, Random random) {
/*  77 */     return random.nextInt(2);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃) {
/*  82 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃, ayc ayc1, el el1) {
/*  90 */     blc blc1 = ayc1.a_(el1.b());
/*  91 */     boolean bool = (!ayc1.a_(el1.a()).f() && !blc1.f());
/*     */     
/*  93 */     for (eq eq : eq.c.a) {
/*  94 */       el el2 = el1.a(eq);
/*  95 */       bcs bcs1 = ayc1.a_(el2).c();
/*  96 */       if (bcs1 == this) {
/*  97 */         if (bool) {
/*  98 */           return false;
/*     */         }
/* 100 */         bcs bcs2 = ayc1.a_(el2.b()).c();
/* 101 */         if (bcs2 == this || bcs2 == bct.eg) {
/* 102 */           return true;
/*     */         }
/*     */       } 
/*     */     } 
/* 106 */     bcs bcs = blc1.c();
/* 107 */     return (bcs == this || bcs == bct.eg);
/*     */   }
/*     */ 
/*     */   
/*     */   public axl c() {
/* 112 */     return axl.c;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(ble.a<bcs, blc> ☃) {
/* 117 */     ☃.a((bmm<?>[])new bmm[] { a, b, c, o, p, q });
/*     */   }
/*     */ 
/*     */   
/*     */   public blb a(axk ☃, blc blc1, el el1, eq eq1) {
/* 122 */     return blb.i;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃, axk axk1, el el1, cbf cbf1) {
/* 127 */     return false;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bdj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */