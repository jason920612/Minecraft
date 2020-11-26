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
/*    */ public class acb
/*    */   extends abl
/*    */ {
/*    */   public acb(int ☃, Schema schema) {
/* 16 */     super(☃, schema);
/*    */   }
/*    */ 
/*    */   
/*    */   public void registerTypes(Schema ☃, Map<String, Supplier<TypeTemplate>> map1, Map<String, Supplier<TypeTemplate>> map2) {
/* 21 */     super.registerTypes(☃, map1, map2);
/*    */     
/* 23 */     ☃.registerType(false, aax.s, () -> DSL.optionalFields("Children", DSL.list(DSL.optionalFields("CA", aax.l.in(☃), "CB", aax.l.in(☃), "CC", aax.l.in(☃), "CD", aax.l.in(☃)))));
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\acb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */