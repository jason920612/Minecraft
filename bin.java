/*     */ import java.util.List;
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
/*     */ public class bin
/*     */   extends bcs
/*     */ {
/*  25 */   public static final bmb a = bma.t;
/*  26 */   public static final bmb b = bma.a;
/*  27 */   public static final bmb c = bma.c;
/*  28 */   public static final bmb o = bgj.a;
/*  29 */   public static final bmb p = bgj.b;
/*  30 */   public static final bmb q = bgj.c;
/*  31 */   public static final bmb r = bgj.o;
/*     */   
/*  33 */   private static final Map<eq, bmb> u = bdw.q;
/*     */   
/*  35 */   protected static final cew s = bcs.a(0.0D, 1.0D, 0.0D, 16.0D, 2.5D, 16.0D);
/*  36 */   protected static final cew t = bcs.a(0.0D, 0.0D, 0.0D, 16.0D, 8.0D, 16.0D);
/*     */   
/*     */   private final bio v;
/*     */   
/*     */   public bin(bio ☃, bcs.c c1) {
/*  41 */     super(c1);
/*  42 */     v(((blc)this.m.b()).a(a, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)).a(o, Boolean.valueOf(false)).a(p, Boolean.valueOf(false)).a(q, Boolean.valueOf(false)).a(r, Boolean.valueOf(false)));
/*  43 */     this.v = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public cew a(blc ☃, axk axk1, el el1) {
/*  48 */     return ((Boolean)☃.c(b)).booleanValue() ? s : t;
/*     */   }
/*     */ 
/*     */   
/*     */   public blc a(ark ☃) {
/*  53 */     axk axk = ☃.k();
/*  54 */     el el = ☃.a();
/*     */     
/*  56 */     return p()
/*  57 */       .a(o, Boolean.valueOf(a(axk.a_(el.c()), eq.c)))
/*  58 */       .a(p, Boolean.valueOf(a(axk.a_(el.f()), eq.f)))
/*  59 */       .a(q, Boolean.valueOf(a(axk.a_(el.d()), eq.d)))
/*  60 */       .a(r, Boolean.valueOf(a(axk.a_(el.e()), eq.e)));
/*     */   }
/*     */ 
/*     */   
/*     */   public blc a(blc ☃, eq eq1, blc blc1, axz axz1, el el1, el el2) {
/*  65 */     if (eq1.k().c()) {
/*  66 */       return ☃.a(u.get(eq1), Boolean.valueOf(a(blc1, eq1)));
/*     */     }
/*  68 */     return super.a(☃, eq1, blc1, axz1, el1, el2);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃) {
/*  73 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public axl c() {
/*  78 */     return axl.d;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(blc ☃, axy axy1, el el1, blc blc1) {
/*  83 */     if (blc1.c() == ☃.c()) {
/*     */       return;
/*     */     }
/*  86 */     a(axy1, el1, ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(blc ☃, axy axy1, el el1, blc blc1, boolean bool) {
/*  91 */     if (bool || ☃.c() == blc1.c()) {
/*     */       return;
/*     */     }
/*  94 */     a(axy1, el1, ☃.a(a, Boolean.valueOf(true)));
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(axy ☃, el el1, blc blc1, aog aog1) {
/*  99 */     if (!☃.B && !aog1.cB().a() && aog1.cB().b() == atf.bR) {
/* 100 */       ☃.a(el1, blc1.a(c, Boolean.valueOf(true)), 4);
/*     */     }
/* 102 */     super.a(☃, el1, blc1, aog1);
/*     */   }
/*     */   
/*     */   private void a(axy ☃, el el1, blc blc1) {
/* 106 */     for (eq eq : new eq[] { eq.d, eq.e }) {
/* 107 */       for (int i = 1; i < 42; i++) {
/* 108 */         el el2 = el1.a(eq, i);
/* 109 */         blc blc2 = ☃.a_(el2);
/*     */         
/* 111 */         if (blc2.c() == this.v) {
/* 112 */           if (blc2.c(bio.a) == eq.d()) {
/* 113 */             this.v.a(☃, el2, blc2, false, true, i, blc1);
/*     */           }
/*     */           break;
/*     */         } 
/* 117 */         if (blc2.c() != this) {
/*     */           break;
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(blc ☃, axy axy1, el el1, aer aer1) {
/* 126 */     if (axy1.B) {
/*     */       return;
/*     */     }
/*     */     
/* 130 */     if (((Boolean)☃.c(a)).booleanValue()) {
/*     */       return;
/*     */     }
/*     */     
/* 134 */     a(axy1, el1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(blc ☃, axy axy1, el el1, Random random) {
/* 139 */     if (axy1.B) {
/*     */       return;
/*     */     }
/*     */     
/* 143 */     if (!((Boolean)axy1.a_(el1).c(a)).booleanValue()) {
/*     */       return;
/*     */     }
/*     */     
/* 147 */     a(axy1, el1);
/*     */   }
/*     */   
/*     */   private void a(axy ☃, el el1) {
/* 151 */     blc blc = ☃.a_(el1);
/* 152 */     boolean bool1 = ((Boolean)blc.c(a)).booleanValue();
/* 153 */     boolean bool2 = false;
/*     */     
/* 155 */     List<? extends aer> list = ☃.a((aer)null, blc.g(☃, el1).a().a(el1));
/* 156 */     if (!list.isEmpty()) {
/* 157 */       for (aer aer : list) {
/* 158 */         if (!aer.br()) {
/* 159 */           bool2 = true;
/*     */           
/*     */           break;
/*     */         } 
/*     */       } 
/*     */     }
/* 165 */     if (bool2 != bool1) {
/* 166 */       blc = blc.a(a, Boolean.valueOf(bool2));
/* 167 */       ☃.a(el1, blc, 3);
/* 168 */       a(☃, el1, blc);
/*     */     } 
/*     */     
/* 171 */     if (bool2) {
/* 172 */       ☃.J().a(new el(el1), this, a(☃));
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean a(blc ☃, eq eq1) {
/* 177 */     bcs bcs1 = ☃.c();
/*     */     
/* 179 */     if (bcs1 == this.v) {
/* 180 */       return (☃.c(bio.a) == eq1.d());
/*     */     }
/*     */     
/* 183 */     return (bcs1 == this);
/*     */   }
/*     */ 
/*     */   
/*     */   public blc a(blc ☃, bhb bhb1) {
/* 188 */     switch (null.a[bhb1.ordinal()]) {
/*     */       case 1:
/* 190 */         return ☃.a(o, ☃.c(q)).a(p, ☃.c(r)).a(q, ☃.c(o)).a(r, ☃.c(p));
/*     */       case 2:
/* 192 */         return ☃.a(o, ☃.c(p)).a(p, ☃.c(q)).a(q, ☃.c(r)).a(r, ☃.c(o));
/*     */       case 3:
/* 194 */         return ☃.a(o, ☃.c(r)).a(p, ☃.c(o)).a(q, ☃.c(p)).a(r, ☃.c(q));
/*     */     } 
/* 196 */     return ☃;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public blc a(blc ☃, bfz bfz1) {
/* 202 */     switch (null.b[bfz1.ordinal()]) {
/*     */       case 1:
/* 204 */         return ☃.a(o, ☃.c(q)).a(q, ☃.c(o));
/*     */       case 2:
/* 206 */         return ☃.a(p, ☃.c(r)).a(r, ☃.c(p));
/*     */     } 
/*     */ 
/*     */     
/* 210 */     return super.a(☃, bfz1);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(ble.a<bcs, blc> ☃) {
/* 215 */     ☃.a((bmm<?>[])new bmm[] { a, b, c, o, p, r, q });
/*     */   }
/*     */ 
/*     */   
/*     */   public blb a(axk ☃, blc blc1, el el1, eq eq1) {
/* 220 */     return blb.i;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bin.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */