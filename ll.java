/*    */ import java.io.IOException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ll
/*    */   implements iv<iy>
/*    */ {
/*    */   private float a;
/*    */   private int b;
/*    */   private float c;
/*    */   
/*    */   public ll() {}
/*    */   
/*    */   public ll(float ☃, int i, float f1) {
/* 17 */     this.a = ☃;
/* 18 */     this.b = i;
/* 19 */     this.c = f1;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(hy ☃) throws IOException {
/* 24 */     this.a = ☃.readFloat();
/* 25 */     this.b = ☃.g();
/* 26 */     this.c = ☃.readFloat();
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(hy ☃) throws IOException {
/* 31 */     ☃.writeFloat(this.a);
/* 32 */     ☃.d(this.b);
/* 33 */     ☃.writeFloat(this.c);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(iy ☃) {
/* 38 */     ☃.a(this);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\ll.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */