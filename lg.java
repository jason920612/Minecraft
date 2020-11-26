/*    */ import java.io.IOException;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class lg
/*    */   implements iv<iy>
/*    */ {
/*    */   private int a;
/*    */   private List<ou.a<?>> b;
/*    */   
/*    */   public lg() {}
/*    */   
/*    */   public lg(int ☃, ou ou1, boolean bool) {
/* 19 */     this.a = ☃;
/* 20 */     if (bool) {
/* 21 */       this.b = ou1.c();
/* 22 */       ou1.e();
/*    */     } else {
/* 24 */       this.b = ou1.b();
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(hy ☃) throws IOException {
/* 30 */     this.a = ☃.g();
/* 31 */     this.b = ou.b(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(hy ☃) throws IOException {
/* 36 */     ☃.d(this.a);
/* 37 */     ou.a(this.b, ☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(iy ☃) {
/* 42 */     ☃.a(this);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\lg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */