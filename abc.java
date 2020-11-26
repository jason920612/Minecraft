/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.DataFix;
/*    */ import com.mojang.datafixers.TypeRewriteRule;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.datafixers.types.DynamicOps;
/*    */ import com.mojang.datafixers.types.Type;
/*    */ import com.mojang.datafixers.types.templates.TaggedChoice;
/*    */ import com.mojang.datafixers.util.Pair;
/*    */ import java.util.Objects;
/*    */ import java.util.function.Function;
/*    */ 
/*    */ public abstract class abc
/*    */   extends DataFix {
/*    */   private final String a;
/*    */   
/*    */   public abc(String ☃, Schema schema, boolean bool) {
/* 17 */     super(schema, bool);
/* 18 */     this.a = ☃;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public TypeRewriteRule makeRule() {
/* 24 */     TaggedChoice.TaggedChoiceType<String> ☃ = getInputSchema().findChoiceType(aax.o);
/* 25 */     TaggedChoice.TaggedChoiceType<String> taggedChoiceType1 = getOutputSchema().findChoiceType(aax.o);
/*    */     
/* 27 */     Type<Pair<String, String>> type = DSL.named(aax.m.typeName(), DSL.namespacedString());
/* 28 */     if (!Objects.equals(getOutputSchema().getType(aax.m), type)) {
/* 29 */       throw new IllegalStateException("Entity name type is not what was expected.");
/*    */     }
/*    */     
/* 32 */     return TypeRewriteRule.seq(
/* 33 */         fixTypeEverywhere(this.a, (Type)☃, (Type)taggedChoiceType1, dynamicOps -> ()), 
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
/* 45 */         fixTypeEverywhere(this.a + " for entity name", type, ☃ -> ()));
/*    */   }
/*    */   
/*    */   protected abstract String a(String paramString);
/*    */ }


/* Location:              F:\dw\server.jar!\abc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */