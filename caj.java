/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum caj
/*    */   implements can
/*    */ {
/*  9 */   a;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int a(bzk<?> ☃, bzg bzg1, bzf bzf1, int i, int j) {
/* 18 */     int k = i + bzg1.a() - 2;
/* 19 */     int m = j + bzg1.b() - 2;
/* 20 */     int n = bzg1.a() >> 2;
/* 21 */     int i1 = bzg1.b() >> 2;
/* 22 */     int i2 = (k >> 2) - n;
/* 23 */     int i3 = (m >> 2) - i1;
/* 24 */     ☃.a((i2 + n << 2), (i3 + i1 << 2));
/* 25 */     double d1 = (☃.a(1024) / 1024.0D - 0.5D) * 3.6D;
/* 26 */     double d2 = (☃.a(1024) / 1024.0D - 0.5D) * 3.6D;
/*    */     
/* 28 */     ☃.a((i2 + n + 1 << 2), (i3 + i1 << 2));
/* 29 */     double d3 = (☃.a(1024) / 1024.0D - 0.5D) * 3.6D + 4.0D;
/* 30 */     double d4 = (☃.a(1024) / 1024.0D - 0.5D) * 3.6D;
/*    */     
/* 32 */     ☃.a((i2 + n << 2), (i3 + i1 + 1 << 2));
/* 33 */     double d5 = (☃.a(1024) / 1024.0D - 0.5D) * 3.6D;
/* 34 */     double d6 = (☃.a(1024) / 1024.0D - 0.5D) * 3.6D + 4.0D;
/*    */     
/* 36 */     ☃.a((i2 + n + 1 << 2), (i3 + i1 + 1 << 2));
/* 37 */     double d7 = (☃.a(1024) / 1024.0D - 0.5D) * 3.6D + 4.0D;
/* 38 */     double d8 = (☃.a(1024) / 1024.0D - 0.5D) * 3.6D + 4.0D;
/*    */     
/* 40 */     int i4 = k & 0x3;
/* 41 */     int i5 = m & 0x3;
/*    */     
/* 43 */     double d9 = (i5 - d2) * (i5 - d2) + (i4 - d1) * (i4 - d1);
/* 44 */     double d10 = (i5 - d4) * (i5 - d4) + (i4 - d3) * (i4 - d3);
/* 45 */     double d11 = (i5 - d6) * (i5 - d6) + (i4 - d5) * (i4 - d5);
/* 46 */     double d12 = (i5 - d8) * (i5 - d8) + (i4 - d7) * (i4 - d7);
/* 47 */     if (d9 < d10 && d9 < d11 && d9 < d12)
/* 48 */       return bzf1.a(i2 + 0, i3 + 0); 
/* 49 */     if (d10 < d9 && d10 < d11 && d10 < d12)
/* 50 */       return bzf1.a(i2 + 1, i3 + 0) & 0xFF; 
/* 51 */     if (d11 < d9 && d11 < d10 && d11 < d12) {
/* 52 */       return bzf1.a(i2 + 0, i3 + 1);
/*    */     }
/* 54 */     return bzf1.a(i2 + 1, i3 + 1) & 0xFF;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public bzg a(bzg ☃) {
/* 60 */     int i = ☃.a() >> 2;
/* 61 */     int j = ☃.b() >> 2;
/* 62 */     int k = (☃.c() >> 2) + 2;
/* 63 */     int m = (☃.d() >> 2) + 2;
/* 64 */     return new bzg(i, j, k, m);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\caj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */