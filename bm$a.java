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
/*     */ class a
/*     */ {
/*     */   private final pm a;
/* 103 */   private final Set<s.a<bm.b>> b = Sets.newHashSet();
/*     */   
/*     */   public a(pm ☃) {
/* 106 */     this.a = ☃;
/*     */   }
/*     */   
/*     */   public boolean a() {
/* 110 */     return this.b.isEmpty();
/*     */   }
/*     */   
/*     */   public void a(s.a<bm.b> ☃) {
/* 114 */     this.b.add(☃);
/*     */   }
/*     */   
/*     */   public void b(s.a<bm.b> ☃) {
/* 118 */     this.b.remove(☃);
/*     */   }
/*     */   
/*     */   public void a(ate ☃) {
/* 122 */     List<s.a<bm.b>> list = null;
/* 123 */     for (s.a<bm.b> a1 : this.b) {
/* 124 */       if (((bm.b)a1.a()).a(☃)) {
/* 125 */         if (list == null) {
/* 126 */           list = Lists.newArrayList();
/*     */         }
/* 128 */         list.add(a1);
/*     */       } 
/*     */     } 
/* 131 */     if (list != null)
/* 132 */       for (s.a<bm.b> a1 : list)
/* 133 */         a1.a(this.a);  
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bm$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */