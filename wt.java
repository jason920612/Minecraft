/*    */ import it.unimi.dsi.fastutil.objects.Object2IntMap;
/*    */ import it.unimi.dsi.fastutil.objects.Object2IntMaps;
/*    */ import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class wt
/*    */ {
/*  9 */   protected final Object2IntMap<wp<?>> a = Object2IntMaps.synchronize((Object2IntMap)new Object2IntOpenHashMap());
/*    */   
/*    */   public wt() {
/* 12 */     this.a.defaultReturnValue(0);
/*    */   }
/*    */   
/*    */   public void b(aog ☃, wp<?> wp1, int i) {
/* 16 */     a(☃, wp1, a(wp1) + i);
/*    */   }
/*    */   
/*    */   public void a(aog ☃, wp<?> wp1, int i) {
/* 20 */     this.a.put(wp1, i);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int a(wp<?> ☃) {
/* 28 */     return this.a.getInt(☃);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\wt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */