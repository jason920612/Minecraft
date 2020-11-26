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
/*     */ public class aea
/*     */ {
/*  17 */   public static final aea a = (new aea("inFire")).o();
/*  18 */   public static final aea b = new aea("lightningBolt");
/*  19 */   public static final aea c = (new aea("onFire")).l().o();
/*  20 */   public static final aea d = (new aea("lava")).o();
/*  21 */   public static final aea e = (new aea("hotFloor")).o();
/*  22 */   public static final aea f = (new aea("inWall")).l();
/*  23 */   public static final aea g = (new aea("cramming")).l();
/*  24 */   public static final aea h = (new aea("drown")).l();
/*  25 */   public static final aea i = (new aea("starve")).l().n();
/*  26 */   public static final aea j = new aea("cactus");
/*  27 */   public static final aea k = (new aea("fall")).l();
/*  28 */   public static final aea l = (new aea("flyIntoWall")).l();
/*  29 */   public static final aea m = (new aea("outOfWorld")).l().m();
/*  30 */   public static final aea n = (new aea("generic")).l();
/*  31 */   public static final aea o = (new aea("magic")).l().u();
/*  32 */   public static final aea p = (new aea("wither")).l();
/*  33 */   public static final aea q = new aea("anvil");
/*  34 */   public static final aea r = new aea("fallingBlock");
/*  35 */   public static final aea s = (new aea("dragonBreath")).l();
/*  36 */   public static final aea t = (new aea("fireworks")).e();
/*  37 */   public static final aea u = new aea("dryout"); private boolean w;
/*     */   
/*     */   public static aea a(afa ☃) {
/*  40 */     return new aeb("mob", ☃);
/*     */   }
/*     */   private boolean x; private boolean y;
/*     */   public static aea a(aer ☃, afa afa1) {
/*  44 */     return new aec("mob", ☃, afa1);
/*     */   }
/*     */   
/*     */   public static aea a(aog ☃) {
/*  48 */     return new aeb("player", ☃);
/*     */   }
/*     */   
/*     */   public static aea a(aok ☃, @Nullable aer aer1) {
/*  52 */     return (new aec("arrow", ☃, aer1)).c();
/*     */   }
/*     */   
/*     */   public static aea a(aer ☃, @Nullable aer aer1) {
/*  56 */     return (new aec("trident", ☃, aer1)).c();
/*     */   }
/*     */   
/*     */   public static aea a(aol ☃, @Nullable aer aer1) {
/*  60 */     if (aer1 == null) {
/*  61 */       return (new aec("onFire", ☃, ☃)).o().c();
/*     */     }
/*  63 */     return (new aec("fireball", ☃, aer1)).o().c();
/*     */   }
/*     */   
/*     */   public static aea b(aer ☃, @Nullable aer aer1) {
/*  67 */     return (new aec("thrown", ☃, aer1)).c();
/*     */   }
/*     */   
/*     */   public static aea c(aer ☃, @Nullable aer aer1) {
/*  71 */     return (new aec("indirectMagic", ☃, aer1)).l().u();
/*     */   }
/*     */   
/*     */   public static aea a(aer ☃) {
/*  75 */     return (new aeb("thorns", ☃)).x().u();
/*     */   }
/*     */   
/*     */   public static aea a(@Nullable axr ☃) {
/*  79 */     if (☃ != null && ☃.d() != null) {
/*  80 */       return (new aeb("explosion.player", ☃.d())).r().e();
/*     */     }
/*  82 */     return (new aea("explosion")).r().e();
/*     */   }
/*     */ 
/*     */   
/*     */   public static aea b(@Nullable afa ☃) {
/*  87 */     if (☃ != null) {
/*  88 */       return (new aeb("explosion.player", ☃)).r().e();
/*     */     }
/*  90 */     return (new aea("explosion")).r().e();
/*     */   }
/*     */ 
/*     */   
/*     */   public static aea a() {
/*  95 */     return new aed();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 102 */   private float z = 0.1F; private boolean A;
/*     */   private boolean B;
/*     */   private boolean C;
/*     */   private boolean D;
/*     */   private boolean E;
/*     */   public final String v;
/*     */   
/*     */   public boolean b() {
/* 110 */     return this.B;
/*     */   }
/*     */   
/*     */   public aea c() {
/* 114 */     this.B = true;
/* 115 */     return this;
/*     */   }
/*     */   
/*     */   public boolean d() {
/* 119 */     return this.E;
/*     */   }
/*     */   
/*     */   public aea e() {
/* 123 */     this.E = true;
/* 124 */     return this;
/*     */   }
/*     */   
/*     */   public boolean f() {
/* 128 */     return this.w;
/*     */   }
/*     */   
/*     */   public float g() {
/* 132 */     return this.z;
/*     */   }
/*     */   
/*     */   public boolean h() {
/* 136 */     return this.x;
/*     */   }
/*     */   
/*     */   public boolean i() {
/* 140 */     return this.y;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected aea(String ☃) {
/* 146 */     this.v = ☃;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public aer j() {
/* 151 */     return k();
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public aer k() {
/* 156 */     return null;
/*     */   }
/*     */   
/*     */   protected aea l() {
/* 160 */     this.w = true;
/*     */     
/* 162 */     this.z = 0.0F;
/* 163 */     return this;
/*     */   }
/*     */   
/*     */   protected aea m() {
/* 167 */     this.x = true;
/* 168 */     return this;
/*     */   }
/*     */   
/*     */   protected aea n() {
/* 172 */     this.y = true;
/*     */     
/* 174 */     this.z = 0.0F;
/* 175 */     return this;
/*     */   }
/*     */   
/*     */   protected aea o() {
/* 179 */     this.A = true;
/* 180 */     return this;
/*     */   }
/*     */   
/*     */   public ij c(afa ☃) {
/* 184 */     afa afa1 = ☃.cv();
/* 185 */     String str1 = "death.attack." + this.v;
/* 186 */     String str2 = str1 + ".player";
/*     */     
/* 188 */     if (afa1 != null) {
/* 189 */       return new ir(str2, new Object[] { ☃.O(), afa1.O() });
/*     */     }
/* 191 */     return new ir(str1, new Object[] { ☃.O() });
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean p() {
/* 196 */     return this.A;
/*     */   }
/*     */   
/*     */   public String q() {
/* 200 */     return this.v;
/*     */   }
/*     */   
/*     */   public aea r() {
/* 204 */     this.C = true;
/* 205 */     return this;
/*     */   }
/*     */   
/*     */   public boolean s() {
/* 209 */     return this.C;
/*     */   }
/*     */   
/*     */   public boolean t() {
/* 213 */     return this.D;
/*     */   }
/*     */   
/*     */   public aea u() {
/* 217 */     this.D = true;
/* 218 */     return this;
/*     */   }
/*     */   
/*     */   public boolean v() {
/* 222 */     aer ☃ = k();
/* 223 */     return (☃ instanceof aog && ((aog)☃).bV.d);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public cee w() {
/* 228 */     return null;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\aea.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */