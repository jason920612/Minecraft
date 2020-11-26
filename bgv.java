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
/*    */ public class bgv
/*    */   extends bcs
/*    */ {
/* 14 */   public static final bmb a = bgw.a;
/*    */   
/*    */   public bgv(bcs.c ☃) {
/* 17 */     super(☃);
/* 18 */     v(p().a(a, Boolean.valueOf(false)));
/*    */   }
/*    */ 
/*    */   
/*    */   public int m(blc ☃) {
/* 23 */     return ((Boolean)☃.c(a)).booleanValue() ? super.m(☃) : 0;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(blc ☃, axy axy1, el el1, blc blc1) {
/* 28 */     super.a(☃, axy1, el1, blc1);
/*    */   }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public blc a(ark ☃) {
/* 34 */     return p().a(a, Boolean.valueOf(☃.k().t(☃.a())));
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(blc ☃, axy axy1, el el1, bcs bcs1, el el2) {
/* 39 */     if (axy1.B) {
/*    */       return;
/*    */     }
/*    */     
/* 43 */     boolean bool = ((Boolean)☃.c(a)).booleanValue();
/* 44 */     if (bool != axy1.t(el1)) {
/* 45 */       if (bool) {
/* 46 */         axy1.J().a(el1, this, 4);
/*    */       } else {
/* 48 */         axy1.a(el1, ☃.a(a), 2);
/*    */       } 
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(blc ☃, axy axy1, el el1, Random random) {
/* 55 */     if (axy1.B) {
/*    */       return;
/*    */     }
/*    */     
/* 59 */     if (((Boolean)☃.c(a)).booleanValue() && !axy1.t(el1)) {
/* 60 */       axy1.a(el1, ☃.a(a), 2);
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(ble.a<bcs, blc> ☃) {
/* 66 */     ☃.a((bmm<?>[])new bmm[] { a });
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bgv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */