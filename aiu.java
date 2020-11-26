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
/*     */ public class aiu
/*     */   extends aiw
/*     */ {
/*     */   public aiu(afb ☃, axy axy1) {
/*  15 */     super(☃, axy1);
/*     */   }
/*     */ 
/*     */   
/*     */   protected cbg a() {
/*  20 */     this.o = new cbb();
/*  21 */     this.o.a(true);
/*  22 */     return new cbg(this.o);
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean b() {
/*  27 */     return ((t() && r()) || !this.a.aW());
/*     */   }
/*     */ 
/*     */   
/*     */   protected cee c() {
/*  32 */     return new cee(this.a.q, this.a.r, this.a.s);
/*     */   }
/*     */ 
/*     */   
/*     */   public cbe a(aer ☃) {
/*  37 */     return b(new el(☃));
/*     */   }
/*     */ 
/*     */   
/*     */   public void d() {
/*  42 */     this.e++;
/*     */     
/*  44 */     if (this.m) {
/*  45 */       l();
/*     */     }
/*     */     
/*  48 */     if (p()) {
/*     */       return;
/*     */     }
/*     */     
/*  52 */     if (b()) {
/*  53 */       o();
/*  54 */     } else if (this.c != null && this.c.e() < this.c.d()) {
/*  55 */       cee cee = this.c.a(this.a, this.c.e());
/*  56 */       if (xq.c(this.a.q) == xq.c(cee.b) && xq.c(this.a.r) == xq.c(cee.c) && xq.c(this.a.s) == xq.c(cee.d)) {
/*  57 */         this.c.c(this.c.e() + 1);
/*     */       }
/*     */     } 
/*     */     
/*  61 */     n();
/*     */     
/*  63 */     if (p()) {
/*     */       return;
/*     */     }
/*  66 */     cee ☃ = this.c.a(this.a);
/*     */     
/*  68 */     this.a.r().a(☃.b, ☃.c, ☃.d, this.d);
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean a(cee ☃, cee cee1, int i, int j, int k) {
/*  73 */     int m = xq.c(☃.b);
/*  74 */     int n = xq.c(☃.c);
/*  75 */     int i1 = xq.c(☃.d);
/*     */     
/*  77 */     double d1 = cee1.b - ☃.b;
/*  78 */     double d2 = cee1.c - ☃.c;
/*  79 */     double d3 = cee1.d - ☃.d;
/*  80 */     double d4 = d1 * d1 + d2 * d2 + d3 * d3;
/*  81 */     if (d4 < 1.0E-8D) {
/*  82 */       return false;
/*     */     }
/*     */     
/*  85 */     double d5 = 1.0D / Math.sqrt(d4);
/*  86 */     d1 *= d5;
/*  87 */     d2 *= d5;
/*  88 */     d3 *= d5;
/*     */     
/*  90 */     double d6 = 1.0D / Math.abs(d1);
/*  91 */     double d7 = 1.0D / Math.abs(d2);
/*  92 */     double d8 = 1.0D / Math.abs(d3);
/*     */     
/*  94 */     double d9 = m - ☃.b;
/*  95 */     double d10 = n - ☃.c;
/*  96 */     double d11 = i1 - ☃.d;
/*  97 */     if (d1 >= 0.0D) {
/*  98 */       d9++;
/*     */     }
/* 100 */     if (d2 >= 0.0D) {
/* 101 */       d10++;
/*     */     }
/* 103 */     if (d3 >= 0.0D) {
/* 104 */       d11++;
/*     */     }
/* 106 */     d9 /= d1;
/* 107 */     d10 /= d2;
/* 108 */     d11 /= d3;
/*     */     
/* 110 */     int i2 = (d1 < 0.0D) ? -1 : 1;
/* 111 */     int i3 = (d2 < 0.0D) ? -1 : 1;
/* 112 */     int i4 = (d3 < 0.0D) ? -1 : 1;
/* 113 */     int i5 = xq.c(cee1.b);
/* 114 */     int i6 = xq.c(cee1.c);
/* 115 */     int i7 = xq.c(cee1.d);
/* 116 */     int i8 = i5 - m;
/* 117 */     int i9 = i6 - n;
/* 118 */     int i10 = i7 - i1;
/*     */     
/* 120 */     while (i8 * i2 > 0 || i9 * i3 > 0 || i10 * i4 > 0) {
/* 121 */       if (d9 < d11 && d9 <= d10) {
/* 122 */         d9 += d6;
/* 123 */         m += i2;
/* 124 */         i8 = i5 - m; continue;
/* 125 */       }  if (d10 < d9 && d10 <= d11) {
/* 126 */         d10 += d7;
/* 127 */         n += i3;
/* 128 */         i9 = i6 - n; continue;
/*     */       } 
/* 130 */       d11 += d8;
/* 131 */       i1 += i4;
/* 132 */       i10 = i7 - i1;
/*     */     } 
/*     */     
/* 135 */     return true;
/*     */   }
/*     */   
/*     */   public void a(boolean ☃) {
/* 139 */     this.o.b(☃);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(boolean ☃) {
/* 147 */     this.o.a(☃);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(el ☃) {
/* 156 */     return this.b.a_(☃).q();
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\aiu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */