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
/*    */ public class a
/*    */   extends bxc
/*    */ {
/*    */   public a() {}
/*    */   
/*    */   public a(axz ☃, boz boz1, int i, int j, ayu ayu1, int k) {
/* 79 */     super(i, j, ayu1, boz1, ☃.r_() + k);
/*    */     
/* 81 */     bwx.b();
/*    */     
/* 83 */     bwx.m m = new bwx.m(0, boz1, (i << 4) + 2, (j << 4) + 2);
/* 84 */     this.a.add(m);
/* 85 */     m.a(m, this.a, boz1);
/*    */     
/* 87 */     List<bxb> list = m.c;
/* 88 */     while (!list.isEmpty()) {
/* 89 */       int n = boz1.nextInt(list.size());
/* 90 */       bxb bxb = list.remove(n);
/* 91 */       bxb.a(m, this.a, boz1);
/*    */     } 
/*    */     
/* 94 */     a(☃);
/* 95 */     a(☃, boz1, 10);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\btk$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */