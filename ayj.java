/*     */ import com.google.common.collect.Sets;
/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ import java.util.Set;
/*     */ import javax.annotation.Nullable;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class ayj
/*     */ {
/*  36 */   private static final Logger a = LogManager.getLogger();
/*     */ 
/*     */ 
/*     */   
/*  40 */   private static final int b = (int)Math.pow(17.0D, 2.0D);
/*     */   
/*  42 */   private final Set<axm> c = Sets.newHashSet();
/*     */   
/*     */   public int a(td ☃, boolean bool1, boolean bool2, boolean bool3) {
/*  45 */     if (!bool1 && !bool2) {
/*  46 */       return 0;
/*     */     }
/*     */     
/*  49 */     this.c.clear();
/*  50 */     int i = 0;
/*     */     
/*  52 */     for (aog aog : ☃.j) {
/*  53 */       if (!aog.t()) {
/*  54 */         int k = xq.c(aog.q / 16.0D);
/*  55 */         int m = xq.c(aog.s / 16.0D);
/*  56 */         int n = 8;
/*     */         
/*  58 */         for (int i1 = -8; i1 <= 8; i1++) {
/*  59 */           for (int i2 = -8; i2 <= 8; i2++) {
/*  60 */             boolean bool = (i1 == -8 || i1 == 8 || i2 == -8 || i2 == 8);
/*  61 */             axm axm = new axm(i1 + k, i2 + m);
/*  62 */             if (!this.c.contains(axm)) {
/*  63 */               i++;
/*  64 */               if (!bool && ☃.d().a(axm)) {
/*  65 */                 tk tk = ☃.B().b(axm.a, axm.b);
/*  66 */                 if (tk != null && tk.e()) {
/*  67 */                   this.c.add(axm);
/*     */                 }
/*     */               } 
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/*  76 */     int j = 0;
/*  77 */     el el = ☃.n();
/*     */     
/*  79 */     for (afc afc : afc.values()) {
/*  80 */       if (!afc.c() || bool2)
/*     */       {
/*  82 */         if (afc.c() || bool1)
/*     */         {
/*  84 */           if (!afc.d() || bool3) {
/*     */ 
/*     */ 
/*     */             
/*  88 */             int k = afc.b() * i / b;
/*  89 */             int m = ☃.a(afc.a(), k);
/*  90 */             if (m <= k) {
/*     */ 
/*     */ 
/*     */               
/*  94 */               el.a a = new el.a();
/*     */ 
/*     */               
/*  97 */               label107: for (axm axm : this.c) {
/*  98 */                 el el1 = a(☃, axm.a, axm.b);
/*  99 */                 int n = el1.o();
/* 100 */                 int i1 = el1.p();
/* 101 */                 int i2 = el1.q();
/*     */                 
/* 103 */                 blc blc = ☃.a_(el1);
/* 104 */                 if (blc.l()) {
/*     */                   continue;
/*     */                 }
/*     */                 
/* 108 */                 int i3 = 0;
/*     */ 
/*     */                 
/* 111 */                 for (int i4 = 0; i4 < 3; i4++) {
/* 112 */                   int i5 = n;
/* 113 */                   int i6 = i1;
/* 114 */                   int i7 = i2;
/* 115 */                   int i8 = 6;
/*     */                   
/* 117 */                   ayu.e e = null;
/* 118 */                   afj afj = null;
/*     */                   
/* 120 */                   int i9 = xq.f(Math.random() * 4.0D);
/* 121 */                   int i10 = 0;
/*     */ 
/*     */                   
/* 124 */                   for (int i11 = 0; i11 < i9; i11++) {
/* 125 */                     i5 += ☃.s.nextInt(6) - ☃.s.nextInt(6);
/* 126 */                     i6 += ☃.s.nextInt(1) - ☃.s.nextInt(1);
/* 127 */                     i7 += ☃.s.nextInt(6) - ☃.s.nextInt(6);
/* 128 */                     a.c(i5, i6, i7);
/*     */                     
/* 130 */                     float f1 = i5 + 0.5F;
/* 131 */                     float f2 = i7 + 0.5F;
/*     */                     
/* 133 */                     aog aog = ☃.a(f1, f2, -1.0D);
/* 134 */                     if (aog != null) {
/*     */ 
/*     */ 
/*     */                       
/* 138 */                       double d = aog.d(f1, i6, f2);
/* 139 */                       if (d > 576.0D)
/*     */                       {
/* 141 */                         if (el.f(f1, i6, f2) >= 576.0D)
/*     */                         
/*     */                         { 
/*     */                           
/* 145 */                           if (e == null) {
/* 146 */                             e = ☃.a(afc, a);
/* 147 */                             if (e == null) {
/*     */                               break;
/*     */                             }
/*     */ 
/*     */                             
/* 152 */                             i9 = e.c + ☃.s.nextInt(1 + e.d - e.c);
/*     */                           } 
/*     */                           
/* 155 */                           if (☃.a(afc, e, a))
/*     */                           
/*     */                           { 
/*     */                             
/* 159 */                             afk.b b = afk.a(e.b);
/* 160 */                             if (b != null && a(b, ☃, a, e.b))
/*     */                             { afb afb;
/*     */                               try {
/* 163 */                                 afb = e.b.a(☃);
/* 164 */                               } catch (Exception exception) {
/* 165 */                                 a.warn("Failed to create mob", exception);
/* 166 */                                 return j;
/*     */                               } 
/*     */                               
/* 169 */                               afb.b(f1, i6, f2, ☃.s.nextFloat() * 360.0F, 0.0F);
/*     */                               
/* 171 */                               if ((d <= 16384.0D || !afb.H()) && afb.a(☃, false) && afb.a(☃)) {
/* 172 */                                 afj = afb.a(☃.h(new el(afb)), afj, (gy)null);
/*     */                                 
/* 174 */                                 if (afb.a(☃)) {
/* 175 */                                   i3++;
/* 176 */                                   i10++;
/* 177 */                                   ☃.a(afb);
/*     */                                 } else {
/* 179 */                                   afb.V();
/*     */                                 } 
/* 181 */                                 if (i3 >= afb.dg()) {
/*     */                                   continue label107;
/*     */                                 }
/* 184 */                                 if (afb.c(i10)) {
/*     */                                   break;
/*     */                                 }
/*     */                               } 
/* 188 */                               j += i3; }  }  }  } 
/*     */                     } 
/*     */                   } 
/*     */                 } 
/*     */               } 
/*     */             } 
/*     */           }  }  } 
/* 195 */     }  return j;
/*     */   }
/*     */   
/*     */   private static el a(axy ☃, int i, int j) {
/* 199 */     bnj bnj = ☃.c(i, j);
/* 200 */     int k = i * 16 + ☃.s.nextInt(16);
/* 201 */     int m = j * 16 + ☃.s.nextInt(16);
/* 202 */     int n = bnj.a(bor.a.c, k, m) + 1;
/* 203 */     int i1 = ☃.s.nextInt(n + 1);
/* 204 */     return new el(k, i1, m);
/*     */   }
/*     */ 
/*     */   
/*     */   public static boolean a(blc ☃, byw byw1) {
/* 209 */     if (☃.k()) {
/* 210 */       return false;
/*     */     }
/*     */     
/* 213 */     if (☃.m()) {
/* 214 */       return false;
/*     */     }
/*     */     
/* 217 */     if (!byw1.e()) {
/* 218 */       return false;
/*     */     }
/*     */ 
/*     */     
/* 222 */     if (☃.a(wv.z)) {
/* 223 */       return false;
/*     */     }
/* 225 */     return true;
/*     */   }
/*     */   
/*     */   public static boolean a(afk.b ☃, ayc ayc1, el el1, @Nullable aev<? extends afb> aev1) {
/* 229 */     if (aev1 == null || !ayc1.d().a(el1)) {
/* 230 */       return false;
/*     */     }
/* 232 */     blc blc1 = ayc1.a_(el1);
/* 233 */     byw byw = ayc1.b(el1);
/*     */     
/* 235 */     switch (null.a[☃.ordinal()]) {
/*     */       case 1:
/* 237 */         return (byw.a(ww.a) && ayc1.b(el1.b()).a(ww.a) && !ayc1.a_(el1.a()).l());
/*     */     } 
/*     */     
/* 240 */     blc blc2 = ayc1.a_(el1.b());
/*     */     
/* 242 */     if (!blc2.q() && (aev1 == null || !afk.a(aev1, blc2))) {
/* 243 */       return false;
/*     */     }
/*     */     
/* 246 */     bcs bcs = blc2.c();
/* 247 */     boolean bool = (bcs != bct.z && bcs != bct.fU);
/* 248 */     return (bool && a(blc1, byw) && a(ayc1.a_(el1.a()), ayc1.b(el1.a())));
/*     */   }
/*     */ 
/*     */   
/*     */   public static void a(axz ☃, ayu ayu1, int i, int j, Random random) {
/* 253 */     List<ayu.e> list = ayu1.a(afc.b);
/* 254 */     if (list.isEmpty()) {
/*     */       return;
/*     */     }
/*     */     
/* 258 */     int k = i << 4;
/* 259 */     int m = j << 4;
/*     */     
/* 261 */     while (random.nextFloat() < ayu1.e()) {
/* 262 */       ayu.e e = xy.<ayu.e>a(random, list);
/* 263 */       int n = e.c + random.nextInt(1 + e.d - e.c);
/* 264 */       afj afj = null;
/*     */       
/* 266 */       int i1 = k + random.nextInt(16);
/* 267 */       int i2 = m + random.nextInt(16);
/* 268 */       int i3 = i1;
/* 269 */       int i4 = i2;
/*     */       
/* 271 */       for (int i5 = 0; i5 < n; i5++) {
/* 272 */         boolean bool = false;
/* 273 */         for (int i6 = 0; !bool && i6 < 4; i6++) {
/*     */           
/* 275 */           el el = a(☃, e.b, i1, i2);
/*     */           
/* 277 */           if (a(afk.b.a, ☃, el, e.b)) {
/*     */             afb afb;
/*     */             try {
/* 280 */               afb = e.b.a(☃.f());
/* 281 */             } catch (Exception exception) {
/* 282 */               a.warn("Failed to create mob", exception);
/*     */             } 
/*     */ 
/*     */             
/* 286 */             double d1 = xq.a(i1, k + afb.H, k + 16.0D - afb.H);
/* 287 */             double d2 = xq.a(i2, m + afb.H, m + 16.0D - afb.H);
/*     */             
/* 289 */             afb.b(d1, el.p(), d2, random.nextFloat() * 360.0F, 0.0F);
/*     */             
/* 291 */             if (afb.a(☃, false) && afb.a(☃)) {
/* 292 */               afj = afb.a(☃.h(new el(afb)), afj, (gy)null);
/* 293 */               ☃.a(afb);
/* 294 */               bool = true;
/*     */             } 
/*     */           } 
/*     */           
/* 298 */           i1 += random.nextInt(5) - random.nextInt(5);
/* 299 */           i2 += random.nextInt(5) - random.nextInt(5);
/* 300 */           while (i1 < k || i1 >= k + 16 || i2 < m || i2 >= m + 16) {
/* 301 */             i1 = i3 + random.nextInt(5) - random.nextInt(5);
/* 302 */             i2 = i4 + random.nextInt(5) - random.nextInt(5);
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private static el a(axz ☃, @Nullable aev<? extends afb> aev1, int i, int j) {
/* 310 */     el el1 = new el(i, ☃.a(afk.b(aev1), i, j), j);
/*     */     
/* 312 */     el el2 = el1.b();
/* 313 */     if (☃.a_(el2).a(☃, el2, cbf.a)) {
/* 314 */       return el2;
/*     */     }
/*     */     
/* 317 */     return el1;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\ayj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */