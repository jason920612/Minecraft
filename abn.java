/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.datafixers.types.templates.Hook;
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
/*    */ public class abn
/*    */   extends Schema
/*    */ {
/*    */   public abn(int ☃, Schema schema) {
/* 21 */     super(☃, schema);
/*    */   }
/*    */ 
/*    */   
/*    */   public void registerTypes(Schema ☃, Map<String, Supplier<TypeTemplate>> map1, Map<String, Supplier<TypeTemplate>> map2) {
/* 26 */     super.registerTypes(☃, map1, map2);
/*    */     
/* 28 */     ☃.registerType(true, aax.k, () -> DSL.hook(DSL.optionalFields("id", aax.q.in(☃), "tag", DSL.optionalFields("EntityTag", aax.n.in(☃), "BlockEntityTag", aax.j.in(☃), "CanDestroy", DSL.list(aax.p.in(☃)), "CanPlaceOn", DSL.list(aax.p.in(☃)))), acr.a, Hook.HookFunction.IDENTITY));
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\abn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */