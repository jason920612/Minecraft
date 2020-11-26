/*    */ import java.util.List;
/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ public class xy
/*    */ {
/*    */   public static int a(List<? extends a> ☃) {
/*  8 */     int i = 0;
/*  9 */     for (int j = 0, k = ☃.size(); j < k; j++) {
/* 10 */       a a = ☃.get(j);
/* 11 */       i += a.a;
/*    */     } 
/* 13 */     return i;
/*    */   }
/*    */   
/*    */   public static <T extends a> T a(Random ☃, List<T> list, int i) {
/* 17 */     if (i <= 0) {
/* 18 */       throw new IllegalArgumentException();
/*    */     }
/*    */     
/* 21 */     int j = ☃.nextInt(i);
/* 22 */     return a(list, j);
/*    */   }
/*    */   
/*    */   public static <T extends a> T a(List<T> ☃, int i) {
/* 26 */     for (int j = 0, k = ☃.size(); j < k; j++) {
/* 27 */       a a = (a)☃.get(j);
/* 28 */       i -= a.a;
/* 29 */       if (i < 0) {
/* 30 */         return (T)a;
/*    */       }
/*    */     } 
/* 33 */     return null;
/*    */   }
/*    */   
/*    */   public static <T extends a> T a(Random ☃, List<T> list) {
/* 37 */     return a(☃, list, a(list));
/*    */   }
/*    */   
/*    */   public static class a {
/*    */     protected int a;
/*    */     
/*    */     public a(int ☃) {
/* 44 */       this.a = ☃;
/*    */     }
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\xy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */