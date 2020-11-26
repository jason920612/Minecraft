/*     */ import com.google.common.collect.Maps;
/*     */ import com.mojang.datafixers.DSL;
/*     */ import com.mojang.datafixers.DataFixUtils;
/*     */ import com.mojang.datafixers.Dynamic;
/*     */ import com.mojang.datafixers.schemas.Schema;
/*     */ import com.mojang.datafixers.types.DynamicOps;
/*     */ import com.mojang.datafixers.types.templates.Hook;
/*     */ import com.mojang.datafixers.types.templates.TypeTemplate;
/*     */ import java.util.HashMap;
/*     */ import java.util.Map;
/*     */ import java.util.Objects;
/*     */ import java.util.function.Supplier;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
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
/*     */ public class acr
/*     */   extends Schema
/*     */ {
/*  48 */   private static final Logger b = LogManager.getLogger();
/*     */   
/*     */   public acr(int ☃, Schema schema) {
/*  51 */     super(☃, schema);
/*     */   }
/*     */   private static final Map<String, String> c;
/*     */   protected static TypeTemplate a(Schema ☃) {
/*  55 */     return DSL.optionalFields("Equipment", 
/*  56 */         DSL.list(aax.k.in(☃)));
/*     */   }
/*     */ 
/*     */   
/*     */   protected static void a(Schema ☃, Map<String, Supplier<TypeTemplate>> map, String str) {
/*  61 */     ☃.register(map, str, () -> a(☃));
/*     */   }
/*     */   
/*     */   protected static void b(Schema ☃, Map<String, Supplier<TypeTemplate>> map, String str) {
/*  65 */     ☃.register(map, str, () -> DSL.optionalFields("inTile", aax.p.in(☃)));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected static void c(Schema ☃, Map<String, Supplier<TypeTemplate>> map, String str) {
/*  72 */     ☃.register(map, str, () -> DSL.optionalFields("DisplayTile", aax.p.in(☃)));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected static void d(Schema ☃, Map<String, Supplier<TypeTemplate>> map, String str) {
/*  78 */     ☃.register(map, str, () -> DSL.optionalFields("Items", DSL.list(aax.k.in(☃))));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema ☃) {
/*  85 */     Map<String, Supplier<TypeTemplate>> map = Maps.newHashMap();
/*     */     
/*  87 */     ☃.register(map, "Item", str -> DSL.optionalFields("Item", aax.k.in(☃)));
/*     */ 
/*     */     
/*  90 */     ☃.registerSimple(map, "XPOrb");
/*  91 */     b(☃, map, "ThrownEgg");
/*  92 */     ☃.registerSimple(map, "LeashKnot");
/*  93 */     ☃.registerSimple(map, "Painting");
/*  94 */     ☃.register(map, "Arrow", str -> DSL.optionalFields("inTile", aax.p.in(☃)));
/*     */ 
/*     */     
/*  97 */     ☃.register(map, "TippedArrow", str -> DSL.optionalFields("inTile", aax.p.in(☃)));
/*     */ 
/*     */     
/* 100 */     ☃.register(map, "SpectralArrow", str -> DSL.optionalFields("inTile", aax.p.in(☃)));
/*     */ 
/*     */     
/* 103 */     b(☃, map, "Snowball");
/* 104 */     b(☃, map, "Fireball");
/* 105 */     b(☃, map, "SmallFireball");
/* 106 */     b(☃, map, "ThrownEnderpearl");
/* 107 */     ☃.registerSimple(map, "EyeOfEnderSignal");
/* 108 */     ☃.register(map, "ThrownPotion", str -> DSL.optionalFields("inTile", aax.p.in(☃), "Potion", aax.k.in(☃)));
/*     */ 
/*     */ 
/*     */     
/* 112 */     b(☃, map, "ThrownExpBottle");
/* 113 */     ☃.register(map, "ItemFrame", str -> DSL.optionalFields("Item", aax.k.in(☃)));
/*     */ 
/*     */     
/* 116 */     b(☃, map, "WitherSkull");
/* 117 */     ☃.registerSimple(map, "PrimedTnt");
/* 118 */     ☃.register(map, "FallingSand", str -> DSL.optionalFields("Block", aax.p.in(☃), "TileEntityData", aax.j.in(☃)));
/*     */ 
/*     */ 
/*     */     
/* 122 */     ☃.register(map, "FireworksRocketEntity", str -> DSL.optionalFields("FireworksItem", aax.k.in(☃)));
/*     */ 
/*     */     
/* 125 */     ☃.registerSimple(map, "Boat");
/*     */ 
/*     */     
/* 128 */     ☃.register(map, "Minecart", () -> DSL.optionalFields("DisplayTile", aax.p.in(☃), "Items", DSL.list(aax.k.in(☃))));
/*     */ 
/*     */ 
/*     */     
/* 132 */     c(☃, map, "MinecartRideable");
/* 133 */     ☃.register(map, "MinecartChest", str -> DSL.optionalFields("DisplayTile", aax.p.in(☃), "Items", DSL.list(aax.k.in(☃))));
/*     */ 
/*     */ 
/*     */     
/* 137 */     c(☃, map, "MinecartFurnace");
/* 138 */     c(☃, map, "MinecartTNT");
/* 139 */     ☃.register(map, "MinecartSpawner", () -> DSL.optionalFields("DisplayTile", aax.p.in(☃), aax.r.in(☃)));
/*     */ 
/*     */ 
/*     */     
/* 143 */     ☃.register(map, "MinecartHopper", str -> DSL.optionalFields("DisplayTile", aax.p.in(☃), "Items", DSL.list(aax.k.in(☃))));
/*     */ 
/*     */ 
/*     */     
/* 147 */     c(☃, map, "MinecartCommandBlock");
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 152 */     a(☃, map, "ArmorStand");
/* 153 */     a(☃, map, "Creeper");
/* 154 */     a(☃, map, "Skeleton");
/* 155 */     a(☃, map, "Spider");
/* 156 */     a(☃, map, "Giant");
/* 157 */     a(☃, map, "Zombie");
/* 158 */     a(☃, map, "Slime");
/* 159 */     a(☃, map, "Ghast");
/* 160 */     a(☃, map, "PigZombie");
/* 161 */     ☃.register(map, "Enderman", str -> DSL.optionalFields("carried", aax.p.in(☃), a(☃)));
/*     */ 
/*     */ 
/*     */     
/* 165 */     a(☃, map, "CaveSpider");
/* 166 */     a(☃, map, "Silverfish");
/* 167 */     a(☃, map, "Blaze");
/* 168 */     a(☃, map, "LavaSlime");
/* 169 */     a(☃, map, "EnderDragon");
/* 170 */     a(☃, map, "WitherBoss");
/* 171 */     a(☃, map, "Bat");
/* 172 */     a(☃, map, "Witch");
/* 173 */     a(☃, map, "Endermite");
/* 174 */     a(☃, map, "Guardian");
/* 175 */     a(☃, map, "Pig");
/* 176 */     a(☃, map, "Sheep");
/* 177 */     a(☃, map, "Cow");
/* 178 */     a(☃, map, "Chicken");
/* 179 */     a(☃, map, "Squid");
/* 180 */     a(☃, map, "Wolf");
/* 181 */     a(☃, map, "MushroomCow");
/* 182 */     a(☃, map, "SnowMan");
/* 183 */     a(☃, map, "Ozelot");
/* 184 */     a(☃, map, "VillagerGolem");
/* 185 */     ☃.register(map, "EntityHorse", str -> DSL.optionalFields("Items", DSL.list(aax.k.in(☃)), "ArmorItem", aax.k.in(☃), "SaddleItem", aax.k.in(☃), a(☃)));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 191 */     a(☃, map, "Rabbit");
/* 192 */     ☃.register(map, "Villager", str -> DSL.optionalFields("Inventory", DSL.list(aax.k.in(☃)), "Offers", DSL.optionalFields("Recipes", DSL.list(DSL.optionalFields("buy", aax.k.in(☃), "buyB", aax.k.in(☃), "sell", aax.k.in(☃)))), a(☃)));
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
/* 205 */     ☃.registerSimple(map, "EnderCrystal");
/*     */ 
/*     */ 
/*     */     
/* 209 */     ☃.registerSimple(map, "AreaEffectCloud");
/* 210 */     ☃.registerSimple(map, "ShulkerBullet");
/* 211 */     a(☃, map, "Shulker");
/*     */     
/* 213 */     return map;
/*     */   }
/*     */ 
/*     */   
/*     */   public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema ☃) {
/* 218 */     Map<String, Supplier<TypeTemplate>> map = Maps.newHashMap();
/*     */     
/* 220 */     d(☃, map, "Furnace");
/* 221 */     d(☃, map, "Chest");
/* 222 */     ☃.registerSimple(map, "EnderChest");
/* 223 */     ☃.register(map, "RecordPlayer", str -> DSL.optionalFields("RecordItem", aax.k.in(☃)));
/*     */ 
/*     */     
/* 226 */     d(☃, map, "Trap");
/* 227 */     d(☃, map, "Dropper");
/* 228 */     ☃.registerSimple(map, "Sign");
/* 229 */     ☃.register(map, "MobSpawner", str -> aax.r.in(☃));
/* 230 */     ☃.registerSimple(map, "Music");
/* 231 */     ☃.registerSimple(map, "Piston");
/* 232 */     d(☃, map, "Cauldron");
/* 233 */     ☃.registerSimple(map, "EnchantTable");
/* 234 */     ☃.registerSimple(map, "Airportal");
/* 235 */     ☃.registerSimple(map, "Control");
/* 236 */     ☃.registerSimple(map, "Beacon");
/* 237 */     ☃.registerSimple(map, "Skull");
/* 238 */     ☃.registerSimple(map, "DLDetector");
/* 239 */     d(☃, map, "Hopper");
/* 240 */     ☃.registerSimple(map, "Comparator");
/* 241 */     ☃.register(map, "FlowerPot", str -> DSL.optionalFields("Item", DSL.or(DSL.constType(DSL.intType()), aax.q.in(☃))));
/*     */ 
/*     */     
/* 244 */     ☃.registerSimple(map, "Banner");
/*     */ 
/*     */ 
/*     */     
/* 248 */     ☃.registerSimple(map, "Structure");
/* 249 */     ☃.registerSimple(map, "EndGateway");
/* 250 */     return map;
/*     */   }
/*     */ 
/*     */   
/*     */   public void registerTypes(Schema ☃, Map<String, Supplier<TypeTemplate>> map1, Map<String, Supplier<TypeTemplate>> map2) {
/* 255 */     ☃.registerType(false, aax.a, DSL::remainder);
/* 256 */     ☃.registerType(false, aax.b, () -> DSL.optionalFields("Inventory", DSL.list(aax.k.in(☃)), "EnderItems", DSL.list(aax.k.in(☃))));
/*     */ 
/*     */ 
/*     */     
/* 260 */     ☃.registerType(false, aax.c, () -> DSL.fields("Level", DSL.optionalFields("Entities", DSL.list(aax.n.in(☃)), "TileEntities", DSL.list(aax.j.in(☃)), "TileTicks", DSL.list(DSL.fields("i", aax.p.in(☃))))));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 267 */     ☃.registerType(true, aax.j, () -> DSL.taggedChoiceLazy("id", DSL.string(), ☃));
/* 268 */     ☃.registerType(true, aax.n, () -> DSL.optionalFields("Riding", aax.n.in(☃), aax.o.in(☃)));
/*     */ 
/*     */ 
/*     */     
/* 272 */     ☃.registerType(false, aax.m, () -> DSL.constType(DSL.namespacedString()));
/* 273 */     ☃.registerType(true, aax.o, () -> DSL.taggedChoiceLazy("id", DSL.string(), ☃));
/* 274 */     ☃.registerType(true, aax.k, () -> DSL.hook(DSL.optionalFields("id", DSL.or(DSL.constType(DSL.intType()), aax.q.in(☃)), "tag", DSL.optionalFields("EntityTag", aax.n.in(☃), "BlockEntityTag", aax.j.in(☃), "CanDestroy", DSL.list(aax.p.in(☃)), "CanPlaceOn", DSL.list(aax.p.in(☃)))), a, Hook.HookFunction.IDENTITY));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 283 */     ☃.registerType(false, aax.e, DSL::remainder);
/* 284 */     ☃.registerType(false, aax.p, () -> DSL.or(DSL.constType(DSL.intType()), DSL.constType(DSL.namespacedString())));
/* 285 */     ☃.registerType(false, aax.q, () -> DSL.constType(DSL.namespacedString()));
/* 286 */     ☃.registerType(false, aax.g, DSL::remainder);
/* 287 */     ☃.registerType(false, aax.h, () -> DSL.optionalFields("data", DSL.optionalFields("Features", DSL.compoundList(aax.s.in(☃)), "Objectives", DSL.list(aax.t.in(☃)), "Teams", DSL.list(aax.u.in(☃)))));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 294 */     ☃.registerType(false, aax.s, DSL::remainder);
/* 295 */     ☃.registerType(false, aax.t, DSL::remainder);
/* 296 */     ☃.registerType(false, aax.u, DSL::remainder);
/*     */     
/* 298 */     ☃.registerType(true, aax.r, DSL::remainder);
/*     */   }
/*     */   static {
/* 301 */     c = (Map<String, String>)DataFixUtils.make(Maps.newHashMap(), ☃ -> {
/*     */           ☃.put("minecraft:furnace", "Furnace");
/*     */           ☃.put("minecraft:lit_furnace", "Furnace");
/*     */           ☃.put("minecraft:chest", "Chest");
/*     */           ☃.put("minecraft:trapped_chest", "Chest");
/*     */           ☃.put("minecraft:ender_chest", "EnderChest");
/*     */           ☃.put("minecraft:jukebox", "RecordPlayer");
/*     */           ☃.put("minecraft:dispenser", "Trap");
/*     */           ☃.put("minecraft:dropper", "Dropper");
/*     */           ☃.put("minecraft:sign", "Sign");
/*     */           ☃.put("minecraft:mob_spawner", "MobSpawner");
/*     */           ☃.put("minecraft:noteblock", "Music");
/*     */           ☃.put("minecraft:brewing_stand", "Cauldron");
/*     */           ☃.put("minecraft:enhanting_table", "EnchantTable");
/*     */           ☃.put("minecraft:command_block", "CommandBlock");
/*     */           ☃.put("minecraft:beacon", "Beacon");
/*     */           ☃.put("minecraft:skull", "Skull");
/*     */           ☃.put("minecraft:daylight_detector", "DLDetector");
/*     */           ☃.put("minecraft:hopper", "Hopper");
/*     */           ☃.put("minecraft:banner", "Banner");
/*     */           ☃.put("minecraft:flower_pot", "FlowerPot");
/*     */           ☃.put("minecraft:repeating_command_block", "CommandBlock");
/*     */           ☃.put("minecraft:chain_command_block", "CommandBlock");
/*     */           ☃.put("minecraft:standing_sign", "Sign");
/*     */           ☃.put("minecraft:wall_sign", "Sign");
/*     */           ☃.put("minecraft:piston_head", "Piston");
/*     */           ☃.put("minecraft:daylight_detector_inverted", "DLDetector");
/*     */           ☃.put("minecraft:unpowered_comparator", "Comparator");
/*     */           ☃.put("minecraft:powered_comparator", "Comparator");
/*     */           ☃.put("minecraft:wall_banner", "Banner");
/*     */           ☃.put("minecraft:standing_banner", "Banner");
/*     */           ☃.put("minecraft:structure_block", "Structure");
/*     */           ☃.put("minecraft:end_portal", "Airportal");
/*     */           ☃.put("minecraft:end_gateway", "EndGateway");
/*     */           ☃.put("minecraft:shield", "Banner");
/*     */         });
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 343 */   protected static final Hook.HookFunction a = new Hook.HookFunction()
/*     */     {
/*     */       public <T> T apply(DynamicOps<T> ☃, T t) {
/* 346 */         return acr.a(new Dynamic(☃, t), acr.a(), "ArmorStand");
/*     */       }
/*     */     };
/*     */   
/*     */   protected static <T> T a(Dynamic<T> ☃, Map<String, String> map, String str) {
/* 351 */     return (T)☃.update("tag", dynamic1 -> dynamic1.update("BlockEntityTag", ()).update("EntityTag", ()))
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
/* 367 */       .getValue();
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\acr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */