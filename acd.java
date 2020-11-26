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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class acd
/*    */   extends abl
/*    */ {
/*    */   public acd(int ☃, Schema schema) {
/* 24 */     super(☃, schema);
/*    */   }
/*    */ 
/*    */   
/*    */   public void registerTypes(Schema ☃, Map<String, Supplier<TypeTemplate>> map1, Map<String, Supplier<TypeTemplate>> map2) {
/* 29 */     super.registerTypes(☃, map1, map2);
/*    */     
/* 31 */     ☃.registerType(false, aax.c, () -> DSL.fields("Level", DSL.optionalFields("Entities", DSL.list(aax.n.in(☃)), "TileEntities", DSL.list(aax.j.in(☃)), "TileTicks", DSL.list(DSL.fields("i", aax.p.in(☃))), "Sections", DSL.list(DSL.optionalFields("Palette", DSL.list(aax.l.in(☃)))), "Structures", DSL.optionalFields("Starts", DSL.compoundList(aax.s.in(☃))))));
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
/*    */ 
/*    */     
/* 44 */     ☃.registerType(false, aax.s, () -> DSL.optionalFields("Children", DSL.list(DSL.optionalFields("CA", aax.l.in(☃), "CB", aax.l.in(☃), "CC", aax.l.in(☃), "CD", aax.l.in(☃))), "biome", aax.w.in(☃)));
/*    */   }
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
/*    */   public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema ☃) {
/* 57 */     Map<String, Supplier<TypeTemplate>> map = super.registerBlockEntities(☃);
/*    */     
/* 59 */     map.put("DUMMY", DSL::remainder);
/*    */     
/* 61 */     return map;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\acd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */