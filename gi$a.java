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
/*     */ public class a
/*     */   implements ge
/*     */ {
/*     */   private final pc a;
/*     */   private final String b;
/*     */   private final avh c;
/*     */   private final ata d;
/*     */   private final float e;
/*     */   private final int f;
/*     */   private final l.a g;
/*     */   private final pc h;
/*     */   
/*     */   public a(pc ☃, String str, avh avh1, ata ata1, float f, int i, l.a a1, pc pc1) {
/*  90 */     this.a = ☃;
/*  91 */     this.b = str;
/*  92 */     this.c = avh1;
/*  93 */     this.d = ata1;
/*  94 */     this.e = f;
/*  95 */     this.f = i;
/*  96 */     this.g = a1;
/*  97 */     this.h = pc1;
/*     */   }
/*     */ 
/*     */   
/*     */   public JsonObject a() {
/* 102 */     JsonObject ☃ = new JsonObject();
/* 103 */     ☃.addProperty("type", "smelting");
/*     */     
/* 105 */     if (!this.b.isEmpty()) {
/* 106 */       ☃.addProperty("group", this.b);
/*     */     }
/*     */     
/* 109 */     ☃.add("ingredient", this.c.c());
/* 110 */     ☃.addProperty("result", fc.s.b(this.d).toString());
/* 111 */     ☃.addProperty("experience", Float.valueOf(this.e));
/* 112 */     ☃.addProperty("cookingtime", Integer.valueOf(this.f));
/*     */     
/* 114 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public pc b() {
/* 119 */     return this.a;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public JsonObject c() {
/* 125 */     return this.g.b();
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public pc d() {
/* 131 */     return this.h;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\gi$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */