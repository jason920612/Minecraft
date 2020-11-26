/*     */ import com.google.gson.JsonArray;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonParseException;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */   implements avm<avq>
/*     */ {
/*     */   public avq b(pc ☃, JsonObject jsonObject) {
/*  90 */     String str = xj.a(jsonObject, "group", "");
/*  91 */     ez<avh> ez = a(xj.u(jsonObject, "ingredients"));
/*  92 */     if (ez.isEmpty())
/*  93 */       throw new JsonParseException("No ingredients for shapeless recipe"); 
/*  94 */     if (ez.size() > 9) {
/*  95 */       throw new JsonParseException("Too many ingredients for shapeless recipe");
/*     */     }
/*     */     
/*  98 */     ate ate = avp.a(xj.t(jsonObject, "result"));
/*  99 */     return new avq(☃, str, ate, ez);
/*     */   }
/*     */   
/*     */   private static ez<avh> a(JsonArray ☃) {
/* 103 */     ez<avh> ez = ez.a();
/*     */     
/* 105 */     for (int i = 0; i < ☃.size(); i++) {
/* 106 */       avh avh = avh.a(☃.get(i));
/* 107 */       if (!avh.d()) {
/* 108 */         ez.add(avh);
/*     */       }
/*     */     } 
/*     */     
/* 112 */     return ez;
/*     */   }
/*     */ 
/*     */   
/*     */   public String a() {
/* 117 */     return "crafting_shapeless";
/*     */   }
/*     */ 
/*     */   
/*     */   public avq b(pc ☃, hy hy1) {
/* 122 */     String str = hy1.e(32767);
/* 123 */     int i = hy1.g();
/* 124 */     ez<avh> ez = ez.a(i, avh.a);
/* 125 */     for (int j = 0; j < ez.size(); j++) {
/* 126 */       ez.set(j, avh.b(hy1));
/*     */     }
/* 128 */     ate ate = hy1.k();
/* 129 */     return new avq(☃, str, ate, ez);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(hy ☃, avq avq1) {
/* 134 */     ☃.a(avq.a(avq1));
/* 135 */     ☃.d(avq.b(avq1).size());
/* 136 */     for (avh avh : avq.b(avq1)) {
/* 137 */       avh.a(☃);
/*     */     }
/* 139 */     ☃.a(avq.c(avq1));
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\avq$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */