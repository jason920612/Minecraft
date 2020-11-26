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
/*     */ class a
/*     */ {
/*     */   private final pm a;
/* 100 */   private final Set<s.a<bi.b>> b = Sets.newHashSet();
/*     */   
/*     */   public a(pm ☃) {
/* 103 */     this.a = ☃;
/*     */   }
/*     */   
/*     */   public boolean a() {
/* 107 */     return this.b.isEmpty();
/*     */   }
/*     */   
/*     */   public void a(s.a<bi.b> ☃) {
/* 111 */     this.b.add(☃);
/*     */   }
/*     */   
/*     */   public void b(s.a<bi.b> ☃) {
/* 115 */     this.b.remove(☃);
/*     */   }
/*     */   
/*     */   public void a(tf ☃, ajq ajq1) {
/* 119 */     List<s.a<bi.b>> list = null;
/* 120 */     for (s.a<bi.b> a1 : this.b) {
/* 121 */       if (((bi.b)a1.a()).a(☃, ajq1)) {
/* 122 */         if (list == null) {
/* 123 */           list = Lists.newArrayList();
/*     */         }
/* 125 */         list.add(a1);
/*     */       } 
/*     */     } 
/* 128 */     if (list != null)
/* 129 */       for (s.a<bi.b> a1 : list)
/* 130 */         a1.a(this.a);  
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bi$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */