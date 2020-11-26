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
/*     */ public class fu
/*     */   implements Consumer<Consumer<l>>
/*     */ {
/*  32 */   private static final aev<?>[] a = new aev[] { aev.D, aev.ag, aev.j, aev.V, aev.Z, aev.h, aev.aI, aev.W, aev.ae, aev.K, aev.av };
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
/*  46 */   private static final ata[] b = new ata[] { atf.bb, atf.bd, atf.be, atf.bc };
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  53 */   private static final ata[] c = new ata[] { atf.aN, atf.aO, atf.aL, atf.aM };
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  60 */   private static final ata[] d = new ata[] { atf.f, atf.E, atf.T, atf.aq, atf.ar, atf.at, atf.au, atf.bb, atf.bc, atf.bd, atf.be, atf.bf, atf.bg, atf.bP, atf.bS, atf.bW, atf.bX, atf.bY, atf.bZ, atf.ch, atf.cs, atf.dC, atf.dD, atf.dE, atf.dF, atf.dH, atf.dQ, atf.cc, atf.cd, atf.ce, atf.ca, atf.cb, atf.eM, atf.eP, atf.eQ, atf.bT };
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
/*     */   public void a(Consumer<l> ☃) {
/* 104 */     l l1 = l.a.a().a(bct.fW, new ir("advancements.husbandry.root.title", new Object[0]), new ir("advancements.husbandry.root.description", new Object[0]), new pc("minecraft:textures/gui/advancements/backgrounds/husbandry.png"), v.a, false, false, false).a("consumed_item", ae.b.c()).a(☃, "husbandry/root");
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
/* 115 */     l l2 = l.a.a().a(l1).a(atf.S, new ir("advancements.husbandry.plant_seed.title", new Object[0]), new ir("advancements.husbandry.plant_seed.description", new Object[0]), null, v.a, true, true, false).a(w.OR).a("wheat", be.b.a(bct.cp)).a("pumpkin_stem", be.b.a(bct.dK)).a("melon_stem", be.b.a(bct.dL)).a("beetroots", be.b.a(bct.ie)).a("nether_wart", be.b.a(bct.ea)).a(☃, "husbandry/plant_seed");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 122 */     l l3 = l.a.a().a(l1).a(atf.S, new ir("advancements.husbandry.breed_an_animal.title", new Object[0]), new ir("advancements.husbandry.breed_an_animal.description", new Object[0]), null, v.a, true, true, false).a(w.OR).a("bred", z.b.c()).a(☃, "husbandry/breed_an_animal");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 128 */     l l4 = a(l.a.a()).a(l2).a(atf.f, new ir("advancements.husbandry.balanced_diet.title", new Object[0]), new ir("advancements.husbandry.balanced_diet.description", new Object[0]), null, v.b, true, true, false).a(o.a.a(100)).a(☃, "husbandry/balanced_diet");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 135 */     l l5 = l.a.a().a(l2).a(atf.P, new ir("advancements.husbandry.break_diamond_hoe.title", new Object[0]), new ir("advancements.husbandry.break_diamond_hoe.description", new Object[0]), null, v.b, true, true, false).a(o.a.a(100)).a("broke_hoe", au.b.a(av.a.a().a(atf.P).b(), ba.d.a(-1))).a(☃, "husbandry/break_diamond_hoe");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 141 */     l l6 = l.a.a().a(l1).a(atf.ec, new ir("advancements.husbandry.tame_an_animal.title", new Object[0]), new ir("advancements.husbandry.tame_an_animal.description", new Object[0]), null, v.a, true, true, false).a("tamed_animal", bi.b.c()).a(☃, "husbandry/tame_an_animal");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 147 */     l l7 = b(l.a.a()).a(l3).a(atf.dH, new ir("advancements.husbandry.breed_all_animals.title", new Object[0]), new ir("advancements.husbandry.breed_all_animals.description", new Object[0]), null, v.b, true, true, false).a(o.a.a(100)).a(☃, "husbandry/bred_all_animals");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 153 */     l l8 = d(l.a.a()).a(l1).a(w.OR).a(atf.aY, new ir("advancements.husbandry.fishy_business.title", new Object[0]), new ir("advancements.husbandry.fishy_business.description", new Object[0]), null, v.a, true, true, false).a(☃, "husbandry/fishy_business");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 159 */     l l9 = c(l.a.a()).a(l8).a(w.OR).a(atf.aL, new ir("advancements.husbandry.tactical_fishing.title", new Object[0]), new ir("advancements.husbandry.tactical_fishing.description", new Object[0]), null, v.a, true, true, false).a(☃, "husbandry/tactical_fishing");
/*     */   }
/*     */   
/*     */   private l.a a(l.a ☃) {
/* 163 */     for (ata ata1 : d) {
/* 164 */       ☃.a(fc.s.b(ata1).a(), ae.b.a(ata1));
/*     */     }
/* 166 */     return ☃;
/*     */   }
/*     */   
/*     */   private l.a b(l.a ☃) {
/* 170 */     for (aev<?> aev1 : a) {
/* 171 */       ☃.a(aev.a(aev1).toString(), z.b.a(ao.a.a().a(aev1)));
/*     */     }
/* 173 */     return ☃;
/*     */   }
/*     */   
/*     */   private l.a c(l.a ☃) {
/* 177 */     for (ata ata1 : c) {
/* 178 */       ☃.a(fc.s.b(ata1).a(), aq.b.a(av.a.a().a(ata1).b()));
/*     */     }
/* 180 */     return ☃;
/*     */   }
/*     */   
/*     */   private l.a d(l.a ☃) {
/* 184 */     for (ata ata1 : b) {
/* 185 */       ☃.a(fc.s.b(ata1).a(), ar.b.a(av.a, ao.a, av.a.a().a(ata1).b()));
/*     */     }
/* 187 */     return ☃;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\fu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */