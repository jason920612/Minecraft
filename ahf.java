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
/*    */ public class ahf
/*    */   extends agt
/*    */ {
/*    */   private final afg a;
/*    */   private ajf b;
/* 17 */   private int c = -1;
/* 18 */   private int d = -1;
/*    */   
/*    */   public ahf(afg ☃) {
/* 21 */     this.a = ☃;
/* 22 */     a(1);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a() {
/* 27 */     el ☃ = new el(this.a);
/* 28 */     if ((this.a.m.L() && (!this.a.m.Z() || this.a.m.d(☃).c() == ayu.d.b)) || !this.a.m.t.g()) {
/* 29 */       return false;
/*    */     }
/* 31 */     if (this.a.ce().nextInt(50) != 0) {
/* 32 */       return false;
/*    */     }
/* 34 */     if (this.c != -1 && this.a.d(this.c, this.a.r, this.d) < 4.0D) {
/* 35 */       return false;
/*    */     }
/* 37 */     ajg ajg = this.a.m.af().a(☃, 14);
/* 38 */     if (ajg == null) {
/* 39 */       return false;
/*    */     }
/* 41 */     this.b = ajg.c(☃);
/* 42 */     return (this.b != null);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean b() {
/* 47 */     return !this.a.t().p();
/*    */   }
/*    */ 
/*    */   
/*    */   public void c() {
/* 52 */     this.c = -1;
/* 53 */     el ☃ = this.b.e();
/* 54 */     int i = ☃.o();
/* 55 */     int j = ☃.p();
/* 56 */     int k = ☃.q();
/*    */     
/* 58 */     if (this.a.c(☃) > 256.0D) {
/* 59 */       cee cee = ajd.a(this.a, 14, 3, new cee(i + 0.5D, j, k + 0.5D));
/* 60 */       if (cee != null) {
/* 61 */         this.a.t().a(cee.b, cee.c, cee.d, 1.0D);
/*    */       }
/*    */     } else {
/* 64 */       this.a.t().a(i + 0.5D, j, k + 0.5D, 1.0D);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void d() {
/* 70 */     this.c = this.b.e().o();
/* 71 */     this.d = this.b.e().q();
/* 72 */     this.b = null;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\ahf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */