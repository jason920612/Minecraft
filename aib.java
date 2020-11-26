/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class aib
/*    */   extends agt
/*    */ {
/*    */   private final aob a;
/*    */   private ajw b;
/*    */   private int c;
/*    */   private boolean d;
/*    */   
/*    */   public aib(aob ☃) {
/* 16 */     this.a = ☃;
/* 17 */     a(3);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a() {
/* 22 */     if (this.a.i() >= 0) {
/* 23 */       return false;
/*    */     }
/* 25 */     if (!this.a.m.L()) {
/* 26 */       return false;
/*    */     }
/*    */     
/* 29 */     List<ajw> ☃ = this.a.m.a(ajw.class, this.a.bD().c(6.0D, 2.0D, 6.0D));
/* 30 */     if (☃.isEmpty()) {
/* 31 */       return false;
/*    */     }
/*    */     
/* 34 */     for (ajw ajw1 : ☃) {
/* 35 */       if (ajw1.dz() > 0) {
/* 36 */         this.b = ajw1;
/*    */         break;
/*    */       } 
/*    */     } 
/* 40 */     return (this.b != null);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean b() {
/* 45 */     return (this.b.dz() > 0);
/*    */   }
/*    */ 
/*    */   
/*    */   public void c() {
/* 50 */     this.c = this.a.ce().nextInt(320);
/* 51 */     this.d = false;
/* 52 */     this.b.t().q();
/*    */   }
/*    */ 
/*    */   
/*    */   public void d() {
/* 57 */     this.b = null;
/* 58 */     this.a.t().q();
/*    */   }
/*    */ 
/*    */   
/*    */   public void e() {
/* 63 */     this.a.p().a(this.b, 30.0F, 30.0F);
/* 64 */     if (this.b.dz() == this.c) {
/* 65 */       this.a.t().a(this.b, 0.5D);
/* 66 */       this.d = true;
/*    */     } 
/*    */     
/* 69 */     if (this.d && 
/* 70 */       this.a.h(this.b) < 4.0D) {
/* 71 */       this.b.a(false);
/* 72 */       this.a.t().q();
/*    */     } 
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\aib.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */