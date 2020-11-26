/*     */ import java.util.function.Predicate;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.commons.lang3.Validate;
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
/*     */ public abstract class ama
/*     */   extends aer
/*     */ {
/*     */   protected static final Predicate<aer> a;
/*     */   private int d;
/*     */   protected el b;
/*     */   @Nullable
/*     */   public eq c;
/*     */   
/*     */   static {
/*  27 */     a = (☃ -> ☃ instanceof ama);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected ama(aev<?> ☃, axy axy1) {
/*  35 */     super(☃, axy1);
/*  36 */     a(0.5F, 0.5F);
/*     */   }
/*     */   
/*     */   protected ama(aev<?> ☃, axy axy1, el el1) {
/*  40 */     this(☃, axy1);
/*  41 */     this.b = el1;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void x_() {}
/*     */ 
/*     */   
/*     */   protected void a(eq ☃) {
/*  49 */     Validate.notNull(☃);
/*  50 */     Validate.isTrue(☃.k().c());
/*     */     
/*  52 */     this.c = ☃;
/*  53 */     this.w = (this.c.b() * 90);
/*  54 */     this.y = this.w;
/*     */     
/*  56 */     f();
/*     */   }
/*     */   
/*     */   protected void f() {
/*  60 */     if (this.c == null) {
/*     */       return;
/*     */     }
/*     */     
/*  64 */     double ☃ = this.b.o() + 0.5D;
/*  65 */     double d1 = this.b.p() + 0.5D;
/*  66 */     double d2 = this.b.q() + 0.5D;
/*     */     
/*  68 */     double d3 = 0.46875D;
/*  69 */     double d4 = a(k());
/*  70 */     double d5 = a(l());
/*     */     
/*  72 */     ☃ -= this.c.g() * 0.46875D;
/*  73 */     d2 -= this.c.i() * 0.46875D;
/*  74 */     d1 += d5;
/*     */     
/*  76 */     eq eq1 = this.c.f();
/*  77 */     ☃ += d4 * eq1.g();
/*  78 */     d2 += d4 * eq1.i();
/*     */     
/*  80 */     this.q = ☃;
/*  81 */     this.r = d1;
/*  82 */     this.s = d2;
/*     */     
/*  84 */     double d6 = k();
/*  85 */     double d7 = l();
/*  86 */     double d8 = k();
/*     */     
/*  88 */     if (this.c.k() == eq.a.c) {
/*  89 */       d8 = 1.0D;
/*     */     } else {
/*  91 */       d6 = 1.0D;
/*     */     } 
/*     */     
/*  94 */     d6 /= 32.0D;
/*  95 */     d7 /= 32.0D;
/*  96 */     d8 /= 32.0D;
/*  97 */     a(new cea(☃ - d6, d1 - d7, d2 - d8, ☃ + d6, d1 + d7, d2 + d8));
/*     */   }
/*     */   
/*     */   private double a(int ☃) {
/* 101 */     return (☃ % 32 == 0) ? 0.5D : 0.0D;
/*     */   }
/*     */ 
/*     */   
/*     */   public void R_() {
/* 106 */     this.n = this.q;
/* 107 */     this.o = this.r;
/* 108 */     this.p = this.s;
/* 109 */     if (this.d++ == 100 && !this.m.B) {
/* 110 */       this.d = 0;
/* 111 */       if (!this.G && !i()) {
/* 112 */         V();
/* 113 */         a((aer)null);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean i() {
/* 119 */     if (!this.m.c(this, bD())) {
/* 120 */       return false;
/*     */     }
/*     */     
/* 123 */     int ☃ = Math.max(1, k() / 16);
/* 124 */     int i = Math.max(1, l() / 16);
/*     */     
/* 126 */     el el1 = this.b.a(this.c.d());
/* 127 */     eq eq1 = this.c.f();
/*     */     
/* 129 */     el.a a = new el.a();
/* 130 */     for (int j = 0; j < ☃; j++) {
/* 131 */       for (int k = 0; k < i; k++) {
/* 132 */         int m = (☃ - 1) / -2;
/* 133 */         int n = (i - 1) / -2;
/*     */         
/* 135 */         a.g(el1).c(eq1, j + m).c(eq.b, k + n);
/*     */         
/* 137 */         blc blc = this.m.a_(a);
/* 138 */         if (!blc.d().b() && !bea.x(blc)) {
/* 139 */           return false;
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 144 */     return this.m.a(this, bD(), a).isEmpty();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean aB() {
/* 149 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean t(aer ☃) {
/* 154 */     if (☃ instanceof aog) {
/* 155 */       return a(aea.a((aog)☃), 0.0F);
/*     */     }
/* 157 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public eq bA() {
/* 162 */     return this.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(aea ☃, float f) {
/* 167 */     if (b(☃)) {
/* 168 */       return false;
/*     */     }
/* 170 */     if (!this.G && !this.m.B) {
/* 171 */       V();
/* 172 */       aA();
/* 173 */       a(☃.k());
/*     */     } 
/* 175 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(afe ☃, double d1, double d2, double d3) {
/* 180 */     if (!this.m.B && !this.G && d1 * d1 + d2 * d2 + d3 * d3 > 0.0D) {
/* 181 */       V();
/* 182 */       a((aer)null);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void f(double ☃, double d1, double d2) {
/* 188 */     if (!this.m.B && !this.G && ☃ * ☃ + d1 * d1 + d2 * d2 > 0.0D) {
/* 189 */       V();
/* 190 */       a((aer)null);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(gy ☃) {
/* 196 */     ☃.a("Facing", (byte)this.c.b());
/* 197 */     el el1 = n();
/* 198 */     ☃.b("TileX", el1.o());
/* 199 */     ☃.b("TileY", el1.p());
/* 200 */     ☃.b("TileZ", el1.q());
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(gy ☃) {
/* 205 */     this.b = new el(☃.h("TileX"), ☃.h("TileY"), ☃.h("TileZ"));
/* 206 */     a(eq.b(☃.f("Facing")));
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
/*     */   public amm a(ate ☃, float f) {
/* 219 */     amm amm = new amm(this.m, this.q + (this.c.g() * 0.15F), this.r + f, this.s + (this.c.i() * 0.15F), ☃);
/* 220 */     amm.n();
/* 221 */     this.m.a(amm);
/* 222 */     return amm;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean aD() {
/* 227 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(double ☃, double d1, double d2) {
/* 232 */     this.b = new el(☃, d1, d2);
/* 233 */     f();
/* 234 */     this.al = true;
/*     */   }
/*     */   
/*     */   public el n() {
/* 238 */     return this.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public float a(bhb ☃) {
/* 243 */     if (this.c != null && this.c.k() != eq.a.b) {
/* 244 */       switch (null.a[☃.ordinal()]) {
/*     */         case 1:
/* 246 */           this.c = this.c.d();
/*     */           break;
/*     */         case 2:
/* 249 */           this.c = this.c.f();
/*     */           break;
/*     */         case 3:
/* 252 */           this.c = this.c.e();
/*     */           break;
/*     */       } 
/*     */ 
/*     */ 
/*     */     
/*     */     }
/* 259 */     float f = xq.g(this.w);
/* 260 */     switch (null.a[☃.ordinal()]) {
/*     */       case 1:
/* 262 */         return f + 180.0F;
/*     */       case 2:
/* 264 */         return f + 90.0F;
/*     */       case 3:
/* 266 */         return f + 270.0F;
/*     */     } 
/* 268 */     return f;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public float a(bfz ☃) {
/* 274 */     return a(☃.a(this.c));
/*     */   }
/*     */   
/*     */   public void a(amj ☃) {}
/*     */   
/*     */   public abstract int k();
/*     */   
/*     */   public abstract int l();
/*     */   
/*     */   public abstract void a(@Nullable aer paramaer);
/*     */   
/*     */   public abstract void m();
/*     */ }


/* Location:              F:\dw\server.jar!\ama.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */