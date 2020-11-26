/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class aec
/*    */   extends aeb
/*    */ {
/*    */   private final aer x;
/*    */   
/*    */   public aec(String ☃, aer aer1, @Nullable aer aer2) {
/* 15 */     super(☃, aer1);
/* 16 */     this.x = aer2;
/*    */   }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public aer j() {
/* 22 */     return this.w;
/*    */   }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public aer k() {
/* 28 */     return this.x;
/*    */   }
/*    */ 
/*    */   
/*    */   public ij c(afa ☃) {
/* 33 */     ij ij = (this.x == null) ? this.w.O() : this.x.O();
/* 34 */     ate ate = (this.x instanceof afa) ? ((afa)this.x).cB() : ate.a;
/* 35 */     String str1 = "death.attack." + this.v;
/* 36 */     String str2 = str1 + ".item";
/*    */     
/* 38 */     if (!ate.a() && ate.s()) {
/* 39 */       return new ir(str2, new Object[] { ☃.O(), ij, ate.A() });
/*    */     }
/* 41 */     return new ir(str1, new Object[] { ☃.O(), ij });
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\aec.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */