/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.Dynamic;
/*    */ import com.mojang.datafixers.OpticFinder;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.datafixers.types.Type;
/*    */ import com.mojang.datafixers.util.Pair;
/*    */ import java.util.Optional;
/*    */ import java.util.function.Supplier;
/*    */ 
/*    */ public class zc
/*    */   extends aao
/*    */ {
/*    */   public zc(Schema ☃, boolean bool) {
/* 15 */     super(☃, bool, "EntityHorseSaddleFix", aax.o, "EntityHorse");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected Typed<?> a(Typed<?> ☃) {
/* 22 */     OpticFinder<Pair<String, String>> opticFinder = DSL.fieldFinder("id", DSL.named(aax.q.typeName(), DSL.namespacedString()));
/* 23 */     Type<?> type = getInputSchema().getTypeRaw(aax.k);
/* 24 */     OpticFinder<?> opticFinder1 = DSL.fieldFinder("SaddleItem", type);
/*    */     
/* 26 */     Optional<? extends Typed<?>> optional = ☃.getOptionalTyped(opticFinder1);
/* 27 */     Dynamic<?> dynamic = (Dynamic)☃.get(DSL.remainderFinder());
/* 28 */     if (!optional.isPresent() && dynamic.getBoolean("Saddle")) {
/* 29 */       Typed<?> typed = (Typed)type.pointTyped(☃.getOps()).orElseThrow(IllegalStateException::new);
/* 30 */       typed = typed.set(opticFinder, Pair.of(aax.q.typeName(), "minecraft:saddle"));
/*    */       
/* 32 */       Dynamic<?> dynamic1 = dynamic.emptyMap();
/* 33 */       dynamic1 = dynamic1.set("Count", dynamic1.createByte((byte)1));
/* 34 */       dynamic1 = dynamic1.set("Damage", dynamic1.createShort((short)0));
/*    */       
/* 36 */       typed = typed.set(DSL.remainderFinder(), dynamic1);
/* 37 */       dynamic.remove("Saddle");
/*    */       
/* 39 */       return ☃.set(opticFinder1, typed).set(DSL.remainderFinder(), dynamic);
/*    */     } 
/* 41 */     return ☃;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\zc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */