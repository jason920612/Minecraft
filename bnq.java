/*     */ import java.util.Arrays;
/*     */ import java.util.Objects;
/*     */ import java.util.concurrent.locks.ReentrantLock;
/*     */ import java.util.function.Function;
/*     */ import java.util.stream.Collectors;
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
/*     */ public class bnq<T>
/*     */   implements bnp<T>
/*     */ {
/*     */   private final bno<T> b;
/*     */   private final bnp<T> c = (☃, object) -> 0;
/*     */   private final eu<T> d;
/*     */   private final Function<gy, T> e;
/*     */   private final Function<T, gy> f;
/*     */   private final T g;
/*     */   protected xd a;
/*     */   private bno<T> h;
/*     */   private int i;
/*  36 */   private final ReentrantLock j = new ReentrantLock();
/*     */   
/*     */   private void b() {
/*  39 */     if (this.j.isLocked() && !this.j.isHeldByCurrentThread()) {
/*     */ 
/*     */       
/*  42 */       String ☃ = Thread.getAllStackTraces().keySet().stream().filter(Objects::nonNull).map(☃ -> ☃.getName() + ": \n\tat " + (String)Arrays.<StackTraceElement>stream(☃.getStackTrace()).map(Object::toString).collect(Collectors.joining("\n\tat "))).collect(Collectors.joining("\n"));
/*  43 */       b b = new b("Writing into PalettedContainer from multiple threads", new IllegalStateException());
/*  44 */       c c = b.a("Thread dumps");
/*  45 */       c.a("Thread dumps", ☃);
/*  46 */       throw new h(b);
/*     */     } 
/*  48 */     this.j.lock();
/*     */   }
/*     */   
/*     */   private void c() {
/*  52 */     this.j.unlock();
/*     */   }
/*     */   
/*     */   public bnq(bno<T> ☃, eu<T> eu1, Function<gy, T> function, Function<T, gy> function1, T t) {
/*  56 */     this.b = ☃;
/*  57 */     this.d = eu1;
/*  58 */     this.e = function;
/*  59 */     this.f = function1;
/*  60 */     this.g = t;
/*  61 */     b(4);
/*     */   }
/*     */   
/*     */   private static int b(int ☃, int i, int j) {
/*  65 */     return i << 8 | j << 4 | ☃;
/*     */   }
/*     */   
/*     */   private void b(int ☃) {
/*  69 */     if (☃ == this.i) {
/*     */       return;
/*     */     }
/*     */     
/*  73 */     this.i = ☃;
/*     */     
/*  75 */     if (this.i <= 4) {
/*  76 */       this.i = 4;
/*  77 */       this.h = new bnl<>(this.d, this.i, this, this.e);
/*  78 */     } else if (this.i < 9) {
/*  79 */       this.h = new bnh<>(this.d, this.i, this, this.e, this.f);
/*     */     } else {
/*  81 */       this.h = this.b;
/*  82 */       this.i = xq.d(this.d.a());
/*     */     } 
/*  84 */     this.h.a(this.g);
/*     */     
/*  86 */     this.a = new xd(this.i, 4096);
/*     */   }
/*     */ 
/*     */   
/*     */   public int onResize(int ☃, T t) {
/*  91 */     b();
/*  92 */     xd xd1 = this.a;
/*  93 */     bno<T> bno1 = this.h;
/*     */     
/*  95 */     b(☃);
/*     */     int i;
/*  97 */     for (i = 0; i < xd1.b(); i++) {
/*  98 */       T t1 = bno1.a(xd1.a(i));
/*  99 */       if (t1 != null) {
/* 100 */         a(i, t1);
/*     */       }
/*     */     } 
/*     */     
/* 104 */     i = this.h.a(t);
/* 105 */     c();
/* 106 */     return i;
/*     */   }
/*     */   
/*     */   public void a(int ☃, int i, int j, T t) {
/* 110 */     b();
/* 111 */     a(b(☃, i, j), t);
/* 112 */     c();
/*     */   }
/*     */   
/*     */   protected void a(int ☃, T t) {
/* 116 */     int i = this.h.a(t);
/* 117 */     this.a.a(☃, i);
/*     */   }
/*     */   
/*     */   public T a(int ☃, int i, int j) {
/* 121 */     return a(b(☃, i, j));
/*     */   }
/*     */   
/*     */   protected T a(int ☃) {
/* 125 */     T t = this.h.a(this.a.a(☃));
/* 126 */     return (t == null) ? this.g : t;
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
/*     */   public void b(hy ☃) {
/* 143 */     b();
/* 144 */     ☃.writeByte(this.i);
/* 145 */     this.h.b(☃);
/* 146 */     ☃.a(this.a.a());
/* 147 */     c();
/*     */   }
/*     */   
/*     */   public void a(gy ☃, String str1, String str2) {
/* 151 */     b();
/* 152 */     he he = ☃.d(str1, 10);
/*     */ 
/*     */     
/* 155 */     int i = Math.max(4, xq.d(he.size()));
/* 156 */     if (i != this.i) {
/* 157 */       b(i);
/*     */     }
/*     */     
/* 160 */     this.h.a(he);
/*     */     
/* 162 */     long[] arrayOfLong = ☃.o(str2);
/* 163 */     int j = arrayOfLong.length * 64 / 4096;
/* 164 */     if (this.h == this.b) {
/* 165 */       bno<T> bno1 = new bnh<>(this.d, i, this.c, this.e, this.f);
/* 166 */       bno1.a(he);
/*     */       
/* 168 */       xd xd1 = new xd(i, 4096, arrayOfLong);
/* 169 */       for (int k = 0; k < 4096; k++) {
/* 170 */         this.a.a(k, this.b.a(bno1.a(xd1.a(k))));
/*     */       }
/*     */     }
/* 173 */     else if (j == this.i) {
/* 174 */       System.arraycopy(arrayOfLong, 0, this.a.a(), 0, arrayOfLong.length);
/*     */     } else {
/*     */       
/* 177 */       xd xd1 = new xd(j, 4096, arrayOfLong);
/* 178 */       for (int k = 0; k < 4096; k++) {
/* 179 */         this.a.a(k, xd1.a(k));
/*     */       }
/*     */     } 
/*     */     
/* 183 */     c();
/*     */   }
/*     */   
/*     */   public void b(gy ☃, String str1, String str2) {
/* 187 */     b();
/* 188 */     bnh<T> bnh = new bnh<>(this.d, this.i, this.c, this.e, this.f);
/*     */     
/* 190 */     bnh.a(this.g);
/*     */     
/* 192 */     int[] arrayOfInt = new int[4096];
/* 193 */     for (int i = 0; i < 4096; i++) {
/* 194 */       arrayOfInt[i] = bnh.a(a(i));
/*     */     }
/*     */     
/* 197 */     he he = new he();
/* 198 */     bnh.b(he);
/* 199 */     ☃.a(str1, he);
/*     */     
/* 201 */     int j = Math.max(4, xq.d(he.size()));
/* 202 */     xd xd1 = new xd(j, 4096);
/* 203 */     for (int k = 0; k < arrayOfInt.length; k++) {
/* 204 */       xd1.a(k, arrayOfInt[k]);
/*     */     }
/* 206 */     ☃.a(str2, xd1.a());
/* 207 */     c();
/*     */   }
/*     */   
/*     */   public int a() {
/* 211 */     return 1 + this.h.a() + hy.a(this.a.b()) + (this.a.a()).length * 8;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bnq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */