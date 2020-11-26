/*    */ import java.util.List;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class a
/*    */   extends bxc
/*    */ {
/*    */   public a() {}
/*    */   
/*    */   public a(axz ☃, boz boz1, int i, int j, ayu ayu1) {
/* 81 */     super(i, j, ayu1, boz1, ☃.r_());
/*    */     
/* 83 */     bwr.q q = new bwr.q(boz1, (i << 4) + 2, (j << 4) + 2);
/* 84 */     this.a.add(q);
/* 85 */     q.a(q, this.a, boz1);
/*    */     
/* 87 */     List<bxb> list = q.d;
/* 88 */     while (!list.isEmpty()) {
/* 89 */       int k = boz1.nextInt(list.size());
/* 90 */       bxb bxb = list.remove(k);
/* 91 */       bxb.a(q, this.a, boz1);
/*    */     } 
/*    */     
/* 94 */     a(☃);
/* 95 */     a(☃, boz1, 48, 70);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\brx$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */