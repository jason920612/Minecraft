/*     */ import java.util.function.Consumer;
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
/*     */ public class fw
/*     */   implements Consumer<Consumer<l>>
/*     */ {
/*     */   public void a(Consumer<l> ☃) {
/*  32 */     l l1 = l.a.a().a(bct.i, new ir("advancements.story.root.title", new Object[0]), new ir("advancements.story.root.description", new Object[0]), new pc("minecraft:textures/gui/advancements/backgrounds/stone.png"), v.a, false, false, false).a("crafting_table", at.b.a(new axx[] { bct.co })).a(☃, "story/root");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  38 */     l l2 = l.a.a().a(l1).a(atf.s, new ir("advancements.story.mine_stone.title", new Object[0]), new ir("advancements.story.mine_stone.description", new Object[0]), null, v.a, true, true, false).a("get_stone", at.b.a(new axx[] { bct.m })).a(☃, "story/mine_stone");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  44 */     l l3 = l.a.a().a(l2).a(atf.w, new ir("advancements.story.upgrade_tools.title", new Object[0]), new ir("advancements.story.upgrade_tools.description", new Object[0]), null, v.a, true, true, false).a("stone_pickaxe", at.b.a(new axx[] { atf.w })).a(☃, "story/upgrade_tools");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  50 */     l l4 = l.a.a().a(l3).a(atf.n, new ir("advancements.story.smelt_iron.title", new Object[0]), new ir("advancements.story.smelt_iron.description", new Object[0]), null, v.a, true, true, false).a("iron", at.b.a(new axx[] { atf.n })).a(☃, "story/smelt_iron");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  56 */     l l5 = l.a.a().a(l4).a(atf.c, new ir("advancements.story.iron_tools.title", new Object[0]), new ir("advancements.story.iron_tools.description", new Object[0]), null, v.a, true, true, false).a("iron_pickaxe", at.b.a(new axx[] { atf.c })).a(☃, "story/iron_tools");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  62 */     l l6 = l.a.a().a(l5).a(atf.m, new ir("advancements.story.mine_diamond.title", new Object[0]), new ir("advancements.story.mine_diamond.description", new Object[0]), null, v.a, true, true, false).a("diamond", at.b.a(new axx[] { atf.m })).a(☃, "story/mine_diamond");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  68 */     l l7 = l.a.a().a(l4).a(atf.ay, new ir("advancements.story.lava_bucket.title", new Object[0]), new ir("advancements.story.lava_bucket.description", new Object[0]), null, v.a, true, true, false).a("lava_bucket", at.b.a(new axx[] { atf.ay })).a(☃, "story/lava_bucket");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  78 */     l l8 = l.a.a().a(l4).a(atf.ad, new ir("advancements.story.obtain_armor.title", new Object[0]), new ir("advancements.story.obtain_armor.description", new Object[0]), null, v.a, true, true, false).a(w.OR).a("iron_helmet", at.b.a(new axx[] { atf.ac })).a("iron_chestplate", at.b.a(new axx[] { atf.ad })).a("iron_leggings", at.b.a(new axx[] { atf.ae })).a("iron_boots", at.b.a(new axx[] { atf.af })).a(☃, "story/obtain_armor");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  84 */     l l9 = l.a.a().a(l6).a(atf.dT, new ir("advancements.story.enchant_item.title", new Object[0]), new ir("advancements.story.enchant_item.description", new Object[0]), null, v.a, true, true, false).a("enchanted_item", ak.b.c()).a(☃, "story/enchant_item");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  90 */     l l10 = l.a.a().a(l7).a(bct.ce, new ir("advancements.story.form_obsidian.title", new Object[0]), new ir("advancements.story.form_obsidian.description", new Object[0]), null, v.a, true, true, false).a("obsidian", at.b.a(new axx[] { bct.ce })).a(☃, "story/form_obsidian");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  96 */     l l11 = l.a.a().a(l8).a(atf.eK, new ir("advancements.story.deflect_arrow.title", new Object[0]), new ir("advancements.story.deflect_arrow.description", new Object[0]), null, v.a, true, true, false).a("deflected_projectile", an.b.a(ag.a.a().a(ah.a.a().a(Boolean.valueOf(true))).a(Boolean.valueOf(true)))).a(☃, "story/deflect_arrow");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 106 */     l l12 = l.a.a().a(l6).a(atf.ah, new ir("advancements.story.shiny_gear.title", new Object[0]), new ir("advancements.story.shiny_gear.description", new Object[0]), null, v.a, true, true, false).a(w.OR).a("diamond_helmet", at.b.a(new axx[] { atf.ag })).a("diamond_chestplate", at.b.a(new axx[] { atf.ah })).a("diamond_leggings", at.b.a(new axx[] { atf.ai })).a("diamond_boots", at.b.a(new axx[] { atf.aj })).a(☃, "story/shiny_gear");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 112 */     l l13 = l.a.a().a(l10).a(atf.e, new ir("advancements.story.enter_the_nether.title", new Object[0]), new ir("advancements.story.enter_the_nether.description", new Object[0]), null, v.a, true, true, false).a("entered_nether", ab.b.a(bod.b)).a(☃, "story/enter_the_nether");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 118 */     l l14 = l.a.a().a(l13).a(atf.at, new ir("advancements.story.cure_zombie_villager.title", new Object[0]), new ir("advancements.story.cure_zombie_villager.description", new Object[0]), null, v.c, true, true, false).a("cured_zombie", af.b.c()).a(☃, "story/cure_zombie_villager");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 124 */     l l15 = l.a.a().a(l13).a(atf.cw, new ir("advancements.story.follow_ender_eye.title", new Object[0]), new ir("advancements.story.follow_ender_eye.description", new Object[0]), null, v.a, true, true, false).a("in_stronghold", az.b.a(ay.a("Stronghold"))).a(☃, "story/follow_ender_eye");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 130 */     l l16 = l.a.a().a(l15).a(bct.eg, new ir("advancements.story.enter_the_end.title", new Object[0]), new ir("advancements.story.enter_the_end.description", new Object[0]), null, v.a, true, true, false).a("entered_end", ab.b.a(bod.c)).a(☃, "story/enter_the_end");
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\fw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */