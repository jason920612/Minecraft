/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.DataFix;
/*    */ import com.mojang.datafixers.Dynamic;
/*    */ import com.mojang.datafixers.TypeRewriteRule;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.datafixers.types.DynamicOps;
/*    */ import com.mojang.datafixers.types.Type;
/*    */ import com.mojang.datafixers.util.Pair;
/*    */ import java.util.Objects;
/*    */ import java.util.Optional;
/*    */ import java.util.function.Function;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class aaq
/*    */   extends DataFix
/*    */ {
/*    */   public aaq(Schema ☃, boolean bool) {
/* 19 */     super(☃, bool);
/*    */   }
/*    */   
/*    */   private static cff.a a(String ☃) {
/* 23 */     return ☃.equals("health") ? cff.a.b : cff.a.a;
/*    */   }
/*    */ 
/*    */   
/*    */   protected TypeRewriteRule makeRule() {
/* 28 */     Type<Pair<String, Dynamic<?>>> ☃ = DSL.named(aax.t.typeName(), DSL.remainderType());
/*    */     
/* 30 */     if (!Objects.equals(☃, getInputSchema().getType(aax.t))) {
/* 31 */       throw new IllegalStateException("Objective type is not what was expected.");
/*    */     }
/*    */     
/* 34 */     return fixTypeEverywhere("ObjectiveRenderTypeFix", ☃, ☃ -> ());
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\aaq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */