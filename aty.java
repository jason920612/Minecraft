/*    */ import com.google.common.collect.ImmutableMap;
/*    */ import com.google.common.collect.Maps;
/*    */ import com.google.common.collect.Sets;
/*    */ import java.util.Map;
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
/*    */ 
/*    */ 
/*    */ public class aty
/*    */   extends asa
/*    */ {
/* 21 */   private static final Set<bcs> e = Sets.newHashSet((Object[])new bcs[] { bct.cU, bct.j, bct.k, bct.l, bct.cq, bct.i, bct.F, bct.dV, bct.D, bct.E, bct.cS, bct.cQ, bct.df, bct.if, bct.jn, bct.jo, bct.jp, bct.jq, bct.jr, bct.js, bct.jt, bct.ju, bct.jv, bct.jw, bct.jx, bct.jy, bct.jz, bct.jA, bct.jB, bct.jC });
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
/* 54 */   protected static final Map<bcs, blc> a = Maps.newHashMap((Map)ImmutableMap.of(bct.i, bct.if
/* 55 */         .p()));
/*    */ 
/*    */   
/*    */   public aty(aui ☃, float f1, float f2, ata.a a1) {
/* 59 */     super(f1, f2, ☃, e, a1);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(blc ☃) {
/* 64 */     bcs bcs = ☃.c();
/* 65 */     return (bcs == bct.cQ || bcs == bct.cS);
/*    */   }
/*    */ 
/*    */   
/*    */   public adm a(aup ☃) {
/* 70 */     axy axy = ☃.k();
/* 71 */     el el = ☃.a();
/*    */     
/* 73 */     if (☃.l() != eq.a && axy.a_(el.a()).f()) {
/* 74 */       blc blc = a.get(axy.a_(el).c());
/*    */       
/* 76 */       if (blc != null) {
/* 77 */         aog aog = ☃.j();
/* 78 */         axy.a(aog, el, wj.ic, wk.e, 1.0F, 1.0F);
/*    */         
/* 80 */         if (!axy.B) {
/* 81 */           axy.a(el, blc, 11);
/* 82 */           if (aog != null) {
/* 83 */             ☃.i().a(1, aog);
/*    */           }
/*    */         } 
/* 86 */         return adm.a;
/*    */       } 
/*    */     } 
/*    */     
/* 90 */     return adm.b;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\aty.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */