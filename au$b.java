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
/*     */   private final av a;
/*     */   private final ba.d b;
/*     */   private final ba.d c;
/*     */   
/*     */   public b(av ☃, ba.d d1, ba.d d2) {
/*  76 */     super(au.b());
/*  77 */     this.a = ☃;
/*  78 */     this.b = d1;
/*  79 */     this.c = d2;
/*     */   }
/*     */   
/*     */   public static b a(av ☃, ba.d d1) {
/*  83 */     return new b(☃, d1, ba.d.e);
/*     */   }
/*     */   
/*     */   public boolean a(ate ☃, int i) {
/*  87 */     if (!this.a.a(☃)) {
/*  88 */       return false;
/*     */     }
/*  90 */     if (!this.b.d(☃.h() - i)) {
/*  91 */       return false;
/*     */     }
/*  93 */     if (!this.c.d(☃.g() - i)) {
/*  94 */       return false;
/*     */     }
/*  96 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public JsonElement b() {
/* 101 */     JsonObject ☃ = new JsonObject();
/*     */     
/* 103 */     ☃.add("item", this.a.a());
/* 104 */     ☃.add("durability", this.b.d());
/* 105 */     ☃.add("delta", this.c.d());
/*     */     
/* 107 */     return (JsonElement)☃;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\au$b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */