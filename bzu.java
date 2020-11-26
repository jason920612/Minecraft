/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum bzu
/*    */   implements cas
/*    */ {
/* 11 */   a; private static final int p; private static final int o; private static final int n; private static final int m; private static final int l; private static final int k; private static final int j;
/*    */   static {
/* 13 */     b = fc.m.a(ayz.d);
/* 14 */     c = fc.m.a(ayz.e);
/* 15 */     d = fc.m.a(ayz.J);
/* 16 */     e = fc.m.a(ayz.n);
/* 17 */     f = fc.m.a(ayz.w);
/* 18 */     g = fc.m.a(ayz.y);
/* 19 */     h = fc.m.a(ayz.M);
/* 20 */     i = fc.m.a(ayz.O);
/* 21 */     j = fc.m.a(ayz.N);
/* 22 */     k = fc.m.a(ayz.c);
/* 23 */     l = fc.m.a(ayz.H);
/* 24 */     m = fc.m.a(ayz.v);
/* 25 */     n = fc.m.a(ayz.h);
/* 26 */     o = fc.m.a(ayz.g);
/* 27 */     p = fc.m.a(ayz.F);
/*    */   }
/*    */   private static final int i; private static final int h; private static final int g; private static final int f; private static final int e; private static final int d; private static final int c; private static final int b;
/*    */   public int a(bzl ☃, int i, int j, int k, int m, int n) {
/* 31 */     int[] arrayOfInt = new int[1];
/* 32 */     if (a(arrayOfInt, i, j, k, m, n, c, m) || 
/* 33 */       b(arrayOfInt, i, j, k, m, n, j, h) || 
/* 34 */       b(arrayOfInt, i, j, k, m, n, i, h) || 
/* 35 */       b(arrayOfInt, i, j, k, m, n, l, o))
/*    */     {
/* 37 */       return arrayOfInt[0];
/*    */     }
/*    */     
/* 40 */     if (n == b && (i == e || j == e || m == e || k == e)) {
/* 41 */       return d;
/*    */     }
/*    */ 
/*    */     
/* 45 */     if (n == n) {
/* 46 */       if (i == b || j == b || m == b || k == b || i == p || j == p || m == p || k == p || i == e || j == e || m == e || k == e)
/*    */       {
/*    */ 
/*    */         
/* 50 */         return k; } 
/* 51 */       if (i == f || k == f || j == f || m == f) {
/* 52 */         return g;
/*    */       }
/*    */     } 
/* 55 */     return n;
/*    */   }
/*    */   
/*    */   private boolean a(int[] ☃, int i, int j, int k, int m, int n, int i1, int i2) {
/* 59 */     if (!bzy.a(n, i1)) {
/* 60 */       return false;
/*    */     }
/* 62 */     if (a(i, i1) && a(j, i1) && a(m, i1) && a(k, i1)) {
/* 63 */       ☃[0] = n;
/*    */     } else {
/* 65 */       ☃[0] = i2;
/*    */     } 
/* 67 */     return true;
/*    */   }
/*    */   
/*    */   private boolean b(int[] ☃, int i, int j, int k, int m, int n, int i1, int i2) {
/* 71 */     if (n != i1) {
/* 72 */       return false;
/*    */     }
/* 74 */     if (bzy.a(i, i1) && bzy.a(j, i1) && bzy.a(m, i1) && bzy.a(k, i1)) {
/* 75 */       ☃[0] = n;
/*    */     } else {
/* 77 */       ☃[0] = i2;
/*    */     } 
/* 79 */     return true;
/*    */   }
/*    */   
/*    */   private boolean a(int ☃, int i) {
/* 83 */     if (bzy.a(☃, i)) {
/* 84 */       return true;
/*    */     }
/* 86 */     ayu ayu1 = fc.m.a(☃);
/* 87 */     ayu ayu2 = fc.m.a(i);
/* 88 */     if (ayu1 != null && ayu2 != null) {
/* 89 */       ayu.c c1 = ayu1.g();
/* 90 */       ayu.c c2 = ayu2.g();
/* 91 */       return (c1 == c2 || c1 == ayu.c.c || c2 == ayu.c.c);
/*    */     } 
/* 93 */     return false;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bzu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */