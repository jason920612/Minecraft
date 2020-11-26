/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.collect.Sets;
/*     */ import com.mojang.datafixers.DataFix;
/*     */ import com.mojang.datafixers.DataFixUtils;
/*     */ import com.mojang.datafixers.Dynamic;
/*     */ import com.mojang.datafixers.TypeRewriteRule;
/*     */ import com.mojang.datafixers.schemas.Schema;
/*     */ import com.mojang.datafixers.types.Type;
/*     */ import it.unimi.dsi.fastutil.ints.Int2ObjectLinkedOpenHashMap;
/*     */ import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
/*     */ import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
/*     */ import it.unimi.dsi.fastutil.ints.IntArrayList;
/*     */ import it.unimi.dsi.fastutil.ints.IntList;
/*     */ import it.unimi.dsi.fastutil.ints.IntListIterator;
/*     */ import it.unimi.dsi.fastutil.objects.ObjectIterator;
/*     */ import java.nio.ByteBuffer;
/*     */ import java.util.Arrays;
/*     */ import java.util.BitSet;
/*     */ import java.util.HashMap;
/*     */ import java.util.Map;
/*     */ import java.util.Objects;
/*     */ import java.util.Optional;
/*     */ import java.util.Set;
/*     */ import java.util.function.Supplier;
/*     */ import java.util.stream.Stream;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class yr
/*     */   extends DataFix
/*     */ {
/*     */   public yr(Schema ☃, boolean bool) {
/*  41 */     super(☃, bool);
/*     */   }
/*     */   
/*  44 */   private static final Logger a = LogManager.getLogger();
/*     */   
/*  46 */   private static final BitSet b = new BitSet(256);
/*  47 */   private static final BitSet c = new BitSet(256);
/*  48 */   private static final Dynamic<?> d = yp.b("{Name:'minecraft:pumpkin'}");
/*  49 */   private static final Dynamic<?> e = yp.b("{Name:'minecraft:podzol',Properties:{snowy:'true'}}");
/*  50 */   private static final Dynamic<?> f = yp.b("{Name:'minecraft:grass_block',Properties:{snowy:'true'}}");
/*  51 */   private static final Dynamic<?> g = yp.b("{Name:'minecraft:mycelium',Properties:{snowy:'true'}}");
/*  52 */   private static final Dynamic<?> h = yp.b("{Name:'minecraft:sunflower',Properties:{half:'upper'}}");
/*  53 */   private static final Dynamic<?> i = yp.b("{Name:'minecraft:lilac',Properties:{half:'upper'}}");
/*  54 */   private static final Dynamic<?> j = yp.b("{Name:'minecraft:tall_grass',Properties:{half:'upper'}}");
/*  55 */   private static final Dynamic<?> k = yp.b("{Name:'minecraft:large_fern',Properties:{half:'upper'}}");
/*  56 */   private static final Dynamic<?> l = yp.b("{Name:'minecraft:rose_bush',Properties:{half:'upper'}}");
/*  57 */   private static final Dynamic<?> m = yp.b("{Name:'minecraft:peony',Properties:{half:'upper'}}");
/*     */   private static final Map<String, Dynamic<?>> n; private static final Map<String, Dynamic<?>> o; private static final Map<String, Dynamic<?>> p; private static final Map<String, Dynamic<?>> q; private static final Int2ObjectMap<String> r; private static final Map<String, Dynamic<?>> s; private static final Map<String, Dynamic<?>> t; private static void a(Map<String, Dynamic<?>> ☃, int i, String str1, String str2) { ☃.put(i + "north", yp.b("{Name:'minecraft:" + str1 + "_wall_" + str2 + "',Properties:{facing:'north'}}")); ☃.put(i + "east", yp.b("{Name:'minecraft:" + str1 + "_wall_" + str2 + "',Properties:{facing:'east'}}")); ☃.put(i + "south", yp.b("{Name:'minecraft:" + str1 + "_wall_" + str2 + "',Properties:{facing:'south'}}")); ☃.put(i + "west", yp.b("{Name:'minecraft:" + str1 + "_wall_" + str2 + "',Properties:{facing:'west'}}")); for (int j = 0; j < 16; j++)
/*  59 */       ☃.put(i + "" + j, yp.b("{Name:'minecraft:" + str1 + "_" + str2 + "',Properties:{rotation:'" + j + "'}}"));  } static { n = (Map<String, Dynamic<?>>)DataFixUtils.make(Maps.newHashMap(), ☃ -> {
/*     */           ☃.put("minecraft:air0", yp.b("{Name:'minecraft:flower_pot'}"));
/*     */           
/*     */           ☃.put("minecraft:red_flower0", yp.b("{Name:'minecraft:potted_poppy'}"));
/*     */           ☃.put("minecraft:red_flower1", yp.b("{Name:'minecraft:potted_blue_orchid'}"));
/*     */           ☃.put("minecraft:red_flower2", yp.b("{Name:'minecraft:potted_allium'}"));
/*     */           ☃.put("minecraft:red_flower3", yp.b("{Name:'minecraft:potted_azure_bluet'}"));
/*     */           ☃.put("minecraft:red_flower4", yp.b("{Name:'minecraft:potted_red_tulip'}"));
/*     */           ☃.put("minecraft:red_flower5", yp.b("{Name:'minecraft:potted_orange_tulip'}"));
/*     */           ☃.put("minecraft:red_flower6", yp.b("{Name:'minecraft:potted_white_tulip'}"));
/*     */           ☃.put("minecraft:red_flower7", yp.b("{Name:'minecraft:potted_pink_tulip'}"));
/*     */           ☃.put("minecraft:red_flower8", yp.b("{Name:'minecraft:potted_oxeye_daisy'}"));
/*     */           ☃.put("minecraft:yellow_flower0", yp.b("{Name:'minecraft:potted_dandelion'}"));
/*     */           ☃.put("minecraft:sapling0", yp.b("{Name:'minecraft:potted_oak_sapling'}"));
/*     */           ☃.put("minecraft:sapling1", yp.b("{Name:'minecraft:potted_spruce_sapling'}"));
/*     */           ☃.put("minecraft:sapling2", yp.b("{Name:'minecraft:potted_birch_sapling'}"));
/*     */           ☃.put("minecraft:sapling3", yp.b("{Name:'minecraft:potted_jungle_sapling'}"));
/*     */           ☃.put("minecraft:sapling4", yp.b("{Name:'minecraft:potted_acacia_sapling'}"));
/*     */           ☃.put("minecraft:sapling5", yp.b("{Name:'minecraft:potted_dark_oak_sapling'}"));
/*     */           ☃.put("minecraft:red_mushroom0", yp.b("{Name:'minecraft:potted_red_mushroom'}"));
/*     */           ☃.put("minecraft:brown_mushroom0", yp.b("{Name:'minecraft:potted_brown_mushroom'}"));
/*     */           ☃.put("minecraft:deadbush0", yp.b("{Name:'minecraft:potted_dead_bush'}"));
/*     */           ☃.put("minecraft:tallgrass2", yp.b("{Name:'minecraft:potted_fern'}"));
/*     */           ☃.put("minecraft:cactus0", yp.b(2240));
/*     */         });
/*  84 */     o = (Map<String, Dynamic<?>>)DataFixUtils.make(Maps.newHashMap(), ☃ -> {
/*     */           a(☃, 0, "skeleton", "skull");
/*     */ 
/*     */           
/*     */           a(☃, 1, "wither_skeleton", "skull");
/*     */ 
/*     */           
/*     */           a(☃, 2, "zombie", "head");
/*     */ 
/*     */           
/*     */           a(☃, 3, "player", "head");
/*     */ 
/*     */           
/*     */           a(☃, 4, "creeper", "head");
/*     */ 
/*     */           
/*     */           a(☃, 5, "dragon", "head");
/*     */         });
/*     */     
/* 103 */     p = (Map<String, Dynamic<?>>)DataFixUtils.make(Maps.newHashMap(), ☃ -> {
/*     */           a(☃, "oak_door", 1024);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*     */           a(☃, "iron_door", 1136);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*     */           a(☃, "spruce_door", 3088);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*     */           a(☃, "birch_door", 3104);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*     */           a(☃, "jungle_door", 3120);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*     */           a(☃, "acacia_door", 3136);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*     */           a(☃, "dark_oak_door", 3152);
/*     */         });
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 180 */     q = (Map<String, Dynamic<?>>)DataFixUtils.make(Maps.newHashMap(), ☃ -> {
/*     */           for (int i = 0; i < 26; i++) {
/*     */             ☃.put("true" + i, yp.b("{Name:'minecraft:note_block',Properties:{powered:'true',note:'" + i + "'}}"));
/*     */             
/*     */             ☃.put("false" + i, yp.b("{Name:'minecraft:note_block',Properties:{powered:'false',note:'" + i + "'}}"));
/*     */           } 
/*     */         });
/* 187 */     r = (Int2ObjectMap<String>)DataFixUtils.make(new Int2ObjectOpenHashMap(), ☃ -> {
/*     */           ☃.put(0, "white");
/*     */           
/*     */           ☃.put(1, "orange");
/*     */           ☃.put(2, "magenta");
/*     */           ☃.put(3, "light_blue");
/*     */           ☃.put(4, "yellow");
/*     */           ☃.put(5, "lime");
/*     */           ☃.put(6, "pink");
/*     */           ☃.put(7, "gray");
/*     */           ☃.put(8, "light_gray");
/*     */           ☃.put(9, "cyan");
/*     */           ☃.put(10, "purple");
/*     */           ☃.put(11, "blue");
/*     */           ☃.put(12, "brown");
/*     */           ☃.put(13, "green");
/*     */           ☃.put(14, "red");
/*     */           ☃.put(15, "black");
/*     */         });
/* 206 */     s = (Map<String, Dynamic<?>>)DataFixUtils.make(Maps.newHashMap(), ☃ -> {
/*     */           ObjectIterator<Int2ObjectMap.Entry<String>> objectIterator = r.int2ObjectEntrySet().iterator();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*     */           while (objectIterator.hasNext()) {
/*     */             Int2ObjectMap.Entry<String> entry = objectIterator.next();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/*     */             if (!Objects.equals(entry.getValue(), "red")) {
/*     */               a(☃, entry.getIntKey(), (String)entry.getValue());
/*     */             }
/*     */           } 
/*     */         });
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 229 */     t = (Map<String, Dynamic<?>>)DataFixUtils.make(Maps.newHashMap(), ☃ -> {
/*     */           ObjectIterator<Int2ObjectMap.Entry<String>> objectIterator = r.int2ObjectEntrySet().iterator();
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*     */           while (objectIterator.hasNext()) {
/*     */             Int2ObjectMap.Entry<String> entry = objectIterator.next();
/*     */ 
/*     */ 
/*     */ 
/*     */             
/*     */             if (!Objects.equals(entry.getValue(), "white")) {
/*     */               b(☃, 15 - entry.getIntKey(), (String)entry.getValue());
/*     */             }
/*     */           } 
/*     */         });
/*     */ 
/*     */ 
/*     */     
/* 249 */     c.set(2);
/* 250 */     c.set(3);
/* 251 */     c.set(110);
/*     */     
/* 253 */     c.set(140);
/* 254 */     c.set(144);
/*     */     
/* 256 */     c.set(25);
/*     */     
/* 258 */     c.set(86);
/*     */ 
/*     */     
/* 261 */     c.set(26);
/* 262 */     c.set(176);
/* 263 */     c.set(177);
/*     */     
/* 265 */     c.set(175);
/*     */     
/* 267 */     c.set(64);
/* 268 */     c.set(71);
/* 269 */     c.set(193);
/* 270 */     c.set(194);
/* 271 */     c.set(195);
/* 272 */     c.set(196);
/* 273 */     c.set(197);
/*     */     
/* 275 */     b.set(54);
/* 276 */     b.set(146);
/*     */     
/* 278 */     b.set(25);
/*     */     
/* 280 */     b.set(26);
/*     */     
/* 282 */     b.set(51);
/*     */     
/* 284 */     b.set(53);
/* 285 */     b.set(67);
/* 286 */     b.set(108);
/* 287 */     b.set(109);
/* 288 */     b.set(114);
/* 289 */     b.set(128);
/* 290 */     b.set(134);
/* 291 */     b.set(135);
/* 292 */     b.set(136);
/* 293 */     b.set(156);
/* 294 */     b.set(163);
/* 295 */     b.set(164);
/* 296 */     b.set(180);
/* 297 */     b.set(203);
/*     */     
/* 299 */     b.set(55);
/*     */     
/* 301 */     b.set(85);
/* 302 */     b.set(113);
/* 303 */     b.set(188);
/* 304 */     b.set(189);
/* 305 */     b.set(190);
/* 306 */     b.set(191);
/* 307 */     b.set(192);
/*     */     
/* 309 */     b.set(93);
/* 310 */     b.set(94);
/*     */     
/* 312 */     b.set(101);
/* 313 */     b.set(102);
/* 314 */     b.set(160);
/*     */     
/* 316 */     b.set(106);
/*     */ 
/*     */     
/* 319 */     b.set(107);
/* 320 */     b.set(183);
/* 321 */     b.set(184);
/* 322 */     b.set(185);
/* 323 */     b.set(186);
/* 324 */     b.set(187);
/*     */     
/* 326 */     b.set(132);
/* 327 */     b.set(139);
/*     */     
/* 329 */     b.set(199); }
/*     */   private static void a(Map<String, Dynamic<?>> ☃, String str, int i) { ☃.put("minecraft:" + str + "eastlowerleftfalsefalse", yp.b("{Name:'minecraft:" + str + "',Properties:{facing:'east',half:'lower',hinge:'left',open:'false',powered:'false'}}")); ☃.put("minecraft:" + str + "eastlowerleftfalsetrue", yp.b("{Name:'minecraft:" + str + "',Properties:{facing:'east',half:'lower',hinge:'left',open:'false',powered:'true'}}")); ☃.put("minecraft:" + str + "eastlowerlefttruefalse", yp.b("{Name:'minecraft:" + str + "',Properties:{facing:'east',half:'lower',hinge:'left',open:'true',powered:'false'}}")); ☃.put("minecraft:" + str + "eastlowerlefttruetrue", yp.b("{Name:'minecraft:" + str + "',Properties:{facing:'east',half:'lower',hinge:'left',open:'true',powered:'true'}}")); ☃.put("minecraft:" + str + "eastlowerrightfalsefalse", yp.b(i)); ☃.put("minecraft:" + str + "eastlowerrightfalsetrue", yp.b("{Name:'minecraft:" + str + "',Properties:{facing:'east',half:'lower',hinge:'right',open:'false',powered:'true'}}")); ☃.put("minecraft:" + str + "eastlowerrighttruefalse", yp.b(i + 4)); ☃.put("minecraft:" + str + "eastlowerrighttruetrue", yp.b("{Name:'minecraft:" + str + "',Properties:{facing:'east',half:'lower',hinge:'right',open:'true',powered:'true'}}")); ☃.put("minecraft:" + str + "eastupperleftfalsefalse", yp.b(i + 8)); ☃.put("minecraft:" + str + "eastupperleftfalsetrue", yp.b(i + 10)); ☃.put("minecraft:" + str + "eastupperlefttruefalse", yp.b("{Name:'minecraft:" + str + "',Properties:{facing:'east',half:'upper',hinge:'left',open:'true',powered:'false'}}")); ☃.put("minecraft:" + str + "eastupperlefttruetrue", yp.b("{Name:'minecraft:" + str + "',Properties:{facing:'east',half:'upper',hinge:'left',open:'true',powered:'true'}}")); ☃.put("minecraft:" + str + "eastupperrightfalsefalse", yp.b(i + 9)); ☃.put("minecraft:" + str + "eastupperrightfalsetrue", yp.b(i + 11)); ☃.put("minecraft:" + str + "eastupperrighttruefalse", yp.b("{Name:'minecraft:" + str + "',Properties:{facing:'east',half:'upper',hinge:'right',open:'true',powered:'false'}}")); ☃.put("minecraft:" + str + "eastupperrighttruetrue", yp.b("{Name:'minecraft:" + str + "',Properties:{facing:'east',half:'upper',hinge:'right',open:'true',powered:'true'}}")); ☃.put("minecraft:" + str + "northlowerleftfalsefalse", yp.b("{Name:'minecraft:" + str + "',Properties:{facing:'north',half:'lower',hinge:'left',open:'false',powered:'false'}}")); ☃.put("minecraft:" + str + "northlowerleftfalsetrue", yp.b("{Name:'minecraft:" + str + "',Properties:{facing:'north',half:'lower',hinge:'left',open:'false',powered:'true'}}")); ☃.put("minecraft:" + str + "northlowerlefttruefalse", yp.b("{Name:'minecraft:" + str + "',Properties:{facing:'north',half:'lower',hinge:'left',open:'true',powered:'false'}}")); ☃.put("minecraft:" + str + "northlowerlefttruetrue", yp.b("{Name:'minecraft:" + str + "',Properties:{facing:'north',half:'lower',hinge:'left',open:'true',powered:'true'}}")); ☃.put("minecraft:" + str + "northlowerrightfalsefalse", yp.b(i + 3)); ☃.put("minecraft:" + str + "northlowerrightfalsetrue", yp.b("{Name:'minecraft:" + str + "',Properties:{facing:'north',half:'lower',hinge:'right',open:'false',powered:'true'}}")); ☃.put("minecraft:" + str + "northlowerrighttruefalse", yp.b(i + 7)); ☃.put("minecraft:" + str + "northlowerrighttruetrue", yp.b("{Name:'minecraft:" + str + "',Properties:{facing:'north',half:'lower',hinge:'right',open:'true',powered:'true'}}")); ☃.put("minecraft:" + str + "northupperleftfalsefalse", yp.b("{Name:'minecraft:" + str + "',Properties:{facing:'north',half:'upper',hinge:'left',open:'false',powered:'false'}}")); ☃.put("minecraft:" + str + "northupperleftfalsetrue", yp.b("{Name:'minecraft:" + str + "',Properties:{facing:'north',half:'upper',hinge:'left',open:'false',powered:'true'}}")); ☃.put("minecraft:" + str + "northupperlefttruefalse", yp.b("{Name:'minecraft:" + str + "',Properties:{facing:'north',half:'upper',hinge:'left',open:'true',powered:'false'}}")); ☃.put("minecraft:" + str + "northupperlefttruetrue", yp.b("{Name:'minecraft:" + str + "',Properties:{facing:'north',half:'upper',hinge:'left',open:'true',powered:'true'}}")); ☃.put("minecraft:" + str + "northupperrightfalsefalse", yp.b("{Name:'minecraft:" + str + "',Properties:{facing:'north',half:'upper',hinge:'right',open:'false',powered:'false'}}")); ☃.put("minecraft:" + str + "northupperrightfalsetrue", yp.b("{Name:'minecraft:" + str + "',Properties:{facing:'north',half:'upper',hinge:'right',open:'false',powered:'true'}}")); ☃.put("minecraft:" + str + "northupperrighttruefalse", yp.b("{Name:'minecraft:" + str + "',Properties:{facing:'north',half:'upper',hinge:'right',open:'true',powered:'false'}}")); ☃.put("minecraft:" + str + "northupperrighttruetrue", yp.b("{Name:'minecraft:" + str + "',Properties:{facing:'north',half:'upper',hinge:'right',open:'true',powered:'true'}}")); ☃.put("minecraft:" + str + "southlowerleftfalsefalse", yp.b("{Name:'minecraft:" + str + "',Properties:{facing:'south',half:'lower',hinge:'left',open:'false',powered:'false'}}")); ☃.put("minecraft:" + str + "southlowerleftfalsetrue", yp.b("{Name:'minecraft:" + str + "',Properties:{facing:'south',half:'lower',hinge:'left',open:'false',powered:'true'}}")); ☃.put("minecraft:" + str + "southlowerlefttruefalse", yp.b("{Name:'minecraft:" + str + "',Properties:{facing:'south',half:'lower',hinge:'left',open:'true',powered:'false'}}")); ☃.put("minecraft:" + str + "southlowerlefttruetrue", yp.b("{Name:'minecraft:" + str + "',Properties:{facing:'south',half:'lower',hinge:'left',open:'true',powered:'true'}}")); ☃.put("minecraft:" + str + "southlowerrightfalsefalse", yp.b(i + 1)); ☃.put("minecraft:" + str + "southlowerrightfalsetrue", yp.b("{Name:'minecraft:" + str + "',Properties:{facing:'south',half:'lower',hinge:'right',open:'false',powered:'true'}}")); ☃.put("minecraft:" + str + "southlowerrighttruefalse", yp.b(i + 5)); ☃.put("minecraft:" + str + "southlowerrighttruetrue", yp.b("{Name:'minecraft:" + str + "',Properties:{facing:'south',half:'lower',hinge:'right',open:'true',powered:'true'}}")); ☃.put("minecraft:" + str + "southupperleftfalsefalse", yp.b("{Name:'minecraft:" + str + "',Properties:{facing:'south',half:'upper',hinge:'left',open:'false',powered:'false'}}")); ☃.put("minecraft:" + str + "southupperleftfalsetrue", yp.b("{Name:'minecraft:" + str + "',Properties:{facing:'south',half:'upper',hinge:'left',open:'false',powered:'true'}}")); ☃.put("minecraft:" + str + "southupperlefttruefalse", yp.b("{Name:'minecraft:" + str + "',Properties:{facing:'south',half:'upper',hinge:'left',open:'true',powered:'false'}}")); ☃.put("minecraft:" + str + "southupperlefttruetrue", yp.b("{Name:'minecraft:" + str + "',Properties:{facing:'south',half:'upper',hinge:'left',open:'true',powered:'true'}}")); ☃.put("minecraft:" + str + "southupperrightfalsefalse", yp.b("{Name:'minecraft:" + str + "',Properties:{facing:'south',half:'upper',hinge:'right',open:'false',powered:'false'}}")); ☃.put("minecraft:" + str + "southupperrightfalsetrue", yp.b("{Name:'minecraft:" + str + "',Properties:{facing:'south',half:'upper',hinge:'right',open:'false',powered:'true'}}")); ☃.put("minecraft:" + str + "southupperrighttruefalse", yp.b("{Name:'minecraft:" + str + "',Properties:{facing:'south',half:'upper',hinge:'right',open:'true',powered:'false'}}")); ☃.put("minecraft:" + str + "southupperrighttruetrue", yp.b("{Name:'minecraft:" + str + "',Properties:{facing:'south',half:'upper',hinge:'right',open:'true',powered:'true'}}")); ☃.put("minecraft:" + str + "westlowerleftfalsefalse", yp.b("{Name:'minecraft:" + str + "',Properties:{facing:'west',half:'lower',hinge:'left',open:'false',powered:'false'}}")); ☃.put("minecraft:" + str + "westlowerleftfalsetrue", yp.b("{Name:'minecraft:" + str + "',Properties:{facing:'west',half:'lower',hinge:'left',open:'false',powered:'true'}}")); ☃.put("minecraft:" + str + "westlowerlefttruefalse", yp.b("{Name:'minecraft:" + str + "',Properties:{facing:'west',half:'lower',hinge:'left',open:'true',powered:'false'}}")); ☃.put("minecraft:" + str + "westlowerlefttruetrue", yp.b("{Name:'minecraft:" + str + "',Properties:{facing:'west',half:'lower',hinge:'left',open:'true',powered:'true'}}")); ☃.put("minecraft:" + str + "westlowerrightfalsefalse", yp.b(i + 2)); ☃.put("minecraft:" + str + "westlowerrightfalsetrue", yp.b("{Name:'minecraft:" + str + "',Properties:{facing:'west',half:'lower',hinge:'right',open:'false',powered:'true'}}")); ☃.put("minecraft:" + str + "westlowerrighttruefalse", yp.b(i + 6)); ☃.put("minecraft:" + str + "westlowerrighttruetrue", yp.b("{Name:'minecraft:" + str + "',Properties:{facing:'west',half:'lower',hinge:'right',open:'true',powered:'true'}}")); ☃.put("minecraft:" + str + "westupperleftfalsefalse", yp.b("{Name:'minecraft:" + str + "',Properties:{facing:'west',half:'upper',hinge:'left',open:'false',powered:'false'}}")); ☃.put("minecraft:" + str + "westupperleftfalsetrue", yp.b("{Name:'minecraft:" + str + "',Properties:{facing:'west',half:'upper',hinge:'left',open:'false',powered:'true'}}")); ☃.put("minecraft:" + str + "westupperlefttruefalse", yp.b("{Name:'minecraft:" + str + "',Properties:{facing:'west',half:'upper',hinge:'left',open:'true',powered:'false'}}")); ☃.put("minecraft:" + str + "westupperlefttruetrue", yp.b("{Name:'minecraft:" + str + "',Properties:{facing:'west',half:'upper',hinge:'left',open:'true',powered:'true'}}")); ☃.put("minecraft:" + str + "westupperrightfalsefalse", yp.b("{Name:'minecraft:" + str + "',Properties:{facing:'west',half:'upper',hinge:'right',open:'false',powered:'false'}}")); ☃.put("minecraft:" + str + "westupperrightfalsetrue", yp.b("{Name:'minecraft:" + str + "',Properties:{facing:'west',half:'upper',hinge:'right',open:'false',powered:'true'}}"));
/*     */     ☃.put("minecraft:" + str + "westupperrighttruefalse", yp.b("{Name:'minecraft:" + str + "',Properties:{facing:'west',half:'upper',hinge:'right',open:'true',powered:'false'}}"));
/* 332 */     ☃.put("minecraft:" + str + "westupperrighttruetrue", yp.b("{Name:'minecraft:" + str + "',Properties:{facing:'west',half:'upper',hinge:'right',open:'true',powered:'true'}}")); } private static final Dynamic<?> u = yp.b(0); private static void a(Map<String, Dynamic<?>> ☃, int i, String str) { ☃.put("southfalsefoot" + i, yp.b("{Name:'minecraft:" + str + "_bed',Properties:{facing:'south',occupied:'false',part:'foot'}}")); ☃.put("westfalsefoot" + i, yp.b("{Name:'minecraft:" + str + "_bed',Properties:{facing:'west',occupied:'false',part:'foot'}}")); ☃.put("northfalsefoot" + i, yp.b("{Name:'minecraft:" + str + "_bed',Properties:{facing:'north',occupied:'false',part:'foot'}}")); ☃.put("eastfalsefoot" + i, yp.b("{Name:'minecraft:" + str + "_bed',Properties:{facing:'east',occupied:'false',part:'foot'}}")); ☃.put("southfalsehead" + i, yp.b("{Name:'minecraft:" + str + "_bed',Properties:{facing:'south',occupied:'false',part:'head'}}")); ☃.put("westfalsehead" + i, yp.b("{Name:'minecraft:" + str + "_bed',Properties:{facing:'west',occupied:'false',part:'head'}}")); ☃.put("northfalsehead" + i, yp.b("{Name:'minecraft:" + str + "_bed',Properties:{facing:'north',occupied:'false',part:'head'}}")); ☃.put("eastfalsehead" + i, yp.b("{Name:'minecraft:" + str + "_bed',Properties:{facing:'east',occupied:'false',part:'head'}}")); ☃.put("southtruehead" + i, yp.b("{Name:'minecraft:" + str + "_bed',Properties:{facing:'south',occupied:'true',part:'head'}}")); ☃.put("westtruehead" + i, yp.b("{Name:'minecraft:" + str + "_bed',Properties:{facing:'west',occupied:'true',part:'head'}}")); ☃.put("northtruehead" + i, yp.b("{Name:'minecraft:" + str + "_bed',Properties:{facing:'north',occupied:'true',part:'head'}}")); ☃.put("easttruehead" + i, yp.b("{Name:'minecraft:" + str + "_bed',Properties:{facing:'east',occupied:'true',part:'head'}}")); }
/*     */   private static void b(Map<String, Dynamic<?>> ☃, int i, String str) { for (int j = 0; j < 16; j++)
/*     */       ☃.put("" + j + "_" + i, yp.b("{Name:'minecraft:" + str + "_banner',Properties:{rotation:'" + j + "'}}"));  ☃.put("north_" + i, yp.b("{Name:'minecraft:" + str + "_wall_banner',Properties:{facing:'north'}}")); ☃.put("south_" + i, yp.b("{Name:'minecraft:" + str + "_wall_banner',Properties:{facing:'south'}}")); ☃.put("west_" + i, yp.b("{Name:'minecraft:" + str + "_wall_banner',Properties:{facing:'west'}}"));
/*     */     ☃.put("east_" + i, yp.b("{Name:'minecraft:" + str + "_wall_banner',Properties:{facing:'east'}}")); }
/* 336 */   public static String a(Dynamic<?> ☃) { return ☃.getString("Name"); }
/*     */ 
/*     */   
/*     */   public static String a(Dynamic<?> ☃, String str) {
/* 340 */     return ☃.get("Properties").map(dynamic -> dynamic.getString(☃)).orElse("");
/*     */   }
/*     */   
/*     */   public static int a(xg<Dynamic<?>> ☃, Dynamic<?> dynamic) {
/* 344 */     int i = ☃.a(dynamic);
/* 345 */     if (i == -1) {
/* 346 */       i = ☃.c(dynamic);
/*     */     }
/* 348 */     return i;
/*     */   }
/*     */   
/*     */   private Dynamic<?> b(Dynamic<?> ☃) {
/* 352 */     Optional<? extends Dynamic<?>> optional = ☃.get("Level");
/* 353 */     if (optional.isPresent() && ((Dynamic)optional.get()).get("Sections").flatMap(Dynamic::getStream).isPresent()) {
/* 354 */       return ☃.set("Level", (new d(optional.get())).a());
/*     */     }
/* 356 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public TypeRewriteRule makeRule() {
/* 361 */     Type<?> ☃ = getInputSchema().getType(aax.c);
/* 362 */     Type<?> type1 = getOutputSchema().getType(aax.c);
/* 363 */     return writeFixAndRead("ChunkPalettedStorageFix", ☃, type1, this::b);
/*     */   }
/*     */   
/*     */   static class c {
/* 367 */     private final xg<Dynamic<?>> b = new xg<>(32);
/*     */     
/*     */     private Dynamic<?> c;
/*     */     private final Dynamic<?> d;
/*     */     private final boolean e;
/* 372 */     private final Int2ObjectMap<IntList> f = (Int2ObjectMap<IntList>)new Int2ObjectLinkedOpenHashMap();
/*     */     
/* 374 */     private final IntList g = (IntList)new IntArrayList();
/*     */     public int a;
/* 376 */     private final Set<Dynamic<?>> h = Sets.newIdentityHashSet();
/* 377 */     private final int[] i = new int[4096];
/*     */     
/*     */     public c(Dynamic<?> ☃) {
/* 380 */       this.c = ☃.emptyList();
/* 381 */       this.d = ☃;
/* 382 */       this.a = ☃.getInt("Y");
/* 383 */       this.e = ☃.get("Blocks").isPresent();
/*     */     }
/*     */     
/*     */     public Dynamic<?> a(int ☃) {
/* 387 */       if (☃ < 0 || ☃ > 4095) {
/* 388 */         return yr.a();
/*     */       }
/*     */       
/* 391 */       Dynamic<?> dynamic = this.b.a(this.i[☃]);
/* 392 */       return (dynamic == null) ? yr.a() : dynamic;
/*     */     }
/*     */     
/*     */     public void a(int ☃, Dynamic<?> dynamic) {
/* 396 */       if (this.h.add(dynamic)) {
/* 397 */         this.c = this.c.merge("%%FILTER_ME%%".equals(yr.a(dynamic)) ? yr.a() : dynamic);
/*     */       }
/* 399 */       this.i[☃] = yr.a(this.b, dynamic);
/*     */     }
/*     */     
/*     */     public int b(int ☃) {
/* 403 */       if (!this.e) {
/* 404 */         return ☃;
/*     */       }
/* 406 */       ByteBuffer byteBuffer = this.d.get("Blocks").flatMap(Dynamic::getByteBuffer).get();
/* 407 */       yr.a a1 = this.d.get("Data").flatMap(Dynamic::getByteBuffer).map(☃ -> new yr.a(DataFixUtils.toArray(☃))).orElseGet(a::new);
/* 408 */       yr.a a2 = this.d.get("Add").flatMap(Dynamic::getByteBuffer).map(☃ -> new yr.a(DataFixUtils.toArray(☃))).orElseGet(a::new);
/*     */       
/* 410 */       this.h.add(yr.a());
/* 411 */       yr.a(this.b, yr.a());
/* 412 */       this.c = this.c.merge(yr.a());
/*     */       
/* 414 */       for (int i = 0; i < 4096; i++) {
/* 415 */         int j = i & 0xF;
/* 416 */         int k = i >> 8 & 0xF;
/* 417 */         int m = i >> 4 & 0xF;
/* 418 */         int n = a2.a(j, k, m) << 12 | (byteBuffer.get(i) & 0xFF) << 4 | a1.a(j, k, m);
/*     */         
/* 420 */         if (yr.b().get(n >> 4)) {
/* 421 */           a(n >> 4, i);
/*     */         }
/* 423 */         if (yr.c().get(n >> 4)) {
/*     */           
/* 425 */           int i1 = yr.a((j == 0), (j == 15), (m == 0), (m == 15));
/* 426 */           if (i1 == 0) {
/*     */             
/* 428 */             this.g.add(i);
/*     */           } else {
/* 430 */             ☃ |= i1;
/*     */           } 
/*     */         } 
/*     */         
/* 434 */         a(i, yp.b(n));
/*     */       } 
/*     */       
/* 437 */       return ☃;
/*     */     }
/*     */     private void a(int ☃, int i) {
/*     */       IntArrayList intArrayList;
/* 441 */       IntList intList = (IntList)this.f.get(☃);
/* 442 */       if (intList == null) {
/* 443 */         intArrayList = new IntArrayList();
/* 444 */         this.f.put(☃, intArrayList);
/*     */       } 
/* 446 */       intArrayList.add(i);
/*     */     }
/*     */     
/*     */     public Dynamic<?> a() {
/* 450 */       Dynamic<?> ☃ = this.d;
/* 451 */       if (!this.e) {
/* 452 */         return ☃;
/*     */       }
/* 454 */       ☃ = ☃.set("Palette", this.c);
/*     */       
/* 456 */       int i = Math.max(4, DataFixUtils.ceillog2(this.h.size()));
/* 457 */       xd xd = new xd(i, 4096);
/* 458 */       for (int j = 0; j < this.i.length; j++) {
/* 459 */         xd.a(j, this.i[j]);
/*     */       }
/*     */       
/* 462 */       ☃ = ☃.set("BlockStates", ☃.createLongList(Arrays.stream(xd.a())));
/*     */       
/* 464 */       ☃ = ☃.remove("Blocks");
/* 465 */       ☃ = ☃.remove("Data");
/* 466 */       ☃ = ☃.remove("Add");
/*     */       
/* 468 */       return ☃;
/*     */     }
/*     */   }
/*     */   
/*     */   static final class d
/*     */   {
/*     */     private int a;
/* 475 */     private final yr.c[] b = new yr.c[16];
/*     */     
/*     */     private final Dynamic<?> c;
/*     */     private final int d;
/*     */     private final int e;
/* 480 */     private final Int2ObjectMap<Dynamic<?>> f = (Int2ObjectMap<Dynamic<?>>)new Int2ObjectLinkedOpenHashMap(16);
/*     */     
/*     */     public d(Dynamic<?> ☃) {
/* 483 */       this.c = ☃;
/* 484 */       this.d = ☃.getInt("xPos") << 4;
/* 485 */       this.e = ☃.getInt("zPos") << 4;
/*     */       
/* 487 */       ☃.get("TileEntities").flatMap(Dynamic::getStream).ifPresent(☃ -> ☃.forEach(()));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 500 */       boolean bool = ☃.getBoolean("convertedFromAlphaFormat");
/*     */       
/* 502 */       ☃.get("Sections").flatMap(Dynamic::getStream).ifPresent(☃ -> ☃.forEach(()));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 510 */       for (yr.c c1 : this.b) {
/* 511 */         if (c1 != null)
/*     */         {
/*     */ 
/*     */           
/* 515 */           for (ObjectIterator<Map.Entry<Integer, IntList>> objectIterator = yr.c.a(c1).entrySet().iterator(); objectIterator.hasNext(); ) { IntListIterator<Integer> intListIterator; Map.Entry<Integer, IntList> entry = objectIterator.next();
/* 516 */             int i = c1.a << 12;
/* 517 */             switch (((Integer)entry.getKey()).intValue()) {
/*     */               case 2:
/* 519 */                 for (intListIterator = ((IntList)entry.getValue()).iterator(); intListIterator.hasNext(); ) { int j = ((Integer)intListIterator.next()).intValue();
/* 520 */                   j |= i;
/*     */                   
/* 522 */                   Dynamic<?> dynamic = a(j);
/* 523 */                   if ("minecraft:grass_block".equals(yr.a(dynamic))) {
/* 524 */                     String str = yr.a(a(a(j, yr.b.b)));
/* 525 */                     if ("minecraft:snow".equals(str) || "minecraft:snow_layer".equals(str)) {
/* 526 */                       a(j, yr.d());
/*     */                     }
/*     */                   }  }
/*     */               
/*     */ 
/*     */               
/*     */               case 3:
/* 533 */                 for (intListIterator = ((IntList)entry.getValue()).iterator(); intListIterator.hasNext(); ) { int j = ((Integer)intListIterator.next()).intValue();
/* 534 */                   j |= i;
/*     */                   
/* 536 */                   Dynamic<?> dynamic = a(j);
/* 537 */                   if ("minecraft:podzol".equals(yr.a(dynamic))) {
/* 538 */                     String str = yr.a(a(a(j, yr.b.b)));
/* 539 */                     if ("minecraft:snow".equals(str) || "minecraft:snow_layer".equals(str)) {
/* 540 */                       a(j, yr.e());
/*     */                     }
/*     */                   }  }
/*     */               
/*     */ 
/*     */               
/*     */               case 110:
/* 547 */                 for (intListIterator = ((IntList)entry.getValue()).iterator(); intListIterator.hasNext(); ) { int j = ((Integer)intListIterator.next()).intValue();
/* 548 */                   j |= i;
/*     */                   
/* 550 */                   Dynamic<?> dynamic = a(j);
/* 551 */                   if ("minecraft:mycelium".equals(yr.a(dynamic))) {
/* 552 */                     String str = yr.a(a(a(j, yr.b.b)));
/* 553 */                     if ("minecraft:snow".equals(str) || "minecraft:snow_layer".equals(str)) {
/* 554 */                       a(j, yr.f());
/*     */                     }
/*     */                   }  }
/*     */               
/*     */ 
/*     */               
/*     */               case 25:
/* 561 */                 for (intListIterator = ((IntList)entry.getValue()).iterator(); intListIterator.hasNext(); ) { int j = ((Integer)intListIterator.next()).intValue();
/* 562 */                   j |= i;
/* 563 */                   Dynamic<?> dynamic = c(j);
/* 564 */                   if (dynamic != null) {
/* 565 */                     String str = Boolean.toString(dynamic.getBoolean("powered")) + (byte)Math.min(Math.max(dynamic.getByte("note"), 0), 24);
/* 566 */                     a(j, (Dynamic)yr.g().getOrDefault(str, yr.g().get("false0")));
/*     */                   }  }
/*     */               
/*     */ 
/*     */               
/*     */               case 26:
/* 572 */                 for (intListIterator = ((IntList)entry.getValue()).iterator(); intListIterator.hasNext(); ) { int j = ((Integer)intListIterator.next()).intValue();
/* 573 */                   j |= i;
/* 574 */                   Dynamic<?> dynamic1 = b(j);
/* 575 */                   Dynamic<?> dynamic2 = a(j);
/* 576 */                   if (dynamic1 != null) {
/* 577 */                     int k = dynamic1.getInt("color");
/* 578 */                     if (k != 14 && k >= 0 && k < 16) {
/* 579 */                       String str = yr.a(dynamic2, "facing") + yr.a(dynamic2, "occupied") + yr.a(dynamic2, "part") + k;
/* 580 */                       if (yr.h().containsKey(str)) {
/* 581 */                         a(j, (Dynamic)yr.h().get(str));
/*     */                       }
/*     */                     } 
/*     */                   }  }
/*     */               
/*     */ 
/*     */               
/*     */               case 176:
/*     */               case 177:
/* 590 */                 for (intListIterator = ((IntList)entry.getValue()).iterator(); intListIterator.hasNext(); ) { int j = ((Integer)intListIterator.next()).intValue();
/* 591 */                   j |= i;
/* 592 */                   Dynamic<?> dynamic1 = b(j);
/* 593 */                   Dynamic<?> dynamic2 = a(j);
/* 594 */                   if (dynamic1 != null) {
/* 595 */                     int k = dynamic1.getInt("Base");
/* 596 */                     if (k != 15 && k >= 0 && k < 16) {
/* 597 */                       String str = yr.a(dynamic2, (((Integer)entry.getKey()).intValue() == 176) ? "rotation" : "facing") + "_" + k;
/* 598 */                       if (yr.i().containsKey(str)) {
/* 599 */                         a(j, (Dynamic)yr.i().get(str));
/*     */                       }
/*     */                     } 
/*     */                   }  }
/*     */               
/*     */ 
/*     */               
/*     */               case 86:
/* 607 */                 for (intListIterator = ((IntList)entry.getValue()).iterator(); intListIterator.hasNext(); ) { int j = ((Integer)intListIterator.next()).intValue();
/* 608 */                   j |= i;
/*     */                   
/* 610 */                   Dynamic<?> dynamic = a(j);
/* 611 */                   if ("minecraft:carved_pumpkin".equals(yr.a(dynamic))) {
/* 612 */                     String str = yr.a(a(a(j, yr.b.a)));
/* 613 */                     if ("minecraft:grass_block".equals(str) || "minecraft:dirt".equals(str)) {
/* 614 */                       a(j, yr.j());
/*     */                     }
/*     */                   }  }
/*     */               
/*     */ 
/*     */               
/*     */               case 140:
/* 621 */                 for (intListIterator = ((IntList)entry.getValue()).iterator(); intListIterator.hasNext(); ) { int j = ((Integer)intListIterator.next()).intValue();
/* 622 */                   j |= i;
/* 623 */                   Dynamic<?> dynamic = c(j);
/* 624 */                   if (dynamic != null) {
/* 625 */                     String str = dynamic.getString("Item") + dynamic.getInt("Data");
/* 626 */                     a(j, (Dynamic)yr.k().getOrDefault(str, yr.k().get("minecraft:air0")));
/*     */                   }  }
/*     */               
/*     */ 
/*     */               
/*     */               case 144:
/* 632 */                 for (intListIterator = ((IntList)entry.getValue()).iterator(); intListIterator.hasNext(); ) { int j = ((Integer)intListIterator.next()).intValue();
/* 633 */                   j |= i;
/* 634 */                   Dynamic<?> dynamic = b(j);
/* 635 */                   if (dynamic != null) {
/* 636 */                     String str3, str1 = String.valueOf(dynamic.getByte("SkullType"));
/* 637 */                     String str2 = yr.a(a(j), "facing");
/*     */                     
/* 639 */                     if ("up".equals(str2) || "down".equals(str2)) {
/* 640 */                       str3 = str1 + String.valueOf(dynamic.getInt("Rot"));
/*     */                     } else {
/* 642 */                       str3 = str1 + str2;
/*     */                     } 
/*     */                     
/* 645 */                     dynamic.remove("SkullType");
/* 646 */                     dynamic.remove("facing");
/* 647 */                     dynamic.remove("Rot");
/*     */                     
/* 649 */                     a(j, (Dynamic)yr.l().getOrDefault(str3, yr.l().get("0north")));
/*     */                   }  }
/*     */               
/*     */               
/*     */               case 64:
/*     */               case 71:
/*     */               case 193:
/*     */               case 194:
/*     */               case 195:
/*     */               case 196:
/*     */               case 197:
/* 660 */                 for (intListIterator = ((IntList)entry.getValue()).iterator(); intListIterator.hasNext(); ) { int j = ((Integer)intListIterator.next()).intValue();
/* 661 */                   j |= i;
/*     */                   
/* 663 */                   Dynamic<?> dynamic = a(j);
/* 664 */                   if (yr.a(dynamic).endsWith("_door")) {
/* 665 */                     Dynamic<?> dynamic1 = a(j);
/* 666 */                     if ("lower".equals(yr.a(dynamic1, "half"))) {
/* 667 */                       int k = a(j, yr.b.b);
/* 668 */                       Dynamic<?> dynamic2 = a(k);
/* 669 */                       String str = yr.a(dynamic1);
/* 670 */                       if (str.equals(yr.a(dynamic2))) {
/* 671 */                         String str1 = yr.a(dynamic1, "facing");
/* 672 */                         String str2 = yr.a(dynamic1, "open");
/* 673 */                         String str3 = bool ? "left" : yr.a(dynamic2, "hinge");
/* 674 */                         String str4 = bool ? "false" : yr.a(dynamic2, "powered");
/* 675 */                         a(j, (Dynamic)yr.m().get(str + str1 + "lower" + str3 + str2 + str4));
/* 676 */                         a(k, (Dynamic)yr.m().get(str + str1 + "upper" + str3 + str2 + str4));
/*     */                       } 
/*     */                     } 
/*     */                   }  }
/*     */               
/*     */ 
/*     */               
/*     */               case 175:
/* 684 */                 for (intListIterator = ((IntList)entry.getValue()).iterator(); intListIterator.hasNext(); ) { int j = ((Integer)intListIterator.next()).intValue();
/* 685 */                   j |= i;
/*     */                   
/* 687 */                   Dynamic<?> dynamic = a(j);
/* 688 */                   if ("upper".equals(yr.a(dynamic, "half"))) {
/* 689 */                     Dynamic<?> dynamic1 = a(a(j, yr.b.a));
/* 690 */                     String str = yr.a(dynamic1);
/* 691 */                     if ("minecraft:sunflower".equals(str)) {
/* 692 */                       a(j, yr.n()); continue;
/* 693 */                     }  if ("minecraft:lilac".equals(str)) {
/* 694 */                       a(j, yr.o()); continue;
/* 695 */                     }  if ("minecraft:tall_grass".equals(str)) {
/* 696 */                       a(j, yr.p()); continue;
/* 697 */                     }  if ("minecraft:large_fern".equals(str)) {
/* 698 */                       a(j, yr.q()); continue;
/* 699 */                     }  if ("minecraft:rose_bush".equals(str)) {
/* 700 */                       a(j, yr.r()); continue;
/* 701 */                     }  if ("minecraft:peony".equals(str)) {
/* 702 */                       a(j, yr.s());
/*     */                     }
/*     */                   }  }
/*     */               
/*     */             }  }
/*     */         
/*     */         }
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     @Nullable
/*     */     private Dynamic<?> b(int ☃) {
/* 715 */       return (Dynamic)this.f.get(☃);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     private Dynamic<?> c(int ☃) {
/* 720 */       return (Dynamic)this.f.remove(☃); } public static int a(int ☃, yr.b b1) {
/*     */       int i;
/*     */       int j;
/*     */       int k;
/* 724 */       switch (yr.null.a[b1.b().ordinal()]) {
/*     */         case 1:
/* 726 */           i = (☃ & 0xF) + b1.a().a();
/* 727 */           return (i < 0 || i > 15) ? -1 : (☃ & 0xFFFFFFF0 | i);
/*     */         case 2:
/* 729 */           j = (☃ >> 8) + b1.a().a();
/* 730 */           return (j < 0 || j > 255) ? -1 : (☃ & 0xFF | j << 8);
/*     */         case 3:
/* 732 */           k = (☃ >> 4 & 0xF) + b1.a().a();
/* 733 */           return (k < 0 || k > 15) ? -1 : (☃ & 0xFFFFFF0F | k << 4);
/*     */       } 
/* 735 */       return -1;
/*     */     }
/*     */     
/*     */     private void a(int ☃, Dynamic<?> dynamic) {
/* 739 */       if (☃ < 0 || ☃ > 65535) {
/*     */         return;
/*     */       }
/*     */       
/* 743 */       yr.c c1 = d(☃);
/*     */       
/* 745 */       if (c1 == null) {
/*     */         return;
/*     */       }
/*     */       
/* 749 */       c1.a(☃ & 0xFFF, dynamic);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     private yr.c d(int ☃) {
/* 754 */       int i = ☃ >> 12;
/* 755 */       return (i < this.b.length) ? this.b[i] : null;
/*     */     }
/*     */     
/*     */     public Dynamic<?> a(int ☃) {
/* 759 */       if (☃ < 0 || ☃ > 65535) {
/* 760 */         return yr.a();
/*     */       }
/*     */       
/* 763 */       yr.c c1 = d(☃);
/*     */       
/* 765 */       if (c1 == null) {
/* 766 */         return yr.a();
/*     */       }
/*     */       
/* 769 */       return c1.a(☃ & 0xFFF);
/*     */     }
/*     */     
/*     */     public Dynamic<?> a() {
/* 773 */       Dynamic<?> ☃ = this.c;
/* 774 */       if (this.f.isEmpty()) {
/* 775 */         ☃ = ☃.remove("TileEntities");
/*     */       } else {
/* 777 */         ☃ = ☃.set("TileEntities", ☃.createList(this.f.values().stream()));
/*     */       } 
/*     */       
/* 780 */       Dynamic<?> dynamic1 = ☃.emptyMap();
/* 781 */       Dynamic<?> dynamic2 = ☃.emptyList();
/* 782 */       for (yr.c c1 : this.b) {
/* 783 */         if (c1 != null) {
/* 784 */           dynamic2 = dynamic2.merge(c1.a());
/* 785 */           dynamic1 = dynamic1.set(String.valueOf(c1.a), dynamic1.createIntList(Arrays.stream(yr.c.b(c1).toIntArray())));
/*     */         } 
/*     */       } 
/*     */       
/* 789 */       Dynamic<?> dynamic3 = ☃.emptyMap();
/* 790 */       dynamic3 = dynamic3.set("Sides", dynamic3.createByte((byte)this.a));
/* 791 */       dynamic3 = dynamic3.set("Indices", dynamic1);
/* 792 */       return ☃.set("UpgradeData", dynamic3).set("Sections", dynamic2);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   static class a
/*     */   {
/*     */     private final byte[] a;
/*     */ 
/*     */     
/*     */     public a() {
/* 803 */       this.a = new byte[2048];
/*     */     }
/*     */     
/*     */     public a(byte[] ☃) {
/* 807 */       this.a = ☃;
/*     */       
/* 809 */       if (☃.length != 2048) {
/* 810 */         throw new IllegalArgumentException("ChunkNibbleArrays should be 2048 bytes not: " + ☃.length);
/*     */       }
/*     */     }
/*     */     
/*     */     public int a(int ☃, int i, int j) {
/* 815 */       int k = b(i << 8 | j << 4 | ☃);
/*     */       
/* 817 */       if (a(i << 8 | j << 4 | ☃)) {
/* 818 */         return this.a[k] & 0xF;
/*     */       }
/* 820 */       return this.a[k] >> 4 & 0xF;
/*     */     }
/*     */ 
/*     */     
/*     */     private boolean a(int ☃) {
/* 825 */       return ((☃ & 0x1) == 0);
/*     */     }
/*     */     
/*     */     private int b(int ☃) {
/* 829 */       return ☃ >> 1;
/*     */     }
/*     */   }
/*     */   
/*     */   public static int a(boolean ☃, boolean bool1, boolean bool2, boolean bool3) {
/* 834 */     int i = 0;
/* 835 */     if (bool2) {
/* 836 */       if (bool1) {
/* 837 */         i |= 0x2;
/* 838 */       } else if (☃) {
/* 839 */         i |= 0x80;
/*     */       } else {
/* 841 */         i |= 0x1;
/*     */       } 
/* 843 */     } else if (bool3) {
/* 844 */       if (☃) {
/* 845 */         i |= 0x20;
/* 846 */       } else if (bool1) {
/* 847 */         i |= 0x8;
/*     */       } else {
/* 849 */         i |= 0x10;
/*     */       } 
/* 851 */     } else if (bool1) {
/* 852 */       i |= 0x4;
/* 853 */     } else if (☃) {
/* 854 */       i |= 0x40;
/*     */     } 
/* 856 */     return i;
/*     */   }
/*     */   
/*     */   public enum b {
/* 860 */     a((String)b.b, a.b),
/* 861 */     b((String)b.a, a.b),
/* 862 */     c((String)b.b, a.c),
/* 863 */     d((String)b.a, a.c),
/* 864 */     e((String)b.b, a.a),
/* 865 */     f((String)b.a, a.a);
/*     */     
/*     */     private final a g;
/*     */     
/*     */     private final b h;
/*     */     
/*     */     b(b ☃, a a1) {
/* 872 */       this.g = a1;
/* 873 */       this.h = ☃;
/*     */     }
/*     */     
/*     */     public b a() {
/* 877 */       return this.h;
/*     */     }
/*     */     
/*     */     public a b() {
/* 881 */       return this.g;
/*     */     }
/*     */     
/*     */     public enum a {
/* 885 */       a,
/* 886 */       b,
/* 887 */       c;
/*     */     }
/*     */     
/*     */     public enum b {
/* 891 */       a(1),
/* 892 */       b(-1);
/*     */       
/*     */       private final int c;
/*     */ 
/*     */       
/*     */       b(int ☃) {
/* 898 */         this.c = ☃;
/*     */       }
/*     */       
/*     */       public int a() {
/* 902 */         return this.c;
/*     */       }
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\yr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */