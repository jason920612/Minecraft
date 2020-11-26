/*    */ import com.google.common.collect.Lists;
/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.DataFix;
/*    */ import com.mojang.datafixers.Dynamic;
/*    */ import com.mojang.datafixers.OpticFinder;
/*    */ import com.mojang.datafixers.TypeRewriteRule;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.datafixers.types.Type;
/*    */ import com.mojang.datafixers.util.Either;
/*    */ import com.mojang.datafixers.util.Pair;
/*    */ import com.mojang.datafixers.util.Unit;
/*    */ import java.util.Iterator;
/*    */ import java.util.List;
/*    */ import java.util.Optional;
/*    */ import java.util.stream.Stream;
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
/*    */ public class za
/*    */   extends DataFix
/*    */ {
/*    */   public za(Schema ☃, boolean bool) {
/* 32 */     super(☃, bool);
/*    */   }
/*    */ 
/*    */   
/*    */   public TypeRewriteRule makeRule() {
/* 37 */     return a(getInputSchema().getTypeRaw(aax.k));
/*    */   }
/*    */ 
/*    */   
/*    */   private <IS> TypeRewriteRule a(Type<IS> ☃) {
/* 42 */     Type<Pair<Either<List<IS>, Unit>, Dynamic<?>>> type = DSL.and(
/* 43 */         DSL.optional((Type)DSL.field("Equipment", (Type)DSL.list(☃))), 
/* 44 */         DSL.remainderType());
/*    */ 
/*    */     
/* 47 */     Type<Pair<Either<List<IS>, Unit>, Pair<Either<List<IS>, Unit>, Dynamic<?>>>> type1 = DSL.and(
/* 48 */         DSL.optional((Type)DSL.field("ArmorItems", (Type)DSL.list(☃))), 
/* 49 */         DSL.optional((Type)DSL.field("HandItems", (Type)DSL.list(☃))), 
/* 50 */         DSL.remainderType());
/*    */     
/* 52 */     OpticFinder<Pair<Either<List<IS>, Unit>, Dynamic<?>>> opticFinder = DSL.typeFinder(type);
/*    */     
/* 54 */     OpticFinder<List<IS>> opticFinder1 = DSL.fieldFinder("Equipment", (Type)DSL.list(☃));
/*    */     
/* 56 */     return fixTypeEverywhereTyped("EntityEquipmentToArmorAndHandFix", getInputSchema().getType(aax.o), getOutputSchema().getType(aax.o), typed -> {
/*    */           Either<List<IS>, Unit> either1 = Either.right(DSL.unit());
/*    */           Either<List<IS>, Unit> either2 = Either.right(DSL.unit());
/*    */           Dynamic<?> dynamic1 = (Dynamic)typed.getOrCreate(DSL.remainderFinder());
/*    */           Optional<List<IS>> optional = typed.getOptional(☃);
/*    */           if (optional.isPresent()) {
/*    */             List<IS> list = optional.get();
/*    */             IS iS = (IS)((Optional)type1.read(dynamic1.emptyMap()).getSecond()).orElseThrow(());
/*    */             if (!list.isEmpty())
/*    */               either1 = Either.left(Lists.newArrayList(new Object[] { list.get(0), iS })); 
/*    */             if (list.size() > 1) {
/*    */               List<IS> list1 = Lists.newArrayList(new Object[] { iS, iS, iS, iS });
/*    */               for (int i = 1; i < Math.min(list.size(), 5); i++)
/*    */                 list1.set(i - 1, list.get(i)); 
/*    */               either2 = Either.left(list1);
/*    */             } 
/*    */           } 
/*    */           Dynamic<?> dynamic2 = dynamic1;
/*    */           Optional<? extends Stream<? extends Dynamic<?>>> optional1 = dynamic1.get("DropChances").flatMap(Dynamic::getStream);
/*    */           if (optional1.isPresent()) {
/*    */             Iterator<? extends Dynamic<?>> iterator = Stream.<Dynamic<?>>concat(optional1.get(), Stream.generate(())).iterator();
/*    */             float f = ((Dynamic)iterator.next()).getNumberValue(Integer.valueOf(0)).floatValue();
/*    */             if (!dynamic1.get("HandDropChances").isPresent()) {
/*    */               Dynamic<?> dynamic = dynamic1.emptyMap().merge(dynamic1.createFloat(f)).merge(dynamic1.createFloat(0.0F));
/*    */               dynamic1 = dynamic1.set("HandDropChances", dynamic);
/*    */             } 
/*    */             if (!dynamic1.get("ArmorDropChances").isPresent()) {
/*    */               Dynamic<?> dynamic = dynamic1.emptyMap().merge(dynamic1.createFloat(((Dynamic)iterator.next()).getNumberValue(Integer.valueOf(0)).floatValue())).merge(dynamic1.createFloat(((Dynamic)iterator.next()).getNumberValue(Integer.valueOf(0)).floatValue())).merge(dynamic1.createFloat(((Dynamic)iterator.next()).getNumberValue(Integer.valueOf(0)).floatValue())).merge(dynamic1.createFloat(((Dynamic)iterator.next()).getNumberValue(Integer.valueOf(0)).floatValue()));
/*    */               dynamic1 = dynamic1.set("ArmorDropChances", dynamic);
/*    */             } 
/*    */             dynamic1 = dynamic1.remove("DropChances");
/*    */           } 
/*    */           return typed.set(opticFinder1, type2, Pair.of(either1, Pair.of(either2, dynamic1)));
/*    */         });
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\za.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */