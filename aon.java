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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class aon
/*    */   extends aol
/*    */ {
/*    */   public aon(axy ☃) {
/* 25 */     super(aev.n, ☃, 1.0F, 1.0F);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public aon(axy ☃, afa afa1, double d1, double d2, double d3) {
/* 33 */     super(aev.n, afa1, d1, d2, d3, ☃, 1.0F, 1.0F);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(ceb ☃) {
/* 38 */     if (☃.d != null && ☃.d.s(this.a)) {
/*    */       return;
/*    */     }
/* 41 */     if (!this.m.B) {
/* 42 */       List<afa> list = this.m.a(afa.class, bD().c(4.0D, 2.0D, 4.0D));
/*    */       
/* 44 */       aep aep = new aep(this.m, this.q, this.r, this.s);
/* 45 */       aep.a(this.a);
/* 46 */       aep.a(fm.j);
/* 47 */       aep.a(3.0F);
/* 48 */       aep.b(600);
/* 49 */       aep.c((7.0F - aep.f()) / aep.m());
/* 50 */       aep.a(new aek(aem.g, 1, 1));
/*    */       
/* 52 */       if (!list.isEmpty()) {
/* 53 */         for (afa afa : list) {
/* 54 */           double d = h(afa);
/* 55 */           if (d < 16.0D) {
/* 56 */             aep.b(afa.q, afa.r, afa.s);
/*    */             
/*    */             break;
/*    */           } 
/*    */         } 
/*    */       }
/* 62 */       this.m.b(2006, new el(this.q, this.r, this.s), 0);
/* 63 */       this.m.a(aep);
/*    */       
/* 65 */       V();
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean aB() {
/* 71 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(aea ☃, float f) {
/* 76 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   protected fk i() {
/* 81 */     return fm.j;
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean f() {
/* 86 */     return false;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\aon.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */