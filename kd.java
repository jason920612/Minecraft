/*    */ import java.io.IOException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class kd
/*    */   implements iv<iy>
/*    */ {
/*    */   private int a;
/*    */   private int b;
/*    */   
/*    */   public kd() {}
/*    */   
/*    */   public kd(int ☃, int i) {
/* 17 */     this.a = ☃;
/* 18 */     this.b = i;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(hy ☃) throws IOException {
/* 23 */     this.a = ☃.readInt();
/* 24 */     this.b = ☃.readInt();
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(hy ☃) throws IOException {
/* 29 */     ☃.writeInt(this.a);
/* 30 */     ☃.writeInt(this.b);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(iy ☃) {
/* 35 */     ☃.a(this);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\kd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */