/*    */ import it.unimi.dsi.fastutil.longs.Long2IntLinkedOpenHashMap;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bzn
/*    */   extends bzm<bzi>
/*    */ {
/*    */   private final Long2IntLinkedOpenHashMap c;
/*    */   private final int d;
/*    */   private final int e;
/*    */   
/*    */   public bzn(int ☃, int i, long l1, long l2) {
/* 18 */     super(l2);
/* 19 */     this.c = new Long2IntLinkedOpenHashMap(16, 0.25F);
/* 20 */     this.c.defaultReturnValue(-2147483648);
/* 21 */     this.d = ☃;
/* 22 */     this.e = i;
/* 23 */     a(l1);
/*    */   }
/*    */ 
/*    */   
/*    */   public bzi b(bzg ☃, caw caw1) {
/* 28 */     return new bzi(this.c, this.d, ☃, caw1);
/*    */   }
/*    */ 
/*    */   
/*    */   public bzi a(bzg ☃, caw caw1, bzi bzi1) {
/* 33 */     return new bzi(this.c, Math.min(256, bzi1.a() * 4), ☃, caw1);
/*    */   }
/*    */ 
/*    */   
/*    */   public bzi a(bzg ☃, caw caw1, bzi bzi1, bzi bzi2) {
/* 38 */     return new bzi(this.c, Math.min(256, Math.max(bzi1.a(), bzi2.a()) * 4), ☃, caw1);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bzn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */