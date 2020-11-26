/*    */ import com.google.common.collect.ImmutableMap;
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
/*    */ public class bcf
/*    */   extends bda
/*    */ {
/* 22 */   public static final bme a = bfi.D;
/*    */ 
/*    */   
/*    */   private final bia b;
/*    */   
/* 27 */   private static final Map<eq, cew> c = Maps.newEnumMap((Map)ImmutableMap.of(eq.d, 
/* 28 */         bcs.a(6.0D, 0.0D, 6.0D, 10.0D, 10.0D, 16.0D), eq.e, 
/* 29 */         bcs.a(0.0D, 0.0D, 6.0D, 10.0D, 10.0D, 10.0D), eq.c, 
/* 30 */         bcs.a(6.0D, 0.0D, 0.0D, 10.0D, 10.0D, 10.0D), eq.f, 
/* 31 */         bcs.a(6.0D, 0.0D, 6.0D, 16.0D, 10.0D, 10.0D)));
/*    */ 
/*    */   
/*    */   protected bcf(bia ☃, bcs.c c1) {
/* 35 */     super(c1);
/* 36 */     v(((blc)this.m.b()).a(a, eq.c));
/* 37 */     this.b = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public cew a(blc ☃, axk axk1, el el1) {
/* 42 */     return c.get(☃.c(a));
/*    */   }
/*    */ 
/*    */   
/*    */   public blc a(blc ☃, eq eq1, blc blc1, axz axz1, el el1, el el2) {
/* 47 */     if (blc1.c() != this.b && eq1 == ☃.c(a)) {
/* 48 */       return this.b.d().p().a(bhz.a, Integer.valueOf(7));
/*    */     }
/* 50 */     return super.a(☃, eq1, blc1, axz1, el1, el2);
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean b(blc ☃, axk axk1, el el1) {
/* 55 */     return (☃.c() == bct.cq);
/*    */   }
/*    */   
/*    */   protected ata b() {
/* 59 */     if (this.b == bct.dd) {
/* 60 */       return atf.bU;
/*    */     }
/*    */     
/* 63 */     if (this.b == bct.dH) {
/* 64 */       return atf.bV;
/*    */     }
/*    */     
/* 67 */     return atf.a;
/*    */   }
/*    */ 
/*    */   
/*    */   public axx a(blc ☃, axy axy1, el el1, int i) {
/* 72 */     return atf.a;
/*    */   }
/*    */ 
/*    */   
/*    */   public ate a(axk ☃, el el1, blc blc1) {
/* 77 */     return new ate(b());
/*    */   }
/*    */ 
/*    */   
/*    */   public blc a(blc ☃, bhb bhb1) {
/* 82 */     return ☃.a(a, bhb1.a((eq)☃.c(a)));
/*    */   }
/*    */ 
/*    */   
/*    */   public blc a(blc ☃, bfz bfz1) {
/* 87 */     return ☃.a(bfz1.a((eq)☃.c(a)));
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(ble.a<bcs, blc> ☃) {
/* 92 */     ☃.a((bmm<?>[])new bmm[] { a });
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bcf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */