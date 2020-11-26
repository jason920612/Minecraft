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
/*     */ class a
/*     */ {
/*     */   private final pm a;
/*  95 */   private final Set<s.a<aj.b>> b = Sets.newHashSet();
/*     */   
/*     */   public a(pm ☃) {
/*  98 */     this.a = ☃;
/*     */   }
/*     */   
/*     */   public boolean a() {
/* 102 */     return this.b.isEmpty();
/*     */   }
/*     */   
/*     */   public void a(s.a<aj.b> ☃) {
/* 106 */     this.b.add(☃);
/*     */   }
/*     */   
/*     */   public void b(s.a<aj.b> ☃) {
/* 110 */     this.b.remove(☃);
/*     */   }
/*     */   
/*     */   public void a(tf ☃) {
/* 114 */     List<s.a<aj.b>> list = null;
/* 115 */     for (s.a<aj.b> a1 : this.b) {
/* 116 */       if (((aj.b)a1.a()).a(☃)) {
/* 117 */         if (list == null) {
/* 118 */           list = Lists.newArrayList();
/*     */         }
/* 120 */         list.add(a1);
/*     */       } 
/*     */     } 
/* 123 */     if (list != null)
/* 124 */       for (s.a<aj.b> a1 : list)
/* 125 */         a1.a(this.a);  
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\aj$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */