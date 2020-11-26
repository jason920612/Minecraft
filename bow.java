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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bow
/*    */ {
/*    */   private int a;
/*    */   
/*    */   public int a(axy ☃, boolean bool1, boolean bool2) {
/* 26 */     if (!bool1) {
/* 27 */       return 0;
/*    */     }
/*    */     
/* 30 */     Random random = ☃.s;
/*    */     
/* 32 */     this.a--;
/* 33 */     if (this.a > 0) {
/* 34 */       return 0;
/*    */     }
/* 36 */     this.a += (60 + random.nextInt(60)) * 20;
/*    */     
/* 38 */     if (☃.c() < 5 && ☃.t.g()) {
/* 39 */       return 0;
/*    */     }
/*    */     
/* 42 */     int i = 0;
/* 43 */     for (aog aog : ☃.j) {
/* 44 */       if (aog.t()) {
/*    */         continue;
/*    */       }
/* 47 */       el el1 = new el(aog);
/* 48 */       if (☃.t.g() && (el1.p() < ☃.k() || !☃.e(el1))) {
/*    */         continue;
/*    */       }
/* 51 */       adj adj = ☃.h(el1);
/* 52 */       if (!adj.a(random.nextFloat() * 3.0F)) {
/*    */         continue;
/*    */       }
/*    */       
/* 56 */       wo wo = ((tf)aog).A();
/* 57 */       int j = xq.a(wo.a(ws.i.b(ws.m)), 1, 2147483647);
/* 58 */       int k = 24000;
/* 59 */       if (random.nextInt(j) < 72000) {
/*    */         continue;
/*    */       }
/*    */       
/* 63 */       el el2 = el1.b(20 + random.nextInt(15)).g(-10 + random.nextInt(21)).e(-10 + random.nextInt(21));
/* 64 */       blc blc = ☃.a_(el2);
/* 65 */       byw byw = ☃.b(el2);
/* 66 */       if (!ayj.a(blc, byw)) {
/*    */         continue;
/*    */       }
/*    */       
/* 70 */       afj afj = null;
/* 71 */       int m = 1 + random.nextInt(adj.a().a() + 1);
/* 72 */       for (int n = 0; n < m; n++) {
/* 73 */         anh anh = new anh(☃);
/* 74 */         anh.a(el2, 0.0F, 0.0F);
/* 75 */         afj = anh.a(adj, afj, (gy)null);
/* 76 */         ☃.a(anh);
/*    */       } 
/* 78 */       i += m;
/*    */     } 
/*    */     
/* 81 */     return i;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bow.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */