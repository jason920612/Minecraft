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
/*    */ public class aaw
/*    */   extends DataFix
/*    */ {
/* 17 */   private static final Map<String, String> a = (Map<String, String>)ImmutableMap.builder()
/* 18 */     .put("minecraft:acacia_bark", "minecraft:acacia_wood")
/* 19 */     .put("minecraft:birch_bark", "minecraft:birch_wood")
/* 20 */     .put("minecraft:dark_oak_bark", "minecraft:dark_oak_wood")
/* 21 */     .put("minecraft:jungle_bark", "minecraft:jungle_wood")
/* 22 */     .put("minecraft:oak_bark", "minecraft:oak_wood")
/* 23 */     .put("minecraft:spruce_bark", "minecraft:spruce_wood")
/* 24 */     .build();
/*    */   
/*    */   public aaw(Schema ☃, boolean bool) {
/* 27 */     super(☃, bool);
/*    */   }
/*    */ 
/*    */   
/*    */   protected TypeRewriteRule makeRule() {
/* 32 */     Type<Pair<String, String>> ☃ = DSL.named(aax.v.typeName(), DSL.namespacedString());
/* 33 */     if (!Objects.equals(☃, getInputSchema().getType(aax.v))) {
/* 34 */       throw new IllegalStateException("Recipe type is not what was expected.");
/*    */     }
/* 36 */     return fixTypeEverywhere("Recipes renamening fix", ☃, ☃ -> ());
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\aaw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */