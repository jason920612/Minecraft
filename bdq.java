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
/*    */ public class bdq
/*    */   extends bcs
/*    */ {
/*    */   private final bcs a;
/*    */   
/*    */   public bdq(bcs ☃, bcs.c c1) {
/* 21 */     super(c1);
/* 22 */     this.a = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(blc ☃, axy axy1, el el1, Random random) {
/* 27 */     if (!a(axy1, el1)) {
/* 28 */       axy1.a(el1, this.a.p(), 2);
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public blc a(blc ☃, eq eq1, blc blc1, axz axz1, el el1, el el2) {
/* 34 */     if (!a(axz1, el1)) {
/* 35 */       axz1.J().a(el1, this, 60 + axz1.m().nextInt(40));
/*    */     }
/* 37 */     return super.a(☃, eq1, blc1, axz1, el1, el2);
/*    */   }
/*    */   
/*    */   protected boolean a(axk ☃, el el1) {
/* 41 */     for (eq eq : eq.values()) {
/* 42 */       byw byw = ☃.b(el1.a(eq));
/* 43 */       if (byw.a(ww.a)) {
/* 44 */         return true;
/*    */       }
/*    */     } 
/* 47 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public blc a(ark ☃) {
/* 53 */     if (!a(☃.k(), ☃.a())) {
/* 54 */       ☃.k().J().a(☃.a(), this, 60 + ☃.k().m().nextInt(40));
/*    */     }
/* 56 */     return p();
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean X_() {
/* 61 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public axx a(blc ☃, axy axy1, el el1, int i) {
/* 66 */     return this.a;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bdq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */