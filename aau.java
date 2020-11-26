/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.DataFix;
/*    */ import com.mojang.datafixers.Dynamic;
/*    */ import com.mojang.datafixers.TypeRewriteRule;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import java.util.Locale;
/*    */ import java.util.Optional;
/*    */ 
/*    */ public class aau
/*    */   extends DataFix
/*    */ {
/*    */   public aau(Schema ☃, boolean bool) {
/* 14 */     super(☃, bool);
/*    */   }
/*    */ 
/*    */   
/*    */   public TypeRewriteRule makeRule() {
/* 19 */     return fixTypeEverywhereTyped("OptionsLowerCaseLanguageFix", getInputSchema().getType(aax.e), ☃ -> ☃.update(DSL.remainderFinder(), ()));
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\aau.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */