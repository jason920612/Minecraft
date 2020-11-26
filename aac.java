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
/*    */ public class aac
/*    */   extends DataFix
/*    */ {
/*    */   public aac(Schema ☃, boolean bool) {
/* 18 */     super(☃, bool);
/*    */   }
/*    */   
/* 21 */   public static final String[] a = new String[] { "minecraft:white_shulker_box", "minecraft:orange_shulker_box", "minecraft:magenta_shulker_box", "minecraft:light_blue_shulker_box", "minecraft:yellow_shulker_box", "minecraft:lime_shulker_box", "minecraft:pink_shulker_box", "minecraft:gray_shulker_box", "minecraft:silver_shulker_box", "minecraft:cyan_shulker_box", "minecraft:purple_shulker_box", "minecraft:blue_shulker_box", "minecraft:brown_shulker_box", "minecraft:green_shulker_box", "minecraft:red_shulker_box", "minecraft:black_shulker_box" };
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public TypeRewriteRule makeRule() {
/* 42 */     Type<?> ☃ = getInputSchema().getType(aax.k);
/*    */     
/* 44 */     OpticFinder<Pair<String, String>> opticFinder = DSL.fieldFinder("id", DSL.named(aax.q.typeName(), DSL.namespacedString()));
/* 45 */     OpticFinder<?> opticFinder1 = ☃.findField("tag");
/* 46 */     OpticFinder<?> opticFinder2 = opticFinder1.type().findField("BlockEntityTag");
/*    */     
/* 48 */     return fixTypeEverywhereTyped("ItemShulkerBoxColorFix", ☃, typed -> {
/*    */           Optional<Pair<String, String>> optional = typed.getOptional(☃);
/*    */           if (optional.isPresent() && Objects.equals(((Pair)optional.get()).getSecond(), "minecraft:shulker_box")) {
/*    */             Optional<? extends Typed<?>> optional1 = typed.getOptionalTyped(opticFinder1);
/*    */             if (optional1.isPresent()) {
/*    */               Typed<?> typed1 = optional1.get();
/*    */               Optional<? extends Typed<?>> optional2 = typed1.getOptionalTyped(opticFinder2);
/*    */               if (optional2.isPresent()) {
/*    */                 Typed<?> typed2 = optional2.get();
/*    */                 Dynamic<?> dynamic = (Dynamic)typed2.get(DSL.remainderFinder());
/*    */                 int i = dynamic.getInt("Color");
/*    */                 dynamic.remove("Color");
/*    */                 return typed.set(opticFinder1, typed1.set(opticFinder2, typed2.set(DSL.remainderFinder(), dynamic))).set(☃, Pair.of(aax.q.typeName(), a[i % 16]));
/*    */               } 
/*    */             } 
/*    */           } 
/*    */           return typed;
/*    */         });
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\aac.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */