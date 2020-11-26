/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ahr
/*    */   extends agt
/*    */ {
/*    */   protected final afg a;
/*    */   protected double b;
/*    */   protected double c;
/*    */   protected double d;
/*    */   protected final double e;
/*    */   protected int f;
/*    */   protected boolean g;
/*    */   
/*    */   public ahr(afg ☃, double d) {
/* 21 */     this(☃, d, 120);
/*    */   }
/*    */   
/*    */   public ahr(afg ☃, double d, int i) {
/* 25 */     this.a = ☃;
/* 26 */     this.e = d;
/* 27 */     this.f = i;
/* 28 */     a(1);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a() {
/* 33 */     if (!this.g) {
/* 34 */       if (this.a.cj() >= 100) {
/* 35 */         return false;
/*    */       }
/* 37 */       if (this.a.ce().nextInt(this.f) != 0) {
/* 38 */         return false;
/*    */       }
/*    */     } 
/*    */     
/* 42 */     cee ☃ = g();
/*    */     
/* 44 */     if (☃ == null) {
/* 45 */       return false;
/*    */     }
/*    */     
/* 48 */     this.b = ☃.b;
/* 49 */     this.c = ☃.c;
/* 50 */     this.d = ☃.d;
/* 51 */     this.g = false;
/* 52 */     return true;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   protected cee g() {
/* 57 */     return ajd.a(this.a, 10, 7);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean b() {
/* 62 */     return !this.a.t().p();
/*    */   }
/*    */ 
/*    */   
/*    */   public void c() {
/* 67 */     this.a.t().a(this.b, this.c, this.d, this.e);
/*    */   }
/*    */   
/*    */   public void i() {
/* 71 */     this.g = true;
/*    */   }
/*    */   
/*    */   public void b(int ☃) {
/* 75 */     this.f = ☃;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\ahr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */