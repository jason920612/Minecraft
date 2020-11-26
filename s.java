/*    */ import com.google.gson.JsonDeserializationContext;
/*    */ import com.google.gson.JsonObject;
/*    */ 
/*    */ 
/*    */ 
/*    */ public interface s<T extends t>
/*    */ {
/*    */   pc a();
/*    */   
/*    */   void a(pm parampm, a<T> parama);
/*    */   
/*    */   void b(pm parampm, a<T> parama);
/*    */   
/*    */   void a(pm parampm);
/*    */   
/*    */   T a(JsonObject paramJsonObject, JsonDeserializationContext paramJsonDeserializationContext);
/*    */   
/*    */   public static class a<T extends t>
/*    */   {
/*    */     private final T a;
/*    */     private final l b;
/*    */     private final String c;
/*    */     
/*    */     public a(T ☃, l l1, String str) {
/* 25 */       this.a = ☃;
/* 26 */       this.b = l1;
/* 27 */       this.c = str;
/*    */     }
/*    */     
/*    */     public T a() {
/* 31 */       return this.a;
/*    */     }
/*    */     
/*    */     public void a(pm ☃) {
/* 35 */       ☃.a(this.b, this.c);
/*    */     }
/*    */ 
/*    */     
/*    */     public boolean equals(Object ☃) {
/* 40 */       if (this == ☃) {
/* 41 */         return true;
/*    */       }
/* 43 */       if (☃ == null || getClass() != ☃.getClass()) {
/* 44 */         return false;
/*    */       }
/*    */       
/* 47 */       a<?> a1 = (a)☃;
/*    */       
/* 49 */       if (!this.a.equals(a1.a)) {
/* 50 */         return false;
/*    */       }
/* 52 */       if (!this.b.equals(a1.b)) {
/* 53 */         return false;
/*    */       }
/* 55 */       return this.c.equals(a1.c);
/*    */     }
/*    */ 
/*    */     
/*    */     public int hashCode() {
/* 60 */       int ☃ = this.a.hashCode();
/* 61 */       ☃ = 31 * ☃ + this.b.hashCode();
/* 62 */       ☃ = 31 * ☃ + this.c.hashCode();
/* 63 */       return ☃;
/*    */     }
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\s.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */