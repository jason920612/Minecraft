/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class agg
/*    */   extends agj
/*    */ {
/*    */   private int d;
/* 14 */   private int e = -1;
/*    */   
/*    */   public agg(afb ☃) {
/* 17 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a() {
/* 22 */     if (!super.a()) {
/* 23 */       return false;
/*    */     }
/* 25 */     if (!this.a.m.X().b("mobGriefing")) {
/* 26 */       return false;
/*    */     }
/* 28 */     return !g();
/*    */   }
/*    */ 
/*    */   
/*    */   public void c() {
/* 33 */     super.c();
/* 34 */     this.d = 0;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean b() {
/* 39 */     double ☃ = this.a.c(this.b);
/* 40 */     return (this.d <= 240 && !g() && ☃ < 4.0D);
/*    */   }
/*    */ 
/*    */   
/*    */   public void d() {
/* 45 */     super.d();
/* 46 */     this.a.m.c(this.a.Q(), this.b, -1);
/*    */   }
/*    */ 
/*    */   
/*    */   public void e() {
/* 51 */     super.e();
/* 52 */     if (this.a.ce().nextInt(20) == 0) {
/* 53 */       this.a.m.b(1019, this.b, 0);
/*    */     }
/*    */     
/* 56 */     this.d++;
/*    */     
/* 58 */     int ☃ = (int)(this.d / 240.0F * 10.0F);
/* 59 */     if (☃ != this.e) {
/* 60 */       this.a.m.c(this.a.Q(), this.b, ☃);
/* 61 */       this.e = ☃;
/*    */     } 
/*    */     
/* 64 */     if (this.d == 240 && 
/* 65 */       this.a.m.aj() == adi.d) {
/* 66 */       this.a.m.g(this.b);
/* 67 */       this.a.m.b(1021, this.b, 0);
/* 68 */       this.a.m.b(2001, this.b, bcs.l(this.a.m.a_(this.b)));
/*    */     } 
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\agg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */