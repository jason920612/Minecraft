/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class aqq
/*    */   extends adt
/*    */ {
/*    */   private bjt a;
/*    */   
/*    */   public aqq() {
/* 15 */     super(new ir("container.enderchest", new Object[0]), 27);
/*    */   }
/*    */   
/*    */   public void a(bjt ☃) {
/* 19 */     this.a = ☃;
/*    */   }
/*    */   public void a(he ☃) {
/*    */     int i;
/* 23 */     for (i = 0; i < T_(); i++) {
/* 24 */       a(i, ate.a);
/*    */     }
/* 26 */     for (i = 0; i < ☃.size(); i++) {
/* 27 */       gy gy = ☃.e(i);
/* 28 */       int j = gy.f("Slot") & 0xFF;
/* 29 */       if (j >= 0 && j < T_()) {
/* 30 */         a(j, ate.a(gy));
/*    */       }
/*    */     } 
/*    */   }
/*    */   
/*    */   public he i() {
/* 36 */     he ☃ = new he();
/* 37 */     for (int i = 0; i < T_(); i++) {
/* 38 */       ate ate = a(i);
/* 39 */       if (!ate.a()) {
/* 40 */         gy gy = new gy();
/* 41 */         gy.a("Slot", (byte)i);
/* 42 */         ate.b(gy);
/* 43 */         ☃.a(gy);
/*    */       } 
/*    */     } 
/* 46 */     return ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(aog ☃) {
/* 51 */     if (this.a != null && !this.a.a(☃)) {
/* 52 */       return false;
/*    */     }
/* 54 */     return super.a(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(aog ☃) {
/* 59 */     if (this.a != null) {
/* 60 */       this.a.c();
/*    */     }
/* 62 */     super.b(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public void c(aog ☃) {
/* 67 */     if (this.a != null) {
/* 68 */       this.a.d();
/*    */     }
/* 70 */     super.c(☃);
/* 71 */     this.a = null;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\aqq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */