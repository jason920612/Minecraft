/*    */ import com.google.common.collect.Maps;
/*    */ import java.util.Map;
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
/*    */ public class bcg
/*    */   extends bcb
/*    */ {
/* 21 */   public static final bmj a = bma.an;
/*    */   
/* 23 */   private static final Map<asc, bcs> b = Maps.newHashMap();
/* 24 */   private static final cew c = bcs.a(4.0D, 0.0D, 4.0D, 12.0D, 16.0D, 12.0D);
/*    */   
/*    */   public bcg(asc ☃, bcs.c c1) {
/* 27 */     super(☃, c1);
/* 28 */     v(((blc)this.m.b()).a(a, Integer.valueOf(0)));
/*    */     
/* 30 */     b.put(☃, this);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(blc ☃, ayc ayc1, el el1) {
/* 35 */     return ayc1.a_(el1.b()).d().b();
/*    */   }
/*    */ 
/*    */   
/*    */   public cew a(blc ☃, axk axk1, el el1) {
/* 40 */     return c;
/*    */   }
/*    */ 
/*    */   
/*    */   public blc a(ark ☃) {
/* 45 */     return p().a(a, Integer.valueOf(xq.c(((180.0F + ☃.h()) * 16.0F / 360.0F) + 0.5D) & 0xF));
/*    */   }
/*    */ 
/*    */   
/*    */   public blc a(blc ☃, eq eq1, blc blc1, axz axz1, el el1, el el2) {
/* 50 */     if (eq1 == eq.a && !☃.a(axz1, el1)) {
/* 51 */       return bct.a.p();
/*    */     }
/*    */     
/* 54 */     return super.a(☃, eq1, blc1, axz1, el1, el2);
/*    */   }
/*    */ 
/*    */   
/*    */   public blc a(blc ☃, bhb bhb1) {
/* 59 */     return ☃.a(a, Integer.valueOf(bhb1.a(((Integer)☃.c(a)).intValue(), 16)));
/*    */   }
/*    */ 
/*    */   
/*    */   public blc a(blc ☃, bfz bfz1) {
/* 64 */     return ☃.a(a, Integer.valueOf(bfz1.a(((Integer)☃.c(a)).intValue(), 16)));
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(ble.a<bcs, blc> ☃) {
/* 69 */     ☃.a((bmm<?>[])new bmm[] { a });
/*    */   }
/*    */   
/*    */   public static bcs a(asc ☃) {
/* 73 */     return b.getOrDefault(☃, bct.hn);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bcg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */