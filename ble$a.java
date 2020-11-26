/*     */ import com.google.common.collect.Maps;
/*     */ import java.util.Collection;
/*     */ import java.util.Map;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class a<O, S extends blf<S>>
/*     */ {
/*     */   private final O a;
/*  96 */   private final Map<String, bmm<?>> b = Maps.newHashMap();
/*     */   
/*     */   public a(O ☃) {
/*  99 */     this.a = ☃;
/*     */   }
/*     */   
/*     */   public a<O, S> a(bmm<?>... ☃) {
/* 103 */     for (bmm<?> bmm1 : ☃) {
/* 104 */       a(bmm1);
/* 105 */       this.b.put(bmm1.a(), bmm1);
/*     */     } 
/* 107 */     return this;
/*     */   }
/*     */   
/*     */   private <T extends Comparable<T>> void a(bmm<T> ☃) {
/* 111 */     String str = ☃.a();
/* 112 */     if (!ble.e().matcher(str).matches()) {
/* 113 */       throw new IllegalArgumentException((new StringBuilder()).append(this.a).append(" has invalidly named property: ").append(str).toString());
/*     */     }
/*     */     
/* 116 */     Collection<T> collection = ☃.d();
/* 117 */     if (collection.size() <= 1) {
/* 118 */       throw new IllegalArgumentException((new StringBuilder()).append(this.a).append(" attempted use property ").append(str).append(" with <= 1 possible values").toString());
/*     */     }
/*     */     
/* 121 */     for (Comparable comparable : collection) {
/* 122 */       String str1 = ☃.a((T)comparable);
/* 123 */       if (!ble.e().matcher(str1).matches()) {
/* 124 */         throw new IllegalArgumentException((new StringBuilder()).append(this.a).append(" has property: ").append(str).append(" with invalidly named value: ").append(str1).toString());
/*     */       }
/*     */     } 
/*     */     
/* 128 */     if (this.b.containsKey(str)) {
/* 129 */       throw new IllegalArgumentException((new StringBuilder()).append(this.a).append(" has duplicate property: ").append(str).toString());
/*     */     }
/*     */   }
/*     */   
/*     */   public <A extends bla<O, S>> ble<O, S> a(ble.b<O, S, A> ☃) {
/* 134 */     return new ble<>(this.a, ☃, this.b);
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\ble$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */