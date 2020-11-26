/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ali
/*    */   extends alf
/*    */ {
/*    */   private cee b;
/*    */   private int c;
/*    */   
/*    */   public ali(ald ☃) {
/* 17 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public void b() {
/* 22 */     if (this.c++ % 10 == 0) {
/* 23 */       float ☃ = (this.a.ce().nextFloat() - 0.5F) * 8.0F;
/* 24 */       float f1 = (this.a.ce().nextFloat() - 0.5F) * 4.0F;
/* 25 */       float f2 = (this.a.ce().nextFloat() - 0.5F) * 8.0F;
/* 26 */       this.a.m.a(fm.t, this.a.q + ☃, this.a.r + 2.0D + f1, this.a.s + f2, 0.0D, 0.0D, 0.0D);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void c() {
/* 32 */     this.c++;
/*    */     
/* 34 */     if (this.b == null) {
/* 35 */       el el = this.a.m.a(bor.a.d, bqn.a);
/* 36 */       this.b = new cee(el.o(), el.p(), el.q());
/*    */     } 
/*    */     
/* 39 */     double ☃ = this.b.c(this.a.q, this.a.r, this.a.s);
/* 40 */     if (☃ < 100.0D || ☃ > 22500.0D || this.a.B || this.a.C) {
/* 41 */       this.a.l(0.0F);
/*    */     } else {
/* 43 */       this.a.l(1.0F);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void d() {
/* 49 */     this.b = null;
/* 50 */     this.c = 0;
/*    */   }
/*    */ 
/*    */   
/*    */   public float f() {
/* 55 */     return 3.0F;
/*    */   }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public cee g() {
/* 61 */     return this.b;
/*    */   }
/*    */ 
/*    */   
/*    */   public alt<ali> i() {
/* 66 */     return alt.j;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\ali.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */