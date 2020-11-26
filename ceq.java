/*    */ import it.unimi.dsi.fastutil.doubles.AbstractDoubleList;
/*    */ 
/*    */ public class ceq
/*    */   extends AbstractDoubleList
/*    */ {
/*    */   private final int a;
/*    */   private final int b;
/*    */   
/*    */   ceq(int ☃, int i) {
/* 10 */     this.a = ☃;
/* 11 */     this.b = i;
/*    */   }
/*    */ 
/*    */   
/*    */   public double getDouble(int ☃) {
/* 16 */     return (this.b + ☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public int size() {
/* 21 */     return this.a + 1;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\ceq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */