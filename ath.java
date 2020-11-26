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
/*    */ public class ath
/*    */   extends ata
/*    */ {
/*    */   public ath(ata.a ☃) {
/* 17 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public adm a(aup ☃) {
/* 22 */     axy axy = ☃.k();
/* 23 */     el el = ☃.a();
/*    */     
/* 25 */     bcs bcs = axy.a_(el).c();
/* 26 */     if (bcs instanceof ber) {
/* 27 */       aog aog = ☃.j();
/* 28 */       if (!axy.B && aog != null) {
/* 29 */         a(aog, axy, el);
/*    */       }
/* 31 */       return adm.a;
/*    */     } 
/*    */     
/* 34 */     return adm.b;
/*    */   }
/*    */ 
/*    */   
/*    */   public static boolean a(aog ☃, axy axy1, el el1) {
/* 39 */     amc amc = amc.b(axy1, el1);
/*    */ 
/*    */     
/* 42 */     boolean bool = false;
/* 43 */     double d = 7.0D;
/* 44 */     int i = el1.o();
/* 45 */     int j = el1.p();
/* 46 */     int k = el1.q();
/*    */     
/* 48 */     List<afb> list = axy1.a(afb.class, new cea(i - 7.0D, j - 7.0D, k - 7.0D, i + 7.0D, j + 7.0D, k + 7.0D));
/* 49 */     for (afb afb : list) {
/* 50 */       if (afb.dm() && afb.dn() == ☃) {
/* 51 */         if (amc == null) {
/* 52 */           amc = amc.a(axy1, el1);
/*    */         }
/* 54 */         afb.b(amc, true);
/* 55 */         bool = true;
/*    */       } 
/*    */     } 
/* 58 */     return bool;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\ath.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */