/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ark
/*    */   extends aup
/*    */ {
/*    */   private final el j;
/*    */   protected boolean a = true;
/*    */   
/*    */   public ark(aup ☃) {
/* 15 */     this(☃.k(), ☃.j(), ☃.i(), ☃.a(), ☃.l(), ☃.m(), ☃.n(), ☃.o());
/*    */   }
/*    */   
/*    */   protected ark(axy ☃, @Nullable aog aog1, ate ate1, el el1, eq eq1, float f1, float f2, float f3) {
/* 19 */     super(☃, aog1, ate1, el1, eq1, f1, f2, f3);
/*    */     
/* 21 */     this.j = this.i.a(this.f);
/* 22 */     this.a = k().a_(this.i).a(this);
/*    */   }
/*    */ 
/*    */   
/*    */   public el a() {
/* 27 */     return this.a ? this.i : this.j;
/*    */   }
/*    */   
/*    */   public boolean b() {
/* 31 */     return (this.a || k().a_(a()).a(this));
/*    */   }
/*    */   
/*    */   public boolean c() {
/* 35 */     return this.a;
/*    */   }
/*    */   
/*    */   public eq d() {
/* 39 */     return eq.a(this.b)[0];
/*    */   }
/*    */   
/*    */   public eq[] e() {
/* 43 */     eq[] ☃ = eq.a(this.b);
/*    */     
/* 45 */     if (this.a) {
/* 46 */       return ☃;
/*    */     }
/*    */ 
/*    */     
/* 50 */     int i = 0;
/* 51 */     for (; i < ☃.length && 
/* 52 */       ☃[i] != this.f.d(); i++);
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 57 */     if (i > 0) {
/* 58 */       System.arraycopy(☃, 0, ☃, 1, i);
/* 59 */       ☃[0] = this.f.d();
/*    */     } 
/* 61 */     return ☃;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\ark.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */