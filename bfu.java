/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bfu
/*     */   extends bcs
/*     */   implements bcz
/*     */ {
/*  36 */   public static final bmj a = bma.ah;
/*     */   
/*     */   protected final byu b;
/*     */   
/*     */   private final List<byw> c;
/*  41 */   private final Map<blc, cew> o = Maps.newIdentityHashMap();
/*     */   
/*     */   protected bfu(byu ☃, bcs.c c1) {
/*  44 */     super(c1);
/*  45 */     this.b = ☃;
/*  46 */     this.c = Lists.newArrayList();
/*  47 */     this.c.add(☃.a(false));
/*  48 */     for (int i = 1; i < 8; i++) {
/*  49 */       this.c.add(☃.a(8 - i, false));
/*     */     }
/*  51 */     this.c.add(☃.a(8, true));
/*  52 */     v(((blc)this.m.b()).a(a, Integer.valueOf(0)));
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(blc ☃, axy axy1, el el1, Random random) {
/*  57 */     axy1.b(el1).b(axy1, el1, random);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a_(blc ☃, axk axk1, el el1) {
/*  62 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃, axk axk1, el el1, cbf cbf1) {
/*  67 */     return !this.b.a(ww.b);
/*     */   }
/*     */ 
/*     */   
/*     */   public byw h(blc ☃) {
/*  72 */     int i = ((Integer)☃.c(a)).intValue();
/*  73 */     return this.c.get(Math.min(i, 8));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃) {
/*  78 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean d(blc ☃) {
/*  83 */     return false;
/*     */   }
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
/*     */   public cew a(blc ☃, axk axk1, el el1) {
/*  96 */     byw byw = axk1.b(el1.a());
/*  97 */     if (byw.c().a(this.b)) {
/*  98 */       return cet.b();
/*     */     }
/*     */     
/* 101 */     return this.o.computeIfAbsent(☃, ☃ -> {
/*     */           byw byw = ☃.s();
/*     */           return cet.a(0.0D, 0.0D, 0.0D, 1.0D, byw.f(), 1.0D);
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public bgy c(blc ☃) {
/* 109 */     return bgy.a;
/*     */   }
/*     */ 
/*     */   
/*     */   public axx a(blc ☃, axy axy1, el el1, int i) {
/* 114 */     return atf.a;
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(ayc ☃) {
/* 119 */     return this.b.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(blc ☃, axy axy1, el el1, blc blc1) {
/* 124 */     if (a(axy1, el1, ☃)) {
/* 125 */       axy1.I().a(el1, ☃.s().c(), a(axy1));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public blc a(blc ☃, eq eq1, blc blc1, axz axz1, el el1, el el2) {
/* 131 */     if (☃.s().d() || blc1.s().d()) {
/* 132 */       axz1.I().a(el1, ☃.s().c(), a(axz1));
/*     */     }
/*     */     
/* 135 */     return super.a(☃, eq1, blc1, axz1, el1, el2);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(blc ☃, axy axy1, el el1, bcs bcs1, el el2) {
/* 140 */     if (a(axy1, el1, ☃)) {
/* 141 */       axy1.I().a(el1, ☃.s().c(), a(axy1));
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean a(axy ☃, el el1, blc blc1) {
/* 146 */     if (this.b.a(ww.b)) {
/* 147 */       boolean bool = false;
/* 148 */       for (eq eq : eq.values()) {
/* 149 */         if (eq != eq.a && ☃.b(el1.a(eq)).a(ww.a)) {
/* 150 */           bool = true;
/*     */           break;
/*     */         } 
/*     */       } 
/* 154 */       if (bool) {
/* 155 */         byw byw = ☃.b(el1);
/* 156 */         if (byw.d()) {
/* 157 */           ☃.a(el1, bct.ce.p());
/* 158 */           a(☃, el1);
/* 159 */           return false;
/* 160 */         }  if (byw.f() >= 0.44444445F) {
/* 161 */           ☃.a(el1, bct.m.p());
/* 162 */           a(☃, el1);
/* 163 */           return false;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 168 */     return true;
/*     */   }
/*     */   
/*     */   protected void a(axz ☃, el el1) {
/* 172 */     double d1 = el1.o();
/* 173 */     double d2 = el1.p();
/* 174 */     double d3 = el1.q();
/*     */     
/* 176 */     ☃.a((aog)null, el1, wj.eL, wk.e, 0.5F, 2.6F + (☃.m().nextFloat() - ☃.m().nextFloat()) * 0.8F);
/* 177 */     for (int i = 0; i < 8; i++) {
/* 178 */       ☃.a(fm.F, d1 + Math.random(), d2 + 1.2D, d3 + Math.random(), 0.0D, 0.0D, 0.0D);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(ble.a<bcs, blc> ☃) {
/* 184 */     ☃.a((bmm<?>[])new bmm[] { a });
/*     */   }
/*     */ 
/*     */   
/*     */   public blb a(axk ☃, blc blc1, el el1, eq eq1) {
/* 189 */     return blb.i;
/*     */   }
/*     */ 
/*     */   
/*     */   public byv a(axz ☃, el el1, blc blc1) {
/* 194 */     if (((Integer)blc1.c(a)).intValue() == 0) {
/* 195 */       ☃.a(el1, bct.a.p(), 11);
/* 196 */       return this.b;
/*     */     } 
/* 198 */     return byy.a;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bfu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */