/*    */ 
/*    */ public enum bmc
/*    */   implements xv
/*    */ {
/*    */   public static final bmc[] d;
/*  6 */   a("single", 0),
/*  7 */   b("left", 2),
/*  8 */   c("right", 1);
/*    */   
/*    */   static {
/* 11 */     d = values();
/*    */   }
/*    */   
/*    */   private final String e;
/*    */   
/*    */   bmc(String ☃, int i) {
/* 17 */     this.e = ☃;
/* 18 */     this.f = i;
/*    */   }
/*    */   private final int f;
/*    */   
/*    */   public String m() {
/* 23 */     return this.e;
/*    */   }
/*    */   
/*    */   public bmc a() {
/* 27 */     return d[this.f];
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bmc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */