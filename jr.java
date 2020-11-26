/*    */ import java.io.IOException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class jr
/*    */   implements iv<iy>
/*    */ {
/*    */   private int a;
/*    */   private short b;
/*    */   private boolean c;
/*    */   
/*    */   public jr() {}
/*    */   
/*    */   public jr(int ☃, short s, boolean bool) {
/* 19 */     this.a = ☃;
/* 20 */     this.b = s;
/* 21 */     this.c = bool;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(iy ☃) {
/* 26 */     ☃.a(this);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(hy ☃) throws IOException {
/* 31 */     this.a = ☃.readUnsignedByte();
/* 32 */     this.b = ☃.readShort();
/* 33 */     this.c = ☃.readBoolean();
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(hy ☃) throws IOException {
/* 38 */     ☃.writeByte(this.a);
/* 39 */     ☃.writeShort(this.b);
/* 40 */     ☃.writeBoolean(this.c);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\jr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */