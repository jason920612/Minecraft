/*     */ import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
/*     */ import java.util.Map;
/*     */ import java.util.Random;
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
/*     */ public class bec
/*     */   extends bcm
/*     */ {
/*  39 */   public static final bme a = beb.a; private static final Map<ata, es> c;
/*  40 */   public static final bmb b = bma.w;
/*     */   static {
/*  42 */     c = (Map<ata, es>)k.a(new Object2ObjectOpenHashMap(), ☃ -> ☃.defaultReturnValue(new eo()));
/*     */   }
/*     */   public static void a(axx ☃, es es1) {
/*  45 */     c.put(☃.h(), es1);
/*     */   }
/*     */   
/*     */   protected bec(bcs.c ☃) {
/*  49 */     super(☃);
/*  50 */     v(((blc)this.m.b()).a(a, eq.c).a(b, Boolean.valueOf(false)));
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(ayc ☃) {
/*  55 */     return 4;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃, axy axy1, el el1, aog aog1, adk adk1, eq eq1, float f1, float f2, float f3) {
/*  60 */     if (axy1.B) {
/*  61 */       return true;
/*     */     }
/*     */     
/*  64 */     bji bji = axy1.f(el1);
/*  65 */     if (bji instanceof bjq) {
/*  66 */       aog1.a((bjq)bji);
/*  67 */       if (bji instanceof bjr) {
/*  68 */         aog1.a(ws.aa);
/*     */       } else {
/*  70 */         aog1.a(ws.ac);
/*     */       } 
/*     */     } 
/*     */     
/*  74 */     return true;
/*     */   }
/*     */   
/*     */   protected void a(axy ☃, el el1) {
/*  78 */     en en = new en(☃, el1);
/*  79 */     bjq bjq = en.<bjq>g();
/*     */     
/*  81 */     int i = bjq.p();
/*  82 */     if (i < 0) {
/*  83 */       ☃.b(1001, el1, 0);
/*     */       
/*     */       return;
/*     */     } 
/*  87 */     ate ate = bjq.a(i);
/*  88 */     es es = a(ate);
/*     */     
/*  90 */     if (es != es.NOOP) {
/*  91 */       bjq.a(i, es.dispense(en, ate));
/*     */     }
/*     */   }
/*     */   
/*     */   protected es a(ate ☃) {
/*  96 */     return c.get(☃.b());
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(blc ☃, axy axy1, el el1, bcs bcs1, el el2) {
/* 101 */     boolean bool1 = (axy1.t(el1) || axy1.t(el1.a()));
/* 102 */     boolean bool2 = ((Boolean)☃.c(b)).booleanValue();
/*     */     
/* 104 */     if (bool1 && !bool2) {
/* 105 */       axy1.J().a(el1, this, a(axy1));
/* 106 */       axy1.a(el1, ☃.a(b, Boolean.valueOf(true)), 4);
/* 107 */     } else if (!bool1 && bool2) {
/* 108 */       axy1.a(el1, ☃.a(b, Boolean.valueOf(false)), 4);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(blc ☃, axy axy1, el el1, Random random) {
/* 114 */     if (!axy1.B) {
/* 115 */       a(axy1, el1);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public bji a(axk ☃) {
/* 121 */     return new bjq();
/*     */   }
/*     */ 
/*     */   
/*     */   public blc a(ark ☃) {
/* 126 */     return p().a(a, ☃.d().d());
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(axy ☃, el el1, blc blc1, afa afa1, ate ate1) {
/* 131 */     if (ate1.s()) {
/* 132 */       bji bji = ☃.f(el1);
/* 133 */       if (bji instanceof bjq) {
/* 134 */         ((bjq)bji).a(ate1.q());
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(blc ☃, axy axy1, el el1, blc blc1, boolean bool) {
/* 141 */     if (☃.c() == blc1.c()) {
/*     */       return;
/*     */     }
/* 144 */     bji bji = axy1.f(el1);
/* 145 */     if (bji instanceof bjq) {
/* 146 */       adh.a(axy1, el1, (bjq)bji);
/*     */       
/* 148 */       axy1.c(el1, this);
/*     */     } 
/* 150 */     super.a(☃, axy1, el1, blc1, bool);
/*     */   }
/*     */   
/*     */   public static fa a(em ☃) {
/* 154 */     eq eq = (eq)☃.e().c(a);
/*     */     
/* 156 */     double d1 = ☃.a() + 0.7D * eq.g();
/* 157 */     double d2 = ☃.b() + 0.7D * eq.h();
/* 158 */     double d3 = ☃.c() + 0.7D * eq.i();
/*     */     
/* 160 */     return new fb(d1, d2, d3);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean u(blc ☃) {
/* 165 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(blc ☃, axy axy1, el el1) {
/* 170 */     return apv.a(axy1.f(el1));
/*     */   }
/*     */ 
/*     */   
/*     */   public bgy c(blc ☃) {
/* 175 */     return bgy.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public blc a(blc ☃, bhb bhb1) {
/* 180 */     return ☃.a(a, bhb1.a((eq)☃.c(a)));
/*     */   }
/*     */ 
/*     */   
/*     */   public blc a(blc ☃, bfz bfz1) {
/* 185 */     return ☃.a(bfz1.a((eq)☃.c(a)));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(ble.a<bcs, blc> ☃) {
/* 190 */     ☃.a((bmm<?>[])new bmm[] { a, b });
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bec.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */