/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.DataFix;
/*    */ import com.mojang.datafixers.TypeRewriteRule;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.datafixers.types.DynamicOps;
/*    */ import com.mojang.datafixers.types.Type;
/*    */ import com.mojang.datafixers.util.Either;
/*    */ import com.mojang.datafixers.util.Pair;
/*    */ import java.util.Objects;
/*    */ import java.util.function.Function;
/*    */ 
/*    */ public class yn
/*    */   extends DataFix
/*    */ {
/*    */   public yn(Schema ☃, boolean bool) {
/* 16 */     super(☃, bool);
/*    */   }
/*    */ 
/*    */   
/*    */   public TypeRewriteRule makeRule() {
/* 21 */     Type<?> ☃ = getInputSchema().getType(aax.p);
/* 22 */     Type<?> type1 = getOutputSchema().getType(aax.p);
/*    */     
/* 24 */     Type<Pair<String, Either<Integer, String>>> type = DSL.named(aax.p.typeName(), DSL.or(DSL.intType(), DSL.namespacedString()));
/* 25 */     Type<Pair<String, String>> type2 = DSL.named(aax.p.typeName(), DSL.namespacedString());
/*    */     
/* 27 */     if (!Objects.equals(☃, type) || !Objects.equals(type1, type2)) {
/* 28 */       throw new IllegalStateException("Expected and actual types don't match.");
/*    */     }
/* 30 */     return fixTypeEverywhere("BlockNameFlatteningFix", type, type2, ☃ -> ());
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\yn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */