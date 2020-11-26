/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.datafixers.types.templates.TypeTemplate;
/*    */ import java.util.Map;
/*    */ import java.util.function.Supplier;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class abr
/*    */   extends abl
/*    */ {
/*    */   public abr(int ☃, Schema schema) {
/* 20 */     super(☃, schema);
/*    */   }
/*    */ 
/*    */   
/*    */   public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema ☃) {
/* 25 */     Map<String, Supplier<TypeTemplate>> map = super.registerBlockEntities(☃);
/*    */     
/* 27 */     ☃.registerSimple(map, "minecraft:bed");
/*    */     
/* 29 */     return map;
/*    */   }
/*    */ 
/*    */   
/*    */   public void registerTypes(Schema ☃, Map<String, Supplier<TypeTemplate>> map1, Map<String, Supplier<TypeTemplate>> map2) {
/* 34 */     super.registerTypes(☃, map1, map2);
/* 35 */     ☃.registerType(false, aax.i, () -> DSL.optionalFields("minecraft:adventure/adventuring_time", DSL.optionalFields("criteria", DSL.compoundList(aax.w.in(☃), DSL.constType(DSL.string()))), "minecraft:adventure/kill_a_mob", DSL.optionalFields("criteria", DSL.compoundList(aax.m.in(☃), DSL.constType(DSL.string()))), "minecraft:adventure/kill_all_mobs", DSL.optionalFields("criteria", DSL.compoundList(aax.m.in(☃), DSL.constType(DSL.string()))), "minecraft:husbandry/bred_all_animals", DSL.optionalFields("criteria", DSL.compoundList(aax.m.in(☃), DSL.constType(DSL.string())))));
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 49 */     ☃.registerType(false, aax.w, () -> DSL.constType(DSL.namespacedString()));
/* 50 */     ☃.registerType(false, aax.m, () -> DSL.constType(DSL.namespacedString()));
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\abr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */