/*     */ import com.google.common.collect.ImmutableMap;
/*     */ import com.google.common.collect.Maps;
/*     */ import java.util.Map;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class biv
/*     */   extends bik
/*     */ {
/*  24 */   public static final bme a = bfi.D;
/*     */ 
/*     */   
/*  27 */   private static final Map<eq, cew> b = Maps.newEnumMap((Map)ImmutableMap.of(eq.c, 
/*  28 */         bcs.a(5.5D, 3.0D, 11.0D, 10.5D, 13.0D, 16.0D), eq.d, 
/*  29 */         bcs.a(5.5D, 3.0D, 0.0D, 10.5D, 13.0D, 5.0D), eq.e, 
/*  30 */         bcs.a(11.0D, 3.0D, 5.5D, 16.0D, 13.0D, 10.5D), eq.f, 
/*  31 */         bcs.a(0.0D, 3.0D, 5.5D, 5.0D, 13.0D, 10.5D)));
/*     */ 
/*     */   
/*     */   protected biv(bcs.c ☃) {
/*  35 */     super(☃);
/*  36 */     v(((blc)this.m.b()).a(a, eq.c));
/*     */   }
/*     */ 
/*     */   
/*     */   public String m() {
/*  41 */     return h().a();
/*     */   }
/*     */ 
/*     */   
/*     */   public cew a(blc ☃, axk axk1, el el1) {
/*  46 */     return b.get(☃.c(a));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃, ayc ayc1, el el1) {
/*  51 */     eq eq = (eq)☃.c(a);
/*  52 */     el el2 = el1.a(eq.d());
/*  53 */     blc blc1 = ayc1.a_(el2);
/*     */     
/*  55 */     return (blc1.c(ayc1, el2, eq) == blb.a && !b(blc1.c()));
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public blc a(ark ☃) {
/*  61 */     blc blc = p();
/*     */     
/*  63 */     ayc ayc = ☃.k();
/*  64 */     el el = ☃.a();
/*     */     
/*  66 */     eq[] arrayOfEq = ☃.e();
/*  67 */     for (eq eq : arrayOfEq) {
/*  68 */       if (eq.k().c()) {
/*     */ 
/*     */ 
/*     */         
/*  72 */         eq eq1 = eq.d();
/*     */         
/*  74 */         blc = blc.a(a, eq1);
/*  75 */         if (blc.a(ayc, el)) {
/*  76 */           return blc;
/*     */         }
/*     */       } 
/*     */     } 
/*  80 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public blc a(blc ☃, eq eq1, blc blc1, axz axz1, el el1, el el2) {
/*  85 */     if (eq1.d() == ☃.c(a) && !☃.a(axz1, el1)) {
/*  86 */       return bct.a.p();
/*     */     }
/*  88 */     return ☃;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public blc a(blc ☃, bhb bhb1) {
/* 107 */     return ☃.a(a, bhb1.a((eq)☃.c(a)));
/*     */   }
/*     */ 
/*     */   
/*     */   public blc a(blc ☃, bfz bfz1) {
/* 112 */     return ☃.a(bfz1.a((eq)☃.c(a)));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(ble.a<bcs, blc> ☃) {
/* 117 */     ☃.a((bmm<?>[])new bmm[] { a });
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\biv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */