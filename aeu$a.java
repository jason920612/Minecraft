/*    */ import java.util.function.Predicate;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class a
/*    */   implements Predicate<aer>
/*    */ {
/*    */   private final ate a;
/*    */   
/*    */   public a(ate ☃) {
/* 28 */     this.a = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(@Nullable aer ☃) {
/* 33 */     if (!☃.aF()) {
/* 34 */       return false;
/*    */     }
/* 36 */     if (!(☃ instanceof afa)) {
/* 37 */       return false;
/*    */     }
/* 39 */     afa afa = (afa)☃;
/* 40 */     aew aew = afb.e(this.a);
/* 41 */     if (!afa.b(aew).a()) {
/* 42 */       return false;
/*    */     }
/*    */     
/* 45 */     if (afa instanceof afb)
/* 46 */       return ((afb)afa).dj(); 
/* 47 */     if (afa instanceof alz)
/* 48 */       return !((alz)afa).c(aew); 
/* 49 */     if (afa instanceof aog) {
/* 50 */       return true;
/*    */     }
/*    */     
/* 53 */     return false;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\aeu$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */