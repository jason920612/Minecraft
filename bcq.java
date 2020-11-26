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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bcq
/*     */   extends bfi
/*     */   implements ben
/*     */ {
/*  41 */   public static final bmh<blz> a = bma.ao;
/*  42 */   public static final bmb b = bma.q;
/*  43 */   protected static final cew c = bcs.a(0.0D, 0.0D, 0.0D, 16.0D, 9.0D, 16.0D);
/*     */   
/*     */   private final asc o;
/*     */   
/*     */   public bcq(asc ☃, bcs.c c1) {
/*  48 */     super(c1);
/*  49 */     this.o = ☃;
/*  50 */     v(((blc)this.m.b()).a(a, blz.b).a(b, Boolean.valueOf(false)));
/*     */   }
/*     */ 
/*     */   
/*     */   public bzb c(blc ☃, axk axk1, el el1) {
/*  55 */     if (☃.c(a) == blz.b) {
/*  56 */       return this.o.e();
/*     */     }
/*  58 */     return bzb.e;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃, axy axy1, el el1, aog aog1, adk adk1, eq eq1, float f1, float f2, float f3) {
/*  63 */     if (axy1.B) {
/*  64 */       return true;
/*     */     }
/*     */     
/*  67 */     if (☃.c(a) != blz.a) {
/*     */       
/*  69 */       el1 = el1.a((eq)☃.c(D));
/*  70 */       ☃ = axy1.a_(el1);
/*  71 */       if (☃.c() != this) {
/*  72 */         return true;
/*     */       }
/*     */     } 
/*     */     
/*  76 */     if (!axy1.t.p() || axy1.d(el1) == ayz.j) {
/*     */       
/*  78 */       axy1.g(el1);
/*     */ 
/*     */       
/*  81 */       el el2 = el1.a(((eq)☃.c(D)).d());
/*  82 */       if (axy1.a_(el2).c() == this) {
/*  83 */         axy1.g(el2);
/*     */       }
/*     */       
/*  86 */       axy1.a((aer)null, aea.a(), el1.o() + 0.5D, el1.p() + 0.5D, el1.q() + 0.5D, 5.0F, true, true);
/*  87 */       return true;
/*     */     } 
/*     */     
/*  90 */     if (((Boolean)☃.c(b)).booleanValue()) {
/*  91 */       aog aog2 = a(axy1, el1);
/*  92 */       if (aog2 == null) {
/*  93 */         ☃ = ☃.a(b, Boolean.valueOf(false));
/*  94 */         axy1.a(el1, ☃, 4);
/*     */       } else {
/*  96 */         aog1.a(new ir("block.minecraft.bed.occupied", new Object[0]), true);
/*  97 */         return true;
/*     */       } 
/*     */     } 
/*     */     
/* 101 */     aog.a a = aog1.a(el1);
/* 102 */     if (a == aog.a.a) {
/* 103 */       ☃ = ☃.a(b, Boolean.valueOf(true));
/* 104 */       axy1.a(el1, ☃, 4);
/* 105 */       return true;
/*     */     } 
/*     */     
/* 108 */     if (a == aog.a.c) {
/* 109 */       aog1.a(new ir("block.minecraft.bed.no_sleep", new Object[0]), true);
/* 110 */     } else if (a == aog.a.f) {
/* 111 */       aog1.a(new ir("block.minecraft.bed.not_safe", new Object[0]), true);
/* 112 */     } else if (a == aog.a.d) {
/* 113 */       aog1.a(new ir("block.minecraft.bed.too_far_away", new Object[0]), true);
/*     */     } 
/* 115 */     return true;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private aog a(axy ☃, el el1) {
/* 120 */     for (aog aog : ☃.j) {
/* 121 */       if (aog.cL() && aog.bR.equals(el1)) {
/* 122 */         return aog;
/*     */       }
/*     */     } 
/*     */     
/* 126 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃) {
/* 131 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(axy ☃, el el1, aer aer1, float f) {
/* 136 */     super.a(☃, el1, aer1, f * 0.5F);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(axk ☃, aer aer1) {
/* 141 */     if (aer1.aZ()) {
/* 142 */       super.a(☃, aer1);
/*     */     }
/* 144 */     else if (aer1.u < 0.0D) {
/* 145 */       aer1.u = -aer1.u * 0.6600000262260437D;
/*     */ 
/*     */       
/* 148 */       if (!(aer1 instanceof afa)) {
/* 149 */         aer1.u *= 0.8D;
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public blc a(blc ☃, eq eq1, blc blc1, axz axz1, el el1, el el2) {
/* 157 */     if (eq1 == a((blz)☃.c(a), (eq)☃.c(D))) {
/* 158 */       if (blc1.c() == this && blc1.c(a) != ☃.c(a)) {
/* 159 */         return ☃.a(b, blc1.c(b));
/*     */       }
/* 161 */       return bct.a.p();
/*     */     } 
/*     */ 
/*     */     
/* 165 */     return super.a(☃, eq1, blc1, axz1, el1, el2);
/*     */   }
/*     */   
/*     */   private static eq a(blz ☃, eq eq1) {
/* 169 */     return (☃ == blz.b) ? eq1 : eq1.d();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(axy ☃, aog aog1, el el1, blc blc1, @Nullable bji bji1, ate ate1) {
/* 175 */     super.a(☃, aog1, el1, bct.a.p(), bji1, ate1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(blc ☃, axy axy1, el el1, blc blc1, boolean bool) {
/* 180 */     if (☃.c() == blc1.c()) {
/*     */       return;
/*     */     }
/* 183 */     super.a(☃, axy1, el1, blc1, bool);
/* 184 */     axy1.n(el1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(axy ☃, el el1, blc blc1, aog aog1) {
/* 189 */     blz blz = (blz)blc1.c(a);
/* 190 */     boolean bool = (blz == blz.a);
/*     */     
/* 192 */     el el2 = el1.a(a(blz, (eq)blc1.c(D)));
/* 193 */     blc blc2 = ☃.a_(el2);
/*     */     
/* 195 */     if (blc2.c() == this && blc2.c(a) != blz) {
/*     */       
/* 197 */       ☃.a(el2, bct.a.p(), 35);
/* 198 */       ☃.a(aog1, 2001, el2, bcs.l(blc2));
/*     */ 
/*     */       
/* 201 */       if (!☃.B && !aog1.u()) {
/* 202 */         if (bool) {
/* 203 */           blc1.a(☃, el1, 0);
/*     */         } else {
/* 205 */           blc2.a(☃, el2, 0);
/*     */         } 
/*     */       }
/*     */       
/* 209 */       aog1.b(ws.a.b(this));
/*     */     } 
/*     */     
/* 212 */     super.a(☃, el1, blc1, aog1);
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public blc a(ark ☃) {
/* 218 */     eq eq = ☃.f();
/*     */     
/* 220 */     el el1 = ☃.a();
/* 221 */     el el2 = el1.a(eq);
/* 222 */     if (☃.k().a_(el2).a(☃)) {
/* 223 */       return p().a(D, eq);
/*     */     }
/*     */     
/* 226 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public axx a(blc ☃, axy axy1, el el1, int i) {
/* 231 */     if (☃.c(a) == blz.b) {
/* 232 */       return atf.a;
/*     */     }
/*     */     
/* 235 */     return super.a(☃, axy1, el1, i);
/*     */   }
/*     */ 
/*     */   
/*     */   public cew a(blc ☃, axk axk1, el el1) {
/* 240 */     return c;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public static el a(axk ☃, el el1, int i) {
/* 250 */     eq eq = (eq)☃.a_(el1).c(D);
/*     */ 
/*     */     
/* 253 */     int j = el1.o();
/* 254 */     int k = el1.p();
/* 255 */     int m = el1.q();
/*     */ 
/*     */     
/* 258 */     for (int n = 0; n <= 1; n++) {
/* 259 */       int i1 = j - eq.g() * n - 1;
/* 260 */       int i2 = m - eq.i() * n - 1;
/* 261 */       int i3 = i1 + 2;
/* 262 */       int i4 = i2 + 2;
/*     */       
/* 264 */       for (int i5 = i1; i5 <= i3; i5++) {
/* 265 */         for (int i6 = i2; i6 <= i4; i6++) {
/* 266 */           el el2 = new el(i5, k, i6);
/* 267 */           if (a(☃, el2)) {
/* 268 */             if (i > 0) {
/* 269 */               i--;
/*     */             } else {
/*     */               
/* 272 */               return el2;
/*     */             } 
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/* 278 */     return null;
/*     */   }
/*     */   
/*     */   protected static boolean a(axk ☃, el el1) {
/* 282 */     return (☃.a_(el1.b()).q() && 
/* 283 */       !☃.a_(el1).d().b() && 
/* 284 */       !☃.a_(el1.a()).d().b());
/*     */   }
/*     */ 
/*     */   
/*     */   public bzc j(blc ☃) {
/* 289 */     return bzc.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public axl c() {
/* 294 */     return axl.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public bgy c(blc ☃) {
/* 299 */     return bgy.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public blb a(axk ☃, blc blc1, el el1, eq eq1) {
/* 304 */     return blb.i;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(ble.a<bcs, blc> ☃) {
/* 309 */     ☃.a((bmm<?>[])new bmm[] { D, a, b });
/*     */   }
/*     */ 
/*     */   
/*     */   public bji a(axk ☃) {
/* 314 */     return new bjh(this.o);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(axy ☃, el el1, blc blc1, @Nullable afa afa1, ate ate1) {
/* 319 */     super.a(☃, el1, blc1, afa1, ate1);
/*     */ 
/*     */     
/* 322 */     if (!☃.B) {
/* 323 */       el el2 = el1.a((eq)blc1.c(D));
/* 324 */       ☃.a(el2, blc1.a(a, blz.a), 3);
/*     */       
/* 326 */       ☃.a(el1, bct.a);
/* 327 */       blc1.a(☃, el1, 3);
/*     */     } 
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
/*     */   public boolean a(blc ☃, axk axk1, el el1, cbf cbf1) {
/* 343 */     return false;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bcq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */