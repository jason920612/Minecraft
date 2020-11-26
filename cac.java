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
/*     */ public enum cac
/*     */   implements cao, cau
/*     */ {
/*  15 */   a; private static final int z; private static final int y; private static final int x; private static final int w; private static final int v; private static final int u; private static final int t; private static final int s; private static final int r; private static final int q; private static final int p; private static final int o;
/*     */   static {
/*  17 */     b = LogManager.getLogger();
/*     */     
/*  19 */     c = fc.m.a(ayz.C);
/*  20 */     d = fc.m.a(ayz.D);
/*  21 */     e = fc.m.a(ayz.d);
/*  22 */     f = fc.m.a(ayz.s);
/*  23 */     g = fc.m.a(ayz.e);
/*  24 */     h = fc.m.a(ayz.J);
/*  25 */     i = fc.m.a(ayz.f);
/*  26 */     j = fc.m.a(ayz.t);
/*  27 */     k = fc.m.a(ayz.n);
/*  28 */     l = fc.m.a(ayz.o);
/*  29 */     m = fc.m.a(ayz.w);
/*  30 */     n = fc.m.a(ayz.x);
/*  31 */     o = fc.m.a(ayz.M);
/*  32 */     p = fc.m.a(ayz.N);
/*  33 */     q = fc.m.a(ayz.c);
/*  34 */     r = fc.m.a(ayz.H);
/*  35 */     s = fc.m.a(ayz.I);
/*  36 */     t = fc.m.a(ayz.E);
/*  37 */     u = fc.m.a(ayz.K);
/*  38 */     v = fc.m.a(ayz.L);
/*  39 */     w = fc.m.a(ayz.g);
/*  40 */     x = fc.m.a(ayz.F);
/*  41 */     y = fc.m.a(ayz.G);
/*  42 */     z = fc.m.a(ayz.u);
/*     */   }
/*     */   private static final int n; private static final int m; private static final int l; private static final int k; private static final int j; private static final int i; private static final int h; private static final int g; private static final int f; private static final int e; private static final int d; private static final int c; private static final Logger b;
/*     */   public int a(bzl ☃, bzg bzg1, bzf bzf1, bzf bzf2, int i, int j) {
/*  46 */     int k = bzf1.a(i + 1, j + 1);
/*  47 */     int m = bzf2.a(i + 1, j + 1);
/*     */     
/*  49 */     if (k > 255) {
/*  50 */       b.debug("old! {}", Integer.valueOf(k));
/*     */     }
/*     */     
/*  53 */     int n = (m - 2) % 29;
/*  54 */     if (!bzy.b(k) && m >= 2 && n == 1) {
/*  55 */       ayu ayu = fc.m.a(k);
/*  56 */       if (ayu == null || !ayu.b()) {
/*  57 */         ayu ayu1 = ayu.a(ayu);
/*  58 */         return (ayu1 == null) ? k : fc.m.a(ayu1);
/*     */       } 
/*     */     } 
/*     */     
/*  62 */     if (☃.a(3) == 0 || n == 0) {
/*  63 */       int i1 = k;
/*  64 */       if (k == e) {
/*  65 */         i1 = f;
/*  66 */       } else if (k == i) {
/*  67 */         i1 = j;
/*  68 */       } else if (k == c) {
/*  69 */         i1 = d;
/*  70 */       } else if (k == t) {
/*  71 */         i1 = q;
/*  72 */       } else if (k == w) {
/*  73 */         i1 = z;
/*  74 */       } else if (k == r) {
/*  75 */         i1 = s;
/*  76 */       } else if (k == x) {
/*  77 */         i1 = y;
/*  78 */       } else if (k == q) {
/*  79 */         i1 = (☃.a(3) == 0) ? j : i;
/*  80 */       } else if (k == k) {
/*  81 */         i1 = l;
/*  82 */       } else if (k == m) {
/*  83 */         i1 = n;
/*  84 */       } else if (k == bzy.c) {
/*  85 */         i1 = bzy.h;
/*  86 */       } else if (k == bzy.b) {
/*  87 */         i1 = bzy.g;
/*  88 */       } else if (k == bzy.d) {
/*  89 */         i1 = bzy.i;
/*  90 */       } else if (k == bzy.e) {
/*  91 */         i1 = bzy.j;
/*  92 */       } else if (k == g) {
/*  93 */         i1 = h;
/*  94 */       } else if (k == u) {
/*  95 */         i1 = v;
/*  96 */       } else if (bzy.a(k, p)) {
/*  97 */         i1 = o;
/*  98 */       } else if ((k == bzy.h || k == bzy.g || k == bzy.i || k == bzy.j) && 
/*  99 */         ☃.a(3) == 0) {
/* 100 */         i1 = (☃.a(2) == 0) ? q : i;
/*     */       } 
/*     */       
/* 103 */       if (n == 0 && i1 != k) {
/* 104 */         ayu ayu = ayu.a(fc.m.a(i1));
/* 105 */         i1 = (ayu == null) ? k : fc.m.a(ayu);
/*     */       } 
/*     */       
/* 108 */       if (i1 != k) {
/* 109 */         int i2 = 0;
/* 110 */         if (bzy.a(bzf1.a(i + 1, j + 0), k)) {
/* 111 */           i2++;
/*     */         }
/* 113 */         if (bzy.a(bzf1.a(i + 2, j + 1), k)) {
/* 114 */           i2++;
/*     */         }
/* 116 */         if (bzy.a(bzf1.a(i + 0, j + 1), k)) {
/* 117 */           i2++;
/*     */         }
/* 119 */         if (bzy.a(bzf1.a(i + 1, j + 2), k)) {
/* 120 */           i2++;
/*     */         }
/* 122 */         if (i2 >= 3) {
/* 123 */           return i1;
/*     */         }
/*     */       } 
/*     */     } 
/* 127 */     return k;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\cac.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */