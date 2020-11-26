/*     */ import java.util.Random;
/*     */ import java.util.function.Predicate;
/*     */ import javax.annotation.Nullable;
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
/*     */ public class ti
/*     */   implements axz
/*     */ {
/*  48 */   private static final Logger a = LogManager.getLogger();
/*     */   
/*     */   private final bnr[] b;
/*     */   
/*     */   private final int c;
/*     */   
/*     */   private final int d;
/*     */   
/*     */   private final int e;
/*     */   private final int f;
/*     */   private final axy g;
/*     */   private final long h;
/*     */   
/*     */   public ti(bnr[] ☃, int i, int j, int k, int m, axy axy1) {
/*  62 */     this.n = new tj<>(☃ -> y(☃).k());
/*  63 */     this.o = new tj<>(☃ -> y(☃).l());
/*     */ 
/*     */     
/*  66 */     this.b = ☃;
/*  67 */     this.c = k;
/*  68 */     this.d = m;
/*  69 */     this.e = i;
/*  70 */     this.f = j;
/*  71 */     this.g = axy1;
/*  72 */     this.h = axy1.r_();
/*  73 */     this.m = (bom)axy1.H().f().a();
/*  74 */     this.i = axy1.k();
/*  75 */     this.j = axy1.g();
/*  76 */     this.k = axy1.m();
/*  77 */     this.l = axy1.o();
/*     */   }
/*     */   private final int i; private final ccb j; private final Random k; private final boc l; private final bom m; private final ayo<bcs> n; private final ayo<byv> o;
/*     */   public int a() {
/*  81 */     return this.c;
/*     */   }
/*     */   
/*     */   public int b() {
/*  85 */     return this.d;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(int ☃, int i) {
/*  90 */     bmx bmx1 = this.b[0];
/*  91 */     bmx bmx2 = this.b[this.b.length - 1];
/*     */     
/*  93 */     return (☃ >= (bmx1.d()).a && ☃ <= (bmx2.d()).a && i >= (bmx1.d()).b && i <= (bmx2.d()).b);
/*     */   }
/*     */ 
/*     */   
/*     */   public bmx b(int ☃, int i) {
/*  98 */     if (a(☃, i)) {
/*  99 */       int j = ☃ - (this.b[0].d()).a;
/* 100 */       int k = i - (this.b[0].d()).b;
/* 101 */       return this.b[j + k * this.e];
/*     */     } 
/* 103 */     bmx bmx1 = this.b[0];
/* 104 */     bmx bmx2 = this.b[this.b.length - 1];
/*     */     
/* 106 */     a.error("Requested chunk : {} {}", Integer.valueOf(☃), Integer.valueOf(i));
/* 107 */     a.error("Region bounds : {} {} | {} {}", Integer.valueOf((bmx1.d()).a), Integer.valueOf((bmx1.d()).b), Integer.valueOf((bmx2.d()).a), Integer.valueOf((bmx2.d()).b));
/* 108 */     throw new RuntimeException(String.format("We are asking a region for a chunk out of bound | %s %s", new Object[] { Integer.valueOf(☃), Integer.valueOf(i) }));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public blc a_(el ☃) {
/* 114 */     return y(☃).a_(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public byw b(el ☃) {
/* 119 */     return y(☃).b(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public aog a(double ☃, double d1, double d2, double d3, Predicate<aer> predicate) {
/* 125 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public int c() {
/* 130 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c(el ☃) {
/* 135 */     return a_(☃).f();
/*     */   }
/*     */ 
/*     */   
/*     */   public ayu d(el ☃) {
/* 140 */     ayu ayu = y(☃).g()[☃.o() & 0xF | (☃.q() & 0xF) << 4];
/* 141 */     if (ayu == null) {
/* 142 */       throw new RuntimeException(String.format("Biome is null @ %s", new Object[] { ☃ }));
/*     */     }
/*     */     
/* 145 */     return ayu;
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(ayi ☃, el el1) {
/* 150 */     bmx bmx = y(el1);
/* 151 */     return bmx.a(☃, el1, o().g());
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(el ☃, int i) {
/* 156 */     return y(☃).a(☃, i, o().g());
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(int ☃, int i, boolean bool) {
/* 161 */     return a(☃, i);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(el ☃, boolean bool) {
/* 166 */     blc blc = a_(☃);
/* 167 */     if (blc.f()) {
/* 168 */       return false;
/*     */     }
/*     */     
/* 171 */     if (bool) {
/* 172 */       blc.a(this.g, ☃, 0);
/*     */     }
/* 174 */     return a(☃, bct.a.p(), 3);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean e(el ☃) {
/* 179 */     return y(☃).c(☃);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public bji f(el ☃) {
/* 186 */     bmx bmx = y(☃);
/* 187 */     bji bji = bmx.f(☃);
/*     */     
/* 189 */     if (bji != null) {
/* 190 */       return bji;
/*     */     }
/*     */     
/* 193 */     gy gy = bmx.g(☃);
/* 194 */     if (gy != null) {
/* 195 */       if ("DUMMY".equals(gy.l("id"))) {
/* 196 */         bji = ((ben)a_(☃).c()).a(this.g);
/*     */       } else {
/* 198 */         bji = bji.c(gy);
/*     */       } 
/*     */       
/* 201 */       if (bji != null) {
/* 202 */         bmx.a(☃, bji);
/* 203 */         return bji;
/*     */       } 
/*     */     } 
/*     */     
/* 207 */     if (bmx.a_(☃).c() instanceof ben) {
/* 208 */       a.warn("Tried to access a block entity before it was created. {}", ☃);
/*     */     }
/*     */     
/* 211 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(el ☃, blc blc1, int i) {
/* 216 */     bmx bmx = y(☃);
/* 217 */     blc blc2 = bmx.a(☃, blc1, false);
/*     */     
/* 219 */     bcs bcs = blc1.c();
/*     */ 
/*     */     
/* 222 */     if (bcs.i()) {
/* 223 */       if (bmx.i().d() == bnd.a.b) {
/* 224 */         bmx.a(☃, ((ben)bcs).a(this));
/*     */       } else {
/* 226 */         gy gy = new gy();
/* 227 */         gy.b("x", ☃.o());
/* 228 */         gy.b("y", ☃.p());
/* 229 */         gy.b("z", ☃.q());
/* 230 */         gy.a("id", "DUMMY");
/* 231 */         bmx.a(gy);
/*     */       } 
/* 233 */     } else if (blc2 != null && blc2.c().i()) {
/* 234 */       bmx.d(☃);
/*     */     } 
/*     */     
/* 237 */     if (blc1.l(this, ☃)) {
/* 238 */       i(☃);
/*     */     }
/*     */     
/* 241 */     return true;
/*     */   }
/*     */   
/*     */   private void i(el ☃) {
/* 245 */     y(☃).e(☃);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(aer ☃) {
/* 253 */     int i = xq.c(☃.q / 16.0D);
/* 254 */     int j = xq.c(☃.s / 16.0D);
/*     */     
/* 256 */     b(i, j).a(☃);
/* 257 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean g(el ☃) {
/* 262 */     return a(☃, bct.a.p(), 3);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ayi ☃, el el1, int i) {
/* 267 */     y(el1).a(☃, this.l.g(), el1, i);
/*     */   }
/*     */ 
/*     */   
/*     */   public bmv d() {
/* 272 */     return this.g.d();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(@Nullable aer ☃, cew cew1) {
/* 277 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(el ☃, eq eq1) {
/* 282 */     return a_(☃).b(this, ☃, eq1);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean e() {
/* 287 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   public axy f() {
/* 293 */     return this.g;
/*     */   }
/*     */ 
/*     */   
/*     */   public ccb g() {
/* 298 */     return this.j;
/*     */   }
/*     */ 
/*     */   
/*     */   public adj h(el ☃) {
/* 303 */     if (!a(☃.o() >> 4, ☃.q() >> 4)) {
/* 304 */       throw new RuntimeException("We are asking a region for a chunk out of bound");
/*     */     }
/*     */     
/* 307 */     return new adj(this.g.aj(), this.g.W(), 0L, this.g.ah());
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public cck h() {
/* 313 */     return this.g.h();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public bnc H() {
/* 324 */     return this.g.H();
/*     */   }
/*     */ 
/*     */   
/*     */   public ccc s_() {
/* 329 */     return this.g.s_();
/*     */   }
/*     */ 
/*     */   
/*     */   public long r_() {
/* 334 */     return this.h;
/*     */   }
/*     */ 
/*     */   
/*     */   public ayo<bcs> J() {
/* 339 */     return this.n;
/*     */   }
/*     */ 
/*     */   
/*     */   public ayo<byv> I() {
/* 344 */     return this.o;
/*     */   }
/*     */ 
/*     */   
/*     */   public int k() {
/* 349 */     return this.i;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Random m() {
/* 358 */     return this.k;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(el ☃, bcs bcs1) {}
/*     */ 
/*     */ 
/*     */   
/*     */   public int a(bor.a ☃, int i, int j) {
/* 368 */     return b(i >> 4, j >> 4).a(☃, i & 0xF, j & 0xF) + 1;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(@Nullable aog ☃, el el1, wi wi1, wk wk1, float f1, float f2) {}
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(fk ☃, double d1, double d2, double d3, double d4, double d5, double d6) {}
/*     */ 
/*     */   
/*     */   public el n() {
/* 381 */     return this.g.n();
/*     */   }
/*     */ 
/*     */   
/*     */   public boc o() {
/* 386 */     return this.l;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\ti.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */