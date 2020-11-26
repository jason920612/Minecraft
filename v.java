/*    */ 
/*    */ 
/*    */ 
/*    */ public enum v
/*    */ {
/*  6 */   a("task", 0, a.k),
/*  7 */   b("challenge", 26, a.f),
/*  8 */   c("goal", 52, a.k);
/*    */   
/*    */   private final String d;
/*    */   
/*    */   private final int e;
/*    */   private final a f;
/*    */   
/*    */   v(String ☃, int i, a a1) {
/* 16 */     this.d = ☃;
/* 17 */     this.e = i;
/* 18 */     this.f = a1;
/*    */   }
/*    */   
/*    */   public String a() {
/* 22 */     return this.d;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static v a(String ☃) {
/* 30 */     for (v v1 : values()) {
/* 31 */       if (v1.d.equals(☃)) {
/* 32 */         return v1;
/*    */       }
/*    */     } 
/* 35 */     throw new IllegalArgumentException("Unknown frame type '" + ☃ + "'");
/*    */   }
/*    */   
/*    */   public a c() {
/* 39 */     return this.f;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\v.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */