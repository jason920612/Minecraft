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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class b
/*     */   extends y
/*     */ {
/*     */   private final av a;
/*     */   private final ao b;
/*     */   private final av c;
/*     */   
/*     */   public b(av ☃, ao ao1, av av1) {
/*  79 */     super(ar.b());
/*  80 */     this.a = ☃;
/*  81 */     this.b = ao1;
/*  82 */     this.c = av1;
/*     */   }
/*     */   
/*     */   public static b a(av ☃, ao ao1, av av1) {
/*  86 */     return new b(☃, ao1, av1);
/*     */   }
/*     */   
/*     */   public boolean a(tf ☃, ate ate1, amg amg1, Collection<ate> collection) {
/*  90 */     if (!this.a.a(ate1)) {
/*  91 */       return false;
/*     */     }
/*  93 */     if (!this.b.a(☃, amg1.a)) {
/*  94 */       return false;
/*     */     }
/*  96 */     if (this.c != av.a) {
/*  97 */       boolean bool = false;
/*  98 */       if (amg1.a instanceof amm) {
/*  99 */         amm amm = (amm)amg1.a;
/* 100 */         if (this.c.a(amm.i())) {
/* 101 */           bool = true;
/*     */         }
/*     */       } 
/* 104 */       for (ate ate2 : collection) {
/* 105 */         if (this.c.a(ate2)) {
/* 106 */           bool = true;
/*     */           break;
/*     */         } 
/*     */       } 
/* 110 */       if (!bool) {
/* 111 */         return false;
/*     */       }
/*     */     } 
/* 114 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public JsonElement b() {
/* 119 */     JsonObject ☃ = new JsonObject();
/*     */     
/* 121 */     ☃.add("rod", this.a.a());
/* 122 */     ☃.add("entity", this.b.a());
/* 123 */     ☃.add("item", this.c.a());
/*     */     
/* 125 */     return (JsonElement)☃;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\ar$b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */