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
/*    */ 
/*    */ 
/*    */ public class abv
/*    */   extends abl
/*    */ {
/*    */   public abv(int ☃, Schema schema) {
/* 20 */     super(☃, schema);
/*    */   }
/*    */ 
/*    */   
/*    */   public void registerTypes(Schema ☃, Map<String, Supplier<TypeTemplate>> map1, Map<String, Supplier<TypeTemplate>> map2) {
/* 25 */     super.registerTypes(☃, map1, map2);
/*    */     
/* 27 */     ☃.registerType(false, aax.c, () -> DSL.fields("Level", DSL.optionalFields("Entities", DSL.list(aax.n.in(☃)), "TileEntities", DSL.list(aax.j.in(☃)), "TileTicks", DSL.list(DSL.fields("i", aax.p.in(☃))), "Sections", DSL.list(DSL.optionalFields("Palette", DSL.list(aax.l.in(☃)))))));
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\abv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */