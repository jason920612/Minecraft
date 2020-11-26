/*     */ import com.google.common.collect.Sets;
/*     */ import java.util.Collections;
/*     */ import java.util.Set;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ccl
/*     */ {
/*  13 */   private static final Logger aS = LogManager.getLogger();
/*     */   
/*  15 */   private static final Set<pc> aT = Sets.newHashSet();
/*  16 */   private static final Set<pc> aU = Collections.unmodifiableSet(aT);
/*     */   
/*  18 */   public static final pc a = a("empty");
/*     */ 
/*     */   
/*  21 */   public static final pc b = a("chests/spawn_bonus_chest");
/*  22 */   public static final pc c = a("chests/end_city_treasure");
/*  23 */   public static final pc d = a("chests/simple_dungeon");
/*  24 */   public static final pc e = a("chests/village_blacksmith");
/*  25 */   public static final pc f = a("chests/abandoned_mineshaft");
/*  26 */   public static final pc g = a("chests/nether_bridge");
/*  27 */   public static final pc h = a("chests/stronghold_library");
/*  28 */   public static final pc i = a("chests/stronghold_crossing");
/*  29 */   public static final pc j = a("chests/stronghold_corridor");
/*  30 */   public static final pc k = a("chests/desert_pyramid");
/*  31 */   public static final pc l = a("chests/jungle_temple");
/*  32 */   public static final pc m = a("chests/jungle_temple_dispenser");
/*  33 */   public static final pc n = a("chests/igloo_chest");
/*  34 */   public static final pc o = a("chests/woodland_mansion");
/*  35 */   public static final pc p = a("chests/underwater_ruin_small");
/*  36 */   public static final pc q = a("chests/underwater_ruin_big");
/*  37 */   public static final pc r = a("chests/buried_treasure");
/*  38 */   public static final pc s = a("chests/shipwreck_map");
/*  39 */   public static final pc t = a("chests/shipwreck_supply");
/*  40 */   public static final pc u = a("chests/shipwreck_treasure");
/*     */ 
/*     */   
/*  43 */   public static final pc v = a("entities/witch");
/*  44 */   public static final pc w = a("entities/blaze");
/*  45 */   public static final pc x = a("entities/creeper");
/*  46 */   public static final pc y = a("entities/spider");
/*  47 */   public static final pc z = a("entities/cave_spider");
/*  48 */   public static final pc A = a("entities/giant");
/*  49 */   public static final pc B = a("entities/silverfish");
/*  50 */   public static final pc C = a("entities/enderman");
/*  51 */   public static final pc D = a("entities/guardian");
/*  52 */   public static final pc E = a("entities/elder_guardian");
/*  53 */   public static final pc F = a("entities/shulker");
/*  54 */   public static final pc G = a("entities/iron_golem");
/*  55 */   public static final pc H = a("entities/snow_golem");
/*  56 */   public static final pc I = a("entities/rabbit");
/*  57 */   public static final pc J = a("entities/chicken");
/*  58 */   public static final pc K = a("entities/phantom");
/*  59 */   public static final pc L = a("entities/pig");
/*  60 */   public static final pc M = a("entities/polar_bear");
/*  61 */   public static final pc N = a("entities/horse");
/*  62 */   public static final pc O = a("entities/donkey");
/*  63 */   public static final pc P = a("entities/mule");
/*  64 */   public static final pc Q = a("entities/zombie_horse");
/*  65 */   public static final pc R = a("entities/skeleton_horse");
/*  66 */   public static final pc S = a("entities/cow");
/*  67 */   public static final pc T = a("entities/mushroom_cow");
/*  68 */   public static final pc U = a("entities/wolf");
/*  69 */   public static final pc V = a("entities/ocelot");
/*  70 */   public static final pc W = a("entities/sheep");
/*  71 */   public static final pc X = a("entities/sheep/white");
/*  72 */   public static final pc Y = a("entities/sheep/orange");
/*  73 */   public static final pc Z = a("entities/sheep/magenta");
/*  74 */   public static final pc aa = a("entities/sheep/light_blue");
/*  75 */   public static final pc ab = a("entities/sheep/yellow");
/*  76 */   public static final pc ac = a("entities/sheep/lime");
/*  77 */   public static final pc ad = a("entities/sheep/pink");
/*  78 */   public static final pc ae = a("entities/sheep/gray");
/*  79 */   public static final pc af = a("entities/sheep/light_gray");
/*  80 */   public static final pc ag = a("entities/sheep/cyan");
/*  81 */   public static final pc ah = a("entities/sheep/purple");
/*  82 */   public static final pc ai = a("entities/sheep/blue");
/*  83 */   public static final pc aj = a("entities/sheep/brown");
/*  84 */   public static final pc ak = a("entities/sheep/green");
/*  85 */   public static final pc al = a("entities/sheep/red");
/*  86 */   public static final pc am = a("entities/sheep/black");
/*  87 */   public static final pc an = a("entities/bat");
/*  88 */   public static final pc ao = a("entities/slime");
/*  89 */   public static final pc ap = a("entities/magma_cube");
/*  90 */   public static final pc aq = a("entities/ghast");
/*  91 */   public static final pc ar = a("entities/squid");
/*  92 */   public static final pc as = a("entities/endermite");
/*  93 */   public static final pc at = a("entities/zombie");
/*  94 */   public static final pc au = a("entities/zombie_pigman");
/*  95 */   public static final pc av = a("entities/skeleton");
/*  96 */   public static final pc aw = a("entities/wither_skeleton");
/*  97 */   public static final pc ax = a("entities/stray");
/*  98 */   public static final pc ay = a("entities/husk");
/*  99 */   public static final pc az = a("entities/zombie_villager");
/* 100 */   public static final pc aA = a("entities/villager");
/* 101 */   public static final pc aB = a("entities/evoker");
/* 102 */   public static final pc aC = a("entities/vindicator");
/* 103 */   public static final pc aD = a("entities/llama");
/* 104 */   public static final pc aE = a("entities/parrot");
/* 105 */   public static final pc aF = a("entities/pufferfish");
/* 106 */   public static final pc aG = a("entities/vex");
/* 107 */   public static final pc aH = a("entities/ender_dragon");
/* 108 */   public static final pc aI = a("entities/turtle");
/* 109 */   public static final pc aJ = a("entities/salmon");
/* 110 */   public static final pc aK = a("entities/cod");
/* 111 */   public static final pc aL = a("entities/tropical_fish");
/* 112 */   public static final pc aM = a("entities/drowned");
/* 113 */   public static final pc aN = a("entities/dolphin");
/*     */ 
/*     */   
/* 116 */   public static final pc aO = a("gameplay/fishing");
/* 117 */   public static final pc aP = a("gameplay/fishing/junk");
/* 118 */   public static final pc aQ = a("gameplay/fishing/treasure");
/* 119 */   public static final pc aR = a("gameplay/fishing/fish");
/*     */   
/*     */   private static pc a(String ☃) {
/* 122 */     return a(new pc(☃));
/*     */   }
/*     */   
/*     */   public static pc a(pc ☃) {
/* 126 */     if (aT.add(☃)) {
/* 127 */       return ☃;
/*     */     }
/*     */     
/* 130 */     throw new IllegalArgumentException(☃ + " is already a registered built-in loot table");
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\ccl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */