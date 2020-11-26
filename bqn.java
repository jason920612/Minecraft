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
/*    */ 
/*    */ public class bqn
/*    */   extends bqo<brz>
/*    */ {
/* 19 */   public static final el a = el.a;
/*    */   
/*    */   private final boolean b;
/*    */   
/*    */   public bqn(boolean ☃) {
/* 24 */     this.b = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(axz ☃, bmy<? extends bom> bmy1, Random random, el el1, brz brz1) {
/* 29 */     for (el.a a : el.b(new el(el1.o() - 4, el1.p() - 1, el1.q() - 4), new el(el1.o() + 4, el1.p() + 32, el1.q() + 4))) {
/* 30 */       double d = a.h(el1.o(), a.p(), el1.q());
/*    */       
/* 32 */       if (d <= 3.5D) {
/* 33 */         if (a.p() < el1.p()) {
/* 34 */           if (d <= 2.5D) {
/*    */             
/* 36 */             a(☃, a, bct.z.p()); continue;
/* 37 */           }  if (a.p() < el1.p())
/*    */           {
/* 39 */             a(☃, a, bct.eg.p()); }  continue;
/*    */         } 
/* 41 */         if (a.p() > el1.p()) {
/*    */           
/* 43 */           a(☃, a, bct.a.p()); continue;
/* 44 */         }  if (d > 2.5D) {
/*    */           
/* 46 */           a(☃, a, bct.z.p()); continue;
/* 47 */         }  if (this.b) {
/*    */           
/* 49 */           a(☃, new el(a), bct.ee.p()); continue;
/*    */         } 
/* 51 */         a(☃, new el(a), bct.a.p());
/*    */       } 
/*    */     } 
/*    */ 
/*    */ 
/*    */     
/* 57 */     for (int i = 0; i < 4; i++) {
/* 58 */       a(☃, el1.b(i), bct.z.p());
/*    */     }
/*    */     
/* 61 */     el el2 = el1.b(2);
/* 62 */     for (eq eq : eq.c.a) {
/* 63 */       a(☃, el2.a(eq), bct.cg.p().a(biv.a, eq));
/*    */     }
/*    */     
/* 66 */     return true;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bqn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */