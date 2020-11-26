/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.collect.Streams;
/*     */ import java.util.Map;
/*     */ import java.util.concurrent.CompletableFuture;
/*     */ import java.util.concurrent.ConcurrentHashMap;
/*     */ import java.util.stream.Stream;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class a
/*     */ {
/* 116 */   private final Map<T, CompletableFuture<R>> b = acu.a(this.a).get();
/*     */   private final K c;
/*     */   private final R d;
/*     */   
/*     */   public a(acu ☃, K k, R r, T t) {
/* 121 */     this.c = k;
/* 122 */     this.d = r;
/* 123 */     while (t != null) {
/* 124 */       this.b.put(t, CompletableFuture.completedFuture(r));
/* 125 */       t = (T)t.a();
/*     */     } 
/*     */   }
/*     */   
/*     */   public R a() {
/* 130 */     return this.d;
/*     */   }
/*     */ 
/*     */   
/*     */   private CompletableFuture<R> a(CompletableFuture<R> ☃, T t) {
/* 135 */     Map<K, CompletableFuture<R>> map = new ConcurrentHashMap<>();
/*     */     
/* 137 */     return this.b.computeIfAbsent(t, acx1 -> {
/*     */           if (☃.a() == null)
/*     */             return CompletableFuture.completedFuture(this.d); 
/*     */           ☃.a(this.c, ());
/*     */           CompletableFuture[] arrayOfCompletableFuture = (CompletableFuture[])Streams.concat(new Stream[] { Stream.of(completableFuture), map.values().stream() }).toArray(());
/*     */           CompletableFuture<R> completableFuture1 = CompletableFuture.allOf((CompletableFuture<?>[])arrayOfCompletableFuture).thenApplyAsync((), acu.b(this.a)).thenApplyAsync((), this.a.a);
/*     */           this.b.put((T)☃, completableFuture1);
/*     */           return completableFuture1;
/*     */         });
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\acu$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */