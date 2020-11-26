/*     */ import com.google.common.collect.Maps;
/*     */ import java.util.Map;
/*     */ import java.util.UUID;
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
/*     */ public class aej
/*     */ {
/*     */   @Nullable
/*     */   public static aej a(int ☃) {
/*  27 */     return fc.t.a(☃);
/*     */   }
/*     */   
/*     */   public static int a(aej ☃) {
/*  31 */     return fc.t.a(☃);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  39 */   private final Map<afm, afo> a = Maps.newHashMap();
/*     */   private final boolean b;
/*     */   private final int c;
/*     */   @Nullable
/*     */   private String d;
/*  44 */   private int e = -1;
/*     */   private double f;
/*     */   private boolean g;
/*     */   
/*     */   protected aej(boolean ☃, int i) {
/*  49 */     this.b = ☃;
/*  50 */     if (☃) {
/*  51 */       this.f = 0.5D;
/*     */     } else {
/*  53 */       this.f = 1.0D;
/*     */     } 
/*  55 */     this.c = i;
/*     */   }
/*     */   
/*     */   protected aej b(int ☃, int i) {
/*  59 */     this.e = ☃ + i * 12;
/*  60 */     return this;
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
/*     */   public void a(afa ☃, int i) {
/*  76 */     if (this == aem.j) {
/*  77 */       if (☃.cq() < ☃.cw()) {
/*  78 */         ☃.c(1.0F);
/*     */       }
/*  80 */     } else if (this == aem.s) {
/*  81 */       if (☃.cq() > 1.0F) {
/*  82 */         ☃.a(aea.o, 1.0F);
/*     */       }
/*  84 */     } else if (this == aem.t) {
/*  85 */       ☃.a(aea.p, 1.0F);
/*  86 */     } else if (this == aem.q && ☃ instanceof aog) {
/*     */ 
/*     */       
/*  89 */       ((aog)☃).a(0.005F * (i + 1));
/*  90 */     } else if (this == aem.w && ☃ instanceof aog) {
/*  91 */       if (!☃.m.B) {
/*  92 */         ((aog)☃).dw().a(i + 1, 1.0F);
/*     */       }
/*  94 */     } else if ((this == aem.f && !☃.cp()) || (this == aem.g && ☃.cp())) {
/*  95 */       ☃.c(Math.max(4 << i, 0));
/*  96 */     } else if ((this == aem.g && !☃.cp()) || (this == aem.f && ☃.cp())) {
/*  97 */       ☃.a(aea.o, (6 << i));
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(@Nullable aer ☃, @Nullable aer aer1, afa afa1, int i, double d) {
/* 102 */     if ((this == aem.f && !afa1.cp()) || (this == aem.g && afa1.cp())) {
/* 103 */       int j = (int)(d * (4 << i) + 0.5D);
/* 104 */       afa1.c(j);
/* 105 */     } else if ((this == aem.g && !afa1.cp()) || (this == aem.f && afa1.cp())) {
/* 106 */       int j = (int)(d * (6 << i) + 0.5D);
/* 107 */       if (☃ == null) {
/* 108 */         afa1.a(aea.o, j);
/*     */       } else {
/* 110 */         afa1.a(aea.c(☃, aer1), j);
/*     */       } 
/*     */     } else {
/* 113 */       a(afa1, i);
/*     */     } 
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
/*     */   public boolean a(int ☃, int i) {
/* 128 */     if (this == aem.j) {
/* 129 */       int j = 50 >> i;
/* 130 */       if (j > 0) {
/* 131 */         return (☃ % j == 0);
/*     */       }
/* 133 */       return true;
/* 134 */     }  if (this == aem.s) {
/* 135 */       int j = 25 >> i;
/* 136 */       if (j > 0) {
/* 137 */         return (☃ % j == 0);
/*     */       }
/* 139 */       return true;
/* 140 */     }  if (this == aem.t) {
/* 141 */       int j = 40 >> i;
/* 142 */       if (j > 0) {
/* 143 */         return (☃ % j == 0);
/*     */       }
/* 145 */       return true;
/* 146 */     }  if (this == aem.q) {
/* 147 */       return true;
/*     */     }
/*     */     
/* 150 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a() {
/* 155 */     return false;
/*     */   }
/*     */   
/*     */   protected String b() {
/* 159 */     if (this.d == null) {
/* 160 */       this.d = k.a("effect", fc.t.b(this));
/*     */     }
/* 162 */     return this.d;
/*     */   }
/*     */   
/*     */   public String c() {
/* 166 */     return b();
/*     */   }
/*     */   
/*     */   public ij d() {
/* 170 */     return new ir(c(), new Object[0]);
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
/*     */   protected aej a(double ☃) {
/* 186 */     this.f = ☃;
/* 187 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int i() {
/* 195 */     return this.c;
/*     */   }
/*     */   
/*     */   public aej a(afm ☃, String str, double d, int i) {
/* 199 */     afo afo = new afo(UUID.fromString(str), this::c, d, i);
/* 200 */     this.a.put(☃, afo);
/* 201 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(afa ☃, afq afq1, int i) {
/* 209 */     for (Map.Entry<afm, afo> entry : this.a.entrySet()) {
/* 210 */       afn afn = afq1.a(entry.getKey());
/*     */       
/* 212 */       if (afn != null) {
/* 213 */         afn.c(entry.getValue());
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public void b(afa ☃, afq afq1, int i) {
/* 219 */     for (Map.Entry<afm, afo> entry : this.a.entrySet()) {
/* 220 */       afn afn = afq1.a(entry.getKey());
/*     */       
/* 222 */       if (afn != null) {
/* 223 */         afo afo = entry.getValue();
/* 224 */         afn.c(afo);
/* 225 */         afn.b(new afo(afo.a(), c() + " " + i, a(i, afo), afo.c()));
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public double a(int ☃, afo afo1) {
/* 231 */     return afo1.d() * (☃ + 1);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public aej l() {
/* 239 */     this.g = true;
/* 240 */     return this;
/*     */   }
/*     */   
/*     */   public static void m() {
/* 244 */     a(1, "speed", (new aej(false, 8171462)).b(0, 0).a(ank.d, "91AEAA56-376B-4498-935B-2F7F68070635", 0.20000000298023224D, 2).l());
/* 245 */     a(2, "slowness", (new aej(true, 5926017)).b(1, 0).a(ank.d, "7107DE5E-7CE8-4030-940E-514C1F160890", -0.15000000596046448D, 2));
/* 246 */     a(3, "haste", (new aej(false, 14270531)).b(2, 0).a(1.5D).l().a(ank.g, "AF8B6E3F-3328-4C0A-AA36-5BA2BB9DBEF3", 0.10000000149011612D, 2));
/* 247 */     a(4, "mining_fatigue", (new aej(true, 4866583)).b(3, 0).a(ank.g, "55FCED67-E92A-486E-9800-B47F202C4386", -0.10000000149011612D, 2));
/* 248 */     a(5, "strength", (new aeg(false, 9643043, 3.0D)).b(4, 0).a(ank.f, "648D7064-6A60-4F59-8ABE-C2C23A6DD7A9", 0.0D, 0).l());
/* 249 */     a(6, "instant_health", (new aei(false, 16262179)).l());
/* 250 */     a(7, "instant_damage", (new aei(true, 4393481)).l());
/* 251 */     a(8, "jump_boost", (new aej(false, 2293580)).b(2, 1).l());
/* 252 */     a(9, "nausea", (new aej(true, 5578058)).b(3, 1).a(0.25D));
/* 253 */     a(10, "regeneration", (new aej(false, 13458603)).b(7, 0).a(0.25D).l());
/* 254 */     a(11, "resistance", (new aej(false, 10044730)).b(6, 1).l());
/* 255 */     a(12, "fire_resistance", (new aej(false, 14981690)).b(7, 1).l());
/* 256 */     a(13, "water_breathing", (new aej(false, 3035801)).b(0, 2).l());
/* 257 */     a(14, "invisibility", (new aej(false, 8356754)).b(0, 1).l());
/* 258 */     a(15, "blindness", (new aej(true, 2039587)).b(5, 1).a(0.25D));
/* 259 */     a(16, "night_vision", (new aej(false, 2039713)).b(4, 1).l());
/* 260 */     a(17, "hunger", (new aej(true, 5797459)).b(1, 1));
/* 261 */     a(18, "weakness", (new aeg(true, 4738376, -4.0D)).b(5, 0).a(ank.f, "22653B89-116E-49DC-9B6B-9971489B5BE5", 0.0D, 0));
/* 262 */     a(19, "poison", (new aej(true, 5149489)).b(6, 0).a(0.25D));
/* 263 */     a(20, "wither", (new aej(true, 3484199)).b(1, 2).a(0.25D));
/* 264 */     a(21, "health_boost", (new aeh(false, 16284963)).b(7, 2).a(ank.a, "5D6F0BA2-1186-46AC-B896-C61C5CEE99CC", 4.0D, 0).l());
/* 265 */     a(22, "absorption", (new aef(false, 2445989)).b(2, 2).l());
/* 266 */     a(23, "saturation", (new aei(false, 16262179)).l());
/* 267 */     a(24, "glowing", (new aej(false, 9740385)).b(4, 2));
/* 268 */     a(25, "levitation", (new aej(true, 13565951)).b(3, 2));
/* 269 */     a(26, "luck", (new aej(false, 3381504)).b(5, 2).l().a(ank.j, "03C3C89D-7037-4B42-869F-B146BCB64D2E", 1.0D, 0));
/* 270 */     a(27, "unluck", (new aej(true, 12624973)).b(6, 2).a(ank.j, "CC5AF142-2BD2-4215-B636-2605AED11727", -1.0D, 0));
/* 271 */     a(28, "slow_falling", (new aej(false, 16773073)).b(8, 0).l());
/* 272 */     a(29, "conduit_power", (new aej(false, 1950417)).b(9, 0).l());
/* 273 */     a(30, "dolphins_grace", (new aej(false, 8954814)).b(10, 0).l());
/*     */   }
/*     */ 
/*     */   
/*     */   private static void a(int ☃, String str, aej aej1) {
/* 278 */     fc.t.a(☃, new pc(str), aej1);
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\aej.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */