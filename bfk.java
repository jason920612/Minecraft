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
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bfk
/*    */   extends bff
/*    */ {
/*    */   public bfk(bcs.c ☃) {
/* 24 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public int j(blc ☃, axk axk1, el el1) {
/* 29 */     return bct.A.p().b(axk1, el1);
/*    */   }
/*    */ 
/*    */   
/*    */   public axl c() {
/* 34 */     return axl.d;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(axy ☃, aog aog1, el el1, blc blc1, @Nullable bji bji1, ate ate1) {
/* 39 */     aog1.b(ws.a.b(this));
/* 40 */     aog1.a(0.005F);
/*    */     
/* 42 */     if (X_() && awg.a(awi.t, ate1) > 0) {
/* 43 */       a(☃, el1, t(blc1));
/*    */     } else {
/* 45 */       if (☃.t.f()) {
/* 46 */         ☃.g(el1);
/*    */         
/*    */         return;
/*    */       } 
/* 50 */       int i = awg.a(awi.v, ate1);
/* 51 */       blc1.a(☃, el1, i);
/*    */       
/* 53 */       bza bza = ☃.a_(el1.b()).d();
/* 54 */       if (bza.c() || bza.a()) {
/* 55 */         ☃.a(el1, bct.A.p());
/*    */       }
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public int a(blc ☃, Random random) {
/* 62 */     return 0;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(blc ☃, axy axy1, el el1, Random random) {
/* 67 */     if (axy1.a(ayi.b, el1) > 11 - ☃.b(axy1, el1)) {
/* 68 */       b(☃, axy1, el1);
/*    */     }
/*    */   }
/*    */   
/*    */   protected void b(blc ☃, axy axy1, el el1) {
/* 73 */     if (axy1.t.f()) {
/* 74 */       axy1.g(el1);
/*    */       
/*    */       return;
/*    */     } 
/* 78 */     ☃.a(axy1, el1, 0);
/* 79 */     axy1.a(el1, bct.A.p());
/* 80 */     axy1.a(el1, bct.A, el1);
/*    */   }
/*    */ 
/*    */   
/*    */   public bzc j(blc ☃) {
/* 85 */     return bzc.a;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bfk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */