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
/*     */ public class amr
/*     */   extends ang
/*     */ {
/*  35 */   private float a = 0.5F;
/*     */   
/*     */   private int b;
/*  38 */   private static final or<Byte> c = ou.a((Class)amr.class, ot.a);
/*     */   
/*     */   public amr(axy ☃) {
/*  41 */     super(aev.e, ☃);
/*     */     
/*  43 */     a(cba.g, -1.0F);
/*  44 */     a(cba.f, 8.0F);
/*  45 */     a(cba.j, 0.0F);
/*  46 */     a(cba.k, 0.0F);
/*  47 */     this.aa = true;
/*  48 */     this.b_ = 10;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void n() {
/*  53 */     this.by.a(4, new a(this));
/*  54 */     this.by.a(5, new ahi(this, 1.0D));
/*  55 */     this.by.a(7, new aih(this, 1.0D, 0.0F));
/*  56 */     this.by.a(8, new ahb(this, (Class)aog.class, 8.0F));
/*  57 */     this.by.a(8, new ahq(this));
/*     */     
/*  59 */     this.bz.a(1, new ail(this, true, new Class[0]));
/*  60 */     this.bz.a(2, new aio<>(this, aog.class, true));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void bZ() {
/*  65 */     super.bZ();
/*  66 */     a(ank.f).a(6.0D);
/*  67 */     a(ank.d).a(0.23000000417232513D);
/*  68 */     a(ank.b).a(48.0D);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void x_() {
/*  73 */     super.x_();
/*     */     
/*  75 */     this.ab.a(c, Byte.valueOf((byte)0));
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi D() {
/*  80 */     return wj.O;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi d(aea ☃) {
/*  85 */     return wj.R;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi cs() {
/*  90 */     return wj.Q;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float az() {
/* 100 */     return 1.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void k() {
/* 106 */     if (!this.A && this.u < 0.0D) {
/* 107 */       this.u *= 0.6D;
/*     */     }
/*     */     
/* 110 */     if (this.m.B) {
/* 111 */       if (this.T.nextInt(24) == 0 && !ai()) {
/* 112 */         this.m.a(this.q + 0.5D, this.r + 0.5D, this.s + 0.5D, wj.P, bV(), 1.0F + this.T.nextFloat(), this.T.nextFloat() * 0.7F + 0.3F, false);
/*     */       }
/* 114 */       for (int ☃ = 0; ☃ < 2; ☃++) {
/* 115 */         this.m.a(fm.F, this.q + (this.T.nextDouble() - 0.5D) * this.H, this.r + this.T.nextDouble() * this.I, this.s + (this.T.nextDouble() - 0.5D) * this.H, 0.0D, 0.0D, 0.0D);
/*     */       }
/*     */     } 
/*     */     
/* 119 */     super.k();
/*     */   }
/*     */ 
/*     */   
/*     */   protected void J() {
/* 124 */     if (ap()) {
/* 125 */       a(aea.h, 1.0F);
/*     */     }
/*     */     
/* 128 */     this.b--;
/* 129 */     if (this.b <= 0) {
/* 130 */       this.b = 100;
/* 131 */       this.a = 0.5F + (float)this.T.nextGaussian() * 3.0F;
/*     */     } 
/*     */     
/* 134 */     afa ☃ = v();
/* 135 */     if (☃ != null && ☃.r + ☃.bF() > this.r + bF() + this.a) {
/* 136 */       this.u += (0.30000001192092896D - this.u) * 0.30000001192092896D;
/* 137 */       this.al = true;
/*     */     } 
/*     */     
/* 140 */     super.J();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void c(float ☃, float f1) {}
/*     */ 
/*     */   
/*     */   public boolean aV() {
/* 149 */     return l();
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   protected pc G() {
/* 155 */     return ccl.w;
/*     */   }
/*     */   
/*     */   public boolean l() {
/* 159 */     return ((((Byte)this.ab.<Byte>a(c)).byteValue() & 0x1) != 0);
/*     */   }
/*     */   
/*     */   public void a(boolean ☃) {
/* 163 */     byte b = ((Byte)this.ab.<Byte>a(c)).byteValue();
/* 164 */     if (☃) {
/* 165 */       b = (byte)(b | 0x1);
/*     */     } else {
/* 167 */       b = (byte)(b & 0xFFFFFFFE);
/*     */     } 
/* 169 */     this.ab.b(c, Byte.valueOf(b));
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean K_() {
/* 174 */     return true;
/*     */   }
/*     */   
/*     */   static class a extends agt {
/*     */     private final amr a;
/*     */     private int b;
/*     */     private int c;
/*     */     
/*     */     public a(amr ☃) {
/* 183 */       this.a = ☃;
/*     */       
/* 185 */       a(3);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 190 */       afa ☃ = this.a.v();
/* 191 */       return (☃ != null && ☃.aF());
/*     */     }
/*     */ 
/*     */     
/*     */     public void c() {
/* 196 */       this.b = 0;
/*     */     }
/*     */ 
/*     */     
/*     */     public void d() {
/* 201 */       this.a.a(false);
/*     */     }
/*     */ 
/*     */     
/*     */     public void e() {
/* 206 */       this.c--;
/*     */       
/* 208 */       afa ☃ = this.a.v();
/*     */       
/* 210 */       double d = this.a.h(☃);
/*     */       
/* 212 */       if (d < 4.0D) {
/*     */         
/* 214 */         if (this.c <= 0) {
/* 215 */           this.c = 20;
/* 216 */           this.a.B(☃);
/*     */         } 
/* 218 */         this.a.r().a(☃.q, ☃.r, ☃.s, 1.0D);
/* 219 */       } else if (d < g() * g()) {
/* 220 */         double d1 = ☃.q - this.a.q;
/* 221 */         double d2 = (☃.bD()).b + (☃.I / 2.0F) - this.a.r + (this.a.I / 2.0F);
/* 222 */         double d3 = ☃.s - this.a.s;
/*     */         
/* 224 */         if (this.c <= 0) {
/* 225 */           this.b++;
/* 226 */           if (this.b == 1) {
/* 227 */             this.c = 60;
/* 228 */             this.a.a(true);
/* 229 */           } else if (this.b <= 4) {
/* 230 */             this.c = 6;
/*     */           } else {
/* 232 */             this.c = 100;
/* 233 */             this.b = 0;
/* 234 */             this.a.a(false);
/*     */           } 
/*     */           
/* 237 */           if (this.b > 1) {
/* 238 */             float f = xq.c(xq.a(d)) * 0.5F;
/*     */             
/* 240 */             this.a.m.a((aog)null, 1018, new el((int)this.a.q, (int)this.a.r, (int)this.a.s), 0);
/* 241 */             for (int i = 0; i < 1; i++) {
/* 242 */               aow aow = new aow(this.a.m, this.a, d1 + this.a.ce().nextGaussian() * f, d2, d3 + this.a.ce().nextGaussian() * f);
/* 243 */               aow.r = this.a.r + (this.a.I / 2.0F) + 0.5D;
/* 244 */               this.a.m.a(aow);
/*     */             } 
/*     */           } 
/*     */         } 
/* 248 */         this.a.p().a(☃, 10.0F, 10.0F);
/*     */       } else {
/* 250 */         this.a.t().q();
/* 251 */         this.a.r().a(☃.q, ☃.r, ☃.s, 1.0D);
/*     */       } 
/*     */       
/* 254 */       super.e();
/*     */     }
/*     */     
/*     */     private double g() {
/* 258 */       afn ☃ = this.a.a(ank.b);
/* 259 */       return (☃ == null) ? 16.0D : ☃.e();
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\amr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */