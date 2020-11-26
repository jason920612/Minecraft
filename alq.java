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
/*    */ public class alq
/*    */   extends alg
/*    */ {
/*    */   private int b;
/*    */   
/*    */   public alq(ald ☃) {
/* 17 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public void c() {
/* 22 */     this.b++;
/* 23 */     afa ☃ = this.a.m.a(this.a, 20.0D, 10.0D);
/*    */     
/* 25 */     if (☃ != null) {
/* 26 */       if (this.b > 25) {
/* 27 */         this.a.dr().a(alt.h);
/*    */       } else {
/* 29 */         cee cee1 = (new cee(☃.q - this.a.q, 0.0D, ☃.s - this.a.s)).a();
/* 30 */         cee cee2 = (new cee(xq.a(this.a.w * 0.017453292F), 0.0D, -xq.b(this.a.w * 0.017453292F))).a();
/* 31 */         float f1 = (float)cee2.b(cee1);
/* 32 */         float f2 = (float)(Math.acos(f1) * 57.2957763671875D) + 0.5F;
/*    */         
/* 34 */         if (f2 < 0.0F || f2 > 10.0F) {
/* 35 */           double d1 = ☃.q - this.a.bD.q;
/* 36 */           double d2 = ☃.s - this.a.bD.s;
/* 37 */           double d3 = xq.a(xq.g(180.0D - xq.c(d1, d2) * 57.2957763671875D - this.a.w), -100.0D, 100.0D);
/*    */           
/* 39 */           this.a.bk *= 0.8F;
/*    */           
/* 41 */           float f3 = xq.a(d1 * d1 + d2 * d2) + 1.0F;
/* 42 */           float f4 = f3;
/* 43 */           if (f3 > 40.0F) {
/* 44 */             f3 = 40.0F;
/*    */           }
/* 46 */           this.a.bk = (float)(this.a.bk + d3 * (0.7F / f3 / f4));
/* 47 */           this.a.w += this.a.bk;
/*    */         } 
/*    */       } 
/* 50 */     } else if (this.b >= 100) {
/* 51 */       ☃ = this.a.m.a(this.a, 150.0D, 150.0D);
/* 52 */       this.a.dr().a(alt.e);
/* 53 */       if (☃ != null) {
/* 54 */         this.a.dr().a(alt.i);
/* 55 */         ((alh)this.a.dr().<alh>b(alt.i)).a(new cee(☃.q, ☃.r, ☃.s));
/*    */       } 
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void d() {
/* 62 */     this.b = 0;
/*    */   }
/*    */ 
/*    */   
/*    */   public alt<alq> i() {
/* 67 */     return alt.g;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\alq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */