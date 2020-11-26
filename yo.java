/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.DataFix;
/*    */ import com.mojang.datafixers.Dynamic;
/*    */ import com.mojang.datafixers.TypeRewriteRule;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.datafixers.types.DynamicOps;
/*    */ import com.mojang.datafixers.types.Type;
/*    */ import com.mojang.datafixers.util.Pair;
/*    */ import java.util.Objects;
/*    */ import java.util.Optional;
/*    */ import java.util.function.Function;
/*    */ 
/*    */ public abstract class yo
/*    */   extends DataFix {
/*    */   private final String a;
/*    */   
/*    */   public yo(Schema ☃, String str) {
/* 19 */     super(☃, false);
/* 20 */     this.a = str;
/*    */   }
/*    */ 
/*    */   
/*    */   public TypeRewriteRule makeRule() {
/* 25 */     Type<?> ☃ = getInputSchema().getType(aax.p);
/* 26 */     Type<Pair<String, String>> type = DSL.named(aax.p.typeName(), DSL.namespacedString());
/* 27 */     if (!Objects.equals(☃, type)) {
/* 28 */       throw new IllegalStateException("block type is not what was expected.");
/*    */     }
/*    */     
/* 31 */     TypeRewriteRule typeRewriteRule1 = fixTypeEverywhere(this.a + " for block", type, ☃ -> ());
/*    */     
/* 33 */     TypeRewriteRule typeRewriteRule2 = fixTypeEverywhereTyped(this.a + " for block_state", getInputSchema().getType(aax.l), ☃ -> ☃.update(DSL.remainderFinder(), ()));
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 41 */     return TypeRewriteRule.seq(typeRewriteRule1, typeRewriteRule2);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public static DataFix a(Schema ☃, String str, Function<String, String> function) {
/* 47 */     return new yo(☃, str, function)
/*    */       {
/*    */         protected String a(String ☃) {
/* 50 */           return this.a.apply(☃);
/*    */         }
/*    */       };
/*    */   }
/*    */   
/*    */   protected abstract String a(String paramString);
/*    */ }


/* Location:              F:\dw\server.jar!\yo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */