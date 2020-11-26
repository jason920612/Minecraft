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
/*    */ public class ml
/*    */   implements iv<me>
/*    */ {
/*    */   private int a;
/*    */   private short b;
/*    */   private boolean c;
/*    */   
/*    */   public void a(me ☃) {
/* 24 */     ☃.a(this);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(hy ☃) throws IOException {
/* 29 */     this.a = ☃.readByte();
/* 30 */     this.b = ☃.readShort();
/* 31 */     this.c = (☃.readByte() != 0);
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(hy ☃) throws IOException {
/* 36 */     ☃.writeByte(this.a);
/* 37 */     ☃.writeShort(this.b);
/* 38 */     ☃.writeByte(this.c ? 1 : 0);
/*    */   }
/*    */   
/*    */   public int b() {
/* 42 */     return this.a;
/*    */   }
/*    */   
/*    */   public short c() {
/* 46 */     return this.b;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\ml.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */