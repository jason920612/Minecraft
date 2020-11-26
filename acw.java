/*    */ import java.util.concurrent.CompletableFuture;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class acw<K, T extends acx<K, T>, R>
/*    */ {
/*  9 */   private static final Logger a = LogManager.getLogger();
/*    */   
/*    */   private final acu<K, T, R> b;
/*    */   
/*    */   private boolean c;
/*    */   
/* 15 */   private int d = 1000;
/*    */   
/*    */   public acw(acu<K, T, R> ☃) {
/* 18 */     this.b = ☃;
/*    */   }
/*    */   
/*    */   public void a() throws InterruptedException {
/* 22 */     this.b.b();
/*    */   }
/*    */   
/*    */   public void b() {
/* 26 */     if (this.c) {
/* 27 */       throw new RuntimeException("Batch already started.");
/*    */     }
/*    */     
/* 30 */     this.d = 1000;
/*    */     
/* 32 */     this.c = true;
/*    */   }
/*    */   
/*    */   public CompletableFuture<R> a(K ☃) {
/* 36 */     if (!this.c) {
/* 37 */       throw new RuntimeException("Batch not properly started. Please use startBatch to create a new batch.");
/*    */     }
/* 39 */     CompletableFuture<R> completableFuture = this.b.a(☃);
/* 40 */     this.d--;
/* 41 */     if (this.d == 0) {
/* 42 */       completableFuture = this.b.a();
/* 43 */       this.d = 1000;
/*    */     } 
/* 45 */     return completableFuture;
/*    */   }
/*    */   
/*    */   public CompletableFuture<R> c() {
/* 49 */     if (!this.c) {
/* 50 */       throw new RuntimeException("Batch not properly started. Please use startBatch to create a new batch.");
/*    */     }
/*    */     
/* 53 */     if (this.d != 1000) {
/* 54 */       this.b.a();
/*    */     }
/*    */     
/* 57 */     this.c = false;
/* 58 */     return this.b.c();
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\acw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */