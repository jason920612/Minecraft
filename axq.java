/*    */ import it.unimi.dsi.fastutil.longs.Long2LongLinkedOpenHashMap;
/*    */ import it.unimi.dsi.fastutil.longs.Long2LongMap;
/*    */ import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
/*    */ import it.unimi.dsi.fastutil.objects.ObjectIterator;
/*    */ import java.util.Map;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class axq<T>
/*    */   extends Long2ObjectOpenHashMap<T>
/*    */ {
/*    */   private final int a;
/* 13 */   private final Long2LongMap b = (Long2LongMap)new Long2LongLinkedOpenHashMap();
/*    */   
/*    */   public axq(int ☃, int i) {
/* 16 */     super(☃);
/* 17 */     this.a = i;
/*    */   }
/*    */   
/*    */   private void a(long ☃) {
/* 21 */     long l = k.b();
/* 22 */     this.b.put(☃, l);
/*    */     
/* 24 */     ObjectIterator<Long2LongMap.Entry> objectIterator = this.b.long2LongEntrySet().iterator();
/* 25 */     while (objectIterator.hasNext()) {
/* 26 */       Long2LongMap.Entry entry = (Long2LongMap.Entry)objectIterator.next();
/* 27 */       T t = (T)super.get(entry.getLongKey());
/* 28 */       if (l - entry.getLongValue() > this.a) {
/* 29 */         if (t != null && a(t)) {
/* 30 */           super.remove(entry.getLongKey());
/* 31 */           objectIterator.remove();
/*    */         } 
/*    */       }
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected boolean a(T ☃) {
/* 40 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public T put(long ☃, T t) {
/* 45 */     a(☃);
/* 46 */     return (T)super.put(☃, t);
/*    */   }
/*    */ 
/*    */   
/*    */   public T put(Long ☃, T t) {
/* 51 */     a(☃.longValue());
/* 52 */     return (T)super.put(☃, t);
/*    */   }
/*    */ 
/*    */   
/*    */   public T get(long ☃) {
/* 57 */     a(☃);
/* 58 */     return (T)super.get(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public void putAll(Map<? extends Long, ? extends T> ☃) {
/* 63 */     throw new RuntimeException("Not implemented");
/*    */   }
/*    */ 
/*    */   
/*    */   public T remove(long ☃) {
/* 68 */     throw new RuntimeException("Not implemented");
/*    */   }
/*    */ 
/*    */   
/*    */   public T remove(Object ☃) {
/* 73 */     throw new RuntimeException("Not implemented");
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\axq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */