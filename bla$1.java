/*    */ import java.util.Map;
/*    */ import java.util.function.Function;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ final class null
/*    */   implements Function<Map.Entry<bmm<?>, Comparable<?>>, String>
/*    */ {
/*    */   public String a(@Nullable Map.Entry<bmm<?>, Comparable<?>> ☃) {
/* 22 */     if (☃ == null) {
/* 23 */       return "<NULL>";
/*    */     }
/*    */     
/* 26 */     bmm<?> bmm = ☃.getKey();
/* 27 */     return bmm.a() + "=" + a(bmm, ☃.getValue());
/*    */   }
/*    */ 
/*    */   
/*    */   private <T extends Comparable<T>> String a(bmm<T> ☃, Comparable<?> comparable) {
/* 32 */     return ☃.a((T)comparable);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bla$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */