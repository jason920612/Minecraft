/*    */ import java.util.function.Supplier;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum ard
/*    */   implements arc
/*    */ {
/* 12 */   a("leather", 5, new int[] { 1, 2, 3, 1 }, 15, wj.v, 0.0F, () -> avh.a(new axx[] { atf.aJ })),
/* 13 */   b("chainmail", 15, new int[] { 1, 4, 5, 2 }, 12, wj.p, 0.0F, () -> avh.a(new axx[] { atf.n })),
/* 14 */   c("iron", 15, new int[] { 2, 5, 6, 2 }, 9, wj.u, 0.0F, () -> avh.a(new axx[] { atf.n })),
/* 15 */   d("gold", 7, new int[] { 1, 3, 5, 2 }, 25, wj.t, 0.0F, () -> avh.a(new axx[] { atf.o })),
/* 16 */   e("diamond", 33, new int[] { 3, 6, 8, 3 }, 10, wj.q, 2.0F, () -> avh.a(new axx[] { atf.m })),
/* 17 */   f("turtle", 25, new int[] { 2, 5, 6, 2 }, 9, wj.w, 0.0F, () -> avh.a(new axx[] { atf.eV }));
/*    */   private static final int[] g;
/*    */   
/*    */   static {
/* 21 */     g = new int[] { 13, 15, 16, 11 };
/*    */   }
/*    */ 
/*    */   
/*    */   private final String h;
/*    */   private final int i;
/*    */   private final int[] j;
/*    */   private final int k;
/*    */   private final wi l;
/*    */   private final float m;
/*    */   private final xn<avh> n;
/*    */   
/*    */   ard(String ☃, int i, int[] arrayOfInt, int j, wi wi1, float f, Supplier<avh> supplier) {
/* 34 */     this.h = ☃;
/* 35 */     this.i = i;
/* 36 */     this.j = arrayOfInt;
/* 37 */     this.k = j;
/* 38 */     this.l = wi1;
/* 39 */     this.m = f;
/* 40 */     this.n = new xn<>(supplier);
/*    */   }
/*    */ 
/*    */   
/*    */   public int a(aew ☃) {
/* 45 */     return g[☃.b()] * this.i;
/*    */   }
/*    */ 
/*    */   
/*    */   public int b(aew ☃) {
/* 50 */     return this.j[☃.b()];
/*    */   }
/*    */ 
/*    */   
/*    */   public int a() {
/* 55 */     return this.k;
/*    */   }
/*    */ 
/*    */   
/*    */   public wi b() {
/* 60 */     return this.l;
/*    */   }
/*    */ 
/*    */   
/*    */   public avh c() {
/* 65 */     return this.n.a();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public float e() {
/* 75 */     return this.m;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\ard.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */