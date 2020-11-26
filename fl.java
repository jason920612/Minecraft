/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class fl<T extends fk>
/*    */ {
/*    */   private final pc a;
/*    */   private final boolean b;
/*    */   private final fk.a<T> c;
/*    */   
/*    */   protected fl(pc ☃, boolean bool, fk.a<T> a1) {
/* 12 */     this.a = ☃;
/* 13 */     this.b = bool;
/* 14 */     this.c = a1;
/*    */   }
/*    */   
/*    */   public static void c() {
/* 18 */     a("ambient_entity_effect", false);
/* 19 */     a("angry_villager", false);
/* 20 */     a("barrier", false);
/* 21 */     a("block", false, fh.a);
/* 22 */     a("bubble", false);
/* 23 */     a("cloud", false);
/* 24 */     a("crit", false);
/* 25 */     a("damage_indicator", true);
/* 26 */     a("dragon_breath", false);
/* 27 */     a("dripping_lava", false);
/* 28 */     a("dripping_water", false);
/* 29 */     a("dust", false, fi.b);
/* 30 */     a("effect", false);
/* 31 */     a("elder_guardian", true);
/* 32 */     a("enchanted_hit", false);
/* 33 */     a("enchant", false);
/* 34 */     a("end_rod", false);
/* 35 */     a("entity_effect", false);
/* 36 */     a("explosion_emitter", true);
/* 37 */     a("explosion", true);
/* 38 */     a("falling_dust", false, fh.a);
/* 39 */     a("firework", false);
/* 40 */     a("fishing", false);
/* 41 */     a("flame", false);
/* 42 */     a("happy_villager", false);
/* 43 */     a("heart", false);
/* 44 */     a("instant_effect", false);
/* 45 */     a("item", false, fj.a);
/* 46 */     a("item_slime", false);
/* 47 */     a("item_snowball", false);
/* 48 */     a("large_smoke", false);
/* 49 */     a("lava", false);
/* 50 */     a("mycelium", false);
/* 51 */     a("note", false);
/* 52 */     a("poof", true);
/* 53 */     a("portal", false);
/* 54 */     a("rain", false);
/* 55 */     a("smoke", false);
/* 56 */     a("spit", true);
/* 57 */     a("squid_ink", true);
/* 58 */     a("sweep_attack", true);
/* 59 */     a("totem_of_undying", false);
/* 60 */     a("underwater", false);
/* 61 */     a("splash", false);
/* 62 */     a("witch", false);
/* 63 */     a("bubble_pop", false);
/* 64 */     a("current_down", false);
/* 65 */     a("bubble_column_up", false);
/* 66 */     a("nautilus", false);
/* 67 */     a("dolphin", false);
/*    */   }
/*    */   
/*    */   public pc d() {
/* 71 */     return this.a;
/*    */   }
/*    */   
/*    */   public boolean e() {
/* 75 */     return this.b;
/*    */   }
/*    */   
/*    */   public fk.a<T> f() {
/* 79 */     return this.c;
/*    */   }
/*    */   
/*    */   private static void a(String ☃, boolean bool) {
/* 83 */     fc.u.a(new pc(☃), new fn(new pc(☃), bool));
/*    */   }
/*    */   
/*    */   private static <T extends fk> void a(String ☃, boolean bool, fk.a<T> a1) {
/* 87 */     fc.u.a(new pc(☃), new fl<>(new pc(☃), bool, a1));
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\fl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */