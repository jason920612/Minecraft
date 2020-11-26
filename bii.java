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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bii
/*    */   extends bhh
/*    */   implements bfv
/*    */ {
/* 25 */   public static final bmh<bmg> c = bhh.b;
/*    */ 
/*    */   
/* 28 */   protected static final cew o = bcs.a(2.0D, 0.0D, 2.0D, 14.0D, 16.0D, 14.0D);
/*    */   
/*    */   public bii(bcs ☃, bcs.c c1) {
/* 31 */     super(☃, c1);
/*    */   }
/*    */ 
/*    */   
/*    */   public cew a(blc ☃, axk axk1, el el1) {
/* 36 */     return o;
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean b(blc ☃, axk axk1, el el1) {
/* 41 */     return (bcs.a(☃.h(axk1, el1), eq.b) && ☃.c() != bct.ik);
/*    */   }
/*    */ 
/*    */   
/*    */   public axx a(blc ☃, axy axy1, el el1, int i) {
/* 46 */     return atf.a;
/*    */   }
/*    */ 
/*    */   
/*    */   public ate a(axk ☃, el el1, blc blc1) {
/* 51 */     return new ate(bct.aU);
/*    */   }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public blc a(ark ☃) {
/* 57 */     blc blc = super.a(☃);
/*    */     
/* 59 */     if (blc != null) {
/* 60 */       byw byw = ☃.k().b(☃.a().a());
/* 61 */       if (byw.a(ww.a) && byw.g() == 8) {
/* 62 */         return blc;
/*    */       }
/*    */     } 
/*    */     
/* 66 */     return null;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(blc ☃, ayc ayc1, el el1) {
/* 71 */     if (☃.c(c) == bmg.a) {
/* 72 */       blc blc1 = ayc1.a_(el1.b());
/* 73 */       return (blc1.c() == this && blc1.c(c) == bmg.b);
/*    */     } 
/*    */     
/* 76 */     byw byw = ayc1.b(el1);
/* 77 */     return (super.a(☃, ayc1, el1) && byw.a(ww.a) && byw.g() == 8);
/*    */   }
/*    */ 
/*    */   
/*    */   public byw h(blc ☃) {
/* 82 */     return byy.c.a(false);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(axk ☃, el el1, blc blc1, byv byv1) {
/* 87 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(axz ☃, el el1, blc blc1, byw byw1) {
/* 92 */     return false;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public int j(blc ☃, axk axk1, el el1) {
/* 98 */     return bct.A.p().b(axk1, el1);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bii.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */