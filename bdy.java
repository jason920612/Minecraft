/*    */ import java.util.Random;
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
/*    */ public class bdy
/*    */   extends bda
/*    */ {
/* 19 */   protected static final cew a = bcs.a(2.0D, 0.0D, 2.0D, 14.0D, 13.0D, 14.0D);
/*    */   
/*    */   protected bdy(bcs.c ☃) {
/* 22 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public cew a(blc ☃, axk axk1, el el1) {
/* 27 */     return a;
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean b(blc ☃, axk axk1, el el1) {
/* 32 */     bcs bcs = ☃.c();
/* 33 */     return (bcs == bct.D || bcs == bct.E || bcs == bct.gn || bcs == bct.fE || bcs == bct.fF || bcs == bct.fG || bcs == bct.fH || bcs == bct.fI || bcs == bct.fJ || bcs == bct.fK || bcs == bct.fL || bcs == bct.fM || bcs == bct.fN || bcs == bct.fO || bcs == bct.fP || bcs == bct.fQ || bcs == bct.fR || bcs == bct.fS || bcs == bct.fT || bcs == bct.j || bcs == bct.k || bcs == bct.l);
/*    */   }
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
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int a(blc ☃, Random random) {
/* 60 */     return random.nextInt(3);
/*    */   }
/*    */ 
/*    */   
/*    */   public axx a(blc ☃, axy axy1, el el1, int i) {
/* 65 */     return atf.C;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(axy ☃, aog aog1, el el1, blc blc1, @Nullable bji bji1, ate ate1) {
/* 70 */     boolean bool = (!☃.B && ate1.b() == atf.bR);
/* 71 */     if (bool) {
/* 72 */       a(☃, el1, new ate(bct.aT));
/*    */     }
/*    */     
/* 75 */     super.a(☃, aog1, el1, bool ? bct.a.p() : blc1, bji1, ate1);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bdy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */