/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ags
/*    */   extends agt
/*    */ {
/*    */   private final ajq a;
/*    */   private ajq b;
/*    */   private final double c;
/*    */   private int d;
/*    */   
/*    */   public ags(ajq ☃, double d) {
/* 14 */     this.a = ☃;
/* 15 */     this.c = d;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a() {
/* 20 */     if (this.a.i() >= 0) {
/* 21 */       return false;
/*    */     }
/*    */     
/* 24 */     List<ajq> ☃ = (List)this.a.m.a(this.a.getClass(), this.a.bD().c(8.0D, 4.0D, 8.0D));
/*    */     
/* 26 */     ajq ajq1 = null;
/* 27 */     double d = Double.MAX_VALUE;
/* 28 */     for (ajq ajq2 : ☃) {
/* 29 */       if (ajq2.i() < 0) {
/*    */         continue;
/*    */       }
/* 32 */       double d1 = this.a.h(ajq2);
/* 33 */       if (d1 > d) {
/*    */         continue;
/*    */       }
/* 36 */       d = d1;
/* 37 */       ajq1 = ajq2;
/*    */     } 
/*    */     
/* 40 */     if (ajq1 == null) {
/* 41 */       return false;
/*    */     }
/* 43 */     if (d < 9.0D) {
/* 44 */       return false;
/*    */     }
/* 46 */     this.b = ajq1;
/* 47 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean b() {
/* 52 */     if (this.a.i() >= 0) {
/* 53 */       return false;
/*    */     }
/* 55 */     if (!this.b.aF()) {
/* 56 */       return false;
/*    */     }
/* 58 */     double ☃ = this.a.h(this.b);
/* 59 */     if (☃ < 9.0D || ☃ > 256.0D) {
/* 60 */       return false;
/*    */     }
/* 62 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public void c() {
/* 67 */     this.d = 0;
/*    */   }
/*    */ 
/*    */   
/*    */   public void d() {
/* 72 */     this.b = null;
/*    */   }
/*    */ 
/*    */   
/*    */   public void e() {
/* 77 */     if (--this.d > 0) {
/*    */       return;
/*    */     }
/* 80 */     this.d = 10;
/* 81 */     this.a.t().a(this.b, this.c);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\ags.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */