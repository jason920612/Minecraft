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
/*    */ 
/*    */ public abstract class bkk
/*    */   extends bkl
/*    */ {
/*    */   public boolean a(axz ☃, el el1, blc blc1, Random random) {
/* 19 */     for (int i = 0; i >= -1; i--) {
/* 20 */       for (int j = 0; j >= -1; j--) {
/* 21 */         if (a(blc1, ☃, el1, i, j)) {
/* 22 */           return a(☃, el1, blc1, random, i, j);
/*    */         }
/*    */       } 
/*    */     } 
/*    */     
/* 27 */     return super.a(☃, el1, blc1, random);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   protected abstract bpa<brz> a(Random paramRandom);
/*    */   
/*    */   public boolean a(axz ☃, el el1, blc blc1, Random random, int i, int j) {
/* 34 */     bpa<brz> bpa = a(random);
/* 35 */     if (bpa == null) {
/* 36 */       return false;
/*    */     }
/*    */     
/* 39 */     blc blc2 = bct.a.p();
/* 40 */     ☃.a(el1.a(i, 0, j), blc2, 4);
/* 41 */     ☃.a(el1.a(i + 1, 0, j), blc2, 4);
/* 42 */     ☃.a(el1.a(i, 0, j + 1), blc2, 4);
/* 43 */     ☃.a(el1.a(i + 1, 0, j + 1), blc2, 4);
/*    */     
/* 45 */     if (bpa.a(☃, (bmy)☃.H().f(), random, el1.a(i, 0, j), bqp.e)) {
/* 46 */       return true;
/*    */     }
/* 48 */     ☃.a(el1.a(i, 0, j), blc1, 4);
/* 49 */     ☃.a(el1.a(i + 1, 0, j), blc1, 4);
/* 50 */     ☃.a(el1.a(i, 0, j + 1), blc1, 4);
/* 51 */     ☃.a(el1.a(i + 1, 0, j + 1), blc1, 4);
/* 52 */     return false;
/*    */   }
/*    */   
/*    */   public static boolean a(blc ☃, axk axk1, el el1, int i, int j) {
/* 56 */     bcs bcs = ☃.c();
/* 57 */     return (bcs == axk1.a_(el1.a(i, 0, j)).c() && bcs == axk1
/* 58 */       .a_(el1.a(i + 1, 0, j)).c() && bcs == axk1
/* 59 */       .a_(el1.a(i, 0, j + 1)).c() && bcs == axk1
/* 60 */       .a_(el1.a(i + 1, 0, j + 1)).c());
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bkk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */