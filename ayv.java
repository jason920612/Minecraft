/*    */ import com.google.common.cache.CacheBuilder;
/*    */ import com.google.common.cache.CacheLoader;
/*    */ import com.google.common.cache.LoadingCache;
/*    */ import java.util.concurrent.TimeUnit;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ayv
/*    */ {
/*    */   private final ayw a;
/*    */   
/*    */   public class a
/*    */   {
/*    */     private final ayu[] b;
/*    */     
/*    */     public a(ayv ☃, int i, int j) {
/* 22 */       this.b = ayv.a(☃).a(i << 4, j << 4, 16, 16, false);
/*    */     }
/*    */     
/*    */     public ayu a(int ☃, int i) {
/* 26 */       return this.b[☃ & 0xF | (i & 0xF) << 4];
/*    */     }
/*    */   }
/*    */   
/* 30 */   private final LoadingCache<axm, a> b = CacheBuilder.newBuilder().expireAfterAccess(30000L, TimeUnit.MILLISECONDS).build(new CacheLoader<axm, a>(this)
/*    */       {
/*    */         public ayv.a a(axm ☃) throws Exception {
/* 33 */           return new ayv.a(this.a, ☃.a, ☃.b);
/*    */         }
/*    */       });
/*    */   
/*    */   public ayv(ayw ☃) {
/* 38 */     this.a = ☃;
/*    */   }
/*    */   
/*    */   public a a(int ☃, int i) {
/* 42 */     ☃ >>= 4;
/* 43 */     i >>= 4;
/* 44 */     return (a)this.b.getUnchecked(new axm(☃, i));
/*    */   }
/*    */   
/*    */   public ayu a(int ☃, int i, ayu ayu1) {
/* 48 */     ayu ayu2 = a(☃, i).a(☃, i);
/* 49 */     return (ayu2 == null) ? ayu1 : ayu2;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a() {}
/*    */   
/*    */   public ayu[] b(int ☃, int i) {
/* 56 */     return a.a(a(☃, i));
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\ayv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */