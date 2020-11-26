/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class awi
/*    */ {
/* 11 */   public static final awe a = a("protection");
/* 12 */   public static final awe b = a("fire_protection");
/* 13 */   public static final awe c = a("feather_falling");
/* 14 */   public static final awe d = a("blast_protection");
/* 15 */   public static final awe e = a("projectile_protection");
/* 16 */   public static final awe f = a("respiration");
/* 17 */   public static final awe g = a("aqua_affinity");
/* 18 */   public static final awe h = a("thorns");
/* 19 */   public static final awe i = a("depth_strider");
/* 20 */   public static final awe j = a("frost_walker");
/* 21 */   public static final awe k = a("binding_curse");
/*    */   
/* 23 */   public static final awe l = a("sharpness");
/* 24 */   public static final awe m = a("smite");
/* 25 */   public static final awe n = a("bane_of_arthropods");
/* 26 */   public static final awe o = a("knockback");
/* 27 */   public static final awe p = a("fire_aspect");
/* 28 */   public static final awe q = a("looting");
/* 29 */   public static final awe r = a("sweeping");
/*    */   
/* 31 */   public static final awe s = a("efficiency");
/* 32 */   public static final awe t = a("silk_touch");
/* 33 */   public static final awe u = a("unbreaking");
/* 34 */   public static final awe v = a("fortune");
/*    */   
/* 36 */   public static final awe w = a("power");
/* 37 */   public static final awe x = a("punch");
/* 38 */   public static final awe y = a("flame");
/* 39 */   public static final awe z = a("infinity");
/*    */   
/* 41 */   public static final awe A = a("luck_of_the_sea");
/* 42 */   public static final awe B = a("lure");
/*    */   
/* 44 */   public static final awe C = a("loyalty");
/* 45 */   public static final awe D = a("impaling");
/* 46 */   public static final awe E = a("riptide");
/* 47 */   public static final awe F = a("channeling");
/*    */   
/* 49 */   public static final awe G = a("mending");
/* 50 */   public static final awe H = a("vanishing_curse");
/*    */   
/*    */   static {
/* 53 */     if (!pf.a()) {
/* 54 */       throw new RuntimeException("Accessed Enchantments before Bootstrap!");
/*    */     }
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   private static awe a(String ☃) {
/* 60 */     awe awe1 = fc.q.b(new pc(☃));
/* 61 */     if (awe1 == null) {
/* 62 */       throw new IllegalStateException("Invalid Enchantment requested: " + ☃);
/*    */     }
/* 64 */     return awe1;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\awi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */