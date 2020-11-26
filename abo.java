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
/*    */ 
/*    */ public class abo
/*    */   extends Schema
/*    */ {
/*    */   public abo(int ☃, Schema schema) {
/* 22 */     super(☃, schema);
/*    */   }
/*    */ 
/*    */   
/*    */   public void registerTypes(Schema ☃, Map<String, Supplier<TypeTemplate>> map1, Map<String, Supplier<TypeTemplate>> map2) {
/* 27 */     super.registerTypes(☃, map1, map2);
/*    */     
/* 29 */     ☃.registerType(false, aax.v, () -> DSL.constType(DSL.namespacedString()));
/* 30 */     ☃.registerType(false, aax.b, () -> DSL.optionalFields("RootVehicle", DSL.optionalFields("Entity", aax.n.in(☃)), "Inventory", DSL.list(aax.k.in(☃)), "EnderItems", DSL.list(aax.k.in(☃)), DSL.optionalFields("ShoulderEntityLeft", aax.n.in(☃), "ShoulderEntityRight", aax.n.in(☃), "recipeBook", DSL.optionalFields("recipes", DSL.list(aax.v.in(☃)), "toBeDisplayed", DSL.list(aax.v.in(☃))))));
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
/*    */ 
/*    */     
/* 46 */     ☃.registerType(false, aax.d, () -> DSL.compoundList(DSL.list(aax.k.in(☃))));
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\abo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */