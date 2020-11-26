/*     */ import com.google.common.collect.Maps;
/*     */ import com.mojang.datafixers.DSL;
/*     */ import com.mojang.datafixers.Dynamic;
/*     */ import com.mojang.datafixers.schemas.Schema;
/*     */ import com.mojang.datafixers.types.DynamicOps;
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
/*     */ public class acp
/*     */   extends abl
/*     */ {
/*     */   public acp(int ☃, Schema schema) {
/*  28 */     super(☃, schema);
/*     */   }
/*     */   
/*     */   protected static void a(Schema ☃, Map<String, Supplier<TypeTemplate>> map, String str) {
/*  32 */     ☃.register(map, str, () -> abm.a(☃));
/*     */   }
/*     */   
/*     */   protected static void b(Schema ☃, Map<String, Supplier<TypeTemplate>> map, String str) {
/*  36 */     ☃.register(map, str, () -> DSL.optionalFields("inTile", aax.p.in(☃)));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema ☃) {
/*  43 */     Map<String, Supplier<TypeTemplate>> map = Maps.newHashMap();
/*     */     
/*  45 */     ☃.registerSimple(map, "minecraft:area_effect_cloud");
/*  46 */     a(☃, map, "minecraft:armor_stand");
/*  47 */     ☃.register(map, "minecraft:arrow", str -> DSL.optionalFields("inTile", aax.p.in(☃)));
/*     */ 
/*     */     
/*  50 */     a(☃, map, "minecraft:bat");
/*  51 */     a(☃, map, "minecraft:blaze");
/*  52 */     ☃.registerSimple(map, "minecraft:boat");
/*  53 */     a(☃, map, "minecraft:cave_spider");
/*  54 */     ☃.register(map, "minecraft:chest_minecart", str -> DSL.optionalFields("DisplayTile", aax.p.in(☃), "Items", DSL.list(aax.k.in(☃))));
/*     */ 
/*     */ 
/*     */     
/*  58 */     a(☃, map, "minecraft:chicken");
/*  59 */     ☃.register(map, "minecraft:commandblock_minecart", str -> DSL.optionalFields("DisplayTile", aax.p.in(☃)));
/*     */ 
/*     */     
/*  62 */     a(☃, map, "minecraft:cow");
/*  63 */     a(☃, map, "minecraft:creeper");
/*  64 */     ☃.register(map, "minecraft:donkey", str -> DSL.optionalFields("Items", DSL.list(aax.k.in(☃)), "SaddleItem", aax.k.in(☃), abm.a(☃)));
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  69 */     ☃.registerSimple(map, "minecraft:dragon_fireball");
/*  70 */     b(☃, map, "minecraft:egg");
/*  71 */     a(☃, map, "minecraft:elder_guardian");
/*  72 */     ☃.registerSimple(map, "minecraft:ender_crystal");
/*  73 */     a(☃, map, "minecraft:ender_dragon");
/*  74 */     ☃.register(map, "minecraft:enderman", str -> DSL.optionalFields("carried", aax.p.in(☃), abm.a(☃)));
/*     */ 
/*     */ 
/*     */     
/*  78 */     a(☃, map, "minecraft:endermite");
/*  79 */     b(☃, map, "minecraft:ender_pearl");
/*  80 */     ☃.registerSimple(map, "minecraft:eye_of_ender_signal");
/*  81 */     ☃.register(map, "minecraft:falling_block", str -> DSL.optionalFields("Block", aax.p.in(☃), "TileEntityData", aax.j.in(☃)));
/*     */ 
/*     */ 
/*     */     
/*  85 */     b(☃, map, "minecraft:fireball");
/*  86 */     ☃.register(map, "minecraft:fireworks_rocket", str -> DSL.optionalFields("FireworksItem", aax.k.in(☃)));
/*     */ 
/*     */     
/*  89 */     ☃.register(map, "minecraft:furnace_minecart", str -> DSL.optionalFields("DisplayTile", aax.p.in(☃)));
/*     */ 
/*     */     
/*  92 */     a(☃, map, "minecraft:ghast");
/*  93 */     a(☃, map, "minecraft:giant");
/*  94 */     a(☃, map, "minecraft:guardian");
/*  95 */     ☃.register(map, "minecraft:hopper_minecart", str -> DSL.optionalFields("DisplayTile", aax.p.in(☃), "Items", DSL.list(aax.k.in(☃))));
/*     */ 
/*     */ 
/*     */     
/*  99 */     ☃.register(map, "minecraft:horse", str -> DSL.optionalFields("ArmorItem", aax.k.in(☃), "SaddleItem", aax.k.in(☃), abm.a(☃)));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 105 */     a(☃, map, "minecraft:husk");
/* 106 */     ☃.register(map, "minecraft:item", str -> DSL.optionalFields("Item", aax.k.in(☃)));
/*     */ 
/*     */     
/* 109 */     ☃.register(map, "minecraft:item_frame", str -> DSL.optionalFields("Item", aax.k.in(☃)));
/*     */ 
/*     */     
/* 112 */     ☃.registerSimple(map, "minecraft:leash_knot");
/* 113 */     a(☃, map, "minecraft:magma_cube");
/* 114 */     ☃.register(map, "minecraft:minecart", str -> DSL.optionalFields("DisplayTile", aax.p.in(☃)));
/*     */ 
/*     */     
/* 117 */     a(☃, map, "minecraft:mooshroom");
/* 118 */     ☃.register(map, "minecraft:mule", str -> DSL.optionalFields("Items", DSL.list(aax.k.in(☃)), "SaddleItem", aax.k.in(☃), abm.a(☃)));
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 123 */     a(☃, map, "minecraft:ocelot");
/* 124 */     ☃.registerSimple(map, "minecraft:painting");
/* 125 */     ☃.registerSimple(map, "minecraft:parrot");
/* 126 */     a(☃, map, "minecraft:pig");
/* 127 */     a(☃, map, "minecraft:polar_bear");
/* 128 */     ☃.register(map, "minecraft:potion", str -> DSL.optionalFields("Potion", aax.k.in(☃), "inTile", aax.p.in(☃)));
/*     */ 
/*     */ 
/*     */     
/* 132 */     a(☃, map, "minecraft:rabbit");
/* 133 */     a(☃, map, "minecraft:sheep");
/* 134 */     a(☃, map, "minecraft:shulker");
/* 135 */     ☃.registerSimple(map, "minecraft:shulker_bullet");
/* 136 */     a(☃, map, "minecraft:silverfish");
/* 137 */     a(☃, map, "minecraft:skeleton");
/* 138 */     ☃.register(map, "minecraft:skeleton_horse", str -> DSL.optionalFields("SaddleItem", aax.k.in(☃), abm.a(☃)));
/*     */ 
/*     */ 
/*     */     
/* 142 */     a(☃, map, "minecraft:slime");
/* 143 */     b(☃, map, "minecraft:small_fireball");
/* 144 */     b(☃, map, "minecraft:snowball");
/* 145 */     a(☃, map, "minecraft:snowman");
/* 146 */     ☃.register(map, "minecraft:spawner_minecart", str -> DSL.optionalFields("DisplayTile", aax.p.in(☃), aax.r.in(☃)));
/*     */ 
/*     */ 
/*     */     
/* 150 */     ☃.register(map, "minecraft:spectral_arrow", str -> DSL.optionalFields("inTile", aax.p.in(☃)));
/*     */ 
/*     */     
/* 153 */     a(☃, map, "minecraft:spider");
/* 154 */     a(☃, map, "minecraft:squid");
/* 155 */     a(☃, map, "minecraft:stray");
/* 156 */     ☃.registerSimple(map, "minecraft:tnt");
/* 157 */     ☃.register(map, "minecraft:tnt_minecart", str -> DSL.optionalFields("DisplayTile", aax.p.in(☃)));
/*     */ 
/*     */     
/* 160 */     ☃.register(map, "minecraft:villager", str -> DSL.optionalFields("Inventory", DSL.list(aax.k.in(☃)), "Offers", DSL.optionalFields("Recipes", DSL.list(DSL.optionalFields("buy", aax.k.in(☃), "buyB", aax.k.in(☃), "sell", aax.k.in(☃)))), abm.a(☃)));
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
/* 173 */     a(☃, map, "minecraft:villager_golem");
/* 174 */     a(☃, map, "minecraft:witch");
/* 175 */     a(☃, map, "minecraft:wither");
/* 176 */     a(☃, map, "minecraft:wither_skeleton");
/* 177 */     b(☃, map, "minecraft:wither_skull");
/* 178 */     a(☃, map, "minecraft:wolf");
/* 179 */     b(☃, map, "minecraft:xp_bottle");
/* 180 */     ☃.registerSimple(map, "minecraft:xp_orb");
/* 181 */     a(☃, map, "minecraft:zombie");
/* 182 */     ☃.register(map, "minecraft:zombie_horse", str -> DSL.optionalFields("SaddleItem", aax.k.in(☃), abm.a(☃)));
/*     */ 
/*     */ 
/*     */     
/* 186 */     a(☃, map, "minecraft:zombie_pigman");
/* 187 */     a(☃, map, "minecraft:zombie_villager");
/*     */ 
/*     */     
/* 190 */     ☃.registerSimple(map, "minecraft:evocation_fangs");
/* 191 */     a(☃, map, "minecraft:evocation_illager");
/* 192 */     ☃.registerSimple(map, "minecraft:illusion_illager");
/* 193 */     ☃.register(map, "minecraft:llama", str -> DSL.optionalFields("Items", DSL.list(aax.k.in(☃)), "SaddleItem", aax.k.in(☃), "DecorItem", aax.k.in(☃), abm.a(☃)));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 199 */     ☃.registerSimple(map, "minecraft:llama_spit");
/* 200 */     a(☃, map, "minecraft:vex");
/* 201 */     a(☃, map, "minecraft:vindication_illager");
/*     */     
/* 203 */     return map;
/*     */   }
/*     */ 
/*     */   
/*     */   public void registerTypes(Schema ☃, Map<String, Supplier<TypeTemplate>> map1, Map<String, Supplier<TypeTemplate>> map2) {
/* 208 */     super.registerTypes(☃, map1, map2);
/* 209 */     ☃.registerType(true, aax.o, () -> DSL.taggedChoiceLazy("id", DSL.namespacedString(), ☃));
/* 210 */     ☃.registerType(true, aax.k, () -> DSL.hook(DSL.optionalFields("id", aax.q.in(☃), "tag", DSL.optionalFields("EntityTag", aax.n.in(☃), "BlockEntityTag", aax.j.in(☃), "CanDestroy", DSL.list(aax.p.in(☃)), "CanPlaceOn", DSL.list(aax.p.in(☃)))), a, Hook.HookFunction.IDENTITY));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 221 */   protected static final Hook.HookFunction a = new Hook.HookFunction()
/*     */     {
/*     */       public <T> T apply(DynamicOps<T> ☃, T t) {
/* 224 */         return acr.a(new Dynamic(☃, t), aco.a, "minecraft:armor_stand");
/*     */       }
/*     */     };
/*     */ }


/* Location:              F:\dw\server.jar!\acp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */