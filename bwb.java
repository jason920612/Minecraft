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
/*    */ public class bwb
/*    */   extends bvg<bpy>
/*    */ {
/*    */   public <C extends bqp> boolean a(axz ☃, bmy<? extends bom> bmy1, Random random, el el1, bpy bpy1, bqo<C> bqo1, C c) {
/* 17 */     int i = random.nextInt(Math.max(bpy1.a, 1));
/* 18 */     for (int j = 0; j < i; j++) {
/* 19 */       int k = random.nextInt(16);
/* 20 */       int m = random.nextInt(bpy1.d - bpy1.c) + bpy1.b;
/* 21 */       int n = random.nextInt(16);
/* 22 */       bqo1.a(☃, bmy1, random, el1.a(k, m, n), c);
/*    */     } 
/*    */     
/* 25 */     return true;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bwb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */