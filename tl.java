/*     */ import com.google.common.collect.AbstractIterator;
/*     */ import com.google.common.collect.ComparisonChain;
/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Sets;
/*     */ import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
/*     */ import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
/*     */ import java.util.Collections;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Set;
/*     */ import java.util.function.Predicate;
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
/*     */ public class tl
/*     */ {
/*     */   private static final Predicate<tf> a;
/*     */   private static final Predicate<tf> b;
/*     */   private final td c;
/*     */   
/*     */   static {
/*  29 */     a = (☃ -> (☃ != null && !☃.t()));
/*  30 */     b = (☃ -> (☃ != null && (!☃.t() || ☃.s().X().b("spectatorsGenerateChunks"))));
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
/*  41 */   private final List<tf> d = Lists.newArrayList();
/*  42 */   private final Long2ObjectMap<tk> e = (Long2ObjectMap<tk>)new Long2ObjectOpenHashMap(4096);
/*  43 */   private final Set<tk> f = Sets.newHashSet();
/*  44 */   private final List<tk> g = Lists.newLinkedList();
/*  45 */   private final List<tk> h = Lists.newLinkedList();
/*  46 */   private final List<tk> i = Lists.newArrayList();
/*     */   private int j;
/*     */   private long k;
/*     */   private boolean l = true;
/*     */   private boolean m = true;
/*     */   
/*     */   public tl(td ☃) {
/*  53 */     this.c = ☃;
/*     */     
/*  55 */     a(☃.z().ac().s());
/*     */   }
/*     */   
/*     */   public td a() {
/*  59 */     return this.c;
/*     */   }
/*     */   
/*     */   public Iterator<bnj> b() {
/*  63 */     Iterator<tk> ☃ = this.i.iterator();
/*  64 */     return (Iterator<bnj>)new AbstractIterator<bnj>(this, ☃)
/*     */       {
/*     */         protected bnj a() {
/*  67 */           while (this.a.hasNext()) {
/*  68 */             tk ☃ = this.a.next();
/*  69 */             bnj bnj = ☃.f();
/*     */             
/*  71 */             if (bnj != null) {
/*  72 */               if (!bnj.v()) {
/*  73 */                 return bnj;
/*     */               }
/*     */               
/*  76 */               if (☃.a(128.0D, tl.d())) {
/*  77 */                 return bnj;
/*     */               }
/*     */             } 
/*     */           } 
/*  81 */           return (bnj)endOfData();
/*     */         }
/*     */       };
/*     */   }
/*     */   
/*     */   public void c() {
/*  87 */     long ☃ = this.c.V();
/*     */     
/*  89 */     if (☃ - this.k > 8000L) {
/*  90 */       this.k = ☃;
/*     */       
/*  92 */       for (int i = 0; i < this.i.size(); i++) {
/*  93 */         tk tk = this.i.get(i);
/*  94 */         tk.d();
/*  95 */         tk.c();
/*     */       } 
/*     */     } 
/*     */     
/*  99 */     if (!this.f.isEmpty()) {
/* 100 */       for (tk tk : this.f) {
/* 101 */         tk.d();
/*     */       }
/* 103 */       this.f.clear();
/*     */     } 
/*     */     
/* 106 */     if (this.l && ☃ % 4L == 0L) {
/* 107 */       this.l = false;
/* 108 */       Collections.sort(this.h, (☃, tk1) -> ComparisonChain.start().compare(☃.g(), tk1.g()).result());
/*     */     } 
/* 110 */     if (this.m && ☃ % 4L == 2L) {
/* 111 */       this.m = false;
/* 112 */       Collections.sort(this.g, (☃, tk1) -> ComparisonChain.start().compare(☃.g(), tk1.g()).result());
/*     */     } 
/*     */     
/* 115 */     if (!this.h.isEmpty()) {
/* 116 */       long l = k.c() + 50000000L;
/* 117 */       int i = 49;
/* 118 */       for (Iterator<tk> iterator = this.h.iterator(); iterator.hasNext(); ) {
/* 119 */         tk tk = iterator.next();
/*     */         
/* 121 */         if (tk.f() == null) {
/* 122 */           boolean bool = tk.a(b);
/* 123 */           if (tk.a(bool)) {
/* 124 */             iterator.remove();
/* 125 */             if (tk.b()) {
/* 126 */               this.g.remove(tk);
/*     */             }
/* 128 */             if (--i < 0 || k.c() > l) {
/*     */               break;
/*     */             }
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 136 */     if (!this.g.isEmpty()) {
/* 137 */       int i = 81;
/* 138 */       for (Iterator<tk> iterator = this.g.iterator(); iterator.hasNext(); ) {
/* 139 */         tk tk = iterator.next();
/*     */         
/* 141 */         if (tk.b()) {
/* 142 */           iterator.remove();
/* 143 */           if (--i < 0) {
/*     */             break;
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 150 */     if (this.d.isEmpty()) {
/* 151 */       boc boc = this.c.t;
/* 152 */       if (!boc.p()) {
/* 153 */         this.c.v().b();
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean a(int ☃, int i) {
/* 159 */     long l = d(☃, i);
/* 160 */     return (this.e.get(l) != null);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public tk b(int ☃, int i) {
/* 165 */     return (tk)this.e.get(d(☃, i));
/*     */   }
/*     */   
/*     */   private tk c(int ☃, int i) {
/* 169 */     long l = d(☃, i);
/* 170 */     tk tk = (tk)this.e.get(l);
/* 171 */     if (tk == null) {
/* 172 */       tk = new tk(this, ☃, i);
/* 173 */       this.e.put(l, tk);
/* 174 */       this.i.add(tk);
/* 175 */       if (tk.f() == null) {
/* 176 */         this.h.add(tk);
/*     */       }
/* 178 */       if (!tk.b()) {
/* 179 */         this.g.add(tk);
/*     */       }
/*     */     } 
/* 182 */     return tk;
/*     */   }
/*     */   
/*     */   public void a(el ☃) {
/* 186 */     int i = ☃.o() >> 4;
/* 187 */     int j = ☃.q() >> 4;
/* 188 */     tk tk = b(i, j);
/* 189 */     if (tk != null) {
/* 190 */       tk.a(☃.o() & 0xF, ☃.p(), ☃.q() & 0xF);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(tf ☃) {
/* 195 */     int i = (int)☃.q >> 4;
/* 196 */     int j = (int)☃.s >> 4;
/*     */     
/* 198 */     ☃.d = ☃.q;
/* 199 */     ☃.e = ☃.s;
/*     */     
/* 201 */     for (int k = i - this.j; k <= i + this.j; k++) {
/* 202 */       for (int m = j - this.j; m <= j + this.j; m++) {
/* 203 */         c(k, m).a(☃);
/*     */       }
/*     */     } 
/*     */     
/* 207 */     this.d.add(☃);
/* 208 */     e();
/*     */   }
/*     */   
/*     */   public void b(tf ☃) {
/* 212 */     int i = (int)☃.d >> 4;
/* 213 */     int j = (int)☃.e >> 4;
/*     */     
/* 215 */     for (int k = i - this.j; k <= i + this.j; k++) {
/* 216 */       for (int m = j - this.j; m <= j + this.j; m++) {
/* 217 */         tk tk = b(k, m);
/* 218 */         if (tk != null) {
/* 219 */           tk.b(☃);
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 224 */     this.d.remove(☃);
/* 225 */     e();
/*     */   }
/*     */   
/*     */   private boolean a(int ☃, int i, int j, int k, int m) {
/* 229 */     int n = ☃ - j;
/* 230 */     int i1 = i - k;
/* 231 */     if (n < -m || n > m) {
/* 232 */       return false;
/*     */     }
/* 234 */     if (i1 < -m || i1 > m) {
/* 235 */       return false;
/*     */     }
/* 237 */     return true;
/*     */   }
/*     */   
/*     */   public void c(tf ☃) {
/* 241 */     int i = (int)☃.q >> 4;
/* 242 */     int j = (int)☃.s >> 4;
/*     */     
/* 244 */     double d1 = ☃.d - ☃.q;
/* 245 */     double d2 = ☃.e - ☃.s;
/* 246 */     double d3 = d1 * d1 + d2 * d2;
/* 247 */     if (d3 < 64.0D) {
/*     */       return;
/*     */     }
/*     */     
/* 251 */     int k = (int)☃.d >> 4;
/* 252 */     int m = (int)☃.e >> 4;
/* 253 */     int n = this.j;
/*     */     
/* 255 */     int i1 = i - k;
/* 256 */     int i2 = j - m;
/* 257 */     if (i1 == 0 && i2 == 0) {
/*     */       return;
/*     */     }
/*     */     
/* 261 */     for (int i3 = i - n; i3 <= i + n; i3++) {
/* 262 */       for (int i4 = j - n; i4 <= j + n; i4++) {
/* 263 */         if (!a(i3, i4, k, m, n)) {
/* 264 */           c(i3, i4).a(☃);
/*     */         }
/* 266 */         if (!a(i3 - i1, i4 - i2, i, j, n)) {
/* 267 */           tk tk = b(i3 - i1, i4 - i2);
/* 268 */           if (tk != null) {
/* 269 */             tk.b(☃);
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 275 */     ☃.d = ☃.q;
/* 276 */     ☃.e = ☃.s;
/* 277 */     e();
/*     */   }
/*     */   
/*     */   public boolean a(tf ☃, int i, int j) {
/* 281 */     tk tk = b(i, j);
/* 282 */     return (tk != null && tk.d(☃) && tk.e());
/*     */   }
/*     */   
/*     */   public void a(int ☃) {
/* 286 */     ☃ = xq.a(☃, 3, 32);
/* 287 */     if (☃ == this.j) {
/*     */       return;
/*     */     }
/* 290 */     int i = ☃ - this.j;
/*     */     
/* 292 */     List<tf> list = Lists.newArrayList(this.d);
/* 293 */     for (tf tf : list) {
/* 294 */       int j = (int)tf.q >> 4;
/* 295 */       int k = (int)tf.s >> 4;
/*     */       
/* 297 */       if (i > 0) {
/* 298 */         for (int n = j - ☃; n <= j + ☃; n++) {
/* 299 */           for (int i1 = k - ☃; i1 <= k + ☃; i1++) {
/* 300 */             tk tk = c(n, i1);
/*     */             
/* 302 */             if (!tk.d(tf))
/* 303 */               tk.a(tf); 
/*     */           } 
/*     */         } 
/*     */         continue;
/*     */       } 
/* 308 */       for (int m = j - this.j; m <= j + this.j; m++) {
/* 309 */         for (int n = k - this.j; n <= k + this.j; n++) {
/* 310 */           if (!a(m, n, j, k, ☃)) {
/* 311 */             c(m, n).b(tf);
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 318 */     this.j = ☃;
/* 319 */     e();
/*     */   }
/*     */   
/*     */   private void e() {
/* 323 */     this.l = true;
/* 324 */     this.m = true;
/*     */   }
/*     */   
/*     */   public static int b(int ☃) {
/* 328 */     return ☃ * 16 - 16;
/*     */   }
/*     */   
/*     */   private static long d(int ☃, int i) {
/* 332 */     return ☃ + 2147483647L | i + 2147483647L << 32L;
/*     */   }
/*     */   
/*     */   public void a(tk ☃) {
/* 336 */     this.f.add(☃);
/*     */   }
/*     */   
/*     */   public void b(tk ☃) {
/* 340 */     axm axm = ☃.a();
/* 341 */     long l = d(axm.a, axm.b);
/* 342 */     ☃.c();
/* 343 */     this.e.remove(l);
/* 344 */     this.i.remove(☃);
/* 345 */     this.f.remove(☃);
/* 346 */     this.g.remove(☃);
/* 347 */     this.h.remove(☃);
/*     */     
/* 349 */     bnj bnj = ☃.f();
/* 350 */     if (bnj != null)
/* 351 */       a().v().a(bnj); 
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\tl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */