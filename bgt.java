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
/*     */ public class bgt
/*     */   extends bcs
/*     */ {
/*  19 */   public static final bmb a = bgw.a;
/*     */   
/*     */   public bgt(bcs.c ☃) {
/*  22 */     super(☃);
/*  23 */     v(p().a(a, Boolean.valueOf(false)));
/*     */   }
/*     */ 
/*     */   
/*     */   public int m(blc ☃) {
/*  28 */     return ((Boolean)☃.c(a)).booleanValue() ? super.m(☃) : 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(blc ☃, axy axy1, el el1, aog aog1) {
/*  33 */     b(☃, axy1, el1);
/*  34 */     super.a(☃, axy1, el1, aog1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(axy ☃, el el1, aer aer1) {
/*  39 */     b(☃.a_(el1), ☃, el1);
/*  40 */     super.a(☃, el1, aer1);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃, axy axy1, el el1, aog aog1, adk adk1, eq eq1, float f1, float f2, float f3) {
/*  45 */     b(☃, axy1, el1);
/*  46 */     return super.a(☃, axy1, el1, aog1, adk1, eq1, f1, f2, f3);
/*     */   }
/*     */   
/*     */   private static void b(blc ☃, axy axy1, el el1) {
/*  50 */     a(axy1, el1);
/*  51 */     if (!((Boolean)☃.c(a)).booleanValue()) {
/*  52 */       axy1.a(el1, ☃.a(a, Boolean.valueOf(true)), 3);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(blc ☃, axy axy1, el el1, Random random) {
/*  58 */     if (((Boolean)☃.c(a)).booleanValue()) {
/*  59 */       axy1.a(el1, ☃.a(a, Boolean.valueOf(false)), 3);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public axx a(blc ☃, axy axy1, el el1, int i) {
/*  65 */     return atf.aB;
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(blc ☃, int i, axy axy1, el el1, Random random) {
/*  70 */     return a(☃, random) + random.nextInt(i + 1);
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(blc ☃, Random random) {
/*  75 */     return 4 + random.nextInt(2);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(blc ☃, axy axy1, el el1, float f, int i) {
/*  80 */     super.a(☃, axy1, el1, f, i);
/*     */ 
/*     */     
/*  83 */     if (a(☃, axy1, el1, i) != this) {
/*  84 */       int j = 1 + axy1.s.nextInt(5);
/*  85 */       a(axy1, el1, j);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static void a(axy ☃, el el1) {
/*  97 */     double d = 0.5625D;
/*  98 */     Random random = ☃.s;
/*  99 */     for (eq eq : eq.values()) {
/* 100 */       el el2 = el1.a(eq);
/* 101 */       if (!☃.a_(el2).f(☃, el2)) {
/*     */ 
/*     */ 
/*     */         
/* 105 */         eq.a a = eq.k();
/* 106 */         double d1 = (a == eq.a.a) ? (0.5D + 0.5625D * eq.g()) : random.nextFloat();
/* 107 */         double d2 = (a == eq.a.b) ? (0.5D + 0.5625D * eq.h()) : random.nextFloat();
/* 108 */         double d3 = (a == eq.a.c) ? (0.5D + 0.5625D * eq.i()) : random.nextFloat();
/*     */         
/* 110 */         ☃.a(fi.a, el1.o() + d1, el1.p() + d2, el1.q() + d3, 0.0D, 0.0D, 0.0D);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   protected void a(ble.a<bcs, blc> ☃) {
/* 116 */     ☃.a((bmm<?>[])new bmm[] { a });
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bgt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */