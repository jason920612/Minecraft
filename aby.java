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
/*    */ public class aby
/*    */   extends abl
/*    */ {
/*    */   public aby(int ☃, Schema schema) {
/* 15 */     super(☃, schema);
/*    */   }
/*    */ 
/*    */   
/*    */   public void registerTypes(Schema ☃, Map<String, Supplier<TypeTemplate>> map1, Map<String, Supplier<TypeTemplate>> map2) {
/* 20 */     super.registerTypes(☃, map1, map2);
/*    */     
/* 22 */     ☃.registerType(false, aax.p, () -> DSL.constType(DSL.namespacedString()));
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\aby.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */