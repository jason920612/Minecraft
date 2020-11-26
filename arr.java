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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class arr
/*     */   extends ata
/*     */ {
/*     */   private final byv a;
/*     */   
/*     */   public arr(byv ☃, ata.a a1) {
/*  34 */     super(a1);
/*  35 */     this.a = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public adn<ate> a(axy ☃, aog aog1, adk adk1) {
/*  40 */     ate ate = aog1.b(adk1);
/*  41 */     ceb ceb = a(☃, aog1, (this.a == byy.a));
/*  42 */     if (ceb == null) {
/*  43 */       return new adn<>(adm.b, ate);
/*     */     }
/*     */     
/*  46 */     if (ceb.a == ceb.a.b) {
/*  47 */       el el1 = ceb.a();
/*     */       
/*  49 */       if (!☃.a(aog1, el1) || !aog1.a(el1, ceb.b, ate)) {
/*  50 */         return new adn<>(adm.c, ate);
/*     */       }
/*     */       
/*  53 */       if (this.a == byy.a) {
/*  54 */         blc blc1 = ☃.a_(el1);
/*     */         
/*  56 */         if (blc1.c() instanceof bcz) {
/*  57 */           byv byv1 = ((bcz)blc1.c()).a(☃, el1, blc1);
/*  58 */           if (byv1 != byy.a) {
/*  59 */             aog1.b(ws.c.b(this));
/*  60 */             aog1.a(byv1.a(ww.b) ? wj.am : wj.ak, 1.0F, 1.0F);
/*  61 */             ate ate1 = a(ate, aog1, byv1.b());
/*  62 */             if (!☃.B) {
/*  63 */               p.j.a((tf)aog1, new ate(byv1.b()));
/*     */             }
/*  65 */             return new adn<>(adm.a, ate1);
/*     */           } 
/*     */         } 
/*     */         
/*  69 */         return new adn<>(adm.c, ate);
/*     */       } 
/*  71 */       blc blc = ☃.a_(el1);
/*  72 */       el el2 = a(blc, el1, ceb);
/*     */       
/*  74 */       if (a(aog1, ☃, el2, ceb)) {
/*  75 */         a(☃, ate, el2);
/*  76 */         if (aog1 instanceof tf) {
/*  77 */           p.y.a((tf)aog1, el2, ate);
/*     */         }
/*  79 */         aog1.b(ws.c.b(this));
/*  80 */         return new adn<>(adm.a, a(ate, aog1));
/*     */       } 
/*  82 */       return new adn<>(adm.c, ate);
/*     */     } 
/*     */ 
/*     */     
/*  86 */     return new adn<>(adm.b, ate);
/*     */   }
/*     */   
/*     */   private el a(blc ☃, el el1, ceb ceb1) {
/*  90 */     return (☃.c() instanceof bfv) ? el1 : ceb1.a().a(ceb1.b);
/*     */   }
/*     */   
/*     */   protected ate a(ate ☃, aog aog1) {
/*  94 */     if (!aog1.bV.d) {
/*  95 */       return new ate(atf.aw);
/*     */     }
/*  97 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(axy ☃, ate ate1, el el1) {}
/*     */   
/*     */   private ate a(ate ☃, aog aog1, ata ata1) {
/* 104 */     if (aog1.bV.d) {
/* 105 */       return ☃;
/*     */     }
/*     */     
/* 108 */     ☃.g(1);
/* 109 */     if (☃.a()) {
/* 110 */       return new ate(ata1);
/*     */     }
/* 112 */     if (!aog1.bB.e(new ate(ata1))) {
/* 113 */       aog1.a(new ate(ata1), false);
/*     */     }
/* 115 */     return ☃;
/*     */   }
/*     */   
/*     */   public boolean a(@Nullable aog ☃, axy axy1, el el1, @Nullable ceb ceb1) {
/* 119 */     if (!(this.a instanceof byu)) {
/* 120 */       return false;
/*     */     }
/*     */     
/* 123 */     blc blc = axy1.a_(el1);
/* 124 */     bza bza = blc.d();
/* 125 */     boolean bool1 = !bza.b();
/* 126 */     boolean bool2 = bza.e();
/* 127 */     if (axy1.c(el1) || bool1 || bool2 || (blc.c() instanceof bfv && ((bfv)blc.c()).a(axy1, el1, blc, this.a))) {
/* 128 */       if (axy1.t.f() && this.a.a(ww.a)) {
/* 129 */         int i = el1.o();
/* 130 */         int j = el1.p();
/* 131 */         int k = el1.q();
/*     */         
/* 133 */         axy1.a(☃, el1, wj.cI, wk.e, 0.5F, 2.6F + (axy1.s.nextFloat() - axy1.s.nextFloat()) * 0.8F);
/*     */         
/* 135 */         for (int m = 0; m < 8; m++) {
/* 136 */           axy1.a(fm.F, i + Math.random(), j + Math.random(), k + Math.random(), 0.0D, 0.0D, 0.0D);
/*     */         }
/*     */       }
/* 139 */       else if (blc.c() instanceof bfv) {
/* 140 */         if (((bfv)blc.c()).a(axy1, el1, blc, ((byu)this.a).a(false))) {
/* 141 */           a(☃, axy1, el1);
/*     */         }
/*     */       } else {
/* 144 */         if (!axy1.B && (bool1 || bool2) && !bza.a()) {
/* 145 */           axy1.a(el1, true);
/*     */         }
/*     */         
/* 148 */         a(☃, axy1, el1);
/* 149 */         axy1.a(el1, this.a.i().i(), 11);
/*     */       } 
/*     */ 
/*     */       
/* 153 */       return true;
/*     */     } 
/* 155 */     if (ceb1 == null) {
/* 156 */       return false;
/*     */     }
/*     */     
/* 159 */     return a(☃, axy1, ceb1.a().a(ceb1.b), null);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(@Nullable aog ☃, axz axz1, el el1) {
/* 164 */     wi wi = this.a.a(ww.b) ? wj.aj : wj.ah;
/* 165 */     axz1.a(☃, el1, wi, wk.e, 1.0F, 1.0F);
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\arr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */