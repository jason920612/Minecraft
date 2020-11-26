/*     */ import com.google.common.collect.ImmutableSet;
/*     */ import java.util.List;
/*     */ import java.util.Set;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class aou
/*     */ {
/*     */   public static ceb a(aer ☃, boolean bool1, boolean bool2, @Nullable aer aer1) {
/*  30 */     double d1 = ☃.q;
/*  31 */     double d2 = ☃.r;
/*  32 */     double d3 = ☃.s;
/*  33 */     double d4 = ☃.t;
/*  34 */     double d5 = ☃.u;
/*  35 */     double d6 = ☃.v;
/*  36 */     axy axy = ☃.m;
/*     */     
/*  38 */     cee cee1 = new cee(d1, d2, d3);
/*  39 */     if (!axy.a(☃, ☃.bD(), (bool2 || aer1 == null) ? (Set<aer>)ImmutableSet.of() : a(aer1))) {
/*  40 */       return new ceb(ceb.a.b, cee1, eq.a(d4, d5, d6), new el(☃));
/*     */     }
/*     */     
/*  43 */     cee cee2 = new cee(d1 + d4, d2 + d5, d3 + d6);
/*  44 */     ceb ceb = axy.a(cee1, cee2, cec.a, true, false);
/*     */     
/*  46 */     if (bool1) {
/*  47 */       if (ceb != null) {
/*  48 */         cee2 = new cee(ceb.c.b, ceb.c.c, ceb.c.d);
/*     */       }
/*     */       
/*  51 */       aer aer2 = null;
/*  52 */       List<aer> list = axy.a(☃, ☃.bD().b(d4, d5, d6).g(1.0D));
/*  53 */       double d = 0.0D;
/*  54 */       for (int i = 0; i < list.size(); i++) {
/*  55 */         aer aer3 = list.get(i);
/*  56 */         if (aer3.aB() && (bool2 || !aer3.s(aer1)) && !aer3.R) {
/*     */ 
/*     */ 
/*     */           
/*  60 */           cea cea = aer3.bD().g(0.30000001192092896D);
/*  61 */           ceb ceb1 = cea.b(cee1, cee2);
/*  62 */           if (ceb1 != null) {
/*  63 */             double d7 = cee1.g(ceb1.c);
/*  64 */             if (d7 < d || d == 0.0D) {
/*  65 */               aer2 = aer3;
/*  66 */               d = d7;
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*  71 */       if (aer2 != null) {
/*  72 */         ceb = new ceb(aer2);
/*     */       }
/*     */     } 
/*     */     
/*  76 */     return ceb;
/*     */   }
/*     */   
/*     */   private static Set<aer> a(aer ☃) {
/*  80 */     aer aer1 = ☃.bU();
/*  81 */     return (aer1 != null) ? (Set<aer>)ImmutableSet.of(☃, aer1) : (Set<aer>)ImmutableSet.of(☃);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final void a(aer ☃, float f) {
/*  91 */     double d1 = ☃.t;
/*  92 */     double d2 = ☃.u;
/*  93 */     double d3 = ☃.v;
/*     */     
/*  95 */     float f1 = xq.a(d1 * d1 + d3 * d3);
/*  96 */     ☃.w = (float)(xq.c(d3, d1) * 57.2957763671875D) + 90.0F;
/*  97 */     ☃.x = (float)(xq.c(f1, d2) * 57.2957763671875D) - 90.0F;
/*     */     
/*  99 */     while (☃.x - ☃.z < -180.0F) {
/* 100 */       ☃.z -= 360.0F;
/*     */     }
/* 102 */     while (☃.x - ☃.z >= 180.0F) {
/* 103 */       ☃.z += 360.0F;
/*     */     }
/*     */     
/* 106 */     while (☃.w - ☃.y < -180.0F) {
/* 107 */       ☃.y -= 360.0F;
/*     */     }
/* 109 */     while (☃.w - ☃.y >= 180.0F) {
/* 110 */       ☃.y += 360.0F;
/*     */     }
/*     */     
/* 113 */     ☃.x = ☃.z + (☃.x - ☃.z) * f;
/* 114 */     ☃.w = ☃.y + (☃.w - ☃.y) * f;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\aou.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */