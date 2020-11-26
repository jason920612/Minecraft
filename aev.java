/*     */ import com.mojang.datafixers.DataFixUtils;
/*     */ import com.mojang.datafixers.types.Type;
/*     */ import java.util.UUID;
/*     */ import java.util.function.Function;
/*     */ import java.util.stream.Stream;
/*     */ import javax.annotation.Nullable;
/*     */ import net.minecraft.server.MinecraftServer;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class aev<T extends aer>
/*     */ {
/* 127 */   private static final Logger aR = LogManager.getLogger();
/*     */ 
/*     */   
/*     */   public static <T extends aer> aev<T> a(String ☃, a<T> a1) {
/* 131 */     aev<T> aev1 = a1.a(☃);
/* 132 */     fc.r.a(new pc(☃), aev1);
/*     */     
/* 134 */     return aev1;
/*     */   }
/*     */   
/* 137 */   public static final aev<aep> a = a("area_effect_cloud", a.a(aep.class, aep::new));
/* 138 */   public static final aev<alz> b = a("armor_stand", a.a(alz.class, alz::new));
/* 139 */   public static final aev<aom> c = a("arrow", a.a(aom.class, aom::new));
/* 140 */   public static final aev<ajl> d = a("bat", a.a(ajl.class, ajl::new));
/* 141 */   public static final aev<amr> e = a("blaze", a.a(amr.class, amr::new));
/* 142 */   public static final aev<apj> f = a("boat", a.a(apj.class, apj::new));
/* 143 */   public static final aev<ams> g = a("cave_spider", a.a(ams.class, ams::new));
/* 144 */   public static final aev<ajr> h = a("chicken", a.a(ajr.class, ajr::new));
/* 145 */   public static final aev<ajs> i = a("cod", a.a(ajs.class, ajs::new));
/* 146 */   public static final aev<ajt> j = a("cow", a.a(ajt.class, ajt::new));
/* 147 */   public static final aev<amt> k = a("creeper", a.a(amt.class, amt::new));
/* 148 */   public static final aev<akp> l = a("donkey", a.a(akp.class, akp::new));
/* 149 */   public static final aev<aju> m = a("dolphin", a.a(aju.class, aju::new));
/* 150 */   public static final aev<aon> n = a("dragon_fireball", a.a(aon.class, aon::new));
/* 151 */   public static final aev<amu> o = a("drowned", a.a(amu.class, amu::new));
/* 152 */   public static final aev<amv> p = a("elder_guardian", a.a(amv.class, amv::new));
/* 153 */   public static final aev<alc> q = a("end_crystal", a.a(alc.class, alc::new));
/* 154 */   public static final aev<ald> r = a("ender_dragon", a.a(ald.class, ald::new));
/* 155 */   public static final aev<amw> s = a("enderman", a.a(amw.class, amw::new));
/* 156 */   public static final aev<amx> t = a("endermite", a.a(amx.class, amx::new));
/* 157 */   public static final aev<aoo> u = a("evoker_fangs", a.a(aoo.class, aoo::new));
/* 158 */   public static final aev<amz> v = a("evoker", a.a(amz.class, amz::new));
/* 159 */   public static final aev<aex> w = a("experience_orb", a.a(aex.class, aex::new));
/* 160 */   public static final aev<aop> x = a("eye_of_ender", a.a(aop.class, aop::new));
/* 161 */   public static final aev<aml> y = a("falling_block", a.a(aml.class, aml::new));
/* 162 */   public static final aev<aoq> z = a("firework_rocket", a.a(aoq.class, aoq::new));
/* 163 */   public static final aev<ana> A = a("ghast", a.a(ana.class, ana::new));
/* 164 */   public static final aev<anb> B = a("giant", a.a(anb.class, anb::new));
/* 165 */   public static final aev<anc> C = a("guardian", a.a(anc.class, anc::new));
/* 166 */   public static final aev<akq> D = a("horse", a.a(akq.class, akq::new));
/* 167 */   public static final aev<and> E = a("husk", a.a(and.class, and::new));
/* 168 */   public static final aev<ane> F = a("illusioner", a.a(ane.class, ane::new));
/* 169 */   public static final aev<amm> G = a("item", a.a(amm.class, amm::new));
/* 170 */   public static final aev<amb> H = a("item_frame", a.a(amb.class, amb::new));
/* 171 */   public static final aev<aor> I = a("fireball", a.a(aor.class, aor::new));
/* 172 */   public static final aev<amc> J = a("leash_knot", a.<amc>a(amc.class, amc::new).b());
/* 173 */   public static final aev<aks> K = a("llama", a.a(aks.class, aks::new));
/* 174 */   public static final aev<aos> L = a("llama_spit", a.a(aos.class, aos::new));
/* 175 */   public static final aev<anf> M = a("magma_cube", a.a(anf.class, anf::new));
/* 176 */   public static final aev<apk> N = a("minecart", a.a(apk.class, apk::new));
/* 177 */   public static final aev<apl> O = a("chest_minecart", a.a(apl.class, apl::new));
/* 178 */   public static final aev<apm> P = a("command_block_minecart", a.a(apm.class, apm::new));
/* 179 */   public static final aev<apn> Q = a("furnace_minecart", a.a(apn.class, apn::new));
/* 180 */   public static final aev<apo> R = a("hopper_minecart", a.a(apo.class, apo::new));
/* 181 */   public static final aev<app> S = a("spawner_minecart", a.a(app.class, app::new));
/* 182 */   public static final aev<apq> T = a("tnt_minecart", a.a(apq.class, apq::new));
/* 183 */   public static final aev<akt> U = a("mule", a.a(akt.class, akt::new));
/* 184 */   public static final aev<ajx> V = a("mooshroom", a.a(ajx.class, ajx::new));
/* 185 */   public static final aev<ajy> W = a("ocelot", a.a(ajy.class, ajy::new));
/* 186 */   public static final aev<ame> X = a("painting", a.a(ame.class, ame::new));
/* 187 */   public static final aev<ajz> Y = a("parrot", a.a(ajz.class, ajz::new));
/* 188 */   public static final aev<aka> Z = a("pig", a.a(aka.class, aka::new));
/* 189 */   public static final aev<akc> aa = a("pufferfish", a.a(akc.class, akc::new));
/* 190 */   public static final aev<ani> ab = a("zombie_pigman", a.a(ani.class, ani::new));
/* 191 */   public static final aev<akb> ac = a("polar_bear", a.a(akb.class, akb::new));
/* 192 */   public static final aev<amn> ad = a("tnt", a.a(amn.class, amn::new));
/* 193 */   public static final aev<akd> ae = a("rabbit", a.a(akd.class, akd::new));
/* 194 */   public static final aev<ake> af = a("salmon", a.a(ake.class, ake::new));
/* 195 */   public static final aev<akf> ag = a("sheep", a.a(akf.class, akf::new));
/* 196 */   public static final aev<anl> ah = a("shulker", a.a(anl.class, anl::new));
/* 197 */   public static final aev<aov> ai = a("shulker_bullet", a.a(aov.class, aov::new));
/* 198 */   public static final aev<anm> aj = a("silverfish", a.a(anm.class, anm::new));
/* 199 */   public static final aev<ann> ak = a("skeleton", a.a(ann.class, ann::new));
/* 200 */   public static final aev<aku> al = a("skeleton_horse", a.a(aku.class, aku::new));
/* 201 */   public static final aev<ano> am = a("slime", a.a(ano.class, ano::new));
/* 202 */   public static final aev<aow> an = a("small_fireball", a.a(aow.class, aow::new));
/* 203 */   public static final aev<akh> ao = a("snow_golem", a.a(akh.class, akh::new));
/* 204 */   public static final aev<aox> ap = a("snowball", a.a(aox.class, aox::new));
/* 205 */   public static final aev<aoy> aq = a("spectral_arrow", a.a(aoy.class, aoy::new));
/* 206 */   public static final aev<anq> ar = a("spider", a.a(anq.class, anq::new));
/* 207 */   public static final aev<aki> as = a("squid", a.a(aki.class, aki::new));
/* 208 */   public static final aev<anr> at = a("stray", a.a(anr.class, anr::new));
/* 209 */   public static final aev<akj> au = a("tropical_fish", a.a(akj.class, akj::new));
/* 210 */   public static final aev<akk> av = a("turtle", a.a(akk.class, akk::new));
/* 211 */   public static final aev<apa> aw = a("egg", a.a(apa.class, apa::new));
/* 212 */   public static final aev<apb> ax = a("ender_pearl", a.a(apb.class, apb::new));
/* 213 */   public static final aev<apc> ay = a("experience_bottle", a.a(apc.class, apc::new));
/* 214 */   public static final aev<apd> az = a("potion", a.a(apd.class, apd::new));
/* 215 */   public static final aev<ans> aA = a("vex", a.a(ans.class, ans::new));
/* 216 */   public static final aev<aob> aB = a("villager", a.a(aob.class, aob::new));
/* 217 */   public static final aev<ajw> aC = a("iron_golem", a.a(ajw.class, ajw::new));
/* 218 */   public static final aev<ant> aD = a("vindicator", a.a(ant.class, ant::new));
/* 219 */   public static final aev<anu> aE = a("witch", a.a(anu.class, anu::new));
/* 220 */   public static final aev<alx> aF = a("wither", a.a(alx.class, alx::new));
/* 221 */   public static final aev<anv> aG = a("wither_skeleton", a.a(anv.class, anv::new));
/* 222 */   public static final aev<apf> aH = a("wither_skull", a.a(apf.class, apf::new));
/* 223 */   public static final aev<akm> aI = a("wolf", a.a(akm.class, akm::new));
/* 224 */   public static final aev<anw> aJ = a("zombie", a.a(anw.class, anw::new));
/* 225 */   public static final aev<akw> aK = a("zombie_horse", a.a(akw.class, akw::new));
/* 226 */   public static final aev<anx> aL = a("zombie_villager", a.a(anx.class, anx::new));
/* 227 */   public static final aev<anh> aM = a("phantom", a.a(anh.class, anh::new));
/*     */   
/* 229 */   public static final aev<amj> aN = a("lightning_bolt", a.<amj>a(amj.class).b());
/* 230 */   public static final aev<aog> aO = a("player", a.<aog>a(aog.class).b().a());
/* 231 */   public static final aev<amg> aP = a("fishing_bobber", a.<amg>a(amg.class).b().a());
/* 232 */   public static final aev<ape> aQ = a("trident", a.a(ape.class, ape::new));
/*     */   private final Class<? extends T> aS; private final Function<? super axy, ? extends T> aT; private final boolean aU;
/*     */   
/*     */   @Nullable
/* 236 */   public static pc a(aev<?> ☃) { return fc.r.b(☃); } private final boolean aV; @Nullable
/*     */   private String aW; @Nullable
/*     */   private ij aX; @Nullable
/*     */   private final Type<?> aY; @Nullable
/*     */   public static aev<?> a(String ☃) {
/* 241 */     return fc.r.b(pc.a(☃));
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
/*     */   public aev(Class<? extends T> ☃, Function<? super axy, ? extends T> function, boolean bool1, boolean bool2, @Nullable Type<?> type) {
/* 256 */     this.aS = ☃;
/* 257 */     this.aT = function;
/* 258 */     this.aU = bool1;
/* 259 */     this.aV = bool2;
/* 260 */     this.aY = type;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public aer a(axy ☃, @Nullable ate ate1, @Nullable aog aog1, el el1, boolean bool1, boolean bool2) {
/* 265 */     return (aer)a(☃, (ate1 == null) ? null : ate1
/*     */         
/* 267 */         .n(), (ate1 != null && ate1
/* 268 */         .s()) ? ate1.q() : null, aog1, el1, bool1, bool2);
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public T a(axy ☃, @Nullable gy gy1, @Nullable ij ij1, @Nullable aog aog1, el el1, boolean bool1, boolean bool2) {
/* 274 */     T t = b(☃, gy1, ij1, aog1, el1, bool1, bool2);
/* 275 */     ☃.a((aer)t);
/* 276 */     return t;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public T b(axy ☃, @Nullable gy gy1, @Nullable ij ij1, @Nullable aog aog1, el el1, boolean bool1, boolean bool2) {
/*     */     double d;
/* 284 */     T t = a(☃);
/*     */     
/* 286 */     if (t == null) {
/* 287 */       return null;
/*     */     }
/*     */ 
/*     */     
/* 291 */     if (bool1) {
/* 292 */       t.b(el1.o() + 0.5D, (el1.p() + 1), el1.q() + 0.5D);
/* 293 */       d = a(☃, el1, bool2, t.bD());
/*     */     } else {
/* 295 */       d = 0.0D;
/*     */     } 
/*     */     
/* 298 */     t.b(el1.o() + 0.5D, el1.p() + d, el1.q() + 0.5D, xq.g(☃.s.nextFloat() * 360.0F), 0.0F);
/*     */ 
/*     */     
/* 301 */     if (t instanceof afb) {
/* 302 */       afb afb = (afb)t;
/*     */       
/* 304 */       afb.aS = afb.w;
/* 305 */       afb.aQ = afb.w;
/*     */       
/* 307 */       afb.a(☃.h(new el(afb)), (afj)null, gy1);
/* 308 */       afb.A();
/*     */     } 
/*     */     
/* 311 */     if (ij1 != null && t instanceof afa) {
/* 312 */       t.b(ij1);
/*     */     }
/*     */     
/* 315 */     a(☃, aog1, (aer)t, gy1);
/*     */     
/* 317 */     return t;
/*     */   }
/*     */   
/*     */   protected static double a(ayc ☃, el el1, boolean bool, cea cea1) {
/* 321 */     cea cea2 = new cea(el1);
/* 322 */     if (bool) {
/* 323 */       cea2 = cea2.b(0.0D, -1.0D, 0.0D);
/*     */     }
/* 325 */     Stream<cew> stream = ☃.b((aer)null, cea2);
/*     */     
/* 327 */     return 1.0D + cet.a(eq.a.b, cea1, stream, bool ? -2.0D : -1.0D);
/*     */   }
/*     */   
/*     */   public static void a(axy ☃, @Nullable aog aog1, @Nullable aer aer1, @Nullable gy gy1) {
/* 331 */     if (gy1 == null || !gy1.c("EntityTag", 10)) {
/*     */       return;
/*     */     }
/*     */     
/* 335 */     MinecraftServer minecraftServer = ☃.z();
/* 336 */     if (minecraftServer == null || aer1 == null) {
/*     */       return;
/*     */     }
/*     */     
/* 340 */     if (!☃.B && aer1.bM() && (aog1 == null || !minecraftServer.ac().h(aog1.do()))) {
/*     */       return;
/*     */     }
/*     */     
/* 344 */     gy gy2 = aer1.e(new gy());
/* 345 */     UUID uUID = aer1.bt();
/* 346 */     gy2.a(gy1.p("EntityTag"));
/* 347 */     aer1.a(uUID);
/* 348 */     aer1.f(gy2);
/*     */   }
/*     */   
/*     */   public boolean a() {
/* 352 */     return this.aU;
/*     */   }
/*     */   
/*     */   public boolean b() {
/* 356 */     return this.aV;
/*     */   }
/*     */   
/*     */   public Class<? extends T> c() {
/* 360 */     return this.aS;
/*     */   }
/*     */   
/*     */   public String d() {
/* 364 */     if (this.aW == null) {
/* 365 */       this.aW = k.a("entity", fc.r.b(this));
/*     */     }
/* 367 */     return this.aW;
/*     */   }
/*     */   
/*     */   public ij e() {
/* 371 */     if (this.aX == null) {
/* 372 */       this.aX = new ir(d(), new Object[0]);
/*     */     }
/* 374 */     return this.aX;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public T a(axy ☃) {
/* 379 */     return this.aT.apply(☃);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static aer a(axy ☃, pc pc1) {
/* 384 */     return a(☃, fc.r.b(pc1));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public static aer a(gy ☃, axy axy1) {
/* 394 */     pc pc = new pc(☃.l("id"));
/*     */     
/* 396 */     aer aer = a(axy1, pc);
/* 397 */     if (aer == null) {
/* 398 */       aR.warn("Skipping Entity with id {}", pc);
/*     */     } else {
/* 400 */       aer.f(☃);
/*     */     } 
/* 402 */     return aer;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   private static aer a(axy ☃, @Nullable aev<?> aev1) {
/* 408 */     return (aev1 == null) ? null : (aer)aev1.a(☃);
/*     */   }
/*     */   
/*     */   public static class a<T extends aer> {
/*     */     private final Class<? extends T> a;
/*     */     private final Function<? super axy, ? extends T> b;
/*     */     private boolean c = true;
/*     */     private boolean d = true;
/*     */     
/*     */     private a(Class<? extends T> ☃, Function<? super axy, ? extends T> function) {
/* 418 */       this.a = ☃;
/* 419 */       this.b = function;
/*     */     }
/*     */     
/*     */     public static <T extends aer> a<T> a(Class<? extends T> ☃, Function<? super axy, ? extends T> function) {
/* 423 */       return new a<>(☃, function);
/*     */     }
/*     */     
/*     */     public static <T extends aer> a<T> a(Class<? extends T> ☃) {
/* 427 */       return new a<>(☃, ☃ -> null);
/*     */     }
/*     */     
/*     */     public a<T> a() {
/* 431 */       this.d = false;
/* 432 */       return this;
/*     */     }
/*     */     
/*     */     public a<T> b() {
/* 436 */       this.c = false;
/* 437 */       return this;
/*     */     }
/*     */ 
/*     */     
/*     */     public aev<T> a(String ☃) {
/* 442 */       Type<?> type = null;
/* 443 */       if (this.c) {
/*     */         try {
/* 445 */           type = xz.a().getSchema(DataFixUtils.makeKey(1631)).getChoiceType(aax.n, ☃);
/* 446 */         } catch (IllegalStateException illegalStateException) {
/* 447 */           if (j.b) {
/* 448 */             throw illegalStateException;
/*     */           }
/* 450 */           aev.f().warn("No data fixer registered for entity {}", ☃);
/*     */         } 
/*     */       }
/*     */       
/* 454 */       return new aev<>(this.a, this.b, this.c, this.d, type);
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\aev.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */