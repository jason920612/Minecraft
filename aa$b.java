/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */   private final aut a;
/*     */   
/*     */   public b(@Nullable aut ☃) {
/*  83 */     super(aa.b());
/*  84 */     this.a = ☃;
/*     */   }
/*     */   
/*     */   public static b c() {
/*  88 */     return new b(null);
/*     */   }
/*     */   
/*     */   public boolean a(aut ☃) {
/*  92 */     if (this.a != null && this.a != ☃) {
/*  93 */       return false;
/*     */     }
/*  95 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public JsonElement b() {
/* 100 */     JsonObject ☃ = new JsonObject();
/*     */     
/* 102 */     if (this.a != null) {
/* 103 */       ☃.addProperty("potion", fc.j.b(this.a).toString());
/*     */     }
/*     */     
/* 106 */     return (JsonElement)☃;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\aa$b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */