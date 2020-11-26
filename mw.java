/*    */ import java.io.IOException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class mw
/*    */   implements iv<me>
/*    */ {
/*    */   private boolean a;
/*    */   private boolean b;
/*    */   
/*    */   public mw() {}
/*    */   
/*    */   public mw(boolean ☃, boolean bool1) {
/* 17 */     this.a = ☃;
/* 18 */     this.b = bool1;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(hy ☃) throws IOException {
/* 23 */     this.a = ☃.readBoolean();
/* 24 */     this.b = ☃.readBoolean();
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(hy ☃) throws IOException {
/* 29 */     ☃.writeBoolean(this.a);
/* 30 */     ☃.writeBoolean(this.b);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(me ☃) {
/* 35 */     ☃.a(this);
/*    */   }
/*    */   
/*    */   public boolean b() {
/* 39 */     return this.a;
/*    */   }
/*    */   
/*    */   public boolean c() {
/* 43 */     return this.b;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\mw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */