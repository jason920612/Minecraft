/*    */ import com.google.common.collect.ImmutableMap;
/*    */ import com.google.common.collect.Maps;
/*    */ import java.util.Map;
/*    */ import javax.annotation.Nullable;
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
/*    */ public class bcl
/*    */   extends bci
/*    */ {
/* 22 */   public static final bme a = bfi.D;
/*    */   
/* 24 */   private static final Map<eq, cew> c = Maps.newEnumMap((Map)ImmutableMap.of(eq.c, 
/* 25 */         bcs.a(0.0D, 4.0D, 5.0D, 16.0D, 12.0D, 16.0D), eq.d, 
/* 26 */         bcs.a(0.0D, 4.0D, 0.0D, 16.0D, 12.0D, 11.0D), eq.e, 
/* 27 */         bcs.a(5.0D, 4.0D, 0.0D, 16.0D, 12.0D, 16.0D), eq.f, 
/* 28 */         bcs.a(0.0D, 4.0D, 0.0D, 11.0D, 12.0D, 16.0D)));
/*    */ 
/*    */   
/*    */   protected bcl(bcs.c ☃) {
/* 32 */     super(☃);
/* 33 */     v(((blc)this.m.b()).a(a, eq.c).a(b, Boolean.valueOf(true)));
/*    */   }
/*    */ 
/*    */   
/*    */   public cew a(blc ☃, axk axk1, el el1) {
/* 38 */     return c.get(☃.c(a));
/*    */   }
/*    */ 
/*    */   
/*    */   public blc a(blc ☃, bhb bhb1) {
/* 43 */     return ☃.a(a, bhb1.a((eq)☃.c(a)));
/*    */   }
/*    */ 
/*    */   
/*    */   public blc a(blc ☃, bfz bfz1) {
/* 48 */     return ☃.a(bfz1.a((eq)☃.c(a)));
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(ble.a<bcs, blc> ☃) {
/* 53 */     ☃.a((bmm<?>[])new bmm[] { a, b });
/*    */   }
/*    */ 
/*    */   
/*    */   public blc a(blc ☃, eq eq1, blc blc1, axz axz1, el el1, el el2) {
/* 58 */     if (((Boolean)☃.c(b)).booleanValue()) {
/* 59 */       axz1.I().a(el1, byy.c, byy.c.a(axz1));
/*    */     }
/*    */     
/* 62 */     if (eq1.d() == ☃.c(a) && !☃.a(axz1, el1)) {
/* 63 */       return bct.a.p();
/*    */     }
/*    */     
/* 66 */     return ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(blc ☃, ayc ayc1, el el1) {
/* 71 */     eq eq = (eq)☃.c(a);
/* 72 */     el el2 = el1.a(eq.d());
/* 73 */     blc blc1 = ayc1.a_(el2);
/*    */     
/* 75 */     return (blc1.c(ayc1, el2, eq) == blb.a && !b(blc1.c()));
/*    */   }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public blc a(ark ☃) {
/* 81 */     blc blc = super.a(☃);
/*    */     
/* 83 */     ayc ayc = ☃.k();
/* 84 */     el el = ☃.a();
/*    */     
/* 86 */     eq[] arrayOfEq = ☃.e();
/* 87 */     for (eq eq : arrayOfEq) {
/* 88 */       if (eq.k().c()) {
/*    */ 
/*    */ 
/*    */         
/* 92 */         blc = blc.a(a, eq.d());
/* 93 */         if (blc.a(ayc, el)) {
/* 94 */           return blc;
/*    */         }
/*    */       } 
/*    */     } 
/* 98 */     return null;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bcl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */