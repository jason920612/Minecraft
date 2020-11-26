/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ced
/*    */ {
/*  7 */   public static final ced a = new ced(0.0F, 0.0F);
/*  8 */   public static final ced b = new ced(1.0F, 1.0F);
/*  9 */   public static final ced c = new ced(1.0F, 0.0F);
/* 10 */   public static final ced d = new ced(-1.0F, 0.0F);
/* 11 */   public static final ced e = new ced(0.0F, 1.0F);
/* 12 */   public static final ced f = new ced(0.0F, -1.0F);
/* 13 */   public static final ced g = new ced(Float.MAX_VALUE, Float.MAX_VALUE);
/* 14 */   public static final ced h = new ced(Float.MIN_VALUE, Float.MIN_VALUE);
/*    */   
/*    */   public final float i;
/*    */   public final float j;
/*    */   
/*    */   public ced(float ☃, float f1) {
/* 20 */     this.i = ☃;
/* 21 */     this.j = f1;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean c(ced ☃) {
/* 41 */     return (this.i == ☃.i && this.j == ☃.j);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\ced.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */