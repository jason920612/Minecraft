/*      */ import com.google.common.collect.Lists;
/*      */ import com.mojang.authlib.GameProfile;
/*      */ import io.netty.buffer.Unpooled;
/*      */ import io.netty.util.concurrent.Future;
/*      */ import java.util.Collection;
/*      */ import java.util.Iterator;
/*      */ import java.util.List;
/*      */ import java.util.Random;
/*      */ import javax.annotation.Nullable;
/*      */ import net.minecraft.server.MinecraftServer;
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
/*      */ public class tf
/*      */   extends aog
/*      */   implements aqb
/*      */ {
/*  121 */   private static final Logger cc = LogManager.getLogger();
/*  122 */   private String cd = "en_US";
/*      */   public uc a;
/*      */   public final MinecraftServer b;
/*      */   public final tg c;
/*      */   public double d;
/*      */   public double e;
/*  128 */   private final List<Integer> ce = Lists.newLinkedList();
/*      */   private final pm cf;
/*      */   private final wo cg;
/*  131 */   private float ch = Float.MIN_VALUE;
/*  132 */   private int ci = Integer.MIN_VALUE;
/*  133 */   private int cj = Integer.MIN_VALUE;
/*  134 */   private int ck = Integer.MIN_VALUE;
/*  135 */   private int cl = Integer.MIN_VALUE;
/*  136 */   private int cm = Integer.MIN_VALUE;
/*  137 */   private float cn = -1.0E8F;
/*  138 */   private int co = -99999999;
/*      */   private boolean cp = true;
/*  140 */   private int cq = -99999999;
/*  141 */   private int cr = 60;
/*      */   private aog.b cs;
/*      */   private boolean ct = true;
/*  144 */   private long cu = k.b();
/*      */   
/*      */   private aer cv;
/*      */   
/*      */   private boolean cw;
/*      */   private boolean cx;
/*      */   private final wn cy;
/*      */   private cee cz;
/*      */   private int cA;
/*      */   
/*      */   public tf(MinecraftServer ☃, td td1, GameProfile gameProfile, tg tg1) {
/*  155 */     super(td1, gameProfile);
/*  156 */     tg1.b = this;
/*  157 */     this.c = tg1;
/*      */     
/*  159 */     this.b = ☃;
/*  160 */     this.cy = new wn(☃.aK());
/*  161 */     this.cg = ☃.ac().a(this);
/*  162 */     this.cf = ☃.ac().h(this);
/*  163 */     this.Q = 1.0F;
/*      */     
/*  165 */     a(td1);
/*      */   }
/*      */   private boolean cB; private cee cC; private int cD; public boolean f; public int g; public boolean h;
/*      */   private void a(td ☃) {
/*  169 */     el el = ☃.n();
/*      */     
/*  171 */     if (☃.t.g() && ☃.g().q() != axv.d) {
/*  172 */       int i = Math.max(0, this.b.a(☃));
/*  173 */       int j = xq.c(☃.d().b(el.o(), el.q()));
/*  174 */       if (j < i) {
/*  175 */         i = j;
/*      */       }
/*  177 */       if (j <= 1) {
/*  178 */         i = 1;
/*      */       }
/*      */       
/*  181 */       int k = (i * 2 + 1) * (i * 2 + 1);
/*  182 */       int m = r(k);
/*  183 */       int n = (new Random()).nextInt(k);
/*      */       
/*  185 */       for (int i1 = 0; i1 < k; i1++) {
/*  186 */         int i2 = (n + m * i1) % k;
/*  187 */         int i3 = i2 % (i * 2 + 1);
/*  188 */         int i4 = i2 / (i * 2 + 1);
/*      */         
/*  190 */         el el1 = ☃.o().a(el.o() + i3 - i, el.q() + i4 - i, false);
/*      */         
/*  192 */         if (el1 != null) {
/*  193 */           a(el1, 0.0F, 0.0F);
/*  194 */           if (☃.c(this, bD())) {
/*      */             break;
/*      */           }
/*      */         } 
/*      */       } 
/*      */     } else {
/*  200 */       a(el, 0.0F, 0.0F);
/*  201 */       while (!☃.c(this, bD()) && this.r < 255.0D) {
/*  202 */         b(this.q, this.r + 1.0D, this.s);
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   private int r(int ☃) {
/*  209 */     return (☃ <= 16) ? (☃ - 1) : 17;
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(gy ☃) {
/*  214 */     super.a(☃);
/*      */     
/*  216 */     if (☃.c("playerGameType", 99)) {
/*  217 */       if (bK().am()) {
/*  218 */         this.c.a(bK().g());
/*      */       } else {
/*  220 */         this.c.a(axv.a(☃.h("playerGameType")));
/*      */       } 
/*      */     }
/*      */     
/*  224 */     if (☃.c("enteredNetherPosition", 10)) {
/*  225 */       gy gy1 = ☃.p("enteredNetherPosition");
/*  226 */       this.cC = new cee(gy1.k("x"), gy1.k("y"), gy1.k("z"));
/*      */     } 
/*      */     
/*  229 */     this.cx = ☃.q("seenCredits");
/*      */     
/*  231 */     if (☃.c("recipeBook", 10)) {
/*  232 */       this.cy.a(☃.p("recipeBook"));
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public void b(gy ☃) {
/*  238 */     super.b(☃);
/*      */     
/*  240 */     ☃.b("playerGameType", this.c.b().a());
/*  241 */     ☃.a("seenCredits", this.cx);
/*      */     
/*  243 */     if (this.cC != null) {
/*  244 */       gy gy1 = new gy();
/*  245 */       gy1.a("x", this.cC.b);
/*  246 */       gy1.a("y", this.cC.c);
/*  247 */       gy1.a("z", this.cC.d);
/*  248 */       ☃.a("enteredNetherPosition", gy1);
/*      */     } 
/*      */     
/*  251 */     aer aer1 = bS();
/*  252 */     aer aer2 = bU();
/*  253 */     if (aer2 != null && aer1 != this && aer1.bR()) {
/*  254 */       gy gy1 = new gy();
/*  255 */       gy gy2 = new gy();
/*  256 */       aer1.d(gy2);
/*      */       
/*  258 */       gy1.a("Attach", aer2.bt());
/*  259 */       gy1.a("Entity", gy2);
/*  260 */       ☃.a("RootVehicle", gy1);
/*      */     } 
/*      */     
/*  263 */     ☃.a("recipeBook", this.cy.e());
/*      */   }
/*      */   
/*      */   public void a(int ☃) {
/*  267 */     float f1 = dv();
/*  268 */     float f2 = (f1 - 1.0F) / f1;
/*  269 */     this.bY = xq.a(☃ / f1, 0.0F, f2);
/*  270 */     this.cq = -1;
/*      */   }
/*      */   
/*      */   public void b(int ☃) {
/*  274 */     this.bW = ☃;
/*  275 */     this.cq = -1;
/*      */   }
/*      */ 
/*      */   
/*      */   public void c(int ☃) {
/*  280 */     super.c(☃);
/*  281 */     this.cq = -1;
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(ate ☃, int i) {
/*  286 */     super.a(☃, i);
/*  287 */     this.cq = -1;
/*      */   }
/*      */   
/*      */   public void u_() {
/*  291 */     this.bE.a(this);
/*      */   }
/*      */ 
/*      */   
/*      */   public void v_() {
/*  296 */     super.v_();
/*      */     
/*  298 */     this.a.a(new kq(cu(), kq.a.a));
/*      */   }
/*      */ 
/*      */   
/*      */   public void f() {
/*  303 */     super.f();
/*      */     
/*  305 */     this.a.a(new kq(cu(), kq.a.b));
/*      */   }
/*      */ 
/*      */   
/*      */   protected void a(blc ☃) {
/*  310 */     p.d.a(this, ☃);
/*      */   }
/*      */ 
/*      */   
/*      */   protected atb g() {
/*  315 */     return new atv(this);
/*      */   }
/*      */ 
/*      */   
/*      */   public void R_() {
/*  320 */     this.c.a();
/*      */     
/*  322 */     this.cr--;
/*  323 */     if (this.Y > 0) {
/*  324 */       this.Y--;
/*      */     }
/*  326 */     this.bE.b();
/*      */     
/*  328 */     if (!this.m.B && 
/*  329 */       !this.bE.a(this)) {
/*  330 */       w_();
/*  331 */       this.bE = this.bD;
/*      */     } 
/*      */ 
/*      */     
/*  335 */     while (!this.ce.isEmpty()) {
/*  336 */       int i = Math.min(this.ce.size(), 2147483647);
/*  337 */       int[] arrayOfInt = new int[i];
/*  338 */       Iterator<Integer> iterator = this.ce.iterator();
/*  339 */       int j = 0;
/*      */       
/*  341 */       while (iterator.hasNext() && j < i) {
/*  342 */         arrayOfInt[j++] = ((Integer)iterator.next()).intValue();
/*  343 */         iterator.remove();
/*      */       } 
/*      */       
/*  346 */       this.a.a(new kw(arrayOfInt));
/*      */     } 
/*      */     
/*  349 */     aer ☃ = D();
/*  350 */     if (☃ != this) {
/*  351 */       if (☃.aF()) {
/*  352 */         a(☃.q, ☃.r, ☃.s, ☃.w, ☃.x);
/*  353 */         this.b.ac().d(this);
/*  354 */         if (aZ()) {
/*  355 */           e(this);
/*      */         }
/*      */       } else {
/*  358 */         e(this);
/*      */       } 
/*      */     }
/*      */     
/*  362 */     p.w.a(this);
/*  363 */     if (this.cz != null) {
/*  364 */       p.u.a(this, this.cz, this.U - this.cA);
/*      */     }
/*      */     
/*  367 */     this.cf.b(this);
/*      */   }
/*      */   
/*      */   public void i() {
/*      */     try {
/*  372 */       super.R_();
/*      */       
/*  374 */       for (int ☃ = 0; ☃ < this.bB.T_(); ☃++) {
/*  375 */         ate ate = this.bB.a(☃);
/*  376 */         if (ate.b().W_()) {
/*  377 */           iv<?> iv = ((arx)ate.b()).a(ate, this.m, this);
/*  378 */           if (iv != null) {
/*  379 */             this.a.a(iv);
/*      */           }
/*      */         } 
/*      */       } 
/*      */       
/*  384 */       if (cq() != this.cn || this.co != this.bF.a() || ((this.bF.e() == 0.0F)) != this.cp) {
/*  385 */         this.a.a(new ll(cq(), this.bF.a(), this.bF.e()));
/*  386 */         this.cn = cq();
/*  387 */         this.co = this.bF.a();
/*  388 */         this.cp = (this.bF.e() == 0.0F);
/*      */       } 
/*      */       
/*  391 */       if (cq() + cQ() != this.ch) {
/*  392 */         this.ch = cq() + cQ();
/*  393 */         a(cff.g, xq.f(this.ch));
/*      */       } 
/*      */       
/*  396 */       if (this.bF.a() != this.ci) {
/*  397 */         this.ci = this.bF.a();
/*  398 */         a(cff.h, xq.f(this.ci));
/*      */       } 
/*      */       
/*  401 */       if (bg() != this.cj) {
/*  402 */         this.cj = bg();
/*  403 */         a(cff.i, xq.f(this.cj));
/*      */       } 
/*      */       
/*  406 */       if (ct() != this.ck) {
/*  407 */         this.ck = ct();
/*  408 */         a(cff.j, xq.f(this.ck));
/*      */       } 
/*      */       
/*  411 */       if (this.bX != this.cm) {
/*  412 */         this.cm = this.bX;
/*  413 */         a(cff.k, xq.f(this.cm));
/*      */       } 
/*      */       
/*  416 */       if (this.bW != this.cl) {
/*  417 */         this.cl = this.bW;
/*  418 */         a(cff.l, xq.f(this.cl));
/*      */       } 
/*      */       
/*  421 */       if (this.bX != this.cq) {
/*  422 */         this.cq = this.bX;
/*  423 */         this.a.a(new lk(this.bY, this.bX, this.bW));
/*      */       } 
/*      */       
/*  426 */       if (this.U % 20 == 0) {
/*  427 */         p.p.a(this);
/*      */       }
/*  429 */     } catch (Throwable ☃) {
/*  430 */       b b1 = b.a(☃, "Ticking player");
/*  431 */       c c = b1.a("Player being ticked");
/*      */       
/*  433 */       a(c);
/*      */       
/*  435 */       throw new h(b1);
/*      */     } 
/*      */   }
/*      */   
/*      */   private void a(cff ☃, int i) {
/*  440 */     dB().a(☃, bv(), cfb1 -> cfb1.c(☃));
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(aea ☃) {
/*  445 */     boolean bool = this.m.X().b("showDeathMessages");
/*      */     
/*  447 */     if (bool) {
/*  448 */       ij ij = cu().b();
/*  449 */       this.a.a(new kq(cu(), kq.a.c, ij), future -> {
/*      */             if (!future.isSuccess()) {
/*      */               int i = 256;
/*      */               
/*      */               String str = ☃.a(256);
/*      */               
/*      */               ij ij1 = new ir("death.attack.message_too_long", new Object[] { (new iq(str)).a(a.o) });
/*      */               ij ij2 = (new ir("death.attack.even_more_magic", new Object[] { O() })).a(());
/*      */               this.a.a(new kq(cu(), kq.a.c, ij2));
/*      */             } 
/*      */           });
/*  460 */       cfe cfe = be();
/*  461 */       if (cfe == null || cfe.k() == cfe.b.a) {
/*  462 */         this.b.ac().a(ij);
/*  463 */       } else if (cfe.k() == cfe.b.c) {
/*  464 */         this.b.ac().a(this, ij);
/*  465 */       } else if (cfe.k() == cfe.b.d) {
/*  466 */         this.b.ac().b(this, ij);
/*      */       } 
/*      */     } else {
/*  469 */       this.a.a(new kq(cu(), kq.a.c));
/*      */     } 
/*  471 */     dA();
/*  472 */     if (!this.m.X().b("keepInventory") && !t()) {
/*  473 */       dj();
/*  474 */       this.bB.q();
/*      */     } 
/*      */     
/*  477 */     dB().a(cff.d, bv(), cfb::a);
/*      */     
/*  479 */     afa afa = cv();
/*  480 */     if (afa != null) {
/*  481 */       b(ws.h.b(afa.P()));
/*  482 */       afa.a(this, this.be, ☃);
/*      */     } 
/*  484 */     a(ws.L);
/*  485 */     a(ws.i.b(ws.l));
/*  486 */     a(ws.i.b(ws.m));
/*  487 */     Z();
/*  488 */     b(0, false);
/*  489 */     cu().g();
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(aer ☃, int i, aea aea1) {
/*  494 */     if (☃ == this) {
/*      */       return;
/*      */     }
/*  497 */     super.a(☃, i, aea1);
/*  498 */     q(i);
/*      */     
/*  500 */     String str1 = bv();
/*  501 */     String str2 = ☃.bv();
/*      */     
/*  503 */     dB().a(cff.f, str1, cfb::a);
/*      */     
/*  505 */     if (☃ instanceof aog) {
/*  506 */       a(ws.O);
/*  507 */       dB().a(cff.e, str1, cfb::a);
/*      */     } else {
/*  509 */       a(ws.M);
/*      */     } 
/*      */     
/*  512 */     a(str1, str2, cff.m);
/*  513 */     a(str2, str1, cff.n);
/*      */     
/*  515 */     p.b.a(this, ☃, aea1);
/*      */   }
/*      */   
/*      */   private void a(String ☃, String str1, cff[] arrayOfCff) {
/*  519 */     cfa cfa = dB().i(str1);
/*  520 */     if (cfa != null) {
/*  521 */       int i = cfa.n().b();
/*  522 */       if (i >= 0 && i < arrayOfCff.length) {
/*  523 */         dB().a(arrayOfCff[i], ☃, cfb::a);
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean a(aea ☃, float f) {
/*  530 */     if (b(☃)) {
/*  531 */       return false;
/*      */     }
/*      */     
/*  534 */     boolean bool = (this.b.Q() && dL() && "fall".equals(☃.v));
/*  535 */     if (!bool && this.cr > 0 && ☃ != aea.m) {
/*  536 */       return false;
/*      */     }
/*      */     
/*  539 */     if (☃ instanceof aeb) {
/*  540 */       aer aer1 = ☃.k();
/*      */       
/*  542 */       if (aer1 instanceof aog && !a((aog)aer1)) {
/*  543 */         return false;
/*      */       }
/*  545 */       if (aer1 instanceof aok) {
/*  546 */         aok aok = (aok)aer1;
/*  547 */         aer aer2 = aok.k();
/*  548 */         if (aer2 instanceof aog && !a((aog)aer2)) {
/*  549 */           return false;
/*      */         }
/*      */       } 
/*      */     } 
/*  553 */     return super.a(☃, f);
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean a(aog ☃) {
/*  558 */     if (!dL()) {
/*  559 */       return false;
/*      */     }
/*  561 */     return super.a(☃);
/*      */   }
/*      */   
/*      */   private boolean dL() {
/*  565 */     return this.b.W();
/*      */   }
/*      */ 
/*      */   
/*      */   @Nullable
/*      */   public aer a(bod ☃) {
/*  571 */     this.cw = true;
/*      */     
/*  573 */     if (this.ap == bod.a && ☃ == bod.b) {
/*  574 */       this.cC = new cee(this.q, this.r, this.s);
/*  575 */     } else if (this.ap != bod.b && ☃ != bod.a) {
/*  576 */       this.cC = null;
/*      */     } 
/*      */     
/*  579 */     if (this.ap == bod.c && ☃ == bod.c) {
/*  580 */       this.m.e(this);
/*  581 */       if (!this.h) {
/*  582 */         this.h = true;
/*  583 */         this.a.a(new ke(4, this.cx ? 0.0F : 1.0F));
/*  584 */         this.cx = true;
/*      */       } 
/*  586 */       return this;
/*      */     } 
/*  588 */     if (this.ap == bod.a && ☃ == bod.c) {
/*  589 */       ☃ = bod.c;
/*      */     }
/*      */     
/*  592 */     this.b.ac().a(this, ☃);
/*  593 */     this.a.a(new kh(1032, el.a, 0, false));
/*      */     
/*  595 */     this.cq = -1;
/*  596 */     this.cn = -1.0F;
/*  597 */     this.co = -1;
/*  598 */     return this;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean a(tf ☃) {
/*  604 */     if (☃.t()) {
/*  605 */       return (D() == this);
/*      */     }
/*      */     
/*  608 */     if (t()) {
/*  609 */       return false;
/*      */     }
/*      */     
/*  612 */     return super.a(☃);
/*      */   }
/*      */   
/*      */   private void a(bji ☃) {
/*  616 */     if (☃ != null) {
/*  617 */       ji ji = ☃.Z_();
/*  618 */       if (ji != null) {
/*  619 */         this.a.a(ji);
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(aer ☃, int i) {
/*  626 */     super.a(☃, i);
/*  627 */     this.bE.b();
/*      */   }
/*      */ 
/*      */   
/*      */   public aog.a a(el ☃) {
/*  632 */     aog.a a = super.a(☃);
/*  633 */     if (a == aog.a.a) {
/*  634 */       a(ws.an);
/*  635 */       iv<?> iv = new ku(this, ☃);
/*  636 */       s().A().a(this, iv);
/*  637 */       this.a.a(this.q, this.r, this.s, this.w, this.x);
/*  638 */       this.a.a(iv);
/*  639 */       p.q.a(this);
/*      */     } 
/*  641 */     return a;
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(boolean ☃, boolean bool1, boolean bool2) {
/*  646 */     if (cL()) {
/*  647 */       s().A().b(this, new jf(this, 2));
/*      */     }
/*  649 */     super.a(☃, bool1, bool2);
/*  650 */     if (this.a != null) {
/*  651 */       this.a.a(this.q, this.r, this.s, this.w, this.x);
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean a(aer ☃, boolean bool) {
/*  657 */     aer aer1 = bU();
/*      */     
/*  659 */     if (!super.a(☃, bool)) {
/*  660 */       return false;
/*      */     }
/*      */     
/*  663 */     aer aer2 = bU();
/*  664 */     if (aer2 != aer1 && this.a != null) {
/*  665 */       this.a.a(this.q, this.r, this.s, this.w, this.x);
/*      */     }
/*      */     
/*  668 */     return true;
/*      */   }
/*      */ 
/*      */   
/*      */   public void S_() {
/*  673 */     aer ☃ = bU();
/*  674 */     super.S_();
/*      */     
/*  676 */     aer aer1 = bU();
/*  677 */     if (aer1 != ☃ && this.a != null) {
/*  678 */       this.a.a(this.q, this.r, this.s, this.w, this.x);
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean b(aea ☃) {
/*  684 */     return (super.b(☃) || H());
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   protected void a(double ☃, boolean bool, blc blc1, el el1) {}
/*      */ 
/*      */ 
/*      */   
/*      */   protected void b(el ☃) {
/*  694 */     if (!t()) {
/*  695 */       super.b(☃);
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(double ☃, boolean bool) {
/*  703 */     int i = xq.c(this.q);
/*  704 */     int j = xq.c(this.r - 0.20000000298023224D);
/*  705 */     int k = xq.c(this.s);
/*      */     
/*  707 */     el el = new el(i, j, k);
/*  708 */     blc blc = this.m.a_(el);
/*  709 */     if (blc.f()) {
/*  710 */       el el1 = el.b();
/*  711 */       blc blc1 = this.m.a_(el1);
/*  712 */       bcs bcs = blc1.c();
/*  713 */       if (bcs instanceof ber || bcs instanceof bis || bcs instanceof bes) {
/*  714 */         el = el1;
/*  715 */         blc = blc1;
/*      */       } 
/*      */     } 
/*      */     
/*  719 */     super.a(☃, bool, blc, el);
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(bkc ☃) {
/*  724 */     ☃.a(this);
/*  725 */     this.a.a(new kn(☃.v()));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void dM() {
/*  734 */     this.cD = this.cD % 100 + 1;
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(adl ☃) {
/*  739 */     if (☃ instanceof ads && ((ads)☃).Q_() != null && t()) {
/*  740 */       a((new ir("container.spectatorCantOpen", new Object[0])).a(a.m), true);
/*      */       
/*      */       return;
/*      */     } 
/*  744 */     dM();
/*  745 */     this.a.a(new jt(this.cD, ☃.l(), ☃.O()));
/*  746 */     this.bE = ☃.a(this.bB, this);
/*  747 */     this.bE.d = this.cD;
/*  748 */     this.bE.a(this);
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(ade ☃) {
/*  753 */     if (☃ instanceof ads && ((ads)☃).Q_() != null && t()) {
/*  754 */       a((new ir("container.spectatorCantOpen", new Object[0])).a(a.m), true);
/*      */       
/*      */       return;
/*      */     } 
/*  758 */     if (this.bE != this.bD) {
/*  759 */       w_();
/*      */     }
/*      */     
/*  762 */     if (☃ instanceof adq) {
/*  763 */       adq adq = (adq)☃;
/*      */       
/*  765 */       if (adq.V_() && !a(adq.j()) && !t()) {
/*  766 */         this.a.a(new jn(new ir("container.isLocked", new Object[] { ☃.O() }), ih.c));
/*  767 */         this.a.a(new lt(wj.au, wk.e, this.q, this.r, this.s, 1.0F, 1.0F));
/*      */         
/*      */         return;
/*      */       } 
/*      */     } 
/*  772 */     dM();
/*      */     
/*  774 */     if (☃ instanceof adl) {
/*  775 */       this.a.a(new jt(this.cD, ((adl)☃).l(), ☃.O(), ☃.T_()));
/*  776 */       this.bE = ((adl)☃).a(this.bB, this);
/*      */     } else {
/*  778 */       this.a.a(new jt(this.cD, "minecraft:container", ☃.O(), ☃.T_()));
/*  779 */       this.bE = new apz(this.bB, ☃, this);
/*      */     } 
/*      */     
/*  782 */     this.bE.d = this.cD;
/*  783 */     this.bE.a(this);
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(axd ☃) {
/*  788 */     dM();
/*  789 */     this.bE = new aqo(this.bB, ☃, this.m);
/*  790 */     this.bE.d = this.cD;
/*  791 */     this.bE.a(this);
/*  792 */     ade ade = ((aqo)this.bE).d();
/*      */     
/*  794 */     ij ij = ☃.O();
/*  795 */     this.a.a(new jt(this.cD, "minecraft:villager", ij, ade.T_()));
/*      */     
/*  797 */     axf axf = ☃.b_(this);
/*  798 */     if (axf != null) {
/*  799 */       hy hy = new hy(Unpooled.buffer());
/*      */       
/*  801 */       hy.writeInt(this.cD);
/*  802 */       axf.a(hy);
/*      */       
/*  804 */       this.a.a(new jy(jy.a, hy));
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(ako ☃, ade ade1) {
/*  810 */     if (this.bE != this.bD) {
/*  811 */       w_();
/*      */     }
/*  813 */     dM();
/*  814 */     this.a.a(new jt(this.cD, "EntityHorse", ade1.O(), ade1.T_(), ☃.Q()));
/*  815 */     this.bE = new aql(this.bB, ade1, ☃, this);
/*  816 */     this.bE.d = this.cD;
/*  817 */     this.bE.a(this);
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(ate ☃, adk adk1) {
/*  822 */     ata ata = ☃.b();
/*      */     
/*  824 */     if (ata == atf.dz) {
/*  825 */       hy hy = new hy(Unpooled.buffer());
/*  826 */       hy.a(adk1);
/*  827 */       this.a.a(new jy(jy.c, hy));
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(bjm ☃) {
/*  833 */     ☃.c(true);
/*  834 */     a(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(apv ☃, int i, ate ate1) {
/*  839 */     if (☃.a(i) instanceof aqu) {
/*      */       return;
/*      */     }
/*      */     
/*  843 */     if (☃ == this.bD) {
/*  844 */       p.e.a(this, this.bB);
/*      */     }
/*      */     
/*  847 */     if (this.f) {
/*      */       return;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  855 */     this.a.a(new jw(☃.d, i, ate1));
/*      */   }
/*      */   
/*      */   public void a(apv ☃) {
/*  859 */     a(☃, ☃.a());
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(apv ☃, ez<ate> ez1) {
/*  864 */     this.a.a(new ju(☃.d, ez1));
/*  865 */     this.a.a(new jw(-1, -1, this.bB.s()));
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(apv ☃, int i, int j) {
/*  870 */     this.a.a(new jv(☃.d, i, j));
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(apv ☃, ade ade1) {
/*  875 */     for (int i = 0; i < ade1.h(); i++) {
/*  876 */       this.a.a(new jv(☃.d, i, ade1.c(i)));
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public void w_() {
/*  882 */     this.a.a(new js(this.bE.d));
/*  883 */     m();
/*      */   }
/*      */   
/*      */   public void l() {
/*  887 */     if (this.f) {
/*      */       return;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  894 */     this.a.a(new jw(-1, -1, this.bB.s()));
/*      */   }
/*      */   
/*      */   public void m() {
/*  898 */     this.bE.b(this);
/*  899 */     this.bE = this.bD;
/*      */   }
/*      */   
/*      */   public void a(float ☃, float f1, boolean bool1, boolean bool2) {
/*  903 */     if (aW()) {
/*  904 */       if (☃ >= -1.0F && ☃ <= 1.0F) {
/*  905 */         this.bh = ☃;
/*      */       }
/*  907 */       if (f1 >= -1.0F && f1 <= 1.0F) {
/*  908 */         this.bj = f1;
/*      */       }
/*  910 */       this.bg = bool1;
/*  911 */       e(bool2);
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(wp<?> ☃, int i) {
/*  917 */     this.cg.b(this, ☃, i);
/*  918 */     dB().a(☃, bv(), cfb1 -> cfb1.a(☃));
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(wp<?> ☃) {
/*  923 */     this.cg.a(this, ☃, 0);
/*  924 */     dB().a(☃, bv(), cfb::c);
/*      */   }
/*      */ 
/*      */   
/*      */   public int a(Collection<avk> ☃) {
/*  929 */     return this.cy.a(☃, this);
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(pc[] ☃) {
/*  934 */     List<avk> list = Lists.newArrayList();
/*  935 */     for (pc pc1 : ☃) {
/*  936 */       avk avk = this.b.aK().a(pc1);
/*  937 */       if (avk != null) {
/*  938 */         list.add(avk);
/*      */       }
/*      */     } 
/*      */     
/*  942 */     a(list);
/*      */   }
/*      */ 
/*      */   
/*      */   public int b(Collection<avk> ☃) {
/*  947 */     return this.cy.b(☃, this);
/*      */   }
/*      */ 
/*      */   
/*      */   public void d(int ☃) {
/*  952 */     super.d(☃);
/*  953 */     this.cq = -1;
/*      */   }
/*      */   
/*      */   public void n() {
/*  957 */     this.cB = true;
/*  958 */     aL();
/*  959 */     if (this.bQ) {
/*  960 */       a(true, false, false);
/*      */     }
/*      */   }
/*      */   
/*      */   public boolean o() {
/*  965 */     return this.cB;
/*      */   }
/*      */   
/*      */   public void p() {
/*  969 */     this.cn = -1.0E8F;
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(ij ☃, boolean bool) {
/*  974 */     this.a.a(new jn(☃, bool ? ih.c : ih.a));
/*      */   }
/*      */ 
/*      */   
/*      */   protected void q() {
/*  979 */     if (!this.bt.a() && cT()) {
/*  980 */       this.a.a(new kb(this, (byte)9));
/*  981 */       super.q();
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(ca.a ☃, cee cee1) {
/*  987 */     super.a(☃, cee1);
/*  988 */     this.a.a(new ks(☃, cee1.b, cee1.c, cee1.d));
/*      */   }
/*      */   
/*      */   public void a(ca.a ☃, aer aer1, ca.a a1) {
/*  992 */     cee cee1 = a1.a(aer1);
/*  993 */     super.a(☃, cee1);
/*  994 */     this.a.a(new ks(☃, aer1, a1));
/*      */   }
/*      */   
/*      */   public void a(tf ☃, boolean bool) {
/*  998 */     if (bool) {
/*  999 */       this.bB.a(☃.bB);
/*      */       
/* 1001 */       l(☃.cq());
/* 1002 */       this.bF = ☃.bF;
/*      */       
/* 1004 */       this.bW = ☃.bW;
/* 1005 */       this.bX = ☃.bX;
/* 1006 */       this.bY = ☃.bY;
/*      */       
/* 1008 */       p(☃.di());
/* 1009 */       this.aq = ☃.aq;
/* 1010 */       this.ar = ☃.ar;
/* 1011 */       this.as = ☃.as;
/* 1012 */     } else if (this.m.X().b("keepInventory") || ☃.t()) {
/* 1013 */       this.bB.a(☃.bB);
/*      */       
/* 1015 */       this.bW = ☃.bW;
/* 1016 */       this.bX = ☃.bX;
/* 1017 */       this.bY = ☃.bY;
/* 1018 */       p(☃.di());
/*      */     } 
/*      */     
/* 1021 */     this.bZ = ☃.bZ;
/* 1022 */     this.bC = ☃.bC;
/* 1023 */     T().b(bx, ☃.T().a(bx));
/* 1024 */     this.cq = -1;
/* 1025 */     this.cn = -1.0F;
/* 1026 */     this.co = -1;
/* 1027 */     this.cy.a(☃.cy);
/* 1028 */     this.ce.addAll(☃.ce);
/* 1029 */     this.cx = ☃.cx;
/* 1030 */     this.cC = ☃.cC;
/*      */     
/* 1032 */     h(☃.dE());
/* 1033 */     i(☃.dF());
/*      */   }
/*      */ 
/*      */   
/*      */   protected void a(aek ☃) {
/* 1038 */     super.a(☃);
/* 1039 */     this.a.a(new mb(Q(), ☃));
/*      */     
/* 1041 */     if (☃.a() == aem.y) {
/* 1042 */       this.cA = this.U;
/* 1043 */       this.cz = new cee(this.q, this.r, this.s);
/*      */     } 
/*      */     
/* 1046 */     p.A.a(this);
/*      */   }
/*      */ 
/*      */   
/*      */   protected void a(aek ☃, boolean bool) {
/* 1051 */     super.a(☃, bool);
/* 1052 */     this.a.a(new mb(Q(), ☃));
/*      */     
/* 1054 */     p.A.a(this);
/*      */   }
/*      */ 
/*      */   
/*      */   protected void b(aek ☃) {
/* 1059 */     super.b(☃);
/* 1060 */     this.a.a(new kx(Q(), ☃.a()));
/*      */     
/* 1062 */     if (☃.a() == aem.y) {
/* 1063 */       this.cz = null;
/*      */     }
/*      */     
/* 1066 */     p.A.a(this);
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(double ☃, double d1, double d2) {
/* 1071 */     this.a.a(☃, d1, d2, this.w, this.x);
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(aer ☃) {
/* 1076 */     s().A().b(this, new jf(☃, 4));
/*      */   }
/*      */ 
/*      */   
/*      */   public void b(aer ☃) {
/* 1081 */     s().A().b(this, new jf(☃, 5));
/*      */   }
/*      */ 
/*      */   
/*      */   public void r() {
/* 1086 */     if (this.a == null) {
/*      */       return;
/*      */     }
/* 1089 */     this.a.a(new kp(this.bV));
/* 1090 */     C();
/*      */   }
/*      */   
/*      */   public td s() {
/* 1094 */     return (td)this.m;
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(axv ☃) {
/* 1099 */     this.c.a(☃);
/* 1100 */     this.a.a(new ke(3, ☃.a()));
/*      */     
/* 1102 */     if (☃ == axv.e) {
/* 1103 */       dA();
/* 1104 */       S_();
/*      */     } else {
/* 1106 */       e(this);
/*      */     } 
/*      */     
/* 1109 */     r();
/* 1110 */     cR();
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean t() {
/* 1115 */     return (this.c.b() == axv.e);
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean u() {
/* 1120 */     return (this.c.b() == axv.c);
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(ij ☃) {
/* 1125 */     a(☃, ih.b);
/*      */   }
/*      */   
/*      */   public void a(ij ☃, ih ih1) {
/* 1129 */     this.a.a(new jn(☃, ih1), future -> {
/*      */           if (!future.isSuccess() && (☃ == ih.c || ☃ == ih.b)) {
/*      */             int i = 256;
/*      */             String str = ij1.a(256);
/*      */             ij ij2 = (new iq(str)).a(a.o);
/*      */             this.a.a(new jn((new ir("multiplayer.message_not_delivered", new Object[] { ij2 })).a(a.m), ih.b));
/*      */           } 
/*      */         });
/*      */   }
/*      */ 
/*      */   
/*      */   public String v() {
/* 1141 */     String ☃ = this.a.a.b().toString();
/* 1142 */     ☃ = ☃.substring(☃.indexOf("/") + 1);
/* 1143 */     ☃ = ☃.substring(0, ☃.indexOf(":"));
/* 1144 */     return ☃;
/*      */   }
/*      */   
/*      */   public void a(mj ☃) {
/* 1148 */     this.cd = ☃.b();
/*      */     
/* 1150 */     this.cs = ☃.d();
/* 1151 */     this.ct = ☃.e();
/*      */     
/* 1153 */     T().b(bx, Byte.valueOf((byte)☃.f()));
/* 1154 */     T().b(by, Byte.valueOf((byte)((☃.g() == aez.a) ? 0 : 1)));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public aog.b x() {
/* 1162 */     return this.cs;
/*      */   }
/*      */   
/*      */   public void a(String ☃, String str1) {
/* 1166 */     this.a.a(new ky(☃, str1));
/*      */   }
/*      */ 
/*      */   
/*      */   protected int y() {
/* 1171 */     return this.b.a(do());
/*      */   }
/*      */   
/*      */   public void z() {
/* 1175 */     this.cu = k.b();
/*      */   }
/*      */   
/*      */   public wo A() {
/* 1179 */     return this.cg;
/*      */   }
/*      */   
/*      */   public wn B() {
/* 1183 */     return this.cy;
/*      */   }
/*      */   
/*      */   public void c(aer ☃) {
/* 1187 */     if (☃ instanceof aog) {
/* 1188 */       this.a.a(new kw(new int[] { ☃.Q() }));
/*      */     } else {
/* 1190 */       this.ce.add(Integer.valueOf(☃.Q()));
/*      */     } 
/*      */   }
/*      */   
/*      */   public void d(aer ☃) {
/* 1195 */     this.ce.remove(Integer.valueOf(☃.Q()));
/*      */   }
/*      */ 
/*      */   
/*      */   protected void C() {
/* 1200 */     if (t()) {
/* 1201 */       cl();
/* 1202 */       i(true);
/*      */     } else {
/* 1204 */       super.C();
/*      */     } 
/*      */     
/* 1207 */     s().A().a(this);
/*      */   }
/*      */   
/*      */   public aer D() {
/* 1211 */     return (this.cv == null) ? this : this.cv;
/*      */   }
/*      */   
/*      */   public void e(aer ☃) {
/* 1215 */     aer aer1 = D();
/* 1216 */     this.cv = (☃ == null) ? this : ☃;
/*      */     
/* 1218 */     if (aer1 != this.cv) {
/* 1219 */       this.a.a(new ld(this.cv));
/* 1220 */       a(this.cv.q, this.cv.r, this.cv.s);
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   protected void E() {
/* 1226 */     if (this.am > 0 && !this.cw) {
/* 1227 */       this.am--;
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public void f(aer ☃) {
/* 1233 */     if (this.c.b() == axv.e) {
/* 1234 */       e(☃);
/*      */     } else {
/* 1236 */       super.f(☃);
/*      */     } 
/*      */   }
/*      */   
/*      */   public long F() {
/* 1241 */     return this.cu;
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public ij G() {
/* 1246 */     return null;
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(adk ☃) {
/* 1251 */     super.a(☃);
/* 1252 */     dH();
/*      */   }
/*      */   
/*      */   public boolean H() {
/* 1256 */     return this.cw;
/*      */   }
/*      */   
/*      */   public void I() {
/* 1260 */     this.cw = false;
/*      */   }
/*      */   
/*      */   public void J() {
/* 1264 */     b(7, true);
/*      */   }
/*      */ 
/*      */   
/*      */   public void K() {
/* 1269 */     b(7, true);
/* 1270 */     b(7, false);
/*      */   }
/*      */   
/*      */   public pm L() {
/* 1274 */     return this.cf;
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public cee M() {
/* 1279 */     return this.cC;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(td ☃, double d1, double d2, double d3, float f1, float f2) {
/* 1287 */     e(this);
/* 1288 */     S_();
/* 1289 */     if (☃ == this.m) {
/* 1290 */       this.a.a(d1, d2, d3, f1, f2);
/*      */     } else {
/* 1292 */       td td1 = s();
/*      */       
/* 1294 */       this.ap = ☃.t.q();
/* 1295 */       this.a.a(new kz(this.ap, td1.aj(), td1.g().t(), this.c.b()));
/* 1296 */       this.b.ac().f(this);
/*      */       
/* 1298 */       td1.f(this);
/* 1299 */       this.G = false;
/*      */       
/* 1301 */       b(d1, d2, d3, f1, f2);
/* 1302 */       if (aF()) {
/* 1303 */         td1.a(this, false);
/* 1304 */         ☃.a(this);
/* 1305 */         ☃.a(this, false);
/*      */       } 
/*      */       
/* 1308 */       a(☃);
/*      */       
/* 1310 */       this.b.ac().a(this, td1);
/*      */       
/* 1312 */       this.a.a(d1, d2, d3, f1, f2);
/* 1313 */       this.c.a(☃);
/* 1314 */       this.b.ac().b(this, ☃);
/* 1315 */       this.b.ac().g(this);
/*      */     } 
/*      */   }
/*      */ }


/* Location:              F:\dw\server.jar!\tf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */