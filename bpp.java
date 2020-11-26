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
/*    */ public abstract class bpp
/*    */   extends bqo<brz>
/*    */ {
/*    */   public boolean a(axz ☃, bmy<? extends bom> bmy1, Random random, el el1, brz brz1) {
/* 20 */     blc blc = ((bcs)wv.I.a(random)).p();
/* 21 */     return a(☃, random, el1, blc);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected boolean b(axz ☃, Random random, el el1, blc blc1) {
/* 27 */     el el2 = el1.a();
/* 28 */     blc blc2 = ☃.a_(el1);
/*    */     
/* 30 */     if ((blc2.c() != bct.A && !blc2.a(wv.L)) || ☃.a_(el2).c() != bct.A) {
/* 31 */       return false;
/*    */     }
/*    */     
/* 34 */     ☃.a(el1, blc1, 3);
/* 35 */     if (random.nextFloat() < 0.25F) {
/* 36 */       ☃.a(el2, ((bcs)wv.L.a(random)).p(), 2);
/* 37 */     } else if (random.nextFloat() < 0.05F) {
/* 38 */       ☃.a(el2, bct.kn.p().a(bhf.a, Integer.valueOf(random.nextInt(4) + 1)), 2);
/*    */     } 
/*    */     
/* 41 */     for (eq eq : eq.c.a) {
/* 42 */       if (random.nextFloat() < 0.2F) {
/* 43 */         el el3 = el1.a(eq);
/* 44 */         if (☃.a_(el3).c() == bct.A) {
/* 45 */           blc blc3 = ((bcs)wv.J.a(random)).p().a(bcl.a, eq);
/* 46 */           ☃.a(el3, blc3, 2);
/*    */         } 
/*    */       } 
/*    */     } 
/*    */     
/* 51 */     return true;
/*    */   }
/*    */   
/*    */   protected abstract boolean a(axz paramaxz, Random paramRandom, el paramel, blc paramblc);
/*    */ }


/* Location:              F:\dw\server.jar!\bpp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */