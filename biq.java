/*     */ import java.util.Map;
/*     */ import java.util.Random;
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
/*     */ public class biq
/*     */   extends bcs
/*     */ {
/*  32 */   public static final bmb a = bgj.p;
/*  33 */   public static final bmb b = bgj.a;
/*  34 */   public static final bmb c = bgj.b;
/*  35 */   public static final bmb o = bgj.c;
/*  36 */   public static final bmb p = bgj.o;
/*     */   static {
/*  38 */     q = (Map<eq, bmb>)bgj.r.entrySet().stream().filter(☃ -> (☃.getKey() != eq.a)).collect(k.a());
/*     */   }
/*     */   public static final Map<eq, bmb> q;
/*  41 */   protected static final cew r = bcs.a(0.0D, 15.0D, 0.0D, 16.0D, 16.0D, 16.0D);
/*  42 */   protected static final cew s = bcs.a(0.0D, 0.0D, 0.0D, 1.0D, 16.0D, 16.0D);
/*  43 */   protected static final cew t = bcs.a(15.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D);
/*  44 */   protected static final cew u = bcs.a(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 1.0D);
/*  45 */   protected static final cew v = bcs.a(0.0D, 0.0D, 15.0D, 16.0D, 16.0D, 16.0D);
/*     */   
/*     */   public biq(bcs.c ☃) {
/*  48 */     super(☃);
/*  49 */     v(((blc)this.m.b()).a(a, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)).a(o, Boolean.valueOf(false)).a(p, Boolean.valueOf(false)));
/*     */   }
/*     */ 
/*     */   
/*     */   public cew a(blc ☃, axk axk1, el el1) {
/*  54 */     cew cew1 = cet.a();
/*     */     
/*  56 */     if (((Boolean)☃.c(a)).booleanValue()) {
/*  57 */       cew1 = cet.a(cew1, r);
/*     */     }
/*  59 */     if (((Boolean)☃.c(b)).booleanValue()) {
/*  60 */       cew1 = cet.a(cew1, u);
/*     */     }
/*  62 */     if (((Boolean)☃.c(c)).booleanValue()) {
/*  63 */       cew1 = cet.a(cew1, t);
/*     */     }
/*  65 */     if (((Boolean)☃.c(o)).booleanValue()) {
/*  66 */       cew1 = cet.a(cew1, v);
/*     */     }
/*  68 */     if (((Boolean)☃.c(p)).booleanValue()) {
/*  69 */       cew1 = cet.a(cew1, s);
/*     */     }
/*  71 */     return cew1;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃) {
/*  76 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃, ayc ayc1, el el1) {
/*  81 */     return k(m(☃, ayc1, el1));
/*     */   }
/*     */   
/*     */   private boolean k(blc ☃) {
/*  85 */     return (w(☃) > 0);
/*     */   }
/*     */   
/*     */   private int w(blc ☃) {
/*  89 */     int i = 0;
/*  90 */     for (bmb bmb1 : q.values()) {
/*  91 */       if (((Boolean)☃.c(bmb1)).booleanValue()) {
/*  92 */         i++;
/*     */       }
/*     */     } 
/*     */     
/*  96 */     return i;
/*     */   }
/*     */   
/*     */   private boolean a(axk ☃, el el1, eq eq1) {
/* 100 */     if (eq1 == eq.a) {
/* 101 */       return false;
/*     */     }
/*     */     
/* 104 */     el el2 = el1.a(eq1);
/* 105 */     if (b(☃, el2, eq1)) {
/* 106 */       return true;
/*     */     }
/*     */     
/* 109 */     if (eq1.k() != eq.a.b) {
/*     */       
/* 111 */       bmb bmb1 = q.get(eq1);
/* 112 */       blc blc = ☃.a_(el1.a());
/* 113 */       return (blc.c() == this && ((Boolean)blc.c(bmb1)).booleanValue());
/*     */     } 
/* 115 */     return false;
/*     */   }
/*     */   
/*     */   private boolean b(axk ☃, el el1, eq eq1) {
/* 119 */     blc blc = ☃.a_(el1);
/*     */     
/* 121 */     return (blc.c(☃, el1, eq1.d()) == blb.a && !f(blc.c()));
/*     */   }
/*     */   
/*     */   protected static boolean f(bcs ☃) {
/* 125 */     return (☃ instanceof bhi || ☃ instanceof bhv || ☃ == bct.eu || ☃ == bct.ed || ☃ == bct.ap || ☃ == bct.aW || ☃ == bct.aP || ☃ == bct.aX || ☃
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 133 */       .a(wv.k));
/*     */   }
/*     */   
/*     */   private blc m(blc ☃, axk axk1, el el1) {
/* 137 */     el el2 = el1.a();
/* 138 */     if (((Boolean)☃.c(a)).booleanValue()) {
/* 139 */       ☃ = ☃.a(a, Boolean.valueOf(b(axk1, el2, eq.a)));
/*     */     }
/*     */ 
/*     */     
/* 143 */     blc blc1 = null;
/* 144 */     for (eq eq : eq.c.a) {
/* 145 */       bmb bmb1 = a(eq);
/*     */       
/* 147 */       if (((Boolean)☃.c(bmb1)).booleanValue()) {
/* 148 */         boolean bool = a(axk1, el1, eq);
/* 149 */         if (!bool) {
/* 150 */           if (blc1 == null) {
/* 151 */             blc1 = axk1.a_(el2);
/*     */           }
/* 153 */           bool = (blc1.c() == this && ((Boolean)blc1.c(bmb1)).booleanValue());
/*     */         } 
/* 155 */         ☃ = ☃.a(bmb1, Boolean.valueOf(bool));
/*     */       } 
/*     */     } 
/* 158 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public blc a(blc ☃, eq eq1, blc blc1, axz axz1, el el1, el el2) {
/* 163 */     if (eq1 == eq.a) {
/* 164 */       return super.a(☃, eq1, blc1, axz1, el1, el2);
/*     */     }
/*     */     
/* 167 */     blc blc2 = m(☃, axz1, el1);
/*     */     
/* 169 */     if (!k(blc2)) {
/* 170 */       return bct.a.p();
/*     */     }
/*     */     
/* 173 */     return blc2;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(blc ☃, axy axy1, el el1, Random random) {
/* 178 */     if (axy1.B) {
/*     */       return;
/*     */     }
/*     */     
/* 182 */     blc blc1 = m(☃, axy1, el1);
/* 183 */     if (blc1 != ☃) {
/* 184 */       if (k(blc1)) {
/* 185 */         axy1.a(el1, blc1, 2);
/*     */       } else {
/* 187 */         ☃.a(axy1, el1, 0);
/* 188 */         axy1.g(el1);
/*     */       } 
/*     */       
/*     */       return;
/*     */     } 
/* 193 */     if (axy1.s.nextInt(4) != 0) {
/*     */       return;
/*     */     }
/*     */     
/* 197 */     eq eq = eq.a(random);
/*     */     
/* 199 */     el el2 = el1.a();
/* 200 */     if (eq.k().c() && !((Boolean)☃.c(a(eq))).booleanValue()) {
/* 201 */       if (!a(axy1, el1)) {
/*     */         return;
/*     */       }
/*     */       
/* 205 */       el el3 = el1.a(eq);
/*     */       
/* 207 */       blc blc2 = axy1.a_(el3);
/* 208 */       if (blc2.f()) {
/*     */         
/* 210 */         eq eq1 = eq.e();
/* 211 */         eq eq2 = eq.f();
/*     */ 
/*     */         
/* 214 */         boolean bool1 = ((Boolean)☃.c(a(eq1))).booleanValue();
/* 215 */         boolean bool2 = ((Boolean)☃.c(a(eq2))).booleanValue();
/*     */         
/* 217 */         el el4 = el3.a(eq1);
/* 218 */         el el5 = el3.a(eq2);
/*     */         
/* 220 */         if (bool1 && b(axy1, el4, eq1)) {
/* 221 */           axy1.a(el3, p().a(a(eq1), Boolean.valueOf(true)), 2);
/* 222 */         } else if (bool2 && b(axy1, el5, eq2)) {
/* 223 */           axy1.a(el3, p().a(a(eq2), Boolean.valueOf(true)), 2);
/*     */         } else {
/*     */           
/* 226 */           eq eq3 = eq.d();
/* 227 */           if (bool1 && axy1.c(el4) && b(axy1, el1.a(eq1), eq3)) {
/* 228 */             axy1.a(el4, p().a(a(eq3), Boolean.valueOf(true)), 2);
/* 229 */           } else if (bool2 && axy1.c(el5) && b(axy1, el1.a(eq2), eq3)) {
/* 230 */             axy1.a(el5, p().a(a(eq3), Boolean.valueOf(true)), 2);
/*     */           
/*     */           }
/* 233 */           else if (axy1.s.nextFloat() < 0.05D && b(axy1, el3.a(), eq.b)) {
/* 234 */             axy1.a(el3, p().a(a, Boolean.valueOf(true)), 2);
/*     */           }
/*     */         
/*     */         } 
/* 238 */       } else if (b(axy1, el3, eq)) {
/*     */         
/* 240 */         axy1.a(el1, ☃.a(a(eq), Boolean.valueOf(true)), 2);
/*     */       } 
/*     */       
/*     */       return;
/*     */     } 
/* 245 */     if (eq == eq.b && el1.p() < 255) {
/* 246 */       if (a(axy1, el1, eq)) {
/* 247 */         axy1.a(el1, ☃.a(a, Boolean.valueOf(true)), 2);
/*     */         return;
/*     */       } 
/* 250 */       if (axy1.c(el2)) {
/* 251 */         if (!a(axy1, el1)) {
/*     */           return;
/*     */         }
/*     */ 
/*     */         
/* 256 */         blc blc2 = ☃;
/* 257 */         for (eq eq1 : eq.c.a) {
/* 258 */           if (random.nextBoolean() || !b(axy1, el2.a(eq1), eq.b)) {
/* 259 */             blc2 = blc2.a(a(eq1), Boolean.valueOf(false));
/*     */           }
/*     */         } 
/* 262 */         if (x(blc2)) {
/* 263 */           axy1.a(el2, blc2, 2);
/*     */         }
/*     */         return;
/*     */       } 
/*     */     } 
/* 268 */     if (el1.p() > 0) {
/*     */       
/* 270 */       el el3 = el1.b();
/* 271 */       blc blc2 = axy1.a_(el3);
/*     */       
/* 273 */       if (blc2.f() || blc2.c() == this) {
/* 274 */         blc blc3 = blc2.f() ? p() : blc2;
/* 275 */         blc blc4 = a(☃, blc3, random);
/* 276 */         if (blc3 != blc4 && x(blc4)) {
/* 277 */           axy1.a(el3, blc4, 2);
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private blc a(blc ☃, blc blc1, Random random) {
/* 284 */     for (eq eq : eq.c.a) {
/* 285 */       if (random.nextBoolean()) {
/* 286 */         bmb bmb1 = a(eq);
/* 287 */         if (((Boolean)☃.c(bmb1)).booleanValue()) {
/* 288 */           blc1 = blc1.a(bmb1, Boolean.valueOf(true));
/*     */         }
/*     */       } 
/*     */     } 
/* 292 */     return blc1;
/*     */   }
/*     */   
/*     */   private boolean x(blc ☃) {
/* 296 */     return (((Boolean)☃.c(b)).booleanValue() || ((Boolean)☃.c(c)).booleanValue() || ((Boolean)☃.c(o)).booleanValue() || ((Boolean)☃.c(p)).booleanValue());
/*     */   }
/*     */   
/*     */   private boolean a(axk ☃, el el1) {
/* 300 */     int i = 4;
/*     */     
/* 302 */     Iterable<el.a> iterable = el.a.b(el1
/* 303 */         .o() - 4, el1.p() - 1, el1.q() - 4, el1
/* 304 */         .o() + 4, el1.p() + 1, el1.q() + 4);
/*     */ 
/*     */     
/* 307 */     int j = 5;
/* 308 */     for (el el2 : iterable) {
/* 309 */       if (☃.a_(el2).c() == this && 
/* 310 */         --j <= 0) {
/* 311 */         return false;
/*     */       }
/*     */     } 
/*     */     
/* 315 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃, ark ark1) {
/* 320 */     blc blc1 = ark1.k().a_(ark1.a());
/* 321 */     if (blc1.c() == this) {
/* 322 */       return (w(blc1) < q.size());
/*     */     }
/*     */     
/* 325 */     return super.a(☃, ark1);
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public blc a(ark ☃) {
/* 331 */     blc blc1 = ☃.k().a_(☃.a());
/* 332 */     boolean bool = (blc1.c() == this);
/* 333 */     blc blc2 = bool ? blc1 : p();
/*     */     
/* 335 */     for (eq eq : ☃.e()) {
/* 336 */       if (eq != eq.a) {
/* 337 */         bmb bmb1 = a(eq);
/* 338 */         boolean bool1 = (bool && ((Boolean)blc1.c(bmb1)).booleanValue());
/* 339 */         if (!bool1 && a(☃.k(), ☃.a(), eq)) {
/* 340 */           return blc2.a(bmb1, Boolean.valueOf(true));
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 345 */     return bool ? blc2 : null;
/*     */   }
/*     */ 
/*     */   
/*     */   public axx a(blc ☃, axy axy1, el el1, int i) {
/* 350 */     return atf.a;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(axy ☃, aog aog1, el el1, blc blc1, @Nullable bji bji1, ate ate1) {
/* 355 */     if (!☃.B && ate1.b() == atf.bR) {
/* 356 */       aog1.b(ws.a.b(this));
/* 357 */       aog1.a(0.005F);
/*     */       
/* 359 */       a(☃, el1, new ate(bct.dM));
/*     */     } else {
/* 361 */       super.a(☃, aog1, el1, blc1, bji1, ate1);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public axl c() {
/* 367 */     return axl.c;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(ble.a<bcs, blc> ☃) {
/* 372 */     ☃.a((bmm<?>[])new bmm[] { a, b, c, o, p });
/*     */   }
/*     */ 
/*     */   
/*     */   public blc a(blc ☃, bhb bhb1) {
/* 377 */     switch (null.a[bhb1.ordinal()]) {
/*     */       case 1:
/* 379 */         return ☃.a(b, ☃.c(o)).a(c, ☃.c(p)).a(o, ☃.c(b)).a(p, ☃.c(c));
/*     */       case 2:
/* 381 */         return ☃.a(b, ☃.c(c)).a(c, ☃.c(o)).a(o, ☃.c(p)).a(p, ☃.c(b));
/*     */       case 3:
/* 383 */         return ☃.a(b, ☃.c(p)).a(c, ☃.c(b)).a(o, ☃.c(c)).a(p, ☃.c(o));
/*     */     } 
/* 385 */     return ☃;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public blc a(blc ☃, bfz bfz1) {
/* 391 */     switch (null.b[bfz1.ordinal()]) {
/*     */       case 1:
/* 393 */         return ☃.a(b, ☃.c(o)).a(o, ☃.c(b));
/*     */       case 2:
/* 395 */         return ☃.a(c, ☃.c(p)).a(p, ☃.c(c));
/*     */     } 
/*     */ 
/*     */     
/* 399 */     return super.a(☃, bfz1);
/*     */   }
/*     */   
/*     */   public static bmb a(eq ☃) {
/* 403 */     return q.get(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public blb a(axk ☃, blc blc1, el el1, eq eq1) {
/* 408 */     return blb.i;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\biq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */