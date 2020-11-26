/*    */ import com.mojang.datafixers.DataFix;
/*    */ import com.mojang.datafixers.TypeRewriteRule;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.datafixers.types.DynamicOps;
/*    */ import com.mojang.datafixers.types.Type;
/*    */ import com.mojang.datafixers.types.templates.TaggedChoice;
/*    */ import com.mojang.datafixers.util.Pair;
/*    */ import java.util.function.Function;
/*    */ 
/*    */ public abstract class zl
/*    */   extends DataFix {
/*    */   protected final String a;
/*    */   
/*    */   public zl(String ☃, Schema schema, boolean bool) {
/* 16 */     super(schema, bool);
/* 17 */     this.a = ☃;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public TypeRewriteRule makeRule() {
/* 23 */     TaggedChoice.TaggedChoiceType<String> ☃ = getInputSchema().findChoiceType(aax.o);
/* 24 */     TaggedChoice.TaggedChoiceType<String> taggedChoiceType1 = getOutputSchema().findChoiceType(aax.o);
/*    */     
/* 26 */     return fixTypeEverywhere(this.a, (Type)☃, (Type)taggedChoiceType1, dynamicOps -> ());
/*    */   }
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
/*    */   private <A> Typed<A> a(Object ☃, DynamicOps<?> dynamicOps, Type<A> type) {
/* 43 */     return new Typed(type, dynamicOps, ☃);
/*    */   }
/*    */   
/*    */   protected abstract Pair<String, Typed<?>> a(String paramString, Typed<?> paramTyped);
/*    */ }


/* Location:              F:\dw\server.jar!\zl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */