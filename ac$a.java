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
/*     */ class a
/*     */ {
/*     */   private final pm a;
/* 109 */   private final Set<s.a<ac.b>> b = Sets.newHashSet();
/*     */   
/*     */   public a(pm ☃) {
/* 112 */     this.a = ☃;
/*     */   }
/*     */   
/*     */   public boolean a() {
/* 116 */     return this.b.isEmpty();
/*     */   }
/*     */   
/*     */   public void a(s.a<ac.b> ☃) {
/* 120 */     this.b.add(☃);
/*     */   }
/*     */   
/*     */   public void b(s.a<ac.b> ☃) {
/* 124 */     this.b.remove(☃);
/*     */   }
/*     */   
/*     */   public void a(tf ☃, Collection<? extends aer> collection) {
/* 128 */     List<s.a<ac.b>> list = null;
/* 129 */     for (s.a<ac.b> a1 : this.b) {
/* 130 */       if (((ac.b)a1.a()).a(☃, collection)) {
/* 131 */         if (list == null) {
/* 132 */           list = Lists.newArrayList();
/*     */         }
/* 134 */         list.add(a1);
/*     */       } 
/*     */     } 
/* 137 */     if (list != null)
/* 138 */       for (s.a<ac.b> a1 : list)
/* 139 */         a1.a(this.a);  
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\ac$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */