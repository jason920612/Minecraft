/*    */ import java.util.Arrays;
/*    */ import java.util.Collection;
/*    */ import java.util.Map;
/*    */ import java.util.stream.Collectors;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class cfe
/*    */ {
/*    */   public boolean a(@Nullable cfe ☃) {
/* 15 */     if (☃ == null) {
/* 16 */       return false;
/*    */     }
/* 18 */     if (this == ☃) {
/* 19 */       return true;
/*    */     }
/* 21 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public abstract String b();
/*    */ 
/*    */   
/*    */   public abstract ij d(ij paramij);
/*    */ 
/*    */   
/*    */   public abstract boolean h();
/*    */   
/*    */   public abstract a n();
/*    */   
/*    */   public abstract Collection<String> g();
/*    */   
/*    */   public abstract b k();
/*    */   
/*    */   public abstract a l();
/*    */   
/*    */   public enum b
/*    */   {
/* 43 */     a("always", 0),
/* 44 */     b("never", 1),
/* 45 */     c("hideForOtherTeams", 2),
/* 46 */     d("hideForOwnTeam", 3);
/*    */     static {
/* 48 */       g = (Map<String, b>)Arrays.<b>stream(values()).collect(Collectors.toMap(☃ -> ☃.e, ☃ -> ☃));
/*    */     }
/*    */     private static final Map<String, b> g;
/*    */     public final String e;
/*    */     public final int f;
/*    */     
/*    */     @Nullable
/*    */     public static b a(String ☃) {
/* 56 */       return g.get(☃);
/*    */     }
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     b(String ☃, int i) {
/* 63 */       this.e = ☃;
/* 64 */       this.f = i;
/*    */     }
/*    */     
/*    */     public ij b() {
/* 68 */       return new ir("team.visibility." + this.e, new Object[0]);
/*    */     }
/*    */   }
/*    */   
/*    */   public enum a {
/* 73 */     a("always", 0),
/* 74 */     b("never", 1),
/* 75 */     c("pushOtherTeams", 2),
/* 76 */     d("pushOwnTeam", 3); private static final Map<String, a> g;
/*    */     static {
/* 78 */       g = (Map<String, a>)Arrays.<a>stream(values()).collect(Collectors.toMap(☃ -> ☃.e, ☃ -> ☃));
/*    */     }
/*    */     
/*    */     public final String e;
/*    */     public final int f;
/*    */     
/*    */     @Nullable
/*    */     public static a a(String ☃) {
/* 86 */       return g.get(☃);
/*    */     }
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     a(String ☃, int i) {
/* 93 */       this.e = ☃;
/* 94 */       this.f = i;
/*    */     }
/*    */     
/*    */     public ij b() {
/* 98 */       return new ir("team.collision." + this.e, new Object[0]);
/*    */     }
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\cfe.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */