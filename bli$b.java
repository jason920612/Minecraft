/*     */ import com.google.common.base.MoreObjects;
/*     */ import com.google.common.cache.LoadingCache;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class b
/*     */ {
/*     */   private final el a;
/*     */   private final eq b;
/*     */   private final eq c;
/*     */   private final LoadingCache<el, blh> d;
/*     */   private final int e;
/*     */   private final int f;
/*     */   private final int g;
/*     */   
/*     */   public b(el ☃, eq eq1, eq eq2, LoadingCache<el, blh> loadingCache, int i, int j, int k) {
/* 146 */     this.a = ☃;
/* 147 */     this.b = eq1;
/* 148 */     this.c = eq2;
/* 149 */     this.d = loadingCache;
/* 150 */     this.e = i;
/* 151 */     this.f = j;
/* 152 */     this.g = k;
/*     */   }
/*     */   
/*     */   public el a() {
/* 156 */     return this.a;
/*     */   }
/*     */   
/*     */   public eq b() {
/* 160 */     return this.b;
/*     */   }
/*     */   
/*     */   public eq c() {
/* 164 */     return this.c;
/*     */   }
/*     */   
/*     */   public int d() {
/* 168 */     return this.e;
/*     */   }
/*     */   
/*     */   public int e() {
/* 172 */     return this.f;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public blh a(int ☃, int i, int j) {
/* 180 */     return (blh)this.d.getUnchecked(bli.a(this.a, b(), c(), ☃, i, j));
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 185 */     return MoreObjects.toStringHelper(this)
/* 186 */       .add("up", this.c)
/* 187 */       .add("forwards", this.b)
/* 188 */       .add("frontTopLeft", this.a)
/* 189 */       .toString();
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bli$b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */