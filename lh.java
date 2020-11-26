/*    */ import java.io.IOException;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class lh
/*    */   implements iv<iy>
/*    */ {
/*    */   private int a;
/*    */   private int b;
/*    */   
/*    */   public lh() {}
/*    */   
/*    */   public lh(aer ☃, @Nullable aer aer1) {
/* 18 */     this.a = ☃.Q();
/* 19 */     this.b = (aer1 != null) ? aer1.Q() : -1;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(hy ☃) throws IOException {
/* 24 */     this.a = ☃.readInt();
/* 25 */     this.b = ☃.readInt();
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(hy ☃) throws IOException {
/* 30 */     ☃.writeInt(this.a);
/* 31 */     ☃.writeInt(this.b);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(iy ☃) {
/* 36 */     ☃.a(this);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\lh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */