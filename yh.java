/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.DataFix;
/*    */ import com.mojang.datafixers.Dynamic;
/*    */ import com.mojang.datafixers.OpticFinder;
/*    */ import com.mojang.datafixers.TypeRewriteRule;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import java.util.Objects;
/*    */ import java.util.Optional;
/*    */ 
/*    */ public class yh
/*    */   extends DataFix {
/*    */   public yh(Schema ☃, boolean bool) {
/* 14 */     super(☃, bool);
/*    */   }
/*    */ 
/*    */   
/*    */   public TypeRewriteRule makeRule() {
/* 19 */     OpticFinder<String> ☃ = DSL.fieldFinder("id", DSL.namespacedString());
/* 20 */     return fixTypeEverywhereTyped("BlockEntityCustomNameToComponentFix", getInputSchema().getType(aax.j), typed -> typed.update(DSL.remainderFinder(), ()));
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\yh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */