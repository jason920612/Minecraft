/*    */ import java.io.IOException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ko
/*    */   implements iv<iy>
/*    */ {
/*    */   private int a;
/*    */   private pc b;
/*    */   
/*    */   public ko() {}
/*    */   
/*    */   public ko(int ☃, avk avk1) {
/* 19 */     this.a = ☃;
/* 20 */     this.b = avk1.b();
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
/*    */   public void a(hy ☃) throws IOException {
/* 33 */     this.a = ☃.readByte();
/* 34 */     this.b = ☃.l();
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(hy ☃) throws IOException {
/* 39 */     ☃.writeByte(this.a);
/* 40 */     ☃.a(this.b);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(iy ☃) {
/* 45 */     ☃.a(this);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\ko.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */