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
/*     */ public class bhz
/*     */   extends bda
/*     */   implements bcv
/*     */ {
/*  23 */   public static final bmj a = bma.W;
/*     */ 
/*     */   
/*  26 */   protected static final cew[] b = new cew[] {
/*  27 */       bcs.a(7.0D, 0.0D, 7.0D, 9.0D, 2.0D, 9.0D), 
/*  28 */       bcs.a(7.0D, 0.0D, 7.0D, 9.0D, 4.0D, 9.0D), 
/*  29 */       bcs.a(7.0D, 0.0D, 7.0D, 9.0D, 6.0D, 9.0D), 
/*  30 */       bcs.a(7.0D, 0.0D, 7.0D, 9.0D, 8.0D, 9.0D), 
/*  31 */       bcs.a(7.0D, 0.0D, 7.0D, 9.0D, 10.0D, 9.0D), 
/*  32 */       bcs.a(7.0D, 0.0D, 7.0D, 9.0D, 12.0D, 9.0D), 
/*  33 */       bcs.a(7.0D, 0.0D, 7.0D, 9.0D, 14.0D, 9.0D), 
/*  34 */       bcs.a(7.0D, 0.0D, 7.0D, 9.0D, 16.0D, 9.0D)
/*     */     };
/*     */   
/*     */   private final bia c;
/*     */   
/*     */   protected bhz(bia ☃, bcs.c c1) {
/*  40 */     super(c1);
/*  41 */     this.c = ☃;
/*  42 */     v(((blc)this.m.b()).a(a, Integer.valueOf(0)));
/*     */   }
/*     */ 
/*     */   
/*     */   public cew a(blc ☃, axk axk1, el el1) {
/*  47 */     return b[((Integer)☃.c(a)).intValue()];
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean b(blc ☃, axk axk1, el el1) {
/*  52 */     return (☃.c() == bct.cq);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(blc ☃, axy axy1, el el1, Random random) {
/*  57 */     super.a(☃, axy1, el1, random);
/*  58 */     if (axy1.a(el1.a(), 0) < 9) {
/*     */       return;
/*     */     }
/*     */     
/*  62 */     float f = bdv.a(this, axy1, el1);
/*  63 */     if (random.nextInt((int)(25.0F / f) + 1) == 0) {
/*  64 */       int i = ((Integer)☃.c(a)).intValue();
/*  65 */       if (i < 7) {
/*  66 */         ☃ = ☃.a(a, Integer.valueOf(i + 1));
/*  67 */         axy1.a(el1, ☃, 2);
/*     */       } else {
/*  69 */         eq eq = eq.c.a.a(random);
/*  70 */         el el2 = el1.a(eq);
/*     */         
/*  72 */         bcs bcs = axy1.a_(el2.b()).c();
/*  73 */         if (axy1.a_(el2).f() && (bcs == bct.cq || bcs == bct.j || bcs == bct.k || bcs == bct.l || bcs == bct.i)) {
/*  74 */           axy1.a(el2, this.c.p());
/*  75 */           axy1.a(el1, this.c.e().p().a(bfi.D, eq));
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(blc ☃, axy axy1, el el1, float f, int i) {
/*  85 */     super.a(☃, axy1, el1, f, i);
/*     */     
/*  87 */     if (axy1.B) {
/*     */       return;
/*     */     }
/*     */     
/*  91 */     ata ata = d();
/*  92 */     if (ata == null) {
/*     */       return;
/*     */     }
/*     */     
/*  96 */     int j = ((Integer)☃.c(a)).intValue();
/*  97 */     for (int k = 0; k < 3; k++) {
/*  98 */       if (axy1.s.nextInt(15) <= j)
/*     */       {
/*     */         
/* 101 */         a(axy1, el1, new ate(ata)); } 
/*     */     } 
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   protected ata d() {
/* 107 */     if (this.c == bct.dd) {
/* 108 */       return atf.bU;
/*     */     }
/*     */     
/* 111 */     if (this.c == bct.dH) {
/* 112 */       return atf.bV;
/*     */     }
/*     */     
/* 115 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public axx a(blc ☃, axy axy1, el el1, int i) {
/* 120 */     return atf.a;
/*     */   }
/*     */ 
/*     */   
/*     */   public ate a(axk ☃, el el1, blc blc1) {
/* 125 */     ata ata = d();
/*     */     
/* 127 */     return (ata == null) ? ate.a : new ate(ata);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(axk ☃, el el1, blc blc1, boolean bool) {
/* 132 */     return (((Integer)blc1.c(a)).intValue() != 7);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(axy ☃, Random random, el el1, blc blc1) {
/* 137 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(axy ☃, Random random, el el1, blc blc1) {
/* 142 */     int i = Math.min(7, ((Integer)blc1.c(a)).intValue() + xq.a(☃.s, 2, 5));
/* 143 */     blc blc2 = blc1.a(a, Integer.valueOf(i));
/* 144 */     ☃.a(el1, blc2, 2);
/* 145 */     if (i == 7) {
/* 146 */       blc2.a(☃, el1, ☃.s);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(ble.a<bcs, blc> ☃) {
/* 152 */     ☃.a((bmm<?>[])new bmm[] { a });
/*     */   }
/*     */   
/*     */   public bia e() {
/* 156 */     return this.c;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bhz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */