/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class c
/*     */ {
/*     */   private final String a;
/*     */   private final ci.d[] b;
/*     */   
/*     */   public c(String ☃, ci.d[] arrayOfD) {
/*  91 */     this.a = ☃;
/*  92 */     this.b = arrayOfD;
/*     */   }
/*     */   
/*     */   public ho a(ho ☃) throws CommandSyntaxException {
/*  96 */     for (ci.d d1 : this.b) {
/*  97 */       ☃ = d1.a(☃);
/*     */     }
/*  99 */     return ☃;
/*     */   }
/*     */   
/*     */   public ho a(ho ☃, ho ho1) throws CommandSyntaxException {
/* 103 */     for (int i = 0; i < this.b.length; i++) {
/* 104 */       ci.d d1 = this.b[i];
/* 105 */       if (i < this.b.length - 1) {
/* 106 */         int j = i + 1;
/* 107 */         ☃ = d1.a(☃, () -> this.b[☃].a());
/*     */       } else {
/* 109 */         d1.a(☃, ho1);
/*     */       } 
/*     */     } 
/* 112 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 117 */     return this.a;
/*     */   }
/*     */   
/*     */   public void b(ho ☃) throws CommandSyntaxException {
/* 121 */     for (int i = 0; i < this.b.length; i++) {
/* 122 */       ci.d d1 = this.b[i];
/* 123 */       if (i < this.b.length - 1) {
/* 124 */         ☃ = d1.a(☃);
/*     */       } else {
/* 126 */         d1.b(☃);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\ci$c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */