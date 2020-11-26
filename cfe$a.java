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
/* 73 */   a("always", 0),
/* 74 */   b("never", 1),
/* 75 */   c("pushOtherTeams", 2),
/* 76 */   d("pushOwnTeam", 3);
/*    */   static {
/* 78 */     g = (Map<String, a>)Arrays.<a>stream(values()).collect(Collectors.toMap(☃ -> ☃.e, ☃ -> ☃));
/*    */   }
/*    */   private static final Map<String, a> g;
/*    */   public final String e;
/*    */   public final int f;
/*    */   
/*    */   @Nullable
/*    */   public static a a(String ☃) {
/* 86 */     return g.get(☃);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   a(String ☃, int i) {
/* 93 */     this.e = ☃;
/* 94 */     this.f = i;
/*    */   }
/*    */   
/*    */   public ij b() {
/* 98 */     return new ir("team.collision." + this.e, new Object[0]);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\cfe$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */