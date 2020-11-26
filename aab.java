/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.DataFix;
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
/*    */ public abstract class aab
/*    */   extends DataFix
/*    */ {
/*    */   private final String a;
/*    */   
/*    */   public aab(Schema ☃, String str) {
/* 19 */     super(☃, false);
/* 20 */     this.a = str;
/*    */   }
/*    */ 
/*    */   
/*    */   public TypeRewriteRule makeRule() {
/* 25 */     Type<Pair<String, String>> ☃ = DSL.named(aax.q.typeName(), DSL.namespacedString());
/* 26 */     if (!Objects.equals(getInputSchema().getType(aax.q), ☃)) {
/* 27 */       throw new IllegalStateException("item name type is not what was expected.");
/*    */     }
/* 29 */     return fixTypeEverywhere(this.a, ☃, ☃ -> ());
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public static DataFix a(Schema ☃, String str, Function<String, String> function) {
/* 35 */     return new aab(☃, str, function)
/*    */       {
/*    */         protected String a(String ☃) {
/* 38 */           return this.a.apply(☃);
/*    */         }
/*    */       };
/*    */   }
/*    */   
/*    */   protected abstract String a(String paramString);
/*    */ }


/* Location:              F:\dw\server.jar!\aab.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */