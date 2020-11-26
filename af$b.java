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
/*     */ public class b
/*     */   extends y
/*     */ {
/*     */   private final ao a;
/*     */   private final ao b;
/*     */   
/*     */   public b(ao ☃, ao ao1) {
/*  75 */     super(af.b());
/*  76 */     this.a = ☃;
/*  77 */     this.b = ao1;
/*     */   }
/*     */   
/*     */   public static b c() {
/*  81 */     return new b(ao.a, ao.a);
/*     */   }
/*     */   
/*     */   public boolean a(tf ☃, anw anw1, aob aob1) {
/*  85 */     if (!this.a.a(☃, anw1)) {
/*  86 */       return false;
/*     */     }
/*  88 */     if (!this.b.a(☃, aob1)) {
/*  89 */       return false;
/*     */     }
/*  91 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public JsonElement b() {
/*  96 */     JsonObject ☃ = new JsonObject();
/*     */     
/*  98 */     ☃.add("zombie", this.a.a());
/*  99 */     ☃.add("villager", this.b.a());
/*     */     
/* 101 */     return (JsonElement)☃;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\af$b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */