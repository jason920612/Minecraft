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
/*     */ 
/*     */ 
/*     */ public class b
/*     */   extends y
/*     */ {
/*     */   private final ao a;
/*     */   private final ah b;
/*     */   
/*     */   public b(pc ☃, ao ao1, ah ah1) {
/*  77 */     super(☃);
/*  78 */     this.a = ao1;
/*  79 */     this.b = ah1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static b a(ao.a ☃) {
/*  87 */     return new b(aw.a(p.b), ☃.b(), ah.a);
/*     */   }
/*     */   
/*     */   public static b c() {
/*  91 */     return new b(aw.a(p.b), ao.a, ah.a);
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
/*     */   public static b a(ao.a ☃, ah.a a1) {
/* 107 */     return new b(aw.a(p.b), ☃.b(), a1.b());
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
/*     */   public static b d() {
/* 119 */     return new b(aw.a(p.c), ao.a, ah.a);
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
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(tf ☃, aer aer1, aea aea1) {
/* 139 */     if (!this.b.a(☃, aea1)) {
/* 140 */       return false;
/*     */     }
/* 142 */     return this.a.a(☃, aer1);
/*     */   }
/*     */ 
/*     */   
/*     */   public JsonElement b() {
/* 147 */     JsonObject ☃ = new JsonObject();
/*     */     
/* 149 */     ☃.add("entity", this.a.a());
/* 150 */     ☃.add("killing_blow", this.b.a());
/*     */     
/* 152 */     return (JsonElement)☃;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\aw$b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */