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
/*    */ public class acn
/*    */   extends Schema
/*    */ {
/*    */   public acn(int ☃, Schema schema) {
/* 15 */     super(☃, schema);
/*    */   }
/*    */ 
/*    */   
/*    */   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema ☃) {
/* 20 */     Map<String, Supplier<TypeTemplate>> map = super.registerEntities(☃);
/*    */     
/* 22 */     map.remove("EntityHorse");
/* 23 */     ☃.register(map, "Horse", () -> DSL.optionalFields("ArmorItem", aax.k.in(☃), "SaddleItem", aax.k.in(☃), abm.a(☃)));
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 28 */     ☃.register(map, "Donkey", () -> DSL.optionalFields("Items", DSL.list(aax.k.in(☃)), "SaddleItem", aax.k.in(☃), abm.a(☃)));
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 33 */     ☃.register(map, "Mule", () -> DSL.optionalFields("Items", DSL.list(aax.k.in(☃)), "SaddleItem", aax.k.in(☃), abm.a(☃)));
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 38 */     ☃.register(map, "ZombieHorse", () -> DSL.optionalFields("SaddleItem", aax.k.in(☃), abm.a(☃)));
/*    */ 
/*    */ 
/*    */     
/* 42 */     ☃.register(map, "SkeletonHorse", () -> DSL.optionalFields("SaddleItem", aax.k.in(☃), abm.a(☃)));
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 47 */     return map;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\acn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */