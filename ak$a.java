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
/*     */ class a
/*     */ {
/*     */   private final pm a;
/* 106 */   private final Set<s.a<ak.b>> b = Sets.newHashSet();
/*     */   
/*     */   public a(pm ☃) {
/* 109 */     this.a = ☃;
/*     */   }
/*     */   
/*     */   public boolean a() {
/* 113 */     return this.b.isEmpty();
/*     */   }
/*     */   
/*     */   public void a(s.a<ak.b> ☃) {
/* 117 */     this.b.add(☃);
/*     */   }
/*     */   
/*     */   public void b(s.a<ak.b> ☃) {
/* 121 */     this.b.remove(☃);
/*     */   }
/*     */   
/*     */   public void a(ate ☃, int i) {
/* 125 */     List<s.a<ak.b>> list = null;
/* 126 */     for (s.a<ak.b> a1 : this.b) {
/* 127 */       if (((ak.b)a1.a()).a(☃, i)) {
/* 128 */         if (list == null) {
/* 129 */           list = Lists.newArrayList();
/*     */         }
/* 131 */         list.add(a1);
/*     */       } 
/*     */     } 
/* 134 */     if (list != null)
/* 135 */       for (s.a<ak.b> a1 : list)
/* 136 */         a1.a(this.a);  
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\ak$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */