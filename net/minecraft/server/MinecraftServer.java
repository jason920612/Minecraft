/*      */ package net.minecraft.server;
/*      */ import acv;
/*      */ import ada;
/*      */ import adi;
/*      */ import adu;
/*      */ import adv;
/*      */ import avl;
/*      */ import axm;
/*      */ import axt;
/*      */ import axu;
/*      */ import axv;
/*      */ import axy;
/*      */ import aya;
/*      */ import ayb;
/*      */ import ayd;
/*      */ import ayg;
/*      */ import b;
/*      */ import bnj;
/*      */ import bod;
/*      */ import bt;
/*      */ import bu;
/*      */ import bv;
/*      */ import ccb;
/*      */ import ccc;
/*      */ import cce;
/*      */ import cck;
/*      */ import cct;
/*      */ import ced;
/*      */ import cee;
/*      */ import com.google.common.base.Stopwatch;
/*      */ import com.google.common.collect.Lists;
/*      */ import com.google.common.collect.Maps;
/*      */ import com.google.common.collect.Sets;
/*      */ import com.google.common.util.concurrent.Futures;
/*      */ import com.google.common.util.concurrent.ListenableFuture;
/*      */ import com.google.common.util.concurrent.ListenableFutureTask;
/*      */ import com.google.gson.JsonElement;
/*      */ import com.mojang.authlib.GameProfile;
/*      */ import com.mojang.authlib.GameProfileRepository;
/*      */ import com.mojang.authlib.minecraft.MinecraftSessionService;
/*      */ import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
/*      */ import com.mojang.datafixers.DataFixer;
/*      */ import e;
/*      */ import el;
/*      */ import ff;
/*      */ import h;
/*      */ import ij;
/*      */ import io.netty.buffer.ByteBuf;
/*      */ import io.netty.buffer.ByteBufOutputStream;
/*      */ import io.netty.buffer.Unpooled;
/*      */ import iq;
/*      */ import ir;
/*      */ import it.unimi.dsi.fastutil.longs.LongIterator;
/*      */ import iv;
/*      */ import java.awt.GraphicsEnvironment;
/*      */ import java.awt.image.BufferedImage;
/*      */ import java.io.File;
/*      */ import java.io.IOException;
/*      */ import java.io.OutputStream;
/*      */ import java.io.UnsupportedEncodingException;
/*      */ import java.net.Proxy;
/*      */ import java.net.URLEncoder;
/*      */ import java.nio.ByteBuffer;
/*      */ import java.nio.charset.StandardCharsets;
/*      */ import java.security.KeyPair;
/*      */ import java.util.Arrays;
/*      */ import java.util.Collections;
/*      */ import java.util.Date;
/*      */ import java.util.List;
/*      */ import java.util.Map;
/*      */ import java.util.Queue;
/*      */ import java.util.Random;
/*      */ import java.util.Set;
/*      */ import java.util.UUID;
/*      */ import java.util.concurrent.Callable;
/*      */ import java.util.concurrent.CompletableFuture;
/*      */ import java.util.concurrent.ExecutionException;
/*      */ import java.util.concurrent.Executors;
/*      */ import java.util.concurrent.FutureTask;
/*      */ import java.util.concurrent.TimeUnit;
/*      */ import java.util.concurrent.TimeoutException;
/*      */ import java.util.function.BooleanSupplier;
/*      */ import java.util.function.Function;
/*      */ import javax.annotation.Nullable;
/*      */ import javax.imageio.ImageIO;
/*      */ import k;
/*      */ import lr;
/*      */ import om;
/*      */ import org.apache.commons.lang3.Validate;
/*      */ import org.apache.logging.log4j.LogManager;
/*      */ import org.apache.logging.log4j.Logger;
/*      */ import po;
/*      */ import pp;
/*      */ import pr;
/*      */ import pt;
/*      */ import pv;
/*      */ import so;
/*      */ import sw;
/*      */ import sy;
/*      */ import td;
/*      */ import te;
/*      */ import tf;
/*      */ import ub;
/*      */ import ul;
/*      */ import um;
/*      */ import uv;
/*      */ import ux;
/*      */ import uy;
/*      */ import uz;
/*      */ import va;
/*      */ import vd;
/*      */ import vg;
/*      */ import vh;
/*      */ import vl;
/*      */ import vp;
/*      */ import vr;
/*      */ import vw;
/*      */ import xb;
/*      */ import xq;
/*      */ import xr;
/*      */ import xs;
/*      */ import xz;
/*      */ 
/*      */ public abstract class MinecraftServer implements acv, adv, bt, Runnable {
/*  125 */   private static final Logger g = LogManager.getLogger();
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
/*  138 */   public static final File a = new File("usercache.json");
/*      */ 
/*      */   
/*      */   private final cce h;
/*      */   
/*  143 */   private final adu i = new adu("server", this, k.b());
/*      */   private final File j;
/*  145 */   private final List<pt> k = Lists.newArrayList();
/*  146 */   public final xr b = new xr();
/*      */   private final ub l;
/*  148 */   private final om m = new om();
/*  149 */   private final Random n = new Random();
/*      */   
/*      */   private final DataFixer o;
/*      */   private String p;
/*  153 */   private int q = -1;
/*  154 */   private final Map<bod, td> r = Maps.newIdentityHashMap();
/*      */   
/*      */   private vp s;
/*      */   
/*      */   private boolean t = true;
/*      */   private boolean u;
/*      */   private int v;
/*      */   protected final Proxy c;
/*      */   private ij w;
/*      */   private int x;
/*      */   private boolean y;
/*      */   private boolean z;
/*      */   private boolean A;
/*      */   private boolean B;
/*      */   private boolean C;
/*      */   private boolean D;
/*      */   private String E;
/*      */   private int F;
/*      */   private int G;
/*  173 */   public final long[] d = new long[100];
/*      */   
/*  175 */   protected final Map<bod, long[]> e = Maps.newIdentityHashMap();
/*      */   
/*      */   private KeyPair H;
/*      */   private String I;
/*      */   private String J;
/*      */   private boolean L;
/*      */   private boolean M;
/*  182 */   private String N = "";
/*  183 */   private String O = "";
/*      */   private boolean P;
/*      */   private long Q;
/*      */   private ij R;
/*      */   private boolean S;
/*      */   private boolean T;
/*      */   private final YggdrasilAuthenticationService U;
/*      */   private final MinecraftSessionService V;
/*      */   private final GameProfileRepository W;
/*      */   private final vl X;
/*      */   private long Y;
/*  194 */   protected final Queue<FutureTask<?>> f = Queues.newConcurrentLinkedQueue();
/*      */   private Thread Z;
/*  196 */   private long aa = k.b();
/*      */   
/*  198 */   private final vd ac = (vd)new vh(um.b);
/*  199 */   private final ux<va> ad = new ux(va::new);
/*      */   private uv ae;
/*      */   private final bv af;
/*  202 */   private final avl ag = new avl();
/*  203 */   private final xb ah = new xb();
/*  204 */   private final pr ai = new pr(this);
/*  205 */   private final pv aj = new pv(this);
/*  206 */   private final cct ak = new cct();
/*  207 */   private final po al = new po();
/*  208 */   private final pp am = new pp(this);
/*      */   
/*      */   private boolean an;
/*      */   
/*      */   private boolean ao;
/*      */   
/*      */   private float ap;
/*      */ 
/*      */   
/*      */   public MinecraftServer(@Nullable File ☃, Proxy proxy, DataFixer dataFixer, bv bv1, YggdrasilAuthenticationService yggdrasilAuthenticationService, MinecraftSessionService minecraftSessionService, GameProfileRepository gameProfileRepository, vl vl1) {
/*  218 */     this.c = proxy;
/*  219 */     this.af = bv1;
/*  220 */     this.U = yggdrasilAuthenticationService;
/*  221 */     this.V = minecraftSessionService;
/*  222 */     this.W = gameProfileRepository;
/*  223 */     this.X = vl1;
/*  224 */     this.j = ☃;
/*  225 */     this.l = (☃ == null) ? null : new ub(this);
/*  226 */     this.h = (☃ == null) ? null : (cce)new cbw(☃.toPath(), ☃.toPath().resolve("../backups"), dataFixer);
/*  227 */     this.o = dataFixer;
/*  228 */     this.ac.a((vg)this.ah);
/*  229 */     this.ac.a((vg)this.ag);
/*  230 */     this.ac.a((vg)this.ak);
/*  231 */     this.ac.a((vg)this.am);
/*  232 */     this.ac.a((vg)this.al);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   protected void a(String ☃) {
/*  238 */     if (M().b(☃)) {
/*  239 */       g.info("Converting map!");
/*  240 */       b((ij)new ir("menu.convertingLevel", new Object[0]));
/*  241 */       M().a(☃, new xs(this) {
/*  242 */             private long b = k.b();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */             
/*      */             public void a(ij ☃) {}
/*      */ 
/*      */ 
/*      */ 
/*      */             
/*      */             public void a(int ☃) {
/*  254 */               if (k.b() - this.b >= 1000L) {
/*  255 */                 this.b = k.b();
/*  256 */                 MinecraftServer.aS().info("Converting... {}%", Integer.valueOf(☃));
/*      */               } 
/*      */             }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */             
/*      */             public void c(ij ☃) {}
/*      */           });
/*      */     } 
/*  270 */     if (this.ao) {
/*  271 */       g.info("Forcing world upgrade!");
/*      */       
/*  273 */       ccb ccb = M().c(I());
/*  274 */       if (ccb != null) {
/*  275 */         ada ada = new ada(I(), M(), ccb);
/*  276 */         ij ij1 = null;
/*  277 */         while (!ada.b()) {
/*  278 */           ij ij2 = ada.g();
/*  279 */           if (ij1 != ij2) {
/*  280 */             ij1 = ij2;
/*  281 */             g.info(ada.g().getString());
/*      */           } 
/*  283 */           int i = ada.d();
/*  284 */           if (i > 0) {
/*  285 */             int j = ada.e() + ada.f();
/*  286 */             g.info("{}% completed ({} / {} chunks)...", Integer.valueOf(xq.d(j / i * 100.0F)), Integer.valueOf(j), Integer.valueOf(i));
/*      */           } 
/*      */           
/*  289 */           if (ab()) {
/*  290 */             ada.a(); continue;
/*      */           } 
/*      */           try {
/*  293 */             Thread.sleep(1000L);
/*  294 */           } catch (InterruptedException interruptedException) {}
/*      */         } 
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   protected synchronized void b(ij ☃) {
/*  303 */     this.R = ☃;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(String ☃, String str1, long l, ayg ayg1, JsonElement jsonElement) {
/*      */     ayd ayd;
/*  312 */     a(☃);
/*  313 */     b((ij)new ir("menu.loadingLevel", new Object[0]));
/*      */ 
/*      */     
/*  316 */     ccc ccc = M().a(☃, this);
/*  317 */     a(I(), ccc);
/*      */ 
/*      */     
/*  320 */     ccb ccb = ccc.d();
/*  321 */     if (ccb == null) {
/*  322 */       if (L()) {
/*  323 */         ayd = sw.a;
/*      */       } else {
/*  325 */         ayd = new ayd(l, g(), f(), i(), ayg1);
/*  326 */         ayd.a(jsonElement);
/*  327 */         if (this.M) {
/*  328 */           ayd.a();
/*      */         }
/*      */       } 
/*      */       
/*  332 */       ccb = new ccb(ayd, str1);
/*      */     } else {
/*  334 */       ccb.a(str1);
/*  335 */       ayd = new ayd(ccb);
/*      */     } 
/*      */     
/*  338 */     a(ccc.b(), ccb);
/*      */     
/*  340 */     cck cck = new cck(ccc);
/*  341 */     a(ccc, cck, ccb, ayd);
/*      */     
/*  343 */     a(h());
/*      */     
/*  345 */     a(cck);
/*      */   }
/*      */   
/*      */   protected void a(ccc ☃, cck cck1, ccb ccb1, ayd ayd1) {
/*  349 */     if (L()) {
/*  350 */       this.r.put(bod.a, (new sw(this, ☃, cck1, ccb1, bod.a, this.b)).i_());
/*      */     } else {
/*  352 */       this.r.put(bod.a, (new td(this, ☃, cck1, ccb1, bod.a, this.b)).i_());
/*      */     } 
/*      */     
/*  355 */     td td = a(bod.a);
/*      */     
/*  357 */     td.a(ayd1);
/*  358 */     td.a((ayb)new te(this, td));
/*  359 */     if (!H()) {
/*  360 */       td.g().a(g());
/*      */     }
/*      */     
/*  363 */     sy sy1 = (new sy(this, ☃, bod.b, td, this.b)).b();
/*  364 */     this.r.put(bod.b, sy1);
/*  365 */     sy1.a((ayb)new te(this, (td)sy1));
/*  366 */     if (!H()) {
/*  367 */       sy1.g().a(g());
/*      */     }
/*      */     
/*  370 */     sy sy2 = (new sy(this, ☃, bod.c, td, this.b)).b();
/*  371 */     this.r.put(bod.c, sy2);
/*  372 */     sy2.a((ayb)new te(this, (td)sy2));
/*  373 */     if (!H()) {
/*  374 */       sy2.g().a(g());
/*      */     }
/*      */     
/*  377 */     ac().a(td);
/*      */     
/*  379 */     if (ccb1.P() != null) {
/*  380 */       aP().a(ccb1.P());
/*      */     }
/*      */   }
/*      */   
/*      */   protected void a(File ☃, ccb ccb1) {
/*  385 */     this.ad.a((uy)new uz());
/*  386 */     this.ae = new uv(new File(☃, "datapacks"));
/*  387 */     this.ad.a((uy)this.ae);
/*  388 */     this.ad.a();
/*  389 */     List<va> list = Lists.newArrayList();
/*  390 */     for (String str : ccb1.O()) {
/*  391 */       va va = this.ad.a(str);
/*  392 */       if (va != null) {
/*  393 */         list.add(va); continue;
/*      */       } 
/*  395 */       g.warn("Missing data pack {}", str);
/*      */     } 
/*      */     
/*  398 */     this.ad.a(list);
/*      */     
/*  400 */     a(ccb1);
/*      */   }
/*      */ 
/*      */   
/*      */   protected void a(cck ☃) {
/*  405 */     int i = 16;
/*  406 */     int j = 4;
/*  407 */     int k = 12;
/*      */     
/*  409 */     int m = 192;
/*  410 */     int n = 625;
/*      */     
/*  412 */     b((ij)new ir("menu.generatingTerrain", new Object[0]));
/*      */     
/*  414 */     td td = a(bod.a);
/*  415 */     g.info("Preparing start region for dimension " + bod.a(td.t.q()));
/*  416 */     el el = td.n();
/*      */ 
/*      */     
/*  419 */     List<axm> list = Lists.newArrayList();
/*  420 */     Set<axm> set = Sets.newConcurrentHashSet();
/*      */     
/*  422 */     Stopwatch stopwatch = Stopwatch.createStarted();
/*      */     
/*  424 */     for (int i1 = -192; i1 <= 192 && o(); i1 += 16) {
/*  425 */       for (int i2 = -192; i2 <= 192 && o(); i2 += 16) {
/*  426 */         list.add(new axm(el.o() + i1 >> 4, el.q() + i2 >> 4));
/*      */       }
/*      */       
/*  429 */       CompletableFuture<?> completableFuture = td.v().a(list, bnj1 -> ☃.add(bnj1.d()));
/*      */       
/*  431 */       while (!completableFuture.isDone()) {
/*      */         try {
/*  433 */           completableFuture.get(1L, TimeUnit.SECONDS);
/*  434 */         } catch (InterruptedException interruptedException) {
/*  435 */           throw new RuntimeException(interruptedException);
/*  436 */         } catch (ExecutionException executionException) {
/*  437 */           if (executionException.getCause() instanceof RuntimeException) {
/*  438 */             throw (RuntimeException)executionException.getCause();
/*      */           }
/*  440 */           throw new RuntimeException(executionException.getCause());
/*  441 */         } catch (TimeoutException timeoutException) {
/*  442 */           a((ij)new ir("menu.preparingSpawn", new Object[0]), set.size() * 100 / 625);
/*      */         } 
/*      */       } 
/*  445 */       a((ij)new ir("menu.preparingSpawn", new Object[0]), set.size() * 100 / 625);
/*      */     } 
/*  447 */     g.info("Time elapsed: {} ms", Long.valueOf(stopwatch.elapsed(TimeUnit.MILLISECONDS)));
/*      */     
/*  449 */     for (bod bod : bod.b()) {
/*  450 */       axt axt = (axt)☃.a(bod, axt::new, "chunks");
/*  451 */       if (axt != null) {
/*  452 */         td td1 = a(bod);
/*  453 */         LongIterator longIterator = axt.a().iterator();
/*  454 */         while (longIterator.hasNext()) {
/*      */           
/*  456 */           a((ij)new ir("menu.loadingForcedChunks", new Object[] { bod }), axt.a().size() * 100 / 625);
/*  457 */           long l = longIterator.nextLong();
/*  458 */           axm axm = new axm(l);
/*  459 */           td1.v().a(axm.a, axm.b, true, true);
/*      */         } 
/*      */       } 
/*      */     } 
/*      */     
/*  464 */     l();
/*      */   }
/*      */   
/*      */   protected void a(String ☃, ccc ccc1) {
/*  468 */     File file = new File(ccc1.b(), "resources.zip");
/*  469 */     if (file.isFile()) {
/*      */       try {
/*  471 */         a_("level://" + URLEncoder.encode(☃, StandardCharsets.UTF_8.toString()) + "/" + "resources.zip", "");
/*  472 */       } catch (UnsupportedEncodingException unsupportedEncodingException) {
/*  473 */         g.warn("Something went wrong url encoding {}", ☃);
/*      */       } 
/*      */     }
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
/*      */   protected void a(ij ☃, int i) {
/*  491 */     this.w = ☃;
/*  492 */     this.x = i;
/*  493 */     g.info("{}: {}%", ☃.getString(), Integer.valueOf(i));
/*      */   }
/*      */   
/*      */   protected void l() {
/*  497 */     this.w = null;
/*  498 */     this.x = 0;
/*      */   }
/*      */   
/*      */   protected void a(boolean ☃) {
/*  502 */     for (td td : w()) {
/*  503 */       if (td != null) {
/*  504 */         if (!☃) {
/*  505 */           g.info("Saving chunks for level '{}'/{}", td.g().j(), bod.a(td.t.q()));
/*      */         }
/*      */         try {
/*  508 */           td.a(true, null);
/*  509 */         } catch (aya aya) {
/*  510 */           g.warn(aya.getMessage());
/*      */         } 
/*      */       } 
/*      */     } 
/*      */   }
/*      */   
/*      */   protected void h_() {
/*  517 */     g.info("Stopping server");
/*  518 */     if (ae() != null) {
/*  519 */       ae().b();
/*      */     }
/*  521 */     if (this.s != null) {
/*  522 */       g.info("Saving players");
/*  523 */       this.s.j();
/*  524 */       this.s.u();
/*      */     } 
/*  526 */     g.info("Saving worlds");
/*  527 */     for (td ☃ : w()) {
/*  528 */       if (☃ != null) {
/*  529 */         ☃.b = false;
/*      */       }
/*      */     } 
/*  532 */     a(false);
/*  533 */     for (td ☃ : w()) {
/*  534 */       if (☃ != null) {
/*  535 */         ☃.close();
/*      */       }
/*      */     } 
/*  538 */     if (this.i.d()) {
/*  539 */       this.i.e();
/*      */     }
/*      */   }
/*      */   
/*      */   public String n() {
/*  544 */     return this.p;
/*      */   }
/*      */   
/*      */   public void b(String ☃) {
/*  548 */     this.p = ☃;
/*      */   }
/*      */   
/*      */   public boolean o() {
/*  552 */     return this.t;
/*      */   }
/*      */   
/*      */   public void p() {
/*  556 */     this.t = false;
/*      */   }
/*      */   
/*      */   private boolean aT() {
/*  560 */     return (k.b() < this.aa);
/*      */   }
/*      */ 
/*      */   
/*      */   public void run() {
/*      */     try {
/*  566 */       if (d()) {
/*  567 */         this.aa = k.b();
/*      */         
/*  569 */         this.m.a((ij)new iq(this.E));
/*  570 */         this.m.a(new om.c("1.13.2", 404));
/*      */         
/*  572 */         a(this.m);
/*      */         
/*  574 */         while (this.t) {
/*  575 */           long ☃ = k.b() - this.aa;
/*      */           
/*  577 */           if (☃ > 2000L && this.aa - this.Q >= 15000L) {
/*  578 */             long l = ☃ / 50L;
/*  579 */             g.warn("Can't keep up! Is the server overloaded? Running {}ms or {} ticks behind", Long.valueOf(☃), Long.valueOf(l));
/*  580 */             this.aa += l * 50L;
/*  581 */             this.Q = this.aa;
/*      */           } 
/*      */           
/*  584 */           a(this::aT);
/*      */           
/*  586 */           this.aa += 50L;
/*      */           
/*  588 */           while (aT()) {
/*  589 */             Thread.sleep(1L);
/*      */           }
/*      */           
/*  592 */           this.P = true;
/*      */         } 
/*      */       } else {
/*  595 */         a((b)null);
/*      */       } 
/*  597 */     } catch (Throwable ☃) {
/*  598 */       b b; g.error("Encountered an unexpected exception", ☃);
/*      */ 
/*      */       
/*  601 */       if (☃ instanceof h) {
/*  602 */         b = b(((h)☃).a());
/*      */       } else {
/*  604 */         b = b(new b("Exception in server tick loop", ☃));
/*      */       } 
/*      */       
/*  607 */       File file = new File(new File(s(), "crash-reports"), "crash-" + (new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss")).format(new Date()) + "-server.txt");
/*      */       
/*  609 */       if (b.a(file)) {
/*  610 */         g.error("This crash report has been saved to: {}", file.getAbsolutePath());
/*      */       } else {
/*  612 */         g.error("We were unable to save this crash report to disk.");
/*      */       } 
/*      */       
/*  615 */       a(b);
/*      */     } finally {
/*      */       try {
/*  618 */         this.u = true;
/*  619 */         h_();
/*  620 */       } catch (Throwable ☃) {
/*  621 */         g.error("Exception stopping the server", ☃);
/*      */       } finally {
/*  623 */         t();
/*      */       } 
/*      */     } 
/*      */   }
/*      */   
/*      */   public void a(om ☃) {
/*  629 */     File file = c("server-icon.png");
/*  630 */     if (!file.exists()) {
/*  631 */       file = M().b(I(), "icon.png");
/*      */     }
/*  633 */     if (file.isFile()) {
/*  634 */       ByteBuf byteBuf = Unpooled.buffer();
/*      */       
/*      */       try {
/*  637 */         BufferedImage bufferedImage = ImageIO.read(file);
/*  638 */         Validate.validState((bufferedImage.getWidth() == 64), "Must be 64 pixels wide", new Object[0]);
/*  639 */         Validate.validState((bufferedImage.getHeight() == 64), "Must be 64 pixels high", new Object[0]);
/*  640 */         ImageIO.write(bufferedImage, "PNG", (OutputStream)new ByteBufOutputStream(byteBuf));
/*  641 */         ByteBuffer byteBuffer = Base64.getEncoder().encode(byteBuf.nioBuffer());
/*  642 */         ☃.a("data:image/png;base64," + StandardCharsets.UTF_8.decode(byteBuffer));
/*  643 */       } catch (Exception exception) {
/*  644 */         g.error("Couldn't load server icon", exception);
/*      */       } finally {
/*  646 */         byteBuf.release();
/*      */       } 
/*      */     } 
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
/*      */   public File s() {
/*  661 */     return new File(".");
/*      */   }
/*      */ 
/*      */   
/*      */   protected void a(b ☃) {}
/*      */ 
/*      */   
/*      */   public void t() {}
/*      */   
/*      */   protected void a(BooleanSupplier ☃) {
/*  671 */     long l1 = k.c();
/*      */     
/*  673 */     this.v++;
/*      */     
/*  675 */     if (this.S) {
/*  676 */       this.S = false;
/*  677 */       this.b.a(this.v);
/*      */     } 
/*      */     
/*  680 */     this.b.a("root");
/*  681 */     b(☃);
/*      */     
/*  683 */     if (l1 - this.Y >= 5000000000L) {
/*  684 */       this.Y = l1;
/*  685 */       this.m.a(new om.a(z(), y()));
/*      */       
/*  687 */       GameProfile[] arrayOfGameProfile = new GameProfile[Math.min(y(), 12)];
/*  688 */       int i = xq.a(this.n, 0, y() - arrayOfGameProfile.length);
/*  689 */       for (int j = 0; j < arrayOfGameProfile.length; j++) {
/*  690 */         arrayOfGameProfile[j] = ((tf)this.s.v().get(i + j)).do();
/*      */       }
/*  692 */       Collections.shuffle(Arrays.asList((Object[])arrayOfGameProfile));
/*  693 */       this.m.b().a(arrayOfGameProfile);
/*      */     } 
/*      */     
/*  696 */     if (this.v % 900 == 0) {
/*  697 */       this.b.a("save");
/*  698 */       this.s.j();
/*  699 */       a(true);
/*  700 */       this.b.e();
/*      */     } 
/*      */     
/*  703 */     this.b.a("snooper");
/*  704 */     if (!this.i.d() && this.v > 100) {
/*  705 */       this.i.a();
/*      */     }
/*      */     
/*  708 */     if (this.v % 6000 == 0) {
/*  709 */       this.i.b();
/*      */     }
/*  711 */     this.b.e();
/*      */     
/*  713 */     this.b.a("tallying");
/*  714 */     long l2 = this.d[this.v % 100] = k.c() - l1;
/*  715 */     this.ap = this.ap * 0.8F + (float)l2 / 1000000.0F * 0.19999999F;
/*      */     
/*  717 */     this.b.e();
/*      */     
/*  719 */     this.b.e();
/*      */   }
/*      */   
/*      */   public void b(BooleanSupplier ☃) {
/*  723 */     this.b.a("jobs");
/*      */     FutureTask<?> futureTask;
/*  725 */     while ((futureTask = this.f.poll()) != null) {
/*  726 */       k.a(futureTask, g);
/*      */     }
/*      */     
/*  729 */     this.b.c("commandFunctions");
/*  730 */     aB().Y_();
/*      */     
/*  732 */     this.b.c("levels");
/*  733 */     for (td td : w()) {
/*  734 */       long l = k.c();
/*      */       
/*  736 */       if (td.t.q() == bod.a || u()) {
/*  737 */         this.b.a(() -> "dim-" + ☃.t.q().c());
/*      */         
/*  739 */         if (this.v % 20 == 0) {
/*  740 */           this.b.a("timeSync");
/*  741 */           this.s.a((iv)new lr(td.V(), td.W(), td.X().b("doDaylightCycle")), td.t.q());
/*  742 */           this.b.e();
/*      */         } 
/*      */         
/*  745 */         this.b.a("tick");
/*      */         try {
/*  747 */           td.a(☃);
/*  748 */         } catch (Throwable throwable) {
/*  749 */           b b = b.a(throwable, "Exception ticking world");
/*  750 */           td.a(b);
/*  751 */           throw new h(b);
/*      */         } 
/*      */         
/*      */         try {
/*  755 */           td.o_();
/*  756 */         } catch (Throwable throwable) {
/*  757 */           b b = b.a(throwable, "Exception ticking world entities");
/*  758 */           td.a(b);
/*  759 */           throw new h(b);
/*      */         } 
/*  761 */         this.b.e();
/*  762 */         this.b.a("tracker");
/*  763 */         td.A().a();
/*  764 */         this.b.e();
/*      */         
/*  766 */         this.b.e();
/*      */       } 
/*      */       
/*  769 */       ((long[])this.e.computeIfAbsent((K)td.t.q(), ☃ -> new long[100]))[this.v % 100] = k.c() - l;
/*      */     } 
/*      */     
/*  772 */     this.b.c("connection");
/*  773 */     ae().c();
/*  774 */     this.b.c("players");
/*  775 */     this.s.e();
/*      */     
/*  777 */     this.b.c("tickables");
/*  778 */     for (int i = 0; i < this.k.size(); i++) {
/*  779 */       ((pt)this.k.get(i)).Y_();
/*      */     }
/*  781 */     this.b.e();
/*      */   }
/*      */   
/*      */   public boolean u() {
/*  785 */     return true;
/*      */   }
/*      */   
/*      */   public void a(pt ☃) {
/*  789 */     this.k.add(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public static void main(String[] ☃) {
/*  794 */     pf.c();
/*      */     
/*      */     try {
/*  797 */       boolean bool1 = true;
/*  798 */       String str1 = null;
/*  799 */       String str2 = ".";
/*  800 */       String str3 = null;
/*  801 */       boolean bool2 = false;
/*  802 */       boolean bool3 = false;
/*  803 */       boolean bool4 = false;
/*  804 */       int i = -1;
/*      */       
/*  806 */       for (int j = 0; j < ☃.length; j++) {
/*  807 */         String str4 = ☃[j];
/*  808 */         String str5 = (j == ☃.length - 1) ? null : ☃[j + 1];
/*  809 */         boolean bool = false;
/*      */         
/*  811 */         if ("nogui".equals(str4) || "--nogui".equals(str4)) {
/*  812 */           bool1 = false;
/*  813 */         } else if ("--port".equals(str4) && str5 != null) {
/*  814 */           bool = true;
/*      */           try {
/*  816 */             i = Integer.parseInt(str5);
/*  817 */           } catch (NumberFormatException numberFormatException) {}
/*      */         }
/*  819 */         else if ("--singleplayer".equals(str4) && str5 != null) {
/*  820 */           bool = true;
/*  821 */           str1 = str5;
/*  822 */         } else if ("--universe".equals(str4) && str5 != null) {
/*  823 */           bool = true;
/*  824 */           str2 = str5;
/*  825 */         } else if ("--world".equals(str4) && str5 != null) {
/*  826 */           bool = true;
/*  827 */           str3 = str5;
/*  828 */         } else if ("--demo".equals(str4)) {
/*  829 */           bool2 = true;
/*  830 */         } else if ("--bonusChest".equals(str4)) {
/*  831 */           bool3 = true;
/*  832 */         } else if ("--forceUpgrade".equals(str4)) {
/*  833 */           bool4 = true;
/*      */         } 
/*      */         
/*  836 */         if (bool) {
/*  837 */           j++;
/*      */         }
/*      */       } 
/*      */       
/*  841 */       YggdrasilAuthenticationService yggdrasilAuthenticationService = new YggdrasilAuthenticationService(Proxy.NO_PROXY, UUID.randomUUID().toString());
/*  842 */       MinecraftSessionService minecraftSessionService = yggdrasilAuthenticationService.createMinecraftSessionService();
/*  843 */       GameProfileRepository gameProfileRepository = yggdrasilAuthenticationService.createProfileRepository();
/*  844 */       vl vl1 = new vl(gameProfileRepository, new File(str2, a.getName()));
/*  845 */       so so = new so(new File(str2), xz.a(), yggdrasilAuthenticationService, minecraftSessionService, gameProfileRepository, vl1);
/*      */       
/*  847 */       if (str1 != null) {
/*  848 */         so.h(str1);
/*      */       }
/*  850 */       if (str3 != null) {
/*  851 */         so.i(str3);
/*      */       }
/*  853 */       if (i >= 0) {
/*  854 */         so.a(i);
/*      */       }
/*  856 */       if (bool2) {
/*  857 */         so.c(true);
/*      */       }
/*  859 */       if (bool3) {
/*  860 */         so.d(true);
/*      */       }
/*  862 */       if (bool1 && !GraphicsEnvironment.isHeadless()) {
/*  863 */         so.aW();
/*      */       }
/*  865 */       if (bool4) {
/*  866 */         so.b(true);
/*      */       }
/*      */       
/*  869 */       so.v();
/*      */       
/*  871 */       Thread thread = new Thread("Server Shutdown Thread", so)
/*      */         {
/*      */           public void run() {
/*  874 */             this.a.h_();
/*      */           }
/*      */         };
/*  877 */       thread.setUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)new e(g));
/*  878 */       Runtime.getRuntime().addShutdownHook(thread);
/*  879 */     } catch (Exception exception) {
/*  880 */       g.fatal("Failed to start the minecraft server", exception);
/*      */     } 
/*      */   }
/*      */   
/*      */   protected void b(boolean ☃) {
/*  885 */     this.ao = ☃;
/*      */   }
/*      */   
/*      */   public void v() {
/*  889 */     this.Z = new Thread(this, "Server thread");
/*  890 */     this.Z.setUncaughtExceptionHandler((☃, throwable) -> g.error(throwable));
/*  891 */     this.Z.start();
/*      */   }
/*      */   
/*      */   public File c(String ☃) {
/*  895 */     return new File(s(), ☃);
/*      */   }
/*      */   
/*      */   public void d(String ☃) {
/*  899 */     g.info(☃);
/*      */   }
/*      */   
/*      */   public void e(String ☃) {
/*  903 */     g.warn(☃);
/*      */   }
/*      */   
/*      */   public td a(bod ☃) {
/*  907 */     return this.r.get(☃);
/*      */   }
/*      */   
/*      */   public Iterable<td> w() {
/*  911 */     return this.r.values();
/*      */   }
/*      */   
/*      */   public String x() {
/*  915 */     return "1.13.2";
/*      */   }
/*      */   
/*      */   public int y() {
/*  919 */     return this.s.o();
/*      */   }
/*      */   
/*      */   public int z() {
/*  923 */     return this.s.p();
/*      */   }
/*      */   
/*      */   public String[] A() {
/*  927 */     return this.s.f();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean C() {
/*  935 */     return false;
/*      */   }
/*      */   
/*      */   public void f(String ☃) {
/*  939 */     g.error(☃);
/*      */   }
/*      */   
/*      */   public void g(String ☃) {
/*  943 */     if (C()) {
/*  944 */       g.info(☃);
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public String getServerModName() {
/*  950 */     return "vanilla";
/*      */   }
/*      */ 
/*      */   
/*      */   public b b(b ☃) {
/*  955 */     ☃.g().a("Profiler Position", () -> this.b.a() ? this.b.f() : "N/A (disabled)");
/*      */     
/*  957 */     if (this.s != null) {
/*  958 */       ☃.g().a("Player Count", () -> this.s.o() + " / " + this.s.p() + "; " + this.s.v());
/*      */     }
/*      */     
/*  961 */     ☃.g().a("Data Packs", () -> {
/*      */           StringBuilder ☃ = new StringBuilder();
/*      */           
/*      */           for (va va : this.ad.d()) {
/*      */             if (☃.length() > 0) {
/*      */               ☃.append(", ");
/*      */             }
/*      */             ☃.append(va.e());
/*      */             if (!va.c().a()) {
/*      */               ☃.append(" (incompatible)");
/*      */             }
/*      */           } 
/*      */           return ☃.toString();
/*      */         });
/*  975 */     return ☃;
/*      */   }
/*      */   
/*      */   public boolean D() {
/*  979 */     return (this.j != null);
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(ij ☃) {
/*  984 */     g.info(☃.getString());
/*      */   }
/*      */   
/*      */   public KeyPair E() {
/*  988 */     return this.H;
/*      */   }
/*      */   
/*      */   public int F() {
/*  992 */     return this.q;
/*      */   }
/*      */   
/*      */   public void a(int ☃) {
/*  996 */     this.q = ☃;
/*      */   }
/*      */   
/*      */   public String G() {
/* 1000 */     return this.I;
/*      */   }
/*      */   
/*      */   public void h(String ☃) {
/* 1004 */     this.I = ☃;
/*      */   }
/*      */   
/*      */   public boolean H() {
/* 1008 */     return (this.I != null);
/*      */   }
/*      */   
/*      */   public String I() {
/* 1012 */     return this.J;
/*      */   }
/*      */   
/*      */   public void i(String ☃) {
/* 1016 */     this.J = ☃;
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
/*      */   public void a(KeyPair ☃) {
/* 1028 */     this.H = ☃;
/*      */   }
/*      */   
/*      */   public void a(adi ☃) {
/* 1032 */     for (td td : w()) {
/* 1033 */       if (td.g().s()) {
/* 1034 */         td.g().a(adi.d);
/* 1035 */         td.a(true, true); continue;
/* 1036 */       }  if (H()) {
/* 1037 */         td.g().a(☃);
/* 1038 */         td.a((td.aj() != adi.a), true); continue;
/*      */       } 
/* 1040 */       td.g().a(☃);
/* 1041 */       td.a(K(), this.A);
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean K() {
/* 1047 */     return true;
/*      */   }
/*      */   
/*      */   public boolean L() {
/* 1051 */     return this.L;
/*      */   }
/*      */   
/*      */   public void c(boolean ☃) {
/* 1055 */     this.L = ☃;
/*      */   }
/*      */   
/*      */   public void d(boolean ☃) {
/* 1059 */     this.M = ☃;
/*      */   }
/*      */   
/*      */   public cce M() {
/* 1063 */     return this.h;
/*      */   }
/*      */   
/*      */   public String N() {
/* 1067 */     return this.N;
/*      */   }
/*      */   
/*      */   public String O() {
/* 1071 */     return this.O;
/*      */   }
/*      */   
/*      */   public void a_(String ☃, String str1) {
/* 1075 */     this.N = ☃;
/* 1076 */     this.O = str1;
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(adu ☃) {
/* 1081 */     ☃.a("whitelist_enabled", Boolean.valueOf(false));
/* 1082 */     ☃.a("whitelist_count", Integer.valueOf(0));
/* 1083 */     if (this.s != null) {
/* 1084 */       ☃.a("players_current", Integer.valueOf(y()));
/* 1085 */       ☃.a("players_max", Integer.valueOf(z()));
/* 1086 */       ☃.a("players_seen", Integer.valueOf((this.s.q()).length));
/*      */     } 
/* 1088 */     ☃.a("uses_auth", Boolean.valueOf(this.y));
/* 1089 */     ☃.a("gui_state", ag() ? "enabled" : "disabled");
/* 1090 */     ☃.a("run_time", Long.valueOf((k.b() - ☃.g()) / 60L * 1000L));
/*      */     
/* 1092 */     ☃.a("avg_tick_ms", Integer.valueOf((int)(xq.a(this.d) * 1.0E-6D)));
/*      */     
/* 1094 */     int i = 0;
/* 1095 */     for (td td : w()) {
/* 1096 */       if (td != null) {
/* 1097 */         ccb ccb = td.g();
/*      */         
/* 1099 */         ☃.a("world[" + i + "][dimension]", td.t.q());
/* 1100 */         ☃.a("world[" + i + "][mode]", ccb.q());
/* 1101 */         ☃.a("world[" + i + "][difficulty]", td.aj());
/* 1102 */         ☃.a("world[" + i + "][hardcore]", Boolean.valueOf(ccb.s()));
/* 1103 */         ☃.a("world[" + i + "][generator_name]", ccb.t().a());
/* 1104 */         ☃.a("world[" + i + "][generator_version]", Integer.valueOf(ccb.t().e()));
/* 1105 */         ☃.a("world[" + i + "][height]", Integer.valueOf(this.F));
/* 1106 */         ☃.a("world[" + i + "][chunks_loaded]", Integer.valueOf(td.v().g()));
/*      */         
/* 1108 */         i++;
/*      */       } 
/*      */     } 
/*      */     
/* 1112 */     ☃.a("worlds", Integer.valueOf(i));
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
/*      */   public boolean P() {
/* 1125 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean R() {
/* 1131 */     return this.y;
/*      */   }
/*      */   
/*      */   public void e(boolean ☃) {
/* 1135 */     this.y = ☃;
/*      */   }
/*      */   
/*      */   public boolean S() {
/* 1139 */     return this.z;
/*      */   }
/*      */   
/*      */   public void f(boolean ☃) {
/* 1143 */     this.z = ☃;
/*      */   }
/*      */   
/*      */   public boolean T() {
/* 1147 */     return this.A;
/*      */   }
/*      */   
/*      */   public void g(boolean ☃) {
/* 1151 */     this.A = ☃;
/*      */   }
/*      */   
/*      */   public boolean U() {
/* 1155 */     return this.B;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void h(boolean ☃) {
/* 1161 */     this.B = ☃;
/*      */   }
/*      */   
/*      */   public boolean W() {
/* 1165 */     return this.C;
/*      */   }
/*      */   
/*      */   public void i(boolean ☃) {
/* 1169 */     this.C = ☃;
/*      */   }
/*      */   
/*      */   public boolean X() {
/* 1173 */     return this.D;
/*      */   }
/*      */   
/*      */   public void j(boolean ☃) {
/* 1177 */     this.D = ☃;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String Z() {
/* 1183 */     return this.E;
/*      */   }
/*      */   
/*      */   public void k(String ☃) {
/* 1187 */     this.E = ☃;
/*      */   }
/*      */   
/*      */   public int aa() {
/* 1191 */     return this.F;
/*      */   }
/*      */   
/*      */   public void b(int ☃) {
/* 1195 */     this.F = ☃;
/*      */   }
/*      */   
/*      */   public boolean ab() {
/* 1199 */     return this.u;
/*      */   }
/*      */   
/*      */   public vp ac() {
/* 1203 */     return this.s;
/*      */   }
/*      */   
/*      */   public void a(vp ☃) {
/* 1207 */     this.s = ☃;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(axv ☃) {
/* 1213 */     for (td td : w()) {
/* 1214 */       td.g().a(☃);
/*      */     }
/*      */   }
/*      */   
/*      */   public ub ae() {
/* 1219 */     return this.l;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean ag() {
/* 1227 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public int ah() {
/* 1233 */     return this.v;
/*      */   }
/*      */   
/*      */   public void ai() {
/* 1237 */     this.S = true;
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
/*      */   public int al() {
/* 1249 */     return 16;
/*      */   }
/*      */   
/*      */   public boolean a(axy ☃, el el1, aog aog1) {
/* 1253 */     return false;
/*      */   }
/*      */   
/*      */   public void k(boolean ☃) {
/* 1257 */     this.T = ☃;
/*      */   }
/*      */   
/*      */   public boolean am() {
/* 1261 */     return this.T;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int ao() {
/* 1269 */     return this.G;
/*      */   }
/*      */   
/*      */   public void c(int ☃) {
/* 1273 */     this.G = ☃;
/*      */   }
/*      */   
/*      */   public MinecraftSessionService ap() {
/* 1277 */     return this.V;
/*      */   }
/*      */   
/*      */   public GameProfileRepository aq() {
/* 1281 */     return this.W;
/*      */   }
/*      */   
/*      */   public vl ar() {
/* 1285 */     return this.X;
/*      */   }
/*      */   
/*      */   public om as() {
/* 1289 */     return this.m;
/*      */   }
/*      */   
/*      */   public void at() {
/* 1293 */     this.Y = 0L;
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
/*      */   
/*      */   public int au() {
/* 1310 */     return 29999984;
/*      */   }
/*      */ 
/*      */   
/*      */   public <V> ListenableFuture<V> a(Callable<V> ☃) {
/* 1315 */     Validate.notNull(☃);
/*      */     
/* 1317 */     if (!av() && !ab()) {
/* 1318 */       ListenableFutureTask<V> listenableFutureTask = ListenableFutureTask.create(☃);
/* 1319 */       this.f.add(listenableFutureTask);
/* 1320 */       return (ListenableFuture<V>)listenableFutureTask;
/*      */     } 
/*      */     try {
/* 1323 */       return Futures.immediateFuture(☃.call());
/* 1324 */     } catch (Exception exception) {
/* 1325 */       return (ListenableFuture<V>)Futures.immediateFailedCheckedFuture(exception);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public ListenableFuture<Object> a(Runnable ☃) {
/* 1332 */     Validate.notNull(☃);
/*      */     
/* 1334 */     return a(Executors.callable(☃));
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean av() {
/* 1339 */     return (Thread.currentThread() == this.Z);
/*      */   }
/*      */   
/*      */   public int aw() {
/* 1343 */     return 256;
/*      */   }
/*      */   
/*      */   public long ax() {
/* 1347 */     return this.aa;
/*      */   }
/*      */   
/*      */   public Thread ay() {
/* 1351 */     return this.Z;
/*      */   }
/*      */   
/*      */   public DataFixer az() {
/* 1355 */     return this.o;
/*      */   }
/*      */   
/*      */   public int a(@Nullable td ☃) {
/* 1359 */     if (☃ != null) {
/* 1360 */       return ☃.X().c("spawnRadius");
/*      */     }
/* 1362 */     return 10;
/*      */   }
/*      */   
/*      */   public po aA() {
/* 1366 */     return this.al;
/*      */   }
/*      */   
/*      */   public pp aB() {
/* 1370 */     return this.am;
/*      */   }
/*      */   
/*      */   public void aC() {
/* 1374 */     if (!av()) {
/* 1375 */       a(this::aC);
/*      */       
/*      */       return;
/*      */     } 
/* 1379 */     ac().j();
/* 1380 */     this.ad.a();
/*      */     
/* 1382 */     a(a(bod.a).g());
/*      */     
/* 1384 */     ac().w();
/*      */   }
/*      */   
/*      */   private void a(ccb ☃) {
/* 1388 */     List<va> list = Lists.newArrayList(this.ad.d());
/*      */     
/* 1390 */     for (va va : this.ad.b()) {
/* 1391 */       if (!☃.N().contains(va.e()) && !list.contains(va)) {
/* 1392 */         g.info("Found new data pack {}, loading it automatically", va.e());
/* 1393 */         va.h().a(list, va, ☃ -> ☃, false);
/*      */       } 
/*      */     } 
/* 1396 */     this.ad.a(list);
/* 1397 */     List<ul> list1 = Lists.newArrayList();
/* 1398 */     this.ad.d().forEach(va1 -> ☃.add(va1.d()));
/* 1399 */     this.ac.a(list1);
/*      */     
/* 1401 */     ☃.O().clear();
/* 1402 */     ☃.N().clear();
/* 1403 */     this.ad.d().forEach(va1 -> ☃.O().add(va1.e()));
/* 1404 */     this.ad.b().forEach(va1 -> {
/*      */           if (!this.ad.d().contains(va1)) {
/*      */             ☃.N().add(va1.e());
/*      */           }
/*      */         });
/*      */   }
/*      */   
/*      */   public void a(bu ☃) {
/* 1412 */     if (!aQ()) {
/*      */       return;
/*      */     }
/*      */     
/* 1416 */     vp vp1 = ☃.j().ac();
/* 1417 */     vw vw = vp1.k();
/* 1418 */     if (!vw.b()) {
/*      */       return;
/*      */     }
/*      */     
/* 1422 */     List<tf> list = Lists.newArrayList(vp1.v());
/* 1423 */     for (tf tf : list) {
/* 1424 */       if (!vw.a(tf.do())) {
/* 1425 */         tf.a.b((ij)new ir("multiplayer.disconnect.not_whitelisted", new Object[0]));
/*      */       }
/*      */     } 
/*      */   }
/*      */   
/*      */   public vd aD() {
/* 1431 */     return this.ac;
/*      */   }
/*      */   
/*      */   public ux<va> aE() {
/* 1435 */     return this.ad;
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
/*      */   public bv aI() {
/* 1451 */     return this.af;
/*      */   }
/*      */   
/*      */   public bu aJ() {
/* 1455 */     return new bu(this, (a(bod.a) == null) ? cee.a : new cee((ff)a(bod.a).n()), ced.a, a(bod.a), 4, "Server", (ij)new iq("Server"), this, null);
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean a() {
/* 1460 */     return true;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean b() {
/* 1465 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public avl aK() {
/* 1472 */     return this.ag;
/*      */   }
/*      */   
/*      */   public xb aL() {
/* 1476 */     return this.ah;
/*      */   }
/*      */   
/*      */   public pr aM() {
/* 1480 */     return this.ai;
/*      */   }
/*      */   
/*      */   public cct aN() {
/* 1484 */     return this.ak;
/*      */   }
/*      */   
/*      */   public axu aO() {
/* 1488 */     return a(bod.a).X();
/*      */   }
/*      */   
/*      */   public pv aP() {
/* 1492 */     return this.aj;
/*      */   }
/*      */   
/*      */   public boolean aQ() {
/* 1496 */     return this.an;
/*      */   }
/*      */   
/*      */   public void l(boolean ☃) {
/* 1500 */     this.an = ☃;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int a(GameProfile ☃) {
/* 1508 */     if (ac().h(☃)) {
/* 1509 */       vr vr = (vr)ac().m().b(☃);
/* 1510 */       if (vr != null) {
/* 1511 */         return vr.a();
/*      */       }
/* 1513 */       if (H()) {
/* 1514 */         if (G().equals(☃.getName())) {
/* 1515 */           return 4;
/*      */         }
/* 1517 */         return ac().x() ? 4 : 0;
/*      */       } 
/* 1519 */       return j();
/*      */     } 
/* 1521 */     return 0;
/*      */   }
/*      */   
/*      */   public abstract boolean d() throws IOException;
/*      */   
/*      */   public abstract boolean f();
/*      */   
/*      */   public abstract axv g();
/*      */   
/*      */   public abstract adi h();
/*      */   
/*      */   public abstract boolean i();
/*      */   
/*      */   public abstract int j();
/*      */   
/*      */   public abstract boolean k();
/*      */   
/*      */   public abstract boolean Q();
/*      */   
/*      */   public abstract boolean V();
/*      */   
/*      */   public abstract boolean Y();
/*      */   
/*      */   public abstract boolean ad();
/*      */   
/*      */   public abstract boolean a(axv paramaxv, boolean paramBoolean, int paramInt);
/*      */ }


/* Location:              F:\dw\server.jar!\net\minecraft\server\MinecraftServer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */