/*    */ import it.unimi.dsi.fastutil.objects.Object2IntMap;
/*    */ import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
/*    */ import it.unimi.dsi.fastutil.objects.ObjectIterator;
/*    */ import java.io.IOException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class jg
/*    */   implements iv<iy>
/*    */ {
/*    */   private Object2IntMap<wp<?>> a;
/*    */   
/*    */   public jg() {}
/*    */   
/*    */   public jg(Object2IntMap<wp<?>> ☃) {
/* 22 */     this.a = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(iy ☃) {
/* 27 */     ☃.a(this);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void a(hy ☃) throws IOException {
/* 34 */     int i = ☃.g();
/* 35 */     this.a = (Object2IntMap<wp<?>>)new Object2IntOpenHashMap(i);
/*    */     
/* 37 */     for (int j = 0; j < i; j++) {
/* 38 */       a(fc.w.a(☃.g()), ☃);
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   private <T> void a(wr<T> ☃, hy hy1) {
/* 44 */     int i = hy1.g();
/* 45 */     int j = hy1.g();
/* 46 */     this.a.put(☃.b(☃.a().a(i)), j);
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(hy ☃) throws IOException {
/* 51 */     ☃.d(this.a.size());
/* 52 */     for (ObjectIterator<Object2IntMap.Entry<wp<?>>> objectIterator = this.a.object2IntEntrySet().iterator(); objectIterator.hasNext(); ) { Object2IntMap.Entry<wp<?>> entry = objectIterator.next();
/* 53 */       wp<?> wp = (wp)entry.getKey();
/* 54 */       ☃.d(fc.w.a(wp.a()));
/* 55 */       ☃.d(a(wp));
/* 56 */       ☃.d(entry.getIntValue()); }
/*    */   
/*    */   }
/*    */   
/*    */   private <T> int a(wp<T> ☃) {
/* 61 */     return ☃.a().a().a(☃.b());
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\jg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */