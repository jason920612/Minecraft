/*    */ import javax.annotation.concurrent.Immutable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Immutable
/*    */ public class adj
/*    */ {
/*    */   private final adi a;
/*    */   private final float b;
/*    */   
/*    */   public adj(adi ☃, long l1, long l2, float f) {
/* 18 */     this.a = ☃;
/* 19 */     this.b = a(☃, l1, l2, f);
/*    */   }
/*    */   
/*    */   public adi a() {
/* 23 */     return this.a;
/*    */   }
/*    */   
/*    */   public float b() {
/* 27 */     return this.b;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean a(float ☃) {
/* 35 */     return (this.b > ☃);
/*    */   }
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
/*    */   public float d() {
/* 48 */     if (this.b < 2.0F) {
/* 49 */       return 0.0F;
/*    */     }
/* 51 */     if (this.b > 4.0F) {
/* 52 */       return 1.0F;
/*    */     }
/* 54 */     return (this.b - 2.0F) / 2.0F;
/*    */   }
/*    */   
/*    */   private float a(adi ☃, long l1, long l2, float f) {
/* 58 */     if (☃ == adi.a) {
/* 59 */       return 0.0F;
/*    */     }
/*    */     
/* 62 */     boolean bool = (☃ == adi.d);
/* 63 */     float f1 = 0.75F;
/*    */ 
/*    */     
/* 66 */     float f2 = xq.a(((float)l1 + -72000.0F) / 1440000.0F, 0.0F, 1.0F) * 0.25F;
/* 67 */     f1 += f2;
/*    */     
/* 69 */     float f3 = 0.0F;
/*    */ 
/*    */     
/* 72 */     f3 += xq.a((float)l2 / 3600000.0F, 0.0F, 1.0F) * (bool ? 1.0F : 0.75F);
/* 73 */     f3 += xq.a(f * 0.25F, 0.0F, f2);
/*    */     
/* 75 */     if (☃ == adi.b) {
/* 76 */       f3 *= 0.5F;
/*    */     }
/* 78 */     f1 += f3;
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 83 */     return ☃.a() * f1;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\adj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */