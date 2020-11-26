/*    */ import java.util.AbstractList;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class gx<T extends ho>
/*    */   extends AbstractList<T>
/*    */   implements ho
/*    */ {
/*    */   public T d(int ☃) {
/* 11 */     return c(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public T b(int ☃, T t) {
/* 16 */     T t1 = d(☃);
/* 17 */     a(☃, (ho)t);
/* 18 */     return t1;
/*    */   }
/*    */   
/*    */   public abstract int size();
/*    */   
/*    */   public abstract T c(int paramInt);
/*    */   
/*    */   public abstract void a(int paramInt, ho paramho);
/*    */   
/*    */   public abstract void b(int paramInt);
/*    */ }


/* Location:              F:\dw\server.jar!\gx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */