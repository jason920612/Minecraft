/*    */ import java.util.List;
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
/*    */ public class bgp
/*    */   extends bcn
/*    */ {
/*    */   private final a p;
/* 21 */   public static final bmb o = bma.t;
/*    */   
/*    */   public enum a {
/* 24 */     a, b;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected bgp(a ☃, bcs.c c1) {
/* 30 */     super(c1);
/* 31 */     v(((blc)this.m.b()).a(o, Boolean.valueOf(false)));
/* 32 */     this.p = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   protected int k(blc ☃) {
/* 37 */     return ((Boolean)☃.c(o)).booleanValue() ? 15 : 0;
/*    */   }
/*    */ 
/*    */   
/*    */   protected blc a(blc ☃, int i) {
/* 42 */     return ☃.a(o, Boolean.valueOf((i > 0)));
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(axz ☃, el el1) {
/* 47 */     if (this.k == bza.w) {
/* 48 */       ☃.a(null, el1, wj.ln, wk.e, 0.3F, 0.8F);
/*    */     } else {
/* 50 */       ☃.a(null, el1, wj.jy, wk.e, 0.3F, 0.6F);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   protected void b(axz ☃, el el1) {
/* 56 */     if (this.k == bza.w) {
/* 57 */       ☃.a(null, el1, wj.lm, wk.e, 0.3F, 0.7F);
/*    */     } else {
/* 59 */       ☃.a(null, el1, wj.jx, wk.e, 0.3F, 0.5F);
/*    */     } 
/*    */   }
/*    */   
/*    */   protected int b(axy ☃, el el1) {
/*    */     List<? extends aer> list;
/* 65 */     cea cea = c.a(el1);
/*    */ 
/*    */     
/* 68 */     switch (null.a[this.p.ordinal()]) {
/*    */       case 1:
/* 70 */         list = ☃.a((aer)null, cea);
/*    */         break;
/*    */       case 2:
/* 73 */         list = ☃.a((Class)afa.class, cea);
/*    */         break;
/*    */       default:
/* 76 */         return 0;
/*    */     } 
/*    */     
/* 79 */     if (!list.isEmpty()) {
/* 80 */       for (aer aer : list) {
/* 81 */         if (!aer.br()) {
/* 82 */           return 15;
/*    */         }
/*    */       } 
/*    */     }
/*    */     
/* 87 */     return 0;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(ble.a<bcs, blc> ☃) {
/* 92 */     ☃.a((bmm<?>[])new bmm[] { o });
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bgp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */