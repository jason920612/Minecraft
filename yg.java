/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.Dynamic;
/*    */ import com.mojang.datafixers.OpticFinder;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.datafixers.types.Type;
/*    */ import java.util.Optional;
/*    */ 
/*    */ public class yg
/*    */   extends aao {
/*    */   public yg(Schema ☃, boolean bool) {
/* 12 */     super(☃, bool, "BlockEntityBlockStateFix", aax.j, "minecraft:piston");
/*    */   }
/*    */ 
/*    */   
/*    */   protected Typed<?> a(Typed<?> ☃) {
/* 17 */     Type<?> type1 = getOutputSchema().getChoiceType(aax.j, "minecraft:piston");
/*    */     
/* 19 */     Type<?> type2 = type1.findFieldType("blockState");
/* 20 */     OpticFinder<?> opticFinder = DSL.fieldFinder("blockState", type2);
/* 21 */     Dynamic<?> dynamic1 = (Dynamic)☃.get(DSL.remainderFinder());
/*    */     
/* 23 */     int i = dynamic1.getInt("blockId");
/* 24 */     dynamic1 = dynamic1.remove("blockId");
/* 25 */     int j = dynamic1.getInt("blockData") & 0xF;
/* 26 */     dynamic1 = dynamic1.remove("blockData");
/*    */     
/* 28 */     Dynamic<?> dynamic2 = yp.b(i << 4 | j);
/* 29 */     Typed<?> typed = (Typed)type1.pointTyped(☃.getOps()).orElseThrow(() -> new IllegalStateException("Could not create new piston block entity."));
/* 30 */     return typed.set(DSL.remainderFinder(), dynamic1).set(opticFinder, (Typed)((Optional)type2.readTyped(dynamic2).getSecond()).orElseThrow(() -> new IllegalStateException("Could not parse newly created block state tag.")));
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\yg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */