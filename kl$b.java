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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class b
/*    */   extends kl
/*    */ {
/*    */   public b() {
/* 28 */     this.h = true;
/*    */   }
/*    */   
/*    */   public b(int ☃, long l1, long l2, long l3, byte b1, byte b2, boolean bool) {
/* 32 */     super(☃);
/*    */ 
/*    */     
/* 35 */     this.b = (int)l1;
/* 36 */     this.c = (int)l2;
/* 37 */     this.d = (int)l3;
/* 38 */     this.e = b1;
/* 39 */     this.f = b2;
/* 40 */     this.g = bool;
/* 41 */     this.h = true;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(hy ☃) throws IOException {
/* 46 */     super.a(☃);
/* 47 */     this.b = ☃.readShort();
/* 48 */     this.c = ☃.readShort();
/* 49 */     this.d = ☃.readShort();
/* 50 */     this.e = ☃.readByte();
/* 51 */     this.f = ☃.readByte();
/* 52 */     this.g = ☃.readBoolean();
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(hy ☃) throws IOException {
/* 57 */     super.b(☃);
/* 58 */     ☃.writeShort(this.b);
/* 59 */     ☃.writeShort(this.c);
/* 60 */     ☃.writeShort(this.d);
/* 61 */     ☃.writeByte(this.e);
/* 62 */     ☃.writeByte(this.f);
/* 63 */     ☃.writeBoolean(this.g);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\kl$b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */