/*    */ import java.io.IOException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class kh
/*    */   implements iv<iy>
/*    */ {
/*    */   private int a;
/*    */   private el b;
/*    */   private int c;
/*    */   private boolean d;
/*    */   
/*    */   public kh() {}
/*    */   
/*    */   public kh(int ☃, el el1, int i, boolean bool) {
/* 21 */     this.a = ☃;
/* 22 */     this.b = el1.h();
/* 23 */     this.c = i;
/* 24 */     this.d = bool;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(hy ☃) throws IOException {
/* 29 */     this.a = ☃.readInt();
/* 30 */     this.b = ☃.e();
/* 31 */     this.c = ☃.readInt();
/* 32 */     this.d = ☃.readBoolean();
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(hy ☃) throws IOException {
/* 37 */     ☃.writeInt(this.a);
/* 38 */     ☃.a(this.b);
/* 39 */     ☃.writeInt(this.c);
/* 40 */     ☃.writeBoolean(this.d);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(iy ☃) {
/* 45 */     ☃.a(this);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\kh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */