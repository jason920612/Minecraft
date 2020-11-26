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
/*     */ public class akj
/*     */   extends ajp
/*     */ {
/*  26 */   private static final or<Integer> b = ou.a((Class)akj.class, ot.b);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  32 */   private static final pc[] c = new pc[] { new pc("textures/entity/fish/tropical_a.png"), new pc("textures/entity/fish/tropical_b.png") };
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  37 */   private static final pc[] bC = new pc[] { new pc("textures/entity/fish/tropical_a_pattern_1.png"), new pc("textures/entity/fish/tropical_a_pattern_2.png"), new pc("textures/entity/fish/tropical_a_pattern_3.png"), new pc("textures/entity/fish/tropical_a_pattern_4.png"), new pc("textures/entity/fish/tropical_a_pattern_5.png"), new pc("textures/entity/fish/tropical_a_pattern_6.png") };
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  46 */   private static final pc[] bD = new pc[] { new pc("textures/entity/fish/tropical_b_pattern_1.png"), new pc("textures/entity/fish/tropical_b_pattern_2.png"), new pc("textures/entity/fish/tropical_b_pattern_3.png"), new pc("textures/entity/fish/tropical_b_pattern_4.png"), new pc("textures/entity/fish/tropical_b_pattern_5.png"), new pc("textures/entity/fish/tropical_b_pattern_6.png") };
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
/*  58 */   public static final int[] a = new int[] { 
/*  59 */       a(a.h, asc.b, asc.h), 
/*  60 */       a(a.g, asc.h, asc.h), 
/*  61 */       a(a.g, asc.h, asc.l), 
/*  62 */       a(a.l, asc.a, asc.h), 
/*  63 */       a(a.b, asc.l, asc.h), 
/*  64 */       a(a.a, asc.b, asc.a), 
/*  65 */       a(a.f, asc.g, asc.d), 
/*  66 */       a(a.j, asc.k, asc.e), 
/*  67 */       a(a.l, asc.a, asc.o), 
/*  68 */       a(a.f, asc.a, asc.e), 
/*  69 */       a(a.i, asc.a, asc.h), 
/*  70 */       a(a.l, asc.a, asc.b), 
/*  71 */       a(a.d, asc.j, asc.g), 
/*  72 */       a(a.e, asc.f, asc.d), 
/*  73 */       a(a.k, asc.o, asc.a), 
/*  74 */       a(a.c, asc.h, asc.o), 
/*  75 */       a(a.j, asc.o, asc.a), 
/*  76 */       a(a.g, asc.a, asc.e), 
/*  77 */       a(a.a, asc.o, asc.a), 
/*  78 */       a(a.b, asc.h, asc.a), 
/*  79 */       a(a.d, asc.j, asc.e), 
/*  80 */       a(a.g, asc.e, asc.e) };
/*     */   
/*     */   enum a
/*     */   {
/*  84 */     a(0, 0),
/*  85 */     b(0, 1),
/*  86 */     c(0, 2),
/*  87 */     d(0, 3),
/*  88 */     e(0, 4),
/*  89 */     f(0, 5),
/*  90 */     g(1, 0),
/*  91 */     h(1, 1),
/*  92 */     i(1, 2),
/*  93 */     j(1, 3),
/*  94 */     k(1, 4),
/*  95 */     l(1, 5);
/*     */     
/*     */     private final int m;
/*     */     private final int n;
/*  99 */     private static final a[] o = values();
/*     */     
/*     */     a(int ☃, int i) {
/* 102 */       this.m = ☃;
/* 103 */       this.n = i;
/*     */     } static {
/*     */     
/*     */     } public int a() {
/* 107 */       return this.m;
/*     */     }
/*     */     
/*     */     public int b() {
/* 111 */       return this.n;
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
/*     */   private static int a(a ☃, asc asc1, asc asc2) {
/* 124 */     return ☃.a() & 0xFF | (☃.b() & 0xFF) << 8 | (asc1.a() & 0xFF) << 16 | (asc2.a() & 0xFF) << 24;
/*     */   }
/*     */   
/*     */   private boolean bE = true;
/*     */   
/*     */   public akj(axy ☃) {
/* 130 */     super(aev.au, ☃);
/* 131 */     a(0.5F, 0.4F);
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
/*     */   protected void x_() {
/* 154 */     super.x_();
/*     */     
/* 156 */     this.ab.a(b, Integer.valueOf(0));
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(gy ☃) {
/* 161 */     super.b(☃);
/*     */     
/* 163 */     ☃.b("Variant", dH());
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(gy ☃) {
/* 168 */     super.a(☃);
/*     */     
/* 170 */     r(☃.h("Variant"));
/*     */   }
/*     */   
/*     */   public void r(int ☃) {
/* 174 */     this.ab.b(b, Integer.valueOf(☃));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c(int ☃) {
/* 179 */     return !this.bE;
/*     */   }
/*     */   
/*     */   public int dH() {
/* 183 */     return ((Integer)this.ab.<Integer>a(b)).intValue();
/*     */   }
/*     */ 
/*     */   
/*     */   protected void f(ate ☃) {
/* 188 */     super.f(☃);
/*     */     
/* 190 */     gy gy = ☃.o();
/* 191 */     gy.b("BucketVariantTag", dH());
/*     */   }
/*     */ 
/*     */   
/*     */   protected ate l() {
/* 196 */     return new ate(atf.aO);
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   protected pc G() {
/* 202 */     return ccl.aL;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi D() {
/* 207 */     return wj.jT;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi cs() {
/* 212 */     return wj.jU;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi d(aea ☃) {
/* 217 */     return wj.jW;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi dz() {
/* 222 */     return wj.jV;
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
/*     */   @Nullable
/*     */   public afj a(adj ☃, @Nullable afj afj1, @Nullable gy gy1) {
/*     */     int i, j, k, m;
/* 268 */     afj1 = super.a(☃, afj1, gy1);
/*     */     
/* 270 */     if (gy1 != null && gy1.c("BucketVariantTag", 3)) {
/* 271 */       r(gy1.h("BucketVariantTag"));
/* 272 */       return afj1;
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 281 */     if (afj1 instanceof b) {
/* 282 */       b b = (b)afj1;
/* 283 */       i = b.a(b);
/* 284 */       j = b.b(b);
/* 285 */       k = b.c(b);
/* 286 */       m = b.d(b);
/* 287 */     } else if (this.T.nextFloat() < 0.9D) {
/*     */       
/* 289 */       int n = a[this.T.nextInt(a.length)];
/* 290 */       i = n & 0xFF;
/* 291 */       j = (n & 0xFF00) >> 8;
/* 292 */       k = (n & 0xFF0000) >> 16;
/* 293 */       m = (n & 0xFF000000) >> 24;
/* 294 */       afj1 = new b(this, i, j, k, m);
/*     */     } else {
/* 296 */       this.bE = false;
/* 297 */       i = this.T.nextInt(2);
/* 298 */       j = this.T.nextInt(6);
/* 299 */       k = this.T.nextInt(15);
/* 300 */       m = this.T.nextInt(15);
/*     */     } 
/*     */     
/* 303 */     r(i | j << 8 | k << 16 | m << 24);
/*     */     
/* 305 */     return afj1;
/*     */   }
/*     */   
/*     */   static class b extends ajp.a {
/*     */     private final int b;
/*     */     private final int c;
/*     */     private final int d;
/*     */     private final int e;
/*     */     
/*     */     private b(akj ☃, int i, int j, int k, int m) {
/* 315 */       super(☃);
/* 316 */       this.b = i;
/* 317 */       this.c = j;
/* 318 */       this.d = k;
/* 319 */       this.e = m;
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\akj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */