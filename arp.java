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
/*     */ public class arp
/*     */   extends ata
/*     */ {
/*     */   public arp(ata.a ☃) {
/*  22 */     super(☃);
/*  23 */     a(new pc("pull"), (☃, axy1, afa1) -> (afa1 == null) ? 0.0F : ((afa1.cW().b() != atf.g) ? 0.0F : ((☃.k() - afa1.cX()) / 20.0F)));
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
/*  36 */     a(new pc("pulling"), (☃, axy1, afa1) -> 
/*     */         
/*  38 */         (afa1 != null && afa1.cT() && afa1.cW() == ☃) ? 1.0F : 0.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   private ate a(aog ☃) {
/*  43 */     if (e_(☃.b(adk.b))) {
/*  44 */       return ☃.b(adk.b);
/*     */     }
/*  46 */     if (e_(☃.b(adk.a))) {
/*  47 */       return ☃.b(adk.a);
/*     */     }
/*  49 */     for (int i = 0; i < ☃.bB.T_(); i++) {
/*  50 */       ate ate = ☃.bB.a(i);
/*  51 */       if (e_(ate)) {
/*  52 */         return ate;
/*     */       }
/*     */     } 
/*  55 */     return ate.a;
/*     */   }
/*     */   
/*     */   protected boolean e_(ate ☃) {
/*  59 */     return ☃.b() instanceof arf;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ate ☃, axy axy1, afa afa1, int i) {
/*  64 */     if (!(afa1 instanceof aog)) {
/*     */       return;
/*     */     }
/*     */     
/*  68 */     aog aog = (aog)afa1;
/*  69 */     boolean bool1 = (aog.bV.d || awg.a(awi.z, ☃) > 0);
/*  70 */     ate ate1 = a(aog);
/*     */     
/*  72 */     if (ate1.a() && !bool1) {
/*     */       return;
/*     */     }
/*     */     
/*  76 */     if (ate1.a()) {
/*  77 */       ate1 = new ate(atf.h);
/*     */     }
/*     */     
/*  80 */     int j = c(☃) - i;
/*  81 */     float f = a(j);
/*  82 */     if (f < 0.1D) {
/*     */       return;
/*     */     }
/*     */     
/*  86 */     boolean bool2 = (bool1 && ate1.b() == atf.h);
/*  87 */     if (!axy1.B) {
/*  88 */       arf arf = (ate1.b() instanceof arf) ? (arf)ate1.b() : (arf)atf.h;
/*     */       
/*  90 */       aok aok = arf.a(axy1, ate1, aog);
/*  91 */       aok.a(aog, aog.x, aog.w, 0.0F, f * 3.0F, 1.0F);
/*  92 */       if (f == 1.0F) {
/*  93 */         aok.a(true);
/*     */       }
/*  95 */       int k = awg.a(awi.w, ☃);
/*  96 */       if (k > 0) {
/*  97 */         aok.c(aok.m() + k * 0.5D + 0.5D);
/*     */       }
/*  99 */       int m = awg.a(awi.x, ☃);
/* 100 */       if (m > 0) {
/* 101 */         aok.a(m);
/*     */       }
/* 103 */       if (awg.a(awi.y, ☃) > 0) {
/* 104 */         aok.f(100);
/*     */       }
/* 106 */       ☃.a(1, aog);
/*     */       
/* 108 */       if (bool2 || (aog.bV.d && (ate1.b() == atf.i || ate1.b() == atf.j))) {
/* 109 */         aok.d = aok.a.c;
/*     */       }
/*     */       
/* 112 */       axy1.a(aok);
/*     */     } 
/*     */     
/* 115 */     axy1.a((aog)null, aog.q, aog.r, aog.s, wj.D, wk.h, 1.0F, 1.0F / (i.nextFloat() * 0.4F + 1.2F) + f * 0.5F);
/* 116 */     if (!bool2 && !aog.bV.d) {
/* 117 */       ate1.g(1);
/* 118 */       if (ate1.a())
/*     */       {
/* 120 */         aog.bB.f(ate1);
/*     */       }
/*     */     } 
/* 123 */     aog.b(ws.c.b(this));
/*     */   }
/*     */   
/*     */   public static float a(int ☃) {
/* 127 */     float f = ☃ / 20.0F;
/* 128 */     f = (f * f + f * 2.0F) / 3.0F;
/* 129 */     if (f > 1.0F) {
/* 130 */       f = 1.0F;
/*     */     }
/* 132 */     return f;
/*     */   }
/*     */ 
/*     */   
/*     */   public int c(ate ☃) {
/* 137 */     return 72000;
/*     */   }
/*     */ 
/*     */   
/*     */   public auo d(ate ☃) {
/* 142 */     return auo.e;
/*     */   }
/*     */ 
/*     */   
/*     */   public adn<ate> a(axy ☃, aog aog1, adk adk1) {
/* 147 */     ate ate = aog1.b(adk1);
/* 148 */     boolean bool = !a(aog1).a();
/* 149 */     if (aog1.bV.d || bool) {
/* 150 */       aog1.c(adk1);
/* 151 */       return new adn<>(adm.a, ate);
/*     */     } 
/* 153 */     if (bool) {
/* 154 */       return new adn<>(adm.b, ate);
/*     */     }
/* 156 */     return new adn<>(adm.c, ate);
/*     */   }
/*     */ 
/*     */   
/*     */   public int c() {
/* 161 */     return 1;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\arp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */