/*    */ import java.io.IOException;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ln
/*    */   implements iv<iy>
/*    */ {
/*    */   private int a;
/*    */   private int[] b;
/*    */   
/*    */   public ln() {}
/*    */   
/*    */   public ln(aer ☃) {
/* 18 */     this.a = ☃.Q();
/* 19 */     List<aer> list = ☃.bP();
/* 20 */     this.b = new int[list.size()];
/*    */     
/* 22 */     for (int i = 0; i < list.size(); i++) {
/* 23 */       this.b[i] = ((aer)list.get(i)).Q();
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(hy ☃) throws IOException {
/* 29 */     this.a = ☃.g();
/* 30 */     this.b = ☃.b();
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(hy ☃) throws IOException {
/* 35 */     ☃.d(this.a);
/* 36 */     ☃.a(this.b);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(iy ☃) {
/* 41 */     ☃.a(this);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\ln.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */