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
/*     */   private final av b;
/*     */   
/*     */   public b(ao ☃, av av1) {
/*  75 */     super(bk.b());
/*  76 */     this.a = ☃;
/*  77 */     this.b = av1;
/*     */   }
/*     */   
/*     */   public static b c() {
/*  81 */     return new b(ao.a, av.a);
/*     */   }
/*     */   
/*     */   public boolean a(tf ☃, aob aob1, ate ate1) {
/*  85 */     if (!this.a.a(☃, aob1)) {
/*  86 */       return false;
/*     */     }
/*  88 */     if (!this.b.a(ate1)) {
/*  89 */       return false;
/*     */     }
/*  91 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public JsonElement b() {
/*  96 */     JsonObject ☃ = new JsonObject();
/*     */     
/*  98 */     ☃.add("item", this.b.a());
/*  99 */     ☃.add("villager", this.a.a());
/*     */     
/* 101 */     return (JsonElement)☃;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bk$b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */