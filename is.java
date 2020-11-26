/*    */ public class is
/*    */   extends IllegalArgumentException
/*    */ {
/*    */   public is(ir ☃, String str) {
/*  5 */     super(String.format("Error parsing: %s: %s", new Object[] { ☃, str }));
/*    */   }
/*    */   
/*    */   public is(ir ☃, int i) {
/*  9 */     super(String.format("Invalid index %d requested for %s", new Object[] { Integer.valueOf(i), ☃ }));
/*    */   }
/*    */   
/*    */   public is(ir ☃, Throwable throwable) {
/* 13 */     super(String.format("Error while parsing: %s", new Object[] { ☃ }), throwable);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\is.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */