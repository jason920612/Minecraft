/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.Arrays;
/*     */ import java.util.List;
/*     */ import java.util.Set;
/*     */ import java.util.stream.Collectors;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bjg
/*     */   extends bjz
/*     */   implements adw, pt
/*     */ {
/*  50 */   public static final aej[][] a = new aej[][] { { aem.a, aem.c }, { aem.k, aem.h }, { aem.e }, { aem.j } };
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  55 */   private static final Set<aej> e = (Set<aej>)Arrays.<aej[]>stream(a).flatMap(Arrays::stream).collect(Collectors.toSet());
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  62 */   private final List<a> f = Lists.newArrayList();
/*     */ 
/*     */   
/*     */   private boolean i;
/*     */   
/*     */   private boolean j;
/*     */   
/*  69 */   private int k = -1;
/*     */   
/*     */   @Nullable
/*     */   private aej l;
/*     */   
/*     */   @Nullable
/*     */   private aej m;
/*  76 */   private ate n = ate.a;
/*     */   private ij o;
/*     */   
/*     */   public bjg() {
/*  80 */     super(bjj.n);
/*     */   }
/*     */ 
/*     */   
/*     */   public void Y_() {
/*  85 */     if (this.c_.V() % 80L == 0L) {
/*  86 */       p();
/*  87 */       if (this.i) {
/*  88 */         a(wj.L);
/*     */       }
/*     */     } 
/*     */     
/*  92 */     if (!this.c_.B && this.i != this.j) {
/*  93 */       this.j = this.i;
/*  94 */       a(this.i ? wj.K : wj.M);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void p() {
/*  99 */     if (this.c_ != null) {
/* 100 */       E();
/* 101 */       D();
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(wi ☃) {
/* 106 */     this.c_.a((aog)null, this.d_, ☃, wk.e, 1.0F, 1.0F);
/*     */   }
/*     */   
/*     */   private void D() {
/* 110 */     if (this.i && this.k > 0 && !this.c_.B && this.l != null) {
/* 111 */       double ☃ = (this.k * 10 + 10);
/* 112 */       int i = 0;
/* 113 */       if (this.k >= 4 && this.l == this.m) {
/* 114 */         i = 1;
/*     */       }
/* 116 */       int j = (9 + this.k * 2) * 20;
/*     */       
/* 118 */       int k = this.d_.o();
/* 119 */       int m = this.d_.p();
/* 120 */       int n = this.d_.q();
/* 121 */       cea cea = (new cea(k, m, n, (k + 1), (m + 1), (n + 1))).g(☃).b(0.0D, this.c_.aa(), 0.0D);
/* 122 */       List<aog> list = this.c_.a(aog.class, cea);
/* 123 */       for (aog aog : list) {
/* 124 */         aog.c(new aek(this.l, j, i, true, true));
/*     */       }
/*     */       
/* 127 */       if (this.k >= 4 && this.l != this.m && this.m != null) {
/* 128 */         for (aog aog : list) {
/* 129 */           aog.c(new aek(this.m, j, 0, true, true));
/*     */         }
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   private void E() {
/* 136 */     int ☃ = this.d_.o();
/* 137 */     int i = this.d_.p();
/* 138 */     int j = this.d_.q();
/*     */     
/* 140 */     int k = this.k;
/* 141 */     this.k = 0;
/* 142 */     this.f.clear();
/* 143 */     this.i = true;
/*     */     
/* 145 */     a a = new a(asc.a.d());
/* 146 */     this.f.add(a);
/* 147 */     boolean bool = true;
/*     */     
/* 149 */     el.a a1 = new el.a();
/* 150 */     int m = i + 1; while (true) { if (m < 256)
/* 151 */       { float[] arrayOfFloat; blc blc = this.c_.a_(a1.c(☃, m, j));
/*     */         
/* 153 */         bcs bcs = blc.c();
/* 154 */         if (bcs instanceof bhv)
/* 155 */         { arrayOfFloat = ((bhv)bcs).d().d(); }
/* 156 */         else if (bcs instanceof bhw)
/* 157 */         { arrayOfFloat = ((bhw)bcs).d().d(); }
/* 158 */         else { if (blc.b(this.c_, a1) < 15 || bcs == bct.z) {
/* 159 */             a.a();
/*     */           } else {
/*     */             
/* 162 */             this.i = false;
/* 163 */             this.f.clear(); break;
/*     */           } 
/*     */           m++; }
/*     */         
/* 167 */         if (!bool)
/*     */         {
/*     */ 
/*     */           
/* 171 */           arrayOfFloat = new float[] { (a.b()[0] + arrayOfFloat[0]) / 2.0F, (a.b()[1] + arrayOfFloat[1]) / 2.0F, (a.b()[2] + arrayOfFloat[2]) / 2.0F };
/*     */         }
/*     */ 
/*     */         
/* 175 */         if (Arrays.equals(arrayOfFloat, a.b())) {
/* 176 */           a.a();
/*     */         } else {
/* 178 */           a = new a(arrayOfFloat);
/* 179 */           this.f.add(a);
/*     */         } 
/* 181 */         bool = false; }
/*     */       else { break; }
/*     */        m++; }
/* 184 */      if (this.i) {
/* 185 */       for (m = 1; m <= 4; ) {
/* 186 */         int n = i - m;
/* 187 */         if (n < 0) {
/*     */           break;
/*     */         }
/*     */         
/* 191 */         boolean bool1 = true;
/* 192 */         for (int i1 = ☃ - m; i1 <= ☃ + m && bool1; i1++) {
/* 193 */           for (int i2 = j - m; i2 <= j + m; i2++) {
/* 194 */             bcs bcs = this.c_.a_(new el(i1, n, i2)).c();
/* 195 */             if (bcs != bct.ep && bcs != bct.bB && bcs != bct.cn && bcs != bct.bC) {
/* 196 */               bool1 = false;
/*     */               
/*     */               break;
/*     */             } 
/*     */           } 
/*     */         } 
/* 202 */         if (bool1) {
/* 203 */           this.k = m;
/*     */           
/*     */           m++;
/*     */         } 
/*     */       } 
/*     */       
/* 209 */       if (this.k == 0) {
/* 210 */         this.i = false;
/*     */       }
/*     */     } 
/*     */     
/* 214 */     if (!this.c_.B && k < this.k) {
/* 215 */       for (tf tf : this.c_.<tf>a(tf.class, (new cea(☃, i, j, ☃, (i - 4), j)).c(10.0D, 5.0D, 10.0D))) {
/* 216 */         p.l.a(tf, this);
/*     */       }
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
/*     */   public int s() {
/* 247 */     return this.k;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public ji Z_() {
/* 257 */     return new ji(this.d_, 3, aa_());
/*     */   }
/*     */ 
/*     */   
/*     */   public gy aa_() {
/* 262 */     return a(new gy());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   private static aej e(int ☃) {
/* 272 */     aej aej1 = aej.a(☃);
/*     */     
/* 274 */     return e.contains(aej1) ? aej1 : null;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(gy ☃) {
/* 279 */     super.b(☃);
/*     */     
/* 281 */     this.l = e(☃.h("Primary"));
/* 282 */     this.m = e(☃.h("Secondary"));
/* 283 */     this.k = ☃.h("Levels");
/*     */   }
/*     */ 
/*     */   
/*     */   public gy a(gy ☃) {
/* 288 */     super.a(☃);
/*     */     
/* 290 */     ☃.b("Primary", aej.a(this.l));
/* 291 */     ☃.b("Secondary", aej.a(this.m));
/*     */     
/* 293 */     ☃.b("Levels", this.k);
/*     */     
/* 295 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public int T_() {
/* 300 */     return 1;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean P_() {
/* 305 */     return this.n.a();
/*     */   }
/*     */ 
/*     */   
/*     */   public ate a(int ☃) {
/* 310 */     if (☃ == 0) {
/* 311 */       return this.n;
/*     */     }
/* 313 */     return ate.a;
/*     */   }
/*     */ 
/*     */   
/*     */   public ate a(int ☃, int i) {
/* 318 */     if (☃ == 0 && !this.n.a()) {
/* 319 */       if (i >= this.n.C()) {
/* 320 */         ate ate1 = this.n;
/* 321 */         this.n = ate.a;
/* 322 */         return ate1;
/*     */       } 
/* 324 */       return this.n.a(i);
/*     */     } 
/*     */     
/* 327 */     return ate.a;
/*     */   }
/*     */ 
/*     */   
/*     */   public ate b(int ☃) {
/* 332 */     if (☃ == 0) {
/* 333 */       ate ate1 = this.n;
/* 334 */       this.n = ate.a;
/* 335 */       return ate1;
/*     */     } 
/* 337 */     return ate.a;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(int ☃, ate ate1) {
/* 342 */     if (☃ == 0) {
/* 343 */       this.n = ate1;
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public ij N_() {
/* 349 */     if (this.o != null) {
/* 350 */       return this.o;
/*     */     }
/* 352 */     return new ir("container.beacon", new Object[0]);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean O_() {
/* 357 */     return (this.o != null);
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public ij e() {
/* 363 */     return this.o;
/*     */   }
/*     */   
/*     */   public void a(@Nullable ij ☃) {
/* 367 */     this.o = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public int f() {
/* 372 */     return 1;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(aog ☃) {
/* 377 */     if (this.c_.f(this.d_) != this) {
/* 378 */       return false;
/*     */     }
/* 380 */     if (☃.d(this.d_.o() + 0.5D, this.d_.p() + 0.5D, this.d_.q() + 0.5D) > 64.0D) {
/* 381 */       return false;
/*     */     }
/* 383 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(aog ☃) {}
/*     */ 
/*     */ 
/*     */   
/*     */   public void c(aog ☃) {}
/*     */ 
/*     */   
/*     */   public boolean b(int ☃, ate ate1) {
/* 396 */     return (ate1.b() == atf.dA || ate1.b() == atf.m || ate1.b() == atf.o || ate1.b() == atf.n);
/*     */   }
/*     */ 
/*     */   
/*     */   public String l() {
/* 401 */     return "minecraft:beacon";
/*     */   }
/*     */ 
/*     */   
/*     */   public apv a(aof ☃, aog aog1) {
/* 406 */     return new apx(☃, this);
/*     */   }
/*     */ 
/*     */   
/*     */   public int c(int ☃) {
/* 411 */     switch (☃) {
/*     */       case 0:
/* 413 */         return this.k;
/*     */       case 1:
/* 415 */         return aej.a(this.l);
/*     */       case 2:
/* 417 */         return aej.a(this.m);
/*     */     } 
/* 419 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(int ☃, int i) {
/* 424 */     switch (☃) {
/*     */       case 0:
/* 426 */         this.k = i;
/*     */         break;
/*     */       case 1:
/* 429 */         this.l = e(i);
/*     */         break;
/*     */       case 2:
/* 432 */         this.m = e(i);
/*     */         break;
/*     */     } 
/*     */     
/* 436 */     if (!this.c_.B && ☃ == 1 && this.i) {
/* 437 */       a(wj.N);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public int h() {
/* 443 */     return 3;
/*     */   }
/*     */ 
/*     */   
/*     */   public void m() {
/* 448 */     this.n = ate.a;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c(int ☃, int i) {
/* 453 */     if (☃ == 1) {
/* 454 */       p();
/* 455 */       return true;
/*     */     } 
/*     */     
/* 458 */     return super.c(☃, i);
/*     */   }
/*     */ 
/*     */   
/*     */   public int[] a(eq ☃) {
/* 463 */     return new int[0];
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(int ☃, ate ate1, @Nullable eq eq1) {
/* 468 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(int ☃, ate ate1, eq eq1) {
/* 473 */     return false;
/*     */   }
/*     */   
/*     */   public static class a {
/*     */     private final float[] a;
/*     */     private int b;
/*     */     
/*     */     public a(float[] ☃) {
/* 481 */       this.a = ☃;
/* 482 */       this.b = 1;
/*     */     }
/*     */     
/*     */     protected void a() {
/* 486 */       this.b++;
/*     */     }
/*     */     
/*     */     public float[] b() {
/* 490 */       return this.a;
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bjg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */