/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class aqu
/*    */   extends aqx
/*    */ {
/*    */   private final aqc a;
/*    */   private final aog b;
/*    */   private int c;
/*    */   
/*    */   public aqu(aog ☃, aqc aqc1, ade ade1, int i, int j, int k) {
/* 14 */     super(ade1, i, j, k);
/* 15 */     this.b = ☃;
/* 16 */     this.a = aqc1;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(ate ☃) {
/* 21 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public ate a(int ☃) {
/* 26 */     if (e()) {
/* 27 */       this.c += Math.min(☃, d().C());
/*    */     }
/* 29 */     return super.a(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(ate ☃, int i) {
/* 34 */     this.c += i;
/* 35 */     c(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void b(int ☃) {
/* 40 */     this.c += ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void c(ate ☃) {
/* 45 */     if (this.c > 0) {
/* 46 */       ☃.a(this.b.m, this.b, this.c);
/*    */     }
/* 48 */     ((aqs)this.d).d(this.b);
/* 49 */     this.c = 0;
/*    */   }
/*    */ 
/*    */   
/*    */   public ate a(aog ☃, ate ate1) {
/* 54 */     c(ate1);
/*    */     
/* 56 */     ez<ate> ez = ☃.m.E().c(this.a, ☃.m);
/*    */     
/* 58 */     for (int i = 0; i < ez.size(); i++) {
/* 59 */       ate ate2 = this.a.a(i);
/* 60 */       ate ate3 = ez.get(i);
/*    */       
/* 62 */       if (!ate2.a()) {
/* 63 */         this.a.a(i, 1);
/* 64 */         ate2 = this.a.a(i);
/*    */       } 
/*    */       
/* 67 */       if (!ate3.a()) {
/* 68 */         if (ate2.a()) {
/*    */           
/* 70 */           this.a.a(i, ate3);
/* 71 */         } else if (ate.c(ate2, ate3) && ate.a(ate2, ate3)) {
/* 72 */           ate3.f(ate2.C());
/* 73 */           this.a.a(i, ate3);
/* 74 */         } else if (!this.b.bB.e(ate3)) {
/*    */           
/* 76 */           this.b.a(ate3, false);
/*    */         } 
/*    */       }
/*    */     } 
/* 80 */     return ate1;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\aqu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */