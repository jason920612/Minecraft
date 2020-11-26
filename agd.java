/*    */ import java.util.List;
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
/*    */ public class agd<T extends aer>
/*    */   extends agt
/*    */ {
/* 17 */   private final Predicate<aer> c = new Predicate<aer>(this)
/*    */     {
/*    */       public boolean a(@Nullable aer ☃) {
/* 20 */         return (☃.aF() && this.a.a.u().a(☃) && !this.a.a.r(☃));
/*    */       }
/*    */     };
/*    */   
/*    */   protected afg a;
/*    */   private final double d;
/*    */   private final double e;
/*    */   protected T b;
/*    */   private final float f;
/*    */   private cbe g;
/*    */   private final aiw h;
/*    */   private final Class<T> i;
/*    */   private final Predicate<? super aer> j;
/*    */   private final Predicate<? super aer> k;
/*    */   
/*    */   public agd(afg ☃, Class<T> clazz, float f, double d1, double d2) {
/* 36 */     this(☃, clazz, ☃ -> true, f, d1, d2, aeu.e);
/*    */   }
/*    */   
/*    */   public agd(afg ☃, Class<T> clazz, Predicate<? super aer> predicate, float f, double d1, double d2, Predicate<aer> predicate1) {
/* 40 */     this.a = ☃;
/* 41 */     this.i = clazz;
/* 42 */     this.j = predicate;
/* 43 */     this.f = f;
/* 44 */     this.d = d1;
/* 45 */     this.e = d2;
/* 46 */     this.k = predicate1;
/* 47 */     this.h = ☃.t();
/* 48 */     a(1);
/*    */   }
/*    */   
/*    */   public agd(afg ☃, Class<T> clazz, float f, double d1, double d2, Predicate<aer> predicate) {
/* 52 */     this(☃, clazz, ☃ -> true, f, d1, d2, predicate);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a() {
/* 57 */     List<T> ☃ = this.a.m.a(this.i, this.a.bD().c(this.f, 3.0D, this.f), ☃ -> (this.k.test(☃) && this.c.test(☃) && this.j.test(☃)));
/* 58 */     if (☃.isEmpty()) {
/* 59 */       return false;
/*    */     }
/* 61 */     this.b = ☃.get(0);
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 66 */     cee cee = ajd.b(this.a, 16, 7, new cee(((aer)this.b).q, ((aer)this.b).r, ((aer)this.b).s));
/* 67 */     if (cee == null) {
/* 68 */       return false;
/*    */     }
/* 70 */     if (this.b.d(cee.b, cee.c, cee.d) < this.b.h(this.a)) {
/* 71 */       return false;
/*    */     }
/* 73 */     this.g = this.h.a(cee.b, cee.c, cee.d);
/* 74 */     return (this.g != null);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean b() {
/* 79 */     return !this.h.p();
/*    */   }
/*    */ 
/*    */   
/*    */   public void c() {
/* 84 */     this.h.a(this.g, this.d);
/*    */   }
/*    */ 
/*    */   
/*    */   public void d() {
/* 89 */     this.b = null;
/*    */   }
/*    */ 
/*    */   
/*    */   public void e() {
/* 94 */     if (this.a.h((aer)this.b) < 49.0D) {
/* 95 */       this.a.t().a(this.e);
/*    */     } else {
/* 97 */       this.a.t().a(this.d);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\agd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */