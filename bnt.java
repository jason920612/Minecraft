/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Sets;
/*     */ import it.unimi.dsi.fastutil.objects.ObjectIterator;
/*     */ import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
/*     */ import it.unimi.dsi.fastutil.objects.ObjectSet;
/*     */ import java.util.EnumSet;
/*     */ import java.util.IdentityHashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bnt
/*     */ {
/*  35 */   private static final Logger b = LogManager.getLogger();
/*  36 */   public static final bnt a = new bnt();
/*     */   
/*  38 */   private static final er[] c = er.values();
/*     */   
/*  40 */   private final EnumSet<er> d = EnumSet.noneOf(er.class);
/*  41 */   private final int[][] e = new int[16][];
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public bnt(gy ☃) {
/*  47 */     this();
/*     */     
/*  49 */     if (☃.c("Indices", 10)) {
/*  50 */       gy gy1 = ☃.p("Indices");
/*  51 */       for (int j = 0; j < this.e.length; j++) {
/*  52 */         String str = String.valueOf(j);
/*  53 */         if (gy1.c(str, 11)) {
/*  54 */           this.e[j] = gy1.n(str);
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/*  59 */     int i = ☃.h("Sides");
/*  60 */     for (er er1 : er.values()) {
/*  61 */       if ((i & 1 << er1.ordinal()) != 0) {
/*  62 */         this.d.add(er1);
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(bnj ☃) {
/*  68 */     b(☃);
/*  69 */     for (er er1 : c) {
/*  70 */       a(☃, er1);
/*     */     }
/*     */     
/*  73 */     axy axy = ☃.z();
/*  74 */     g.forEach(a1 -> a1.a(☃));
/*     */   }
/*     */   
/*     */   private static void a(bnj ☃, er er1) {
/*  78 */     axy axy = ☃.z();
/*     */     
/*  80 */     if (!(☃.F()).d.remove(er1)) {
/*     */       return;
/*     */     }
/*     */     
/*  84 */     Set<eq> set = er1.a();
/*     */     
/*  86 */     int i = 0;
/*  87 */     int j = 15;
/*     */     
/*  89 */     boolean bool1 = set.contains(eq.f);
/*  90 */     boolean bool2 = set.contains(eq.e);
/*  91 */     boolean bool3 = set.contains(eq.d);
/*  92 */     boolean bool4 = set.contains(eq.c);
/*  93 */     boolean bool5 = (set.size() == 1);
/*     */     
/*  95 */     int k = (☃.b << 4) + ((bool5 && (bool4 || bool3)) ? 1 : (bool2 ? 0 : 15));
/*  96 */     int m = (☃.b << 4) + ((bool5 && (bool4 || bool3)) ? 14 : (bool2 ? 0 : 15));
/*  97 */     int n = (☃.c << 4) + ((bool5 && (bool1 || bool2)) ? 1 : (bool4 ? 0 : 15));
/*  98 */     int i1 = (☃.c << 4) + ((bool5 && (bool1 || bool2)) ? 14 : (bool4 ? 0 : 15));
/*     */     
/* 100 */     eq[] arrayOfEq = eq.values();
/* 101 */     el.a a = new el.a();
/* 102 */     for (el.a a1 : el.b(k, 0, n, m, axy.aa() - 1, i1)) {
/* 103 */       blc blc1 = axy.a_(a1);
/* 104 */       blc blc2 = blc1;
/*     */       
/* 106 */       for (eq eq : arrayOfEq) {
/* 107 */         a.g(a1).c(eq);
/* 108 */         blc2 = a(blc2, eq, axy, a1, a);
/*     */       } 
/*     */       
/* 111 */       bcs.a(blc1, blc2, axy, a1, 18);
/*     */     } 
/*     */   }
/*     */   
/*     */   private static blc a(blc ☃, eq eq1, axz axz1, el.a a1, el.a a2) {
/* 116 */     return ((a)f.getOrDefault(☃.c(), b.b)).a(☃, eq1, axz1.a_(a2), axz1, a1, a2);
/*     */   }
/*     */ 
/*     */   
/*     */   private void b(bnj ☃) {
/* 121 */     try(el.b ☃ = el.b.r(); 
/* 122 */         el.b ☃ = el.b.r()) {
/*     */       
/* 124 */       axz axz = ☃.z(); int i;
/* 125 */       for (i = 0; i < 16; i++) {
/* 126 */         bnk bnk = ☃.c()[i];
/* 127 */         int[] arrayOfInt = this.e[i];
/* 128 */         this.e[i] = null;
/*     */         
/* 130 */         if (bnk != null && arrayOfInt != null && arrayOfInt.length > 0) {
/*     */ 
/*     */ 
/*     */           
/* 134 */           eq[] arrayOfEq = eq.values();
/* 135 */           bnq<blc> bnq = bnk.g();
/*     */           
/* 137 */           for (int j : arrayOfInt) {
/* 138 */             int k = j & 0xF;
/* 139 */             int m = j >> 8 & 0xF;
/* 140 */             int n = j >> 4 & 0xF;
/*     */             
/* 142 */             b.f(k + (☃.b << 4), m + (i << 4), n + (☃.c << 4));
/*     */             
/* 144 */             blc blc1 = bnq.a(j);
/* 145 */             blc blc2 = blc1;
/*     */             
/* 147 */             for (eq eq : arrayOfEq) {
/* 148 */               b1.j(b).d(eq);
/* 149 */               if (b.o() >> 4 == ☃.b && b.q() >> 4 == ☃.c)
/*     */               {
/*     */                 
/* 152 */                 blc2 = a(blc2, eq, axz, b, b1); } 
/*     */             } 
/* 154 */             bcs.a(blc1, blc2, axz, b, 18);
/*     */           } 
/*     */         } 
/* 157 */       }  for (i = 0; i < this.e.length; i++) {
/* 158 */         if (this.e[i] != null) {
/* 159 */           b.warn("Discarding update data for section {} for chunk ({} {})", Integer.valueOf(i), Integer.valueOf(☃.b), Integer.valueOf(☃.c));
/*     */         }
/* 161 */         this.e[i] = null;
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/* 166 */   private static final Map<bcs, a> f = new IdentityHashMap<>();
/* 167 */   private static final Set<a> g = Sets.newHashSet();
/*     */   
/*     */   public boolean a() {
/* 170 */     for (int[] ☃ : this.e) {
/* 171 */       if (☃ != null) {
/* 172 */         return false;
/*     */       }
/*     */     } 
/* 175 */     return this.d.isEmpty();
/*     */   }
/*     */   
/*     */   public static interface a {
/*     */     blc a(blc param1blc1, eq param1eq, blc param1blc2, axz param1axz, el param1el1, el param1el2);
/*     */     
/*     */     default void a(axz ☃) {}
/*     */   }
/*     */   
/*     */   enum b
/*     */     implements a {
/* 186 */     a((String)new bcs[] { bct.ip, bct.dh, bct.jn, bct.jo, bct.jp, bct.jq, bct.jr, bct.js, bct.jt, bct.ju, bct.jv, bct.jw, bct.jx, bct.jy, bct.jz, bct.jA, bct.jB, bct.jC, bct.fn, bct.fo, bct.fp, bct.eh, bct.F, bct.D, bct.E, bct.cs, bct.cC })
/*     */     {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       public blc a(blc ☃, eq eq1, blc blc1, axz axz1, el el1, el el2)
/*     */       {
/* 219 */         return ☃;
/*     */       }
/*     */     },
/* 222 */     b((String)new bcs[0])
/*     */     {
/*     */       public blc a(blc ☃, eq eq1, blc blc1, axz axz1, el el1, el el2) {
/* 225 */         return ☃.a(eq1, axz1.a_(el2), axz1, el1, el2);
/*     */       }
/*     */     },
/* 228 */     c((String)new bcs[] { bct.ck, bct.fq })
/*     */     {
/*     */       public blc a(blc ☃, eq eq1, blc blc1, axz axz1, el el1, el el2) {
/* 231 */         if (blc1.c() == ☃.c() && eq1.k().c() && 
/* 232 */           ☃.c(bdh.b) == bmc.a && blc1.c(bdh.b) == bmc.a) {
/* 233 */           eq eq2 = (eq)☃.c(bdh.a);
/* 234 */           if (eq1.k() != eq2.k() && eq2 == blc1.c(bdh.a)) {
/* 235 */             bmc bmc = (eq1 == eq2.e()) ? bmc.b : bmc.c;
/* 236 */             axz1.a(el2, blc1.a(bdh.b, bmc.a()), 18);
/*     */ 
/*     */             
/* 239 */             if (eq2 == eq.c || eq2 == eq.f) {
/* 240 */               bji bji1 = axz1.f(el1);
/* 241 */               bji bji2 = axz1.f(el2);
/* 242 */               if (bji1 instanceof bjl && bji2 instanceof bjl) {
/* 243 */                 bjl.a((bjl)bji1, (bjl)bji2);
/*     */               }
/*     */             } 
/*     */             
/* 247 */             return ☃.a(bdh.b, bmc);
/*     */           } 
/*     */         } 
/*     */         
/* 251 */         return ☃;
/*     */       }
/*     */     },
/* 254 */     d(true, new bcs[] { bct.al, bct.aj, bct.am, bct.ak, bct.ah, bct.ai }) {
/* 255 */       private final ThreadLocal<List<ObjectSet<el>>> g = ThreadLocal.withInitial(() -> Lists.newArrayListWithCapacity(7));
/*     */ 
/*     */       
/*     */       public blc a(blc ☃, eq eq1, blc blc1, axz axz1, el el1, el el2) {
/* 259 */         blc blc2 = ☃.a(eq1, axz1.a_(el2), axz1, el1, el2);
/* 260 */         if (☃ != blc2) {
/* 261 */           int i = ((Integer)blc2.c(bma.ab)).intValue();
/* 262 */           List<ObjectSet<el>> list = this.g.get();
/* 263 */           if (list.isEmpty()) {
/* 264 */             for (int j = 0; j < 7; j++) {
/* 265 */               list.add(new ObjectOpenHashSet());
/*     */             }
/*     */           }
/* 268 */           ((ObjectSet)list.get(i)).add(el1.h());
/*     */         } 
/* 270 */         return ☃;
/*     */       }
/*     */ 
/*     */       
/*     */       public void a(axz ☃) {
/* 275 */         el.a a = new el.a();
/*     */         
/* 277 */         List<ObjectSet<el>> list = this.g.get();
/* 278 */         for (int i = 2; i < list.size(); i++) {
/* 279 */           int j = i - 1;
/* 280 */           ObjectSet<el> objectSet1 = list.get(j);
/* 281 */           ObjectSet<el> objectSet2 = list.get(i);
/*     */           
/* 283 */           for (ObjectIterator<el> objectIterator = objectSet1.iterator(); objectIterator.hasNext(); ) { el el = objectIterator.next();
/* 284 */             blc blc = ☃.a_(el);
/* 285 */             if (((Integer)blc.c(bma.ab)).intValue() < j) {
/*     */               continue;
/*     */             }
/*     */             
/* 289 */             ☃.a(el, blc.a(bma.ab, Integer.valueOf(j)), 18);
/*     */             
/* 291 */             if (i != 7) {
/* 292 */               for (eq eq : f) {
/* 293 */                 a.g(el).c(eq);
/* 294 */                 blc blc1 = ☃.a_(a);
/*     */                 
/* 296 */                 if (blc1.b(bma.ab) && ((Integer)blc.c(bma.ab)).intValue() > i) {
/* 297 */                   objectSet2.add(a.h());
/*     */                 }
/*     */               } 
/*     */             } }
/*     */         
/*     */         } 
/*     */         
/* 304 */         list.clear();
/*     */       }
/*     */     },
/* 307 */     e((String)new bcs[] { bct.dL, bct.dK })
/*     */     {
/*     */       public blc a(blc ☃, eq eq1, blc blc1, axz axz1, el el1, el el2) {
/* 310 */         if (((Integer)☃.c(bhz.a)).intValue() == 7) {
/* 311 */           bia bia = ((bhz)☃.c()).e();
/* 312 */           if (blc1.c() == bia) {
/* 313 */             return bia.e().p().a(bfi.D, eq1);
/*     */           }
/*     */         } 
/* 316 */         return ☃;
/*     */       }
/*     */     };
/*     */ 
/*     */     
/* 321 */     public static final eq[] f = eq.values();
/*     */     
/*     */     static {
/*     */     
/*     */     }
/*     */     
/*     */     b(boolean ☃, bcs... arrayOfBcs) {
/* 328 */       for (bcs bcs1 : arrayOfBcs) {
/* 329 */         bnt.c().put(bcs1, this);
/*     */       }
/* 331 */       if (☃) {
/* 332 */         bnt.d().add(this);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public gy b() {
/* 338 */     gy ☃ = new gy();
/*     */     
/* 340 */     gy gy1 = new gy(); int i;
/* 341 */     for (i = 0; i < this.e.length; i++) {
/* 342 */       String str = String.valueOf(i);
/* 343 */       if (this.e[i] != null && (this.e[i]).length != 0) {
/* 344 */         gy1.a(str, this.e[i]);
/*     */       }
/*     */     } 
/* 347 */     if (!gy1.isEmpty()) {
/* 348 */       ☃.a("Indices", gy1);
/*     */     }
/*     */     
/* 351 */     i = 0;
/* 352 */     for (er er1 : this.d) {
/* 353 */       i |= 1 << er1.ordinal();
/*     */     }
/* 355 */     ☃.a("Sides", (byte)i);
/* 356 */     return ☃;
/*     */   }
/*     */   
/*     */   private bnt() {}
/*     */ }


/* Location:              F:\dw\server.jar!\bnt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */