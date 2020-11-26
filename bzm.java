/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class bzm<R extends bzf>
/*    */   implements bzk<R>
/*    */ {
/*    */   private long c;
/*    */   private long d;
/*    */   protected long a;
/*    */   protected byi b;
/*    */   
/*    */   public bzm(long ☃) {
/* 17 */     this.a = ☃;
/* 18 */     this.a *= this.a * 6364136223846793005L + 1442695040888963407L;
/* 19 */     this.a += ☃;
/* 20 */     this.a *= this.a * 6364136223846793005L + 1442695040888963407L;
/* 21 */     this.a += ☃;
/* 22 */     this.a *= this.a * 6364136223846793005L + 1442695040888963407L;
/* 23 */     this.a += ☃;
/*    */   }
/*    */   
/*    */   public void a(long ☃) {
/* 27 */     this.c = ☃;
/* 28 */     this.c *= this.c * 6364136223846793005L + 1442695040888963407L;
/* 29 */     this.c += this.a;
/* 30 */     this.c *= this.c * 6364136223846793005L + 1442695040888963407L;
/* 31 */     this.c += this.a;
/* 32 */     this.c *= this.c * 6364136223846793005L + 1442695040888963407L;
/* 33 */     this.c += this.a;
/* 34 */     this.b = new byi(new Random(☃));
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(long ☃, long l1) {
/* 39 */     this.d = this.c;
/* 40 */     this.d *= this.d * 6364136223846793005L + 1442695040888963407L;
/* 41 */     this.d += ☃;
/* 42 */     this.d *= this.d * 6364136223846793005L + 1442695040888963407L;
/* 43 */     this.d += l1;
/* 44 */     this.d *= this.d * 6364136223846793005L + 1442695040888963407L;
/* 45 */     this.d += ☃;
/* 46 */     this.d *= this.d * 6364136223846793005L + 1442695040888963407L;
/* 47 */     this.d += l1;
/*    */   }
/*    */ 
/*    */   
/*    */   public int a(int ☃) {
/* 52 */     int i = (int)((this.d >> 24L) % ☃);
/* 53 */     if (i < 0) {
/* 54 */       i += ☃;
/*    */     }
/* 56 */     this.d *= this.d * 6364136223846793005L + 1442695040888963407L;
/* 57 */     this.d += this.c;
/* 58 */     return i;
/*    */   }
/*    */ 
/*    */   
/*    */   public int a(int... ☃) {
/* 63 */     return ☃[a(☃.length)];
/*    */   }
/*    */ 
/*    */   
/*    */   public byi a() {
/* 68 */     return this.b;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bzm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */