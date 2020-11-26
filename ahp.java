/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ahp
/*    */   extends agt
/*    */ {
/*    */   private final aob a;
/*    */   private afa b;
/*    */   private final double c;
/*    */   private int d;
/*    */   
/*    */   public ahp(aob ☃, double d) {
/* 18 */     this.a = ☃;
/* 19 */     this.c = d;
/* 20 */     a(1);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a() {
/* 25 */     if (this.a.i() >= 0) {
/* 26 */       return false;
/*    */     }
/* 28 */     if (this.a.ce().nextInt(400) != 0) {
/* 29 */       return false;
/*    */     }
/*    */     
/* 32 */     List<aob> ☃ = this.a.m.a(aob.class, this.a.bD().c(6.0D, 3.0D, 6.0D));
/* 33 */     double d = Double.MAX_VALUE;
/* 34 */     for (aob aob1 : ☃) {
/* 35 */       if (aob1 == this.a) {
/*    */         continue;
/*    */       }
/* 38 */       if (aob1.dA()) {
/*    */         continue;
/*    */       }
/* 41 */       if (aob1.i() >= 0) {
/*    */         continue;
/*    */       }
/* 44 */       double d1 = aob1.h(this.a);
/* 45 */       if (d1 > d) {
/*    */         continue;
/*    */       }
/* 48 */       d = d1;
/* 49 */       this.b = aob1;
/*    */     } 
/*    */     
/* 52 */     if (this.b == null) {
/* 53 */       cee cee = ajd.a(this.a, 16, 3);
/* 54 */       if (cee == null) {
/* 55 */         return false;
/*    */       }
/*    */     } 
/* 58 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean b() {
/* 63 */     return (this.d > 0);
/*    */   }
/*    */ 
/*    */   
/*    */   public void c() {
/* 68 */     if (this.b != null) {
/* 69 */       this.a.t(true);
/*    */     }
/* 71 */     this.d = 1000;
/*    */   }
/*    */ 
/*    */   
/*    */   public void d() {
/* 76 */     this.a.t(false);
/* 77 */     this.b = null;
/*    */   }
/*    */ 
/*    */   
/*    */   public void e() {
/* 82 */     this.d--;
/* 83 */     if (this.b != null) {
/* 84 */       if (this.a.h(this.b) > 4.0D) {
/* 85 */         this.a.t().a(this.b, this.c);
/*    */       }
/*    */     }
/* 88 */     else if (this.a.t().p()) {
/* 89 */       cee ☃ = ajd.a(this.a, 16, 3);
/* 90 */       if (☃ == null) {
/*    */         return;
/*    */       }
/* 93 */       this.a.t().a(☃.b, ☃.c, ☃.d, this.c);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\ahp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */