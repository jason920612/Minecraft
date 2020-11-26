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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class oe
/*    */   implements iv<od>
/*    */ {
/*    */   private int a;
/*    */   private hy b;
/*    */   
/*    */   public void a(hy ☃) throws IOException {
/* 26 */     this.a = ☃.g();
/* 27 */     if (☃.readBoolean()) {
/* 28 */       int i = ☃.readableBytes();
/* 29 */       if (i < 0 || i > 1048576) {
/* 30 */         throw new IOException("Payload may not be larger than 1048576 bytes");
/*    */       }
/* 32 */       this.b = new hy(☃.readBytes(i));
/*    */     } else {
/* 34 */       this.b = null;
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(hy ☃) throws IOException {
/* 40 */     ☃.d(this.a);
/* 41 */     if (this.b != null) {
/* 42 */       ☃.writeBoolean(true);
/* 43 */       ☃.writeBytes(this.b.copy());
/*    */     } else {
/* 45 */       ☃.writeBoolean(false);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(od ☃) {
/* 51 */     ☃.a(this);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\oe.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */