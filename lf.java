/*    */ import java.io.IOException;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class lf
/*    */   implements iv<iy>
/*    */ {
/*    */   private int a;
/*    */   private String b;
/*    */   
/*    */   public lf() {}
/*    */   
/*    */   public lf(int ☃, @Nullable cez cez1) {
/* 19 */     this.a = ☃;
/*    */     
/* 21 */     if (cez1 == null) {
/* 22 */       this.b = "";
/*    */     } else {
/* 24 */       this.b = cez1.b();
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(hy ☃) throws IOException {
/* 30 */     this.a = ☃.readByte();
/* 31 */     this.b = ☃.e(16);
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(hy ☃) throws IOException {
/* 36 */     ☃.writeByte(this.a);
/* 37 */     ☃.a(this.b);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(iy ☃) {
/* 42 */     ☃.a(this);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\lf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */