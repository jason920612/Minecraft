/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ public abstract class afp
/*    */   implements afm
/*    */ {
/*    */   private final afm a;
/*    */   private final String b;
/*    */   private final double c;
/*    */   private boolean d;
/*    */   
/*    */   protected afp(@Nullable afm ☃, String str, double d) {
/* 12 */     this.a = ☃;
/* 13 */     this.b = str;
/* 14 */     this.c = d;
/*    */     
/* 16 */     if (str == null) {
/* 17 */       throw new IllegalArgumentException("Name cannot be null!");
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public String a() {
/* 23 */     return this.b;
/*    */   }
/*    */ 
/*    */   
/*    */   public double b() {
/* 28 */     return this.c;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean c() {
/* 33 */     return this.d;
/*    */   }
/*    */   
/*    */   public afp a(boolean ☃) {
/* 37 */     this.d = ☃;
/* 38 */     return this;
/*    */   }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public afm d() {
/* 44 */     return this.a;
/*    */   }
/*    */ 
/*    */   
/*    */   public int hashCode() {
/* 49 */     return this.b.hashCode();
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean equals(Object ☃) {
/* 54 */     return (☃ instanceof afm && this.b.equals(((afm)☃).a()));
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\afp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */