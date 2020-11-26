/*    */ 
/*    */ public class hh
/*    */ {
/*  4 */   public static final hh a = new hh(0L)
/*    */     {
/*    */       public void a(long ☃) {}
/*    */     };
/*    */ 
/*    */   
/*    */   private final long b;
/*    */   
/*    */   private long c;
/*    */   
/*    */   public hh(long ☃) {
/* 15 */     this.b = ☃;
/*    */   }
/*    */   
/*    */   public void a(long ☃) {
/* 19 */     this.c += ☃ / 8L;
/* 20 */     if (this.c > this.b)
/* 21 */       throw new RuntimeException("Tried to read NBT tag that was too big; tried to allocate: " + this.c + "bytes where max allowed: " + this.b); 
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\hh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */