/*     */ import com.google.common.collect.Iterators;
/*     */ import java.util.Arrays;
/*     */ import java.util.Comparator;
/*     */ import java.util.Iterator;
/*     */ import java.util.Map;
/*     */ import java.util.Random;
/*     */ import java.util.function.Predicate;
/*     */ import java.util.stream.Collectors;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ public enum eq
/*     */   implements xv {
/*     */   private final int g;
/*     */   private final int h;
/*     */   private final int i;
/*     */   private final String j;
/*     */   private final a k;
/*     */   private final b l;
/*  19 */   a(0, 1, -1, "down", b.b, a.b, new ff(0, -1, 0)),
/*  20 */   b(1, 0, -1, "up", b.a, a.b, new ff(0, 1, 0)),
/*  21 */   c(2, 3, 2, "north", b.b, a.c, new ff(0, 0, -1)),
/*  22 */   d(3, 2, 0, "south", b.a, a.c, new ff(0, 0, 1)),
/*  23 */   e(4, 5, 1, "west", b.b, a.a, new ff(-1, 0, 0)),
/*  24 */   f(5, 4, 3, "east", b.a, a.a, new ff(1, 0, 0));
/*     */   
/*     */   private final ff m;
/*     */   
/*     */   private static final eq[] n;
/*     */   
/*     */   private static final Map<String, eq> o;
/*     */   private static final eq[] p;
/*     */   private static final eq[] q;
/*     */   
/*     */   static {
/*  35 */     n = values();
/*     */     
/*  37 */     o = (Map<String, eq>)Arrays.<eq>stream(n).collect(Collectors.toMap(eq::j, ☃ -> ☃));
/*  38 */     p = (eq[])Arrays.<eq>stream(n).sorted(Comparator.comparingInt(☃ -> ☃.g)).toArray(☃ -> new eq[☃]);
/*  39 */     q = (eq[])Arrays.<eq>stream(n).filter(☃ -> ☃.k().c()).sorted(Comparator.comparingInt(☃ -> ☃.i)).toArray(☃ -> new eq[☃]);
/*     */   }
/*     */   eq(int ☃, int i, int j, String str1, b b1, a a1, ff ff1) {
/*  42 */     this.g = ☃;
/*  43 */     this.i = j;
/*  44 */     this.h = i;
/*  45 */     this.j = str1;
/*  46 */     this.k = a1;
/*  47 */     this.l = b1;
/*  48 */     this.m = ff1;
/*     */   }
/*     */   
/*     */   public static eq[] a(aer ☃) {
/*  52 */     float f1 = ☃.g(1.0F) * 0.017453292F;
/*  53 */     float f2 = -☃.h(1.0F) * 0.017453292F;
/*     */     
/*  55 */     float f3 = xq.a(f1);
/*  56 */     float f4 = xq.b(f1);
/*  57 */     float f5 = xq.a(f2);
/*  58 */     float f6 = xq.b(f2);
/*     */     
/*  60 */     boolean bool1 = (f5 > 0.0F);
/*  61 */     boolean bool2 = (f3 < 0.0F);
/*  62 */     boolean bool3 = (f6 > 0.0F);
/*     */     
/*  64 */     float f7 = bool1 ? f5 : -f5;
/*  65 */     float f8 = bool2 ? -f3 : f3;
/*  66 */     float f9 = bool3 ? f6 : -f6;
/*     */     
/*  68 */     float f10 = f7 * f4;
/*  69 */     float f11 = f9 * f4;
/*     */     
/*  71 */     eq eq1 = bool1 ? f : e;
/*  72 */     eq eq2 = bool2 ? b : a;
/*  73 */     eq eq3 = bool3 ? d : c;
/*     */     
/*  75 */     if (f7 > f9) {
/*  76 */       if (f8 > f10)
/*  77 */         return a(eq2, eq1, eq3); 
/*  78 */       if (f11 > f8) {
/*  79 */         return a(eq1, eq3, eq2);
/*     */       }
/*  81 */       return a(eq1, eq2, eq3);
/*     */     } 
/*     */     
/*  84 */     if (f8 > f11)
/*  85 */       return a(eq2, eq3, eq1); 
/*  86 */     if (f10 > f8) {
/*  87 */       return a(eq3, eq1, eq2);
/*     */     }
/*  89 */     return a(eq3, eq2, eq1);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private static eq[] a(eq ☃, eq eq1, eq eq2) {
/*  95 */     return new eq[] { ☃, eq1, eq2, eq2.d(), eq1.d(), ☃.d() };
/*     */   }
/*     */   
/*     */   public int a() {
/*  99 */     return this.g;
/*     */   }
/*     */   
/*     */   public int b() {
/* 103 */     return this.i;
/*     */   }
/*     */   
/*     */   public b c() {
/* 107 */     return this.l;
/*     */   }
/*     */   
/*     */   public eq d() {
/* 111 */     return a(this.h);
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
/*     */   public eq e() {
/* 165 */     switch (null.b[ordinal()]) {
/*     */       case 1:
/* 167 */         return f;
/*     */       case 2:
/* 169 */         return d;
/*     */       case 3:
/* 171 */         return e;
/*     */       case 4:
/* 173 */         return c;
/*     */     } 
/* 175 */     throw new IllegalStateException("Unable to get Y-rotated facing of " + this);
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
/*     */   public eq f() {
/* 240 */     switch (null.b[ordinal()]) {
/*     */       case 1:
/* 242 */         return e;
/*     */       case 2:
/* 244 */         return c;
/*     */       case 3:
/* 246 */         return f;
/*     */       case 4:
/* 248 */         return d;
/*     */     } 
/* 250 */     throw new IllegalStateException("Unable to get CCW facing of " + this);
/*     */   }
/*     */ 
/*     */   
/*     */   public int g() {
/* 255 */     return (this.k == a.a) ? this.l.a() : 0;
/*     */   }
/*     */   
/*     */   public int h() {
/* 259 */     return (this.k == a.b) ? this.l.a() : 0;
/*     */   }
/*     */   
/*     */   public int i() {
/* 263 */     return (this.k == a.c) ? this.l.a() : 0;
/*     */   }
/*     */   
/*     */   public String j() {
/* 267 */     return this.j;
/*     */   }
/*     */   
/*     */   public a k() {
/* 271 */     return this.k;
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
/*     */   public static eq a(int ☃) {
/* 283 */     return p[xq.a(☃ % p.length)];
/*     */   }
/*     */   
/*     */   public static eq b(int ☃) {
/* 287 */     return q[xq.a(☃ % q.length)];
/*     */   }
/*     */   
/*     */   public static eq a(double ☃) {
/* 291 */     return b(xq.c(☃ / 90.0D + 0.5D) & 0x3);
/*     */   }
/*     */   
/*     */   public static eq a(a ☃, b b1) {
/* 295 */     switch (null.a[☃.ordinal()]) {
/*     */       case 1:
/* 297 */         return (b1 == b.a) ? f : e;
/*     */       case 2:
/* 299 */         return (b1 == b.a) ? b : a;
/*     */     } 
/*     */     
/* 302 */     return (b1 == b.a) ? d : c;
/*     */   }
/*     */ 
/*     */   
/*     */   public float l() {
/* 307 */     return ((this.i & 0x3) * 90);
/*     */   }
/*     */   
/*     */   public static eq a(Random ☃) {
/* 311 */     return values()[☃.nextInt((values()).length)];
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
/*     */ 
/*     */   
/*     */   public static eq a(double ☃, double d1, double d2) {
/* 328 */     return a((float)☃, (float)d1, (float)d2);
/*     */   }
/*     */   
/*     */   public static eq a(float ☃, float f1, float f2) {
/* 332 */     eq eq1 = c;
/* 333 */     float f = Float.MIN_VALUE;
/* 334 */     for (eq eq2 : n) {
/* 335 */       float f3 = ☃ * eq2.m.o() + f1 * eq2.m.p() + f2 * eq2.m.q();
/*     */       
/* 337 */       if (f3 > f) {
/* 338 */         f = f3;
/* 339 */         eq1 = eq2;
/*     */       } 
/*     */     } 
/* 342 */     return eq1;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 347 */     return this.j;
/*     */   }
/*     */ 
/*     */   
/*     */   public String m() {
/* 352 */     return this.j;
/*     */   }
/*     */   
/*     */   public static eq a(b ☃, a a1) {
/* 356 */     for (eq eq1 : values()) {
/* 357 */       if (eq1.c() == ☃ && eq1.k() == a1) {
/* 358 */         return eq1;
/*     */       }
/*     */     } 
/* 361 */     throw new IllegalArgumentException("No such direction: " + ☃ + " " + a1);
/*     */   }
/*     */   
/*     */   public enum a implements Predicate<eq>, xv {
/* 365 */     a("x")
/*     */     {
/*     */       public int a(int ☃, int i, int j) {
/* 368 */         return ☃;
/*     */       }
/*     */ 
/*     */       
/*     */       public double a(double ☃, double d1, double d2) {
/* 373 */         return ☃;
/*     */       }
/*     */     },
/* 376 */     b("y")
/*     */     {
/*     */       public int a(int ☃, int i, int j) {
/* 379 */         return i;
/*     */       }
/*     */ 
/*     */       
/*     */       public double a(double ☃, double d1, double d2) {
/* 384 */         return d1;
/*     */       }
/*     */     },
/* 387 */     c("z")
/*     */     {
/*     */       public int a(int ☃, int i, int j) {
/* 390 */         return j;
/*     */       }
/*     */ 
/*     */       
/*     */       public double a(double ☃, double d1, double d2) {
/* 395 */         return d2;
/*     */       } };
/*     */     private static final Map<String, a> d;
/*     */     
/*     */     static {
/* 400 */       d = (Map<String, a>)Arrays.<a>stream(values()).collect(Collectors.toMap(a::a, ☃ -> ☃));
/*     */     }
/*     */     private final String e;
/*     */     
/*     */     a(String ☃) {
/* 405 */       this.e = ☃;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public String a() {
/* 414 */       return this.e;
/*     */     }
/*     */     
/*     */     public boolean b() {
/* 418 */       return (this == b);
/*     */     }
/*     */     
/*     */     public boolean c() {
/* 422 */       return (this == a || this == c);
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 427 */       return this.e;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a(@Nullable eq ☃) {
/* 432 */       return (☃ != null && ☃.k() == this);
/*     */     }
/*     */     
/*     */     public eq.c d() {
/* 436 */       switch (eq.null.a[ordinal()]) {
/*     */         case 1:
/*     */         case 3:
/* 439 */           return eq.c.a;
/*     */         case 2:
/* 441 */           return eq.c.b;
/*     */       } 
/* 443 */       throw new Error("Someone's been tampering with the universe!");
/*     */     }
/*     */ 
/*     */     
/*     */     public String m() {
/* 448 */       return this.e;
/*     */     }
/*     */     
/*     */     public abstract int a(int param1Int1, int param1Int2, int param1Int3);
/*     */     
/*     */     public abstract double a(double param1Double1, double param1Double2, double param1Double3);
/*     */   }
/*     */   
/*     */   public enum b {
/* 457 */     a(1, "Towards positive"),
/* 458 */     b(-1, "Towards negative");
/*     */     
/*     */     private final int c;
/*     */     
/*     */     private final String d;
/*     */     
/*     */     b(int ☃, String str1) {
/* 465 */       this.c = ☃;
/* 466 */       this.d = str1;
/*     */     }
/*     */     
/*     */     public int a() {
/* 470 */       return this.c;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public String toString() {
/* 479 */       return this.d;
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public enum c
/*     */     implements Iterable<eq>, Predicate<eq>
/*     */   {
/* 488 */     a((String)new eq[] { eq.c, eq.f, eq.d, eq.e }, new eq.a[] { eq.a.a, eq.a.c }),
/* 489 */     b((String)new eq[] { eq.b, eq.a }, new eq.a[] { eq.a.b });
/*     */     
/*     */     private final eq[] c;
/*     */     
/*     */     private final eq.a[] d;
/*     */     
/*     */     c(eq[] ☃, eq.a[] arrayOfA) {
/* 496 */       this.c = ☃;
/* 497 */       this.d = arrayOfA;
/*     */     }
/*     */     
/*     */     public eq a(Random ☃) {
/* 501 */       return this.c[☃.nextInt(this.c.length)];
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public boolean a(@Nullable eq ☃) {
/* 510 */       return (☃ != null && ☃.k().d() == this);
/*     */     }
/*     */ 
/*     */     
/*     */     public Iterator<eq> iterator() {
/* 515 */       return (Iterator<eq>)Iterators.forArray((Object[])this.c);
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\eq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */