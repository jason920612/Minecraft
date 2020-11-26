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
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bdg
/*     */   extends bcs
/*     */ {
/*  38 */   public static final bmj a = bma.af;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  44 */   protected static final cew b = bcs.a(2.0D, 4.0D, 2.0D, 14.0D, 16.0D, 14.0D);
/*     */   
/*  46 */   protected static final cew c = cet.a(cet.b(), b, cei.ONLY_FIRST);
/*     */   
/*     */   public bdg(bcs.c ☃) {
/*  49 */     super(☃);
/*  50 */     v(((blc)this.m.b()).a(a, Integer.valueOf(0)));
/*     */   }
/*     */ 
/*     */   
/*     */   public cew a(blc ☃, axk axk1, el el1) {
/*  55 */     return c;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean f(blc ☃) {
/*  60 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public cew h(blc ☃, axk axk1, el el1) {
/*  65 */     return b;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃) {
/*  70 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(blc ☃, axy axy1, el el1, aer aer1) {
/*  75 */     int i = ((Integer)☃.c(a)).intValue();
/*  76 */     float f = el1.p() + (6.0F + (3 * i)) / 16.0F;
/*     */     
/*  78 */     if (!axy1.B && aer1.aV() && i > 0 && (aer1.bD()).b <= f) {
/*  79 */       aer1.Z();
/*     */       
/*  81 */       a(axy1, el1, ☃, i - 1);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃, axy axy1, el el1, aog aog1, adk adk1, eq eq1, float f1, float f2, float f3) {
/*  87 */     ate ate = aog1.b(adk1);
/*  88 */     if (ate.a()) {
/*  89 */       return true;
/*     */     }
/*     */     
/*  92 */     int i = ((Integer)☃.c(a)).intValue();
/*  93 */     ata ata = ate.b();
/*  94 */     if (ata == atf.ax) {
/*  95 */       if (i < 3 && !axy1.B) {
/*  96 */         if (!aog1.bV.d) {
/*  97 */           aog1.a(adk1, new ate(atf.aw));
/*     */         }
/*  99 */         aog1.a(ws.T);
/*     */         
/* 101 */         a(axy1, el1, ☃, 3);
/* 102 */         axy1.a((aog)null, el1, wj.ah, wk.e, 1.0F, 1.0F);
/*     */       } 
/* 104 */       return true;
/*     */     } 
/*     */     
/* 107 */     if (ata == atf.aw) {
/* 108 */       if (i == 3 && !axy1.B) {
/* 109 */         if (!aog1.bV.d) {
/* 110 */           ate.g(1);
/* 111 */           if (ate.a()) {
/* 112 */             aog1.a(adk1, new ate(atf.ax));
/* 113 */           } else if (!aog1.bB.e(new ate(atf.ax))) {
/* 114 */             aog1.a(new ate(atf.ax), false);
/*     */           } 
/*     */         } 
/* 117 */         aog1.a(ws.U);
/*     */         
/* 119 */         a(axy1, el1, ☃, 0);
/* 120 */         axy1.a((aog)null, el1, wj.ak, wk.e, 1.0F, 1.0F);
/*     */       } 
/* 122 */       return true;
/*     */     } 
/*     */     
/* 125 */     if (ata == atf.cq) {
/* 126 */       if (i > 0 && !axy1.B) {
/* 127 */         if (!aog1.bV.d) {
/* 128 */           ate ate1 = auv.a(new ate(atf.cn), auw.b);
/* 129 */           aog1.a(ws.U);
/*     */           
/* 131 */           ate.g(1);
/* 132 */           if (ate.a()) {
/* 133 */             aog1.a(adk1, ate1);
/* 134 */           } else if (!aog1.bB.e(ate1)) {
/* 135 */             aog1.a(ate1, false);
/* 136 */           } else if (aog1 instanceof tf) {
/* 137 */             ((tf)aog1).a(aog1.bD);
/*     */           } 
/*     */         } 
/*     */         
/* 141 */         axy1.a((aog)null, el1, wj.Z, wk.e, 1.0F, 1.0F);
/* 142 */         a(axy1, el1, ☃, i - 1);
/*     */       } 
/*     */       
/* 145 */       return true;
/*     */     } 
/*     */     
/* 148 */     if (ata == atf.cn && auv.d(ate) == auw.b) {
/* 149 */       if (i < 3 && !axy1.B) {
/* 150 */         if (!aog1.bV.d) {
/* 151 */           ate ate1 = new ate(atf.cq);
/* 152 */           aog1.a(ws.U);
/*     */           
/* 154 */           aog1.a(adk1, ate1);
/*     */           
/* 156 */           if (aog1 instanceof tf) {
/* 157 */             ((tf)aog1).a(aog1.bD);
/*     */           }
/*     */         } 
/*     */         
/* 161 */         axy1.a((aog)null, el1, wj.Y, wk.e, 1.0F, 1.0F);
/* 162 */         a(axy1, el1, ☃, i + 1);
/*     */       } 
/*     */       
/* 165 */       return true;
/*     */     } 
/*     */     
/* 168 */     if (i > 0 && ata instanceof ase) {
/* 169 */       ase ase = (ase)ata;
/* 170 */       if (ase.e(ate) && !axy1.B) {
/* 171 */         ase.g(ate);
/* 172 */         a(axy1, el1, ☃, i - 1);
/* 173 */         aog1.a(ws.V);
/* 174 */         return true;
/*     */       } 
/*     */     } 
/*     */     
/* 178 */     if (i > 0 && ata instanceof arh) {
/* 179 */       if (bje.a(ate) > 0 && !axy1.B) {
/* 180 */         ate ate1 = ate.i();
/* 181 */         ate1.e(1);
/* 182 */         bje.b(ate1);
/* 183 */         aog1.a(ws.W);
/*     */ 
/*     */         
/* 186 */         if (!aog1.bV.d) {
/* 187 */           ate.g(1);
/* 188 */           a(axy1, el1, ☃, i - 1);
/*     */         } 
/* 190 */         if (ate.a()) {
/* 191 */           aog1.a(adk1, ate1);
/* 192 */         } else if (!aog1.bB.e(ate1)) {
/* 193 */           aog1.a(ate1, false);
/* 194 */         } else if (aog1 instanceof tf) {
/* 195 */           ((tf)aog1).a(aog1.bD);
/*     */         } 
/*     */       } 
/* 198 */       return true;
/*     */     } 
/*     */     
/* 201 */     if (i > 0 && ata instanceof arj) {
/* 202 */       bcs bcs1 = ((arj)ata).d();
/* 203 */       if (bcs1 instanceof bhi && !axy1.e()) {
/* 204 */         ate ate1 = new ate(bct.iq, 1);
/* 205 */         if (ate.m()) {
/* 206 */           ate1.c(ate.n().f());
/*     */         }
/* 208 */         aog1.a(adk1, ate1);
/* 209 */         a(axy1, el1, ☃, i - 1);
/* 210 */         aog1.a(ws.X);
/*     */       } 
/* 212 */       return true;
/*     */     } 
/*     */     
/* 215 */     return false;
/*     */   }
/*     */   
/*     */   public void a(axy ☃, el el1, blc blc1, int i) {
/* 219 */     ☃.a(el1, blc1.a(a, Integer.valueOf(xq.a(i, 0, 3))), 2);
/* 220 */     ☃.c(el1, this);
/*     */   }
/*     */ 
/*     */   
/*     */   public void c(axy ☃, el el1) {
/* 225 */     if (☃.s.nextInt(20) != 1) {
/*     */       return;
/*     */     }
/*     */     
/* 229 */     float f = ☃.d(el1).c(el1);
/* 230 */     if (f < 0.15F) {
/*     */       return;
/*     */     }
/*     */     
/* 234 */     blc blc = ☃.a_(el1);
/* 235 */     if (((Integer)blc.c(a)).intValue() < 3) {
/* 236 */       ☃.a(el1, blc.a(a), 2);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean u(blc ☃) {
/* 242 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(blc ☃, axy axy1, el el1) {
/* 247 */     return ((Integer)☃.c(a)).intValue();
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(ble.a<bcs, blc> ☃) {
/* 252 */     ☃.a((bmm<?>[])new bmm[] { a });
/*     */   }
/*     */ 
/*     */   
/*     */   public blb a(axk ☃, blc blc1, el el1, eq eq1) {
/* 257 */     if (eq1 == eq.b)
/* 258 */       return blb.b; 
/* 259 */     if (eq1 == eq.a) {
/* 260 */       return blb.i;
/*     */     }
/* 262 */     return blb.a;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃, axk axk1, el el1, cbf cbf1) {
/* 267 */     return false;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bdg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */