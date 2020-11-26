/*    */ import java.util.Arrays;
/*    */ import java.util.Map;
/*    */ import java.util.stream.Collectors;
/*    */ 
/*    */ 
/*    */ public class ii
/*    */ {
/*    */   private final a a;
/*    */   private final String b;
/*    */   
/*    */   public ii(a ☃, String str) {
/* 12 */     this.a = ☃;
/* 13 */     this.b = str;
/*    */   }
/*    */   
/*    */   public a a() {
/* 17 */     return this.a;
/*    */   }
/*    */   
/*    */   public String b() {
/* 21 */     return this.b;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean equals(Object ☃) {
/* 26 */     if (this == ☃) {
/* 27 */       return true;
/*    */     }
/* 29 */     if (☃ == null || getClass() != ☃.getClass()) {
/* 30 */       return false;
/*    */     }
/*    */     
/* 33 */     ii ii1 = (ii)☃;
/*    */     
/* 35 */     if (this.a != ii1.a) {
/* 36 */       return false;
/*    */     }
/* 38 */     if ((this.b != null) ? !this.b.equals(ii1.b) : (ii1.b != null)) {
/* 39 */       return false;
/*    */     }
/*    */     
/* 42 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 47 */     return "ClickEvent{action=" + this.a + ", value='" + this.b + '\'' + '}';
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int hashCode() {
/* 55 */     int ☃ = this.a.hashCode();
/* 56 */     ☃ = 31 * ☃ + ((this.b != null) ? this.b.hashCode() : 0);
/* 57 */     return ☃;
/*    */   }
/*    */   
/*    */   public enum a { private static final Map<String, a> f;
/* 61 */     a("open_url", true),
/* 62 */     b("open_file", false),
/* 63 */     c("run_command", true),
/* 64 */     d("suggest_command", true),
/* 65 */     e("change_page", true);
/*    */     static {
/* 67 */       f = (Map<String, a>)Arrays.<a>stream(values()).collect(Collectors.toMap(a::b, ☃ -> ☃));
/*    */     }
/*    */     private final boolean g;
/*    */     private final String h;
/*    */     
/*    */     a(String ☃, boolean bool) {
/* 73 */       this.h = ☃;
/* 74 */       this.g = bool;
/*    */     }
/*    */     
/*    */     public boolean a() {
/* 78 */       return this.g;
/*    */     }
/*    */     
/*    */     public String b() {
/* 82 */       return this.h;
/*    */     }
/*    */     
/*    */     public static a a(String ☃) {
/* 86 */       return f.get(☃);
/*    */     } }
/*    */ 
/*    */ }


/* Location:              F:\dw\server.jar!\ii.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */