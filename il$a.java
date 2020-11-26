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
/*    */   private static final Map<String, a> d;
/* 61 */   a("show_text", true),
/* 62 */   b("show_item", true),
/* 63 */   c("show_entity", true);
/*    */   
/*    */   static {
/* 66 */     d = (Map<String, a>)Arrays.<a>stream(values()).collect(Collectors.toMap(a::b, ☃ -> ☃));
/*    */   }
/*    */   
/*    */   private final boolean e;
/*    */   
/*    */   a(String ☃, boolean bool) {
/* 72 */     this.f = ☃;
/* 73 */     this.e = bool;
/*    */   }
/*    */   private final String f;
/*    */   public boolean a() {
/* 77 */     return this.e;
/*    */   }
/*    */   
/*    */   public String b() {
/* 81 */     return this.f;
/*    */   }
/*    */   
/*    */   public static a a(String ☃) {
/* 85 */     return d.get(☃);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\il$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */