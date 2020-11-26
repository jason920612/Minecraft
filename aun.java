/*     */ import com.google.common.collect.Multimap;
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
/*     */ public class aun
/*     */   extends ata
/*     */ {
/*     */   public aun(ata.a ☃) {
/*  33 */     super(☃);
/*     */     
/*  35 */     a(new pc("throwing"), (☃, axy1, afa1) -> 
/*     */         
/*  37 */         (afa1 != null && afa1.cT() && afa1.cW() == ☃) ? 1.0F : 0.0F);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃, axy axy1, el el1, aog aog1) {
/*  43 */     return !aog1.u();
/*     */   }
/*     */ 
/*     */   
/*     */   public auo d(ate ☃) {
/*  48 */     return auo.f;
/*     */   }
/*     */ 
/*     */   
/*     */   public int c(ate ☃) {
/*  53 */     return 72000;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(ate ☃, axy axy1, afa afa1, int i) {
/*  63 */     if (!(afa1 instanceof aog)) {
/*     */       return;
/*     */     }
/*     */     
/*  67 */     aog aog = (aog)afa1;
/*     */     
/*  69 */     int j = c(☃) - i;
/*  70 */     if (j < 10) {
/*     */       return;
/*     */     }
/*     */     
/*  74 */     int k = awg.g(☃);
/*  75 */     if (k > 0 && !aog.ao()) {
/*     */       return;
/*     */     }
/*     */     
/*  79 */     if (!axy1.B) {
/*  80 */       ☃.a(1, aog);
/*     */       
/*  82 */       if (k == 0) {
/*  83 */         ape ape = new ape(axy1, aog, ☃);
/*  84 */         ape.a(aog, aog.x, aog.w, 0.0F, 2.5F + k * 0.5F, 1.0F);
/*     */         
/*  86 */         if (aog.bV.d) {
/*  87 */           ape.d = aok.a.c;
/*     */         }
/*     */         
/*  90 */         axy1.a(ape);
/*     */         
/*  92 */         if (!aog.bV.d) {
/*  93 */           aog.bB.f(☃);
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/*  98 */     aog.b(ws.c.b(this));
/*     */     
/* 100 */     wi wi = wj.jN;
/* 101 */     if (k > 0) {
/* 102 */       float f1 = aog.w;
/* 103 */       float f2 = aog.x;
/*     */ 
/*     */       
/* 106 */       float f3 = -xq.a(f1 * 0.017453292F) * xq.b(f2 * 0.017453292F);
/* 107 */       float f4 = -xq.a(f2 * 0.017453292F);
/* 108 */       float f5 = xq.b(f1 * 0.017453292F) * xq.b(f2 * 0.017453292F);
/* 109 */       float f6 = xq.c(f3 * f3 + f4 * f4 + f5 * f5);
/* 110 */       float f7 = 3.0F * (1.0F + k) / 4.0F;
/* 111 */       f3 *= f7 / f6;
/* 112 */       f4 *= f7 / f6;
/* 113 */       f5 *= f7 / f6;
/* 114 */       aog.f(f3, f4, f5);
/*     */       
/* 116 */       if (k >= 3) {
/* 117 */         wi = wj.jM;
/* 118 */       } else if (k == 2) {
/* 119 */         wi = wj.jL;
/*     */       } else {
/* 121 */         wi = wj.jK;
/*     */       } 
/* 123 */       aog.o(20);
/* 124 */       if (aog.A) {
/* 125 */         float f = 1.1999999F;
/* 126 */         aog.a(afe.a, 0.0D, 1.1999999284744263D, 0.0D);
/*     */       } 
/*     */     } 
/* 129 */     axy1.a((aog)null, aog.q, aog.r, aog.s, wi, wk.h, 1.0F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public adn<ate> a(axy ☃, aog aog1, adk adk1) {
/* 134 */     ate ate = aog1.b(adk1);
/* 135 */     if (ate.g() >= ate.h())
/*     */     {
/* 137 */       return new adn<>(adm.c, ate);
/*     */     }
/* 139 */     if (awg.g(ate) > 0 && !aog1.ao())
/*     */     {
/* 141 */       return new adn<>(adm.c, ate);
/*     */     }
/* 143 */     aog1.c(adk1);
/* 144 */     return new adn<>(adm.a, ate);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ate ☃, afa afa1, afa afa2) {
/* 149 */     ☃.a(1, afa2);
/* 150 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(ate ☃, axy axy1, blc blc1, el el1, afa afa1) {
/* 156 */     if (blc1.e(axy1, el1) != 0.0D) {
/* 157 */       ☃.a(2, afa1);
/*     */     }
/* 159 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public Multimap<String, afo> a(aew ☃) {
/* 164 */     Multimap<String, afo> multimap = super.a(☃);
/*     */ 
/*     */     
/* 167 */     if (☃ == aew.a) {
/* 168 */       multimap.put(ank.f.a(), new afo(g, "Tool modifier", 8.0D, 0));
/* 169 */       multimap.put(ank.g.a(), new afo(h, "Tool modifier", -2.9000000953674316D, 0));
/*     */     } 
/*     */     
/* 172 */     return multimap;
/*     */   }
/*     */ 
/*     */   
/*     */   public int c() {
/* 177 */     return 1;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\aun.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */