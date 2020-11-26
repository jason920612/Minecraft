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
/*     */ class a
/*     */ {
/*     */   private final pm a;
/* 104 */   private final Set<s.a<ae.b>> b = Sets.newHashSet();
/*     */   
/*     */   public a(pm ☃) {
/* 107 */     this.a = ☃;
/*     */   }
/*     */   
/*     */   public boolean a() {
/* 111 */     return this.b.isEmpty();
/*     */   }
/*     */   
/*     */   public void a(s.a<ae.b> ☃) {
/* 115 */     this.b.add(☃);
/*     */   }
/*     */   
/*     */   public void b(s.a<ae.b> ☃) {
/* 119 */     this.b.remove(☃);
/*     */   }
/*     */   
/*     */   public void a(ate ☃) {
/* 123 */     List<s.a<ae.b>> list = null;
/* 124 */     for (s.a<ae.b> a1 : this.b) {
/* 125 */       if (((ae.b)a1.a()).a(☃)) {
/* 126 */         if (list == null) {
/* 127 */           list = Lists.newArrayList();
/*     */         }
/* 129 */         list.add(a1);
/*     */       } 
/*     */     } 
/* 132 */     if (list != null)
/* 133 */       for (s.a<ae.b> a1 : list)
/* 134 */         a1.a(this.a);  
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\ae$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */