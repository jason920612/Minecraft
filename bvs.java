/*    */ import com.google.common.cache.CacheBuilder;
/*    */ import com.google.common.cache.CacheLoader;
/*    */ import com.google.common.cache.LoadingCache;
/*    */ import com.google.common.collect.ContiguousSet;
/*    */ import com.google.common.collect.DiscreteDomain;
/*    */ import com.google.common.collect.Lists;
/*    */ import com.google.common.collect.Range;
/*    */ import java.util.Collections;
/*    */ import java.util.List;
/*    */ import java.util.Random;
/*    */ import java.util.concurrent.TimeUnit;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bvs
/*    */   extends bvg<bry>
/*    */ {
/* 28 */   private static final LoadingCache<Long, btf.a[]> a = CacheBuilder.newBuilder().expireAfterWrite(5L, TimeUnit.MINUTES).build(new a());
/*    */ 
/*    */   
/*    */   public <C extends bqp> boolean a(axz ☃, bmy<? extends bom> bmy1, Random random, el el1, bry bry1, bqo<C> bqo1, C c) {
/* 32 */     btf.a[] arrayOfA = a(☃);
/* 33 */     boolean bool = false;
/*    */ 
/*    */     
/* 36 */     for (btf.a a : arrayOfA) {
/* 37 */       if (a.a(el1)) {
/* 38 */         ((btf)bqo1).a(a);
/* 39 */         bool |= ((btf)bqo1).a(☃, bmy1, random, new el(a.a(), 45, a.b()), bqp.e);
/*    */       } 
/*    */     } 
/*    */     
/* 43 */     return bool;
/*    */   }
/*    */   
/*    */   public static btf.a[] a(axz ☃) {
/* 47 */     Random random = new Random(☃.r_());
/* 48 */     long l = random.nextLong() & 0xFFFFL;
/* 49 */     return (btf.a[])a.getUnchecked(Long.valueOf(l));
/*    */   }
/*    */   
/*    */   static class a
/*    */     extends CacheLoader<Long, btf.a[]> {
/*    */     public btf.a[] a(Long ☃) throws Exception {
/* 55 */       List<Integer> list = Lists.newArrayList((Iterable)ContiguousSet.create(Range.closedOpen(Integer.valueOf(0), Integer.valueOf(10)), DiscreteDomain.integers()));
/* 56 */       Collections.shuffle(list, new Random(☃.longValue()));
/*    */       
/* 58 */       btf.a[] arrayOfA = new btf.a[10];
/* 59 */       for (int i = 0; i < 10; i++) {
/* 60 */         int j = (int)(42.0D * Math.cos(2.0D * (-3.141592653589793D + 0.3141592653589793D * i)));
/* 61 */         int k = (int)(42.0D * Math.sin(2.0D * (-3.141592653589793D + 0.3141592653589793D * i)));
/* 62 */         int m = ((Integer)list.get(i)).intValue();
/* 63 */         int n = 2 + m / 3;
/* 64 */         int i1 = 76 + m * 3;
/* 65 */         boolean bool = (m == 1 || m == 2);
/* 66 */         arrayOfA[i] = new btf.a(j, k, n, i1, bool);
/*    */       } 
/* 68 */       return arrayOfA;
/*    */     }
/*    */     
/*    */     private a() {}
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bvs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */