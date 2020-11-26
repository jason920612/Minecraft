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
/*    */ 
/*    */ public class bqh
/*    */   extends bqo<bqg>
/*    */ {
/*    */   public boolean a(axz ☃, bmy<? extends bom> bmy1, Random random, el el1, bqg bqg1) {
/* 19 */     boolean bool = false;
/*    */     
/* 21 */     for (int i = 0; i < 64; i++) {
/* 22 */       el el2 = el1.a(random.nextInt(8) - random.nextInt(8), random.nextInt(4) - random.nextInt(4), random.nextInt(8) - random.nextInt(8));
/*    */       
/* 24 */       if (☃.c(el2) && el2.p() < 254 && 
/* 25 */         bqg1.a.a(☃, el2)) {
/*    */         
/* 27 */         ((bee)bqg1.a.c()).a(☃, el2, 2);
/* 28 */         bool = true;
/*    */       } 
/*    */     } 
/*    */ 
/*    */     
/* 33 */     return bool;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bqh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */