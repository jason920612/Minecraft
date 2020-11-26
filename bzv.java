/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bzv
/*    */   implements caq
/*    */ {
/* 11 */   private static final int a = fc.m.a(ayz.C);
/* 12 */   private static final int b = fc.m.a(ayz.d);
/* 13 */   private static final int c = fc.m.a(ayz.e);
/* 14 */   private static final int d = fc.m.a(ayz.f);
/* 15 */   private static final int e = fc.m.a(ayz.n);
/* 16 */   private static final int f = fc.m.a(ayz.w);
/* 17 */   private static final int g = fc.m.a(ayz.O);
/* 18 */   private static final int h = fc.m.a(ayz.N);
/* 19 */   private static final int i = fc.m.a(ayz.p);
/* 20 */   private static final int j = fc.m.a(ayz.c);
/* 21 */   private static final int k = fc.m.a(ayz.H);
/* 22 */   private static final int l = fc.m.a(ayz.E);
/* 23 */   private static final int m = fc.m.a(ayz.K);
/* 24 */   private static final int n = fc.m.a(ayz.h);
/* 25 */   private static final int o = fc.m.a(ayz.g);
/* 26 */   private static final int p = fc.m.a(ayz.F);
/*    */   
/* 28 */   private static final int[] q = new int[] { b, d, c, n, j, o };
/* 29 */   private static final int[] r = new int[] { b, b, b, m, m, j };
/* 30 */   private static final int[] s = new int[] { d, l, c, j, a, n };
/* 31 */   private static final int[] t = new int[] { d, c, o, j };
/* 32 */   private static final int[] u = new int[] { e, e, e, p };
/*    */   
/*    */   private final bou v;
/* 35 */   private int[] w = r;
/*    */   
/*    */   public bzv(ayg ☃, bou bou1) {
/* 38 */     if (☃ == ayg.i) {
/* 39 */       this.w = q;
/* 40 */       this.v = null;
/*    */     } else {
/* 42 */       this.v = bou1;
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public int a(bzl ☃, int i) {
/* 48 */     if (this.v != null && this.v.v() >= 0) {
/* 49 */       return this.v.v();
/*    */     }
/*    */     
/* 52 */     int j = (i & 0xF00) >> 8;
/* 53 */     i &= 0xFFFFF0FF;
/*    */     
/* 55 */     if (bzy.a(i) || i == i) {
/* 56 */       return i;
/*    */     }
/*    */     
/* 59 */     switch (i) {
/*    */       case 1:
/* 61 */         if (j > 0) {
/* 62 */           return (☃.a(3) == 0) ? g : h;
/*    */         }
/* 64 */         return this.w[☃.a(this.w.length)];
/*    */       case 2:
/* 66 */         if (j > 0) {
/* 67 */           return f;
/*    */         }
/* 69 */         return s[☃.a(s.length)];
/*    */       case 3:
/* 71 */         if (j > 0) {
/* 72 */           return k;
/*    */         }
/* 74 */         return t[☃.a(t.length)];
/*    */       case 4:
/* 76 */         return u[☃.a(u.length)];
/*    */     } 
/* 78 */     return i;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bzv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */