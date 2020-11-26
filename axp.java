/*    */ import java.util.List;
/*    */ import java.util.Objects;
/*    */ import java.util.Set;
/*    */ import java.util.function.Predicate;
/*    */ import java.util.stream.Stream;
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
/*    */ public interface axp
/*    */ {
/*    */   default List<aer> a(@Nullable aer ☃, cea cea1) {
/* 22 */     return a(☃, cea1, aeu.f);
/*    */   }
/*    */ 
/*    */   
/*    */   default Stream<cew> a(@Nullable aer ☃, cew cew1, Set<aer> set) {
/* 27 */     if (cew1.b()) {
/* 28 */       return Stream.empty();
/*    */     }
/* 30 */     cea cea = cew1.a();
/* 31 */     return a(☃, cea.g(0.25D))
/* 32 */       .stream()
/* 33 */       .filter(aer2 -> (!☃.contains(aer2) && (aer1 == null || !aer1.x(aer2))))
/* 34 */       .flatMap(aer1 -> Stream.<cea>of(new cea[] { aer1.al(), (☃ == null) ? null : ☃.j(aer1) }).filter(Objects::nonNull).filter(()).map(cet::a));
/*    */   }
/*    */   
/*    */   List<aer> a(@Nullable aer paramaer, cea paramcea, @Nullable Predicate<? super aer> paramPredicate);
/*    */ }


/* Location:              F:\dw\server.jar!\axp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */