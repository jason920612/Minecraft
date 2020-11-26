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
/*    */ 
/*    */ public class ny
/*    */   implements iv<nx>
/*    */ {
/*    */   private int a;
/*    */   private pc b;
/*    */   private hy c;
/*    */   
/*    */   public void a(hy ☃) throws IOException {
/* 28 */     this.a = ☃.g();
/* 29 */     this.b = ☃.l();
/* 30 */     int i = ☃.readableBytes();
/* 31 */     if (i < 0 || i > 1048576) {
/* 32 */       throw new IOException("Payload may not be larger than 1048576 bytes");
/*    */     }
/* 34 */     this.c = new hy(☃.readBytes(i));
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(hy ☃) throws IOException {
/* 39 */     ☃.d(this.a);
/* 40 */     ☃.a(this.b);
/* 41 */     ☃.writeBytes(this.c.copy());
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(nx ☃) {
/* 46 */     ☃.a(this);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\ny.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */