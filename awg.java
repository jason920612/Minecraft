/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import java.util.Collection;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Random;
/*     */ import org.apache.commons.lang3.mutable.MutableFloat;
/*     */ import org.apache.commons.lang3.mutable.MutableInt;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class awg
/*     */ {
/*     */   public static int a(awe ☃, ate ate1) {
/*  32 */     if (ate1.a()) {
/*  33 */       return 0;
/*     */     }
/*     */     
/*  36 */     pc pc = fc.q.b(☃);
/*     */     
/*  38 */     he he = ate1.p();
/*  39 */     for (int i = 0; i < he.size(); i++) {
/*  40 */       gy gy = he.e(i);
/*     */       
/*  42 */       pc pc1 = pc.a(gy.l("id"));
/*  43 */       if (pc1 != null && pc1.equals(pc)) {
/*  44 */         return gy.h("lvl");
/*     */       }
/*     */     } 
/*  47 */     return 0;
/*     */   }
/*     */   
/*     */   public static Map<awe, Integer> a(ate ☃) {
/*  51 */     Map<awe, Integer> map = Maps.newLinkedHashMap();
/*  52 */     he he = (☃.b() == atf.dT) ? asi.e(☃) : ☃.p();
/*     */     
/*  54 */     for (int i = 0; i < he.size(); i++) {
/*  55 */       gy gy = he.e(i);
/*     */       
/*  57 */       awe awe = fc.q.b(pc.a(gy.l("id")));
/*  58 */       if (awe != null) {
/*  59 */         map.put(awe, Integer.valueOf(gy.h("lvl")));
/*     */       }
/*     */     } 
/*     */     
/*  63 */     return map;
/*     */   }
/*     */   
/*     */   public static void a(Map<awe, Integer> ☃, ate ate1) {
/*  67 */     he he = new he();
/*     */     
/*  69 */     for (Map.Entry<awe, Integer> entry : ☃.entrySet()) {
/*  70 */       awe awe = entry.getKey();
/*  71 */       if (awe == null) {
/*     */         continue;
/*     */       }
/*  74 */       int i = ((Integer)entry.getValue()).intValue();
/*     */       
/*  76 */       gy gy = new gy();
/*  77 */       gy.a("id", String.valueOf(fc.q.b(awe)));
/*  78 */       gy.a("lvl", (short)i);
/*     */       
/*  80 */       he.a(gy);
/*     */       
/*  82 */       if (ate1.b() == atf.dT) {
/*  83 */         asi.a(ate1, new awh(awe, i));
/*     */       }
/*     */     } 
/*     */     
/*  87 */     if (he.isEmpty()) {
/*  88 */       ate1.c("Enchantments");
/*  89 */     } else if (ate1.b() != atf.dT) {
/*  90 */       ate1.a("Enchantments", he);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static void a(a ☃, ate ate1) {
/* 100 */     if (ate1.a()) {
/*     */       return;
/*     */     }
/*     */     
/* 104 */     he he = ate1.p();
/* 105 */     for (int i = 0; i < he.size(); i++) {
/* 106 */       String str = he.e(i).l("id");
/* 107 */       int j = he.e(i).h("lvl");
/*     */       
/* 109 */       awe awe = fc.q.b(pc.a(str));
/* 110 */       if (awe != null) {
/* 111 */         ☃.accept(awe, j);
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   private static void a(a ☃, Iterable<ate> iterable) {
/* 117 */     for (ate ate : iterable) {
/* 118 */       a(☃, ate);
/*     */     }
/*     */   }
/*     */   
/*     */   public static int a(Iterable<ate> ☃, aea aea1) {
/* 123 */     MutableInt mutableInt = new MutableInt();
/* 124 */     a((awe1, i) -> ☃.add(awe1.a(i, aea1)), ☃);
/* 125 */     return mutableInt.intValue();
/*     */   }
/*     */   
/*     */   public static float a(ate ☃, afd afd1) {
/* 129 */     MutableFloat mutableFloat = new MutableFloat();
/* 130 */     a((awe1, i) -> ☃.add(awe1.a(i, afd1)), ☃);
/* 131 */     return mutableFloat.floatValue();
/*     */   }
/*     */   
/*     */   public static float a(afa ☃) {
/* 135 */     int i = a(awi.r, ☃);
/* 136 */     if (i > 0) {
/* 137 */       return awr.e(i);
/*     */     }
/* 139 */     return 0.0F;
/*     */   }
/*     */   
/*     */   public static void a(afa ☃, aer aer1) {
/* 143 */     a a = (awe1, i) -> awe1.b(☃, aer1, i);
/* 144 */     if (☃ != null) {
/* 145 */       a(a, ☃.aU());
/*     */     }
/* 147 */     if (aer1 instanceof aog) {
/* 148 */       a(a, ☃.cB());
/*     */     }
/*     */   }
/*     */   
/*     */   public static void b(afa ☃, aer aer1) {
/* 153 */     a a = (awe1, i) -> awe1.a(☃, aer1, i);
/* 154 */     if (☃ != null) {
/* 155 */       a(a, ☃.aU());
/*     */     }
/* 157 */     if (☃ instanceof aog) {
/* 158 */       a(a, ☃.cB());
/*     */     }
/*     */   }
/*     */   
/*     */   public static int a(awe ☃, afa afa1) {
/* 163 */     Iterable<ate> iterable = ☃.a(afa1);
/* 164 */     if (iterable == null) {
/* 165 */       return 0;
/*     */     }
/* 167 */     int i = 0;
/* 168 */     for (ate ate : iterable) {
/* 169 */       int j = a(☃, ate);
/* 170 */       if (j > i) {
/* 171 */         i = j;
/*     */       }
/*     */     } 
/* 174 */     return i;
/*     */   }
/*     */   
/*     */   public static int b(afa ☃) {
/* 178 */     return a(awi.o, ☃);
/*     */   }
/*     */   
/*     */   public static int c(afa ☃) {
/* 182 */     return a(awi.p, ☃);
/*     */   }
/*     */   
/*     */   public static int d(afa ☃) {
/* 186 */     return a(awi.f, ☃);
/*     */   }
/*     */   
/*     */   public static int e(afa ☃) {
/* 190 */     return a(awi.i, ☃);
/*     */   }
/*     */   
/*     */   public static int f(afa ☃) {
/* 194 */     return a(awi.s, ☃);
/*     */   }
/*     */   
/*     */   public static int b(ate ☃) {
/* 198 */     return a(awi.A, ☃);
/*     */   }
/*     */   
/*     */   public static int c(ate ☃) {
/* 202 */     return a(awi.B, ☃);
/*     */   }
/*     */   
/*     */   public static int g(afa ☃) {
/* 206 */     return a(awi.q, ☃);
/*     */   }
/*     */   
/*     */   public static boolean h(afa ☃) {
/* 210 */     return (a(awi.g, ☃) > 0);
/*     */   }
/*     */   
/*     */   public static boolean i(afa ☃) {
/* 214 */     return (a(awi.j, ☃) > 0);
/*     */   }
/*     */   
/*     */   public static boolean d(ate ☃) {
/* 218 */     return (a(awi.k, ☃) > 0);
/*     */   }
/*     */   
/*     */   public static boolean e(ate ☃) {
/* 222 */     return (a(awi.H, ☃) > 0);
/*     */   }
/*     */   
/*     */   public static int f(ate ☃) {
/* 226 */     return a(awi.C, ☃);
/*     */   }
/*     */   
/*     */   public static int g(ate ☃) {
/* 230 */     return a(awi.E, ☃);
/*     */   }
/*     */   
/*     */   public static boolean h(ate ☃) {
/* 234 */     return (a(awi.F, ☃) > 0);
/*     */   }
/*     */   
/*     */   public static ate b(awe ☃, afa afa1) {
/* 238 */     List<ate> list1 = ☃.a(afa1);
/* 239 */     if (list1.isEmpty()) {
/* 240 */       return ate.a;
/*     */     }
/* 242 */     List<ate> list2 = Lists.newArrayList();
/* 243 */     for (ate ate : list1) {
/* 244 */       if (!ate.a() && a(☃, ate) > 0) {
/* 245 */         list2.add(ate);
/*     */       }
/*     */     } 
/*     */     
/* 249 */     return list2.isEmpty() ? ate.a : list2.get(afa1.ce().nextInt(list2.size()));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static int a(Random ☃, int i, int j, ate ate1) {
/* 260 */     ata ata = ate1.b();
/* 261 */     int k = ata.c();
/*     */     
/* 263 */     if (k <= 0)
/*     */     {
/* 265 */       return 0;
/*     */     }
/*     */     
/* 268 */     if (j > 15) {
/* 269 */       j = 15;
/*     */     }
/* 271 */     int m = ☃.nextInt(8) + 1 + (j >> 1) + ☃.nextInt(j + 1);
/* 272 */     if (i == 0) {
/* 273 */       return Math.max(m / 3, 1);
/*     */     }
/* 275 */     if (i == 1) {
/* 276 */       return m * 2 / 3 + 1;
/*     */     }
/* 278 */     return Math.max(m, j * 2);
/*     */   }
/*     */   
/*     */   public static ate a(Random ☃, ate ate1, int i, boolean bool) {
/* 282 */     List<awh> list = b(☃, ate1, i, bool);
/*     */     
/* 284 */     boolean bool1 = (ate1.b() == atf.aS);
/* 285 */     if (bool1) {
/* 286 */       ate1 = new ate(atf.dT);
/*     */     }
/*     */     
/* 289 */     for (awh awh : list) {
/* 290 */       if (bool1) {
/* 291 */         asi.a(ate1, awh); continue;
/*     */       } 
/* 293 */       ate1.a(awh.b, awh.c);
/*     */     } 
/*     */ 
/*     */     
/* 297 */     return ate1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static List<awh> b(Random ☃, ate ate1, int i, boolean bool) {
/* 308 */     List<awh> list1 = Lists.newArrayList();
/*     */ 
/*     */     
/* 311 */     ata ata = ate1.b();
/* 312 */     int j = ata.c();
/*     */     
/* 314 */     if (j <= 0) {
/* 315 */       return list1;
/*     */     }
/*     */     
/* 318 */     i += 1 + ☃.nextInt(j / 4 + 1) + ☃.nextInt(j / 4 + 1);
/*     */ 
/*     */     
/* 321 */     float f = (☃.nextFloat() + ☃.nextFloat() - 1.0F) * 0.15F;
/* 322 */     i = xq.a(Math.round(i + i * f), 1, 2147483647);
/*     */     
/* 324 */     List<awh> list2 = a(i, ate1, bool);
/* 325 */     if (!list2.isEmpty()) {
/* 326 */       list1.add(xy.a(☃, list2));
/*     */       
/* 328 */       while (☃.nextInt(50) <= i) {
/* 329 */         a(list2, k.<awh>a(list1));
/*     */         
/* 331 */         if (list2.isEmpty()) {
/*     */           break;
/*     */         }
/*     */         
/* 335 */         list1.add(xy.a(☃, list2));
/* 336 */         i /= 2;
/*     */       } 
/*     */     } 
/* 339 */     return list1;
/*     */   }
/*     */   
/*     */   public static void a(List<awh> ☃, awh awh1) {
/* 343 */     Iterator<awh> iterator = ☃.iterator();
/* 344 */     while (iterator.hasNext()) {
/* 345 */       if (!awh1.b.b(((awh)iterator.next()).b)) {
/* 346 */         iterator.remove();
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public static boolean a(Collection<awe> ☃, awe awe1) {
/* 352 */     for (awe awe2 : ☃) {
/* 353 */       if (!awe2.b(awe1)) {
/* 354 */         return false;
/*     */       }
/*     */     } 
/* 357 */     return true;
/*     */   }
/*     */   
/*     */   public static List<awh> a(int ☃, ate ate1, boolean bool) {
/* 361 */     List<awh> list = Lists.newArrayList();
/*     */     
/* 363 */     ata ata = ate1.b();
/* 364 */     boolean bool1 = (ate1.b() == atf.aS);
/* 365 */     for (awe awe : fc.q) {
/* 366 */       if (awe.b() && !bool) {
/*     */         continue;
/*     */       }
/*     */       
/* 370 */       if (!awe.b.a(ata) && !bool1) {
/*     */         continue;
/*     */       }
/*     */       
/* 374 */       for (int i = awe.a(); i > awe.e() - 1; i--) {
/* 375 */         if (☃ >= awe.a(i) && ☃ <= awe.b(i)) {
/* 376 */           list.add(new awh(awe, i));
/*     */           
/*     */           break;
/*     */         } 
/*     */       } 
/*     */     } 
/* 382 */     return list;
/*     */   }
/*     */   
/*     */   @FunctionalInterface
/*     */   static interface a {
/*     */     void accept(awe param1awe, int param1Int);
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\awg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */