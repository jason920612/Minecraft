/*    */ import it.unimi.dsi.fastutil.doubles.DoubleArrayList;
/*    */ import it.unimi.dsi.fastutil.doubles.DoubleList;
/*    */ import java.util.Arrays;
/*    */ 
/*    */ 
/*    */ 
/*    */ final class ceg
/*    */   extends cew
/*    */ {
/*    */   private final DoubleList b;
/*    */   private final DoubleList c;
/*    */   private final DoubleList d;
/*    */   
/*    */   ceg(cem ☃, double[] arrayOfDouble1, double[] arrayOfDouble2, double[] arrayOfDouble3) {
/* 15 */     this(☃, 
/*    */         
/* 17 */         (DoubleList)DoubleArrayList.wrap(Arrays.copyOf(arrayOfDouble1, ☃.b() + 1)), 
/* 18 */         (DoubleList)DoubleArrayList.wrap(Arrays.copyOf(arrayOfDouble2, ☃.c() + 1)), 
/* 19 */         (DoubleList)DoubleArrayList.wrap(Arrays.copyOf(arrayOfDouble3, ☃.d() + 1)));
/*    */   }
/*    */ 
/*    */   
/*    */   ceg(cem ☃, DoubleList doubleList1, DoubleList doubleList2, DoubleList doubleList3) {
/* 24 */     super(☃);
/* 25 */     int i = ☃.b() + 1;
/* 26 */     int j = ☃.c() + 1;
/* 27 */     int k = ☃.d() + 1;
/* 28 */     if (i != doubleList1.size() || j != doubleList2.size() || k != doubleList3.size()) {
/* 29 */       throw new IllegalArgumentException("Lengths of point arrays must be consistent with the size of the VoxelShape.");
/*    */     }
/* 31 */     this.b = doubleList1;
/* 32 */     this.c = doubleList2;
/* 33 */     this.d = doubleList3;
/*    */   }
/*    */ 
/*    */   
/*    */   protected DoubleList a(eq.a ☃) {
/* 38 */     switch (null.a[☃.ordinal()]) {
/*    */       case 1:
/* 40 */         return this.b;
/*    */       case 2:
/* 42 */         return this.c;
/*    */       case 3:
/* 44 */         return this.d;
/*    */     } 
/* 46 */     throw new IllegalArgumentException();
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\ceg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */