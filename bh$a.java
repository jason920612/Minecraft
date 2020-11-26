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
/*     */ class a
/*     */ {
/*     */   private final pm a;
/*  96 */   private final Set<s.a<bh.b>> b = Sets.newHashSet();
/*     */   
/*     */   public a(pm ☃) {
/*  99 */     this.a = ☃;
/*     */   }
/*     */   
/*     */   public boolean a() {
/* 103 */     return this.b.isEmpty();
/*     */   }
/*     */   
/*     */   public void a(s.a<bh.b> ☃) {
/* 107 */     this.b.add(☃);
/*     */   }
/*     */   
/*     */   public void b(s.a<bh.b> ☃) {
/* 111 */     this.b.remove(☃);
/*     */   }
/*     */   
/*     */   public void a(tf ☃, aer aer1) {
/* 115 */     List<s.a<bh.b>> list = null;
/* 116 */     for (s.a<bh.b> a1 : this.b) {
/* 117 */       if (((bh.b)a1.a()).a(☃, aer1)) {
/* 118 */         if (list == null) {
/* 119 */           list = Lists.newArrayList();
/*     */         }
/* 121 */         list.add(a1);
/*     */       } 
/*     */     } 
/* 124 */     if (list != null)
/* 125 */       for (s.a<bh.b> a1 : list)
/* 126 */         a1.a(this.a);  
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bh$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */