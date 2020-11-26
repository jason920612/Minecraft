/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.datafixers.types.templates.TypeTemplate;
/*    */ import java.util.Map;
/*    */ import java.util.function.Supplier;
/*    */ 
/*    */ 
/*    */ public class abq
/*    */   extends Schema
/*    */ {
/*    */   public abq(int ☃, Schema schema) {
/* 11 */     super(☃, schema);
/*    */   }
/*    */ 
/*    */   
/*    */   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema ☃) {
/* 16 */     Map<String, Supplier<TypeTemplate>> map = super.registerEntities(☃);
/*    */     
/* 18 */     map.remove("Minecart");
/*    */     
/* 20 */     return map;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\abq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */