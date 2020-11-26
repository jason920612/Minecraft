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
/*    */ public class bru
/*    */   extends btl<brt>
/*    */ {
/*    */   protected boolean a(bmy<?> ☃, Random random, int i, int j) {
/* 18 */     ((boz)random).c(☃.c(), i, j);
/*    */     
/* 20 */     ayu ayu = ☃.b().a(new el((i << 4) + 9, 0, (j << 4) + 9), ayz.b);
/*    */     
/* 22 */     if (☃.a(ayu, (btl)bqo.f)) {
/* 23 */       brt brt = (brt)☃.b(ayu, (btl)bqo.f);
/* 24 */       double d = brt.a;
/* 25 */       return (random.nextDouble() < d);
/*    */     } 
/* 27 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean a(axz ☃) {
/* 32 */     return ☃.g().r();
/*    */   }
/*    */ 
/*    */   
/*    */   protected bxc a(axz ☃, bmy<?> bmy1, boz boz1, int i, int j) {
/* 37 */     ayu ayu = bmy1.b().a(new el((i << 4) + 9, 0, (j << 4) + 9), ayz.b);
/* 38 */     return new a(☃, bmy1, boz1, i, j, ayu);
/*    */   }
/*    */ 
/*    */   
/*    */   protected String a() {
/* 43 */     return "Mineshaft";
/*    */   }
/*    */ 
/*    */   
/*    */   public int b() {
/* 48 */     return 8;
/*    */   }
/*    */   
/*    */   public enum b {
/* 52 */     a,
/* 53 */     b;
/*    */     
/*    */     public static b a(int ☃) {
/* 56 */       if (☃ < 0 || ☃ >= (values()).length) {
/* 57 */         return a;
/*    */       }
/* 59 */       return values()[☃];
/*    */     }
/*    */   }
/*    */   
/*    */   public static class a
/*    */     extends bxc
/*    */   {
/*    */     private bru.b e;
/*    */     
/*    */     public a() {}
/*    */     
/*    */     public a(axz ☃, bmy<?> bmy1, boz boz1, int i, int j, ayu ayu1) {
/* 71 */       super(i, j, ayu1, boz1, ☃.r_());
/* 72 */       brt brt = (brt)bmy1.b(ayu1, (btl)bqo.f);
/*    */       
/* 74 */       this.e = brt.b;
/*    */       
/* 76 */       bwq.d d = new bwq.d(0, boz1, (i << 4) + 2, (j << 4) + 2, this.e);
/* 77 */       this.a.add(d);
/* 78 */       d.a(d, this.a, boz1);
/*    */       
/* 80 */       a(☃);
/* 81 */       if (brt.b == bru.b.b) {
/*    */         
/* 83 */         int k = -5;
/* 84 */         int m = ☃.k() - this.b.e + this.b.d() / 2 - -5;
/*    */ 
/*    */         
/* 87 */         this.b.a(0, m, 0);
/* 88 */         for (bxb bxb : this.a) {
/* 89 */           bxb.a(0, m, 0);
/*    */         }
/*    */       } else {
/* 92 */         a(☃, boz1, 10);
/*    */       } 
/*    */     }
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bru.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */