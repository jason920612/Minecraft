/*     */ import java.util.Random;
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
/*     */ public class bdm
/*     */   extends bcm
/*     */ {
/*  31 */   private static final Logger c = LogManager.getLogger();
/*  32 */   public static final bme a = beb.a;
/*  33 */   public static final bmb b = bma.b;
/*     */   
/*     */   public bdm(bcs.c ☃) {
/*  36 */     super(☃);
/*  37 */     v(((blc)this.m.b()).a(a, eq.c).a(b, Boolean.valueOf(false)));
/*     */   }
/*     */ 
/*     */   
/*     */   public bji a(axk ☃) {
/*  42 */     bjm bjm = new bjm();
/*  43 */     bjm.b((this == bct.ii));
/*  44 */     return bjm;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(blc ☃, axy axy1, el el1, bcs bcs1, el el2) {
/*  49 */     if (axy1.B) {
/*     */       return;
/*     */     }
/*     */     
/*  53 */     bji bji = axy1.f(el1);
/*  54 */     if (!(bji instanceof bjm)) {
/*     */       return;
/*     */     }
/*     */     
/*  58 */     bjm bjm = (bjm)bji;
/*  59 */     boolean bool1 = axy1.t(el1);
/*  60 */     boolean bool2 = bjm.d();
/*     */     
/*  62 */     bjm.a(bool1);
/*     */     
/*  64 */     if (bool2 || bjm.e() || bjm.j() == bjm.a.a) {
/*     */       return;
/*     */     }
/*     */     
/*  68 */     if (bool1) {
/*  69 */       bjm.h();
/*     */       
/*  71 */       axy1.J().a(el1, this, a(axy1));
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(blc ☃, axy axy1, el el1, Random random) {
/*  77 */     if (axy1.B) {
/*     */       return;
/*     */     }
/*     */     
/*  81 */     bji bji = axy1.f(el1);
/*  82 */     if (bji instanceof bjm) {
/*  83 */       bjm bjm = (bjm)bji;
/*  84 */       axh axh = bjm.c();
/*  85 */       boolean bool1 = !xw.b(axh.k());
/*  86 */       bjm.a a = bjm.j();
/*     */       
/*  88 */       boolean bool2 = bjm.f();
/*  89 */       if (a == bjm.a.b) {
/*  90 */         bjm.h();
/*     */         
/*  92 */         if (bool2) {
/*  93 */           a(☃, axy1, el1, axh, bool1);
/*  94 */         } else if (bjm.k()) {
/*  95 */           axh.a(0);
/*     */         } 
/*     */         
/*  98 */         if (bjm.d() || bjm.e()) {
/*  99 */           axy1.J().a(el1, this, a(axy1));
/*     */         }
/* 101 */       } else if (a == bjm.a.c) {
/* 102 */         if (bool2) {
/* 103 */           a(☃, axy1, el1, axh, bool1);
/* 104 */         } else if (bjm.k()) {
/* 105 */           axh.a(0);
/*     */         } 
/*     */       } 
/*     */       
/* 109 */       axy1.c(el1, this);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(blc ☃, axy axy1, el el1, axh axh1, boolean bool) {
/* 114 */     if (bool) {
/* 115 */       axh1.a(axy1);
/*     */     } else {
/* 117 */       axh1.a(0);
/*     */     } 
/*     */     
/* 120 */     a(axy1, el1, (eq)☃.c(a));
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(ayc ☃) {
/* 125 */     return 1;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃, axy axy1, el el1, aog aog1, adk adk1, eq eq1, float f1, float f2, float f3) {
/* 130 */     bji bji = axy1.f(el1);
/* 131 */     if (bji instanceof bjm && aog1.dK()) {
/* 132 */       aog1.a((bjm)bji);
/* 133 */       return true;
/*     */     } 
/* 135 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean u(blc ☃) {
/* 140 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(blc ☃, axy axy1, el el1) {
/* 145 */     bji bji = axy1.f(el1);
/* 146 */     if (bji instanceof bjm) {
/* 147 */       return ((bjm)bji).c().i();
/*     */     }
/* 149 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(axy ☃, el el1, blc blc1, afa afa1, ate ate1) {
/* 154 */     bji bji = ☃.f(el1);
/* 155 */     if (!(bji instanceof bjm)) {
/*     */       return;
/*     */     }
/*     */     
/* 159 */     bjm bjm = (bjm)bji;
/* 160 */     axh axh = bjm.c();
/*     */     
/* 162 */     if (ate1.s()) {
/* 163 */       axh.b(ate1.q());
/*     */     }
/*     */     
/* 166 */     if (!☃.B) {
/* 167 */       if (ate1.b("BlockEntityTag") == null) {
/* 168 */         axh.a(☃.X().b("sendCommandFeedback"));
/* 169 */         bjm.b((this == bct.ii));
/*     */       } 
/*     */       
/* 172 */       if (bjm.j() == bjm.a.a) {
/* 173 */         boolean bool = ☃.t(el1);
/* 174 */         bjm.a(bool);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(blc ☃, Random random) {
/* 181 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public bgy c(blc ☃) {
/* 186 */     return bgy.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public blc a(blc ☃, bhb bhb1) {
/* 191 */     return ☃.a(a, bhb1.a((eq)☃.c(a)));
/*     */   }
/*     */ 
/*     */   
/*     */   public blc a(blc ☃, bfz bfz1) {
/* 196 */     return ☃.a(bfz1.a((eq)☃.c(a)));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(ble.a<bcs, blc> ☃) {
/* 201 */     ☃.a((bmm<?>[])new bmm[] { a, b });
/*     */   }
/*     */ 
/*     */   
/*     */   public blc a(ark ☃) {
/* 206 */     return p().a(a, ☃.d().d());
/*     */   }
/*     */   
/*     */   private static void a(axy ☃, el el1, eq eq1) {
/* 210 */     el.a a = new el.a(el1);
/*     */     
/* 212 */     axu axu = ☃.X();
/* 213 */     int i = axu.c("maxCommandChainLength");
/* 214 */     while (i-- > 0) {
/* 215 */       a.c(eq1);
/*     */       
/* 217 */       blc blc = ☃.a_(a);
/* 218 */       bcs bcs = blc.c();
/* 219 */       if (bcs != bct.ii) {
/*     */         break;
/*     */       }
/*     */       
/* 223 */       bji bji = ☃.f(a);
/* 224 */       if (!(bji instanceof bjm)) {
/*     */         break;
/*     */       }
/*     */       
/* 228 */       bjm bjm = (bjm)bji;
/* 229 */       if (bjm.j() != bjm.a.a) {
/*     */         break;
/*     */       }
/*     */       
/* 233 */       if (bjm.d() || bjm.e()) {
/* 234 */         axh axh = bjm.c();
/* 235 */         if (bjm.h()) {
/* 236 */           if (axh.a(☃)) {
/* 237 */             ☃.c(a, bcs);
/*     */           } else {
/*     */             break;
/*     */           } 
/* 241 */         } else if (bjm.k()) {
/* 242 */           axh.a(0);
/*     */         } 
/*     */       } 
/*     */       
/* 246 */       eq1 = (eq)blc.c(a);
/*     */     } 
/* 248 */     if (i <= 0) {
/* 249 */       int j = Math.max(axu.c("maxCommandChainLength"), 0);
/* 250 */       c.warn("Command Block chain tried to execute more than {} steps!", Integer.valueOf(j));
/*     */     } 
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bdm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */