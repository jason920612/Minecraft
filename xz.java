/*     */ import com.google.common.collect.ImmutableMap;
/*     */ import com.mojang.datafixers.DSL;
/*     */ import com.mojang.datafixers.DataFixer;
/*     */ import com.mojang.datafixers.DataFixerBuilder;
/*     */ import com.mojang.datafixers.Typed;
/*     */ import com.mojang.datafixers.schemas.Schema;
/*     */ import java.util.Objects;
/*     */ import java.util.concurrent.ForkJoinPool;
/*     */ import java.util.function.BiFunction;
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
/*     */ public class xz
/*     */ {
/* 132 */   private static final BiFunction<Integer, Schema, Schema> a = Schema::new;
/* 133 */   private static final BiFunction<Integer, Schema, Schema> b = abl::new;
/*     */   
/* 135 */   private static final DataFixer c = b();
/*     */   
/*     */   private static DataFixer b() {
/* 138 */     DataFixerBuilder ☃ = new DataFixerBuilder(1631);
/* 139 */     a(☃);
/* 140 */     return ☃.build(ForkJoinPool.commonPool());
/*     */   }
/*     */   
/*     */   public static DataFixer a() {
/* 144 */     return c;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static void a(DataFixerBuilder ☃) {
/* 152 */     Schema schema1 = ☃.addSchema(99, acr::new);
/*     */ 
/*     */     
/* 155 */     Schema schema2 = ☃.addSchema(100, abm::new);
/* 156 */     ☃.addFixer(new za(schema2, true));
/*     */     
/* 158 */     Schema schema3 = ☃.addSchema(101, a);
/* 159 */     ☃.addFixer(new ym(schema3, false));
/*     */     
/* 161 */     Schema schema4 = ☃.addSchema(102, abn::new);
/* 162 */     ☃.addFixer(new zz(schema4, true));
/* 163 */     ☃.addFixer(new aaa(schema4, false));
/*     */     
/* 165 */     Schema schema5 = ☃.addSchema(105, a);
/* 166 */     ☃.addFixer(new aad(schema5, true));
/*     */ 
/*     */     
/* 169 */     Schema schema6 = ☃.addSchema(106, abp::new);
/* 170 */     ☃.addFixer(new aan(schema6, true));
/*     */     
/* 172 */     Schema schema7 = ☃.addSchema(107, abq::new);
/* 173 */     ☃.addFixer(new zg(schema7, true));
/*     */     
/* 175 */     Schema schema8 = ☃.addSchema(108, a);
/* 176 */     ☃.addFixer(new zp(schema8, true));
/*     */     
/* 178 */     Schema schema9 = ☃.addSchema(109, a);
/* 179 */     ☃.addFixer(new zb(schema9, true));
/*     */     
/* 181 */     Schema schema10 = ☃.addSchema(110, a);
/* 182 */     ☃.addFixer(new zc(schema10, true));
/*     */     
/* 184 */     Schema schema11 = ☃.addSchema(111, a);
/* 185 */     ☃.addFixer(new zh(schema11, true));
/*     */     
/* 187 */     Schema schema12 = ☃.addSchema(113, a);
/* 188 */     ☃.addFixer(new zk(schema12, true));
/*     */     
/* 190 */     Schema schema13 = ☃.addSchema(135, abs::new);
/* 191 */     ☃.addFixer(new zm(schema13, true));
/*     */     
/* 193 */     Schema schema14 = ☃.addSchema(143, abt::new);
/* 194 */     ☃.addFixer(new zr(schema14, true));
/*     */     
/* 196 */     Schema schema15 = ☃.addSchema(147, a);
/* 197 */     ☃.addFixer(new yv(schema15, true));
/*     */     
/* 199 */     Schema schema16 = ☃.addSchema(165, a);
/* 200 */     ☃.addFixer(new aaj(schema16, true));
/*     */ 
/*     */     
/* 203 */     Schema schema17 = ☃.addSchema(501, acj::new);
/* 204 */     ☃.addFixer(new ya(schema17, "Add 1.10 entities fix", aax.o));
/*     */     
/* 206 */     Schema schema18 = ☃.addSchema(502, a);
/* 207 */     ☃.addFixer(aab.a(schema18, "cooked_fished item renamer", ☃ -> Objects.equals(abl.a(☃), "minecraft:cooked_fished") ? "minecraft:cooked_fish" : ☃));
/*     */ 
/*     */     
/* 210 */     ☃.addFixer(new zu(schema18, false));
/*     */     
/* 212 */     Schema schema19 = ☃.addSchema(505, a);
/* 213 */     ☃.addFixer(new aar(schema19, false));
/*     */ 
/*     */     
/* 216 */     Schema schema20 = ☃.addSchema(700, ack::new);
/* 217 */     ☃.addFixer(new yz(schema20, true));
/*     */     
/* 219 */     Schema schema21 = ☃.addSchema(701, acl::new);
/* 220 */     ☃.addFixer(new zo(schema21, true));
/*     */     
/* 222 */     Schema schema22 = ☃.addSchema(702, acm::new);
/* 223 */     ☃.addFixer(new zt(schema22, true));
/*     */     
/* 225 */     Schema schema23 = ☃.addSchema(703, acn::new);
/* 226 */     ☃.addFixer(new zd(schema23, true));
/*     */ 
/*     */     
/* 229 */     Schema schema24 = ☃.addSchema(704, aco::new);
/* 230 */     ☃.addFixer(new yi(schema24, true));
/*     */     
/* 232 */     Schema schema25 = ☃.addSchema(705, acp::new);
/* 233 */     ☃.addFixer(new ze(schema25, true));
/*     */     
/* 235 */     Schema schema26 = ☃.addSchema(804, b);
/* 236 */     ☃.addFixer(new zx(schema26, true));
/*     */     
/* 238 */     Schema schema27 = ☃.addSchema(806, b);
/* 239 */     ☃.addFixer(new aai(schema27, false));
/*     */ 
/*     */     
/* 242 */     Schema schema28 = ☃.addSchema(808, acq::new);
/* 243 */     ☃.addFixer(new ya(schema28, "added shulker box", aax.j));
/*     */     
/* 245 */     Schema schema29 = ☃.addSchema(808, 1, b);
/* 246 */     ☃.addFixer(new zn(schema29, false));
/*     */     
/* 248 */     Schema schema30 = ☃.addSchema(813, b);
/* 249 */     ☃.addFixer(new aac(schema30, false));
/* 250 */     ☃.addFixer(new yl(schema30, false));
/*     */     
/* 252 */     Schema schema31 = ☃.addSchema(816, b);
/* 253 */     ☃.addFixer(new aau(schema31, false));
/*     */ 
/*     */     
/* 256 */     Schema schema32 = ☃.addSchema(820, b);
/* 257 */     ☃.addFixer(aab.a(schema32, "totem item renamer", ☃ -> Objects.equals(☃, "minecraft:totem") ? "minecraft:totem_of_undying" : ☃));
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 262 */     Schema schema33 = ☃.addSchema(1022, abo::new);
/* 263 */     ☃.addFixer(new abi(schema33, "added shoulder entities to players", aax.b));
/*     */     
/* 265 */     Schema schema34 = ☃.addSchema(1125, abr::new);
/* 266 */     ☃.addFixer(new yc(schema34, true));
/* 267 */     ☃.addFixer(new yd(schema34, false));
/*     */ 
/*     */     
/* 270 */     Schema schema35 = ☃.addSchema(1344, b);
/* 271 */     ☃.addFixer(new aas(schema35, false));
/*     */     
/* 273 */     Schema schema36 = ☃.addSchema(1446, b);
/* 274 */     ☃.addFixer(new aat(schema36, false));
/*     */     
/* 276 */     Schema schema37 = ☃.addSchema(1450, b);
/* 277 */     ☃.addFixer(new yq(schema37, false));
/*     */     
/* 279 */     Schema schema38 = ☃.addSchema(1451, abu::new);
/* 280 */     ☃.addFixer(new ya(schema38, "AddTrappedChestFix", aax.j));
/*     */     
/* 282 */     Schema schema39 = ☃.addSchema(1451, 1, abv::new);
/* 283 */     ☃.addFixer(new yr(schema39, true));
/*     */ 
/*     */     
/* 286 */     Schema schema40 = ☃.addSchema(1451, 2, abw::new);
/* 287 */     ☃.addFixer(new yg(schema40, true));
/*     */     
/* 289 */     Schema schema41 = ☃.addSchema(1451, 3, abx::new);
/* 290 */     ☃.addFixer(new yw(schema41, true));
/* 291 */     ☃.addFixer(new aaf(schema41, false));
/*     */     
/* 293 */     Schema schema42 = ☃.addSchema(1451, 4, aby::new);
/* 294 */     ☃.addFixer(new yn(schema42, true));
/* 295 */     ☃.addFixer(new aah(schema42, false));
/*     */ 
/*     */     
/* 298 */     Schema schema43 = ☃.addSchema(1451, 5, abz::new);
/* 299 */     ☃.addFixer(new ya(schema43, "RemoveNoteBlockFlowerPotFix", aax.j));
/* 300 */     ☃.addFixer(new aag(schema43, false));
/* 301 */     ☃.addFixer(new zs(schema43, false));
/* 302 */     ☃.addFixer(new yf(schema43, false));
/* 303 */     ☃.addFixer(new aam(schema43, false));
/*     */     
/* 305 */     Schema schema44 = ☃.addSchema(1451, 6, aca::new);
/* 306 */     ☃.addFixer(new abd(schema44, true));
/* 307 */     ☃.addFixer(new yj(schema44, false));
/*     */     
/* 309 */     Schema schema45 = ☃.addSchema(1451, 7, acb::new);
/* 310 */     ☃.addFixer(new aba(schema45, true));
/*     */     
/* 312 */     Schema schema46 = ☃.addSchema(1451, 7, b);
/* 313 */     ☃.addFixer(new abh(schema46, false));
/*     */     
/* 315 */     Schema schema47 = ☃.addSchema(1456, b);
/* 316 */     ☃.addFixer(new zf(schema47, false));
/*     */     
/* 318 */     Schema schema48 = ☃.addSchema(1458, b);
/* 319 */     ☃.addFixer(new yy(schema48, false));
/* 320 */     ☃.addFixer(new zy(schema48, false));
/* 321 */     ☃.addFixer(new yh(schema48, false));
/*     */     
/* 323 */     Schema schema49 = ☃.addSchema(1460, acc::new);
/* 324 */     ☃.addFixer(new zi(schema49, false));
/*     */     
/* 326 */     Schema schema50 = ☃.addSchema(1466, acd::new);
/* 327 */     ☃.addFixer(new yt(schema50, true));
/*     */ 
/*     */     
/* 330 */     Schema schema51 = ☃.addSchema(1470, ace::new);
/* 331 */     ☃.addFixer(new ya(schema51, "Add 1.13 entities fix", aax.o));
/*     */     
/* 333 */     Schema schema52 = ☃.addSchema(1474, b);
/* 334 */     ☃.addFixer(new yu(schema52, false));
/* 335 */     ☃.addFixer(yo.a(schema52, "Colorless shulker block fixer", ☃ -> Objects.equals(abl.a(☃), "minecraft:purple_shulker_box") ? "minecraft:shulker_box" : ☃));
/* 336 */     ☃.addFixer(aab.a(schema52, "Colorless shulker item fixer", ☃ -> Objects.equals(abl.a(☃), "minecraft:purple_shulker_box") ? "minecraft:shulker_box" : ☃));
/*     */     
/* 338 */     Schema schema53 = ☃.addSchema(1475, b);
/* 339 */     ☃.addFixer(yo.a(schema53, "Flowing fixer", ☃ -> (String)ImmutableMap.of("minecraft:flowing_water", "minecraft:water", "minecraft:flowing_lava", "minecraft:lava").getOrDefault(☃, ☃)));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 346 */     Schema schema54 = ☃.addSchema(1480, b);
/* 347 */     ☃.addFixer(yo.a(schema54, "Rename coral blocks", ☃ -> (String)aaz.a.getOrDefault(☃, ☃)));
/* 348 */     ☃.addFixer(aab.a(schema54, "Rename coral items", ☃ -> (String)aaz.a.getOrDefault(☃, ☃)));
/*     */     
/* 350 */     Schema schema55 = ☃.addSchema(1481, acf::new);
/* 351 */     ☃.addFixer(new ya(schema55, "Add conduit", aax.j));
/*     */     
/* 353 */     Schema schema56 = ☃.addSchema(1483, acg::new);
/* 354 */     ☃.addFixer(new zj(schema56, true));
/* 355 */     ☃.addFixer(aab.a(schema56, "Rename pufferfish egg item", ☃ -> (String)zj.a.getOrDefault(☃, ☃)));
/*     */     
/* 357 */     Schema schema57 = ☃.addSchema(1484, b);
/* 358 */     ☃.addFixer(aab.a(schema57, "Rename seagrass items", ☃ -> (String)ImmutableMap.of("minecraft:sea_grass", "minecraft:seagrass", "minecraft:tall_sea_grass", "minecraft:tall_seagrass").getOrDefault(☃, ☃)));
/*     */ 
/*     */ 
/*     */     
/* 362 */     ☃.addFixer(yo.a(schema57, "Rename seagrass blocks", ☃ -> (String)ImmutableMap.of("minecraft:sea_grass", "minecraft:seagrass", "minecraft:tall_sea_grass", "minecraft:tall_seagrass").getOrDefault(☃, ☃)));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 368 */     ☃.addFixer(new zv(schema57, false));
/*     */ 
/*     */     
/* 371 */     Schema schema58 = ☃.addSchema(1486, ach::new);
/* 372 */     ☃.addFixer(new yx(schema58, true));
/* 373 */     ☃.addFixer(aab.a(schema58, "Rename cod/salmon egg items", ☃ -> (String)yx.b.getOrDefault(☃, ☃)));
/*     */     
/* 375 */     Schema schema59 = ☃.addSchema(1487, b);
/* 376 */     ☃.addFixer(aab.a(schema59, "Rename prismarine_brick(s)_* blocks", ☃ -> (String)ImmutableMap.of("minecraft:prismarine_bricks_slab", "minecraft:prismarine_brick_slab", "minecraft:prismarine_bricks_stairs", "minecraft:prismarine_brick_stairs").getOrDefault(☃, ☃)));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 382 */     ☃.addFixer(yo.a(schema59, "Rename prismarine_brick(s)_* items", ☃ -> (String)ImmutableMap.of("minecraft:prismarine_bricks_slab", "minecraft:prismarine_brick_slab", "minecraft:prismarine_bricks_stairs", "minecraft:prismarine_brick_stairs").getOrDefault(☃, ☃)));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 389 */     Schema schema60 = ☃.addSchema(1488, b);
/* 390 */     ☃.addFixer(yo.a(schema60, "Rename kelp/kelptop", ☃ -> (String)ImmutableMap.of("minecraft:kelp_top", "minecraft:kelp", "minecraft:kelp", "minecraft:kelp_plant").getOrDefault(☃, ☃)));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 396 */     ☃.addFixer(aab.a(schema60, "Rename kelptop", ☃ -> Objects.equals(☃, "minecraft:kelp_top") ? "minecraft:kelp" : ☃));
/*     */ 
/*     */     
/* 399 */     ☃.addFixer(new aao(schema60, false, "Command block block entity custom name fix", aax.j, "minecraft:command_block")
/*     */         {
/*     */           protected Typed<?> a(Typed<?> ☃) {
/* 402 */             return ☃.update(DSL.remainderFinder(), yy::a);
/*     */           }
/*     */         });
/* 405 */     ☃.addFixer(new aao(schema60, false, "Command block minecart custom name fix", aax.o, "minecraft:commandblock_minecart")
/*     */         {
/*     */           protected Typed<?> a(Typed<?> ☃) {
/* 408 */             return ☃.update(DSL.remainderFinder(), yy::a);
/*     */           }
/*     */         });
/* 411 */     ☃.addFixer(new zw(schema60, false));
/*     */     
/* 413 */     Schema schema61 = ☃.addSchema(1490, b);
/* 414 */     ☃.addFixer(yo.a(schema61, "Rename melon_block", ☃ -> Objects.equals(☃, "minecraft:melon_block") ? "minecraft:melon" : ☃));
/*     */ 
/*     */     
/* 417 */     ☃.addFixer(aab.a(schema61, "Rename melon_block/melon/speckled_melon", ☃ -> (String)ImmutableMap.of("minecraft:melon_block", "minecraft:melon", "minecraft:melon", "minecraft:melon_slice", "minecraft:speckled_melon", "minecraft:glistering_melon_slice").getOrDefault(☃, ☃)));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 425 */     Schema schema62 = ☃.addSchema(1492, b);
/* 426 */     ☃.addFixer(new ys(schema62, false));
/*     */     
/* 428 */     Schema schema63 = ☃.addSchema(1494, b);
/* 429 */     ☃.addFixer(new aae(schema63, false));
/*     */     
/* 431 */     Schema schema64 = ☃.addSchema(1496, b);
/* 432 */     ☃.addFixer(new aak(schema64, false));
/*     */     
/* 434 */     Schema schema65 = ☃.addSchema(1500, b);
/* 435 */     ☃.addFixer(new yk(schema65, false));
/*     */     
/* 437 */     Schema schema66 = ☃.addSchema(1501, b);
/* 438 */     ☃.addFixer(new yb(schema66, false));
/*     */     
/* 440 */     Schema schema67 = ☃.addSchema(1502, b);
/* 441 */     ☃.addFixer(new aav(schema67, false));
/*     */     
/* 443 */     Schema schema68 = ☃.addSchema(1506, b);
/* 444 */     ☃.addFixer(new aal(schema68, false));
/*     */     
/* 446 */     Schema schema69 = ☃.addSchema(1508, b);
/* 447 */     ☃.addFixer(new ye(schema69, false));
/*     */     
/* 449 */     Schema schema70 = ☃.addSchema(1510, aci::new);
/* 450 */     ☃.addFixer(yo.a(schema70, "Block renamening fix", ☃ -> (String)zq.b.getOrDefault(☃, ☃)));
/* 451 */     ☃.addFixer(aab.a(schema70, "Item renamening fix", ☃ -> (String)zq.c.getOrDefault(☃, ☃)));
/* 452 */     ☃.addFixer(new aaw(schema70, false));
/* 453 */     ☃.addFixer(new zq(schema70, true));
/* 454 */     ☃.addFixer(new abe(schema70, false));
/*     */     
/* 456 */     Schema schema71 = ☃.addSchema(1514, b);
/* 457 */     ☃.addFixer(new aap(schema71, false));
/* 458 */     ☃.addFixer(new abf(schema71, false));
/* 459 */     ☃.addFixer(new aaq(schema71, false));
/*     */     
/* 461 */     Schema schema72 = ☃.addSchema(1515, b);
/* 462 */     ☃.addFixer(yo.a(schema72, "Rename coral fan blocks", ☃ -> (String)aay.a.getOrDefault(☃, ☃)));
/*     */     
/* 464 */     Schema schema73 = ☃.addSchema(1624, b);
/* 465 */     ☃.addFixer(new abg(schema73, false));
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\xz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */