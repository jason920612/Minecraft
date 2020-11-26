/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class aem
/*    */ {
/*    */   static {
/* 11 */     if (!pf.a()) {
/* 12 */       throw new RuntimeException("Accessed MobEffects before Bootstrap!");
/*    */     }
/*    */   }
/*    */   
/* 16 */   public static final aej a = a("speed");
/* 17 */   public static final aej b = a("slowness");
/* 18 */   public static final aej c = a("haste");
/* 19 */   public static final aej d = a("mining_fatigue");
/* 20 */   public static final aej e = a("strength");
/* 21 */   public static final aej f = a("instant_health");
/* 22 */   public static final aej g = a("instant_damage");
/* 23 */   public static final aej h = a("jump_boost");
/* 24 */   public static final aej i = a("nausea");
/* 25 */   public static final aej j = a("regeneration");
/* 26 */   public static final aej k = a("resistance");
/* 27 */   public static final aej l = a("fire_resistance");
/* 28 */   public static final aej m = a("water_breathing");
/* 29 */   public static final aej n = a("invisibility");
/* 30 */   public static final aej o = a("blindness");
/* 31 */   public static final aej p = a("night_vision");
/* 32 */   public static final aej q = a("hunger");
/* 33 */   public static final aej r = a("weakness");
/* 34 */   public static final aej s = a("poison");
/* 35 */   public static final aej t = a("wither");
/* 36 */   public static final aej u = a("health_boost");
/* 37 */   public static final aej v = a("absorption");
/* 38 */   public static final aej w = a("saturation");
/* 39 */   public static final aej x = a("glowing");
/* 40 */   public static final aej y = a("levitation");
/* 41 */   public static final aej z = a("luck");
/* 42 */   public static final aej A = a("unluck");
/* 43 */   public static final aej B = a("slow_falling");
/* 44 */   public static final aej C = a("conduit_power");
/* 45 */   public static final aej D = a("dolphins_grace");
/*    */   
/*    */   @Nullable
/*    */   private static aej a(String ☃) {
/* 49 */     aej aej1 = fc.t.b(new pc(☃));
/* 50 */     if (aej1 == null) {
/* 51 */       throw new IllegalStateException("Invalid MobEffect requested: " + ☃);
/*    */     }
/* 53 */     return aej1;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\aem.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */