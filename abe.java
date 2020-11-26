/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.DataFix;
/*    */ import com.mojang.datafixers.OpticFinder;
/*    */ import com.mojang.datafixers.TypeRewriteRule;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.datafixers.types.Type;
/*    */ 
/*    */ public class abe
/*    */   extends DataFix {
/*    */   public abe(Schema ☃, boolean bool) {
/* 12 */     super(☃, bool);
/*    */   }
/*    */ 
/*    */   
/*    */   protected TypeRewriteRule makeRule() {
/* 17 */     Type<?> ☃ = getOutputSchema().getType(aax.g);
/* 18 */     Type<?> type1 = getInputSchema().getType(aax.g);
/* 19 */     OpticFinder<?> opticFinder1 = type1.findField("stats");
/* 20 */     OpticFinder<?> opticFinder2 = opticFinder1.type().findField("minecraft:custom");
/* 21 */     OpticFinder<String> opticFinder = DSL.namespacedString().finder();
/* 22 */     return fixTypeEverywhereTyped("SwimStatsRenameFix", type1, ☃, typed -> typed.updateTyped(☃, ()));
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\abe.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */