/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.datafixers.types.templates.TypeTemplate;
/*    */ import java.util.Map;
/*    */ import java.util.function.Supplier;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class abw
/*    */   extends abl
/*    */ {
/*    */   public abw(int ☃, Schema schema) {
/* 14 */     super(☃, schema);
/*    */   }
/*    */ 
/*    */   
/*    */   public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema ☃) {
/* 19 */     Map<String, Supplier<TypeTemplate>> map = super.registerBlockEntities(☃);
/*    */     
/* 21 */     ☃.register(map, "minecraft:piston", str -> DSL.optionalFields("blockState", aax.l.in(☃)));
/*    */ 
/*    */ 
/*    */     
/* 25 */     return map;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\abw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */