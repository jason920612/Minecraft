/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Sets;
/*     */ import java.util.Collection;
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
/*     */ class a
/*     */ {
/*     */   private final pm a;
/* 131 */   private final Set<s.a<ar.b>> b = Sets.newHashSet();
/*     */   
/*     */   public a(pm ☃) {
/* 134 */     this.a = ☃;
/*     */   }
/*     */   
/*     */   public boolean a() {
/* 138 */     return this.b.isEmpty();
/*     */   }
/*     */   
/*     */   public void a(s.a<ar.b> ☃) {
/* 142 */     this.b.add(☃);
/*     */   }
/*     */   
/*     */   public void b(s.a<ar.b> ☃) {
/* 146 */     this.b.remove(☃);
/*     */   }
/*     */   
/*     */   public void a(tf ☃, ate ate1, amg amg1, Collection<ate> collection) {
/* 150 */     List<s.a<ar.b>> list = null;
/* 151 */     for (s.a<ar.b> a1 : this.b) {
/* 152 */       if (((ar.b)a1.a()).a(☃, ate1, amg1, collection)) {
/* 153 */         if (list == null) {
/* 154 */           list = Lists.newArrayList();
/*     */         }
/* 156 */         list.add(a1);
/*     */       } 
/*     */     } 
/* 159 */     if (list != null)
/* 160 */       for (s.a<ar.b> a1 : list)
/* 161 */         a1.a(this.a);  
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\ar$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */