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
/*     */ public class agb
/*     */ {
/*     */   protected final afb a;
/*     */   protected double b;
/*     */   protected double c;
/*     */   protected double d;
/*     */   protected double e;
/*     */   protected float f;
/*     */   protected float g;
/*  23 */   protected a h = a.a;
/*     */   
/*     */   public agb(afb ☃) {
/*  26 */     this.a = ☃;
/*     */   }
/*     */   
/*     */   public boolean b() {
/*  30 */     return (this.h == a.b);
/*     */   }
/*     */   
/*     */   public double c() {
/*  34 */     return this.e;
/*     */   }
/*     */   
/*     */   public void a(double ☃, double d1, double d2, double d3) {
/*  38 */     this.b = ☃;
/*  39 */     this.c = d1;
/*  40 */     this.d = d2;
/*  41 */     this.e = d3;
/*  42 */     if (this.h != a.d) {
/*  43 */       this.h = a.b;
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(float ☃, float f1) {
/*  48 */     this.h = a.c;
/*  49 */     this.f = ☃;
/*  50 */     this.g = f1;
/*  51 */     this.e = 0.25D;
/*     */   }
/*     */   
/*     */   public void a(agb ☃) {
/*  55 */     this.h = ☃.h;
/*  56 */     this.b = ☃.b;
/*  57 */     this.c = ☃.c;
/*  58 */     this.d = ☃.d;
/*  59 */     this.e = Math.max(☃.e, 1.0D);
/*  60 */     this.f = ☃.f;
/*  61 */     this.g = ☃.g;
/*     */   }
/*     */   
/*     */   public void a() {
/*  65 */     if (this.h == a.c) {
/*     */       
/*  67 */       float ☃ = (float)this.a.a(ank.d).e();
/*  68 */       float f1 = (float)this.e * ☃;
/*     */       
/*  70 */       float f2 = this.f;
/*  71 */       float f3 = this.g;
/*  72 */       float f4 = xq.c(f2 * f2 + f3 * f3);
/*  73 */       if (f4 < 1.0F) {
/*  74 */         f4 = 1.0F;
/*     */       }
/*  76 */       f4 = f1 / f4;
/*  77 */       f2 *= f4;
/*  78 */       f3 *= f4;
/*     */       
/*  80 */       float f5 = xq.a(this.a.w * 0.017453292F);
/*  81 */       float f6 = xq.b(this.a.w * 0.017453292F);
/*  82 */       float f7 = f2 * f6 - f3 * f5;
/*  83 */       float f8 = f3 * f6 + f2 * f5;
/*     */       
/*  85 */       aiw aiw = this.a.t();
/*  86 */       if (aiw != null) {
/*  87 */         cbd cbd = aiw.s();
/*  88 */         if (cbd != null && cbd.a(this.a.m, xq.c(this.a.q + f7), xq.c(this.a.r), xq.c(this.a.s + f8)) != cba.c) {
/*  89 */           this.f = 1.0F;
/*  90 */           this.g = 0.0F;
/*  91 */           f1 = ☃;
/*     */         } 
/*     */       } 
/*     */       
/*  95 */       this.a.o(f1);
/*  96 */       this.a.r(this.f);
/*  97 */       this.a.t(this.g);
/*     */       
/*  99 */       this.h = a.a;
/* 100 */     } else if (this.h == a.b) {
/* 101 */       this.h = a.a;
/*     */       
/* 103 */       double ☃ = this.b - this.a.q;
/* 104 */       double d1 = this.d - this.a.s;
/* 105 */       double d2 = this.c - this.a.r;
/* 106 */       double d3 = ☃ * ☃ + d2 * d2 + d1 * d1;
/* 107 */       if (d3 < 2.500000277905201E-7D) {
/* 108 */         this.a.r(0.0F);
/*     */         
/*     */         return;
/*     */       } 
/* 112 */       float f = (float)(xq.c(d1, ☃) * 57.2957763671875D) - 90.0F;
/*     */       
/* 114 */       this.a.w = a(this.a.w, f, 90.0F);
/* 115 */       this.a.o((float)(this.e * this.a.a(ank.d).e()));
/*     */       
/* 117 */       if (d2 > this.a.Q && ☃ * ☃ + d1 * d1 < Math.max(1.0F, this.a.H)) {
/* 118 */         this.a.s().a();
/* 119 */         this.h = a.d;
/*     */       } 
/* 121 */     } else if (this.h == a.d) {
/* 122 */       this.a.o((float)(this.e * this.a.a(ank.d).e()));
/* 123 */       if (this.a.A) {
/* 124 */         this.h = a.a;
/*     */       }
/*     */     } else {
/* 127 */       this.a.r(0.0F);
/*     */     } 
/*     */   }
/*     */   
/*     */   protected float a(float ☃, float f1, float f2) {
/* 132 */     float f3 = xq.g(f1 - ☃);
/* 133 */     if (f3 > f2) {
/* 134 */       f3 = f2;
/*     */     }
/* 136 */     if (f3 < -f2) {
/* 137 */       f3 = -f2;
/*     */     }
/* 139 */     float f4 = ☃ + f3;
/* 140 */     if (f4 < 0.0F) {
/* 141 */       f4 += 360.0F;
/* 142 */     } else if (f4 > 360.0F) {
/* 143 */       f4 -= 360.0F;
/*     */     } 
/* 145 */     return f4;
/*     */   }
/*     */   
/*     */   public double d() {
/* 149 */     return this.b;
/*     */   }
/*     */   
/*     */   public double e() {
/* 153 */     return this.c;
/*     */   }
/*     */   
/*     */   public double f() {
/* 157 */     return this.d;
/*     */   }
/*     */   
/*     */   public enum a {
/* 161 */     a,
/* 162 */     b,
/* 163 */     c,
/* 164 */     d;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\agb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */