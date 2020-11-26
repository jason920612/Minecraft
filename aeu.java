/*    */ import com.google.common.base.Predicates;
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
/*    */ public final class aeu
/*    */ {
/* 17 */   public static final Predicate<aer> a = aer::aF; public static final Predicate<aer> c; public static final Predicate<aer> d;
/* 18 */   public static final Predicate<afa> b = afa::aF; public static final Predicate<aer> e; public static final Predicate<aer> f; static {
/* 19 */     c = (☃ -> (☃.aF() && !☃.aX() && !☃.aW()));
/* 20 */     d = (☃ -> (☃ instanceof ade && ☃.aF()));
/* 21 */     e = (☃ -> (!(☃ instanceof aog) || (!((aog)☃).t() && !((aog)☃).u())));
/* 22 */     f = (☃ -> (!(☃ instanceof aog) || !((aog)☃).t()));
/*    */   }
/*    */   
/*    */   public static class a implements Predicate<aer> { private final ate a;
/*    */     
/*    */     public a(ate ☃) {
/* 28 */       this.a = ☃;
/*    */     }
/*    */ 
/*    */     
/*    */     public boolean a(@Nullable aer ☃) {
/* 33 */       if (!☃.aF()) {
/* 34 */         return false;
/*    */       }
/* 36 */       if (!(☃ instanceof afa)) {
/* 37 */         return false;
/*    */       }
/* 39 */       afa afa = (afa)☃;
/* 40 */       aew aew = afb.e(this.a);
/* 41 */       if (!afa.b(aew).a()) {
/* 42 */         return false;
/*    */       }
/*    */       
/* 45 */       if (afa instanceof afb)
/* 46 */         return ((afb)afa).dj(); 
/* 47 */       if (afa instanceof alz)
/* 48 */         return !((alz)afa).c(aew); 
/* 49 */       if (afa instanceof aog) {
/* 50 */         return true;
/*    */       }
/*    */       
/* 53 */       return false;
/*    */     } }
/*    */ 
/*    */   
/*    */   public static Predicate<aer> a(double ☃, double d1, double d2, double d3) {
/* 58 */     double d = d3 * d3;
/* 59 */     return aer1 -> (aer1 != null && aer1.d(☃, d1, d2) <= d3);
/*    */   }
/*    */   
/*    */   public static Predicate<aer> a(aer ☃) {
/* 63 */     cfe cfe = ☃.be();
/* 64 */     cfe.a a = (cfe == null) ? cfe.a.a : cfe.l();
/* 65 */     if (a == cfe.a.b) {
/* 66 */       return (Predicate<aer>)Predicates.alwaysFalse();
/*    */     }
/* 68 */     return f.and(aer1 -> {
/*    */           if (!aer1.aC()) {
/*    */             return false;
/*    */           }
/*    */           if (☃.m.B && (!(aer1 instanceof aog) || !((aog)aer1).dn())) {
/*    */             return false;
/*    */           }
/*    */           cfe cfe2 = aer1.be();
/*    */           cfe.a a2 = (cfe2 == null) ? cfe.a.a : cfe2.l();
/*    */           if (a2 == cfe.a.b) {
/*    */             return false;
/*    */           }
/* 80 */           boolean bool = (cfe1 != null && cfe1.a(cfe2));
/* 81 */           return ((a1 == cfe.a.d || a2 == cfe.a.d) && bool) ? false : (
/*    */ 
/*    */             
/* 84 */             !((a1 == cfe.a.c || a2 == cfe.a.c) && !bool));
/*    */         });
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static Predicate<aer> b(aer ☃) {
/* 92 */     return aer1 -> {
/*    */         while (aer1.aW()) {
/*    */           aer1 = aer1.bU();
/*    */           if (aer1 == ☃)
/*    */             return false; 
/*    */         } 
/*    */         return true;
/*    */       };
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\aeu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */