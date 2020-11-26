/*    */ import com.google.common.collect.Lists;
/*    */ import java.util.List;
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
/*    */ public class btp
/*    */   extends bso<bto>
/*    */ {
/* 18 */   private static final List<ayu.e> b = Lists.newArrayList((Object[])new ayu.e[] { new ayu.e((aev)aev.aE, 1, 1, 1) });
/*    */ 
/*    */   
/*    */   protected String a() {
/* 22 */     return "Swamp_Hut";
/*    */   }
/*    */ 
/*    */   
/*    */   public int b() {
/* 27 */     return 3;
/*    */   }
/*    */ 
/*    */   
/*    */   protected bxc a(axz ☃, bmy<?> bmy1, boz boz1, int i, int j) {
/* 32 */     ayu ayu = bmy1.b().a(new el((i << 4) + 9, 0, (j << 4) + 9), ayz.c);
/* 33 */     return new a(☃, boz1, i, j, ayu);
/*    */   }
/*    */ 
/*    */   
/*    */   protected int c() {
/* 38 */     return 14357620;
/*    */   }
/*    */   
/*    */   public static class a
/*    */     extends bxc
/*    */   {
/*    */     public a() {}
/*    */     
/*    */     public a(axz ☃, boz boz1, int i, int j, ayu ayu1) {
/* 47 */       super(i, j, ayu1, boz1, ☃.r_());
/* 48 */       bxd bxd = new bxd(boz1, i * 16, j * 16);
/* 49 */       this.a.add(bxd);
/* 50 */       a(☃);
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public List<ayu.e> d() {
/* 56 */     return b;
/*    */   }
/*    */   
/*    */   public boolean d(axz ☃, el el1) {
/* 60 */     bxc bxc = a(☃, el1);
/* 61 */     if (bxc == a || !(bxc instanceof a) || bxc.d().isEmpty()) {
/* 62 */       return false;
/*    */     }
/* 64 */     bxb bxb = bxc.d().get(0);
/* 65 */     return bxb instanceof bxd;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\btp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */