/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.DataFix;
/*    */ import com.mojang.datafixers.DataFixUtils;
/*    */ import com.mojang.datafixers.Dynamic;
/*    */ import com.mojang.datafixers.TypeRewriteRule;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.datafixers.types.Type;
/*    */ import com.mojang.datafixers.util.Pair;
/*    */ import java.util.Optional;
/*    */ import java.util.stream.Stream;
/*    */ 
/*    */ 
/*    */ public class aan
/*    */   extends DataFix
/*    */ {
/*    */   public aan(Schema ☃, boolean bool) {
/* 18 */     super(☃, bool);
/*    */   }
/*    */   
/*    */   private Dynamic<?> a(Dynamic<?> ☃) {
/* 22 */     if (!"MobSpawner".equals(☃.getString("id"))) {
/* 23 */       return ☃;
/*    */     }
/*    */     
/* 26 */     Optional<String> optional = ☃.get("EntityId").flatMap(Dynamic::getStringValue);
/* 27 */     if (optional.isPresent()) {
/* 28 */       Dynamic<?> dynamic = (Dynamic)DataFixUtils.orElse(☃.get("SpawnData"), ☃.emptyMap());
/* 29 */       dynamic = dynamic.set("id", dynamic.createString(((String)optional.get()).isEmpty() ? "Pig" : optional.get()));
/* 30 */       ☃ = ☃.set("SpawnData", dynamic);
/*    */       
/* 32 */       ☃ = ☃.remove("EntityId");
/*    */     } 
/*    */     
/* 35 */     Optional<? extends Stream<? extends Dynamic<?>>> optional1 = ☃.get("SpawnPotentials").flatMap(Dynamic::getStream);
/* 36 */     if (optional1.isPresent()) {
/* 37 */       ☃ = ☃.set("SpawnPotentials", ☃.createList(((Stream)optional1.get()).map(☃ -> {
/*    */                 Optional<String> optional = ☃.get("Type").flatMap(Dynamic::getStringValue);
/*    */                 
/*    */                 if (optional.isPresent()) {
/*    */                   Dynamic<?> dynamic = ((Dynamic)DataFixUtils.orElse(☃.get("Properties"), ☃.emptyMap())).set("id", ☃.createString(optional.get()));
/*    */                   
/*    */                   return ☃.set("Entity", dynamic).remove("Type").remove("Properties");
/*    */                 } 
/*    */                 
/*    */                 return ☃;
/*    */               })));
/*    */     }
/*    */     
/* 50 */     return ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public TypeRewriteRule makeRule() {
/* 55 */     Type<?> ☃ = getOutputSchema().getType(aax.r);
/* 56 */     return fixTypeEverywhereTyped("MobSpawnerEntityIdentifiersFix", getInputSchema().getType(aax.r), ☃, typed -> {
/*    */           Dynamic<?> dynamic = (Dynamic)typed.get(DSL.remainderFinder());
/*    */           dynamic = dynamic.set("id", dynamic.createString("MobSpawner"));
/*    */           Pair<?, ? extends Optional<? extends Typed<?>>> pair = ☃.readTyped(a(dynamic));
/*    */           return !((Optional)pair.getSecond()).isPresent() ? typed : ((Optional<Typed>)pair.getSecond()).get();
/*    */         });
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\aan.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */