/*    */ import java.util.BitSet;
/*    */ import java.util.Random;
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
/*    */ public class bug
/*    */   extends bvg<buv>
/*    */ {
/*    */   public <C extends bqp> boolean a(axz ☃, bmy<? extends bom> bmy1, Random random, el el1, buv buv1, bqo<C> bqo1, C c) {
/* 18 */     bmx bmx = ☃.y(el1);
/* 19 */     axm axm = bmx.d();
/* 20 */     BitSet bitSet = bmx.a(buv1.a);
/* 21 */     for (int i = 0; i < bitSet.length(); i++) {
/* 22 */       if (bitSet.get(i) && random.nextFloat() < buv1.b) {
/* 23 */         int j = i & 0xF;
/* 24 */         int k = i >> 4 & 0xF;
/* 25 */         int m = i >> 8;
/* 26 */         bqo1.a(☃, bmy1, random, new el(axm.d() + j, m, axm.e() + k), c);
/*    */       } 
/*    */     } 
/* 29 */     return true;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bug.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */