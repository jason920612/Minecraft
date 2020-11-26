/*    */ import com.google.common.collect.Maps;
/*    */ import java.util.Collection;
/*    */ import java.util.Locale;
/*    */ import java.util.Map;
/*    */ import java.util.Set;
/*    */ 
/*    */ 
/*    */ public class xl<V>
/*    */   implements Map<String, V>
/*    */ {
/* 11 */   private final Map<String, V> a = Maps.newLinkedHashMap();
/*    */ 
/*    */   
/*    */   public int size() {
/* 15 */     return this.a.size();
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isEmpty() {
/* 20 */     return this.a.isEmpty();
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean containsKey(Object ☃) {
/* 25 */     return this.a.containsKey(☃.toString().toLowerCase(Locale.ROOT));
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean containsValue(Object ☃) {
/* 30 */     return this.a.containsValue(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public V get(Object ☃) {
/* 35 */     return this.a.get(☃.toString().toLowerCase(Locale.ROOT));
/*    */   }
/*    */ 
/*    */   
/*    */   public V a(String ☃, V v) {
/* 40 */     return this.a.put(☃.toLowerCase(Locale.ROOT), v);
/*    */   }
/*    */ 
/*    */   
/*    */   public V remove(Object ☃) {
/* 45 */     return this.a.remove(☃.toString().toLowerCase(Locale.ROOT));
/*    */   }
/*    */ 
/*    */   
/*    */   public void putAll(Map<? extends String, ? extends V> ☃) {
/* 50 */     for (Map.Entry<? extends String, ? extends V> entry : ☃.entrySet()) {
/* 51 */       a(entry.getKey(), entry.getValue());
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public void clear() {
/* 57 */     this.a.clear();
/*    */   }
/*    */ 
/*    */   
/*    */   public Set<String> keySet() {
/* 62 */     return this.a.keySet();
/*    */   }
/*    */ 
/*    */   
/*    */   public Collection<V> values() {
/* 67 */     return this.a.values();
/*    */   }
/*    */ 
/*    */   
/*    */   public Set<Map.Entry<String, V>> entrySet() {
/* 72 */     return this.a.entrySet();
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\xl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */