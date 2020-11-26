/*     */ import com.mojang.datafixers.DSL;
/*     */ import com.mojang.datafixers.DataFix;
/*     */ import com.mojang.datafixers.DataFixUtils;
/*     */ import com.mojang.datafixers.Dynamic;
/*     */ import com.mojang.datafixers.OpticFinder;
/*     */ import com.mojang.datafixers.TypeRewriteRule;
/*     */ import com.mojang.datafixers.Typed;
/*     */ import com.mojang.datafixers.schemas.Schema;
/*     */ import com.mojang.datafixers.types.Type;
/*     */ import com.mojang.datafixers.util.Pair;
/*     */ import java.util.Objects;
/*     */ import java.util.Optional;
/*     */ 
/*     */ public class aad
/*     */   extends DataFix {
/*     */   private static final String[] a;
/*     */   
/*     */   public aad(Schema ☃, boolean bool) {
/*  19 */     super(☃, bool);
/*     */   }
/*     */   static {
/*  22 */     a = (String[])DataFixUtils.make(new String[256], ☃ -> {
/*     */           ☃[1] = "Item";
/*     */           ☃[2] = "XPOrb";
/*     */           ☃[7] = "ThrownEgg";
/*     */           ☃[8] = "LeashKnot";
/*     */           ☃[9] = "Painting";
/*     */           ☃[10] = "Arrow";
/*     */           ☃[11] = "Snowball";
/*     */           ☃[12] = "Fireball";
/*     */           ☃[13] = "SmallFireball";
/*     */           ☃[14] = "ThrownEnderpearl";
/*     */           ☃[15] = "EyeOfEnderSignal";
/*     */           ☃[16] = "ThrownPotion";
/*     */           ☃[17] = "ThrownExpBottle";
/*     */           ☃[18] = "ItemFrame";
/*     */           ☃[19] = "WitherSkull";
/*     */           ☃[20] = "PrimedTnt";
/*     */           ☃[21] = "FallingSand";
/*     */           ☃[22] = "FireworksRocketEntity";
/*     */           ☃[23] = "TippedArrow";
/*     */           ☃[24] = "SpectralArrow";
/*     */           ☃[25] = "ShulkerBullet";
/*     */           ☃[26] = "DragonFireball";
/*     */           ☃[30] = "ArmorStand";
/*     */           ☃[41] = "Boat";
/*     */           ☃[42] = "MinecartRideable";
/*     */           ☃[43] = "MinecartChest";
/*     */           ☃[44] = "MinecartFurnace";
/*     */           ☃[45] = "MinecartTNT";
/*     */           ☃[46] = "MinecartHopper";
/*     */           ☃[47] = "MinecartSpawner";
/*     */           ☃[40] = "MinecartCommandBlock";
/*     */           ☃[48] = "Mob";
/*     */           ☃[49] = "Monster";
/*     */           ☃[50] = "Creeper";
/*     */           ☃[51] = "Skeleton";
/*     */           ☃[52] = "Spider";
/*     */           ☃[53] = "Giant";
/*     */           ☃[54] = "Zombie";
/*     */           ☃[55] = "Slime";
/*     */           ☃[56] = "Ghast";
/*     */           ☃[57] = "PigZombie";
/*     */           ☃[58] = "Enderman";
/*     */           ☃[59] = "CaveSpider";
/*     */           ☃[60] = "Silverfish";
/*     */           ☃[61] = "Blaze";
/*     */           ☃[62] = "LavaSlime";
/*     */           ☃[63] = "EnderDragon";
/*     */           ☃[64] = "WitherBoss";
/*     */           ☃[65] = "Bat";
/*     */           ☃[66] = "Witch";
/*     */           ☃[67] = "Endermite";
/*     */           ☃[68] = "Guardian";
/*     */           ☃[69] = "Shulker";
/*     */           ☃[90] = "Pig";
/*     */           ☃[91] = "Sheep";
/*     */           ☃[92] = "Cow";
/*     */           ☃[93] = "Chicken";
/*     */           ☃[94] = "Squid";
/*     */           ☃[95] = "Wolf";
/*     */           ☃[96] = "MushroomCow";
/*     */           ☃[97] = "SnowMan";
/*     */           ☃[98] = "Ozelot";
/*     */           ☃[99] = "VillagerGolem";
/*     */           ☃[100] = "EntityHorse";
/*     */           ☃[101] = "Rabbit";
/*     */           ☃[120] = "Villager";
/*     */           ☃[200] = "EnderCrystal";
/*     */         });
/*     */   }
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
/*     */   public TypeRewriteRule makeRule() {
/* 105 */     Schema ☃ = getInputSchema();
/* 106 */     Type<?> type = ☃.getType(aax.k);
/*     */     
/* 108 */     OpticFinder<Pair<String, String>> opticFinder = DSL.fieldFinder("id", DSL.named(aax.q.typeName(), DSL.namespacedString()));
/* 109 */     OpticFinder<String> opticFinder1 = DSL.fieldFinder("id", DSL.string());
/* 110 */     OpticFinder<?> opticFinder2 = type.findField("tag");
/* 111 */     OpticFinder<?> opticFinder3 = opticFinder2.type().findField("EntityTag");
/* 112 */     OpticFinder<?> opticFinder4 = DSL.typeFinder(☃.getTypeRaw(aax.o));
/*     */     
/* 114 */     return fixTypeEverywhereTyped("ItemSpawnEggFix", type, typed -> {
/*     */           Optional<Pair<String, String>> optional = typed.getOptional(☃);
/*     */           if (optional.isPresent() && Objects.equals(((Pair)optional.get()).getSecond(), "minecraft:spawn_egg")) {
/*     */             Dynamic<?> dynamic = (Dynamic)typed.get(DSL.remainderFinder());
/*     */             short s = dynamic.getShort("Damage");
/*     */             Optional<? extends Typed<?>> optional1 = typed.getOptionalTyped(opticFinder1);
/*     */             Optional<? extends Typed<?>> optional2 = optional1.flatMap(());
/*     */             Optional<? extends Typed<?>> optional3 = optional2.flatMap(());
/*     */             Optional<String> optional4 = optional3.flatMap(());
/*     */             Typed<?> typed1 = typed;
/*     */             String str = a[s & 0xFF];
/*     */             if (str != null && (!optional4.isPresent() || !Objects.equals(optional4.get(), str))) {
/*     */               Typed<?> typed2 = typed.getOrCreateTyped(opticFinder1);
/*     */               Typed<?> typed3 = typed2.getOrCreateTyped(opticFinder2);
/*     */               Typed<?> typed4 = typed3.getOrCreateTyped(opticFinder3);
/*     */               Dynamic<?> dynamic1 = typed4.write().set("id", dynamic.createString(str));
/*     */               Typed<?> typed5 = (Typed)((Optional)getOutputSchema().getTypeRaw(aax.o).readTyped(dynamic1).getSecond()).orElseThrow(());
/*     */               typed1 = typed1.set(opticFinder1, typed2.set(opticFinder2, typed3.set(opticFinder3, typed5)));
/*     */             } 
/*     */             if (s != 0) {
/*     */               dynamic = dynamic.set("Damage", dynamic.createShort((short)0));
/*     */               typed1 = typed1.set(DSL.remainderFinder(), dynamic);
/*     */             } 
/*     */             return typed1;
/*     */           } 
/*     */           return typed;
/*     */         });
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\aad.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */