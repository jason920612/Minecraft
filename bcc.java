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
/*    */ public abstract class bcc
/*    */   extends bcm
/*    */ {
/*    */   private final bhk.a a;
/*    */   
/*    */   public bcc(bhk.a ☃, bcs.c c1) {
/* 20 */     super(c1);
/* 21 */     this.a = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(blc ☃) {
/* 26 */     return false;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public bji a(axk ☃) {
/* 36 */     return new bkd();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void a(blc ☃, axy axy1, el el1, float f, int i) {}
/*    */ 
/*    */ 
/*    */   
/*    */   public void a(axy ☃, el el1, blc blc1, aog aog1) {
/* 47 */     if (!☃.B && aog1.bV.d)
/*    */     {
/* 49 */       bkd.a(☃, el1);
/*    */     }
/* 51 */     super.a(☃, el1, blc1, aog1);
/*    */   }
/*    */ 
/*    */   
/*    */   public blb a(axk ☃, blc blc1, el el1, eq eq1) {
/* 56 */     return blb.i;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(blc ☃, axy axy1, el el1, blc blc1, boolean bool) {
/* 61 */     if (☃.c() == blc1.c() || axy1.B) {
/*    */       return;
/*    */     }
/*    */     
/* 65 */     bji bji = axy1.f(el1);
/* 66 */     if (bji instanceof bkd) {
/* 67 */       bkd bkd = (bkd)bji;
/* 68 */       if (bkd.d()) {
/* 69 */         ate ate = a(axy1, el1, ☃);
/*    */         
/* 71 */         bcs bcs = bkd.w().c();
/* 72 */         if ((bcs == bct.fi || bcs == bct.fh) && bkd.c() != null) {
/* 73 */           gy gy = new gy();
/*    */           
/* 75 */           hk.a(gy, bkd.c());
/* 76 */           ate.o().a("SkullOwner", gy);
/*    */         } 
/*    */         
/* 79 */         a(axy1, el1, ate);
/*    */       } 
/*    */     } 
/* 82 */     super.a(☃, axy1, el1, blc1, bool);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bcc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */