/*     */ import com.google.gson.JsonArray;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import java.util.List;
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
/*     */ public class a
/*     */   implements ge
/*     */ {
/*     */   private final pc a;
/*     */   private final ata b;
/*     */   private final int c;
/*     */   private final String d;
/*     */   private final List<avh> e;
/*     */   private final l.a f;
/*     */   private final pc g;
/*     */   
/*     */   public a(pc ☃, ata ata1, int i, String str, List<avh> list, l.a a1, pc pc1) {
/* 120 */     this.a = ☃;
/* 121 */     this.b = ata1;
/* 122 */     this.c = i;
/* 123 */     this.d = str;
/* 124 */     this.e = list;
/* 125 */     this.f = a1;
/* 126 */     this.g = pc1;
/*     */   }
/*     */ 
/*     */   
/*     */   public JsonObject a() {
/* 131 */     JsonObject ☃ = new JsonObject();
/* 132 */     ☃.addProperty("type", "crafting_shapeless");
/*     */     
/* 134 */     if (!this.d.isEmpty()) {
/* 135 */       ☃.addProperty("group", this.d);
/*     */     }
/*     */     
/* 138 */     JsonArray jsonArray = new JsonArray();
/* 139 */     for (avh avh : this.e) {
/* 140 */       jsonArray.add(avh.c());
/*     */     }
/* 142 */     ☃.add("ingredients", (JsonElement)jsonArray);
/*     */     
/* 144 */     JsonObject jsonObject1 = new JsonObject();
/* 145 */     jsonObject1.addProperty("item", fc.s.b(this.b).toString());
/* 146 */     if (this.c > 1) {
/* 147 */       jsonObject1.addProperty("count", Integer.valueOf(this.c));
/*     */     }
/* 149 */     ☃.add("result", (JsonElement)jsonObject1);
/*     */     
/* 151 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public pc b() {
/* 156 */     return this.a;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public JsonObject c() {
/* 162 */     return this.f.b();
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public pc d() {
/* 168 */     return this.g;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\gh$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */