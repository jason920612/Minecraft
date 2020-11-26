/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bzx
/*    */ {
/*    */   private final bzh<bzi> a;
/*    */   
/*    */   public bzx(bzh<bzi> ☃) {
/* 14 */     this.a = ☃;
/*    */   }
/*    */   
/*    */   public ayu[] a(int ☃, int i, int j, int k, @Nullable ayu ayu1) {
/* 18 */     bzg bzg = new bzg(☃, i, j, k);
/* 19 */     bzi bzi = this.a.make(bzg);
/* 20 */     ayu[] arrayOfAyu = new ayu[j * k];
/* 21 */     for (int m = 0; m < k; m++) {
/* 22 */       for (int n = 0; n < j; n++) {
/* 23 */         arrayOfAyu[n + m * j] = ayu.a(bzi.a(n, m), ayu1);
/*    */       }
/*    */     } 
/* 26 */     return arrayOfAyu;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bzx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */