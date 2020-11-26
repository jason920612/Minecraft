/*     */ import com.google.common.collect.Maps;
/*     */ import com.mojang.datafixers.DSL;
/*     */ import com.mojang.datafixers.DataFixTypes;
/*     */ import com.mojang.datafixers.DataFixer;
/*     */ import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
/*     */ import it.unimi.dsi.fastutil.longs.LongSet;
/*     */ import it.unimi.dsi.fastutil.shorts.ShortList;
/*     */ import it.unimi.dsi.fastutil.shorts.ShortListIterator;
/*     */ import java.io.DataInputStream;
/*     */ import java.io.DataOutputStream;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.util.BitSet;
/*     */ import java.util.Iterator;
/*     */ import java.util.Map;
/*     */ import java.util.function.Consumer;
/*     */ import java.util.function.Function;
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
/*     */ 
/*     */ public class bnv
/*     */   implements bnw, cdx
/*     */ {
/*  72 */   private static final Logger a = LogManager.getLogger();
/*     */   
/*  74 */   private final Map<axm, gy> b = Maps.newHashMap();
/*     */   
/*     */   private final File c;
/*     */   private final DataFixer d;
/*     */   private bwp e;
/*     */   private boolean f;
/*     */   
/*     */   public bnv(File ☃, DataFixer dataFixer) {
/*  82 */     this.c = ☃;
/*  83 */     this.d = dataFixer;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private gy a(axz ☃, int i, int j) throws IOException {
/*  88 */     return a(☃.o().q(), ☃.h(), i, j);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private gy a(bod ☃, @Nullable cck cck1, int i, int j) throws IOException {
/*  93 */     gy gy1 = this.b.get(new axm(i, j));
/*  94 */     if (gy1 != null) {
/*  95 */       return gy1;
/*     */     }
/*     */ 
/*     */     
/*  99 */     DataInputStream dataInputStream = boa.d(this.c, i, j);
/* 100 */     if (dataInputStream == null) {
/* 101 */       return null;
/*     */     }
/*     */     
/* 104 */     gy gy2 = hi.a(dataInputStream);
/* 105 */     dataInputStream.close();
/* 106 */     int k = gy2.c("DataVersion", 99) ? gy2.h("DataVersion") : -1;
/*     */     
/* 108 */     if (k < 1493) {
/* 109 */       gy2 = hk.a(this.d, (DSL.TypeReference)DataFixTypes.CHUNK, gy2, k, 1493);
/*     */       
/* 111 */       if (gy2.p("Level").q("hasLegacyStructureData")) {
/* 112 */         a(☃, cck1);
/* 113 */         gy2 = this.e.a(gy2);
/*     */       } 
/*     */     } 
/*     */     
/* 117 */     gy2 = hk.a(this.d, (DSL.TypeReference)DataFixTypes.CHUNK, gy2, Math.max(1493, k));
/*     */     
/* 119 */     if (k < 1631) {
/* 120 */       gy2.b("DataVersion", 1631);
/* 121 */       a(new axm(i, j), gy2);
/*     */     } 
/*     */     
/* 124 */     return gy2;
/*     */   }
/*     */   
/*     */   public void a(bod ☃, @Nullable cck cck1) {
/* 128 */     if (this.e == null) {
/* 129 */       this.e = bwp.a(☃, cck1);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public bnj a(axz ☃, int i, int j, Consumer<bnj> consumer) throws IOException {
/* 136 */     gy gy = a(☃, i, j);
/* 137 */     if (gy == null) {
/* 138 */       return null;
/*     */     }
/*     */     
/* 141 */     bnj bnj = a(☃, i, j, gy);
/* 142 */     if (bnj != null) {
/* 143 */       consumer.accept(bnj);
/* 144 */       a(gy.p("Level"), bnj);
/*     */     } 
/* 146 */     return bnj;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public bnr b(axz ☃, int i, int j, Consumer<bmx> consumer) throws IOException {
/*     */     gy gy;
/*     */     try {
/* 154 */       gy = a(☃, i, j);
/* 155 */     } catch (h h) {
/* 156 */       if (h.getCause() instanceof IOException) {
/* 157 */         throw (IOException)h.getCause();
/*     */       }
/* 159 */       throw h;
/*     */     } 
/* 161 */     if (gy == null) {
/* 162 */       return null;
/*     */     }
/*     */     
/* 165 */     bnr bnr = b(☃, i, j, gy);
/* 166 */     if (bnr != null) {
/* 167 */       consumer.accept(bnr);
/*     */     }
/* 169 */     return bnr;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   protected bnj a(axz ☃, int i, int j, gy gy1) {
/* 174 */     if (!gy1.c("Level", 10) || !gy1.p("Level").c("Status", 8)) {
/* 175 */       a.error("Chunk file at {},{} is missing level data, skipping", Integer.valueOf(i), Integer.valueOf(j));
/* 176 */       return null;
/*     */     } 
/*     */     
/* 179 */     bnd.a a = a(gy1);
/* 180 */     if (a != bnd.a.b) {
/* 181 */       return null;
/*     */     }
/*     */     
/* 184 */     gy gy2 = gy1.p("Level");
/* 185 */     if (!gy2.c("Sections", 9)) {
/* 186 */       a.error("Chunk file at {},{} is missing block data, skipping", Integer.valueOf(i), Integer.valueOf(j));
/* 187 */       return null;
/*     */     } 
/* 189 */     bnj bnj = a(☃, gy2);
/* 190 */     if (!bnj.a(i, j)) {
/* 191 */       a.error("Chunk file at {},{} is in the wrong location; relocating. (Expected {}, {}, got {}, {})", Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(bnj.b), Integer.valueOf(bnj.c));
/* 192 */       gy2.b("xPos", i);
/* 193 */       gy2.b("zPos", j);
/* 194 */       bnj = a(☃, gy2);
/*     */     } 
/* 196 */     return bnj;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   protected bnr b(axz ☃, int i, int j, gy gy1) {
/* 201 */     if (!gy1.c("Level", 10) || !gy1.p("Level").c("Status", 8)) {
/* 202 */       a.error("Chunk file at {},{} is missing level data, skipping", Integer.valueOf(i), Integer.valueOf(j));
/* 203 */       return null;
/*     */     } 
/*     */     
/* 206 */     bnd.a a = a(gy1);
/* 207 */     if (a == bnd.a.b) {
/* 208 */       return new bni(a(☃, i, j, gy1));
/*     */     }
/*     */     
/* 211 */     gy gy2 = gy1.p("Level");
/*     */     
/* 213 */     return b(☃, gy2);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(axy ☃, bmx bmx1) throws IOException, aya {
/* 218 */     ☃.U();
/*     */     
/*     */     try {
/* 221 */       gy gy1 = new gy();
/* 222 */       gy gy2 = new gy();
/* 223 */       gy1.b("DataVersion", 1631);
/* 224 */       axm axm = bmx1.d();
/* 225 */       gy1.a("Level", gy2);
/*     */       
/* 227 */       if (bmx1.i().d() == bnd.a.b) {
/* 228 */         a((bnj)bmx1, ☃, gy2);
/*     */       } else {
/*     */         
/* 231 */         gy gy = a(☃, axm.a, axm.b);
/* 232 */         if (gy != null && a(gy) == bnd.a.b) {
/*     */           return;
/*     */         }
/* 235 */         a((bnr)bmx1, ☃, gy2);
/*     */       } 
/* 237 */       a(axm, gy1);
/* 238 */     } catch (Exception exception) {
/* 239 */       a.error("Failed to save chunk", exception);
/*     */     } 
/*     */   }
/*     */   
/*     */   protected void a(axm ☃, gy gy1) {
/* 244 */     this.b.put(☃, gy1);
/* 245 */     cdw.a().a(this);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a() {
/* 250 */     Iterator<Map.Entry<axm, gy>> ☃ = this.b.entrySet().iterator();
/* 251 */     if (!☃.hasNext()) {
/* 252 */       if (this.f) {
/* 253 */         a.info("ThreadedAnvilChunkStorage ({}): All chunks are saved", this.c.getName());
/*     */       }
/* 255 */       return false;
/*     */     } 
/*     */     
/* 258 */     Map.Entry<axm, gy> entry = ☃.next();
/* 259 */     ☃.remove();
/*     */     
/* 261 */     axm axm = entry.getKey();
/* 262 */     gy gy = entry.getValue();
/*     */     
/* 264 */     if (gy == null) {
/* 265 */       return true;
/*     */     }
/*     */     
/*     */     try {
/* 269 */       DataOutputStream dataOutputStream = boa.e(this.c, axm.a, axm.b);
/* 270 */       hi.a(gy, dataOutputStream);
/* 271 */       dataOutputStream.close();
/*     */       
/* 273 */       if (this.e != null) {
/* 274 */         this.e.a(axm.a());
/*     */       }
/* 276 */     } catch (Exception exception) {
/* 277 */       a.error("Failed to save chunk", exception);
/*     */     } 
/*     */     
/* 280 */     return true;
/*     */   }
/*     */   
/*     */   private bnd.a a(@Nullable gy ☃) {
/* 284 */     if (☃ != null) {
/* 285 */       bnd bnd = bnd.a(☃.p("Level").l("Status"));
/* 286 */       if (bnd != null) {
/* 287 */         return bnd.d();
/*     */       }
/*     */     } 
/* 290 */     return bnd.a.a;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b() {
/*     */     try {
/* 296 */       this.f = true;
/* 297 */       while (a());
/*     */     } finally {
/*     */       
/* 300 */       this.f = false;
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(bnr ☃, axy axy1, gy gy1) {
/* 305 */     int i = (☃.d()).a;
/* 306 */     int j = (☃.d()).b;
/*     */     
/* 308 */     gy1.b("xPos", i);
/* 309 */     gy1.b("zPos", j);
/* 310 */     gy1.a("LastUpdate", axy1.V());
/* 311 */     gy1.a("InhabitedTime", ☃.m());
/* 312 */     gy1.a("Status", ☃.i().b());
/*     */     
/* 314 */     bnt bnt = ☃.v();
/* 315 */     if (!bnt.a()) {
/* 316 */       gy1.a("UpgradeData", bnt.b());
/*     */     }
/*     */ 
/*     */     
/* 320 */     bnk[] arrayOfBnk = ☃.c();
/* 321 */     he he1 = a(axy1, arrayOfBnk);
/* 322 */     gy1.a("Sections", he1);
/*     */     
/* 324 */     ayu[] arrayOfAyu = ☃.g();
/* 325 */     int[] arrayOfInt = (arrayOfAyu != null) ? new int[arrayOfAyu.length] : new int[0];
/* 326 */     if (arrayOfAyu != null) {
/* 327 */       for (int k = 0; k < arrayOfAyu.length; k++) {
/* 328 */         arrayOfInt[k] = fc.m.a((T)arrayOfAyu[k]);
/*     */       }
/*     */     }
/* 331 */     gy1.a("Biomes", arrayOfInt);
/*     */ 
/*     */     
/* 334 */     he he2 = new he();
/* 335 */     for (gy gy4 : ☃.s()) {
/* 336 */       he2.a(gy4);
/*     */     }
/* 338 */     gy1.a("Entities", he2);
/*     */ 
/*     */     
/* 341 */     he he3 = new he();
/* 342 */     for (el el : ☃.q()) {
/* 343 */       bji bji = ☃.f(el);
/* 344 */       if (bji != null) {
/* 345 */         gy gy4 = new gy();
/* 346 */         bji.a(gy4);
/* 347 */         he3.a(gy4); continue;
/*     */       } 
/* 349 */       he3.a(☃.g(el));
/*     */     } 
/*     */     
/* 352 */     gy1.a("TileEntities", he3);
/*     */ 
/*     */     
/* 355 */     gy1.a("Lights", a(☃.p()));
/*     */ 
/*     */     
/* 358 */     gy1.a("PostProcessing", a(☃.u()));
/*     */ 
/*     */     
/* 361 */     gy1.a("ToBeTicked", ☃.n().a());
/* 362 */     gy1.a("LiquidsToBeTicked", ☃.o().a());
/*     */ 
/*     */     
/* 365 */     gy gy2 = new gy();
/* 366 */     for (bor.a a : ☃.t()) {
/* 367 */       gy2.a(a.b(), new hf(☃.b(a).b()));
/*     */     }
/* 369 */     gy1.a("Heightmaps", gy2);
/*     */ 
/*     */     
/* 372 */     gy gy3 = new gy();
/* 373 */     for (boq.a a : boq.a.values()) {
/* 374 */       gy3.a(a.toString(), ☃.a(a).toByteArray());
/*     */     }
/* 376 */     gy1.a("CarvingMasks", gy3);
/*     */     
/* 378 */     gy1.a("Structures", a(i, j, ☃.e(), ☃.f()));
/*     */   }
/*     */   
/*     */   private void a(bnj ☃, axy axy1, gy gy1) {
/* 382 */     gy1.b("xPos", ☃.b);
/* 383 */     gy1.b("zPos", ☃.c);
/* 384 */     gy1.a("LastUpdate", axy1.V());
/* 385 */     gy1.a("InhabitedTime", ☃.m());
/* 386 */     gy1.a("Status", ☃.i().b());
/*     */     
/* 388 */     bnt bnt = ☃.F();
/* 389 */     if (!bnt.a()) {
/* 390 */       gy1.a("UpgradeData", bnt.b());
/*     */     }
/*     */     
/* 393 */     bnk[] arrayOfBnk = ☃.c();
/* 394 */     he he1 = a(axy1, arrayOfBnk);
/* 395 */     gy1.a("Sections", he1);
/*     */     
/* 397 */     ayu[] arrayOfAyu = ☃.g();
/* 398 */     int[] arrayOfInt = new int[arrayOfAyu.length];
/* 399 */     for (int i = 0; i < arrayOfAyu.length; i++) {
/* 400 */       arrayOfInt[i] = fc.m.a((T)arrayOfAyu[i]);
/*     */     }
/* 402 */     gy1.a("Biomes", arrayOfInt);
/*     */     
/* 404 */     ☃.f(false);
/* 405 */     he he2 = new he();
/* 406 */     for (int j = 0; j < (☃.C()).length; j++) {
/* 407 */       for (aer aer : ☃.C()[j]) {
/* 408 */         gy gy3 = new gy();
/* 409 */         if (aer.d(gy3)) {
/* 410 */           ☃.f(true);
/* 411 */           he2.a(gy3);
/*     */         } 
/*     */       } 
/*     */     } 
/* 415 */     gy1.a("Entities", he2);
/*     */ 
/*     */     
/* 418 */     he he3 = new he();
/* 419 */     for (el el : ☃.t()) {
/* 420 */       bji bji = ☃.f(el);
/* 421 */       if (bji != null) {
/* 422 */         gy gy4 = new gy();
/* 423 */         bji.a(gy4);
/* 424 */         gy4.a("keepPacked", false);
/* 425 */         he3.a(gy4); continue;
/*     */       } 
/* 427 */       gy gy3 = ☃.g(el);
/* 428 */       if (gy3 != null) {
/* 429 */         gy3.a("keepPacked", true);
/* 430 */         he3.a(gy3);
/*     */       } 
/*     */     } 
/*     */     
/* 434 */     gy1.a("TileEntities", he3);
/*     */     
/* 436 */     if (axy1.J() instanceof aym) {
/* 437 */       gy1.a("TileTicks", ((aym)axy1.J()).a(☃));
/*     */     }
/*     */     
/* 440 */     if (axy1.I() instanceof aym) {
/* 441 */       gy1.a("LiquidTicks", ((aym)axy1.I()).a(☃));
/*     */     }
/*     */ 
/*     */     
/* 445 */     gy1.a("PostProcessing", a(☃.G()));
/*     */ 
/*     */     
/* 448 */     if (☃.k() instanceof bns) {
/* 449 */       gy1.a("ToBeTicked", ((bns)☃.k()).a());
/*     */     }
/* 451 */     if (☃.l() instanceof bns) {
/* 452 */       gy1.a("LiquidsToBeTicked", ((bns)☃.l()).a());
/*     */     }
/*     */ 
/*     */     
/* 456 */     gy gy2 = new gy();
/* 457 */     for (bor.a a : ☃.A()) {
/* 458 */       if (a.c() == bor.b.b) {
/* 459 */         gy2.a(a.b(), new hf(☃.b(a).b()));
/*     */       }
/*     */     } 
/* 462 */     gy1.a("Heightmaps", gy2);
/*     */     
/* 464 */     gy1.a("Structures", a(☃.b, ☃.c, ☃.e(), ☃.f()));
/*     */   }
/*     */   
/*     */   private bnj a(axz ☃, gy gy1) {
/* 468 */     int i = gy1.h("xPos");
/* 469 */     int j = gy1.h("zPos");
/*     */     
/* 471 */     ayu[] arrayOfAyu = new ayu[256];
/* 472 */     el.a a = new el.a();
/* 473 */     if (gy1.c("Biomes", 11)) {
/* 474 */       int[] arrayOfInt = gy1.n("Biomes");
/* 475 */       for (int m = 0; m < arrayOfInt.length; m++) {
/* 476 */         arrayOfAyu[m] = fc.m.a(arrayOfInt[m]);
/* 477 */         if (arrayOfAyu[m] == null) {
/* 478 */           arrayOfAyu[m] = ☃.H().f().b().a(a.c((m & 0xF) + (i << 4), 0, (m >> 4 & 0xF) + (j << 4)), ayz.c);
/*     */         }
/*     */       } 
/*     */     } else {
/* 482 */       for (int m = 0; m < arrayOfAyu.length; m++) {
/* 483 */         arrayOfAyu[m] = ☃.H().f().b().a(a.c((m & 0xF) + (i << 4), 0, (m >> 4 & 0xF) + (j << 4)), ayz.c);
/*     */       }
/*     */     } 
/*     */     
/* 487 */     bnt bnt = gy1.c("UpgradeData", 10) ? new bnt(gy1.p("UpgradeData")) : bnt.a;
/* 488 */     bns<bcs> bns = new bns<>(☃ -> ☃.p().f(), fc.g::b, fc.g::a, new axm(i, j));
/* 489 */     bns<byv> bns1 = new bns<>(☃ -> (☃ == byy.a), fc.h::b, fc.h::a, new axm(i, j));
/* 490 */     long l = gy1.i("InhabitedTime");
/* 491 */     bnj bnj = new bnj(☃.f(), i, j, arrayOfAyu, bnt, bns, bns1, l);
/*     */     
/* 493 */     bnj.c(gy1.l("Status"));
/*     */     
/* 495 */     he he1 = gy1.d("Sections", 10);
/* 496 */     bnj.a(a(☃, he1));
/*     */     
/* 498 */     gy gy2 = gy1.p("Heightmaps");
/* 499 */     for (bor.a a1 : bor.a.values()) {
/* 500 */       if (a1.c() == bor.b.b) {
/* 501 */         String str = a1.b();
/* 502 */         if (gy2.c(str, 12)) {
/* 503 */           bnj.a(a1, gy2.o(str));
/*     */         } else {
/* 505 */           bnj.b(a1).a();
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 510 */     gy gy3 = gy1.p("Structures");
/* 511 */     bnj.a(c(☃, gy3));
/* 512 */     bnj.b(b(gy3));
/*     */     
/* 514 */     he he2 = gy1.d("PostProcessing", 9);
/* 515 */     for (int k = 0; k < he2.size(); k++) {
/* 516 */       he he = he2.f(k);
/* 517 */       for (int m = 0; m < he.size(); m++) {
/* 518 */         bnj.a(he.g(m), k);
/*     */       }
/*     */     } 
/*     */     
/* 522 */     bns.a(gy1.d("ToBeTicked", 9));
/* 523 */     bns1.a(gy1.d("LiquidsToBeTicked", 9));
/*     */     
/* 525 */     if (gy1.q("shouldSave")) {
/* 526 */       bnj.a(true);
/*     */     }
/*     */     
/* 529 */     return bnj;
/*     */   }
/*     */   
/*     */   private void a(gy ☃, bnj bnj1) {
/* 533 */     he he1 = ☃.d("Entities", 10);
/* 534 */     axy axy = bnj1.z();
/* 535 */     for (int i = 0; i < he1.size(); i++) {
/* 536 */       gy gy1 = he1.e(i);
/* 537 */       a(gy1, axy, bnj1);
/* 538 */       bnj1.f(true);
/*     */     } 
/*     */     
/* 541 */     he he2 = ☃.d("TileEntities", 10);
/* 542 */     for (int j = 0; j < he2.size(); j++) {
/* 543 */       gy gy1 = he2.e(j);
/* 544 */       boolean bool = gy1.q("keepPacked");
/* 545 */       if (bool) {
/* 546 */         bnj1.a(gy1);
/*     */       } else {
/* 548 */         bji bji = bji.c(gy1);
/* 549 */         if (bji != null) {
/* 550 */           bnj1.a(bji);
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 555 */     if (☃.c("TileTicks", 9) && axy.J() instanceof aym) {
/* 556 */       ((aym)axy.J()).a(☃.d("TileTicks", 10));
/*     */     }
/*     */     
/* 559 */     if (☃.c("LiquidTicks", 9) && axy.I() instanceof aym) {
/* 560 */       ((aym)axy.I()).a(☃.d("LiquidTicks", 10));
/*     */     }
/*     */   }
/*     */   
/*     */   private bnr b(axz ☃, gy gy1) {
/* 565 */     int i = gy1.h("xPos");
/* 566 */     int j = gy1.h("zPos");
/*     */     
/* 568 */     ayu[] arrayOfAyu = new ayu[256];
/* 569 */     el.a a = new el.a();
/* 570 */     if (gy1.c("Biomes", 11)) {
/* 571 */       int[] arrayOfInt = gy1.n("Biomes");
/* 572 */       for (int i2 = 0; i2 < arrayOfInt.length; i2++) {
/* 573 */         arrayOfAyu[i2] = fc.m.a(arrayOfInt[i2]);
/* 574 */         if (arrayOfAyu[i2] == null) {
/* 575 */           arrayOfAyu[i2] = ☃.H().f().b().a(a.c((i2 & 0xF) + (i << 4), 0, (i2 >> 4 & 0xF) + (j << 4)), ayz.c);
/*     */         }
/*     */       } 
/*     */     } else {
/* 579 */       for (int i2 = 0; i2 < arrayOfAyu.length; i2++) {
/* 580 */         arrayOfAyu[i2] = ☃.H().f().b().a(a.c((i2 & 0xF) + (i << 4), 0, (i2 >> 4 & 0xF) + (j << 4)), ayz.c);
/*     */       }
/*     */     } 
/*     */     
/* 584 */     bnt bnt = gy1.c("UpgradeData", 10) ? new bnt(gy1.p("UpgradeData")) : bnt.a;
/*     */     
/* 586 */     bnr bnr = new bnr(i, j, bnt);
/* 587 */     bnr.a(arrayOfAyu);
/* 588 */     bnr.b(gy1.i("InhabitedTime"));
/* 589 */     bnr.c(gy1.l("Status"));
/*     */     
/* 591 */     he he1 = gy1.d("Sections", 10);
/* 592 */     bnr.a(a(☃, he1));
/*     */     
/* 594 */     he he2 = gy1.d("Entities", 10);
/* 595 */     for (int k = 0; k < he2.size(); k++) {
/* 596 */       bnr.b(he2.e(k));
/*     */     }
/*     */     
/* 599 */     he he3 = gy1.d("TileEntities", 10);
/* 600 */     for (int m = 0; m < he3.size(); m++) {
/* 601 */       gy gy5 = he3.e(m);
/* 602 */       bnr.a(gy5);
/*     */     } 
/*     */     
/* 605 */     he he4 = gy1.d("Lights", 9);
/* 606 */     for (int n = 0; n < he4.size(); n++) {
/* 607 */       he he = he4.f(n);
/* 608 */       for (int i2 = 0; i2 < he.size(); i2++) {
/* 609 */         bnr.a(he.g(i2), n);
/*     */       }
/*     */     } 
/*     */     
/* 613 */     he he5 = gy1.d("PostProcessing", 9);
/* 614 */     for (int i1 = 0; i1 < he5.size(); i1++) {
/* 615 */       he he = he5.f(i1);
/* 616 */       for (int i2 = 0; i2 < he.size(); i2++) {
/* 617 */         bnr.b(he.g(i2), i1);
/*     */       }
/*     */     } 
/*     */     
/* 621 */     bnr.n().a(gy1.d("ToBeTicked", 9));
/* 622 */     bnr.o().a(gy1.d("LiquidsToBeTicked", 9));
/*     */     
/* 624 */     gy gy2 = gy1.p("Heightmaps");
/* 625 */     for (String str : gy2.c()) {
/* 626 */       bnr.a(bor.a.a(str), gy2.o(str));
/*     */     }
/*     */     
/* 629 */     gy gy3 = gy1.p("Structures");
/* 630 */     bnr.a(c(☃, gy3));
/* 631 */     bnr.b(b(gy3));
/*     */     
/* 633 */     gy gy4 = gy1.p("CarvingMasks");
/* 634 */     for (String str : gy4.c()) {
/* 635 */       boq.a a1 = boq.a.valueOf(str);
/* 636 */       bnr.a(a1, BitSet.valueOf(gy4.m(str)));
/*     */     } 
/*     */     
/* 639 */     return bnr;
/*     */   }
/*     */   
/*     */   private he a(axy ☃, bnk[] arrayOfBnk) {
/* 643 */     he he = new he();
/*     */     
/* 645 */     boolean bool = ☃.t.g();
/*     */     
/* 647 */     for (bnk bnk1 : arrayOfBnk) {
/* 648 */       if (bnk1 != bnj.a) {
/*     */ 
/*     */         
/* 651 */         gy gy = new gy();
/*     */         
/* 653 */         gy.a("Y", (byte)(bnk1.e() >> 4 & 0xFF));
/* 654 */         bnk1.g().b(gy, "Palette", "BlockStates");
/*     */         
/* 656 */         gy.a("BlockLight", bnk1.h().a());
/* 657 */         if (bool) {
/* 658 */           gy.a("SkyLight", bnk1.i().a());
/*     */         } else {
/*     */           
/* 661 */           gy.a("SkyLight", new byte[(bnk1.h().a()).length]);
/*     */         } 
/*     */         
/* 664 */         he.a(gy);
/*     */       } 
/* 666 */     }  return he;
/*     */   }
/*     */   
/*     */   private bnk[] a(ayc ☃, he he1) {
/* 670 */     int i = 16;
/* 671 */     bnk[] arrayOfBnk = new bnk[16];
/*     */     
/* 673 */     boolean bool = ☃.o().g();
/*     */     
/* 675 */     for (int j = 0; j < he1.size(); j++) {
/* 676 */       gy gy = he1.e(j);
/*     */       
/* 678 */       int k = gy.f("Y");
/* 679 */       bnk bnk = new bnk(k << 4, bool);
/* 680 */       bnk.g().a(gy, "Palette", "BlockStates");
/*     */       
/* 682 */       bnk.a(new bne(gy.m("BlockLight")));
/* 683 */       if (bool) {
/* 684 */         bnk.b(new bne(gy.m("SkyLight")));
/*     */       }
/* 686 */       bnk.f();
/*     */       
/* 688 */       arrayOfBnk[k] = bnk;
/*     */     } 
/* 690 */     return arrayOfBnk;
/*     */   }
/*     */   
/*     */   private gy a(int ☃, int i, Map<String, bxc> map, Map<String, LongSet> map1) {
/* 694 */     gy gy1 = new gy();
/*     */     
/* 696 */     gy gy2 = new gy();
/* 697 */     for (Map.Entry<String, bxc> entry : map.entrySet()) {
/* 698 */       gy2.a(entry.getKey(), ((bxc)entry.getValue()).a(☃, i));
/*     */     }
/* 700 */     gy1.a("Starts", gy2);
/*     */     
/* 702 */     gy gy3 = new gy();
/* 703 */     for (Map.Entry<String, LongSet> entry : map1.entrySet()) {
/* 704 */       gy3.a(entry.getKey(), new hf(entry.getValue()));
/*     */     }
/* 706 */     gy1.a("References", gy3);
/*     */     
/* 708 */     return gy1;
/*     */   }
/*     */   
/*     */   private Map<String, bxc> c(axz ☃, gy gy1) {
/* 712 */     Map<String, bxc> map = Maps.newHashMap();
/*     */     
/* 714 */     gy gy2 = gy1.p("Starts");
/* 715 */     for (String str : gy2.c()) {
/* 716 */       map.put(str, bwy.a(gy2.p(str), ☃));
/*     */     }
/*     */     
/* 719 */     return map;
/*     */   }
/*     */   
/*     */   private Map<String, LongSet> b(gy ☃) {
/* 723 */     Map<String, LongSet> map = Maps.newHashMap();
/*     */     
/* 725 */     gy gy1 = ☃.p("References");
/* 726 */     for (String str : gy1.c()) {
/* 727 */       map.put(str, new LongOpenHashSet(gy1.o(str)));
/*     */     }
/*     */     
/* 730 */     return map;
/*     */   }
/*     */   
/*     */   public static he a(ShortList[] ☃) {
/* 734 */     he he = new he();
/* 735 */     for (ShortList shortList : ☃) {
/* 736 */       he he1 = new he();
/* 737 */       if (shortList != null) {
/* 738 */         for (ShortListIterator<Short> shortListIterator = shortList.iterator(); shortListIterator.hasNext(); ) { Short short_ = shortListIterator.next();
/* 739 */           he1.a(new hm(short_.shortValue())); }
/*     */       
/*     */       }
/* 742 */       he.a(he1);
/*     */     } 
/* 744 */     return he;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private static aer a(gy ☃, axy axy1, Function<aer, aer> function) {
/* 749 */     aer aer = a(☃, axy1);
/* 750 */     if (aer == null) {
/* 751 */       return null;
/*     */     }
/*     */     
/* 754 */     aer = function.apply(aer);
/*     */     
/* 756 */     if (aer != null && ☃.c("Passengers", 9)) {
/* 757 */       he he = ☃.d("Passengers", 10);
/* 758 */       for (int i = 0; i < he.size(); i++) {
/* 759 */         aer aer1 = a(he.e(i), axy1, function);
/* 760 */         if (aer1 != null) {
/* 761 */           aer1.a(aer, true);
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 766 */     return aer;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static aer a(gy ☃, axy axy1, bnj bnj1) {
/* 771 */     return a(☃, axy1, aer1 -> {
/*     */           ☃.a(aer1);
/*     */           return aer1;
/*     */         });
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static aer a(gy ☃, axy axy1, double d1, double d2, double d3, boolean bool) {
/* 779 */     return a(☃, axy1, aer1 -> {
/*     */           aer1.b(☃, d1, d2, aer1.w, aer1.x);
/* 781 */           return (bool && !axy1.a(aer1)) ? null : aer1;
/*     */         });
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public static aer a(gy ☃, axy axy1, boolean bool) {
/* 790 */     return a(☃, axy1, aer1 -> 
/* 791 */         (☃ && !axy1.a(aer1)) ? null : aer1);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   protected static aer a(gy ☃, axy axy1) {
/*     */     try {
/* 801 */       return aev.a(☃, axy1);
/* 802 */     } catch (RuntimeException runtimeException) {
/* 803 */       a.warn("Exception loading entity: ", runtimeException);
/* 804 */       return null;
/*     */     } 
/*     */   }
/*     */   
/*     */   public static void a(aer ☃, axz axz1) {
/* 809 */     if (axz1.a(☃) && 
/* 810 */       ☃.aX()) {
/* 811 */       for (aer aer1 : ☃.bP()) {
/* 812 */         a(aer1, axz1);
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(axm ☃, bod bod1, cck cck1) {
/* 819 */     boolean bool = false;
/*     */     try {
/* 821 */       a(bod1, cck1, ☃.a, ☃.b);
/* 822 */       while (a()) {
/* 823 */         bool = true;
/*     */       }
/* 825 */     } catch (IOException iOException) {}
/*     */ 
/*     */     
/* 828 */     return bool;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bnv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */