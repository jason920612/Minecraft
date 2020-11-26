/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import com.mojang.datafixers.types.constant.NamespacedStringType;
/*    */ import io.netty.util.ResourceLeakDetector;
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
/*    */ public class j
/*    */ {
/* 47 */   public static final ResourceLeakDetector.Level a = ResourceLeakDetector.Level.DISABLED;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static boolean b;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static boolean a(char ☃) {
/* 60 */     return (☃ != '§' && ☃ >= ' ' && ☃ != '');
/*    */   }
/*    */   
/* 63 */   public static final char[] c = new char[] { '/', '\n', '\r', '\t', Character.MIN_VALUE, '\f', '`', '?', '*', '\\', '<', '>', '|', '"', ':' };
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static String a(String ☃) {
/* 72 */     StringBuilder stringBuilder = new StringBuilder();
/*    */     
/* 74 */     for (char c : ☃.toCharArray()) {
/* 75 */       if (a(c)) {
/* 76 */         stringBuilder.append(c);
/*    */       }
/*    */     } 
/*    */     
/* 80 */     return stringBuilder.toString();
/*    */   }
/*    */   
/*    */   static {
/* 84 */     ResourceLeakDetector.setLevel(a);
/* 85 */     CommandSyntaxException.ENABLE_COMMAND_STACK_TRACES = false;
/* 86 */     CommandSyntaxException.BUILT_IN_EXCEPTIONS = new bq();
/* 87 */     NamespacedStringType.ENSURE_NAMESPACE = abl::a;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\j.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */