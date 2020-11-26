/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum uw
/*    */ {
/*  8 */   a("old"),
/*  9 */   b("new"),
/* 10 */   c("compatible");
/*    */   
/*    */   private final ij d;
/*    */   
/*    */   private final ij e;
/*    */   
/*    */   uw(String ☃) {
/* 17 */     this.d = new ir("resourcePack.incompatible." + ☃, new Object[0]);
/* 18 */     this.e = new ir("resourcePack.incompatible.confirm." + ☃, new Object[0]);
/*    */   }
/*    */   
/*    */   public boolean a() {
/* 22 */     return (this == c);
/*    */   }
/*    */   
/*    */   public static uw a(int ☃) {
/* 26 */     if (☃ < 4)
/* 27 */       return a; 
/* 28 */     if (☃ > 4) {
/* 29 */       return b;
/*    */     }
/* 31 */     return c;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar\\uw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */