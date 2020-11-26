/*    */ import com.google.common.collect.Maps;
/*    */ import java.util.Map;
/*    */ import java.util.function.Predicate;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class blp
/*    */   implements Predicate<blc>
/*    */ {
/*    */   public static final Predicate<blc> a = ☃ -> true;
/*    */   private final ble<bcs, blc> b;
/* 17 */   private final Map<bmm<?>, Predicate<Object>> c = Maps.newHashMap();
/*    */   
/*    */   private blp(ble<bcs, blc> ☃) {
/* 20 */     this.b = ☃;
/*    */   }
/*    */   
/*    */   public static blp a(bcs ☃) {
/* 24 */     return new blp(☃.o());
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean a(@Nullable blc ☃) {
/* 33 */     if (☃ == null || !☃.c().equals(this.b.c())) {
/* 34 */       return false;
/*    */     }
/*    */     
/* 37 */     if (this.c.isEmpty()) {
/* 38 */       return true;
/*    */     }
/*    */     
/* 41 */     for (Map.Entry<bmm<?>, Predicate<Object>> entry : this.c.entrySet()) {
/* 42 */       if (!a(☃, (bmm<Comparable>)entry.getKey(), entry.getValue())) {
/* 43 */         return false;
/*    */       }
/*    */     } 
/*    */     
/* 47 */     return true;
/*    */   }
/*    */   
/*    */   protected <T extends Comparable<T>> boolean a(blc ☃, bmm<T> bmm1, Predicate<Object> predicate) {
/* 51 */     T t = (T)☃.c(bmm1);
/* 52 */     return predicate.test(t);
/*    */   }
/*    */   
/*    */   public <V extends Comparable<V>> blp a(bmm<V> ☃, Predicate<Object> predicate) {
/* 56 */     if (!this.b.d().contains(☃)) {
/* 57 */       throw new IllegalArgumentException(this.b + " cannot support property " + ☃);
/*    */     }
/* 59 */     this.c.put(☃, predicate);
/* 60 */     return this;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\blp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */