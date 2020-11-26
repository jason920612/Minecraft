/*     */ import java.util.Map;
/*     */ import org.apache.commons.lang3.StringUtils;
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
/*     */ public class apw
/*     */   extends apv
/*     */ {
/*  27 */   private static final Logger f = LogManager.getLogger();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  41 */   private final ade g = new aqt();
/*  42 */   private final ade h = new adt(this, new iq("Repair"), 2)
/*     */     {
/*     */       public void g() {
/*  45 */         super.g();
/*  46 */         this.a.a(this);
/*     */       }
/*     */     };
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final axy i;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final el j;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int a;
/*     */ 
/*     */ 
/*     */   
/*     */   private int k;
/*     */ 
/*     */ 
/*     */   
/*     */   private String l;
/*     */ 
/*     */ 
/*     */   
/*     */   private final aog m;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public apw(aof ☃, axy axy1, el el1, aog aog1) {
/*  82 */     this.j = el1;
/*  83 */     this.i = axy1;
/*  84 */     this.m = aog1;
/*     */     
/*  86 */     a(new aqx(this.h, 0, 27, 47));
/*  87 */     a(new aqx(this.h, 1, 76, 47));
/*  88 */     a(new aqx(this, this.g, 2, 134, 47, axy1, el1)
/*     */         {
/*     */           public boolean a(ate ☃) {
/*  91 */             return false;
/*     */           }
/*     */ 
/*     */           
/*     */           public boolean a(aog ☃) {
/*  96 */             return ((☃.bV.d || ☃.bW >= this.c.a) && this.c.a > 0 && e());
/*     */           }
/*     */ 
/*     */           
/*     */           public ate a(aog ☃, ate ate1) {
/* 101 */             if (!☃.bV.d) {
/* 102 */               ☃.c(-this.c.a);
/*     */             }
/* 104 */             apw.a(this.c).a(0, ate.a);
/*     */             
/* 106 */             if (apw.b(this.c) > 0) {
/* 107 */               ate ate2 = apw.a(this.c).a(1);
/* 108 */               if (!ate2.a() && ate2.C() > apw.b(this.c)) {
/* 109 */                 ate2.g(apw.b(this.c));
/* 110 */                 apw.a(this.c).a(1, ate2);
/*     */               } else {
/* 112 */                 apw.a(this.c).a(1, ate.a);
/*     */               } 
/*     */             } else {
/* 115 */               apw.a(this.c).a(1, ate.a);
/*     */             } 
/* 117 */             this.c.a = 0;
/*     */             
/* 119 */             blc blc = this.a.a_(this.b);
/* 120 */             if (!this.a.B) {
/* 121 */               if (!☃.bV.d && blc.a(wv.y) && ☃.ce().nextFloat() < 0.12F) {
/* 122 */                 blc blc1 = bce.a_(blc);
/* 123 */                 if (blc1 == null) {
/* 124 */                   this.a.g(this.b);
/* 125 */                   this.a.b(1029, this.b, 0);
/*     */                 } else {
/* 127 */                   this.a.a(this.b, blc1, 2);
/* 128 */                   this.a.b(1030, this.b, 0);
/*     */                 } 
/*     */               } else {
/* 131 */                 this.a.b(1030, this.b, 0);
/*     */               } 
/*     */             }
/* 134 */             return ate1;
/*     */           }
/*     */         });
/*     */     int i;
/* 138 */     for (i = 0; i < 3; i++) {
/* 139 */       for (int j = 0; j < 9; j++) {
/* 140 */         a(new aqx(☃, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
/*     */       }
/*     */     } 
/* 143 */     for (i = 0; i < 9; i++) {
/* 144 */       a(new aqx(☃, i, 8 + i * 18, 142));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ade ☃) {
/* 150 */     super.a(☃);
/*     */     
/* 152 */     if (☃ == this.h) {
/* 153 */       d();
/*     */     }
/*     */   }
/*     */   
/*     */   public void d() {
/* 158 */     ate ☃ = this.h.a(0);
/* 159 */     this.a = 1;
/* 160 */     int i = 0;
/* 161 */     int j = 0;
/* 162 */     int k = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 168 */     if (☃.a()) {
/* 169 */       this.g.a(0, ate.a);
/* 170 */       this.a = 0;
/*     */       return;
/*     */     } 
/* 173 */     ate ate1 = ☃.i();
/* 174 */     ate ate2 = this.h.a(1);
/* 175 */     Map<awe, Integer> map = awg.a(ate1);
/*     */     
/* 177 */     j += ☃.z() + (ate2.a() ? 0 : ate2.z());
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 182 */     this.k = 0;
/*     */     
/* 184 */     if (!ate2.a()) {
/* 185 */       boolean bool = (ate2.b() == atf.dT && !asi.e(ate2).isEmpty());
/*     */       
/* 187 */       if (ate1.e() && ate1.b().a(☃, ate2)) {
/* 188 */         int m = Math.min(ate1.g(), ate1.h() / 4);
/* 189 */         if (m <= 0) {
/* 190 */           this.g.a(0, ate.a);
/* 191 */           this.a = 0;
/*     */           return;
/*     */         } 
/* 194 */         int n = 0;
/* 195 */         while (m > 0 && n < ate2.C()) {
/* 196 */           int i1 = ate1.g() - m;
/* 197 */           ate1.b(i1);
/* 198 */           i++;
/*     */           
/* 200 */           m = Math.min(ate1.g(), ate1.h() / 4);
/* 201 */           n++;
/*     */         } 
/* 203 */         this.k = n;
/*     */       } else {
/* 205 */         if (!bool && (ate1.b() != ate2.b() || !ate1.e())) {
/* 206 */           this.g.a(0, ate.a);
/* 207 */           this.a = 0;
/*     */           return;
/*     */         } 
/* 210 */         if (ate1.e() && !bool) {
/* 211 */           int m = ☃.h() - ☃.g();
/* 212 */           int n = ate2.h() - ate2.g();
/* 213 */           int i1 = n + ate1.h() * 12 / 100;
/* 214 */           int i2 = m + i1;
/* 215 */           int i3 = ate1.h() - i2;
/* 216 */           if (i3 < 0) {
/* 217 */             i3 = 0;
/*     */           }
/*     */           
/* 220 */           if (i3 < ate1.g()) {
/* 221 */             ate1.b(i3);
/* 222 */             i += 2;
/*     */           } 
/*     */         } 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 229 */         Map<awe, Integer> map1 = awg.a(ate2);
/* 230 */         boolean bool1 = false;
/* 231 */         boolean bool2 = false;
/*     */         
/* 233 */         for (awe awe : map1.keySet()) {
/* 234 */           if (awe == null) {
/*     */             continue;
/*     */           }
/* 237 */           int m = map.containsKey(awe) ? ((Integer)map.get(awe)).intValue() : 0;
/* 238 */           int n = ((Integer)map1.get(awe)).intValue();
/* 239 */           n = (m == n) ? (n + 1) : Math.max(n, m);
/*     */           
/* 241 */           boolean bool3 = awe.a(☃);
/* 242 */           if (this.m.bV.d || ☃.b() == atf.dT) {
/* 243 */             bool3 = true;
/*     */           }
/*     */           
/* 246 */           for (awe awe1 : map.keySet()) {
/* 247 */             if (awe1 != awe && !awe.b(awe1)) {
/* 248 */               bool3 = false;
/* 249 */               i++;
/*     */             } 
/*     */           } 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 256 */           if (!bool3) {
/* 257 */             bool2 = true;
/*     */             continue;
/*     */           } 
/* 260 */           bool1 = true;
/* 261 */           if (n > awe.a()) {
/* 262 */             n = awe.a();
/*     */           }
/* 264 */           map.put(awe, Integer.valueOf(n));
/* 265 */           int i1 = 0;
/*     */           
/* 267 */           switch (null.a[awe.d().ordinal()]) {
/*     */             case 1:
/* 269 */               i1 = 1;
/*     */               break;
/*     */             case 2:
/* 272 */               i1 = 2;
/*     */               break;
/*     */             case 3:
/* 275 */               i1 = 4;
/*     */               break;
/*     */             case 4:
/* 278 */               i1 = 8;
/*     */               break;
/*     */           } 
/*     */           
/* 282 */           if (bool) {
/* 283 */             i1 = Math.max(1, i1 / 2);
/*     */           }
/*     */           
/* 286 */           i += i1 * n;
/*     */           
/* 288 */           if (☃.C() > 1) {
/* 289 */             i = 40;
/*     */           }
/*     */         } 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 296 */         if (bool2 && !bool1) {
/*     */           
/* 298 */           this.g.a(0, ate.a);
/* 299 */           this.a = 0;
/*     */           
/*     */           return;
/*     */         } 
/*     */       } 
/*     */     } 
/* 305 */     if (StringUtils.isBlank(this.l)) {
/* 306 */       if (☃.s()) {
/* 307 */         k = 1;
/*     */         
/* 309 */         i += k;
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 314 */         ate1.r();
/*     */       } 
/* 316 */     } else if (!this.l.equals(☃.q().getString())) {
/* 317 */       k = 1;
/*     */       
/* 319 */       i += k;
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 324 */       ate1.a(new iq(this.l));
/*     */     } 
/*     */     
/* 327 */     this.a = j + i;
/* 328 */     if (i <= 0)
/*     */     {
/*     */ 
/*     */       
/* 332 */       ate1 = ate.a;
/*     */     }
/* 334 */     if (k == i && k > 0 && this.a >= 40)
/*     */     {
/*     */ 
/*     */       
/* 338 */       this.a = 39;
/*     */     }
/* 340 */     if (this.a >= 40 && !this.m.bV.d)
/*     */     {
/*     */ 
/*     */       
/* 344 */       ate1 = ate.a;
/*     */     }
/*     */     
/* 347 */     if (!ate1.a()) {
/* 348 */       int m = ate1.z();
/* 349 */       if (!ate2.a() && m < ate2.z()) {
/* 350 */         m = ate2.z();
/*     */       }
/*     */       
/* 353 */       if (k != i || k == 0) {
/* 354 */         m = m * 2 + 1;
/*     */       }
/*     */       
/* 357 */       ate1.c(m);
/* 358 */       awg.a(map, ate1);
/*     */     } 
/*     */     
/* 361 */     this.g.a(0, ate1);
/*     */ 
/*     */     
/* 364 */     b();
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
/*     */   public void a(aqb ☃) {
/* 377 */     super.a(☃);
/* 378 */     ☃.a(this, 0, this.a);
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
/*     */   public void b(aog ☃) {
/* 390 */     super.b(☃);
/* 391 */     if (this.i.B) {
/*     */       return;
/*     */     }
/*     */     
/* 395 */     a(☃, this.i, this.h);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(aog ☃) {
/* 400 */     if (!this.i.a_(this.j).a(wv.y)) {
/* 401 */       return false;
/*     */     }
/* 403 */     return (☃.d(this.j.o() + 0.5D, this.j.p() + 0.5D, this.j.q() + 0.5D) <= 64.0D);
/*     */   }
/*     */ 
/*     */   
/*     */   public ate b(aog ☃, int i) {
/* 408 */     ate ate = ate.a;
/* 409 */     aqx aqx = this.c.get(i);
/* 410 */     if (aqx != null && aqx.e()) {
/* 411 */       ate ate1 = aqx.d();
/* 412 */       ate = ate1.i();
/*     */       
/* 414 */       if (i == 2) {
/* 415 */         if (!a(ate1, 3, 39, true)) {
/* 416 */           return ate.a;
/*     */         }
/* 418 */         aqx.a(ate1, ate);
/* 419 */       } else if (i == 0 || i == 1) {
/* 420 */         if (!a(ate1, 3, 39, false)) {
/* 421 */           return ate.a;
/*     */         }
/* 423 */       } else if (i >= 3 && i < 39 && 
/* 424 */         !a(ate1, 0, 2, false)) {
/* 425 */         return ate.a;
/*     */       } 
/*     */ 
/*     */       
/* 429 */       if (ate1.a()) {
/* 430 */         aqx.d(ate.a);
/*     */       } else {
/* 432 */         aqx.f();
/*     */       } 
/* 434 */       if (ate1.C() == ate.C()) {
/* 435 */         return ate.a;
/*     */       }
/* 437 */       aqx.a(☃, ate1);
/*     */     } 
/*     */     
/* 440 */     return ate;
/*     */   }
/*     */   
/*     */   public void a(String ☃) {
/* 444 */     this.l = ☃;
/*     */     
/* 446 */     if (a(2).e()) {
/* 447 */       ate ate = a(2).d();
/*     */       
/* 449 */       if (StringUtils.isBlank(☃)) {
/* 450 */         ate.r();
/*     */       } else {
/* 452 */         ate.a(new iq(this.l));
/*     */       } 
/*     */     } 
/*     */     
/* 456 */     d();
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\apw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */