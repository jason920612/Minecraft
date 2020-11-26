/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.DataFix;
/*    */ import com.mojang.datafixers.Dynamic;
/*    */ import com.mojang.datafixers.OpticFinder;
/*    */ import com.mojang.datafixers.TypeRewriteRule;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import java.util.Objects;
/*    */ import java.util.Optional;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class yy
/*    */   extends DataFix
/*    */ {
/*    */   public yy(Schema ☃, boolean bool) {
/* 17 */     super(☃, bool);
/*    */   }
/*    */ 
/*    */   
/*    */   public TypeRewriteRule makeRule() {
/* 22 */     OpticFinder<String> ☃ = DSL.fieldFinder("id", DSL.namespacedString());
/* 23 */     return fixTypeEverywhereTyped("EntityCustomNameToComponentFix", getInputSchema().getType(aax.o), typed -> typed.update(DSL.remainderFinder(), ()));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static Dynamic<?> a(Dynamic<?> ☃) {
/* 33 */     String str = ☃.getString("CustomName");
/* 34 */     if (str.isEmpty()) {
/* 35 */       return ☃.remove("CustomName");
/*    */     }
/* 37 */     return ☃.set("CustomName", ☃.createString(ij.a.a(new iq(str))));
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\yy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */