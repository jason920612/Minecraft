/*    */ import com.google.gson.JsonObject;
/*    */ import java.io.File;
/*    */ import java.net.SocketAddress;
/*    */ 
/*    */ 
/*    */ public class vm
/*    */   extends vt<String, vn>
/*    */ {
/*    */   public vm(File ☃) {
/* 10 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   protected vs<String> a(JsonObject ☃) {
/* 15 */     return new vn(☃);
/*    */   }
/*    */   
/*    */   public boolean a(SocketAddress ☃) {
/* 19 */     String str = c(☃);
/* 20 */     return d(str);
/*    */   }
/*    */   
/*    */   public boolean a(String ☃) {
/* 24 */     return d(☃);
/*    */   }
/*    */   
/*    */   public vn b(SocketAddress ☃) {
/* 28 */     String str = c(☃);
/* 29 */     return b(str);
/*    */   }
/*    */   
/*    */   private String c(SocketAddress ☃) {
/* 33 */     String str = ☃.toString();
/* 34 */     if (str.contains("/")) {
/* 35 */       str = str.substring(str.indexOf('/') + 1);
/*    */     }
/* 37 */     if (str.contains(":")) {
/* 38 */       str = str.substring(0, str.indexOf(':'));
/*    */     }
/* 40 */     return str;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\vm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */