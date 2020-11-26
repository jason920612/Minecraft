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
/*     */ class a
/*     */ {
/*     */   private final pm a;
/* 107 */   private final Set<s.a<bk.b>> b = Sets.newHashSet();
/*     */   
/*     */   public a(pm ☃) {
/* 110 */     this.a = ☃;
/*     */   }
/*     */   
/*     */   public boolean a() {
/* 114 */     return this.b.isEmpty();
/*     */   }
/*     */   
/*     */   public void a(s.a<bk.b> ☃) {
/* 118 */     this.b.add(☃);
/*     */   }
/*     */   
/*     */   public void b(s.a<bk.b> ☃) {
/* 122 */     this.b.remove(☃);
/*     */   }
/*     */   
/*     */   public void a(tf ☃, aob aob1, ate ate1) {
/* 126 */     List<s.a<bk.b>> list = null;
/* 127 */     for (s.a<bk.b> a1 : this.b) {
/* 128 */       if (((bk.b)a1.a()).a(☃, aob1, ate1)) {
/* 129 */         if (list == null) {
/* 130 */           list = Lists.newArrayList();
/*     */         }
/* 132 */         list.add(a1);
/*     */       } 
/*     */     } 
/* 135 */     if (list != null)
/* 136 */       for (s.a<bk.b> a1 : list)
/* 137 */         a1.a(this.a);  
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bk$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */