/*    */ import java.util.function.Predicate;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bln
/*    */   implements Predicate<blc>
/*    */ {
/* 10 */   private static final bln a = new bln(bza.a)
/*    */     {
/*    */       public boolean a(@Nullable blc ☃) {
/* 13 */         return (☃ != null && ☃.f());
/*    */       }
/*    */     };
/*    */   
/*    */   private final bza b;
/*    */   
/*    */   private bln(bza ☃) {
/* 20 */     this.b = ☃;
/*    */   }
/*    */   
/*    */   public static bln a(bza ☃) {
/* 24 */     return (☃ == bza.a) ? a : new bln(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(@Nullable blc ☃) {
/* 29 */     return (☃ != null && ☃.d() == this.b);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bln.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */