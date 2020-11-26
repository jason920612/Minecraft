/*    */ import com.google.common.collect.Lists;
/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.Dynamic;
/*    */ import com.mojang.datafixers.TypeRewriteRule;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.datafixers.types.DynamicOps;
/*    */ import com.mojang.datafixers.types.Type;
/*    */ import com.mojang.datafixers.types.templates.TaggedChoice;
/*    */ import com.mojang.datafixers.util.Pair;
/*    */ import java.util.Objects;
/*    */ import java.util.Optional;
/*    */ import java.util.function.Function;
/*    */ import java.util.function.Supplier;
/*    */ 
/*    */ public class zg extends DataFix {
/*    */   public zg(Schema ☃, boolean bool) {
/* 18 */     super(☃, bool);
/*    */   }
/*    */   
/* 21 */   private static final List<String> a = Lists.newArrayList((Object[])new String[] { "MinecartRideable", "MinecartChest", "MinecartFurnace" });
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public TypeRewriteRule makeRule() {
/* 30 */     TaggedChoice.TaggedChoiceType<String> ☃ = getInputSchema().findChoiceType(aax.o);
/* 31 */     TaggedChoice.TaggedChoiceType<String> taggedChoiceType1 = getOutputSchema().findChoiceType(aax.o);
/*    */     
/* 33 */     return fixTypeEverywhere("EntityMinecartIdentifiersFix", (Type)☃, (Type)taggedChoiceType1, dynamicOps -> ());
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\zg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */