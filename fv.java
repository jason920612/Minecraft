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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class fv
/*     */   implements Consumer<Consumer<l>>
/*     */ {
/*     */   public void a(Consumer<l> ☃) {
/*  41 */     l l1 = l.a.a().a(bct.im, new ir("advancements.nether.root.title", new Object[0]), new ir("advancements.nether.root.description", new Object[0]), new pc("minecraft:textures/gui/advancements/backgrounds/nether.png"), v.a, false, false, false).a("entered_nether", ab.b.a(bod.b)).a(☃, "nether/root");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  48 */     l l2 = l.a.a().a(l1).a(atf.dx, new ir("advancements.nether.return_to_sender.title", new Object[0]), new ir("advancements.nether.return_to_sender.description", new Object[0]), null, v.b, true, true, false).a(o.a.a(50)).a("killed_ghast", aw.b.a(ao.a.a().a(aev.A), ah.a.a().a(Boolean.valueOf(true)).a(ao.a.a().a(aev.I)))).a(☃, "nether/return_to_sender");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  54 */     l l3 = l.a.a().a(l1).a(bct.dX, new ir("advancements.nether.find_fortress.title", new Object[0]), new ir("advancements.nether.find_fortress.description", new Object[0]), null, v.a, true, true, false).a("fortress", az.b.a(ay.a("Fortress"))).a(☃, "nether/find_fortress");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  61 */     l l4 = l.a.a().a(l1).a(atf.dG, new ir("advancements.nether.fast_travel.title", new Object[0]), new ir("advancements.nether.fast_travel.description", new Object[0]), null, v.b, true, true, false).a(o.a.a(100)).a("travelled", bd.b.a(ai.a(ba.c.b(7000.0F)))).a(☃, "nether/fast_travel");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  68 */     l l5 = l.a.a().a(l2).a(atf.ck, new ir("advancements.nether.uneasy_alliance.title", new Object[0]), new ir("advancements.nether.uneasy_alliance.description", new Object[0]), null, v.b, true, true, false).a(o.a.a(100)).a("killed_ghast", aw.b.a(ao.a.a().a(aev.A).a(ay.a(bod.a)))).a(☃, "nether/uneasy_alliance");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  74 */     l l6 = l.a.a().a(l3).a(bct.fe, new ir("advancements.nether.get_wither_skull.title", new Object[0]), new ir("advancements.nether.get_wither_skull.description", new Object[0]), null, v.a, true, true, false).a("wither_skull", at.b.a(new axx[] { bct.fe })).a(☃, "nether/get_wither_skull");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  80 */     l l7 = l.a.a().a(l6).a(atf.dP, new ir("advancements.nether.summon_wither.title", new Object[0]), new ir("advancements.nether.summon_wither.description", new Object[0]), null, v.a, true, true, false).a("summoned", bh.b.a(ao.a.a().a(aev.aF))).a(☃, "nether/summon_wither");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  86 */     l l8 = l.a.a().a(l3).a(atf.cj, new ir("advancements.nether.obtain_blaze_rod.title", new Object[0]), new ir("advancements.nether.obtain_blaze_rod.description", new Object[0]), null, v.a, true, true, false).a("blaze_rod", at.b.a(new axx[] { atf.cj })).a(☃, "nether/obtain_blaze_rod");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  92 */     l l9 = l.a.a().a(l7).a(bct.eu, new ir("advancements.nether.create_beacon.title", new Object[0]), new ir("advancements.nether.create_beacon.description", new Object[0]), null, v.a, true, true, false).a("beacon", ad.b.a(ba.d.b(1))).a(☃, "nether/create_beacon");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  98 */     l l10 = l.a.a().a(l9).a(bct.eu, new ir("advancements.nether.create_full_beacon.title", new Object[0]), new ir("advancements.nether.create_full_beacon.description", new Object[0]), null, v.c, true, true, false).a("beacon", ad.b.a(ba.d.a(4))).a(☃, "nether/create_full_beacon");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 104 */     l l11 = l.a.a().a(l8).a(atf.cn, new ir("advancements.nether.brew_potion.title", new Object[0]), new ir("advancements.nether.brew_potion.description", new Object[0]), null, v.a, true, true, false).a("potion", aa.b.c()).a(☃, "nether/brew_potion");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 111 */     l l12 = l.a.a().a(l11).a(atf.aK, new ir("advancements.nether.all_potions.title", new Object[0]), new ir("advancements.nether.all_potions.description", new Object[0]), null, v.b, true, true, false).a(o.a.a(100)).a("all_effects", aj.b.a(bb.a().a(aem.a).a(aem.b).a(aem.e).a(aem.h).a(aem.j).a(aem.l).a(aem.m).a(aem.n).a(aem.p).a(aem.r).a(aem.s).a(aem.B).a(aem.k))).a(☃, "nether/all_potions");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 118 */     l l13 = l.a.a().a(l12).a(atf.aw, new ir("advancements.nether.all_effects.title", new Object[0]), new ir("advancements.nether.all_effects.description", new Object[0]), null, v.b, true, true, true).a(o.a.a(1000)).a("all_effects", aj.b.a(bb.a().a(aem.a).a(aem.b).a(aem.e).a(aem.h).a(aem.j).a(aem.l).a(aem.m).a(aem.n).a(aem.p).a(aem.r).a(aem.s).a(aem.t).a(aem.c).a(aem.d).a(aem.y).a(aem.x).a(aem.v).a(aem.q).a(aem.i).a(aem.k).a(aem.B).a(aem.C).a(aem.D))).a(☃, "nether/all_effects");
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\fv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */