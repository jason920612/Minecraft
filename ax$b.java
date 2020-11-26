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
/*     */ public class b
/*     */   extends y
/*     */ {
/*     */   private final ai a;
/*     */   private final ba.d b;
/*     */   
/*     */   public b(ai ☃, ba.d d1) {
/*  74 */     super(ax.b());
/*  75 */     this.a = ☃;
/*  76 */     this.b = d1;
/*     */   }
/*     */   
/*     */   public static b a(ai ☃) {
/*  80 */     return new b(☃, ba.d.e);
/*     */   }
/*     */   
/*     */   public boolean a(tf ☃, cee cee1, int i) {
/*  84 */     if (!this.a.a(cee1.b, cee1.c, cee1.d, ☃.q, ☃.r, ☃.s)) {
/*  85 */       return false;
/*     */     }
/*  87 */     if (!this.b.d(i)) {
/*  88 */       return false;
/*     */     }
/*  90 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public JsonElement b() {
/*  95 */     JsonObject ☃ = new JsonObject();
/*     */     
/*  97 */     ☃.add("distance", this.a.a());
/*  98 */     ☃.add("duration", this.b.d());
/*     */     
/* 100 */     return (JsonElement)☃;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\ax$b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */