/*    */ import java.util.IdentityHashMap;
/*    */ import java.util.Iterator;
/*    */ import java.util.Map;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class wr<T>
/*    */   implements Iterable<wp<T>>
/*    */ {
/*    */   private final fc<T> a;
/* 11 */   private final Map<T, wp<T>> b = new IdentityHashMap<>();
/*    */   
/*    */   public wr(fc<T> ☃) {
/* 14 */     this.a = ☃;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public wp<T> a(T ☃, wq wq1) {
/* 23 */     return this.b.computeIfAbsent(☃, object -> new wp<>(this, (T)object, ☃));
/*    */   }
/*    */   
/*    */   public fc<T> a() {
/* 27 */     return this.a;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Iterator<wp<T>> iterator() {
/* 36 */     return this.b.values().iterator();
/*    */   }
/*    */   
/*    */   public wp<T> b(T ☃) {
/* 40 */     return a(☃, wq.DEFAULT);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\wr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */