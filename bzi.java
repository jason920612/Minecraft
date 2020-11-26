/*    */ import it.unimi.dsi.fastutil.longs.Long2IntLinkedOpenHashMap;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class bzi
/*    */   implements bzf
/*    */ {
/*    */   private final caw a;
/*    */   private final Long2IntLinkedOpenHashMap b;
/*    */   private final int c;
/*    */   private final bzg d;
/*    */   
/*    */   public bzi(Long2IntLinkedOpenHashMap ☃, int i, bzg bzg1, caw caw1) {
/* 16 */     this.b = ☃;
/* 17 */     this.c = i;
/* 18 */     this.d = bzg1;
/* 19 */     this.a = caw1;
/*    */   }
/*    */ 
/*    */   
/*    */   public int a(int ☃, int i) {
/* 24 */     long l = b(☃, i);
/* 25 */     synchronized (this.b) {
/* 26 */       int j = this.b.get(l);
/* 27 */       if (j != Integer.MIN_VALUE) {
/* 28 */         return j;
/*    */       }
/* 30 */       int k = this.a.apply(☃, i);
/* 31 */       this.b.put(l, k);
/* 32 */       if (this.b.size() > this.c) {
/* 33 */         for (int m = 0; m < this.c / 16; m++) {
/* 34 */           this.b.removeFirstInt();
/*    */         }
/*    */       }
/* 37 */       return k;
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   private long b(int ☃, int i) {
/* 43 */     long l = 1L;
/*    */     
/* 45 */     l <<= 26L;
/* 46 */     l |= (☃ + this.d.a()) & 0x3FFFFFFL;
/* 47 */     l <<= 26L;
/* 48 */     l |= (i + this.d.b()) & 0x3FFFFFFL;
/* 49 */     return l;
/*    */   }
/*    */   
/*    */   public int a() {
/* 53 */     return this.c;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bzi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */