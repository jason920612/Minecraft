/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class fm
/*    */ {
/*    */   static {
/*  9 */     if (!pf.a()) {
/* 10 */       throw new RuntimeException("Accessed particles before Bootstrap!");
/*    */     }
/*    */   }
/*    */   
/* 14 */   public static final fn a = a("ambient_entity_effect");
/* 15 */   public static final fn b = a("angry_villager");
/* 16 */   public static final fn c = a("barrier");
/* 17 */   public static final fl<fh> d = a("block");
/* 18 */   public static final fn e = a("bubble");
/* 19 */   public static final fn f = a("bubble_column_up");
/* 20 */   public static final fn g = a("cloud");
/* 21 */   public static final fn h = a("crit");
/* 22 */   public static final fn i = a("damage_indicator");
/* 23 */   public static final fn j = a("dragon_breath");
/* 24 */   public static final fn k = a("dripping_lava");
/* 25 */   public static final fn l = a("dripping_water");
/* 26 */   public static final fl<fi> m = a("dust");
/* 27 */   public static final fn n = a("effect");
/* 28 */   public static final fn o = a("elder_guardian");
/* 29 */   public static final fn p = a("enchanted_hit");
/* 30 */   public static final fn q = a("enchant");
/* 31 */   public static final fn r = a("end_rod");
/* 32 */   public static final fn s = a("entity_effect");
/* 33 */   public static final fn t = a("explosion_emitter");
/* 34 */   public static final fn u = a("explosion");
/* 35 */   public static final fl<fh> v = a("falling_dust");
/* 36 */   public static final fn w = a("firework");
/* 37 */   public static final fn x = a("fishing");
/* 38 */   public static final fn y = a("flame");
/* 39 */   public static final fn z = a("happy_villager");
/* 40 */   public static final fn A = a("heart");
/* 41 */   public static final fn B = a("instant_effect");
/* 42 */   public static final fl<fj> C = a("item");
/* 43 */   public static final fn D = a("item_slime");
/* 44 */   public static final fn E = a("item_snowball");
/* 45 */   public static final fn F = a("large_smoke");
/* 46 */   public static final fn G = a("lava");
/* 47 */   public static final fn H = a("mycelium");
/* 48 */   public static final fn I = a("note");
/* 49 */   public static final fn J = a("poof");
/* 50 */   public static final fn K = a("portal");
/* 51 */   public static final fn L = a("rain");
/* 52 */   public static final fn M = a("smoke");
/* 53 */   public static final fn N = a("spit");
/* 54 */   public static final fn O = a("sweep_attack");
/* 55 */   public static final fn P = a("totem_of_undying");
/* 56 */   public static final fn Q = a("underwater");
/* 57 */   public static final fn R = a("splash");
/* 58 */   public static final fn S = a("witch");
/* 59 */   public static final fn T = a("bubble_pop");
/* 60 */   public static final fn U = a("current_down");
/* 61 */   public static final fn V = a("squid_ink");
/* 62 */   public static final fn W = a("nautilus");
/* 63 */   public static final fn X = a("dolphin");
/*    */ 
/*    */   
/*    */   private static <T extends fl<?>> T a(String ☃) {
/* 67 */     fl fl1 = fc.u.b(new pc(☃));
/* 68 */     if (fl1 == null) {
/* 69 */       throw new IllegalStateException("Invalid or unknown particle type: " + ☃);
/*    */     }
/* 71 */     return (T)fl1;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\fm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */