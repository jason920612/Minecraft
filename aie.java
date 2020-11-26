/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class aie
/*    */   extends agt
/*    */ {
/*    */   private final afg a;
/*    */   
/*    */   public aie(afg ☃) {
/* 12 */     this.a = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a() {
/* 17 */     return (this.a.A && !this.a.m.b(new el(this.a)).a(ww.a));
/*    */   }
/*    */ 
/*    */   
/*    */   public void c() {
/* 22 */     el ☃ = null;
/*    */     
/* 24 */     Iterable<el.a> iterable = el.a.b(
/* 25 */         xq.c(this.a.q - 2.0D), 
/* 26 */         xq.c(this.a.r - 2.0D), 
/* 27 */         xq.c(this.a.s - 2.0D), 
/* 28 */         xq.c(this.a.q + 2.0D), 
/* 29 */         xq.c(this.a.r), 
/* 30 */         xq.c(this.a.s + 2.0D));
/*    */ 
/*    */     
/* 33 */     for (el el : iterable) {
/* 34 */       if (this.a.m.b(el).a(ww.a)) {
/* 35 */         ☃ = el;
/*    */         
/*    */         break;
/*    */       } 
/*    */     } 
/* 40 */     if (☃ != null)
/* 41 */       this.a.r().a(☃.o(), ☃.p(), ☃.q(), 1.0D); 
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\aie.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */