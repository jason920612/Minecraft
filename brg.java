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
/*    */ public class brg
/*    */   extends bso<brf>
/*    */ {
/*    */   protected String a() {
/* 17 */     return "Igloo";
/*    */   }
/*    */ 
/*    */   
/*    */   public int b() {
/* 22 */     return 3;
/*    */   }
/*    */ 
/*    */   
/*    */   protected bxc a(axz ☃, bmy<?> bmy1, boz boz1, int i, int j) {
/* 27 */     ayu ayu = bmy1.b().a(new el((i << 4) + 9, 0, (j << 4) + 9), ayz.c);
/* 28 */     return new a(☃, bmy1, boz1, i, j, ayu);
/*    */   }
/*    */ 
/*    */   
/*    */   protected int c() {
/* 33 */     return 14357618;
/*    */   }
/*    */   
/*    */   public static class a
/*    */     extends bxc
/*    */   {
/*    */     public a() {}
/*    */     
/*    */     public a(axz ☃, bmy<?> bmy1, boz boz1, int i, int j, ayu ayu1) {
/* 42 */       super(i, j, ayu1, boz1, ☃.r_());
/* 43 */       brf brf = (brf)bmy1.b(ayu1, (btl)bqo.j);
/*    */       
/* 45 */       int k = i * 16;
/* 46 */       int m = j * 16;
/*    */       
/* 48 */       el el = new el(k, 90, m);
/* 49 */       bhb bhb = bhb.values()[boz1.nextInt((bhb.values()).length)];
/* 50 */       bxm bxm = ☃.s_().h();
/* 51 */       bwn.a(bxm, el, bhb, this.a, boz1, brf);
/* 52 */       a(☃);
/*    */     }
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\brg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */