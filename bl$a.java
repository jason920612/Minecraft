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
/*     */ class a
/*     */ {
/*     */   private final pm a;
/*  84 */   private final Set<s.a<bl.b>> b = Sets.newHashSet();
/*     */   
/*     */   public a(pm ☃) {
/*  87 */     this.a = ☃;
/*     */   }
/*     */   
/*     */   public boolean a() {
/*  91 */     return this.b.isEmpty();
/*     */   }
/*     */   
/*     */   public void a(s.a<bl.b> ☃) {
/*  95 */     this.b.add(☃);
/*     */   }
/*     */   
/*     */   public void b(s.a<bl.b> ☃) {
/*  99 */     this.b.remove(☃);
/*     */   }
/*     */   
/*     */   public void a(double ☃) {
/* 103 */     List<s.a<bl.b>> list = null;
/* 104 */     for (s.a<bl.b> a1 : this.b) {
/* 105 */       if (((bl.b)a1.a()).a(☃)) {
/* 106 */         if (list == null) {
/* 107 */           list = Lists.newArrayList();
/*     */         }
/* 109 */         list.add(a1);
/*     */       } 
/*     */     } 
/* 112 */     if (list != null)
/* 113 */       for (s.a<bl.b> a1 : list)
/* 114 */         a1.a(this.a);  
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bl$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */