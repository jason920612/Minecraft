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
/*     */   private final av a;
/*     */   private final ba.d b;
/*     */   
/*     */   public b(av ☃, ba.d d1) {
/*  74 */     super(ak.b());
/*  75 */     this.a = ☃;
/*  76 */     this.b = d1;
/*     */   }
/*     */   
/*     */   public static b c() {
/*  80 */     return new b(av.a, ba.d.e);
/*     */   }
/*     */   
/*     */   public boolean a(ate ☃, int i) {
/*  84 */     if (!this.a.a(☃)) {
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
/*  97 */     ☃.add("item", this.a.a());
/*  98 */     ☃.add("levels", this.b.d());
/*     */     
/* 100 */     return (JsonElement)☃;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\ak$b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */