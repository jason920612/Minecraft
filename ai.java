/*    */ import com.google.gson.JsonElement;
/*    */ import com.google.gson.JsonNull;
/*    */ import com.google.gson.JsonObject;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ai
/*    */ {
/* 12 */   public static final ai a = new ai(ba.c.e, ba.c.e, ba.c.e, ba.c.e, ba.c.e);
/*    */   
/*    */   private final ba.c b;
/*    */   private final ba.c c;
/*    */   private final ba.c d;
/*    */   private final ba.c e;
/*    */   private final ba.c f;
/*    */   
/*    */   public ai(ba.c ☃, ba.c c1, ba.c c2, ba.c c3, ba.c c4) {
/* 21 */     this.b = ☃;
/* 22 */     this.c = c1;
/* 23 */     this.d = c2;
/* 24 */     this.e = c3;
/* 25 */     this.f = c4;
/*    */   }
/*    */   
/*    */   public static ai a(ba.c ☃) {
/* 29 */     return new ai(ba.c.e, ba.c.e, ba.c.e, ☃, ba.c.e);
/*    */   }
/*    */   
/*    */   public static ai b(ba.c ☃) {
/* 33 */     return new ai(ba.c.e, ☃, ba.c.e, ba.c.e, ba.c.e);
/*    */   }
/*    */   
/*    */   public boolean a(double ☃, double d1, double d2, double d3, double d4, double d5) {
/* 37 */     float f1 = (float)(☃ - d3);
/* 38 */     float f2 = (float)(d1 - d4);
/* 39 */     float f3 = (float)(d2 - d5);
/* 40 */     if (!this.b.d(xq.e(f1)) || !this.c.d(xq.e(f2)) || !this.d.d(xq.e(f3))) {
/* 41 */       return false;
/*    */     }
/* 43 */     if (!this.e.a((f1 * f1 + f3 * f3))) {
/* 44 */       return false;
/*    */     }
/* 46 */     if (!this.f.a((f1 * f1 + f2 * f2 + f3 * f3))) {
/* 47 */       return false;
/*    */     }
/* 49 */     return true;
/*    */   }
/*    */   
/*    */   public static ai a(@Nullable JsonElement ☃) {
/* 53 */     if (☃ == null || ☃.isJsonNull()) {
/* 54 */       return a;
/*    */     }
/* 56 */     JsonObject jsonObject = xj.m(☃, "distance");
/* 57 */     ba.c c1 = ba.c.a(jsonObject.get("x"));
/* 58 */     ba.c c2 = ba.c.a(jsonObject.get("y"));
/* 59 */     ba.c c3 = ba.c.a(jsonObject.get("z"));
/* 60 */     ba.c c4 = ba.c.a(jsonObject.get("horizontal"));
/* 61 */     ba.c c5 = ba.c.a(jsonObject.get("absolute"));
/* 62 */     return new ai(c1, c2, c3, c4, c5);
/*    */   }
/*    */   
/*    */   public JsonElement a() {
/* 66 */     if (this == a) {
/* 67 */       return (JsonElement)JsonNull.INSTANCE;
/*    */     }
/*    */     
/* 70 */     JsonObject ☃ = new JsonObject();
/*    */     
/* 72 */     ☃.add("x", this.b.d());
/* 73 */     ☃.add("y", this.c.d());
/* 74 */     ☃.add("z", this.d.d());
/* 75 */     ☃.add("horizontal", this.e.d());
/* 76 */     ☃.add("absolute", this.f.d());
/*    */     
/* 78 */     return (JsonElement)☃;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\ai.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */