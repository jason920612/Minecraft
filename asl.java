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
/*     */ public class asl
/*     */   extends ata
/*     */ {
/*     */   public asl(ata.a ☃) {
/*  28 */     super(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public adm a(aup ☃) {
/*  33 */     axy axy = ☃.k();
/*  34 */     el el = ☃.a();
/*     */     
/*  36 */     blc blc1 = axy.a_(el);
/*     */     
/*  38 */     if (blc1.c() != bct.ef || ((Boolean)blc1.c(bek.b)).booleanValue()) {
/*  39 */       return adm.b;
/*     */     }
/*     */     
/*  42 */     if (axy.B) {
/*  43 */       return adm.a;
/*     */     }
/*     */     
/*  46 */     blc blc2 = blc1.a(bek.b, Boolean.valueOf(true));
/*  47 */     bcs.a(blc1, blc2, axy, el);
/*  48 */     axy.a(el, blc2, 2);
/*  49 */     axy.c(el, bct.ef);
/*  50 */     ☃.i().g(1);
/*     */     
/*  52 */     for (int i = 0; i < 16; i++) {
/*  53 */       double d1 = (el.o() + (5.0F + i.nextFloat() * 6.0F) / 16.0F);
/*  54 */       double d2 = (el.p() + 0.8125F);
/*  55 */       double d3 = (el.q() + (5.0F + i.nextFloat() * 6.0F) / 16.0F);
/*  56 */       double d4 = 0.0D;
/*  57 */       double d5 = 0.0D;
/*  58 */       double d6 = 0.0D;
/*     */       
/*  60 */       axy.a(fm.M, d1, d2, d3, 0.0D, 0.0D, 0.0D);
/*     */     } 
/*  62 */     axy.a((aog)null, el, wj.ck, wk.e, 1.0F, 1.0F);
/*     */ 
/*     */     
/*  65 */     bli.b b = bek.d().a(axy, el);
/*  66 */     if (b != null) {
/*  67 */       el el1 = b.a().a(-3, 0, -3);
/*  68 */       for (int j = 0; j < 3; j++) {
/*  69 */         for (int k = 0; k < 3; k++) {
/*  70 */           axy.a(el1.a(j, 0, k), bct.ee.p(), 2);
/*     */         }
/*     */       } 
/*  73 */       axy.a(1038, el1.a(1, 0, 1), 0);
/*     */     } 
/*     */     
/*  76 */     return adm.a;
/*     */   }
/*     */ 
/*     */   
/*     */   public adn<ate> a(axy ☃, aog aog1, adk adk1) {
/*  81 */     ate ate = aog1.b(adk1);
/*  82 */     ceb ceb = a(☃, aog1, false);
/*  83 */     if (ceb != null && ceb.a == ceb.a.b && 
/*  84 */       ☃.a_(ceb.a()).c() == bct.ef) {
/*  85 */       return new adn<>(adm.b, ate);
/*     */     }
/*     */ 
/*     */     
/*  89 */     aog1.c(adk1);
/*  90 */     if (!☃.B) {
/*  91 */       el el = ((td)☃).v().a(☃, "Stronghold", new el(aog1), 100, false);
/*  92 */       if (el != null) {
/*  93 */         aop aop = new aop(☃, aog1.q, aog1.r + (aog1.I / 2.0F), aog1.s);
/*  94 */         aop.a(el);
/*  95 */         ☃.a(aop);
/*     */         
/*  97 */         if (aog1 instanceof tf) {
/*  98 */           p.m.a((tf)aog1, el);
/*     */         }
/*     */         
/* 101 */         ☃.a((aog)null, aog1.q, aog1.r, aog1.s, wj.bX, wk.g, 0.5F, 0.4F / (i.nextFloat() * 0.4F + 0.8F));
/* 102 */         ☃.a((aog)null, 1003, new el(aog1), 0);
/* 103 */         if (!aog1.bV.d) {
/* 104 */           ate.g(1);
/*     */         }
/* 106 */         aog1.b(ws.c.b(this));
/* 107 */         return new adn<>(adm.a, ate);
/*     */       } 
/*     */     } 
/* 110 */     return new adn<>(adm.a, ate);
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\asl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */