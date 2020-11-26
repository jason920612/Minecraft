/*    */ import java.util.Objects;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class wp<T>
/*    */   extends cff
/*    */ {
/*    */   private final wq o;
/*    */   private final T p;
/*    */   private final wr<T> q;
/*    */   
/*    */   protected wp(wr<T> ☃, T t, wq wq1) {
/* 16 */     super(a(☃, t));
/* 17 */     this.q = ☃;
/* 18 */     this.o = wq1;
/* 19 */     this.p = t;
/*    */   }
/*    */   
/*    */   public static <T> String a(wr<T> ☃, T t) {
/* 23 */     return a(fc.w.b(☃)) + ":" + a(☃.a().b(t));
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   private static <T> String a(@Nullable pc ☃) {
/* 29 */     return ☃.toString().replace(':', '.');
/*    */   }
/*    */   
/*    */   public wr<T> a() {
/* 33 */     return this.q;
/*    */   }
/*    */   
/*    */   public T b() {
/* 37 */     return this.p;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean equals(Object ☃) {
/* 46 */     return (this == ☃ || (☃ instanceof wp && Objects.equals(c(), ((wp)☃).c())));
/*    */   }
/*    */ 
/*    */   
/*    */   public int hashCode() {
/* 51 */     return c().hashCode();
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 56 */     return "Stat{name=" + 
/* 57 */       c() + ", formatter=" + this.o + '}';
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\wp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */