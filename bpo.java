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
/*    */ public class bpo
/*    */   extends bpp
/*    */ {
/*    */   protected boolean a(axz ☃, Random random, el el1, blc blc1) {
/* 16 */     if (!b(☃, random, el1, blc1)) {
/* 17 */       return false;
/*    */     }
/*    */     
/* 20 */     eq eq = eq.c.a.a(random);
/* 21 */     int i = random.nextInt(2) + 2;
/*    */     
/* 23 */     List<eq> list1 = Lists.newArrayList((Object[])new eq[] { eq, eq.e(), eq.f() });
/* 24 */     Collections.shuffle(list1, random);
/* 25 */     List<eq> list2 = list1.subList(0, i);
/*    */     
/* 27 */     for (eq eq1 : list2) {
/* 28 */       int k; eq eq2; el.a a = new el.a(el1);
/* 29 */       int j = random.nextInt(2) + 1;
/*    */ 
/*    */ 
/*    */       
/* 33 */       a.c(eq1);
/* 34 */       if (eq1 == eq) {
/* 35 */         eq2 = eq;
/* 36 */         k = random.nextInt(3) + 2;
/*    */       } else {
/* 38 */         a.c(eq.b);
/*    */ 
/*    */         
/* 41 */         eq[] arrayOfEq = { eq1, eq.b };
/* 42 */         eq2 = arrayOfEq[random.nextInt(arrayOfEq.length)];
/* 43 */         k = random.nextInt(3) + 3;
/*    */       } 
/*    */       int m;
/* 46 */       for (m = 0; m < j && 
/* 47 */         b(☃, random, a, blc1); m++)
/*    */       {
/*    */         
/* 50 */         a.c(eq2);
/*    */       }
/* 52 */       a.c(eq2.d());
/* 53 */       a.c(eq.b);
/*    */       
/* 55 */       for (m = 0; m < k; m++) {
/* 56 */         a.c(eq);
/* 57 */         if (!b(☃, random, a, blc1)) {
/*    */           break;
/*    */         }
/*    */         
/* 61 */         if (random.nextFloat() < 0.25F) {
/* 62 */           a.c(eq.b);
/*    */         }
/*    */       } 
/*    */     } 
/*    */     
/* 67 */     return true;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bpo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */