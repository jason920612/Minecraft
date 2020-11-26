/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class aqp
/*    */   extends aqx
/*    */ {
/*    */   private final aqn a;
/*    */   private final aog b;
/*    */   private int c;
/*    */   private final axd h;
/*    */   
/*    */   public aqp(aog ☃, axd axd1, aqn aqn1, int i, int j, int k) {
/* 16 */     super(aqn1, i, j, k);
/* 17 */     this.b = ☃;
/* 18 */     this.h = axd1;
/* 19 */     this.a = aqn1;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(ate ☃) {
/* 24 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public ate a(int ☃) {
/* 29 */     if (e()) {
/* 30 */       this.c += Math.min(☃, d().C());
/*    */     }
/* 32 */     return super.a(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(ate ☃, int i) {
/* 37 */     this.c += i;
/* 38 */     c(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void c(ate ☃) {
/* 43 */     ☃.a(this.b.m, this.b, this.c);
/* 44 */     this.c = 0;
/*    */   }
/*    */ 
/*    */   
/*    */   public ate a(aog ☃, ate ate1) {
/* 49 */     c(ate1);
/*    */     
/* 51 */     axe axe = this.a.j();
/* 52 */     if (axe != null) {
/* 53 */       ate ate2 = this.a.a(0);
/* 54 */       ate ate3 = this.a.a(1);
/*    */ 
/*    */       
/* 57 */       if (a(axe, ate2, ate3) || a(axe, ate3, ate2)) {
/* 58 */         this.h.a(axe);
/* 59 */         ☃.a(ws.R);
/*    */         
/* 61 */         this.a.a(0, ate2);
/* 62 */         this.a.a(1, ate3);
/*    */       } 
/*    */     } 
/* 65 */     return ate1;
/*    */   }
/*    */   
/*    */   private boolean a(axe ☃, ate ate1, ate ate2) {
/* 69 */     ate ate3 = ☃.a();
/* 70 */     ate ate4 = ☃.b();
/*    */     
/* 72 */     if (ate1.b() == ate3.b() && ate1.C() >= ate3.C()) {
/*    */       
/* 74 */       if (!ate4.a() && !ate2.a() && ate4.b() == ate2.b() && ate2.C() >= ate4.C()) {
/* 75 */         ate1.g(ate3.C());
/* 76 */         ate2.g(ate4.C());
/* 77 */         return true;
/* 78 */       }  if (ate4.a() && ate2.a()) {
/* 79 */         ate1.g(ate3.C());
/* 80 */         return true;
/*    */       } 
/*    */     } 
/* 83 */     return false;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\aqp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */