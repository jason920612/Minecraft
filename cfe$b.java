/*    */ import java.util.Arrays;
/*    */ import java.util.Map;
/*    */ import java.util.stream.Collectors;
/*    */ import javax.annotation.Nullable;
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
/*    */ public enum b
/*    */ {
/* 43 */   a("always", 0),
/* 44 */   b("never", 1),
/* 45 */   c("hideForOtherTeams", 2),
/* 46 */   d("hideForOwnTeam", 3);
/*    */   static {
/* 48 */     g = (Map<String, b>)Arrays.<b>stream(values()).collect(Collectors.toMap(☃ -> ☃.e, ☃ -> ☃));
/*    */   }
/*    */   private static final Map<String, b> g;
/*    */   public final String e;
/*    */   public final int f;
/*    */   
/*    */   @Nullable
/*    */   public static b a(String ☃) {
/* 56 */     return g.get(☃);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   b(String ☃, int i) {
/* 63 */     this.e = ☃;
/* 64 */     this.f = i;
/*    */   }
/*    */   
/*    */   public ij b() {
/* 68 */     return new ir("team.visibility." + this.e, new Object[0]);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\cfe$b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */