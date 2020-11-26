/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.DataFix;
/*    */ import com.mojang.datafixers.Dynamic;
/*    */ import com.mojang.datafixers.OpticFinder;
/*    */ import com.mojang.datafixers.TypeRewriteRule;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.datafixers.types.Type;
/*    */ import com.mojang.datafixers.util.Pair;
/*    */ import java.util.Objects;
/*    */ import java.util.Optional;
/*    */ 
/*    */ 
/*    */ public class aaf
/*    */   extends DataFix
/*    */ {
/*    */   public aaf(Schema ☃, boolean bool) {
/* 18 */     super(☃, bool);
/*    */   }
/*    */ 
/*    */   
/*    */   public TypeRewriteRule makeRule() {
/* 23 */     Type<?> ☃ = getInputSchema().getType(aax.k);
/*    */     
/* 25 */     OpticFinder<Pair<String, String>> opticFinder = DSL.fieldFinder("id", DSL.named(aax.q.typeName(), DSL.namespacedString()));
/* 26 */     OpticFinder<?> opticFinder1 = ☃.findField("tag");
/*    */     
/* 28 */     return fixTypeEverywhereTyped("ItemInstanceMapIdFix", ☃, typed -> {
/*    */           Optional<Pair<String, String>> optional = typed.getOptional(☃);
/*    */           if (optional.isPresent() && Objects.equals(((Pair)optional.get()).getSecond(), "minecraft:filled_map")) {
/*    */             Dynamic<?> dynamic1 = (Dynamic)typed.get(DSL.remainderFinder());
/*    */             Typed<?> typed1 = typed.getOrCreateTyped(opticFinder1);
/*    */             Dynamic<?> dynamic2 = (Dynamic)typed1.get(DSL.remainderFinder());
/*    */             dynamic2 = dynamic2.set("map", dynamic2.createInt(dynamic1.getInt("Damage")));
/*    */             return typed.set(opticFinder1, typed1.set(DSL.remainderFinder(), dynamic2));
/*    */           } 
/*    */           return typed;
/*    */         });
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\aaf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */