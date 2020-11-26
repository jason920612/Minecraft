/*    */ import com.google.common.collect.Lists;
/*    */ import com.google.common.collect.Sets;
/*    */ import java.util.Set;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ class a
/*    */ {
/*    */   private final pm a;
/* 72 */   private final Set<s.a<bj.b>> b = Sets.newHashSet();
/*    */   
/*    */   public a(pm ☃) {
/* 75 */     this.a = ☃;
/*    */   }
/*    */   
/*    */   public boolean a() {
/* 79 */     return this.b.isEmpty();
/*    */   }
/*    */   
/*    */   public void a(s.a<bj.b> ☃) {
/* 83 */     this.b.add(☃);
/*    */   }
/*    */   
/*    */   public void b(s.a<bj.b> ☃) {
/* 87 */     this.b.remove(☃);
/*    */   }
/*    */   
/*    */   public void b() {
/* 91 */     for (s.a<bj.b> ☃ : (Iterable<s.a<bj.b>>)Lists.newArrayList(this.b))
/* 92 */       ☃.a(this.a); 
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bj$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */