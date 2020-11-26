/*    */ import com.google.common.collect.Lists;
/*    */ import com.google.common.collect.Maps;
/*    */ import com.google.common.collect.Sets;
/*    */ import com.google.gson.JsonDeserializationContext;
/*    */ import com.google.gson.JsonObject;
/*    */ import java.util.Map;
/*    */ import java.util.Set;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bj
/*    */   implements s<bj.b>
/*    */ {
/* 17 */   public static final pc a = new pc("tick");
/*    */   
/* 19 */   private final Map<pm, a> b = Maps.newHashMap();
/*    */ 
/*    */   
/*    */   public pc a() {
/* 23 */     return a;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(pm ☃, s.a<b> a1) {
/* 28 */     a a2 = this.b.get(☃);
/* 29 */     if (a2 == null) {
/* 30 */       a2 = new a(☃);
/* 31 */       this.b.put(☃, a2);
/*    */     } 
/* 33 */     a2.a(a1);
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(pm ☃, s.a<b> a1) {
/* 38 */     a a2 = this.b.get(☃);
/* 39 */     if (a2 != null) {
/* 40 */       a2.b(a1);
/* 41 */       if (a2.a()) {
/* 42 */         this.b.remove(☃);
/*    */       }
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(pm ☃) {
/* 49 */     this.b.remove(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public b b(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext) {
/* 54 */     return new b();
/*    */   }
/*    */   
/*    */   public void a(tf ☃) {
/* 58 */     a a = this.b.get(☃.L());
/* 59 */     if (a != null)
/* 60 */       a.b(); 
/*    */   }
/*    */   
/*    */   public static class b
/*    */     extends y {
/*    */     public b() {
/* 66 */       super(bj.a);
/*    */     }
/*    */   }
/*    */   
/*    */   static class a {
/*    */     private final pm a;
/* 72 */     private final Set<s.a<bj.b>> b = Sets.newHashSet();
/*    */     
/*    */     public a(pm ☃) {
/* 75 */       this.a = ☃;
/*    */     }
/*    */     
/*    */     public boolean a() {
/* 79 */       return this.b.isEmpty();
/*    */     }
/*    */     
/*    */     public void a(s.a<bj.b> ☃) {
/* 83 */       this.b.add(☃);
/*    */     }
/*    */     
/*    */     public void b(s.a<bj.b> ☃) {
/* 87 */       this.b.remove(☃);
/*    */     }
/*    */     
/*    */     public void b() {
/* 91 */       for (s.a<bj.b> ☃ : (Iterable<s.a<bj.b>>)Lists.newArrayList(this.b))
/* 92 */         ☃.a(this.a); 
/*    */     }
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */