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
/*    */ 
/*    */ public class ke
/*    */   implements iv<iy>
/*    */ {
/* 28 */   public static final String[] a = new String[] { "block.minecraft.bed.not_valid" };
/*    */ 
/*    */   
/*    */   private int b;
/*    */   
/*    */   private float c;
/*    */ 
/*    */   
/*    */   public ke() {}
/*    */ 
/*    */   
/*    */   public ke(int ☃, float f) {
/* 40 */     this.b = ☃;
/* 41 */     this.c = f;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(hy ☃) throws IOException {
/* 46 */     this.b = ☃.readUnsignedByte();
/* 47 */     this.c = ☃.readFloat();
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(hy ☃) throws IOException {
/* 52 */     ☃.writeByte(this.b);
/* 53 */     ☃.writeFloat(this.c);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(iy ☃) {
/* 58 */     ☃.a(this);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\ke.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */