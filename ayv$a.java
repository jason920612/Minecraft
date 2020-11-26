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
/*    */ public class a
/*    */ {
/*    */   private final ayu[] b;
/*    */   
/*    */   public a(ayv ☃, int i, int j) {
/* 22 */     this.b = ayv.a(☃).a(i << 4, j << 4, 16, 16, false);
/*    */   }
/*    */   
/*    */   public ayu a(int ☃, int i) {
/* 26 */     return this.b[☃ & 0xF | (i & 0xF) << 4];
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\ayv$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */