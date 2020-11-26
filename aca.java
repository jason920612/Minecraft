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
/*    */ 
/*    */ public class aca
/*    */   extends abl
/*    */ {
/*    */   public aca(int ☃, Schema schema) {
/* 21 */     super(☃, schema);
/*    */   }
/*    */ 
/*    */   
/*    */   public void registerTypes(Schema ☃, Map<String, Supplier<TypeTemplate>> map1, Map<String, Supplier<TypeTemplate>> map2) {
/* 26 */     super.registerTypes(☃, map1, map2);
/*    */     
/* 28 */     Supplier<TypeTemplate> supplier = () -> DSL.compoundList(aax.q.in(☃), DSL.constType(DSL.intType()));
/*    */     
/* 30 */     ☃.registerType(false, aax.g, () -> DSL.optionalFields("stats", DSL.optionalFields("minecraft:mined", DSL.compoundList(aax.p.in(☃), DSL.constType(DSL.intType())), "minecraft:crafted", supplier.get(), "minecraft:used", supplier.get(), "minecraft:broken", supplier.get(), "minecraft:picked_up", supplier.get(), DSL.optionalFields("minecraft:dropped", supplier.get(), "minecraft:killed", DSL.compoundList(aax.m.in(☃), DSL.constType(DSL.intType())), "minecraft:killed_by", DSL.compoundList(aax.m.in(☃), DSL.constType(DSL.intType())), "minecraft:custom", DSL.compoundList(DSL.constType(DSL.namespacedString()), DSL.constType(DSL.intType()))))));
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\aca.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */