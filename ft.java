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
/*     */ public class ft
/*     */   implements Consumer<Consumer<l>>
/*     */ {
/*  36 */   private static final ayu[] a = new ayu[] { ayz.D, ayz.i, ayz.h, ayz.d, ayz.t, ayz.I, ayz.F, ayz.M, ayz.f, ayz.A, ayz.n, ayz.u, ayz.o, ayz.N, ayz.K, ayz.c, ayz.m, ayz.H, ayz.B, ayz.x, ayz.y, ayz.q, ayz.e, ayz.s, ayz.w, ayz.r, ayz.L, ayz.G, ayz.O, ayz.E, ayz.g, ayz.C, ayz.p, ayz.J, ayz.T, ayz.U, ayz.V, ayz.X, ayz.Y, ayz.Z };
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
/*  79 */   private static final aev<?>[] b = new aev[] { aev.g, aev.ar, aev.ab, aev.s, aev.ac, aev.e, aev.k, aev.v, aev.A, aev.C, aev.E, aev.M, aev.ah, aev.aj, aev.ak, aev.am, aev.at, aev.aD, aev.aE, aev.aG, aev.aJ, aev.aL, aev.aM, aev.o };
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
/*     */   public void a(Consumer<l> ☃) {
/* 113 */     l l1 = l.a.a().a(atf.dG, new ir("advancements.adventure.root.title", new Object[0]), new ir("advancements.adventure.root.description", new Object[0]), new pc("minecraft:textures/gui/advancements/backgrounds/adventure.png"), v.a, false, false, false).a(w.OR).a("killed_something", aw.b.c()).a("killed_by_something", aw.b.d()).a(☃, "adventure/root");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 119 */     l l2 = l.a.a().a(l1).a(bct.aL, new ir("advancements.adventure.sleep_in_bed.title", new Object[0]), new ir("advancements.adventure.sleep_in_bed.description", new Object[0]), null, v.a, true, true, false).a("slept_in_bed", az.b.c()).a(☃, "adventure/sleep_in_bed");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 125 */     l l3 = b(l.a.a()).a(l2).a(atf.aj, new ir("advancements.adventure.adventuring_time.title", new Object[0]), new ir("advancements.adventure.adventuring_time.description", new Object[0]), null, v.b, true, true, false).a(o.a.a(500)).a(☃, "adventure/adventuring_time");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 131 */     l l4 = l.a.a().a(l1).a(atf.dA, new ir("advancements.adventure.trade.title", new Object[0]), new ir("advancements.adventure.trade.description", new Object[0]), null, v.a, true, true, false).a("traded", bk.b.c()).a(☃, "adventure/trade");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 137 */     l l5 = a(l.a.a()).a(l1).a(atf.p, new ir("advancements.adventure.kill_a_mob.title", new Object[0]), new ir("advancements.adventure.kill_a_mob.description", new Object[0]), null, v.a, true, true, false).a(w.OR).a(☃, "adventure/kill_a_mob");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 143 */     l l6 = a(l.a.a()).a(l5).a(atf.y, new ir("advancements.adventure.kill_all_mobs.title", new Object[0]), new ir("advancements.adventure.kill_all_mobs.description", new Object[0]), null, v.b, true, true, false).a(o.a.a(100)).a(☃, "adventure/kill_all_mobs");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 149 */     l l7 = l.a.a().a(l5).a(atf.g, new ir("advancements.adventure.shoot_arrow.title", new Object[0]), new ir("advancements.adventure.shoot_arrow.description", new Object[0]), null, v.a, true, true, false).a("shot_arrow", bf.b.a(ag.a.a().a(ah.a.a().a(Boolean.valueOf(true)).a(ao.a.a().a(aev.c))))).a(☃, "adventure/shoot_arrow");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 155 */     l l8 = l.a.a().a(l5).a(atf.eX, new ir("advancements.adventure.throw_trident.title", new Object[0]), new ir("advancements.adventure.throw_trident.description", new Object[0]), null, v.a, true, true, false).a("shot_trident", bf.b.a(ag.a.a().a(ah.a.a().a(Boolean.valueOf(true)).a(ao.a.a().a(aev.aQ))))).a(☃, "adventure/throw_trident");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 161 */     l l9 = l.a.a().a(l8).a(atf.eX, new ir("advancements.adventure.very_very_frightening.title", new Object[0]), new ir("advancements.adventure.very_very_frightening.description", new Object[0]), null, v.a, true, true, false).a("struck_villager", ac.b.a(new ao[] { ao.a.a().a(aev.aB).b() })).a(☃, "adventure/very_very_frightening");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 167 */     l l10 = l.a.a().a(l4).a(bct.di, new ir("advancements.adventure.summon_iron_golem.title", new Object[0]), new ir("advancements.adventure.summon_iron_golem.description", new Object[0]), null, v.c, true, true, false).a("summoned_golem", bh.b.a(ao.a.a().a(aev.aC))).a(☃, "adventure/summon_iron_golem");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 174 */     l l11 = l.a.a().a(l7).a(atf.h, new ir("advancements.adventure.sniper_duel.title", new Object[0]), new ir("advancements.adventure.sniper_duel.description", new Object[0]), null, v.b, true, true, false).a(o.a.a(50)).a("killed_skeleton", aw.b.a(ao.a.a().a(aev.ak).a(ai.a(ba.c.b(50.0F))), ah.a.a().a(Boolean.valueOf(true)))).a(☃, "adventure/sniper_duel");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 180 */     l l12 = l.a.a().a(l5).a(atf.eR, new ir("advancements.adventure.totem_of_undying.title", new Object[0]), new ir("advancements.adventure.totem_of_undying.description", new Object[0]), null, v.c, true, true, false).a("used_totem", bm.b.a(atf.eR)).a(☃, "adventure/totem_of_undying");
/*     */   }
/*     */   
/*     */   private l.a a(l.a ☃) {
/* 184 */     for (aev<?> aev1 : b) {
/* 185 */       ☃.a(fc.r.b(aev1).toString(), aw.b.a(ao.a.a().a(aev1)));
/*     */     }
/* 187 */     return ☃;
/*     */   }
/*     */   
/*     */   private l.a b(l.a ☃) {
/* 191 */     for (ayu ayu1 : a) {
/* 192 */       ☃.a(fc.m.b(ayu1).toString(), az.b.a(ay.a(ayu1)));
/*     */     }
/* 194 */     return ☃;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\ft.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */