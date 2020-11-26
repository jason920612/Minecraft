/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bjt
/*    */   extends bji
/*    */   implements pt
/*    */ {
/*    */   public float a;
/*    */   public float e;
/*    */   public int f;
/*    */   private int g;
/*    */   
/*    */   public bjt() {
/* 17 */     super(bjj.d);
/*    */   }
/*    */ 
/*    */   
/*    */   public void Y_() {
/* 22 */     if (++this.g % 20 * 4 == 0) {
/* 23 */       this.c_.a(this.d_, bct.em, 1, this.f);
/*    */     }
/*    */     
/* 26 */     this.e = this.a;
/*    */     
/* 28 */     int ☃ = this.d_.o();
/* 29 */     int i = this.d_.p();
/* 30 */     int j = this.d_.q();
/*    */     
/* 32 */     float f = 0.1F;
/* 33 */     if (this.f > 0 && this.a == 0.0F) {
/* 34 */       double d1 = ☃ + 0.5D;
/* 35 */       double d2 = j + 0.5D;
/*    */       
/* 37 */       this.c_.a((aog)null, d1, i + 0.5D, d2, wj.bO, wk.e, 0.5F, this.c_.s.nextFloat() * 0.1F + 0.9F);
/*    */     } 
/* 39 */     if ((this.f == 0 && this.a > 0.0F) || (this.f > 0 && this.a < 1.0F)) {
/* 40 */       float f1 = this.a;
/* 41 */       if (this.f > 0) {
/* 42 */         this.a += 0.1F;
/*    */       } else {
/* 44 */         this.a -= 0.1F;
/*    */       } 
/* 46 */       if (this.a > 1.0F) {
/* 47 */         this.a = 1.0F;
/*    */       }
/* 49 */       float f2 = 0.5F;
/* 50 */       if (this.a < 0.5F && f1 >= 0.5F) {
/* 51 */         double d1 = ☃ + 0.5D;
/* 52 */         double d2 = j + 0.5D;
/*    */         
/* 54 */         this.c_.a((aog)null, d1, i + 0.5D, d2, wj.bN, wk.e, 0.5F, this.c_.s.nextFloat() * 0.1F + 0.9F);
/*    */       } 
/* 56 */       if (this.a < 0.0F) {
/* 57 */         this.a = 0.0F;
/*    */       }
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean c(int ☃, int i) {
/* 64 */     if (☃ == 1) {
/* 65 */       this.f = i;
/* 66 */       return true;
/*    */     } 
/* 68 */     return super.c(☃, i);
/*    */   }
/*    */ 
/*    */   
/*    */   public void y() {
/* 73 */     A();
/* 74 */     super.y();
/*    */   }
/*    */   
/*    */   public void c() {
/* 78 */     this.f++;
/* 79 */     this.c_.a(this.d_, bct.em, 1, this.f);
/*    */   }
/*    */   
/*    */   public void d() {
/* 83 */     this.f--;
/* 84 */     this.c_.a(this.d_, bct.em, 1, this.f);
/*    */   }
/*    */   
/*    */   public boolean a(aog ☃) {
/* 88 */     if (this.c_.f(this.d_) != this) {
/* 89 */       return false;
/*    */     }
/* 91 */     if (☃.d(this.d_.o() + 0.5D, this.d_.p() + 0.5D, this.d_.q() + 0.5D) > 64.0D) {
/* 92 */       return false;
/*    */     }
/*    */     
/* 95 */     return true;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bjt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */