/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bpq
/*    */   extends bpp
/*    */ {
/*    */   protected boolean a(axz ☃, Random random, el el1, blc blc1) {
/* 13 */     int i = random.nextInt(3) + 3;
/* 14 */     int j = random.nextInt(3) + 3;
/* 15 */     int k = random.nextInt(3) + 3;
/*    */     
/* 17 */     int m = random.nextInt(3) + 1;
/*    */     
/* 19 */     el.a a = new el.a(el1);
/*    */ 
/*    */ 
/*    */     
/* 23 */     for (int n = 0; n <= j; n++) {
/* 24 */       for (int i1 = 0; i1 <= i; i1++) {
/* 25 */         for (int i2 = 0; i2 <= k; i2++) {
/* 26 */           a.c(n + el1.o(), i1 + el1.p(), i2 + el1.q());
/* 27 */           a.c(eq.a, m);
/*    */ 
/*    */           
/* 30 */           if ((n != 0 && n != j) || (i1 != 0 && i1 != i))
/*    */           {
/*    */ 
/*    */             
/* 34 */             if ((i2 != 0 && i2 != k) || (i1 != 0 && i1 != i))
/*    */             {
/*    */ 
/*    */               
/* 38 */               if ((n != 0 && n != j) || (i2 != 0 && i2 != k))
/*    */               {
/*    */ 
/*    */ 
/*    */                 
/* 43 */                 if (n == 0 || n == j || i1 == 0 || i1 == i || i2 == 0 || i2 == k)
/*    */                 {
/*    */ 
/*    */ 
/*    */                   
/* 48 */                   if (random.nextFloat() >= 0.1F)
/*    */                   {
/*    */ 
/*    */                     
/* 52 */                     if (!b(☃, random, a, blc1)); }  }  } 
/*    */             }
/*    */           }
/*    */         } 
/*    */       } 
/*    */     } 
/* 58 */     return true;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bpq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */