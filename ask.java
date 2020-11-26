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
/*    */ public class ask
/*    */   extends ata
/*    */ {
/*    */   public ask(ata.a ☃) {
/* 18 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public adm a(aup ☃) {
/* 23 */     axy axy = ☃.k();
/* 24 */     el el1 = ☃.a();
/*    */     
/* 26 */     blc blc = axy.a_(el1);
/* 27 */     if (blc.c() != bct.ce && blc.c() != bct.z) {
/* 28 */       return adm.c;
/*    */     }
/*    */     
/* 31 */     el el2 = el1.a();
/* 32 */     if (!axy.c(el2)) {
/* 33 */       return adm.c;
/*    */     }
/*    */     
/* 36 */     double d1 = el2.o();
/* 37 */     double d2 = el2.p();
/* 38 */     double d3 = el2.q();
/*    */     
/* 40 */     List<aer> list = axy.a((aer)null, new cea(d1, d2, d3, d1 + 1.0D, d2 + 2.0D, d3 + 1.0D));
/* 41 */     if (!list.isEmpty()) {
/* 42 */       return adm.c;
/*    */     }
/*    */     
/* 45 */     if (!axy.B) {
/* 46 */       alc alc = new alc(axy, d1 + 0.5D, d2, d3 + 0.5D);
/* 47 */       alc.a(false);
/* 48 */       axy.a(alc);
/*    */       
/* 50 */       if (axy.t instanceof boi) {
/* 51 */         boh boh = ((boi)axy.t).r();
/* 52 */         boh.e();
/*    */       } 
/*    */     } 
/* 55 */     ☃.i().g(1);
/* 56 */     return adm.a;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\ask.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */