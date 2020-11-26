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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class a
/*    */   extends bxb
/*    */ {
/*    */   public a() {}
/*    */   
/*    */   public a(el ☃) {
/* 28 */     super(0);
/* 29 */     this.n = new bwf(☃.o(), ☃.p(), ☃.q(), ☃.o(), ☃.p(), ☃.q());
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected void a(gy ☃) {}
/*    */ 
/*    */ 
/*    */   
/*    */   protected void a(gy ☃, bxm bxm1) {}
/*    */ 
/*    */   
/*    */   public boolean a(axz ☃, Random random, bwf bwf1, axm axm1) {
/* 42 */     int i = ☃.a(bor.a.b, this.n.a, this.n.c);
/* 43 */     el.a a1 = new el.a(this.n.a, i, this.n.c);
/*    */     
/* 45 */     while (a1.p() > 0) {
/* 46 */       blc blc1 = ☃.a_(a1);
/* 47 */       blc blc2 = ☃.a_(a1.b());
/*    */       
/* 49 */       if (blc2 == bct.at.p() || blc2 == bct.b
/* 50 */         .p() || blc2 == bct.g
/* 51 */         .p() || blc2 == bct.c
/* 52 */         .p() || blc2 == bct.e
/* 53 */         .p()) {
/*    */         
/* 55 */         blc blc = (blc1.f() || a(blc1)) ? bct.D.p() : blc1;
/*    */         
/* 57 */         for (eq eq : eq.values()) {
/* 58 */           el el = a1.a(eq);
/* 59 */           blc blc3 = ☃.a_(el);
/*    */           
/* 61 */           if (blc3.f() || a(blc3)) {
/* 62 */             el el1 = el.b();
/* 63 */             blc blc4 = ☃.a_(el1);
/*    */             
/* 65 */             if ((blc4.f() || a(blc4)) && eq != eq.b) {
/* 66 */               ☃.a(el, blc2, 3);
/*    */             } else {
/* 68 */               ☃.a(el, blc, 3);
/*    */             } 
/*    */           } 
/*    */         } 
/* 72 */         return a(☃, bwf1, random, new el(this.n.a, a1.p(), this.n.c), ccl.r, (blc)null);
/*    */       } 
/*    */       
/* 75 */       a1.d(0, -1, 0);
/*    */     } 
/* 77 */     return false;
/*    */   }
/*    */   
/*    */   private boolean a(blc ☃) {
/* 81 */     return (☃ == bct.A.p() || ☃ == bct.C
/* 82 */       .p());
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bwg$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */