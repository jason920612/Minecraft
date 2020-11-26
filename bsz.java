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
/*    */ public class bsz
/*    */   extends bso<bsy>
/*    */ {
/*    */   protected String a() {
/* 17 */     return "Shipwreck";
/*    */   }
/*    */ 
/*    */   
/*    */   public int b() {
/* 22 */     return 3;
/*    */   }
/*    */ 
/*    */   
/*    */   protected bxc a(axz ☃, bmy<?> bmy1, boz boz1, int i, int j) {
/* 27 */     ayu ayu = bmy1.b().a(new el((i << 4) + 9, 0, (j << 4) + 9), null);
/* 28 */     return new a(☃, bmy1, boz1, i, j, ayu);
/*    */   }
/*    */ 
/*    */   
/*    */   protected int c() {
/* 33 */     return 165745295;
/*    */   }
/*    */ 
/*    */   
/*    */   protected int a(bmy<?> ☃) {
/* 38 */     return ☃.a().j();
/*    */   }
/*    */ 
/*    */   
/*    */   protected int b(bmy<?> ☃) {
/* 43 */     return ☃.a().k();
/*    */   }
/*    */   
/*    */   public static class a
/*    */     extends bxc
/*    */   {
/*    */     public a() {}
/*    */     
/*    */     public a(axz ☃, bmy<?> bmy1, boz boz1, int i, int j, ayu ayu1) {
/* 52 */       super(i, j, ayu1, boz1, ☃.r_());
/* 53 */       bsy bsy = (bsy)bmy1.b(ayu1, (btl)bqo.k);
/*    */       
/* 55 */       bhb bhb = bhb.values()[boz1.nextInt((bhb.values()).length)];
/* 56 */       el el = new el(i * 16, 90, j * 16);
/*    */       
/* 58 */       bww.a(☃.s_().h(), el, bhb, this.a, boz1, bsy);
/* 59 */       a(☃);
/*    */     }
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bsz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */