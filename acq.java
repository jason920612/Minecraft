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
/*    */ public class acq
/*    */   extends abl
/*    */ {
/*    */   public acq(int ☃, Schema schema) {
/* 15 */     super(☃, schema);
/*    */   }
/*    */   
/*    */   protected static void a(Schema ☃, Map<String, Supplier<TypeTemplate>> map, String str) {
/* 19 */     ☃.register(map, str, () -> DSL.optionalFields("Items", DSL.list(aax.k.in(☃))));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema ☃) {
/* 26 */     Map<String, Supplier<TypeTemplate>> map = super.registerBlockEntities(☃);
/*    */     
/* 28 */     a(☃, map, "minecraft:shulker_box");
/*    */     
/* 30 */     return map;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\acq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */