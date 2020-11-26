/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class bwv
/*    */   extends bxb
/*    */ {
/*    */   protected int a;
/*    */   protected int b;
/*    */   protected int c;
/* 17 */   protected int d = -1;
/*    */ 
/*    */   
/*    */   public bwv() {}
/*    */ 
/*    */   
/*    */   protected bwv(Random ☃, int i, int j, int k, int m, int n, int i1) {
/* 24 */     super(0);
/*    */     
/* 26 */     this.a = m;
/* 27 */     this.b = n;
/* 28 */     this.c = i1;
/*    */     
/* 30 */     a(eq.c.a.a(☃));
/*    */     
/* 32 */     if (f().k() == eq.a.c) {
/* 33 */       this.n = new bwf(i, j, k, i + m - 1, j + n - 1, k + i1 - 1);
/*    */     } else {
/* 35 */       this.n = new bwf(i, j, k, i + i1 - 1, j + n - 1, k + m - 1);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(gy ☃) {
/* 41 */     ☃.b("Width", this.a);
/* 42 */     ☃.b("Height", this.b);
/* 43 */     ☃.b("Depth", this.c);
/* 44 */     ☃.b("HPos", this.d);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(gy ☃, bxm bxm1) {
/* 49 */     this.a = ☃.h("Width");
/* 50 */     this.b = ☃.h("Height");
/* 51 */     this.c = ☃.h("Depth");
/* 52 */     this.d = ☃.h("HPos");
/*    */   }
/*    */   
/*    */   protected boolean a(axz ☃, bwf bwf1, int i) {
/* 56 */     if (this.d >= 0) {
/* 57 */       return true;
/*    */     }
/*    */     
/* 60 */     int j = 0;
/* 61 */     int k = 0;
/* 62 */     el.a a = new el.a();
/* 63 */     for (int m = this.n.c; m <= this.n.f; m++) {
/* 64 */       for (int n = this.n.a; n <= this.n.d; n++) {
/* 65 */         a.c(n, 64, m);
/* 66 */         if (bwf1.b(a)) {
/* 67 */           j += ☃.a(bor.a.e, a).p();
/* 68 */           k++;
/*    */         } 
/*    */       } 
/*    */     } 
/*    */     
/* 73 */     if (k == 0) {
/* 74 */       return false;
/*    */     }
/* 76 */     this.d = j / k;
/* 77 */     this.n.a(0, this.d - this.n.b + i, 0);
/* 78 */     return true;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bwv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */