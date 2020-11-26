/*    */ import com.google.common.collect.Maps;
/*    */ import java.util.Iterator;
/*    */ import java.util.Map;
/*    */ import java.util.NoSuchElementException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ex
/*    */ {
/*    */   public static <K, V> Map<K, V> b(Iterable<K> ☃, Iterable<V> iterable) {
/* 15 */     return a(☃, iterable, Maps.newLinkedHashMap());
/*    */   }
/*    */   
/*    */   public static <K, V> Map<K, V> a(Iterable<K> ☃, Iterable<V> iterable, Map<K, V> map) {
/* 19 */     Iterator<V> iterator = iterable.iterator();
/* 20 */     for (K k : ☃) {
/* 21 */       map.put(k, iterator.next());
/*    */     }
/*    */     
/* 24 */     if (iterator.hasNext()) {
/* 25 */       throw new NoSuchElementException();
/*    */     }
/*    */     
/* 28 */     return map;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\ex.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */