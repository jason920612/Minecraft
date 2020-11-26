/*      */ import com.google.common.collect.Sets;
/*      */ import com.google.gson.Gson;
/*      */ import com.google.gson.GsonBuilder;
/*      */ import com.google.gson.JsonElement;
/*      */ import com.google.gson.JsonObject;
/*      */ import java.io.BufferedWriter;
/*      */ import java.io.IOException;
/*      */ import java.nio.file.Files;
/*      */ import java.nio.file.Path;
/*      */ import java.nio.file.attribute.FileAttribute;
/*      */ import java.util.Objects;
/*      */ import java.util.Set;
/*      */ import java.util.function.Consumer;
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
/*      */ public class gf
/*      */   implements fq
/*      */ {
/*   44 */   private static final Logger b = LogManager.getLogger();
/*   45 */   private static final Gson c = (new GsonBuilder()).setPrettyPrinting().create();
/*      */   
/*      */   private final fp d;
/*      */   
/*      */   public gf(fp ☃) {
/*   50 */     this.d = ☃;
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(fr ☃) throws IOException {
/*   55 */     Path path = this.d.b();
/*   56 */     Set<pc> set = Sets.newHashSet();
/*   57 */     a(ge1 -> {
/*      */           if (!☃.add(ge1.b())) {
/*      */             throw new IllegalStateException("Duplicate recipe " + ge1.b());
/*      */           }
/*      */           
/*      */           a(fr1, ge1.a(), path.resolve("data/" + ge1.b().b() + "/recipes/" + ge1.b().a() + ".json"));
/*      */           JsonObject jsonObject = ge1.c();
/*      */           if (jsonObject != null) {
/*      */             b(fr1, jsonObject, path.resolve("data/" + ge1.b().b() + "/advancements/" + ge1.d().a() + ".json"));
/*      */           }
/*      */         });
/*   68 */     b(☃, l.a.a().a("impossible", new as.a()).b(), path.resolve("data/minecraft/advancements/recipes/root.json"));
/*      */   }
/*      */   
/*      */   private void a(fr ☃, JsonObject jsonObject, Path path) {
/*      */     try {
/*   73 */       String str1 = c.toJson((JsonElement)jsonObject);
/*   74 */       String str2 = a.hashUnencodedChars(str1).toString();
/*      */       
/*   76 */       if (!Objects.equals(☃.a(path), str2) || !Files.exists(path, new java.nio.file.LinkOption[0])) {
/*   77 */         Files.createDirectories(path.getParent(), (FileAttribute<?>[])new FileAttribute[0]);
/*   78 */         try (BufferedWriter ☃ = Files.newBufferedWriter(path, new java.nio.file.OpenOption[0])) {
/*   79 */           bufferedWriter.write(str1);
/*      */         } 
/*      */       } 
/*   82 */       ☃.a(path, str2);
/*   83 */     } catch (IOException iOException) {
/*   84 */       b.error("Couldn't save recipe {}", path, iOException);
/*      */     } 
/*      */   }
/*      */   
/*      */   private void b(fr ☃, JsonObject jsonObject, Path path) {
/*      */     try {
/*   90 */       String str1 = c.toJson((JsonElement)jsonObject);
/*   91 */       String str2 = a.hashUnencodedChars(str1).toString();
/*      */       
/*   93 */       if (!Objects.equals(☃.a(path), str2) || !Files.exists(path, new java.nio.file.LinkOption[0])) {
/*   94 */         Files.createDirectories(path.getParent(), (FileAttribute<?>[])new FileAttribute[0]);
/*   95 */         try (BufferedWriter ☃ = Files.newBufferedWriter(path, new java.nio.file.OpenOption[0])) {
/*   96 */           bufferedWriter.write(str1);
/*      */         } 
/*      */       } 
/*   99 */       ☃.a(path, str2);
/*  100 */     } catch (IOException iOException) {
/*  101 */       b.error("Couldn't save recipe advancement {}", path, iOException);
/*      */     } 
/*      */   }
/*      */   
/*      */   private void a(Consumer<ge> ☃) {
/*  106 */     gg.a(bct.Z, 3)
/*  107 */       .a(Character.valueOf('#'), bct.N)
/*  108 */       .a("##")
/*  109 */       .a("##")
/*  110 */       .b("bark")
/*  111 */       .a("has_log", a(bct.N))
/*  112 */       .a(☃);
/*      */     
/*  114 */     gg.a(atf.aH)
/*  115 */       .a(Character.valueOf('#'), bct.r)
/*  116 */       .a("# #")
/*  117 */       .a("###")
/*  118 */       .b("boat")
/*  119 */       .a("in_water", a(bct.A))
/*  120 */       .a(☃);
/*      */     
/*  122 */     gh.a(bct.eZ)
/*  123 */       .b(bct.r)
/*  124 */       .a("wooden_button")
/*  125 */       .a("has_planks", a(bct.r))
/*  126 */       .a(☃);
/*      */     
/*  128 */     gg.a(bct.cx, 3)
/*  129 */       .a(Character.valueOf('#'), bct.r)
/*  130 */       .a("##")
/*  131 */       .a("##")
/*  132 */       .a("##")
/*  133 */       .b("wooden_door")
/*  134 */       .a("has_planks", a(bct.r))
/*  135 */       .a(☃);
/*      */     
/*  137 */     gg.a(bct.dc, 3)
/*  138 */       .a(Character.valueOf('#'), atf.C)
/*  139 */       .a(Character.valueOf('W'), bct.r)
/*  140 */       .a("W#W")
/*  141 */       .a("W#W")
/*  142 */       .b("wooden_fence")
/*  143 */       .a("has_planks", a(bct.r))
/*  144 */       .a(☃);
/*      */     
/*  146 */     gg.a(bct.dS)
/*  147 */       .a(Character.valueOf('#'), atf.C)
/*  148 */       .a(Character.valueOf('W'), bct.r)
/*  149 */       .a("#W#")
/*  150 */       .a("#W#")
/*  151 */       .b("wooden_fence_gate")
/*  152 */       .a("has_planks", a(bct.r))
/*  153 */       .a(☃);
/*      */     
/*  155 */     gh.a(bct.r, 4)
/*  156 */       .a(wx.r)
/*  157 */       .a("planks")
/*  158 */       .a("has_logs", a(wx.r))
/*  159 */       .a(☃);
/*      */     
/*  161 */     gg.a(bct.cK)
/*  162 */       .a(Character.valueOf('#'), bct.r)
/*  163 */       .a("##")
/*  164 */       .b("wooden_pressure_plate")
/*  165 */       .a("has_planks", a(bct.r))
/*  166 */       .a(☃);
/*      */     
/*  168 */     gg.a(bct.bH, 6)
/*  169 */       .a(Character.valueOf('#'), bct.r)
/*  170 */       .a("###")
/*  171 */       .b("wooden_slab")
/*  172 */       .a("has_planks", a(bct.r))
/*  173 */       .a(☃);
/*      */     
/*  175 */     gg.a(bct.gr, 4)
/*  176 */       .a(Character.valueOf('#'), bct.r)
/*  177 */       .a("#  ")
/*  178 */       .a("## ")
/*  179 */       .a("###")
/*  180 */       .b("wooden_stairs")
/*  181 */       .a("has_planks", a(bct.r))
/*  182 */       .a(☃);
/*      */     
/*  184 */     gg.a(bct.dq, 2)
/*  185 */       .a(Character.valueOf('#'), bct.r)
/*  186 */       .a("###")
/*  187 */       .a("###")
/*  188 */       .b("wooden_trapdoor")
/*  189 */       .a("has_planks", a(bct.r))
/*  190 */       .a(☃);
/*      */     
/*  192 */     gg.a(bct.fC, 6)
/*  193 */       .a(Character.valueOf('#'), bct.cN)
/*  194 */       .a(Character.valueOf('S'), atf.C)
/*  195 */       .a(Character.valueOf('X'), atf.n)
/*  196 */       .a("XSX")
/*  197 */       .a("X#X")
/*  198 */       .a("XSX")
/*  199 */       .a("has_rail", a(bct.cA))
/*  200 */       .a(☃);
/*      */     
/*  202 */     gh.a(bct.g, 2)
/*  203 */       .b(bct.e)
/*  204 */       .b(bct.m)
/*  205 */       .a("has_stone", a(bct.e))
/*  206 */       .a(☃);
/*      */     
/*  208 */     gg.a(bct.fn)
/*  209 */       .a(Character.valueOf('I'), bct.bC)
/*  210 */       .a(Character.valueOf('i'), atf.n)
/*  211 */       .a("III")
/*  212 */       .a(" i ")
/*  213 */       .a("iii")
/*  214 */       .a("has_iron_block", a(bct.bC))
/*  215 */       .a(☃);
/*      */     
/*  217 */     gg.a(atf.dY)
/*  218 */       .a(Character.valueOf('/'), atf.C)
/*  219 */       .a(Character.valueOf('_'), bct.bJ)
/*  220 */       .a("///")
/*  221 */       .a(" / ")
/*  222 */       .a("/_/")
/*  223 */       .a("has_stone_slab", a(bct.bJ))
/*  224 */       .a(☃);
/*      */     
/*  226 */     gg.a(atf.h, 4)
/*  227 */       .a(Character.valueOf('#'), atf.C)
/*  228 */       .a(Character.valueOf('X'), atf.ap)
/*  229 */       .a(Character.valueOf('Y'), atf.K)
/*  230 */       .a("X")
/*  231 */       .a("#")
/*  232 */       .a("Y")
/*  233 */       .a("has_feather", a(atf.K))
/*  234 */       .a("has_flint", a(atf.ap))
/*  235 */       .a(☃);
/*      */     
/*  237 */     gg.a(bct.eu)
/*  238 */       .a(Character.valueOf('S'), atf.dP)
/*  239 */       .a(Character.valueOf('G'), bct.ap)
/*  240 */       .a(Character.valueOf('O'), bct.ce)
/*  241 */       .a("GGG")
/*  242 */       .a("GSG")
/*  243 */       .a("OOO")
/*  244 */       .a("has_nether_star", a(atf.dP))
/*  245 */       .a(☃);
/*      */     
/*  247 */     gg.a(atf.eQ)
/*  248 */       .a(Character.valueOf('B'), atf.D)
/*  249 */       .a(Character.valueOf('O'), atf.eP)
/*  250 */       .a("OOO")
/*  251 */       .a("OOO")
/*  252 */       .a(" B ")
/*  253 */       .a("has_beetroot", a(atf.eP))
/*  254 */       .a(☃);
/*      */     
/*  256 */     gg.a(bct.X, 3)
/*  257 */       .a(Character.valueOf('#'), bct.L)
/*  258 */       .a("##")
/*  259 */       .a("##")
/*  260 */       .b("bark")
/*  261 */       .a("has_log", a(bct.L))
/*  262 */       .a(☃);
/*      */     
/*  264 */     gg.a(atf.aF)
/*  265 */       .a(Character.valueOf('#'), bct.p)
/*  266 */       .a("# #")
/*  267 */       .a("###")
/*  268 */       .b("boat")
/*  269 */       .a("in_water", a(bct.A))
/*  270 */       .a(☃);
/*      */     
/*  272 */     gh.a(bct.eX)
/*  273 */       .b(bct.p)
/*  274 */       .a("wooden_button")
/*  275 */       .a("has_planks", a(bct.p))
/*  276 */       .a(☃);
/*      */     
/*  278 */     gg.a(bct.cv, 3)
/*  279 */       .a(Character.valueOf('#'), bct.p)
/*  280 */       .a("##")
/*  281 */       .a("##")
/*  282 */       .a("##")
/*  283 */       .b("wooden_door")
/*  284 */       .a("has_planks", a(bct.p))
/*  285 */       .a(☃);
/*      */     
/*  287 */     gg.a(bct.cZ, 3)
/*  288 */       .a(Character.valueOf('#'), atf.C)
/*  289 */       .a(Character.valueOf('W'), bct.p)
/*  290 */       .a("W#W")
/*  291 */       .a("W#W")
/*  292 */       .b("wooden_fence")
/*  293 */       .a("has_planks", a(bct.p))
/*  294 */       .a(☃);
/*      */     
/*  296 */     gg.a(bct.dP)
/*  297 */       .a(Character.valueOf('#'), atf.C)
/*  298 */       .a(Character.valueOf('W'), bct.p)
/*  299 */       .a("#W#")
/*  300 */       .a("#W#")
/*  301 */       .b("wooden_fence_gate")
/*  302 */       .a("has_planks", a(bct.p))
/*  303 */       .a(☃);
/*      */     
/*  305 */     gh.a(bct.p, 4)
/*  306 */       .a(wx.q)
/*  307 */       .a("planks")
/*  308 */       .a("has_log", a(wx.q))
/*  309 */       .a(☃);
/*      */     
/*  311 */     gg.a(bct.cI)
/*  312 */       .a(Character.valueOf('#'), bct.p)
/*  313 */       .a("##")
/*  314 */       .b("wooden_pressure_plate")
/*  315 */       .a("has_planks", a(bct.p))
/*  316 */       .a(☃);
/*      */     
/*  318 */     gg.a(bct.bF, 6)
/*  319 */       .a(Character.valueOf('#'), bct.p)
/*  320 */       .a("###")
/*  321 */       .b("wooden_slab")
/*  322 */       .a("has_planks", a(bct.p))
/*  323 */       .a(☃);
/*      */     
/*  325 */     gg.a(bct.er, 4)
/*  326 */       .a(Character.valueOf('#'), bct.p)
/*  327 */       .a("#  ")
/*  328 */       .a("## ")
/*  329 */       .a("###")
/*  330 */       .b("wooden_stairs")
/*  331 */       .a("has_planks", a(bct.p))
/*  332 */       .a(☃);
/*      */     
/*  334 */     gg.a(bct.do, 2)
/*  335 */       .a(Character.valueOf('#'), bct.p)
/*  336 */       .a("###")
/*  337 */       .a("###")
/*  338 */       .b("wooden_trapdoor")
/*  339 */       .a("has_planks", a(bct.p))
/*  340 */       .a(☃);
/*      */     
/*  342 */     gg.a(atf.eI)
/*  343 */       .a(Character.valueOf('#'), bct.bn)
/*  344 */       .a(Character.valueOf('|'), atf.C)
/*  345 */       .a("###")
/*  346 */       .a("###")
/*  347 */       .a(" | ")
/*  348 */       .b("banner")
/*  349 */       .a("has_black_wool", a(bct.bn))
/*  350 */       .a(☃);
/*      */     
/*  352 */     gg.a(atf.bO)
/*  353 */       .a(Character.valueOf('#'), bct.bn)
/*  354 */       .a(Character.valueOf('X'), wx.b)
/*  355 */       .a("###")
/*  356 */       .a("XXX")
/*  357 */       .b("bed")
/*  358 */       .a("has_black_wool", a(bct.bn))
/*  359 */       .a(☃);
/*      */     
/*  361 */     gh.a(atf.bO)
/*  362 */       .b(atf.bz)
/*  363 */       .b(atf.bw)
/*  364 */       .a("dyed_bed")
/*  365 */       .a("has_bed", a(atf.bz))
/*  366 */       .a(☃, "black_bed_from_white_bed");
/*      */     
/*  368 */     gg.a(bct.gm, 3)
/*  369 */       .a(Character.valueOf('#'), bct.bn)
/*  370 */       .a("##")
/*  371 */       .b("carpet")
/*  372 */       .a("has_black_wool", a(bct.bn))
/*  373 */       .a(☃);
/*      */     
/*  375 */     gh.a(bct.jC, 8)
/*  376 */       .b(atf.bw)
/*  377 */       .b(bct.D, 4)
/*  378 */       .b(bct.F, 4)
/*  379 */       .a("concrete_powder")
/*  380 */       .a("has_sand", a(bct.D))
/*  381 */       .a("has_gravel", a(bct.F))
/*  382 */       .a(☃);
/*      */     
/*  384 */     gg.a(bct.gP, 8)
/*  385 */       .a(Character.valueOf('#'), bct.ap)
/*  386 */       .a(Character.valueOf('X'), atf.bw)
/*  387 */       .a("###")
/*  388 */       .a("#X#")
/*  389 */       .a("###")
/*  390 */       .b("stained_glass")
/*  391 */       .a("has_glass", a(bct.ap))
/*  392 */       .a(☃);
/*      */     
/*  394 */     gg.a(bct.hf, 16)
/*  395 */       .a(Character.valueOf('#'), bct.gP)
/*  396 */       .a("###")
/*  397 */       .a("###")
/*  398 */       .b("stained_glass_pane")
/*  399 */       .a("has_glass", a(bct.ap))
/*  400 */       .a(☃);
/*      */     
/*  402 */     gg.a(bct.fT, 8)
/*  403 */       .a(Character.valueOf('#'), bct.gn)
/*  404 */       .a(Character.valueOf('X'), atf.bw)
/*  405 */       .a("###")
/*  406 */       .a("#X#")
/*  407 */       .a("###")
/*  408 */       .b("stained_terracotta")
/*  409 */       .a("has_terracotta", a(bct.gn))
/*  410 */       .a(☃);
/*      */     
/*  412 */     gh.a(bct.bn)
/*  413 */       .b(atf.bw)
/*  414 */       .b(bct.aY)
/*  415 */       .a("wool")
/*  416 */       .a("has_white_wool", a(bct.aY))
/*  417 */       .a(☃);
/*      */     
/*  419 */     gh.a(atf.cu, 2)
/*  420 */       .b(atf.cj)
/*  421 */       .a("has_blaze_rod", a(atf.cj))
/*  422 */       .a(☃);
/*      */     
/*  424 */     gg.a(atf.eE)
/*  425 */       .a(Character.valueOf('#'), bct.bj)
/*  426 */       .a(Character.valueOf('|'), atf.C)
/*  427 */       .a("###")
/*  428 */       .a("###")
/*  429 */       .a(" | ")
/*  430 */       .b("banner")
/*  431 */       .a("has_blue_wool", a(bct.bj))
/*  432 */       .a(☃);
/*      */     
/*  434 */     gg.a(atf.bK)
/*  435 */       .a(Character.valueOf('#'), bct.bj)
/*  436 */       .a(Character.valueOf('X'), wx.b)
/*  437 */       .a("###")
/*  438 */       .a("XXX")
/*  439 */       .b("bed")
/*  440 */       .a("has_blue_wool", a(bct.bj))
/*  441 */       .a(☃);
/*      */     
/*  443 */     gh.a(atf.bK)
/*  444 */       .b(atf.bz)
/*  445 */       .b(atf.bs)
/*  446 */       .a("dyed_bed")
/*  447 */       .a("has_bed", a(atf.bz))
/*  448 */       .a(☃, "blue_bed_from_white_bed");
/*      */     
/*  450 */     gg.a(bct.gi, 3)
/*  451 */       .a(Character.valueOf('#'), bct.bj)
/*  452 */       .a("##")
/*  453 */       .b("carpet")
/*  454 */       .a("has_blue_wool", a(bct.bj))
/*  455 */       .a(☃);
/*      */     
/*  457 */     gh.a(bct.jy, 8)
/*  458 */       .b(atf.bs)
/*  459 */       .b(bct.D, 4)
/*  460 */       .b(bct.F, 4)
/*  461 */       .a("concrete_powder")
/*  462 */       .a("has_sand", a(bct.D))
/*  463 */       .a("has_gravel", a(bct.F))
/*  464 */       .a(☃);
/*      */     
/*  466 */     gg.a(bct.gq)
/*  467 */       .a(Character.valueOf('#'), bct.gp)
/*  468 */       .a("###")
/*  469 */       .a("###")
/*  470 */       .a("###")
/*  471 */       .a("has_at_least_9_packed_ice", a(ba.d.b(9), bct.gp))
/*  472 */       .a(☃);
/*      */     
/*  474 */     gg.a(bct.gL, 8)
/*  475 */       .a(Character.valueOf('#'), bct.ap)
/*  476 */       .a(Character.valueOf('X'), atf.bs)
/*  477 */       .a("###")
/*  478 */       .a("#X#")
/*  479 */       .a("###")
/*  480 */       .b("stained_glass")
/*  481 */       .a("has_glass", a(bct.ap))
/*  482 */       .a(☃);
/*      */     
/*  484 */     gg.a(bct.hb, 16)
/*  485 */       .a(Character.valueOf('#'), bct.gL)
/*  486 */       .a("###")
/*  487 */       .a("###")
/*  488 */       .b("stained_glass_pane")
/*  489 */       .a("has_glass", a(bct.ap))
/*  490 */       .a(☃);
/*      */     
/*  492 */     gg.a(bct.fP, 8)
/*  493 */       .a(Character.valueOf('#'), bct.gn)
/*  494 */       .a(Character.valueOf('X'), atf.bs)
/*  495 */       .a("###")
/*  496 */       .a("#X#")
/*  497 */       .a("###")
/*  498 */       .b("stained_terracotta")
/*  499 */       .a("has_terracotta", a(bct.gn))
/*  500 */       .a(☃);
/*      */     
/*  502 */     gh.a(bct.bj)
/*  503 */       .b(atf.bs)
/*  504 */       .b(bct.aY)
/*  505 */       .a("wool")
/*  506 */       .a("has_white_wool", a(bct.aY))
/*  507 */       .a(☃);
/*      */     
/*  509 */     gg.a(atf.aD)
/*  510 */       .a(Character.valueOf('#'), bct.n)
/*  511 */       .a("# #")
/*  512 */       .a("###")
/*  513 */       .b("boat")
/*  514 */       .a("in_water", a(bct.A))
/*  515 */       .a(☃);
/*      */     
/*  517 */     ata ata = atf.bh;
/*  518 */     gg.a(bct.in)
/*  519 */       .a(Character.valueOf('X'), atf.bh)
/*  520 */       .a("XXX")
/*  521 */       .a("XXX")
/*  522 */       .a("XXX")
/*  523 */       .a("has_at_least_9_bonemeal", a(ba.d.b(9), ata))
/*  524 */       .a(☃);
/*      */     
/*  526 */     gh.a(atf.bh, 3)
/*  527 */       .b(atf.bx)
/*  528 */       .a("bonemeal")
/*  529 */       .a("has_bone", a(atf.bx))
/*  530 */       .a(☃);
/*      */     
/*  532 */     gh.a(atf.bh, 9)
/*  533 */       .b(bct.in)
/*  534 */       .a("bonemeal")
/*  535 */       .a("has_at_least_9_bonemeal", a(ba.d.b(9), atf.bh))
/*  536 */       .a("has_bone_block", a(bct.in))
/*  537 */       .a(☃, "bone_meal_from_bone_block");
/*      */     
/*  539 */     gh.a(atf.aS)
/*  540 */       .b(atf.aR, 3)
/*  541 */       .b(atf.aJ)
/*  542 */       .a("has_paper", a(atf.aR))
/*  543 */       .a(☃);
/*      */     
/*  545 */     gg.a(bct.cc)
/*  546 */       .a(Character.valueOf('#'), wx.b)
/*  547 */       .a(Character.valueOf('X'), atf.aS)
/*  548 */       .a("###")
/*  549 */       .a("XXX")
/*  550 */       .a("###")
/*  551 */       .a("has_book", a(atf.aS))
/*  552 */       .a(☃);
/*      */     
/*  554 */     gg.a(atf.g)
/*  555 */       .a(Character.valueOf('#'), atf.C)
/*  556 */       .a(Character.valueOf('X'), atf.J)
/*  557 */       .a(" #X")
/*  558 */       .a("# X")
/*  559 */       .a(" #X")
/*  560 */       .a("has_string", a(atf.J))
/*  561 */       .a(☃);
/*      */     
/*  563 */     gg.a(atf.D, 4)
/*  564 */       .a(Character.valueOf('#'), wx.b)
/*  565 */       .a("# #")
/*  566 */       .a(" # ")
/*  567 */       .a("has_brown_mushroom", a(bct.bz))
/*  568 */       .a("has_red_mushroom", a(bct.bA))
/*  569 */       .a("has_mushroom_stew", a(atf.E))
/*  570 */       .a(☃);
/*      */     
/*  572 */     gg.a(atf.T)
/*  573 */       .a(Character.valueOf('#'), atf.S)
/*  574 */       .a("###")
/*  575 */       .a("has_wheat", a(atf.S))
/*  576 */       .a(☃);
/*      */     
/*  578 */     gg.a(bct.ec)
/*  579 */       .a(Character.valueOf('B'), atf.cj)
/*  580 */       .a(Character.valueOf('#'), bct.m)
/*  581 */       .a(" B ")
/*  582 */       .a("###")
/*  583 */       .a("has_blaze_rod", a(atf.cj))
/*  584 */       .a(☃);
/*      */     
/*  586 */     gg.a(bct.ca)
/*  587 */       .a(Character.valueOf('#'), atf.aP)
/*  588 */       .a("##")
/*  589 */       .a("##")
/*  590 */       .a("has_brick", a(atf.aP))
/*  591 */       .a(☃);
/*      */     
/*  593 */     gg.a(bct.bN, 6)
/*  594 */       .a(Character.valueOf('#'), bct.ca)
/*  595 */       .a("###")
/*  596 */       .a("has_brick_block", a(bct.ca))
/*  597 */       .a(☃);
/*      */     
/*  599 */     gg.a(bct.dT, 4)
/*  600 */       .a(Character.valueOf('#'), bct.ca)
/*  601 */       .a("#  ")
/*  602 */       .a("## ")
/*  603 */       .a("###")
/*  604 */       .a("has_brick_block", a(bct.ca))
/*  605 */       .a(☃);
/*      */     
/*  607 */     gg.a(atf.eF)
/*  608 */       .a(Character.valueOf('#'), bct.bk)
/*  609 */       .a(Character.valueOf('|'), atf.C)
/*  610 */       .a("###")
/*  611 */       .a("###")
/*  612 */       .a(" | ")
/*  613 */       .b("banner")
/*  614 */       .a("has_brown_wool", a(bct.bk))
/*  615 */       .a(☃);
/*      */     
/*  617 */     gg.a(atf.bL)
/*  618 */       .a(Character.valueOf('#'), bct.bk)
/*  619 */       .a(Character.valueOf('X'), wx.b)
/*  620 */       .a("###")
/*  621 */       .a("XXX")
/*  622 */       .b("bed")
/*  623 */       .a("has_brown_wool", a(bct.bk))
/*  624 */       .a(☃);
/*      */     
/*  626 */     gh.a(atf.bL)
/*  627 */       .b(atf.bz)
/*  628 */       .b(atf.bt)
/*  629 */       .a("dyed_bed")
/*  630 */       .a("has_bed", a(atf.bz))
/*  631 */       .a(☃, "brown_bed_from_white_bed");
/*      */     
/*  633 */     gg.a(bct.gj, 3)
/*  634 */       .a(Character.valueOf('#'), bct.bk)
/*  635 */       .a("##")
/*  636 */       .b("carpet")
/*  637 */       .a("has_brown_wool", a(bct.bk))
/*  638 */       .a(☃);
/*      */     
/*  640 */     gh.a(bct.jz, 8)
/*  641 */       .b(atf.bt)
/*  642 */       .b(bct.D, 4)
/*  643 */       .b(bct.F, 4)
/*  644 */       .a("concrete_powder")
/*  645 */       .a("has_sand", a(bct.D))
/*  646 */       .a("has_gravel", a(bct.F))
/*  647 */       .a(☃);
/*      */     
/*  649 */     gg.a(bct.gM, 8)
/*  650 */       .a(Character.valueOf('#'), bct.ap)
/*  651 */       .a(Character.valueOf('X'), atf.bt)
/*  652 */       .a("###")
/*  653 */       .a("#X#")
/*  654 */       .a("###")
/*  655 */       .b("stained_glass")
/*  656 */       .a("has_glass", a(bct.ap))
/*  657 */       .a(☃);
/*      */     
/*  659 */     gg.a(bct.hc, 16)
/*  660 */       .a(Character.valueOf('#'), bct.gM)
/*  661 */       .a("###")
/*  662 */       .a("###")
/*  663 */       .b("stained_glass_pane")
/*  664 */       .a("has_glass", a(bct.ap))
/*  665 */       .a(☃);
/*      */     
/*  667 */     gg.a(bct.fQ, 8)
/*  668 */       .a(Character.valueOf('#'), bct.gn)
/*  669 */       .a(Character.valueOf('X'), atf.bt)
/*  670 */       .a("###")
/*  671 */       .a("#X#")
/*  672 */       .a("###")
/*  673 */       .b("stained_terracotta")
/*  674 */       .a("has_terracotta", a(bct.gn))
/*  675 */       .a(☃);
/*      */     
/*  677 */     gh.a(bct.bk)
/*  678 */       .b(atf.bt)
/*  679 */       .b(bct.aY)
/*  680 */       .a("wool")
/*  681 */       .a("has_white_wool", a(bct.aY))
/*  682 */       .a(☃);
/*      */     
/*  684 */     gg.a(atf.aw)
/*  685 */       .a(Character.valueOf('#'), atf.n)
/*  686 */       .a("# #")
/*  687 */       .a(" # ")
/*  688 */       .a("has_iron_ingot", a(atf.n))
/*  689 */       .a(☃);
/*      */     
/*  691 */     gg.a(bct.dk)
/*  692 */       .a(Character.valueOf('A'), atf.aK)
/*  693 */       .a(Character.valueOf('B'), atf.by)
/*  694 */       .a(Character.valueOf('C'), atf.S)
/*  695 */       .a(Character.valueOf('E'), atf.aW)
/*  696 */       .a("AAA")
/*  697 */       .a("BEB")
/*  698 */       .a("CCC")
/*  699 */       .a("has_egg", a(atf.aW))
/*  700 */       .a(☃);
/*      */     
/*  702 */     gg.a(atf.dO)
/*  703 */       .a(Character.valueOf('#'), atf.aY)
/*  704 */       .a(Character.valueOf('X'), atf.dC)
/*  705 */       .a("# ")
/*  706 */       .a(" X")
/*  707 */       .a("has_carrot", a(atf.dC))
/*  708 */       .a(☃);
/*      */     
/*  710 */     gg.a(bct.ed)
/*  711 */       .a(Character.valueOf('#'), atf.n)
/*  712 */       .a("# #")
/*  713 */       .a("# #")
/*  714 */       .a("###")
/*  715 */       .a("has_water_bucket", a(atf.ax))
/*  716 */       .a(☃);
/*      */     
/*  718 */     gg.a(bct.ck)
/*  719 */       .a(Character.valueOf('#'), wx.b)
/*  720 */       .a("###")
/*  721 */       .a("# #")
/*  722 */       .a("###")
/*  723 */       .a("has_lots_of_items", new at.b(ba.d.b(10), ba.d.e, ba.d.e, new av[0]))
/*  724 */       .a(☃);
/*      */     
/*  726 */     gg.a(atf.aU)
/*  727 */       .a(Character.valueOf('A'), bct.ck)
/*  728 */       .a(Character.valueOf('B'), atf.az)
/*  729 */       .a("A")
/*  730 */       .a("B")
/*  731 */       .a("has_minecart", a(atf.az))
/*  732 */       .a(☃);
/*      */     
/*  734 */     gg.a(bct.fA)
/*  735 */       .a(Character.valueOf('#'), bct.bQ)
/*  736 */       .a("#")
/*  737 */       .a("#")
/*  738 */       .a("has_chiseled_quartz_block", a(bct.fA))
/*  739 */       .a("has_quartz_block", a(bct.fy))
/*  740 */       .a("has_quartz_pillar", a(bct.fz))
/*  741 */       .a(☃);
/*      */     
/*  743 */     gg.a(bct.dB)
/*  744 */       .a(Character.valueOf('#'), bct.bO)
/*  745 */       .a("#")
/*  746 */       .a("#")
/*  747 */       .a("has_stone_bricks", a(wx.c))
/*  748 */       .a(☃);
/*      */     
/*  750 */     gg.a(bct.cU)
/*  751 */       .a(Character.valueOf('#'), atf.aQ)
/*  752 */       .a("##")
/*  753 */       .a("##")
/*  754 */       .a("has_clay_ball", a(atf.aQ))
/*  755 */       .a(☃);
/*      */     
/*  757 */     gg.a(atf.aZ)
/*  758 */       .a(Character.valueOf('#'), atf.o)
/*  759 */       .a(Character.valueOf('X'), atf.aB)
/*  760 */       .a(" # ")
/*  761 */       .a("#X#")
/*  762 */       .a(" # ")
/*  763 */       .a("has_redstone", a(atf.aB))
/*  764 */       .a(☃);
/*      */     
/*  766 */     gh.a(atf.k, 9)
/*  767 */       .b(bct.go)
/*  768 */       .a("has_at_least_9_coal", a(ba.d.b(9), atf.k))
/*  769 */       .a("has_coal_block", a(bct.go))
/*  770 */       .a(☃);
/*      */     
/*  772 */     gg.a(bct.go)
/*  773 */       .a(Character.valueOf('#'), atf.k)
/*  774 */       .a("###")
/*  775 */       .a("###")
/*  776 */       .a("###")
/*  777 */       .a("has_at_least_9_coal", a(ba.d.b(9), atf.k))
/*  778 */       .a(☃);
/*      */     
/*  780 */     gg.a(bct.k, 4)
/*  781 */       .a(Character.valueOf('D'), bct.j)
/*  782 */       .a(Character.valueOf('G'), bct.F)
/*  783 */       .a("DG")
/*  784 */       .a("GD")
/*  785 */       .a("has_gravel", a(bct.F))
/*  786 */       .a(☃);
/*      */     
/*  788 */     gg.a(bct.bM, 6)
/*  789 */       .a(Character.valueOf('#'), bct.m)
/*  790 */       .a("###")
/*  791 */       .a("has_cobblestone", a(bct.m))
/*  792 */       .a(☃);
/*      */     
/*  794 */     gg.a(bct.ev, 6)
/*  795 */       .a(Character.valueOf('#'), bct.m)
/*  796 */       .a("###")
/*  797 */       .a("###")
/*  798 */       .a("has_cobblestone", a(bct.m))
/*  799 */       .a(☃);
/*      */     
/*  801 */     gg.a(bct.ft)
/*  802 */       .a(Character.valueOf('#'), bct.cN)
/*  803 */       .a(Character.valueOf('X'), atf.dV)
/*  804 */       .a(Character.valueOf('I'), bct.b)
/*  805 */       .a(" # ")
/*  806 */       .a("#X#")
/*  807 */       .a("III")
/*  808 */       .a("has_quartz", a(atf.dV))
/*  809 */       .a(☃);
/*      */     
/*  811 */     gg.a(atf.aX)
/*  812 */       .a(Character.valueOf('#'), atf.n)
/*  813 */       .a(Character.valueOf('X'), atf.aB)
/*  814 */       .a(" # ")
/*  815 */       .a("#X#")
/*  816 */       .a(" # ")
/*  817 */       .a("has_redstone", a(atf.aB))
/*  818 */       .a(☃);
/*      */     
/*  820 */     gg.a(atf.bP, 8)
/*  821 */       .a(Character.valueOf('#'), atf.S)
/*  822 */       .a(Character.valueOf('X'), atf.bt)
/*  823 */       .a("#X#")
/*  824 */       .a("has_cocoa", a(atf.bt))
/*  825 */       .a(☃);
/*      */     
/*  827 */     gg.a(bct.co)
/*  828 */       .a(Character.valueOf('#'), wx.b)
/*  829 */       .a("##")
/*  830 */       .a("##")
/*  831 */       .a("has_planks", a(wx.b))
/*  832 */       .a(☃);
/*      */     
/*  834 */     gg.a(bct.hU)
/*  835 */       .a(Character.valueOf('#'), bct.bR)
/*  836 */       .a("#")
/*  837 */       .a("#")
/*  838 */       .a("has_red_sandstone", a(bct.hT))
/*  839 */       .a("has_chiseled_red_sandstone", a(bct.hU))
/*  840 */       .a("has_cut_red_sandstone", a(bct.hV))
/*  841 */       .a(☃);
/*      */     
/*  843 */     gg.a(bct.au)
/*  844 */       .a(Character.valueOf('#'), bct.bK)
/*  845 */       .a("#")
/*  846 */       .a("#")
/*  847 */       .a("has_stone_slab", a(bct.bK))
/*  848 */       .a(☃);
/*      */     
/*  850 */     gg.a(atf.eC)
/*  851 */       .a(Character.valueOf('#'), bct.bh)
/*  852 */       .a(Character.valueOf('|'), atf.C)
/*  853 */       .a("###")
/*  854 */       .a("###")
/*  855 */       .a(" | ")
/*  856 */       .b("banner")
/*  857 */       .a("has_cyan_wool", a(bct.bh))
/*  858 */       .a(☃);
/*      */     
/*  860 */     gg.a(atf.bI)
/*  861 */       .a(Character.valueOf('#'), bct.bh)
/*  862 */       .a(Character.valueOf('X'), wx.b)
/*  863 */       .a("###")
/*  864 */       .a("XXX")
/*  865 */       .b("bed")
/*  866 */       .a("has_cyan_wool", a(bct.bh))
/*  867 */       .a(☃);
/*      */     
/*  869 */     gh.a(atf.bI)
/*  870 */       .b(atf.bz)
/*  871 */       .b(atf.bq)
/*  872 */       .a("dyed_bed")
/*  873 */       .a("has_bed", a(atf.bz))
/*  874 */       .a(☃, "cyan_bed_from_white_bed");
/*      */     
/*  876 */     gg.a(bct.gg, 3)
/*  877 */       .a(Character.valueOf('#'), bct.bh)
/*  878 */       .a("##")
/*  879 */       .b("carpet")
/*  880 */       .a("has_cyan_wool", a(bct.bh))
/*  881 */       .a(☃);
/*      */     
/*  883 */     gh.a(bct.jw, 8)
/*  884 */       .b(atf.bq)
/*  885 */       .b(bct.D, 4)
/*  886 */       .b(bct.F, 4)
/*  887 */       .a("concrete_powder")
/*  888 */       .a("has_sand", a(bct.D))
/*  889 */       .a("has_gravel", a(bct.F))
/*  890 */       .a(☃);
/*      */     
/*  892 */     gh.a(atf.bq, 2)
/*  893 */       .b(atf.bs)
/*  894 */       .b(atf.bu)
/*  895 */       .a("has_green_dye", a(atf.bu))
/*  896 */       .a("has_lapis", a(atf.bs))
/*  897 */       .a(☃);
/*      */     
/*  899 */     gg.a(bct.gJ, 8)
/*  900 */       .a(Character.valueOf('#'), bct.ap)
/*  901 */       .a(Character.valueOf('X'), atf.bq)
/*  902 */       .a("###")
/*  903 */       .a("#X#")
/*  904 */       .a("###")
/*  905 */       .b("stained_glass")
/*  906 */       .a("has_glass", a(bct.ap))
/*  907 */       .a(☃);
/*      */     
/*  909 */     gg.a(bct.gZ, 16)
/*  910 */       .a(Character.valueOf('#'), bct.gJ)
/*  911 */       .a("###")
/*  912 */       .a("###")
/*  913 */       .b("stained_glass_pane")
/*  914 */       .a("has_glass", a(bct.ap))
/*  915 */       .a(☃);
/*      */     
/*  917 */     gg.a(bct.fN, 8)
/*  918 */       .a(Character.valueOf('#'), bct.gn)
/*  919 */       .a(Character.valueOf('X'), atf.bq)
/*  920 */       .a("###")
/*  921 */       .a("#X#")
/*  922 */       .a("###")
/*  923 */       .b("stained_terracotta")
/*  924 */       .a("has_terracotta", a(bct.gn))
/*  925 */       .a(☃);
/*      */     
/*  927 */     gh.a(bct.bh)
/*  928 */       .b(atf.bq)
/*  929 */       .b(bct.aY)
/*  930 */       .a("wool")
/*  931 */       .a("has_white_wool", a(bct.aY))
/*  932 */       .a(☃);
/*      */     
/*  934 */     gg.a(bct.aa, 3)
/*  935 */       .a(Character.valueOf('#'), bct.O)
/*  936 */       .a("##")
/*  937 */       .a("##")
/*  938 */       .b("bark")
/*  939 */       .a("has_log", a(bct.O))
/*  940 */       .a(☃);
/*      */     
/*  942 */     gg.a(atf.aI)
/*  943 */       .a(Character.valueOf('#'), bct.s)
/*  944 */       .a("# #")
/*  945 */       .a("###")
/*  946 */       .b("boat")
/*  947 */       .a("in_water", a(bct.A))
/*  948 */       .a(☃);
/*      */     
/*  950 */     gh.a(bct.fa)
/*  951 */       .b(bct.s)
/*  952 */       .a("wooden_button")
/*  953 */       .a("has_planks", a(bct.s))
/*  954 */       .a(☃);
/*      */     
/*  956 */     gg.a(bct.cy, 3)
/*  957 */       .a(Character.valueOf('#'), bct.s)
/*  958 */       .a("##")
/*  959 */       .a("##")
/*  960 */       .a("##")
/*  961 */       .b("wooden_door")
/*  962 */       .a("has_planks", a(bct.s))
/*  963 */       .a(☃);
/*      */     
/*  965 */     gg.a(bct.db, 3)
/*  966 */       .a(Character.valueOf('#'), atf.C)
/*  967 */       .a(Character.valueOf('W'), bct.s)
/*  968 */       .a("W#W")
/*  969 */       .a("W#W")
/*  970 */       .b("wooden_fence")
/*  971 */       .a("has_planks", a(bct.s))
/*  972 */       .a(☃);
/*      */     
/*  974 */     gg.a(bct.dR)
/*  975 */       .a(Character.valueOf('#'), atf.C)
/*  976 */       .a(Character.valueOf('W'), bct.s)
/*  977 */       .a("#W#")
/*  978 */       .a("#W#")
/*  979 */       .b("wooden_fence_gate")
/*  980 */       .a("has_planks", a(bct.s))
/*  981 */       .a(☃);
/*      */     
/*  983 */     gh.a(bct.s, 4)
/*  984 */       .a(wx.o)
/*  985 */       .a("planks")
/*  986 */       .a("has_logs", a(wx.o))
/*  987 */       .a(☃);
/*      */     
/*  989 */     gg.a(bct.cL)
/*  990 */       .a(Character.valueOf('#'), bct.s)
/*  991 */       .a("##")
/*  992 */       .b("wooden_pressure_plate")
/*  993 */       .a("has_planks", a(bct.s))
/*  994 */       .a(☃);
/*      */     
/*  996 */     gg.a(bct.bI, 6)
/*  997 */       .a(Character.valueOf('#'), bct.s)
/*  998 */       .a("###")
/*  999 */       .b("wooden_slab")
/* 1000 */       .a("has_planks", a(bct.s))
/* 1001 */       .a(☃);
/*      */     
/* 1003 */     gg.a(bct.gs, 4)
/* 1004 */       .a(Character.valueOf('#'), bct.s)
/* 1005 */       .a("#  ")
/* 1006 */       .a("## ")
/* 1007 */       .a("###")
/* 1008 */       .b("wooden_stairs")
/* 1009 */       .a("has_planks", a(bct.s))
/* 1010 */       .a(☃);
/*      */     
/* 1012 */     gg.a(bct.dr, 2)
/* 1013 */       .a(Character.valueOf('#'), bct.s)
/* 1014 */       .a("###")
/* 1015 */       .a("###")
/* 1016 */       .b("wooden_trapdoor")
/* 1017 */       .a("has_planks", a(bct.s))
/* 1018 */       .a(☃);
/*      */     
/* 1020 */     gg.a(bct.hi)
/* 1021 */       .a(Character.valueOf('S'), atf.er)
/* 1022 */       .a(Character.valueOf('I'), atf.bw)
/* 1023 */       .a("SSS")
/* 1024 */       .a("SIS")
/* 1025 */       .a("SSS")
/* 1026 */       .a("has_prismarine_shard", a(atf.er))
/* 1027 */       .a(☃);
/*      */     
/* 1029 */     gg.a(bct.hj, 4)
/* 1030 */       .a(Character.valueOf('#'), bct.hg)
/* 1031 */       .a("#  ")
/* 1032 */       .a("## ")
/* 1033 */       .a("###")
/* 1034 */       .a("has_prismarine", a(bct.hg))
/* 1035 */       .a(☃);
/*      */     
/* 1037 */     gg.a(bct.hk, 4)
/* 1038 */       .a(Character.valueOf('#'), bct.hh)
/* 1039 */       .a("#  ")
/* 1040 */       .a("## ")
/* 1041 */       .a("###")
/* 1042 */       .a("has_prismarine_bricks", a(bct.hh))
/* 1043 */       .a(☃);
/*      */     
/* 1045 */     gg.a(bct.hl, 4)
/* 1046 */       .a(Character.valueOf('#'), bct.hi)
/* 1047 */       .a("#  ")
/* 1048 */       .a("## ")
/* 1049 */       .a("###")
/* 1050 */       .a("has_dark_prismarine", a(bct.hi))
/* 1051 */       .a(☃);
/*      */     
/* 1053 */     gg.a(bct.fu)
/* 1054 */       .a(Character.valueOf('Q'), atf.dV)
/* 1055 */       .a(Character.valueOf('G'), bct.ap)
/* 1056 */       .a(Character.valueOf('W'), avh.a(wx.i))
/* 1057 */       .a("GGG")
/* 1058 */       .a("QQQ")
/* 1059 */       .a("WWW")
/* 1060 */       .a("has_quartz", a(atf.dV))
/* 1061 */       .a(☃);
/*      */     
/* 1063 */     gg.a(bct.aO, 6)
/* 1064 */       .a(Character.valueOf('R'), atf.aB)
/* 1065 */       .a(Character.valueOf('#'), bct.cE)
/* 1066 */       .a(Character.valueOf('X'), atf.n)
/* 1067 */       .a("X X")
/* 1068 */       .a("X#X")
/* 1069 */       .a("XRX")
/* 1070 */       .a("has_rail", a(bct.cA))
/* 1071 */       .a(☃);
/*      */     
/* 1073 */     gh.a(atf.m, 9)
/* 1074 */       .b(bct.cn)
/* 1075 */       .a("has_at_least_9_diamond", a(ba.d.b(9), atf.m))
/* 1076 */       .a("has_diamond_block", a(bct.cn))
/* 1077 */       .a(☃);
/*      */     
/* 1079 */     gg.a(atf.B)
/* 1080 */       .a(Character.valueOf('#'), atf.C)
/* 1081 */       .a(Character.valueOf('X'), atf.m)
/* 1082 */       .a("XX")
/* 1083 */       .a("X#")
/* 1084 */       .a(" #")
/* 1085 */       .a("has_diamond", a(atf.m))
/* 1086 */       .a(☃);
/*      */     
/* 1088 */     gg.a(bct.cn)
/* 1089 */       .a(Character.valueOf('#'), atf.m)
/* 1090 */       .a("###")
/* 1091 */       .a("###")
/* 1092 */       .a("###")
/* 1093 */       .a("has_at_least_9_diamond", a(ba.d.b(9), atf.m))
/* 1094 */       .a(☃);
/*      */     
/* 1096 */     gg.a(atf.aj)
/* 1097 */       .a(Character.valueOf('X'), atf.m)
/* 1098 */       .a("X X")
/* 1099 */       .a("X X")
/* 1100 */       .a("has_diamond", a(atf.m))
/* 1101 */       .a(☃);
/*      */     
/* 1103 */     gg.a(atf.ah)
/* 1104 */       .a(Character.valueOf('X'), atf.m)
/* 1105 */       .a("X X")
/* 1106 */       .a("XXX")
/* 1107 */       .a("XXX")
/* 1108 */       .a("has_diamond", a(atf.m))
/* 1109 */       .a(☃);
/*      */     
/* 1111 */     gg.a(atf.ag)
/* 1112 */       .a(Character.valueOf('X'), atf.m)
/* 1113 */       .a("XXX")
/* 1114 */       .a("X X")
/* 1115 */       .a("has_diamond", a(atf.m))
/* 1116 */       .a(☃);
/*      */     
/* 1118 */     gg.a(atf.P)
/* 1119 */       .a(Character.valueOf('#'), atf.C)
/* 1120 */       .a(Character.valueOf('X'), atf.m)
/* 1121 */       .a("XX")
/* 1122 */       .a(" #")
/* 1123 */       .a(" #")
/* 1124 */       .a("has_diamond", a(atf.m))
/* 1125 */       .a(☃);
/*      */     
/* 1127 */     gg.a(atf.ai)
/* 1128 */       .a(Character.valueOf('X'), atf.m)
/* 1129 */       .a("XXX")
/* 1130 */       .a("X X")
/* 1131 */       .a("X X")
/* 1132 */       .a("has_diamond", a(atf.m))
/* 1133 */       .a(☃);
/*      */     
/* 1135 */     gg.a(atf.A)
/* 1136 */       .a(Character.valueOf('#'), atf.C)
/* 1137 */       .a(Character.valueOf('X'), atf.m)
/* 1138 */       .a("XXX")
/* 1139 */       .a(" # ")
/* 1140 */       .a(" # ")
/* 1141 */       .a("has_diamond", a(atf.m))
/* 1142 */       .a(☃);
/*      */     
/* 1144 */     gg.a(atf.z)
/* 1145 */       .a(Character.valueOf('#'), atf.C)
/* 1146 */       .a(Character.valueOf('X'), atf.m)
/* 1147 */       .a("X")
/* 1148 */       .a("#")
/* 1149 */       .a("#")
/* 1150 */       .a("has_diamond", a(atf.m))
/* 1151 */       .a(☃);
/*      */     
/* 1153 */     gg.a(atf.y)
/* 1154 */       .a(Character.valueOf('#'), atf.C)
/* 1155 */       .a(Character.valueOf('X'), atf.m)
/* 1156 */       .a("X")
/* 1157 */       .a("X")
/* 1158 */       .a("#")
/* 1159 */       .a("has_diamond", a(atf.m))
/* 1160 */       .a(☃);
/*      */     
/* 1162 */     gg.a(bct.e, 2)
/* 1163 */       .a(Character.valueOf('Q'), atf.dV)
/* 1164 */       .a(Character.valueOf('C'), bct.m)
/* 1165 */       .a("CQ")
/* 1166 */       .a("QC")
/* 1167 */       .a("has_quartz", a(atf.dV))
/* 1168 */       .a(☃);
/*      */     
/* 1170 */     gg.a(bct.as)
/* 1171 */       .a(Character.valueOf('R'), atf.aB)
/* 1172 */       .a(Character.valueOf('#'), bct.m)
/* 1173 */       .a(Character.valueOf('X'), atf.g)
/* 1174 */       .a("###")
/* 1175 */       .a("#X#")
/* 1176 */       .a("#R#")
/* 1177 */       .a("has_bow", a(atf.g))
/* 1178 */       .a(☃);
/*      */     
/* 1180 */     gg.a(bct.fD)
/* 1181 */       .a(Character.valueOf('R'), atf.aB)
/* 1182 */       .a(Character.valueOf('#'), bct.m)
/* 1183 */       .a("###")
/* 1184 */       .a("# #")
/* 1185 */       .a("#R#")
/* 1186 */       .a("has_redstone", a(atf.aB))
/* 1187 */       .a(☃);
/*      */     
/* 1189 */     gh.a(atf.dA, 9)
/* 1190 */       .b(bct.ep)
/* 1191 */       .a("has_at_least_9_emerald", a(ba.d.b(9), atf.dA))
/* 1192 */       .a("has_emerald_block", a(bct.ep))
/* 1193 */       .a(☃);
/*      */     
/* 1195 */     gg.a(bct.ep)
/* 1196 */       .a(Character.valueOf('#'), atf.dA)
/* 1197 */       .a("###")
/* 1198 */       .a("###")
/* 1199 */       .a("###")
/* 1200 */       .a("has_at_least_9_emerald", a(ba.d.b(9), atf.dA))
/* 1201 */       .a(☃);
/*      */     
/* 1203 */     gg.a(bct.eb)
/* 1204 */       .a(Character.valueOf('B'), atf.aS)
/* 1205 */       .a(Character.valueOf('#'), bct.ce)
/* 1206 */       .a(Character.valueOf('D'), atf.m)
/* 1207 */       .a(" B ")
/* 1208 */       .a("D#D")
/* 1209 */       .a("###")
/* 1210 */       .a("has_obsidian", a(bct.ce))
/* 1211 */       .a(☃);
/*      */     
/* 1213 */     gg.a(bct.em)
/* 1214 */       .a(Character.valueOf('#'), bct.ce)
/* 1215 */       .a(Character.valueOf('E'), atf.cw)
/* 1216 */       .a("###")
/* 1217 */       .a("#E#")
/* 1218 */       .a("###")
/* 1219 */       .a("has_ender_eye", a(atf.cw))
/* 1220 */       .a(☃);
/*      */     
/* 1222 */     gh.a(atf.cw)
/* 1223 */       .b(atf.ci)
/* 1224 */       .b(atf.cu)
/* 1225 */       .a("has_blaze_powder", a(atf.cu))
/* 1226 */       .a(☃);
/*      */     
/* 1228 */     gg.a(bct.id, 4)
/* 1229 */       .a(Character.valueOf('#'), bct.eg)
/* 1230 */       .a("##")
/* 1231 */       .a("##")
/* 1232 */       .a("has_end_stone", a(bct.eg))
/* 1233 */       .a(☃);
/*      */     
/* 1235 */     gg.a(atf.eJ)
/* 1236 */       .a(Character.valueOf('T'), atf.ck)
/* 1237 */       .a(Character.valueOf('E'), atf.cw)
/* 1238 */       .a(Character.valueOf('G'), bct.ap)
/* 1239 */       .a("GGG")
/* 1240 */       .a("GEG")
/* 1241 */       .a("GTG")
/* 1242 */       .a("has_ender_eye", a(atf.cw))
/* 1243 */       .a(☃);
/*      */     
/* 1245 */     gg.a(bct.hX, 4)
/* 1246 */       .a(Character.valueOf('#'), atf.eN)
/* 1247 */       .a(Character.valueOf('/'), atf.cj)
/* 1248 */       .a("/")
/* 1249 */       .a("#")
/* 1250 */       .a("has_chorus_fruit_popped", a(atf.eN))
/* 1251 */       .a(☃);
/*      */     
/* 1253 */     gg.a(bct.cX, 3)
/* 1254 */       .a(Character.valueOf('#'), atf.C)
/* 1255 */       .a(Character.valueOf('W'), bct.n)
/* 1256 */       .a("W#W")
/* 1257 */       .a("W#W")
/* 1258 */       .b("wooden_fence")
/* 1259 */       .a("has_planks", a(bct.n))
/* 1260 */       .a(☃);
/*      */     
/* 1262 */     gg.a(bct.dN)
/* 1263 */       .a(Character.valueOf('#'), atf.C)
/* 1264 */       .a(Character.valueOf('W'), bct.n)
/* 1265 */       .a("#W#")
/* 1266 */       .a("#W#")
/* 1267 */       .b("wooden_fence_gate")
/* 1268 */       .a("has_planks", a(bct.n))
/* 1269 */       .a(☃);
/*      */     
/* 1271 */     gh.a(atf.ct)
/* 1272 */       .b(atf.cs)
/* 1273 */       .b(bct.bz)
/* 1274 */       .b(atf.by)
/* 1275 */       .a("has_spider_eye", a(atf.cs))
/* 1276 */       .a(☃);
/*      */     
/* 1278 */     gh.a(atf.dx, 3)
/* 1279 */       .b(atf.L)
/* 1280 */       .b(atf.cu)
/* 1281 */       .a(avh.a(new axx[] { atf.k, atf.l
/* 1282 */           })).a("has_blaze_powder", a(atf.cu))
/* 1283 */       .a(☃);
/*      */     
/* 1285 */     gg.a(atf.aY)
/* 1286 */       .a(Character.valueOf('#'), atf.C)
/* 1287 */       .a(Character.valueOf('X'), atf.J)
/* 1288 */       .a("  #")
/* 1289 */       .a(" #X")
/* 1290 */       .a("# X")
/* 1291 */       .a("has_string", a(atf.J))
/* 1292 */       .a(☃);
/*      */     
/* 1294 */     gh.a(atf.e)
/* 1295 */       .b(atf.n)
/* 1296 */       .b(atf.ap)
/* 1297 */       .a("has_flint", a(atf.ap))
/* 1298 */       .a("has_obsidian", a(bct.ce))
/* 1299 */       .a(☃);
/*      */     
/* 1301 */     gg.a(bct.ex)
/* 1302 */       .a(Character.valueOf('#'), atf.aP)
/* 1303 */       .a("# #")
/* 1304 */       .a(" # ")
/* 1305 */       .a("has_brick", a(atf.aP))
/* 1306 */       .a(☃);
/*      */     
/* 1308 */     gg.a(bct.cr)
/* 1309 */       .a(Character.valueOf('#'), bct.m)
/* 1310 */       .a("###")
/* 1311 */       .a("# #")
/* 1312 */       .a("###")
/* 1313 */       .a("has_cobblestone", a(bct.m))
/* 1314 */       .a(☃);
/*      */     
/* 1316 */     gg.a(atf.aV)
/* 1317 */       .a(Character.valueOf('A'), bct.cr)
/* 1318 */       .a(Character.valueOf('B'), atf.az)
/* 1319 */       .a("A")
/* 1320 */       .a("B")
/* 1321 */       .a("has_minecart", a(atf.az))
/* 1322 */       .a(☃);
/*      */     
/* 1324 */     gg.a(atf.cq, 3)
/* 1325 */       .a(Character.valueOf('#'), bct.ap)
/* 1326 */       .a("# #")
/* 1327 */       .a(" # ")
/* 1328 */       .a("has_glass", a(bct.ap))
/* 1329 */       .a(☃);
/*      */     
/* 1331 */     gg.a(bct.dG, 16)
/* 1332 */       .a(Character.valueOf('#'), bct.ap)
/* 1333 */       .a("###")
/* 1334 */       .a("###")
/* 1335 */       .a("has_glass", a(bct.ap))
/* 1336 */       .a(☃);
/*      */     
/* 1338 */     gg.a(bct.dg)
/* 1339 */       .a(Character.valueOf('#'), atf.ba)
/* 1340 */       .a("##")
/* 1341 */       .a("##")
/* 1342 */       .a("has_glowstone_dust", a(atf.ba))
/* 1343 */       .a(☃);
/*      */     
/* 1345 */     gg.a(atf.at)
/* 1346 */       .a(Character.valueOf('#'), atf.o)
/* 1347 */       .a(Character.valueOf('X'), atf.f)
/* 1348 */       .a("###")
/* 1349 */       .a("#X#")
/* 1350 */       .a("###")
/* 1351 */       .a("has_gold_ingot", a(atf.o))
/* 1352 */       .a(☃);
/*      */     
/* 1354 */     gg.a(atf.I)
/* 1355 */       .a(Character.valueOf('#'), atf.C)
/* 1356 */       .a(Character.valueOf('X'), atf.o)
/* 1357 */       .a("XX")
/* 1358 */       .a("X#")
/* 1359 */       .a(" #")
/* 1360 */       .a("has_gold_ingot", a(atf.o))
/* 1361 */       .a(☃);
/*      */     
/* 1363 */     gg.a(atf.an)
/* 1364 */       .a(Character.valueOf('X'), atf.o)
/* 1365 */       .a("X X")
/* 1366 */       .a("X X")
/* 1367 */       .a("has_gold_ingot", a(atf.o))
/* 1368 */       .a(☃);
/*      */     
/* 1370 */     gg.a(atf.dH)
/* 1371 */       .a(Character.valueOf('#'), atf.cl)
/* 1372 */       .a(Character.valueOf('X'), atf.dC)
/* 1373 */       .a("###")
/* 1374 */       .a("#X#")
/* 1375 */       .a("###")
/* 1376 */       .a("has_gold_nugget", a(atf.cl))
/* 1377 */       .a(☃);
/*      */     
/* 1379 */     gg.a(atf.al)
/* 1380 */       .a(Character.valueOf('X'), atf.o)
/* 1381 */       .a("X X")
/* 1382 */       .a("XXX")
/* 1383 */       .a("XXX")
/* 1384 */       .a("has_gold_ingot", a(atf.o))
/* 1385 */       .a(☃);
/*      */     
/* 1387 */     gg.a(atf.ak)
/* 1388 */       .a(Character.valueOf('X'), atf.o)
/* 1389 */       .a("XXX")
/* 1390 */       .a("X X")
/* 1391 */       .a("has_gold_ingot", a(atf.o))
/* 1392 */       .a(☃);
/*      */     
/* 1394 */     gg.a(atf.Q)
/* 1395 */       .a(Character.valueOf('#'), atf.C)
/* 1396 */       .a(Character.valueOf('X'), atf.o)
/* 1397 */       .a("XX")
/* 1398 */       .a(" #")
/* 1399 */       .a(" #")
/* 1400 */       .a("has_gold_ingot", a(atf.o))
/* 1401 */       .a(☃);
/*      */     
/* 1403 */     gg.a(atf.am)
/* 1404 */       .a(Character.valueOf('X'), atf.o)
/* 1405 */       .a("XXX")
/* 1406 */       .a("X X")
/* 1407 */       .a("X X")
/* 1408 */       .a("has_gold_ingot", a(atf.o))
/* 1409 */       .a(☃);
/*      */     
/* 1411 */     gg.a(atf.H)
/* 1412 */       .a(Character.valueOf('#'), atf.C)
/* 1413 */       .a(Character.valueOf('X'), atf.o)
/* 1414 */       .a("XXX")
/* 1415 */       .a(" # ")
/* 1416 */       .a(" # ")
/* 1417 */       .a("has_gold_ingot", a(atf.o))
/* 1418 */       .a(☃);
/*      */     
/* 1420 */     gg.a(bct.aN, 6)
/* 1421 */       .a(Character.valueOf('R'), atf.aB)
/* 1422 */       .a(Character.valueOf('#'), atf.C)
/* 1423 */       .a(Character.valueOf('X'), atf.o)
/* 1424 */       .a("X X")
/* 1425 */       .a("X#X")
/* 1426 */       .a("XRX")
/* 1427 */       .a("has_rail", a(bct.cA))
/* 1428 */       .a(☃);
/*      */     
/* 1430 */     gg.a(atf.G)
/* 1431 */       .a(Character.valueOf('#'), atf.C)
/* 1432 */       .a(Character.valueOf('X'), atf.o)
/* 1433 */       .a("X")
/* 1434 */       .a("#")
/* 1435 */       .a("#")
/* 1436 */       .a("has_gold_ingot", a(atf.o))
/* 1437 */       .a(☃);
/*      */     
/* 1439 */     gg.a(atf.F)
/* 1440 */       .a(Character.valueOf('#'), atf.C)
/* 1441 */       .a(Character.valueOf('X'), atf.o)
/* 1442 */       .a("X")
/* 1443 */       .a("X")
/* 1444 */       .a("#")
/* 1445 */       .a("has_gold_ingot", a(atf.o))
/* 1446 */       .a(☃);
/*      */     
/* 1448 */     gg.a(bct.bB)
/* 1449 */       .a(Character.valueOf('#'), atf.o)
/* 1450 */       .a("###")
/* 1451 */       .a("###")
/* 1452 */       .a("###")
/* 1453 */       .a("has_at_least_9_gold_ingot", a(ba.d.b(9), atf.o))
/* 1454 */       .a(☃);
/*      */     
/* 1456 */     gh.a(atf.o, 9)
/* 1457 */       .b(bct.bB)
/* 1458 */       .a("gold_ingot")
/* 1459 */       .a("has_at_least_9_gold_ingot", a(ba.d.b(9), atf.o))
/* 1460 */       .a("has_gold_block", a(bct.bB))
/* 1461 */       .a(☃, "gold_ingot_from_gold_block");
/*      */     
/* 1463 */     gg.a(atf.o)
/* 1464 */       .a(Character.valueOf('#'), atf.cl)
/* 1465 */       .a("###")
/* 1466 */       .a("###")
/* 1467 */       .a("###")
/* 1468 */       .b("gold_ingot")
/* 1469 */       .a("has_at_least_9_gold_nugget", a(ba.d.b(9), atf.cl))
/* 1470 */       .a(☃, "gold_ingot_from_nuggets");
/*      */     
/* 1472 */     gh.a(atf.cl, 9)
/* 1473 */       .b(atf.o)
/* 1474 */       .a("has_at_least_9_gold_nugget", a(ba.d.b(9), atf.cl))
/* 1475 */       .a("has_gold_ingot", a(atf.o))
/* 1476 */       .a(☃);
/*      */     
/* 1478 */     gh.a(bct.c)
/* 1479 */       .b(bct.e)
/* 1480 */       .b(atf.dV)
/* 1481 */       .a("has_quartz", a(atf.dV))
/* 1482 */       .a(☃);
/*      */     
/* 1484 */     gg.a(atf.eA)
/* 1485 */       .a(Character.valueOf('#'), bct.bf)
/* 1486 */       .a(Character.valueOf('|'), atf.C)
/* 1487 */       .a("###")
/* 1488 */       .a("###")
/* 1489 */       .a(" | ")
/* 1490 */       .b("banner")
/* 1491 */       .a("has_gray_wool", a(bct.bf))
/* 1492 */       .a(☃);
/*      */     
/* 1494 */     gg.a(atf.bG)
/* 1495 */       .a(Character.valueOf('#'), bct.bf)
/* 1496 */       .a(Character.valueOf('X'), wx.b)
/* 1497 */       .a("###")
/* 1498 */       .a("XXX")
/* 1499 */       .b("bed")
/* 1500 */       .a("has_gray_wool", a(bct.bf))
/* 1501 */       .a(☃);
/*      */     
/* 1503 */     gh.a(atf.bG)
/* 1504 */       .b(atf.bz)
/* 1505 */       .b(atf.bo)
/* 1506 */       .a("dyed_bed")
/* 1507 */       .a("has_bed", a(atf.bz))
/* 1508 */       .a(☃, "gray_bed_from_white_bed");
/*      */     
/* 1510 */     gg.a(bct.ge, 3)
/* 1511 */       .a(Character.valueOf('#'), bct.bf)
/* 1512 */       .a("##")
/* 1513 */       .b("carpet")
/* 1514 */       .a("has_gray_wool", a(bct.bf))
/* 1515 */       .a(☃);
/*      */     
/* 1517 */     gh.a(bct.ju, 8)
/* 1518 */       .b(atf.bo)
/* 1519 */       .b(bct.D, 4)
/* 1520 */       .b(bct.F, 4)
/* 1521 */       .a("concrete_powder")
/* 1522 */       .a("has_sand", a(bct.D))
/* 1523 */       .a("has_gravel", a(bct.F))
/* 1524 */       .a(☃);
/*      */     
/* 1526 */     gh.a(atf.bo, 2)
/* 1527 */       .b(atf.bw)
/* 1528 */       .b(atf.bh)
/* 1529 */       .a("has_bonemeal", a(atf.bh))
/* 1530 */       .a("has_black_dye", a(atf.bw))
/* 1531 */       .a(☃);
/*      */     
/* 1533 */     gg.a(bct.gH, 8)
/* 1534 */       .a(Character.valueOf('#'), bct.ap)
/* 1535 */       .a(Character.valueOf('X'), atf.bo)
/* 1536 */       .a("###")
/* 1537 */       .a("#X#")
/* 1538 */       .a("###")
/* 1539 */       .b("stained_glass")
/* 1540 */       .a("has_glass", a(bct.ap))
/* 1541 */       .a(☃);
/*      */     
/* 1543 */     gg.a(bct.gX, 16)
/* 1544 */       .a(Character.valueOf('#'), bct.gH)
/* 1545 */       .a("###")
/* 1546 */       .a("###")
/* 1547 */       .b("stained_glass_pane")
/* 1548 */       .a("has_glass", a(bct.ap))
/* 1549 */       .a(☃);
/*      */     
/* 1551 */     gg.a(bct.fL, 8)
/* 1552 */       .a(Character.valueOf('#'), bct.gn)
/* 1553 */       .a(Character.valueOf('X'), atf.bo)
/* 1554 */       .a("###")
/* 1555 */       .a("#X#")
/* 1556 */       .a("###")
/* 1557 */       .b("stained_terracotta")
/* 1558 */       .a("has_terracotta", a(bct.gn))
/* 1559 */       .a(☃);
/*      */     
/* 1561 */     gh.a(bct.bf)
/* 1562 */       .b(atf.bo)
/* 1563 */       .b(bct.aY)
/* 1564 */       .a("wool")
/* 1565 */       .a("has_white_wool", a(bct.aY))
/* 1566 */       .a(☃);
/*      */     
/* 1568 */     gg.a(atf.eG)
/* 1569 */       .a(Character.valueOf('#'), bct.bl)
/* 1570 */       .a(Character.valueOf('|'), atf.C)
/* 1571 */       .a("###")
/* 1572 */       .a("###")
/* 1573 */       .a(" | ")
/* 1574 */       .b("banner")
/* 1575 */       .a("has_green_wool", a(bct.bl))
/* 1576 */       .a(☃);
/*      */     
/* 1578 */     gg.a(atf.bM)
/* 1579 */       .a(Character.valueOf('#'), bct.bl)
/* 1580 */       .a(Character.valueOf('X'), wx.b)
/* 1581 */       .a("###")
/* 1582 */       .a("XXX")
/* 1583 */       .b("bed")
/* 1584 */       .a("has_green_wool", a(bct.bl))
/* 1585 */       .a(☃);
/*      */     
/* 1587 */     gh.a(atf.bM)
/* 1588 */       .b(atf.bz)
/* 1589 */       .b(atf.bu)
/* 1590 */       .a("dyed_bed")
/* 1591 */       .a("has_bed", a(atf.bz))
/* 1592 */       .a(☃, "green_bed_from_white_bed");
/*      */     
/* 1594 */     gg.a(bct.gk, 3)
/* 1595 */       .a(Character.valueOf('#'), bct.bl)
/* 1596 */       .a("##")
/* 1597 */       .b("carpet")
/* 1598 */       .a("has_green_wool", a(bct.bl))
/* 1599 */       .a(☃);
/*      */     
/* 1601 */     gh.a(bct.jA, 8)
/* 1602 */       .b(atf.bu)
/* 1603 */       .b(bct.D, 4)
/* 1604 */       .b(bct.F, 4)
/* 1605 */       .a("concrete_powder")
/* 1606 */       .a("has_sand", a(bct.D))
/* 1607 */       .a("has_gravel", a(bct.F))
/* 1608 */       .a(☃);
/*      */     
/* 1610 */     gg.a(bct.gN, 8)
/* 1611 */       .a(Character.valueOf('#'), bct.ap)
/* 1612 */       .a(Character.valueOf('X'), atf.bu)
/* 1613 */       .a("###")
/* 1614 */       .a("#X#")
/* 1615 */       .a("###")
/* 1616 */       .b("stained_glass")
/* 1617 */       .a("has_glass", a(bct.ap))
/* 1618 */       .a(☃);
/*      */     
/* 1620 */     gg.a(bct.hd, 16)
/* 1621 */       .a(Character.valueOf('#'), bct.gN)
/* 1622 */       .a("###")
/* 1623 */       .a("###")
/* 1624 */       .b("stained_glass_pane")
/* 1625 */       .a("has_glass", a(bct.ap))
/* 1626 */       .a(☃);
/*      */     
/* 1628 */     gg.a(bct.fR, 8)
/* 1629 */       .a(Character.valueOf('#'), bct.gn)
/* 1630 */       .a(Character.valueOf('X'), atf.bu)
/* 1631 */       .a("###")
/* 1632 */       .a("#X#")
/* 1633 */       .a("###")
/* 1634 */       .b("stained_terracotta")
/* 1635 */       .a("has_terracotta", a(bct.gn))
/* 1636 */       .a(☃);
/*      */     
/* 1638 */     gh.a(bct.bl)
/* 1639 */       .b(atf.bu)
/* 1640 */       .b(bct.aY)
/* 1641 */       .a("wool")
/* 1642 */       .a("has_white_wool", a(bct.aY))
/* 1643 */       .a(☃);
/*      */     
/* 1645 */     gg.a(bct.fW)
/* 1646 */       .a(Character.valueOf('#'), atf.S)
/* 1647 */       .a("###")
/* 1648 */       .a("###")
/* 1649 */       .a("###")
/* 1650 */       .a("has_at_least_9_wheat", a(ba.d.b(9), atf.S))
/* 1651 */       .a(☃);
/*      */     
/* 1653 */     gg.a(bct.fs)
/* 1654 */       .a(Character.valueOf('#'), atf.n)
/* 1655 */       .a("##")
/* 1656 */       .a("has_iron_ingot", a(atf.n))
/* 1657 */       .a(☃);
/*      */     
/* 1659 */     gg.a(bct.fx)
/* 1660 */       .a(Character.valueOf('C'), bct.ck)
/* 1661 */       .a(Character.valueOf('I'), atf.n)
/* 1662 */       .a("I I")
/* 1663 */       .a("ICI")
/* 1664 */       .a(" I ")
/* 1665 */       .a("has_iron_ingot", a(atf.n))
/* 1666 */       .a(☃);
/*      */     
/* 1668 */     gg.a(atf.dX)
/* 1669 */       .a(Character.valueOf('A'), bct.fx)
/* 1670 */       .a(Character.valueOf('B'), atf.az)
/* 1671 */       .a("A")
/* 1672 */       .a("B")
/* 1673 */       .a("has_minecart", a(atf.az))
/* 1674 */       .a(☃);
/*      */     
/* 1676 */     gg.a(atf.d)
/* 1677 */       .a(Character.valueOf('#'), atf.C)
/* 1678 */       .a(Character.valueOf('X'), atf.n)
/* 1679 */       .a("XX")
/* 1680 */       .a("X#")
/* 1681 */       .a(" #")
/* 1682 */       .a("has_iron_ingot", a(atf.n))
/* 1683 */       .a(☃);
/*      */     
/* 1685 */     gg.a(bct.dF, 16)
/* 1686 */       .a(Character.valueOf('#'), atf.n)
/* 1687 */       .a("###")
/* 1688 */       .a("###")
/* 1689 */       .a("has_iron_ingot", a(atf.n))
/* 1690 */       .a(☃);
/*      */     
/* 1692 */     gg.a(bct.bC)
/* 1693 */       .a(Character.valueOf('#'), atf.n)
/* 1694 */       .a("###")
/* 1695 */       .a("###")
/* 1696 */       .a("###")
/* 1697 */       .a("has_at_least_9_iron_ingot", a(ba.d.b(9), atf.n))
/* 1698 */       .a(☃);
/*      */     
/* 1700 */     gg.a(atf.af)
/* 1701 */       .a(Character.valueOf('X'), atf.n)
/* 1702 */       .a("X X")
/* 1703 */       .a("X X")
/* 1704 */       .a("has_iron_ingot", a(atf.n))
/* 1705 */       .a(☃);
/*      */     
/* 1707 */     gg.a(atf.ad)
/* 1708 */       .a(Character.valueOf('X'), atf.n)
/* 1709 */       .a("X X")
/* 1710 */       .a("XXX")
/* 1711 */       .a("XXX")
/* 1712 */       .a("has_iron_ingot", a(atf.n))
/* 1713 */       .a(☃);
/*      */     
/* 1715 */     gg.a(bct.cF, 3)
/* 1716 */       .a(Character.valueOf('#'), atf.n)
/* 1717 */       .a("##")
/* 1718 */       .a("##")
/* 1719 */       .a("##")
/* 1720 */       .a("has_iron_ingot", a(atf.n))
/* 1721 */       .a(☃);
/*      */     
/* 1723 */     gg.a(atf.ac)
/* 1724 */       .a(Character.valueOf('X'), atf.n)
/* 1725 */       .a("XXX")
/* 1726 */       .a("X X")
/* 1727 */       .a("has_iron_ingot", a(atf.n))
/* 1728 */       .a(☃);
/*      */     
/* 1730 */     gg.a(atf.O)
/* 1731 */       .a(Character.valueOf('#'), atf.C)
/* 1732 */       .a(Character.valueOf('X'), atf.n)
/* 1733 */       .a("XX")
/* 1734 */       .a(" #")
/* 1735 */       .a(" #")
/* 1736 */       .a("has_iron_ingot", a(atf.n))
/* 1737 */       .a(☃);
/*      */     
/* 1739 */     gh.a(atf.n, 9)
/* 1740 */       .b(bct.bC)
/* 1741 */       .a("iron_ingot")
/* 1742 */       .a("has_at_least_9_iron_ingot", a(ba.d.b(9), atf.n))
/* 1743 */       .a("has_iron_block", a(bct.bC))
/* 1744 */       .a(☃, "iron_ingot_from_iron_block");
/*      */     
/* 1746 */     gg.a(atf.n)
/* 1747 */       .a(Character.valueOf('#'), atf.eT)
/* 1748 */       .a("###")
/* 1749 */       .a("###")
/* 1750 */       .a("###")
/* 1751 */       .b("iron_ingot")
/* 1752 */       .a("has_at_least_9_iron_nugget", a(ba.d.b(9), atf.eT))
/* 1753 */       .a(☃, "iron_ingot_from_nuggets");
/*      */     
/* 1755 */     gg.a(atf.ae)
/* 1756 */       .a(Character.valueOf('X'), atf.n)
/* 1757 */       .a("XXX")
/* 1758 */       .a("X X")
/* 1759 */       .a("X X")
/* 1760 */       .a("has_iron_ingot", a(atf.n))
/* 1761 */       .a(☃);
/*      */     
/* 1763 */     gh.a(atf.eT, 9)
/* 1764 */       .b(atf.n)
/* 1765 */       .a("has_at_least_9_iron_nugget", a(ba.d.b(9), atf.eT))
/* 1766 */       .a("has_iron_ingot", a(atf.n))
/* 1767 */       .a(☃);
/*      */     
/* 1769 */     gg.a(atf.c)
/* 1770 */       .a(Character.valueOf('#'), atf.C)
/* 1771 */       .a(Character.valueOf('X'), atf.n)
/* 1772 */       .a("XXX")
/* 1773 */       .a(" # ")
/* 1774 */       .a(" # ")
/* 1775 */       .a("has_iron_ingot", a(atf.n))
/* 1776 */       .a(☃);
/*      */     
/* 1778 */     gg.a(atf.b)
/* 1779 */       .a(Character.valueOf('#'), atf.C)
/* 1780 */       .a(Character.valueOf('X'), atf.n)
/* 1781 */       .a("X")
/* 1782 */       .a("#")
/* 1783 */       .a("#")
/* 1784 */       .a("has_iron_ingot", a(atf.n))
/* 1785 */       .a(☃);
/*      */     
/* 1787 */     gg.a(atf.p)
/* 1788 */       .a(Character.valueOf('#'), atf.C)
/* 1789 */       .a(Character.valueOf('X'), atf.n)
/* 1790 */       .a("X")
/* 1791 */       .a("X")
/* 1792 */       .a("#")
/* 1793 */       .a("has_iron_ingot", a(atf.n))
/* 1794 */       .a(☃);
/*      */     
/* 1796 */     gg.a(bct.fV)
/* 1797 */       .a(Character.valueOf('#'), atf.n)
/* 1798 */       .a("##")
/* 1799 */       .a("##")
/* 1800 */       .a("has_iron_ingot", a(atf.n))
/* 1801 */       .a(☃);
/*      */     
/* 1803 */     gg.a(atf.dB)
/* 1804 */       .a(Character.valueOf('#'), atf.C)
/* 1805 */       .a(Character.valueOf('X'), atf.aJ)
/* 1806 */       .a("###")
/* 1807 */       .a("#X#")
/* 1808 */       .a("###")
/* 1809 */       .a("has_leather", a(atf.aJ))
/* 1810 */       .a(☃);
/*      */     
/* 1812 */     gg.a(bct.cW)
/* 1813 */       .a(Character.valueOf('#'), wx.b)
/* 1814 */       .a(Character.valueOf('X'), atf.m)
/* 1815 */       .a("###")
/* 1816 */       .a("#X#")
/* 1817 */       .a("###")
/* 1818 */       .a("has_diamond", a(atf.m))
/* 1819 */       .a(☃);
/*      */     
/* 1821 */     gg.a(bct.Y, 3)
/* 1822 */       .a(Character.valueOf('#'), bct.M)
/* 1823 */       .a("##")
/* 1824 */       .a("##")
/* 1825 */       .b("bark")
/* 1826 */       .a("has_log", a(bct.M))
/* 1827 */       .a(☃);
/*      */     
/* 1829 */     gg.a(atf.aG)
/* 1830 */       .a(Character.valueOf('#'), bct.q)
/* 1831 */       .a("# #")
/* 1832 */       .a("###")
/* 1833 */       .b("boat")
/* 1834 */       .a("in_water", a(bct.A))
/* 1835 */       .a(☃);
/*      */     
/* 1837 */     gh.a(bct.eY)
/* 1838 */       .b(bct.q)
/* 1839 */       .a("wooden_button")
/* 1840 */       .a("has_planks", a(bct.q))
/* 1841 */       .a(☃);
/*      */     
/* 1843 */     gg.a(bct.cw, 3)
/* 1844 */       .a(Character.valueOf('#'), bct.q)
/* 1845 */       .a("##")
/* 1846 */       .a("##")
/* 1847 */       .a("##")
/* 1848 */       .b("wooden_door")
/* 1849 */       .a("has_planks", a(bct.q))
/* 1850 */       .a(☃);
/*      */     
/* 1852 */     gg.a(bct.da, 3)
/* 1853 */       .a(Character.valueOf('#'), atf.C)
/* 1854 */       .a(Character.valueOf('W'), bct.q)
/* 1855 */       .a("W#W")
/* 1856 */       .a("W#W")
/* 1857 */       .b("wooden_fence")
/* 1858 */       .a("has_planks", a(bct.q))
/* 1859 */       .a(☃);
/*      */     
/* 1861 */     gg.a(bct.dQ)
/* 1862 */       .a(Character.valueOf('#'), atf.C)
/* 1863 */       .a(Character.valueOf('W'), bct.q)
/* 1864 */       .a("#W#")
/* 1865 */       .a("#W#")
/* 1866 */       .b("wooden_fence_gate")
/* 1867 */       .a("has_planks", a(bct.q))
/* 1868 */       .a(☃);
/*      */     
/* 1870 */     gh.a(bct.q, 4)
/* 1871 */       .a(wx.s)
/* 1872 */       .a("planks")
/* 1873 */       .a("has_log", a(wx.s))
/* 1874 */       .a(☃);
/*      */     
/* 1876 */     gg.a(bct.cJ)
/* 1877 */       .a(Character.valueOf('#'), bct.q)
/* 1878 */       .a("##")
/* 1879 */       .b("wooden_pressure_plate")
/* 1880 */       .a("has_planks", a(bct.q))
/* 1881 */       .a(☃);
/*      */     
/* 1883 */     gg.a(bct.bG, 6)
/* 1884 */       .a(Character.valueOf('#'), bct.q)
/* 1885 */       .a("###")
/* 1886 */       .b("wooden_slab")
/* 1887 */       .a("has_planks", a(bct.q))
/* 1888 */       .a(☃);
/*      */     
/* 1890 */     gg.a(bct.es, 4)
/* 1891 */       .a(Character.valueOf('#'), bct.q)
/* 1892 */       .a("#  ")
/* 1893 */       .a("## ")
/* 1894 */       .a("###")
/* 1895 */       .b("wooden_stairs")
/* 1896 */       .a("has_planks", a(bct.q))
/* 1897 */       .a(☃);
/*      */     
/* 1899 */     gg.a(bct.dp, 2)
/* 1900 */       .a(Character.valueOf('#'), bct.q)
/* 1901 */       .a("###")
/* 1902 */       .a("###")
/* 1903 */       .b("wooden_trapdoor")
/* 1904 */       .a("has_planks", a(bct.q))
/* 1905 */       .a(☃);
/*      */     
/* 1907 */     gg.a(bct.cz, 3)
/* 1908 */       .a(Character.valueOf('#'), atf.C)
/* 1909 */       .a("# #")
/* 1910 */       .a("###")
/* 1911 */       .a("# #")
/* 1912 */       .a("has_stick", a(atf.C))
/* 1913 */       .a(☃);
/*      */     
/* 1915 */     gg.a(bct.ar)
/* 1916 */       .a(Character.valueOf('#'), atf.bs)
/* 1917 */       .a("###")
/* 1918 */       .a("###")
/* 1919 */       .a("###")
/* 1920 */       .a("has_at_least_9_lapis", a(ba.d.b(9), atf.bs))
/* 1921 */       .a(☃);
/*      */     
/* 1923 */     gh.a(atf.bs, 9)
/* 1924 */       .b(bct.ar)
/* 1925 */       .a("has_at_least_9_lapis", a(ba.d.b(9), atf.bs))
/* 1926 */       .a("has_lapis_block", a(bct.ar))
/* 1927 */       .a(☃);
/*      */     
/* 1929 */     gg.a(atf.ec, 2)
/* 1930 */       .a(Character.valueOf('~'), atf.J)
/* 1931 */       .a(Character.valueOf('O'), atf.aT)
/* 1932 */       .a("~~ ")
/* 1933 */       .a("~O ")
/* 1934 */       .a("  ~")
/* 1935 */       .a("has_slime_ball", a(atf.aT))
/* 1936 */       .a(☃);
/*      */     
/* 1938 */     gg.a(atf.aJ)
/* 1939 */       .a(Character.valueOf('#'), atf.cg)
/* 1940 */       .a("##")
/* 1941 */       .a("##")
/* 1942 */       .a("has_rabbit_hide", a(atf.cg))
/* 1943 */       .a(☃);
/*      */     
/* 1945 */     gg.a(atf.X)
/* 1946 */       .a(Character.valueOf('X'), atf.aJ)
/* 1947 */       .a("X X")
/* 1948 */       .a("X X")
/* 1949 */       .a("has_leather", a(atf.aJ))
/* 1950 */       .a(☃);
/*      */     
/* 1952 */     gg.a(atf.V)
/* 1953 */       .a(Character.valueOf('X'), atf.aJ)
/* 1954 */       .a("X X")
/* 1955 */       .a("XXX")
/* 1956 */       .a("XXX")
/* 1957 */       .a("has_leather", a(atf.aJ))
/* 1958 */       .a(☃);
/*      */     
/* 1960 */     gg.a(atf.U)
/* 1961 */       .a(Character.valueOf('X'), atf.aJ)
/* 1962 */       .a("XXX")
/* 1963 */       .a("X X")
/* 1964 */       .a("has_leather", a(atf.aJ))
/* 1965 */       .a(☃);
/*      */     
/* 1967 */     gg.a(atf.W)
/* 1968 */       .a(Character.valueOf('X'), atf.aJ)
/* 1969 */       .a("XXX")
/* 1970 */       .a("X X")
/* 1971 */       .a("X X")
/* 1972 */       .a("has_leather", a(atf.aJ))
/* 1973 */       .a(☃);
/*      */     
/* 1975 */     gg.a(bct.cD)
/* 1976 */       .a(Character.valueOf('#'), bct.m)
/* 1977 */       .a(Character.valueOf('X'), atf.C)
/* 1978 */       .a("X")
/* 1979 */       .a("#")
/* 1980 */       .a("has_cobblestone", a(bct.m))
/* 1981 */       .a(☃);
/*      */     
/* 1983 */     gg.a(atf.ew)
/* 1984 */       .a(Character.valueOf('#'), bct.bb)
/* 1985 */       .a(Character.valueOf('|'), atf.C)
/* 1986 */       .a("###")
/* 1987 */       .a("###")
/* 1988 */       .a(" | ")
/* 1989 */       .b("banner")
/* 1990 */       .a("has_light_blue_wool", a(bct.bb))
/* 1991 */       .a(☃);
/*      */     
/* 1993 */     gg.a(atf.bC)
/* 1994 */       .a(Character.valueOf('#'), bct.bb)
/* 1995 */       .a(Character.valueOf('X'), wx.b)
/* 1996 */       .a("###")
/* 1997 */       .a("XXX")
/* 1998 */       .b("bed")
/* 1999 */       .a("has_light_blue_wool", a(bct.bb))
/* 2000 */       .a(☃);
/*      */     
/* 2002 */     gh.a(atf.bC)
/* 2003 */       .b(atf.bz)
/* 2004 */       .b(atf.bk)
/* 2005 */       .a("dyed_bed")
/* 2006 */       .a("has_bed", a(atf.bz))
/* 2007 */       .a(☃, "light_blue_bed_from_white_bed");
/*      */     
/* 2009 */     gg.a(bct.ga, 3)
/* 2010 */       .a(Character.valueOf('#'), bct.bb)
/* 2011 */       .a("##")
/* 2012 */       .b("carpet")
/* 2013 */       .a("has_light_blue_wool", a(bct.bb))
/* 2014 */       .a(☃);
/*      */     
/* 2016 */     gh.a(bct.jq, 8)
/* 2017 */       .b(atf.bk)
/* 2018 */       .b(bct.D, 4)
/* 2019 */       .b(bct.F, 4)
/* 2020 */       .a("concrete_powder")
/* 2021 */       .a("has_sand", a(bct.D))
/* 2022 */       .a("has_gravel", a(bct.F))
/* 2023 */       .a(☃);
/*      */     
/* 2025 */     gh.a(atf.bk)
/* 2026 */       .b(bct.br)
/* 2027 */       .a("light_blue_dye")
/* 2028 */       .a("has_red_flower", a(bct.br))
/* 2029 */       .a(☃, "light_blue_dye_from_blue_orchid");
/*      */     
/* 2031 */     gh.a(atf.bk, 2)
/* 2032 */       .b(atf.bs)
/* 2033 */       .b(atf.bh)
/* 2034 */       .a("light_blue_dye")
/* 2035 */       .a("has_lapis", a(atf.bs))
/* 2036 */       .a("has_bonemeal", a(atf.bh))
/* 2037 */       .a(☃, "light_blue_dye_from_lapis_bonemeal");
/*      */     
/* 2039 */     gg.a(bct.gD, 8)
/* 2040 */       .a(Character.valueOf('#'), bct.ap)
/* 2041 */       .a(Character.valueOf('X'), atf.bk)
/* 2042 */       .a("###")
/* 2043 */       .a("#X#")
/* 2044 */       .a("###")
/* 2045 */       .b("stained_glass")
/* 2046 */       .a("has_glass", a(bct.ap))
/* 2047 */       .a(☃);
/*      */     
/* 2049 */     gg.a(bct.gT, 16)
/* 2050 */       .a(Character.valueOf('#'), bct.gD)
/* 2051 */       .a("###")
/* 2052 */       .a("###")
/* 2053 */       .b("stained_glass_pane")
/* 2054 */       .a("has_glass", a(bct.ap))
/* 2055 */       .a(☃);
/*      */     
/* 2057 */     gg.a(bct.fH, 8)
/* 2058 */       .a(Character.valueOf('#'), bct.gn)
/* 2059 */       .a(Character.valueOf('X'), atf.bk)
/* 2060 */       .a("###")
/* 2061 */       .a("#X#")
/* 2062 */       .a("###")
/* 2063 */       .b("stained_terracotta")
/* 2064 */       .a("has_terracotta", a(bct.gn))
/* 2065 */       .a(☃);
/*      */     
/* 2067 */     gh.a(bct.bb)
/* 2068 */       .b(atf.bk)
/* 2069 */       .b(bct.aY)
/* 2070 */       .a("wool")
/* 2071 */       .a("has_white_wool", a(bct.aY))
/* 2072 */       .a(☃);
/*      */     
/* 2074 */     gg.a(atf.eB)
/* 2075 */       .a(Character.valueOf('#'), bct.bg)
/* 2076 */       .a(Character.valueOf('|'), atf.C)
/* 2077 */       .a("###")
/* 2078 */       .a("###")
/* 2079 */       .a(" | ")
/* 2080 */       .b("banner")
/* 2081 */       .a("has_light_gray_wool", a(bct.bg))
/* 2082 */       .a(☃);
/*      */     
/* 2084 */     gg.a(atf.bH)
/* 2085 */       .a(Character.valueOf('#'), bct.bg)
/* 2086 */       .a(Character.valueOf('X'), wx.b)
/* 2087 */       .a("###")
/* 2088 */       .a("XXX")
/* 2089 */       .b("bed")
/* 2090 */       .a("has_light_gray_wool", a(bct.bg))
/* 2091 */       .a(☃);
/*      */     
/* 2093 */     gh.a(atf.bH)
/* 2094 */       .b(atf.bz)
/* 2095 */       .b(atf.bp)
/* 2096 */       .a("dyed_bed")
/* 2097 */       .a("has_bed", a(atf.bz))
/* 2098 */       .a(☃, "light_gray_bed_from_white_bed");
/*      */     
/* 2100 */     gg.a(bct.gf, 3)
/* 2101 */       .a(Character.valueOf('#'), bct.bg)
/* 2102 */       .a("##")
/* 2103 */       .b("carpet")
/* 2104 */       .a("has_light_gray_wool", a(bct.bg))
/* 2105 */       .a(☃);
/*      */     
/* 2107 */     gh.a(bct.jv, 8)
/* 2108 */       .b(atf.bp)
/* 2109 */       .b(bct.D, 4)
/* 2110 */       .b(bct.F, 4)
/* 2111 */       .a("concrete_powder")
/* 2112 */       .a("has_sand", a(bct.D))
/* 2113 */       .a("has_gravel", a(bct.F))
/* 2114 */       .a(☃);
/*      */     
/* 2116 */     gh.a(atf.bp)
/* 2117 */       .b(bct.bt)
/* 2118 */       .a("light_gray_dye")
/* 2119 */       .a("has_red_flower", a(bct.bt))
/* 2120 */       .a(☃, "light_gray_dye_from_azure_bluet");
/*      */     
/* 2122 */     gh.a(atf.bp, 2)
/* 2123 */       .b(atf.bo)
/* 2124 */       .b(atf.bh)
/* 2125 */       .a("light_gray_dye")
/* 2126 */       .a("has_gray_dye", a(atf.bo))
/* 2127 */       .a("has_bonemeal", a(atf.bh))
/* 2128 */       .a(☃, "light_gray_dye_from_gray_bonemeal");
/*      */     
/* 2130 */     gh.a(atf.bp, 3)
/* 2131 */       .b(atf.bw)
/* 2132 */       .b(atf.bh, 2)
/* 2133 */       .a("light_gray_dye")
/* 2134 */       .a("has_bonemeal", a(atf.bh))
/* 2135 */       .a("has_black_dye", a(atf.bw))
/* 2136 */       .a(☃, "light_gray_dye_from_ink_bonemeal");
/*      */     
/* 2138 */     gh.a(atf.bp)
/* 2139 */       .b(bct.by)
/* 2140 */       .a("light_gray_dye")
/* 2141 */       .a("has_red_flower", a(bct.by))
/* 2142 */       .a(☃, "light_gray_dye_from_oxeye_daisy");
/*      */     
/* 2144 */     gh.a(atf.bp)
/* 2145 */       .b(bct.bw)
/* 2146 */       .a("light_gray_dye")
/* 2147 */       .a("has_red_flower", a(bct.bw))
/* 2148 */       .a(☃, "light_gray_dye_from_white_tulip");
/*      */     
/* 2150 */     gg.a(bct.gI, 8)
/* 2151 */       .a(Character.valueOf('#'), bct.ap)
/* 2152 */       .a(Character.valueOf('X'), atf.bp)
/* 2153 */       .a("###")
/* 2154 */       .a("#X#")
/* 2155 */       .a("###")
/* 2156 */       .b("stained_glass")
/* 2157 */       .a("has_glass", a(bct.ap))
/* 2158 */       .a(☃);
/*      */     
/* 2160 */     gg.a(bct.gY, 16)
/* 2161 */       .a(Character.valueOf('#'), bct.gI)
/* 2162 */       .a("###")
/* 2163 */       .a("###")
/* 2164 */       .b("stained_glass_pane")
/* 2165 */       .a("has_glass", a(bct.ap))
/* 2166 */       .a(☃);
/*      */     
/* 2168 */     gg.a(bct.fM, 8)
/* 2169 */       .a(Character.valueOf('#'), bct.gn)
/* 2170 */       .a(Character.valueOf('X'), atf.bp)
/* 2171 */       .a("###")
/* 2172 */       .a("#X#")
/* 2173 */       .a("###")
/* 2174 */       .b("stained_terracotta")
/* 2175 */       .a("has_terracotta", a(bct.gn))
/* 2176 */       .a(☃);
/*      */     
/* 2178 */     gh.a(bct.bg)
/* 2179 */       .b(atf.bp)
/* 2180 */       .b(bct.aY)
/* 2181 */       .a("wool")
/* 2182 */       .a("has_white_wool", a(bct.aY))
/* 2183 */       .a(☃);
/*      */     
/* 2185 */     gg.a(bct.fr)
/* 2186 */       .a(Character.valueOf('#'), atf.o)
/* 2187 */       .a("##")
/* 2188 */       .a("has_gold_ingot", a(atf.o))
/* 2189 */       .a(☃);
/*      */     
/* 2191 */     gg.a(atf.ey)
/* 2192 */       .a(Character.valueOf('#'), bct.bd)
/* 2193 */       .a(Character.valueOf('|'), atf.C)
/* 2194 */       .a("###")
/* 2195 */       .a("###")
/* 2196 */       .a(" | ")
/* 2197 */       .b("banner")
/* 2198 */       .a("has_lime_wool", a(bct.bd))
/* 2199 */       .a(☃);
/*      */     
/* 2201 */     gg.a(atf.bE)
/* 2202 */       .a(Character.valueOf('#'), bct.bd)
/* 2203 */       .a(Character.valueOf('X'), wx.b)
/* 2204 */       .a("###")
/* 2205 */       .a("XXX")
/* 2206 */       .b("bed")
/* 2207 */       .a("has_lime_wool", a(bct.bd))
/* 2208 */       .a(☃);
/*      */     
/* 2210 */     gh.a(atf.bE)
/* 2211 */       .b(atf.bz)
/* 2212 */       .b(atf.bm)
/* 2213 */       .a("dyed_bed")
/* 2214 */       .a("has_bed", a(atf.bz))
/* 2215 */       .a(☃, "lime_bed_from_white_bed");
/*      */     
/* 2217 */     gg.a(bct.gc, 3)
/* 2218 */       .a(Character.valueOf('#'), bct.bd)
/* 2219 */       .a("##")
/* 2220 */       .b("carpet")
/* 2221 */       .a("has_lime_wool", a(bct.bd))
/* 2222 */       .a(☃);
/*      */     
/* 2224 */     gh.a(bct.js, 8)
/* 2225 */       .b(atf.bm)
/* 2226 */       .b(bct.D, 4)
/* 2227 */       .b(bct.F, 4)
/* 2228 */       .a("concrete_powder")
/* 2229 */       .a("has_sand", a(bct.D))
/* 2230 */       .a("has_gravel", a(bct.F))
/* 2231 */       .a(☃);
/*      */     
/* 2233 */     gh.a(atf.bm, 2)
/* 2234 */       .b(atf.bu)
/* 2235 */       .b(atf.bh)
/* 2236 */       .a("has_green_dye", a(atf.bu))
/* 2237 */       .a("has_bonemeal", a(atf.bh))
/* 2238 */       .a(☃);
/*      */     
/* 2240 */     gg.a(bct.gF, 8)
/* 2241 */       .a(Character.valueOf('#'), bct.ap)
/* 2242 */       .a(Character.valueOf('X'), atf.bm)
/* 2243 */       .a("###")
/* 2244 */       .a("#X#")
/* 2245 */       .a("###")
/* 2246 */       .b("stained_glass")
/* 2247 */       .a("has_glass", a(bct.ap))
/* 2248 */       .a(☃);
/*      */     
/* 2250 */     gg.a(bct.gV, 16)
/* 2251 */       .a(Character.valueOf('#'), bct.gF)
/* 2252 */       .a("###")
/* 2253 */       .a("###")
/* 2254 */       .b("stained_glass_pane")
/* 2255 */       .a("has_glass", a(bct.ap))
/* 2256 */       .a(☃);
/*      */     
/* 2258 */     gg.a(bct.fJ, 8)
/* 2259 */       .a(Character.valueOf('#'), bct.gn)
/* 2260 */       .a(Character.valueOf('X'), atf.bm)
/* 2261 */       .a("###")
/* 2262 */       .a("#X#")
/* 2263 */       .a("###")
/* 2264 */       .b("stained_terracotta")
/* 2265 */       .a("has_terracotta", a(bct.gn))
/* 2266 */       .a(☃);
/*      */     
/* 2268 */     gh.a(bct.bd)
/* 2269 */       .b(atf.bm)
/* 2270 */       .b(bct.aY)
/* 2271 */       .a("wool")
/* 2272 */       .a("has_white_wool", a(bct.aY))
/* 2273 */       .a(☃);
/*      */     
/* 2275 */     gg.a(bct.dj)
/* 2276 */       .a(Character.valueOf('A'), bct.di)
/* 2277 */       .a(Character.valueOf('B'), bct.cf)
/* 2278 */       .a("A")
/* 2279 */       .a("B")
/* 2280 */       .a("has_carved_pumpkin", a(bct.di))
/* 2281 */       .a(☃);
/*      */     
/* 2283 */     gg.a(atf.ev)
/* 2284 */       .a(Character.valueOf('#'), bct.ba)
/* 2285 */       .a(Character.valueOf('|'), atf.C)
/* 2286 */       .a("###")
/* 2287 */       .a("###")
/* 2288 */       .a(" | ")
/* 2289 */       .b("banner")
/* 2290 */       .a("has_magenta_wool", a(bct.ba))
/* 2291 */       .a(☃);
/*      */     
/* 2293 */     gg.a(atf.bB)
/* 2294 */       .a(Character.valueOf('#'), bct.ba)
/* 2295 */       .a(Character.valueOf('X'), wx.b)
/* 2296 */       .a("###")
/* 2297 */       .a("XXX")
/* 2298 */       .b("bed")
/* 2299 */       .a("has_magenta_wool", a(bct.ba))
/* 2300 */       .a(☃);
/*      */     
/* 2302 */     gh.a(atf.bB)
/* 2303 */       .b(atf.bz)
/* 2304 */       .b(atf.bj)
/* 2305 */       .a("dyed_bed")
/* 2306 */       .a("has_bed", a(atf.bz))
/* 2307 */       .a(☃, "magenta_bed_from_white_bed");
/*      */     
/* 2309 */     gg.a(bct.fZ, 3)
/* 2310 */       .a(Character.valueOf('#'), bct.ba)
/* 2311 */       .a("##")
/* 2312 */       .b("carpet")
/* 2313 */       .a("has_magenta_wool", a(bct.ba))
/* 2314 */       .a(☃);
/*      */     
/* 2316 */     gh.a(bct.jp, 8)
/* 2317 */       .b(atf.bj)
/* 2318 */       .b(bct.D, 4)
/* 2319 */       .b(bct.F, 4)
/* 2320 */       .a("concrete_powder")
/* 2321 */       .a("has_sand", a(bct.D))
/* 2322 */       .a("has_gravel", a(bct.F))
/* 2323 */       .a(☃);
/*      */     
/* 2325 */     gh.a(atf.bj)
/* 2326 */       .b(bct.bs)
/* 2327 */       .a("magenta_dye")
/* 2328 */       .a("has_red_flower", a(bct.bs))
/* 2329 */       .a(☃, "magenta_dye_from_allium");
/*      */     
/* 2331 */     gh.a(atf.bj, 4)
/* 2332 */       .b(atf.bs)
/* 2333 */       .b(atf.bv, 2)
/* 2334 */       .b(atf.bh)
/* 2335 */       .a("magenta_dye")
/* 2336 */       .a("has_lapis", a(atf.bs))
/* 2337 */       .a("has_rose_red", a(atf.bv))
/* 2338 */       .a("has_bonemeal", a(atf.bh))
/* 2339 */       .a(☃, "magenta_dye_from_lapis_ink_bonemeal");
/*      */     
/* 2341 */     gh.a(atf.bj, 3)
/* 2342 */       .b(atf.bs)
/* 2343 */       .b(atf.bv)
/* 2344 */       .b(atf.bn)
/* 2345 */       .a("magenta_dye")
/* 2346 */       .a("has_pink_dye", a(atf.bn))
/* 2347 */       .a("has_lapis", a(atf.bs))
/* 2348 */       .a("has_red_dye", a(atf.bv))
/* 2349 */       .a(☃, "magenta_dye_from_lapis_red_pink");
/*      */     
/* 2351 */     gh.a(atf.bj, 2)
/* 2352 */       .b(bct.gv)
/* 2353 */       .a("magenta_dye")
/* 2354 */       .a("has_double_plant", a(bct.gv))
/* 2355 */       .a(☃, "magenta_dye_from_lilac");
/*      */     
/* 2357 */     gh.a(atf.bj, 2)
/* 2358 */       .b(atf.br)
/* 2359 */       .b(atf.bn)
/* 2360 */       .a("magenta_dye")
/* 2361 */       .a("has_pink_dye", a(atf.bn))
/* 2362 */       .a("has_purple_dye", a(atf.br))
/* 2363 */       .a(☃, "magenta_dye_from_purple_and_pink");
/*      */     
/* 2365 */     gg.a(bct.gC, 8)
/* 2366 */       .a(Character.valueOf('#'), bct.ap)
/* 2367 */       .a(Character.valueOf('X'), atf.bj)
/* 2368 */       .a("###")
/* 2369 */       .a("#X#")
/* 2370 */       .a("###")
/* 2371 */       .b("stained_glass")
/* 2372 */       .a("has_glass", a(bct.ap))
/* 2373 */       .a(☃);
/*      */     
/* 2375 */     gg.a(bct.gS, 16)
/* 2376 */       .a(Character.valueOf('#'), bct.gC)
/* 2377 */       .a("###")
/* 2378 */       .a("###")
/* 2379 */       .b("stained_glass_pane")
/* 2380 */       .a("has_glass", a(bct.ap))
/* 2381 */       .a(☃);
/*      */     
/* 2383 */     gg.a(bct.fG, 8)
/* 2384 */       .a(Character.valueOf('#'), bct.gn)
/* 2385 */       .a(Character.valueOf('X'), atf.bj)
/* 2386 */       .a("###")
/* 2387 */       .a("#X#")
/* 2388 */       .a("###")
/* 2389 */       .b("stained_terracotta")
/* 2390 */       .a("has_terracotta", a(bct.gn))
/* 2391 */       .a(☃);
/*      */     
/* 2393 */     gh.a(bct.ba)
/* 2394 */       .b(atf.bj)
/* 2395 */       .b(bct.aY)
/* 2396 */       .a("wool")
/* 2397 */       .a("has_white_wool", a(bct.aY))
/* 2398 */       .a(☃);
/*      */     
/* 2400 */     gg.a(bct.ik)
/* 2401 */       .a(Character.valueOf('#'), atf.cv)
/* 2402 */       .a("##")
/* 2403 */       .a("##")
/* 2404 */       .a("has_magma_cream", a(atf.cv))
/* 2405 */       .a(☃);
/*      */     
/* 2407 */     gh.a(atf.cv)
/* 2408 */       .b(atf.cu)
/* 2409 */       .b(atf.aT)
/* 2410 */       .a("has_blaze_powder", a(atf.cu))
/* 2411 */       .a(☃);
/*      */     
/* 2413 */     gg.a(atf.dG)
/* 2414 */       .a(Character.valueOf('#'), atf.aR)
/* 2415 */       .a(Character.valueOf('X'), atf.aX)
/* 2416 */       .a("###")
/* 2417 */       .a("#X#")
/* 2418 */       .a("###")
/* 2419 */       .a("has_compass", a(atf.aX))
/* 2420 */       .a(☃);
/*      */     
/* 2422 */     gg.a(bct.dH)
/* 2423 */       .a(Character.valueOf('M'), atf.bS)
/* 2424 */       .a("MMM")
/* 2425 */       .a("MMM")
/* 2426 */       .a("MMM")
/* 2427 */       .a("has_melon", a(atf.bS))
/* 2428 */       .a(☃);
/*      */     
/* 2430 */     gh.a(atf.bV)
/* 2431 */       .b(atf.bS)
/* 2432 */       .a("has_melon", a(atf.bS))
/* 2433 */       .a(☃);
/*      */     
/* 2435 */     gg.a(atf.az)
/* 2436 */       .a(Character.valueOf('#'), atf.n)
/* 2437 */       .a("# #")
/* 2438 */       .a("###")
/* 2439 */       .a("has_iron_ingot", a(atf.n))
/* 2440 */       .a(☃);
/*      */     
/* 2442 */     gh.a(bct.cd)
/* 2443 */       .b(bct.m)
/* 2444 */       .b(bct.dM)
/* 2445 */       .a("has_vine", a(bct.dM))
/* 2446 */       .a(☃);
/*      */     
/* 2448 */     gg.a(bct.ew, 6)
/* 2449 */       .a(Character.valueOf('#'), bct.cd)
/* 2450 */       .a("###")
/* 2451 */       .a("###")
/* 2452 */       .a("has_mossy_cobblestone", a(bct.cd))
/* 2453 */       .a(☃);
/*      */     
/* 2455 */     gh.a(bct.dz)
/* 2456 */       .b(bct.dy)
/* 2457 */       .b(bct.dM)
/* 2458 */       .a("has_mossy_cobblestone", a(bct.cd))
/* 2459 */       .a(☃);
/*      */     
/* 2461 */     gh.a(atf.E)
/* 2462 */       .b(bct.bz)
/* 2463 */       .b(bct.bA)
/* 2464 */       .b(atf.D)
/* 2465 */       .a("has_mushroom_stew", a(atf.E))
/* 2466 */       .a("has_bowl", a(atf.D))
/* 2467 */       .a("has_brown_mushroom", a(bct.bz))
/* 2468 */       .a("has_red_mushroom", a(bct.bA))
/* 2469 */       .a(☃);
/*      */     
/* 2471 */     gg.a(bct.dX)
/* 2472 */       .a(Character.valueOf('N'), atf.dU)
/* 2473 */       .a("NN")
/* 2474 */       .a("NN")
/* 2475 */       .a("has_netherbrick", a(atf.dU))
/* 2476 */       .a(☃);
/*      */     
/* 2478 */     gg.a(bct.dY, 6)
/* 2479 */       .a(Character.valueOf('#'), bct.dX)
/* 2480 */       .a("###")
/* 2481 */       .a("###")
/* 2482 */       .a("has_nether_brick", a(bct.dX))
/* 2483 */       .a(☃);
/*      */     
/* 2485 */     gg.a(bct.bP, 6)
/* 2486 */       .a(Character.valueOf('#'), bct.dX)
/* 2487 */       .a("###")
/* 2488 */       .a("has_nether_brick", a(bct.dX))
/* 2489 */       .a(☃);
/*      */     
/* 2491 */     gg.a(bct.dZ, 4)
/* 2492 */       .a(Character.valueOf('#'), bct.dX)
/* 2493 */       .a("#  ")
/* 2494 */       .a("## ")
/* 2495 */       .a("###")
/* 2496 */       .a("has_nether_brick", a(bct.dX))
/* 2497 */       .a(☃);
/*      */     
/* 2499 */     gg.a(bct.il)
/* 2500 */       .a(Character.valueOf('#'), atf.cm)
/* 2501 */       .a("###")
/* 2502 */       .a("###")
/* 2503 */       .a("###")
/* 2504 */       .a("has_nether_wart", a(atf.cm))
/* 2505 */       .a(☃);
/*      */     
/* 2507 */     gg.a(bct.aw)
/* 2508 */       .a(Character.valueOf('#'), wx.b)
/* 2509 */       .a(Character.valueOf('X'), atf.aB)
/* 2510 */       .a("###")
/* 2511 */       .a("#X#")
/* 2512 */       .a("###")
/* 2513 */       .a("has_redstone", a(atf.aB))
/* 2514 */       .a(☃);
/*      */     
/* 2516 */     gg.a(bct.V, 3)
/* 2517 */       .a(Character.valueOf('#'), bct.J)
/* 2518 */       .a("##")
/* 2519 */       .a("##")
/* 2520 */       .b("bark")
/* 2521 */       .a("has_log", a(bct.J))
/* 2522 */       .a(☃);
/*      */     
/* 2524 */     gh.a(bct.eV)
/* 2525 */       .b(bct.n)
/* 2526 */       .a("wooden_button")
/* 2527 */       .a("has_planks", a(bct.n))
/* 2528 */       .a(☃);
/*      */     
/* 2530 */     gh.a(bct.n, 4)
/* 2531 */       .a(wx.p)
/* 2532 */       .a("planks")
/* 2533 */       .a("has_log", a(wx.p))
/* 2534 */       .a(☃);
/*      */     
/* 2536 */     gg.a(bct.cG)
/* 2537 */       .a(Character.valueOf('#'), bct.n)
/* 2538 */       .a("##")
/* 2539 */       .b("wooden_pressure_plate")
/* 2540 */       .a("has_planks", a(bct.n))
/* 2541 */       .a(☃);
/*      */     
/* 2543 */     gg.a(bct.bD, 6)
/* 2544 */       .a(Character.valueOf('#'), bct.n)
/* 2545 */       .a("###")
/* 2546 */       .b("wooden_slab")
/* 2547 */       .a("has_planks", a(bct.n))
/* 2548 */       .a(☃);
/*      */     
/* 2550 */     gg.a(bct.cj, 4)
/* 2551 */       .a(Character.valueOf('#'), bct.n)
/* 2552 */       .a("#  ")
/* 2553 */       .a("## ")
/* 2554 */       .a("###")
/* 2555 */       .b("wooden_stairs")
/* 2556 */       .a("has_planks", a(bct.n))
/* 2557 */       .a(☃);
/*      */     
/* 2559 */     gg.a(bct.dm, 2)
/* 2560 */       .a(Character.valueOf('#'), bct.n)
/* 2561 */       .a("###")
/* 2562 */       .a("###")
/* 2563 */       .b("wooden_trapdoor")
/* 2564 */       .a("has_planks", a(bct.n))
/* 2565 */       .a(☃);
/*      */     
/* 2567 */     gg.a(bct.ip)
/* 2568 */       .a(Character.valueOf('Q'), atf.dV)
/* 2569 */       .a(Character.valueOf('R'), atf.aB)
/* 2570 */       .a(Character.valueOf('#'), bct.m)
/* 2571 */       .a("###")
/* 2572 */       .a("RRQ")
/* 2573 */       .a("###")
/* 2574 */       .a("has_quartz", a(atf.dV))
/* 2575 */       .a(☃);
/*      */     
/* 2577 */     gg.a(atf.eu)
/* 2578 */       .a(Character.valueOf('#'), bct.aZ)
/* 2579 */       .a(Character.valueOf('|'), atf.C)
/* 2580 */       .a("###")
/* 2581 */       .a("###")
/* 2582 */       .a(" | ")
/* 2583 */       .b("banner")
/* 2584 */       .a("has_orange_wool", a(bct.aZ))
/* 2585 */       .a(☃);
/*      */     
/* 2587 */     gg.a(atf.bA)
/* 2588 */       .a(Character.valueOf('#'), bct.aZ)
/* 2589 */       .a(Character.valueOf('X'), wx.b)
/* 2590 */       .a("###")
/* 2591 */       .a("XXX")
/* 2592 */       .b("bed")
/* 2593 */       .a("has_orange_wool", a(bct.aZ))
/* 2594 */       .a(☃);
/*      */     
/* 2596 */     gh.a(atf.bA)
/* 2597 */       .b(atf.bz)
/* 2598 */       .b(atf.bi)
/* 2599 */       .a("dyed_bed")
/* 2600 */       .a("has_bed", a(atf.bz))
/* 2601 */       .a(☃, "orange_bed_from_white_bed");
/*      */     
/* 2603 */     gg.a(bct.fY, 3)
/* 2604 */       .a(Character.valueOf('#'), bct.aZ)
/* 2605 */       .a("##")
/* 2606 */       .b("carpet")
/* 2607 */       .a("has_orange_wool", a(bct.aZ))
/* 2608 */       .a(☃);
/*      */     
/* 2610 */     gh.a(bct.jo, 8)
/* 2611 */       .b(atf.bi)
/* 2612 */       .b(bct.D, 4)
/* 2613 */       .b(bct.F, 4)
/* 2614 */       .a("concrete_powder")
/* 2615 */       .a("has_sand", a(bct.D))
/* 2616 */       .a("has_gravel", a(bct.F))
/* 2617 */       .a(☃);
/*      */     
/* 2619 */     gh.a(atf.bi)
/* 2620 */       .b(bct.bv)
/* 2621 */       .a("orange_dye")
/* 2622 */       .a("has_red_flower", a(bct.bv))
/* 2623 */       .a(☃, "orange_dye_from_orange_tulip");
/*      */     
/* 2625 */     gh.a(atf.bi, 2)
/* 2626 */       .b(atf.bv)
/* 2627 */       .b(atf.bl)
/* 2628 */       .a("orange_dye")
/* 2629 */       .a("has_red_dye", a(atf.bv))
/* 2630 */       .a("has_yellow_dye", a(atf.bl))
/* 2631 */       .a(☃, "orange_dye_from_red_yellow");
/*      */     
/* 2633 */     gg.a(bct.gB, 8)
/* 2634 */       .a(Character.valueOf('#'), bct.ap)
/* 2635 */       .a(Character.valueOf('X'), atf.bi)
/* 2636 */       .a("###")
/* 2637 */       .a("#X#")
/* 2638 */       .a("###")
/* 2639 */       .b("stained_glass")
/* 2640 */       .a("has_glass", a(bct.ap))
/* 2641 */       .a(☃);
/*      */     
/* 2643 */     gg.a(bct.gR, 16)
/* 2644 */       .a(Character.valueOf('#'), bct.gB)
/* 2645 */       .a("###")
/* 2646 */       .a("###")
/* 2647 */       .b("stained_glass_pane")
/* 2648 */       .a("has_glass", a(bct.ap))
/* 2649 */       .a(☃);
/*      */     
/* 2651 */     gg.a(bct.fF, 8)
/* 2652 */       .a(Character.valueOf('#'), bct.gn)
/* 2653 */       .a(Character.valueOf('X'), atf.bi)
/* 2654 */       .a("###")
/* 2655 */       .a("#X#")
/* 2656 */       .a("###")
/* 2657 */       .b("stained_terracotta")
/* 2658 */       .a("has_terracotta", a(bct.gn))
/* 2659 */       .a(☃);
/*      */     
/* 2661 */     gh.a(bct.aZ)
/* 2662 */       .b(atf.bi)
/* 2663 */       .b(bct.aY)
/* 2664 */       .a("wool")
/* 2665 */       .a("has_white_wool", a(bct.aY))
/* 2666 */       .a(☃);
/*      */     
/* 2668 */     gg.a(atf.as)
/* 2669 */       .a(Character.valueOf('#'), atf.C)
/* 2670 */       .a(Character.valueOf('X'), avh.a(wx.a))
/* 2671 */       .a("###")
/* 2672 */       .a("#X#")
/* 2673 */       .a("###")
/* 2674 */       .a("has_wool", a(wx.a))
/* 2675 */       .a(☃);
/*      */     
/* 2677 */     gg.a(atf.aR, 3)
/* 2678 */       .a(Character.valueOf('#'), bct.cV)
/* 2679 */       .a("###")
/* 2680 */       .a("has_reeds", a(bct.cV))
/* 2681 */       .a(☃);
/*      */     
/* 2683 */     gg.a(bct.fz, 2)
/* 2684 */       .a(Character.valueOf('#'), bct.fy)
/* 2685 */       .a("#")
/* 2686 */       .a("#")
/* 2687 */       .a("has_chiseled_quartz_block", a(bct.fA))
/* 2688 */       .a("has_quartz_block", a(bct.fy))
/* 2689 */       .a("has_quartz_pillar", a(bct.fz))
/* 2690 */       .a(☃);
/*      */     
/* 2692 */     gh.a(bct.gp)
/* 2693 */       .b(bct.cR, 9)
/* 2694 */       .a("has_at_least_9_ice", a(ba.d.b(9), bct.cR))
/* 2695 */       .a(☃);
/*      */     
/* 2697 */     gg.a(atf.ez)
/* 2698 */       .a(Character.valueOf('#'), bct.be)
/* 2699 */       .a(Character.valueOf('|'), atf.C)
/* 2700 */       .a("###")
/* 2701 */       .a("###")
/* 2702 */       .a(" | ")
/* 2703 */       .b("banner")
/* 2704 */       .a("has_pink_wool", a(bct.be))
/* 2705 */       .a(☃);
/*      */     
/* 2707 */     gg.a(atf.bF)
/* 2708 */       .a(Character.valueOf('#'), bct.be)
/* 2709 */       .a(Character.valueOf('X'), wx.b)
/* 2710 */       .a("###")
/* 2711 */       .a("XXX")
/* 2712 */       .b("bed")
/* 2713 */       .a("has_pink_wool", a(bct.be))
/* 2714 */       .a(☃);
/*      */     
/* 2716 */     gh.a(atf.bF)
/* 2717 */       .b(atf.bz)
/* 2718 */       .b(atf.bn)
/* 2719 */       .a("dyed_bed")
/* 2720 */       .a("has_bed", a(atf.bz))
/* 2721 */       .a(☃, "pink_bed_from_white_bed");
/*      */     
/* 2723 */     gg.a(bct.gd, 3)
/* 2724 */       .a(Character.valueOf('#'), bct.be)
/* 2725 */       .a("##")
/* 2726 */       .b("carpet")
/* 2727 */       .a("has_pink_wool", a(bct.be))
/* 2728 */       .a(☃);
/*      */     
/* 2730 */     gh.a(bct.jt, 8)
/* 2731 */       .b(atf.bn)
/* 2732 */       .b(bct.D, 4)
/* 2733 */       .b(bct.F, 4)
/* 2734 */       .a("concrete_powder")
/* 2735 */       .a("has_sand", a(bct.D))
/* 2736 */       .a("has_gravel", a(bct.F))
/* 2737 */       .a(☃);
/*      */     
/* 2739 */     gh.a(atf.bn, 2)
/* 2740 */       .b(bct.gx)
/* 2741 */       .a("pink_dye")
/* 2742 */       .a("has_double_plant", a(bct.gx))
/* 2743 */       .a(☃, "pink_dye_from_peony");
/*      */     
/* 2745 */     gh.a(atf.bn)
/* 2746 */       .b(bct.bx)
/* 2747 */       .a("pink_dye")
/* 2748 */       .a("has_red_flower", a(bct.bx))
/* 2749 */       .a(☃, "pink_dye_from_pink_tulip");
/*      */     
/* 2751 */     gh.a(atf.bn, 2)
/* 2752 */       .b(atf.bv)
/* 2753 */       .b(atf.bh)
/* 2754 */       .a("pink_dye")
/* 2755 */       .a("has_bonemeal", a(atf.bh))
/* 2756 */       .a("has_red_dye", a(atf.bv))
/* 2757 */       .a(☃, "pink_dye_from_red_bonemeal");
/*      */     
/* 2759 */     gg.a(bct.gG, 8)
/* 2760 */       .a(Character.valueOf('#'), bct.ap)
/* 2761 */       .a(Character.valueOf('X'), atf.bn)
/* 2762 */       .a("###")
/* 2763 */       .a("#X#")
/* 2764 */       .a("###")
/* 2765 */       .b("stained_glass")
/* 2766 */       .a("has_glass", a(bct.ap))
/* 2767 */       .a(☃);
/*      */     
/* 2769 */     gg.a(bct.gW, 16)
/* 2770 */       .a(Character.valueOf('#'), bct.gG)
/* 2771 */       .a("###")
/* 2772 */       .a("###")
/* 2773 */       .b("stained_glass_pane")
/* 2774 */       .a("has_glass", a(bct.ap))
/* 2775 */       .a(☃);
/*      */     
/* 2777 */     gg.a(bct.fK, 8)
/* 2778 */       .a(Character.valueOf('#'), bct.gn)
/* 2779 */       .a(Character.valueOf('X'), atf.bn)
/* 2780 */       .a("###")
/* 2781 */       .a("#X#")
/* 2782 */       .a("###")
/* 2783 */       .b("stained_terracotta")
/* 2784 */       .a("has_terracotta", a(bct.gn))
/* 2785 */       .a(☃);
/*      */     
/* 2787 */     gh.a(bct.be)
/* 2788 */       .b(atf.bn)
/* 2789 */       .b(bct.aY)
/* 2790 */       .a("wool")
/* 2791 */       .a("has_white_wool", a(bct.aY))
/* 2792 */       .a(☃);
/*      */     
/* 2794 */     gg.a(bct.aW)
/* 2795 */       .a(Character.valueOf('R'), atf.aB)
/* 2796 */       .a(Character.valueOf('#'), bct.m)
/* 2797 */       .a(Character.valueOf('T'), wx.b)
/* 2798 */       .a(Character.valueOf('X'), atf.n)
/* 2799 */       .a("TTT")
/* 2800 */       .a("#X#")
/* 2801 */       .a("#R#")
/* 2802 */       .a("has_redstone", a(atf.aB))
/* 2803 */       .a(☃);
/*      */     
/* 2805 */     gg.a(bct.d, 4)
/* 2806 */       .a(Character.valueOf('S'), bct.c)
/* 2807 */       .a("SS")
/* 2808 */       .a("SS")
/* 2809 */       .a("has_stone", a(bct.c))
/* 2810 */       .a(☃);
/*      */     
/* 2812 */     gg.a(bct.f, 4)
/* 2813 */       .a(Character.valueOf('S'), bct.e)
/* 2814 */       .a("SS")
/* 2815 */       .a("SS")
/* 2816 */       .a("has_stone", a(bct.e))
/* 2817 */       .a(☃);
/*      */     
/* 2819 */     gg.a(bct.h, 4)
/* 2820 */       .a(Character.valueOf('S'), bct.g)
/* 2821 */       .a("SS")
/* 2822 */       .a("SS")
/* 2823 */       .a("has_stone", a(bct.g))
/* 2824 */       .a(☃);
/*      */     
/* 2826 */     gg.a(bct.hg)
/* 2827 */       .a(Character.valueOf('S'), atf.er)
/* 2828 */       .a("SS")
/* 2829 */       .a("SS")
/* 2830 */       .a("has_prismarine_shard", a(atf.er))
/* 2831 */       .a(☃);
/*      */     
/* 2833 */     gg.a(bct.hh)
/* 2834 */       .a(Character.valueOf('S'), atf.er)
/* 2835 */       .a("SSS")
/* 2836 */       .a("SSS")
/* 2837 */       .a("SSS")
/* 2838 */       .a("has_prismarine_shard", a(atf.er))
/* 2839 */       .a(☃);
/*      */     
/* 2841 */     gg.a(bct.bT, 6)
/* 2842 */       .a(Character.valueOf('#'), bct.hg)
/* 2843 */       .a("###")
/* 2844 */       .a("has_prismarine", a(bct.hg))
/* 2845 */       .a(☃);
/*      */     
/* 2847 */     gg.a(bct.bU, 6)
/* 2848 */       .a(Character.valueOf('#'), bct.hh)
/* 2849 */       .a("###")
/* 2850 */       .a("has_prismarine_bricks", a(bct.hh))
/* 2851 */       .a(☃);
/*      */     
/* 2853 */     gg.a(bct.bV, 6)
/* 2854 */       .a(Character.valueOf('#'), bct.hi)
/* 2855 */       .a("###")
/* 2856 */       .a("has_dark_prismarine", a(bct.hi))
/* 2857 */       .a(☃);
/*      */     
/* 2859 */     gh.a(atf.dQ)
/* 2860 */       .b(bct.dd)
/* 2861 */       .b(atf.by)
/* 2862 */       .b(atf.aW)
/* 2863 */       .a("has_carved_pumpkin", a(bct.di))
/* 2864 */       .a("has_pumpkin", a(bct.dd))
/* 2865 */       .a(☃);
/*      */     
/* 2867 */     gh.a(atf.bU, 4)
/* 2868 */       .b(bct.dd)
/* 2869 */       .a("has_pumpkin", a(bct.dd))
/* 2870 */       .a(☃);
/*      */     
/* 2872 */     gg.a(atf.eD)
/* 2873 */       .a(Character.valueOf('#'), bct.bi)
/* 2874 */       .a(Character.valueOf('|'), atf.C)
/* 2875 */       .a("###")
/* 2876 */       .a("###")
/* 2877 */       .a(" | ")
/* 2878 */       .b("banner")
/* 2879 */       .a("has_purple_wool", a(bct.bi))
/* 2880 */       .a(☃);
/*      */     
/* 2882 */     gg.a(atf.bJ)
/* 2883 */       .a(Character.valueOf('#'), bct.bi)
/* 2884 */       .a(Character.valueOf('X'), wx.b)
/* 2885 */       .a("###")
/* 2886 */       .a("XXX")
/* 2887 */       .b("bed")
/* 2888 */       .a("has_purple_wool", a(bct.bi))
/* 2889 */       .a(☃);
/*      */     
/* 2891 */     gh.a(atf.bJ)
/* 2892 */       .b(atf.bz)
/* 2893 */       .b(atf.br)
/* 2894 */       .a("dyed_bed")
/* 2895 */       .a("has_bed", a(atf.bz))
/* 2896 */       .a(☃, "purple_bed_from_white_bed");
/*      */     
/* 2898 */     gg.a(bct.gh, 3)
/* 2899 */       .a(Character.valueOf('#'), bct.bi)
/* 2900 */       .a("##")
/* 2901 */       .b("carpet")
/* 2902 */       .a("has_purple_wool", a(bct.bi))
/* 2903 */       .a(☃);
/*      */     
/* 2905 */     gh.a(bct.jx, 8)
/* 2906 */       .b(atf.br)
/* 2907 */       .b(bct.D, 4)
/* 2908 */       .b(bct.F, 4)
/* 2909 */       .a("concrete_powder")
/* 2910 */       .a("has_sand", a(bct.D))
/* 2911 */       .a("has_gravel", a(bct.F))
/* 2912 */       .a(☃);
/*      */     
/* 2914 */     gh.a(atf.br, 2)
/* 2915 */       .b(atf.bs)
/* 2916 */       .b(atf.bv)
/* 2917 */       .a("has_lapis", a(atf.bs))
/* 2918 */       .a("has_red_dye", a(atf.bv))
/* 2919 */       .a(☃);
/*      */     
/* 2921 */     gg.a(bct.iq)
/* 2922 */       .a(Character.valueOf('#'), bct.ck)
/* 2923 */       .a(Character.valueOf('-'), atf.eS)
/* 2924 */       .a("-")
/* 2925 */       .a("#")
/* 2926 */       .a("-")
/* 2927 */       .a("has_shulker_shell", a(atf.eS))
/* 2928 */       .a(☃);
/*      */     
/* 2930 */     gg.a(bct.gK, 8)
/* 2931 */       .a(Character.valueOf('#'), bct.ap)
/* 2932 */       .a(Character.valueOf('X'), atf.br)
/* 2933 */       .a("###")
/* 2934 */       .a("#X#")
/* 2935 */       .a("###")
/* 2936 */       .b("stained_glass")
/* 2937 */       .a("has_glass", a(bct.ap))
/* 2938 */       .a(☃);
/*      */     
/* 2940 */     gg.a(bct.ha, 16)
/* 2941 */       .a(Character.valueOf('#'), bct.gK)
/* 2942 */       .a("###")
/* 2943 */       .a("###")
/* 2944 */       .b("stained_glass_pane")
/* 2945 */       .a("has_glass", a(bct.ap))
/* 2946 */       .a(☃);
/*      */     
/* 2948 */     gg.a(bct.fO, 8)
/* 2949 */       .a(Character.valueOf('#'), bct.gn)
/* 2950 */       .a(Character.valueOf('X'), atf.br)
/* 2951 */       .a("###")
/* 2952 */       .a("#X#")
/* 2953 */       .a("###")
/* 2954 */       .b("stained_terracotta")
/* 2955 */       .a("has_terracotta", a(bct.gn))
/* 2956 */       .a(☃);
/*      */     
/* 2958 */     gh.a(bct.bi)
/* 2959 */       .b(atf.br)
/* 2960 */       .b(bct.aY)
/* 2961 */       .a("wool")
/* 2962 */       .a("has_white_wool", a(bct.aY))
/* 2963 */       .a(☃);
/*      */     
/* 2965 */     gg.a(bct.ia, 4)
/* 2966 */       .a(Character.valueOf('F'), atf.eN)
/* 2967 */       .a("FF")
/* 2968 */       .a("FF")
/* 2969 */       .a("has_chorus_fruit_popped", a(atf.eN))
/* 2970 */       .a(☃);
/*      */     
/* 2972 */     gg.a(bct.ib)
/* 2973 */       .a(Character.valueOf('#'), bct.bS)
/* 2974 */       .a("#")
/* 2975 */       .a("#")
/* 2976 */       .a("has_purpur_block", a(bct.ia))
/* 2977 */       .a(☃);
/*      */     
/* 2979 */     gg.a(bct.bS, 6)
/* 2980 */       .a(Character.valueOf('#'), avh.a(new axx[] { bct.ia, bct.ib
/* 2981 */           })).a("###")
/* 2982 */       .a("has_purpur_block", a(bct.ia))
/* 2983 */       .a(☃);
/*      */     
/* 2985 */     gg.a(bct.ic, 4)
/* 2986 */       .a(Character.valueOf('#'), avh.a(new axx[] { bct.ia, bct.ib
/* 2987 */           })).a("#  ")
/* 2988 */       .a("## ")
/* 2989 */       .a("###")
/* 2990 */       .a("has_purpur_block", a(bct.ia))
/* 2991 */       .a(☃);
/*      */     
/* 2993 */     gg.a(bct.fy)
/* 2994 */       .a(Character.valueOf('#'), atf.dV)
/* 2995 */       .a("##")
/* 2996 */       .a("##")
/* 2997 */       .a("has_quartz", a(atf.dV))
/* 2998 */       .a(☃);
/*      */     
/* 3000 */     gg.a(bct.bQ, 6)
/* 3001 */       .a(Character.valueOf('#'), avh.a(new axx[] { bct.fA, bct.fy, bct.fz
/* 3002 */           })).a("###")
/* 3003 */       .a("has_chiseled_quartz_block", a(bct.fA))
/* 3004 */       .a("has_quartz_block", a(bct.fy))
/* 3005 */       .a("has_quartz_pillar", a(bct.fz))
/* 3006 */       .a(☃);
/*      */     
/* 3008 */     gg.a(bct.fB, 4)
/* 3009 */       .a(Character.valueOf('#'), avh.a(new axx[] { bct.fA, bct.fy, bct.fz
/* 3010 */           })).a("#  ")
/* 3011 */       .a("## ")
/* 3012 */       .a("###")
/* 3013 */       .a("has_chiseled_quartz_block", a(bct.fA))
/* 3014 */       .a("has_quartz_block", a(bct.fy))
/* 3015 */       .a("has_quartz_pillar", a(bct.fz))
/* 3016 */       .a(☃);
/*      */     
/* 3018 */     gg.a(atf.ce)
/* 3019 */       .a(Character.valueOf('P'), atf.dE)
/* 3020 */       .a(Character.valueOf('R'), atf.cd)
/* 3021 */       .a(Character.valueOf('B'), atf.D)
/* 3022 */       .a(Character.valueOf('C'), atf.dC)
/* 3023 */       .a(Character.valueOf('M'), bct.bz)
/* 3024 */       .a(" R ")
/* 3025 */       .a("CPM")
/* 3026 */       .a(" B ")
/* 3027 */       .b("rabbit_stew")
/* 3028 */       .a("has_cooked_rabbit", a(atf.cd))
/* 3029 */       .a(☃, "rabbit_stew_from_brown_mushroom");
/*      */     
/* 3031 */     gg.a(atf.ce)
/* 3032 */       .a(Character.valueOf('P'), atf.dE)
/* 3033 */       .a(Character.valueOf('R'), atf.cd)
/* 3034 */       .a(Character.valueOf('B'), atf.D)
/* 3035 */       .a(Character.valueOf('C'), atf.dC)
/* 3036 */       .a(Character.valueOf('D'), bct.bA)
/* 3037 */       .a(" R ")
/* 3038 */       .a("CPD")
/* 3039 */       .a(" B ")
/* 3040 */       .b("rabbit_stew")
/* 3041 */       .a("has_cooked_rabbit", a(atf.cd))
/* 3042 */       .a(☃, "rabbit_stew_from_red_mushroom");
/*      */     
/* 3044 */     gg.a(bct.cA, 16)
/* 3045 */       .a(Character.valueOf('#'), atf.C)
/* 3046 */       .a(Character.valueOf('X'), atf.n)
/* 3047 */       .a("X X")
/* 3048 */       .a("X#X")
/* 3049 */       .a("X X")
/* 3050 */       .a("has_minecart", a(atf.az))
/* 3051 */       .a(☃);
/*      */     
/* 3053 */     gh.a(atf.aB, 9)
/* 3054 */       .b(bct.fv)
/* 3055 */       .a("has_redstone_block", a(bct.fv))
/* 3056 */       .a("has_at_least_9_redstone", a(ba.d.b(9), atf.aB))
/* 3057 */       .a(☃);
/*      */     
/* 3059 */     gg.a(bct.fv)
/* 3060 */       .a(Character.valueOf('#'), atf.aB)
/* 3061 */       .a("###")
/* 3062 */       .a("###")
/* 3063 */       .a("###")
/* 3064 */       .a("has_at_least_9_redstone", a(ba.d.b(9), atf.aB))
/* 3065 */       .a(☃);
/*      */     
/* 3067 */     gg.a(bct.ei)
/* 3068 */       .a(Character.valueOf('R'), atf.aB)
/* 3069 */       .a(Character.valueOf('G'), bct.dg)
/* 3070 */       .a(" R ")
/* 3071 */       .a("RGR")
/* 3072 */       .a(" R ")
/* 3073 */       .a("has_glowstone", a(bct.dg))
/* 3074 */       .a(☃);
/*      */     
/* 3076 */     gg.a(bct.cN)
/* 3077 */       .a(Character.valueOf('#'), atf.C)
/* 3078 */       .a(Character.valueOf('X'), atf.aB)
/* 3079 */       .a("X")
/* 3080 */       .a("#")
/* 3081 */       .a("has_redstone", a(atf.aB))
/* 3082 */       .a(☃);
/*      */     
/* 3084 */     gg.a(atf.eH)
/* 3085 */       .a(Character.valueOf('#'), bct.bm)
/* 3086 */       .a(Character.valueOf('|'), atf.C)
/* 3087 */       .a("###")
/* 3088 */       .a("###")
/* 3089 */       .a(" | ")
/* 3090 */       .b("banner")
/* 3091 */       .a("has_red_wool", a(bct.bm))
/* 3092 */       .a(☃);
/*      */     
/* 3094 */     gg.a(atf.bN)
/* 3095 */       .a(Character.valueOf('#'), bct.bm)
/* 3096 */       .a(Character.valueOf('X'), wx.b)
/* 3097 */       .a("###")
/* 3098 */       .a("XXX")
/* 3099 */       .b("bed")
/* 3100 */       .a("has_red_wool", a(bct.bm))
/* 3101 */       .a(☃);
/*      */     
/* 3103 */     gh.a(atf.bN)
/* 3104 */       .b(atf.bz)
/* 3105 */       .b(atf.bv)
/* 3106 */       .a("dyed_bed")
/* 3107 */       .a("has_bed", a(atf.bz))
/* 3108 */       .a(☃, "red_bed_from_white_bed");
/*      */     
/* 3110 */     gg.a(bct.gl, 3)
/* 3111 */       .a(Character.valueOf('#'), bct.bm)
/* 3112 */       .a("##")
/* 3113 */       .b("carpet")
/* 3114 */       .a("has_red_wool", a(bct.bm))
/* 3115 */       .a(☃);
/*      */     
/* 3117 */     gh.a(bct.jB, 8)
/* 3118 */       .b(atf.bv)
/* 3119 */       .b(bct.D, 4)
/* 3120 */       .b(bct.F, 4)
/* 3121 */       .a("concrete_powder")
/* 3122 */       .a("has_sand", a(bct.D))
/* 3123 */       .a("has_gravel", a(bct.F))
/* 3124 */       .a(☃);
/*      */     
/* 3126 */     gh.a(atf.bv)
/* 3127 */       .b(atf.eP)
/* 3128 */       .a("red_dye")
/* 3129 */       .a("has_beetroot", a(atf.eP))
/* 3130 */       .a(☃, "red_dye_from_beetroot");
/*      */     
/* 3132 */     gh.a(atf.bv)
/* 3133 */       .b(bct.bq)
/* 3134 */       .a("red_dye")
/* 3135 */       .a("has_red_flower", a(bct.bq))
/* 3136 */       .a(☃, "red_dye_from_poppy");
/*      */     
/* 3138 */     gh.a(atf.bv, 2)
/* 3139 */       .b(bct.gw)
/* 3140 */       .a("red_dye")
/* 3141 */       .a("has_double_plant", a(bct.gw))
/* 3142 */       .a(☃, "red_dye_from_rose_bush");
/*      */     
/* 3144 */     gh.a(atf.bv)
/* 3145 */       .b(bct.bu)
/* 3146 */       .a("red_dye")
/* 3147 */       .a("has_red_flower", a(bct.bu))
/* 3148 */       .a(☃, "red_dye_from_tulip");
/*      */     
/* 3150 */     gg.a(bct.im)
/* 3151 */       .a(Character.valueOf('W'), atf.cm)
/* 3152 */       .a(Character.valueOf('N'), atf.dU)
/* 3153 */       .a("NW")
/* 3154 */       .a("WN")
/* 3155 */       .a("has_nether_wart", a(atf.cm))
/* 3156 */       .a(☃);
/*      */     
/* 3158 */     gg.a(bct.hT)
/* 3159 */       .a(Character.valueOf('#'), bct.E)
/* 3160 */       .a("##")
/* 3161 */       .a("##")
/* 3162 */       .a("has_sand", a(bct.E))
/* 3163 */       .a(☃);
/*      */     
/* 3165 */     gg.a(bct.bR, 6)
/* 3166 */       .a(Character.valueOf('#'), avh.a(new axx[] { bct.hT, bct.hU, bct.hV
/* 3167 */           })).a("###")
/* 3168 */       .a("has_red_sandstone", a(bct.hT))
/* 3169 */       .a("has_chiseled_red_sandstone", a(bct.hU))
/* 3170 */       .a("has_cut_red_sandstone", a(bct.hV))
/* 3171 */       .a(☃);
/*      */     
/* 3173 */     gg.a(bct.hW, 4)
/* 3174 */       .a(Character.valueOf('#'), avh.a(new axx[] { bct.hT, bct.hU, bct.hV
/* 3175 */           })).a("#  ")
/* 3176 */       .a("## ")
/* 3177 */       .a("###")
/* 3178 */       .a("has_red_sandstone", a(bct.hT))
/* 3179 */       .a("has_chiseled_red_sandstone", a(bct.hU))
/* 3180 */       .a("has_cut_red_sandstone", a(bct.hV))
/* 3181 */       .a(☃);
/*      */     
/* 3183 */     gg.a(bct.gO, 8)
/* 3184 */       .a(Character.valueOf('#'), bct.ap)
/* 3185 */       .a(Character.valueOf('X'), atf.bv)
/* 3186 */       .a("###")
/* 3187 */       .a("#X#")
/* 3188 */       .a("###")
/* 3189 */       .b("stained_glass")
/* 3190 */       .a("has_glass", a(bct.ap))
/* 3191 */       .a(☃);
/*      */     
/* 3193 */     gg.a(bct.he, 16)
/* 3194 */       .a(Character.valueOf('#'), bct.gO)
/* 3195 */       .a("###")
/* 3196 */       .a("###")
/* 3197 */       .b("stained_glass_pane")
/* 3198 */       .a("has_glass", a(bct.ap))
/* 3199 */       .a(☃);
/*      */     
/* 3201 */     gg.a(bct.fS, 8)
/* 3202 */       .a(Character.valueOf('#'), bct.gn)
/* 3203 */       .a(Character.valueOf('X'), atf.bv)
/* 3204 */       .a("###")
/* 3205 */       .a("#X#")
/* 3206 */       .a("###")
/* 3207 */       .b("stained_terracotta")
/* 3208 */       .a("has_terracotta", a(bct.gn))
/* 3209 */       .a(☃);
/*      */     
/* 3211 */     gh.a(bct.bm)
/* 3212 */       .b(atf.bv)
/* 3213 */       .b(bct.aY)
/* 3214 */       .a("wool")
/* 3215 */       .a("has_white_wool", a(bct.aY))
/* 3216 */       .a(☃);
/*      */     
/* 3218 */     gg.a(bct.dl)
/* 3219 */       .a(Character.valueOf('#'), bct.cN)
/* 3220 */       .a(Character.valueOf('X'), atf.aB)
/* 3221 */       .a(Character.valueOf('I'), bct.b)
/* 3222 */       .a("#X#")
/* 3223 */       .a("III")
/* 3224 */       .a("has_redstone_torch", a(bct.cN))
/* 3225 */       .a(☃);
/*      */     
/* 3227 */     gg.a(bct.at)
/* 3228 */       .a(Character.valueOf('#'), bct.D)
/* 3229 */       .a("##")
/* 3230 */       .a("##")
/* 3231 */       .a("has_sand", a(bct.D))
/* 3232 */       .a(☃);
/*      */     
/* 3234 */     gg.a(bct.bK, 6)
/* 3235 */       .a(Character.valueOf('#'), avh.a(new axx[] { bct.at, bct.au, bct.av
/* 3236 */           })).a("###")
/* 3237 */       .a("has_sandstone", a(bct.at))
/* 3238 */       .a("has_chiseled_sandstone", a(bct.au))
/* 3239 */       .a("has_cut_sandstone", a(bct.av))
/* 3240 */       .a(☃);
/*      */     
/* 3242 */     gg.a(bct.ek, 4)
/* 3243 */       .a(Character.valueOf('#'), avh.a(new axx[] { bct.at, bct.au, bct.av
/* 3244 */           })).a("#  ")
/* 3245 */       .a("## ")
/* 3246 */       .a("###")
/* 3247 */       .a("has_sandstone", a(bct.at))
/* 3248 */       .a("has_chiseled_sandstone", a(bct.au))
/* 3249 */       .a("has_cut_sandstone", a(bct.av))
/* 3250 */       .a(☃);
/*      */     
/* 3252 */     gg.a(bct.hm)
/* 3253 */       .a(Character.valueOf('S'), atf.er)
/* 3254 */       .a(Character.valueOf('C'), atf.es)
/* 3255 */       .a("SCS")
/* 3256 */       .a("CCC")
/* 3257 */       .a("SCS")
/* 3258 */       .a("has_prismarine_crystals", a(atf.es))
/* 3259 */       .a(☃);
/*      */     
/* 3261 */     gg.a(atf.bR)
/* 3262 */       .a(Character.valueOf('#'), atf.n)
/* 3263 */       .a(" #")
/* 3264 */       .a("# ")
/* 3265 */       .a("has_iron_ingot", a(atf.n))
/* 3266 */       .a(☃);
/*      */     
/* 3268 */     gg.a(atf.eK)
/* 3269 */       .a(Character.valueOf('W'), wx.b)
/* 3270 */       .a(Character.valueOf('o'), atf.n)
/* 3271 */       .a("WoW")
/* 3272 */       .a("WWW")
/* 3273 */       .a(" W ")
/* 3274 */       .a("has_iron_ingot", a(atf.n))
/* 3275 */       .a(☃);
/*      */     
/* 3277 */     gg.a(atf.av, 3)
/* 3278 */       .a(Character.valueOf('#'), wx.b)
/* 3279 */       .a(Character.valueOf('X'), atf.C)
/* 3280 */       .a("###")
/* 3281 */       .a("###")
/* 3282 */       .a(" X ")
/* 3283 */       .a("has_planks", a(wx.b))
/* 3284 */       .a(☃);
/*      */     
/* 3286 */     gg.a(bct.gt)
/* 3287 */       .a(Character.valueOf('#'), atf.aT)
/* 3288 */       .a("###")
/* 3289 */       .a("###")
/* 3290 */       .a("###")
/* 3291 */       .a("has_at_least_9_slime_ball", a(ba.d.b(9), atf.aT))
/* 3292 */       .a(☃);
/*      */     
/* 3294 */     gh.a(atf.aT, 9)
/* 3295 */       .b(bct.gt)
/* 3296 */       .a("has_at_least_9_slime_ball", a(ba.d.b(9), atf.aT))
/* 3297 */       .a("has_slime", a(bct.gt))
/* 3298 */       .a(☃);
/*      */     
/* 3300 */     gg.a(bct.hV, 4)
/* 3301 */       .a(Character.valueOf('#'), bct.hT)
/* 3302 */       .a("##")
/* 3303 */       .a("##")
/* 3304 */       .a("has_red_sandstone", a(bct.hT))
/* 3305 */       .a(☃);
/*      */     
/* 3307 */     gg.a(bct.av, 4)
/* 3308 */       .a(Character.valueOf('#'), bct.at)
/* 3309 */       .a("##")
/* 3310 */       .a("##")
/* 3311 */       .a("has_sandstone", a(bct.at))
/* 3312 */       .a(☃);
/*      */     
/* 3314 */     gg.a(bct.cS)
/* 3315 */       .a(Character.valueOf('#'), atf.aC)
/* 3316 */       .a("##")
/* 3317 */       .a("##")
/* 3318 */       .a("has_snowball", a(atf.aC))
/* 3319 */       .a(☃);
/*      */     
/* 3321 */     gg.a(bct.cQ, 6)
/* 3322 */       .a(Character.valueOf('#'), bct.cS)
/* 3323 */       .a("###")
/* 3324 */       .a("has_snowball", a(atf.aC))
/* 3325 */       .a(☃);
/*      */     
/* 3327 */     gg.a(atf.cx)
/* 3328 */       .a(Character.valueOf('#'), atf.cl)
/* 3329 */       .a(Character.valueOf('X'), atf.bS)
/* 3330 */       .a("###")
/* 3331 */       .a("#X#")
/* 3332 */       .a("###")
/* 3333 */       .a("has_melon", a(atf.bS))
/* 3334 */       .a(☃);
/*      */     
/* 3336 */     gg.a(atf.i, 2)
/* 3337 */       .a(Character.valueOf('#'), atf.ba)
/* 3338 */       .a(Character.valueOf('X'), atf.h)
/* 3339 */       .a(" # ")
/* 3340 */       .a("#X#")
/* 3341 */       .a(" # ")
/* 3342 */       .a("has_glowstone_dust", a(atf.ba))
/* 3343 */       .a(☃);
/*      */     
/* 3345 */     gg.a(bct.W, 3)
/* 3346 */       .a(Character.valueOf('#'), bct.K)
/* 3347 */       .a("##")
/* 3348 */       .a("##")
/* 3349 */       .b("bark")
/* 3350 */       .a("has_log", a(bct.K))
/* 3351 */       .a(☃);
/*      */     
/* 3353 */     gg.a(atf.aE)
/* 3354 */       .a(Character.valueOf('#'), bct.o)
/* 3355 */       .a("# #")
/* 3356 */       .a("###")
/* 3357 */       .b("boat")
/* 3358 */       .a("in_water", a(bct.A))
/* 3359 */       .a(☃);
/*      */     
/* 3361 */     gh.a(bct.eW)
/* 3362 */       .b(bct.o)
/* 3363 */       .a("wooden_button")
/* 3364 */       .a("has_planks", a(bct.o))
/* 3365 */       .a(☃);
/*      */     
/* 3367 */     gg.a(bct.cu, 3)
/* 3368 */       .a(Character.valueOf('#'), bct.o)
/* 3369 */       .a("##")
/* 3370 */       .a("##")
/* 3371 */       .a("##")
/* 3372 */       .b("wooden_door")
/* 3373 */       .a("has_planks", a(bct.o))
/* 3374 */       .a(☃);
/*      */     
/* 3376 */     gg.a(bct.cY, 3)
/* 3377 */       .a(Character.valueOf('#'), atf.C)
/* 3378 */       .a(Character.valueOf('W'), bct.o)
/* 3379 */       .a("W#W")
/* 3380 */       .a("W#W")
/* 3381 */       .b("wooden_fence")
/* 3382 */       .a("has_planks", a(bct.o))
/* 3383 */       .a(☃);
/*      */     
/* 3385 */     gg.a(bct.dO)
/* 3386 */       .a(Character.valueOf('#'), atf.C)
/* 3387 */       .a(Character.valueOf('W'), bct.o)
/* 3388 */       .a("#W#")
/* 3389 */       .a("#W#")
/* 3390 */       .b("wooden_fence_gate")
/* 3391 */       .a("has_planks", a(bct.o))
/* 3392 */       .a(☃);
/*      */     
/* 3394 */     gh.a(bct.o, 4)
/* 3395 */       .a(wx.t)
/* 3396 */       .a("planks")
/* 3397 */       .a("has_log", a(wx.t))
/* 3398 */       .a(☃);
/*      */     
/* 3400 */     gg.a(bct.cH)
/* 3401 */       .a(Character.valueOf('#'), bct.o)
/* 3402 */       .a("##")
/* 3403 */       .b("wooden_pressure_plate")
/* 3404 */       .a("has_planks", a(bct.o))
/* 3405 */       .a(☃);
/*      */     
/* 3407 */     gg.a(bct.bE, 6)
/* 3408 */       .a(Character.valueOf('#'), bct.o)
/* 3409 */       .a("###")
/* 3410 */       .b("wooden_slab")
/* 3411 */       .a("has_planks", a(bct.o))
/* 3412 */       .a(☃);
/*      */     
/* 3414 */     gg.a(bct.eq, 4)
/* 3415 */       .a(Character.valueOf('#'), bct.o)
/* 3416 */       .a("#  ")
/* 3417 */       .a("## ")
/* 3418 */       .a("###")
/* 3419 */       .b("wooden_stairs")
/* 3420 */       .a("has_planks", a(bct.o))
/* 3421 */       .a(☃);
/*      */     
/* 3423 */     gg.a(bct.dn, 2)
/* 3424 */       .a(Character.valueOf('#'), bct.o)
/* 3425 */       .a("###")
/* 3426 */       .a("###")
/* 3427 */       .b("wooden_trapdoor")
/* 3428 */       .a("has_planks", a(bct.o))
/* 3429 */       .a(☃);
/*      */     
/* 3431 */     gg.a(atf.C, 4)
/* 3432 */       .a(Character.valueOf('#'), wx.b)
/* 3433 */       .a("#")
/* 3434 */       .a("#")
/* 3435 */       .a("has_planks", a(wx.b))
/* 3436 */       .a(☃);
/*      */     
/* 3438 */     gg.a(bct.aP)
/* 3439 */       .a(Character.valueOf('P'), bct.aW)
/* 3440 */       .a(Character.valueOf('S'), atf.aT)
/* 3441 */       .a("S")
/* 3442 */       .a("P")
/* 3443 */       .a("has_slime_ball", a(atf.aT))
/* 3444 */       .a(☃);
/*      */     
/* 3446 */     gg.a(bct.dy, 4)
/* 3447 */       .a(Character.valueOf('#'), bct.b)
/* 3448 */       .a("##")
/* 3449 */       .a("##")
/* 3450 */       .a("has_stone", a(bct.b))
/* 3451 */       .a(☃);
/*      */     
/* 3453 */     gg.a(atf.x)
/* 3454 */       .a(Character.valueOf('#'), atf.C)
/* 3455 */       .a(Character.valueOf('X'), bct.m)
/* 3456 */       .a("XX")
/* 3457 */       .a("X#")
/* 3458 */       .a(" #")
/* 3459 */       .a("has_cobblestone", a(bct.m))
/* 3460 */       .a(☃);
/*      */     
/* 3462 */     gg.a(bct.bO, 6)
/* 3463 */       .a(Character.valueOf('#'), avh.a(wx.c))
/* 3464 */       .a("###")
/* 3465 */       .a("has_stone_bricks", a(wx.c))
/* 3466 */       .a(☃);
/*      */     
/* 3468 */     gg.a(bct.dU, 4)
/* 3469 */       .a(Character.valueOf('#'), avh.a(wx.c))
/* 3470 */       .a("#  ")
/* 3471 */       .a("## ")
/* 3472 */       .a("###")
/* 3473 */       .a("has_stone_bricks", a(wx.c))
/* 3474 */       .a(☃);
/*      */     
/* 3476 */     gh.a(bct.cP)
/* 3477 */       .b(bct.b)
/* 3478 */       .a("has_stone", a(bct.b))
/* 3479 */       .a(☃);
/*      */     
/* 3481 */     gg.a(atf.N)
/* 3482 */       .a(Character.valueOf('#'), atf.C)
/* 3483 */       .a(Character.valueOf('X'), bct.m)
/* 3484 */       .a("XX")
/* 3485 */       .a(" #")
/* 3486 */       .a(" #")
/* 3487 */       .a("has_cobblestone", a(bct.m))
/* 3488 */       .a(☃);
/*      */     
/* 3490 */     gg.a(atf.w)
/* 3491 */       .a(Character.valueOf('#'), atf.C)
/* 3492 */       .a(Character.valueOf('X'), bct.m)
/* 3493 */       .a("XXX")
/* 3494 */       .a(" # ")
/* 3495 */       .a(" # ")
/* 3496 */       .a("has_cobblestone", a(bct.m))
/* 3497 */       .a(☃);
/*      */     
/* 3499 */     gg.a(bct.cE)
/* 3500 */       .a(Character.valueOf('#'), bct.b)
/* 3501 */       .a("##")
/* 3502 */       .a("has_stone", a(bct.b))
/* 3503 */       .a(☃);
/*      */     
/* 3505 */     gg.a(atf.v)
/* 3506 */       .a(Character.valueOf('#'), atf.C)
/* 3507 */       .a(Character.valueOf('X'), bct.m)
/* 3508 */       .a("X")
/* 3509 */       .a("#")
/* 3510 */       .a("#")
/* 3511 */       .a("has_cobblestone", a(bct.m))
/* 3512 */       .a(☃);
/*      */     
/* 3514 */     gg.a(bct.bJ, 6)
/* 3515 */       .a(Character.valueOf('#'), bct.b)
/* 3516 */       .a("###")
/* 3517 */       .a("has_stone", a(bct.b))
/* 3518 */       .a(☃);
/*      */     
/* 3520 */     gg.a(bct.cB, 4)
/* 3521 */       .a(Character.valueOf('#'), bct.m)
/* 3522 */       .a("#  ")
/* 3523 */       .a("## ")
/* 3524 */       .a("###")
/* 3525 */       .a("has_cobblestone", a(bct.m))
/* 3526 */       .a(☃);
/*      */     
/* 3528 */     gg.a(atf.u)
/* 3529 */       .a(Character.valueOf('#'), atf.C)
/* 3530 */       .a(Character.valueOf('X'), bct.m)
/* 3531 */       .a("X")
/* 3532 */       .a("X")
/* 3533 */       .a("#")
/* 3534 */       .a("has_cobblestone", a(bct.m))
/* 3535 */       .a(☃);
/*      */     
/* 3537 */     gg.a(bct.aY)
/* 3538 */       .a(Character.valueOf('#'), atf.J)
/* 3539 */       .a("##")
/* 3540 */       .a("##")
/* 3541 */       .a("has_string", a(atf.J))
/* 3542 */       .a(☃, "white_wool_from_string");
/*      */     
/* 3544 */     gh.a(atf.by)
/* 3545 */       .b(bct.cV)
/* 3546 */       .a("has_reeds", a(bct.cV))
/* 3547 */       .a(☃);
/*      */     
/* 3549 */     gg.a(bct.cb)
/* 3550 */       .a(Character.valueOf('#'), avh.a(new axx[] { bct.D, bct.E
/* 3551 */           })).a(Character.valueOf('X'), atf.L)
/* 3552 */       .a("X#X")
/* 3553 */       .a("#X#")
/* 3554 */       .a("X#X")
/* 3555 */       .a("has_gunpowder", a(atf.L))
/* 3556 */       .a(☃);
/*      */     
/* 3558 */     gg.a(atf.dW)
/* 3559 */       .a(Character.valueOf('A'), bct.cb)
/* 3560 */       .a(Character.valueOf('B'), atf.az)
/* 3561 */       .a("A")
/* 3562 */       .a("B")
/* 3563 */       .a("has_minecart", a(atf.az))
/* 3564 */       .a(☃);
/*      */     
/* 3566 */     gg.a(bct.cf, 4)
/* 3567 */       .a(Character.valueOf('#'), atf.C)
/* 3568 */       .a(Character.valueOf('X'), avh.a(new axx[] { atf.k, atf.l
/* 3569 */           })).a("X")
/* 3570 */       .a("#")
/* 3571 */       .a("has_stone_pickaxe", a(atf.w))
/* 3572 */       .a(☃);
/*      */     
/* 3574 */     gh.a(bct.fq)
/* 3575 */       .b(bct.ck)
/* 3576 */       .b(bct.en)
/* 3577 */       .a("has_tripwire_hook", a(bct.en))
/* 3578 */       .a(☃);
/*      */     
/* 3580 */     gg.a(bct.en, 2)
/* 3581 */       .a(Character.valueOf('#'), wx.b)
/* 3582 */       .a(Character.valueOf('S'), atf.C)
/* 3583 */       .a(Character.valueOf('I'), atf.n)
/* 3584 */       .a("I")
/* 3585 */       .a("S")
/* 3586 */       .a("#")
/* 3587 */       .a("has_string", a(atf.J))
/* 3588 */       .a(☃);
/*      */     
/* 3590 */     gg.a(atf.ao)
/* 3591 */       .a(Character.valueOf('X'), atf.eV)
/* 3592 */       .a("XXX")
/* 3593 */       .a("X X")
/* 3594 */       .a("has_scute", a(atf.eV))
/* 3595 */       .a(☃);
/*      */     
/* 3597 */     gh.a(atf.S, 9)
/* 3598 */       .b(bct.fW)
/* 3599 */       .a("has_at_least_9_wheat", a(ba.d.b(9), atf.S))
/* 3600 */       .a("has_hay_block", a(bct.fW))
/* 3601 */       .a(☃);
/*      */     
/* 3603 */     gg.a(atf.et)
/* 3604 */       .a(Character.valueOf('#'), bct.aY)
/* 3605 */       .a(Character.valueOf('|'), atf.C)
/* 3606 */       .a("###")
/* 3607 */       .a("###")
/* 3608 */       .a(" | ")
/* 3609 */       .b("banner")
/* 3610 */       .a("has_white_wool", a(bct.aY))
/* 3611 */       .a(☃);
/*      */     
/* 3613 */     gg.a(atf.bz)
/* 3614 */       .a(Character.valueOf('#'), bct.aY)
/* 3615 */       .a(Character.valueOf('X'), wx.b)
/* 3616 */       .a("###")
/* 3617 */       .a("XXX")
/* 3618 */       .b("bed")
/* 3619 */       .a("has_white_wool", a(bct.aY))
/* 3620 */       .a(☃);
/*      */     
/* 3622 */     gg.a(bct.fX, 3)
/* 3623 */       .a(Character.valueOf('#'), bct.aY)
/* 3624 */       .a("##")
/* 3625 */       .b("carpet")
/* 3626 */       .a("has_white_wool", a(bct.aY))
/* 3627 */       .a(☃);
/*      */     
/* 3629 */     gh.a(bct.jn, 8)
/* 3630 */       .b(atf.bh)
/* 3631 */       .b(bct.D, 4)
/* 3632 */       .b(bct.F, 4)
/* 3633 */       .a("concrete_powder")
/* 3634 */       .a("has_sand", a(bct.D))
/* 3635 */       .a("has_gravel", a(bct.F))
/* 3636 */       .a(☃);
/*      */     
/* 3638 */     gg.a(bct.gA, 8)
/* 3639 */       .a(Character.valueOf('#'), bct.ap)
/* 3640 */       .a(Character.valueOf('X'), atf.bh)
/* 3641 */       .a("###")
/* 3642 */       .a("#X#")
/* 3643 */       .a("###")
/* 3644 */       .b("stained_glass")
/* 3645 */       .a("has_glass", a(bct.ap))
/* 3646 */       .a(☃);
/*      */     
/* 3648 */     gg.a(bct.gQ, 16)
/* 3649 */       .a(Character.valueOf('#'), bct.gA)
/* 3650 */       .a("###")
/* 3651 */       .a("###")
/* 3652 */       .b("stained_glass_pane")
/* 3653 */       .a("has_glass", a(bct.ap))
/* 3654 */       .a(☃);
/*      */     
/* 3656 */     gg.a(bct.fE, 8)
/* 3657 */       .a(Character.valueOf('#'), bct.gn)
/* 3658 */       .a(Character.valueOf('X'), atf.bh)
/* 3659 */       .a("###")
/* 3660 */       .a("#X#")
/* 3661 */       .a("###")
/* 3662 */       .b("stained_terracotta")
/* 3663 */       .a("has_terracotta", a(bct.gn))
/* 3664 */       .a(☃);
/*      */     
/* 3666 */     gg.a(atf.t)
/* 3667 */       .a(Character.valueOf('#'), atf.C)
/* 3668 */       .a(Character.valueOf('X'), wx.b)
/* 3669 */       .a("XX")
/* 3670 */       .a("X#")
/* 3671 */       .a(" #")
/* 3672 */       .a("has_stick", a(atf.C))
/* 3673 */       .a(☃);
/*      */     
/* 3675 */     gg.a(bct.ct, 3)
/* 3676 */       .a(Character.valueOf('#'), bct.n)
/* 3677 */       .a("##")
/* 3678 */       .a("##")
/* 3679 */       .a("##")
/* 3680 */       .b("wooden_door")
/* 3681 */       .a("has_planks", a(bct.n))
/* 3682 */       .a(☃);
/*      */     
/* 3684 */     gg.a(atf.M)
/* 3685 */       .a(Character.valueOf('#'), atf.C)
/* 3686 */       .a(Character.valueOf('X'), wx.b)
/* 3687 */       .a("XX")
/* 3688 */       .a(" #")
/* 3689 */       .a(" #")
/* 3690 */       .a("has_stick", a(atf.C))
/* 3691 */       .a(☃);
/*      */     
/* 3693 */     gg.a(atf.s)
/* 3694 */       .a(Character.valueOf('#'), atf.C)
/* 3695 */       .a(Character.valueOf('X'), wx.b)
/* 3696 */       .a("XXX")
/* 3697 */       .a(" # ")
/* 3698 */       .a(" # ")
/* 3699 */       .a("has_stick", a(atf.C))
/* 3700 */       .a(☃);
/*      */     
/* 3702 */     gg.a(atf.r)
/* 3703 */       .a(Character.valueOf('#'), atf.C)
/* 3704 */       .a(Character.valueOf('X'), wx.b)
/* 3705 */       .a("X")
/* 3706 */       .a("#")
/* 3707 */       .a("#")
/* 3708 */       .a("has_stick", a(atf.C))
/* 3709 */       .a(☃);
/*      */     
/* 3711 */     gg.a(atf.q)
/* 3712 */       .a(Character.valueOf('#'), atf.C)
/* 3713 */       .a(Character.valueOf('X'), wx.b)
/* 3714 */       .a("X")
/* 3715 */       .a("X")
/* 3716 */       .a("#")
/* 3717 */       .a("has_stick", a(atf.C))
/* 3718 */       .a(☃);
/*      */     
/* 3720 */     gh.a(atf.dy)
/* 3721 */       .b(atf.aS)
/* 3722 */       .b(atf.bw)
/* 3723 */       .b(atf.K)
/* 3724 */       .a("has_book", a(atf.aS))
/* 3725 */       .a(☃);
/*      */     
/* 3727 */     gg.a(atf.ex)
/* 3728 */       .a(Character.valueOf('#'), bct.bc)
/* 3729 */       .a(Character.valueOf('|'), atf.C)
/* 3730 */       .a("###")
/* 3731 */       .a("###")
/* 3732 */       .a(" | ")
/* 3733 */       .b("banner")
/* 3734 */       .a("has_yellow_wool", a(bct.bc))
/* 3735 */       .a(☃);
/*      */     
/* 3737 */     gg.a(atf.bD)
/* 3738 */       .a(Character.valueOf('#'), bct.bc)
/* 3739 */       .a(Character.valueOf('X'), wx.b)
/* 3740 */       .a("###")
/* 3741 */       .a("XXX")
/* 3742 */       .b("bed")
/* 3743 */       .a("has_yellow_wool", a(bct.bc))
/* 3744 */       .a(☃);
/*      */     
/* 3746 */     gh.a(atf.bD)
/* 3747 */       .b(atf.bz)
/* 3748 */       .b(atf.bl)
/* 3749 */       .a("dyed_bed")
/* 3750 */       .a("has_bed", a(atf.bz))
/* 3751 */       .a(☃, "yellow_bed_from_white_bed");
/*      */     
/* 3753 */     gg.a(bct.gb, 3)
/* 3754 */       .a(Character.valueOf('#'), bct.bc)
/* 3755 */       .a("##")
/* 3756 */       .b("carpet")
/* 3757 */       .a("has_yellow_wool", a(bct.bc))
/* 3758 */       .a(☃);
/*      */     
/* 3760 */     gh.a(bct.jr, 8)
/* 3761 */       .b(atf.bl)
/* 3762 */       .b(bct.D, 4)
/* 3763 */       .b(bct.F, 4)
/* 3764 */       .a("concrete_powder")
/* 3765 */       .a("has_sand", a(bct.D))
/* 3766 */       .a("has_gravel", a(bct.F))
/* 3767 */       .a(☃);
/*      */     
/* 3769 */     gh.a(atf.bl)
/* 3770 */       .b(bct.bp)
/* 3771 */       .a("yellow_dye")
/* 3772 */       .a("has_yellow_flower", a(bct.bp))
/* 3773 */       .a(☃, "yellow_dye_from_dandelion");
/*      */     
/* 3775 */     gh.a(atf.bl, 2)
/* 3776 */       .b(bct.gu)
/* 3777 */       .a("yellow_dye")
/* 3778 */       .a("has_double_plant", a(bct.gu))
/* 3779 */       .a(☃, "yellow_dye_from_sunflower");
/*      */     
/* 3781 */     gg.a(bct.gE, 8)
/* 3782 */       .a(Character.valueOf('#'), bct.ap)
/* 3783 */       .a(Character.valueOf('X'), atf.bl)
/* 3784 */       .a("###")
/* 3785 */       .a("#X#")
/* 3786 */       .a("###")
/* 3787 */       .b("stained_glass")
/* 3788 */       .a("has_glass", a(bct.ap))
/* 3789 */       .a(☃);
/*      */     
/* 3791 */     gg.a(bct.gU, 16)
/* 3792 */       .a(Character.valueOf('#'), bct.gE)
/* 3793 */       .a("###")
/* 3794 */       .a("###")
/* 3795 */       .b("stained_glass_pane")
/* 3796 */       .a("has_glass", a(bct.ap))
/* 3797 */       .a(☃);
/*      */     
/* 3799 */     gg.a(bct.fI, 8)
/* 3800 */       .a(Character.valueOf('#'), bct.gn)
/* 3801 */       .a(Character.valueOf('X'), atf.bl)
/* 3802 */       .a("###")
/* 3803 */       .a("#X#")
/* 3804 */       .a("###")
/* 3805 */       .b("stained_terracotta")
/* 3806 */       .a("has_terracotta", a(bct.gn))
/* 3807 */       .a(☃);
/*      */     
/* 3809 */     gh.a(bct.bc)
/* 3810 */       .b(atf.bl)
/* 3811 */       .b(bct.aY)
/* 3812 */       .a("wool")
/* 3813 */       .a("has_white_wool", a(bct.aY))
/* 3814 */       .a(☃);
/*      */     
/* 3816 */     gh.a(atf.bT, 9)
/* 3817 */       .b(bct.jF)
/* 3818 */       .a("has_at_least_9_dried_kelp", a(ba.d.b(9), atf.bT))
/* 3819 */       .a("has_dried_kelp_block", a(bct.jF))
/* 3820 */       .a(☃);
/*      */     
/* 3822 */     gh.a(bct.jF)
/* 3823 */       .b(atf.bT, 9)
/* 3824 */       .a("has_at_least_9_dried_kelp", a(ba.d.b(9), atf.bT))
/* 3825 */       .a("has_dried_kelp_block", a(bct.jF))
/* 3826 */       .a(☃);
/*      */     
/* 3828 */     gg.a(bct.ko)
/* 3829 */       .a(Character.valueOf('#'), atf.eZ)
/* 3830 */       .a(Character.valueOf('X'), atf.fa)
/* 3831 */       .a("###")
/* 3832 */       .a("#X#")
/* 3833 */       .a("###")
/* 3834 */       .a("has_nautilus_core", a(atf.fa))
/* 3835 */       .a("has_nautilus_shell", a(atf.eZ))
/* 3836 */       .a(☃);
/*      */     
/* 3838 */     gj.a(avn.c)
/* 3839 */       .a(☃, "armor_dye");
/*      */     
/* 3841 */     gj.a(avn.m)
/* 3842 */       .a(☃, "banner_add_pattern");
/*      */     
/* 3844 */     gj.a(avn.l)
/* 3845 */       .a(☃, "banner_duplicate");
/*      */     
/* 3847 */     gj.a(avn.d)
/* 3848 */       .a(☃, "book_cloning");
/*      */     
/* 3850 */     gj.a(avn.g)
/* 3851 */       .a(☃, "firework_rocket");
/*      */     
/* 3853 */     gj.a(avn.h)
/* 3854 */       .a(☃, "firework_star");
/*      */     
/* 3856 */     gj.a(avn.i)
/* 3857 */       .a(☃, "firework_star_fade");
/*      */     
/* 3859 */     gj.a(avn.e)
/* 3860 */       .a(☃, "map_cloning");
/*      */     
/* 3862 */     gj.a(avn.f)
/* 3863 */       .a(☃, "map_extending");
/*      */     
/* 3865 */     gj.a(avn.j)
/* 3866 */       .a(☃, "repair_item");
/*      */     
/* 3868 */     gj.a(avn.n)
/* 3869 */       .a(☃, "shield_decoration");
/*      */     
/* 3871 */     gj.a(avn.o)
/* 3872 */       .a(☃, "shulker_box_coloring");
/*      */     
/* 3874 */     gj.a(avn.k)
/* 3875 */       .a(☃, "tipped_arrow");
/*      */     
/* 3877 */     gi.a(avh.a(new axx[] { atf.dD }, ), atf.dE, 0.35F, 200)
/* 3878 */       .a("has_potato", a(atf.dD))
/* 3879 */       .a(☃);
/*      */     
/* 3881 */     gi.a(avh.a(new axx[] { atf.aQ }, ), atf.aP, 0.3F, 200)
/* 3882 */       .a("has_clay_ball", a(atf.aQ))
/* 3883 */       .a(☃);
/*      */     
/* 3885 */     gi.a(avh.a(wx.n), atf.l, 0.15F, 200)
/* 3886 */       .a("has_log", a(wx.n))
/* 3887 */       .a(☃);
/*      */     
/* 3889 */     gi.a(avh.a(new axx[] { atf.eM }, ), atf.eN, 0.1F, 200)
/* 3890 */       .a("has_chorus_fruit", a(atf.eM))
/* 3891 */       .a(☃);
/*      */     
/* 3893 */     gi.a(avh.a(new axx[] { bct.I.h() }, ), atf.k, 0.1F, 200)
/* 3894 */       .a("has_coal_ore", a(bct.I))
/* 3895 */       .a(☃, "coal_from_smelting");
/*      */     
/* 3897 */     gi.a(avh.a(new axx[] { atf.bW }, ), atf.bX, 0.35F, 200)
/* 3898 */       .a("has_beef", a(atf.bW))
/* 3899 */       .a(☃);
/*      */     
/* 3901 */     gi.a(avh.a(new axx[] { atf.bY }, ), atf.bZ, 0.35F, 200)
/* 3902 */       .a("has_chicken", a(atf.bY))
/* 3903 */       .a(☃);
/*      */     
/* 3905 */     gi.a(avh.a(new axx[] { atf.bb }, ), atf.bf, 0.35F, 200)
/* 3906 */       .a("has_cod", a(atf.bb))
/* 3907 */       .a(☃);
/*      */     
/* 3909 */     gi.a(avh.a(new axx[] { bct.jE }, ), atf.bT, 0.1F, 200)
/* 3910 */       .a("has_kelp", a(bct.jE))
/* 3911 */       .a(☃, "dried_kelp_from_smelting");
/*      */     
/* 3913 */     gi.a(avh.a(new axx[] { atf.bc }, ), atf.bg, 0.35F, 200)
/* 3914 */       .a("has_salmon", a(atf.bc))
/* 3915 */       .a(☃);
/*      */     
/* 3917 */     gi.a(avh.a(new axx[] { atf.ca }, ), atf.cb, 0.35F, 200)
/* 3918 */       .a("has_mutton", a(atf.ca))
/* 3919 */       .a(☃);
/*      */     
/* 3921 */     gi.a(avh.a(new axx[] { atf.aq }, ), atf.ar, 0.35F, 200)
/* 3922 */       .a("has_porkchop", a(atf.aq))
/* 3923 */       .a(☃);
/*      */     
/* 3925 */     gi.a(avh.a(new axx[] { atf.cc }, ), atf.cd, 0.35F, 200)
/* 3926 */       .a("has_rabbit", a(atf.cc))
/* 3927 */       .a(☃);
/*      */     
/* 3929 */     gi.a(avh.a(new axx[] { bct.cm.h() }, ), atf.m, 1.0F, 200)
/* 3930 */       .a("has_diamond_ore", a(bct.cm))
/* 3931 */       .a(☃, "diamond_from_smelting");
/*      */     
/* 3933 */     gi.a(avh.a(new axx[] { bct.aq.h() }, ), atf.bs, 0.2F, 200)
/* 3934 */       .a("has_lapis_ore", a(bct.aq))
/* 3935 */       .a(☃, "lapis_from_smelting");
/*      */     
/* 3937 */     gi.a(avh.a(new axx[] { bct.el.h() }, ), atf.dA, 1.0F, 200)
/* 3938 */       .a("has_emerald_ore", a(bct.el))
/* 3939 */       .a(☃, "emerald_from_smelting");
/*      */     
/* 3941 */     gi.a(avh.a(wx.v), bct.ap.h(), 0.1F, 200)
/* 3942 */       .a("has_sand", a(wx.v))
/* 3943 */       .a(☃);
/*      */     
/* 3945 */     gi.a(avh.a(new axx[] { bct.G.h() }, ), atf.o, 1.0F, 200)
/* 3946 */       .a("has_gold_ore", a(bct.G))
/* 3947 */       .a(☃);
/*      */     
/* 3949 */     gi.a(avh.a(new axx[] { bct.kn.h() }, ), atf.bm, 0.1F, 200)
/* 3950 */       .a("has_sea_pickle", a(bct.kn))
/* 3951 */       .a(☃, "lime_dye_from_smelting");
/*      */     
/* 3953 */     gi.a(avh.a(new axx[] { bct.cT.h() }, ), atf.bu, 1.0F, 200)
/* 3954 */       .a("has_cactus", a(bct.cT))
/* 3955 */       .a(☃);
/*      */     
/* 3957 */     gi.a(avh.a(new axx[] { atf.H, atf.G, atf.I, atf.Q, atf.F, atf.ak, atf.al, atf.am, atf.an, atf.ea }, ), atf.cl, 0.1F, 200)
/* 3958 */       .a("has_golden_pickaxe", a(atf.H))
/* 3959 */       .a("has_golden_shovel", a(atf.G))
/* 3960 */       .a("has_golden_axe", a(atf.I))
/* 3961 */       .a("has_golden_hoe", a(atf.Q))
/* 3962 */       .a("has_golden_sword", a(atf.F))
/* 3963 */       .a("has_golden_helmet", a(atf.ak))
/* 3964 */       .a("has_golden_chestplate", a(atf.al))
/* 3965 */       .a("has_golden_leggings", a(atf.am))
/* 3966 */       .a("has_golden_boots", a(atf.an))
/* 3967 */       .a("has_golden_horse_armor", a(atf.ea))
/* 3968 */       .a(☃, "gold_nugget_from_smelting");
/*      */     
/* 3970 */     gi.a(avh.a(new axx[] { atf.c, atf.b, atf.d, atf.O, atf.p, atf.ac, atf.ad, atf.ae, atf.af, atf.dZ, atf.Y, atf.Z, atf.aa, atf.ab }, ), atf.eT, 0.1F, 200)
/* 3971 */       .a("has_iron_pickaxe", a(atf.c))
/* 3972 */       .a("has_iron_shovel", a(atf.b))
/* 3973 */       .a("has_iron_axe", a(atf.d))
/* 3974 */       .a("has_iron_hoe", a(atf.O))
/* 3975 */       .a("has_iron_sword", a(atf.p))
/* 3976 */       .a("has_iron_helmet", a(atf.ac))
/* 3977 */       .a("has_iron_chestplate", a(atf.ad))
/* 3978 */       .a("has_iron_leggings", a(atf.ae))
/* 3979 */       .a("has_iron_boots", a(atf.af))
/* 3980 */       .a("has_iron_horse_armor", a(atf.dZ))
/* 3981 */       .a("has_chainmail_helmet", a(atf.Y))
/* 3982 */       .a("has_chainmail_chestplate", a(atf.Z))
/* 3983 */       .a("has_chainmail_leggings", a(atf.aa))
/* 3984 */       .a("has_chainmail_boots", a(atf.ab))
/* 3985 */       .a(☃, "iron_nugget_from_smelting");
/*      */     
/* 3987 */     gi.a(avh.a(new axx[] { bct.H.h() }, ), atf.n, 0.7F, 200)
/* 3988 */       .a("has_iron_ore", a(bct.H.h()))
/* 3989 */       .a(☃);
/*      */     
/* 3991 */     gi.a(avh.a(new axx[] { bct.cU }, ), bct.gn.h(), 0.35F, 200)
/* 3992 */       .a("has_clay_block", a(bct.cU))
/* 3993 */       .a(☃);
/*      */     
/* 3995 */     gi.a(avh.a(new axx[] { bct.de }, ), atf.dU, 0.1F, 200)
/* 3996 */       .a("has_netherrack", a(bct.de))
/* 3997 */       .a(☃);
/*      */     
/* 3999 */     gi.a(avh.a(new axx[] { bct.fw }, ), atf.dV, 0.2F, 200)
/* 4000 */       .a("has_nether_quartz_ore", a(bct.fw))
/* 4001 */       .a(☃);
/*      */     
/* 4003 */     gi.a(avh.a(new axx[] { bct.cM }, ), atf.aB, 0.7F, 200)
/* 4004 */       .a("has_redstone_ore", a(bct.cM))
/* 4005 */       .a(☃, "redstone_from_smelting");
/*      */     
/* 4007 */     gi.a(avh.a(new axx[] { bct.ao }, ), bct.an.h(), 0.15F, 200)
/* 4008 */       .a("has_wet_sponge", a(bct.ao))
/* 4009 */       .a(☃);
/*      */     
/* 4011 */     gi.a(avh.a(new axx[] { bct.m }, ), bct.b.h(), 0.1F, 200)
/* 4012 */       .a("has_cobblestone", a(bct.m))
/* 4013 */       .a(☃);
/*      */     
/* 4015 */     gi.a(avh.a(new axx[] { bct.dy }, ), bct.dA.h(), 0.1F, 200)
/* 4016 */       .a("has_stone_bricks", a(bct.dy))
/* 4017 */       .a(☃);
/*      */     
/* 4019 */     gi.a(avh.a(new axx[] { bct.fT }, ), bct.iW.h(), 0.1F, 200)
/* 4020 */       .a("has_black_terracotta", a(bct.fT))
/* 4021 */       .a(☃);
/*      */     
/* 4023 */     gi.a(avh.a(new axx[] { bct.fP }, ), bct.iS.h(), 0.1F, 200)
/* 4024 */       .a("has_blue_terracotta", a(bct.fP))
/* 4025 */       .a(☃);
/*      */     
/* 4027 */     gi.a(avh.a(new axx[] { bct.fQ }, ), bct.iT.h(), 0.1F, 200)
/* 4028 */       .a("has_brown_terracotta", a(bct.fQ))
/* 4029 */       .a(☃);
/*      */     
/* 4031 */     gi.a(avh.a(new axx[] { bct.fN }, ), bct.iQ.h(), 0.1F, 200)
/* 4032 */       .a("has_cyan_terracotta", a(bct.fN))
/* 4033 */       .a(☃);
/*      */     
/* 4035 */     gi.a(avh.a(new axx[] { bct.fL }, ), bct.iO.h(), 0.1F, 200)
/* 4036 */       .a("has_gray_terracotta", a(bct.fL))
/* 4037 */       .a(☃);
/*      */     
/* 4039 */     gi.a(avh.a(new axx[] { bct.fR }, ), bct.iU.h(), 0.1F, 200)
/* 4040 */       .a("has_green_terracotta", a(bct.fR))
/* 4041 */       .a(☃);
/*      */     
/* 4043 */     gi.a(avh.a(new axx[] { bct.fH }, ), bct.iK.h(), 0.1F, 200)
/* 4044 */       .a("has_light_blue_terracotta", a(bct.fH))
/* 4045 */       .a(☃);
/*      */     
/* 4047 */     gi.a(avh.a(new axx[] { bct.fM }, ), bct.iP.h(), 0.1F, 200)
/* 4048 */       .a("has_light_gray_terracotta", a(bct.fM))
/* 4049 */       .a(☃);
/*      */     
/* 4051 */     gi.a(avh.a(new axx[] { bct.fJ }, ), bct.iM.h(), 0.1F, 200)
/* 4052 */       .a("has_lime_terracotta", a(bct.fJ))
/* 4053 */       .a(☃);
/*      */     
/* 4055 */     gi.a(avh.a(new axx[] { bct.fG }, ), bct.iJ.h(), 0.1F, 200)
/* 4056 */       .a("has_magenta_terracotta", a(bct.fG))
/* 4057 */       .a(☃);
/*      */     
/* 4059 */     gi.a(avh.a(new axx[] { bct.fF }, ), bct.iI.h(), 0.1F, 200)
/* 4060 */       .a("has_orange_terracotta", a(bct.fF))
/* 4061 */       .a(☃);
/*      */     
/* 4063 */     gi.a(avh.a(new axx[] { bct.fK }, ), bct.iN.h(), 0.1F, 200)
/* 4064 */       .a("has_pink_terracotta", a(bct.fK))
/* 4065 */       .a(☃);
/*      */     
/* 4067 */     gi.a(avh.a(new axx[] { bct.fO }, ), bct.iR.h(), 0.1F, 200)
/* 4068 */       .a("has_purple_terracotta", a(bct.fO))
/* 4069 */       .a(☃);
/*      */     
/* 4071 */     gi.a(avh.a(new axx[] { bct.fS }, ), bct.iV.h(), 0.1F, 200)
/* 4072 */       .a("has_red_terracotta", a(bct.fS))
/* 4073 */       .a(☃);
/*      */     
/* 4075 */     gi.a(avh.a(new axx[] { bct.fE }, ), bct.iH.h(), 0.1F, 200)
/* 4076 */       .a("has_white_terracotta", a(bct.fE))
/* 4077 */       .a(☃);
/*      */     
/* 4079 */     gi.a(avh.a(new axx[] { bct.fI }, ), bct.iL.h(), 0.1F, 200)
/* 4080 */       .a("has_yellow_terracotta", a(bct.fI))
/* 4081 */       .a(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   private am.b a(bcs ☃) {
/* 4086 */     return new am.b(☃, null);
/*      */   }
/*      */   
/*      */   private at.b a(ba.d ☃, axx axx1) {
/* 4090 */     return a(new av[] { av.a.a().a(axx1).a(☃).b() });
/*      */   }
/*      */   
/*      */   private at.b a(axx ☃) {
/* 4094 */     return a(new av[] { av.a.a().a(☃).b() });
/*      */   }
/*      */   
/*      */   private at.b a(wz<ata> ☃) {
/* 4098 */     return a(new av[] { av.a.a().a(☃).b() });
/*      */   }
/*      */   
/*      */   private at.b a(av... ☃) {
/* 4102 */     return new at.b(ba.d.e, ba.d.e, ba.d.e, ☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public String a() {
/* 4107 */     return "Recipes";
/*      */   }
/*      */ }


/* Location:              F:\dw\server.jar!\gf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */