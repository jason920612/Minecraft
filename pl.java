/*    */ import java.io.OutputStream;
/*    */ import java.io.PrintStream;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ 
/*    */ 
/*    */ public class pl
/*    */   extends PrintStream
/*    */ {
/* 10 */   protected static final Logger a = LogManager.getLogger();
/*    */   
/*    */   protected final String b;
/*    */   
/*    */   public pl(String ☃, OutputStream outputStream) {
/* 15 */     super(outputStream);
/* 16 */     this.b = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public void println(String ☃) {
/* 21 */     a(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public void println(Object ☃) {
/* 26 */     a(String.valueOf(☃));
/*    */   }
/*    */   
/*    */   protected void a(String ☃) {
/* 30 */     a.info("[{}]: {}", this.b, ☃);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\pl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */