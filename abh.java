/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.OpticFinder;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.datafixers.types.Type;
/*    */ import com.mojang.datafixers.types.templates.List;
/*    */ import com.mojang.datafixers.util.Pair;
/*    */ import java.util.Objects;
/*    */ import java.util.function.Function;
/*    */ 
/*    */ 
/*    */ public class abh
/*    */   extends aao
/*    */ {
/*    */   public abh(Schema ☃, boolean bool) {
/* 16 */     super(☃, bool, "Villager trade fix", aax.o, "minecraft:villager");
/*    */   }
/*    */ 
/*    */   
/*    */   protected Typed<?> a(Typed<?> ☃) {
/* 21 */     OpticFinder<?> opticFinder1 = ☃.getType().findField("Offers");
/* 22 */     OpticFinder<?> opticFinder2 = opticFinder1.type().findField("Recipes");
/* 23 */     Type<?> type1 = opticFinder2.type();
/* 24 */     if (!(type1 instanceof List.ListType)) {
/* 25 */       throw new IllegalStateException("Recipes are expected to be a list.");
/*    */     }
/* 27 */     List.ListType<?> listType = (List.ListType)type1;
/* 28 */     Type<?> type2 = listType.getElement();
/* 29 */     OpticFinder<?> opticFinder3 = DSL.typeFinder(type2);
/* 30 */     OpticFinder<?> opticFinder4 = type2.findField("buy");
/* 31 */     OpticFinder<?> opticFinder5 = type2.findField("buyB");
/* 32 */     OpticFinder<?> opticFinder6 = type2.findField("sell");
/*    */     
/* 34 */     OpticFinder<Pair<String, String>> opticFinder = DSL.fieldFinder("id", DSL.named(aax.q.typeName(), DSL.namespacedString()));
/* 35 */     Function<Typed<?>, Typed<?>> function = typed -> a(☃, typed);
/*    */     
/* 37 */     return ☃.updateTyped(opticFinder1, typed -> typed.updateTyped(☃, ()));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private Typed<?> a(OpticFinder<Pair<String, String>> ☃, Typed<?> typed) {
/* 46 */     return typed.update(☃, ☃ -> ☃.mapSecond(()));
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\abh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */