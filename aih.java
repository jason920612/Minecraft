/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class aih
/*    */   extends ahr
/*    */ {
/*    */   protected final float h;
/*    */   
/*    */   public aih(afg ☃, double d) {
/* 15 */     this(☃, d, 0.001F);
/*    */   }
/*    */   
/*    */   public aih(afg ☃, double d, float f) {
/* 19 */     super(☃, d);
/* 20 */     this.h = f;
/*    */   }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   protected cee g() {
/* 26 */     if (this.a.aq()) {
/*    */       
/* 28 */       cee ☃ = ajd.b(this.a, 15, 7);
/* 29 */       return (☃ == null) ? super.g() : ☃;
/*    */     } 
/* 31 */     if (this.a.ce().nextFloat() >= this.h) {
/* 32 */       return ajd.b(this.a, 10, 7);
/*    */     }
/* 34 */     return super.g();
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\aih.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */