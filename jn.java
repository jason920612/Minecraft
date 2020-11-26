/*    */ import java.io.IOException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class jn
/*    */   implements iv<iy>
/*    */ {
/*    */   private ij a;
/*    */   private ih b;
/*    */   
/*    */   public jn() {}
/*    */   
/*    */   public jn(ij ☃) {
/* 19 */     this(☃, ih.b);
/*    */   }
/*    */   
/*    */   public jn(ij ☃, ih ih1) {
/* 23 */     this.a = ☃;
/* 24 */     this.b = ih1;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(hy ☃) throws IOException {
/* 29 */     this.a = ☃.f();
/* 30 */     this.b = ih.a(☃.readByte());
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(hy ☃) throws IOException {
/* 35 */     ☃.a(this.a);
/* 36 */     ☃.writeByte(this.b.a());
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(iy ☃) {
/* 41 */     ☃.a(this);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean c() {
/* 49 */     return (this.b == ih.b || this.b == ih.c);
/*    */   }
/*    */   
/*    */   public ih d() {
/* 53 */     return this.b;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a() {
/* 58 */     return true;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\jn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */