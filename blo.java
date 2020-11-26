/*    */ import java.util.function.Predicate;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class blo
/*    */   implements Predicate<blc>
/*    */ {
/*    */   private final bcs a;
/*    */   
/*    */   public blo(bcs ☃) {
/* 13 */     this.a = ☃;
/*    */   }
/*    */   
/*    */   public static blo a(bcs ☃) {
/* 17 */     return new blo(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(@Nullable blc ☃) {
/* 22 */     return (☃ != null && ☃.c() == this.a);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\blo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */