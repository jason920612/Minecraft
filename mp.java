/*    */ import java.io.IOException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class mp
/*    */   implements iv<me>
/*    */ {
/* 13 */   public static final pc a = new pc("minecraft:brand");
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private pc b;
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private hy c;
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void a(hy ☃) throws IOException {
/* 29 */     this.b = ☃.l();
/* 30 */     int i = ☃.readableBytes();
/* 31 */     if (i < 0 || i > 32767) {
/* 32 */       throw new IOException("Payload may not be larger than 32767 bytes");
/*    */     }
/* 34 */     this.c = new hy(☃.readBytes(i));
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(hy ☃) throws IOException {
/* 39 */     ☃.a(this.b);
/* 40 */     ☃.writeBytes(this.c);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(me ☃) {
/* 45 */     ☃.a(this);
/* 46 */     if (this.c != null)
/* 47 */       this.c.release(); 
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\mp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */