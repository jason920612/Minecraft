/*     */ import com.google.common.collect.Iterables;
/*     */ import com.google.common.collect.LinkedHashMultiset;
/*     */ import com.google.common.collect.Multiset;
/*     */ import com.google.common.collect.Multisets;
/*     */ import java.util.function.Function;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class atj
/*     */   extends arx
/*     */ {
/*     */   public atj(ata.a ☃) {
/*  45 */     super(☃);
/*     */   }
/*     */   
/*     */   public static ate a(axy ☃, int i, int j, byte b, boolean bool1, boolean bool2) {
/*  49 */     ate ate = new ate(atf.bQ);
/*     */     
/*  51 */     a(ate, ☃, i, j, b, bool1, bool2, ☃.t.q());
/*     */     
/*  53 */     return ate;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static cbs a(ate ☃, axy axy1) {
/*  58 */     cbs cbs = a(axy1, "map_" + e(☃));
/*     */     
/*  60 */     if (cbs == null && !axy1.B) {
/*  61 */       cbs = a(☃, axy1, axy1.g().b(), axy1.g().d(), 3, false, false, axy1.t.q());
/*     */     }
/*     */     
/*  64 */     return cbs;
/*     */   }
/*     */   
/*     */   public static int e(ate ☃) {
/*  68 */     gy gy = ☃.n();
/*  69 */     return (gy != null && gy.c("map", 99)) ? gy.h("map") : 0;
/*     */   }
/*     */   
/*     */   private static cbs a(ate ☃, axy axy1, int i, int j, int k, boolean bool1, boolean bool2, bod bod1) {
/*  73 */     int m = axy1.a(bod.a, "map");
/*     */     
/*  75 */     cbs cbs = new cbs("map_" + m);
/*     */     
/*  77 */     cbs.a(i, j, k, bool1, bool2, bod1);
/*     */     
/*  79 */     axy1.a(bod.a, cbs.e(), cbs);
/*     */     
/*  81 */     ☃.o().b("map", m);
/*  82 */     return cbs;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static cbs a(axz ☃, String str) {
/*  87 */     return ☃.<cbs>a(bod.a, cbs::new, str);
/*     */   }
/*     */   
/*     */   public void a(axy ☃, aer aer1, cbs cbs1) {
/*  91 */     if (☃.t.q() != cbs1.c || !(aer1 instanceof aog)) {
/*     */       return;
/*     */     }
/*     */ 
/*     */     
/*  96 */     int i = 1 << cbs1.f;
/*  97 */     int j = cbs1.a;
/*  98 */     int k = cbs1.b;
/*     */     
/* 100 */     int m = xq.c(aer1.q - j) / i + 64;
/* 101 */     int n = xq.c(aer1.s - k) / i + 64;
/* 102 */     int i1 = 128 / i;
/*     */     
/* 104 */     if (☃.t.h()) {
/* 105 */       i1 /= 2;
/*     */     }
/*     */     
/* 108 */     cbs.a a = cbs1.a((aog)aer1);
/* 109 */     a.b++;
/*     */     
/* 111 */     boolean bool = false;
/* 112 */     for (int i2 = m - i1 + 1; i2 < m + i1; i2++) {
/* 113 */       if ((i2 & 0xF) == (a.b & 0xF) || bool) {
/*     */ 
/*     */ 
/*     */         
/* 117 */         bool = false;
/* 118 */         double d = 0.0D;
/* 119 */         for (int i3 = n - i1 - 1; i3 < n + i1; i3++) {
/* 120 */           if (i2 >= 0 && i3 >= -1 && i2 < 128 && i3 < 128) {
/*     */ 
/*     */ 
/*     */             
/* 124 */             int i4 = i2 - m;
/* 125 */             int i5 = i3 - n;
/*     */             
/* 127 */             boolean bool1 = (i4 * i4 + i5 * i5 > (i1 - 2) * (i1 - 2));
/*     */             
/* 129 */             int i6 = (j / i + i2 - 64) * i;
/* 130 */             int i7 = (k / i + i3 - 64) * i;
/*     */             
/* 132 */             LinkedHashMultiset linkedHashMultiset = LinkedHashMultiset.create();
/*     */             
/* 134 */             bnj bnj = ☃.l(new el(i6, 0, i7));
/* 135 */             if (!bnj.s()) {
/*     */ 
/*     */               
/* 138 */               int i8 = i6 & 0xF;
/* 139 */               int i9 = i7 & 0xF;
/* 140 */               int i10 = 0;
/*     */               
/* 142 */               double d1 = 0.0D;
/* 143 */               if (☃.t.h()) {
/* 144 */                 int i12 = i6 + i7 * 231871;
/* 145 */                 i12 = i12 * i12 * 31287121 + i12 * 11;
/*     */                 
/* 147 */                 if ((i12 >> 20 & 0x1) == 0) {
/* 148 */                   linkedHashMultiset.add(bct.j.p().d(☃, el.a), 10);
/*     */                 } else {
/* 150 */                   linkedHashMultiset.add(bct.b.p().d(☃, el.a), 100);
/*     */                 } 
/*     */                 
/* 153 */                 d1 = 100.0D;
/*     */               } else {
/* 155 */                 el.a a1 = new el.a();
/* 156 */                 for (int i12 = 0; i12 < i; i12++) {
/* 157 */                   for (int i13 = 0; i13 < i; i13++) {
/* 158 */                     blc blc; int i14 = bnj.a(bor.a.g, i12 + i8, i13 + i9) + 1;
/*     */                     
/* 160 */                     if (i14 > 1) {
/*     */                       do {
/* 162 */                         i14--;
/* 163 */                         blc = bnj.a(i12 + i8, i14, i13 + i9);
/* 164 */                         a1.c((bnj.b << 4) + i12 + i8, i14, (bnj.c << 4) + i13 + i9);
/* 165 */                       } while (blc.d(☃, a1) == bzb.b && i14 > 0);
/*     */                       
/* 167 */                       if (i14 > 0 && !blc.s().e()) {
/* 168 */                         blc blc1; int i15 = i14 - 1;
/*     */                         
/*     */                         do {
/* 171 */                           blc1 = bnj.a(i12 + i8, i15--, i13 + i9);
/* 172 */                           i10++;
/* 173 */                         } while (i15 > 0 && !blc1.s().e());
/*     */                         
/* 175 */                         blc = a(☃, blc, a1);
/*     */                       } 
/*     */                     } else {
/* 178 */                       blc = bct.z.p();
/*     */                     } 
/*     */                     
/* 181 */                     cbs1.a(☃, (bnj.b << 4) + i12 + i8, (bnj.c << 4) + i13 + i9);
/*     */                     
/* 183 */                     d1 += i14 / (i * i);
/*     */                     
/* 185 */                     linkedHashMultiset.add(blc.d(☃, a1));
/*     */                   } 
/*     */                 } 
/*     */               } 
/* 189 */               i10 /= i * i;
/*     */               
/* 191 */               double d2 = (d1 - d) * 4.0D / (i + 4) + ((i2 + i3 & 0x1) - 0.5D) * 0.4D;
/* 192 */               int i11 = 1;
/* 193 */               if (d2 > 0.6D) {
/* 194 */                 i11 = 2;
/*     */               }
/* 196 */               if (d2 < -0.6D) {
/* 197 */                 i11 = 0;
/*     */               }
/*     */               
/* 200 */               bzb bzb = (bzb)Iterables.getFirst((Iterable)Multisets.copyHighestCountFirst((Multiset)linkedHashMultiset), bzb.b);
/*     */               
/* 202 */               if (bzb == bzb.n) {
/* 203 */                 d2 = i10 * 0.1D + (i2 + i3 & 0x1) * 0.2D;
/* 204 */                 i11 = 1;
/* 205 */                 if (d2 < 0.5D) {
/* 206 */                   i11 = 2;
/*     */                 }
/* 208 */                 if (d2 > 0.9D) {
/* 209 */                   i11 = 0;
/*     */                 }
/*     */               } 
/*     */               
/* 213 */               d = d1;
/*     */               
/* 215 */               if (i3 >= 0)
/*     */               {
/*     */                 
/* 218 */                 if (i4 * i4 + i5 * i5 < i1 * i1)
/*     */                 {
/*     */                   
/* 221 */                   if (!bool1 || (i2 + i3 & 0x1) != 0) {
/*     */ 
/*     */                     
/* 224 */                     byte b1 = cbs1.g[i2 + i3 * 128];
/* 225 */                     byte b2 = (byte)(bzb.ac * 4 + i11);
/* 226 */                     if (b1 != b2) {
/* 227 */                       cbs1.g[i2 + i3 * 128] = b2;
/* 228 */                       cbs1.a(i2, i3);
/* 229 */                       bool = true;
/*     */                     } 
/*     */                   }  }  } 
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/* 236 */     }  } private blc a(axy ☃, blc blc1, el el1) { byw byw = blc1.s();
/* 237 */     if (!byw.e() && !bcs.a(blc1.h(☃, el1), eq.b)) {
/* 238 */       return byw.i();
/*     */     }
/*     */     
/* 241 */     return blc1; }
/*     */ 
/*     */   
/*     */   private static boolean a(ayu[] ☃, int i, int j, int k) {
/* 245 */     return (☃[j * i + k * i * 128 * i].h() >= 0.0F);
/*     */   }
/*     */   
/*     */   public static void a(axy ☃, ate ate1) {
/* 249 */     cbs cbs = a(ate1, ☃);
/* 250 */     if (cbs == null) {
/*     */       return;
/*     */     }
/* 253 */     if (☃.t.q() != cbs.c) {
/*     */       return;
/*     */     }
/*     */ 
/*     */     
/* 258 */     int i = 1 << cbs.f;
/* 259 */     int j = cbs.a;
/* 260 */     int k = cbs.b;
/*     */     
/* 262 */     ayu[] arrayOfAyu = ☃.H().f().b().a((j / i - 64) * i, (k / i - 64) * i, 128 * i, 128 * i, false);
/* 263 */     for (int m = 0; m < 128; m++) {
/* 264 */       for (int n = 0; n < 128; n++) {
/*     */         
/* 266 */         if (m > 0 && n > 0 && m < 127 && n < 127) {
/* 267 */           ayu ayu = arrayOfAyu[m * i + n * i * 128 * i];
/*     */           
/* 269 */           int i1 = 8;
/* 270 */           if (a(arrayOfAyu, i, m - 1, n - 1)) {
/* 271 */             i1--;
/*     */           }
/* 273 */           if (a(arrayOfAyu, i, m - 1, n + 1)) {
/* 274 */             i1--;
/*     */           }
/* 276 */           if (a(arrayOfAyu, i, m - 1, n)) {
/* 277 */             i1--;
/*     */           }
/* 279 */           if (a(arrayOfAyu, i, m + 1, n - 1)) {
/* 280 */             i1--;
/*     */           }
/* 282 */           if (a(arrayOfAyu, i, m + 1, n + 1)) {
/* 283 */             i1--;
/*     */           }
/* 285 */           if (a(arrayOfAyu, i, m + 1, n)) {
/* 286 */             i1--;
/*     */           }
/* 288 */           if (a(arrayOfAyu, i, m, n - 1)) {
/* 289 */             i1--;
/*     */           }
/* 291 */           if (a(arrayOfAyu, i, m, n + 1)) {
/* 292 */             i1--;
/*     */           }
/*     */           
/* 295 */           int i2 = 3;
/* 296 */           bzb bzb = bzb.b;
/* 297 */           if (ayu.h() < 0.0F) {
/* 298 */             bzb = bzb.q;
/* 299 */             if (i1 > 7 && n % 2 == 0) {
/* 300 */               i2 = (m + (int)(xq.a(n + 0.0F) * 7.0F)) / 8 % 5;
/* 301 */               if (i2 == 3) {
/* 302 */                 i2 = 1;
/* 303 */               } else if (i2 == 4) {
/* 304 */                 i2 = 0;
/*     */               } 
/* 306 */             } else if (i1 > 7) {
/* 307 */               bzb = bzb.b;
/* 308 */             } else if (i1 > 5) {
/* 309 */               i2 = 1;
/* 310 */             } else if (i1 > 3) {
/* 311 */               i2 = 0;
/* 312 */             } else if (i1 > 1) {
/* 313 */               i2 = 0;
/*     */             } 
/* 315 */           } else if (i1 > 0) {
/* 316 */             bzb = bzb.B;
/* 317 */             if (i1 > 3) {
/* 318 */               i2 = 1;
/*     */             } else {
/* 320 */               i2 = 3;
/*     */             } 
/*     */           } 
/*     */           
/* 324 */           if (bzb != bzb.b) {
/* 325 */             cbs.g[m + n * 128] = (byte)(bzb.ac * 4 + i2);
/* 326 */             cbs.a(m, n);
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ate ☃, axy axy1, aer aer1, int i, boolean bool) {
/* 335 */     if (axy1.B) {
/*     */       return;
/*     */     }
/*     */     
/* 339 */     cbs cbs = a(☃, axy1);
/* 340 */     if (aer1 instanceof aog) {
/* 341 */       aog aog = (aog)aer1;
/* 342 */       cbs.a(aog, ☃);
/*     */     } 
/*     */     
/* 345 */     if (bool || (aer1 instanceof aog && ((aog)aer1).cC() == ☃)) {
/* 346 */       a(axy1, aer1, cbs);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public iv<?> a(ate ☃, axy axy1, aog aog1) {
/* 353 */     return a(☃, axy1).a(☃, axy1, aog1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(ate ☃, axy axy1, aog aog1) {
/* 358 */     gy gy = ☃.n();
/* 359 */     if (gy != null && gy.c("map_scale_direction", 99)) {
/* 360 */       a(☃, axy1, gy.h("map_scale_direction"));
/* 361 */       gy.r("map_scale_direction");
/*     */     } 
/*     */   }
/*     */   
/*     */   protected static void a(ate ☃, axy axy1, int i) {
/* 366 */     cbs cbs = a(☃, axy1);
/*     */     
/* 368 */     if (cbs != null) {
/* 369 */       a(☃, axy1, cbs.a, cbs.b, xq.a(cbs.f + i, 0, 4), cbs.d, cbs.e, cbs.c);
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
/*     */   public adm a(aup ☃) {
/* 398 */     blc blc = ☃.k().a_(☃.a());
/* 399 */     if (blc.a(wv.u)) {
/* 400 */       if (!☃.g.B) {
/* 401 */         cbs cbs = a(☃.i(), ☃.k());
/* 402 */         cbs.a(☃.k(), ☃.a());
/*     */       } 
/* 404 */       return adm.a;
/*     */     } 
/* 406 */     return super.a(☃);
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\atj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */