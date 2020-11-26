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
/*     */ class a
/*     */ {
/*     */   private final pm a;
/* 112 */   private final Set<s.a<aa.b>> b = Sets.newHashSet();
/*     */   
/*     */   public a(pm ☃) {
/* 115 */     this.a = ☃;
/*     */   }
/*     */   
/*     */   public boolean a() {
/* 119 */     return this.b.isEmpty();
/*     */   }
/*     */   
/*     */   public void a(s.a<aa.b> ☃) {
/* 123 */     this.b.add(☃);
/*     */   }
/*     */   
/*     */   public void b(s.a<aa.b> ☃) {
/* 127 */     this.b.remove(☃);
/*     */   }
/*     */   
/*     */   public void a(aut ☃) {
/* 131 */     List<s.a<aa.b>> list = null;
/* 132 */     for (s.a<aa.b> a1 : this.b) {
/* 133 */       if (((aa.b)a1.a()).a(☃)) {
/* 134 */         if (list == null) {
/* 135 */           list = Lists.newArrayList();
/*     */         }
/* 137 */         list.add(a1);
/*     */       } 
/*     */     } 
/* 140 */     if (list != null)
/* 141 */       for (s.a<aa.b> a1 : list)
/* 142 */         a1.a(this.a);  
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\aa$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */