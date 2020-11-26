/*     */ import java.util.Arrays;
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
/*     */ public class bjk
/*     */   extends bjz
/*     */   implements adw, pt
/*     */ {
/*  36 */   private static final int[] a = new int[] { 3 };
/*     */ 
/*     */   
/*  39 */   private static final int[] e = new int[] { 0, 1, 2, 3 };
/*     */ 
/*     */   
/*  42 */   private static final int[] f = new int[] { 0, 1, 2, 4 };
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  52 */   private ez<ate> g = ez.a(5, ate.a);
/*     */   
/*     */   private int h;
/*     */   private boolean[] i;
/*     */   private ata j;
/*     */   private ij k;
/*     */   private int l;
/*     */   
/*     */   public bjk() {
/*  61 */     super(bjj.k);
/*     */   }
/*     */ 
/*     */   
/*     */   public ij N_() {
/*  66 */     if (this.k != null) {
/*  67 */       return this.k;
/*     */     }
/*  69 */     return new ir("container.brewing", new Object[0]);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean O_() {
/*  74 */     return (this.k != null);
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public ij e() {
/*  80 */     return this.k;
/*     */   }
/*     */   
/*     */   public void a(@Nullable ij ☃) {
/*  84 */     this.k = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public int T_() {
/*  89 */     return this.g.size();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean P_() {
/*  94 */     for (ate ☃ : this.g) {
/*  95 */       if (!☃.a()) {
/*  96 */         return false;
/*     */       }
/*     */     } 
/*  99 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void Y_() {
/* 104 */     ate ☃ = this.g.get(4);
/* 105 */     if (this.l <= 0 && ☃.b() == atf.cu) {
/* 106 */       this.l = 20;
/* 107 */       ☃.g(1);
/* 108 */       g();
/*     */     } 
/*     */     
/* 111 */     boolean bool1 = q();
/* 112 */     boolean bool2 = (this.h > 0);
/* 113 */     ate ate1 = this.g.get(3);
/* 114 */     if (bool2) {
/* 115 */       this.h--;
/*     */       
/* 117 */       boolean bool = (this.h == 0);
/* 118 */       if (bool && bool1) {
/*     */         
/* 120 */         r();
/* 121 */         g();
/* 122 */       } else if (!bool1) {
/* 123 */         this.h = 0;
/* 124 */         g();
/* 125 */       } else if (this.j != ate1.b()) {
/* 126 */         this.h = 0;
/* 127 */         g();
/*     */       } 
/* 129 */     } else if (bool1 && this.l > 0) {
/* 130 */       this.l--;
/* 131 */       this.h = 400;
/* 132 */       this.j = ate1.b();
/* 133 */       g();
/*     */     } 
/*     */     
/* 136 */     if (!this.c_.B) {
/* 137 */       boolean[] arrayOfBoolean = p();
/* 138 */       if (!Arrays.equals(arrayOfBoolean, this.i)) {
/* 139 */         this.i = arrayOfBoolean;
/* 140 */         blc blc = this.c_.a_(v());
/* 141 */         if (!(blc.c() instanceof bcx)) {
/*     */           return;
/*     */         }
/* 144 */         for (int i = 0; i < bcx.a.length; i++) {
/* 145 */           blc = blc.a(bcx.a[i], Boolean.valueOf(arrayOfBoolean[i]));
/*     */         }
/* 147 */         this.c_.a(this.d_, blc, 2);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean[] p() {
/* 154 */     boolean[] ☃ = new boolean[3];
/* 155 */     for (int i = 0; i < 3; i++) {
/* 156 */       if (!((ate)this.g.get(i)).a()) {
/* 157 */         ☃[i] = true;
/*     */       }
/*     */     } 
/* 160 */     return ☃;
/*     */   }
/*     */   
/*     */   private boolean q() {
/* 164 */     ate ☃ = this.g.get(3);
/* 165 */     if (☃.a()) {
/* 166 */       return false;
/*     */     }
/*     */     
/* 169 */     if (!auu.a(☃)) {
/* 170 */       return false;
/*     */     }
/*     */     
/* 173 */     for (int i = 0; i < 3; i++) {
/* 174 */       ate ate = this.g.get(i);
/* 175 */       if (!ate.a())
/*     */       {
/*     */ 
/*     */         
/* 179 */         if (auu.a(ate, ☃))
/* 180 */           return true; 
/*     */       }
/*     */     } 
/* 183 */     return false;
/*     */   }
/*     */   
/*     */   private void r() {
/* 187 */     ate ☃ = this.g.get(3);
/*     */     
/* 189 */     for (int i = 0; i < 3; i++) {
/* 190 */       this.g.set(i, auu.d(☃, this.g.get(i)));
/*     */     }
/*     */     
/* 193 */     ☃.g(1);
/* 194 */     el el = v();
/* 195 */     if (☃.b().p()) {
/* 196 */       ate ate = new ate(☃.b().o());
/* 197 */       if (☃.a()) {
/* 198 */         ☃ = ate;
/*     */       } else {
/* 200 */         adh.a(this.c_, el.o(), el.p(), el.q(), ate);
/*     */       } 
/*     */     } 
/*     */     
/* 204 */     this.g.set(3, ☃);
/*     */     
/* 206 */     this.c_.b(1035, el, 0);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(gy ☃) {
/* 211 */     super.b(☃);
/*     */     
/* 213 */     this.g = ez.a(T_(), ate.a);
/* 214 */     adf.b(☃, this.g);
/*     */     
/* 216 */     this.h = ☃.g("BrewTime");
/* 217 */     if (☃.c("CustomName", 8)) {
/* 218 */       this.k = ij.a.a(☃.l("CustomName"));
/*     */     }
/* 220 */     this.l = ☃.f("Fuel");
/*     */   }
/*     */ 
/*     */   
/*     */   public gy a(gy ☃) {
/* 225 */     super.a(☃);
/*     */     
/* 227 */     ☃.a("BrewTime", (short)this.h);
/* 228 */     adf.a(☃, this.g);
/*     */     
/* 230 */     if (this.k != null) {
/* 231 */       ☃.a("CustomName", ij.a.a(this.k));
/*     */     }
/* 233 */     ☃.a("Fuel", (byte)this.l);
/*     */     
/* 235 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public ate a(int ☃) {
/* 240 */     if (☃ >= 0 && ☃ < this.g.size()) {
/* 241 */       return this.g.get(☃);
/*     */     }
/* 243 */     return ate.a;
/*     */   }
/*     */ 
/*     */   
/*     */   public ate a(int ☃, int i) {
/* 248 */     return adf.a(this.g, ☃, i);
/*     */   }
/*     */ 
/*     */   
/*     */   public ate b(int ☃) {
/* 253 */     return adf.a(this.g, ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(int ☃, ate ate1) {
/* 258 */     if (☃ >= 0 && ☃ < this.g.size()) {
/* 259 */       this.g.set(☃, ate1);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int f() {
/* 266 */     return 64;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(aog ☃) {
/* 271 */     if (this.c_.f(this.d_) != this) {
/* 272 */       return false;
/*     */     }
/* 274 */     if (☃.d(this.d_.o() + 0.5D, this.d_.p() + 0.5D, this.d_.q() + 0.5D) > 64.0D) {
/* 275 */       return false;
/*     */     }
/* 277 */     return true;
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
/* 290 */     if (☃ == 3) {
/* 291 */       return auu.a(ate1);
/*     */     }
/*     */     
/* 294 */     ata ata1 = ate1.b();
/* 295 */     if (☃ == 4) {
/* 296 */       return (ata1 == atf.cu);
/*     */     }
/*     */     
/* 299 */     return ((ata1 == atf.cn || ata1 == atf.co || ata1 == atf.cp || ata1 == atf.cq) && a(☃).a());
/*     */   }
/*     */ 
/*     */   
/*     */   public int[] a(eq ☃) {
/* 304 */     if (☃ == eq.b) {
/* 305 */       return a;
/*     */     }
/* 307 */     if (☃ == eq.a) {
/* 308 */       return e;
/*     */     }
/* 310 */     return f;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(int ☃, ate ate1, @Nullable eq eq1) {
/* 315 */     return b(☃, ate1);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(int ☃, ate ate1, eq eq1) {
/* 320 */     if (☃ == 3) {
/* 321 */       return (ate1.b() == atf.cq);
/*     */     }
/* 323 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public String l() {
/* 328 */     return "minecraft:brewing_stand";
/*     */   }
/*     */ 
/*     */   
/*     */   public apv a(aof ☃, aog aog1) {
/* 333 */     return new apy(☃, this);
/*     */   }
/*     */ 
/*     */   
/*     */   public int c(int ☃) {
/* 338 */     switch (☃) {
/*     */       case 0:
/* 340 */         return this.h;
/*     */       case 1:
/* 342 */         return this.l;
/*     */     } 
/* 344 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(int ☃, int i) {
/* 349 */     switch (☃) {
/*     */       case 0:
/* 351 */         this.h = i;
/*     */         break;
/*     */       case 1:
/* 354 */         this.l = i;
/*     */         break;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public int h() {
/* 361 */     return 2;
/*     */   }
/*     */ 
/*     */   
/*     */   public void m() {
/* 366 */     this.g.clear();
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bjk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */