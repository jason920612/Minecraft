/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Sets;
/*     */ import java.util.List;
/*     */ import java.util.Set;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */ {
/*     */   private final pm a;
/* 158 */   private final Set<s.a<am.b>> b = Sets.newHashSet();
/*     */   
/*     */   public a(pm ☃) {
/* 161 */     this.a = ☃;
/*     */   }
/*     */   
/*     */   public boolean a() {
/* 165 */     return this.b.isEmpty();
/*     */   }
/*     */   
/*     */   public void a(s.a<am.b> ☃) {
/* 169 */     this.b.add(☃);
/*     */   }
/*     */   
/*     */   public void b(s.a<am.b> ☃) {
/* 173 */     this.b.remove(☃);
/*     */   }
/*     */   
/*     */   public void a(blc ☃) {
/* 177 */     List<s.a<am.b>> list = null;
/* 178 */     for (s.a<am.b> a1 : this.b) {
/* 179 */       if (((am.b)a1.a()).a(☃)) {
/* 180 */         if (list == null) {
/* 181 */           list = Lists.newArrayList();
/*     */         }
/* 183 */         list.add(a1);
/*     */       } 
/*     */     } 
/* 186 */     if (list != null)
/* 187 */       for (s.a<am.b> a1 : list)
/* 188 */         a1.a(this.a);  
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\am$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */