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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class a
/*     */ {
/*     */   private final ba.d a;
/*     */   private final ba.d b;
/*     */   @Nullable
/*     */   private final Boolean c;
/*     */   @Nullable
/*     */   private final Boolean d;
/*     */   
/*     */   public a(ba.d ☃, ba.d d1, @Nullable Boolean bool1, @Nullable Boolean bool2) {
/* 118 */     this.a = ☃;
/* 119 */     this.b = d1;
/* 120 */     this.c = bool1;
/* 121 */     this.d = bool2;
/*     */   }
/*     */   
/*     */   public a() {
/* 125 */     this(ba.d.e, ba.d.e, null, null);
/*     */   }
/*     */   
/*     */   public boolean a(@Nullable aek ☃) {
/* 129 */     if (☃ == null) {
/* 130 */       return false;
/*     */     }
/* 132 */     if (!this.a.d(☃.c())) {
/* 133 */       return false;
/*     */     }
/* 135 */     if (!this.b.d(☃.b())) {
/* 136 */       return false;
/*     */     }
/* 138 */     if (this.c != null && this.c.booleanValue() != ☃.d()) {
/* 139 */       return false;
/*     */     }
/* 141 */     if (this.d != null && this.d.booleanValue() != ☃.e()) {
/* 142 */       return false;
/*     */     }
/* 144 */     return true;
/*     */   }
/*     */   
/*     */   public JsonElement a() {
/* 148 */     JsonObject ☃ = new JsonObject();
/*     */     
/* 150 */     ☃.add("amplifier", this.a.d());
/* 151 */     ☃.add("duration", this.b.d());
/* 152 */     ☃.addProperty("ambient", this.c);
/* 153 */     ☃.addProperty("visible", this.d);
/*     */     
/* 155 */     return (JsonElement)☃;
/*     */   }
/*     */   
/*     */   public static a a(JsonObject ☃) {
/* 159 */     ba.d d1 = ba.d.a(☃.get("amplifier"));
/* 160 */     ba.d d2 = ba.d.a(☃.get("duration"));
/* 161 */     Boolean bool1 = ☃.has("ambient") ? Boolean.valueOf(xj.j(☃, "ambient")) : null;
/* 162 */     Boolean bool2 = ☃.has("visible") ? Boolean.valueOf(xj.j(☃, "visible")) : null;
/* 163 */     return new a(d1, d2, bool1, bool2);
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bb$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */