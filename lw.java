/*    */ import java.io.IOException;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class lw
/*    */   implements iv<iy>
/*    */ {
/*    */   private int a;
/*    */   @Nullable
/*    */   private gy b;
/*    */   
/*    */   public lw() {}
/*    */   
/*    */   public lw(int ☃, @Nullable gy gy1) {
/* 20 */     this.a = ☃;
/* 21 */     this.b = gy1;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(hy ☃) throws IOException {
/* 26 */     this.a = ☃.g();
/* 27 */     this.b = ☃.j();
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(hy ☃) throws IOException {
/* 32 */     ☃.d(this.a);
/* 33 */     ☃.a(this.b);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(iy ☃) {
/* 38 */     ☃.a(this);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean a() {
/* 52 */     return true;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\lw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */