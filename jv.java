/*    */ import java.io.IOException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class jv
/*    */   implements iv<iy>
/*    */ {
/*    */   private int a;
/*    */   private int b;
/*    */   private int c;
/*    */   
/*    */   public jv() {}
/*    */   
/*    */   public jv(int ☃, int i, int j) {
/* 19 */     this.a = ☃;
/* 20 */     this.b = i;
/* 21 */     this.c = j;
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
/* 33 */     this.c = ☃.readShort();
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void b(hy ☃) throws IOException {
/* 39 */     ☃.writeByte(this.a);
/* 40 */     ☃.writeShort(this.b);
/* 41 */     ☃.writeShort(this.c);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\jv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */