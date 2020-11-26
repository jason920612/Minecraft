/*     */ import com.google.common.collect.AbstractIterator;
/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import javax.annotation.concurrent.Immutable;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Immutable
/*     */ public class el
/*     */   extends ff
/*     */ {
/*  17 */   private static final Logger b = LogManager.getLogger();
/*     */   
/*  19 */   public static final el a = new el(0, 0, 0);
/*     */   
/*  21 */   private static final int c = 1 + xq.e(xq.c(30000000));
/*  22 */   private static final int d = c;
/*  23 */   private static final int f = 64 - c - d;
/*     */   
/*  25 */   private static final int g = 0 + d;
/*  26 */   private static final int h = g + f;
/*  27 */   private static final long i = (1L << c) - 1L;
/*  28 */   private static final long j = (1L << f) - 1L;
/*  29 */   private static final long k = (1L << d) - 1L;
/*     */   
/*     */   public el(int ☃, int i, int j) {
/*  32 */     super(☃, i, j);
/*     */   }
/*     */   
/*     */   public el(double ☃, double d1, double d2) {
/*  36 */     super(☃, d1, d2);
/*     */   }
/*     */   
/*     */   public el(aer ☃) {
/*  40 */     this(☃.q, ☃.r, ☃.s);
/*     */   }
/*     */   
/*     */   public el(cee ☃) {
/*  44 */     this(☃.b, ☃.c, ☃.d);
/*     */   }
/*     */   
/*     */   public el(ff ☃) {
/*  48 */     this(☃.o(), ☃.p(), ☃.q());
/*     */   }
/*     */ 
/*     */   
/*     */   public el a(double ☃, double d1, double d2) {
/*  53 */     if (☃ == 0.0D && d1 == 0.0D && d2 == 0.0D) {
/*  54 */       return this;
/*     */     }
/*  56 */     return new el(o() + ☃, p() + d1, q() + d2);
/*     */   }
/*     */ 
/*     */   
/*     */   public el a(int ☃, int i, int j) {
/*  61 */     if (☃ == 0 && i == 0 && j == 0) {
/*  62 */       return this;
/*     */     }
/*  64 */     return new el(o() + ☃, p() + i, q() + j);
/*     */   }
/*     */ 
/*     */   
/*     */   public el a(ff ☃) {
/*  69 */     return a(☃.o(), ☃.p(), ☃.q());
/*     */   }
/*     */ 
/*     */   
/*     */   public el b(ff ☃) {
/*  74 */     return a(-☃.o(), -☃.p(), -☃.q());
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
/*     */   public el a() {
/*  89 */     return b(1);
/*     */   }
/*     */ 
/*     */   
/*     */   public el b(int ☃) {
/*  94 */     return a(eq.b, ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public el b() {
/*  99 */     return c(1);
/*     */   }
/*     */ 
/*     */   
/*     */   public el c(int ☃) {
/* 104 */     return a(eq.a, ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public el c() {
/* 109 */     return d(1);
/*     */   }
/*     */ 
/*     */   
/*     */   public el d(int ☃) {
/* 114 */     return a(eq.c, ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public el d() {
/* 119 */     return e(1);
/*     */   }
/*     */ 
/*     */   
/*     */   public el e(int ☃) {
/* 124 */     return a(eq.d, ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public el e() {
/* 129 */     return f(1);
/*     */   }
/*     */ 
/*     */   
/*     */   public el f(int ☃) {
/* 134 */     return a(eq.e, ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public el f() {
/* 139 */     return g(1);
/*     */   }
/*     */ 
/*     */   
/*     */   public el g(int ☃) {
/* 144 */     return a(eq.f, ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public el a(eq ☃) {
/* 149 */     return a(☃, 1);
/*     */   }
/*     */ 
/*     */   
/*     */   public el a(eq ☃, int i) {
/* 154 */     if (i == 0) {
/* 155 */       return this;
/*     */     }
/* 157 */     return new el(o() + ☃.g() * i, p() + ☃.h() * i, q() + ☃.i() * i);
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
/*     */   public el a(bhb ☃) {
/* 172 */     switch (null.a[☃.ordinal()])
/*     */     
/*     */     { default:
/* 175 */         return this;
/*     */       case 2:
/* 177 */         return new el(-q(), p(), o());
/*     */       case 3:
/* 179 */         return new el(-o(), p(), -q());
/*     */       case 4:
/* 181 */         break; }  return new el(q(), p(), -o());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public el c(ff ☃) {
/* 187 */     return new el(p() * ☃.q() - q() * ☃.p(), q() * ☃.o() - o() * ☃.q(), o() * ☃.p() - p() * ☃.o());
/*     */   }
/*     */ 
/*     */   
/*     */   public long g() {
/* 192 */     return (o() & i) << h | (p() & j) << g | (q() & k) << 0L;
/*     */   }
/*     */   
/*     */   public static el a(long ☃) {
/* 196 */     int i = (int)(☃ << 64 - h - c >> 64 - c);
/* 197 */     int j = (int)(☃ << 64 - g - f >> 64 - f);
/* 198 */     int k = (int)(☃ << 64 - d >> 64 - d);
/*     */     
/* 200 */     return new el(i, j, k);
/*     */   }
/*     */   
/*     */   public static Iterable<el> a(el ☃, el el1) {
/* 204 */     return a(
/* 205 */         Math.min(☃.o(), el1.o()), 
/* 206 */         Math.min(☃.p(), el1.p()), 
/* 207 */         Math.min(☃.q(), el1.q()), 
/* 208 */         Math.max(☃.o(), el1.o()), 
/* 209 */         Math.max(☃.p(), el1.p()), 
/* 210 */         Math.max(☃.q(), el1.q()));
/*     */   }
/*     */ 
/*     */   
/*     */   public static Iterable<el> a(int ☃, int i, int j, int k, int m, int n) {
/* 215 */     return () -> new AbstractIterator<el>(☃, i, j, k, m, n)
/*     */       {
/*     */         private boolean g = true;
/*     */         private int h;
/*     */         private int i;
/*     */         private int j;
/*     */         
/*     */         protected el a() {
/* 223 */           if (this.g) {
/* 224 */             this.g = false;
/*     */             
/* 226 */             this.h = this.a;
/* 227 */             this.i = this.b;
/* 228 */             this.j = this.c;
/* 229 */             return new el(this.a, this.b, this.c);
/* 230 */           }  if (this.h == this.d && this.i == this.e && this.j == this.f)
/*     */           {
/* 232 */             return (el)endOfData();
/*     */           }
/*     */           
/* 235 */           if (this.h < this.d) {
/* 236 */             this.h++;
/* 237 */           } else if (this.i < this.e) {
/* 238 */             this.h = this.a;
/* 239 */             this.i++;
/* 240 */           } else if (this.j < this.f) {
/* 241 */             this.h = this.a;
/* 242 */             this.i = this.b;
/* 243 */             this.j++;
/*     */           } 
/* 245 */           return new el(this.h, this.i, this.j);
/*     */         }
/*     */       };
/*     */   }
/*     */ 
/*     */   
/*     */   public el h() {
/* 252 */     return this;
/*     */   }
/*     */   
/*     */   public static class a extends el {
/*     */     protected int b;
/*     */     protected int c;
/*     */     protected int d;
/*     */     
/*     */     public a() {
/* 261 */       this(0, 0, 0);
/*     */     }
/*     */     
/*     */     public a(el ☃) {
/* 265 */       this(☃.o(), ☃.p(), ☃.q());
/*     */     }
/*     */     
/*     */     public a(int ☃, int i, int j) {
/* 269 */       super(0, 0, 0);
/* 270 */       this.b = ☃;
/* 271 */       this.c = i;
/* 272 */       this.d = j;
/*     */     }
/*     */ 
/*     */     
/*     */     public el a(double ☃, double d1, double d2) {
/* 277 */       return super.a(☃, d1, d2).h();
/*     */     }
/*     */ 
/*     */     
/*     */     public el a(int ☃, int i, int j) {
/* 282 */       return super.a(☃, i, j).h();
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public el a(eq ☃, int i) {
/* 292 */       return super.a(☃, i).h();
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public el a(bhb ☃) {
/* 302 */       return super.a(☃).h();
/*     */     }
/*     */ 
/*     */     
/*     */     public int o() {
/* 307 */       return this.b;
/*     */     }
/*     */ 
/*     */     
/*     */     public int p() {
/* 312 */       return this.c;
/*     */     }
/*     */ 
/*     */     
/*     */     public int q() {
/* 317 */       return this.d;
/*     */     }
/*     */     
/*     */     public a c(int ☃, int i, int j) {
/* 321 */       this.b = ☃;
/* 322 */       this.c = i;
/* 323 */       this.d = j;
/* 324 */       return this;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public a c(double ☃, double d1, double d2) {
/* 332 */       return c(xq.c(☃), xq.c(d1), xq.c(d2));
/*     */     }
/*     */     
/*     */     public a g(ff ☃) {
/* 336 */       return c(☃.o(), ☃.p(), ☃.q());
/*     */     }
/*     */     
/*     */     public a c(eq ☃) {
/* 340 */       return c(☃, 1);
/*     */     }
/*     */     
/*     */     public a c(eq ☃, int i) {
/* 344 */       return c(this.b + ☃.g() * i, this.c + ☃.h() * i, this.d + ☃.i() * i);
/*     */     }
/*     */     
/*     */     public a d(int ☃, int i, int j) {
/* 348 */       return c(this.b + ☃, this.c + i, this.d + j);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public void p(int ☃) {
/* 360 */       this.c = ☃;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public el h() {
/* 369 */       return new el(this);
/*     */     }
/*     */   }
/*     */   
/*     */   public static Iterable<a> b(el ☃, el el1) {
/* 374 */     return b(
/* 375 */         Math.min(☃.o(), el1.o()), 
/* 376 */         Math.min(☃.p(), el1.p()), 
/* 377 */         Math.min(☃.q(), el1.q()), 
/* 378 */         Math.max(☃.o(), el1.o()), 
/* 379 */         Math.max(☃.p(), el1.p()), 
/* 380 */         Math.max(☃.q(), el1.q()));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static Iterable<a> b(int ☃, int i, int j, int k, int m, int n) {
/* 386 */     return () -> new AbstractIterator<a>(☃, i, j, k, m, n)
/*     */       {
/*     */         private el.a g;
/*     */         
/*     */         protected el.a a() {
/* 391 */           if (this.g == null) {
/*     */             
/* 393 */             this.g = new el.a(this.a, this.b, this.c);
/* 394 */             return this.g;
/* 395 */           }  if (this.g.b == this.d && this.g.c == this.e && this.g.d == this.f)
/*     */           {
/* 397 */             return (el.a)endOfData();
/*     */           }
/*     */           
/* 400 */           if (this.g.b < this.d) {
/* 401 */             this.g.b++;
/* 402 */           } else if (this.g.c < this.e) {
/* 403 */             this.g.b = this.a;
/* 404 */             this.g.c++;
/* 405 */           } else if (this.g.d < this.f) {
/* 406 */             this.g.b = this.a;
/* 407 */             this.g.c = this.b;
/* 408 */             this.g.d++;
/*     */           } 
/* 410 */           return this.g;
/*     */         }
/*     */       };
/*     */   }
/*     */   
/*     */   public static final class b
/*     */     extends a
/*     */     implements AutoCloseable
/*     */   {
/*     */     private boolean f;
/* 420 */     private static final List<b> g = Lists.newArrayList();
/*     */     
/*     */     private b(int ☃, int i, int j) {
/* 423 */       super(☃, i, j);
/*     */     }
/*     */     
/*     */     public static b r() {
/* 427 */       return e(0, 0, 0);
/*     */     }
/*     */     
/*     */     public static b b(aer ☃) {
/* 431 */       return d(☃.q, ☃.r, ☃.s);
/*     */     }
/*     */     
/*     */     public static b d(double ☃, double d1, double d2) {
/* 435 */       return e(xq.c(☃), xq.c(d1), xq.c(d2));
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static b e(int ☃, int i, int j) {
/* 443 */       synchronized (g) {
/* 444 */         if (!g.isEmpty()) {
/* 445 */           b b1 = g.remove(g.size() - 1);
/* 446 */           if (b1 != null && b1.f) {
/* 447 */             b1.f = false;
/* 448 */             b1.f(☃, i, j);
/* 449 */             return b1;
/*     */           } 
/*     */         } 
/*     */       } 
/* 453 */       return new b(☃, i, j);
/*     */     }
/*     */ 
/*     */     
/*     */     public b f(int ☃, int i, int j) {
/* 458 */       return (b)super.c(☃, i, j);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public b e(double ☃, double d1, double d2) {
/* 468 */       return (b)super.c(☃, d1, d2);
/*     */     }
/*     */ 
/*     */     
/*     */     public b j(ff ☃) {
/* 473 */       return (b)super.g(☃);
/*     */     }
/*     */ 
/*     */     
/*     */     public b d(eq ☃) {
/* 478 */       return (b)super.c(☃);
/*     */     }
/*     */ 
/*     */     
/*     */     public b d(eq ☃, int i) {
/* 483 */       return (b)super.c(☃, i);
/*     */     }
/*     */ 
/*     */     
/*     */     public b g(int ☃, int i, int j) {
/* 488 */       return (b)super.d(☃, i, j);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public void close() {
/* 498 */       synchronized (g) {
/* 499 */         if (g.size() < 100) {
/* 500 */           g.add(this);
/*     */         }
/* 502 */         this.f = true;
/*     */       } 
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\el.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */