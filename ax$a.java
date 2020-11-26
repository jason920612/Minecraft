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
/* 106 */   private final Set<s.a<ax.b>> b = Sets.newHashSet();
/*     */   
/*     */   public a(pm ☃) {
/* 109 */     this.a = ☃;
/*     */   }
/*     */   
/*     */   public boolean a() {
/* 113 */     return this.b.isEmpty();
/*     */   }
/*     */   
/*     */   public void a(s.a<ax.b> ☃) {
/* 117 */     this.b.add(☃);
/*     */   }
/*     */   
/*     */   public void b(s.a<ax.b> ☃) {
/* 121 */     this.b.remove(☃);
/*     */   }
/*     */   
/*     */   public void a(tf ☃, cee cee1, int i) {
/* 125 */     List<s.a<ax.b>> list = null;
/* 126 */     for (s.a<ax.b> a1 : this.b) {
/* 127 */       if (((ax.b)a1.a()).a(☃, cee1, i)) {
/* 128 */         if (list == null) {
/* 129 */           list = Lists.newArrayList();
/*     */         }
/* 131 */         list.add(a1);
/*     */       } 
/*     */     } 
/* 134 */     if (list != null)
/* 135 */       for (s.a<ax.b> a1 : list)
/* 136 */         a1.a(this.a);  
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\ax$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */