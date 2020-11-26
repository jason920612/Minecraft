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
/*    */ public class bir
/*    */   extends bcb
/*    */ {
/* 20 */   public static final bme a = bfi.D;
/*    */   
/* 22 */   private static final Map<eq, cew> b = Maps.newEnumMap((Map)ImmutableMap.of(eq.c, 
/* 23 */         bcs.a(0.0D, 0.0D, 14.0D, 16.0D, 12.5D, 16.0D), eq.d, 
/* 24 */         bcs.a(0.0D, 0.0D, 0.0D, 16.0D, 12.5D, 2.0D), eq.e, 
/* 25 */         bcs.a(14.0D, 0.0D, 0.0D, 16.0D, 12.5D, 16.0D), eq.f, 
/* 26 */         bcs.a(0.0D, 0.0D, 0.0D, 2.0D, 12.5D, 16.0D)));
/*    */ 
/*    */   
/*    */   public bir(asc ☃, bcs.c c1) {
/* 30 */     super(☃, c1);
/* 31 */     v(((blc)this.m.b()).a(a, eq.c));
/*    */   }
/*    */ 
/*    */   
/*    */   public String m() {
/* 36 */     return h().a();
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean a(blc ☃, ayc ayc1, el el1) {
/* 42 */     return ayc1.a_(el1.a(((eq)☃.c(a)).d())).d().b();
/*    */   }
/*    */ 
/*    */   
/*    */   public blc a(blc ☃, eq eq1, blc blc1, axz axz1, el el1, el el2) {
/* 47 */     if (eq1 == ((eq)☃.c(a)).d() && !☃.a(axz1, el1)) {
/* 48 */       return bct.a.p();
/*    */     }
/*    */     
/* 51 */     return super.a(☃, eq1, blc1, axz1, el1, el2);
/*    */   }
/*    */ 
/*    */   
/*    */   public cew a(blc ☃, axk axk1, el el1) {
/* 56 */     return b.get(☃.c(a));
/*    */   }
/*    */ 
/*    */   
/*    */   public blc a(ark ☃) {
/* 61 */     blc blc = p();
/*    */     
/* 63 */     ayc ayc = ☃.k();
/* 64 */     el el = ☃.a();
/*    */     
/* 66 */     eq[] arrayOfEq = ☃.e();
/* 67 */     for (eq eq : arrayOfEq) {
/* 68 */       if (eq.k().c()) {
/*    */ 
/*    */ 
/*    */         
/* 72 */         eq eq1 = eq.d();
/*    */         
/* 74 */         blc = blc.a(a, eq1);
/* 75 */         if (blc.a(ayc, el)) {
/* 76 */           return blc;
/*    */         }
/*    */       } 
/*    */     } 
/* 80 */     return null;
/*    */   }
/*    */ 
/*    */   
/*    */   public blc a(blc ☃, bhb bhb1) {
/* 85 */     return ☃.a(a, bhb1.a((eq)☃.c(a)));
/*    */   }
/*    */ 
/*    */   
/*    */   public blc a(blc ☃, bfz bfz1) {
/* 90 */     return ☃.a(bfz1.a((eq)☃.c(a)));
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(ble.a<bcs, blc> ☃) {
/* 95 */     ☃.a((bmm<?>[])new bmm[] { a });
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bir.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */