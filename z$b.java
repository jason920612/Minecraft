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
/*     */ public class b
/*     */   extends y
/*     */ {
/*     */   private final ao a;
/*     */   private final ao b;
/*     */   private final ao c;
/*     */   
/*     */   public b(ao ☃, ao ao1, ao ao2) {
/*  78 */     super(z.b());
/*  79 */     this.a = ☃;
/*  80 */     this.b = ao1;
/*  81 */     this.c = ao2;
/*     */   }
/*     */   
/*     */   public static b c() {
/*  85 */     return new b(ao.a, ao.a, ao.a);
/*     */   }
/*     */   
/*     */   public static b a(ao.a ☃) {
/*  89 */     return new b(☃.b(), ao.a, ao.a);
/*     */   }
/*     */   
/*     */   public boolean a(tf ☃, ajq ajq1, ajq ajq2, @Nullable aeo aeo1) {
/*  93 */     if (!this.c.a(☃, aeo1)) {
/*  94 */       return false;
/*     */     }
/*     */     
/*  97 */     return ((this.a.a(☃, ajq1) && this.b.a(☃, ajq2)) || (this.a.a(☃, ajq2) && this.b.a(☃, ajq1)));
/*     */   }
/*     */ 
/*     */   
/*     */   public JsonElement b() {
/* 102 */     JsonObject ☃ = new JsonObject();
/*     */     
/* 104 */     ☃.add("parent", this.a.a());
/* 105 */     ☃.add("partner", this.b.a());
/* 106 */     ☃.add("child", this.c.a());
/*     */     
/* 108 */     return (JsonElement)☃;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\z$b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */