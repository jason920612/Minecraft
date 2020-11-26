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
/*    */ public class bxz
/*    */   implements byc<byd>
/*    */ {
/* 15 */   private static final blc c = bct.jI.p();
/* 16 */   private static final blc d = bct.de.p();
/* 17 */   private static final blc e = bct.F.p();
/* 18 */   private static final blc f = bct.df.p();
/*    */   
/*    */   protected long a;
/*    */   
/*    */   protected byj b;
/*    */   
/*    */   public void a(Random ☃, bmx bmx1, ayu ayu1, int i, int j, int k, double d, blc blc1, blc blc2, int m, long l, byd byd1) {
/* 25 */     int n = m + 1;
/* 26 */     int i1 = i & 0xF;
/* 27 */     int i2 = j & 0xF;
/*    */     
/* 29 */     double d1 = 0.03125D;
/* 30 */     boolean bool1 = (this.b.a(i * 0.03125D, j * 0.03125D, 0.0D) + ☃.nextDouble() * 0.2D > 0.0D);
/* 31 */     boolean bool2 = (this.b.a(i * 0.03125D, 109.0D, j * 0.03125D) + ☃.nextDouble() * 0.2D > 0.0D);
/* 32 */     int i3 = (int)(d / 3.0D + 3.0D + ☃.nextDouble() * 0.25D);
/*    */     
/* 34 */     el.a a = new el.a();
/*    */     
/* 36 */     int i4 = -1;
/*    */     
/* 38 */     blc blc3 = d;
/* 39 */     blc blc4 = d;
/*    */     
/* 41 */     for (int i5 = 127; i5 >= 0; i5--) {
/* 42 */       a.c(i1, i5, i2);
/*    */       
/* 44 */       blc blc5 = bmx1.a_(a);
/* 45 */       if (blc5.c() == null || blc5.f()) {
/* 46 */         i4 = -1;
/* 47 */       } else if (blc5.c() == blc1.c()) {
/* 48 */         if (i4 == -1) {
/* 49 */           if (i3 <= 0) {
/* 50 */             blc3 = c;
/* 51 */             blc4 = d;
/* 52 */           } else if (i5 >= n - 4 && i5 <= n + 1) {
/* 53 */             blc3 = d;
/* 54 */             blc4 = d;
/* 55 */             if (bool2) {
/* 56 */               blc3 = e;
/* 57 */               blc4 = d;
/*    */             } 
/* 59 */             if (bool1) {
/* 60 */               blc3 = f;
/* 61 */               blc4 = f;
/*    */             } 
/*    */           } 
/*    */           
/* 65 */           if (i5 < n && (blc3 == null || blc3.f())) {
/* 66 */             blc3 = blc2;
/*    */           }
/*    */           
/* 69 */           i4 = i3;
/* 70 */           if (i5 >= n - 1) {
/* 71 */             bmx1.a(a, blc3, false);
/*    */           } else {
/* 73 */             bmx1.a(a, blc4, false);
/*    */           } 
/* 75 */         } else if (i4 > 0) {
/* 76 */           i4--;
/* 77 */           bmx1.a(a, blc4, false);
/*    */         } 
/*    */       } 
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(long ☃) {
/* 85 */     if (this.a != ☃ || this.b == null) {
/* 86 */       this.b = new byj(new boz(☃), 4);
/*    */     }
/* 88 */     this.a = ☃;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bxz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */