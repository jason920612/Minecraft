/*    */ import com.google.common.collect.Lists;
/*    */ import com.google.common.collect.Maps;
/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.DataFix;
/*    */ import com.mojang.datafixers.Dynamic;
/*    */ import com.mojang.datafixers.OpticFinder;
/*    */ import com.mojang.datafixers.TypeRewriteRule;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.datafixers.types.DynamicOps;
/*    */ import com.mojang.datafixers.types.Type;
/*    */ import com.mojang.datafixers.types.templates.List;
/*    */ import com.mojang.datafixers.util.Pair;
/*    */ import java.util.Iterator;
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ import java.util.Optional;
/*    */ import java.util.function.Function;
/*    */ import java.util.stream.Collectors;
/*    */ import java.util.stream.Stream;
/*    */ 
/*    */ public class yc
/*    */   extends DataFix
/*    */ {
/*    */   public yc(Schema ☃, boolean bool) {
/* 26 */     super(☃, bool);
/*    */   }
/*    */ 
/*    */   
/*    */   public TypeRewriteRule makeRule() {
/* 31 */     Type<?> ☃ = getOutputSchema().getType(aax.c);
/* 32 */     Type<?> type1 = ☃.findFieldType("Level");
/* 33 */     Type<?> type2 = type1.findFieldType("TileEntities");
/* 34 */     if (!(type2 instanceof List.ListType)) {
/* 35 */       throw new IllegalStateException("Tile entity type is not a list type.");
/*    */     }
/* 37 */     List.ListType<?> listType = (List.ListType)type2;
/*    */     
/* 39 */     return a(type1, listType);
/*    */   }
/*    */   
/*    */   private <TE> TypeRewriteRule a(Type<?> ☃, List.ListType<TE> listType) {
/* 43 */     Type<TE> type = listType.getElement();
/* 44 */     OpticFinder<?> opticFinder = DSL.fieldFinder("Level", ☃);
/* 45 */     OpticFinder<List<TE>> opticFinder1 = DSL.fieldFinder("TileEntities", (Type)listType);
/*    */ 
/*    */     
/* 48 */     int i = 416;
/*    */     
/* 50 */     return TypeRewriteRule.seq(
/* 51 */         fixTypeEverywhere("InjectBedBlockEntityType", (Type)getInputSchema().findChoiceType(aax.j), (Type)getOutputSchema().findChoiceType(aax.j), ☃ -> ()), 
/* 52 */         fixTypeEverywhereTyped("BedBlockEntityInjecter", getOutputSchema().getType(aax.c), typed -> {
/*    */             Typed<?> typed1 = typed.getTyped(☃);
/*    */             Dynamic<?> dynamic = (Dynamic)typed1.get(DSL.remainderFinder());
/*    */             int i = dynamic.getInt("xPos");
/*    */             int j = dynamic.getInt("zPos");
/*    */             List<TE> list = Lists.newArrayList((Iterable)typed1.getOrCreate(opticFinder1));
/*    */             List<? extends Dynamic<?>> list1 = (List<? extends Dynamic<?>>)((Stream)dynamic.get("Sections").flatMap(Dynamic::getStream).orElse(Stream.empty())).collect(Collectors.toList());
/*    */             for (int k = 0; k < list1.size(); k++) {
/*    */               Dynamic<?> dynamic1 = list1.get(k);
/*    */               int m = ((Number)dynamic1.get("Y").flatMap(Dynamic::getNumberValue).orElse(Integer.valueOf(0))).intValue();
/*    */               Stream<Integer> stream = ((Stream)dynamic1.get("Blocks").flatMap(Dynamic::getStream).orElse(Stream.empty())).map(());
/*    */               int n = 0;
/*    */               Iterator<?> iterator = stream::iterator.iterator();
/*    */               while (iterator.hasNext()) {
/*    */                 int i1 = ((Integer)iterator.next()).intValue();
/*    */                 if (416 == (i1 & 0xFF) << 4) {
/*    */                   int i2 = n & 0xF;
/*    */                   int i3 = n >> 8 & 0xF;
/*    */                   int i4 = n >> 4 & 0xF;
/*    */                   Map<Dynamic<?>, Dynamic<?>> map = Maps.newHashMap();
/*    */                   map.put(dynamic1.createString("id"), dynamic1.createString("minecraft:bed"));
/*    */                   map.put(dynamic1.createString("x"), dynamic1.createInt(i2 + (i << 4)));
/*    */                   map.put(dynamic1.createString("y"), dynamic1.createInt(i3 + (m << 4)));
/*    */                   map.put(dynamic1.createString("z"), dynamic1.createInt(i4 + (j << 4)));
/*    */                   map.put(dynamic1.createString("color"), dynamic1.createShort((short)14));
/*    */                   list.add((TE)((Optional)type.read(dynamic1.createMap(map)).getSecond()).orElseThrow(()));
/*    */                 } 
/*    */                 n++;
/*    */               } 
/*    */             } 
/*    */             return !list.isEmpty() ? typed.set(☃, typed1.set(opticFinder1, list)) : typed;
/*    */           }));
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\yc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */