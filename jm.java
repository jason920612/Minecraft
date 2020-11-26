/*    */ import java.io.IOException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class jm
/*    */   implements iv<iy>
/*    */ {
/*    */   private adi a;
/*    */   private boolean b;
/*    */   
/*    */   public jm() {}
/*    */   
/*    */   public jm(adi ☃, boolean bool) {
/* 19 */     this.a = ☃;
/* 20 */     this.b = bool;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(iy ☃) {
/* 25 */     ☃.a(this);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(hy ☃) throws IOException {
/* 30 */     this.a = adi.a(☃.readUnsignedByte());
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(hy ☃) throws IOException {
/* 35 */     ☃.writeByte(this.a.a());
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\jm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */