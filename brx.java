/*    */ import com.google.common.collect.Lists;
/*    */ import java.util.List;
/*    */ import java.util.Random;
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
/*    */ public class brx
/*    */   extends btl<brw>
/*    */ {
/* 19 */   private static final List<ayu.e> b = Lists.newArrayList((Object[])new ayu.e[] { new ayu.e((aev)aev.e, 10, 2, 3), new ayu.e((aev)aev.ab, 5, 4, 4), new ayu.e((aev)aev.aG, 8, 5, 5), new ayu.e((aev)aev.ak, 2, 5, 5), new ayu.e((aev)aev.M, 3, 4, 4) });
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected boolean a(bmy<?> ☃, Random random, int i, int j) {
/* 29 */     int k = i >> 4;
/* 30 */     int m = j >> 4;
/*    */     
/* 32 */     random.setSeed((k ^ m << 4) ^ ☃.c());
/* 33 */     random.nextInt();
/*    */     
/* 35 */     if (random.nextInt(3) != 0) {
/* 36 */       return false;
/*    */     }
/* 38 */     if (i != (k << 4) + 4 + random.nextInt(8)) {
/* 39 */       return false;
/*    */     }
/* 41 */     if (j != (m << 4) + 4 + random.nextInt(8)) {
/* 42 */       return false;
/*    */     }
/*    */     
/* 45 */     ayu ayu = ☃.b().a(new el((i << 4) + 9, 0, (j << 4) + 9), ayz.b);
/* 46 */     return ☃.a(ayu, (btl)bqo.p);
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean a(axz ☃) {
/* 51 */     return ☃.g().r();
/*    */   }
/*    */ 
/*    */   
/*    */   protected bxc a(axz ☃, bmy<?> bmy1, boz boz1, int i, int j) {
/* 56 */     ayu ayu = bmy1.b().a(new el((i << 4) + 9, 0, (j << 4) + 9), ayz.b);
/* 57 */     return new a(☃, boz1, i, j, ayu);
/*    */   }
/*    */ 
/*    */   
/*    */   protected String a() {
/* 62 */     return "Fortress";
/*    */   }
/*    */ 
/*    */   
/*    */   public int b() {
/* 67 */     return 8;
/*    */   }
/*    */ 
/*    */   
/*    */   public List<ayu.e> d() {
/* 72 */     return b;
/*    */   }
/*    */   
/*    */   public static class a
/*    */     extends bxc
/*    */   {
/*    */     public a() {}
/*    */     
/*    */     public a(axz ☃, boz boz1, int i, int j, ayu ayu1) {
/* 81 */       super(i, j, ayu1, boz1, ☃.r_());
/*    */       
/* 83 */       bwr.q q = new bwr.q(boz1, (i << 4) + 2, (j << 4) + 2);
/* 84 */       this.a.add(q);
/* 85 */       q.a(q, this.a, boz1);
/*    */       
/* 87 */       List<bxb> list = q.d;
/* 88 */       while (!list.isEmpty()) {
/* 89 */         int k = boz1.nextInt(list.size());
/* 90 */         bxb bxb = list.remove(k);
/* 91 */         bxb.a(q, this.a, boz1);
/*    */       } 
/*    */       
/* 94 */       a(☃);
/* 95 */       a(☃, boz1, 48, 70);
/*    */     }
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\brx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */