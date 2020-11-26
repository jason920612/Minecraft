/*    */ import java.util.Map;
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
/*    */ public class aqi
/*    */   extends aqx
/*    */ {
/*    */   private final aog a;
/*    */   private int b;
/*    */   
/*    */   public aqi(aog ☃, ade ade1, int i, int j, int k) {
/* 19 */     super(ade1, i, j, k);
/* 20 */     this.a = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(ate ☃) {
/* 25 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public ate a(int ☃) {
/* 30 */     if (e()) {
/* 31 */       this.b += Math.min(☃, d().C());
/*    */     }
/* 33 */     return super.a(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public ate a(aog ☃, ate ate1) {
/* 38 */     c(ate1);
/* 39 */     super.a(☃, ate1);
/* 40 */     return ate1;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(ate ☃, int i) {
/* 45 */     this.b += i;
/* 46 */     c(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void c(ate ☃) {
/* 51 */     ☃.a(this.a.m, this.a, this.b);
/*    */     
/* 53 */     if (!this.a.m.B) {
/* 54 */       for (Map.Entry<pc, Integer> entry : ((bju)this.d).q().entrySet()) {
/* 55 */         float f; avt avt = (avt)this.a.m.E().a(entry.getKey());
/*    */         
/* 57 */         if (avt != null) {
/* 58 */           f = avt.g();
/*    */         } else {
/* 60 */           f = 0.0F;
/*    */         } 
/*    */         
/* 63 */         int i = ((Integer)entry.getValue()).intValue();
/*    */         
/* 65 */         if (f == 0.0F) {
/* 66 */           i = 0;
/* 67 */         } else if (f < 1.0F) {
/* 68 */           int j = xq.d(i * f);
/* 69 */           if (j < xq.f(i * f) && Math.random() < (i * f - j)) {
/* 70 */             j++;
/*    */           }
/* 72 */           i = j;
/*    */         } 
/*    */         
/* 75 */         while (i > 0) {
/* 76 */           int j = aex.a(i);
/* 77 */           i -= j;
/* 78 */           this.a.m.a(new aex(this.a.m, this.a.q, this.a.r + 0.5D, this.a.s + 0.5D, j));
/*    */         } 
/*    */       } 
/*    */       
/* 82 */       ((aqs)this.d).d(this.a);
/*    */     } 
/*    */     
/* 85 */     this.b = 0;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\aqi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */