/*     */ import com.google.common.collect.Maps;
/*     */ import com.mojang.datafixers.util.Pair;
/*     */ import it.unimi.dsi.fastutil.objects.Object2ByteLinkedOpenHashMap;
/*     */ import it.unimi.dsi.fastutil.shorts.Short2BooleanMap;
/*     */ import it.unimi.dsi.fastutil.shorts.Short2BooleanOpenHashMap;
/*     */ import it.unimi.dsi.fastutil.shorts.Short2ObjectMap;
/*     */ import it.unimi.dsi.fastutil.shorts.Short2ObjectOpenHashMap;
/*     */ import java.util.Map;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class byu
/*     */   extends byv
/*     */ {
/*  34 */   public static final bmb a = bma.h;
/*  35 */   public static final bmj b = bma.ag;
/*     */   
/*     */   static {
/*  38 */     e = ThreadLocal.withInitial(() -> {
/*     */           Object2ByteLinkedOpenHashMap<bcs.a> ☃ = new Object2ByteLinkedOpenHashMap<bcs.a>(200) {
/*     */               protected void rehash(int ☃) {}
/*     */             };
/*     */           ☃.defaultReturnValue(127);
/*     */           return ☃;
/*     */         });
/*     */   }
/*     */   
/*     */   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<bcs.a>> e;
/*     */   
/*     */   protected void a(ble.a<byv, byw> ☃) {
/*  50 */     ☃.a((bmm<?>[])new bmm[] { a });
/*     */   }
/*     */ 
/*     */   
/*     */   public cee a(ayc ☃, el el1, byw byw1) {
/*  55 */     double d1 = 0.0D;
/*  56 */     double d2 = 0.0D;
/*     */     
/*  58 */     try (el.b ☃ = el.b.r()) {
/*  59 */       for (eq eq : eq.c.a) {
/*  60 */         b.j(el1).d(eq);
/*  61 */         byw byw2 = ☃.b(b);
/*  62 */         if (!g(byw2)) {
/*     */           continue;
/*     */         }
/*  65 */         float f1 = byw2.f();
/*  66 */         float f2 = 0.0F;
/*  67 */         if (f1 == 0.0F) {
/*  68 */           if (!☃.a_(b).d().c()) {
/*  69 */             byw byw3 = ☃.b(b.b());
/*  70 */             if (g(byw3)) {
/*  71 */               f1 = byw3.f();
/*  72 */               if (f1 > 0.0F) {
/*  73 */                 f2 = byw1.f() - f1 - 0.8888889F;
/*     */               }
/*     */             } 
/*     */           } 
/*  77 */         } else if (f1 > 0.0F) {
/*  78 */           f2 = byw1.f() - f1;
/*     */         } 
/*     */         
/*  81 */         if (f2 != 0.0F) {
/*  82 */           d1 += (eq.g() * f2);
/*  83 */           d2 += (eq.i() * f2);
/*     */         } 
/*     */       } 
/*     */       
/*  87 */       cee cee = new cee(d1, 0.0D, d2);
/*  88 */       if (((Boolean)byw1.c(a)).booleanValue()) {
/*  89 */         for (eq eq : eq.c.a) {
/*  90 */           b.j(el1).d(eq);
/*  91 */           if (a(☃, b, eq) || a(☃, b.a(), eq)) {
/*  92 */             cee = cee.a().b(0.0D, -6.0D, 0.0D);
/*     */             
/*     */             break;
/*     */           } 
/*     */         } 
/*     */       }
/*  98 */       return cee.a();
/*     */     } 
/*     */   }
/*     */   
/*     */   private boolean g(byw ☃) {
/* 103 */     return (☃.e() || ☃.c().a(this));
/*     */   }
/*     */   
/*     */   protected boolean a(axk ☃, el el1, eq eq1) {
/* 107 */     blc blc = ☃.a_(el1);
/* 108 */     bcs bcs = blc.c();
/* 109 */     byw byw = ☃.b(el1);
/* 110 */     if (byw.c().a(this)) {
/* 111 */       return false;
/*     */     }
/* 113 */     if (eq1 == eq.b) {
/* 114 */       return true;
/*     */     }
/* 116 */     if (blc.d() == bza.B) {
/* 117 */       return false;
/*     */     }
/*     */     
/* 120 */     boolean bool = (bcs.b(bcs) || bcs instanceof bhx);
/* 121 */     return (!bool && blc.c(☃, el1, eq1) == blb.a);
/*     */   }
/*     */   
/*     */   protected void a(axz ☃, el el1, byw byw1) {
/* 125 */     if (byw1.e()) {
/*     */       return;
/*     */     }
/*     */     
/* 129 */     blc blc1 = ☃.a_(el1);
/* 130 */     el el2 = el1.b();
/* 131 */     blc blc2 = ☃.a_(el2);
/*     */     
/* 133 */     byw byw2 = a(☃, el2, blc2);
/* 134 */     if (a(☃, el1, blc1, eq.a, el2, blc2, ☃.b(el2), byw2.c())) {
/* 135 */       a(☃, el2, blc2, eq.a, byw2);
/*     */       
/* 137 */       if (a(☃, el1) >= 3) {
/* 138 */         a(☃, el1, byw1, blc1);
/*     */       }
/* 140 */     } else if (byw1.d() || !a(☃, byw2.c(), el1, blc1, el2, blc2)) {
/* 141 */       a(☃, el1, byw1, blc1);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(axz ☃, el el1, byw byw1, blc blc1) {
/* 146 */     int i = byw1.g() - c(☃);
/* 147 */     if (((Boolean)byw1.c(a)).booleanValue()) {
/* 148 */       i = 7;
/*     */     }
/* 150 */     if (i <= 0) {
/*     */       return;
/*     */     }
/*     */     
/* 154 */     Map<eq, byw> map = b(☃, el1, blc1);
/* 155 */     for (Map.Entry<eq, byw> entry : map.entrySet()) {
/* 156 */       eq eq = entry.getKey();
/* 157 */       byw byw2 = entry.getValue();
/* 158 */       el el2 = el1.a(eq);
/* 159 */       blc blc2 = ☃.a_(el2);
/* 160 */       if (a(☃, el1, blc1, eq, el2, blc2, ☃.b(el2), byw2.c())) {
/* 161 */         a(☃, el2, blc2, eq, byw2);
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   protected byw a(ayc ☃, el el1, blc blc1) {
/* 167 */     int i = 0;
/* 168 */     int j = 0;
/*     */     
/* 170 */     for (eq eq : eq.c.a) {
/* 171 */       el el3 = el1.a(eq);
/* 172 */       blc blc3 = ☃.a_(el3);
/* 173 */       byw byw1 = blc3.s();
/*     */       
/* 175 */       if (byw1.c().a(this) && 
/* 176 */         a(eq, ☃, el1, blc1, el3, blc3)) {
/* 177 */         if (byw1.d()) {
/* 178 */           j++;
/*     */         }
/* 180 */         i = Math.max(i, byw1.g());
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 186 */     if (g() && j >= 2) {
/* 187 */       blc blc3 = ☃.a_(el1.b());
/* 188 */       byw byw1 = blc3.s();
/* 189 */       if (blc3.d().b() || h(byw1)) {
/* 190 */         return a(false);
/*     */       }
/*     */     } 
/*     */     
/* 194 */     el el2 = el1.a();
/* 195 */     blc blc2 = ☃.a_(el2);
/* 196 */     byw byw = blc2.s();
/*     */     
/* 198 */     if (!byw.e() && byw.c().a(this) && a(eq.b, ☃, el1, blc1, el2, blc2)) {
/* 199 */       return a(8, true);
/*     */     }
/*     */     
/* 202 */     int k = i - c(☃);
/* 203 */     if (k <= 0) {
/* 204 */       return byy.a.i();
/*     */     }
/* 206 */     return a(k, false);
/*     */   }
/*     */   private boolean a(eq ☃, axk axk1, el el1, blc blc1, el el2, blc blc2) {
/*     */     Object2ByteLinkedOpenHashMap<bcs.a> object2ByteLinkedOpenHashMap;
/*     */     bcs.a a;
/* 211 */     if (blc1.c().s() || blc2.c().s()) {
/* 212 */       object2ByteLinkedOpenHashMap = null;
/*     */     } else {
/* 214 */       object2ByteLinkedOpenHashMap = e.get();
/*     */     } 
/*     */ 
/*     */     
/* 218 */     if (object2ByteLinkedOpenHashMap != null) {
/* 219 */       a = new bcs.a(blc1, blc2, ☃);
/* 220 */       byte b = object2ByteLinkedOpenHashMap.getAndMoveToFirst(a);
/* 221 */       if (b != Byte.MAX_VALUE) {
/* 222 */         return (b != 0);
/*     */       }
/*     */     } else {
/* 225 */       a = null;
/*     */     } 
/*     */     
/* 228 */     cew cew1 = blc1.h(axk1, el1);
/* 229 */     cew cew2 = blc2.h(axk1, el2);
/* 230 */     boolean bool = !cet.b(cew1, cew2, ☃);
/*     */     
/* 232 */     if (object2ByteLinkedOpenHashMap != null) {
/* 233 */       if (object2ByteLinkedOpenHashMap.size() == 200) {
/* 234 */         object2ByteLinkedOpenHashMap.removeLastByte();
/*     */       }
/* 236 */       object2ByteLinkedOpenHashMap.putAndMoveToFirst(a, (byte)(bool ? 1 : 0));
/*     */     } 
/* 238 */     return bool;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public byw a(int ☃, boolean bool) {
/* 244 */     return e().i().a(b, Integer.valueOf(☃)).a(a, Boolean.valueOf(bool));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public byw a(boolean ☃) {
/* 250 */     return f().i().a(a, Boolean.valueOf(☃));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(axz ☃, el el1, blc blc1, eq eq1, byw byw1) {
/* 256 */     if (blc1.c() instanceof bfv) {
/* 257 */       ((bfv)blc1.c()).a(☃, el1, blc1, byw1);
/*     */     } else {
/* 259 */       if (!blc1.f()) {
/* 260 */         a(☃, el1, blc1);
/*     */       }
/* 262 */       ☃.a(el1, byw1.i(), 3);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private static short a(el ☃, el el1) {
/* 269 */     int i = el1.o() - ☃.o();
/* 270 */     int j = el1.q() - ☃.q();
/* 271 */     return (short)((i + 128 & 0xFF) << 8 | j + 128 & 0xFF);
/*     */   }
/*     */   
/*     */   protected int a(ayc ☃, el el1, int i, eq eq1, blc blc1, el el2, Short2ObjectMap<Pair<blc, byw>> short2ObjectMap, Short2BooleanMap short2BooleanMap) {
/* 275 */     int j = 1000;
/*     */     
/* 277 */     for (eq eq2 : eq.c.a) {
/* 278 */       if (eq2 == eq1) {
/*     */         continue;
/*     */       }
/*     */       
/* 282 */       el el3 = el1.a(eq2);
/*     */       
/* 284 */       short s = a(el2, el3);
/*     */       
/* 286 */       Pair<blc, byw> pair = (Pair<blc, byw>)short2ObjectMap.computeIfAbsent(s, i -> {
/*     */             blc blc = ☃.a_(el1);
/*     */             
/*     */             return Pair.of(blc, blc.s());
/*     */           });
/* 291 */       blc blc2 = (blc)pair.getFirst();
/* 292 */       byw byw = (byw)pair.getSecond();
/*     */ 
/*     */       
/* 295 */       if (a(☃, e(), el1, blc1, eq2, el3, blc2, byw)) {
/* 296 */         boolean bool = short2BooleanMap.computeIfAbsent(s, i -> {
/*     */               el el1 = ☃.b();
/*     */               blc blc2 = ayc1.a_(el1);
/*     */               return a(ayc1, e(), ☃, blc1, el1, blc2);
/*     */             });
/* 301 */         if (bool) {
/* 302 */           return i;
/*     */         }
/* 304 */         if (i < b(☃)) {
/* 305 */           int k = a(☃, el3, i + 1, eq2.d(), blc2, el2, short2ObjectMap, short2BooleanMap);
/* 306 */           if (k < j) {
/* 307 */             j = k;
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 313 */     return j;
/*     */   }
/*     */   
/*     */   private boolean a(axk ☃, byv byv1, el el1, blc blc1, el el2, blc blc2) {
/* 317 */     if (!a(eq.a, ☃, el1, blc1, el2, blc2)) {
/* 318 */       return false;
/*     */     }
/*     */     
/* 321 */     if (blc2.s().c().a(this)) {
/* 322 */       return true;
/*     */     }
/*     */     
/* 325 */     return a(☃, el2, blc2, byv1);
/*     */   }
/*     */   
/*     */   private boolean a(axk ☃, byv byv1, el el1, blc blc1, eq eq1, el el2, blc blc2, byw byw1) {
/* 329 */     return (!h(byw1) && 
/* 330 */       a(eq1, ☃, el1, blc1, el2, blc2) && 
/* 331 */       a(☃, el2, blc2, byv1));
/*     */   }
/*     */   
/*     */   private boolean h(byw ☃) {
/* 335 */     return (☃.c().a(this) && ☃.d());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private int a(ayc ☃, el el1) {
/* 341 */     int i = 0;
/* 342 */     for (eq eq : eq.c.a) {
/* 343 */       el el2 = el1.a(eq);
/* 344 */       byw byw = ☃.b(el2);
/*     */       
/* 346 */       if (h(byw)) {
/* 347 */         i++;
/*     */       }
/*     */     } 
/*     */     
/* 351 */     return i;
/*     */   }
/*     */   
/*     */   protected Map<eq, byw> b(ayc ☃, el el1, blc blc1) {
/* 355 */     int i = 1000;
/* 356 */     Map<eq, byw> map = Maps.newEnumMap(eq.class);
/*     */     
/* 358 */     Short2ObjectOpenHashMap short2ObjectOpenHashMap = new Short2ObjectOpenHashMap();
/* 359 */     Short2BooleanOpenHashMap short2BooleanOpenHashMap = new Short2BooleanOpenHashMap();
/*     */     
/* 361 */     for (eq eq : eq.c.a) {
/* 362 */       el el2 = el1.a(eq);
/*     */       
/* 364 */       short s = a(el1, el2);
/*     */       
/* 366 */       Pair<blc, byw> pair = (Pair<blc, byw>)short2ObjectOpenHashMap.computeIfAbsent(s, i -> {
/*     */             blc blc = ☃.a_(el1);
/*     */             
/*     */             return Pair.of(blc, blc.s());
/*     */           });
/* 371 */       blc blc2 = (blc)pair.getFirst();
/* 372 */       byw byw1 = (byw)pair.getSecond();
/*     */       
/* 374 */       byw byw2 = a(☃, el2, blc2);
/*     */       
/* 376 */       if (a(☃, byw2.c(), el1, blc1, eq, el2, blc2, byw1)) {
/*     */         int j;
/* 378 */         el el3 = el2.b();
/*     */         
/* 380 */         boolean bool = short2BooleanOpenHashMap.computeIfAbsent(s, i -> {
/*     */               blc blc2 = ☃.a_(el1);
/*     */               
/*     */               return a(☃, e(), el2, blc1, el1, blc2);
/*     */             });
/*     */         
/* 386 */         if (bool) {
/* 387 */           j = 0;
/*     */         } else {
/* 389 */           j = a(☃, el2, 1, eq.d(), blc2, el1, (Short2ObjectMap<Pair<blc, byw>>)short2ObjectOpenHashMap, (Short2BooleanMap)short2BooleanOpenHashMap);
/*     */         } 
/*     */         
/* 392 */         if (j < i) {
/* 393 */           map.clear();
/*     */         }
/*     */         
/* 396 */         if (j <= i) {
/* 397 */           map.put(eq, byw2);
/* 398 */           i = j;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 403 */     return map;
/*     */   }
/*     */   
/*     */   private boolean a(axk ☃, el el1, blc blc1, byv byv1) {
/* 407 */     bcs bcs = blc1.c();
/*     */     
/* 409 */     if (bcs instanceof bfv) {
/* 410 */       return ((bfv)bcs).a(☃, el1, blc1, byv1);
/*     */     }
/*     */     
/* 413 */     if (bcs instanceof bed || bcs == bct.cs || bcs == bct.cz || bcs == bct.cV || bcs == bct.B)
/*     */     {
/*     */ 
/*     */ 
/*     */       
/* 418 */       return false;
/*     */     }
/* 420 */     bza bza = blc1.d();
/* 421 */     if (bza == bza.c || bza == bza.b || bza == bza.f || bza == bza.h) {
/* 422 */       return false;
/*     */     }
/*     */     
/* 425 */     return !bza.c();
/*     */   }
/*     */   
/*     */   protected boolean a(axk ☃, el el1, blc blc1, eq eq1, el el2, blc blc2, byw byw1, byv byv1) {
/* 429 */     return (byw1.a(byv1, eq1) && 
/* 430 */       a(eq1, ☃, el1, blc1, el2, blc2) && 
/* 431 */       a(☃, el2, blc2, byv1));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected int a(axy ☃, byw byw1, byw byw2) {
/* 437 */     return a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(axy ☃, el el1, byw byw1) {
/* 442 */     if (!byw1.d()) {
/* 443 */       byw byw2 = a(☃, el1, ☃.a_(el1));
/* 444 */       int i = a(☃, byw1, byw2);
/*     */       
/* 446 */       if (byw2.e()) {
/* 447 */         byw1 = byw2;
/* 448 */         ☃.a(el1, bct.a.p(), 3);
/* 449 */       } else if (!byw2.equals(byw1)) {
/* 450 */         byw1 = byw2;
/* 451 */         blc blc = byw1.i();
/* 452 */         ☃.a(el1, blc, 2);
/* 453 */         ☃.I().a(el1, byw1.c(), i);
/* 454 */         ☃.b(el1, blc.c());
/*     */       } 
/*     */     } 
/*     */     
/* 458 */     a(☃, el1, byw1);
/*     */   }
/*     */   
/*     */   protected static int e(byw ☃) {
/* 462 */     if (☃.d()) {
/* 463 */       return 0;
/*     */     }
/* 465 */     return 8 - Math.min(☃.g(), 8) + (((Boolean)☃.c(a)).booleanValue() ? 8 : 0);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public float a(byw ☃) {
/* 471 */     return ☃.g() / 9.0F;
/*     */   }
/*     */   
/*     */   public abstract byv e();
/*     */   
/*     */   public abstract byv f();
/*     */   
/*     */   protected abstract boolean g();
/*     */   
/*     */   protected abstract void a(axz paramaxz, el paramel, blc paramblc);
/*     */   
/*     */   protected abstract int b(ayc paramayc);
/*     */   
/*     */   protected abstract int c(ayc paramayc);
/*     */ }


/* Location:              F:\dw\server.jar!\byu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */