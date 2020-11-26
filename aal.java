/*     */ import com.google.common.base.Splitter;
/*     */ import com.google.common.collect.ImmutableMap;
/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.mojang.datafixers.DataFix;
/*     */ import com.mojang.datafixers.Dynamic;
/*     */ import com.mojang.datafixers.TypeRewriteRule;
/*     */ import com.mojang.datafixers.Typed;
/*     */ import com.mojang.datafixers.schemas.Schema;
/*     */ import com.mojang.datafixers.types.DynamicOps;
/*     */ import com.mojang.datafixers.types.JsonOps;
/*     */ import com.mojang.datafixers.types.Type;
/*     */ import com.mojang.datafixers.util.Pair;
/*     */ import java.util.Collections;
/*     */ import java.util.HashMap;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Locale;
/*     */ import java.util.Map;
/*     */ import java.util.Optional;
/*     */ import java.util.stream.Collectors;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ public class aal extends DataFix {
/*     */   static final Map<String, String> a;
/*     */   
/*     */   static {
/*  29 */     a = k.<Map<String, String>>a(Maps.newHashMap(), ☃ -> {
/*     */           ☃.put("0", "minecraft:ocean");
/*     */           ☃.put("1", "minecraft:plains");
/*     */           ☃.put("2", "minecraft:desert");
/*     */           ☃.put("3", "minecraft:mountains");
/*     */           ☃.put("4", "minecraft:forest");
/*     */           ☃.put("5", "minecraft:taiga");
/*     */           ☃.put("6", "minecraft:swamp");
/*     */           ☃.put("7", "minecraft:river");
/*     */           ☃.put("8", "minecraft:nether");
/*     */           ☃.put("9", "minecraft:the_end");
/*     */           ☃.put("10", "minecraft:frozen_ocean");
/*     */           ☃.put("11", "minecraft:frozen_river");
/*     */           ☃.put("12", "minecraft:snowy_tundra");
/*     */           ☃.put("13", "minecraft:snowy_mountains");
/*     */           ☃.put("14", "minecraft:mushroom_fields");
/*     */           ☃.put("15", "minecraft:mushroom_field_shore");
/*     */           ☃.put("16", "minecraft:beach");
/*     */           ☃.put("17", "minecraft:desert_hills");
/*     */           ☃.put("18", "minecraft:wooded_hills");
/*     */           ☃.put("19", "minecraft:taiga_hills");
/*     */           ☃.put("20", "minecraft:mountain_edge");
/*     */           ☃.put("21", "minecraft:jungle");
/*     */           ☃.put("22", "minecraft:jungle_hills");
/*     */           ☃.put("23", "minecraft:jungle_edge");
/*     */           ☃.put("24", "minecraft:deep_ocean");
/*     */           ☃.put("25", "minecraft:stone_shore");
/*     */           ☃.put("26", "minecraft:snowy_beach");
/*     */           ☃.put("27", "minecraft:birch_forest");
/*     */           ☃.put("28", "minecraft:birch_forest_hills");
/*     */           ☃.put("29", "minecraft:dark_forest");
/*     */           ☃.put("30", "minecraft:snowy_taiga");
/*     */           ☃.put("31", "minecraft:snowy_taiga_hills");
/*     */           ☃.put("32", "minecraft:giant_tree_taiga");
/*     */           ☃.put("33", "minecraft:giant_tree_taiga_hills");
/*     */           ☃.put("34", "minecraft:wooded_mountains");
/*     */           ☃.put("35", "minecraft:savanna");
/*     */           ☃.put("36", "minecraft:savanna_plateau");
/*     */           ☃.put("37", "minecraft:badlands");
/*     */           ☃.put("38", "minecraft:wooded_badlands_plateau");
/*     */           ☃.put("39", "minecraft:badlands_plateau");
/*     */           ☃.put("40", "minecraft:small_end_islands");
/*     */           ☃.put("41", "minecraft:end_midlands");
/*     */           ☃.put("42", "minecraft:end_highlands");
/*     */           ☃.put("43", "minecraft:end_barrens");
/*     */           ☃.put("44", "minecraft:warm_ocean");
/*     */           ☃.put("45", "minecraft:lukewarm_ocean");
/*     */           ☃.put("46", "minecraft:cold_ocean");
/*     */           ☃.put("47", "minecraft:deep_warm_ocean");
/*     */           ☃.put("48", "minecraft:deep_lukewarm_ocean");
/*     */           ☃.put("49", "minecraft:deep_cold_ocean");
/*     */           ☃.put("50", "minecraft:deep_frozen_ocean");
/*     */           ☃.put("127", "minecraft:the_void");
/*     */           ☃.put("129", "minecraft:sunflower_plains");
/*     */           ☃.put("130", "minecraft:desert_lakes");
/*     */           ☃.put("131", "minecraft:gravelly_mountains");
/*     */           ☃.put("132", "minecraft:flower_forest");
/*     */           ☃.put("133", "minecraft:taiga_mountains");
/*     */           ☃.put("134", "minecraft:swamp_hills");
/*     */           ☃.put("140", "minecraft:ice_spikes");
/*     */           ☃.put("149", "minecraft:modified_jungle");
/*     */           ☃.put("151", "minecraft:modified_jungle_edge");
/*     */           ☃.put("155", "minecraft:tall_birch_forest");
/*     */           ☃.put("156", "minecraft:tall_birch_hills");
/*     */           ☃.put("157", "minecraft:dark_forest_hills");
/*     */           ☃.put("158", "minecraft:snowy_taiga_mountains");
/*     */           ☃.put("160", "minecraft:giant_spruce_taiga");
/*     */           ☃.put("161", "minecraft:giant_spruce_taiga_hills");
/*     */           ☃.put("162", "minecraft:modified_gravelly_mountains");
/*     */           ☃.put("163", "minecraft:shattered_savanna");
/*     */           ☃.put("164", "minecraft:shattered_savanna_plateau");
/*     */           ☃.put("165", "minecraft:eroded_badlands");
/*     */           ☃.put("166", "minecraft:modified_wooded_badlands_plateau");
/*     */           ☃.put("167", "minecraft:modified_badlands_plateau");
/*     */         });
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public aal(Schema ☃, boolean bool) {
/* 110 */     super(☃, bool);
/*     */   }
/*     */ 
/*     */   
/*     */   protected TypeRewriteRule makeRule() {
/* 115 */     Type<?> ☃ = getOutputSchema().getType(aax.a);
/* 116 */     return fixTypeEverywhereTyped("LevelDataGeneratorOptionsFix", getInputSchema().getType(aax.a), ☃, typed -> {
/*     */           Dynamic<?> dynamic2;
/*     */           Dynamic<?> dynamic1 = typed.write();
/*     */           Optional<String> optional = dynamic1.get("generatorOptions").flatMap(Dynamic::getStringValue);
/*     */           if ("flat".equalsIgnoreCase(dynamic1.getString("generatorName"))) {
/*     */             String str = optional.orElse("");
/*     */             dynamic2 = dynamic1.set("generatorOptions", a(str, dynamic1.getOps()));
/*     */           } else if ("buffet".equalsIgnoreCase(dynamic1.getString("generatorName")) && optional.isPresent()) {
/*     */             Dynamic<JsonElement> dynamic = new Dynamic((DynamicOps)JsonOps.INSTANCE, xj.a(optional.get(), true));
/*     */             dynamic2 = dynamic1.set("generatorOptions", dynamic.convert(dynamic1.getOps()));
/*     */           } else {
/*     */             dynamic2 = dynamic1;
/*     */           } 
/*     */           return (Typed)((Optional)☃.readTyped(dynamic2).getSecond()).orElseThrow(());
/*     */         });
/*     */   }
/*     */   private static <T> Dynamic<T> a(String ☃, DynamicOps<T> dynamicOps) {
/*     */     List<Pair<Integer, String>> list;
/* 134 */     Iterator<String> iterator = Splitter.on(';').split(☃).iterator();
/*     */ 
/*     */     
/* 137 */     String str = "minecraft:plains";
/* 138 */     Map<String, Map<String, String>> map = Maps.newHashMap();
/*     */     
/* 140 */     if (!☃.isEmpty() && iterator.hasNext()) {
/* 141 */       list = b(iterator.next());
/*     */       
/* 143 */       if (!list.isEmpty()) {
/* 144 */         if (iterator.hasNext()) {
/* 145 */           str = a.getOrDefault(iterator.next(), "minecraft:plains");
/*     */         }
/*     */         
/* 148 */         if (iterator.hasNext()) {
/* 149 */           String[] arrayOfString = ((String)iterator.next()).toLowerCase(Locale.ROOT).split(",");
/*     */           
/* 151 */           for (String str1 : arrayOfString) {
/* 152 */             String[] arrayOfString1 = str1.split("\\(", 2);
/*     */             
/* 154 */             if (!arrayOfString1[0].isEmpty()) {
/* 155 */               map.put(arrayOfString1[0], Maps.newHashMap());
/*     */               
/* 157 */               if (arrayOfString1.length > 1 && arrayOfString1[1].endsWith(")") && arrayOfString1[1].length() > 1) {
/* 158 */                 String[] arrayOfString2 = arrayOfString1[1].substring(0, arrayOfString1[1].length() - 1).split(" ");
/*     */                 
/* 160 */                 for (String str2 : arrayOfString2) {
/* 161 */                   String[] arrayOfString3 = str2.split("=", 2);
/* 162 */                   if (arrayOfString3.length == 2) {
/* 163 */                     ((Map<String, String>)map.get(arrayOfString1[0])).put(arrayOfString3[0], arrayOfString3[1]);
/*     */                   }
/*     */                 } 
/*     */               } 
/*     */             } 
/*     */           } 
/*     */         } else {
/* 170 */           map.put("village", Maps.newHashMap());
/*     */         } 
/*     */       } 
/*     */     } else {
/* 174 */       list = Lists.newArrayList();
/* 175 */       list.add(Pair.of(Integer.valueOf(1), "minecraft:bedrock"));
/* 176 */       list.add(Pair.of(Integer.valueOf(2), "minecraft:dirt"));
/* 177 */       list.add(Pair.of(Integer.valueOf(1), "minecraft:grass_block"));
/* 178 */       map.put("village", Maps.newHashMap());
/*     */     } 
/*     */     
/* 181 */     T t1 = (T)dynamicOps.createList(list.stream().map(pair -> ☃.createMap((Map)ImmutableMap.of(☃.createString("height"), ☃.createInt(((Integer)pair.getFirst()).intValue()), ☃.createString("block"), ☃.createString((String)pair.getSecond())))));
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 186 */     T t2 = (T)dynamicOps.createMap((Map)map.entrySet().stream().map(entry -> Pair.of(☃.createString(((String)entry.getKey()).toLowerCase(Locale.ROOT)), ☃.createMap((Map)((Map)entry.getValue()).entrySet().stream().map(()).collect(Collectors.toMap(Pair::getFirst, Pair::getSecond)))))
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 193 */         .collect(Collectors.toMap(Pair::getFirst, Pair::getSecond)));
/*     */     
/* 195 */     return new Dynamic(dynamicOps, dynamicOps.createMap((Map)ImmutableMap.of(dynamicOps
/* 196 */             .createString("layers"), t1, dynamicOps
/* 197 */             .createString("biome"), dynamicOps.createString(str), dynamicOps
/* 198 */             .createString("structures"), t2)));
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private static Pair<Integer, String> a(String ☃) {
/*     */     int i;
/* 204 */     String[] arrayOfString = ☃.split("\\*", 2);
/*     */ 
/*     */     
/* 207 */     if (arrayOfString.length == 2) {
/*     */       try {
/* 209 */         i = Integer.parseInt(arrayOfString[0]);
/* 210 */       } catch (NumberFormatException numberFormatException) {
/* 211 */         return null;
/*     */       } 
/*     */     } else {
/* 214 */       i = 1;
/*     */     } 
/*     */     
/* 217 */     String str = arrayOfString[arrayOfString.length - 1];
/* 218 */     return Pair.of(Integer.valueOf(i), str);
/*     */   }
/*     */   
/*     */   private static List<Pair<Integer, String>> b(String ☃) {
/* 222 */     List<Pair<Integer, String>> list = Lists.newArrayList();
/* 223 */     String[] arrayOfString = ☃.split(",");
/*     */     
/* 225 */     for (String str : arrayOfString) {
/* 226 */       Pair<Integer, String> pair = a(str);
/* 227 */       if (pair == null) {
/* 228 */         return Collections.emptyList();
/*     */       }
/* 230 */       list.add(pair);
/*     */     } 
/*     */     
/* 233 */     return list;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\aal.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */