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
/*    */ 
/*    */ public class bih
/*    */   extends bda
/*    */   implements bcv
/*    */ {
/* 21 */   protected static final cew a = bcs.a(2.0D, 0.0D, 2.0D, 14.0D, 13.0D, 14.0D);
/*    */   
/*    */   protected bih(bcs.c ☃) {
/* 24 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public cew a(blc ☃, axk axk1, el el1) {
/* 29 */     return a;
/*    */   }
/*    */ 
/*    */   
/*    */   public axx a(blc ☃, axy axy1, el el1, int i) {
/* 34 */     if (axy1.s.nextInt(8) == 0) {
/* 35 */       return atf.R;
/*    */     }
/*    */     
/* 38 */     return atf.a;
/*    */   }
/*    */ 
/*    */   
/*    */   public int a(blc ☃, int i, axy axy1, el el1, Random random) {
/* 43 */     return 1 + random.nextInt(i * 2 + 1);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(axy ☃, aog aog1, el el1, blc blc1, @Nullable bji bji1, ate ate1) {
/* 48 */     if (!☃.B && ate1.b() == atf.bR) {
/* 49 */       aog1.b(ws.a.b(this));
/* 50 */       aog1.a(0.005F);
/*    */       
/* 52 */       a(☃, el1, new ate(this));
/*    */     } else {
/* 54 */       super.a(☃, aog1, el1, blc1, bji1, ate1);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(axk ☃, el el1, blc blc1, boolean bool) {
/* 60 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(axy ☃, Random random, el el1, blc blc1) {
/* 65 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(axy ☃, Random random, el el1, blc blc1) {
/* 70 */     bee bee = (this == bct.aS) ? (bee)bct.gz : (bee)bct.gy;
/*    */     
/* 72 */     if (bee.p().a(☃, el1) && ☃.c(el1.a())) {
/* 73 */       bee.a(☃, el1, 2);
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public bcs.b q() {
/* 79 */     return bcs.b.c;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bih.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */