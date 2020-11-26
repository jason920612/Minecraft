/*    */ import java.io.IOException;
/*    */ import java.util.UUID;
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
/*    */ public class jd
/*    */   implements iv<iy>
/*    */ {
/*    */   private int a;
/*    */   private UUID b;
/*    */   private el c;
/*    */   private eq d;
/*    */   private int e;
/*    */   
/*    */   public jd() {}
/*    */   
/*    */   public jd(ame ☃) {
/* 27 */     this.a = ☃.Q();
/* 28 */     this.b = ☃.bt();
/* 29 */     this.c = ☃.n();
/* 30 */     this.d = ☃.c;
/* 31 */     this.e = fc.i.a(☃.d);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(hy ☃) throws IOException {
/* 36 */     this.a = ☃.g();
/* 37 */     this.b = ☃.i();
/* 38 */     this.e = ☃.g();
/* 39 */     this.c = ☃.e();
/* 40 */     this.d = eq.b(☃.readUnsignedByte());
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(hy ☃) throws IOException {
/* 45 */     ☃.d(this.a);
/* 46 */     ☃.a(this.b);
/* 47 */     ☃.d(this.e);
/* 48 */     ☃.a(this.c);
/* 49 */     ☃.writeByte(this.d.b());
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(iy ☃) {
/* 54 */     ☃.a(this);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\jd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */