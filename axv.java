/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum axv
/*    */ {
/*  8 */   a(-1, ""),
/*  9 */   b(0, "survival"),
/* 10 */   c(1, "creative"),
/* 11 */   d(2, "adventure"),
/* 12 */   e(3, "spectator");
/*    */   
/*    */   private final int f;
/*    */   
/*    */   private final String g;
/*    */   
/*    */   axv(int ☃, String str1) {
/* 19 */     this.f = ☃;
/* 20 */     this.g = str1;
/*    */   }
/*    */   
/*    */   public int a() {
/* 24 */     return this.f;
/*    */   }
/*    */   
/*    */   public String b() {
/* 28 */     return this.g;
/*    */   }
/*    */   
/*    */   public ij c() {
/* 32 */     return new ir("gameMode." + this.g, new Object[0]);
/*    */   }
/*    */   
/*    */   public void a(aoe ☃) {
/* 36 */     if (this == c) {
/* 37 */       ☃.c = true;
/* 38 */       ☃.d = true;
/* 39 */       ☃.a = true;
/* 40 */     } else if (this == e) {
/* 41 */       ☃.c = true;
/* 42 */       ☃.d = false;
/* 43 */       ☃.a = true;
/* 44 */       ☃.b = true;
/*    */     } else {
/* 46 */       ☃.c = false;
/* 47 */       ☃.d = false;
/* 48 */       ☃.a = false;
/* 49 */       ☃.b = false;
/*    */     } 
/* 51 */     ☃.e = !d();
/*    */   }
/*    */   
/*    */   public boolean d() {
/* 55 */     return (this == d || this == e);
/*    */   }
/*    */   
/*    */   public boolean e() {
/* 59 */     return (this == c);
/*    */   }
/*    */   
/*    */   public boolean f() {
/* 63 */     return (this == b || this == d);
/*    */   }
/*    */   
/*    */   public static axv a(int ☃) {
/* 67 */     return a(☃, b);
/*    */   }
/*    */   
/*    */   public static axv a(int ☃, axv axv1) {
/* 71 */     for (axv axv2 : values()) {
/* 72 */       if (axv2.f == ☃) {
/* 73 */         return axv2;
/*    */       }
/*    */     } 
/* 76 */     return axv1;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static axv a(String ☃, axv axv1) {
/* 84 */     for (axv axv2 : values()) {
/* 85 */       if (axv2.g.equals(☃)) {
/* 86 */         return axv2;
/*    */       }
/*    */     } 
/* 89 */     return axv1;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\axv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */