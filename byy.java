/*    */ import com.google.common.collect.Sets;
/*    */ import java.util.Set;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class byy
/*    */ {
/*    */   static {
/* 12 */     if (!pf.a()) {
/* 13 */       throw new RuntimeException("Accessed Fluids before Bootstrap!");
/*    */     }
/*    */   }
/*    */   
/* 17 */   private static final Set<byv> f = Sets.newHashSet((Object[])new byv[] { (byv)null });
/*    */   
/* 19 */   public static final byv a = a("empty");
/* 20 */   public static final byu b = (byu)a("flowing_water");
/* 21 */   public static final byu c = (byu)a("water");
/* 22 */   public static final byu d = (byu)a("flowing_lava");
/* 23 */   public static final byu e = (byu)a("lava");
/*    */   
/*    */   private static byv a(String ☃) {
/* 26 */     byv byv1 = fc.h.a(new pc(☃));
/* 27 */     if (!f.add(byv1)) {
/* 28 */       throw new IllegalStateException("Invalid Fluid requested: " + ☃);
/*    */     }
/* 30 */     return byv1;
/*    */   }
/*    */   
/*    */   static {
/* 34 */     f.clear();
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\byy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */