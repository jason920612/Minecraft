/*     */ import com.google.common.collect.Sets;
/*     */ import java.util.Set;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class atn
/*     */   extends asa
/*     */ {
/*  12 */   private static final Set<bcs> a = Sets.newHashSet((Object[])new bcs[] { bct.fC, bct.I, bct.m, bct.aO, bct.cn, bct.cm, bct.aN, bct.bB, bct.G, bct.cR, bct.bC, bct.H, bct.ar, bct.aq, bct.cd, bct.de, bct.gp, bct.gq, bct.cA, bct.cM, bct.at, bct.au, bct.av, bct.hU, bct.hV, bct.hT, bct.b, bct.c, bct.d, bct.e, bct.f, bct.g, bct.h, bct.bJ, bct.bK, bct.bL, bct.bM, bct.bN, bct.bO, bct.bP, bct.bQ, bct.bR, bct.bS, bct.bY, bct.bZ, bct.bX, bct.bW, bct.cP, bct.cE });
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
/*     */   protected atn(aui ☃, int i, float f, ata.a a1) {
/*  65 */     super(i, f, ☃, a, a1);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃) {
/*  70 */     bcs bcs = ☃.c();
/*  71 */     int i = e().d();
/*  72 */     if (bcs == bct.ce) {
/*  73 */       return (i == 3);
/*     */     }
/*  75 */     if (bcs == bct.cn || bcs == bct.cm || bcs == bct.el || bcs == bct.ep || bcs == bct.bB || bcs == bct.G || bcs == bct.cM)
/*     */     {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  83 */       return (i >= 2);
/*     */     }
/*  85 */     if (bcs == bct.bC || bcs == bct.H || bcs == bct.ar || bcs == bct.aq)
/*     */     {
/*     */ 
/*     */ 
/*     */       
/*  90 */       return (i >= 1);
/*     */     }
/*     */     
/*  93 */     bza bza = ☃.d();
/*  94 */     return (bza == bza.D || bza == bza.E || bza == bza.G);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float a(ate ☃, blc blc1) {
/* 101 */     bza bza = blc1.d();
/* 102 */     if (bza == bza.E || bza == bza.G || bza == bza.D) {
/* 103 */       return this.b;
/*     */     }
/* 105 */     return super.a(☃, blc1);
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\atn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */