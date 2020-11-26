/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum akr
/*    */ {
/* 10 */   a(0),
/* 11 */   b(5, "iron", "meo"),
/* 12 */   c(7, "gold", "goo"),
/* 13 */   d(11, "diamond", "dio");
/*    */   
/*    */   private final String e;
/*    */   
/*    */   private final String f;
/*    */   
/*    */   private final int g;
/*    */ 
/*    */   
/*    */   akr(int ☃) {
/* 23 */     this.g = ☃;
/* 24 */     this.e = null;
/* 25 */     this.f = "";
/*    */   }
/*    */   
/*    */   akr(int ☃, String str1, String str2) {
/* 29 */     this.g = ☃;
/* 30 */     this.e = "textures/entity/horse/armor/horse_armor_" + str1 + ".png";
/* 31 */     this.f = str2;
/*    */   }
/*    */   
/*    */   public int a() {
/* 35 */     return ordinal();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int c() {
/* 43 */     return this.g;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static akr a(int ☃) {
/* 52 */     return values()[☃];
/*    */   }
/*    */   
/*    */   public static akr a(ate ☃) {
/* 56 */     return ☃.a() ? a : a(☃.b());
/*    */   }
/*    */   
/*    */   public static akr a(ata ☃) {
/* 60 */     if (☃ == atf.dZ)
/* 61 */       return b; 
/* 62 */     if (☃ == atf.ea)
/* 63 */       return c; 
/* 64 */     if (☃ == atf.eb) {
/* 65 */       return d;
/*    */     }
/* 67 */     return a;
/*    */   }
/*    */   
/*    */   public static boolean b(ata ☃) {
/* 71 */     return (a(☃) != a);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\akr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */