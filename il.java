/*    */ import java.util.Arrays;
/*    */ import java.util.Map;
/*    */ import java.util.stream.Collectors;
/*    */ 
/*    */ 
/*    */ public class il
/*    */ {
/*    */   private final a a;
/*    */   private final ij b;
/*    */   
/*    */   public il(a ☃, ij ij1) {
/* 12 */     this.a = ☃;
/* 13 */     this.b = ij1;
/*    */   }
/*    */   
/*    */   public a a() {
/* 17 */     return this.a;
/*    */   }
/*    */   
/*    */   public ij b() {
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
/* 33 */     il il1 = (il)☃;
/*    */     
/* 35 */     if (this.a != il1.a) {
/* 36 */       return false;
/*    */     }
/* 38 */     if ((this.b != null) ? !this.b.equals(il1.b) : (il1.b != null)) {
/* 39 */       return false;
/*    */     }
/*    */     
/* 42 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 47 */     return "HoverEvent{action=" + this.a + ", value='" + this.b + '\'' + '}';
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
/*    */   public enum a { private static final Map<String, a> d;
/* 61 */     a("show_text", true),
/* 62 */     b("show_item", true),
/* 63 */     c("show_entity", true);
/*    */     
/*    */     static {
/* 66 */       d = (Map<String, a>)Arrays.<a>stream(values()).collect(Collectors.toMap(a::b, ☃ -> ☃));
/*    */     }
/*    */     private final boolean e;
/*    */     private final String f;
/*    */     
/*    */     a(String ☃, boolean bool) {
/* 72 */       this.f = ☃;
/* 73 */       this.e = bool;
/*    */     }
/*    */     
/*    */     public boolean a() {
/* 77 */       return this.e;
/*    */     }
/*    */     
/*    */     public String b() {
/* 81 */       return this.f;
/*    */     }
/*    */     
/*    */     public static a a(String ☃) {
/* 85 */       return d.get(☃);
/*    */     } }
/*    */ 
/*    */ }


/* Location:              F:\dw\server.jar!\il.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */