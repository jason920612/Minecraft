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
/*     */ public abstract class byz
/*     */   extends byu
/*     */ {
/*     */   public byv e() {
/*  31 */     return byy.d;
/*     */   }
/*     */ 
/*     */   
/*     */   public byv f() {
/*  36 */     return byy.e;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ata b() {
/*  46 */     return atf.ay;
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
/*     */   public void b(axy ☃, el el1, byw byw1, Random random) {
/*  69 */     if (!☃.X().b("doFireTick")) {
/*     */       return;
/*     */     }
/*     */     
/*  73 */     int i = random.nextInt(3);
/*  74 */     if (i > 0) {
/*  75 */       el el2 = el1;
/*     */       
/*  77 */       for (int j = 0; j < i; j++) {
/*  78 */         el2 = el2.a(random.nextInt(3) - 1, 1, random.nextInt(3) - 1);
/*  79 */         if (!☃.p(el2)) {
/*     */           return;
/*     */         }
/*  82 */         blc blc = ☃.a_(el2);
/*  83 */         if (blc.f()) {
/*  84 */           if (a(☃, el2)) {
/*  85 */             ☃.a(el2, bct.ch.p());
/*     */             return;
/*     */           } 
/*  88 */         } else if (blc.d().c()) {
/*     */           return;
/*     */         } 
/*     */       } 
/*     */     } else {
/*  93 */       for (int j = 0; j < 3; j++) {
/*  94 */         el el2 = el1.a(random.nextInt(3) - 1, 0, random.nextInt(3) - 1);
/*  95 */         if (!☃.p(el2)) {
/*     */           return;
/*     */         }
/*  98 */         if (☃.c(el2.a()) && b(☃, el2)) {
/*  99 */           ☃.a(el2.a(), bct.ch.p());
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private boolean a(ayc ☃, el el1) {
/* 106 */     for (eq eq : eq.values()) {
/* 107 */       if (b(☃, el1.a(eq))) {
/* 108 */         return true;
/*     */       }
/*     */     } 
/* 111 */     return false;
/*     */   }
/*     */   
/*     */   private boolean b(ayc ☃, el el1) {
/* 115 */     if (el1.p() >= 0 && el1.p() < 256 && !☃.D(el1)) {
/* 116 */       return false;
/*     */     }
/* 118 */     return ☃.a_(el1).d().d();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(axz ☃, el el1, blc blc1) {
/* 129 */     a(☃, el1);
/*     */   }
/*     */ 
/*     */   
/*     */   public int b(ayc ☃) {
/* 134 */     return ☃.o().f() ? 4 : 2;
/*     */   }
/*     */ 
/*     */   
/*     */   public blc b(byw ☃) {
/* 139 */     return bct.C.p().a(bfu.a, Integer.valueOf(e(☃)));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(byv ☃) {
/* 144 */     return (☃ == byy.e || ☃ == byy.d);
/*     */   }
/*     */ 
/*     */   
/*     */   public int c(ayc ☃) {
/* 149 */     return ☃.o().f() ? 1 : 2;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(byw ☃, byv byv1, eq eq1) {
/* 154 */     return (☃.f() >= 0.44444445F && byv1.a(ww.a));
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(ayc ☃) {
/* 159 */     return ☃.o().h() ? 10 : 30;
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(axy ☃, byw byw1, byw byw2) {
/* 164 */     int i = a(☃);
/*     */     
/* 166 */     if (!byw1.e() && !byw2.e() && !((Boolean)byw1.c(a)).booleanValue() && !((Boolean)byw2.c(a)).booleanValue() && byw2.f() > byw1.f() && ☃.m().nextInt(4) != 0) {
/* 167 */       i *= 4;
/*     */     }
/* 169 */     return i;
/*     */   }
/*     */   
/*     */   protected void a(axz ☃, el el1) {
/* 173 */     double d1 = el1.o();
/* 174 */     double d2 = el1.p();
/* 175 */     double d3 = el1.q();
/*     */     
/* 177 */     ☃.a((aog)null, el1, wj.eL, wk.e, 0.5F, 2.6F + (☃.m().nextFloat() - ☃.m().nextFloat()) * 0.8F);
/* 178 */     for (int i = 0; i < 8; i++) {
/* 179 */       ☃.a(fm.F, d1 + Math.random(), d2 + 1.2D, d3 + Math.random(), 0.0D, 0.0D, 0.0D);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean g() {
/* 185 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(axz ☃, el el1, blc blc1, eq eq1, byw byw1) {
/* 190 */     if (eq1 == eq.a) {
/* 191 */       byw byw2 = ☃.b(el1);
/* 192 */       if (a(ww.b) && byw2.a(ww.a)) {
/* 193 */         if (blc1.c() instanceof bfu) {
/* 194 */           ☃.a(el1, bct.b.p(), 3);
/*     */         }
/* 196 */         a(☃, el1);
/*     */         
/*     */         return;
/*     */       } 
/*     */     } 
/* 201 */     super.a(☃, el1, blc1, eq1, byw1);
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean k() {
/* 206 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   protected float d() {
/* 211 */     return 100.0F;
/*     */   }
/*     */   
/*     */   public static class b
/*     */     extends byz {
/*     */     public int d(byw ☃) {
/* 217 */       return 8;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean c(byw ☃) {
/* 222 */       return true;
/*     */     }
/*     */   }
/*     */   
/*     */   public static class a
/*     */     extends byz {
/*     */     protected void a(ble.a<byv, byw> ☃) {
/* 229 */       super.a(☃);
/* 230 */       ☃.a((bmm<?>[])new bmm[] { b });
/*     */     }
/*     */ 
/*     */     
/*     */     public int d(byw ☃) {
/* 235 */       return ((Integer)☃.c(b)).intValue();
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean c(byw ☃) {
/* 240 */       return false;
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\byz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */