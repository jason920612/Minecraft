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
/*    */ public class aav
/*    */   extends DataFix
/*    */ {
/* 17 */   private static final Map<String, String> a = (Map<String, String>)ImmutableMap.builder()
/* 18 */     .put("minecraft:acacia_wooden_slab", "minecraft:acacia_slab")
/* 19 */     .put("minecraft:birch_wooden_slab", "minecraft:birch_slab")
/* 20 */     .put("minecraft:black_stained_hardened_clay", "minecraft:black_terracotta")
/* 21 */     .put("minecraft:blue_stained_hardened_clay", "minecraft:blue_terracotta")
/* 22 */     .put("minecraft:boat", "minecraft:oak_boat")
/* 23 */     .put("minecraft:bone_meal_from_block", "minecraft:bone_meal_from_bone_block")
/* 24 */     .put("minecraft:bone_meal_from_bone", "minecraft:bone_meal")
/* 25 */     .put("minecraft:brick_block", "minecraft:bricks")
/* 26 */     .put("minecraft:brown_stained_hardened_clay", "minecraft:brown_terracotta")
/* 27 */     .put("minecraft:chiseled_stonebrick", "minecraft:chiseled_stone_bricks")
/* 28 */     .put("minecraft:cyan_stained_hardened_clay", "minecraft:cyan_terracotta")
/* 29 */     .put("minecraft:dark_oak_wooden_slab", "minecraft:dark_oak_slab")
/* 30 */     .put("minecraft:end_bricks", "minecraft:end_stone_bricks")
/* 31 */     .put("minecraft:fence_gate", "minecraft:oak_fence_gate")
/* 32 */     .put("minecraft:fence", "minecraft:oak_fence")
/* 33 */     .put("minecraft:golden_rail", "minecraft:powered_rail")
/* 34 */     .put("minecraft:gold_ingot_from_block", "minecraft:gold_ingot_from_gold_block")
/* 35 */     .put("minecraft:gray_stained_hardened_clay", "minecraft:gray_terracotta")
/* 36 */     .put("minecraft:green_stained_hardened_clay", "minecraft:green_terracotta")
/* 37 */     .put("minecraft:iron_ingot_from_block", "minecraft:iron_ingot_from_iron_block")
/* 38 */     .put("minecraft:jungle_wooden_slab", "minecraft:jungle_slab")
/* 39 */     .put("minecraft:light_blue_stained_hardened_clay", "minecraft:light_blue_terracotta")
/* 40 */     .put("minecraft:light_gray_stained_hardened_clay", "minecraft:light_gray_terracotta")
/* 41 */     .put("minecraft:lime_stained_hardened_clay", "minecraft:lime_terracotta")
/* 42 */     .put("minecraft:lit_pumpkin", "minecraft:jack_o_lantern")
/* 43 */     .put("minecraft:magenta_stained_hardened_clay", "minecraft:magenta_terracotta")
/* 44 */     .put("minecraft:magma", "minecraft:magma_block")
/* 45 */     .put("minecraft:melon_block", "minecraft:melon")
/* 46 */     .put("minecraft:mossy_stonebrick", "minecraft:mossy_stone_bricks")
/* 47 */     .put("minecraft:noteblock", "minecraft:note_block")
/* 48 */     .put("minecraft:oak_wooden_slab", "minecraft:oak_slab")
/* 49 */     .put("minecraft:orange_stained_hardened_clay", "minecraft:orange_terracotta")
/* 50 */     .put("minecraft:pillar_quartz_block", "minecraft:quartz_pillar")
/* 51 */     .put("minecraft:pink_stained_hardened_clay", "minecraft:pink_terracotta")
/* 52 */     .put("minecraft:purple_shulker_box", "minecraft:shulker_box")
/* 53 */     .put("minecraft:purple_stained_hardened_clay", "minecraft:purple_terracotta")
/* 54 */     .put("minecraft:red_nether_brick", "minecraft:red_nether_bricks")
/* 55 */     .put("minecraft:red_stained_hardened_clay", "minecraft:red_terracotta")
/* 56 */     .put("minecraft:slime", "minecraft:slime_block")
/* 57 */     .put("minecraft:smooth_red_sandstone", "minecraft:cut_red_sandstone")
/* 58 */     .put("minecraft:smooth_sandstone", "minecraft:cut_sandstone")
/* 59 */     .put("minecraft:snow_layer", "minecraft:snow")
/* 60 */     .put("minecraft:snow", "minecraft:snow_block")
/* 61 */     .put("minecraft:speckled_melon", "minecraft:glistering_melon_slice")
/* 62 */     .put("minecraft:spruce_wooden_slab", "minecraft:spruce_slab")
/* 63 */     .put("minecraft:stonebrick", "minecraft:stone_bricks")
/* 64 */     .put("minecraft:stone_stairs", "minecraft:cobblestone_stairs")
/* 65 */     .put("minecraft:string_to_wool", "minecraft:white_wool_from_string")
/* 66 */     .put("minecraft:trapdoor", "minecraft:oak_trapdoor")
/* 67 */     .put("minecraft:white_stained_hardened_clay", "minecraft:white_terracotta")
/* 68 */     .put("minecraft:wooden_button", "minecraft:oak_button")
/* 69 */     .put("minecraft:wooden_door", "minecraft:oak_door")
/* 70 */     .put("minecraft:wooden_pressure_plate", "minecraft:oak_pressure_plate")
/* 71 */     .put("minecraft:yellow_stained_hardened_clay", "minecraft:yellow_terracotta")
/* 72 */     .build();
/*    */   
/*    */   public aav(Schema ☃, boolean bool) {
/* 75 */     super(☃, bool);
/*    */   }
/*    */ 
/*    */   
/*    */   protected TypeRewriteRule makeRule() {
/* 80 */     Type<Pair<String, String>> ☃ = DSL.named(aax.v.typeName(), DSL.namespacedString());
/* 81 */     if (!Objects.equals(☃, getInputSchema().getType(aax.v))) {
/* 82 */       throw new IllegalStateException("Recipe type is not what was expected.");
/*    */     }
/* 84 */     return fixTypeEverywhere("Recipes fix", ☃, ☃ -> ());
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\aav.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */