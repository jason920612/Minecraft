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
/*     */ 
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
/*     */ {
/* 122 */   public static final a a = new a((pc)null);
/*     */   
/*     */   @Nullable
/*     */   private final pc b;
/*     */   private boolean c;
/*     */   private br d;
/*     */   
/*     */   public a(@Nullable pc ☃) {
/* 130 */     this.b = ☃;
/*     */   }
/*     */   
/*     */   public a(br ☃) {
/* 134 */     this.b = null;
/* 135 */     this.d = ☃;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public br a(pp ☃) {
/* 140 */     if (!this.c) {
/* 141 */       if (this.b != null) {
/* 142 */         this.d = ☃.a(this.b);
/*     */       }
/* 144 */       this.c = true;
/*     */     } 
/* 146 */     return this.d;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public pc a() {
/* 151 */     return (this.d != null) ? br.a(this.d) : this.b;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\br$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */