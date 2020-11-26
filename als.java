/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class als
/*    */   extends alf
/*    */ {
/*    */   private boolean b;
/*    */   private cbe c;
/*    */   private cee d;
/*    */   
/*    */   public als(ald ☃) {
/* 18 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public void c() {
/* 23 */     if (this.b || this.c == null) {
/* 24 */       this.b = false;
/* 25 */       j();
/*    */     } else {
/* 27 */       el ☃ = this.a.m.a(bor.a.e, bqn.a);
/* 28 */       double d = this.a.d(☃);
/* 29 */       if (d > 100.0D) {
/* 30 */         this.a.dr().a(alt.a);
/*    */       }
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void d() {
/* 37 */     this.b = true;
/* 38 */     this.c = null;
/* 39 */     this.d = null;
/*    */   }
/*    */   
/*    */   private void j() {
/* 43 */     int ☃ = this.a.l();
/* 44 */     cee cee1 = this.a.a(1.0F);
/* 45 */     int i = this.a.k(-cee1.b * 40.0D, 105.0D, -cee1.d * 40.0D);
/*    */     
/* 47 */     if (this.a.ds() == null || this.a.ds().c() <= 0) {
/*    */       
/* 49 */       i -= 12;
/* 50 */       i &= 0x7;
/* 51 */       i += 12;
/*    */     } else {
/*    */       
/* 54 */       i %= 12;
/* 55 */       if (i < 0) {
/* 56 */         i += 12;
/*    */       }
/*    */     } 
/*    */     
/* 60 */     this.c = this.a.a(☃, i, (cbc)null);
/*    */     
/* 62 */     if (this.c != null) {
/* 63 */       this.c.a();
/* 64 */       k();
/*    */     } 
/*    */   }
/*    */   private void k() {
/*    */     double d;
/* 69 */     cee ☃ = this.c.f();
/*    */     
/* 71 */     this.c.a();
/*    */ 
/*    */     
/*    */     do {
/* 75 */       d = ☃.c + (this.a.ce().nextFloat() * 20.0F);
/* 76 */     } while (d < ☃.c);
/*    */     
/* 78 */     this.d = new cee(☃.b, d, ☃.d);
/*    */   }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public cee g() {
/* 84 */     return this.d;
/*    */   }
/*    */ 
/*    */   
/*    */   public alt<als> i() {
/* 89 */     return alt.e;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\als.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */