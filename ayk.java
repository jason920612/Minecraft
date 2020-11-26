/*     */ import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
/*     */ import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
/*     */ import it.unimi.dsi.fastutil.objects.ObjectIterator;
/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ayk
/*     */ {
/*  23 */   private static final bgc a = (bgc)bct.dh;
/*     */   
/*     */   private final td b;
/*     */   private final Random c;
/*  27 */   private final Long2ObjectMap<a> d = (Long2ObjectMap<a>)new Long2ObjectOpenHashMap(4096);
/*     */   
/*     */   public ayk(td ☃) {
/*  30 */     this.b = ☃;
/*  31 */     this.c = new Random(☃.r_());
/*     */   }
/*     */   
/*     */   public void a(aer ☃, float f) {
/*  35 */     if (this.b.t.q() == bod.c) {
/*  36 */       int i = xq.c(☃.q);
/*  37 */       int j = xq.c(☃.r) - 1;
/*  38 */       int k = xq.c(☃.s);
/*     */       
/*  40 */       int m = 1;
/*  41 */       int n = 0;
/*  42 */       for (int i1 = -2; i1 <= 2; i1++) {
/*  43 */         for (int i2 = -2; i2 <= 2; i2++) {
/*  44 */           for (int i3 = -1; i3 < 3; i3++) {
/*  45 */             int i4 = i + i2 * 1 + i1 * 0;
/*  46 */             int i5 = j + i3;
/*  47 */             int i6 = k + i2 * 0 - i1 * 1;
/*     */             
/*  49 */             boolean bool = (i3 < 0);
/*     */             
/*  51 */             this.b.a(new el(i4, i5, i6), bool ? bct.ce.p() : bct.a.p());
/*     */           } 
/*     */         } 
/*     */       } 
/*     */       
/*  56 */       ☃.b(i, j, k, ☃.w, 0.0F);
/*  57 */       ☃.t = 0.0D;
/*  58 */       ☃.u = 0.0D;
/*  59 */       ☃.v = 0.0D;
/*     */       
/*     */       return;
/*     */     } 
/*  63 */     if (b(☃, f)) {
/*     */       return;
/*     */     }
/*     */     
/*  67 */     a(☃);
/*  68 */     b(☃, f);
/*     */   }
/*     */   
/*     */   public boolean b(aer ☃, float f) {
/*  72 */     int i = 128;
/*  73 */     double d = -1.0D;
/*     */     
/*  75 */     int j = xq.c(☃.q);
/*  76 */     int k = xq.c(☃.s);
/*  77 */     boolean bool = true;
/*     */     
/*  79 */     el el = el.a;
/*     */     
/*  81 */     long l = axm.a(j, k);
/*  82 */     if (this.d.containsKey(l)) {
/*  83 */       a a = (a)this.d.get(l);
/*     */       
/*  85 */       d = 0.0D;
/*     */       
/*  87 */       el = a;
/*  88 */       a.b = this.b.V();
/*  89 */       bool = false;
/*     */     } else {
/*  91 */       el el1 = new el(☃);
/*     */       
/*  93 */       for (int m = -128; m <= 128; m++) {
/*  94 */         for (int n = -128; n <= 128; n++) {
/*  95 */           el el2 = el1.a(m, this.b.ab() - 1 - el1.p(), n);
/*  96 */           while (el2.p() >= 0) {
/*  97 */             el el3 = el2.b();
/*     */             
/*  99 */             if (this.b.a_(el2).c() == a) {
/*     */               
/* 101 */               el3 = el2.b();
/* 102 */               while (this.b.a_(el3).c() == a) {
/* 103 */                 el2 = el3;
/* 104 */                 el3 = el2.b();
/*     */               } 
/*     */               
/* 107 */               double d1 = el2.n(el1);
/* 108 */               if (d < 0.0D || d1 < d) {
/* 109 */                 d = d1;
/* 110 */                 el = el2;
/*     */               } 
/*     */             } 
/* 113 */             el2 = el3;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 119 */     if (d >= 0.0D) {
/* 120 */       if (bool) {
/* 121 */         this.d.put(l, new a(this, el, this.b.V()));
/*     */       }
/*     */       
/* 124 */       double d1 = el.o() + 0.5D;
/*     */       
/* 126 */       double d3 = el.q() + 0.5D;
/*     */       
/* 128 */       bli.b b = a.c(this.b, el);
/* 129 */       boolean bool1 = (b.b().e().c() == eq.b.b);
/* 130 */       double d4 = (b.b().k() == eq.a.a) ? b.a().q() : b.a().o();
/* 131 */       double d2 = (b.a().p() + 1) - (☃.bp()).c * b.e();
/*     */       
/* 133 */       if (bool1) {
/* 134 */         d4++;
/*     */       }
/*     */       
/* 137 */       if (b.b().k() == eq.a.a) {
/* 138 */         d3 = d4 + (1.0D - (☃.bp()).b) * b.d() * b.b().e().c().a();
/*     */       } else {
/* 140 */         d1 = d4 + (1.0D - (☃.bp()).b) * b.d() * b.b().e().c().a();
/*     */       } 
/*     */       
/* 143 */       float f1 = 0.0F;
/* 144 */       float f2 = 0.0F;
/* 145 */       float f3 = 0.0F;
/* 146 */       float f4 = 0.0F;
/*     */       
/* 148 */       if (b.b().d() == ☃.bq()) {
/* 149 */         f1 = 1.0F;
/* 150 */         f2 = 1.0F;
/* 151 */       } else if (b.b().d() == ☃.bq().d()) {
/* 152 */         f1 = -1.0F;
/* 153 */         f2 = -1.0F;
/* 154 */       } else if (b.b().d() == ☃.bq().e()) {
/* 155 */         f3 = 1.0F;
/* 156 */         f4 = -1.0F;
/*     */       } else {
/* 158 */         f3 = -1.0F;
/* 159 */         f4 = 1.0F;
/*     */       } 
/*     */       
/* 162 */       double d5 = ☃.t;
/* 163 */       double d6 = ☃.v;
/* 164 */       ☃.t = d5 * f1 + d6 * f4;
/* 165 */       ☃.v = d5 * f3 + d6 * f2;
/* 166 */       ☃.w = f - (☃.bq().d().b() * 90) + (b.b().b() * 90);
/*     */       
/* 168 */       if (☃ instanceof tf) {
/* 169 */         ((tf)☃).a.a(d1, d2, d3, ☃.w, ☃.x);
/* 170 */         ((tf)☃).a.b();
/*     */       } else {
/* 172 */         ☃.b(d1, d2, d3, ☃.w, ☃.x);
/*     */       } 
/* 174 */       return true;
/*     */     } 
/*     */     
/* 177 */     return false;
/*     */   }
/*     */   
/*     */   public boolean a(aer ☃) {
/* 181 */     int i = 16;
/* 182 */     double d = -1.0D;
/*     */     
/* 184 */     int j = xq.c(☃.q);
/* 185 */     int k = xq.c(☃.r);
/* 186 */     int m = xq.c(☃.s);
/*     */     
/* 188 */     int n = j;
/* 189 */     int i1 = k;
/* 190 */     int i2 = m;
/* 191 */     int i3 = 0;
/*     */     
/* 193 */     int i4 = this.c.nextInt(4);
/*     */     
/* 195 */     el.a a = new el.a(); int i5;
/* 196 */     for (i5 = j - 16; i5 <= j + 16; i5++) {
/* 197 */       double d1 = i5 + 0.5D - ☃.q;
/* 198 */       for (int i13 = m - 16; i13 <= m + 16; i13++) {
/* 199 */         double d2 = i13 + 0.5D - ☃.s;
/*     */         int i14;
/* 201 */         label162: for (i14 = this.b.ab() - 1; i14 >= 0; i14--) {
/* 202 */           if (this.b.c(a.c(i5, i14, i13))) {
/* 203 */             while (i14 > 0 && this.b.c(a.c(i5, i14 - 1, i13))) {
/* 204 */               i14--;
/*     */             }
/*     */             
/* 207 */             for (int i15 = i4; i15 < i4 + 4; i15++) {
/* 208 */               int i16 = i15 % 2;
/* 209 */               int i17 = 1 - i16;
/*     */               
/* 211 */               if (i15 % 4 >= 2) {
/* 212 */                 i16 = -i16;
/* 213 */                 i17 = -i17;
/*     */               } 
/*     */               
/* 216 */               for (int i18 = 0; i18 < 3; i18++) {
/* 217 */                 for (int i19 = 0; i19 < 4; i19++) {
/* 218 */                   for (int i20 = -1; i20 < 4; i20++) {
/* 219 */                     int i21 = i5 + (i19 - 1) * i16 + i18 * i17;
/* 220 */                     int i22 = i14 + i20;
/* 221 */                     int i23 = i13 + (i19 - 1) * i17 - i18 * i16;
/*     */                     
/* 223 */                     a.c(i21, i22, i23);
/* 224 */                     if (i20 < 0 && !this.b.a_(a).d().b()) {
/*     */                       continue label162;
/*     */                     }
/* 227 */                     if (i20 >= 0 && !this.b.c(a)) {
/*     */                       continue label162;
/*     */                     }
/*     */                   } 
/*     */                 } 
/*     */               } 
/*     */               
/* 234 */               double d3 = i14 + 0.5D - ☃.r;
/* 235 */               double d4 = d1 * d1 + d3 * d3 + d2 * d2;
/* 236 */               if (d < 0.0D || d4 < d) {
/* 237 */                 d = d4;
/* 238 */                 n = i5;
/* 239 */                 i1 = i14;
/* 240 */                 i2 = i13;
/* 241 */                 i3 = i15 % 4;
/*     */               } 
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/* 248 */     if (d < 0.0D) {
/* 249 */       for (i5 = j - 16; i5 <= j + 16; i5++) {
/* 250 */         double d1 = i5 + 0.5D - ☃.q;
/* 251 */         for (int i13 = m - 16; i13 <= m + 16; i13++) {
/* 252 */           double d2 = i13 + 0.5D - ☃.s;
/*     */           int i14;
/* 254 */           label160: for (i14 = this.b.ab() - 1; i14 >= 0; i14--) {
/* 255 */             if (this.b.c(a.c(i5, i14, i13))) {
/* 256 */               while (i14 > 0 && this.b.c(a.c(i5, i14 - 1, i13))) {
/* 257 */                 i14--;
/*     */               }
/*     */               
/* 260 */               for (int i15 = i4; i15 < i4 + 2; i15++) {
/* 261 */                 int i16 = i15 % 2;
/* 262 */                 int i17 = 1 - i16;
/* 263 */                 for (int i18 = 0; i18 < 4; i18++) {
/* 264 */                   for (int i19 = -1; i19 < 4; i19++) {
/* 265 */                     int i20 = i5 + (i18 - 1) * i16;
/* 266 */                     int i21 = i14 + i19;
/* 267 */                     int i22 = i13 + (i18 - 1) * i17;
/*     */                     
/* 269 */                     a.c(i20, i21, i22);
/* 270 */                     if (i19 < 0 && !this.b.a_(a).d().b()) {
/*     */                       continue label160;
/*     */                     }
/* 273 */                     if (i19 >= 0 && !this.b.c(a)) {
/*     */                       continue label160;
/*     */                     }
/*     */                   } 
/*     */                 } 
/*     */                 
/* 279 */                 double d3 = i14 + 0.5D - ☃.r;
/* 280 */                 double d4 = d1 * d1 + d3 * d3 + d2 * d2;
/* 281 */                 if (d < 0.0D || d4 < d) {
/* 282 */                   d = d4;
/* 283 */                   n = i5;
/* 284 */                   i1 = i14;
/* 285 */                   i2 = i13;
/* 286 */                   i3 = i15 % 2;
/*     */                 } 
/*     */               } 
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     }
/*     */     
/* 295 */     i5 = i3;
/*     */     
/* 297 */     int i6 = n;
/* 298 */     int i7 = i1;
/* 299 */     int i8 = i2;
/*     */     
/* 301 */     int i9 = i5 % 2;
/* 302 */     int i10 = 1 - i9;
/*     */     
/* 304 */     if (i5 % 4 >= 2) {
/* 305 */       i9 = -i9;
/* 306 */       i10 = -i10;
/*     */     } 
/*     */     
/* 309 */     if (d < 0.0D) {
/* 310 */       i1 = xq.a(i1, 70, this.b.ab() - 10);
/* 311 */       i7 = i1;
/*     */       
/* 313 */       for (int i13 = -1; i13 <= 1; i13++) {
/* 314 */         for (int i14 = 1; i14 < 3; i14++) {
/* 315 */           for (int i15 = -1; i15 < 3; i15++) {
/* 316 */             int i16 = i6 + (i14 - 1) * i9 + i13 * i10;
/* 317 */             int i17 = i7 + i15;
/* 318 */             int i18 = i8 + (i14 - 1) * i10 - i13 * i9;
/*     */             
/* 320 */             boolean bool = (i15 < 0);
/*     */             
/* 322 */             a.c(i16, i17, i18);
/* 323 */             this.b.a(a, bool ? bct.ce.p() : bct.a.p());
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 329 */     for (int i11 = -1; i11 < 3; i11++) {
/* 330 */       for (int i13 = -1; i13 < 4; i13++) {
/* 331 */         if (i11 == -1 || i11 == 2 || i13 == -1 || i13 == 3) {
/* 332 */           a.c(i6 + i11 * i9, i7 + i13, i8 + i11 * i10);
/* 333 */           this.b.a(a, bct.ce.p(), 3);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 338 */     blc blc = a.p().a(bgc.a, (i9 == 0) ? eq.a.c : eq.a.a);
/*     */     
/* 340 */     for (int i12 = 0; i12 < 2; i12++) {
/* 341 */       for (int i13 = 0; i13 < 3; i13++) {
/* 342 */         a.c(i6 + i12 * i9, i7 + i13, i8 + i12 * i10);
/* 343 */         this.b.a(a, blc, 18);
/*     */       } 
/*     */     } 
/*     */     
/* 347 */     return true;
/*     */   }
/*     */   
/*     */   public void a(long ☃) {
/* 351 */     if (☃ % 100L == 0L) {
/* 352 */       long l = ☃ - 300L;
/*     */       
/* 354 */       ObjectIterator<a> objectIterator = this.d.values().iterator();
/* 355 */       while (objectIterator.hasNext()) {
/* 356 */         a a = (a)objectIterator.next();
/*     */         
/* 358 */         if (a == null || a.b < l)
/* 359 */           objectIterator.remove(); 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public class a
/*     */     extends el {
/*     */     public long b;
/*     */     
/*     */     public a(ayk ☃, el el1, long l) {
/* 369 */       super(el1.o(), el1.p(), el1.q());
/* 370 */       this.b = l;
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\ayk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */