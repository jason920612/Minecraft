/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class afy
/*    */   extends agb
/*    */ {
/*    */   public afy(afb ☃) {
/* 11 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a() {
/* 16 */     if (this.h == agb.a.b) {
/* 17 */       float f2; this.h = agb.a.a;
/*    */       
/* 19 */       this.a.d(true);
/*    */       
/* 21 */       double ☃ = this.b - this.a.q;
/* 22 */       double d1 = this.c - this.a.r;
/* 23 */       double d2 = this.d - this.a.s;
/* 24 */       double d3 = ☃ * ☃ + d1 * d1 + d2 * d2;
/* 25 */       if (d3 < 2.500000277905201E-7D) {
/* 26 */         this.a.s(0.0F);
/* 27 */         this.a.r(0.0F);
/*    */         return;
/*    */       } 
/* 30 */       float f1 = (float)(xq.c(d2, ☃) * 57.2957763671875D) - 90.0F;
/* 31 */       this.a.w = a(this.a.w, f1, 10.0F);
/*    */       
/* 33 */       if (this.a.A) {
/* 34 */         f2 = (float)(this.e * this.a.a(ank.d).e());
/*    */       } else {
/* 36 */         f2 = (float)(this.e * this.a.a(ank.e).e());
/*    */       } 
/* 38 */       this.a.o(f2);
/*    */       
/* 40 */       double d4 = xq.a(☃ * ☃ + d2 * d2);
/* 41 */       float f3 = (float)-(xq.c(d1, d4) * 57.2957763671875D);
/* 42 */       this.a.x = a(this.a.x, f3, 10.0F);
/* 43 */       this.a.s((d1 > 0.0D) ? f2 : -f2);
/*    */     } else {
/* 45 */       this.a.d(false);
/*    */       
/* 47 */       this.a.s(0.0F);
/* 48 */       this.a.r(0.0F);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\afy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */