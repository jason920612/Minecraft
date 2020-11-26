/*    */ import java.io.IOException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class km
/*    */   implements iv<iy>
/*    */ {
/*    */   private double a;
/*    */   private double b;
/*    */   private double c;
/*    */   private float d;
/*    */   private float e;
/*    */   
/*    */   public km() {}
/*    */   
/*    */   public km(aer ☃) {
/* 21 */     this.a = ☃.q;
/* 22 */     this.b = ☃.r;
/* 23 */     this.c = ☃.s;
/* 24 */     this.d = ☃.w;
/* 25 */     this.e = ☃.x;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(hy ☃) throws IOException {
/* 30 */     this.a = ☃.readDouble();
/* 31 */     this.b = ☃.readDouble();
/* 32 */     this.c = ☃.readDouble();
/* 33 */     this.d = ☃.readFloat();
/* 34 */     this.e = ☃.readFloat();
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(hy ☃) throws IOException {
/* 39 */     ☃.writeDouble(this.a);
/* 40 */     ☃.writeDouble(this.b);
/* 41 */     ☃.writeDouble(this.c);
/* 42 */     ☃.writeFloat(this.d);
/* 43 */     ☃.writeFloat(this.e);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(iy ☃) {
/* 48 */     ☃.a(this);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\km.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */