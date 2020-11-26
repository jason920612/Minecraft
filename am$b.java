/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import java.util.Map;
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
/*     */ public class b
/*     */   extends y
/*     */ {
/*     */   private final bcs a;
/*     */   private final Map<bmm<?>, Object> b;
/*     */   
/*     */   public b(@Nullable bcs ☃, @Nullable Map<bmm<?>, Object> map) {
/* 113 */     super(am.b());
/* 114 */     this.a = ☃;
/* 115 */     this.b = map;
/*     */   }
/*     */   
/*     */   public static b a(bcs ☃) {
/* 119 */     return new b(☃, null);
/*     */   }
/*     */ 
/*     */   
/*     */   public JsonElement b() {
/* 124 */     JsonObject ☃ = new JsonObject();
/*     */     
/* 126 */     if (this.a != null) {
/* 127 */       ☃.addProperty("block", fc.g.b(this.a).toString());
/*     */       
/* 129 */       if (this.b != null && !this.b.isEmpty()) {
/* 130 */         JsonObject jsonObject = new JsonObject();
/* 131 */         for (Map.Entry<bmm<?>, ?> entry : this.b.entrySet()) {
/* 132 */           jsonObject.addProperty(((bmm)entry.getKey()).a(), k.a((bmm<Comparable>)entry.getKey(), entry.getValue()));
/*     */         }
/* 134 */         ☃.add("state", (JsonElement)jsonObject);
/*     */       } 
/*     */     } 
/*     */     
/* 138 */     return (JsonElement)☃;
/*     */   }
/*     */   
/*     */   public boolean a(blc ☃) {
/* 142 */     if (this.a != null && ☃.c() != this.a) {
/* 143 */       return false;
/*     */     }
/* 145 */     if (this.b != null) {
/* 146 */       for (Map.Entry<bmm<?>, Object> entry : this.b.entrySet()) {
/* 147 */         if (☃.c(entry.getKey()) != entry.getValue()) {
/* 148 */           return false;
/*     */         }
/*     */       } 
/*     */     }
/* 152 */     return true;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\am$b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */