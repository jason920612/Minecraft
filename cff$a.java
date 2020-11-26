/*     */ import com.google.common.collect.ImmutableMap;
/*     */ import java.util.Map;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public enum a
/*     */ {
/* 101 */   a("integer"),
/* 102 */   b("hearts");
/*     */   
/*     */   private final String c;
/*     */   private static final Map<String, a> d;
/*     */   
/*     */   a(String ☃) {
/* 108 */     this.c = ☃;
/*     */   }
/*     */   
/*     */   public String a() {
/* 112 */     return this.c;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   static {
/* 118 */     ImmutableMap.Builder<String, a> ☃ = ImmutableMap.builder();
/* 119 */     for (a a1 : values()) {
/* 120 */       ☃.put(a1.c, a1);
/*     */     }
/* 122 */     d = (Map<String, a>)☃.build();
/*     */   }
/*     */   
/*     */   public static a a(String ☃) {
/* 126 */     return d.getOrDefault(☃, a);
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\cff$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */