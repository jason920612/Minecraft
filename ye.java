/*    */ import com.google.common.collect.ImmutableMap;
/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.DataFix;
/*    */ import com.mojang.datafixers.TypeRewriteRule;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.datafixers.types.DynamicOps;
/*    */ import com.mojang.datafixers.types.Type;
/*    */ import com.mojang.datafixers.util.Pair;
/*    */ import java.util.Map;
/*    */ import java.util.Objects;
/*    */ import java.util.function.Function;
/*    */ 
/*    */ 
/*    */ public class ye
/*    */   extends DataFix
/*    */ {
/* 17 */   public static final Map<String, String> a = (Map<String, String>)ImmutableMap.builder()
/* 18 */     .put("minecraft:extreme_hills", "minecraft:mountains")
/* 19 */     .put("minecraft:swampland", "minecraft:swamp")
/* 20 */     .put("minecraft:hell", "minecraft:nether")
/* 21 */     .put("minecraft:sky", "minecraft:the_end")
/* 22 */     .put("minecraft:ice_flats", "minecraft:snowy_tundra")
/* 23 */     .put("minecraft:ice_mountains", "minecraft:snowy_mountains")
/* 24 */     .put("minecraft:mushroom_island", "minecraft:mushroom_fields")
/* 25 */     .put("minecraft:mushroom_island_shore", "minecraft:mushroom_field_shore")
/* 26 */     .put("minecraft:beaches", "minecraft:beach")
/* 27 */     .put("minecraft:forest_hills", "minecraft:wooded_hills")
/* 28 */     .put("minecraft:smaller_extreme_hills", "minecraft:mountain_edge")
/* 29 */     .put("minecraft:stone_beach", "minecraft:stone_shore")
/* 30 */     .put("minecraft:cold_beach", "minecraft:snowy_beach")
/* 31 */     .put("minecraft:roofed_forest", "minecraft:dark_forest")
/* 32 */     .put("minecraft:taiga_cold", "minecraft:snowy_taiga")
/* 33 */     .put("minecraft:taiga_cold_hills", "minecraft:snowy_taiga_hills")
/* 34 */     .put("minecraft:redwood_taiga", "minecraft:giant_tree_taiga")
/* 35 */     .put("minecraft:redwood_taiga_hills", "minecraft:giant_tree_taiga_hills")
/* 36 */     .put("minecraft:extreme_hills_with_trees", "minecraft:wooded_mountains")
/* 37 */     .put("minecraft:savanna_rock", "minecraft:savanna_plateau")
/* 38 */     .put("minecraft:mesa", "minecraft:badlands")
/* 39 */     .put("minecraft:mesa_rock", "minecraft:wooded_badlands_plateau")
/* 40 */     .put("minecraft:mesa_clear_rock", "minecraft:badlands_plateau")
/* 41 */     .put("minecraft:sky_island_low", "minecraft:small_end_islands")
/* 42 */     .put("minecraft:sky_island_medium", "minecraft:end_midlands")
/* 43 */     .put("minecraft:sky_island_high", "minecraft:end_highlands")
/* 44 */     .put("minecraft:sky_island_barren", "minecraft:end_barrens")
/* 45 */     .put("minecraft:void", "minecraft:the_void")
/* 46 */     .put("minecraft:mutated_plains", "minecraft:sunflower_plains")
/* 47 */     .put("minecraft:mutated_desert", "minecraft:desert_lakes")
/* 48 */     .put("minecraft:mutated_extreme_hills", "minecraft:gravelly_mountains")
/* 49 */     .put("minecraft:mutated_forest", "minecraft:flower_forest")
/* 50 */     .put("minecraft:mutated_taiga", "minecraft:taiga_mountains")
/* 51 */     .put("minecraft:mutated_swampland", "minecraft:swamp_hills")
/* 52 */     .put("minecraft:mutated_ice_flats", "minecraft:ice_spikes")
/* 53 */     .put("minecraft:mutated_jungle", "minecraft:modified_jungle")
/* 54 */     .put("minecraft:mutated_jungle_edge", "minecraft:modified_jungle_edge")
/* 55 */     .put("minecraft:mutated_birch_forest", "minecraft:tall_birch_forest")
/* 56 */     .put("minecraft:mutated_birch_forest_hills", "minecraft:tall_birch_hills")
/* 57 */     .put("minecraft:mutated_roofed_forest", "minecraft:dark_forest_hills")
/* 58 */     .put("minecraft:mutated_taiga_cold", "minecraft:snowy_taiga_mountains")
/* 59 */     .put("minecraft:mutated_redwood_taiga", "minecraft:giant_spruce_taiga")
/* 60 */     .put("minecraft:mutated_redwood_taiga_hills", "minecraft:giant_spruce_taiga_hills")
/* 61 */     .put("minecraft:mutated_extreme_hills_with_trees", "minecraft:modified_gravelly_mountains")
/* 62 */     .put("minecraft:mutated_savanna", "minecraft:shattered_savanna")
/* 63 */     .put("minecraft:mutated_savanna_rock", "minecraft:shattered_savanna_plateau")
/* 64 */     .put("minecraft:mutated_mesa", "minecraft:eroded_badlands")
/* 65 */     .put("minecraft:mutated_mesa_rock", "minecraft:modified_wooded_badlands_plateau")
/* 66 */     .put("minecraft:mutated_mesa_clear_rock", "minecraft:modified_badlands_plateau")
/*    */     
/* 68 */     .put("minecraft:warm_deep_ocean", "minecraft:deep_warm_ocean")
/* 69 */     .put("minecraft:lukewarm_deep_ocean", "minecraft:deep_lukewarm_ocean")
/* 70 */     .put("minecraft:cold_deep_ocean", "minecraft:deep_cold_ocean")
/* 71 */     .put("minecraft:frozen_deep_ocean", "minecraft:deep_frozen_ocean")
/* 72 */     .build();
/*    */   
/*    */   public ye(Schema ☃, boolean bool) {
/* 75 */     super(☃, bool);
/*    */   }
/*    */ 
/*    */   
/*    */   protected TypeRewriteRule makeRule() {
/* 80 */     Type<Pair<String, String>> ☃ = DSL.named(aax.w.typeName(), DSL.namespacedString());
/* 81 */     if (!Objects.equals(☃, getInputSchema().getType(aax.w))) {
/* 82 */       throw new IllegalStateException("Biome type is not what was expected.");
/*    */     }
/* 84 */     return fixTypeEverywhere("Biomes fix", ☃, ☃ -> ());
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\ye.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */