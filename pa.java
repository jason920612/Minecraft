/*    */ import it.unimi.dsi.fastutil.ints.IntArrayList;
/*    */ import it.unimi.dsi.fastutil.ints.IntList;
/*    */ import it.unimi.dsi.fastutil.ints.IntListIterator;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class pa
/*    */   extends oz
/*    */ {
/*    */   private boolean e;
/*    */   
/*    */   protected void a(avk ☃, boolean bool) {
/* 18 */     this.e = this.d.a(☃);
/* 19 */     int i = this.b.b(☃, (IntList)null);
/*    */ 
/*    */     
/* 22 */     if (this.e) {
/* 23 */       ate ate = this.d.a(0).d();
/* 24 */       if (ate.a() || i <= ate.C()) {
/*    */         return;
/*    */       }
/*    */     } 
/*    */ 
/*    */     
/* 30 */     int j = a(bool, i, this.e);
/*    */ 
/*    */     
/* 33 */     IntArrayList intArrayList = new IntArrayList();
/* 34 */     if (!this.b.a(☃, (IntList)intArrayList, j)) {
/*    */       return;
/*    */     }
/*    */     
/* 38 */     if (!this.e) {
/* 39 */       a(this.d.e());
/* 40 */       a(0);
/*    */     } 
/* 42 */     a(j, (IntList)intArrayList);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a() {
/* 47 */     a(this.d.e());
/* 48 */     super.a();
/*    */   }
/*    */   
/*    */   protected void a(int ☃, IntList intList) {
/* 52 */     IntListIterator<Integer> intListIterator = intList.iterator();
/*    */     
/* 54 */     aqx aqx = this.d.a(0);
/* 55 */     ate ate = aoi.b(((Integer)intListIterator.next()).intValue());
/* 56 */     if (ate.a()) {
/*    */       return;
/*    */     }
/*    */     
/* 60 */     int i = Math.min(ate.c(), ☃);
/* 61 */     if (this.e) {
/* 62 */       i -= aqx.d().C();
/*    */     }
/* 64 */     for (int j = 0; j < i; j++)
/* 65 */       a(aqx, ate); 
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\pa.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */