/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bma
/*     */ {
/*  11 */   public static final bmb a = bmb.a("attached");
/*  12 */   public static final bmb b = bmb.a("conditional");
/*  13 */   public static final bmb c = bmb.a("disarmed");
/*  14 */   public static final bmb d = bmb.a("drag");
/*  15 */   public static final bmb e = bmb.a("enabled");
/*  16 */   public static final bmb f = bmb.a("extended");
/*  17 */   public static final bmb g = bmb.a("eye");
/*  18 */   public static final bmb h = bmb.a("falling");
/*  19 */   public static final bmb i = bmb.a("has_bottle_0");
/*  20 */   public static final bmb j = bmb.a("has_bottle_1");
/*  21 */   public static final bmb k = bmb.a("has_bottle_2");
/*  22 */   public static final bmb l = bmb.a("has_record");
/*  23 */   public static final bmb m = bmb.a("inverted");
/*  24 */   public static final bmb n = bmb.a("in_wall");
/*  25 */   public static final bmb o = bmb.a("lit");
/*  26 */   public static final bmb p = bmb.a("locked");
/*  27 */   public static final bmb q = bmb.a("occupied");
/*  28 */   public static final bmb r = bmb.a("open");
/*  29 */   public static final bmb s = bmb.a("persistent");
/*  30 */   public static final bmb t = bmb.a("powered");
/*  31 */   public static final bmb u = bmb.a("short");
/*  32 */   public static final bmb v = bmb.a("snowy");
/*  33 */   public static final bmb w = bmb.a("triggered");
/*  34 */   public static final bmb x = bmb.a("unstable");
/*  35 */   public static final bmb y = bmb.a("waterlogged");
/*     */   
/*  37 */   public static final bmh<eq.a> z = bmh.a("axis", eq.a.class, new eq.a[] { eq.a.a, eq.a.c });
/*  38 */   public static final bmh<eq.a> A = bmh.a("axis", eq.a.class);
/*     */   
/*  40 */   public static final bmb B = bmb.a("up");
/*  41 */   public static final bmb C = bmb.a("down");
/*  42 */   public static final bmb D = bmb.a("north");
/*  43 */   public static final bmb E = bmb.a("east");
/*  44 */   public static final bmb F = bmb.a("south");
/*  45 */   public static final bmb G = bmb.a("west");
/*     */   public static final bme I;
/*  47 */   public static final bme H = bme.a("facing", new eq[] { eq.c, eq.f, eq.d, eq.e, eq.b, eq.a }); static {
/*  48 */     I = bme.a("facing", ☃ -> (☃ != eq.b));
/*  49 */   } public static final bme J = bme.a("facing", eq.c.a);
/*     */   
/*  51 */   public static final bmh<bly> K = bmh.a("face", bly.class);
/*     */   
/*  53 */   public static final bmh<bmo> L = bmh.a("east", bmo.class);
/*  54 */   public static final bmh<bmo> M = bmh.a("north", bmo.class);
/*  55 */   public static final bmh<bmo> N = bmh.a("south", bmo.class);
/*  56 */   public static final bmh<bmo> O = bmh.a("west", bmo.class);
/*     */   
/*  58 */   public static final bmh<bmg> P = bmh.a("half", bmg.class);
/*  59 */   public static final bmh<bmi> Q = bmh.a("half", bmi.class);
/*     */   
/*  61 */   public static final bmh<bmn> R = bmh.a("shape", bmn.class); static {
/*  62 */     S = bmh.a("shape", bmn.class, ☃ -> 
/*  63 */         (☃ != bmn.j && ☃ != bmn.i && ☃ != bmn.g && ☃ != bmn.h));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final bmh<bmn> S;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  75 */   public static final bmj T = bmj.a("age", 0, 2);
/*  76 */   public static final bmj U = bmj.a("age", 0, 3);
/*  77 */   public static final bmj V = bmj.a("age", 0, 5);
/*  78 */   public static final bmj W = bmj.a("age", 0, 7);
/*  79 */   public static final bmj X = bmj.a("age", 0, 15);
/*  80 */   public static final bmj Y = bmj.a("age", 0, 25);
/*     */   
/*  82 */   public static final bmj Z = bmj.a("bites", 0, 6);
/*  83 */   public static final bmj aa = bmj.a("delay", 1, 4);
/*     */   
/*  85 */   public static final bmj ab = bmj.a("distance", 1, 7);
/*  86 */   public static final bmj ac = bmj.a("eggs", 1, 4);
/*  87 */   public static final bmj ad = bmj.a("hatch", 0, 2);
/*  88 */   public static final bmj ae = bmj.a("layers", 1, 8);
/*  89 */   public static final bmj af = bmj.a("level", 0, 3);
/*  90 */   public static final bmj ag = bmj.a("level", 1, 8);
/*  91 */   public static final bmj ah = bmj.a("level", 0, 15);
/*  92 */   public static final bmj ai = bmj.a("moisture", 0, 7);
/*  93 */   public static final bmj aj = bmj.a("note", 0, 24);
/*  94 */   public static final bmj ak = bmj.a("pickles", 1, 4);
/*  95 */   public static final bmj al = bmj.a("power", 0, 15);
/*  96 */   public static final bmj am = bmj.a("stage", 0, 1);
/*     */ 
/*     */   
/*  99 */   public static final bmj an = bmj.a("rotation", 0, 15);
/*     */   
/* 101 */   public static final bmh<blz> ao = bmh.a("part", blz.class);
/* 102 */   public static final bmh<bmc> ap = bmh.a("type", bmc.class);
/* 103 */   public static final bmh<bmd> aq = bmh.a("mode", bmd.class);
/* 104 */   public static final bmh<bmf> ar = bmh.a("hinge", bmf.class);
/* 105 */   public static final bmh<bmk> as = bmh.a("instrument", bmk.class);
/* 106 */   public static final bmh<bml> at = bmh.a("type", bml.class);
/* 107 */   public static final bmh<bmp> au = bmh.a("type", bmp.class);
/* 108 */   public static final bmh<bmq> av = bmh.a("shape", bmq.class);
/* 109 */   public static final bmh<bmr> aw = bmh.a("mode", bmr.class);
/*     */ }


/* Location:              F:\dw\server.jar!\bma.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */