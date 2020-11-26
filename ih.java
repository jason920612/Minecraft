/*    */ 
/*    */ public enum ih
/*    */ {
/*  4 */   a((byte)0),
/*  5 */   b((byte)1),
/*  6 */   c((byte)2);
/*    */   
/*    */   private final byte d;
/*    */ 
/*    */   
/*    */   ih(byte ☃) {
/* 12 */     this.d = ☃;
/*    */   }
/*    */   
/*    */   public byte a() {
/* 16 */     return this.d;
/*    */   }
/*    */   
/*    */   public static ih a(byte ☃) {
/* 20 */     for (ih ih1 : values()) {
/* 21 */       if (☃ == ih1.d) {
/* 22 */         return ih1;
/*    */       }
/*    */     } 
/* 25 */     return a;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\ih.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */