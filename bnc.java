/*    */ import java.util.function.BooleanSupplier;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ public interface bnc
/*    */   extends AutoCloseable
/*    */ {
/*    */   @Nullable
/*    */   bnj a(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2);
/*    */   
/*    */   @Nullable
/*    */   default bmx a(int ☃, int i, boolean bool) {
/* 12 */     bnj bnj = a(☃, i, true, false);
/* 13 */     if (bnj == null && bool) {
/* 14 */       throw new UnsupportedOperationException("Could not create an empty chunk");
/*    */     }
/* 16 */     return bnj;
/*    */   }
/*    */   
/*    */   boolean a(BooleanSupplier paramBooleanSupplier);
/*    */   
/*    */   String e();
/*    */   
/*    */   bmy<?> f();
/*    */   
/*    */   default void close() {}
/*    */ }


/* Location:              F:\dw\server.jar!\bnc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */