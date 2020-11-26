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
/*    */ public class ji
/*    */   implements iv<iy>
/*    */ {
/*    */   private el a;
/*    */   private int b;
/*    */   private gy c;
/*    */   
/*    */   public ji() {}
/*    */   
/*    */   public ji(el ☃, int i, gy gy1) {
/* 33 */     this.a = ☃;
/* 34 */     this.b = i;
/* 35 */     this.c = gy1;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(hy ☃) throws IOException {
/* 40 */     this.a = ☃.e();
/* 41 */     this.b = ☃.readUnsignedByte();
/* 42 */     this.c = ☃.j();
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(hy ☃) throws IOException {
/* 47 */     ☃.a(this.a);
/* 48 */     ☃.writeByte((byte)this.b);
/* 49 */     ☃.a(this.c);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(iy ☃) {
/* 54 */     ☃.a(this);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\ji.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */