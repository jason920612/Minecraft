/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class cbr
/*    */ {
/*    */   private final el a;
/*    */   private int b;
/*    */   private int c;
/*    */   
/*    */   public cbr(el ☃, int i, int j) {
/* 13 */     this.a = ☃;
/* 14 */     this.b = i;
/* 15 */     this.c = j;
/*    */   }
/*    */   
/*    */   public static cbr a(gy ☃) {
/* 19 */     el el1 = hk.c(☃.p("Pos"));
/* 20 */     int i = ☃.h("Rotation");
/* 21 */     int j = ☃.h("EntityId");
/* 22 */     return new cbr(el1, i, j);
/*    */   }
/*    */   
/*    */   public gy a() {
/* 26 */     gy ☃ = new gy();
/* 27 */     ☃.a("Pos", hk.a(this.a));
/* 28 */     ☃.b("Rotation", this.b);
/* 29 */     ☃.b("EntityId", this.c);
/* 30 */     return ☃;
/*    */   }
/*    */   
/*    */   public el b() {
/* 34 */     return this.a;
/*    */   }
/*    */   
/*    */   public int c() {
/* 38 */     return this.b;
/*    */   }
/*    */   
/*    */   public int d() {
/* 42 */     return this.c;
/*    */   }
/*    */   
/*    */   public String e() {
/* 46 */     return a(this.a);
/*    */   }
/*    */   
/*    */   public static String a(el ☃) {
/* 50 */     return "frame-" + ☃.o() + "," + ☃.p() + "," + ☃.q();
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\cbr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */