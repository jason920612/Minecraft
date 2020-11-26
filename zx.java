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
/*    */ import java.util.stream.Stream;
/*    */ 
/*    */ 
/*    */ public class zx
/*    */   extends DataFix
/*    */ {
/*    */   public zx(Schema ☃, boolean bool) {
/* 19 */     super(☃, bool);
/*    */   }
/*    */ 
/*    */   
/*    */   public TypeRewriteRule makeRule() {
/* 24 */     Type<?> ☃ = getInputSchema().getType(aax.k);
/*    */     
/* 26 */     OpticFinder<Pair<String, String>> opticFinder = DSL.fieldFinder("id", DSL.named(aax.q.typeName(), DSL.namespacedString()));
/* 27 */     OpticFinder<?> opticFinder1 = ☃.findField("tag");
/* 28 */     OpticFinder<?> opticFinder2 = opticFinder1.type().findField("BlockEntityTag");
/*    */     
/* 30 */     return fixTypeEverywhereTyped("ItemBannerColorFix", ☃, typed -> {
/*    */           Optional<Pair<String, String>> optional = typed.getOptional(☃);
/*    */           if (optional.isPresent() && Objects.equals(((Pair)optional.get()).getSecond(), "minecraft:banner")) {
/*    */             Dynamic<?> dynamic = (Dynamic)typed.get(DSL.remainderFinder());
/*    */             Optional<? extends Typed<?>> optional1 = typed.getOptionalTyped(opticFinder1);
/*    */             if (optional1.isPresent()) {
/*    */               Typed<?> typed1 = optional1.get();
/*    */               Optional<? extends Typed<?>> optional2 = typed1.getOptionalTyped(opticFinder2);
/*    */               if (optional2.isPresent()) {
/*    */                 Typed<?> typed2 = optional2.get();
/*    */                 Dynamic<?> dynamic1 = (Dynamic)typed1.get(DSL.remainderFinder());
/*    */                 Dynamic<?> dynamic2 = (Dynamic)typed2.getOrCreate(DSL.remainderFinder());
/*    */                 if (dynamic2.get("Base").flatMap(Dynamic::getNumberValue).isPresent()) {
/*    */                   dynamic = dynamic.set("Damage", dynamic.createShort((short)(dynamic2.getShort("Base") & 0xF)));
/*    */                   Optional<? extends Dynamic<?>> optional3 = dynamic1.get("display");
/*    */                   if (optional3.isPresent()) {
/*    */                     Dynamic<?> dynamic3 = optional3.get();
/*    */                     if (Objects.equals(dynamic3, dynamic3.emptyMap().merge(dynamic3.createString("Lore"), dynamic3.createList(Stream.of(dynamic3.createString("(+NBT"))))))
/*    */                       return typed.set(DSL.remainderFinder(), dynamic); 
/*    */                   } 
/*    */                   dynamic2.remove("Base");
/*    */                   return typed.set(DSL.remainderFinder(), dynamic).set(opticFinder1, typed1.set(opticFinder2, typed2.set(DSL.remainderFinder(), dynamic2)));
/*    */                 } 
/*    */               } 
/*    */             } 
/*    */             return typed.set(DSL.remainderFinder(), dynamic);
/*    */           } 
/*    */           return typed;
/*    */         });
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\zx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */