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
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bwt
/*    */   extends bso<bsc>
/*    */ {
/*    */   public String a() {
/* 21 */     return "Ocean_Ruin";
/*    */   }
/*    */ 
/*    */   
/*    */   public int b() {
/* 26 */     return 3;
/*    */   }
/*    */ 
/*    */   
/*    */   protected int a(bmy<?> ☃) {
/* 31 */     return ☃.a().l();
/*    */   }
/*    */ 
/*    */   
/*    */   protected int b(bmy<?> ☃) {
/* 36 */     return ☃.a().m();
/*    */   }
/*    */ 
/*    */   
/*    */   protected bxc a(axz ☃, bmy<?> bmy1, boz boz1, int i, int j) {
/* 41 */     ayu ayu = bmy1.b().a(new el((i << 4) + 9, 0, (j << 4) + 9), null);
/* 42 */     return new a(☃, bmy1, boz1, i, j, ayu);
/*    */   }
/*    */ 
/*    */   
/*    */   protected int c() {
/* 47 */     return 14357621;
/*    */   }
/*    */   
/*    */   public static class a
/*    */     extends bxc {
/*    */     public a() {}
/*    */     
/*    */     public a(axz ☃, bmy<?> bmy1, boz boz1, int i, int j, ayu ayu1) {
/* 55 */       super(i, j, ayu1, boz1, ☃.r_());
/* 56 */       bsc bsc = (bsc)bmy1.b(ayu1, (btl)bqo.o);
/*    */       
/* 58 */       int k = i * 16;
/* 59 */       int m = j * 16;
/*    */       
/* 61 */       el el = new el(k, 90, m);
/* 62 */       bhb bhb = bhb.values()[boz1.nextInt((bhb.values()).length)];
/* 63 */       bxm bxm = ☃.s_().h();
/* 64 */       bwu.a(bxm, el, bhb, this.a, boz1, bsc);
/* 65 */       a(☃);
/*    */     }
/*    */   }
/*    */   
/*    */   public enum b {
/* 70 */     a,
/* 71 */     b;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bwt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */