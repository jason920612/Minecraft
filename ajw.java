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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ajw
/*     */   extends ajo
/*     */ {
/*  48 */   protected static final or<Byte> a = ou.a((Class)ajw.class, ot.a);
/*     */   
/*     */   private int b;
/*     */   @Nullable
/*     */   private ajg c;
/*     */   private int bC;
/*     */   private int bD;
/*     */   
/*     */   public ajw(axy ☃) {
/*  57 */     super(aev.aC, ☃);
/*  58 */     a(1.4F, 2.7F);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void n() {
/*  63 */     this.by.a(1, new ahe(this, 1.0D, true));
/*  64 */     this.by.a(2, new ahj(this, 0.9D, 32.0F));
/*  65 */     this.by.a(3, new ahg(this, 0.6D, true));
/*  66 */     this.by.a(4, new ahi(this, 1.0D));
/*  67 */     this.by.a(5, new ahm(this));
/*  68 */     this.by.a(6, new aih(this, 0.6D));
/*  69 */     this.by.a(7, new ahb(this, (Class)aog.class, 6.0F));
/*  70 */     this.by.a(8, new ahq(this));
/*     */     
/*  72 */     this.bz.a(1, new aik(this));
/*  73 */     this.bz.a(2, new ail(this, false, new Class[0]));
/*  74 */     this.bz.a(3, new aio<>(this, afb.class, 10, false, true, ☃ -> (☃ != null && amy.e.test(☃) && !(☃ instanceof amt))));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void x_() {
/*  79 */     super.x_();
/*  80 */     this.ab.a(a, Byte.valueOf((byte)0));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void J() {
/*  85 */     if (--this.b <= 0) {
/*  86 */       this.b = 70 + this.T.nextInt(50);
/*  87 */       this.c = this.m.af().a(new el(this), 32);
/*  88 */       if (this.c == null) {
/*  89 */         dv();
/*     */       } else {
/*  91 */         el ☃ = this.c.a();
/*  92 */         a(☃, (int)(this.c.b() * 0.6F));
/*     */       } 
/*     */     } 
/*     */     
/*  96 */     super.J();
/*     */   }
/*     */ 
/*     */   
/*     */   protected void bZ() {
/* 101 */     super.bZ();
/*     */     
/* 103 */     a(ank.a).a(100.0D);
/* 104 */     a(ank.d).a(0.25D);
/* 105 */     a(ank.c).a(1.0D);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected int k(int ☃) {
/* 111 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void C(aer ☃) {
/* 116 */     if (☃ instanceof amy && !(☃ instanceof amt) && 
/* 117 */       ce().nextInt(20) == 0) {
/* 118 */       e((afa)☃);
/*     */     }
/*     */     
/* 121 */     super.C(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void k() {
/* 126 */     super.k();
/*     */     
/* 128 */     if (this.bC > 0) {
/* 129 */       this.bC--;
/*     */     }
/* 131 */     if (this.bD > 0) {
/* 132 */       this.bD--;
/*     */     }
/*     */     
/* 135 */     if (this.t * this.t + this.v * this.v > 2.500000277905201E-7D && this.T.nextInt(5) == 0) {
/* 136 */       int ☃ = xq.c(this.q);
/* 137 */       int i = xq.c(this.r - 0.20000000298023224D);
/* 138 */       int j = xq.c(this.s);
/* 139 */       blc blc = this.m.a_(new el(☃, i, j));
/* 140 */       if (!blc.f()) {
/* 141 */         this.m.a(new fh(fm.d, blc), this.q + (this.T.nextFloat() - 0.5D) * this.H, (bD()).b + 0.1D, this.s + (this.T.nextFloat() - 0.5D) * this.H, 4.0D * (this.T.nextFloat() - 0.5D), 0.5D, (this.T.nextFloat() - 0.5D) * 4.0D);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(Class<? extends afa> ☃) {
/* 148 */     if (dA() && aog.class.isAssignableFrom(☃)) {
/* 149 */       return false;
/*     */     }
/* 151 */     if (☃ == amt.class) {
/* 152 */       return false;
/*     */     }
/* 154 */     return super.b(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(gy ☃) {
/* 159 */     super.b(☃);
/* 160 */     ☃.a("PlayerCreated", dA());
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(gy ☃) {
/* 165 */     super.a(☃);
/* 166 */     s(☃.q("PlayerCreated"));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean B(aer ☃) {
/* 171 */     this.bC = 10;
/* 172 */     this.m.a(this, (byte)4);
/* 173 */     boolean bool = ☃.a(aea.a(this), (7 + this.T.nextInt(15)));
/* 174 */     if (bool) {
/* 175 */       ☃.u += 0.4000000059604645D;
/* 176 */       a(this, ☃);
/*     */     } 
/* 178 */     a(wj.es, 1.0F, 1.0F);
/* 179 */     return bool;
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
/*     */   public ajg l() {
/* 197 */     return this.c;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(boolean ☃) {
/* 205 */     if (☃) {
/* 206 */       this.bD = 400;
/* 207 */       this.m.a(this, (byte)11);
/*     */     } else {
/* 209 */       this.bD = 0;
/* 210 */       this.m.a(this, (byte)34);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi d(aea ☃) {
/* 216 */     return wj.eu;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi cs() {
/* 221 */     return wj.et;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(el ☃, blc blc1) {
/* 226 */     a(wj.ev, 1.0F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   protected pc G() {
/* 232 */     return ccl.G;
/*     */   }
/*     */   
/*     */   public int dz() {
/* 236 */     return this.bD;
/*     */   }
/*     */   
/*     */   public boolean dA() {
/* 240 */     return ((((Byte)this.ab.<Byte>a(a)).byteValue() & 0x1) != 0);
/*     */   }
/*     */   
/*     */   public void s(boolean ☃) {
/* 244 */     byte b = ((Byte)this.ab.<Byte>a(a)).byteValue();
/* 245 */     if (☃) {
/* 246 */       this.ab.b(a, Byte.valueOf((byte)(b | 0x1)));
/*     */     } else {
/* 248 */       this.ab.b(a, Byte.valueOf((byte)(b & 0xFFFFFFFE)));
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(aea ☃) {
/* 254 */     if (!dA() && this.aV != null && this.c != null) {
/* 255 */       this.c.a(this.aV.do().getName(), -5);
/*     */     }
/* 257 */     super.a(☃);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(ayc ☃) {
/* 263 */     el el = new el(this.q, this.r, this.s);
/* 264 */     blc blc1 = ☃.a_(el);
/* 265 */     blc blc2 = ☃.a_(el.b());
/* 266 */     blc blc3 = ☃.a_(el.a());
/* 267 */     return (blc2.q() && 
/* 268 */       ayj.a(blc3, blc3.s()) && 
/* 269 */       ayj.a(blc1, byy.a.i()) && ☃
/* 270 */       .c(this, bD()) && ☃
/* 271 */       .a_(this, bD()));
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\ajw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */