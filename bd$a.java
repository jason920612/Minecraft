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
/*     */ class a
/*     */ {
/*     */   private final pm a;
/* 114 */   private final Set<s.a<bd.b>> b = Sets.newHashSet();
/*     */   
/*     */   public a(pm ☃) {
/* 117 */     this.a = ☃;
/*     */   }
/*     */   
/*     */   public boolean a() {
/* 121 */     return this.b.isEmpty();
/*     */   }
/*     */   
/*     */   public void a(s.a<bd.b> ☃) {
/* 125 */     this.b.add(☃);
/*     */   }
/*     */   
/*     */   public void b(s.a<bd.b> ☃) {
/* 129 */     this.b.remove(☃);
/*     */   }
/*     */   
/*     */   public void a(td ☃, cee cee1, double d1, double d2, double d3) {
/* 133 */     List<s.a<bd.b>> list = null;
/* 134 */     for (s.a<bd.b> a1 : this.b) {
/* 135 */       if (((bd.b)a1.a()).a(☃, cee1, d1, d2, d3)) {
/* 136 */         if (list == null) {
/* 137 */           list = Lists.newArrayList();
/*     */         }
/* 139 */         list.add(a1);
/*     */       } 
/*     */     } 
/* 142 */     if (list != null)
/* 143 */       for (s.a<bd.b> a1 : list)
/* 144 */         a1.a(this.a);  
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bd$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */