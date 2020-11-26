/*    */ import java.util.Arrays;
/*    */ import java.util.Map;
/*    */ import java.util.function.Function;
/*    */ import java.util.stream.Collectors;
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum wk
/*    */ {
/* 10 */   a("master"),
/* 11 */   b("music"),
/* 12 */   c("record"),
/* 13 */   d("weather"),
/* 14 */   e("block"),
/* 15 */   f("hostile"),
/* 16 */   g("neutral"),
/* 17 */   h("player"),
/* 18 */   i("ambient"),
/* 19 */   j("voice"); private static final Map<String, wk> k;
/*    */   
/*    */   static {
/* 22 */     k = (Map<String, wk>)Arrays.<wk>stream(values()).collect(Collectors.toMap(wk::a, Function.identity()));
/*    */   }
/*    */   private final String l;
/*    */   
/*    */   wk(String ☃) {
/* 27 */     this.l = ☃;
/*    */   }
/*    */   
/*    */   public String a() {
/* 31 */     return this.l;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\wk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */