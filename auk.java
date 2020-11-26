/*    */ import java.util.function.Supplier;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum auk
/*    */   implements aui
/*    */ {
/* 11 */   a(0, 59, 2.0F, 0.0F, 15, () -> avh.a(wx.b)),
/* 12 */   b(1, 131, 4.0F, 1.0F, 5, () -> avh.a(new axx[] { bct.m })),
/* 13 */   c(2, 250, 6.0F, 2.0F, 14, () -> avh.a(new axx[] { atf.n })),
/* 14 */   d(3, 1561, 8.0F, 3.0F, 10, () -> avh.a(new axx[] { atf.m })),
/* 15 */   e(0, 32, 12.0F, 0.0F, 22, () -> avh.a(new axx[] { atf.o }));
/*    */   
/*    */   private final int f;
/*    */   
/*    */   private final int g;
/*    */   private final float h;
/*    */   private final float i;
/*    */   private final int j;
/*    */   private final xn<avh> k;
/*    */   
/*    */   auk(int ☃, int i, float f1, float f2, int j, Supplier<avh> supplier) {
/* 26 */     this.f = ☃;
/* 27 */     this.g = i;
/* 28 */     this.h = f1;
/* 29 */     this.i = f2;
/* 30 */     this.j = j;
/* 31 */     this.k = new xn<>(supplier);
/*    */   }
/*    */ 
/*    */   
/*    */   public int a() {
/* 36 */     return this.g;
/*    */   }
/*    */ 
/*    */   
/*    */   public float b() {
/* 41 */     return this.h;
/*    */   }
/*    */ 
/*    */   
/*    */   public float c() {
/* 46 */     return this.i;
/*    */   }
/*    */ 
/*    */   
/*    */   public int d() {
/* 51 */     return this.f;
/*    */   }
/*    */ 
/*    */   
/*    */   public int e() {
/* 56 */     return this.j;
/*    */   }
/*    */ 
/*    */   
/*    */   public avh f() {
/* 61 */     return this.k.a();
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\auk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */