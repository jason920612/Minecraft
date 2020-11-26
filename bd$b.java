/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class b
/*     */   extends y
/*     */ {
/*     */   private final ay a;
/*     */   private final ay b;
/*     */   private final ai c;
/*     */   
/*     */   public b(ay ☃, ay ay1, ai ai1) {
/*  77 */     super(bd.b());
/*  78 */     this.a = ☃;
/*  79 */     this.b = ay1;
/*  80 */     this.c = ai1;
/*     */   }
/*     */   
/*     */   public static b a(ai ☃) {
/*  84 */     return new b(ay.a, ay.a, ☃);
/*     */   }
/*     */   
/*     */   public boolean a(td ☃, cee cee1, double d1, double d2, double d3) {
/*  88 */     if (!this.a.a(☃, cee1.b, cee1.c, cee1.d)) {
/*  89 */       return false;
/*     */     }
/*  91 */     if (!this.b.a(☃, d1, d2, d3)) {
/*  92 */       return false;
/*     */     }
/*  94 */     if (!this.c.a(cee1.b, cee1.c, cee1.d, d1, d2, d3)) {
/*  95 */       return false;
/*     */     }
/*  97 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public JsonElement b() {
/* 102 */     JsonObject ☃ = new JsonObject();
/*     */     
/* 104 */     ☃.add("entered", this.a.a());
/* 105 */     ☃.add("exited", this.b.a());
/* 106 */     ☃.add("distance", this.c.a());
/*     */     
/* 108 */     return (JsonElement)☃;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bd$b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */