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
/*     */ class a
/*     */ {
/*     */   private final pm a;
/*  91 */   private final Set<s.a<bg.b>> b = Sets.newHashSet();
/*     */   
/*     */   public a(pm ☃) {
/*  94 */     this.a = ☃;
/*     */   }
/*     */   
/*     */   public boolean a() {
/*  98 */     return this.b.isEmpty();
/*     */   }
/*     */   
/*     */   public void a(s.a<bg.b> ☃) {
/* 102 */     this.b.add(☃);
/*     */   }
/*     */   
/*     */   public void b(s.a<bg.b> ☃) {
/* 106 */     this.b.remove(☃);
/*     */   }
/*     */   
/*     */   public void a(avk ☃) {
/* 110 */     List<s.a<bg.b>> list = null;
/* 111 */     for (s.a<bg.b> a1 : this.b) {
/* 112 */       if (((bg.b)a1.a()).a(☃)) {
/* 113 */         if (list == null) {
/* 114 */           list = Lists.newArrayList();
/*     */         }
/* 116 */         list.add(a1);
/*     */       } 
/*     */     } 
/* 119 */     if (list != null)
/* 120 */       for (s.a<bg.b> a1 : list)
/* 121 */         a1.a(this.a);  
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bg$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */