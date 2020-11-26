/*    */ 
/*    */ public enum aew
/*    */ {
/*  4 */   a(a.a, 0, 0, "mainhand"),
/*  5 */   b(a.a, 1, 5, "offhand"),
/*  6 */   c(a.b, 0, 1, "feet"),
/*  7 */   d(a.b, 1, 2, "legs"),
/*  8 */   e(a.b, 2, 3, "chest"),
/*  9 */   f(a.b, 3, 4, "head");
/*    */   
/*    */   private final a g;
/*    */   private final int h;
/*    */   private final int i;
/*    */   private final String j;
/*    */   
/*    */   aew(a ☃, int i, int j, String str1) {
/* 17 */     this.g = ☃;
/* 18 */     this.h = i;
/* 19 */     this.i = j;
/* 20 */     this.j = str1;
/*    */   }
/*    */   
/*    */   public a a() {
/* 24 */     return this.g;
/*    */   }
/*    */   
/*    */   public int b() {
/* 28 */     return this.h;
/*    */   }
/*    */   
/*    */   public int c() {
/* 32 */     return this.i;
/*    */   }
/*    */   
/*    */   public String d() {
/* 36 */     return this.j;
/*    */   }
/*    */   
/*    */   public enum a {
/* 40 */     a,
/* 41 */     b;
/*    */   }
/*    */   
/*    */   public static aew a(String ☃) {
/* 45 */     for (aew aew1 : values()) {
/* 46 */       if (aew1.d().equals(☃)) {
/* 47 */         return aew1;
/*    */       }
/*    */     } 
/*    */     
/* 51 */     throw new IllegalArgumentException("Invalid slot '" + ☃ + "'");
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\aew.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */