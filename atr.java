/*    */ import com.google.common.collect.Lists;
/*    */ import com.google.common.collect.Maps;
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ import java.util.Random;
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
/*    */ public class atr
/*    */   extends ata
/*    */ {
/* 25 */   private static final Map<wi, atr> a = Maps.newHashMap();
/* 26 */   private static final List<atr> b = Lists.newArrayList();
/*    */   
/*    */   private final int c;
/*    */   private final wi d;
/*    */   
/*    */   protected atr(int ☃, wi wi1, ata.a a1) {
/* 32 */     super(a1);
/*    */     
/* 34 */     this.c = ☃;
/* 35 */     this.d = wi1;
/*    */     
/* 37 */     a.put(this.d, this);
/* 38 */     b.add(this);
/*    */   }
/*    */   
/*    */   public static atr a(Random ☃) {
/* 42 */     return b.get(☃.nextInt(b.size()));
/*    */   }
/*    */ 
/*    */   
/*    */   public adm a(aup ☃) {
/* 47 */     axy axy = ☃.k();
/* 48 */     el el = ☃.a();
/*    */     
/* 50 */     blc blc = axy.a_(el);
/* 51 */     if (blc.c() != bct.cW || ((Boolean)blc.c(bfn.a)).booleanValue()) {
/* 52 */       return adm.b;
/*    */     }
/*    */     
/* 55 */     ate ate = ☃.i();
/* 56 */     if (!axy.B) {
/* 57 */       ((bfn)bct.cW).a(axy, el, blc, ate);
/* 58 */       axy.a((aog)null, 1010, el, ata.a(this));
/* 59 */       ate.g(1);
/*    */       
/* 61 */       aog aog = ☃.j();
/* 62 */       if (aog != null) {
/* 63 */         aog.a(ws.aj);
/*    */       }
/*    */     } 
/* 66 */     return adm.a;
/*    */   }
/*    */   
/*    */   public int d() {
/* 70 */     return this.c;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\atr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */