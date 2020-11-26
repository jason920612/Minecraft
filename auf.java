/*    */ import java.util.Map;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class auf
/*    */   extends arj
/*    */ {
/*    */   protected final bcs a;
/*    */   
/*    */   public auf(bcs ☃, bcs bcs1, ata.a a1) {
/* 16 */     super(☃, a1);
/* 17 */     this.a = bcs1;
/*    */   }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   protected blc b(ark ☃) {
/* 23 */     blc blc1 = this.a.a(☃);
/*    */     
/* 25 */     blc blc2 = null;
/*    */     
/* 27 */     ayc ayc = ☃.k();
/* 28 */     el el = ☃.a();
/* 29 */     for (eq eq : ☃.e()) {
/* 30 */       if (eq != eq.b) {
/*    */ 
/*    */ 
/*    */         
/* 34 */         blc blc = (eq == eq.a) ? d().a(☃) : blc1;
/* 35 */         if (blc != null && blc.a(ayc, el)) {
/* 36 */           blc2 = blc;
/*    */           break;
/*    */         } 
/*    */       } 
/*    */     } 
/* 41 */     return (blc2 != null && ayc.a(blc2, el)) ? blc2 : null;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(Map<bcs, ata> ☃, ata ata1) {
/* 46 */     super.a(☃, ata1);
/*    */     
/* 48 */     ☃.put(this.a, ata1);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\auf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */