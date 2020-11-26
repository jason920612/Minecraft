/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Locale;
/*     */ import java.util.Map;
/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class bqo<C extends bqp>
/*     */ {
/*  22 */   private static final List<ayu.e> a = Lists.newArrayList();
/*     */   
/*  24 */   public static final btl<btu> e = new btv();
/*  25 */   public static final btl<brt> f = new bru();
/*  26 */   public static final btl<btz> g = new bua();
/*  27 */   public static final btl<bri> h = new brj();
/*  28 */   public static final btl<bqb> i = new bqc();
/*  29 */   public static final btl<brf> j = new brg();
/*  30 */   public static final btl<bsy> k = new bsz();
/*  31 */   public static final btl<bto> l = new btp();
/*  32 */   public static final btl<btj> m = new btk();
/*  33 */   public static final btl<bsa> n = new bsb();
/*  34 */   public static final btl<bsc> o = new bwt();
/*  35 */   public static final btl<brw> p = new brx();
/*  36 */   public static final btl<bqi> q = new bqj();
/*  37 */   public static final btl<bph> r = new bpi();
/*     */   
/*  39 */   public static final bpa<brz> s = new bpb(false);
/*  40 */   public static final bpa<brz> t = new bpc(false, false);
/*  41 */   public static final bpa<brz> u = new bpc(false, true);
/*  42 */   public static final bpa<brz> v = new bqv(bct.M.p(), bct.ah.p());
/*  43 */   public static final bpa<brz> w = new brk(false, 4, bct.M.p(), bct.ak.p(), true);
/*  44 */   public static final bpa<brz> x = new bsf();
/*  45 */   public static final bpa<brz> y = new bst(false);
/*  46 */   public static final bpa<brz> z = new bsu(false);
/*  47 */   public static final bpa<brz> A = new bti(false);
/*  48 */   public static final bpa<brz> B = new btn();
/*  49 */   public static final bpa<brz> C = new btt(false);
/*  50 */   public static final brr<brz> D = new brp(false, 10, 20, bct.M.p(), bct.ak.p());
/*  51 */   public static final brr<brz> E = new brq(false, false);
/*  52 */   public static final brr<brz> F = new brq(false, true);
/*  53 */   public static final bqs G = new bqa();
/*  54 */   public static final bqs H = new bqt();
/*  55 */   public static final bqs I = new bsg();
/*  56 */   public static final bqs J = new btm();
/*  57 */   public static final bqo<brz> K = new brh();
/*  58 */   public static final bqo<brz> L = new btq();
/*  59 */   public static final bqo<btr> M = new bts();
/*  60 */   public static final bqo<brz> N = new btx();
/*  61 */   public static final bqo<brz> O = new bpl();
/*  62 */   public static final bqo<brz> P = new bpv();
/*  63 */   public static final bqo<brz> Q = new bqd();
/*  64 */   public static final bqo<brz> R = new bqu();
/*  65 */   public static final bqo<brz> S = new bqw();
/*  66 */   public static final bqo<brz> T = new bra();
/*  67 */   public static final bqo<brz> U = new bqz();
/*  68 */   public static final bqo<brz> V = new brc();
/*  69 */   public static final bqo<brz> W = new bro();
/*  70 */   public static final bqo<brz> X = new brs();
/*  71 */   public static final bqo<brz> Y = new bsi();
/*  72 */   public static final bqo<brz> Z = new bsq();
/*  73 */   public static final bqo<brz> aa = new bte();
/*  74 */   public static final bqo<brz> ab = new btw();
/*  75 */   public static final bqo<brz> ac = new bty();
/*  76 */   public static final bqo<brz> ad = new brv();
/*  77 */   public static final bqo<brz> ae = new bpf();
/*  78 */   public static final bqo<brd> af = new bre();
/*  79 */   public static final bqo<bpd> ag = new bpe();
/*  80 */   public static final bqo<bpj> ah = new bpk();
/*  81 */   public static final bqo<bqe> ai = new bqf();
/*  82 */   public static final bqo<bqg> aj = new bqh();
/*  83 */   public static final bqo<bqx> ak = new bqy();
/*  84 */   public static final bqo<bqq> al = new brb();
/*  85 */   public static final bqo<brm> am = new brn();
/*  86 */   public static final bqo<bsd> an = new bse();
/*  87 */   public static final bqo<bsn> ao = new bsm();
/*  88 */   public static final bqo<bsl> ap = new bsp();
/*  89 */   public static final bqo<btc> aq = new btd();
/*  90 */   public static final bqo<bsj> ar = new bsk();
/*  91 */   public static final bqo<bsr> as = new bss();
/*  92 */   public static final bqo<btg> at = new bth();
/*  93 */   public static final bqo<brz> au = new btf();
/*  94 */   public static final bqo<brz> av = new bqm();
/*  95 */   public static final bqo<brz> aw = new bpm();
/*  96 */   public static final bqo<bqk> ax = new bql();
/*  97 */   public static final bqo<bsx> ay = new bsw();
/*  98 */   public static final bqo<brz> az = new brl();
/*  99 */   public static final bqo<brz> aA = new bpr();
/* 100 */   public static final bqo<brz> aB = new bpq();
/* 101 */   public static final bqo<brz> aC = new bpo();
/* 102 */   public static final bqo<bpu> aD = new bsv();
/* 103 */   public static final bqo<bta> aE = new btb(); public static final Map<String, btl<?>> aF;
/*     */   static {
/* 105 */     aF = k.<Map<String, btl<?>>>a(Maps.newHashMap(), ☃ -> {
/*     */           ☃.put("Village".toLowerCase(Locale.ROOT), e);
/*     */           ☃.put("Mineshaft".toLowerCase(Locale.ROOT), f);
/*     */           ☃.put("Mansion".toLowerCase(Locale.ROOT), g);
/*     */           ☃.put("Jungle_Pyramid".toLowerCase(Locale.ROOT), h);
/*     */           ☃.put("Desert_Pyramid".toLowerCase(Locale.ROOT), i);
/*     */           ☃.put("Igloo".toLowerCase(Locale.ROOT), j);
/*     */           ☃.put("Shipwreck".toLowerCase(Locale.ROOT), k);
/*     */           ☃.put("Swamp_Hut".toLowerCase(Locale.ROOT), l);
/*     */           ☃.put("Stronghold".toLowerCase(Locale.ROOT), m);
/*     */           ☃.put("Monument".toLowerCase(Locale.ROOT), n);
/*     */           ☃.put("Ocean_Ruin".toLowerCase(Locale.ROOT), o);
/*     */           ☃.put("Fortress".toLowerCase(Locale.ROOT), p);
/*     */           ☃.put("EndCity".toLowerCase(Locale.ROOT), q);
/*     */           ☃.put("Buried_Treasure".toLowerCase(Locale.ROOT), r);
/*     */         });
/*     */   }
/*     */   protected final boolean aG;
/*     */   
/*     */   public bqo() {
/* 125 */     this(false);
/*     */   }
/*     */   
/*     */   public bqo(boolean ☃) {
/* 129 */     this.aG = ☃;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(axz ☃, el el1, blc blc1) {
/* 135 */     if (this.aG) {
/* 136 */       ☃.a(el1, blc1, 3);
/*     */     } else {
/* 138 */       ☃.a(el1, blc1, 2);
/*     */     } 
/*     */   }
/*     */   
/*     */   public List<ayu.e> d() {
/* 143 */     return a;
/*     */   }
/*     */   
/*     */   public static boolean a(axz ☃, String str, el el1) {
/* 147 */     return ((btl)aF.get(str.toLowerCase(Locale.ROOT))).c(☃, el1);
/*     */   }
/*     */   
/*     */   public abstract boolean a(axz paramaxz, bmy<? extends bom> parambmy, Random paramRandom, el paramel, C paramC);
/*     */ }


/* Location:              F:\dw\server.jar!\bqo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */