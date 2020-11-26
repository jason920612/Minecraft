/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.DataFix;
/*    */ import com.mojang.datafixers.DataFixUtils;
/*    */ import com.mojang.datafixers.Dynamic;
/*    */ import com.mojang.datafixers.TypeRewriteRule;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.datafixers.types.DynamicOps;
/*    */ import com.mojang.datafixers.types.Type;
/*    */ import com.mojang.datafixers.util.Pair;
/*    */ import java.util.Objects;
/*    */ import java.util.function.Function;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class aap
/*    */   extends DataFix
/*    */ {
/*    */   public aap(Schema ☃, boolean bool) {
/* 20 */     super(☃, bool);
/*    */   }
/*    */ 
/*    */   
/*    */   protected TypeRewriteRule makeRule() {
/* 25 */     Type<Pair<String, Dynamic<?>>> ☃ = DSL.named(aax.t.typeName(), DSL.remainderType());
/*    */     
/* 27 */     if (!Objects.equals(☃, getInputSchema().getType(aax.t))) {
/* 28 */       throw new IllegalStateException("Objective type is not what was expected.");
/*    */     }
/*    */     
/* 31 */     return fixTypeEverywhere("ObjectiveDisplayNameFix", ☃, ☃ -> ());
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\aap.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */