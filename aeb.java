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
/*    */ public class aeb
/*    */   extends aea
/*    */ {
/*    */   @Nullable
/*    */   protected aer w;
/*    */   private boolean x;
/*    */   
/*    */   public aeb(String ☃, @Nullable aer aer1) {
/* 19 */     super(☃);
/* 20 */     this.w = aer1;
/*    */   }
/*    */   
/*    */   public aeb x() {
/* 24 */     this.x = true;
/* 25 */     return this;
/*    */   }
/*    */   
/*    */   public boolean y() {
/* 29 */     return this.x;
/*    */   }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public aer k() {
/* 35 */     return this.w;
/*    */   }
/*    */ 
/*    */   
/*    */   public ij c(afa ☃) {
/* 40 */     ate ate = (this.w instanceof afa) ? ((afa)this.w).cB() : ate.a;
/* 41 */     String str = "death.attack." + this.v;
/*    */     
/* 43 */     if (!ate.a() && ate.s()) {
/* 44 */       return new ir(str + ".item", new Object[] { ☃.O(), this.w.O(), ate.A() });
/*    */     }
/* 46 */     return new ir(str, new Object[] { ☃.O(), this.w.O() });
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean s() {
/* 52 */     return (this.w != null && this.w instanceof afa && !(this.w instanceof aog));
/*    */   }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public cee w() {
/* 58 */     return new cee(this.w.q, this.w.r, this.w.s);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\aeb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */