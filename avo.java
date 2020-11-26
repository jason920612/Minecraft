/*    */ import com.google.common.collect.Lists;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class avo
/*    */   extends avd
/*    */ {
/*    */   public avo(pc ☃) {
/* 15 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(ade ☃, axy axy1) {
/* 20 */     if (!(☃ instanceof aqc)) {
/* 21 */       return false;
/*    */     }
/*    */     
/* 24 */     List<ate> list = Lists.newArrayList();
/*    */     
/* 26 */     for (int i = 0; i < ☃.T_(); i++) {
/* 27 */       ate ate = ☃.a(i);
/*    */       
/* 29 */       if (!ate.a()) {
/* 30 */         list.add(ate);
/*    */         
/* 32 */         if (list.size() > 1) {
/* 33 */           ate ate1 = list.get(0);
/* 34 */           if (ate.b() != ate1.b() || ate1.C() != 1 || ate.C() != 1 || !ate1.b().k()) {
/* 35 */             return false;
/*    */           }
/*    */         } 
/*    */       } 
/*    */     } 
/*    */     
/* 41 */     return (list.size() == 2);
/*    */   }
/*    */ 
/*    */   
/*    */   public ate a(ade ☃) {
/* 46 */     List<ate> list = Lists.newArrayList();
/*    */     
/* 48 */     for (int i = 0; i < ☃.T_(); i++) {
/* 49 */       ate ate = ☃.a(i);
/*    */       
/* 51 */       if (!ate.a()) {
/* 52 */         list.add(ate);
/*    */         
/* 54 */         if (list.size() > 1) {
/* 55 */           ate ate1 = list.get(0);
/* 56 */           if (ate.b() != ate1.b() || ate1.C() != 1 || ate.C() != 1 || !ate1.b().k()) {
/* 57 */             return ate.a;
/*    */           }
/*    */         } 
/*    */       } 
/*    */     } 
/*    */     
/* 63 */     if (list.size() == 2) {
/* 64 */       ate ate1 = list.get(0);
/* 65 */       ate ate2 = list.get(1);
/*    */       
/* 67 */       if (ate1.b() == ate2.b() && ate1.C() == 1 && ate2.C() == 1 && ate1.b().k()) {
/* 68 */         ata ata = ate1.b();
/* 69 */         int j = ata.j() - ate1.g();
/* 70 */         int k = ata.j() - ate2.g();
/* 71 */         int m = j + k + ata.j() * 5 / 100;
/* 72 */         int n = ata.j() - m;
/* 73 */         if (n < 0) {
/* 74 */           n = 0;
/*    */         }
/*    */         
/* 77 */         ate ate = new ate(ate1.b());
/* 78 */         ate.b(n);
/* 79 */         return ate;
/*    */       } 
/*    */     } 
/*    */     
/* 83 */     return ate.a;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public avm<?> a() {
/* 93 */     return avn.j;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\avo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */