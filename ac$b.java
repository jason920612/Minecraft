/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import java.util.Collection;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */   private final ao[] a;
/*     */   
/*     */   public b(ao[] ☃) {
/*  73 */     super(ac.b());
/*  74 */     this.a = ☃;
/*     */   }
/*     */   
/*     */   public static b a(ao... ☃) {
/*  78 */     return new b(☃);
/*     */   }
/*     */   
/*     */   public boolean a(tf ☃, Collection<? extends aer> collection) {
/*  82 */     for (ao ao1 : this.a) {
/*  83 */       boolean bool = false;
/*  84 */       for (aer aer : collection) {
/*  85 */         if (ao1.a(☃, aer)) {
/*  86 */           bool = true;
/*     */           break;
/*     */         } 
/*     */       } 
/*  90 */       if (!bool) {
/*  91 */         return false;
/*     */       }
/*     */     } 
/*  94 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public JsonElement b() {
/*  99 */     JsonObject ☃ = new JsonObject();
/*     */     
/* 101 */     ☃.add("victims", ao.a(this.a));
/*     */     
/* 103 */     return (JsonElement)☃;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\ac$b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */