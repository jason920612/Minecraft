/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class alu
/*    */ {
/*  8 */   private static final Logger a = LogManager.getLogger();
/*    */   
/*    */   private final ald b;
/* 11 */   private final aln[] c = new aln[alt.c()];
/*    */   private aln d;
/*    */   
/*    */   public alu(ald ☃) {
/* 15 */     this.b = ☃;
/*    */     
/* 17 */     a(alt.k);
/*    */   }
/*    */   
/*    */   public void a(alt<?> ☃) {
/* 21 */     if (this.d != null && ☃ == this.d.i()) {
/*    */       return;
/*    */     }
/*    */     
/* 25 */     if (this.d != null) {
/* 26 */       this.d.e();
/*    */     }
/*    */     
/* 29 */     this.d = b(☃);
/* 30 */     if (!this.b.m.B) {
/* 31 */       this.b.T().b(ald.a, Integer.valueOf(☃.b()));
/*    */     }
/* 33 */     a.debug("Dragon is now in phase {} on the {}", ☃, this.b.m.B ? "client" : "server");
/*    */     
/* 35 */     this.d.d();
/*    */   }
/*    */   
/*    */   public aln a() {
/* 39 */     return this.d;
/*    */   }
/*    */ 
/*    */   
/*    */   public <T extends aln> T b(alt<T> ☃) {
/* 44 */     int i = ☃.b();
/* 45 */     if (this.c[i] == null) {
/* 46 */       this.c[i] = ☃.a(this.b);
/*    */     }
/* 48 */     return (T)this.c[i];
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\alu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */