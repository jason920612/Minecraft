/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.datafixers.types.templates.TypeTemplate;
/*    */ import java.util.Map;
/*    */ import java.util.function.Supplier;
/*    */ 
/*    */ 
/*    */ public class abz
/*    */   extends abl
/*    */ {
/*    */   public abz(int ☃, Schema schema) {
/* 11 */     super(☃, schema);
/*    */   }
/*    */ 
/*    */   
/*    */   public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema ☃) {
/* 16 */     Map<String, Supplier<TypeTemplate>> map = super.registerBlockEntities(☃);
/*    */     
/* 18 */     map.remove("minecraft:flower_pot");
/* 19 */     map.remove("minecraft:noteblock");
/*    */     
/* 21 */     return map;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\abz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */