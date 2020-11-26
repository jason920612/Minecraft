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
/*    */ public class abp
/*    */   extends Schema
/*    */ {
/*    */   public abp(int ☃, Schema schema) {
/* 17 */     super(☃, schema);
/*    */   }
/*    */ 
/*    */   
/*    */   public void registerTypes(Schema ☃, Map<String, Supplier<TypeTemplate>> map1, Map<String, Supplier<TypeTemplate>> map2) {
/* 22 */     super.registerTypes(☃, map1, map2);
/*    */     
/* 24 */     ☃.registerType(true, aax.r, () -> DSL.optionalFields("SpawnPotentials", DSL.list(DSL.fields("Entity", aax.n.in(☃))), "SpawnData", aax.n.in(☃)));
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\abp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */