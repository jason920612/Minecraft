/*    */ import java.io.IOException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class kb
/*    */   implements iv<iy>
/*    */ {
/*    */   private int a;
/*    */   private byte b;
/*    */   
/*    */   public kb() {}
/*    */   
/*    */   public kb(aer ☃, byte b) {
/* 20 */     this.a = ☃.Q();
/* 21 */     this.b = b;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(hy ☃) throws IOException {
/* 26 */     this.a = ☃.readInt();
/* 27 */     this.b = ☃.readByte();
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(hy ☃) throws IOException {
/* 32 */     ☃.writeInt(this.a);
/* 33 */     ☃.writeByte(this.b);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(iy ☃) {
/* 38 */     ☃.a(this);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\kb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */