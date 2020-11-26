/*     */ import com.google.common.collect.ImmutableMap;
/*     */ import com.google.common.collect.Sets;
/*     */ import java.util.Map;
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
/*     */ public class arg
/*     */   extends asa
/*     */ {
/*  21 */   private static final Set<bcs> e = Sets.newHashSet((Object[])new bcs[] { bct.n, bct.o, bct.p, bct.q, bct.r, bct.s, bct.cc, bct.V, bct.W, bct.X, bct.Y, bct.Z, bct.aa, bct.J, bct.K, bct.L, bct.M, bct.N, bct.O, bct.ck, bct.dd, bct.di, bct.dj, bct.dH, bct.cz, bct.eV, bct.eW, bct.eX, bct.eY, bct.fa, bct.eZ, bct.cG, bct.cH, bct.cI, bct.cJ, bct.cL, bct.cK });
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
/*  61 */   protected static final Map<bcs, bcs> a = (Map<bcs, bcs>)(new ImmutableMap.Builder())
/*  62 */     .put(bct.V, bct.ab)
/*  63 */     .put(bct.J, bct.P)
/*  64 */     .put(bct.aa, bct.ag)
/*  65 */     .put(bct.O, bct.U)
/*  66 */     .put(bct.Z, bct.af)
/*  67 */     .put(bct.N, bct.T)
/*  68 */     .put(bct.X, bct.ad)
/*  69 */     .put(bct.L, bct.R)
/*  70 */     .put(bct.Y, bct.ae)
/*  71 */     .put(bct.M, bct.S)
/*  72 */     .put(bct.W, bct.ac)
/*  73 */     .put(bct.K, bct.Q)
/*  74 */     .build();
/*     */   
/*     */   protected arg(aui ☃, float f1, float f2, ata.a a1) {
/*  77 */     super(f1, f2, ☃, e, a1);
/*     */   }
/*     */ 
/*     */   
/*     */   public float a(ate ☃, blc blc1) {
/*  82 */     bza bza = blc1.d();
/*  83 */     if (bza == bza.w || bza == bza.e || bza == bza.g) {
/*  84 */       return this.b;
/*     */     }
/*  86 */     return super.a(☃, blc1);
/*     */   }
/*     */ 
/*     */   
/*     */   public adm a(aup ☃) {
/*  91 */     axy axy = ☃.k();
/*  92 */     el el = ☃.a();
/*  93 */     blc blc = axy.a_(el);
/*  94 */     bcs bcs = a.get(blc.c());
/*     */     
/*  96 */     if (bcs != null) {
/*  97 */       aog aog = ☃.j();
/*  98 */       axy.a(aog, el, wj.E, wk.e, 1.0F, 1.0F);
/*     */       
/* 100 */       if (!axy.B) {
/* 101 */         axy.a(el, bcs.p().a(bha.a, blc.c(bha.a)), 11);
/*     */         
/* 103 */         if (aog != null) {
/* 104 */           ☃.i().a(1, aog);
/*     */         }
/*     */       } 
/* 107 */       return adm.a;
/*     */     } 
/*     */     
/* 110 */     return adm.b;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\arg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */