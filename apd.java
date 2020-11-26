/*     */ import java.util.List;
/*     */ import java.util.function.Predicate;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
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
/*     */ public class apd
/*     */   extends aoz
/*     */ {
/*  38 */   private static final or<ate> f = ou.a((Class)apd.class, ot.g);
/*  39 */   private static final Logger g = LogManager.getLogger();
/*  40 */   public static final Predicate<afa> e = apd::a;
/*     */   
/*     */   public apd(axy ☃) {
/*  43 */     super(aev.az, ☃);
/*     */   }
/*     */   
/*     */   public apd(axy ☃, afa afa1, ate ate1) {
/*  47 */     super(aev.az, afa1, ☃);
/*     */     
/*  49 */     b(ate1);
/*     */   }
/*     */   
/*     */   public apd(axy ☃, double d1, double d2, double d3, ate ate1) {
/*  53 */     super(aev.az, d1, d2, d3, ☃);
/*  54 */     if (!ate1.a()) {
/*  55 */       b(ate1);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected void x_() {
/*  61 */     T().a(f, ate.a);
/*     */   }
/*     */   
/*     */   public ate k() {
/*  65 */     ate ☃ = T().<ate>a(f);
/*     */     
/*  67 */     if (☃.b() != atf.co && ☃.b() != atf.cp) {
/*  68 */       if (this.m != null) {
/*  69 */         g.error("ThrownPotion entity {} has no item?!", Integer.valueOf(Q()));
/*     */       }
/*  71 */       return new ate(atf.co);
/*     */     } 
/*     */     
/*  74 */     return ☃;
/*     */   }
/*     */   
/*     */   public void b(ate ☃) {
/*  78 */     T().b(f, ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   protected float f() {
/*  83 */     return 0.05F;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(ceb ☃) {
/*  88 */     if (this.m.B) {
/*     */       return;
/*     */     }
/*  91 */     ate ate = k();
/*     */     
/*  93 */     aut aut = auv.d(ate);
/*  94 */     List<aek> list = auv.a(ate);
/*  95 */     boolean bool = (aut == auw.b && list.isEmpty());
/*  96 */     if (☃.a == ceb.a.b && bool) {
/*  97 */       el el = ☃.a().a(☃.b);
/*  98 */       a(el, ☃.b);
/*  99 */       for (eq eq : eq.c.a) {
/* 100 */         a(el.a(eq), eq);
/*     */       }
/*     */     } 
/*     */     
/* 104 */     if (bool) {
/* 105 */       l();
/* 106 */     } else if (!list.isEmpty()) {
/* 107 */       if (m()) {
/* 108 */         a(ate, aut);
/*     */       } else {
/* 110 */         a(☃, list);
/*     */       } 
/*     */     } 
/* 113 */     int i = aut.c() ? 2007 : 2002;
/* 114 */     this.m.b(i, new el(this), auv.c(ate));
/*     */     
/* 116 */     V();
/*     */   }
/*     */   
/*     */   private void l() {
/* 120 */     cea ☃ = bD().c(4.0D, 2.0D, 4.0D);
/* 121 */     List<afa> list = this.m.a(afa.class, ☃, e);
/* 122 */     if (!list.isEmpty()) {
/* 123 */       for (afa afa : list) {
/* 124 */         double d = h(afa);
/* 125 */         if (d < 16.0D && a(afa)) {
/* 126 */           afa.a(aea.h, 1.0F);
/*     */         }
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   private void a(ceb ☃, List<aek> list) {
/* 133 */     cea cea = bD().c(4.0D, 2.0D, 4.0D);
/* 134 */     List<afa> list1 = this.m.a(afa.class, cea);
/*     */     
/* 136 */     if (!list1.isEmpty()) {
/* 137 */       for (afa afa : list1) {
/* 138 */         if (!afa.de()) {
/*     */           continue;
/*     */         }
/* 141 */         double d = h(afa);
/* 142 */         if (d < 16.0D) {
/* 143 */           double d1 = 1.0D - Math.sqrt(d) / 4.0D;
/* 144 */           if (afa == ☃.d) {
/* 145 */             d1 = 1.0D;
/*     */           }
/*     */           
/* 148 */           for (aek aek : list) {
/* 149 */             aej aej = aek.a();
/* 150 */             if (aej.a()) {
/* 151 */               aej.a(this, i(), afa, aek.c(), d1); continue;
/*     */             } 
/* 153 */             int i = (int)(d1 * aek.b() + 0.5D);
/* 154 */             if (i > 20) {
/* 155 */               afa.c(new aek(aej, i, aek.c(), aek.d(), aek.e()));
/*     */             }
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   private void a(ate ☃, aut aut1) {
/* 165 */     aep aep = new aep(this.m, this.q, this.r, this.s);
/* 166 */     aep.a(i());
/* 167 */     aep.a(3.0F);
/* 168 */     aep.b(-0.5F);
/* 169 */     aep.d(10);
/* 170 */     aep.c(-aep.f() / aep.m());
/* 171 */     aep.a(aut1);
/* 172 */     for (aek aek : auv.b(☃)) {
/* 173 */       aep.a(new aek(aek));
/*     */     }
/*     */     
/* 176 */     gy gy = ☃.n();
/* 177 */     if (gy != null && gy.c("CustomPotionColor", 99)) {
/* 178 */       aep.a(gy.h("CustomPotionColor"));
/*     */     }
/*     */     
/* 181 */     this.m.a(aep);
/*     */   }
/*     */   
/*     */   private boolean m() {
/* 185 */     return (k().b() == atf.cp);
/*     */   }
/*     */   
/*     */   private void a(el ☃, eq eq1) {
/* 189 */     if (this.m.a_(☃).c() == bct.ch) {
/* 190 */       this.m.a((aog)null, ☃.a(eq1), eq1.d());
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(gy ☃) {
/* 196 */     super.a(☃);
/*     */     
/* 198 */     ate ate = ate.a(☃.p("Potion"));
/* 199 */     if (ate.a()) {
/* 200 */       V();
/*     */     } else {
/* 202 */       b(ate);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(gy ☃) {
/* 208 */     super.b(☃);
/* 209 */     ate ate = k();
/* 210 */     if (!ate.a()) {
/* 211 */       ☃.a("Potion", ate.b(new gy()));
/*     */     }
/*     */   }
/*     */   
/*     */   private static boolean a(afa ☃) {
/* 216 */     return (☃ instanceof amw || ☃ instanceof amr);
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\apd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */