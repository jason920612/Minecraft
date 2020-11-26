/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bne
/*    */ {
/*    */   private final byte[] a;
/*    */   
/*    */   public bne() {
/* 10 */     this.a = new byte[2048];
/*    */   }
/*    */   
/*    */   public bne(byte[] ☃) {
/* 14 */     this.a = ☃;
/*    */     
/* 16 */     if (☃.length != 2048) {
/* 17 */       throw new IllegalArgumentException("ChunkNibbleArrays should be 2048 bytes not: " + ☃.length);
/*    */     }
/*    */   }
/*    */   
/*    */   public int a(int ☃, int i, int j) {
/* 22 */     return a(b(☃, i, j));
/*    */   }
/*    */   
/*    */   public void a(int ☃, int i, int j, int k) {
/* 26 */     a(b(☃, i, j), k);
/*    */   }
/*    */   
/*    */   private int b(int ☃, int i, int j) {
/* 30 */     return i << 8 | j << 4 | ☃;
/*    */   }
/*    */   
/*    */   public int a(int ☃) {
/* 34 */     int i = c(☃);
/*    */     
/* 36 */     if (b(☃)) {
/* 37 */       return this.a[i] & 0xF;
/*    */     }
/* 39 */     return this.a[i] >> 4 & 0xF;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(int ☃, int i) {
/* 44 */     int j = c(☃);
/*    */     
/* 46 */     if (b(☃)) {
/* 47 */       this.a[j] = (byte)(this.a[j] & 0xF0 | i & 0xF);
/*    */     } else {
/* 49 */       this.a[j] = (byte)(this.a[j] & 0xF | (i & 0xF) << 4);
/*    */     } 
/*    */   }
/*    */   
/*    */   private boolean b(int ☃) {
/* 54 */     return ((☃ & 0x1) == 0);
/*    */   }
/*    */   
/*    */   private int c(int ☃) {
/* 58 */     return ☃ >> 1;
/*    */   }
/*    */   
/*    */   public byte[] a() {
/* 62 */     return this.a;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bne.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */