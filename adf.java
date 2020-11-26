/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class adf
/*    */ {
/*    */   public static ate a(List<ate> ☃, int i, int j) {
/* 13 */     if (i < 0 || i >= ☃.size() || ((ate)☃.get(i)).a() || j <= 0) {
/* 14 */       return ate.a;
/*    */     }
/*    */     
/* 17 */     return ((ate)☃.get(i)).a(j);
/*    */   }
/*    */   
/*    */   public static ate a(List<ate> ☃, int i) {
/* 21 */     if (i < 0 || i >= ☃.size()) {
/* 22 */       return ate.a;
/*    */     }
/*    */     
/* 25 */     return ☃.set(i, ate.a);
/*    */   }
/*    */   
/*    */   public static gy a(gy ☃, ez<ate> ez1) {
/* 29 */     return a(☃, ez1, true);
/*    */   }
/*    */   
/*    */   public static gy a(gy ☃, ez<ate> ez1, boolean bool) {
/* 33 */     he he = new he();
/* 34 */     for (int i = 0; i < ez1.size(); i++) {
/* 35 */       ate ate = ez1.get(i);
/* 36 */       if (!ate.a()) {
/* 37 */         gy gy1 = new gy();
/* 38 */         gy1.a("Slot", (byte)i);
/* 39 */         ate.b(gy1);
/* 40 */         he.a(gy1);
/*    */       } 
/*    */     } 
/* 43 */     if (!he.isEmpty() || bool) {
/* 44 */       ☃.a("Items", he);
/*    */     }
/* 46 */     return ☃;
/*    */   }
/*    */   
/*    */   public static void b(gy ☃, ez<ate> ez1) {
/* 50 */     he he = ☃.d("Items", 10);
/* 51 */     for (int i = 0; i < he.size(); i++) {
/* 52 */       gy gy1 = he.e(i);
/* 53 */       int j = gy1.f("Slot") & 0xFF;
/* 54 */       if (j >= 0 && j < ez1.size())
/* 55 */         ez1.set(j, ate.a(gy1)); 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\adf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */