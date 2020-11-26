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
/*     */ class a
/*     */ {
/*     */   private final pm a;
/* 113 */   private final Set<s.a<au.b>> b = Sets.newHashSet();
/*     */   
/*     */   public a(pm ☃) {
/* 116 */     this.a = ☃;
/*     */   }
/*     */   
/*     */   public boolean a() {
/* 120 */     return this.b.isEmpty();
/*     */   }
/*     */   
/*     */   public void a(s.a<au.b> ☃) {
/* 124 */     this.b.add(☃);
/*     */   }
/*     */   
/*     */   public void b(s.a<au.b> ☃) {
/* 128 */     this.b.remove(☃);
/*     */   }
/*     */   
/*     */   public void a(ate ☃, int i) {
/* 132 */     List<s.a<au.b>> list = null;
/* 133 */     for (s.a<au.b> a1 : this.b) {
/* 134 */       if (((au.b)a1.a()).a(☃, i)) {
/* 135 */         if (list == null) {
/* 136 */           list = Lists.newArrayList();
/*     */         }
/* 138 */         list.add(a1);
/*     */       } 
/*     */     } 
/* 141 */     if (list != null)
/* 142 */       for (s.a<au.b> a1 : list)
/* 143 */         a1.a(this.a);  
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\au$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */