/*    */ import java.util.Random;
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
/*    */ public interface axz
/*    */   extends ayc, ayf, ayh
/*    */ {
/*    */   long r_();
/*    */   
/*    */   default float ah() {
/* 26 */     return boc.a[o().a(g().f())];
/*    */   }
/*    */   
/*    */   default float k(float ☃) {
/* 30 */     return o().a(g().f(), ☃);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   ayo<bcs> J();
/*    */ 
/*    */   
/*    */   ayo<byv> I();
/*    */ 
/*    */   
/*    */   default bmx y(el ☃) {
/* 42 */     return b(☃.o() >> 4, ☃.q() >> 4);
/*    */   }
/*    */ 
/*    */   
/*    */   bmx b(int paramInt1, int paramInt2);
/*    */ 
/*    */   
/*    */   axy f();
/*    */   
/*    */   ccb g();
/*    */   
/*    */   adj h(el paramel);
/*    */   
/*    */   default adi aj() {
/* 56 */     return g().x();
/*    */   }
/*    */   
/*    */   bnc H();
/*    */   
/*    */   ccc s_();
/*    */   
/*    */   Random m();
/*    */   
/*    */   void a(el paramel, bcs parambcs);
/*    */   
/*    */   el n();
/*    */   
/*    */   void a(@Nullable aog paramaog, el paramel, wi paramwi, wk paramwk, float paramFloat1, float paramFloat2);
/*    */   
/*    */   void a(fk paramfk, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6);
/*    */ }


/* Location:              F:\dw\server.jar!\axz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */