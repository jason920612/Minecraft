/*    */ import javax.annotation.concurrent.Immutable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Immutable
/*    */ public class adp
/*    */ {
/* 10 */   public static final adp a = new adp("");
/*    */   
/*    */   private final String b;
/*    */ 
/*    */   
/*    */   public adp(String ☃) {
/* 16 */     this.b = ☃;
/*    */   }
/*    */   
/*    */   public boolean a() {
/* 20 */     return (this.b == null || this.b.isEmpty());
/*    */   }
/*    */   
/*    */   public String b() {
/* 24 */     return this.b;
/*    */   }
/*    */   
/*    */   public void a(gy ☃) {
/* 28 */     ☃.a("Lock", this.b);
/*    */   }
/*    */   
/*    */   public static adp b(gy ☃) {
/* 32 */     if (☃.c("Lock", 8)) {
/* 33 */       String str = ☃.l("Lock");
/* 34 */       return new adp(str);
/*    */     } 
/* 36 */     return a;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\adp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */