/*    */ import com.google.common.collect.Lists;
/*    */ import java.util.Queue;
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
/*    */ 
/*    */ public class bht
/*    */   extends bcs
/*    */ {
/*    */   protected bht(bcs.c ☃) {
/* 21 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(blc ☃, axy axy1, el el1, blc blc1) {
/* 26 */     if (blc1.c() == ☃.c()) {
/*    */       return;
/*    */     }
/* 29 */     a(axy1, el1);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(blc ☃, axy axy1, el el1, bcs bcs1, el el2) {
/* 34 */     a(axy1, el1);
/* 35 */     super.a(☃, axy1, el1, bcs1, el2);
/*    */   }
/*    */   
/*    */   protected void a(axy ☃, el el1) {
/* 39 */     if (b(☃, el1)) {
/*    */       
/* 41 */       ☃.a(el1, bct.ao.p(), 2);
/* 42 */       ☃.b(2001, el1, bcs.l(bct.A.p()));
/*    */     } 
/*    */   }
/*    */   
/*    */   private boolean b(axy ☃, el el1) {
/* 47 */     Queue<xx<el, Integer>> queue = Lists.newLinkedList();
/* 48 */     queue.add(new xx<>(el1, Integer.valueOf(0)));
/*    */     
/* 50 */     int i = 0;
/* 51 */     while (!queue.isEmpty()) {
/* 52 */       xx<el, Integer> xx = queue.poll();
/* 53 */       el el2 = xx.a();
/* 54 */       int j = ((Integer)xx.b()).intValue();
/*    */       
/* 56 */       for (eq eq : eq.values()) {
/* 57 */         el el3 = el2.a(eq);
/* 58 */         blc blc = ☃.a_(el3);
/* 59 */         byw byw = ☃.b(el3);
/* 60 */         bza bza = blc.d();
/* 61 */         if (byw.a(ww.a)) {
/* 62 */           if (blc.c() instanceof bcz && ((bcz)blc.c()).a(☃, el3, blc) != byy.a) {
/* 63 */             i++;
/* 64 */             if (j < 6) {
/* 65 */               queue.add(new xx<>(el3, Integer.valueOf(j + 1)));
/*    */             }
/* 67 */           } else if (blc.c() instanceof bfu) {
/* 68 */             ☃.a(el3, bct.a.p(), 3);
/* 69 */             i++;
/* 70 */             if (j < 6) {
/* 71 */               queue.add(new xx<>(el3, Integer.valueOf(j + 1)));
/*    */             }
/* 73 */           } else if (bza == bza.f || bza == bza.h) {
/* 74 */             blc.a(☃, el3, 0);
/* 75 */             ☃.a(el3, bct.a.p(), 3);
/* 76 */             i++;
/* 77 */             if (j < 6) {
/* 78 */               queue.add(new xx<>(el3, Integer.valueOf(j + 1)));
/*    */             }
/*    */           } 
/*    */         }
/*    */       } 
/* 83 */       if (i > 64) {
/*    */         break;
/*    */       }
/*    */     } 
/* 87 */     return (i > 0);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bht.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */