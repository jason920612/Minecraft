/*     */ import com.google.common.collect.Maps;
/*     */ import java.util.Map;
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
/*     */ public class bev
/*     */   extends bcs
/*     */ {
/*  24 */   private static final Map<bcs, bcs> b = Maps.newHashMap();
/*     */ 
/*     */   
/*  27 */   protected static final cew a = bcs.a(5.0D, 0.0D, 5.0D, 11.0D, 6.0D, 11.0D);
/*     */   
/*     */   private final bcs c;
/*     */   
/*     */   public bev(bcs ☃, bcs.c c1) {
/*  32 */     super(c1);
/*  33 */     this.c = ☃;
/*     */     
/*  35 */     b.put(☃, this);
/*     */   }
/*     */ 
/*     */   
/*     */   public cew a(blc ☃, axk axk1, el el1) {
/*  40 */     return a;
/*     */   }
/*     */ 
/*     */   
/*     */   public bgy c(blc ☃) {
/*  45 */     return bgy.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃) {
/*  50 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃, axy axy1, el el1, aog aog1, adk adk1, eq eq1, float f1, float f2, float f3) {
/*  55 */     ate ate = aog1.b(adk1);
/*     */     
/*  57 */     ata ata = ate.b();
/*  58 */     bcs bcs1 = (ata instanceof arj) ? b.getOrDefault(((arj)ata).d(), bct.a) : bct.a;
/*  59 */     boolean bool1 = (bcs1 == bct.a);
/*  60 */     boolean bool2 = (this.c == bct.a);
/*     */     
/*  62 */     if (bool1 != bool2) {
/*  63 */       if (bool2) {
/*  64 */         axy1.a(el1, bcs1.p(), 3);
/*  65 */         aog1.a(ws.af);
/*     */         
/*  67 */         if (!aog1.bV.d) {
/*  68 */           ate.g(1);
/*     */         }
/*     */       } else {
/*  71 */         ate ate1 = new ate(this.c);
/*  72 */         if (ate.a()) {
/*  73 */           aog1.a(adk1, ate1);
/*  74 */         } else if (!aog1.d(ate1)) {
/*  75 */           aog1.a(ate1, false);
/*     */         } 
/*  77 */         axy1.a(el1, bct.ex.p(), 3);
/*     */       } 
/*     */     }
/*     */     
/*  81 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public ate a(axk ☃, el el1, blc blc1) {
/*  86 */     if (this.c == bct.a) {
/*  87 */       return super.a(☃, el1, blc1);
/*     */     }
/*  89 */     return new ate(this.c);
/*     */   }
/*     */ 
/*     */   
/*     */   public axx a(blc ☃, axy axy1, el el1, int i) {
/*  94 */     return bct.ex;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(blc ☃, axy axy1, el el1, float f, int i) {
/*  99 */     super.a(☃, axy1, el1, f, i);
/*     */     
/* 101 */     if (this.c != bct.a) {
/* 102 */       a(axy1, el1, new ate(this.c));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public blc a(blc ☃, eq eq1, blc blc1, axz axz1, el el1, el el2) {
/* 108 */     if (eq1 == eq.a && !☃.a(axz1, el1)) {
/* 109 */       return bct.a.p();
/*     */     }
/*     */     
/* 112 */     return super.a(☃, eq1, blc1, axz1, el1, el2);
/*     */   }
/*     */ 
/*     */   
/*     */   public axl c() {
/* 117 */     return axl.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public blb a(axk ☃, blc blc1, el el1, eq eq1) {
/* 122 */     return blb.i;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bev.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */