/*    */ import java.util.Random;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class agl
/*    */   extends agt
/*    */ {
/*    */   private final afg a;
/*    */   private double b;
/*    */   private double c;
/*    */   private double d;
/*    */   private final double e;
/*    */   private final axy f;
/*    */   
/*    */   public agl(afg ☃, double d) {
/* 22 */     this.a = ☃;
/* 23 */     this.e = d;
/* 24 */     this.f = ☃.m;
/* 25 */     a(1);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a() {
/* 30 */     if (!this.f.L()) {
/* 31 */       return false;
/*    */     }
/* 33 */     if (!this.a.aV()) {
/* 34 */       return false;
/*    */     }
/* 36 */     if (!this.f.e(new el(this.a.q, (this.a.bD()).b, this.a.s))) {
/* 37 */       return false;
/*    */     }
/* 39 */     if (!this.a.b(aew.f).a()) {
/* 40 */       return false;
/*    */     }
/*    */     
/* 43 */     cee ☃ = g();
/* 44 */     if (☃ == null) {
/* 45 */       return false;
/*    */     }
/* 47 */     this.b = ☃.b;
/* 48 */     this.c = ☃.c;
/* 49 */     this.d = ☃.d;
/* 50 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean b() {
/* 55 */     return !this.a.t().p();
/*    */   }
/*    */ 
/*    */   
/*    */   public void c() {
/* 60 */     this.a.t().a(this.b, this.c, this.d, this.e);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   private cee g() {
/* 65 */     Random ☃ = this.a.ce();
/* 66 */     el el = new el(this.a.q, (this.a.bD()).b, this.a.s);
/*    */     
/* 68 */     for (int i = 0; i < 10; i++) {
/* 69 */       el el1 = el.a(☃.nextInt(20) - 10, ☃.nextInt(6) - 3, ☃.nextInt(20) - 10);
/*    */       
/* 71 */       if (!this.f.e(el1) && this.a.a(el1) < 0.0F) {
/* 72 */         return new cee(el1.o(), el1.p(), el1.q());
/*    */       }
/*    */     } 
/* 75 */     return null;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\agl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */