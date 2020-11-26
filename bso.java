/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class bso<C extends bqp>
/*    */   extends btl<C>
/*    */ {
/*    */   protected axm a(bmy<?> ☃, Random random, int i, int j, int k, int m) {
/* 16 */     int n = a(☃);
/* 17 */     int i1 = b(☃);
/*    */     
/* 19 */     int i2 = i + n * k;
/* 20 */     int i3 = j + n * m;
/*    */     
/* 22 */     int i4 = (i2 < 0) ? (i2 - n + 1) : i2;
/* 23 */     int i5 = (i3 < 0) ? (i3 - n + 1) : i3;
/*    */     
/* 25 */     int i6 = i4 / n;
/* 26 */     int i7 = i5 / n;
/*    */     
/* 28 */     ((boz)random).a(☃.c(), i6, i7, c());
/*    */     
/* 30 */     i6 *= n;
/* 31 */     i7 *= n;
/* 32 */     i6 += random.nextInt(n - i1);
/* 33 */     i7 += random.nextInt(n - i1);
/*    */     
/* 35 */     return new axm(i6, i7);
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean a(bmy<?> ☃, Random random, int i, int j) {
/* 40 */     axm axm = a(☃, random, i, j, 0, 0);
/*    */     
/* 42 */     if (i == axm.a && j == axm.b) {
/* 43 */       ayu ayu = ☃.b().a(new el(i * 16 + 9, 0, j * 16 + 9), null);
/* 44 */       if (☃.a(ayu, this)) {
/* 45 */         return true;
/*    */       }
/*    */     } 
/*    */     
/* 49 */     return false;
/*    */   }
/*    */   
/*    */   protected int a(bmy<?> ☃) {
/* 53 */     return ☃.a().h();
/*    */   }
/*    */   
/*    */   protected int b(bmy<?> ☃) {
/* 57 */     return ☃.a().i();
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean a(axz ☃) {
/* 62 */     return ☃.g().r();
/*    */   }
/*    */   
/*    */   protected abstract bxc a(axz paramaxz, bmy<?> parambmy, boz paramboz, int paramInt1, int paramInt2);
/*    */   
/*    */   protected abstract int c();
/*    */ }


/* Location:              F:\dw\server.jar!\bso.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */