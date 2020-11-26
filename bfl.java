/*    */ import com.google.common.collect.Maps;
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
/*    */ public class bfl
/*    */   extends bcs
/*    */ {
/*    */   private final bcs a;
/* 17 */   private static final Map<bcs, bcs> b = Maps.newIdentityHashMap();
/*    */   
/*    */   public bfl(bcs ☃, bcs.c c1) {
/* 20 */     super(c1);
/* 21 */     this.a = ☃;
/* 22 */     b.put(☃, this);
/*    */   }
/*    */ 
/*    */   
/*    */   public int a(blc ☃, Random random) {
/* 27 */     return 0;
/*    */   }
/*    */   
/*    */   public bcs d() {
/* 31 */     return this.a;
/*    */   }
/*    */   
/*    */   public static boolean k(blc ☃) {
/* 35 */     return b.containsKey(☃.c());
/*    */   }
/*    */ 
/*    */   
/*    */   protected ate t(blc ☃) {
/* 40 */     return new ate(this.a);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(blc ☃, axy axy1, el el1, float f, int i) {
/* 45 */     if (!axy1.B && axy1.X().b("doTileDrops")) {
/* 46 */       anm anm = new anm(axy1);
/* 47 */       anm.b(el1.o() + 0.5D, el1.p(), el1.q() + 0.5D, 0.0F, 0.0F);
/* 48 */       axy1.a(anm);
/*    */       
/* 50 */       anm.B();
/*    */     } 
/*    */   }
/*    */   
/*    */   public static blc f(bcs ☃) {
/* 55 */     return ((bcs)b.get(☃)).p();
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bfl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */