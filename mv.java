/*    */ import java.io.IOException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class mv
/*    */   implements iv<me>
/*    */ {
/*    */   private double a;
/*    */   private double b;
/*    */   private double c;
/*    */   private float d;
/*    */   private float e;
/*    */   
/*    */   public mv() {}
/*    */   
/*    */   public mv(aer ☃) {
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
/*    */   public void a(me ☃) {
/* 48 */     ☃.a(this);
/*    */   }
/*    */   
/*    */   public double b() {
/* 52 */     return this.a;
/*    */   }
/*    */   
/*    */   public double c() {
/* 56 */     return this.b;
/*    */   }
/*    */   
/*    */   public double d() {
/* 60 */     return this.c;
/*    */   }
/*    */   
/*    */   public float e() {
/* 64 */     return this.d;
/*    */   }
/*    */   
/*    */   public float f() {
/* 68 */     return this.e;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\mv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */