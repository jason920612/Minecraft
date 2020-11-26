/*    */ import com.google.gson.JsonParseException;
/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.DataFix;
/*    */ import com.mojang.datafixers.DataFixUtils;
/*    */ import com.mojang.datafixers.Dynamic;
/*    */ import com.mojang.datafixers.OpticFinder;
/*    */ import com.mojang.datafixers.TypeRewriteRule;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.datafixers.types.Type;
/*    */ import java.util.stream.Stream;
/*    */ import org.apache.commons.lang3.StringUtils;
/*    */ 
/*    */ 
/*    */ public class aaj
/*    */   extends DataFix
/*    */ {
/*    */   public aaj(Schema ☃, boolean bool) {
/* 19 */     super(☃, bool);
/*    */   }
/*    */   
/*    */   public Dynamic<?> a(Dynamic<?> ☃) {
/* 23 */     return ☃.update("pages", dynamic1 -> (Dynamic)DataFixUtils.orElse(dynamic1.getStream().map(()).map(☃::createList), ☃.emptyList()));
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
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public TypeRewriteRule makeRule() {
/* 72 */     Type<?> ☃ = getInputSchema().getType(aax.k);
/* 73 */     OpticFinder<?> opticFinder = ☃.findField("tag");
/*    */     
/* 75 */     return fixTypeEverywhereTyped("ItemWrittenBookPagesStrictJsonFix", ☃, typed -> typed.updateTyped(☃, ()));
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\aaj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */