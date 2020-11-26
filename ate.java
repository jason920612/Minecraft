/*     */ import com.google.common.collect.HashMultimap;
/*     */ import com.google.common.collect.Multimap;
/*     */ import com.google.gson.JsonParseException;
/*     */ import com.mojang.brigadier.StringReader;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import java.text.DecimalFormat;
/*     */ import java.text.DecimalFormatSymbols;
/*     */ import java.util.Locale;
/*     */ import java.util.Objects;
/*     */ import java.util.Random;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class ate
/*     */ {
/*  64 */   private static final Logger c = LogManager.getLogger();
/*  65 */   public static final ate a = new ate((ata)null);
/*     */   
/*  67 */   public static final DecimalFormat b = D();
/*     */ 
/*     */   
/*     */   private int d;
/*     */ 
/*     */   
/*     */   private int e;
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   private final ata f;
/*     */ 
/*     */   
/*     */   private gy g;
/*     */ 
/*     */   
/*     */   private boolean h;
/*     */ 
/*     */   
/*     */   private amb i;
/*     */ 
/*     */   
/*     */   private blh j;
/*     */ 
/*     */   
/*     */   private boolean k;
/*     */ 
/*     */   
/*     */   private blh l;
/*     */ 
/*     */   
/*     */   private boolean m;
/*     */ 
/*     */ 
/*     */   
/*     */   private static DecimalFormat D() {
/* 103 */     DecimalFormat ☃ = new DecimalFormat("#.##");
/* 104 */     ☃.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT));
/* 105 */     return ☃;
/*     */   }
/*     */   
/*     */   public ate(axx ☃) {
/* 109 */     this(☃, 1);
/*     */   }
/*     */   
/*     */   public ate(axx ☃, int i) {
/* 113 */     this.f = (☃ == null) ? null : ☃.h();
/* 114 */     this.d = i;
/*     */     
/* 116 */     E();
/*     */   }
/*     */   
/*     */   private void E() {
/* 120 */     this.h = false;
/* 121 */     this.h = a();
/*     */   }
/*     */   
/*     */   private ate(gy ☃) {
/* 125 */     ata ata1 = fc.s.b(new pc(☃.l("id")));
/* 126 */     this.f = (ata1 == null) ? atf.a : ata1;
/* 127 */     this.d = ☃.f("Count");
/*     */     
/* 129 */     if (☃.c("tag", 10)) {
/* 130 */       this.g = ☃.p("tag");
/* 131 */       b().a(☃);
/*     */     } 
/*     */     
/* 134 */     if (b().k()) {
/* 135 */       b(g());
/*     */     }
/*     */     
/* 138 */     E();
/*     */   }
/*     */   
/*     */   public static ate a(gy ☃) {
/*     */     try {
/* 143 */       return new ate(☃);
/* 144 */     } catch (RuntimeException runtimeException) {
/* 145 */       c.debug("Tried to load invalid item: {}", ☃, runtimeException);
/* 146 */       return a;
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean a() {
/* 151 */     if (this == a) {
/* 152 */       return true;
/*     */     }
/*     */     
/* 155 */     if (b() == null || b() == atf.a) {
/* 156 */       return true;
/*     */     }
/* 158 */     if (this.d <= 0) {
/* 159 */       return true;
/*     */     }
/* 161 */     return false;
/*     */   }
/*     */   
/*     */   public ate a(int ☃) {
/* 165 */     int i = Math.min(☃, this.d);
/*     */     
/* 167 */     ate ate1 = i();
/* 168 */     ate1.e(i);
/* 169 */     g(i);
/*     */     
/* 171 */     return ate1;
/*     */   }
/*     */   
/*     */   public ata b() {
/* 175 */     return this.h ? atf.a : this.f;
/*     */   }
/*     */   
/*     */   public adm a(aup ☃) {
/* 179 */     aog aog = ☃.j();
/* 180 */     el el = ☃.a();
/* 181 */     blh blh1 = new blh(☃.k(), el, false);
/* 182 */     if (aog != null && !aog.bV.e && !b(☃.k().F(), blh1)) {
/* 183 */       return adm.b;
/*     */     }
/*     */     
/* 186 */     ata ata1 = b();
/* 187 */     adm adm = ata1.a(☃);
/* 188 */     if (aog != null && adm == adm.a) {
/* 189 */       aog.b(ws.c.b(ata1));
/*     */     }
/* 191 */     return adm;
/*     */   }
/*     */   
/*     */   public float a(blc ☃) {
/* 195 */     return b().a(this, ☃);
/*     */   }
/*     */   
/*     */   public adn<ate> a(axy ☃, aog aog1, adk adk1) {
/* 199 */     return b().a(☃, aog1, adk1);
/*     */   }
/*     */   
/*     */   public ate a(axy ☃, afa afa1) {
/* 203 */     return b().a(this, ☃, afa1);
/*     */   }
/*     */   
/*     */   public gy b(gy ☃) {
/* 207 */     pc pc = fc.s.b(b());
/* 208 */     ☃.a("id", (pc == null) ? "minecraft:air" : pc.toString());
/* 209 */     ☃.a("Count", (byte)this.d);
/* 210 */     if (this.g != null) {
/* 211 */       ☃.a("tag", this.g);
/*     */     }
/* 213 */     return ☃;
/*     */   }
/*     */   
/*     */   public int c() {
/* 217 */     return b().i();
/*     */   }
/*     */   
/*     */   public boolean d() {
/* 221 */     return (c() > 1 && (!e() || !f()));
/*     */   }
/*     */   
/*     */   public boolean e() {
/* 225 */     if (this.h || b().j() <= 0) {
/* 226 */       return false;
/*     */     }
/* 228 */     gy ☃ = n();
/* 229 */     return (☃ == null || !☃.q("Unbreakable"));
/*     */   }
/*     */   
/*     */   public boolean f() {
/* 233 */     return (e() && g() > 0);
/*     */   }
/*     */   
/*     */   public int g() {
/* 237 */     return (this.g == null) ? 0 : this.g.h("Damage");
/*     */   }
/*     */   
/*     */   public void b(int ☃) {
/* 241 */     o().b("Damage", Math.max(0, ☃));
/*     */   }
/*     */   
/*     */   public int h() {
/* 245 */     return b().j();
/*     */   }
/*     */   
/*     */   public boolean a(int ☃, Random random, @Nullable tf tf1) {
/* 249 */     if (!e()) {
/* 250 */       return false;
/*     */     }
/*     */     
/* 253 */     if (☃ > 0) {
/* 254 */       int j = awg.a(awi.u, this);
/*     */       
/* 256 */       int k = 0;
/* 257 */       for (int m = 0; j > 0 && m < ☃; m++) {
/* 258 */         if (awc.a(this, j, random)) {
/* 259 */           k++;
/*     */         }
/*     */       } 
/* 262 */       ☃ -= k;
/*     */       
/* 264 */       if (☃ <= 0) {
/* 265 */         return false;
/*     */       }
/*     */     } 
/*     */     
/* 269 */     if (tf1 != null && ☃ != 0) {
/* 270 */       p.t.a(tf1, this, g() + ☃);
/*     */     }
/*     */     
/* 273 */     int i = g() + ☃;
/*     */     
/* 275 */     b(i);
/*     */     
/* 277 */     return (i >= h());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(int ☃, afa afa1) {
/* 283 */     if (afa1 instanceof aog && ((aog)afa1).bV.d) {
/*     */       return;
/*     */     }
/* 286 */     if (!e()) {
/*     */       return;
/*     */     }
/*     */     
/* 290 */     if (a(☃, afa1.ce(), (afa1 instanceof tf) ? (tf)afa1 : null)) {
/* 291 */       afa1.c(this);
/*     */       
/* 293 */       ata ata1 = b();
/* 294 */       g(1);
/* 295 */       if (afa1 instanceof aog) {
/* 296 */         ((aog)afa1).b(ws.d.b(ata1));
/*     */       }
/*     */ 
/*     */       
/* 300 */       b(0);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(afa ☃, aog aog1) {
/* 305 */     ata ata1 = b();
/* 306 */     if (ata1.a(this, ☃, aog1)) {
/* 307 */       aog1.b(ws.c.b(ata1));
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(axy ☃, blc blc1, el el1, aog aog1) {
/* 312 */     ata ata1 = b();
/* 313 */     if (ata1.a(this, ☃, blc1, el1, aog1)) {
/* 314 */       aog1.b(ws.c.b(ata1));
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean b(blc ☃) {
/* 319 */     return b().a(☃);
/*     */   }
/*     */   
/*     */   public boolean a(aog ☃, afa afa1, adk adk1) {
/* 323 */     return b().a(this, ☃, afa1, adk1);
/*     */   }
/*     */   
/*     */   public ate i() {
/* 327 */     ate ☃ = new ate(b(), this.d);
/* 328 */     ☃.d(B());
/* 329 */     if (this.g != null) {
/* 330 */       ☃.g = this.g.f();
/*     */     }
/* 332 */     return ☃;
/*     */   }
/*     */   
/*     */   public static boolean a(ate ☃, ate ate1) {
/* 336 */     if (☃.a() && ate1.a()) {
/* 337 */       return true;
/*     */     }
/* 339 */     if (☃.a() || ate1.a()) {
/* 340 */       return false;
/*     */     }
/*     */     
/* 343 */     if (☃.g == null && ate1.g != null) {
/* 344 */       return false;
/*     */     }
/* 346 */     if (☃.g != null && !☃.g.equals(ate1.g)) {
/* 347 */       return false;
/*     */     }
/* 349 */     return true;
/*     */   }
/*     */   
/*     */   public static boolean b(ate ☃, ate ate1) {
/* 353 */     if (☃.a() && ate1.a()) {
/* 354 */       return true;
/*     */     }
/* 356 */     if (☃.a() || ate1.a()) {
/* 357 */       return false;
/*     */     }
/* 359 */     return ☃.c(ate1);
/*     */   }
/*     */   
/*     */   private boolean c(ate ☃) {
/* 363 */     if (this.d != ☃.d) {
/* 364 */       return false;
/*     */     }
/* 366 */     if (b() != ☃.b()) {
/* 367 */       return false;
/*     */     }
/* 369 */     if (this.g == null && ☃.g != null) {
/* 370 */       return false;
/*     */     }
/* 372 */     if (this.g != null && !this.g.equals(☃.g)) {
/* 373 */       return false;
/*     */     }
/* 375 */     return true;
/*     */   }
/*     */   
/*     */   public static boolean c(ate ☃, ate ate1) {
/* 379 */     if (☃ == ate1) {
/* 380 */       return true;
/*     */     }
/* 382 */     if (!☃.a() && !ate1.a()) {
/* 383 */       return ☃.a(ate1);
/*     */     }
/* 385 */     return false;
/*     */   }
/*     */   
/*     */   public static boolean d(ate ☃, ate ate1) {
/* 389 */     if (☃ == ate1) {
/* 390 */       return true;
/*     */     }
/* 392 */     if (!☃.a() && !ate1.a()) {
/* 393 */       return ☃.b(ate1);
/*     */     }
/* 395 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(ate ☃) {
/* 406 */     return (!☃.a() && b() == ☃.b());
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
/*     */   public boolean b(ate ☃) {
/* 418 */     if (e()) {
/* 419 */       return (!☃.a() && b() == ☃.b());
/*     */     }
/* 421 */     return a(☃);
/*     */   }
/*     */   
/*     */   public String j() {
/* 425 */     return b().h(this);
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 430 */     return this.d + "x" + b().a();
/*     */   }
/*     */   
/*     */   public void a(axy ☃, aer aer1, int i, boolean bool) {
/* 434 */     if (this.e > 0) {
/* 435 */       this.e--;
/*     */     }
/* 437 */     if (b() != null) {
/* 438 */       b().a(this, ☃, aer1, i, bool);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(axy ☃, aog aog1, int i) {
/* 443 */     aog1.a(ws.b.b(b()), i);
/* 444 */     b().b(this, ☃, aog1);
/*     */   }
/*     */   
/*     */   public int k() {
/* 448 */     return b().c(this);
/*     */   }
/*     */   
/*     */   public auo l() {
/* 452 */     return b().d(this);
/*     */   }
/*     */   
/*     */   public void a(axy ☃, afa afa1, int i) {
/* 456 */     b().a(this, ☃, afa1, i);
/*     */   }
/*     */   
/*     */   public boolean m() {
/* 460 */     return (!this.h && this.g != null && !this.g.isEmpty());
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public gy n() {
/* 465 */     return this.g;
/*     */   }
/*     */   
/*     */   public gy o() {
/* 469 */     if (this.g == null) {
/* 470 */       c(new gy());
/*     */     }
/*     */     
/* 473 */     return this.g;
/*     */   }
/*     */   
/*     */   public gy a(String ☃) {
/* 477 */     if (this.g == null || !this.g.c(☃, 10)) {
/* 478 */       gy gy1 = new gy();
/* 479 */       a(☃, gy1);
/* 480 */       return gy1;
/*     */     } 
/* 482 */     return this.g.p(☃);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public gy b(String ☃) {
/* 487 */     if (this.g == null || !this.g.c(☃, 10)) {
/* 488 */       return null;
/*     */     }
/* 490 */     return this.g.p(☃);
/*     */   }
/*     */   
/*     */   public void c(String ☃) {
/* 494 */     if (this.g != null && this.g.e(☃)) {
/* 495 */       this.g.r(☃);
/* 496 */       if (this.g.isEmpty()) {
/* 497 */         this.g = null;
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public he p() {
/* 503 */     if (this.g != null) {
/* 504 */       return this.g.d("Enchantments", 10);
/*     */     }
/* 506 */     return new he();
/*     */   }
/*     */   
/*     */   public void c(@Nullable gy ☃) {
/* 510 */     this.g = ☃;
/*     */   }
/*     */   
/*     */   public ij q() {
/* 514 */     gy ☃ = b("display");
/* 515 */     if (☃ != null && 
/* 516 */       ☃.c("Name", 8)) {
/*     */       try {
/* 518 */         ij ij = ij.a.a(☃.l("Name"));
/* 519 */         if (ij != null) {
/* 520 */           return ij;
/*     */         }
/* 522 */         ☃.r("Name");
/*     */       }
/* 524 */       catch (JsonParseException jsonParseException) {
/* 525 */         ☃.r("Name");
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/* 530 */     return b().i(this);
/*     */   }
/*     */   
/*     */   public ate a(@Nullable ij ☃) {
/* 534 */     gy gy1 = a("display");
/* 535 */     if (☃ != null) {
/* 536 */       gy1.a("Name", ij.a.a(☃));
/*     */     } else {
/* 538 */       gy1.r("Name");
/*     */     } 
/* 540 */     return this;
/*     */   }
/*     */   
/*     */   public void r() {
/* 544 */     gy ☃ = b("display");
/* 545 */     if (☃ != null) {
/* 546 */       ☃.r("Name");
/*     */       
/* 548 */       if (☃.isEmpty()) {
/* 549 */         c("display");
/*     */       }
/*     */     } 
/*     */     
/* 553 */     if (this.g != null && this.g.isEmpty()) {
/* 554 */       this.g = null;
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean s() {
/* 559 */     gy ☃ = b("display");
/* 560 */     return (☃ != null && ☃.c("Name", 8));
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public atq u() {
/* 750 */     return b().j(this);
/*     */   }
/*     */   
/*     */   public boolean v() {
/* 754 */     if (!b().a(this)) {
/* 755 */       return false;
/*     */     }
/* 757 */     if (w()) {
/* 758 */       return false;
/*     */     }
/* 760 */     return true;
/*     */   }
/*     */   
/*     */   public void a(awe ☃, int i) {
/* 764 */     o();
/* 765 */     if (!this.g.c("Enchantments", 9)) {
/* 766 */       this.g.a("Enchantments", new he());
/*     */     }
/* 768 */     he he = this.g.d("Enchantments", 10);
/* 769 */     gy gy1 = new gy();
/* 770 */     gy1.a("id", String.valueOf(fc.q.b(☃)));
/* 771 */     gy1.a("lvl", (short)(byte)i);
/* 772 */     he.a(gy1);
/*     */   }
/*     */   
/*     */   public boolean w() {
/* 776 */     if (this.g != null && this.g.c("Enchantments", 9)) {
/* 777 */       return !this.g.d("Enchantments", 10).isEmpty();
/*     */     }
/* 779 */     return false;
/*     */   }
/*     */   
/*     */   public void a(String ☃, ho ho1) {
/* 783 */     o().a(☃, ho1);
/*     */   }
/*     */   
/*     */   public boolean x() {
/* 787 */     return (this.i != null);
/*     */   }
/*     */   
/*     */   public void a(@Nullable amb ☃) {
/* 791 */     this.i = ☃;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public amb y() {
/* 796 */     return this.h ? null : this.i;
/*     */   }
/*     */   
/*     */   public int z() {
/* 800 */     if (m() && this.g.c("RepairCost", 3)) {
/* 801 */       return this.g.h("RepairCost");
/*     */     }
/* 803 */     return 0;
/*     */   }
/*     */   
/*     */   public void c(int ☃) {
/* 807 */     o().b("RepairCost", ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public Multimap<String, afo> a(aew ☃) {
/*     */     Multimap<String, afo> multimap;
/* 813 */     if (m() && this.g.c("AttributeModifiers", 9)) {
/* 814 */       HashMultimap hashMultimap = HashMultimap.create();
/* 815 */       he he = this.g.d("AttributeModifiers", 10);
/*     */       
/* 817 */       for (int i = 0; i < he.size(); i++) {
/* 818 */         gy gy1 = he.e(i);
/* 819 */         afo afo = ank.a(gy1);
/* 820 */         if (afo != null)
/*     */         {
/*     */ 
/*     */           
/* 824 */           if (!gy1.c("Slot", 8) || 
/* 825 */             gy1.l("Slot").equals(☃.d()))
/*     */           {
/*     */ 
/*     */ 
/*     */             
/* 830 */             if (afo.a().getLeastSignificantBits() != 0L && afo.a().getMostSignificantBits() != 0L)
/* 831 */               hashMultimap.put(gy1.l("AttributeName"), afo);  } 
/*     */         }
/*     */       } 
/*     */     } else {
/* 835 */       multimap = b().a(☃);
/*     */     } 
/*     */     
/* 838 */     return multimap;
/*     */   }
/*     */   
/*     */   public void a(String ☃, afo afo1, @Nullable aew aew1) {
/* 842 */     o();
/* 843 */     if (!this.g.c("AttributeModifiers", 9)) {
/* 844 */       this.g.a("AttributeModifiers", new he());
/*     */     }
/* 846 */     he he = this.g.d("AttributeModifiers", 10);
/* 847 */     gy gy1 = ank.a(afo1);
/* 848 */     gy1.a("AttributeName", ☃);
/* 849 */     if (aew1 != null) {
/* 850 */       gy1.a("Slot", aew1.d());
/*     */     }
/* 852 */     he.a(gy1);
/*     */   }
/*     */   
/*     */   public ij A() {
/* 856 */     ij ☃ = (new iq("")).a(q());
/* 857 */     if (s()) {
/* 858 */       ☃.a(a.u);
/*     */     }
/*     */     
/* 861 */     ij ij1 = ik.a(☃);
/*     */     
/* 863 */     if (!this.h) {
/* 864 */       gy gy1 = b(new gy());
/* 865 */       ij1.a((u()).e).a(ip1 -> ip1.a(new il(il.a.b, new iq(☃.toString()))));
/*     */     } 
/*     */     
/* 868 */     return ij1;
/*     */   }
/*     */   
/*     */   private static boolean a(blh ☃, @Nullable blh blh1) {
/* 872 */     if (blh1 == null || ☃.a() != blh1.a()) {
/* 873 */       return false;
/*     */     }
/* 875 */     if (☃.b() == null && blh1.b() == null) {
/* 876 */       return true;
/*     */     }
/* 878 */     if (☃.b() == null || blh1.b() == null) {
/* 879 */       return false;
/*     */     }
/* 881 */     return Objects.equals(☃.b().a(new gy()), blh1.b().a(new gy()));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(xb ☃, blh blh1) {
/* 889 */     if (a(blh1, this.j)) {
/* 890 */       return this.k;
/*     */     }
/*     */     
/* 893 */     this.j = blh1;
/*     */     
/* 895 */     if (m() && this.g.c("CanDestroy", 9)) {
/* 896 */       he he = this.g.d("CanDestroy", 8);
/* 897 */       for (int i = 0; i < he.size(); i++) {
/* 898 */         String str = he.m(i);
/*     */         try {
/* 900 */           Predicate<blh> predicate = cu.a().a(new StringReader(str)).create(☃);
/* 901 */           if (predicate.test(blh1)) {
/* 902 */             this.k = true;
/* 903 */             return true;
/*     */           } 
/* 905 */         } catch (CommandSyntaxException commandSyntaxException) {}
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 910 */     this.k = false;
/* 911 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean b(xb ☃, blh blh1) {
/* 919 */     if (a(blh1, this.l)) {
/* 920 */       return this.m;
/*     */     }
/*     */     
/* 923 */     this.l = blh1;
/*     */     
/* 925 */     if (m() && this.g.c("CanPlaceOn", 9)) {
/* 926 */       he he = this.g.d("CanPlaceOn", 8);
/* 927 */       for (int i = 0; i < he.size(); i++) {
/* 928 */         String str = he.m(i);
/*     */         try {
/* 930 */           Predicate<blh> predicate = cu.a().a(new StringReader(str)).create(☃);
/* 931 */           if (predicate.test(blh1)) {
/* 932 */             this.m = true;
/* 933 */             return true;
/*     */           } 
/* 935 */         } catch (CommandSyntaxException commandSyntaxException) {}
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 940 */     this.m = false;
/* 941 */     return false;
/*     */   }
/*     */   
/*     */   public int B() {
/* 945 */     return this.e;
/*     */   }
/*     */   
/*     */   public void d(int ☃) {
/* 949 */     this.e = ☃;
/*     */   }
/*     */   
/*     */   public int C() {
/* 953 */     return this.h ? 0 : this.d;
/*     */   }
/*     */   
/*     */   public void e(int ☃) {
/* 957 */     this.d = ☃;
/*     */     
/* 959 */     E();
/*     */   }
/*     */   
/*     */   public void f(int ☃) {
/* 963 */     e(this.d + ☃);
/*     */   }
/*     */   
/*     */   public void g(int ☃) {
/* 967 */     f(-☃);
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\ate.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */