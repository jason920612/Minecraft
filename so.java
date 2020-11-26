/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.mojang.authlib.GameProfileRepository;
/*     */ import com.mojang.authlib.minecraft.MinecraftSessionService;
/*     */ import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
/*     */ import com.mojang.datafixers.DataFixer;
/*     */ import java.io.BufferedReader;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStreamReader;
/*     */ import java.net.InetAddress;
/*     */ import java.net.Proxy;
/*     */ import java.nio.charset.StandardCharsets;
/*     */ import java.util.Collections;
/*     */ import java.util.List;
/*     */ import java.util.Locale;
/*     */ import java.util.Random;
/*     */ import java.util.concurrent.TimeUnit;
/*     */ import java.util.function.BooleanSupplier;
/*     */ import java.util.regex.Pattern;
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
/*     */ public class so
/*     */   extends MinecraftServer
/*     */   implements pq
/*     */ {
/*  64 */   private static final Logger g = LogManager.getLogger();
/*     */ 
/*     */   
/*  67 */   private static final Pattern h = Pattern.compile("^[a-fA-F0-9]{40}$");
/*     */   
/*  69 */   private final List<ph> i = Collections.synchronizedList(Lists.newArrayList());
/*     */   private we j;
/*     */   private final wb k;
/*     */   private wg l;
/*     */   private ps m;
/*     */   private pk n;
/*     */   private boolean o;
/*     */   private axv p;
/*     */   private boolean q;
/*     */   
/*     */   public so(File ☃, DataFixer dataFixer, YggdrasilAuthenticationService yggdrasilAuthenticationService, MinecraftSessionService minecraftSessionService, GameProfileRepository gameProfileRepository, vl vl1) {
/*  80 */     super(☃, Proxy.NO_PROXY, dataFixer, new bv(true), yggdrasilAuthenticationService, minecraftSessionService, gameProfileRepository, vl1);
/*  81 */     this.k = new wb(this);
/*     */     
/*  83 */     new Thread(this, "Server Infinisleeper")
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*     */         public void run()
/*     */         {
/*     */           while (true) {
/*     */             try {
/*     */               while (true)
/*  94 */                 Thread.sleep(2147483647L);  break;
/*  95 */             } catch (InterruptedException interruptedException) {}
/*     */           } 
/*     */         }
/*     */       };
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean d() throws IOException {
/* 104 */     Thread ☃ = new Thread(this, "Server console handler")
/*     */       {
/*     */         public void run() {
/* 107 */           BufferedReader ☃ = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8));
/*     */           try {
/*     */             String str;
/* 110 */             while (!this.a.ab() && this.a.o() && (str = ☃.readLine()) != null) {
/* 111 */               this.a.a(str, this.a.aJ());
/*     */             }
/* 113 */           } catch (IOException iOException) {
/* 114 */             so.aZ().error("Exception handling console input", iOException);
/*     */           } 
/*     */         }
/*     */       };
/* 118 */     ☃.setDaemon(true);
/* 119 */     ☃.setUncaughtExceptionHandler(new e(g));
/* 120 */     ☃.start();
/*     */     
/* 122 */     g.info("Starting minecraft server version 1.13.2");
/*     */     
/* 124 */     if (Runtime.getRuntime().maxMemory() / 1024L / 1024L < 512L) {
/* 125 */       g.warn("To start the server with more ram, launch it as \"java -Xmx1024M -Xms1024M -jar minecraft_server.jar\"");
/*     */     }
/*     */     
/* 128 */     g.info("Loading properties");
/* 129 */     this.m = new ps(new File("server.properties"));
/* 130 */     this.n = new pk(new File("eula.txt"));
/*     */     
/* 132 */     if (!this.n.a()) {
/* 133 */       g.info("You need to agree to the EULA in order to run the server. Go to eula.txt for more info.");
/* 134 */       this.n.b();
/* 135 */       return false;
/*     */     } 
/*     */     
/* 138 */     if (H()) {
/* 139 */       b("127.0.0.1");
/*     */     } else {
/* 141 */       e(this.m.a("online-mode", true));
/* 142 */       f(this.m.a("prevent-proxy-connections", false));
/* 143 */       b(this.m.a("server-ip", ""));
/*     */     } 
/*     */     
/* 146 */     g(this.m.a("spawn-animals", true));
/* 147 */     h(this.m.a("spawn-npcs", true));
/* 148 */     i(this.m.a("pvp", true));
/* 149 */     j(this.m.a("allow-flight", false));
/* 150 */     a_(this.m.a("resource-pack", ""), aT());
/* 151 */     k(this.m.a("motd", "A Minecraft Server"));
/* 152 */     k(this.m.a("force-gamemode", false));
/* 153 */     c(this.m.a("player-idle-timeout", 0));
/* 154 */     l(this.m.a("enforce-whitelist", false));
/*     */ 
/*     */     
/* 157 */     if (this.m.a("difficulty", 1) < 0) {
/* 158 */       this.m.a("difficulty", Integer.valueOf(0));
/* 159 */     } else if (this.m.a("difficulty", 1) > 3) {
/* 160 */       this.m.a("difficulty", Integer.valueOf(3));
/*     */     } 
/*     */     
/* 163 */     this.o = this.m.a("generate-structures", true);
/* 164 */     int i = this.m.a("gamemode", axv.b.a());
/* 165 */     this.p = ayd.a(i);
/* 166 */     g.info("Default game type: {}", this.p);
/*     */     
/* 168 */     InetAddress inetAddress = null;
/* 169 */     if (!n().isEmpty()) {
/* 170 */       inetAddress = InetAddress.getByName(n());
/*     */     }
/* 172 */     if (F() < 0) {
/* 173 */       a(this.m.a("server-port", 25565));
/*     */     }
/*     */     
/* 176 */     g.info("Generating keypair");
/* 177 */     a(xh.b());
/*     */     
/* 179 */     g.info("Starting Minecraft server on {}:{}", n().isEmpty() ? "*" : n(), Integer.valueOf(F()));
/*     */     try {
/* 181 */       ae().a(inetAddress, F());
/* 182 */     } catch (IOException iOException) {
/* 183 */       g.warn("**** FAILED TO BIND TO PORT!");
/* 184 */       g.warn("The exception was: {}", iOException.toString());
/* 185 */       g.warn("Perhaps a server is already running on that port?");
/* 186 */       return false;
/*     */     } 
/*     */     
/* 189 */     if (!R()) {
/* 190 */       g.warn("**** SERVER IS RUNNING IN OFFLINE/INSECURE MODE!");
/* 191 */       g.warn("The server will make no attempt to authenticate usernames. Beware.");
/* 192 */       g.warn("While this makes the game possible to play without internet access, it also opens up the ability for hackers to connect with any username they choose.");
/* 193 */       g.warn("To change this, set \"online-mode\" to \"true\" in the server.properties file.");
/*     */     } 
/*     */     
/* 196 */     if (aX()) {
/* 197 */       ar().c();
/*     */     }
/* 199 */     if (!vo.a(this.m)) {
/* 200 */       return false;
/*     */     }
/*     */     
/* 203 */     a(new sn(this));
/*     */     
/* 205 */     long l1 = k.c();
/*     */     
/* 207 */     if (I() == null) {
/* 208 */       i(this.m.a("level-name", "world"));
/*     */     }
/* 210 */     String str1 = this.m.a("level-seed", "");
/* 211 */     String str2 = this.m.a("level-type", "DEFAULT");
/* 212 */     String str3 = this.m.a("generator-settings", "");
/* 213 */     long l2 = (new Random()).nextLong();
/* 214 */     if (!str1.isEmpty()) {
/*     */       try {
/* 216 */         long l = Long.parseLong(str1);
/* 217 */         if (l != 0L) {
/* 218 */           l2 = l;
/*     */         }
/* 220 */       } catch (NumberFormatException numberFormatException) {
/* 221 */         l2 = str1.hashCode();
/*     */       } 
/*     */     }
/* 224 */     ayg ayg = ayg.a(str2);
/* 225 */     if (ayg == null) {
/* 226 */       ayg = ayg.b;
/*     */     }
/*     */ 
/*     */     
/* 230 */     Y();
/* 231 */     j();
/* 232 */     P();
/* 233 */     aw();
/*     */     
/* 235 */     b(this.m.a("max-build-height", 256));
/* 236 */     b((aa() + 8) / 16 * 16);
/* 237 */     b(xq.a(aa(), 64, 256));
/* 238 */     this.m.a("max-build-height", Integer.valueOf(aa()));
/*     */     
/* 240 */     bkd.a(ar());
/* 241 */     bkd.a(ap());
/* 242 */     vl.a(R());
/*     */     
/* 244 */     g.info("Preparing level \"{}\"", I());
/* 245 */     JsonObject jsonObject = new JsonObject();
/* 246 */     if (ayg == ayg.c) {
/* 247 */       jsonObject.addProperty("flat_world_options", str3);
/* 248 */     } else if (!str3.isEmpty()) {
/* 249 */       jsonObject = xj.a(str3);
/*     */     } 
/* 251 */     a(I(), I(), l2, ayg, (JsonElement)jsonObject);
/* 252 */     long l3 = k.c() - l1;
/* 253 */     String str4 = String.format(Locale.ROOT, "%.3fs", new Object[] { Double.valueOf(l3 / 1.0E9D) });
/* 254 */     g.info("Done ({})! For help, type \"help\"", str4);
/*     */ 
/*     */     
/* 257 */     if (this.m.a("announce-player-achievements")) {
/* 258 */       aO().a("announceAdvancements", this.m.a("announce-player-achievements", true) ? "true" : "false", this);
/* 259 */       this.m.b("announce-player-achievements");
/* 260 */       this.m.b();
/*     */     } 
/*     */     
/* 263 */     if (this.m.a("enable-query", false)) {
/* 264 */       g.info("Starting GS4 status listener");
/* 265 */       this.j = new we(this);
/* 266 */       this.j.a();
/*     */     } 
/* 268 */     if (this.m.a("enable-rcon", false)) {
/* 269 */       g.info("Starting remote control listener");
/* 270 */       this.l = new wg(this);
/* 271 */       this.l.a();
/*     */     } 
/*     */     
/* 274 */     if (aY() > 0L) {
/* 275 */       Thread thread = new Thread(new sp(this));
/* 276 */       thread.setUncaughtExceptionHandler(new f(g));
/* 277 */       thread.setName("Server Watchdog");
/* 278 */       thread.setDaemon(true);
/* 279 */       thread.start();
/*     */     } 
/*     */ 
/*     */     
/* 283 */     atf.a.a(ary.g, ez.a());
/*     */     
/* 285 */     return true;
/*     */   }
/*     */   
/*     */   public String aT() {
/* 289 */     if (this.m.a("resource-pack-hash")) {
/* 290 */       if (this.m.a("resource-pack-sha1")) {
/* 291 */         g.warn("resource-pack-hash is deprecated and found along side resource-pack-sha1. resource-pack-hash will be ignored.");
/*     */       } else {
/* 293 */         g.warn("resource-pack-hash is deprecated. Please use resource-pack-sha1 instead.");
/* 294 */         this.m.a("resource-pack-sha1", this.m.a("resource-pack-hash", ""));
/* 295 */         this.m.b("resource-pack-hash");
/*     */       } 
/*     */     }
/*     */     
/* 299 */     String ☃ = this.m.a("resource-pack-sha1", "");
/* 300 */     if (!☃.isEmpty() && !h.matcher(☃).matches()) {
/* 301 */       g.warn("Invalid sha1 for ressource-pack-sha1");
/*     */     }
/* 303 */     if (!this.m.a("resource-pack", "").isEmpty() && ☃.isEmpty()) {
/* 304 */       g.warn("You specified a resource pack without providing a sha1 hash. Pack will be updated on the client only if you change the name of the pack.");
/*     */     }
/*     */     
/* 307 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(axv ☃) {
/* 312 */     super.a(☃);
/* 313 */     this.p = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean f() {
/* 318 */     return this.o;
/*     */   }
/*     */ 
/*     */   
/*     */   public axv g() {
/* 323 */     return this.p;
/*     */   }
/*     */ 
/*     */   
/*     */   public adi h() {
/* 328 */     return adi.a(this.m.a("difficulty", adi.c.a()));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean i() {
/* 333 */     return this.m.a("hardcore", false);
/*     */   }
/*     */ 
/*     */   
/*     */   public b b(b ☃) {
/* 338 */     ☃ = super.b(☃);
/*     */     
/* 340 */     ☃.g().a("Is Modded", () -> {
/*     */           String ☃ = getServerModName();
/*     */ 
/*     */           
/*     */           return !"vanilla".equals(☃) ? ("Definitely; Server brand changed to '" + ☃ + "'") : "Unknown (can't tell)";
/*     */         });
/*     */ 
/*     */     
/* 348 */     ☃.g().a("Type", () -> "Dedicated Server (map_server.txt)");
/*     */     
/* 350 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void t() {
/* 355 */     System.exit(0);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b(BooleanSupplier ☃) {
/* 360 */     super.b(☃);
/* 361 */     aU();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean u() {
/* 366 */     return this.m.a("allow-nether", true);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean K() {
/* 371 */     return this.m.a("spawn-monsters", true);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adu ☃) {
/* 376 */     ☃.a("whitelist_enabled", Boolean.valueOf(aV().r()));
/* 377 */     ☃.a("whitelist_count", Integer.valueOf((aV().l()).length));
/* 378 */     super.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean P() {
/* 383 */     if (this.m.a("snooper-enabled", true)); return false;
/*     */   }
/*     */   
/*     */   public void a(String ☃, bu bu1) {
/* 387 */     this.i.add(new ph(☃, bu1));
/*     */   }
/*     */   
/*     */   public void aU() {
/* 391 */     while (!this.i.isEmpty()) {
/* 392 */       ph ☃ = this.i.remove(0);
/* 393 */       aI().a(☃.b, ☃.a);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean Q() {
/* 399 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean V() {
/* 404 */     return this.m.a("use-native-transport", true);
/*     */   }
/*     */ 
/*     */   
/*     */   public sn aV() {
/* 409 */     return (sn)super.ac();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean ad() {
/* 414 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(String ☃, int i) {
/* 419 */     return this.m.a(☃, i);
/*     */   }
/*     */ 
/*     */   
/*     */   public String a(String ☃, String str1) {
/* 424 */     return this.m.a(☃, str1);
/*     */   }
/*     */   
/*     */   public boolean a(String ☃, boolean bool) {
/* 428 */     return this.m.a(☃, bool);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(String ☃, Object object) {
/* 433 */     this.m.a(☃, object);
/*     */   }
/*     */ 
/*     */   
/*     */   public void c_() {
/* 438 */     this.m.b();
/*     */   }
/*     */ 
/*     */   
/*     */   public String d_() {
/* 443 */     File ☃ = this.m.c();
/* 444 */     if (☃ != null) {
/* 445 */       return ☃.getAbsolutePath();
/*     */     }
/* 447 */     return "No settings file";
/*     */   }
/*     */ 
/*     */   
/*     */   public String e() {
/* 452 */     return n();
/*     */   }
/*     */ 
/*     */   
/*     */   public int e_() {
/* 457 */     return F();
/*     */   }
/*     */ 
/*     */   
/*     */   public String m() {
/* 462 */     return Z();
/*     */   }
/*     */   
/*     */   public void aW() {
/* 466 */     sr.a(this);
/* 467 */     this.q = true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean ag() {
/* 472 */     return this.q;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(axv ☃, boolean bool, int i) {
/* 477 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean Y() {
/* 482 */     return this.m.a("enable-command-block", false);
/*     */   }
/*     */ 
/*     */   
/*     */   public int al() {
/* 487 */     return this.m.a("spawn-protection", super.al());
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(axy ☃, el el1, aog aog1) {
/* 492 */     if (☃.t.q() != bod.a) {
/* 493 */       return false;
/*     */     }
/*     */ 
/*     */     
/* 497 */     if (aV().m().d()) {
/* 498 */       return false;
/*     */     }
/* 500 */     if (aV().h(aog1.do())) {
/* 501 */       return false;
/*     */     }
/* 503 */     if (al() <= 0) {
/* 504 */       return false;
/*     */     }
/*     */     
/* 507 */     el el2 = ☃.n();
/* 508 */     int i = xq.a(el1.o() - el2.o());
/* 509 */     int j = xq.a(el1.q() - el2.q());
/* 510 */     int k = Math.max(i, j);
/*     */     
/* 512 */     return (k <= al());
/*     */   }
/*     */ 
/*     */   
/*     */   public int j() {
/* 517 */     return this.m.a("op-permission-level", 4);
/*     */   }
/*     */ 
/*     */   
/*     */   public void c(int ☃) {
/* 522 */     super.c(☃);
/* 523 */     this.m.a("player-idle-timeout", Integer.valueOf(☃));
/* 524 */     c_();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean k() {
/* 529 */     return this.m.a("broadcast-rcon-to-ops", true);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean B_() {
/* 534 */     return this.m.a("broadcast-console-to-ops", true);
/*     */   }
/*     */ 
/*     */   
/*     */   public int au() {
/* 539 */     int ☃ = this.m.a("max-world-size", super.au());
/* 540 */     if (☃ < 1) {
/* 541 */       ☃ = 1;
/* 542 */     } else if (☃ > super.au()) {
/* 543 */       ☃ = super.au();
/*     */     } 
/* 545 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public int aw() {
/* 550 */     return this.m.a("network-compression-threshold", super.aw());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean aX() {
/* 556 */     boolean bool1 = false;
/* 557 */     int ☃ = 0;
/* 558 */     while (!bool1 && ☃ <= 2) {
/* 559 */       if (☃ > 0) {
/* 560 */         g.warn("Encountered a problem while converting the user banlist, retrying in a few seconds");
/* 561 */         ba();
/*     */       } 
/* 563 */       bool1 = vo.a(this);
/* 564 */       ☃++;
/*     */     } 
/*     */     
/* 567 */     boolean bool2 = false;
/* 568 */     ☃ = 0;
/* 569 */     while (!bool2 && ☃ <= 2) {
/* 570 */       if (☃ > 0) {
/* 571 */         g.warn("Encountered a problem while converting the ip banlist, retrying in a few seconds");
/* 572 */         ba();
/*     */       } 
/* 574 */       bool2 = vo.b(this);
/* 575 */       ☃++;
/*     */     } 
/*     */     
/* 578 */     boolean bool3 = false;
/* 579 */     ☃ = 0;
/* 580 */     while (!bool3 && ☃ <= 2) {
/* 581 */       if (☃ > 0) {
/* 582 */         g.warn("Encountered a problem while converting the op list, retrying in a few seconds");
/* 583 */         ba();
/*     */       } 
/* 585 */       bool3 = vo.c(this);
/* 586 */       ☃++;
/*     */     } 
/*     */     
/* 589 */     boolean bool4 = false;
/* 590 */     ☃ = 0;
/* 591 */     while (!bool4 && ☃ <= 2) {
/* 592 */       if (☃ > 0) {
/* 593 */         g.warn("Encountered a problem while converting the whitelist, retrying in a few seconds");
/* 594 */         ba();
/*     */       } 
/* 596 */       bool4 = vo.d(this);
/* 597 */       ☃++;
/*     */     } 
/*     */     
/* 600 */     boolean bool5 = false;
/* 601 */     ☃ = 0;
/* 602 */     while (!bool5 && ☃ <= 2) {
/* 603 */       if (☃ > 0) {
/* 604 */         g.warn("Encountered a problem while converting the player save files, retrying in a few seconds");
/* 605 */         ba();
/*     */       } 
/* 607 */       bool5 = vo.a(this, this.m);
/* 608 */       ☃++;
/*     */     } 
/*     */     
/* 611 */     return (bool1 || bool2 || bool3 || bool4 || bool5);
/*     */   }
/*     */   
/*     */   private void ba() {
/*     */     try {
/* 616 */       Thread.sleep(5000L);
/* 617 */     } catch (InterruptedException ☃) {
/*     */       return;
/*     */     } 
/*     */   }
/*     */   
/*     */   public long aY() {
/* 623 */     return this.m.a("max-tick-time", TimeUnit.MINUTES.toMillis(1L));
/*     */   }
/*     */ 
/*     */   
/*     */   public String f_() {
/* 628 */     return "";
/*     */   }
/*     */ 
/*     */   
/*     */   public String a_(String ☃) {
/* 633 */     this.k.d();
/* 634 */     aI().a(this.k.f(), ☃);
/* 635 */     return this.k.e();
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\so.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */