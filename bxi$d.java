/*     */ import com.google.common.collect.Lists;
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
/*     */ 
/*     */ 
/*     */ class d
/*     */ {
/*     */   private final bxm a;
/*     */   private final Random b;
/*     */   private int c;
/*     */   private int d;
/*     */   
/*     */   public d(bxm ☃, Random random) {
/* 137 */     this.a = ☃;
/* 138 */     this.b = random;
/*     */   }
/*     */   
/*     */   public void a(el ☃, bhb bhb1, List<bxi.i> list, bxi.c c1) {
/* 142 */     bxi.e e1 = new bxi.e(null);
/* 143 */     e1.b = ☃;
/* 144 */     e1.a = bhb1;
/* 145 */     e1.c = "wall_flat";
/*     */     
/* 147 */     bxi.e e2 = new bxi.e(null);
/*     */ 
/*     */     
/* 150 */     a(list, e1);
/* 151 */     e2.b = e1.b.b(8);
/* 152 */     e2.a = e1.a;
/* 153 */     e2.c = "wall_window";
/*     */     
/* 155 */     if (!list.isEmpty());
/*     */ 
/*     */ 
/*     */     
/* 159 */     bxi.g g1 = bxi.c.a(c1);
/* 160 */     bxi.g g2 = bxi.c.b(c1);
/*     */     
/* 162 */     this.c = bxi.c.c(c1) + 1;
/* 163 */     this.d = bxi.c.d(c1) + 1;
/* 164 */     int i = bxi.c.c(c1) + 1;
/* 165 */     int j = bxi.c.d(c1);
/*     */     
/* 167 */     a(list, e1, g1, eq.d, this.c, this.d, i, j);
/* 168 */     a(list, e2, g1, eq.d, this.c, this.d, i, j);
/*     */ 
/*     */     
/* 171 */     bxi.e e3 = new bxi.e(null);
/* 172 */     e3.b = e1.b.b(19);
/* 173 */     e3.a = e1.a;
/* 174 */     e3.c = "wall_window";
/*     */     
/* 176 */     boolean bool = false;
/* 177 */     for (int k = 0; k < bxi.g.a(g2) && !bool; k++) {
/* 178 */       for (int n = bxi.g.b(g2) - 1; n >= 0 && !bool; n--) {
/* 179 */         if (bxi.c.a(g2, n, k)) {
/* 180 */           e3.b = e3.b.a(bhb1.a(eq.d), 8 + (k - this.d) * 8);
/* 181 */           e3.b = e3.b.a(bhb1.a(eq.f), (n - this.c) * 8);
/* 182 */           b(list, e3);
/* 183 */           a(list, e3, g2, eq.d, n, k, n, k);
/* 184 */           bool = true;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 190 */     a(list, ☃.b(16), bhb1, g1, g2);
/* 191 */     a(list, ☃.b(27), bhb1, g2, (bxi.g)null);
/*     */     
/* 193 */     if (!list.isEmpty());
/*     */ 
/*     */ 
/*     */     
/* 197 */     bxi.b[] arrayOfB = new bxi.b[3];
/* 198 */     arrayOfB[0] = new bxi.a(null);
/* 199 */     arrayOfB[1] = new bxi.f(null);
/* 200 */     arrayOfB[2] = new bxi.h(null);
/*     */     
/* 202 */     for (int m = 0; m < 3; m++) {
/* 203 */       el el1 = ☃.b(8 * m + ((m == 2) ? 3 : 0));
/* 204 */       bxi.g g3 = bxi.c.e(c1)[m];
/* 205 */       bxi.g g4 = (m == 2) ? g2 : g1;
/*     */ 
/*     */       
/* 208 */       String str1 = (m == 0) ? "carpet_south_1" : "carpet_south_2";
/* 209 */       String str2 = (m == 0) ? "carpet_west_1" : "carpet_west_2";
/* 210 */       for (int n = 0; n < bxi.g.a(g4); n++) {
/* 211 */         for (int i2 = 0; i2 < bxi.g.b(g4); i2++) {
/* 212 */           if (g4.a(i2, n) == 1) {
/* 213 */             el el2 = el1.a(bhb1.a(eq.d), 8 + (n - this.d) * 8);
/* 214 */             el2 = el2.a(bhb1.a(eq.f), (i2 - this.c) * 8);
/* 215 */             list.add(new bxi.i(this.a, "corridor_floor", el2, bhb1));
/*     */             
/* 217 */             if (g4.a(i2, n - 1) == 1 || (g3.a(i2, n - 1) & 0x800000) == 8388608) {
/* 218 */               list.add(new bxi.i(this.a, "carpet_north", el2.a(bhb1.a(eq.f), 1).a(), bhb1));
/*     */             }
/* 220 */             if (g4.a(i2 + 1, n) == 1 || (g3.a(i2 + 1, n) & 0x800000) == 8388608) {
/* 221 */               list.add(new bxi.i(this.a, "carpet_east", el2.a(bhb1.a(eq.d), 1).a(bhb1.a(eq.f), 5).a(), bhb1));
/*     */             }
/* 223 */             if (g4.a(i2, n + 1) == 1 || (g3.a(i2, n + 1) & 0x800000) == 8388608) {
/* 224 */               list.add(new bxi.i(this.a, str1, el2.a(bhb1.a(eq.d), 5).a(bhb1.a(eq.e), 1), bhb1));
/*     */             }
/* 226 */             if (g4.a(i2 - 1, n) == 1 || (g3.a(i2 - 1, n) & 0x800000) == 8388608) {
/* 227 */               list.add(new bxi.i(this.a, str2, el2.a(bhb1.a(eq.e), 1).a(bhb1.a(eq.c), 1), bhb1));
/*     */             }
/*     */           } 
/*     */         } 
/*     */       } 
/*     */       
/* 233 */       String str3 = (m == 0) ? "indoors_wall_1" : "indoors_wall_2";
/* 234 */       String str4 = (m == 0) ? "indoors_door_1" : "indoors_door_2";
/* 235 */       List<eq> list1 = Lists.newArrayList();
/* 236 */       for (int i1 = 0; i1 < bxi.g.a(g4); i1++) {
/* 237 */         for (int i2 = 0; i2 < bxi.g.b(g4); i2++) {
/* 238 */           boolean bool1 = (m == 2 && g4.a(i2, i1) == 3);
/* 239 */           if (g4.a(i2, i1) == 2 || bool1) {
/* 240 */             int i3 = g3.a(i2, i1);
/* 241 */             int i4 = i3 & 0xF0000;
/* 242 */             int i5 = i3 & 0xFFFF;
/*     */ 
/*     */             
/* 245 */             bool1 = (bool1 && (i3 & 0x800000) == 8388608);
/*     */             
/* 247 */             list1.clear();
/* 248 */             if ((i3 & 0x200000) == 2097152) {
/* 249 */               for (eq eq1 : eq.c.a) {
/* 250 */                 if (g4.a(i2 + eq1.g(), i1 + eq1.i()) == 1) {
/* 251 */                   list1.add(eq1);
/*     */                 }
/*     */               } 
/*     */             }
/* 255 */             eq eq = null;
/* 256 */             if (!list1.isEmpty()) {
/* 257 */               eq = list1.get(this.b.nextInt(list1.size()));
/* 258 */             } else if ((i3 & 0x100000) == 1048576) {
/*     */               
/* 260 */               eq = eq.b;
/*     */             } 
/*     */             
/* 263 */             el el2 = el1.a(bhb1.a(eq.d), 8 + (i1 - this.d) * 8);
/* 264 */             el2 = el2.a(bhb1.a(eq.f), -1 + (i2 - this.c) * 8);
/*     */             
/* 266 */             if (bxi.c.a(g4, i2 - 1, i1) && !c1.a(g4, i2 - 1, i1, m, i5)) {
/* 267 */               list.add(new bxi.i(this.a, (eq == eq.e) ? str4 : str3, el2, bhb1));
/*     */             }
/* 269 */             if (g4.a(i2 + 1, i1) == 1 && !bool1) {
/* 270 */               el el3 = el2.a(bhb1.a(eq.f), 8);
/* 271 */               list.add(new bxi.i(this.a, (eq == eq.f) ? str4 : str3, el3, bhb1));
/*     */             } 
/* 273 */             if (bxi.c.a(g4, i2, i1 + 1) && !c1.a(g4, i2, i1 + 1, m, i5)) {
/* 274 */               el el3 = el2.a(bhb1.a(eq.d), 7);
/* 275 */               el3 = el3.a(bhb1.a(eq.f), 7);
/* 276 */               list.add(new bxi.i(this.a, (eq == eq.d) ? str4 : str3, el3, bhb1.a(bhb.b)));
/*     */             } 
/* 278 */             if (g4.a(i2, i1 - 1) == 1 && !bool1) {
/* 279 */               el el3 = el2.a(bhb1.a(eq.c), 1);
/* 280 */               el3 = el3.a(bhb1.a(eq.f), 7);
/* 281 */               list.add(new bxi.i(this.a, (eq == eq.c) ? str4 : str3, el3, bhb1.a(bhb.b)));
/*     */             } 
/*     */             
/* 284 */             if (i4 == 65536) {
/* 285 */               a(list, el2, bhb1, eq, arrayOfB[m]);
/* 286 */             } else if (i4 == 131072 && eq != null) {
/*     */               
/* 288 */               eq eq1 = c1.b(g4, i2, i1, m, i5);
/* 289 */               boolean bool2 = ((i3 & 0x400000) == 4194304);
/* 290 */               a(list, el2, bhb1, eq1, eq, arrayOfB[m], bool2);
/* 291 */             } else if (i4 == 262144 && eq != null && eq != eq.b) {
/*     */               
/* 293 */               eq eq1 = eq.e();
/* 294 */               if (!c1.a(g4, i2 + eq1.g(), i1 + eq1.i(), m, i5)) {
/* 295 */                 eq1 = eq1.d();
/*     */               }
/* 297 */               a(list, el2, bhb1, eq1, eq, arrayOfB[m]);
/* 298 */             } else if (i4 == 262144 && eq == eq.b) {
/* 299 */               a(list, el2, bhb1, arrayOfB[m]);
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(List<bxi.i> ☃, bxi.e e1, bxi.g g1, eq eq1, int i, int j, int k, int m) {
/* 308 */     int n = i;
/* 309 */     int i1 = j;
/* 310 */     eq eq2 = eq1;
/*     */     
/*     */     do {
/* 313 */       if (!bxi.c.a(g1, n + eq1.g(), i1 + eq1.i())) {
/*     */         
/* 315 */         c(☃, e1);
/* 316 */         eq1 = eq1.e();
/* 317 */         if (n != k || i1 != m || eq2 != eq1) {
/* 318 */           b(☃, e1);
/*     */         }
/* 320 */       } else if (bxi.c.a(g1, n + eq1.g(), i1 + eq1.i()) && bxi.c.a(g1, n + eq1.g() + eq1.f().g(), i1 + eq1.i() + eq1.f().i())) {
/*     */         
/* 322 */         d(☃, e1);
/* 323 */         n += eq1.g();
/* 324 */         i1 += eq1.i();
/* 325 */         eq1 = eq1.f();
/*     */       } else {
/* 327 */         n += eq1.g();
/* 328 */         i1 += eq1.i();
/* 329 */         if (n != k || i1 != m || eq2 != eq1) {
/* 330 */           b(☃, e1);
/*     */         }
/*     */       } 
/* 333 */     } while (n != k || i1 != m || eq2 != eq1);
/*     */   }
/*     */   
/*     */   private void a(List<bxi.i> ☃, el el1, bhb bhb1, bxi.g g1, @Nullable bxi.g g2) {
/*     */     int i;
/* 338 */     for (i = 0; i < bxi.g.a(g1); i++) {
/* 339 */       for (int j = 0; j < bxi.g.b(g1); j++) {
/* 340 */         el el2 = el1;
/* 341 */         el2 = el2.a(bhb1.a(eq.d), 8 + (i - this.d) * 8);
/* 342 */         el2 = el2.a(bhb1.a(eq.f), (j - this.c) * 8);
/*     */ 
/*     */         
/* 345 */         boolean bool = (g2 != null && bxi.c.a(g2, j, i));
/*     */         
/* 347 */         if (bxi.c.a(g1, j, i) && !bool) {
/* 348 */           ☃.add(new bxi.i(this.a, "roof", el2.b(3), bhb1));
/*     */           
/* 350 */           if (!bxi.c.a(g1, j + 1, i)) {
/* 351 */             el el3 = el2.a(bhb1.a(eq.f), 6);
/* 352 */             ☃.add(new bxi.i(this.a, "roof_front", el3, bhb1));
/*     */           } 
/* 354 */           if (!bxi.c.a(g1, j - 1, i)) {
/* 355 */             el el3 = el2.a(bhb1.a(eq.f), 0);
/* 356 */             el3 = el3.a(bhb1.a(eq.d), 7);
/* 357 */             ☃.add(new bxi.i(this.a, "roof_front", el3, bhb1.a(bhb.c)));
/*     */           } 
/* 359 */           if (!bxi.c.a(g1, j, i - 1)) {
/* 360 */             el el3 = el2.a(bhb1.a(eq.e), 1);
/* 361 */             ☃.add(new bxi.i(this.a, "roof_front", el3, bhb1.a(bhb.d)));
/*     */           } 
/* 363 */           if (!bxi.c.a(g1, j, i + 1)) {
/* 364 */             el el3 = el2.a(bhb1.a(eq.f), 6);
/* 365 */             el3 = el3.a(bhb1.a(eq.d), 6);
/* 366 */             ☃.add(new bxi.i(this.a, "roof_front", el3, bhb1.a(bhb.b)));
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 372 */     if (g2 != null) {
/* 373 */       for (i = 0; i < bxi.g.a(g1); i++) {
/* 374 */         for (int j = 0; j < bxi.g.b(g1); j++) {
/* 375 */           el el2 = el1;
/* 376 */           el2 = el2.a(bhb1.a(eq.d), 8 + (i - this.d) * 8);
/* 377 */           el2 = el2.a(bhb1.a(eq.f), (j - this.c) * 8);
/*     */ 
/*     */           
/* 380 */           boolean bool = bxi.c.a(g2, j, i);
/*     */           
/* 382 */           if (bxi.c.a(g1, j, i) && bool) {
/*     */             
/* 384 */             if (!bxi.c.a(g1, j + 1, i)) {
/* 385 */               el el3 = el2.a(bhb1.a(eq.f), 7);
/* 386 */               ☃.add(new bxi.i(this.a, "small_wall", el3, bhb1));
/*     */             } 
/* 388 */             if (!bxi.c.a(g1, j - 1, i)) {
/* 389 */               el el3 = el2.a(bhb1.a(eq.e), 1);
/* 390 */               el3 = el3.a(bhb1.a(eq.d), 6);
/* 391 */               ☃.add(new bxi.i(this.a, "small_wall", el3, bhb1.a(bhb.c)));
/*     */             } 
/* 393 */             if (!bxi.c.a(g1, j, i - 1)) {
/* 394 */               el el3 = el2.a(bhb1.a(eq.e), 0);
/* 395 */               el3 = el3.a(bhb1.a(eq.c), 1);
/* 396 */               ☃.add(new bxi.i(this.a, "small_wall", el3, bhb1.a(bhb.d)));
/*     */             } 
/* 398 */             if (!bxi.c.a(g1, j, i + 1)) {
/* 399 */               el el3 = el2.a(bhb1.a(eq.f), 6);
/* 400 */               el3 = el3.a(bhb1.a(eq.d), 7);
/* 401 */               ☃.add(new bxi.i(this.a, "small_wall", el3, bhb1.a(bhb.b)));
/*     */             } 
/*     */             
/* 404 */             if (!bxi.c.a(g1, j + 1, i)) {
/* 405 */               if (!bxi.c.a(g1, j, i - 1)) {
/* 406 */                 el el3 = el2.a(bhb1.a(eq.f), 7);
/* 407 */                 el3 = el3.a(bhb1.a(eq.c), 2);
/* 408 */                 ☃.add(new bxi.i(this.a, "small_wall_corner", el3, bhb1));
/*     */               } 
/* 410 */               if (!bxi.c.a(g1, j, i + 1)) {
/* 411 */                 el el3 = el2.a(bhb1.a(eq.f), 8);
/* 412 */                 el3 = el3.a(bhb1.a(eq.d), 7);
/* 413 */                 ☃.add(new bxi.i(this.a, "small_wall_corner", el3, bhb1.a(bhb.b)));
/*     */               } 
/*     */             } 
/* 416 */             if (!bxi.c.a(g1, j - 1, i)) {
/* 417 */               if (!bxi.c.a(g1, j, i - 1)) {
/* 418 */                 el el3 = el2.a(bhb1.a(eq.e), 2);
/* 419 */                 el3 = el3.a(bhb1.a(eq.c), 1);
/* 420 */                 ☃.add(new bxi.i(this.a, "small_wall_corner", el3, bhb1.a(bhb.d)));
/*     */               } 
/* 422 */               if (!bxi.c.a(g1, j, i + 1)) {
/* 423 */                 el el3 = el2.a(bhb1.a(eq.e), 1);
/* 424 */                 el3 = el3.a(bhb1.a(eq.d), 8);
/* 425 */                 ☃.add(new bxi.i(this.a, "small_wall_corner", el3, bhb1.a(bhb.c)));
/*     */               } 
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     }
/*     */     
/* 433 */     for (i = 0; i < bxi.g.a(g1); i++) {
/* 434 */       for (int j = 0; j < bxi.g.b(g1); j++) {
/* 435 */         el el2 = el1;
/* 436 */         el2 = el2.a(bhb1.a(eq.d), 8 + (i - this.d) * 8);
/* 437 */         el2 = el2.a(bhb1.a(eq.f), (j - this.c) * 8);
/*     */ 
/*     */         
/* 440 */         boolean bool = (g2 != null && bxi.c.a(g2, j, i));
/*     */         
/* 442 */         if (bxi.c.a(g1, j, i) && !bool) {
/* 443 */           if (!bxi.c.a(g1, j + 1, i)) {
/* 444 */             el el3 = el2.a(bhb1.a(eq.f), 6);
/* 445 */             if (!bxi.c.a(g1, j, i + 1)) {
/* 446 */               el el4 = el3.a(bhb1.a(eq.d), 6);
/* 447 */               ☃.add(new bxi.i(this.a, "roof_corner", el4, bhb1));
/* 448 */             } else if (bxi.c.a(g1, j + 1, i + 1)) {
/* 449 */               el el4 = el3.a(bhb1.a(eq.d), 5);
/* 450 */               ☃.add(new bxi.i(this.a, "roof_inner_corner", el4, bhb1));
/*     */             } 
/* 452 */             if (!bxi.c.a(g1, j, i - 1)) {
/* 453 */               ☃.add(new bxi.i(this.a, "roof_corner", el3, bhb1.a(bhb.d)));
/* 454 */             } else if (bxi.c.a(g1, j + 1, i - 1)) {
/* 455 */               el el4 = el2.a(bhb1.a(eq.f), 9);
/* 456 */               el4 = el4.a(bhb1.a(eq.c), 2);
/* 457 */               ☃.add(new bxi.i(this.a, "roof_inner_corner", el4, bhb1.a(bhb.b)));
/*     */             } 
/*     */           } 
/* 460 */           if (!bxi.c.a(g1, j - 1, i)) {
/* 461 */             el el3 = el2.a(bhb1.a(eq.f), 0);
/* 462 */             el3 = el3.a(bhb1.a(eq.d), 0);
/* 463 */             if (!bxi.c.a(g1, j, i + 1)) {
/* 464 */               el el4 = el3.a(bhb1.a(eq.d), 6);
/* 465 */               ☃.add(new bxi.i(this.a, "roof_corner", el4, bhb1.a(bhb.b)));
/* 466 */             } else if (bxi.c.a(g1, j - 1, i + 1)) {
/* 467 */               el el4 = el3.a(bhb1.a(eq.d), 8);
/* 468 */               el4 = el4.a(bhb1.a(eq.e), 3);
/* 469 */               ☃.add(new bxi.i(this.a, "roof_inner_corner", el4, bhb1.a(bhb.d)));
/*     */             } 
/* 471 */             if (!bxi.c.a(g1, j, i - 1)) {
/* 472 */               ☃.add(new bxi.i(this.a, "roof_corner", el3, bhb1.a(bhb.c)));
/* 473 */             } else if (bxi.c.a(g1, j - 1, i - 1)) {
/* 474 */               el el4 = el3.a(bhb1.a(eq.d), 1);
/* 475 */               ☃.add(new bxi.i(this.a, "roof_inner_corner", el4, bhb1.a(bhb.c)));
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(List<bxi.i> ☃, bxi.e e1) {
/* 484 */     eq eq = e1.a.a(eq.e);
/* 485 */     ☃.add(new bxi.i(this.a, "entrance", e1.b.a(eq, 9), e1.a));
/* 486 */     e1.b = e1.b.a(e1.a.a(eq.d), 16);
/*     */   }
/*     */   
/*     */   private void b(List<bxi.i> ☃, bxi.e e1) {
/* 490 */     ☃.add(new bxi.i(this.a, e1.c, e1.b.a(e1.a.a(eq.f), 7), e1.a));
/* 491 */     e1.b = e1.b.a(e1.a.a(eq.d), 8);
/*     */   }
/*     */   
/*     */   private void c(List<bxi.i> ☃, bxi.e e1) {
/* 495 */     e1.b = e1.b.a(e1.a.a(eq.d), -1);
/* 496 */     ☃.add(new bxi.i(this.a, "wall_corner", e1.b, e1.a));
/* 497 */     e1.b = e1.b.a(e1.a.a(eq.d), -7);
/* 498 */     e1.b = e1.b.a(e1.a.a(eq.e), -6);
/* 499 */     e1.a = e1.a.a(bhb.b);
/*     */   }
/*     */   
/*     */   private void d(List<bxi.i> ☃, bxi.e e1) {
/* 503 */     e1.b = e1.b.a(e1.a.a(eq.d), 6);
/* 504 */     e1.b = e1.b.a(e1.a.a(eq.f), 8);
/* 505 */     e1.a = e1.a.a(bhb.d);
/*     */   }
/*     */   
/*     */   private void a(List<bxi.i> ☃, el el1, bhb bhb1, eq eq1, bxi.b b1) {
/* 509 */     bhb bhb2 = bhb.a;
/* 510 */     String str = b1.a(this.b);
/* 511 */     if (eq1 != eq.f) {
/* 512 */       if (eq1 == eq.c) {
/* 513 */         bhb2 = bhb2.a(bhb.d);
/* 514 */       } else if (eq1 == eq.e) {
/* 515 */         bhb2 = bhb2.a(bhb.c);
/* 516 */       } else if (eq1 == eq.d) {
/* 517 */         bhb2 = bhb2.a(bhb.b);
/*     */       } else {
/*     */         
/* 520 */         str = b1.b(this.b);
/*     */       } 
/*     */     }
/* 523 */     el el2 = bxp.a(new el(1, 0, 0), bfz.a, bhb2, 7, 7);
/* 524 */     bhb2 = bhb2.a(bhb1);
/* 525 */     el2 = el2.a(bhb1);
/* 526 */     el el3 = el1.a(el2.o(), 0, el2.q());
/* 527 */     ☃.add(new bxi.i(this.a, str, el3, bhb2));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void a(List<bxi.i> ☃, el el1, bhb bhb1, eq eq1, eq eq2, bxi.b b1, boolean bool) {
/* 534 */     if (eq2 == eq.f && eq1 == eq.d) {
/*     */ 
/*     */       
/* 537 */       el el2 = el1.a(bhb1.a(eq.f), 1);
/* 538 */       ☃.add(new bxi.i(this.a, b1.a(this.b, bool), el2, bhb1));
/* 539 */     } else if (eq2 == eq.f && eq1 == eq.c) {
/*     */ 
/*     */       
/* 542 */       el el2 = el1.a(bhb1.a(eq.f), 1);
/* 543 */       el2 = el2.a(bhb1.a(eq.d), 6);
/* 544 */       ☃.add(new bxi.i(this.a, b1.a(this.b, bool), el2, bhb1, bfz.b));
/* 545 */     } else if (eq2 == eq.e && eq1 == eq.c) {
/*     */ 
/*     */       
/* 548 */       el el2 = el1.a(bhb1.a(eq.f), 7);
/* 549 */       el2 = el2.a(bhb1.a(eq.d), 6);
/* 550 */       ☃.add(new bxi.i(this.a, b1.a(this.b, bool), el2, bhb1.a(bhb.c)));
/* 551 */     } else if (eq2 == eq.e && eq1 == eq.d) {
/*     */ 
/*     */       
/* 554 */       el el2 = el1.a(bhb1.a(eq.f), 7);
/* 555 */       ☃.add(new bxi.i(this.a, b1.a(this.b, bool), el2, bhb1, bfz.c));
/* 556 */     } else if (eq2 == eq.d && eq1 == eq.f) {
/*     */ 
/*     */       
/* 559 */       el el2 = el1.a(bhb1.a(eq.f), 1);
/* 560 */       ☃.add(new bxi.i(this.a, b1.a(this.b, bool), el2, bhb1.a(bhb.b), bfz.b));
/* 561 */     } else if (eq2 == eq.d && eq1 == eq.e) {
/*     */ 
/*     */       
/* 564 */       el el2 = el1.a(bhb1.a(eq.f), 7);
/* 565 */       ☃.add(new bxi.i(this.a, b1.a(this.b, bool), el2, bhb1.a(bhb.b)));
/* 566 */     } else if (eq2 == eq.c && eq1 == eq.e) {
/*     */ 
/*     */       
/* 569 */       el el2 = el1.a(bhb1.a(eq.f), 7);
/* 570 */       el2 = el2.a(bhb1.a(eq.d), 6);
/* 571 */       ☃.add(new bxi.i(this.a, b1.a(this.b, bool), el2, bhb1.a(bhb.b), bfz.c));
/* 572 */     } else if (eq2 == eq.c && eq1 == eq.f) {
/*     */ 
/*     */       
/* 575 */       el el2 = el1.a(bhb1.a(eq.f), 1);
/* 576 */       el2 = el2.a(bhb1.a(eq.d), 6);
/* 577 */       ☃.add(new bxi.i(this.a, b1.a(this.b, bool), el2, bhb1.a(bhb.d)));
/* 578 */     } else if (eq2 == eq.d && eq1 == eq.c) {
/*     */ 
/*     */ 
/*     */       
/* 582 */       el el2 = el1.a(bhb1.a(eq.f), 1);
/* 583 */       el2 = el2.a(bhb1.a(eq.c), 8);
/* 584 */       ☃.add(new bxi.i(this.a, b1.b(this.b, bool), el2, bhb1));
/* 585 */     } else if (eq2 == eq.c && eq1 == eq.d) {
/*     */ 
/*     */ 
/*     */       
/* 589 */       el el2 = el1.a(bhb1.a(eq.f), 7);
/* 590 */       el2 = el2.a(bhb1.a(eq.d), 14);
/* 591 */       ☃.add(new bxi.i(this.a, b1.b(this.b, bool), el2, bhb1.a(bhb.c)));
/* 592 */     } else if (eq2 == eq.e && eq1 == eq.f) {
/*     */       
/* 594 */       el el2 = el1.a(bhb1.a(eq.f), 15);
/* 595 */       ☃.add(new bxi.i(this.a, b1.b(this.b, bool), el2, bhb1.a(bhb.b)));
/* 596 */     } else if (eq2 == eq.f && eq1 == eq.e) {
/*     */       
/* 598 */       el el2 = el1.a(bhb1.a(eq.e), 7);
/* 599 */       el2 = el2.a(bhb1.a(eq.d), 6);
/* 600 */       ☃.add(new bxi.i(this.a, b1.b(this.b, bool), el2, bhb1.a(bhb.d)));
/* 601 */     } else if (eq2 == eq.b && eq1 == eq.f) {
/*     */       
/* 603 */       el el2 = el1.a(bhb1.a(eq.f), 15);
/* 604 */       ☃.add(new bxi.i(this.a, b1.c(this.b), el2, bhb1.a(bhb.b)));
/* 605 */     } else if (eq2 == eq.b && eq1 == eq.d) {
/*     */ 
/*     */ 
/*     */       
/* 609 */       el el2 = el1.a(bhb1.a(eq.f), 1);
/* 610 */       el2 = el2.a(bhb1.a(eq.c), 0);
/* 611 */       ☃.add(new bxi.i(this.a, b1.c(this.b), el2, bhb1));
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(List<bxi.i> ☃, el el1, bhb bhb1, eq eq1, eq eq2, bxi.b b1) {
/* 616 */     int i = 0;
/* 617 */     int j = 0;
/* 618 */     bhb bhb2 = bhb1;
/* 619 */     bfz bfz = bfz.a;
/*     */ 
/*     */ 
/*     */     
/* 623 */     if (eq2 == eq.f && eq1 == eq.d) {
/*     */ 
/*     */       
/* 626 */       i = -7;
/* 627 */     } else if (eq2 == eq.f && eq1 == eq.c) {
/*     */ 
/*     */       
/* 630 */       i = -7;
/* 631 */       j = 6;
/* 632 */       bfz = bfz.b;
/* 633 */     } else if (eq2 == eq.c && eq1 == eq.f) {
/*     */ 
/*     */ 
/*     */       
/* 637 */       i = 1;
/* 638 */       j = 14;
/* 639 */       bhb2 = bhb1.a(bhb.d);
/* 640 */     } else if (eq2 == eq.c && eq1 == eq.e) {
/*     */ 
/*     */ 
/*     */       
/* 644 */       i = 7;
/* 645 */       j = 14;
/* 646 */       bhb2 = bhb1.a(bhb.d);
/* 647 */       bfz = bfz.b;
/* 648 */     } else if (eq2 == eq.d && eq1 == eq.e) {
/*     */ 
/*     */ 
/*     */       
/* 652 */       i = 7;
/* 653 */       j = -8;
/* 654 */       bhb2 = bhb1.a(bhb.b);
/* 655 */     } else if (eq2 == eq.d && eq1 == eq.f) {
/*     */ 
/*     */ 
/*     */       
/* 659 */       i = 1;
/* 660 */       j = -8;
/* 661 */       bhb2 = bhb1.a(bhb.b);
/* 662 */       bfz = bfz.b;
/* 663 */     } else if (eq2 == eq.e && eq1 == eq.c) {
/*     */ 
/*     */       
/* 666 */       i = 15;
/* 667 */       j = 6;
/* 668 */       bhb2 = bhb1.a(bhb.c);
/* 669 */     } else if (eq2 == eq.e && eq1 == eq.d) {
/*     */ 
/*     */       
/* 672 */       i = 15;
/* 673 */       bfz = bfz.c;
/*     */     } 
/*     */     
/* 676 */     el el2 = el1.a(bhb1.a(eq.f), i);
/* 677 */     el2 = el2.a(bhb1.a(eq.d), j);
/* 678 */     ☃.add(new bxi.i(this.a, b1.d(this.b), el2, bhb2, bfz));
/*     */   }
/*     */   
/*     */   private void a(List<bxi.i> ☃, el el1, bhb bhb1, bxi.b b1) {
/* 682 */     el el2 = el1.a(bhb1.a(eq.f), 1);
/* 683 */     ☃.add(new bxi.i(this.a, b1.e(this.b), el2, bhb1, bfz.a));
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bxi$d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */