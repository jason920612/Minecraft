/*    */ import java.util.function.Predicate;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class blh
/*    */ {
/*    */   private final ayc a;
/*    */   private final el b;
/*    */   private final boolean c;
/*    */   private blc d;
/*    */   private bji e;
/*    */   private boolean f;
/*    */   
/*    */   public blh(ayc ☃, el el1, boolean bool) {
/* 20 */     this.a = ☃;
/* 21 */     this.b = el1;
/* 22 */     this.c = bool;
/*    */   }
/*    */   
/*    */   public blc a() {
/* 26 */     if (this.d == null && (this.c || this.a.D(this.b))) {
/* 27 */       this.d = this.a.a_(this.b);
/*    */     }
/*    */     
/* 30 */     return this.d;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public bji b() {
/* 35 */     if (this.e == null && !this.f) {
/* 36 */       this.e = this.a.f(this.b);
/* 37 */       this.f = true;
/*    */     } 
/*    */     
/* 40 */     return this.e;
/*    */   }
/*    */   
/*    */   public ayc c() {
/* 44 */     return this.a;
/*    */   }
/*    */   
/*    */   public el d() {
/* 48 */     return this.b;
/*    */   }
/*    */   
/*    */   public static Predicate<blh> a(Predicate<blc> ☃) {
/* 52 */     return blh1 -> (blh1 != null && ☃.test(blh1.a()));
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\blh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */