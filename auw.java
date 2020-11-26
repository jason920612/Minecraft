/*    */ import com.google.common.collect.Sets;
/*    */ import java.util.Set;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class auw
/*    */ {
/*    */   static {
/* 12 */     if (!pf.a()) {
/* 13 */       throw new RuntimeException("Accessed Potions before Bootstrap!");
/*    */     }
/*    */   }
/*    */   
/* 17 */   private static final Set<aut> Q = Sets.newHashSet((Object[])new aut[] { (aut)null });
/*    */   
/* 19 */   public static final aut a = a("empty");
/* 20 */   public static final aut b = a("water");
/* 21 */   public static final aut c = a("mundane");
/* 22 */   public static final aut d = a("thick");
/* 23 */   public static final aut e = a("awkward");
/* 24 */   public static final aut f = a("night_vision");
/* 25 */   public static final aut g = a("long_night_vision");
/* 26 */   public static final aut h = a("invisibility");
/* 27 */   public static final aut i = a("long_invisibility");
/* 28 */   public static final aut j = a("leaping");
/* 29 */   public static final aut k = a("long_leaping");
/* 30 */   public static final aut l = a("strong_leaping");
/* 31 */   public static final aut m = a("fire_resistance");
/* 32 */   public static final aut n = a("long_fire_resistance");
/* 33 */   public static final aut o = a("swiftness");
/* 34 */   public static final aut p = a("long_swiftness");
/* 35 */   public static final aut q = a("strong_swiftness");
/* 36 */   public static final aut r = a("slowness");
/* 37 */   public static final aut s = a("long_slowness");
/* 38 */   public static final aut t = a("strong_slowness");
/* 39 */   public static final aut u = a("turtle_master");
/* 40 */   public static final aut v = a("long_turtle_master");
/* 41 */   public static final aut w = a("strong_turtle_master");
/* 42 */   public static final aut x = a("water_breathing");
/* 43 */   public static final aut y = a("long_water_breathing");
/* 44 */   public static final aut z = a("healing");
/* 45 */   public static final aut A = a("strong_healing");
/* 46 */   public static final aut B = a("harming");
/* 47 */   public static final aut C = a("strong_harming");
/* 48 */   public static final aut D = a("poison");
/* 49 */   public static final aut E = a("long_poison");
/* 50 */   public static final aut F = a("strong_poison");
/* 51 */   public static final aut G = a("regeneration");
/* 52 */   public static final aut H = a("long_regeneration");
/* 53 */   public static final aut I = a("strong_regeneration");
/* 54 */   public static final aut J = a("strength");
/* 55 */   public static final aut K = a("long_strength");
/* 56 */   public static final aut L = a("strong_strength");
/* 57 */   public static final aut M = a("weakness");
/* 58 */   public static final aut N = a("long_weakness");
/* 59 */   public static final aut O = a("slow_falling");
/* 60 */   public static final aut P = a("long_slow_falling");
/*    */   
/*    */   private static aut a(String ☃) {
/* 63 */     aut aut1 = fc.j.a(new pc(☃));
/* 64 */     if (!Q.add(aut1)) {
/* 65 */       throw new IllegalStateException("Invalid Potion requested: " + ☃);
/*    */     }
/* 67 */     return aut1;
/*    */   }
/*    */   
/*    */   static {
/* 71 */     Q.clear();
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\auw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */