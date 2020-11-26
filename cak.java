/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum cak
/*    */   implements can
/*    */ {
/*  9 */   a,
/* 10 */   b
/*    */   {
/*    */     protected int a(bzk<?> ☃, int i, int j, int k, int m) {
/* 13 */       return ☃.a(new int[] { i, j, k, m });
/*    */     }
/*    */   };
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public bzg a(bzg ☃) {
/* 22 */     int i = ☃.a() >> 1;
/* 23 */     int j = ☃.b() >> 1;
/* 24 */     int k = (☃.c() >> 1) + 3;
/* 25 */     int m = (☃.d() >> 1) + 3;
/*    */     
/* 27 */     return new bzg(i, j, k, m);
/*    */   }
/*    */ 
/*    */   
/*    */   public int a(bzk<?> ☃, bzg bzg1, bzf bzf1, int i, int j) {
/* 32 */     int k = bzg1.a() >> 1;
/* 33 */     int m = bzg1.b() >> 1;
/* 34 */     int n = i + bzg1.a();
/* 35 */     int i1 = j + bzg1.b();
/*    */     
/* 37 */     int i2 = (n >> 1) - k;
/* 38 */     int i3 = i2 + 1;
/* 39 */     int i4 = (i1 >> 1) - m;
/* 40 */     int i5 = i4 + 1;
/* 41 */     int i6 = bzf1.a(i2, i4);
/*    */     
/* 43 */     ☃.a((n >> 1 << 1), (i1 >> 1 << 1));
/*    */     
/* 45 */     int i7 = n & 0x1;
/* 46 */     int i8 = i1 & 0x1;
/* 47 */     if (i7 == 0 && i8 == 0) {
/* 48 */       return i6;
/*    */     }
/*    */     
/* 51 */     int i9 = bzf1.a(i2, i5);
/* 52 */     int i10 = ☃.a(new int[] { i6, i9 });
/* 53 */     if (i7 == 0 && i8 == 1) {
/* 54 */       return i10;
/*    */     }
/* 56 */     int i11 = bzf1.a(i3, i4);
/* 57 */     int i12 = ☃.a(new int[] { i6, i11 });
/* 58 */     if (i7 == 1 && i8 == 0) {
/* 59 */       return i12;
/*    */     }
/*    */     
/* 62 */     int i13 = bzf1.a(i3, i5);
/*    */     
/* 64 */     return a(☃, i6, i11, i9, i13);
/*    */   }
/*    */   
/*    */   protected int a(bzk<?> ☃, int i, int j, int k, int m) {
/* 68 */     if (j == k && k == m) {
/* 69 */       return j;
/*    */     }
/* 71 */     if (i == j && i == k) {
/* 72 */       return i;
/*    */     }
/* 74 */     if (i == j && i == m) {
/* 75 */       return i;
/*    */     }
/* 77 */     if (i == k && i == m) {
/* 78 */       return i;
/*    */     }
/* 80 */     if (i == j && k != m) {
/* 81 */       return i;
/*    */     }
/* 83 */     if (i == k && j != m) {
/* 84 */       return i;
/*    */     }
/* 86 */     if (i == m && j != k) {
/* 87 */       return i;
/*    */     }
/* 89 */     if (j == k && i != m) {
/* 90 */       return j;
/*    */     }
/* 92 */     if (j == m && i != k) {
/* 93 */       return j;
/*    */     }
/* 95 */     if (k == m && i != j) {
/* 96 */       return k;
/*    */     }
/*    */     
/* 99 */     return ☃.a(new int[] { i, j, k, m });
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\cak.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */