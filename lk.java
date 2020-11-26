/*    */ import java.io.IOException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class lk
/*    */   implements iv<iy>
/*    */ {
/*    */   private float a;
/*    */   private int b;
/*    */   private int c;
/*    */   
/*    */   public lk() {}
/*    */   
/*    */   public lk(float ☃, int i, int j) {
/* 17 */     this.a = ☃;
/* 18 */     this.b = i;
/* 19 */     this.c = j;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(hy ☃) throws IOException {
/* 24 */     this.a = ☃.readFloat();
/* 25 */     this.c = ☃.g();
/* 26 */     this.b = ☃.g();
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(hy ☃) throws IOException {
/* 31 */     ☃.writeFloat(this.a);
/* 32 */     ☃.d(this.c);
/* 33 */     ☃.d(this.b);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(iy ☃) {
/* 38 */     ☃.a(this);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\lk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */