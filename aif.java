/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class aif
/*    */   extends agw
/*    */ {
/*    */   private int e;
/*    */   private final aob f;
/*    */   
/*    */   public aif(aob ☃) {
/* 16 */     super(☃, (Class)aob.class, 3.0F, 0.02F);
/* 17 */     this.f = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public void c() {
/* 22 */     super.c();
/*    */     
/* 24 */     if (this.f.dF() && this.b instanceof aob && ((aob)this.b).dG()) {
/* 25 */       this.e = 10;
/*    */     } else {
/* 27 */       this.e = 0;
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void e() {
/* 33 */     super.e();
/*    */     
/* 35 */     if (this.e > 0) {
/* 36 */       this.e--;
/*    */       
/* 38 */       if (this.e == 0) {
/*    */         
/* 40 */         adt ☃ = this.f.dD();
/* 41 */         for (int i = 0; i < ☃.T_(); i++) {
/* 42 */           ate ate1 = ☃.a(i);
/* 43 */           ate ate2 = ate.a;
/*    */           
/* 45 */           if (!ate1.a()) {
/* 46 */             ata ata = ate1.b();
/*    */             
/* 48 */             if ((ata == atf.T || ata == atf.dD || ata == atf.dC || ata == atf.eP) && ate1.C() > 3) {
/* 49 */               int j = ate1.C() / 2;
/* 50 */               ate1.g(j);
/* 51 */               ate2 = new ate(ata, j);
/* 52 */             } else if (ata == atf.S && ate1.C() > 5) {
/* 53 */               int j = ate1.C() / 2 / 3 * 3;
/* 54 */               int k = j / 3;
/* 55 */               ate1.g(j);
/* 56 */               ate2 = new ate(atf.T, k);
/*    */             } 
/*    */             
/* 59 */             if (ate1.a()) {
/* 60 */               ☃.a(i, ate.a);
/*    */             }
/*    */           } 
/* 63 */           if (!ate2.a()) {
/* 64 */             double d = this.f.r - 0.30000001192092896D + this.f.bF();
/* 65 */             amm amm = new amm(this.f.m, this.f.q, d, this.f.s, ate2);
/* 66 */             float f1 = 0.3F;
/* 67 */             float f2 = this.f.aS;
/* 68 */             float f3 = this.f.x;
/* 69 */             amm.t = (-xq.a(f2 * 0.017453292F) * xq.b(f3 * 0.017453292F) * 0.3F);
/* 70 */             amm.v = (xq.b(f2 * 0.017453292F) * xq.b(f3 * 0.017453292F) * 0.3F);
/* 71 */             amm.u = (-xq.a(f3 * 0.017453292F) * 0.3F + 0.1F);
/* 72 */             amm.n();
/*    */             
/* 74 */             this.f.m.a(amm);
/*    */             break;
/*    */           } 
/*    */         } 
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\aif.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */