/*      */ import com.google.common.primitives.Doubles;
/*      */ import com.google.common.primitives.Floats;
/*      */ import com.google.common.util.concurrent.Futures;
/*      */ import com.mojang.brigadier.ParseResults;
/*      */ import com.mojang.brigadier.StringReader;
/*      */ import com.mojang.brigadier.suggestion.Suggestions;
/*      */ import io.netty.util.concurrent.Future;
/*      */ import io.netty.util.concurrent.GenericFutureListener;
/*      */ import java.util.Collections;
/*      */ import java.util.Set;
/*      */ import java.util.concurrent.Future;
/*      */ import javax.annotation.Nullable;
/*      */ import net.minecraft.server.MinecraftServer;
/*      */ import org.apache.commons.lang3.StringUtils;
/*      */ import org.apache.logging.log4j.LogManager;
/*      */ import org.apache.logging.log4j.Logger;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class uc
/*      */   implements me, pt
/*      */ {
/*  148 */   private static final Logger c = LogManager.getLogger();
/*      */   
/*      */   public final hw a;
/*      */   
/*      */   private final MinecraftServer d;
/*      */   
/*      */   public tf b;
/*      */   
/*      */   private int e;
/*      */   private long f;
/*      */   private boolean g;
/*      */   private long h;
/*      */   private int i;
/*      */   private int j;
/*  162 */   private final xm<Short> k = new xm<>();
/*      */   private double l;
/*      */   private double m;
/*      */   private double n;
/*      */   private double o;
/*      */   private double p;
/*      */   private double q;
/*      */   private aer r;
/*      */   private double s;
/*      */   private double t;
/*      */   private double u;
/*      */   private double v;
/*      */   private double w;
/*      */   private double x;
/*      */   private cee y;
/*      */   private int z;
/*      */   private int A;
/*      */   private boolean B;
/*      */   private int C;
/*      */   private boolean D;
/*      */   private int E;
/*      */   private int F;
/*      */   private int G;
/*      */   
/*      */   public uc(MinecraftServer ☃, hw hw1, tf tf1) {
/*  187 */     this.d = ☃;
/*  188 */     this.a = hw1;
/*  189 */     hw1.a(this);
/*  190 */     this.b = tf1;
/*  191 */     tf1.a = this;
/*      */   }
/*      */ 
/*      */   
/*      */   public void Y_() {
/*  196 */     b();
/*  197 */     this.b.i();
/*  198 */     this.b.a(this.l, this.m, this.n, this.b.w, this.b.x);
/*  199 */     this.e++;
/*  200 */     this.G = this.F;
/*      */     
/*  202 */     if (this.B) {
/*  203 */       if (++this.C > 80) {
/*  204 */         c.warn("{} was kicked for floating too long!", this.b.N_().getString());
/*  205 */         b(new ir("multiplayer.disconnect.flying", new Object[0]));
/*      */         return;
/*      */       } 
/*      */     } else {
/*  209 */       this.B = false;
/*  210 */       this.C = 0;
/*      */     } 
/*      */     
/*  213 */     this.r = this.b.bS();
/*  214 */     if (this.r == this.b || this.r.bO() != this.b) {
/*  215 */       this.r = null;
/*  216 */       this.D = false;
/*  217 */       this.E = 0;
/*      */     } else {
/*  219 */       this.s = this.r.q;
/*  220 */       this.t = this.r.r;
/*  221 */       this.u = this.r.s;
/*  222 */       this.v = this.r.q;
/*  223 */       this.w = this.r.r;
/*  224 */       this.x = this.r.s;
/*  225 */       if (this.D && this.b.bS().bO() == this.b) {
/*  226 */         if (++this.E > 80) {
/*  227 */           c.warn("{} was kicked for floating a vehicle too long!", this.b.N_().getString());
/*  228 */           b(new ir("multiplayer.disconnect.flying", new Object[0]));
/*      */           return;
/*      */         } 
/*      */       } else {
/*  232 */         this.D = false;
/*  233 */         this.E = 0;
/*      */       } 
/*      */     } 
/*      */     
/*  237 */     this.d.b.a("keepAlive");
/*  238 */     long ☃ = k.b();
/*  239 */     if (☃ - this.f >= 15000L) {
/*  240 */       if (this.g) {
/*  241 */         b(new ir("disconnect.timeout", new Object[0]));
/*      */       } else {
/*  243 */         this.g = true;
/*  244 */         this.f = ☃;
/*  245 */         this.h = ☃;
/*  246 */         a(new kf(this.h));
/*      */       } 
/*      */     }
/*  249 */     this.d.b.e();
/*      */     
/*  251 */     if (this.i > 0) {
/*  252 */       this.i--;
/*      */     }
/*  254 */     if (this.j > 0) {
/*  255 */       this.j--;
/*      */     }
/*      */     
/*  258 */     if (this.b.F() > 0L && this.d.ao() > 0 && k.b() - this.b.F() > (this.d.ao() * 1000 * 60)) {
/*  259 */       b(new ir("multiplayer.disconnect.idling", new Object[0]));
/*      */     }
/*      */   }
/*      */   
/*      */   public void b() {
/*  264 */     this.l = this.b.q;
/*  265 */     this.m = this.b.r;
/*  266 */     this.n = this.b.s;
/*  267 */     this.o = this.b.q;
/*  268 */     this.p = this.b.r;
/*  269 */     this.q = this.b.s;
/*      */   }
/*      */ 
/*      */   
/*      */   public hw a() {
/*  274 */     return this.a;
/*      */   }
/*      */   
/*      */   public void b(ij ☃) {
/*  278 */     this.a.a(new ka(☃), future -> this.a.a(☃));
/*  279 */     this.a.k();
/*  280 */     Futures.getUnchecked((Future)this.d.a(this.a::l));
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(nc ☃) {
/*  285 */     ix.a(☃, this, this.b.s());
/*  286 */     this.b.a(☃.b(), ☃.c(), ☃.d(), ☃.e());
/*      */   }
/*      */   
/*      */   private static boolean b(mu ☃) {
/*  290 */     if (!Doubles.isFinite(☃.a(0.0D)) || !Doubles.isFinite(☃.b(0.0D)) || !Doubles.isFinite(☃.c(0.0D)) || !Floats.isFinite(☃.b(0.0F)) || !Floats.isFinite(☃.a(0.0F))) {
/*  291 */       return true;
/*      */     }
/*  293 */     if (Math.abs(☃.a(0.0D)) > 3.0E7D || Math.abs(☃.b(0.0D)) > 3.0E7D || Math.abs(☃.c(0.0D)) > 3.0E7D) {
/*  294 */       return true;
/*      */     }
/*  296 */     return false;
/*      */   }
/*      */   
/*      */   private static boolean b(mv ☃) {
/*  300 */     return (!Doubles.isFinite(☃.b()) || !Doubles.isFinite(☃.c()) || !Doubles.isFinite(☃.d()) || !Floats.isFinite(☃.f()) || !Floats.isFinite(☃.e()));
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(mv ☃) {
/*  305 */     ix.a(☃, this, this.b.s());
/*  306 */     if (b(☃)) {
/*  307 */       b(new ir("multiplayer.disconnect.invalid_vehicle_movement", new Object[0]));
/*      */       
/*      */       return;
/*      */     } 
/*  311 */     aer aer1 = this.b.bS();
/*  312 */     if (aer1 != this.b && aer1.bO() == this.b && aer1 == this.r) {
/*  313 */       td td = this.b.s();
/*  314 */       double d1 = aer1.q;
/*  315 */       double d2 = aer1.r;
/*  316 */       double d3 = aer1.s;
/*      */       
/*  318 */       double d4 = ☃.b();
/*  319 */       double d5 = ☃.c();
/*  320 */       double d6 = ☃.d();
/*      */       
/*  322 */       float f1 = ☃.e();
/*  323 */       float f2 = ☃.f();
/*      */       
/*  325 */       double d7 = d4 - this.s;
/*  326 */       double d8 = d5 - this.t;
/*  327 */       double d9 = d6 - this.u;
/*      */       
/*  329 */       double d10 = aer1.t * aer1.t + aer1.u * aer1.u + aer1.v * aer1.v;
/*  330 */       double d11 = d7 * d7 + d8 * d8 + d9 * d9;
/*      */       
/*  332 */       if (d11 - d10 > 100.0D && (!this.d.H() || !this.d.G().equals(aer1.N_().getString()))) {
/*  333 */         c.warn("{} (vehicle of {}) moved too quickly! {},{},{}", aer1.N_().getString(), this.b.N_().getString(), Double.valueOf(d7), Double.valueOf(d8), Double.valueOf(d9));
/*  334 */         this.a.a(new km(aer1));
/*      */         
/*      */         return;
/*      */       } 
/*  338 */       boolean bool1 = td.c(aer1, aer1.bD().h(0.0625D));
/*      */ 
/*      */       
/*  341 */       d7 = d4 - this.v;
/*  342 */       d8 = d5 - this.w - 1.0E-6D;
/*  343 */       d9 = d6 - this.x;
/*      */       
/*  345 */       aer1.a(afe.b, d7, d8, d9);
/*      */       
/*  347 */       double d12 = d8;
/*      */       
/*  349 */       d7 = d4 - aer1.q;
/*  350 */       d8 = d5 - aer1.r;
/*  351 */       if (d8 > -0.5D || d8 < 0.5D) {
/*  352 */         d8 = 0.0D;
/*      */       }
/*  354 */       d9 = d6 - aer1.s;
/*  355 */       d11 = d7 * d7 + d8 * d8 + d9 * d9;
/*  356 */       boolean bool2 = false;
/*  357 */       if (d11 > 0.0625D) {
/*  358 */         bool2 = true;
/*  359 */         c.warn("{} moved wrongly!", aer1.N_().getString());
/*      */       } 
/*  361 */       aer1.a(d4, d5, d6, f1, f2);
/*      */       
/*  363 */       boolean bool3 = td.c(aer1, aer1.bD().h(0.0625D));
/*  364 */       if (bool1 && (bool2 || !bool3)) {
/*  365 */         aer1.a(d1, d2, d3, f1, f2);
/*  366 */         this.a.a(new km(aer1));
/*      */         
/*      */         return;
/*      */       } 
/*  370 */       this.d.ac().d(this.b);
/*  371 */       this.b.k(this.b.q - d1, this.b.r - d2, this.b.s - d3);
/*  372 */       this.D = (d12 >= -0.03125D && !this.d.X() && !td.a(aer1.bD().g(0.0625D).b(0.0D, -0.55D, 0.0D)));
/*      */       
/*  374 */       this.v = aer1.q;
/*  375 */       this.w = aer1.r;
/*  376 */       this.x = aer1.s;
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(mf ☃) {
/*  382 */     ix.a(☃, this, this.b.s());
/*  383 */     if (☃.b() == this.z) {
/*  384 */       this.b.a(this.y.b, this.y.c, this.y.d, this.b.w, this.b.x);
/*      */       
/*  386 */       this.o = this.y.b;
/*  387 */       this.p = this.y.c;
/*  388 */       this.q = this.y.d;
/*  389 */       if (this.b.H()) {
/*  390 */         this.b.I();
/*      */       }
/*      */       
/*  393 */       this.y = null;
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(nd ☃) {
/*  399 */     ix.a(☃, this, this.b.s());
/*  400 */     if (☃.b() == nd.a.a) {
/*  401 */       avk avk = this.d.aK().a(☃.c());
/*  402 */       if (avk != null) {
/*  403 */         this.b.B().e(avk);
/*      */       }
/*  405 */     } else if (☃.b() == nd.a.b) {
/*  406 */       this.b.B().a(☃.d());
/*  407 */       this.b.B().b(☃.e());
/*  408 */       this.b.B().c(☃.f());
/*  409 */       this.b.B().d(☃.g());
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(ng ☃) {
/*  415 */     ix.a(☃, this, this.b.s());
/*  416 */     if (☃.c() == ng.a.a) {
/*  417 */       pc pc = ☃.d();
/*  418 */       l l = this.d.aA().a(pc);
/*  419 */       if (l != null) {
/*  420 */         this.b.L().a(l);
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(mk ☃) {
/*  427 */     ix.a(☃, this, this.b.s());
/*  428 */     StringReader stringReader = new StringReader(☃.c());
/*  429 */     if (stringReader.canRead() && stringReader.peek() == '/') {
/*  430 */       stringReader.skip();
/*      */     }
/*  432 */     ParseResults<bu> parseResults = this.d.aI().a().parse(stringReader, this.b.bX());
/*  433 */     this.d.aI().a().getCompletionSuggestions(parseResults).thenAccept(suggestions -> this.a.a(new jp(☃.b(), suggestions)));
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(nk ☃) {
/*  438 */     ix.a(☃, this, this.b.s());
/*  439 */     if (!this.d.Y()) {
/*  440 */       this.b.a(new ir("advMode.notEnabled", new Object[0]));
/*      */       return;
/*      */     } 
/*  443 */     if (!this.b.dK()) {
/*  444 */       this.b.a(new ir("advMode.notAllowed", new Object[0]));
/*      */       return;
/*      */     } 
/*  447 */     axh axh = null;
/*  448 */     bjm bjm = null;
/*  449 */     el el = ☃.b();
/*  450 */     bji bji = this.b.m.f(el);
/*  451 */     if (bji instanceof bjm) {
/*  452 */       bjm = (bjm)bji;
/*  453 */       axh = bjm.c();
/*      */     } 
/*      */     
/*  456 */     String str = ☃.c();
/*  457 */     boolean bool = ☃.d();
/*      */     
/*  459 */     if (axh != null) {
/*  460 */       blc blc; eq eq = (eq)this.b.m.a_(el).c(bdm.a);
/*      */       
/*  462 */       switch (null.a[☃.g().ordinal()]) {
/*      */         case 1:
/*  464 */           blc = bct.ii.p();
/*  465 */           this.b.m.a(el, blc.a(bdm.a, eq).a(bdm.b, Boolean.valueOf(☃.e())), 2);
/*      */           break;
/*      */         case 2:
/*  468 */           blc = bct.ih.p();
/*  469 */           this.b.m.a(el, blc.a(bdm.a, eq).a(bdm.b, Boolean.valueOf(☃.e())), 2);
/*      */           break;
/*      */         
/*      */         default:
/*  473 */           blc = bct.et.p();
/*  474 */           this.b.m.a(el, blc.a(bdm.a, eq).a(bdm.b, Boolean.valueOf(☃.e())), 2);
/*      */           break;
/*      */       } 
/*  477 */       bji.z();
/*  478 */       this.b.m.a(el, bji);
/*      */       
/*  480 */       axh.a(str);
/*  481 */       axh.a(bool);
/*  482 */       if (!bool) {
/*  483 */         axh.c(null);
/*      */       }
/*  485 */       bjm.b(☃.f());
/*  486 */       axh.e();
/*  487 */       if (!xw.b(str)) {
/*  488 */         this.b.a(new ir("advMode.setCommand.success", new Object[] { str }));
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(nl ☃) {
/*  495 */     ix.a(☃, this, this.b.s());
/*  496 */     if (!this.d.Y()) {
/*  497 */       this.b.a(new ir("advMode.notEnabled", new Object[0]));
/*      */       return;
/*      */     } 
/*  500 */     if (!this.b.dK()) {
/*  501 */       this.b.a(new ir("advMode.notAllowed", new Object[0]));
/*      */       return;
/*      */     } 
/*  504 */     axh axh = ☃.a(this.b.m);
/*      */     
/*  506 */     if (axh != null) {
/*  507 */       axh.a(☃.b());
/*  508 */       axh.a(☃.c());
/*  509 */       if (!☃.c()) {
/*  510 */         axh.c(null);
/*      */       }
/*  512 */       axh.e();
/*  513 */       this.b.a(new ir("advMode.setCommand.success", new Object[] { ☃.b() }));
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(mx ☃) {
/*  519 */     ix.a(☃, this, this.b.s());
/*  520 */     this.b.bB.d(☃.b());
/*  521 */     this.b.a.a(new jw(-2, this.b.bB.d, this.b.bB.a(this.b.bB.d)));
/*  522 */     this.b.a.a(new jw(-2, ☃.b(), this.b.bB.a(☃.b())));
/*  523 */     this.b.a.a(new le(this.b.bB.d));
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(ne ☃) {
/*  528 */     ix.a(☃, this, this.b.s());
/*  529 */     if (this.b.bE instanceof apw) {
/*  530 */       apw apw = (apw)this.b.bE;
/*  531 */       String str = j.a(☃.b());
/*  532 */       if (str.length() <= 35) {
/*  533 */         apw.a(str);
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(ni ☃) {
/*  540 */     ix.a(☃, this, this.b.s());
/*  541 */     if (this.b.bE instanceof apx) {
/*  542 */       apx apx = (apx)this.b.bE;
/*  543 */       aqx aqx = apx.a(0);
/*  544 */       if (aqx.e()) {
/*  545 */         aqx.a(1);
/*  546 */         ade ade = apx.d();
/*  547 */         ade.b(1, ☃.b());
/*  548 */         ade.b(2, ☃.c());
/*  549 */         ade.g();
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(nn ☃) {
/*  556 */     ix.a(☃, this, this.b.s());
/*  557 */     if (!this.b.dK()) {
/*      */       return;
/*      */     }
/*  560 */     el el = ☃.b();
/*  561 */     blc blc = this.b.m.a_(el);
/*  562 */     bji bji = this.b.m.f(el);
/*  563 */     if (bji instanceof bkf) {
/*  564 */       bkf bkf = (bkf)bji;
/*      */       
/*  566 */       bkf.a(☃.d());
/*  567 */       bkf.a(☃.e());
/*  568 */       bkf.b(☃.f());
/*  569 */       bkf.c(☃.g());
/*  570 */       bkf.b(☃.h());
/*  571 */       bkf.b(☃.i());
/*  572 */       bkf.b(☃.j());
/*  573 */       bkf.a(☃.k());
/*  574 */       bkf.e(☃.l());
/*  575 */       bkf.f(☃.m());
/*  576 */       bkf.a(☃.n());
/*  577 */       bkf.a(☃.o());
/*      */       
/*  579 */       if (bkf.d()) {
/*  580 */         String str = bkf.c();
/*  581 */         if (☃.c() == bkf.a.b) {
/*  582 */           if (bkf.q()) {
/*  583 */             this.b.a(new ir("structure_block.save_success", new Object[] { str }), false);
/*      */           } else {
/*  585 */             this.b.a(new ir("structure_block.save_failure", new Object[] { str }), false);
/*      */           } 
/*  587 */         } else if (☃.c() == bkf.a.c) {
/*  588 */           if (!bkf.D()) {
/*  589 */             this.b.a(new ir("structure_block.load_not_found", new Object[] { str }), false);
/*  590 */           } else if (bkf.r()) {
/*  591 */             this.b.a(new ir("structure_block.load_success", new Object[] { str }), false);
/*      */           } else {
/*  593 */             this.b.a(new ir("structure_block.load_prepare", new Object[] { str }), false);
/*      */           } 
/*  595 */         } else if (☃.c() == bkf.a.d) {
/*  596 */           if (bkf.p()) {
/*  597 */             this.b.a(new ir("structure_block.size_success", new Object[] { str }), false);
/*      */           } else {
/*  599 */             this.b.a(new ir("structure_block.size_failure", new Object[0]), false);
/*      */           } 
/*      */         } 
/*      */       } else {
/*  603 */         this.b.a(new ir("structure_block.invalid_structure_name", new Object[] { ☃.e() }), false);
/*      */       } 
/*      */       
/*  606 */       bkf.g();
/*  607 */       this.b.m.a(el, blc, blc, 3);
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(nh ☃) {
/*  613 */     ix.a(☃, this, this.b.s());
/*  614 */     int i = ☃.b();
/*  615 */     apv apv = this.b.bE;
/*  616 */     if (apv instanceof aqo) {
/*  617 */       ((aqo)apv).d(i);
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(mq ☃) {
/*  623 */     ate ate1 = ☃.b();
/*  624 */     if (ate1.a()) {
/*      */       return;
/*      */     }
/*      */     
/*  628 */     if (!aur.b(ate1.n())) {
/*      */       return;
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*  634 */     ate ate2 = this.b.b(☃.d());
/*  635 */     if (ate2.a()) {
/*      */       return;
/*      */     }
/*      */     
/*  639 */     if (ate1.b() == atf.dy && ate2.b() == atf.dy) {
/*  640 */       if (☃.c()) {
/*  641 */         ate ate = new ate(atf.dz);
/*  642 */         ate.a("author", new hn(this.b.N_().getString()));
/*  643 */         ate.a("title", new hn(ate1.n().l("title")));
/*  644 */         he he = ate1.n().d("pages", 8);
/*  645 */         for (int i = 0; i < he.size(); i++) {
/*  646 */           String str = he.m(i);
/*  647 */           ij ij = new iq(str);
/*  648 */           str = ij.a.a(ij);
/*  649 */           he.b(i, new hn(str));
/*      */         } 
/*  651 */         ate.a("pages", he);
/*  652 */         aew aew = (☃.d() == adk.a) ? aew.a : aew.b;
/*  653 */         this.b.a(aew, ate);
/*      */       } else {
/*  655 */         ate2.a("pages", ate1.n().d("pages", 8));
/*      */       } 
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(mr ☃) {
/*  662 */     ix.a(☃, this, this.b.s());
/*      */     
/*  664 */     if (!this.b.j(2)) {
/*      */       return;
/*      */     }
/*      */     
/*  668 */     aer aer1 = this.b.s().a(☃.c());
/*  669 */     if (aer1 != null) {
/*  670 */       gy gy = aer1.e(new gy());
/*  671 */       this.b.a.a(new lw(☃.b(), gy));
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(mg ☃) {
/*  677 */     ix.a(☃, this, this.b.s());
/*      */     
/*  679 */     if (!this.b.j(2)) {
/*      */       return;
/*      */     }
/*      */     
/*  683 */     bji bji = this.b.s().f(☃.c());
/*  684 */     gy gy = (bji != null) ? bji.a(new gy()) : null;
/*  685 */     this.b.a.a(new lw(☃.b(), gy));
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(mu ☃) {
/*  690 */     ix.a(☃, this, this.b.s());
/*  691 */     if (b(☃)) {
/*  692 */       b(new ir("multiplayer.disconnect.invalid_player_movement", new Object[0]));
/*      */       return;
/*      */     } 
/*  695 */     td td = this.d.a(this.b.ap);
/*      */     
/*  697 */     if (this.b.h) {
/*      */       return;
/*      */     }
/*      */     
/*  701 */     if (this.e == 0) {
/*  702 */       b();
/*      */     }
/*      */     
/*  705 */     if (this.y != null) {
/*      */       
/*  707 */       if (this.e - this.A > 20) {
/*  708 */         this.A = this.e;
/*  709 */         a(this.y.b, this.y.c, this.y.d, this.b.w, this.b.x);
/*      */       } 
/*      */       
/*      */       return;
/*      */     } 
/*  714 */     this.A = this.e;
/*  715 */     if (this.b.aW()) {
/*  716 */       this.b.a(this.b.q, this.b.r, this.b.s, ☃.a(this.b.w), ☃.b(this.b.x));
/*  717 */       this.d.ac().d(this.b);
/*      */       
/*      */       return;
/*      */     } 
/*  721 */     double d1 = this.b.q;
/*  722 */     double d2 = this.b.r;
/*  723 */     double d3 = this.b.s;
/*      */     
/*  725 */     double d4 = this.b.r;
/*      */     
/*  727 */     double d5 = ☃.a(this.b.q);
/*  728 */     double d6 = ☃.b(this.b.r);
/*  729 */     double d7 = ☃.c(this.b.s);
/*      */     
/*  731 */     float f1 = ☃.a(this.b.w);
/*  732 */     float f2 = ☃.b(this.b.x);
/*      */     
/*  734 */     double d8 = d5 - this.l;
/*  735 */     double d9 = d6 - this.m;
/*  736 */     double d10 = d7 - this.n;
/*      */     
/*  738 */     double d11 = this.b.t * this.b.t + this.b.u * this.b.u + this.b.v * this.b.v;
/*  739 */     double d12 = d8 * d8 + d9 * d9 + d10 * d10;
/*      */     
/*  741 */     if (this.b.cL()) {
/*  742 */       if (d12 > 1.0D) {
/*  743 */         a(this.b.q, this.b.r, this.b.s, ☃.a(this.b.w), ☃.b(this.b.x));
/*      */       }
/*      */       
/*      */       return;
/*      */     } 
/*  748 */     this.F++;
/*  749 */     int i = this.F - this.G;
/*  750 */     if (i > 5) {
/*  751 */       c.debug("{} is sending move packets too frequently ({} packets since last tick)", this.b.N_().getString(), Integer.valueOf(i));
/*  752 */       i = 1;
/*      */     } 
/*      */     
/*  755 */     if (!this.b.H() && (
/*  756 */       !this.b.s().X().b("disableElytraMovementCheck") || !this.b.dc())) {
/*      */ 
/*      */       
/*  759 */       float f = this.b.dc() ? 300.0F : 100.0F;
/*  760 */       if (d12 - d11 > (f * i) && (!this.d.H() || !this.d.G().equals(this.b.do().getName()))) {
/*  761 */         c.warn("{} moved too quickly! {},{},{}", this.b.N_().getString(), Double.valueOf(d8), Double.valueOf(d9), Double.valueOf(d10));
/*  762 */         a(this.b.q, this.b.r, this.b.s, this.b.w, this.b.x);
/*      */         
/*      */         return;
/*      */       } 
/*      */     } 
/*      */     
/*  768 */     boolean bool1 = td.c(this.b, this.b.bD().h(0.0625D));
/*      */     
/*  770 */     d8 = d5 - this.o;
/*  771 */     d9 = d6 - this.p;
/*  772 */     d10 = d7 - this.q;
/*      */     
/*  774 */     if (this.b.A && !☃.b() && d9 > 0.0D)
/*      */     {
/*  776 */       this.b.cH();
/*      */     }
/*      */     
/*  779 */     this.b.a(afe.b, d8, d9, d10);
/*  780 */     this.b.A = ☃.b();
/*      */     
/*  782 */     double d13 = d9;
/*      */     
/*  784 */     d8 = d5 - this.b.q;
/*  785 */     d9 = d6 - this.b.r;
/*  786 */     if (d9 > -0.5D || d9 < 0.5D) {
/*  787 */       d9 = 0.0D;
/*      */     }
/*  789 */     d10 = d7 - this.b.s;
/*  790 */     d12 = d8 * d8 + d9 * d9 + d10 * d10;
/*  791 */     boolean bool2 = false;
/*  792 */     if (!this.b.H() && d12 > 0.0625D && !this.b.cL() && !this.b.c.d() && this.b.c.b() != axv.e) {
/*  793 */       bool2 = true;
/*  794 */       c.warn("{} moved wrongly!", this.b.N_().getString());
/*      */     } 
/*      */     
/*  797 */     this.b.a(d5, d6, d7, f1, f2);
/*      */ 
/*      */     
/*  800 */     this.b.k(this.b.q - d1, this.b.r - d2, this.b.s - d3);
/*      */     
/*  802 */     if (!this.b.R && !this.b.cL()) {
/*  803 */       boolean bool = td.c(this.b, this.b.bD().h(0.0625D));
/*  804 */       if (bool1 && (bool2 || !bool)) {
/*  805 */         a(d1, d2, d3, f1, f2);
/*      */         
/*      */         return;
/*      */       } 
/*      */     } 
/*  810 */     this.B = (d13 >= -0.03125D);
/*  811 */     this.B &= (!this.d.X() && !this.b.bV.c) ? 1 : 0;
/*  812 */     this.B &= (!this.b.a(aem.y) && !this.b.dc() && !td.a(this.b.bD().g(0.0625D).b(0.0D, -0.55D, 0.0D))) ? 1 : 0;
/*      */     
/*  814 */     this.b.A = ☃.b();
/*  815 */     this.d.ac().d(this.b);
/*  816 */     this.b.a(this.b.r - d4, ☃.b());
/*      */     
/*  818 */     this.o = this.b.q;
/*  819 */     this.p = this.b.r;
/*  820 */     this.q = this.b.s;
/*      */   }
/*      */   
/*      */   public void a(double ☃, double d1, double d2, float f1, float f2) {
/*  824 */     a(☃, d1, d2, f1, f2, Collections.emptySet());
/*      */   }
/*      */   
/*      */   public void a(double ☃, double d1, double d2, float f1, float f2, Set<kt.a> set) {
/*  828 */     double d3 = set.contains(kt.a.a) ? this.b.q : 0.0D;
/*  829 */     double d4 = set.contains(kt.a.b) ? this.b.r : 0.0D;
/*  830 */     double d5 = set.contains(kt.a.c) ? this.b.s : 0.0D;
/*  831 */     float f3 = set.contains(kt.a.d) ? this.b.w : 0.0F;
/*  832 */     float f4 = set.contains(kt.a.e) ? this.b.x : 0.0F;
/*  833 */     this.y = new cee(☃, d1, d2);
/*      */     
/*  835 */     if (++this.z == Integer.MAX_VALUE) {
/*  836 */       this.z = 0;
/*      */     }
/*  838 */     this.A = this.e;
/*  839 */     this.b.a(☃, d1, d2, f1, f2);
/*  840 */     this.b.a.a(new kt(☃ - d3, d1 - d4, d2 - d5, f1 - f3, f2 - f4, set, this.z));
/*      */   }
/*      */   
/*      */   public void a(na ☃) {
/*      */     double d1, d2, d3, d4;
/*  845 */     ix.a(☃, this, this.b.s());
/*  846 */     td td = this.d.a(this.b.ap);
/*  847 */     el el = ☃.b();
/*  848 */     this.b.z();
/*      */     
/*  850 */     switch (null.b[☃.d().ordinal()]) {
/*      */       case 1:
/*  852 */         if (!this.b.t()) {
/*  853 */           ate ate = this.b.b(adk.b);
/*  854 */           this.b.a(adk.b, this.b.b(adk.a));
/*  855 */           this.b.a(adk.a, ate);
/*      */         } 
/*      */         return;
/*      */       case 2:
/*  859 */         if (!this.b.t()) {
/*  860 */           this.b.a(false);
/*      */         }
/*      */         return;
/*      */       case 3:
/*  864 */         if (!this.b.t()) {
/*  865 */           this.b.a(true);
/*      */         }
/*      */         return;
/*      */       case 4:
/*  869 */         this.b.cZ();
/*      */         return;
/*      */       
/*      */       case 5:
/*      */       case 6:
/*      */       case 7:
/*  875 */         d1 = this.b.q - el.o() + 0.5D;
/*      */ 
/*      */         
/*  878 */         d2 = this.b.r - el.p() + 0.5D + 1.5D;
/*  879 */         d3 = this.b.s - el.q() + 0.5D;
/*  880 */         d4 = d1 * d1 + d2 * d2 + d3 * d3;
/*  881 */         if (d4 > 36.0D) {
/*      */           return;
/*      */         }
/*  884 */         if (el.p() >= this.d.aa()) {
/*      */           return;
/*      */         }
/*      */         break;
/*      */       default:
/*  889 */         throw new IllegalArgumentException("Invalid player action");
/*      */     } 
/*      */     
/*  892 */     if (☃.d() == na.a.a) {
/*  893 */       if (!this.d.a(td, el, this.b) && td.d().a(el)) {
/*  894 */         this.b.c.a(el, ☃.c());
/*      */       } else {
/*  896 */         this.b.a.a(new jk(td, el));
/*      */       } 
/*      */     } else {
/*  899 */       if (☃.d() == na.a.c) {
/*  900 */         this.b.c.a(el);
/*  901 */       } else if (☃.d() == na.a.b) {
/*  902 */         this.b.c.e();
/*      */       } 
/*      */       
/*  905 */       if (!td.a_(el).f()) {
/*  906 */         this.b.a.a(new jk(td, el));
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(nr ☃) {
/*  913 */     ix.a(☃, this, this.b.s());
/*      */     
/*  915 */     td td = this.d.a(this.b.ap);
/*  916 */     adk adk = ☃.d();
/*  917 */     ate ate = this.b.b(adk);
/*  918 */     el el = ☃.b();
/*  919 */     eq eq = ☃.c();
/*  920 */     this.b.z();
/*      */     
/*  922 */     if (el.p() < this.d.aa() - 1 || (eq != eq.b && el.p() < this.d.aa())) {
/*  923 */       if (this.y == null && this.b.d(el.o() + 0.5D, el.p() + 0.5D, el.q() + 0.5D) < 64.0D && 
/*  924 */         !this.d.a(td, el, this.b) && td.d().a(el)) {
/*  925 */         this.b.c.a(this.b, td, ate, adk, el, eq, ☃.e(), ☃.f(), ☃.g());
/*      */       }
/*      */     } else {
/*      */       
/*  929 */       ij ij = (new ir("build.tooHigh", new Object[] { Integer.valueOf(this.d.aa()) })).a(a.m);
/*  930 */       this.b.a.a(new jn(ij, ih.c));
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  936 */     this.b.a.a(new jk(td, el));
/*  937 */     this.b.a.a(new jk(td, el.a(eq)));
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(ns ☃) {
/*  942 */     ix.a(☃, this, this.b.s());
/*      */     
/*  944 */     td td = this.d.a(this.b.ap);
/*  945 */     adk adk = ☃.b();
/*  946 */     ate ate = this.b.b(adk);
/*  947 */     this.b.z();
/*      */     
/*  949 */     if (ate.a()) {
/*      */       return;
/*      */     }
/*      */     
/*  953 */     this.b.c.a(this.b, td, ate, adk);
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(nq ☃) {
/*  958 */     ix.a(☃, this, this.b.s());
/*  959 */     if (this.b.t()) {
/*  960 */       aer aer1 = null;
/*      */       
/*  962 */       for (td td : this.d.w()) {
/*  963 */         aer1 = ☃.a(td);
/*      */         
/*  965 */         if (aer1 != null) {
/*      */           break;
/*      */         }
/*      */       } 
/*      */       
/*  970 */       if (aer1 != null) {
/*  971 */         this.b.a((td)aer1.m, aer1.q, aer1.r, aer1.s, aer1.w, aer1.x);
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(nf ☃) {}
/*      */ 
/*      */   
/*      */   public void a(mw ☃) {
/*  982 */     ix.a(☃, this, this.b.s());
/*  983 */     aer aer1 = this.b.bU();
/*  984 */     if (aer1 instanceof apj) {
/*  985 */       ((apj)aer1).a(☃.b(), ☃.c());
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(ij ☃) {
/*  991 */     c.info("{} lost connection: {}", this.b.N_().getString(), ☃.getString());
/*  992 */     this.d.at();
/*  993 */     this.d.ac().a((new ir("multiplayer.player.left", new Object[] { this.b.O() })).a(a.o));
/*  994 */     this.b.n();
/*  995 */     this.d.ac().e(this.b);
/*      */     
/*  997 */     if (this.d.H() && this.b.N_().getString().equals(this.d.G())) {
/*  998 */       c.info("Stopping singleplayer server as player logged out");
/*  999 */       this.d.p();
/*      */     } 
/*      */   }
/*      */   
/*      */   public void a(iv<?> ☃) {
/* 1004 */     a(☃, (GenericFutureListener<? extends Future<? super Void>>)null);
/*      */   }
/*      */   
/*      */   public void a(iv<?> ☃, @Nullable GenericFutureListener<? extends Future<? super Void>> genericFutureListener) {
/* 1008 */     if (☃ instanceof jn) {
/* 1009 */       jn jn = (jn)☃;
/* 1010 */       aog.b b = this.b.x();
/*      */       
/* 1012 */       if (b == aog.b.c && jn.d() != ih.c) {
/*      */         return;
/*      */       }
/* 1015 */       if (b == aog.b.b && !jn.c()) {
/*      */         return;
/*      */       }
/*      */     } 
/*      */     
/*      */     try {
/* 1021 */       this.a.a(☃, genericFutureListener);
/* 1022 */     } catch (Throwable throwable) {
/* 1023 */       b b = b.a(throwable, "Sending packet");
/* 1024 */       c c = b.a("Packet being sent");
/*      */       
/* 1026 */       c.a("Packet class", () -> ☃.getClass().getCanonicalName());
/*      */       
/* 1028 */       throw new h(b);
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(nj ☃) {
/* 1034 */     ix.a(☃, this, this.b.s());
/* 1035 */     if (☃.b() < 0 || ☃.b() >= aof.j()) {
/* 1036 */       c.warn("{} tried to set an invalid carried item", this.b.N_().getString());
/*      */       return;
/*      */     } 
/* 1039 */     this.b.bB.d = ☃.b();
/* 1040 */     this.b.z();
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(mh ☃) {
/* 1045 */     ix.a(☃, this, this.b.s());
/* 1046 */     if (this.b.x() == aog.b.c) {
/* 1047 */       a(new jn((new ir("chat.cannotSend", new Object[0])).a(a.m)));
/*      */       return;
/*      */     } 
/* 1050 */     this.b.z();
/*      */     
/* 1052 */     String str = ☃.b();
/* 1053 */     str = StringUtils.normalizeSpace(str);
/* 1054 */     for (int i = 0; i < str.length(); i++) {
/* 1055 */       if (!j.a(str.charAt(i))) {
/* 1056 */         b(new ir("multiplayer.disconnect.illegal_characters", new Object[0]));
/*      */         
/*      */         return;
/*      */       } 
/*      */     } 
/* 1061 */     if (str.startsWith("/")) {
/* 1062 */       c(str);
/*      */     } else {
/* 1064 */       ij ij = new ir("chat.type.text", new Object[] { this.b.O(), str });
/* 1065 */       this.d.ac().a(ij, false);
/*      */     } 
/*      */     
/* 1068 */     this.i += 20;
/* 1069 */     if (this.i > 200 && !this.d.ac().h(this.b.do())) {
/* 1070 */       b(new ir("disconnect.spam", new Object[0]));
/*      */     }
/*      */   }
/*      */   
/*      */   private void c(String ☃) {
/* 1075 */     this.d.aI().a(this.b.bX(), ☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(np ☃) {
/* 1080 */     ix.a(☃, this, this.b.s());
/* 1081 */     this.b.z();
/* 1082 */     this.b.a(☃.b());
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(nb ☃) {
/* 1087 */     ix.a(☃, this, this.b.s());
/* 1088 */     this.b.z();
/* 1089 */     switch (null.c[☃.c().ordinal()]) {
/*      */       case 1:
/* 1091 */         this.b.e(true);
/*      */         return;
/*      */       case 2:
/* 1094 */         this.b.e(false);
/*      */         return;
/*      */       case 3:
/* 1097 */         this.b.f(true);
/*      */         return;
/*      */       case 4:
/* 1100 */         this.b.f(false);
/*      */         return;
/*      */       case 5:
/* 1103 */         if (this.b.cL()) {
/* 1104 */           this.b.a(false, true, true);
/* 1105 */           this.y = new cee(this.b.q, this.b.r, this.b.s);
/*      */         } 
/*      */         return;
/*      */       case 6:
/* 1109 */         if (this.b.bU() instanceof afi) {
/* 1110 */           afi afi = (afi)this.b.bU();
/* 1111 */           int i = ☃.d();
/* 1112 */           if (afi.G_() && i > 0) {
/* 1113 */             afi.b(i);
/*      */           }
/*      */         } 
/*      */         return;
/*      */       case 7:
/* 1118 */         if (this.b.bU() instanceof afi) {
/* 1119 */           afi afi = (afi)this.b.bU();
/* 1120 */           afi.I_();
/*      */         } 
/*      */         return;
/*      */       
/*      */       case 8:
/* 1125 */         if (this.b.bU() instanceof ako) {
/* 1126 */           ((ako)this.b.bU()).c(this.b);
/*      */         }
/*      */         return;
/*      */       case 9:
/* 1130 */         if (!this.b.A && this.b.u < 0.0D && !this.b.dc() && !this.b.an()) {
/* 1131 */           ate ate = this.b.b(aew.e);
/* 1132 */           if (ate.b() == atf.eL && asg.e(ate)) {
/* 1133 */             this.b.J();
/*      */           }
/*      */         } else {
/*      */           
/* 1137 */           this.b.K();
/*      */         } 
/*      */         return;
/*      */     } 
/* 1141 */     throw new IllegalArgumentException("Invalid client command!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(ms ☃) {
/* 1157 */     ix.a(☃, this, this.b.s());
/* 1158 */     td td = this.d.a(this.b.ap);
/* 1159 */     aer aer1 = ☃.a(td);
/* 1160 */     this.b.z();
/*      */     
/* 1162 */     if (aer1 != null) {
/* 1163 */       boolean bool = this.b.D(aer1);
/* 1164 */       double d = 36.0D;
/* 1165 */       if (!bool) {
/* 1166 */         d = 9.0D;
/*      */       }
/*      */       
/* 1169 */       if (this.b.h(aer1) < d) {
/* 1170 */         if (☃.b() == ms.a.a) {
/* 1171 */           adk adk = ☃.c();
/* 1172 */           this.b.a(aer1, adk);
/* 1173 */         } else if (☃.b() == ms.a.c) {
/* 1174 */           adk adk = ☃.c();
/* 1175 */           aer1.a(this.b, ☃.d(), adk);
/* 1176 */         } else if (☃.b() == ms.a.b) {
/* 1177 */           if (aer1 instanceof amm || aer1 instanceof aex || aer1 instanceof aok || aer1 == this.b) {
/* 1178 */             b(new ir("multiplayer.disconnect.invalid_entity_attacked", new Object[0]));
/* 1179 */             this.d.e("Player " + this.b.N_().getString() + " tried to attack an invalid entity");
/*      */             
/*      */             return;
/*      */           } 
/* 1183 */           this.b.f(aer1);
/*      */         } 
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(mi ☃) {
/* 1191 */     ix.a(☃, this, this.b.s());
/* 1192 */     this.b.z();
/* 1193 */     mi.a a = ☃.b();
/* 1194 */     switch (null.d[a.ordinal()]) {
/*      */       case 1:
/* 1196 */         if (this.b.h) {
/* 1197 */           this.b.h = false;
/* 1198 */           this.b = this.d.ac().a(this.b, bod.a, true);
/* 1199 */           p.v.a(this.b, bod.c, bod.a); break;
/*      */         } 
/* 1201 */         if (this.b.cq() > 0.0F) {
/*      */           return;
/*      */         }
/* 1204 */         this.b = this.d.ac().a(this.b, bod.a, false);
/* 1205 */         if (this.d.i()) {
/* 1206 */           this.b.a(axv.e);
/* 1207 */           this.b.s().X().a("spectatorsGenerateChunks", "false", this.d);
/*      */         } 
/*      */         break;
/*      */       
/*      */       case 2:
/* 1212 */         this.b.A().a(this.b);
/*      */         break;
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(mo ☃) {
/* 1219 */     ix.a(☃, this, this.b.s());
/* 1220 */     this.b.m();
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(mn ☃) {
/* 1225 */     ix.a(☃, this, this.b.s());
/* 1226 */     this.b.z();
/* 1227 */     if (this.b.bE.d == ☃.b() && this.b.bE.c(this.b)) {
/* 1228 */       if (this.b.t()) {
/* 1229 */         ez<ate> ez = ez.a();
/* 1230 */         for (int i = 0; i < this.b.bE.c.size(); i++) {
/* 1231 */           ez.add(((aqx)this.b.bE.c.get(i)).d());
/*      */         }
/* 1233 */         this.b.a(this.b.bE, ez);
/*      */       } else {
/* 1235 */         ate ate = this.b.bE.a(☃.c(), ☃.d(), ☃.g(), this.b);
/*      */         
/* 1237 */         if (ate.b(☃.f(), ate)) {
/*      */           
/* 1239 */           this.b.a.a(new jr(☃.b(), ☃.e(), true));
/* 1240 */           this.b.f = true;
/* 1241 */           this.b.bE.b();
/* 1242 */           this.b.l();
/* 1243 */           this.b.f = false;
/*      */         } else {
/*      */           
/* 1246 */           this.k.a(this.b.bE.d, Short.valueOf(☃.e()));
/* 1247 */           this.b.a.a(new jr(☃.b(), ☃.e(), false));
/* 1248 */           this.b.bE.a(this.b, false);
/*      */           
/* 1250 */           ez<ate> ez = ez.a();
/* 1251 */           for (int i = 0; i < this.b.bE.c.size(); i++) {
/* 1252 */             ate ate1 = ((aqx)this.b.bE.c.get(i)).d();
/* 1253 */             ez.add(ate1.a() ? ate.a : ate1);
/*      */           } 
/* 1255 */           this.b.a(this.b.bE, ez);
/*      */         } 
/*      */       } 
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(my ☃) {
/* 1263 */     ix.a(☃, this, this.b.s());
/* 1264 */     this.b.z();
/*      */     
/* 1266 */     if (this.b.t() || this.b.bE.d != ☃.b() || !this.b.bE.c(this.b)) {
/*      */       return;
/*      */     }
/*      */     
/* 1270 */     avk avk = this.d.aK().a(☃.c());
/* 1271 */     if (this.b.bE instanceof aqh) {
/* 1272 */       (new pa()).a(this.b, avk, ☃.d());
/*      */     } else {
/* 1274 */       (new oz()).a(this.b, avk, ☃.d());
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(mm ☃) {
/* 1280 */     ix.a(☃, this, this.b.s());
/* 1281 */     this.b.z();
/* 1282 */     if (this.b.bE.d == ☃.b() && this.b.bE.c(this.b) && !this.b.t()) {
/* 1283 */       this.b.bE.a(this.b, ☃.c());
/* 1284 */       this.b.bE.b();
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(nm ☃) {
/* 1290 */     ix.a(☃, this, this.b.s());
/* 1291 */     if (this.b.c.d()) {
/* 1292 */       boolean bool1 = (☃.b() < 0);
/* 1293 */       ate ate = ☃.c();
/*      */       
/* 1295 */       gy gy = ate.b("BlockEntityTag");
/* 1296 */       if (!ate.a() && gy != null && 
/* 1297 */         gy.e("x") && gy.e("y") && gy.e("z")) {
/* 1298 */         el el = new el(gy.h("x"), gy.h("y"), gy.h("z"));
/* 1299 */         bji bji = this.b.m.f(el);
/* 1300 */         if (bji != null) {
/* 1301 */           gy gy1 = bji.a(new gy());
/* 1302 */           gy1.r("x");
/* 1303 */           gy1.r("y");
/* 1304 */           gy1.r("z");
/* 1305 */           ate.a("BlockEntityTag", gy1);
/*      */         } 
/*      */       } 
/*      */ 
/*      */       
/* 1310 */       boolean bool2 = (☃.b() >= 1 && ☃.b() <= 45);
/* 1311 */       boolean bool3 = (ate.a() || (ate.g() >= 0 && ate.C() <= 64 && !ate.a()));
/*      */       
/* 1313 */       if (bool2 && bool3) {
/* 1314 */         if (ate.a()) {
/* 1315 */           this.b.bD.a(☃.b(), ate.a);
/*      */         } else {
/* 1317 */           this.b.bD.a(☃.b(), ate);
/*      */         } 
/* 1319 */         this.b.bD.a(this.b, true);
/* 1320 */       } else if (bool1 && bool3 && 
/* 1321 */         this.j < 200) {
/* 1322 */         this.j += 20;
/*      */         
/* 1324 */         amm amm = this.b.a(ate, true);
/* 1325 */         if (amm != null) {
/* 1326 */           amm.f();
/*      */         }
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(ml ☃) {
/* 1335 */     ix.a(☃, this, this.b.s());
/* 1336 */     Short short_ = this.k.a(this.b.bE.d);
/* 1337 */     if (short_ != null && ☃.c() == short_.shortValue() && this.b.bE.d == ☃.b() && !this.b.bE.c(this.b) && !this.b.t()) {
/* 1338 */       this.b.bE.a(this.b, true);
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(no ☃) {
/* 1344 */     ix.a(☃, this, this.b.s());
/* 1345 */     this.b.z();
/* 1346 */     td td = this.d.a(this.b.ap);
/* 1347 */     el el = ☃.b();
/* 1348 */     if (td.D(el)) {
/* 1349 */       blc blc = td.a_(el);
/* 1350 */       bji bji = td.f(el);
/*      */       
/* 1352 */       if (!(bji instanceof bkc)) {
/*      */         return;
/*      */       }
/*      */       
/* 1356 */       bkc bkc = (bkc)bji;
/* 1357 */       if (!bkc.d() || bkc.e() != this.b) {
/* 1358 */         this.d.e("Player " + this.b.N_().getString() + " just tried to change non-editable sign");
/*      */         
/*      */         return;
/*      */       } 
/* 1362 */       String[] arrayOfString = ☃.c();
/* 1363 */       for (int i = 0; i < arrayOfString.length; i++) {
/* 1364 */         bkc.a(i, new iq(a.b(arrayOfString[i])));
/*      */       }
/*      */       
/* 1367 */       bkc.g();
/* 1368 */       td.a(el, blc, blc, 3);
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(mt ☃) {
/* 1374 */     if (this.g && ☃.b() == this.h) {
/* 1375 */       int i = (int)(k.b() - this.f);
/* 1376 */       this.b.g = (this.b.g * 3 + i) / 4;
/* 1377 */       this.g = false;
/*      */     }
/* 1379 */     else if (!this.b.N_().getString().equals(this.d.G())) {
/* 1380 */       b(new ir("disconnect.timeout", new Object[0]));
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(mz ☃) {
/* 1387 */     ix.a(☃, this, this.b.s());
/* 1388 */     this.b.bV.b = (☃.c() && this.b.bV.c);
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(mj ☃) {
/* 1393 */     ix.a(☃, this, this.b.s());
/* 1394 */     this.b.a(☃);
/*      */   }
/*      */   
/*      */   public void a(mp ☃) {}
/*      */ }


/* Location:              F:\dw\server.jar\\uc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */