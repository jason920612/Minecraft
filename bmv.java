/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.List;
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
/*     */ public class bmv
/*     */ {
/*     */   static interface a
/*     */   {
/*     */     double a();
/*     */     
/*     */     double b();
/*     */     
/*     */     double c();
/*     */     
/*     */     double d();
/*     */     
/*     */     double e();
/*     */     
/*     */     long g();
/*     */     
/*     */     double h();
/*     */     
/*     */     void j();
/*     */     
/*     */     void k();
/*     */     
/*     */     a l();
/*     */   }
/*     */   
/*     */   class b
/*     */     implements a
/*     */   {
/*     */     private final double b;
/*     */     private final double c;
/*     */     private final long d;
/*     */     private final long e;
/*     */     private final double f;
/*     */     
/*     */     private b(bmv this$0, double ☃, double d1, long l) {
/*  50 */       this.b = ☃;
/*  51 */       this.c = d1;
/*     */       
/*  53 */       this.f = l;
/*  54 */       this.e = k.b();
/*  55 */       this.d = this.e + l;
/*     */     }
/*     */ 
/*     */     
/*     */     public double a() {
/*  60 */       return Math.max(this.a.f() - e() / 2.0D, -bmv.a(this.a));
/*     */     }
/*     */ 
/*     */     
/*     */     public double c() {
/*  65 */       return Math.max(this.a.g() - e() / 2.0D, -bmv.a(this.a));
/*     */     }
/*     */ 
/*     */     
/*     */     public double b() {
/*  70 */       return Math.min(this.a.f() + e() / 2.0D, bmv.a(this.a));
/*     */     }
/*     */ 
/*     */     
/*     */     public double d() {
/*  75 */       return Math.min(this.a.g() + e() / 2.0D, bmv.a(this.a));
/*     */     }
/*     */ 
/*     */     
/*     */     public double e() {
/*  80 */       double ☃ = (k.b() - this.e) / this.f;
/*  81 */       return (☃ < 1.0D) ? (this.b + (this.c - this.b) * ☃) : this.c;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public long g() {
/*  91 */       return this.d - k.b();
/*     */     }
/*     */ 
/*     */     
/*     */     public double h() {
/*  96 */       return this.c;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public void k() {}
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public void j() {}
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public bmv.a l() {
/* 114 */       if (g() <= 0L) {
/* 115 */         return new bmv.c(this.a, this.c);
/*     */       }
/*     */       
/* 118 */       return this;
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   class c
/*     */     implements a
/*     */   {
/*     */     private final double b;
/*     */     private double c;
/*     */     private double d;
/*     */     private double e;
/*     */     private double f;
/*     */     
/*     */     public c(bmv this$0, double ☃) {
/* 133 */       this.b = ☃;
/* 134 */       m();
/*     */     }
/*     */ 
/*     */     
/*     */     public double a() {
/* 139 */       return this.c;
/*     */     }
/*     */ 
/*     */     
/*     */     public double b() {
/* 144 */       return this.e;
/*     */     }
/*     */ 
/*     */     
/*     */     public double c() {
/* 149 */       return this.d;
/*     */     }
/*     */ 
/*     */     
/*     */     public double d() {
/* 154 */       return this.f;
/*     */     }
/*     */ 
/*     */     
/*     */     public double e() {
/* 159 */       return this.b;
/*     */     }
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
/*     */     public long g() {
/* 174 */       return 0L;
/*     */     }
/*     */ 
/*     */     
/*     */     public double h() {
/* 179 */       return this.b;
/*     */     }
/*     */     
/*     */     private void m() {
/* 183 */       this.c = Math.max(this.a.f() - this.b / 2.0D, -bmv.a(this.a));
/* 184 */       this.d = Math.max(this.a.g() - this.b / 2.0D, -bmv.a(this.a));
/* 185 */       this.e = Math.min(this.a.f() + this.b / 2.0D, bmv.a(this.a));
/* 186 */       this.f = Math.min(this.a.g() + this.b / 2.0D, bmv.a(this.a));
/*     */     }
/*     */ 
/*     */     
/*     */     public void j() {
/* 191 */       m();
/*     */     }
/*     */ 
/*     */     
/*     */     public void k() {
/* 196 */       m();
/*     */     }
/*     */ 
/*     */     
/*     */     public bmv.a l() {
/* 201 */       return this;
/*     */     }
/*     */   }
/*     */   
/* 205 */   private final List<bmt> a = Lists.newArrayList();
/*     */   
/* 207 */   private double b = 0.2D;
/* 208 */   private double c = 5.0D;
/* 209 */   private int d = 15;
/* 210 */   private int e = 5;
/*     */   
/*     */   private double f;
/*     */   
/*     */   private double g;
/* 215 */   private int h = 29999984;
/*     */   
/* 217 */   private a i = new c(this, 6.0E7D);
/*     */   
/*     */   public boolean a(el ☃) {
/* 220 */     return ((☃.o() + 1) > b() && ☃.o() < d() && (☃.q() + 1) > c() && ☃.q() < e());
/*     */   }
/*     */   
/*     */   public boolean a(axm ☃) {
/* 224 */     return (☃.f() > b() && ☃.d() < d() && ☃.g() > c() && ☃.e() < e());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(cea ☃) {
/* 232 */     return (☃.d > b() && ☃.a < d() && ☃.f > c() && ☃.c < e());
/*     */   }
/*     */   
/*     */   public double a(aer ☃) {
/* 236 */     return b(☃.q, ☃.s);
/*     */   }
/*     */   
/*     */   public double b(double ☃, double d1) {
/* 240 */     double d2 = d1 - c();
/* 241 */     double d3 = e() - d1;
/* 242 */     double d4 = ☃ - b();
/* 243 */     double d5 = d() - ☃;
/* 244 */     double d6 = Math.min(d4, d5);
/* 245 */     d6 = Math.min(d6, d2);
/* 246 */     return Math.min(d6, d3);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public double b() {
/* 254 */     return this.i.a();
/*     */   }
/*     */   
/*     */   public double c() {
/* 258 */     return this.i.c();
/*     */   }
/*     */   
/*     */   public double d() {
/* 262 */     return this.i.b();
/*     */   }
/*     */   
/*     */   public double e() {
/* 266 */     return this.i.d();
/*     */   }
/*     */   
/*     */   public double f() {
/* 270 */     return this.f;
/*     */   }
/*     */   
/*     */   public double g() {
/* 274 */     return this.g;
/*     */   }
/*     */   
/*     */   public void c(double ☃, double d1) {
/* 278 */     this.f = ☃;
/* 279 */     this.g = d1;
/*     */     
/* 281 */     this.i.k();
/*     */     
/* 283 */     for (bmt bmt : k()) {
/* 284 */       bmt.a(this, ☃, d1);
/*     */     }
/*     */   }
/*     */   
/*     */   public double h() {
/* 289 */     return this.i.e();
/*     */   }
/*     */   
/*     */   public long i() {
/* 293 */     return this.i.g();
/*     */   }
/*     */   
/*     */   public double j() {
/* 297 */     return this.i.h();
/*     */   }
/*     */   
/*     */   public void a(double ☃) {
/* 301 */     this.i = new c(this, ☃);
/*     */     
/* 303 */     for (bmt bmt : k()) {
/* 304 */       bmt.a(this, ☃);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(double ☃, double d1, long l) {
/* 309 */     this.i = (☃ != d1) ? new b(☃, d1, l) : new c(this, d1);
/*     */     
/* 311 */     for (bmt bmt : k()) {
/* 312 */       bmt.a(this, ☃, d1, l);
/*     */     }
/*     */   }
/*     */   
/*     */   protected List<bmt> k() {
/* 317 */     return Lists.newArrayList(this.a);
/*     */   }
/*     */   
/*     */   public void a(bmt ☃) {
/* 321 */     this.a.add(☃);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(int ☃) {
/* 329 */     this.h = ☃;
/* 330 */     this.i.j();
/*     */   }
/*     */   
/*     */   public int l() {
/* 334 */     return this.h;
/*     */   }
/*     */   
/*     */   public double m() {
/* 338 */     return this.c;
/*     */   }
/*     */   
/*     */   public void b(double ☃) {
/* 342 */     this.c = ☃;
/*     */     
/* 344 */     for (bmt bmt : k()) {
/* 345 */       bmt.c(this, ☃);
/*     */     }
/*     */   }
/*     */   
/*     */   public double n() {
/* 350 */     return this.b;
/*     */   }
/*     */   
/*     */   public void c(double ☃) {
/* 354 */     this.b = ☃;
/*     */     
/* 356 */     for (bmt bmt : k()) {
/* 357 */       bmt.b(this, ☃);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int p() {
/* 366 */     return this.d;
/*     */   }
/*     */   
/*     */   public void b(int ☃) {
/* 370 */     this.d = ☃;
/*     */     
/* 372 */     for (bmt bmt : k()) {
/* 373 */       bmt.a(this, ☃);
/*     */     }
/*     */   }
/*     */   
/*     */   public int q() {
/* 378 */     return this.e;
/*     */   }
/*     */   
/*     */   public void c(int ☃) {
/* 382 */     this.e = ☃;
/*     */     
/* 384 */     for (bmt bmt : k()) {
/* 385 */       bmt.b(this, ☃);
/*     */     }
/*     */   }
/*     */   
/*     */   public void r() {
/* 390 */     this.i = this.i.l();
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bmv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */