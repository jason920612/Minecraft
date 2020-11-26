/*    */ import com.google.common.collect.Multimap;
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
/*    */ public class auh
/*    */   extends auj
/*    */ {
/*    */   private final float a;
/*    */   private final float b;
/*    */   
/*    */   public auh(aui ☃, int i, float f, ata.a a1) {
/* 22 */     super(☃, a1);
/*    */     
/* 24 */     this.b = f;
/* 25 */     this.a = i + ☃.c();
/*    */   }
/*    */   
/*    */   public float d() {
/* 29 */     return this.a;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(blc ☃, axy axy1, el el1, aog aog1) {
/* 34 */     return !aog1.u();
/*    */   }
/*    */ 
/*    */   
/*    */   public float a(ate ☃, blc blc1) {
/* 39 */     bcs bcs = blc1.c();
/* 40 */     if (bcs == bct.aQ) {
/* 41 */       return 15.0F;
/*    */     }
/*    */     
/* 44 */     bza bza = blc1.d();
/* 45 */     if (bza == bza.e || bza == bza.g || bza == bza.J || blc1.a(wv.A) || bza == bza.K) {
/* 46 */       return 1.5F;
/*    */     }
/* 48 */     return 1.0F;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(ate ☃, afa afa1, afa afa2) {
/* 53 */     ☃.a(1, afa2);
/* 54 */     return true;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean a(ate ☃, axy axy1, blc blc1, el el1, afa afa1) {
/* 60 */     if (blc1.e(axy1, el1) != 0.0F) {
/* 61 */       ☃.a(2, afa1);
/*    */     }
/* 63 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(blc ☃) {
/* 68 */     return (☃.c() == bct.aQ);
/*    */   }
/*    */ 
/*    */   
/*    */   public Multimap<String, afo> a(aew ☃) {
/* 73 */     Multimap<String, afo> multimap = super.a(☃);
/*    */ 
/*    */     
/* 76 */     if (☃ == aew.a) {
/* 77 */       multimap.put(ank.f.a(), new afo(g, "Weapon modifier", this.a, 0));
/* 78 */       multimap.put(ank.g.a(), new afo(h, "Weapon modifier", this.b, 0));
/*    */     } 
/*    */     
/* 81 */     return multimap;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\auh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */