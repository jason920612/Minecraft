/*    */ import com.google.common.collect.ImmutableMap;
/*    */ import com.google.common.collect.Maps;
/*    */ import com.google.common.collect.Multimap;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class asz
/*    */   extends auj
/*    */ {
/*    */   private final float b;
/* 26 */   protected static final Map<bcs, blc> a = Maps.newHashMap((Map)ImmutableMap.of(bct.i, bct.cq
/* 27 */         .p(), bct.if, bct.cq
/* 28 */         .p(), bct.j, bct.cq
/* 29 */         .p(), bct.k, bct.j
/* 30 */         .p()));
/*    */ 
/*    */   
/*    */   public asz(aui ☃, float f, ata.a a1) {
/* 34 */     super(☃, a1);
/*    */     
/* 36 */     this.b = f;
/*    */   }
/*    */ 
/*    */   
/*    */   public adm a(aup ☃) {
/* 41 */     axy axy = ☃.k();
/* 42 */     el el = ☃.a();
/*    */     
/* 44 */     if (☃.l() != eq.a && axy.a_(el.a()).f()) {
/* 45 */       blc blc = a.get(axy.a_(el).c());
/*    */       
/* 47 */       if (blc != null) {
/* 48 */         aog aog = ☃.j();
/* 49 */         axy.a(aog, el, wj.dK, wk.e, 1.0F, 1.0F);
/*    */         
/* 51 */         if (!axy.B) {
/* 52 */           axy.a(el, blc, 11);
/* 53 */           if (aog != null) {
/* 54 */             ☃.i().a(1, aog);
/*    */           }
/*    */         } 
/* 57 */         return adm.a;
/*    */       } 
/*    */     } 
/*    */     
/* 61 */     return adm.b;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(ate ☃, afa afa1, afa afa2) {
/* 66 */     ☃.a(1, afa2);
/* 67 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public Multimap<String, afo> a(aew ☃) {
/* 72 */     Multimap<String, afo> multimap = super.a(☃);
/*    */ 
/*    */     
/* 75 */     if (☃ == aew.a) {
/* 76 */       multimap.put(ank.f.a(), new afo(g, "Weapon modifier", 0.0D, 0));
/* 77 */       multimap.put(ank.g.a(), new afo(h, "Weapon modifier", this.b, 0));
/*    */     } 
/*    */     
/* 80 */     return multimap;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\asz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */