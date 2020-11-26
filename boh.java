/*     */ import com.google.common.collect.ContiguousSet;
/*     */ import com.google.common.collect.DiscreteDomain;
/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Range;
/*     */ import com.google.common.collect.Sets;
/*     */ import java.util.Collection;
/*     */ import java.util.Collections;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ import java.util.Set;
/*     */ import java.util.UUID;
/*     */ import java.util.function.Predicate;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class boh
/*     */ {
/*  60 */   private static final Logger a = LogManager.getLogger();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  68 */   private static final Predicate<aer> b = aeu.a.and(aeu.a(0.0D, 128.0D, 0.0D, 192.0D));
/*     */   
/*  70 */   private final tb c = (tb)(new tb(new ir("entity.minecraft.ender_dragon", new Object[0]), adc.a.a, adc.b.a)).b(true).c(true);
/*     */   private final td d;
/*  72 */   private final List<Integer> e = Lists.newArrayList();
/*     */   private final bli f;
/*     */   private int g;
/*     */   private int h;
/*     */   private int i;
/*     */   private int j;
/*     */   private boolean k;
/*     */   private boolean l;
/*     */   private UUID m;
/*     */   private boolean n = true;
/*     */   private el o;
/*     */   private bog p;
/*     */   private int q;
/*     */   private List<alc> r;
/*     */   
/*     */   public boh(td ☃, gy gy1) {
/*  88 */     this.d = ☃;
/*  89 */     if (gy1.c("DragonKilled", 99)) {
/*  90 */       if (gy1.b("DragonUUID")) {
/*  91 */         this.m = gy1.a("DragonUUID");
/*     */       }
/*  93 */       this.k = gy1.q("DragonKilled");
/*  94 */       this.l = gy1.q("PreviouslyKilled");
/*  95 */       if (gy1.q("IsRespawning")) {
/*  96 */         this.p = bog.a;
/*     */       }
/*     */       
/*  99 */       if (gy1.c("ExitPortalLocation", 10)) {
/* 100 */         this.o = hk.c(gy1.p("ExitPortalLocation"));
/*     */       }
/*     */     } else {
/* 103 */       this.k = true;
/* 104 */       this.l = true;
/*     */     } 
/*     */     
/* 107 */     if (gy1.c("Gateways", 9)) {
/* 108 */       he he = gy1.d("Gateways", 3);
/* 109 */       for (int i = 0; i < he.size(); i++) {
/* 110 */         this.e.add(Integer.valueOf(he.h(i)));
/*     */       }
/*     */     } else {
/* 113 */       this.e.addAll((Collection<? extends Integer>)ContiguousSet.create(Range.closedOpen(Integer.valueOf(0), Integer.valueOf(20)), DiscreteDomain.integers()));
/* 114 */       Collections.shuffle(this.e, new Random(☃.r_()));
/*     */     } 
/*     */     
/* 117 */     this
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 164 */       .f = blj.a().a(new String[] { "       ", "       ", "       ", "   #   ", "       ", "       ", "       " }).a(new String[] { "       ", "       ", "       ", "   #   ", "       ", "       ", "       " }).a(new String[] { "       ", "       ", "       ", "   #   ", "       ", "       ", "       " }).a(new String[] { "  ###  ", " #   # ", "#     #", "#  #  #", "#     #", " #   # ", "  ###  " }).a(new String[] { "       ", "  ###  ", " ##### ", " ##### ", " ##### ", "  ###  ", "       " }).a('#', blh.a(blo.a(bct.z))).b();
/*     */   }
/*     */   
/*     */   public gy a() {
/* 168 */     gy ☃ = new gy();
/*     */     
/* 170 */     if (this.m != null) {
/* 171 */       ☃.a("DragonUUID", this.m);
/*     */     }
/*     */     
/* 174 */     ☃.a("DragonKilled", this.k);
/* 175 */     ☃.a("PreviouslyKilled", this.l);
/*     */     
/* 177 */     if (this.o != null) {
/* 178 */       ☃.a("ExitPortalLocation", hk.a(this.o));
/*     */     }
/*     */     
/* 181 */     he he = new he();
/* 182 */     for (Iterator<Integer> iterator = this.e.iterator(); iterator.hasNext(); ) { int i = ((Integer)iterator.next()).intValue();
/* 183 */       he.a(new hd(i)); }
/*     */     
/* 185 */     ☃.a("Gateways", he);
/*     */     
/* 187 */     return ☃;
/*     */   }
/*     */   
/*     */   enum a {
/* 191 */     a,
/* 192 */     b,
/* 193 */     c;
/*     */   }
/*     */   
/*     */   class b {
/* 197 */     private boh.a b = boh.a.a;
/*     */     private b(boh this$0) {}
/*     */     private boolean a() {
/* 200 */       if (this.b == boh.a.a) {
/* 201 */         this.b = boh.a(this.a, -8, 8, -8, 8) ? boh.a.c : boh.a.b;
/*     */       }
/*     */       
/* 204 */       return (this.b == boh.a.c);
/*     */     }
/*     */   }
/*     */   
/*     */   public void b() {
/* 209 */     this.c.d(!this.k);
/*     */     
/* 211 */     if (++this.j >= 20) {
/* 212 */       k();
/* 213 */       this.j = 0;
/*     */     } 
/*     */     
/* 216 */     b ☃ = new b();
/*     */     
/* 218 */     if (!this.c.h().isEmpty()) {
/* 219 */       if (this.n && 
/* 220 */         b.a(☃)) {
/* 221 */         g();
/* 222 */         this.n = false;
/*     */       } 
/*     */ 
/*     */       
/* 226 */       if (this.p != null) {
/* 227 */         if (this.r == null && 
/* 228 */           b.a(☃)) {
/* 229 */           this.p = null;
/* 230 */           e();
/*     */         } 
/*     */         
/* 233 */         this.p.a(this.d, this, this.r, this.q++, this.o);
/*     */       } 
/*     */       
/* 236 */       if (!this.k) {
/* 237 */         if ((this.m == null || ++this.g >= 1200) && 
/* 238 */           b.a(☃)) {
/* 239 */           h();
/* 240 */           this.g = 0;
/*     */         } 
/*     */ 
/*     */         
/* 244 */         if (++this.i >= 100 && 
/* 245 */           b.a(☃)) {
/* 246 */           l();
/* 247 */           this.i = 0;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private void g() {
/* 255 */     a.info("Scanning for legacy world dragon fight...");
/* 256 */     boolean ☃ = i();
/* 257 */     if (☃) {
/* 258 */       a.info("Found that the dragon has been killed in this world already.");
/* 259 */       this.l = true;
/*     */     } else {
/* 261 */       a.info("Found that the dragon has not yet been killed in this world.");
/* 262 */       this.l = false;
/* 263 */       a(false);
/*     */     } 
/*     */     
/* 266 */     List<ald> list = (List)this.d.a((Class)ald.class, aeu.a);
/* 267 */     if (list.isEmpty()) {
/* 268 */       this.k = true;
/*     */     } else {
/* 270 */       ald ald = list.get(0);
/* 271 */       this.m = ald.bt();
/* 272 */       a.info("Found that there's a dragon still alive ({})", ald);
/* 273 */       this.k = false;
/*     */       
/* 275 */       if (!☃) {
/* 276 */         a.info("But we didn't have a portal, let's remove it.");
/* 277 */         ald.V();
/* 278 */         this.m = null;
/*     */       } 
/*     */     } 
/*     */     
/* 282 */     if (!this.l && this.k)
/*     */     {
/* 284 */       this.k = false;
/*     */     }
/*     */   }
/*     */   
/*     */   private void h() {
/* 289 */     List<ald> ☃ = (List)this.d.a((Class)ald.class, aeu.a);
/* 290 */     if (☃.isEmpty()) {
/* 291 */       a.debug("Haven't seen the dragon, respawning it");
/* 292 */       n();
/*     */     } else {
/* 294 */       a.debug("Haven't seen our dragon, but found another one to use.");
/* 295 */       this.m = ((ald)☃.get(0)).bt();
/*     */     } 
/*     */   }
/*     */   
/*     */   protected void a(bog ☃) {
/* 300 */     if (this.p == null) {
/* 301 */       throw new IllegalStateException("Dragon respawn isn't in progress, can't skip ahead in the animation.");
/*     */     }
/*     */     
/* 304 */     this.q = 0;
/* 305 */     if (☃ == bog.e) {
/* 306 */       this.p = null;
/* 307 */       this.k = false;
/* 308 */       ald ald = n();
/*     */       
/* 310 */       for (tf tf : this.c.h()) {
/* 311 */         p.n.a(tf, ald);
/*     */       }
/*     */     } else {
/* 314 */       this.p = ☃;
/*     */     } 
/*     */   }
/*     */   
/*     */   private boolean i() {
/* 319 */     for (int ☃ = -8; ☃ <= 8; ☃++) {
/* 320 */       for (int i = -8; i <= 8; i++) {
/* 321 */         bnj bnj = this.d.c(☃, i);
/* 322 */         for (bji bji : bnj.B().values()) {
/* 323 */           if (bji instanceof bkh) {
/* 324 */             return true;
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 330 */     return false;
/*     */   }
/*     */   @Nullable
/*     */   private bli.b j() {
/*     */     int ☃;
/* 335 */     for (☃ = -8; ☃ <= 8; ☃++) {
/* 336 */       for (int j = -8; j <= 8; j++) {
/* 337 */         bnj bnj = this.d.c(☃, j);
/* 338 */         for (bji bji : bnj.B().values()) {
/* 339 */           if (bji instanceof bkh) {
/* 340 */             bli.b b = this.f.a(this.d, bji.v());
/* 341 */             if (b != null) {
/* 342 */               el el1 = b.a(3, 3, 3).d();
/* 343 */               if (this.o == null && el1.o() == 0 && el1.q() == 0) {
/* 344 */                 this.o = el1;
/*     */               }
/* 346 */               return b;
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 353 */     ☃ = this.d.a(bor.a.d, bqn.a).p();
/*     */     
/* 355 */     for (int i = ☃; i >= 0; i--) {
/* 356 */       bli.b b = this.f.a(this.d, new el(bqn.a.o(), i, bqn.a.q()));
/* 357 */       if (b != null) {
/* 358 */         if (this.o == null) {
/* 359 */           this.o = b.a(3, 3, 3).d();
/*     */         }
/* 361 */         return b;
/*     */       } 
/*     */     } 
/*     */     
/* 365 */     return null;
/*     */   }
/*     */   
/*     */   private boolean a(int ☃, int i, int j, int k) {
/* 369 */     if (b(☃, i, j, k)) {
/* 370 */       return true;
/*     */     }
/*     */     
/* 373 */     c(☃, i, j, k);
/* 374 */     return false;
/*     */   }
/*     */   private boolean b(int ☃, int i, int j, int k) {
/*     */     int m;
/* 378 */     boolean bool = true;
/*     */     
/* 380 */     for (int n = ☃; n <= i; n++) {
/* 381 */       for (int i1 = j; i1 <= k; i1++) {
/* 382 */         bnj bnj = this.d.c(n, i1);
/* 383 */         m = bool & ((bnj.i() == bnd.j) ? 1 : 0);
/*     */       } 
/*     */     } 
/* 386 */     return m;
/*     */   }
/*     */   private void c(int ☃, int i, int j, int k) {
/*     */     int m;
/* 390 */     for (m = ☃ - 1; m <= i + 1; m++) {
/* 391 */       this.d.c(m, j - 1);
/* 392 */       this.d.c(m, k + 1);
/*     */     } 
/*     */     
/* 395 */     for (m = j - 1; m <= k + 1; m++) {
/* 396 */       this.d.c(☃ - 1, m);
/* 397 */       this.d.c(i + 1, m);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void k() {
/* 402 */     Set<tf> ☃ = Sets.newHashSet();
/* 403 */     for (tf tf : this.d.<aer>b((Class)tf.class, b)) {
/* 404 */       this.c.a(tf);
/* 405 */       ☃.add(tf);
/*     */     } 
/* 407 */     Set<tf> set1 = Sets.newHashSet(this.c.h());
/* 408 */     set1.removeAll(☃);
/* 409 */     for (tf tf : set1) {
/* 410 */       this.c.b(tf);
/*     */     }
/*     */   }
/*     */   
/*     */   private void l() {
/* 415 */     this.i = 0;
/* 416 */     this.h = 0;
/*     */     
/* 418 */     for (btf.a ☃ : bvs.a(this.d)) {
/* 419 */       this.h += this.d.<alc>a(alc.class, ☃.f()).size();
/*     */     }
/*     */     
/* 422 */     a.debug("Found {} end crystals still alive", Integer.valueOf(this.h));
/*     */   }
/*     */   
/*     */   public void a(ald ☃) {
/* 426 */     if (☃.bt().equals(this.m)) {
/* 427 */       this.c.a(0.0F);
/* 428 */       this.c.d(false);
/* 429 */       a(true);
/* 430 */       m();
/*     */       
/* 432 */       if (!this.l) {
/* 433 */         this.d.a(this.d.a(bor.a.d, bqn.a), bct.eh.p());
/*     */       }
/*     */       
/* 436 */       this.l = true;
/* 437 */       this.k = true;
/*     */     } 
/*     */   }
/*     */   
/*     */   private void m() {
/* 442 */     if (this.e.isEmpty()) {
/*     */       return;
/*     */     }
/*     */     
/* 446 */     int ☃ = ((Integer)this.e.remove(this.e.size() - 1)).intValue();
/* 447 */     int i = (int)(96.0D * Math.cos(2.0D * (-3.141592653589793D + 0.15707963267948966D * ☃)));
/* 448 */     int j = (int)(96.0D * Math.sin(2.0D * (-3.141592653589793D + 0.15707963267948966D * ☃)));
/* 449 */     a(new el(i, 75, j));
/*     */   }
/*     */   
/*     */   private void a(el ☃) {
/* 453 */     this.d.b(3000, ☃, 0);
/* 454 */     bqo.ax.a(this.d, (bmy)this.d.v().f(), new Random(), ☃, new bqk(false));
/*     */   }
/*     */ 
/*     */   
/*     */   private void a(boolean ☃) {
/* 459 */     bqn bqn = new bqn(☃);
/*     */     
/* 461 */     if (this.o == null) {
/* 462 */       this.o = this.d.a(bor.a.e, bqn.a).b();
/* 463 */       while (this.d.a_(this.o).c() == bct.z && this.o.p() > this.d.k()) {
/* 464 */         this.o = this.o.b();
/*     */       }
/*     */     } 
/*     */     
/* 468 */     bqn.a(this.d, (bmy)this.d.v().f(), new Random(), this.o, bqp.e);
/*     */   }
/*     */   
/*     */   private ald n() {
/* 472 */     this.d.l(new el(0, 128, 0));
/* 473 */     ald ☃ = new ald(this.d);
/* 474 */     ☃.dr().a(alt.a);
/* 475 */     ☃.b(0.0D, 128.0D, 0.0D, this.d.s.nextFloat() * 360.0F, 0.0F);
/* 476 */     this.d.a(☃);
/* 477 */     this.m = ☃.bt();
/* 478 */     return ☃;
/*     */   }
/*     */   
/*     */   public void b(ald ☃) {
/* 482 */     if (☃.bt().equals(this.m)) {
/* 483 */       this.c.a(☃.cq() / ☃.cw());
/* 484 */       this.g = 0;
/* 485 */       if (☃.O_()) {
/* 486 */         this.c.a(☃.O());
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public int c() {
/* 492 */     return this.h;
/*     */   }
/*     */   
/*     */   public void a(alc ☃, aea aea1) {
/* 496 */     if (this.p != null && this.r.contains(☃)) {
/* 497 */       a.debug("Aborting respawn sequence");
/* 498 */       this.p = null;
/* 499 */       this.q = 0;
/* 500 */       f();
/* 501 */       a(true);
/*     */     } else {
/* 503 */       l();
/* 504 */       aer aer = this.d.a(this.m);
/* 505 */       if (aer instanceof ald) {
/* 506 */         ((ald)aer).a(☃, new el(☃), aea1);
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean d() {
/* 512 */     return this.l;
/*     */   }
/*     */   
/*     */   public void e() {
/* 516 */     if (this.k && this.p == null) {
/* 517 */       el ☃ = this.o;
/* 518 */       if (☃ == null) {
/* 519 */         a.debug("Tried to respawn, but need to find the portal first.");
/* 520 */         bli.b b = j();
/* 521 */         if (b == null) {
/* 522 */           a.debug("Couldn't find a portal, so we made one.");
/* 523 */           a(true);
/*     */         } else {
/* 525 */           a.debug("Found the exit portal & temporarily using it.");
/*     */         } 
/* 527 */         ☃ = this.o;
/*     */       } 
/*     */       
/* 530 */       List<alc> list = Lists.newArrayList();
/* 531 */       el el1 = ☃.b(1);
/* 532 */       for (eq eq : eq.c.a) {
/* 533 */         List<alc> list1 = this.d.a(alc.class, new cea(el1.a(eq, 2)));
/* 534 */         if (list1.isEmpty()) {
/*     */           return;
/*     */         }
/* 537 */         list.addAll(list1);
/*     */       } 
/*     */       
/* 540 */       a.debug("Found all crystals, respawning dragon.");
/* 541 */       a(list);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(List<alc> ☃) {
/* 546 */     if (this.k && this.p == null) {
/* 547 */       bli.b b = j();
/* 548 */       while (b != null) {
/* 549 */         for (int i = 0; i < this.f.c(); i++) {
/* 550 */           for (int j = 0; j < this.f.b(); j++) {
/* 551 */             for (int k = 0; k < this.f.a(); k++) {
/* 552 */               blh blh = b.a(i, j, k);
/* 553 */               if (blh.a().c() == bct.z || blh.a().c() == bct.ee) {
/* 554 */                 this.d.a(blh.d(), bct.eg.p());
/*     */               }
/*     */             } 
/*     */           } 
/*     */         } 
/* 559 */         b = j();
/*     */       } 
/*     */       
/* 562 */       this.p = bog.a;
/* 563 */       this.q = 0;
/* 564 */       a(false);
/* 565 */       this.r = ☃;
/*     */     } 
/*     */   }
/*     */   
/*     */   public void f() {
/* 570 */     for (btf.a ☃ : bvs.a(this.d)) {
/* 571 */       List<alc> list = this.d.a(alc.class, ☃.f());
/* 572 */       for (alc alc : list) {
/* 573 */         alc.l(false);
/* 574 */         alc.a((el)null);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\boh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */