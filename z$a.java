/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Sets;
/*     */ import java.util.List;
/*     */ import java.util.Set;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/* 114 */   private final Set<s.a<z.b>> b = Sets.newHashSet();
/*     */   
/*     */   public a(pm ☃) {
/* 117 */     this.a = ☃;
/*     */   }
/*     */   
/*     */   public boolean a() {
/* 121 */     return this.b.isEmpty();
/*     */   }
/*     */   
/*     */   public void a(s.a<z.b> ☃) {
/* 125 */     this.b.add(☃);
/*     */   }
/*     */   
/*     */   public void b(s.a<z.b> ☃) {
/* 129 */     this.b.remove(☃);
/*     */   }
/*     */   
/*     */   public void a(tf ☃, ajq ajq1, ajq ajq2, @Nullable aeo aeo1) {
/* 133 */     List<s.a<z.b>> list = null;
/* 134 */     for (s.a<z.b> a1 : this.b) {
/* 135 */       if (((z.b)a1.a()).a(☃, ajq1, ajq2, aeo1)) {
/* 136 */         if (list == null) {
/* 137 */           list = Lists.newArrayList();
/*     */         }
/* 139 */         list.add(a1);
/*     */       } 
/*     */     } 
/* 142 */     if (list != null)
/* 143 */       for (s.a<z.b> a1 : list)
/* 144 */         a1.a(this.a);  
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\z$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */