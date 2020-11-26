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
/*    */ public class nu
/*    */   implements iv<nv>
/*    */ {
/*    */   private int a;
/*    */   private String b;
/*    */   private int c;
/*    */   private hx d;
/*    */   
/*    */   public void a(hy ☃) throws IOException {
/* 33 */     this.a = ☃.g();
/* 34 */     this.b = ☃.e(255);
/* 35 */     this.c = ☃.readUnsignedShort();
/* 36 */     this.d = hx.a(☃.g());
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(hy ☃) throws IOException {
/* 41 */     ☃.d(this.a);
/* 42 */     ☃.a(this.b);
/* 43 */     ☃.writeShort(this.c);
/* 44 */     ☃.d(this.d.a());
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(nv ☃) {
/* 49 */     ☃.a(this);
/*    */   }
/*    */   
/*    */   public hx b() {
/* 53 */     return this.d;
/*    */   }
/*    */   
/*    */   public int c() {
/* 57 */     return this.a;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\nu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */