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
/*    */ public class avs
/*    */   extends avd
/*    */ {
/*    */   public avs(pc ☃) {
/* 16 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(ade ☃, axy axy1) {
/* 21 */     if (!(☃ instanceof aqc)) {
/* 22 */       return false;
/*    */     }
/*    */     
/* 25 */     int i = 0;
/* 26 */     int j = 0;
/*    */     
/* 28 */     for (int k = 0; k < ☃.T_(); k++) {
/* 29 */       ate ate = ☃.a(k);
/*    */       
/* 31 */       if (!ate.a()) {
/*    */ 
/*    */ 
/*    */         
/* 35 */         if (bcs.a(ate.b()) instanceof bhi) {
/* 36 */           i++;
/* 37 */         } else if (ate.b() instanceof asd) {
/* 38 */           j++;
/*    */         } else {
/* 40 */           return false;
/*    */         } 
/*    */         
/* 43 */         if (j > 1 || i > 1) {
/* 44 */           return false;
/*    */         }
/*    */       } 
/*    */     } 
/* 48 */     return (i == 1 && j == 1);
/*    */   }
/*    */ 
/*    */   
/*    */   public ate a(ade ☃) {
/* 53 */     ate ate1 = ate.a;
/* 54 */     asd asd = (asd)atf.bh;
/*    */     
/* 56 */     for (int i = 0; i < ☃.T_(); i++) {
/* 57 */       ate ate = ☃.a(i);
/*    */       
/* 59 */       if (!ate.a()) {
/*    */ 
/*    */ 
/*    */         
/* 63 */         ata ata = ate.b();
/* 64 */         if (bcs.a(ata) instanceof bhi) {
/* 65 */           ate1 = ate;
/* 66 */         } else if (ata instanceof asd) {
/* 67 */           asd = (asd)ata;
/*    */         } 
/*    */       } 
/*    */     } 
/* 71 */     ate ate2 = bhi.b(asd.d());
/* 72 */     if (ate1.m()) {
/* 73 */       ate2.c(ate1.n().f());
/*    */     }
/*    */     
/* 76 */     return ate2;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public avm<?> a() {
/* 86 */     return avn.o;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\avs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */