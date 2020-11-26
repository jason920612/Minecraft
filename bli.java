/*     */ import com.google.common.base.MoreObjects;
/*     */ import com.google.common.cache.CacheBuilder;
/*     */ import com.google.common.cache.CacheLoader;
/*     */ import com.google.common.cache.LoadingCache;
/*     */ import java.util.function.Predicate;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bli
/*     */ {
/*     */   private final Predicate<blh>[][][] a;
/*     */   private final int b;
/*     */   private final int c;
/*     */   private final int d;
/*     */   
/*     */   public bli(Predicate<blh>[][][] ☃) {
/*  22 */     this.a = ☃;
/*     */     
/*  24 */     this.b = ☃.length;
/*     */     
/*  26 */     if (this.b > 0) {
/*  27 */       this.c = (☃[0]).length;
/*     */       
/*  29 */       if (this.c > 0) {
/*  30 */         this.d = (☃[0][0]).length;
/*     */       } else {
/*  32 */         this.d = 0;
/*     */       } 
/*     */     } else {
/*  35 */       this.c = 0;
/*  36 */       this.d = 0;
/*     */     } 
/*     */   }
/*     */   
/*     */   public int a() {
/*  41 */     return this.b;
/*     */   }
/*     */   
/*     */   public int b() {
/*  45 */     return this.c;
/*     */   }
/*     */   
/*     */   public int c() {
/*  49 */     return this.d;
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
/*     */   @Nullable
/*     */   private b a(el ☃, eq eq1, eq eq2, LoadingCache<el, blh> loadingCache) {
/*  64 */     for (int i = 0; i < this.d; i++) {
/*  65 */       for (int j = 0; j < this.c; j++) {
/*  66 */         for (int k = 0; k < this.b; k++) {
/*  67 */           if (!this.a[k][j][i].test(loadingCache.getUnchecked(a(☃, eq1, eq2, i, j, k)))) {
/*  68 */             return null;
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/*  74 */     return new b(☃, eq1, eq2, loadingCache, this.d, this.c, this.b);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public b a(ayc ☃, el el1) {
/*  79 */     LoadingCache<el, blh> loadingCache = a(☃, false);
/*     */     
/*  81 */     int i = Math.max(Math.max(this.d, this.c), this.b);
/*     */     
/*  83 */     for (el el2 : el.a(el1, el1.a(i - 1, i - 1, i - 1))) {
/*  84 */       for (eq eq : eq.values()) {
/*  85 */         for (eq eq1 : eq.values()) {
/*  86 */           if (eq1 != eq && eq1 != eq.d()) {
/*     */ 
/*     */ 
/*     */             
/*  90 */             b b = a(el2, eq, eq1, loadingCache);
/*  91 */             if (b != null) {
/*  92 */               return b;
/*     */             }
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*  98 */     return null;
/*     */   }
/*     */   
/*     */   public static LoadingCache<el, blh> a(ayc ☃, boolean bool) {
/* 102 */     return CacheBuilder.newBuilder().build(new a(☃, bool));
/*     */   }
/*     */   
/*     */   protected static el a(el ☃, eq eq1, eq eq2, int i, int j, int k) {
/* 106 */     if (eq1 == eq2 || eq1 == eq2.d()) {
/* 107 */       throw new IllegalArgumentException("Invalid forwards & up combination");
/*     */     }
/*     */     
/* 110 */     ff ff1 = new ff(eq1.g(), eq1.h(), eq1.i());
/* 111 */     ff ff2 = new ff(eq2.g(), eq2.h(), eq2.i());
/* 112 */     ff ff3 = ff1.d(ff2);
/*     */     
/* 114 */     return ☃.a(ff2
/* 115 */         .o() * -j + ff3.o() * i + ff1.o() * k, ff2
/* 116 */         .p() * -j + ff3.p() * i + ff1.p() * k, ff2
/* 117 */         .q() * -j + ff3.q() * i + ff1.q() * k);
/*     */   }
/*     */   
/*     */   static class a
/*     */     extends CacheLoader<el, blh> {
/*     */     private final ayc a;
/*     */     private final boolean b;
/*     */     
/*     */     public a(ayc ☃, boolean bool) {
/* 126 */       this.a = ☃;
/* 127 */       this.b = bool;
/*     */     }
/*     */ 
/*     */     
/*     */     public blh a(el ☃) throws Exception {
/* 132 */       return new blh(this.a, ☃, this.b);
/*     */     }
/*     */   }
/*     */   
/*     */   public static class b {
/*     */     private final el a;
/*     */     private final eq b;
/*     */     private final eq c;
/*     */     private final LoadingCache<el, blh> d;
/*     */     private final int e;
/*     */     private final int f;
/*     */     private final int g;
/*     */     
/*     */     public b(el ☃, eq eq1, eq eq2, LoadingCache<el, blh> loadingCache, int i, int j, int k) {
/* 146 */       this.a = ☃;
/* 147 */       this.b = eq1;
/* 148 */       this.c = eq2;
/* 149 */       this.d = loadingCache;
/* 150 */       this.e = i;
/* 151 */       this.f = j;
/* 152 */       this.g = k;
/*     */     }
/*     */     
/*     */     public el a() {
/* 156 */       return this.a;
/*     */     }
/*     */     
/*     */     public eq b() {
/* 160 */       return this.b;
/*     */     }
/*     */     
/*     */     public eq c() {
/* 164 */       return this.c;
/*     */     }
/*     */     
/*     */     public int d() {
/* 168 */       return this.e;
/*     */     }
/*     */     
/*     */     public int e() {
/* 172 */       return this.f;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public blh a(int ☃, int i, int j) {
/* 180 */       return (blh)this.d.getUnchecked(bli.a(this.a, b(), c(), ☃, i, j));
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 185 */       return MoreObjects.toStringHelper(this)
/* 186 */         .add("up", this.c)
/* 187 */         .add("forwards", this.b)
/* 188 */         .add("frontTopLeft", this.a)
/* 189 */         .toString();
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bli.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */