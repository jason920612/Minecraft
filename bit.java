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
/*     */ public class bit
/*     */   extends bhj
/*     */ {
/*  22 */   public static final bme c = bfi.D;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  28 */   private static final Map<eq, cew> o = Maps.newEnumMap((Map)ImmutableMap.of(eq.c, 
/*  29 */         bcs.a(0.0D, 4.5D, 14.0D, 16.0D, 12.5D, 16.0D), eq.d, 
/*  30 */         bcs.a(0.0D, 4.5D, 0.0D, 16.0D, 12.5D, 2.0D), eq.f, 
/*  31 */         bcs.a(0.0D, 4.5D, 0.0D, 2.0D, 12.5D, 16.0D), eq.e, 
/*  32 */         bcs.a(14.0D, 4.5D, 0.0D, 16.0D, 12.5D, 16.0D)));
/*     */ 
/*     */   
/*     */   public bit(bcs.c ☃) {
/*  36 */     super(☃);
/*  37 */     v(((blc)this.m.b()).a(c, eq.c).a(a, Boolean.valueOf(false)));
/*     */   }
/*     */ 
/*     */   
/*     */   public String m() {
/*  42 */     return h().a();
/*     */   }
/*     */ 
/*     */   
/*     */   public cew a(blc ☃, axk axk1, el el1) {
/*  47 */     return o.get(☃.c(c));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃, ayc ayc1, el el1) {
/*  52 */     return ayc1.a_(el1.a(((eq)☃.c(c)).d())).d().b();
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public blc a(ark ☃) {
/*  58 */     blc blc = p();
/*  59 */     byw byw = ☃.k().b(☃.a());
/*     */     
/*  61 */     ayc ayc = ☃.k();
/*  62 */     el el = ☃.a();
/*     */     
/*  64 */     eq[] arrayOfEq = ☃.e();
/*  65 */     for (eq eq : arrayOfEq) {
/*  66 */       if (eq.k().c()) {
/*     */ 
/*     */ 
/*     */         
/*  70 */         eq eq1 = eq.d();
/*     */         
/*  72 */         blc = blc.a(c, eq1);
/*  73 */         if (blc.a(ayc, el)) {
/*  74 */           return blc.a(a, Boolean.valueOf((byw.c() == byy.c)));
/*     */         }
/*     */       } 
/*     */     } 
/*  78 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public blc a(blc ☃, eq eq1, blc blc1, axz axz1, el el1, el el2) {
/*  83 */     if (eq1.d() == ☃.c(c) && !☃.a(axz1, el1)) {
/*  84 */       return bct.a.p();
/*     */     }
/*  86 */     return super.a(☃, eq1, blc1, axz1, el1, el2);
/*     */   }
/*     */ 
/*     */   
/*     */   public blc a(blc ☃, bhb bhb1) {
/*  91 */     return ☃.a(c, bhb1.a((eq)☃.c(c)));
/*     */   }
/*     */ 
/*     */   
/*     */   public blc a(blc ☃, bfz bfz1) {
/*  96 */     return ☃.a(bfz1.a((eq)☃.c(c)));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(ble.a<bcs, blc> ☃) {
/* 101 */     ☃.a((bmm<?>[])new bmm[] { c, a });
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bit.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */