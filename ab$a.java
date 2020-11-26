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
/*     */ class a
/*     */ {
/*     */   private final pm a;
/* 124 */   private final Set<s.a<ab.b>> b = Sets.newHashSet();
/*     */   
/*     */   public a(pm ☃) {
/* 127 */     this.a = ☃;
/*     */   }
/*     */   
/*     */   public boolean a() {
/* 131 */     return this.b.isEmpty();
/*     */   }
/*     */   
/*     */   public void a(s.a<ab.b> ☃) {
/* 135 */     this.b.add(☃);
/*     */   }
/*     */   
/*     */   public void b(s.a<ab.b> ☃) {
/* 139 */     this.b.remove(☃);
/*     */   }
/*     */   
/*     */   public void a(bod ☃, bod bod1) {
/* 143 */     List<s.a<ab.b>> list = null;
/* 144 */     for (s.a<ab.b> a1 : this.b) {
/* 145 */       if (((ab.b)a1.a()).b(☃, bod1)) {
/* 146 */         if (list == null) {
/* 147 */           list = Lists.newArrayList();
/*     */         }
/* 149 */         list.add(a1);
/*     */       } 
/*     */     } 
/* 152 */     if (list != null)
/* 153 */       for (s.a<ab.b> a1 : list)
/* 154 */         a1.a(this.a);  
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\ab$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */