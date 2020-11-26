/*    */ 
/*    */ 
/*    */ final class cev
/*    */   extends cem
/*    */ {
/*    */   private final cem d;
/*    */   private final int e;
/*    */   private final int f;
/*    */   private final int g;
/*    */   private final int h;
/*    */   private final int i;
/*    */   private final int j;
/*    */   
/*    */   public cev(cem ☃, int i, int j, int k, int m, int n, int i1) {
/* 15 */     super(m - i, n - j, i1 - k);
/* 16 */     this.d = ☃;
/* 17 */     this.e = i;
/* 18 */     this.f = j;
/* 19 */     this.g = k;
/* 20 */     this.h = m;
/* 21 */     this.i = n;
/* 22 */     this.j = i1;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean b(int ☃, int i, int j) {
/* 27 */     return this.d.b(this.e + ☃, this.f + i, this.g + j);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(int ☃, int i, int j, boolean bool1, boolean bool2) {
/* 32 */     this.d.a(this.e + ☃, this.f + i, this.g + j, bool1, bool2);
/*    */   }
/*    */ 
/*    */   
/*    */   public int a(eq.a ☃) {
/* 37 */     return Math.max(0, this.d.a(☃) - ☃.a(this.e, this.f, this.g));
/*    */   }
/*    */ 
/*    */   
/*    */   public int b(eq.a ☃) {
/* 42 */     return Math.min(☃.a(this.h, this.i, this.j), this.d.b(☃) - ☃.a(this.e, this.f, this.g));
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\cev.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */