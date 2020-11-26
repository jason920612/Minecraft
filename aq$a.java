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
/*     */ class a
/*     */ {
/*     */   private final pm a;
/*  99 */   private final Set<s.a<aq.b>> b = Sets.newHashSet();
/*     */   
/*     */   public a(pm ☃) {
/* 102 */     this.a = ☃;
/*     */   }
/*     */   
/*     */   public boolean a() {
/* 106 */     return this.b.isEmpty();
/*     */   }
/*     */   
/*     */   public void a(s.a<aq.b> ☃) {
/* 110 */     this.b.add(☃);
/*     */   }
/*     */   
/*     */   public void b(s.a<aq.b> ☃) {
/* 114 */     this.b.remove(☃);
/*     */   }
/*     */   
/*     */   public void a(ate ☃) {
/* 118 */     List<s.a<aq.b>> list = null;
/* 119 */     for (s.a<aq.b> a1 : this.b) {
/* 120 */       if (((aq.b)a1.a()).a(☃)) {
/* 121 */         if (list == null) {
/* 122 */           list = Lists.newArrayList();
/*     */         }
/* 124 */         list.add(a1);
/*     */       } 
/*     */     } 
/* 127 */     if (list != null)
/* 128 */       for (s.a<aq.b> a1 : list)
/* 129 */         a1.a(this.a);  
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\aq$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */