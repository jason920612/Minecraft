/*    */ import java.util.Map;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class tq
/*    */ {
/* 14 */   private static final Logger a = LogManager.getLogger();
/*    */   
/*    */   protected bnr[] a(bnd ☃, int i, int j, Map<axm, bnr> map) {
/* 17 */     int k = ☃.c();
/* 18 */     bnr[] arrayOfBnr = new bnr[(1 + 2 * k) * (1 + 2 * k)];
/*    */     
/* 20 */     int m = 0;
/* 21 */     for (int n = -k; n <= k; n++) {
/* 22 */       for (int i1 = -k; i1 <= k; i1++) {
/* 23 */         bnr bnr = map.get(new axm(i + i1, j + n));
/* 24 */         bnr.b(☃.f());
/* 25 */         arrayOfBnr[m++] = bnr;
/*    */       } 
/*    */     } 
/*    */     
/* 29 */     return arrayOfBnr;
/*    */   }
/*    */   
/*    */   public bnr a(bnd ☃, axy axy1, bmy<?> bmy1, Map<axm, bnr> map, int i, int j) {
/* 33 */     bnr[] arrayOfBnr = a(☃, i, j, map);
/*    */     
/* 35 */     return a(☃, axy1, bmy1, arrayOfBnr, i, j);
/*    */   }
/*    */   
/*    */   protected abstract bnr a(bnd parambnd, axy paramaxy, bmy<?> parambmy, bnr[] paramArrayOfbnr, int paramInt1, int paramInt2);
/*    */ }


/* Location:              F:\dw\server.jar!\tq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */