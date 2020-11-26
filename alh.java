/*    */ import javax.annotation.Nullable;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class alh
/*    */   extends alf
/*    */ {
/* 11 */   private static final Logger b = LogManager.getLogger();
/*    */   
/*    */   private cee c;
/*    */   
/*    */   private int d;
/*    */   
/*    */   public alh(ald ☃) {
/* 18 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public void c() {
/* 23 */     if (this.c == null) {
/* 24 */       b.warn("Aborting charge player as no target was set.");
/* 25 */       this.a.dr().a(alt.a);
/*    */       
/*    */       return;
/*    */     } 
/* 29 */     if (this.d > 0 && 
/* 30 */       this.d++ >= 10) {
/* 31 */       this.a.dr().a(alt.a);
/*    */       
/*    */       return;
/*    */     } 
/*    */     
/* 36 */     double ☃ = this.c.c(this.a.q, this.a.r, this.a.s);
/* 37 */     if (☃ < 100.0D || ☃ > 22500.0D || this.a.B || this.a.C) {
/* 38 */       this.d++;
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public void d() {
/* 44 */     this.c = null;
/* 45 */     this.d = 0;
/*    */   }
/*    */   
/*    */   public void a(cee ☃) {
/* 49 */     this.c = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public float f() {
/* 54 */     return 3.0F;
/*    */   }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public cee g() {
/* 60 */     return this.c;
/*    */   }
/*    */ 
/*    */   
/*    */   public alt<alh> i() {
/* 65 */     return alt.i;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\alh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */