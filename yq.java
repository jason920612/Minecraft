/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.DataFix;
/*    */ import com.mojang.datafixers.TypeRewriteRule;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ 
/*    */ public class yq
/*    */   extends DataFix {
/*    */   public yq(Schema ☃, boolean bool) {
/* 10 */     super(☃, bool);
/*    */   }
/*    */ 
/*    */   
/*    */   public TypeRewriteRule makeRule() {
/* 15 */     return fixTypeEverywhereTyped("BlockStateStructureTemplateFix", getInputSchema().getType(aax.l), ☃ -> ☃.update(DSL.remainderFinder(), yp::a));
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\yq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */