/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ enum a
/*     */ {
/* 227 */   a("grant")
/*     */   {
/*     */     protected boolean a(tf ☃, l l1) {
/* 230 */       n n = ☃.L().b(l1);
/* 231 */       if (n.a()) {
/* 232 */         return false;
/*     */       }
/* 234 */       for (String str : n.e()) {
/* 235 */         ☃.L().a(l1, str);
/*     */       }
/* 237 */       return true;
/*     */     }
/*     */ 
/*     */     
/*     */     protected boolean a(tf ☃, l l1, String str) {
/* 242 */       return ☃.L().a(l1, str);
/*     */     }
/*     */   },
/* 245 */   b("revoke")
/*     */   {
/*     */     protected boolean a(tf ☃, l l1) {
/* 248 */       n n = ☃.L().b(l1);
/* 249 */       if (!n.b()) {
/* 250 */         return false;
/*     */       }
/* 252 */       for (String str : n.f()) {
/* 253 */         ☃.L().b(l1, str);
/*     */       }
/* 255 */       return true;
/*     */     }
/*     */ 
/*     */     
/*     */     protected boolean a(tf ☃, l l1, String str) {
/* 260 */       return ☃.L().b(l1, str);
/*     */     }
/*     */   };
/*     */ 
/*     */   
/*     */   private final String c;
/*     */   
/*     */   a(String ☃) {
/* 268 */     this.c = "commands.advancement." + ☃;
/*     */   }
/*     */   
/*     */   public int a(tf ☃, Iterable<l> iterable) {
/* 272 */     int i = 0;
/* 273 */     for (l l : iterable) {
/* 274 */       if (a(☃, l)) {
/* 275 */         i++;
/*     */       }
/*     */     } 
/* 278 */     return i;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String a() {
/* 286 */     return this.c;
/*     */   }
/*     */   
/*     */   protected abstract boolean a(tf paramtf, l paraml);
/*     */   
/*     */   protected abstract boolean a(tf paramtf, l paraml, String paramString);
/*     */ }


/* Location:              F:\dw\server.jar!\px$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */