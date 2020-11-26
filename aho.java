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
/*    */ public class aho
/*    */   extends agt
/*    */ {
/*    */   protected final afg a;
/*    */   protected double b;
/*    */   protected double c;
/*    */   protected double d;
/*    */   protected double e;
/*    */   
/*    */   public aho(afg ☃, double d) {
/* 22 */     this.a = ☃;
/* 23 */     this.b = d;
/* 24 */     a(1);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a() {
/* 29 */     if (this.a.cf() == null && !this.a.aV()) {
/* 30 */       return false;
/*    */     }
/*    */     
/* 33 */     if (this.a.aV()) {
/* 34 */       el ☃ = a(this.a.m, this.a, 5, 4);
/* 35 */       if (☃ != null) {
/* 36 */         this.c = ☃.o();
/* 37 */         this.d = ☃.p();
/* 38 */         this.e = ☃.q();
/*    */         
/* 40 */         return true;
/*    */       } 
/*    */     } 
/* 43 */     return g();
/*    */   }
/*    */   
/*    */   protected boolean g() {
/* 47 */     cee ☃ = ajd.a(this.a, 5, 4);
/* 48 */     if (☃ == null) {
/* 49 */       return false;
/*    */     }
/* 51 */     this.c = ☃.b;
/* 52 */     this.d = ☃.c;
/* 53 */     this.e = ☃.d;
/*    */     
/* 55 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public void c() {
/* 60 */     this.a.t().a(this.c, this.d, this.e, this.b);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean b() {
/* 65 */     return !this.a.t().p();
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   protected el a(axk ☃, aer aer1, int i, int j) {
/* 70 */     el el1 = new el(aer1);
/* 71 */     int k = el1.o();
/* 72 */     int m = el1.p();
/* 73 */     int n = el1.q();
/*    */     
/* 75 */     float f = (i * i * j * 2);
/* 76 */     el el2 = null;
/*    */     
/* 78 */     el.a a = new el.a();
/* 79 */     for (int i1 = k - i; i1 <= k + i; i1++) {
/* 80 */       for (int i2 = m - j; i2 <= m + j; i2++) {
/* 81 */         for (int i3 = n - i; i3 <= n + i; i3++) {
/* 82 */           a.c(i1, i2, i3);
/* 83 */           if (☃.b(a).a(ww.a)) {
/* 84 */             float f1 = ((i1 - k) * (i1 - k) + (i2 - m) * (i2 - m) + (i3 - n) * (i3 - n));
/* 85 */             if (f1 < f) {
/* 86 */               f = f1;
/* 87 */               el2 = new el(a);
/*    */             } 
/*    */           } 
/*    */         } 
/*    */       } 
/*    */     } 
/* 93 */     return el2;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\aho.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */