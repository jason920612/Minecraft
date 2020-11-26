/*     */ import java.util.Collection;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class amt
/*     */   extends ang
/*     */ {
/*  41 */   private static final or<Integer> a = ou.a((Class)amt.class, ot.b);
/*  42 */   private static final or<Boolean> b = ou.a((Class)amt.class, ot.i);
/*  43 */   private static final or<Boolean> c = ou.a((Class)amt.class, ot.i);
/*     */   
/*     */   private int bC;
/*     */   private int bD;
/*  47 */   private int bE = 30;
/*  48 */   private int bF = 3;
/*     */   private int bG;
/*     */   
/*     */   public amt(axy ☃) {
/*  52 */     super(aev.k, ☃);
/*     */     
/*  54 */     a(0.6F, 1.7F);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void n() {
/*  59 */     this.by.a(1, new agm(this));
/*  60 */     this.by.a(2, new aia(this));
/*  61 */     this.by.a(3, new agd<>(this, ajy.class, 6.0F, 1.0D, 1.2D));
/*  62 */     this.by.a(4, new ahe(this, 1.0D, false));
/*  63 */     this.by.a(5, new aih(this, 0.8D));
/*  64 */     this.by.a(6, new ahb(this, (Class)aog.class, 8.0F));
/*  65 */     this.by.a(6, new ahq(this));
/*     */     
/*  67 */     this.bz.a(1, new aio<>(this, aog.class, true));
/*  68 */     this.bz.a(2, new ail(this, false, new Class[0]));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void bZ() {
/*  73 */     super.bZ();
/*     */     
/*  75 */     a(ank.d).a(0.25D);
/*     */   }
/*     */ 
/*     */   
/*     */   public int bn() {
/*  80 */     if (v() == null) {
/*  81 */       return 3;
/*     */     }
/*     */     
/*  84 */     return 3 + (int)(cq() - 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public void c(float ☃, float f1) {
/*  89 */     super.c(☃, f1);
/*     */     
/*  91 */     this.bD = (int)(this.bD + ☃ * 1.5F);
/*  92 */     if (this.bD > this.bE - 5) {
/*  93 */       this.bD = this.bE - 5;
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected void x_() {
/*  99 */     super.x_();
/*     */     
/* 101 */     this.ab.a(a, Integer.valueOf(-1));
/* 102 */     this.ab.a(b, Boolean.valueOf(false));
/* 103 */     this.ab.a(c, Boolean.valueOf(false));
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(gy ☃) {
/* 108 */     super.b(☃);
/* 109 */     if (((Boolean)this.ab.<Boolean>a(b)).booleanValue()) {
/* 110 */       ☃.a("powered", true);
/*     */     }
/* 112 */     ☃.a("Fuse", (short)this.bE);
/* 113 */     ☃.a("ExplosionRadius", (byte)this.bF);
/* 114 */     ☃.a("ignited", dA());
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(gy ☃) {
/* 119 */     super.a(☃);
/* 120 */     this.ab.b(b, Boolean.valueOf(☃.q("powered")));
/* 121 */     if (☃.c("Fuse", 99)) {
/* 122 */       this.bE = ☃.g("Fuse");
/*     */     }
/* 124 */     if (☃.c("ExplosionRadius", 99)) {
/* 125 */       this.bF = ☃.f("ExplosionRadius");
/*     */     }
/* 127 */     if (☃.q("ignited")) {
/* 128 */       dB();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void R_() {
/* 134 */     if (aF()) {
/* 135 */       this.bC = this.bD;
/*     */ 
/*     */       
/* 138 */       if (dA()) {
/* 139 */         a(1);
/*     */       }
/*     */       
/* 142 */       int ☃ = dz();
/* 143 */       if (☃ > 0 && this.bD == 0) {
/* 144 */         a(wj.ba, 1.0F, 0.5F);
/*     */       }
/* 146 */       this.bD += ☃;
/* 147 */       if (this.bD < 0) {
/* 148 */         this.bD = 0;
/*     */       }
/* 150 */       if (this.bD >= this.bE) {
/* 151 */         this.bD = this.bE;
/* 152 */         dE();
/*     */       } 
/*     */     } 
/* 155 */     super.R_();
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi d(aea ☃) {
/* 160 */     return wj.aZ;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi cs() {
/* 165 */     return wj.aY;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(aea ☃) {
/* 170 */     super.a(☃);
/*     */     
/* 172 */     if (this.m.X().b("doMobLoot")) {
/* 173 */       if (☃.k() instanceof ann) {
/* 174 */         a(atr.a(this.T));
/* 175 */       } else if (☃.k() instanceof amt && 
/* 176 */         ☃.k() != this && ((amt)☃.k()).l() && ((amt)☃.k()).dC()) {
/* 177 */         ((amt)☃.k()).dD();
/* 178 */         a(atf.dL);
/*     */       } 
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean B(aer ☃) {
/* 186 */     return true;
/*     */   }
/*     */   
/*     */   public boolean l() {
/* 190 */     return ((Boolean)this.ab.<Boolean>a(b)).booleanValue();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   protected pc G() {
/* 200 */     return ccl.x;
/*     */   }
/*     */   
/*     */   public int dz() {
/* 204 */     return ((Integer)this.ab.<Integer>a(a)).intValue();
/*     */   }
/*     */   
/*     */   public void a(int ☃) {
/* 208 */     this.ab.b(a, Integer.valueOf(☃));
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(amj ☃) {
/* 213 */     super.a(☃);
/* 214 */     this.ab.b(b, Boolean.valueOf(true));
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean a(aog ☃, adk adk1) {
/* 219 */     ate ate = ☃.b(adk1);
/* 220 */     if (ate.b() == atf.e) {
/* 221 */       this.m.a(☃, this.q, this.r, this.s, wj.cK, bV(), 1.0F, this.T.nextFloat() * 0.4F + 0.8F);
/* 222 */       ☃.a(adk1);
/* 223 */       if (!this.m.B) {
/* 224 */         dB();
/* 225 */         ate.a(1, ☃);
/* 226 */         return true;
/*     */       } 
/*     */     } 
/*     */     
/* 230 */     return super.a(☃, adk1);
/*     */   }
/*     */   
/*     */   private void dE() {
/* 234 */     if (!this.m.B) {
/* 235 */       boolean ☃ = this.m.X().b("mobGriefing");
/* 236 */       float f = l() ? 2.0F : 1.0F;
/* 237 */       this.aX = true;
/* 238 */       this.m.a(this, this.q, this.r, this.s, this.bF * f, ☃);
/* 239 */       V();
/* 240 */       dF();
/*     */     } 
/*     */   }
/*     */   
/*     */   private void dF() {
/* 245 */     Collection<aek> ☃ = cn();
/* 246 */     if (!☃.isEmpty()) {
/* 247 */       aep aep = new aep(this.m, this.q, this.r, this.s);
/* 248 */       aep.a(2.5F);
/* 249 */       aep.b(-0.5F);
/* 250 */       aep.d(10);
/* 251 */       aep.b(aep.m() / 2);
/* 252 */       aep.c(-aep.f() / aep.m());
/* 253 */       for (aek aek : ☃) {
/* 254 */         aep.a(new aek(aek));
/*     */       }
/* 256 */       this.m.a(aep);
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean dA() {
/* 261 */     return ((Boolean)this.ab.<Boolean>a(c)).booleanValue();
/*     */   }
/*     */   
/*     */   public void dB() {
/* 265 */     this.ab.b(c, Boolean.valueOf(true));
/*     */   }
/*     */   
/*     */   public boolean dC() {
/* 269 */     return (this.bG < 1 && this.m.X().b("doMobLoot"));
/*     */   }
/*     */   
/*     */   public void dD() {
/* 273 */     this.bG++;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\amt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */