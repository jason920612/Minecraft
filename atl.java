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
/*     */ public class atl
/*     */   extends ata
/*     */ {
/*  19 */   private static final es a = new eo() {
/*  20 */       private final eo a = new eo();
/*     */       
/*     */       public ate a(em ☃, ate ate1) {
/*     */         double d4;
/*  24 */         eq eq = (eq)☃.e().c(bec.a);
/*  25 */         axy axy = ☃.h();
/*     */ 
/*     */ 
/*     */         
/*  29 */         double d1 = ☃.a() + eq.g() * 1.125D;
/*  30 */         double d2 = Math.floor(☃.b()) + eq.h();
/*  31 */         double d3 = ☃.c() + eq.i() * 1.125D;
/*     */         
/*  33 */         el el = ☃.d().a(eq);
/*  34 */         blc blc = axy.a_(el);
/*  35 */         bmn bmn = (blc.c() instanceof bco) ? (bmn)blc.c(((bco)blc.c()).e()) : bmn.a;
/*     */ 
/*     */         
/*  38 */         if (blc.a(wv.z)) {
/*  39 */           if (bmn.c()) {
/*  40 */             d4 = 0.6D;
/*     */           } else {
/*  42 */             d4 = 0.1D;
/*     */           } 
/*  44 */         } else if (blc.f() && axy.a_(el.b()).a(wv.z)) {
/*  45 */           blc blc1 = axy.a_(el.b());
/*  46 */           bmn bmn1 = (blc1.c() instanceof bco) ? (bmn)blc1.c(((bco)blc1.c()).e()) : bmn.a;
/*  47 */           if (eq == eq.a || !bmn1.c()) {
/*  48 */             d4 = -0.9D;
/*     */           } else {
/*  50 */             d4 = -0.4D;
/*     */           } 
/*     */         } else {
/*  53 */           return this.a.dispense(☃, ate1);
/*     */         } 
/*     */         
/*  56 */         aph aph = aph.a(axy, d1, d2 + d4, d3, atl.a((atl)ate1.b()));
/*  57 */         if (ate1.s()) {
/*  58 */           aph.b(ate1.q());
/*     */         }
/*  60 */         axy.a(aph);
/*     */         
/*  62 */         ate1.g(1);
/*  63 */         return ate1;
/*     */       }
/*     */ 
/*     */       
/*     */       protected void a(em ☃) {
/*  68 */         ☃.h().b(1000, ☃.d(), 0);
/*     */       }
/*     */     };
/*     */   
/*     */   private final aph.a b;
/*     */   
/*     */   public atl(aph.a ☃, ata.a a1) {
/*  75 */     super(a1);
/*  76 */     this.b = ☃;
/*  77 */     bec.a(this, a);
/*     */   }
/*     */ 
/*     */   
/*     */   public adm a(aup ☃) {
/*  82 */     axy axy = ☃.k();
/*  83 */     el el = ☃.a();
/*     */     
/*  85 */     blc blc = axy.a_(el);
/*  86 */     if (!blc.a(wv.z)) {
/*  87 */       return adm.c;
/*     */     }
/*     */     
/*  90 */     ate ate = ☃.i();
/*  91 */     if (!axy.B) {
/*  92 */       bmn bmn = (blc.c() instanceof bco) ? (bmn)blc.c(((bco)blc.c()).e()) : bmn.a;
/*  93 */       double d = 0.0D;
/*  94 */       if (bmn.c()) {
/*  95 */         d = 0.5D;
/*     */       }
/*  97 */       aph aph = aph.a(axy, el.o() + 0.5D, el.p() + 0.0625D + d, el.q() + 0.5D, this.b);
/*  98 */       if (ate.s()) {
/*  99 */         aph.b(ate.q());
/*     */       }
/* 101 */       axy.a(aph);
/*     */     } 
/* 103 */     ate.g(1);
/* 104 */     return adm.a;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\atl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */