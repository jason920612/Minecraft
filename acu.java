/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.collect.Streams;
/*     */ import com.google.common.util.concurrent.MoreExecutors;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.concurrent.CompletableFuture;
/*     */ import java.util.concurrent.CompletionStage;
/*     */ import java.util.concurrent.ConcurrentHashMap;
/*     */ import java.util.concurrent.ExecutorService;
/*     */ import java.util.concurrent.Executors;
/*     */ import java.util.concurrent.ForkJoinPool;
/*     */ import java.util.concurrent.ForkJoinWorkerThread;
/*     */ import java.util.concurrent.TimeUnit;
/*     */ import java.util.concurrent.atomic.AtomicInteger;
/*     */ import java.util.function.Supplier;
/*     */ import java.util.stream.Stream;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class acu<K, T extends acx<K, T>, R>
/*     */ {
/*  26 */   private static final Logger b = LogManager.getLogger();
/*     */   
/*     */   protected final ExecutorService a;
/*     */   private final ExecutorService c;
/*  30 */   private final AtomicInteger d = new AtomicInteger(1);
/*     */   
/*  32 */   private final List<CompletableFuture<R>> e = Lists.newArrayList();
/*  33 */   private CompletableFuture<R> f = CompletableFuture.completedFuture(null);
/*     */   
/*  35 */   private CompletableFuture<R> g = CompletableFuture.completedFuture(null);
/*     */   private final Supplier<Map<T, CompletableFuture<R>>> h;
/*     */   private final Supplier<Map<T, CompletableFuture<Void>>> i;
/*     */   private final T j;
/*     */   
/*     */   public acu(String ☃, int i, T t, Supplier<Map<T, CompletableFuture<R>>> supplier, Supplier<Map<T, CompletableFuture<Void>>> supplier1) {
/*  41 */     this.j = t;
/*  42 */     this.h = supplier;
/*  43 */     this.i = supplier1;
/*  44 */     if (i == 0) {
/*  45 */       this.a = (ExecutorService)MoreExecutors.newDirectExecutorService();
/*     */     } else {
/*  47 */       this.a = Executors.newSingleThreadExecutor(new act(☃ + "-Scheduler"));
/*     */     } 
/*  49 */     if (i <= 1) {
/*  50 */       this.c = (ExecutorService)MoreExecutors.newDirectExecutorService();
/*     */     } else {
/*  52 */       this.c = new ForkJoinPool(i - 1, forkJoinPool -> new ForkJoinWorkerThread(this, forkJoinPool, ☃) {  }(☃, throwable) -> b.error(String.format("Caught exception in thread %s", new Object[] { ☃ }), throwable), true);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CompletableFuture<R> a(K ☃) {
/*  60 */     CompletableFuture<R> completableFuture1 = this.f;
/*  61 */     Supplier<CompletableFuture<R>> supplier = () -> a.a((a)b((K)☃), completableFuture, (acx)this.j);
/*  62 */     CompletableFuture<CompletableFuture<R>> completableFuture = CompletableFuture.supplyAsync(supplier, this.a);
/*  63 */     CompletableFuture<R> completableFuture2 = completableFuture.thenComposeAsync(☃ -> ☃, this.c);
/*  64 */     this.e.add(completableFuture2);
/*  65 */     return completableFuture2;
/*     */   }
/*     */ 
/*     */   
/*     */   public CompletableFuture<R> a() {
/*  70 */     CompletableFuture<R> ☃ = this.e.remove(this.e.size() - 1);
/*  71 */     CompletableFuture<R> completableFuture1 = CompletableFuture.allOf((CompletableFuture<?>[])this.e.<CompletableFuture>toArray(new CompletableFuture[0])).thenCompose(void_ -> ☃);
/*  72 */     this.g = completableFuture1;
/*  73 */     this.e.clear();
/*  74 */     this.f = completableFuture1;
/*  75 */     return completableFuture1;
/*     */   }
/*     */ 
/*     */   
/*     */   protected acu$a b(K ☃) {
/*  80 */     return a(☃, true);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b() throws InterruptedException {
/*  87 */     this.a.shutdown();
/*  88 */     this.a.awaitTermination(1L, TimeUnit.DAYS);
/*  89 */     this.c.shutdown();
/*  90 */     this.c.awaitTermination(1L, TimeUnit.DAYS);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public R b(K ☃, boolean bool) {
/* 102 */     acu$a acu$a = a(☃, bool);
/* 103 */     if (acu$a != null) {
/* 104 */       return acu$a.a();
/*     */     }
/* 106 */     return null;
/*     */   } @Nullable
/*     */   protected abstract acu$a a(K paramK, boolean paramBoolean); protected abstract R a(K paramK, T paramT, Map<K, R> paramMap);
/*     */   public CompletableFuture<R> c() {
/* 110 */     CompletableFuture<R> ☃ = this.g;
/*     */     
/* 112 */     return ☃.thenApply(☃ -> ☃);
/*     */   }
/*     */   protected abstract void b(K paramK, acu$a paramacu$a);
/*     */   protected abstract acu$a a(K paramK, acu$a paramacu$a);
/* 116 */   public final class a { private final Map<T, CompletableFuture<R>> b = acu.a(this.a).get();
/*     */     private final K c;
/*     */     private final R d;
/*     */     
/*     */     public a(acu ☃, K k, R r, T t) {
/* 121 */       this.c = k;
/* 122 */       this.d = r;
/* 123 */       while (t != null) {
/* 124 */         this.b.put(t, CompletableFuture.completedFuture(r));
/* 125 */         t = (T)t.a();
/*     */       } 
/*     */     }
/*     */     
/*     */     public R a() {
/* 130 */       return this.d;
/*     */     }
/*     */ 
/*     */     
/*     */     private CompletableFuture<R> a(CompletableFuture<R> ☃, T t) {
/* 135 */       Map<K, CompletableFuture<R>> map = new ConcurrentHashMap<>();
/*     */       
/* 137 */       return this.b.computeIfAbsent(t, acx1 -> {
/*     */             if (☃.a() == null)
/*     */               return CompletableFuture.completedFuture(this.d); 
/*     */             ☃.a(this.c, ());
/*     */             CompletableFuture[] arrayOfCompletableFuture = (CompletableFuture[])Streams.concat(new Stream[] { Stream.of(completableFuture), map.values().stream() }).toArray(());
/*     */             CompletableFuture<R> completableFuture1 = CompletableFuture.allOf((CompletableFuture<?>[])arrayOfCompletableFuture).thenApplyAsync((), acu.b(this.a)).thenApplyAsync((), this.a.a);
/*     */             this.b.put((T)☃, completableFuture1);
/*     */             return completableFuture1;
/*     */           });
/*     */     } }
/*     */ 
/*     */ }


/* Location:              F:\dw\server.jar!\acu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */