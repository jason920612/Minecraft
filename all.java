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
/*    */ public class all
/*    */   extends alf
/*    */ {
/*    */   private cbe b;
/*    */   private cee c;
/*    */   
/*    */   public all(ald ☃) {
/* 19 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public alt<all> i() {
/* 24 */     return alt.c;
/*    */   }
/*    */ 
/*    */   
/*    */   public void d() {
/* 29 */     this.b = null;
/* 30 */     this.c = null;
/*    */   }
/*    */ 
/*    */   
/*    */   public void c() {
/* 35 */     double ☃ = (this.c == null) ? 0.0D : this.c.c(this.a.q, this.a.r, this.a.s);
/* 36 */     if (☃ < 100.0D || ☃ > 22500.0D || this.a.B || this.a.C) {
/* 37 */       j();
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public cee g() {
/* 44 */     return this.c;
/*    */   }
/*    */   
/*    */   private void j() {
/* 48 */     if (this.b == null || this.b.b()) {
/* 49 */       int i, ☃ = this.a.l();
/* 50 */       el el = this.a.m.a(bor.a.e, bqn.a);
/* 51 */       aog aog = this.a.m.a(el, 128.0D, 128.0D);
/*    */ 
/*    */       
/* 54 */       if (aog != null) {
/* 55 */         cee cee1 = (new cee(aog.q, 0.0D, aog.s)).a();
/* 56 */         i = this.a.k(-cee1.b * 40.0D, 105.0D, -cee1.d * 40.0D);
/*    */       } else {
/* 58 */         i = this.a.k(40.0D, el.p(), 0.0D);
/*    */       } 
/*    */       
/* 61 */       cbc cbc = new cbc(el.o(), el.p(), el.q());
/*    */       
/* 63 */       this.b = this.a.a(☃, i, cbc);
/*    */       
/* 65 */       if (this.b != null) {
/* 66 */         this.b.a();
/*    */       }
/*    */     } 
/*    */     
/* 70 */     k();
/*    */     
/* 72 */     if (this.b != null && this.b.b()) {
/* 73 */       this.a.dr().a(alt.d);
/*    */     }
/*    */   }
/*    */   
/*    */   private void k() {
/* 78 */     if (this.b != null && !this.b.b()) {
/* 79 */       double d3; cee ☃ = this.b.f();
/*    */       
/* 81 */       this.b.a();
/* 82 */       double d1 = ☃.b;
/* 83 */       double d2 = ☃.d;
/*    */ 
/*    */       
/*    */       do {
/* 87 */         d3 = ☃.c + (this.a.ce().nextFloat() * 20.0F);
/* 88 */       } while (d3 < ☃.c);
/*    */       
/* 90 */       this.c = new cee(d1, d3, d2);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\all.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */