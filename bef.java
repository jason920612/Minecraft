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
/*    */ public class bef
/*    */   extends bep
/*    */ {
/* 17 */   protected static final cew a = bcs.a(1.0D, 0.0D, 1.0D, 15.0D, 16.0D, 15.0D);
/*    */   
/*    */   public bef(bcs.c ☃) {
/* 20 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public cew a(blc ☃, axk axk1, el el1) {
/* 25 */     return a;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(blc ☃, axy axy1, el el1, aog aog1, adk adk1, eq eq1, float f1, float f2, float f3) {
/* 30 */     b(☃, axy1, el1);
/* 31 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(blc ☃, axy axy1, el el1, aog aog1) {
/* 36 */     b(☃, axy1, el1);
/*    */   }
/*    */   
/*    */   private void b(blc ☃, axy axy1, el el1) {
/* 40 */     for (int i = 0; i < 1000; i++) {
/* 41 */       el el2 = el1.a(axy1.s.nextInt(16) - axy1.s.nextInt(16), axy1.s.nextInt(8) - axy1.s.nextInt(8), axy1.s.nextInt(16) - axy1.s.nextInt(16));
/* 42 */       if (axy1.a_(el2).f()) {
/* 43 */         if (axy1.B) {
/* 44 */           for (int j = 0; j < 128; j++) {
/* 45 */             double d1 = axy1.s.nextDouble();
/* 46 */             float f1 = (axy1.s.nextFloat() - 0.5F) * 0.2F;
/* 47 */             float f2 = (axy1.s.nextFloat() - 0.5F) * 0.2F;
/* 48 */             float f3 = (axy1.s.nextFloat() - 0.5F) * 0.2F;
/*    */             
/* 50 */             double d2 = el2.o() + (el1.o() - el2.o()) * d1 + axy1.s.nextDouble() - 0.5D + 0.5D;
/* 51 */             double d3 = el2.p() + (el1.p() - el2.p()) * d1 + axy1.s.nextDouble() - 0.5D;
/* 52 */             double d4 = el2.q() + (el1.q() - el2.q()) * d1 + axy1.s.nextDouble() - 0.5D + 0.5D;
/* 53 */             axy1.a(fm.K, d2, d3, d4, f1, f2, f3);
/*    */           } 
/*    */         } else {
/* 56 */           axy1.a(el2, ☃, 2);
/* 57 */           axy1.g(el1);
/*    */         } 
/*    */         return;
/*    */       } 
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public int a(ayc ☃) {
/* 66 */     return 5;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(blc ☃) {
/* 71 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public blb a(axk ☃, blc blc1, el el1, eq eq1) {
/* 76 */     return blb.i;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(blc ☃, axk axk1, el el1, cbf cbf1) {
/* 81 */     return false;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bef.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */