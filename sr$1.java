/*    */ import java.awt.event.WindowAdapter;
/*    */ import java.awt.event.WindowEvent;
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
/*    */ final class null
/*    */   extends WindowAdapter
/*    */ {
/*    */   null(so paramso) {}
/*    */   
/*    */   public void windowClosing(WindowEvent ☃) {
/* 53 */     this.a.p();
/* 54 */     while (!this.a.ab()) {
/*    */       try {
/* 56 */         Thread.sleep(100L);
/* 57 */       } catch (InterruptedException interruptedException) {
/* 58 */         interruptedException.printStackTrace();
/*    */       } 
/*    */     } 
/* 61 */     System.exit(0);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\sr$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */