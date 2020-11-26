/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class ayz
/*    */ {
/*    */   static {
/*  9 */     if (!pf.a()) {
/* 10 */       throw new RuntimeException("Accessed Biomes before Bootstrap!");
/*    */     }
/*    */   }
/*    */   
/* 14 */   public static final ayu a = a("ocean");
/* 15 */   public static final ayu b = a;
/* 16 */   public static final ayu c = a("plains");
/* 17 */   public static final ayu d = a("desert");
/* 18 */   public static final ayu e = a("mountains");
/* 19 */   public static final ayu f = a("forest");
/* 20 */   public static final ayu g = a("taiga");
/* 21 */   public static final ayu h = a("swamp");
/* 22 */   public static final ayu i = a("river");
/* 23 */   public static final ayu j = a("nether");
/* 24 */   public static final ayu k = a("the_end");
/* 25 */   public static final ayu l = a("frozen_ocean");
/* 26 */   public static final ayu m = a("frozen_river");
/* 27 */   public static final ayu n = a("snowy_tundra");
/* 28 */   public static final ayu o = a("snowy_mountains");
/* 29 */   public static final ayu p = a("mushroom_fields");
/* 30 */   public static final ayu q = a("mushroom_field_shore");
/* 31 */   public static final ayu r = a("beach");
/* 32 */   public static final ayu s = a("desert_hills");
/* 33 */   public static final ayu t = a("wooded_hills");
/* 34 */   public static final ayu u = a("taiga_hills");
/* 35 */   public static final ayu v = a("mountain_edge");
/* 36 */   public static final ayu w = a("jungle");
/* 37 */   public static final ayu x = a("jungle_hills");
/* 38 */   public static final ayu y = a("jungle_edge");
/* 39 */   public static final ayu z = a("deep_ocean");
/* 40 */   public static final ayu A = a("stone_shore");
/* 41 */   public static final ayu B = a("snowy_beach");
/* 42 */   public static final ayu C = a("birch_forest");
/* 43 */   public static final ayu D = a("birch_forest_hills");
/* 44 */   public static final ayu E = a("dark_forest");
/* 45 */   public static final ayu F = a("snowy_taiga");
/* 46 */   public static final ayu G = a("snowy_taiga_hills");
/* 47 */   public static final ayu H = a("giant_tree_taiga");
/* 48 */   public static final ayu I = a("giant_tree_taiga_hills");
/* 49 */   public static final ayu J = a("wooded_mountains");
/* 50 */   public static final ayu K = a("savanna");
/* 51 */   public static final ayu L = a("savanna_plateau");
/* 52 */   public static final ayu M = a("badlands");
/* 53 */   public static final ayu N = a("wooded_badlands_plateau");
/* 54 */   public static final ayu O = a("badlands_plateau");
/* 55 */   public static final ayu P = a("small_end_islands");
/* 56 */   public static final ayu Q = a("end_midlands");
/* 57 */   public static final ayu R = a("end_highlands");
/* 58 */   public static final ayu S = a("end_barrens");
/* 59 */   public static final ayu T = a("warm_ocean");
/* 60 */   public static final ayu U = a("lukewarm_ocean");
/* 61 */   public static final ayu V = a("cold_ocean");
/* 62 */   public static final ayu W = a("deep_warm_ocean");
/* 63 */   public static final ayu X = a("deep_lukewarm_ocean");
/* 64 */   public static final ayu Y = a("deep_cold_ocean");
/* 65 */   public static final ayu Z = a("deep_frozen_ocean");
/*    */   
/* 67 */   public static final ayu aa = a("the_void");
/* 68 */   public static final ayu ab = a("sunflower_plains");
/* 69 */   public static final ayu ac = a("desert_lakes");
/* 70 */   public static final ayu ad = a("gravelly_mountains");
/* 71 */   public static final ayu ae = a("flower_forest");
/* 72 */   public static final ayu af = a("taiga_mountains");
/* 73 */   public static final ayu ag = a("swamp_hills");
/* 74 */   public static final ayu ah = a("ice_spikes");
/* 75 */   public static final ayu ai = a("modified_jungle");
/* 76 */   public static final ayu aj = a("modified_jungle_edge");
/* 77 */   public static final ayu ak = a("tall_birch_forest");
/* 78 */   public static final ayu al = a("tall_birch_hills");
/* 79 */   public static final ayu am = a("dark_forest_hills");
/* 80 */   public static final ayu an = a("snowy_taiga_mountains");
/* 81 */   public static final ayu ao = a("giant_spruce_taiga");
/* 82 */   public static final ayu ap = a("giant_spruce_taiga_hills");
/* 83 */   public static final ayu aq = a("modified_gravelly_mountains");
/* 84 */   public static final ayu ar = a("shattered_savanna");
/* 85 */   public static final ayu as = a("shattered_savanna_plateau");
/* 86 */   public static final ayu at = a("eroded_badlands");
/* 87 */   public static final ayu au = a("modified_wooded_badlands_plateau");
/* 88 */   public static final ayu av = a("modified_badlands_plateau");
/*    */   
/*    */   private static ayu a(String ☃) {
/* 91 */     ayu ayu1 = fc.m.b(new pc(☃));
/* 92 */     if (ayu1 == null) {
/* 93 */       throw new IllegalStateException("Invalid Biome requested: " + ☃);
/*    */     }
/* 95 */     return ayu1;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\ayz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */