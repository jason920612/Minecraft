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
/*     */ class a
/*     */ {
/*     */   private final pm a;
/* 127 */   private final Set<s.a<bf.b>> b = Sets.newHashSet();
/*     */   
/*     */   public a(pm ☃) {
/* 130 */     this.a = ☃;
/*     */   }
/*     */   
/*     */   public boolean a() {
/* 134 */     return this.b.isEmpty();
/*     */   }
/*     */   
/*     */   public void a(s.a<bf.b> ☃) {
/* 138 */     this.b.add(☃);
/*     */   }
/*     */   
/*     */   public void b(s.a<bf.b> ☃) {
/* 142 */     this.b.remove(☃);
/*     */   }
/*     */   
/*     */   public void a(tf ☃, aer aer1, aea aea1, float f1, float f2, boolean bool) {
/* 146 */     List<s.a<bf.b>> list = null;
/* 147 */     for (s.a<bf.b> a1 : this.b) {
/* 148 */       if (((bf.b)a1.a()).a(☃, aer1, aea1, f1, f2, bool)) {
/* 149 */         if (list == null) {
/* 150 */           list = Lists.newArrayList();
/*     */         }
/* 152 */         list.add(a1);
/*     */       } 
/*     */     } 
/* 155 */     if (list != null)
/* 156 */       for (s.a<bf.b> a1 : list)
/* 157 */         a1.a(this.a);  
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bf$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */