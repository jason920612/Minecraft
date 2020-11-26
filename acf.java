/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.datafixers.types.templates.TypeTemplate;
/*    */ import java.util.Map;
/*    */ import java.util.function.Supplier;
/*    */ 
/*    */ 
/*    */ public class acf
/*    */   extends abl
/*    */ {
/*    */   public acf(int ☃, Schema schema) {
/* 11 */     super(☃, schema);
/*    */   }
/*    */ 
/*    */   
/*    */   public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema ☃) {
/* 16 */     Map<String, Supplier<TypeTemplate>> map = super.registerBlockEntities(☃);
/*    */     
/* 18 */     ☃.registerSimple(map, "minecraft:conduit");
/*    */     
/* 20 */     return map;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\acf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */