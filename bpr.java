/*    */ import com.google.common.collect.Lists;
/*    */ import java.util.Collections;
/*    */ import java.util.List;
/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bpr
/*    */   extends bpp
/*    */ {
/*    */   protected boolean a(axz ☃, Random random, el el1, blc blc1) {
/* 16 */     el.a a = new el.a(el1);
/*    */     
/* 18 */     int i = random.nextInt(3) + 1;
/* 19 */     for (int j = 0; j < i; j++) {
/* 20 */       if (!b(☃, random, a, blc1)) {
/* 21 */         return true;
/*    */       }
/* 23 */       a.c(eq.b);
/*    */     } 
/* 25 */     el el2 = a.h();
/*    */     
/* 27 */     int k = random.nextInt(3) + 2;
/* 28 */     List<eq> list1 = Lists.newArrayList(eq.c.a);
/* 29 */     Collections.shuffle(list1, random);
/* 30 */     List<eq> list2 = list1.subList(0, k);
/*    */     
/* 32 */     for (eq eq : list2) {
/* 33 */       a.g(el2);
/* 34 */       a.c(eq);
/*    */       
/* 36 */       int m = random.nextInt(5) + 2;
/* 37 */       int n = 0;
/* 38 */       for (int i1 = 0; i1 < m && 
/* 39 */         b(☃, random, a, blc1); i1++) {
/*    */ 
/*    */         
/* 42 */         n++;
/* 43 */         a.c(eq.b);
/*    */         
/* 45 */         if (i1 == 0 || (n >= 2 && random.nextFloat() < 0.25F)) {
/* 46 */           a.c(eq);
/* 47 */           n = 0;
/*    */         } 
/*    */       } 
/*    */     } 
/*    */     
/* 52 */     return true;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bpr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */