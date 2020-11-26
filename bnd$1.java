/*    */ import java.util.function.BiConsumer;
/*    */ import javax.annotation.Nullable;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ enum null
/*    */ {
/*    */   public void a(axm ☃, BiConsumer<axm, bnd> biConsumer) {
/* 30 */     int i = ☃.a;
/* 31 */     int j = ☃.b;
/* 32 */     bnd bnd1 = e();
/*    */     
/* 34 */     int k = 8; int m;
/* 35 */     for (m = i - 8; m <= i + 8; m++) {
/* 36 */       if (m < i - 1 || m > i + 1)
/*    */       {
/*    */ 
/*    */         
/* 40 */         for (int n = j - 8; n <= j + 8; n++) {
/* 41 */           if (n < j - 1 || n > j + 1) {
/*    */ 
/*    */ 
/*    */             
/* 45 */             axm axm1 = new axm(m, n);
/* 46 */             biConsumer.accept(axm1, a);
/*    */           } 
/*    */         }  } 
/*    */     } 
/* 50 */     for (m = i - 1; m <= i + 1; m++) {
/* 51 */       for (int n = j - 1; n <= j + 1; n++) {
/* 52 */         axm axm1 = new axm(m, n);
/* 53 */         biConsumer.accept(axm1, bnd1);
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bnd$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */