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
/*    */ public class abs
/*    */   extends Schema
/*    */ {
/*    */   public abs(int ☃, Schema schema) {
/* 18 */     super(☃, schema);
/*    */   }
/*    */ 
/*    */   
/*    */   public void registerTypes(Schema ☃, Map<String, Supplier<TypeTemplate>> map1, Map<String, Supplier<TypeTemplate>> map2) {
/* 23 */     super.registerTypes(☃, map1, map2);
/*    */     
/* 25 */     ☃.registerType(false, aax.b, () -> DSL.optionalFields("RootVehicle", DSL.optionalFields("Entity", aax.n.in(☃)), "Inventory", DSL.list(aax.k.in(☃)), "EnderItems", DSL.list(aax.k.in(☃))));
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 32 */     ☃.registerType(true, aax.n, () -> DSL.optionalFields("Passengers", DSL.list(aax.n.in(☃)), aax.o.in(☃)));
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\abs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */