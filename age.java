/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class age
/*    */   extends agt
/*    */ {
/*    */   private final akm a;
/*    */   private aog b;
/*    */   private final ayc c;
/*    */   private final float d;
/*    */   private int e;
/*    */   
/*    */   public age(akm ☃, float f) {
/* 19 */     this.a = ☃;
/* 20 */     this.c = ☃.m;
/* 21 */     this.d = f;
/* 22 */     a(2);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a() {
/* 27 */     this.b = this.c.a(this.a, this.d);
/* 28 */     if (this.b == null) {
/* 29 */       return false;
/*    */     }
/* 31 */     return a(this.b);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean b() {
/* 36 */     if (!this.b.aF()) {
/* 37 */       return false;
/*    */     }
/* 39 */     if (this.a.h(this.b) > (this.d * this.d)) {
/* 40 */       return false;
/*    */     }
/* 42 */     return (this.e > 0 && a(this.b));
/*    */   }
/*    */ 
/*    */   
/*    */   public void c() {
/* 47 */     this.a.w(true);
/* 48 */     this.e = 40 + this.a.ce().nextInt(40);
/*    */   }
/*    */ 
/*    */   
/*    */   public void d() {
/* 53 */     this.a.w(false);
/* 54 */     this.b = null;
/*    */   }
/*    */ 
/*    */   
/*    */   public void e() {
/* 59 */     this.a.p().a(this.b.q, this.b.r + this.b.bF(), this.b.s, 10.0F, this.a.K());
/* 60 */     this.e--;
/*    */   }
/*    */   
/*    */   private boolean a(aog ☃) {
/* 64 */     for (adk adk : adk.values()) {
/* 65 */       ate ate = ☃.b(adk);
/* 66 */       if (this.a.dy() && ate.b() == atf.bx) {
/* 67 */         return true;
/*    */       }
/* 69 */       if (this.a.f(ate)) {
/* 70 */         return true;
/*    */       }
/*    */     } 
/* 73 */     return false;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\age.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */