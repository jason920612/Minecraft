/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bpn<F extends bqp, D extends bpx>
/*    */   extends bqo<brz>
/*    */ {
/*    */   protected final bqo<F> a;
/*    */   protected final F b;
/*    */   protected final bvg<D> c;
/*    */   protected final D d;
/*    */   
/*    */   public bpn(bqo<F> ☃, F f, bvg<D> bvg1, D d) {
/* 19 */     this.b = f;
/* 20 */     this.d = d;
/* 21 */     this.c = bvg1;
/* 22 */     this.a = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(axz ☃, bmy<? extends bom> bmy1, Random random, el el1, brz brz1) {
/* 27 */     return this.c.a(☃, bmy1, random, el1, this.d, this.a, this.b);
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 32 */     return String.format("< %s [%s | %s] >", new Object[] { getClass().getSimpleName(), this.c, this.a });
/*    */   }
/*    */   
/*    */   public bqo<F> a() {
/* 36 */     return this.a;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bpn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */