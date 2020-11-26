/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.collect.Sets;
/*     */ import com.mojang.datafixers.DSL;
/*     */ import com.mojang.datafixers.DataFixTypes;
/*     */ import com.mojang.datafixers.DataFixer;
/*     */ import com.mojang.datafixers.Dynamic;
/*     */ import com.mojang.datafixers.types.DynamicOps;
/*     */ import com.mojang.datafixers.types.JsonOps;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ccb
/*     */ {
/*     */   private String b;
/*     */   private int c;
/*     */   private boolean d;
/*  35 */   public static final adi a = adi.c;
/*     */   private long e;
/*  37 */   private ayg f = ayg.b;
/*  38 */   private gy g = new gy();
/*     */   
/*     */   @Nullable
/*     */   private String h;
/*     */   
/*     */   private int i;
/*     */   
/*     */   private int j;
/*     */   
/*     */   private int k;
/*     */   private long l;
/*     */   private long m;
/*     */   private long n;
/*     */   private long o;
/*     */   @Nullable
/*     */   private final DataFixer p;
/*     */   private final int q;
/*     */   private boolean r;
/*     */   private gy s;
/*     */   private int t;
/*     */   private String u;
/*     */   private int v;
/*     */   private int w;
/*     */   private boolean x;
/*     */   private int y;
/*     */   private boolean z;
/*     */   private int A;
/*     */   private axv B;
/*     */   private boolean C;
/*     */   private boolean D;
/*     */   private boolean E;
/*     */   private boolean F;
/*     */   private adi G;
/*     */   private boolean H;
/*     */   private double I;
/*     */   private double J;
/*  74 */   private double K = 6.0E7D;
/*     */   private long L;
/*     */   private double M;
/*  77 */   private double N = 5.0D;
/*  78 */   private double O = 0.2D;
/*  79 */   private int P = 5;
/*  80 */   private int Q = 15;
/*  81 */   private final Set<String> R = Sets.newHashSet();
/*  82 */   private final Set<String> S = Sets.newLinkedHashSet();
/*  83 */   private final Map<bod, gy> T = Maps.newIdentityHashMap();
/*     */   
/*     */   private gy U;
/*  86 */   private final axu V = new axu();
/*     */   
/*     */   protected ccb() {
/*  89 */     this.p = null;
/*  90 */     this.q = 1631;
/*  91 */     b(new gy());
/*     */   }
/*     */   
/*     */   public ccb(gy ☃, DataFixer dataFixer, int i, @Nullable gy gy1) {
/*  95 */     this.p = dataFixer;
/*  96 */     if (☃.c("Version", 10)) {
/*  97 */       gy gy2 = ☃.p("Version");
/*  98 */       this.b = gy2.l("Name");
/*  99 */       this.c = gy2.h("Id");
/* 100 */       this.d = gy2.q("Snapshot");
/*     */     } 
/* 102 */     this.e = ☃.i("RandomSeed");
/* 103 */     if (☃.c("generatorName", 8)) {
/* 104 */       String str = ☃.l("generatorName");
/* 105 */       this.f = ayg.a(str);
/* 106 */       if (this.f == null) {
/* 107 */         this.f = ayg.b;
/* 108 */       } else if (this.f == ayg.f) {
/* 109 */         this.h = ☃.l("generatorOptions");
/* 110 */       } else if (this.f.h()) {
/* 111 */         int j = 0;
/* 112 */         if (☃.c("generatorVersion", 99)) {
/* 113 */           j = ☃.h("generatorVersion");
/*     */         }
/* 115 */         this.f = this.f.a(j);
/*     */       } 
/* 117 */       b(☃.p("generatorOptions"));
/*     */     } 
/* 119 */     this.B = axv.a(☃.h("GameType"));
/*     */     
/* 121 */     if (☃.c("legacy_custom_options", 8)) {
/* 122 */       this.h = ☃.l("legacy_custom_options");
/*     */     }
/*     */     
/* 125 */     if (☃.c("MapFeatures", 99)) {
/* 126 */       this.C = ☃.q("MapFeatures");
/*     */     } else {
/* 128 */       this.C = true;
/*     */     } 
/* 130 */     this.i = ☃.h("SpawnX");
/* 131 */     this.j = ☃.h("SpawnY");
/* 132 */     this.k = ☃.h("SpawnZ");
/* 133 */     this.l = ☃.i("Time");
/* 134 */     if (☃.c("DayTime", 99)) {
/* 135 */       this.m = ☃.i("DayTime");
/*     */     } else {
/* 137 */       this.m = this.l;
/*     */     } 
/* 139 */     this.n = ☃.i("LastPlayed");
/* 140 */     this.o = ☃.i("SizeOnDisk");
/* 141 */     this.u = ☃.l("LevelName");
/* 142 */     this.v = ☃.h("version");
/* 143 */     this.w = ☃.h("clearWeatherTime");
/* 144 */     this.y = ☃.h("rainTime");
/* 145 */     this.x = ☃.q("raining");
/* 146 */     this.A = ☃.h("thunderTime");
/* 147 */     this.z = ☃.q("thundering");
/* 148 */     this.D = ☃.q("hardcore");
/*     */     
/* 150 */     if (☃.c("initialized", 99)) {
/* 151 */       this.F = ☃.q("initialized");
/*     */     } else {
/* 153 */       this.F = true;
/*     */     } 
/*     */     
/* 156 */     if (☃.c("allowCommands", 99)) {
/* 157 */       this.E = ☃.q("allowCommands");
/*     */     } else {
/* 159 */       this.E = (this.B == axv.c);
/*     */     } 
/*     */     
/* 162 */     this.q = i;
/* 163 */     if (gy1 != null) {
/* 164 */       this.s = gy1;
/*     */     }
/*     */     
/* 167 */     if (☃.c("GameRules", 10)) {
/* 168 */       this.V.a(☃.p("GameRules"));
/*     */     }
/*     */     
/* 171 */     if (☃.c("Difficulty", 99)) {
/* 172 */       this.G = adi.a(☃.f("Difficulty"));
/*     */     }
/*     */     
/* 175 */     if (☃.c("DifficultyLocked", 1)) {
/* 176 */       this.H = ☃.q("DifficultyLocked");
/*     */     }
/*     */     
/* 179 */     if (☃.c("BorderCenterX", 99)) {
/* 180 */       this.I = ☃.k("BorderCenterX");
/*     */     }
/*     */     
/* 183 */     if (☃.c("BorderCenterZ", 99)) {
/* 184 */       this.J = ☃.k("BorderCenterZ");
/*     */     }
/*     */     
/* 187 */     if (☃.c("BorderSize", 99)) {
/* 188 */       this.K = ☃.k("BorderSize");
/*     */     }
/*     */     
/* 191 */     if (☃.c("BorderSizeLerpTime", 99)) {
/* 192 */       this.L = ☃.i("BorderSizeLerpTime");
/*     */     }
/*     */     
/* 195 */     if (☃.c("BorderSizeLerpTarget", 99)) {
/* 196 */       this.M = ☃.k("BorderSizeLerpTarget");
/*     */     }
/*     */     
/* 199 */     if (☃.c("BorderSafeZone", 99)) {
/* 200 */       this.N = ☃.k("BorderSafeZone");
/*     */     }
/*     */     
/* 203 */     if (☃.c("BorderDamagePerBlock", 99)) {
/* 204 */       this.O = ☃.k("BorderDamagePerBlock");
/*     */     }
/*     */     
/* 207 */     if (☃.c("BorderWarningBlocks", 99)) {
/* 208 */       this.P = ☃.h("BorderWarningBlocks");
/*     */     }
/*     */     
/* 211 */     if (☃.c("BorderWarningTime", 99)) {
/* 212 */       this.Q = ☃.h("BorderWarningTime");
/*     */     }
/*     */     
/* 215 */     if (☃.c("DimensionData", 10)) {
/* 216 */       gy gy2 = ☃.p("DimensionData");
/* 217 */       for (String str : gy2.c()) {
/* 218 */         this.T.put(bod.a(Integer.parseInt(str)), gy2.p(str));
/*     */       }
/*     */     } 
/*     */     
/* 222 */     if (☃.c("DataPacks", 10)) {
/* 223 */       gy gy2 = ☃.p("DataPacks");
/*     */       
/* 225 */       he he1 = gy2.d("Disabled", 8);
/* 226 */       for (int j = 0; j < he1.size(); j++) {
/* 227 */         this.R.add(he1.m(j));
/*     */       }
/*     */       
/* 230 */       he he2 = gy2.d("Enabled", 8);
/* 231 */       for (int k = 0; k < he2.size(); k++) {
/* 232 */         this.S.add(he2.m(k));
/*     */       }
/*     */     } 
/*     */     
/* 236 */     if (☃.c("CustomBossEvents", 10)) {
/* 237 */       this.U = ☃.p("CustomBossEvents");
/*     */     }
/*     */   }
/*     */   
/*     */   public ccb(ayd ☃, String str) {
/* 242 */     this.p = null;
/* 243 */     this.q = 1631;
/* 244 */     a(☃);
/* 245 */     this.u = str;
/* 246 */     this.G = a;
/* 247 */     this.F = false;
/*     */   }
/*     */   
/*     */   public void a(ayd ☃) {
/* 251 */     this.e = ☃.d();
/* 252 */     this.B = ☃.e();
/* 253 */     this.C = ☃.g();
/* 254 */     this.D = ☃.f();
/* 255 */     this.f = ☃.h();
/* 256 */     b((gy)Dynamic.convert((DynamicOps)JsonOps.INSTANCE, hj.a, ☃.j()));
/* 257 */     this.E = ☃.i();
/*     */   }
/*     */   
/*     */   public gy a(@Nullable gy ☃) {
/* 261 */     Q();
/* 262 */     if (☃ == null) {
/* 263 */       ☃ = this.s;
/*     */     }
/* 265 */     gy gy1 = new gy();
/* 266 */     a(gy1, ☃);
/* 267 */     return gy1;
/*     */   }
/*     */   
/*     */   private void a(gy ☃, gy gy1) {
/* 271 */     gy gy2 = new gy();
/* 272 */     gy2.a("Name", "1.13.2");
/* 273 */     gy2.b("Id", 1631);
/* 274 */     gy2.a("Snapshot", false);
/* 275 */     ☃.a("Version", gy2);
/*     */     
/* 277 */     ☃.b("DataVersion", 1631);
/*     */     
/* 279 */     ☃.a("RandomSeed", this.e);
/* 280 */     ☃.a("generatorName", this.f.b());
/* 281 */     ☃.b("generatorVersion", this.f.e());
/* 282 */     if (!this.g.isEmpty()) {
/* 283 */       ☃.a("generatorOptions", this.g);
/*     */     }
/* 285 */     if (this.h != null) {
/* 286 */       ☃.a("legacy_custom_options", this.h);
/*     */     }
/*     */     
/* 289 */     ☃.b("GameType", this.B.a());
/* 290 */     ☃.a("MapFeatures", this.C);
/* 291 */     ☃.b("SpawnX", this.i);
/* 292 */     ☃.b("SpawnY", this.j);
/* 293 */     ☃.b("SpawnZ", this.k);
/* 294 */     ☃.a("Time", this.l);
/* 295 */     ☃.a("DayTime", this.m);
/* 296 */     ☃.a("SizeOnDisk", this.o);
/* 297 */     ☃.a("LastPlayed", k.d());
/* 298 */     ☃.a("LevelName", this.u);
/* 299 */     ☃.b("version", this.v);
/* 300 */     ☃.b("clearWeatherTime", this.w);
/* 301 */     ☃.b("rainTime", this.y);
/* 302 */     ☃.a("raining", this.x);
/* 303 */     ☃.b("thunderTime", this.A);
/* 304 */     ☃.a("thundering", this.z);
/* 305 */     ☃.a("hardcore", this.D);
/* 306 */     ☃.a("allowCommands", this.E);
/* 307 */     ☃.a("initialized", this.F);
/* 308 */     ☃.a("BorderCenterX", this.I);
/* 309 */     ☃.a("BorderCenterZ", this.J);
/* 310 */     ☃.a("BorderSize", this.K);
/* 311 */     ☃.a("BorderSizeLerpTime", this.L);
/* 312 */     ☃.a("BorderSafeZone", this.N);
/* 313 */     ☃.a("BorderDamagePerBlock", this.O);
/* 314 */     ☃.a("BorderSizeLerpTarget", this.M);
/* 315 */     ☃.a("BorderWarningBlocks", this.P);
/* 316 */     ☃.a("BorderWarningTime", this.Q);
/* 317 */     if (this.G != null) {
/* 318 */       ☃.a("Difficulty", (byte)this.G.a());
/*     */     }
/* 320 */     ☃.a("DifficultyLocked", this.H);
/* 321 */     ☃.a("GameRules", this.V.a());
/*     */     
/* 323 */     gy gy3 = new gy();
/* 324 */     for (Map.Entry<bod, gy> entry : this.T.entrySet()) {
/* 325 */       gy3.a(String.valueOf(((bod)entry.getKey()).c()), entry.getValue());
/*     */     }
/* 327 */     ☃.a("DimensionData", gy3);
/*     */     
/* 329 */     if (gy1 != null) {
/* 330 */       ☃.a("Player", gy1);
/*     */     }
/*     */     
/* 333 */     gy gy4 = new gy();
/*     */     
/* 335 */     he he1 = new he();
/* 336 */     for (String str : this.S) {
/* 337 */       he1.a(new hn(str));
/*     */     }
/* 339 */     gy4.a("Enabled", he1);
/*     */     
/* 341 */     he he2 = new he();
/* 342 */     for (String str : this.R) {
/* 343 */       he2.a(new hn(str));
/*     */     }
/* 345 */     gy4.a("Disabled", he2);
/*     */     
/* 347 */     ☃.a("DataPacks", gy4);
/*     */     
/* 349 */     if (this.U != null) {
/* 350 */       ☃.a("CustomBossEvents", this.U);
/*     */     }
/*     */   }
/*     */   
/*     */   public long a() {
/* 355 */     return this.e;
/*     */   }
/*     */   
/*     */   public int b() {
/* 359 */     return this.i;
/*     */   }
/*     */   
/*     */   public int c() {
/* 363 */     return this.j;
/*     */   }
/*     */   
/*     */   public int d() {
/* 367 */     return this.k;
/*     */   }
/*     */   
/*     */   public long e() {
/* 371 */     return this.l;
/*     */   }
/*     */   
/*     */   public long f() {
/* 375 */     return this.m;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void Q() {
/* 383 */     if (this.r || this.s == null) {
/*     */       return;
/*     */     }
/* 386 */     if (this.q < 1631) {
/* 387 */       if (this.p == null) {
/* 388 */         throw new NullPointerException("Fixer Upper not set inside LevelData, and the player tag is not upgraded.");
/*     */       }
/* 390 */       this.s = hk.a(this.p, (DSL.TypeReference)DataFixTypes.PLAYER, this.s, this.q);
/*     */     } 
/* 392 */     this.t = this.s.h("Dimension");
/* 393 */     this.r = true;
/*     */   }
/*     */   
/*     */   public gy h() {
/* 397 */     Q();
/* 398 */     return this.s;
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
/*     */   public void a(long ☃) {
/* 419 */     this.l = ☃;
/*     */   }
/*     */   
/*     */   public void b(long ☃) {
/* 423 */     this.m = ☃;
/*     */   }
/*     */   
/*     */   public void a(el ☃) {
/* 427 */     this.i = ☃.o();
/* 428 */     this.j = ☃.p();
/* 429 */     this.k = ☃.q();
/*     */   }
/*     */   
/*     */   public String j() {
/* 433 */     return this.u;
/*     */   }
/*     */   
/*     */   public void a(String ☃) {
/* 437 */     this.u = ☃;
/*     */   }
/*     */   
/*     */   public int k() {
/* 441 */     return this.v;
/*     */   }
/*     */   
/*     */   public void d(int ☃) {
/* 445 */     this.v = ☃;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int z() {
/* 453 */     return this.w;
/*     */   }
/*     */   
/*     */   public void g(int ☃) {
/* 457 */     this.w = ☃;
/*     */   }
/*     */   
/*     */   public boolean m() {
/* 461 */     return this.z;
/*     */   }
/*     */   
/*     */   public void a(boolean ☃) {
/* 465 */     this.z = ☃;
/*     */   }
/*     */   
/*     */   public int n() {
/* 469 */     return this.A;
/*     */   }
/*     */   
/*     */   public void e(int ☃) {
/* 473 */     this.A = ☃;
/*     */   }
/*     */   
/*     */   public boolean o() {
/* 477 */     return this.x;
/*     */   }
/*     */   
/*     */   public void b(boolean ☃) {
/* 481 */     this.x = ☃;
/*     */   }
/*     */   
/*     */   public int p() {
/* 485 */     return this.y;
/*     */   }
/*     */   
/*     */   public void f(int ☃) {
/* 489 */     this.y = ☃;
/*     */   }
/*     */   
/*     */   public axv q() {
/* 493 */     return this.B;
/*     */   }
/*     */   
/*     */   public boolean r() {
/* 497 */     return this.C;
/*     */   }
/*     */   
/*     */   public void f(boolean ☃) {
/* 501 */     this.C = ☃;
/*     */   }
/*     */   
/*     */   public void a(axv ☃) {
/* 505 */     this.B = ☃;
/*     */   }
/*     */   
/*     */   public boolean s() {
/* 509 */     return this.D;
/*     */   }
/*     */   
/*     */   public void g(boolean ☃) {
/* 513 */     this.D = ☃;
/*     */   }
/*     */   
/*     */   public ayg t() {
/* 517 */     return this.f;
/*     */   }
/*     */   
/*     */   public void a(ayg ☃) {
/* 521 */     this.f = ☃;
/*     */   }
/*     */   
/*     */   public gy A() {
/* 525 */     return this.g;
/*     */   }
/*     */   
/*     */   public void b(gy ☃) {
/* 529 */     this.g = ☃;
/*     */   }
/*     */   
/*     */   public boolean u() {
/* 533 */     return this.E;
/*     */   }
/*     */   
/*     */   public void c(boolean ☃) {
/* 537 */     this.E = ☃;
/*     */   }
/*     */   
/*     */   public boolean v() {
/* 541 */     return this.F;
/*     */   }
/*     */   
/*     */   public void d(boolean ☃) {
/* 545 */     this.F = ☃;
/*     */   }
/*     */   
/*     */   public axu w() {
/* 549 */     return this.V;
/*     */   }
/*     */   
/*     */   public double B() {
/* 553 */     return this.I;
/*     */   }
/*     */   
/*     */   public double C() {
/* 557 */     return this.J;
/*     */   }
/*     */   
/*     */   public double D() {
/* 561 */     return this.K;
/*     */   }
/*     */   
/*     */   public void a(double ☃) {
/* 565 */     this.K = ☃;
/*     */   }
/*     */   
/*     */   public long E() {
/* 569 */     return this.L;
/*     */   }
/*     */   
/*     */   public void c(long ☃) {
/* 573 */     this.L = ☃;
/*     */   }
/*     */   
/*     */   public double F() {
/* 577 */     return this.M;
/*     */   }
/*     */   
/*     */   public void b(double ☃) {
/* 581 */     this.M = ☃;
/*     */   }
/*     */   
/*     */   public void c(double ☃) {
/* 585 */     this.J = ☃;
/*     */   }
/*     */   
/*     */   public void d(double ☃) {
/* 589 */     this.I = ☃;
/*     */   }
/*     */   
/*     */   public double G() {
/* 593 */     return this.N;
/*     */   }
/*     */   
/*     */   public void e(double ☃) {
/* 597 */     this.N = ☃;
/*     */   }
/*     */   
/*     */   public double H() {
/* 601 */     return this.O;
/*     */   }
/*     */   
/*     */   public void f(double ☃) {
/* 605 */     this.O = ☃;
/*     */   }
/*     */   
/*     */   public int I() {
/* 609 */     return this.P;
/*     */   }
/*     */   
/*     */   public int J() {
/* 613 */     return this.Q;
/*     */   }
/*     */   
/*     */   public void h(int ☃) {
/* 617 */     this.P = ☃;
/*     */   }
/*     */   
/*     */   public void i(int ☃) {
/* 621 */     this.Q = ☃;
/*     */   }
/*     */   
/*     */   public adi x() {
/* 625 */     return this.G;
/*     */   }
/*     */   
/*     */   public void a(adi ☃) {
/* 629 */     this.G = ☃;
/*     */   }
/*     */   
/*     */   public boolean y() {
/* 633 */     return this.H;
/*     */   }
/*     */   
/*     */   public void e(boolean ☃) {
/* 637 */     this.H = ☃;
/*     */   }
/*     */   
/*     */   public void a(c ☃) {
/* 641 */     ☃.a("Level seed", () -> String.valueOf(a()));
/* 642 */     ☃.a("Level generator", () -> String.format("ID %02d - %s, ver %d. Features enabled: %b", new Object[] { Integer.valueOf(this.f.i()), this.f.a(), Integer.valueOf(this.f.e()), Boolean.valueOf(this.C) }));
/* 643 */     ☃.a("Level generator options", () -> this.g.toString());
/* 644 */     ☃.a("Level spawn location", () -> c.a(this.i, this.j, this.k));
/* 645 */     ☃.a("Level time", () -> String.format("%d game time, %d day time", new Object[] { Long.valueOf(this.l), Long.valueOf(this.m) }));
/* 646 */     ☃.a("Level dimension", () -> String.valueOf(this.t));
/* 647 */     ☃.a("Level storage version", () -> {
/*     */           String ☃ = "Unknown?";
/*     */           try {
/*     */             switch (this.v) {
/*     */               case 19133:
/*     */                 ☃ = "Anvil";
/*     */                 break;
/*     */               
/*     */               case 19132:
/*     */                 ☃ = "McRegion";
/*     */                 break;
/*     */             } 
/* 659 */           } catch (Throwable throwable) {}
/*     */ 
/*     */           
/*     */           return String.format("0x%05X - %s", new Object[] { Integer.valueOf(this.v), ☃ });
/*     */         });
/*     */     
/* 665 */     ☃.a("Level weather", () -> String.format("Rain time: %d (now: %b), thunder time: %d (now: %b)", new Object[] { Integer.valueOf(this.y), Boolean.valueOf(this.x), Integer.valueOf(this.A), Boolean.valueOf(this.z) }));
/* 666 */     ☃.a("Level game mode", () -> String.format("Game mode: %s (ID %d). Hardcore: %b. Cheats: %b", new Object[] { this.B.b(), Integer.valueOf(this.B.a()), Boolean.valueOf(this.D), Boolean.valueOf(this.E) }));
/*     */   }
/*     */   
/*     */   public gy a(bod ☃) {
/* 670 */     gy gy1 = this.T.get(☃);
/* 671 */     if (gy1 == null) {
/* 672 */       return new gy();
/*     */     }
/* 674 */     return gy1;
/*     */   }
/*     */   
/*     */   public void a(bod ☃, gy gy1) {
/* 678 */     this.T.put(☃, gy1);
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
/*     */   public Set<String> N() {
/* 694 */     return this.R;
/*     */   }
/*     */   
/*     */   public Set<String> O() {
/* 698 */     return this.S;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public gy P() {
/* 703 */     return this.U;
/*     */   }
/*     */   
/*     */   public void c(@Nullable gy ☃) {
/* 707 */     this.U = ☃;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\ccb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */