/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Sets;
/*     */ import java.util.List;
/*     */ import java.util.Set;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bkv
/*     */   extends beb
/*     */ {
/*  36 */   public static final bmb b = bma.f;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  43 */   protected static final cew c = bcs.a(0.0D, 0.0D, 0.0D, 12.0D, 16.0D, 16.0D);
/*  44 */   protected static final cew o = bcs.a(4.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D);
/*  45 */   protected static final cew p = bcs.a(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 12.0D);
/*  46 */   protected static final cew q = bcs.a(0.0D, 0.0D, 4.0D, 16.0D, 16.0D, 16.0D);
/*  47 */   protected static final cew r = bcs.a(0.0D, 0.0D, 0.0D, 16.0D, 12.0D, 16.0D);
/*  48 */   protected static final cew s = bcs.a(0.0D, 4.0D, 0.0D, 16.0D, 16.0D, 16.0D);
/*     */   
/*     */   private final boolean t;
/*     */   
/*     */   public bkv(boolean ☃, bcs.c c1) {
/*  53 */     super(c1);
/*  54 */     v(((blc)this.m.b()).a(a, eq.c).a(b, Boolean.valueOf(false)));
/*  55 */     this.t = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean q(blc ☃) {
/*  60 */     return !((Boolean)☃.c(b)).booleanValue();
/*     */   }
/*     */ 
/*     */   
/*     */   public cew a(blc ☃, axk axk1, el el1) {
/*  65 */     if (((Boolean)☃.c(b)).booleanValue()) {
/*  66 */       switch (null.a[((eq)☃.c(a)).ordinal()])
/*     */       { case 1:
/*  68 */           return s;
/*     */         
/*     */         default:
/*  71 */           return r;
/*     */         case 3:
/*  73 */           return q;
/*     */         case 4:
/*  75 */           return p;
/*     */         case 5:
/*  77 */           return o;
/*     */         case 6:
/*  79 */           break; }  return c;
/*     */     } 
/*     */     
/*  82 */     return cet.b();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean r(blc ☃) {
/*  88 */     return (!((Boolean)☃.c(b)).booleanValue() || ☃.c(a) == eq.a);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(axy ☃, el el1, blc blc1, afa afa1, ate ate1) {
/*  93 */     if (!☃.B) {
/*  94 */       a(☃, el1, blc1);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(blc ☃, axy axy1, el el1, bcs bcs1, el el2) {
/* 100 */     if (!axy1.B) {
/* 101 */       a(axy1, el1, ☃);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(blc ☃, axy axy1, el el1, blc blc1) {
/* 107 */     if (blc1.c() == ☃.c()) {
/*     */       return;
/*     */     }
/* 110 */     if (!axy1.B && axy1.f(el1) == null) {
/* 111 */       a(axy1, el1, ☃);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public blc a(ark ☃) {
/* 117 */     return p().a(a, ☃.d().d()).a(b, Boolean.valueOf(false));
/*     */   }
/*     */   
/*     */   private void a(axy ☃, el el1, blc blc1) {
/* 121 */     eq eq = (eq)blc1.c(a);
/*     */     
/* 123 */     boolean bool = a(☃, el1, eq);
/*     */     
/* 125 */     if (bool && !((Boolean)blc1.c(b)).booleanValue()) {
/* 126 */       if ((new bky(☃, el1, eq, true)).a()) {
/* 127 */         ☃.a(el1, this, 0, eq.a());
/*     */       }
/* 129 */     } else if (!bool && ((Boolean)blc1.c(b)).booleanValue()) {
/* 130 */       el el2 = el1.a(eq, 2);
/* 131 */       blc blc2 = ☃.a_(el2);
/*     */       
/* 133 */       int i = 1;
/* 134 */       if (blc2.c() == bct.bo && blc2.c(a) == eq) {
/* 135 */         bji bji = ☃.f(el2);
/*     */         
/* 137 */         if (bji instanceof bkx) {
/* 138 */           bkx bkx = (bkx)bji;
/* 139 */           if (bkx.c() && (bkx.a(0.0F) < 0.5F || ☃.V() == bkx.k() || ((td)☃).j_())) {
/* 140 */             i = 2;
/*     */           }
/*     */         } 
/*     */       } 
/*     */       
/* 145 */       ☃.a(el1, this, i, eq.a());
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
/*     */   private boolean a(axy ☃, el el1, eq eq1) {
/* 161 */     for (eq eq2 : eq.values()) {
/* 162 */       if (eq2 != eq1 && ☃.b(el1.a(eq2), eq2)) {
/* 163 */         return true;
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/* 168 */     if (☃.b(el1, eq.a)) {
/* 169 */       return true;
/*     */     }
/*     */     
/* 172 */     el el2 = el1.a();
/* 173 */     for (eq eq2 : eq.values()) {
/* 174 */       if (eq2 != eq.a && ☃.b(el2.a(eq2), eq2)) {
/* 175 */         return true;
/*     */       }
/*     */     } 
/*     */     
/* 179 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃, axy axy1, el el1, int i, int j) {
/* 184 */     eq eq = (eq)☃.c(a);
/* 185 */     if (!axy1.B) {
/* 186 */       boolean bool = a(axy1, el1, eq);
/*     */       
/* 188 */       if (bool && (i == 1 || i == 2)) {
/*     */         
/* 190 */         axy1.a(el1, ☃.a(b, Boolean.valueOf(true)), 2);
/* 191 */         return false;
/* 192 */       }  if (!bool && i == 0) {
/* 193 */         return false;
/*     */       }
/*     */     } 
/*     */     
/* 197 */     if (i == 0) {
/* 198 */       if (a(axy1, el1, eq, true)) {
/* 199 */         axy1.a(el1, ☃.a(b, Boolean.valueOf(true)), 67);
/* 200 */         axy1.a((aog)null, el1, wj.gK, wk.e, 0.5F, axy1.s.nextFloat() * 0.25F + 0.6F);
/*     */       } else {
/* 202 */         return false;
/*     */       } 
/* 204 */     } else if (i == 1 || i == 2) {
/* 205 */       bji bji = axy1.f(el1.a(eq));
/* 206 */       if (bji instanceof bkx) {
/* 207 */         ((bkx)bji).j();
/*     */       }
/*     */       
/* 210 */       axy1.a(el1, bct.bo.p().a(bku.a, eq).a(bku.b, this.t ? bml.b : bml.a), 3);
/* 211 */       axy1.a(el1, bku.a(p().a(a, eq.a(j & 0x7)), eq, false, true));
/*     */ 
/*     */       
/* 214 */       if (this.t) {
/* 215 */         el el2 = el1.a(eq.g() * 2, eq.h() * 2, eq.i() * 2);
/* 216 */         blc blc1 = axy1.a_(el2);
/* 217 */         bcs bcs = blc1.c();
/* 218 */         boolean bool = false;
/*     */         
/* 220 */         if (bcs == bct.bo) {
/*     */ 
/*     */           
/* 223 */           bji bji1 = axy1.f(el2);
/* 224 */           if (bji1 instanceof bkx) {
/* 225 */             bkx bkx = (bkx)bji1;
/*     */             
/* 227 */             if (bkx.d() == eq && bkx.c()) {
/*     */               
/* 229 */               bkx.j();
/* 230 */               bool = true;
/*     */             } 
/*     */           } 
/*     */         } 
/*     */         
/* 235 */         if (!bool) {
/* 236 */           if (i == 1 && !blc1.f() && a(blc1, axy1, el2, eq.d(), false, eq) && (blc1.o() == bzc.a || bcs == bct.aW || bcs == bct.aP)) {
/* 237 */             a(axy1, el1, eq, false);
/*     */           } else {
/* 239 */             axy1.g(el1.a(eq));
/*     */           } 
/*     */         }
/*     */       } else {
/* 243 */         axy1.g(el1.a(eq));
/*     */       } 
/*     */       
/* 246 */       axy1.a((aog)null, el1, wj.gJ, wk.e, 0.5F, axy1.s.nextFloat() * 0.15F + 0.6F);
/*     */     } 
/* 248 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃) {
/* 253 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public static boolean a(blc ☃, axy axy1, el el1, eq eq1, boolean bool, eq eq2) {
/* 258 */     bcs bcs = ☃.c();
/* 259 */     if (bcs == bct.ce) {
/* 260 */       return false;
/*     */     }
/*     */     
/* 263 */     if (!axy1.d().a(el1)) {
/* 264 */       return false;
/*     */     }
/* 266 */     if (el1.p() < 0 || (eq1 == eq.a && el1.p() == 0)) {
/* 267 */       return false;
/*     */     }
/* 269 */     if (el1.p() > axy1.aa() - 1 || (eq1 == eq.b && el1.p() == axy1.aa() - 1)) {
/* 270 */       return false;
/*     */     }
/*     */     
/* 273 */     if (bcs == bct.aW || bcs == bct.aP) {
/*     */       
/* 275 */       if (((Boolean)☃.c(b)).booleanValue()) {
/* 276 */         return false;
/*     */       }
/*     */     } else {
/* 279 */       if (☃.e(axy1, el1) == -1.0F) {
/* 280 */         return false;
/*     */       }
/*     */       
/* 283 */       switch (null.b[☃.o().ordinal()]) {
/*     */         case 1:
/* 285 */           return false;
/*     */         case 2:
/* 287 */           return bool;
/*     */         case 3:
/* 289 */           return (eq1 == eq2);
/*     */       } 
/*     */ 
/*     */     
/*     */     } 
/* 294 */     if (bcs.i()) {
/* 295 */       return false;
/*     */     }
/*     */     
/* 298 */     return true;
/*     */   }
/*     */   
/*     */   private boolean a(axy ☃, el el1, eq eq1, boolean bool) {
/* 302 */     el el2 = el1.a(eq1);
/* 303 */     if (!bool && ☃.a_(el2).c() == bct.aX)
/*     */     {
/* 305 */       ☃.a(el2, bct.a.p(), 20);
/*     */     }
/*     */     
/* 308 */     bky bky = new bky(☃, el1, eq1, bool);
/* 309 */     if (!bky.a()) {
/* 310 */       return false;
/*     */     }
/*     */     
/* 313 */     List<el> list1 = bky.c();
/* 314 */     List<blc> list = Lists.newArrayList();
/* 315 */     for (int i = 0; i < list1.size(); i++) {
/* 316 */       el el3 = list1.get(i);
/* 317 */       list.add(☃.a_(el3));
/*     */     } 
/* 319 */     List<el> list2 = bky.d();
/*     */     
/* 321 */     int j = list1.size() + list2.size();
/* 322 */     blc[] arrayOfBlc = new blc[j];
/* 323 */     eq eq2 = bool ? eq1 : eq1.d();
/*     */     
/* 325 */     Set<el> set = Sets.newHashSet(list1);
/*     */     
/*     */     int k;
/* 328 */     for (k = list2.size() - 1; k >= 0; k--) {
/* 329 */       el el3 = list2.get(k);
/*     */       
/* 331 */       blc blc = ☃.a_(el3);
/*     */       
/* 333 */       blc.a(☃, el3, 0);
/* 334 */       ☃.a(el3, bct.a.p(), 18);
/*     */       
/* 336 */       arrayOfBlc[--j] = blc;
/*     */     } 
/*     */ 
/*     */     
/* 340 */     for (k = list1.size() - 1; k >= 0; k--) {
/* 341 */       el el3 = list1.get(k);
/* 342 */       blc blc = ☃.a_(el3);
/*     */       
/* 344 */       el3 = el3.a(eq2);
/*     */       
/* 346 */       set.remove(el3);
/*     */       
/* 348 */       ☃.a(el3, bct.bo.p().a(a, eq1), 68);
/* 349 */       ☃.a(el3, bku.a(list.get(k), eq1, bool, false));
/*     */       
/* 351 */       arrayOfBlc[--j] = blc;
/*     */     } 
/*     */     
/* 354 */     if (bool) {
/* 355 */       bml bml = this.t ? bml.b : bml.a;
/* 356 */       blc blc1 = bct.aX.p().a(bkw.a, eq1).a(bkw.b, bml);
/*     */ 
/*     */ 
/*     */       
/* 360 */       blc blc2 = bct.bo.p().a(bku.a, eq1).a(bku.b, this.t ? bml.b : bml.a);
/*     */       
/* 362 */       set.remove(el2);
/*     */       
/* 364 */       ☃.a(el2, blc2, 68);
/* 365 */       ☃.a(el2, bku.a(blc1, eq1, true, true));
/*     */     } 
/*     */     
/* 368 */     for (el el3 : set) {
/* 369 */       ☃.a(el3, bct.a.p(), 66);
/*     */     }
/*     */ 
/*     */     
/* 373 */     for (k = list2.size() - 1; k >= 0; k--) {
/* 374 */       blc blc = arrayOfBlc[j++];
/* 375 */       el el3 = list2.get(k);
/*     */       
/* 377 */       blc.b(☃, el3, 2);
/* 378 */       ☃.b(el3, blc.c());
/*     */     } 
/*     */ 
/*     */     
/* 382 */     for (k = list1.size() - 1; k >= 0; k--) {
/* 383 */       ☃.b(list1.get(k), arrayOfBlc[j++].c());
/*     */     }
/*     */     
/* 386 */     if (bool) {
/* 387 */       ☃.b(el2, bct.aX);
/*     */     }
/*     */     
/* 390 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public blc a(blc ☃, bhb bhb1) {
/* 395 */     return ☃.a(a, bhb1.a((eq)☃.c(a)));
/*     */   }
/*     */ 
/*     */   
/*     */   public blc a(blc ☃, bfz bfz1) {
/* 400 */     return ☃.a(bfz1.a((eq)☃.c(a)));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(ble.a<bcs, blc> ☃) {
/* 405 */     ☃.a((bmm<?>[])new bmm[] { a, b });
/*     */   }
/*     */ 
/*     */   
/*     */   public blb a(axk ☃, blc blc1, el el1, eq eq1) {
/* 410 */     if (blc1.c(a) == eq1.d() || !((Boolean)blc1.c(b)).booleanValue()) {
/* 411 */       return blb.a;
/*     */     }
/*     */     
/* 414 */     return blb.i;
/*     */   }
/*     */ 
/*     */   
/*     */   public int j(blc ☃, axk axk1, el el1) {
/* 419 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃, axk axk1, el el1, cbf cbf1) {
/* 424 */     return false;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bkv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */