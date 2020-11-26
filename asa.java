/*    */ import com.google.common.collect.Multimap;
/*    */ import java.util.Set;
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
/*    */ public class asa
/*    */   extends auj
/*    */ {
/*    */   private final Set<bcs> a;
/*    */   protected float b;
/*    */   protected float c;
/*    */   protected float d;
/*    */   
/*    */   protected asa(float ☃, float f1, aui aui1, Set<bcs> set, ata.a a1) {
/* 22 */     super(aui1, a1);
/* 23 */     this.a = set;
/* 24 */     this.b = aui1.b();
/* 25 */     this.c = ☃ + aui1.c();
/* 26 */     this.d = f1;
/*    */   }
/*    */ 
/*    */   
/*    */   public float a(ate ☃, blc blc1) {
/* 31 */     return this.a.contains(blc1.c()) ? this.b : 1.0F;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(ate ☃, afa afa1, afa afa2) {
/* 36 */     ☃.a(2, afa2);
/* 37 */     return true;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean a(ate ☃, axy axy1, blc blc1, el el1, afa afa1) {
/* 43 */     if (!axy1.B && blc1.e(axy1, el1) != 0.0F) {
/* 44 */       ☃.a(1, afa1);
/*    */     }
/* 46 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public Multimap<String, afo> a(aew ☃) {
/* 51 */     Multimap<String, afo> multimap = super.a(☃);
/*    */ 
/*    */     
/* 54 */     if (☃ == aew.a) {
/* 55 */       multimap.put(ank.f.a(), new afo(g, "Tool modifier", this.c, 0));
/* 56 */       multimap.put(ank.g.a(), new afo(h, "Tool modifier", this.d, 0));
/*    */     } 
/*    */     
/* 59 */     return multimap;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\asa.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */