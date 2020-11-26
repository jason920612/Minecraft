/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.DataFix;
/*    */ import com.mojang.datafixers.Dynamic;
/*    */ import com.mojang.datafixers.OpticFinder;
/*    */ import com.mojang.datafixers.TypeRewriteRule;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.datafixers.util.Pair;
/*    */ import java.util.Objects;
/*    */ import java.util.Optional;
/*    */ 
/*    */ public class yd
/*    */   extends DataFix
/*    */ {
/*    */   public yd(Schema ☃, boolean bool) {
/* 16 */     super(☃, bool);
/*    */   }
/*    */ 
/*    */   
/*    */   public TypeRewriteRule makeRule() {
/* 21 */     OpticFinder<Pair<String, String>> ☃ = DSL.fieldFinder("id", DSL.named(aax.q.typeName(), DSL.namespacedString()));
/*    */     
/* 23 */     return fixTypeEverywhereTyped("BedItemColorFix", getInputSchema().getType(aax.k), typed -> {
/*    */           Optional<Pair<String, String>> optional = typed.getOptional(☃);
/*    */           if (optional.isPresent() && Objects.equals(((Pair)optional.get()).getSecond(), "minecraft:bed")) {
/*    */             Dynamic<?> dynamic = (Dynamic)typed.get(DSL.remainderFinder());
/*    */             if (dynamic.getShort("Damage") == 0)
/*    */               return typed.set(DSL.remainderFinder(), dynamic.set("Damage", dynamic.createShort((short)14))); 
/*    */           } 
/*    */           return typed;
/*    */         });
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\yd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */