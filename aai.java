/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.DataFix;
/*    */ import com.mojang.datafixers.Dynamic;
/*    */ import com.mojang.datafixers.OpticFinder;
/*    */ import com.mojang.datafixers.TypeRewriteRule;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.datafixers.types.Type;
/*    */ import com.mojang.datafixers.util.Pair;
/*    */ import java.util.Optional;
/*    */ 
/*    */ 
/*    */ public class aai
/*    */   extends DataFix
/*    */ {
/*    */   public aai(Schema ☃, boolean bool) {
/* 17 */     super(☃, bool);
/*    */   }
/*    */ 
/*    */   
/*    */   public TypeRewriteRule makeRule() {
/* 22 */     Type<?> ☃ = getInputSchema().getType(aax.k);
/*    */     
/* 24 */     OpticFinder<Pair<String, String>> opticFinder = DSL.fieldFinder("id", DSL.named(aax.q.typeName(), DSL.namespacedString()));
/* 25 */     OpticFinder<?> opticFinder1 = ☃.findField("tag");
/*    */     
/* 27 */     return fixTypeEverywhereTyped("ItemWaterPotionFix", ☃, typed -> {
/*    */           Optional<Pair<String, String>> optional = typed.getOptional(☃);
/*    */           if (optional.isPresent()) {
/*    */             String str = (String)((Pair)optional.get()).getSecond();
/*    */             if ("minecraft:potion".equals(str) || "minecraft:splash_potion".equals(str) || "minecraft:lingering_potion".equals(str) || "minecraft:tipped_arrow".equals(str)) {
/*    */               Typed<?> typed1 = typed.getOrCreateTyped(opticFinder1);
/*    */               Dynamic<?> dynamic = (Dynamic)typed1.get(DSL.remainderFinder());
/*    */               if (!dynamic.get("Potion").flatMap(Dynamic::getStringValue).isPresent())
/*    */                 dynamic = dynamic.set("Potion", dynamic.createString("minecraft:water")); 
/*    */               return typed.set(opticFinder1, typed1.set(DSL.remainderFinder(), dynamic));
/*    */             } 
/*    */           } 
/*    */           return typed;
/*    */         });
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\aai.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */