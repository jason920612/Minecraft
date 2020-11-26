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
/*    */ public class agh
/*    */   extends agt
/*    */ {
/*    */   private final afg a;
/*    */   
/*    */   public agh(afg ☃) {
/* 18 */     this.a = ☃;
/* 19 */     a(3);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a() {
/* 24 */     return (this.a.bg() < 140);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean b() {
/* 29 */     return a();
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean f() {
/* 34 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public void c() {
/* 39 */     g();
/*    */   }
/*    */   
/*    */   private void g() {
/* 43 */     Iterable<el.a> ☃ = el.a.b(
/* 44 */         xq.c(this.a.q - 1.0D), 
/* 45 */         xq.c(this.a.r), 
/* 46 */         xq.c(this.a.s - 1.0D), 
/* 47 */         xq.c(this.a.q + 1.0D), 
/* 48 */         xq.c(this.a.r + 8.0D), 
/* 49 */         xq.c(this.a.s + 1.0D));
/*    */ 
/*    */     
/* 52 */     el el = null;
/* 53 */     for (el el1 : ☃) {
/* 54 */       if (a(this.a.m, el1)) {
/* 55 */         el = el1;
/*    */         
/*    */         break;
/*    */       } 
/*    */     } 
/* 60 */     if (el == null) {
/* 61 */       el = new el(this.a.q, this.a.r + 8.0D, this.a.s);
/*    */     }
/*    */     
/* 64 */     this.a.t().a(el.o(), (el.p() + 1), el.q(), 1.0D);
/*    */   }
/*    */ 
/*    */   
/*    */   public void e() {
/* 69 */     g();
/*    */     
/* 71 */     this.a.a(this.a.bh, this.a.bi, this.a.bj, 0.02F);
/* 72 */     this.a.a(afe.a, this.a.t, this.a.u, this.a.v);
/*    */   }
/*    */   
/*    */   private boolean a(ayc ☃, el el1) {
/* 76 */     blc blc = ☃.a_(el1);
/* 77 */     return ((☃.b(el1).e() || blc.c() == bct.B) && blc.a(☃, el1, cbf.a));
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\agh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */