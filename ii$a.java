/*    */ import java.util.Arrays;
/*    */ import java.util.Map;
/*    */ import java.util.stream.Collectors;
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
/*    */ public enum a
/*    */ {
/*    */   private static final Map<String, a> f;
/* 61 */   a("open_url", true),
/* 62 */   b("open_file", false),
/* 63 */   c("run_command", true),
/* 64 */   d("suggest_command", true),
/* 65 */   e("change_page", true);
/*    */   static {
/* 67 */     f = (Map<String, a>)Arrays.<a>stream(values()).collect(Collectors.toMap(a::b, ☃ -> ☃));
/*    */   }
/*    */   private final boolean g;
/*    */   private final String h;
/*    */   
/*    */   a(String ☃, boolean bool) {
/* 73 */     this.h = ☃;
/* 74 */     this.g = bool;
/*    */   }
/*    */   
/*    */   public boolean a() {
/* 78 */     return this.g;
/*    */   }
/*    */   
/*    */   public String b() {
/* 82 */     return this.h;
/*    */   }
/*    */   
/*    */   public static a a(String ☃) {
/* 86 */     return f.get(☃);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\ii$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */