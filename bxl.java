/*    */ import java.util.Random;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bxl
/*    */   implements bxo
/*    */ {
/*    */   private final float a;
/*    */   private final Random b;
/*    */   
/*    */   public bxl(el ☃, bxn bxn1) {
/* 14 */     this.a = bxn1.g();
/* 15 */     this.b = bxn1.b(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public bxp.b a(axk ☃, el el1, bxp.b b1) {
/* 21 */     if (this.a >= 1.0F || this.b.nextFloat() <= this.a) {
/* 22 */       return b1;
/*    */     }
/* 24 */     return null;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bxl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */