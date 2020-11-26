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
/*     */ public class b
/*     */   extends y
/*     */ {
/*     */   @Nullable
/*     */   private final bod a;
/*     */   @Nullable
/*     */   private final bod b;
/*     */   
/*     */   public b(@Nullable bod ☃, @Nullable bod bod1) {
/*  78 */     super(ab.b());
/*  79 */     this.a = ☃;
/*  80 */     this.b = bod1;
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
/*     */   public static b a(bod ☃) {
/*  92 */     return new b(null, ☃);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean b(bod ☃, bod bod1) {
/* 100 */     if (this.a != null && this.a != ☃) {
/* 101 */       return false;
/*     */     }
/* 103 */     if (this.b != null && this.b != bod1) {
/* 104 */       return false;
/*     */     }
/* 106 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public JsonElement b() {
/* 111 */     JsonObject ☃ = new JsonObject();
/* 112 */     if (this.a != null) {
/* 113 */       ☃.addProperty("from", bod.a(this.a).toString());
/*     */     }
/* 115 */     if (this.b != null) {
/* 116 */       ☃.addProperty("to", bod.a(this.b).toString());
/*     */     }
/* 118 */     return (JsonElement)☃;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\ab$b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */