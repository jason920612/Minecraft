/*     */ import com.google.common.collect.ImmutableSet;
/*     */ import java.util.BitSet;
/*     */ import java.util.Set;
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
/*     */ public abstract class bwe<C extends bqp>
/*     */   implements bxj<C>
/*     */ {
/*  21 */   protected static final blc a = bct.a.p();
/*  22 */   protected static final blc b = bct.jI.p();
/*  23 */   protected static final byw c = byy.c.i();
/*  24 */   protected static final byw d = byy.e.i();
/*     */   
/*  26 */   protected Set<bcs> e = (Set<bcs>)ImmutableSet.of(bct.b, bct.c, bct.e, bct.g, bct.j, bct.k, (Object[])new bcs[] { bct.l, bct.i, bct.gn, bct.fE, bct.fF, bct.fG, bct.fH, bct.fI, bct.fJ, bct.fK, bct.fL, bct.fM, bct.fN, bct.fO, bct.fP, bct.fQ, bct.fR, bct.fS, bct.fT, bct.at, bct.hT, bct.dV, bct.cQ, bct.gp });
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  58 */   protected Set<byv> f = (Set<byv>)ImmutableSet.of(byy.c);
/*     */ 
/*     */ 
/*     */   
/*     */   public int a() {
/*  63 */     return 4;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected abstract boolean a(axz paramaxz, long paramLong, int paramInt1, int paramInt2, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, BitSet paramBitSet);
/*     */ 
/*     */   
/*     */   protected boolean a(blc ☃) {
/*  72 */     return this.e.contains(☃.c());
/*     */   }
/*     */   
/*     */   protected boolean a(blc ☃, blc blc1) {
/*  76 */     bcs bcs = ☃.c();
/*  77 */     return (a(☃) || ((bcs == bct.D || bcs == bct.F) && !blc1.s().a(ww.a)));
/*     */   }
/*     */   
/*     */   protected boolean a(ayc ☃, int i, int j, int k, int m, int n, int i1, int i2, int i3) {
/*  81 */     el.a a = new el.a();
/*     */     
/*  83 */     for (int i4 = k; i4 < m; i4++) {
/*  84 */       for (int i5 = i2; i5 < i3; i5++) {
/*  85 */         for (int i6 = n - 1; i6 <= i1 + 1; i6++) {
/*  86 */           if (this.f.contains(☃.b(a.c(i4 + i * 16, i6, i5 + j * 16)).c())) {
/*  87 */             return true;
/*     */           }
/*     */ 
/*     */           
/*  91 */           if (i6 != i1 + 1 && !a(k, m, i2, i3, i4, i5)) {
/*  92 */             i6 = i1;
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*  97 */     return false;
/*     */   }
/*     */   
/*     */   private boolean a(int ☃, int i, int j, int k, int m, int n) {
/* 101 */     return (m == ☃ || m == i - 1 || n == j || n == k - 1);
/*     */   }
/*     */   
/*     */   protected boolean a(int ☃, int i, double d1, double d2, int j, int k, float f) {
/* 105 */     double d3 = (☃ * 16 + 8);
/* 106 */     double d4 = (i * 16 + 8);
/*     */     
/* 108 */     double d5 = d1 - d3;
/* 109 */     double d6 = d2 - d4;
/* 110 */     double d7 = (k - j);
/* 111 */     double d8 = (f + 2.0F + 16.0F);
/*     */     
/* 113 */     return (d5 * d5 + d6 * d6 - d7 * d7 <= d8 * d8);
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bwe.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */