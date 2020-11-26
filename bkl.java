/*    */ import java.util.Random;
/*    */ import javax.annotation.Nullable;
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
/*    */ public abstract class bkl
/*    */ {
/*    */   @Nullable
/*    */   protected abstract bpa<brz> b(Random paramRandom);
/*    */   
/*    */   public boolean a(axz ☃, el el1, blc blc1, Random random) {
/* 20 */     bpa<brz> bpa = b(random);
/* 21 */     if (bpa == null) {
/* 22 */       return false;
/*    */     }
/*    */     
/* 25 */     ☃.a(el1, bct.a.p(), 4);
/*    */     
/* 27 */     if (bpa.a(☃, (bmy)☃.H().f(), random, el1, bqp.e)) {
/* 28 */       return true;
/*    */     }
/* 30 */     ☃.a(el1, blc1, 4);
/* 31 */     return false;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bkl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */