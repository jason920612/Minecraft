/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ws
/*     */ {
/*  11 */   public static final wr<bcs> a = a("mined", fc.g);
/*  12 */   public static final wr<ata> b = a("crafted", fc.s);
/*  13 */   public static final wr<ata> c = a("used", fc.s);
/*  14 */   public static final wr<ata> d = a("broken", fc.s);
/*  15 */   public static final wr<ata> e = a("picked_up", fc.s);
/*  16 */   public static final wr<ata> f = a("dropped", fc.s);
/*  17 */   public static final wr<aev<?>> g = a("killed", fc.r);
/*  18 */   public static final wr<aev<?>> h = a("killed_by", fc.r);
/*  19 */   public static final wr<pc> i = a("custom", fc.l);
/*     */ 
/*     */   
/*  22 */   public static final pc j = a("leave_game", wq.DEFAULT);
/*     */   
/*  24 */   public static final pc k = a("play_one_minute", wq.TIME);
/*  25 */   public static final pc l = a("time_since_death", wq.TIME);
/*  26 */   public static final pc m = a("time_since_rest", wq.TIME);
/*  27 */   public static final pc n = a("sneak_time", wq.TIME);
/*     */   
/*  29 */   public static final pc o = a("walk_one_cm", wq.DISTANCE);
/*  30 */   public static final pc p = a("crouch_one_cm", wq.DISTANCE);
/*  31 */   public static final pc q = a("sprint_one_cm", wq.DISTANCE);
/*  32 */   public static final pc r = a("walk_on_water_one_cm", wq.DISTANCE);
/*  33 */   public static final pc s = a("fall_one_cm", wq.DISTANCE);
/*  34 */   public static final pc t = a("climb_one_cm", wq.DISTANCE);
/*  35 */   public static final pc u = a("fly_one_cm", wq.DISTANCE);
/*  36 */   public static final pc v = a("walk_under_water_one_cm", wq.DISTANCE);
/*  37 */   public static final pc w = a("minecart_one_cm", wq.DISTANCE);
/*  38 */   public static final pc x = a("boat_one_cm", wq.DISTANCE);
/*  39 */   public static final pc y = a("pig_one_cm", wq.DISTANCE);
/*  40 */   public static final pc z = a("horse_one_cm", wq.DISTANCE);
/*  41 */   public static final pc A = a("aviate_one_cm", wq.DISTANCE);
/*  42 */   public static final pc B = a("swim_one_cm", wq.DISTANCE);
/*     */   
/*  44 */   public static final pc C = a("jump", wq.DEFAULT);
/*  45 */   public static final pc D = a("drop", wq.DEFAULT);
/*     */   
/*  47 */   public static final pc E = a("damage_dealt", wq.DIVIDE_BY_TEN);
/*  48 */   public static final pc F = a("damage_dealt_absorbed", wq.DIVIDE_BY_TEN);
/*  49 */   public static final pc G = a("damage_dealt_resisted", wq.DIVIDE_BY_TEN);
/*     */   
/*  51 */   public static final pc H = a("damage_taken", wq.DIVIDE_BY_TEN);
/*  52 */   public static final pc I = a("damage_blocked_by_shield", wq.DIVIDE_BY_TEN);
/*  53 */   public static final pc J = a("damage_absorbed", wq.DIVIDE_BY_TEN);
/*  54 */   public static final pc K = a("damage_resisted", wq.DIVIDE_BY_TEN);
/*     */   
/*  56 */   public static final pc L = a("deaths", wq.DEFAULT);
/*  57 */   public static final pc M = a("mob_kills", wq.DEFAULT);
/*  58 */   public static final pc N = a("animals_bred", wq.DEFAULT);
/*  59 */   public static final pc O = a("player_kills", wq.DEFAULT);
/*  60 */   public static final pc P = a("fish_caught", wq.DEFAULT);
/*     */   
/*  62 */   public static final pc Q = a("talked_to_villager", wq.DEFAULT);
/*  63 */   public static final pc R = a("traded_with_villager", wq.DEFAULT);
/*     */   
/*  65 */   public static final pc S = a("eat_cake_slice", wq.DEFAULT);
/*  66 */   public static final pc T = a("fill_cauldron", wq.DEFAULT);
/*  67 */   public static final pc U = a("use_cauldron", wq.DEFAULT);
/*  68 */   public static final pc V = a("clean_armor", wq.DEFAULT);
/*  69 */   public static final pc W = a("clean_banner", wq.DEFAULT);
/*  70 */   public static final pc X = a("clean_shulker_box", wq.DEFAULT);
/*  71 */   public static final pc Y = a("interact_with_brewingstand", wq.DEFAULT);
/*  72 */   public static final pc Z = a("interact_with_beacon", wq.DEFAULT);
/*  73 */   public static final pc aa = a("inspect_dropper", wq.DEFAULT);
/*  74 */   public static final pc ab = a("inspect_hopper", wq.DEFAULT);
/*  75 */   public static final pc ac = a("inspect_dispenser", wq.DEFAULT);
/*  76 */   public static final pc ad = a("play_noteblock", wq.DEFAULT);
/*  77 */   public static final pc ae = a("tune_noteblock", wq.DEFAULT);
/*  78 */   public static final pc af = a("pot_flower", wq.DEFAULT);
/*  79 */   public static final pc ag = a("trigger_trapped_chest", wq.DEFAULT);
/*  80 */   public static final pc ah = a("open_enderchest", wq.DEFAULT);
/*  81 */   public static final pc ai = a("enchant_item", wq.DEFAULT);
/*  82 */   public static final pc aj = a("play_record", wq.DEFAULT);
/*  83 */   public static final pc ak = a("interact_with_furnace", wq.DEFAULT);
/*  84 */   public static final pc al = a("interact_with_crafting_table", wq.DEFAULT);
/*  85 */   public static final pc am = a("open_chest", wq.DEFAULT);
/*  86 */   public static final pc an = a("sleep_in_bed", wq.DEFAULT);
/*  87 */   public static final pc ao = a("open_shulker_box", wq.DEFAULT);
/*     */ 
/*     */   
/*     */   public static void a() {}
/*     */ 
/*     */   
/*     */   private static pc a(String ☃, wq wq1) {
/*  94 */     pc pc1 = new pc(☃);
/*  95 */     fc.l.a(pc1, pc1);
/*  96 */     i.a(pc1, wq1);
/*  97 */     return pc1;
/*     */   }
/*     */   
/*     */   private static <T> wr<T> a(String ☃, fc<T> fc1) {
/* 101 */     wr<T> wr1 = new wr<>(fc1);
/* 102 */     fc.w.a(new pc(☃), wr1);
/* 103 */     return wr1;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\ws.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */