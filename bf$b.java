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
/*     */   private final ag a;
/*     */   private final ao b;
/*     */   
/*     */   public b(ag ☃, ao ao1) {
/*  75 */     super(bf.b());
/*  76 */     this.a = ☃;
/*  77 */     this.b = ao1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static b a(ag.a ☃) {
/*  89 */     return new b(☃.b(), ao.a);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(tf ☃, aer aer1, aea aea1, float f1, float f2, boolean bool) {
/* 105 */     if (!this.a.a(☃, aea1, f1, f2, bool)) {
/* 106 */       return false;
/*     */     }
/* 108 */     if (!this.b.a(☃, aer1)) {
/* 109 */       return false;
/*     */     }
/* 111 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public JsonElement b() {
/* 116 */     JsonObject ☃ = new JsonObject();
/*     */     
/* 118 */     ☃.add("damage", this.a.a());
/* 119 */     ☃.add("entity", this.b.a());
/*     */     
/* 121 */     return (JsonElement)☃;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bf$b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */