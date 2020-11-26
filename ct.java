/*    */ import java.util.Set;
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
/*    */ public class ct
/*    */   implements Predicate<blh>
/*    */ {
/*    */   private final blc a;
/*    */   private final Set<bmm<?>> b;
/*    */   @Nullable
/*    */   private final gy c;
/*    */   
/*    */   public ct(blc ☃, Set<bmm<?>> set, @Nullable gy gy1) {
/* 23 */     this.a = ☃;
/* 24 */     this.b = set;
/* 25 */     this.c = gy1;
/*    */   }
/*    */   
/*    */   public blc a() {
/* 29 */     return this.a;
/*    */   }
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
/*    */   public boolean a(blh ☃) {
/* 43 */     blc blc1 = ☃.a();
/*    */     
/* 45 */     if (blc1.c() != this.a.c()) {
/* 46 */       return false;
/*    */     }
/*    */     
/* 49 */     for (bmm<?> bmm : this.b) {
/* 50 */       if (blc1.c(bmm) != this.a.c(bmm)) {
/* 51 */         return false;
/*    */       }
/*    */     } 
/*    */     
/* 55 */     if (this.c != null) {
/* 56 */       bji bji = ☃.b();
/* 57 */       return (bji != null && hk.a(this.c, bji.a(new gy()), true));
/*    */     } 
/*    */     
/* 60 */     return true;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean a(td ☃, el el1, int i) {
/* 68 */     if (!☃.a(el1, this.a, i)) {
/* 69 */       return false;
/*    */     }
/*    */     
/* 72 */     if (this.c != null) {
/* 73 */       bji bji = ☃.f(el1);
/* 74 */       if (bji != null) {
/* 75 */         gy gy1 = this.c.f();
/* 76 */         gy1.b("x", el1.o());
/* 77 */         gy1.b("y", el1.p());
/* 78 */         gy1.b("z", el1.q());
/* 79 */         bji.b(gy1);
/*    */       } 
/*    */     } 
/*    */     
/* 83 */     return true;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\ct.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */