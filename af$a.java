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
/* 107 */   private final Set<s.a<af.b>> b = Sets.newHashSet();
/*     */   
/*     */   public a(pm ☃) {
/* 110 */     this.a = ☃;
/*     */   }
/*     */   
/*     */   public boolean a() {
/* 114 */     return this.b.isEmpty();
/*     */   }
/*     */   
/*     */   public void a(s.a<af.b> ☃) {
/* 118 */     this.b.add(☃);
/*     */   }
/*     */   
/*     */   public void b(s.a<af.b> ☃) {
/* 122 */     this.b.remove(☃);
/*     */   }
/*     */   
/*     */   public void a(tf ☃, anw anw1, aob aob1) {
/* 126 */     List<s.a<af.b>> list = null;
/* 127 */     for (s.a<af.b> a1 : this.b) {
/* 128 */       if (((af.b)a1.a()).a(☃, anw1, aob1)) {
/* 129 */         if (list == null) {
/* 130 */           list = Lists.newArrayList();
/*     */         }
/* 132 */         list.add(a1);
/*     */       } 
/*     */     } 
/* 135 */     if (list != null)
/* 136 */       for (s.a<af.b> a1 : list)
/* 137 */         a1.a(this.a);  
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\af$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */