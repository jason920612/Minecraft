/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.DataFix;
/*    */ import com.mojang.datafixers.Dynamic;
/*    */ import com.mojang.datafixers.TypeRewriteRule;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import java.util.Objects;
/*    */ import java.util.Optional;
/*    */ import java.util.stream.Stream;
/*    */ 
/*    */ public class zk
/*    */   extends DataFix
/*    */ {
/*    */   public zk(Schema ☃, boolean bool) {
/* 15 */     super(☃, bool);
/*    */   }
/*    */ 
/*    */   
/*    */   public TypeRewriteRule makeRule() {
/* 20 */     return fixTypeEverywhereTyped("EntityRedundantChanceTagsFix", getInputSchema().getType(aax.o), ☃ -> ☃.update(DSL.remainderFinder(), ()));
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\zk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */