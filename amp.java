/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class amp
/*    */   extends ang
/*    */ {
/* 11 */   protected static final or<Byte> a = ou.a((Class)amp.class, ot.a);
/*    */ 
/*    */ 
/*    */   
/*    */   protected amp(aev<?> ☃, axy axy1) {
/* 16 */     super(☃, axy1);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void x_() {
/* 21 */     super.x_();
/*    */     
/* 23 */     this.ab.a(a, Byte.valueOf((byte)0));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected void a(int ☃, boolean bool) {
/* 32 */     int i = ((Byte)this.ab.<Byte>a(a)).byteValue();
/* 33 */     if (bool) {
/* 34 */       i |= ☃;
/*    */     } else {
/* 36 */       i &= ☃ ^ 0xFFFFFFFF;
/*    */     } 
/* 38 */     this.ab.b(a, Byte.valueOf((byte)(i & 0xFF)));
/*    */   }
/*    */ 
/*    */   
/*    */   public afd cA() {
/* 43 */     return afd.d;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\amp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */