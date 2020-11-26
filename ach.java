/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.datafixers.types.templates.TypeTemplate;
/*    */ import java.util.Map;
/*    */ import java.util.function.Supplier;
/*    */ 
/*    */ 
/*    */ public class ach
/*    */   extends abl
/*    */ {
/*    */   public ach(int ☃, Schema schema) {
/* 11 */     super(☃, schema);
/*    */   }
/*    */ 
/*    */   
/*    */   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema ☃) {
/* 16 */     Map<String, Supplier<TypeTemplate>> map = super.registerEntities(☃);
/*    */     
/* 18 */     map.put("minecraft:cod", map.remove("minecraft:cod_mob"));
/* 19 */     map.put("minecraft:salmon", map.remove("minecraft:salmon_mob"));
/*    */     
/* 21 */     return map;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\ach.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */