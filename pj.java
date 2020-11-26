/*    */ import java.io.OutputStream;
/*    */ 
/*    */ public class pj
/*    */   extends pl
/*    */ {
/*    */   public pj(String ☃, OutputStream outputStream) {
/*  7 */     super(☃, outputStream);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(String ☃) {
/* 12 */     StackTraceElement[] arrayOfStackTraceElement = Thread.currentThread().getStackTrace();
/* 13 */     StackTraceElement stackTraceElement = arrayOfStackTraceElement[Math.min(3, arrayOfStackTraceElement.length)];
/* 14 */     a.info("[{}]@.({}:{}): {}", this.b, stackTraceElement.getFileName(), Integer.valueOf(stackTraceElement.getLineNumber()), ☃);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\pj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */