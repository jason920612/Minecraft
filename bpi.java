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
/*    */ public class bpi
/*    */   extends btl<bph>
/*    */ {
/*    */   protected boolean a(bmy<?> ☃, Random random, int i, int j) {
/* 18 */     ayu ayu = ☃.b().a(new el((i << 4) + 9, 0, (j << 4) + 9), null);
/* 19 */     if (☃.a(ayu, (btl)bqo.r)) {
/* 20 */       ((boz)random).a(☃.c(), i, j, 10387320);
/* 21 */       bph bph = (bph)☃.b(ayu, (btl)bqo.r);
/* 22 */       return (random.nextFloat() < bph.a);
/*    */     } 
/* 24 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean a(axz ☃) {
/* 29 */     return ☃.g().r();
/*    */   }
/*    */ 
/*    */   
/*    */   protected bxc a(axz ☃, bmy<?> bmy1, boz boz1, int i, int j) {
/* 34 */     ayu ayu = bmy1.b().a(new el((i << 4) + 9, 0, (j << 4) + 9), null);
/* 35 */     return new a(☃, bmy1, boz1, i, j, ayu);
/*    */   }
/*    */ 
/*    */   
/*    */   protected String a() {
/* 40 */     return "Buried_Treasure";
/*    */   }
/*    */ 
/*    */   
/*    */   public int b() {
/* 45 */     return 1;
/*    */   }
/*    */   
/*    */   public static class a
/*    */     extends bxc {
/*    */     public a() {}
/*    */     
/*    */     public a(axz ☃, bmy<?> bmy1, boz boz1, int i, int j, ayu ayu1) {
/* 53 */       super(i, j, ayu1, boz1, ☃.r_());
/*    */       
/* 55 */       int k = i * 16;
/* 56 */       int m = j * 16;
/*    */       
/* 58 */       el el = new el(k + 9, 90, m + 9);
/*    */       
/* 60 */       this.a.add(new bwg.a(el));
/* 61 */       a(☃);
/*    */     }
/*    */ 
/*    */     
/*    */     public el a() {
/* 66 */       return new el((this.c << 4) + 9, 0, (this.d << 4) + 9);
/*    */     }
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bpi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */