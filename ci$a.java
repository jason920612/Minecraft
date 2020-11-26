/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import java.util.function.Supplier;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class a
/*     */   implements ci.d
/*     */ {
/*     */   private final String a;
/*     */   
/*     */   public a(String ☃) {
/* 148 */     this.a = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public ho a(ho ☃) throws CommandSyntaxException {
/* 153 */     if (☃ instanceof gy) {
/* 154 */       return ((gy)☃).c(this.a);
/*     */     }
/* 156 */     throw ci.b().create(this.a);
/*     */   }
/*     */ 
/*     */   
/*     */   public ho a(ho ☃, Supplier<ho> supplier) throws CommandSyntaxException {
/* 161 */     if (☃ instanceof gy) {
/* 162 */       gy gy = (gy)☃;
/* 163 */       if (gy.e(this.a)) {
/* 164 */         return gy.c(this.a);
/*     */       }
/* 166 */       ho ho1 = supplier.get();
/* 167 */       gy.a(this.a, ho1);
/* 168 */       return ho1;
/*     */     } 
/*     */     
/* 171 */     throw ci.b().create(this.a);
/*     */   }
/*     */ 
/*     */   
/*     */   public ho a() {
/* 176 */     return new gy();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ho ☃, ho ho1) throws CommandSyntaxException {
/* 181 */     if (☃ instanceof gy) {
/* 182 */       gy gy = (gy)☃;
/* 183 */       gy.a(this.a, ho1);
/*     */       return;
/*     */     } 
/* 186 */     throw ci.b().create(this.a);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(ho ☃) throws CommandSyntaxException {
/* 191 */     if (☃ instanceof gy) {
/* 192 */       gy gy = (gy)☃;
/* 193 */       if (gy.e(this.a)) {
/* 194 */         gy.r(this.a);
/*     */         return;
/*     */       } 
/*     */     } 
/* 198 */     throw ci.b().create(this.a);
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\ci$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */