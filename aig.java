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
/*    */ public class aig
/*    */   extends aih
/*    */ {
/*    */   public aig(afg ☃, double d) {
/* 17 */     super(☃, d);
/*    */   }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   protected cee g() {
/* 23 */     cee ☃ = null;
/* 24 */     if (this.a.an()) {
/* 25 */       ☃ = ajd.b(this.a, 15, 15);
/*    */     }
/* 27 */     if (this.a.ce().nextFloat() >= this.h) {
/* 28 */       ☃ = j();
/*    */     }
/* 30 */     return (☃ == null) ? super.g() : ☃;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   private cee j() {
/* 35 */     el ☃ = new el(this.a);
/*    */     
/* 37 */     el.a a1 = new el.a();
/* 38 */     el.a a2 = new el.a();
/* 39 */     Iterable<el.a> iterable = el.a.b(
/* 40 */         xq.c(this.a.q - 3.0D), 
/* 41 */         xq.c(this.a.r - 6.0D), 
/* 42 */         xq.c(this.a.s - 3.0D), 
/* 43 */         xq.c(this.a.q + 3.0D), 
/* 44 */         xq.c(this.a.r + 6.0D), 
/* 45 */         xq.c(this.a.s + 3.0D));
/*    */ 
/*    */     
/* 48 */     for (el el : iterable) {
/* 49 */       if (☃.equals(el)) {
/*    */         continue;
/*    */       }
/*    */       
/* 53 */       bcs bcs = this.a.m.a_(a2.g(el).c(eq.a)).c();
/* 54 */       boolean bool = (bcs instanceof bfr || bcs.a(wv.n));
/* 55 */       if (bool && this.a.m.c(el) && this.a.m.c(a1.g(el).c(eq.b))) {
/* 56 */         return new cee(el.o(), el.p(), el.q());
/*    */       }
/*    */     } 
/*    */     
/* 60 */     return null;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\aig.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */