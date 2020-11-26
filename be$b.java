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
/*     */   private final ay c;
/*     */   private final av d;
/*     */   
/*     */   public b(@Nullable bcs ☃, @Nullable Map<bmm<?>, Object> map, ay ay1, av av1) {
/* 122 */     super(be.b());
/* 123 */     this.a = ☃;
/* 124 */     this.b = map;
/* 125 */     this.c = ay1;
/* 126 */     this.d = av1;
/*     */   }
/*     */   
/*     */   public static b a(bcs ☃) {
/* 130 */     return new b(☃, null, ay.a, av.a);
/*     */   }
/*     */   
/*     */   public boolean a(blc ☃, el el1, td td1, ate ate1) {
/* 134 */     if (this.a != null && ☃.c() != this.a) {
/* 135 */       return false;
/*     */     }
/* 137 */     if (this.b != null) {
/* 138 */       for (Map.Entry<bmm<?>, Object> entry : this.b.entrySet()) {
/* 139 */         if (☃.c(entry.getKey()) != entry.getValue()) {
/* 140 */           return false;
/*     */         }
/*     */       } 
/*     */     }
/* 144 */     if (!this.c.a(td1, el1.o(), el1.p(), el1.q())) {
/* 145 */       return false;
/*     */     }
/* 147 */     if (!this.d.a(ate1)) {
/* 148 */       return false;
/*     */     }
/* 150 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public JsonElement b() {
/* 155 */     JsonObject ☃ = new JsonObject();
/*     */     
/* 157 */     if (this.a != null) {
/* 158 */       ☃.addProperty("block", fc.g.b(this.a).toString());
/*     */     }
/*     */     
/* 161 */     if (this.b != null) {
/* 162 */       JsonObject jsonObject = new JsonObject();
/*     */       
/* 164 */       for (Map.Entry<bmm<?>, Object> entry : this.b.entrySet()) {
/* 165 */         jsonObject.addProperty(((bmm)entry.getKey()).a(), k.a((bmm<Comparable>)entry.getKey(), entry.getValue()));
/*     */       }
/*     */       
/* 168 */       ☃.add("state", (JsonElement)jsonObject);
/*     */     } 
/*     */     
/* 171 */     ☃.add("location", this.c.a());
/* 172 */     ☃.add("item", this.d.a());
/*     */     
/* 174 */     return (JsonElement)☃;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\be$b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */