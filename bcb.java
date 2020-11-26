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
/*    */ public abstract class bcb
/*    */   extends bcm
/*    */ {
/*    */   private final asc a;
/*    */   
/*    */   protected bcb(asc ☃, bcs.c c1) {
/* 25 */     super(c1);
/* 26 */     this.a = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(blc ☃) {
/* 31 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a() {
/* 36 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public bji a(axk ☃) {
/* 41 */     return new bje(this.a);
/*    */   }
/*    */ 
/*    */   
/*    */   public axx a(blc ☃, axy axy1, el el1, int i) {
/* 46 */     return atf.et;
/*    */   }
/*    */ 
/*    */   
/*    */   public blb a(axk ☃, blc blc1, el el1, eq eq1) {
/* 51 */     return blb.i;
/*    */   }
/*    */ 
/*    */   
/*    */   public ate a(axk ☃, el el1, blc blc1) {
/* 56 */     bji bji = ☃.f(el1);
/* 57 */     if (bji instanceof bje) {
/* 58 */       return ((bje)bji).a(blc1);
/*    */     }
/*    */     
/* 61 */     return super.a(☃, el1, blc1);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(blc ☃, axy axy1, el el1, float f, int i) {
/* 66 */     a(axy1, el1, a(axy1, el1, ☃));
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(axy ☃, aog aog1, el el1, blc blc1, @Nullable bji bji1, ate ate1) {
/* 71 */     if (bji1 instanceof bje) {
/* 72 */       a(☃, el1, ((bje)bji1).a(blc1));
/* 73 */       aog1.b(ws.a.b(this));
/*    */     } else {
/* 75 */       super.a(☃, aog1, el1, blc1, (bji)null, ate1);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(axy ☃, el el1, blc blc1, @Nullable afa afa1, ate ate1) {
/* 81 */     bji bji = ☃.f(el1);
/* 82 */     if (bji instanceof bje) {
/* 83 */       ((bje)bji).a(ate1, this.a);
/*    */     }
/*    */   }
/*    */   
/*    */   public asc b() {
/* 88 */     return this.a;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bcb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */