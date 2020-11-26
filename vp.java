/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.collect.Sets;
/*     */ import com.mojang.authlib.GameProfile;
/*     */ import io.netty.buffer.Unpooled;
/*     */ import java.io.File;
/*     */ import java.net.SocketAddress;
/*     */ import java.text.SimpleDateFormat;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import java.util.UUID;
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
/*     */ public abstract class vp
/*     */ {
/*  83 */   public static final File a = new File("banned-players.json");
/*  84 */   public static final File b = new File("banned-ips.json");
/*  85 */   public static final File c = new File("ops.json");
/*  86 */   public static final File d = new File("whitelist.json");
/*  87 */   private static final Logger f = LogManager.getLogger();
/*     */   
/*  89 */   private static final SimpleDateFormat g = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
/*     */   
/*     */   private final MinecraftServer h;
/*  92 */   private final List<tf> i = Lists.newArrayList();
/*  93 */   private final Map<UUID, tf> j = Maps.newHashMap();
/*  94 */   private final vu k = new vu(a);
/*  95 */   private final vm l = new vm(b);
/*  96 */   private final vq m = new vq(c);
/*  97 */   private final vw n = new vw(d);
/*  98 */   private final Map<UUID, wo> o = Maps.newHashMap();
/*  99 */   private final Map<UUID, pm> p = Maps.newHashMap();
/*     */   private cci q;
/*     */   private boolean r;
/*     */   protected int e;
/*     */   private int s;
/*     */   private axv t;
/*     */   private boolean u;
/*     */   private int v;
/*     */   
/*     */   public vp(MinecraftServer ☃) {
/* 109 */     this.h = ☃;
/*     */     
/* 111 */     h().a(true);
/* 112 */     i().a(true);
/*     */     
/* 114 */     this.e = 8;
/*     */   }
/*     */   public void a(hw ☃, tf tf1) {
/*     */     ij ij;
/* 118 */     GameProfile gameProfile1 = tf1.do();
/*     */     
/* 120 */     vl vl = this.h.ar();
/* 121 */     GameProfile gameProfile2 = vl.a(gameProfile1.getId());
/* 122 */     String str1 = (gameProfile2 == null) ? gameProfile1.getName() : gameProfile2.getName();
/* 123 */     vl.a(gameProfile1);
/*     */     
/* 125 */     gy gy = a(tf1);
/* 126 */     tf1.a(this.h.a(tf1.ap));
/* 127 */     tf1.c.a((td)tf1.m);
/*     */     
/* 129 */     String str2 = "local";
/*     */     
/* 131 */     if (☃.b() != null) {
/* 132 */       str2 = ☃.b().toString();
/*     */     }
/*     */     
/* 135 */     f.info("{}[{}] logged in with entity id {} at ({}, {}, {})", tf1.N_().getString(), str2, Integer.valueOf(tf1.Q()), Double.valueOf(tf1.q), Double.valueOf(tf1.r), Double.valueOf(tf1.s));
/*     */     
/* 137 */     td td = this.h.a(tf1.ap);
/* 138 */     ccb ccb = td.g();
/*     */     
/* 140 */     a(tf1, (tf)null, td);
/*     */     
/* 142 */     uc uc = new uc(this.h, ☃, tf1);
/* 143 */     uc.a(new kj(tf1.Q(), tf1.c.b(), ccb.s(), td.t.q(), td.aj(), p(), ccb.t(), td.X().b("reducedDebugInfo")));
/* 144 */     uc.a(new jy(jy.b, (new hy(Unpooled.buffer())).a(c().getServerModName())));
/* 145 */     uc.a(new jm(ccb.x(), ccb.y()));
/* 146 */     uc.a(new kp(tf1.bV));
/* 147 */     uc.a(new le(tf1.bB.d));
/* 148 */     uc.a(new mc(this.h.aK().b()));
/* 149 */     uc.a(new md(this.h.aL()));
/* 150 */     f(tf1);
/*     */     
/* 152 */     tf1.A().c();
/*     */     
/* 154 */     tf1.B().a(tf1);
/*     */     
/* 156 */     a(td.l_(), tf1);
/*     */     
/* 158 */     this.h.at();
/*     */     
/* 160 */     if (tf1.do().getName().equalsIgnoreCase(str1)) {
/* 161 */       ij = new ir("multiplayer.player.joined", new Object[] { tf1.O() });
/*     */     } else {
/* 163 */       ij = new ir("multiplayer.player.joined.renamed", new Object[] { tf1.O(), str1 });
/*     */     } 
/* 165 */     a(ij.a(a.o));
/* 166 */     c(tf1);
/*     */     
/* 168 */     uc.a(tf1.q, tf1.r, tf1.s, tf1.w, tf1.x);
/* 169 */     b(tf1, td);
/*     */     
/* 171 */     if (!this.h.N().isEmpty()) {
/* 172 */       tf1.a(this.h.N(), this.h.O());
/*     */     }
/*     */     
/* 175 */     for (aek aek : tf1.cn()) {
/* 176 */       uc.a(new mb(tf1.Q(), aek));
/*     */     }
/*     */     
/* 179 */     if (gy != null && gy.c("RootVehicle", 10)) {
/* 180 */       gy gy1 = gy.p("RootVehicle");
/* 181 */       aer aer = bnv.a(gy1.p("Entity"), td, true);
/* 182 */       if (aer != null) {
/* 183 */         UUID uUID = gy1.a("Attach");
/* 184 */         if (aer.bt().equals(uUID)) {
/* 185 */           tf1.a(aer, true);
/*     */         } else {
/* 187 */           for (aer aer1 : aer.bQ()) {
/* 188 */             if (aer1.bt().equals(uUID)) {
/* 189 */               tf1.a(aer1, true);
/*     */               break;
/*     */             } 
/*     */           } 
/*     */         } 
/* 194 */         if (!tf1.aW()) {
/* 195 */           f.warn("Couldn't reattach entity to player");
/* 196 */           td.f(aer);
/* 197 */           for (aer aer1 : aer.bQ()) {
/* 198 */             td.f(aer1);
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 204 */     tf1.u_();
/*     */   }
/*     */   
/*     */   protected void a(pr ☃, tf tf1) {
/* 208 */     Set<cez> set = Sets.newHashSet();
/*     */     
/* 210 */     for (cfa cfa : ☃.g()) {
/* 211 */       tf1.a.a(new lo(cfa, 0));
/*     */     }
/*     */     
/* 214 */     for (int i = 0; i < 19; i++) {
/* 215 */       cez cez = ☃.a(i);
/*     */       
/* 217 */       if (cez != null && !set.contains(cez)) {
/* 218 */         List<iv<?>> list = ☃.d(cez);
/*     */         
/* 220 */         for (iv<?> iv : list) {
/* 221 */           tf1.a.a(iv);
/*     */         }
/*     */         
/* 224 */         set.add(cez);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(td ☃) {
/* 230 */     this.q = ☃.s_().e();
/* 231 */     ☃.d().a(new bmt(this)
/*     */         {
/*     */           public void a(bmv ☃, double d) {
/* 234 */             this.a.a(new lc(☃, lc.a.a));
/*     */           }
/*     */ 
/*     */           
/*     */           public void a(bmv ☃, double d1, double d2, long l) {
/* 239 */             this.a.a(new lc(☃, lc.a.b));
/*     */           }
/*     */ 
/*     */           
/*     */           public void a(bmv ☃, double d1, double d2) {
/* 244 */             this.a.a(new lc(☃, lc.a.c));
/*     */           }
/*     */ 
/*     */           
/*     */           public void a(bmv ☃, int i) {
/* 249 */             this.a.a(new lc(☃, lc.a.e));
/*     */           }
/*     */ 
/*     */           
/*     */           public void b(bmv ☃, int i) {
/* 254 */             this.a.a(new lc(☃, lc.a.f));
/*     */           }
/*     */ 
/*     */ 
/*     */           
/*     */           public void b(bmv ☃, double d) {}
/*     */ 
/*     */           
/*     */           public void c(bmv ☃, double d) {}
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(tf ☃, @Nullable td td1) {
/* 268 */     td td2 = ☃.s();
/*     */     
/* 270 */     if (td1 != null) {
/* 271 */       td1.B().b(☃);
/*     */     }
/* 273 */     td2.B().a(☃);
/*     */     
/* 275 */     td2.v().a((int)☃.q >> 4, (int)☃.s >> 4, true, true);
/*     */     
/* 277 */     if (td1 != null) {
/* 278 */       p.v.a(☃, td1.t.q(), td2.t.q());
/*     */       
/* 280 */       if (td1.t.q() == bod.b && ☃.m.t.q() == bod.a && ☃.M() != null) {
/* 281 */         p.C.a(☃, ☃.M());
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public int d() {
/* 287 */     return tl.b(s());
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public gy a(tf ☃) {
/* 292 */     gy gy2, gy1 = this.h.a(bod.a).g().h();
/*     */ 
/*     */     
/* 295 */     if (☃.N_().getString().equals(this.h.G()) && gy1 != null) {
/* 296 */       gy2 = gy1;
/* 297 */       ☃.f(gy2);
/* 298 */       f.debug("loading single player");
/*     */     } else {
/* 300 */       gy2 = this.q.b(☃);
/*     */     } 
/* 302 */     return gy2;
/*     */   }
/*     */   
/*     */   protected void b(tf ☃) {
/* 306 */     this.q.a(☃);
/* 307 */     wo wo = this.o.get(☃.bt());
/* 308 */     if (wo != null) {
/* 309 */       wo.a();
/*     */     }
/* 311 */     pm pm = this.p.get(☃.bt());
/* 312 */     if (pm != null) {
/* 313 */       pm.c();
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void c(tf ☃) {
/* 323 */     this.i.add(☃);
/* 324 */     this.j.put(☃.bt(), ☃);
/*     */     
/* 326 */     a(new kr(kr.a.a, new tf[] { ☃ }));
/*     */ 
/*     */     
/* 329 */     td td = this.h.a(☃.ap);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 337 */     for (int i = 0; i < this.i.size(); i++) {
/* 338 */       ☃.a.a(new kr(kr.a.a, new tf[] { this.i.get(i) }));
/*     */     } 
/*     */     
/* 341 */     td.a(☃);
/* 342 */     a(☃, (td)null);
/*     */     
/* 344 */     this.h.aP().a(☃);
/*     */   }
/*     */   
/*     */   public void d(tf ☃) {
/* 348 */     ☃.s().B().c(☃);
/*     */   }
/*     */   
/*     */   public void e(tf ☃) {
/* 352 */     td td = ☃.s();
/* 353 */     ☃.a(ws.j);
/* 354 */     b(☃);
/* 355 */     if (☃.aW()) {
/* 356 */       aer aer = ☃.bS();
/* 357 */       if (aer.bR()) {
/* 358 */         f.debug("Removing player mount");
/* 359 */         ☃.S_();
/* 360 */         td.f(aer);
/* 361 */         for (aer aer1 : aer.bQ()) {
/* 362 */           td.f(aer1);
/*     */         }
/* 364 */         td.c(☃.ae, ☃.ag).r();
/*     */       } 
/*     */     } 
/* 367 */     td.e(☃);
/* 368 */     td.B().b(☃);
/* 369 */     ☃.L().a();
/* 370 */     this.i.remove(☃);
/* 371 */     this.h.aP().b(☃);
/* 372 */     UUID uUID = ☃.bt();
/* 373 */     tf tf1 = this.j.get(uUID);
/* 374 */     if (tf1 == ☃) {
/* 375 */       this.j.remove(uUID);
/* 376 */       this.o.remove(uUID);
/* 377 */       this.p.remove(uUID);
/*     */     } 
/* 379 */     a(new kr(kr.a.e, new tf[] { ☃ }));
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public ij a(SocketAddress ☃, GameProfile gameProfile) {
/* 384 */     if (this.k.a(gameProfile)) {
/* 385 */       vv vv = this.k.b(gameProfile);
/* 386 */       ij ij = new ir("multiplayer.disconnect.banned.reason", new Object[] { vv.d() });
/*     */       
/* 388 */       if (vv.c() != null) {
/* 389 */         ij.a(new ir("multiplayer.disconnect.banned.expiration", new Object[] { g.format(vv.c()) }));
/*     */       }
/*     */       
/* 392 */       return ij;
/*     */     } 
/*     */     
/* 395 */     if (!e(gameProfile)) {
/* 396 */       return new ir("multiplayer.disconnect.not_whitelisted", new Object[0]);
/*     */     }
/*     */     
/* 399 */     if (this.l.a(☃)) {
/* 400 */       vn vn = this.l.b(☃);
/* 401 */       ij ij = new ir("multiplayer.disconnect.banned_ip.reason", new Object[] { vn.d() });
/*     */       
/* 403 */       if (vn.c() != null) {
/* 404 */         ij.a(new ir("multiplayer.disconnect.banned_ip.expiration", new Object[] { g.format(vn.c()) }));
/*     */       }
/*     */       
/* 407 */       return ij;
/*     */     } 
/*     */     
/* 410 */     if (this.i.size() >= this.e && !f(gameProfile)) {
/* 411 */       return new ir("multiplayer.disconnect.server_full", new Object[0]);
/*     */     }
/*     */     
/* 414 */     return null;
/*     */   }
/*     */   public tf g(GameProfile ☃) {
/*     */     tg tg;
/* 418 */     UUID uUID = aog.a(☃);
/* 419 */     List<tf> list = Lists.newArrayList();
/* 420 */     for (int i = 0; i < this.i.size(); i++) {
/* 421 */       tf tf1 = this.i.get(i);
/* 422 */       if (tf1.bt().equals(uUID)) {
/* 423 */         list.add(tf1);
/*     */       }
/*     */     } 
/* 426 */     tf tf = this.j.get(☃.getId());
/* 427 */     if (tf != null && !list.contains(tf)) {
/* 428 */       list.add(tf);
/*     */     }
/* 430 */     for (tf tf1 : list) {
/* 431 */       tf1.a.b(new ir("multiplayer.disconnect.duplicate_login", new Object[0]));
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 436 */     if (this.h.L()) {
/* 437 */       tg = new sx(this.h.a(bod.a));
/*     */     } else {
/* 439 */       tg = new tg(this.h.a(bod.a));
/*     */     } 
/*     */     
/* 442 */     return new tf(this.h, this.h.a(bod.a), ☃, tg);
/*     */   }
/*     */   public tf a(tf ☃, bod bod1, boolean bool) {
/*     */     tg tg;
/* 446 */     ☃.s().A().b(☃);
/* 447 */     ☃.s().A().b(☃);
/* 448 */     ☃.s().B().b(☃);
/* 449 */     this.i.remove(☃);
/* 450 */     this.h.a(☃.ap).f(☃);
/*     */     
/* 452 */     el el1 = ☃.ds();
/* 453 */     boolean bool1 = ☃.dt();
/*     */     
/* 455 */     ☃.ap = bod1;
/*     */ 
/*     */ 
/*     */     
/* 459 */     if (this.h.L()) {
/* 460 */       tg = new sx(this.h.a(☃.ap));
/*     */     } else {
/* 462 */       tg = new tg(this.h.a(☃.ap));
/*     */     } 
/*     */     
/* 465 */     tf tf1 = new tf(this.h, this.h.a(☃.ap), ☃.do(), tg);
/* 466 */     tf1.a = ☃.a;
/* 467 */     tf1.a(☃, bool);
/* 468 */     tf1.e(☃.Q());
/* 469 */     tf1.a(☃.cS());
/* 470 */     for (String str : ☃.R()) {
/* 471 */       tf1.a(str);
/*     */     }
/*     */     
/* 474 */     td td = this.h.a(☃.ap);
/* 475 */     a(tf1, ☃, td);
/*     */     
/* 477 */     if (el1 != null) {
/* 478 */       el el = aog.a(this.h.a(☃.ap), el1, bool1);
/* 479 */       if (el != null) {
/* 480 */         tf1.b((el.o() + 0.5F), (el.p() + 0.1F), (el.q() + 0.5F), 0.0F, 0.0F);
/* 481 */         tf1.b(el1, bool1);
/*     */       } else {
/* 483 */         tf1.a.a(new ke(0, 0.0F));
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 488 */     td.v().a((int)tf1.q >> 4, (int)tf1.s >> 4, true, true);
/*     */     
/* 490 */     while (!td.c(tf1, tf1.bD()) && tf1.r < 256.0D) {
/* 491 */       tf1.b(tf1.q, tf1.r + 1.0D, tf1.s);
/*     */     }
/*     */     
/* 494 */     tf1.a.a(new kz(tf1.ap, tf1.m.aj(), tf1.m.g().t(), tf1.c.b()));
/* 495 */     el el2 = td.n();
/* 496 */     tf1.a.a(tf1.q, tf1.r, tf1.s, tf1.w, tf1.x);
/* 497 */     tf1.a.a(new lq(el2));
/* 498 */     tf1.a.a(new lk(tf1.bY, tf1.bX, tf1.bW));
/* 499 */     b(tf1, td);
/* 500 */     f(tf1);
/*     */     
/* 502 */     td.B().a(tf1);
/* 503 */     td.a(tf1);
/* 504 */     this.i.add(tf1);
/* 505 */     this.j.put(tf1.bt(), tf1);
/*     */     
/* 507 */     tf1.u_();
/* 508 */     tf1.l(tf1.cq());
/* 509 */     return tf1;
/*     */   }
/*     */   
/*     */   public void f(tf ☃) {
/* 513 */     GameProfile gameProfile = ☃.do();
/* 514 */     int i = this.h.a(gameProfile);
/* 515 */     a(☃, i);
/*     */   }
/*     */   
/*     */   public void a(tf ☃, bod bod1) {
/* 519 */     bod bod2 = ☃.ap;
/* 520 */     td td1 = this.h.a(☃.ap);
/* 521 */     ☃.ap = bod1;
/*     */     
/* 523 */     td td2 = this.h.a(☃.ap);
/*     */     
/* 525 */     ☃.a.a(new kz(☃.ap, ☃.m.aj(), ☃.m.g().t(), ☃.c.b()));
/* 526 */     f(☃);
/*     */     
/* 528 */     td1.f(☃);
/* 529 */     ☃.G = false;
/*     */     
/* 531 */     a(☃, bod2, td1, td2);
/*     */     
/* 533 */     a(☃, td1);
/* 534 */     ☃.a.a(☃.q, ☃.r, ☃.s, ☃.w, ☃.x);
/* 535 */     ☃.c.a(td2);
/* 536 */     ☃.a.a(new kp(☃.bV));
/* 537 */     b(☃, td2);
/* 538 */     g(☃);
/*     */     
/* 540 */     for (aek aek : ☃.cn()) {
/* 541 */       ☃.a.a(new mb(☃.Q(), aek));
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(aer ☃, bod bod1, td td1, td td2) {
/* 546 */     double d1 = ☃.q;
/* 547 */     double d2 = ☃.s;
/* 548 */     double d3 = 8.0D;
/* 549 */     float f = ☃.w;
/*     */     
/* 551 */     td1.A.a("moving");
/* 552 */     if (☃.ap == bod.b) {
/*     */       
/* 554 */       d1 = xq.a(d1 / 8.0D, td2.d().b() + 16.0D, td2.d().d() - 16.0D);
/* 555 */       d2 = xq.a(d2 / 8.0D, td2.d().c() + 16.0D, td2.d().e() - 16.0D);
/* 556 */       ☃.b(d1, ☃.r, d2, ☃.w, ☃.x);
/* 557 */       if (☃.aF()) {
/* 558 */         td1.a(☃, false);
/*     */       }
/* 560 */     } else if (☃.ap == bod.a) {
/*     */       
/* 562 */       d1 = xq.a(d1 * 8.0D, td2.d().b() + 16.0D, td2.d().d() - 16.0D);
/* 563 */       d2 = xq.a(d2 * 8.0D, td2.d().c() + 16.0D, td2.d().e() - 16.0D);
/* 564 */       ☃.b(d1, ☃.r, d2, ☃.w, ☃.x);
/* 565 */       if (☃.aF()) {
/* 566 */         td1.a(☃, false);
/*     */       }
/*     */     } else {
/*     */       el el;
/*     */       
/* 571 */       if (bod1 == bod.c) {
/*     */         
/* 573 */         el = td2.n();
/*     */       } else {
/*     */         
/* 576 */         el = td2.t();
/*     */       } 
/*     */       
/* 579 */       d1 = el.o();
/* 580 */       ☃.r = el.p();
/* 581 */       d2 = el.q();
/*     */       
/* 583 */       ☃.b(d1, ☃.r, d2, 90.0F, 0.0F);
/* 584 */       if (☃.aF()) {
/* 585 */         td1.a(☃, false);
/*     */       }
/*     */     } 
/* 588 */     td1.A.e();
/*     */     
/* 590 */     if (bod1 != bod.c) {
/* 591 */       td1.A.a("placing");
/*     */       
/* 593 */       d1 = xq.a((int)d1, -29999872, 29999872);
/* 594 */       d2 = xq.a((int)d2, -29999872, 29999872);
/* 595 */       if (☃.aF()) {
/* 596 */         ☃.b(d1, ☃.r, d2, ☃.w, ☃.x);
/* 597 */         td2.C().a(☃, f);
/* 598 */         td2.a(☃);
/* 599 */         td2.a(☃, false);
/*     */       } 
/* 601 */       td1.A.e();
/*     */     } 
/*     */     
/* 604 */     ☃.a(td2);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void e() {
/* 610 */     if (++this.v > 600) {
/* 611 */       a(new kr(kr.a.c, this.i));
/* 612 */       this.v = 0;
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(iv<?> ☃) {
/* 617 */     for (int i = 0; i < this.i.size(); i++) {
/* 618 */       ((tf)this.i.get(i)).a.a(☃);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(iv<?> ☃, bod bod1) {
/* 623 */     for (int i = 0; i < this.i.size(); i++) {
/* 624 */       tf tf = this.i.get(i);
/* 625 */       if (tf.ap == bod1) {
/* 626 */         tf.a.a(☃);
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(aog ☃, ij ij1) {
/* 632 */     cfe cfe = ☃.be();
/* 633 */     if (cfe == null) {
/*     */       return;
/*     */     }
/* 636 */     Collection<String> collection = cfe.g();
/* 637 */     for (String str : collection) {
/* 638 */       tf tf = a(str);
/* 639 */       if (tf == null || tf == ☃) {
/*     */         continue;
/*     */       }
/* 642 */       tf.a(ij1);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void b(aog ☃, ij ij1) {
/* 647 */     cfe cfe = ☃.be();
/* 648 */     if (cfe == null) {
/* 649 */       a(ij1);
/*     */       return;
/*     */     } 
/* 652 */     for (int i = 0; i < this.i.size(); i++) {
/* 653 */       tf tf = this.i.get(i);
/* 654 */       if (tf.be() != cfe) {
/* 655 */         tf.a(ij1);
/*     */       }
/*     */     } 
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
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String[] f() {
/* 676 */     String[] ☃ = new String[this.i.size()];
/* 677 */     for (int i = 0; i < this.i.size(); i++) {
/* 678 */       ☃[i] = ((tf)this.i.get(i)).do().getName();
/*     */     }
/* 680 */     return ☃;
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
/*     */   public vu h() {
/* 692 */     return this.k;
/*     */   }
/*     */   
/*     */   public vm i() {
/* 696 */     return this.l;
/*     */   }
/*     */   
/*     */   public void a(GameProfile ☃) {
/* 700 */     this.m.a(new vr(☃, this.h.j(), this.m.b(☃)));
/* 701 */     tf tf = a(☃.getId());
/* 702 */     if (tf != null) {
/* 703 */       f(tf);
/*     */     }
/*     */   }
/*     */   
/*     */   public void b(GameProfile ☃) {
/* 708 */     this.m.c(☃);
/* 709 */     tf tf = a(☃.getId());
/* 710 */     if (tf != null) {
/* 711 */       f(tf);
/*     */     }
/*     */   }
/*     */   
/*     */   private void a(tf ☃, int i) {
/* 716 */     if (☃.a != null) {
/*     */       byte b;
/* 718 */       if (i <= 0) {
/* 719 */         b = 24;
/* 720 */       } else if (i >= 4) {
/* 721 */         b = 28;
/*     */       } else {
/* 723 */         b = (byte)(24 + i);
/*     */       } 
/* 725 */       ☃.a.a(new kb(☃, b));
/*     */     } 
/* 727 */     this.h.aI().a(☃);
/*     */   }
/*     */   
/*     */   public boolean e(GameProfile ☃) {
/* 731 */     return (!this.r || this.m.d(☃) || this.n.d(☃));
/*     */   }
/*     */   
/*     */   public boolean h(GameProfile ☃) {
/* 735 */     return (this.m.d(☃) || (this.h.H() && this.h.a(bod.a).g().u() && this.h.G().equalsIgnoreCase(☃.getName())) || this.u);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public tf a(String ☃) {
/* 740 */     for (tf tf : this.i) {
/* 741 */       if (tf.do().getName().equalsIgnoreCase(☃)) {
/* 742 */         return tf;
/*     */       }
/*     */     } 
/* 745 */     return null;
/*     */   }
/*     */   
/*     */   public void a(@Nullable aog ☃, double d1, double d2, double d3, double d4, bod bod1, iv<?> iv1) {
/* 749 */     for (int i = 0; i < this.i.size(); i++) {
/* 750 */       tf tf = this.i.get(i);
/* 751 */       if (tf != ☃)
/*     */       {
/*     */         
/* 754 */         if (tf.ap == bod1) {
/*     */ 
/*     */           
/* 757 */           double d5 = d1 - tf.q;
/* 758 */           double d6 = d2 - tf.r;
/* 759 */           double d7 = d3 - tf.s;
/* 760 */           if (d5 * d5 + d6 * d6 + d7 * d7 < d4 * d4)
/* 761 */             tf.a.a(iv1); 
/*     */         }  } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public void j() {
/* 767 */     for (int ☃ = 0; ☃ < this.i.size(); ☃++) {
/* 768 */       b(this.i.get(☃));
/*     */     }
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
/*     */   public vw k() {
/* 781 */     return this.n;
/*     */   }
/*     */   
/*     */   public String[] l() {
/* 785 */     return this.n.a();
/*     */   }
/*     */   
/*     */   public vq m() {
/* 789 */     return this.m;
/*     */   }
/*     */   
/*     */   public String[] n() {
/* 793 */     return this.m.a();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a() {}
/*     */   
/*     */   public void b(tf ☃, td td1) {
/* 800 */     bmv bmv = this.h.a(bod.a).d();
/* 801 */     ☃.a.a(new lc(bmv, lc.a.d));
/* 802 */     ☃.a.a(new lr(td1.V(), td1.W(), td1.X().b("doDaylightCycle")));
/*     */     
/* 804 */     el el = td1.n();
/* 805 */     ☃.a.a(new lq(el));
/*     */     
/* 807 */     if (td1.Z()) {
/* 808 */       ☃.a.a(new ke(1, 0.0F));
/* 809 */       ☃.a.a(new ke(7, td1.i(1.0F)));
/* 810 */       ☃.a.a(new ke(8, td1.g(1.0F)));
/*     */     } 
/*     */   }
/*     */   
/*     */   public void g(tf ☃) {
/* 815 */     ☃.a(☃.bD);
/* 816 */     ☃.p();
/* 817 */     ☃.a.a(new le(☃.bB.d));
/*     */   }
/*     */   
/*     */   public int o() {
/* 821 */     return this.i.size();
/*     */   }
/*     */   
/*     */   public int p() {
/* 825 */     return this.e;
/*     */   }
/*     */   
/*     */   public String[] q() {
/* 829 */     return this.h.a(bod.a).s_().e().f();
/*     */   }
/*     */   
/*     */   public boolean r() {
/* 833 */     return this.r;
/*     */   }
/*     */   
/*     */   public void a(boolean ☃) {
/* 837 */     this.r = ☃;
/*     */   }
/*     */   
/*     */   public List<tf> b(String ☃) {
/* 841 */     List<tf> list = Lists.newArrayList();
/*     */     
/* 843 */     for (tf tf : this.i) {
/* 844 */       if (tf.v().equals(☃)) {
/* 845 */         list.add(tf);
/*     */       }
/*     */     } 
/*     */     
/* 849 */     return list;
/*     */   }
/*     */   
/*     */   public int s() {
/* 853 */     return this.s;
/*     */   }
/*     */   
/*     */   public MinecraftServer c() {
/* 857 */     return this.h;
/*     */   }
/*     */   
/*     */   public gy t() {
/* 861 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void a(tf ☃, tf tf1, axz axz1) {
/* 871 */     if (tf1 != null) {
/* 872 */       ☃.c.a(tf1.c.b());
/* 873 */     } else if (this.t != null) {
/* 874 */       ☃.c.a(this.t);
/*     */     } 
/* 876 */     ☃.c.b(axz1.g().q());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void u() {
/* 884 */     for (int ☃ = 0; ☃ < this.i.size(); ☃++) {
/* 885 */       ((tf)this.i.get(☃)).a.b(new ir("multiplayer.disconnect.server_shutdown", new Object[0]));
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(ij ☃, boolean bool) {
/* 890 */     this.h.a(☃);
/* 891 */     ih ih = bool ? ih.b : ih.a;
/* 892 */     a(new jn(☃, ih));
/*     */   }
/*     */   
/*     */   public void a(ij ☃) {
/* 896 */     a(☃, true);
/*     */   }
/*     */   
/*     */   public wo a(aog ☃) {
/* 900 */     UUID uUID = ☃.bt();
/* 901 */     wo wo = (uUID == null) ? null : this.o.get(uUID);
/*     */     
/* 903 */     if (wo == null) {
/* 904 */       File file1 = new File(this.h.a(bod.a).s_().b(), "stats");
/* 905 */       File file2 = new File(file1, uUID + ".json");
/*     */       
/* 907 */       if (!file2.exists()) {
/*     */         
/* 909 */         File file = new File(file1, ☃.N_().getString() + ".json");
/* 910 */         if (file.exists() && file.isFile()) {
/* 911 */           file.renameTo(file2);
/*     */         }
/*     */       } 
/*     */       
/* 915 */       wo = new wo(this.h, file2);
/* 916 */       this.o.put(uUID, wo);
/*     */     } 
/*     */     
/* 919 */     return wo;
/*     */   }
/*     */   
/*     */   public pm h(tf ☃) {
/* 923 */     UUID uUID = ☃.bt();
/* 924 */     pm pm = this.p.get(uUID);
/*     */     
/* 926 */     if (pm == null) {
/* 927 */       File file1 = new File(this.h.a(bod.a).s_().b(), "advancements");
/* 928 */       File file2 = new File(file1, uUID + ".json");
/* 929 */       pm = new pm(this.h, file2, ☃);
/* 930 */       this.p.put(uUID, pm);
/*     */     } 
/*     */     
/* 933 */     pm.a(☃);
/*     */     
/* 935 */     return pm;
/*     */   }
/*     */   
/*     */   public void a(int ☃) {
/* 939 */     this.s = ☃;
/*     */     
/* 941 */     for (td td : this.h.w()) {
/* 942 */       if (td != null) {
/* 943 */         td.B().a(☃);
/* 944 */         td.A().a(☃);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public List<tf> v() {
/* 950 */     return this.i;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public tf a(UUID ☃) {
/* 955 */     return this.j.get(☃);
/*     */   }
/*     */   
/*     */   public boolean f(GameProfile ☃) {
/* 959 */     return false;
/*     */   }
/*     */   
/*     */   public void w() {
/* 963 */     for (pm pm : this.p.values()) {
/* 964 */       pm.b();
/*     */     }
/* 966 */     a(new md(this.h.aL()));
/* 967 */     mc ☃ = new mc(this.h.aK().b());
/* 968 */     for (tf tf : this.i) {
/* 969 */       tf.a.a(☃);
/* 970 */       tf.B().a(tf);
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean x() {
/* 975 */     return this.u;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\vp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */