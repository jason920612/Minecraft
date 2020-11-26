/*    */ public class h
/*    */   extends RuntimeException
/*    */ {
/*    */   private final b a;
/*    */   
/*    */   public h(b ☃) {
/*  7 */     this.a = ☃;
/*    */   }
/*    */   
/*    */   public b a() {
/* 11 */     return this.a;
/*    */   }
/*    */ 
/*    */   
/*    */   public Throwable getCause() {
/* 16 */     return this.a.b();
/*    */   }
/*    */ 
/*    */   
/*    */   public String getMessage() {
/* 21 */     return this.a.a();
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\h.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */