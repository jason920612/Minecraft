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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/* 180 */   private final Set<s.a<be.b>> b = Sets.newHashSet();
/*     */   
/*     */   public a(pm ☃) {
/* 183 */     this.a = ☃;
/*     */   }
/*     */   
/*     */   public boolean a() {
/* 187 */     return this.b.isEmpty();
/*     */   }
/*     */   
/*     */   public void a(s.a<be.b> ☃) {
/* 191 */     this.b.add(☃);
/*     */   }
/*     */   
/*     */   public void b(s.a<be.b> ☃) {
/* 195 */     this.b.remove(☃);
/*     */   }
/*     */   
/*     */   public void a(blc ☃, el el1, td td1, ate ate1) {
/* 199 */     List<s.a<be.b>> list = null;
/* 200 */     for (s.a<be.b> a1 : this.b) {
/* 201 */       if (((be.b)a1.a()).a(☃, el1, td1, ate1)) {
/* 202 */         if (list == null) {
/* 203 */           list = Lists.newArrayList();
/*     */         }
/* 205 */         list.add(a1);
/*     */       } 
/*     */     } 
/* 208 */     if (list != null)
/* 209 */       for (s.a<be.b> a1 : list)
/* 210 */         a1.a(this.a);  
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\be$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */