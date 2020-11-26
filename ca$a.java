/*    */ import com.google.common.collect.Maps;
/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ import java.util.function.BiFunction;
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
/*    */ public enum a
/*    */ {
/*    */   a, b;
/*    */   private static final Map<String, a> c;
/*    */   private final String d;
/*    */   private final BiFunction<cee, aer, cee> e;
/*    */   
/*    */   static {
/* 60 */     a = new a("FEET", 0, "feet", (☃, aer1) -> ☃);
/* 61 */     b = new a("EYES", 1, "eyes", (☃, aer1) -> new cee(☃.b, ☃.c + aer1.bF(), ☃.d));
/*    */   }
/*    */   static {
/* 64 */     c = k.<Map<String, a>>a(Maps.newHashMap(), ☃ -> {
/*    */           for (a a1 : values()) {
/*    */             ☃.put(a1.d, a1);
/*    */           }
/*    */         });
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   a(String ☃, BiFunction<cee, aer, cee> biFunction) {
/* 74 */     this.d = ☃;
/* 75 */     this.e = biFunction;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public static a a(String ☃) {
/* 80 */     return c.get(☃);
/*    */   }
/*    */   
/*    */   public cee a(aer ☃) {
/* 84 */     return this.e.apply(new cee(☃.q, ☃.r, ☃.s), ☃);
/*    */   }
/*    */   
/*    */   public cee a(bu ☃) {
/* 88 */     aer aer = ☃.f();
/* 89 */     if (aer == null) {
/* 90 */       return ☃.d();
/*    */     }
/* 92 */     return this.e.apply(☃.d(), aer);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\ca$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */