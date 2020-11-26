/*     */ import java.time.LocalDate;
/*     */ import java.time.temporal.ChronoField;
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
/*     */ public class ajl
/*     */   extends ajk
/*     */ {
/*  27 */   private static final or<Byte> a = ou.a((Class)ajl.class, ot.a);
/*     */   
/*     */   private el b;
/*     */ 
/*     */   
/*     */   public ajl(axy ☃) {
/*  33 */     super(aev.d, ☃);
/*     */     
/*  35 */     a(0.5F, 0.9F);
/*  36 */     a(true);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void x_() {
/*  41 */     super.x_();
/*     */     
/*  43 */     this.ab.a(a, Byte.valueOf((byte)0));
/*     */   }
/*     */ 
/*     */   
/*     */   protected float cD() {
/*  48 */     return 0.1F;
/*     */   }
/*     */ 
/*     */   
/*     */   protected float cE() {
/*  53 */     return super.cE() * 0.95F;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public wi D() {
/*  59 */     if (l() && this.T.nextInt(4) != 0) {
/*  60 */       return null;
/*     */     }
/*  62 */     return wj.F;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi d(aea ☃) {
/*  67 */     return wj.H;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi cs() {
/*  72 */     return wj.G;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean aC() {
/*  78 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void C(aer ☃) {}
/*     */ 
/*     */ 
/*     */   
/*     */   protected void cN() {}
/*     */ 
/*     */ 
/*     */   
/*     */   protected void bZ() {
/*  93 */     super.bZ();
/*     */     
/*  95 */     a(ank.a).a(6.0D);
/*     */   }
/*     */   
/*     */   public boolean l() {
/*  99 */     return ((((Byte)this.ab.<Byte>a(a)).byteValue() & 0x1) != 0);
/*     */   }
/*     */   
/*     */   public void a(boolean ☃) {
/* 103 */     byte b = ((Byte)this.ab.<Byte>a(a)).byteValue();
/* 104 */     if (☃) {
/* 105 */       this.ab.b(a, Byte.valueOf((byte)(b | 0x1)));
/*     */     } else {
/* 107 */       this.ab.b(a, Byte.valueOf((byte)(b & 0xFFFFFFFE)));
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void R_() {
/* 113 */     super.R_();
/*     */     
/* 115 */     if (l()) {
/* 116 */       this.t = 0.0D;
/* 117 */       this.u = 0.0D;
/* 118 */       this.v = 0.0D;
/* 119 */       this.r = xq.c(this.r) + 1.0D - this.I;
/*     */     } else {
/* 121 */       this.u *= 0.6000000238418579D;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void J() {
/* 127 */     super.J();
/*     */     
/* 129 */     el ☃ = new el(this);
/* 130 */     el el1 = ☃.a();
/*     */     
/* 132 */     if (l()) {
/* 133 */       if (this.m.a_(el1).l()) {
/* 134 */         if (this.T.nextInt(200) == 0) {
/* 135 */           this.aS = this.T.nextInt(360);
/*     */         }
/*     */         
/* 138 */         if (this.m.b(this, 4.0D) != null) {
/* 139 */           a(false);
/* 140 */           this.m.a((aog)null, 1025, ☃, 0);
/*     */         } 
/*     */       } else {
/* 143 */         a(false);
/* 144 */         this.m.a((aog)null, 1025, ☃, 0);
/*     */       } 
/*     */     } else {
/* 147 */       if (this.b != null && (!this.m.c(this.b) || this.b.p() < 1)) {
/* 148 */         this.b = null;
/*     */       }
/* 150 */       if (this.b == null || this.T.nextInt(30) == 0 || this.b.f((int)this.q, (int)this.r, (int)this.s) < 4.0D) {
/* 151 */         this.b = new el((int)this.q + this.T.nextInt(7) - this.T.nextInt(7), (int)this.r + this.T.nextInt(6) - 2, (int)this.s + this.T.nextInt(7) - this.T.nextInt(7));
/*     */       }
/*     */       
/* 154 */       double d1 = this.b.o() + 0.5D - this.q;
/* 155 */       double d2 = this.b.p() + 0.1D - this.r;
/* 156 */       double d3 = this.b.q() + 0.5D - this.s;
/*     */       
/* 158 */       this.t += (Math.signum(d1) * 0.5D - this.t) * 0.10000000149011612D;
/* 159 */       this.u += (Math.signum(d2) * 0.699999988079071D - this.u) * 0.10000000149011612D;
/* 160 */       this.v += (Math.signum(d3) * 0.5D - this.v) * 0.10000000149011612D;
/*     */       
/* 162 */       float f1 = (float)(xq.c(this.v, this.t) * 57.2957763671875D) - 90.0F;
/* 163 */       float f2 = xq.g(f1 - this.w);
/* 164 */       this.bj = 0.5F;
/* 165 */       this.w += f2;
/*     */       
/* 167 */       if (this.T.nextInt(100) == 0 && this.m.a_(el1).l()) {
/* 168 */         a(true);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean ak() {
/* 175 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void c(float ☃, float f1) {}
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(double ☃, boolean bool, blc blc1, el el1) {}
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean br() {
/* 190 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(aea ☃, float f) {
/* 195 */     if (b(☃)) {
/* 196 */       return false;
/*     */     }
/* 198 */     if (!this.m.B && 
/* 199 */       l()) {
/* 200 */       a(false);
/*     */     }
/*     */ 
/*     */     
/* 204 */     return super.a(☃, f);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(gy ☃) {
/* 209 */     super.a(☃);
/*     */     
/* 211 */     this.ab.b(a, Byte.valueOf(☃.f("BatFlags")));
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(gy ☃) {
/* 216 */     super.b(☃);
/*     */     
/* 218 */     ☃.a("BatFlags", ((Byte)this.ab.<Byte>a(a)).byteValue());
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(axz ☃, boolean bool) {
/* 223 */     el el1 = new el(this.q, (bD()).b, this.s);
/* 224 */     if (el1.p() >= ☃.k()) {
/* 225 */       return false;
/*     */     }
/*     */     
/* 228 */     int i = ☃.C(el1);
/* 229 */     int j = 4;
/*     */     
/* 231 */     if (dr()) {
/* 232 */       j = 7;
/* 233 */     } else if (this.T.nextBoolean()) {
/* 234 */       return false;
/*     */     } 
/*     */     
/* 237 */     if (i > this.T.nextInt(j)) {
/* 238 */       return false;
/*     */     }
/*     */     
/* 241 */     return super.a(☃, bool);
/*     */   }
/*     */   
/*     */   private boolean dr() {
/* 245 */     LocalDate ☃ = LocalDate.now();
/* 246 */     int i = ☃.get(ChronoField.DAY_OF_MONTH);
/* 247 */     int j = ☃.get(ChronoField.MONTH_OF_YEAR);
/*     */     
/* 249 */     return ((j == 10 && i >= 20) || (j == 11 && i <= 3));
/*     */   }
/*     */ 
/*     */   
/*     */   public float bF() {
/* 254 */     return this.I / 2.0F;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   protected pc G() {
/* 260 */     return ccl.an;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\ajl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */