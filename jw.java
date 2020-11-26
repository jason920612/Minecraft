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
/*    */ public class jw
/*    */   implements iv<iy>
/*    */ {
/*    */   private int a;
/*    */   private int b;
/* 16 */   private ate c = ate.a;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public jw(int ☃, int i, ate ate1) {
/* 23 */     this.a = ☃;
/* 24 */     this.b = i;
/* 25 */     this.c = ate1.i();
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(iy ☃) {
/* 30 */     ☃.a(this);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(hy ☃) throws IOException {
/* 35 */     this.a = ☃.readByte();
/* 36 */     this.b = ☃.readShort();
/* 37 */     this.c = ☃.k();
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(hy ☃) throws IOException {
/* 42 */     ☃.writeByte(this.a);
/* 43 */     ☃.writeShort(this.b);
/* 44 */     ☃.a(this.c);
/*    */   }
/*    */   
/*    */   public jw() {}
/*    */ }


/* Location:              F:\dw\server.jar!\jw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */