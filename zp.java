/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.DataFix;
/*    */ import com.mojang.datafixers.Dynamic;
/*    */ import com.mojang.datafixers.TypeRewriteRule;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import java.util.UUID;
/*    */ 
/*    */ public class zp
/*    */   extends DataFix
/*    */ {
/*    */   public zp(Schema ☃, boolean bool) {
/* 13 */     super(☃, bool);
/*    */   }
/*    */ 
/*    */   
/*    */   public TypeRewriteRule makeRule() {
/* 18 */     return fixTypeEverywhereTyped("EntityStringUuidFix", getInputSchema().getType(aax.o), ☃ -> ☃.update(DSL.remainderFinder(), ()));
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\zp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */