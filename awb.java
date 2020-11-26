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
/*    */ public class awb
/*    */   extends awe
/*    */ {
/* 18 */   private static final String[] d = new String[] { "all", "undead", "arthropods" };
/*    */ 
/*    */ 
/*    */   
/* 22 */   private static final int[] e = new int[] { 1, 5, 5 };
/*    */ 
/*    */ 
/*    */   
/* 26 */   private static final int[] f = new int[] { 11, 8, 8 };
/*    */ 
/*    */ 
/*    */   
/* 30 */   private static final int[] g = new int[] { 20, 20, 20 };
/*    */ 
/*    */   
/*    */   public final int a;
/*    */ 
/*    */   
/*    */   public awb(awe.a ☃, int i, aew... arrayOfAew) {
/* 37 */     super(☃, awf.g, arrayOfAew);
/* 38 */     this.a = i;
/*    */   }
/*    */ 
/*    */   
/*    */   public int a(int ☃) {
/* 43 */     return e[this.a] + (☃ - 1) * f[this.a];
/*    */   }
/*    */ 
/*    */   
/*    */   public int b(int ☃) {
/* 48 */     return a(☃) + g[this.a];
/*    */   }
/*    */ 
/*    */   
/*    */   public int a() {
/* 53 */     return 5;
/*    */   }
/*    */ 
/*    */   
/*    */   public float a(int ☃, afd afd1) {
/* 58 */     if (this.a == 0) {
/* 59 */       return 1.0F + Math.max(0, ☃ - 1) * 0.5F;
/*    */     }
/* 61 */     if (this.a == 1 && afd1 == afd.b) {
/* 62 */       return ☃ * 2.5F;
/*    */     }
/* 64 */     if (this.a == 2 && afd1 == afd.c) {
/* 65 */       return ☃ * 2.5F;
/*    */     }
/* 67 */     return 0.0F;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(awe ☃) {
/* 72 */     return !(☃ instanceof awb);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(ate ☃) {
/* 77 */     if (☃.b() instanceof arg) {
/* 78 */       return true;
/*    */     }
/* 80 */     return super.a(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(afa ☃, aer aer1, int i) {
/* 85 */     if (aer1 instanceof afa) {
/* 86 */       afa afa1 = (afa)aer1;
/*    */       
/* 88 */       if (this.a == 2 && afa1.cA() == afd.c) {
/* 89 */         int j = 20 + ☃.ce().nextInt(10 * i);
/* 90 */         afa1.c(new aek(aem.b, j, 3));
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\awb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */