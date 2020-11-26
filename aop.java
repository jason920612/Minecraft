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
/*     */ public class aop
/*     */   extends aer
/*     */ {
/*     */   private double a;
/*     */   private double b;
/*     */   private double c;
/*     */   private int d;
/*     */   private boolean e;
/*     */   
/*     */   public aop(axy ☃) {
/*  25 */     super(aev.x, ☃);
/*  26 */     a(0.25F, 0.25F);
/*     */   }
/*     */   
/*     */   public aop(axy ☃, double d1, double d2, double d3) {
/*  30 */     this(☃);
/*  31 */     this.d = 0;
/*     */     
/*  33 */     b(d1, d2, d3);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void x_() {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(el ☃) {
/*  51 */     double d1 = ☃.o();
/*  52 */     int i = ☃.p();
/*  53 */     double d2 = ☃.q();
/*     */     
/*  55 */     double d3 = d1 - this.q;
/*  56 */     double d4 = d2 - this.s;
/*  57 */     float f = xq.a(d3 * d3 + d4 * d4);
/*     */     
/*  59 */     if (f > 12.0F) {
/*  60 */       this.a = this.q + d3 / f * 12.0D;
/*  61 */       this.c = this.s + d4 / f * 12.0D;
/*  62 */       this.b = this.r + 8.0D;
/*     */     } else {
/*  64 */       this.a = d1;
/*  65 */       this.b = i;
/*  66 */       this.c = d2;
/*     */     } 
/*     */     
/*  69 */     this.d = 0;
/*  70 */     this.e = (this.T.nextInt(5) > 0);
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
/*     */   
/*     */   public void R_() {
/*  89 */     this.N = this.q;
/*  90 */     this.O = this.r;
/*  91 */     this.P = this.s;
/*  92 */     super.R_();
/*     */     
/*  94 */     this.q += this.t;
/*  95 */     this.r += this.u;
/*  96 */     this.s += this.v;
/*     */     
/*  98 */     float ☃ = xq.a(this.t * this.t + this.v * this.v);
/*  99 */     this.w = (float)(xq.c(this.t, this.v) * 57.2957763671875D);
/* 100 */     this.x = (float)(xq.c(this.u, ☃) * 57.2957763671875D);
/*     */     
/* 102 */     while (this.x - this.z < -180.0F) {
/* 103 */       this.z -= 360.0F;
/*     */     }
/* 105 */     while (this.x - this.z >= 180.0F) {
/* 106 */       this.z += 360.0F;
/*     */     }
/*     */     
/* 109 */     while (this.w - this.y < -180.0F) {
/* 110 */       this.y -= 360.0F;
/*     */     }
/* 112 */     while (this.w - this.y >= 180.0F) {
/* 113 */       this.y += 360.0F;
/*     */     }
/*     */     
/* 116 */     this.x = this.z + (this.x - this.z) * 0.2F;
/* 117 */     this.w = this.y + (this.w - this.y) * 0.2F;
/*     */     
/* 119 */     if (!this.m.B) {
/* 120 */       double d1 = this.a - this.q;
/* 121 */       double d2 = this.c - this.s;
/* 122 */       float f2 = (float)Math.sqrt(d1 * d1 + d2 * d2);
/* 123 */       float f3 = (float)xq.c(d2, d1);
/* 124 */       double d3 = ☃ + (f2 - ☃) * 0.0025D;
/* 125 */       if (f2 < 1.0F) {
/* 126 */         d3 *= 0.8D;
/* 127 */         this.u *= 0.8D;
/*     */       } 
/* 129 */       this.t = Math.cos(f3) * d3;
/* 130 */       this.v = Math.sin(f3) * d3;
/*     */       
/* 132 */       if (this.r < this.b) {
/* 133 */         this.u += (1.0D - this.u) * 0.014999999664723873D;
/*     */       } else {
/* 135 */         this.u += (-1.0D - this.u) * 0.014999999664723873D;
/*     */       } 
/*     */     } 
/*     */     
/* 139 */     float f1 = 0.25F;
/* 140 */     if (an()) {
/* 141 */       for (int i = 0; i < 4; i++) {
/* 142 */         this.m.a(fm.e, this.q - this.t * 0.25D, this.r - this.u * 0.25D, this.s - this.v * 0.25D, this.t, this.u, this.v);
/*     */       }
/*     */     } else {
/* 145 */       this.m.a(fm.K, this.q - this.t * 0.25D + this.T.nextDouble() * 0.6D - 0.3D, this.r - this.u * 0.25D - 0.5D, this.s - this.v * 0.25D + this.T.nextDouble() * 0.6D - 0.3D, this.t, this.u, this.v);
/*     */     } 
/*     */     
/* 148 */     if (!this.m.B) {
/* 149 */       b(this.q, this.r, this.s);
/*     */       
/* 151 */       this.d++;
/* 152 */       if (this.d > 80 && !this.m.B) {
/* 153 */         a(wj.bW, 1.0F, 1.0F);
/* 154 */         V();
/* 155 */         if (this.e) {
/* 156 */           this.m.a(new amm(this.m, this.q, this.r, this.s, new ate(atf.cw)));
/*     */         } else {
/* 158 */           this.m.b(2003, new el(this), 0);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(gy ☃) {}
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(gy ☃) {}
/*     */ 
/*     */   
/*     */   public float az() {
/* 174 */     return 1.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean bk() {
/* 184 */     return false;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\aop.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */