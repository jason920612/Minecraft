/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum cah
/*    */   implements cas
/*    */ {
/* 10 */   a; private static final int w; private static final int v; private static final int u; private static final int t; private static final int s; private static final int r; private static final int q; private static final int p; private static final int o; private static final int n; private static final int m;
/*    */   static {
/* 12 */     b = fc.m.a(ayz.r);
/* 13 */     c = fc.m.a(ayz.B);
/* 14 */     d = fc.m.a(ayz.d);
/* 15 */     e = fc.m.a(ayz.e);
/* 16 */     f = fc.m.a(ayz.J);
/* 17 */     g = fc.m.a(ayz.f);
/* 18 */     h = fc.m.a(ayz.w);
/* 19 */     i = fc.m.a(ayz.y);
/* 20 */     j = fc.m.a(ayz.x);
/* 21 */     k = fc.m.a(ayz.M);
/* 22 */     l = fc.m.a(ayz.N);
/* 23 */     m = fc.m.a(ayz.O);
/* 24 */     n = fc.m.a(ayz.at);
/* 25 */     o = fc.m.a(ayz.au);
/* 26 */     p = fc.m.a(ayz.av);
/* 27 */     q = fc.m.a(ayz.p);
/* 28 */     r = fc.m.a(ayz.q);
/* 29 */     s = fc.m.a(ayz.i);
/* 30 */     t = fc.m.a(ayz.v);
/* 31 */     u = fc.m.a(ayz.A);
/* 32 */     v = fc.m.a(ayz.h);
/* 33 */     w = fc.m.a(ayz.g);
/*    */   }
/*    */   private static final int l; private static final int k; private static final int j; private static final int i; private static final int h; private static final int g; private static final int f; private static final int e; private static final int d; private static final int c; private static final int b;
/*    */   public int a(bzl ☃, int i, int j, int k, int m, int n) {
/* 37 */     ayu ayu = fc.m.a(n);
/* 38 */     if (n == q) {
/* 39 */       if (bzy.b(i) || bzy.b(j) || bzy.b(k) || bzy.b(m)) {
/* 40 */         return r;
/*    */       }
/* 42 */     } else if (ayu != null && ayu.p() == ayu.b.d) {
/* 43 */       if (!a(i) || !a(j) || !a(k) || !a(m))
/* 44 */         return i; 
/* 45 */       if (bzy.a(i) || bzy.a(j) || bzy.a(k) || bzy.a(m)) {
/* 46 */         return b;
/*    */       }
/* 48 */     } else if (n == e || n == f || n == t) {
/* 49 */       if (!bzy.a(n) && (bzy.a(i) || bzy.a(j) || bzy.a(k) || bzy.a(m))) {
/* 50 */         return u;
/*    */       }
/* 52 */     } else if (ayu != null && ayu.c() == ayu.d.c) {
/* 53 */       if (!bzy.a(n) && (bzy.a(i) || bzy.a(j) || bzy.a(k) || bzy.a(m))) {
/* 54 */         return c;
/*    */       }
/* 56 */     } else if (n == k || n == l) {
/* 57 */       if (!bzy.a(i) && !bzy.a(j) && !bzy.a(k) && !bzy.a(m) && (!b(i) || !b(j) || !b(k) || !b(m))) {
/* 58 */         return d;
/*    */       }
/* 60 */     } else if (!bzy.a(n) && n != s && n != v && (
/* 61 */       bzy.a(i) || bzy.a(j) || bzy.a(k) || bzy.a(m))) {
/* 62 */       return b;
/*    */     } 
/*    */     
/* 65 */     return n;
/*    */   }
/*    */   
/*    */   private static boolean a(int ☃) {
/* 69 */     if (fc.m.a(☃) != null && ((ayu)fc.m.a(☃)).p() == ayu.b.d) {
/* 70 */       return true;
/*    */     }
/*    */     
/* 73 */     return (☃ == i || ☃ == h || ☃ == j || ☃ == g || ☃ == w || bzy.a(☃));
/*    */   }
/*    */   
/*    */   private boolean b(int ☃) {
/* 77 */     return (☃ == k || ☃ == l || ☃ == m || ☃ == n || ☃ == o || ☃ == p);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\cah.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */