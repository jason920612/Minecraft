/*     */ import com.google.common.collect.Maps;
/*     */ import com.mojang.datafixers.DSL;
/*     */ import com.mojang.datafixers.schemas.Schema;
/*     */ import com.mojang.datafixers.types.templates.Hook;
/*     */ import com.mojang.datafixers.types.templates.TypeTemplate;
/*     */ import java.util.Map;
/*     */ import java.util.function.Supplier;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class acc
/*     */   extends abl
/*     */ {
/*     */   public acc(int ☃, Schema schema) {
/*  49 */     super(☃, schema);
/*     */   }
/*     */   
/*     */   protected static void a(Schema ☃, Map<String, Supplier<TypeTemplate>> map, String str) {
/*  53 */     ☃.register(map, str, () -> abm.a(☃));
/*     */   }
/*     */   
/*     */   protected static void b(Schema ☃, Map<String, Supplier<TypeTemplate>> map, String str) {
/*  57 */     ☃.register(map, str, () -> DSL.optionalFields("Items", DSL.list(aax.k.in(☃))));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema ☃) {
/*  64 */     Map<String, Supplier<TypeTemplate>> map = Maps.newHashMap();
/*     */     
/*  66 */     ☃.registerSimple(map, "minecraft:area_effect_cloud");
/*  67 */     a(☃, map, "minecraft:armor_stand");
/*  68 */     ☃.register(map, "minecraft:arrow", str -> DSL.optionalFields("inBlockState", aax.l.in(☃)));
/*     */ 
/*     */     
/*  71 */     a(☃, map, "minecraft:bat");
/*  72 */     a(☃, map, "minecraft:blaze");
/*  73 */     ☃.registerSimple(map, "minecraft:boat");
/*  74 */     a(☃, map, "minecraft:cave_spider");
/*  75 */     ☃.register(map, "minecraft:chest_minecart", str -> DSL.optionalFields("DisplayState", aax.l.in(☃), "Items", DSL.list(aax.k.in(☃))));
/*     */ 
/*     */ 
/*     */     
/*  79 */     a(☃, map, "minecraft:chicken");
/*  80 */     ☃.register(map, "minecraft:commandblock_minecart", str -> DSL.optionalFields("DisplayState", aax.l.in(☃)));
/*     */ 
/*     */     
/*  83 */     a(☃, map, "minecraft:cow");
/*  84 */     a(☃, map, "minecraft:creeper");
/*  85 */     ☃.register(map, "minecraft:donkey", str -> DSL.optionalFields("Items", DSL.list(aax.k.in(☃)), "SaddleItem", aax.k.in(☃), abm.a(☃)));
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  90 */     ☃.registerSimple(map, "minecraft:dragon_fireball");
/*  91 */     ☃.registerSimple(map, "minecraft:egg");
/*  92 */     a(☃, map, "minecraft:elder_guardian");
/*  93 */     ☃.registerSimple(map, "minecraft:ender_crystal");
/*  94 */     a(☃, map, "minecraft:ender_dragon");
/*  95 */     ☃.register(map, "minecraft:enderman", str -> DSL.optionalFields("carriedBlockState", aax.l.in(☃), abm.a(☃)));
/*     */ 
/*     */ 
/*     */     
/*  99 */     a(☃, map, "minecraft:endermite");
/* 100 */     ☃.registerSimple(map, "minecraft:ender_pearl");
/* 101 */     ☃.registerSimple(map, "minecraft:evocation_fangs");
/* 102 */     a(☃, map, "minecraft:evocation_illager");
/* 103 */     ☃.registerSimple(map, "minecraft:eye_of_ender_signal");
/* 104 */     ☃.register(map, "minecraft:falling_block", str -> DSL.optionalFields("BlockState", aax.l.in(☃), "TileEntityData", aax.j.in(☃)));
/*     */ 
/*     */ 
/*     */     
/* 108 */     ☃.registerSimple(map, "minecraft:fireball");
/* 109 */     ☃.register(map, "minecraft:fireworks_rocket", str -> DSL.optionalFields("FireworksItem", aax.k.in(☃)));
/*     */ 
/*     */     
/* 112 */     ☃.register(map, "minecraft:furnace_minecart", str -> DSL.optionalFields("DisplayState", aax.l.in(☃)));
/*     */ 
/*     */     
/* 115 */     a(☃, map, "minecraft:ghast");
/* 116 */     a(☃, map, "minecraft:giant");
/* 117 */     a(☃, map, "minecraft:guardian");
/* 118 */     ☃.register(map, "minecraft:hopper_minecart", str -> DSL.optionalFields("DisplayState", aax.l.in(☃), "Items", DSL.list(aax.k.in(☃))));
/*     */ 
/*     */ 
/*     */     
/* 122 */     ☃.register(map, "minecraft:horse", str -> DSL.optionalFields("ArmorItem", aax.k.in(☃), "SaddleItem", aax.k.in(☃), abm.a(☃)));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 128 */     a(☃, map, "minecraft:husk");
/* 129 */     ☃.registerSimple(map, "minecraft:illusion_illager");
/* 130 */     ☃.register(map, "minecraft:item", str -> DSL.optionalFields("Item", aax.k.in(☃)));
/*     */ 
/*     */     
/* 133 */     ☃.register(map, "minecraft:item_frame", str -> DSL.optionalFields("Item", aax.k.in(☃)));
/*     */ 
/*     */     
/* 136 */     ☃.registerSimple(map, "minecraft:leash_knot");
/* 137 */     ☃.register(map, "minecraft:llama", str -> DSL.optionalFields("Items", DSL.list(aax.k.in(☃)), "SaddleItem", aax.k.in(☃), "DecorItem", aax.k.in(☃), abm.a(☃)));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 143 */     ☃.registerSimple(map, "minecraft:llama_spit");
/* 144 */     a(☃, map, "minecraft:magma_cube");
/* 145 */     ☃.register(map, "minecraft:minecart", str -> DSL.optionalFields("DisplayState", aax.l.in(☃)));
/*     */ 
/*     */     
/* 148 */     a(☃, map, "minecraft:mooshroom");
/* 149 */     ☃.register(map, "minecraft:mule", str -> DSL.optionalFields("Items", DSL.list(aax.k.in(☃)), "SaddleItem", aax.k.in(☃), abm.a(☃)));
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 154 */     a(☃, map, "minecraft:ocelot");
/* 155 */     ☃.registerSimple(map, "minecraft:painting");
/* 156 */     ☃.registerSimple(map, "minecraft:parrot");
/* 157 */     a(☃, map, "minecraft:pig");
/* 158 */     a(☃, map, "minecraft:polar_bear");
/* 159 */     ☃.register(map, "minecraft:potion", str -> DSL.optionalFields("Potion", aax.k.in(☃)));
/*     */ 
/*     */     
/* 162 */     a(☃, map, "minecraft:rabbit");
/* 163 */     a(☃, map, "minecraft:sheep");
/* 164 */     a(☃, map, "minecraft:shulker");
/* 165 */     ☃.registerSimple(map, "minecraft:shulker_bullet");
/* 166 */     a(☃, map, "minecraft:silverfish");
/* 167 */     a(☃, map, "minecraft:skeleton");
/* 168 */     ☃.register(map, "minecraft:skeleton_horse", str -> DSL.optionalFields("SaddleItem", aax.k.in(☃), abm.a(☃)));
/*     */ 
/*     */ 
/*     */     
/* 172 */     a(☃, map, "minecraft:slime");
/* 173 */     ☃.registerSimple(map, "minecraft:small_fireball");
/* 174 */     ☃.registerSimple(map, "minecraft:snowball");
/* 175 */     a(☃, map, "minecraft:snowman");
/* 176 */     ☃.register(map, "minecraft:spawner_minecart", str -> DSL.optionalFields("DisplayState", aax.l.in(☃), aax.r.in(☃)));
/*     */ 
/*     */ 
/*     */     
/* 180 */     ☃.register(map, "minecraft:spectral_arrow", str -> DSL.optionalFields("inBlockState", aax.l.in(☃)));
/*     */ 
/*     */     
/* 183 */     a(☃, map, "minecraft:spider");
/* 184 */     a(☃, map, "minecraft:squid");
/* 185 */     a(☃, map, "minecraft:stray");
/* 186 */     ☃.registerSimple(map, "minecraft:tnt");
/* 187 */     ☃.register(map, "minecraft:tnt_minecart", str -> DSL.optionalFields("DisplayState", aax.l.in(☃)));
/*     */ 
/*     */     
/* 190 */     a(☃, map, "minecraft:vex");
/* 191 */     ☃.register(map, "minecraft:villager", str -> DSL.optionalFields("Inventory", DSL.list(aax.k.in(☃)), "Offers", DSL.optionalFields("Recipes", DSL.list(DSL.optionalFields("buy", aax.k.in(☃), "buyB", aax.k.in(☃), "sell", aax.k.in(☃)))), abm.a(☃)));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 204 */     a(☃, map, "minecraft:villager_golem");
/* 205 */     a(☃, map, "minecraft:vindication_illager");
/* 206 */     a(☃, map, "minecraft:witch");
/* 207 */     a(☃, map, "minecraft:wither");
/* 208 */     a(☃, map, "minecraft:wither_skeleton");
/* 209 */     ☃.registerSimple(map, "minecraft:wither_skull");
/* 210 */     a(☃, map, "minecraft:wolf");
/* 211 */     ☃.registerSimple(map, "minecraft:xp_bottle");
/* 212 */     ☃.registerSimple(map, "minecraft:xp_orb");
/* 213 */     a(☃, map, "minecraft:zombie");
/* 214 */     ☃.register(map, "minecraft:zombie_horse", str -> DSL.optionalFields("SaddleItem", aax.k.in(☃), abm.a(☃)));
/*     */ 
/*     */ 
/*     */     
/* 218 */     a(☃, map, "minecraft:zombie_pigman");
/* 219 */     a(☃, map, "minecraft:zombie_villager");
/*     */     
/* 221 */     return map;
/*     */   }
/*     */ 
/*     */   
/*     */   public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema ☃) {
/* 226 */     Map<String, Supplier<TypeTemplate>> map = Maps.newHashMap();
/*     */     
/* 228 */     b(☃, map, "minecraft:furnace");
/* 229 */     b(☃, map, "minecraft:chest");
/* 230 */     b(☃, map, "minecraft:trapped_chest");
/* 231 */     ☃.registerSimple(map, "minecraft:ender_chest");
/* 232 */     ☃.register(map, "minecraft:jukebox", str -> DSL.optionalFields("RecordItem", aax.k.in(☃)));
/*     */ 
/*     */     
/* 235 */     b(☃, map, "minecraft:dispenser");
/* 236 */     b(☃, map, "minecraft:dropper");
/* 237 */     ☃.registerSimple(map, "minecraft:sign");
/* 238 */     ☃.register(map, "minecraft:mob_spawner", str -> aax.r.in(☃));
/* 239 */     ☃.register(map, "minecraft:piston", str -> DSL.optionalFields("blockState", aax.l.in(☃)));
/*     */ 
/*     */     
/* 242 */     b(☃, map, "minecraft:brewing_stand");
/* 243 */     ☃.registerSimple(map, "minecraft:enchanting_table");
/* 244 */     ☃.registerSimple(map, "minecraft:end_portal");
/* 245 */     ☃.registerSimple(map, "minecraft:beacon");
/* 246 */     ☃.registerSimple(map, "minecraft:skull");
/* 247 */     ☃.registerSimple(map, "minecraft:daylight_detector");
/* 248 */     b(☃, map, "minecraft:hopper");
/* 249 */     ☃.registerSimple(map, "minecraft:comparator");
/* 250 */     ☃.registerSimple(map, "minecraft:banner");
/* 251 */     ☃.registerSimple(map, "minecraft:structure_block");
/* 252 */     ☃.registerSimple(map, "minecraft:end_gateway");
/* 253 */     ☃.registerSimple(map, "minecraft:command_block");
/* 254 */     b(☃, map, "minecraft:shulker_box");
/* 255 */     ☃.registerSimple(map, "minecraft:bed");
/*     */     
/* 257 */     return map;
/*     */   }
/*     */ 
/*     */   
/*     */   public void registerTypes(Schema ☃, Map<String, Supplier<TypeTemplate>> map1, Map<String, Supplier<TypeTemplate>> map2) {
/* 262 */     ☃.registerType(false, aax.a, DSL::remainder);
/* 263 */     ☃.registerType(false, aax.v, () -> DSL.constType(DSL.namespacedString()));
/* 264 */     ☃.registerType(false, aax.b, () -> DSL.optionalFields("RootVehicle", DSL.optionalFields("Entity", aax.n.in(☃)), "Inventory", DSL.list(aax.k.in(☃)), "EnderItems", DSL.list(aax.k.in(☃)), DSL.optionalFields("ShoulderEntityLeft", aax.n.in(☃), "ShoulderEntityRight", aax.n.in(☃), "recipeBook", DSL.optionalFields("recipes", DSL.list(aax.v.in(☃)), "toBeDisplayed", DSL.list(aax.v.in(☃))))));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 281 */     ☃.registerType(false, aax.c, () -> DSL.fields("Level", DSL.optionalFields("Entities", DSL.list(aax.n.in(☃)), "TileEntities", DSL.list(aax.j.in(☃)), "TileTicks", DSL.list(DSL.fields("i", aax.p.in(☃))), "Sections", DSL.list(DSL.optionalFields("Palette", DSL.list(aax.l.in(☃)))))));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 291 */     ☃.registerType(true, aax.j, () -> DSL.taggedChoiceLazy("id", DSL.namespacedString(), ☃));
/* 292 */     ☃.registerType(true, aax.n, () -> DSL.optionalFields("Passengers", DSL.list(aax.n.in(☃)), aax.o.in(☃)));
/*     */ 
/*     */ 
/*     */     
/* 296 */     ☃.registerType(true, aax.o, () -> DSL.taggedChoiceLazy("id", DSL.namespacedString(), ☃));
/* 297 */     ☃.registerType(true, aax.k, () -> DSL.hook(DSL.optionalFields("id", aax.q.in(☃), "tag", DSL.optionalFields("EntityTag", aax.n.in(☃), "BlockEntityTag", aax.j.in(☃), "CanDestroy", DSL.list(aax.p.in(☃)), "CanPlaceOn", DSL.list(aax.p.in(☃)))), acp.a, Hook.HookFunction.IDENTITY));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 306 */     ☃.registerType(false, aax.d, () -> DSL.compoundList(DSL.list(aax.k.in(☃))));
/* 307 */     ☃.registerType(false, aax.e, DSL::remainder);
/* 308 */     ☃.registerType(false, aax.f, () -> DSL.optionalFields("entities", DSL.list(DSL.optionalFields("nbt", aax.n.in(☃))), "blocks", DSL.list(DSL.optionalFields("nbt", aax.j.in(☃))), "palette", DSL.list(aax.l.in(☃))));
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 313 */     ☃.registerType(false, aax.p, () -> DSL.constType(DSL.namespacedString()));
/* 314 */     ☃.registerType(false, aax.q, () -> DSL.constType(DSL.namespacedString()));
/* 315 */     ☃.registerType(false, aax.l, DSL::remainder);
/* 316 */     Supplier<TypeTemplate> supplier = () -> DSL.compoundList(aax.q.in(☃), DSL.constType(DSL.intType()));
/*     */     
/* 318 */     ☃.registerType(false, aax.g, () -> DSL.optionalFields("stats", DSL.optionalFields("minecraft:mined", DSL.compoundList(aax.p.in(☃), DSL.constType(DSL.intType())), "minecraft:crafted", supplier.get(), "minecraft:used", supplier.get(), "minecraft:broken", supplier.get(), "minecraft:picked_up", supplier.get(), DSL.optionalFields("minecraft:dropped", supplier.get(), "minecraft:killed", DSL.compoundList(aax.m.in(☃), DSL.constType(DSL.intType())), "minecraft:killed_by", DSL.compoundList(aax.m.in(☃), DSL.constType(DSL.intType())), "minecraft:custom", DSL.compoundList(DSL.constType(DSL.namespacedString()), DSL.constType(DSL.intType()))))));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 333 */     ☃.registerType(false, aax.h, () -> DSL.optionalFields("data", DSL.optionalFields("Features", DSL.compoundList(aax.s.in(☃)), "Objectives", DSL.list(aax.t.in(☃)), "Teams", DSL.list(aax.u.in(☃)))));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 340 */     ☃.registerType(false, aax.s, () -> DSL.optionalFields("Children", DSL.list(DSL.optionalFields("CA", aax.l.in(☃), "CB", aax.l.in(☃), "CC", aax.l.in(☃), "CD", aax.l.in(☃)))));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 348 */     ☃.registerType(false, aax.t, DSL::remainder);
/* 349 */     ☃.registerType(false, aax.u, DSL::remainder);
/* 350 */     ☃.registerType(true, aax.r, () -> DSL.optionalFields("SpawnPotentials", DSL.list(DSL.fields("Entity", aax.n.in(☃))), "SpawnData", aax.n.in(☃)));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 356 */     ☃.registerType(false, aax.i, () -> DSL.optionalFields("minecraft:adventure/adventuring_time", DSL.optionalFields("criteria", DSL.compoundList(aax.w.in(☃), DSL.constType(DSL.string()))), "minecraft:adventure/kill_a_mob", DSL.optionalFields("criteria", DSL.compoundList(aax.m.in(☃), DSL.constType(DSL.string()))), "minecraft:adventure/kill_all_mobs", DSL.optionalFields("criteria", DSL.compoundList(aax.m.in(☃), DSL.constType(DSL.string()))), "minecraft:husbandry/bred_all_animals", DSL.optionalFields("criteria", DSL.compoundList(aax.m.in(☃), DSL.constType(DSL.string())))));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 370 */     ☃.registerType(false, aax.w, () -> DSL.constType(DSL.namespacedString()));
/* 371 */     ☃.registerType(false, aax.m, () -> DSL.constType(DSL.namespacedString()));
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\acc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */