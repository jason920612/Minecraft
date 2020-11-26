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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class b
/*     */   implements ci.d
/*     */ {
/*     */   private final int a;
/*     */   
/*     */   public b(int ☃) {
/* 206 */     this.a = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public ho a(ho ☃) throws CommandSyntaxException {
/* 211 */     if (☃ instanceof gx) {
/* 212 */       gx<?> gx = (gx)☃;
/* 213 */       if (gx.size() > this.a) {
/* 214 */         return (ho)gx.c(this.a);
/*     */       }
/*     */     } 
/* 217 */     throw ci.c().create(Integer.valueOf(this.a));
/*     */   }
/*     */ 
/*     */   
/*     */   public ho a(ho ☃, Supplier<ho> supplier) throws CommandSyntaxException {
/* 222 */     return a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public ho a() {
/* 227 */     return new he();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ho ☃, ho ho1) throws CommandSyntaxException {
/* 232 */     if (☃ instanceof gx) {
/* 233 */       gx<?> gx = (gx)☃;
/* 234 */       if (gx.size() > this.a) {
/* 235 */         gx.a(this.a, ho1);
/*     */         return;
/*     */       } 
/*     */     } 
/* 239 */     throw ci.c().create(Integer.valueOf(this.a));
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(ho ☃) throws CommandSyntaxException {
/* 244 */     if (☃ instanceof gx) {
/* 245 */       gx<?> gx = (gx)☃;
/* 246 */       if (gx.size() > this.a) {
/* 247 */         gx.b(this.a);
/*     */         return;
/*     */       } 
/*     */     } 
/* 251 */     throw ci.c().create(Integer.valueOf(this.a));
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\ci$b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */