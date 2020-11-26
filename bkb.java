/*     */ import java.util.List;
/*     */ import java.util.stream.IntStream;
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
/*     */ public class bkb
/*     */   extends bka
/*     */   implements adw, pt
/*     */ {
/*  44 */   private static final int[] a = IntStream.range(0, 27).toArray();
/*     */   
/*  46 */   private ez<ate> e = ez.a(27, ate.a);
/*     */   private boolean f;
/*     */   private int j;
/*  49 */   private a k = a.a;
/*     */   private float l;
/*     */   private float m;
/*     */   private asc n;
/*     */   private boolean o;
/*     */   private boolean p;
/*     */   
/*     */   public bkb(@Nullable asc ☃) {
/*  57 */     super(bjj.w);
/*  58 */     this.n = ☃;
/*     */   }
/*     */   
/*     */   public bkb() {
/*  62 */     this((asc)null);
/*  63 */     this.o = true;
/*     */   }
/*     */   
/*     */   public enum a {
/*  67 */     a,
/*  68 */     b,
/*  69 */     c,
/*  70 */     d;
/*     */   }
/*     */ 
/*     */   
/*     */   public void Y_() {
/*  75 */     p();
/*  76 */     if (this.k == a.b || this.k == a.d) {
/*  77 */       H();
/*     */     }
/*     */   }
/*     */   
/*     */   protected void p() {
/*  82 */     this.m = this.l;
/*  83 */     switch (null.a[this.k.ordinal()]) {
/*     */       case 1:
/*  85 */         this.l = 0.0F;
/*     */         break;
/*     */       case 2:
/*  88 */         this.l += 0.1F;
/*  89 */         if (this.l >= 1.0F) {
/*  90 */           H();
/*  91 */           this.k = a.c;
/*  92 */           this.l = 1.0F;
/*     */         } 
/*     */         break;
/*     */       case 3:
/*  96 */         this.l -= 0.1F;
/*  97 */         if (this.l <= 0.0F) {
/*  98 */           this.k = a.a;
/*  99 */           this.l = 0.0F;
/*     */         } 
/*     */         break;
/*     */       case 4:
/* 103 */         this.l = 1.0F;
/*     */         break;
/*     */     } 
/*     */   }
/*     */   
/*     */   public a r() {
/* 109 */     return this.k;
/*     */   }
/*     */   
/*     */   public cea a(blc ☃) {
/* 113 */     return b((eq)☃.c(bhi.a));
/*     */   }
/*     */   
/*     */   public cea b(eq ☃) {
/* 117 */     return cet.b().a().b((0.5F * 
/* 118 */         a(1.0F) * ☃.g()), (0.5F * 
/* 119 */         a(1.0F) * ☃.h()), (0.5F * 
/* 120 */         a(1.0F) * ☃.i()));
/*     */   }
/*     */ 
/*     */   
/*     */   private cea c(eq ☃) {
/* 125 */     eq eq1 = ☃.d();
/* 126 */     return b(☃).a(eq1
/* 127 */         .g(), eq1
/* 128 */         .h(), eq1
/* 129 */         .i());
/*     */   }
/*     */ 
/*     */   
/*     */   private void H() {
/* 134 */     blc ☃ = this.c_.a_(v());
/* 135 */     if (!(☃.c() instanceof bhi)) {
/*     */       return;
/*     */     }
/*     */     
/* 139 */     eq eq = (eq)☃.c(bhi.a);
/* 140 */     cea cea = c(eq).a(this.d_);
/*     */     
/* 142 */     List<aer> list = this.c_.a((aer)null, cea);
/* 143 */     if (list.isEmpty()) {
/*     */       return;
/*     */     }
/*     */     
/* 147 */     for (int i = 0; i < list.size(); i++) {
/* 148 */       aer aer = list.get(i);
/* 149 */       if (aer.A_() != bzc.d) {
/*     */ 
/*     */ 
/*     */         
/* 153 */         double d1 = 0.0D;
/* 154 */         double d2 = 0.0D;
/* 155 */         double d3 = 0.0D;
/* 156 */         cea cea1 = aer.bD();
/*     */         
/* 158 */         switch (null.b[eq.k().ordinal()]) {
/*     */           case 1:
/* 160 */             if (eq.c() == eq.b.a) {
/* 161 */               d1 = cea.d - cea1.a;
/*     */             } else {
/* 163 */               d1 = cea1.d - cea.a;
/*     */             } 
/* 165 */             d1 += 0.01D;
/*     */             break;
/*     */           case 2:
/* 168 */             if (eq.c() == eq.b.a) {
/* 169 */               d2 = cea.e - cea1.b;
/*     */             } else {
/* 171 */               d2 = cea1.e - cea.b;
/*     */             } 
/* 173 */             d2 += 0.01D;
/*     */             break;
/*     */           case 3:
/* 176 */             if (eq.c() == eq.b.a) {
/* 177 */               d3 = cea.f - cea1.c;
/*     */             } else {
/* 179 */               d3 = cea1.f - cea.c;
/*     */             } 
/* 181 */             d3 += 0.01D;
/*     */             break;
/*     */         } 
/*     */         
/* 185 */         aer.a(afe.d, d1 * eq.g(), d2 * eq.h(), d3 * eq.i());
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public int T_() {
/* 191 */     return this.e.size();
/*     */   }
/*     */ 
/*     */   
/*     */   public int f() {
/* 196 */     return 64;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c(int ☃, int i) {
/* 201 */     if (☃ == 1) {
/* 202 */       this.j = i;
/* 203 */       if (i == 0) {
/* 204 */         this.k = a.d;
/*     */       }
/* 206 */       if (i == 1) {
/* 207 */         this.k = a.b;
/*     */       }
/* 209 */       return true;
/*     */     } 
/*     */     
/* 212 */     return super.c(☃, i);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(aog ☃) {
/* 217 */     if (!☃.t()) {
/* 218 */       if (this.j < 0) {
/* 219 */         this.j = 0;
/*     */       }
/* 221 */       this.j++;
/* 222 */       this.c_.a(this.d_, w().c(), 1, this.j);
/* 223 */       if (this.j == 1) {
/* 224 */         this.c_.a((aog)null, this.d_, wj.if, wk.e, 0.5F, this.c_.s.nextFloat() * 0.1F + 0.9F);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void c(aog ☃) {
/* 231 */     if (!☃.t()) {
/* 232 */       this.j--;
/* 233 */       this.c_.a(this.d_, w().c(), 1, this.j);
/* 234 */       if (this.j <= 0) {
/* 235 */         this.c_.a((aog)null, this.d_, wj.ie, wk.e, 0.5F, this.c_.s.nextFloat() * 0.1F + 0.9F);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public apv a(aof ☃, aog aog1) {
/* 242 */     return new aqv(☃, this, aog1);
/*     */   }
/*     */ 
/*     */   
/*     */   public String l() {
/* 247 */     return "minecraft:shulker_box";
/*     */   }
/*     */ 
/*     */   
/*     */   public ij N_() {
/* 252 */     ij ☃ = e();
/* 253 */     if (☃ != null) {
/* 254 */       return ☃;
/*     */     }
/* 256 */     return new ir("container.shulkerBox", new Object[0]);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(gy ☃) {
/* 262 */     super.b(☃);
/* 263 */     f(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public gy a(gy ☃) {
/* 268 */     super.a(☃);
/* 269 */     return g(☃);
/*     */   }
/*     */   
/*     */   public void f(gy ☃) {
/* 273 */     this.e = ez.a(T_(), ate.a);
/* 274 */     if (!d(☃) && 
/* 275 */       ☃.c("Items", 9)) {
/* 276 */       adf.b(☃, this.e);
/*     */     }
/*     */ 
/*     */     
/* 280 */     if (☃.c("CustomName", 8)) {
/* 281 */       this.i = ij.a.a(☃.l("CustomName"));
/*     */     }
/*     */   }
/*     */   
/*     */   public gy g(gy ☃) {
/* 286 */     if (!e(☃)) {
/* 287 */       adf.a(☃, this.e, false);
/*     */     }
/*     */     
/* 290 */     ij ij = e();
/* 291 */     if (ij != null) {
/* 292 */       ☃.a("CustomName", ij.a.a(ij));
/*     */     }
/*     */     
/* 295 */     if (!☃.e("Lock") && V_()) {
/* 296 */       j().a(☃);
/*     */     }
/*     */     
/* 299 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   protected ez<ate> q() {
/* 304 */     return this.e;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(ez<ate> ☃) {
/* 309 */     this.e = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean P_() {
/* 314 */     for (ate ☃ : this.e) {
/* 315 */       if (!☃.a()) {
/* 316 */         return false;
/*     */       }
/*     */     } 
/* 319 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int[] a(eq ☃) {
/* 324 */     return a;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(int ☃, ate ate1, @Nullable eq eq1) {
/* 329 */     return !(bcs.a(ate1.b()) instanceof bhi);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(int ☃, ate ate1, eq eq1) {
/* 334 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void m() {
/* 343 */     this.f = true;
/* 344 */     super.m();
/*     */   }
/*     */   
/*     */   public boolean s() {
/* 348 */     return this.f;
/*     */   }
/*     */   
/*     */   public float a(float ☃) {
/* 352 */     return this.m + (this.l - this.m) * ☃;
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
/*     */   @Nullable
/*     */   public ji Z_() {
/* 366 */     return new ji(this.d_, 10, aa_());
/*     */   }
/*     */   
/*     */   public boolean E() {
/* 370 */     return this.p;
/*     */   }
/*     */   
/*     */   public void a(boolean ☃) {
/* 374 */     this.p = ☃;
/*     */   }
/*     */   
/*     */   public boolean G() {
/* 378 */     return (!E() || !P_() || O_() || this.g != null);
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bkb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */