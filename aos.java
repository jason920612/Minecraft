/*     */ import java.util.List;
/*     */ import java.util.UUID;
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
/*     */ public class aos
/*     */   extends aer
/*     */   implements aot
/*     */ {
/*     */   public aks a;
/*     */   private gy b;
/*     */   
/*     */   public aos(axy ☃) {
/*  26 */     super(aev.L, ☃);
/*     */     
/*  28 */     a(0.25F, 0.25F);
/*     */   }
/*     */   
/*     */   public aos(axy ☃, aks aks1) {
/*  32 */     this(☃);
/*  33 */     this.a = aks1;
/*  34 */     b(aks1.q - (aks1.H + 1.0F) * 0.5D * xq.a(aks1.aQ * 0.017453292F), aks1.r + aks1.bF() - 0.10000000149011612D, aks1.s + (aks1.H + 1.0F) * 0.5D * xq.b(aks1.aQ * 0.017453292F));
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
/*  53 */     super.R_();
/*     */     
/*  55 */     if (this.b != null) {
/*  56 */       f();
/*     */     }
/*     */     
/*  59 */     cee ☃ = new cee(this.q, this.r, this.s);
/*  60 */     cee cee1 = new cee(this.q + this.t, this.r + this.u, this.s + this.v);
/*  61 */     ceb ceb = this.m.a(☃, cee1);
/*     */     
/*  63 */     ☃ = new cee(this.q, this.r, this.s);
/*  64 */     cee1 = new cee(this.q + this.t, this.r + this.u, this.s + this.v);
/*  65 */     if (ceb != null) {
/*  66 */       cee1 = new cee(ceb.c.b, ceb.c.c, ceb.c.d);
/*     */     }
/*  68 */     aer aer1 = a(☃, cee1);
/*     */     
/*  70 */     if (aer1 != null) {
/*  71 */       ceb = new ceb(aer1);
/*     */     }
/*     */     
/*  74 */     if (ceb != null) {
/*  75 */       a(ceb);
/*     */     }
/*     */     
/*  78 */     this.q += this.t;
/*  79 */     this.r += this.u;
/*  80 */     this.s += this.v;
/*     */     
/*  82 */     float f1 = xq.a(this.t * this.t + this.v * this.v);
/*  83 */     this.w = (float)(xq.c(this.t, this.v) * 57.2957763671875D);
/*  84 */     this.x = (float)(xq.c(this.u, f1) * 57.2957763671875D);
/*     */     
/*  86 */     while (this.x - this.z < -180.0F) {
/*  87 */       this.z -= 360.0F;
/*     */     }
/*  89 */     while (this.x - this.z >= 180.0F) {
/*  90 */       this.z += 360.0F;
/*     */     }
/*     */     
/*  93 */     while (this.w - this.y < -180.0F) {
/*  94 */       this.y -= 360.0F;
/*     */     }
/*  96 */     while (this.w - this.y >= 180.0F) {
/*  97 */       this.y += 360.0F;
/*     */     }
/*     */     
/* 100 */     this.x = this.z + (this.x - this.z) * 0.2F;
/* 101 */     this.w = this.y + (this.w - this.y) * 0.2F;
/*     */     
/* 103 */     float f2 = 0.99F;
/* 104 */     float f3 = 0.06F;
/*     */     
/* 106 */     if (!this.m.a(bD(), bza.a)) {
/* 107 */       V();
/*     */       
/*     */       return;
/*     */     } 
/* 111 */     if (aq()) {
/* 112 */       V();
/*     */       
/*     */       return;
/*     */     } 
/* 116 */     this.t *= 0.9900000095367432D;
/* 117 */     this.u *= 0.9900000095367432D;
/* 118 */     this.v *= 0.9900000095367432D;
/* 119 */     if (!aj()) {
/* 120 */       this.u -= 0.05999999865889549D;
/*     */     }
/*     */     
/* 123 */     b(this.q, this.r, this.s);
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
/*     */   @Nullable
/*     */   private aer a(cee ☃, cee cee1) {
/* 143 */     aer aer1 = null;
/* 144 */     List<aer> list = this.m.a(this, bD().b(this.t, this.u, this.v).g(1.0D));
/* 145 */     double d = 0.0D;
/*     */     
/* 147 */     for (aer aer2 : list) {
/* 148 */       if (aer2 == this.a) {
/*     */         continue;
/*     */       }
/*     */       
/* 152 */       cea cea = aer2.bD().g(0.30000001192092896D);
/* 153 */       ceb ceb = cea.b(☃, cee1);
/* 154 */       if (ceb != null) {
/* 155 */         double d1 = ☃.g(ceb.c);
/* 156 */         if (d1 < d || d == 0.0D) {
/* 157 */           aer1 = aer2;
/* 158 */           d = d1;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 163 */     return aer1;
/*     */   }
/*     */ 
/*     */   
/*     */   public void c(double ☃, double d1, double d2, float f1, float f2) {
/* 168 */     float f3 = xq.a(☃ * ☃ + d1 * d1 + d2 * d2);
/*     */     
/* 170 */     ☃ /= f3;
/* 171 */     d1 /= f3;
/* 172 */     d2 /= f3;
/*     */     
/* 174 */     ☃ += this.T.nextGaussian() * 0.007499999832361937D * f2;
/* 175 */     d1 += this.T.nextGaussian() * 0.007499999832361937D * f2;
/* 176 */     d2 += this.T.nextGaussian() * 0.007499999832361937D * f2;
/*     */     
/* 178 */     ☃ *= f1;
/* 179 */     d1 *= f1;
/* 180 */     d2 *= f1;
/*     */     
/* 182 */     this.t = ☃;
/* 183 */     this.u = d1;
/* 184 */     this.v = d2;
/*     */     
/* 186 */     float f4 = xq.a(☃ * ☃ + d2 * d2);
/*     */     
/* 188 */     this.w = (float)(xq.c(☃, d2) * 57.2957763671875D);
/* 189 */     this.x = (float)(xq.c(d1, f4) * 57.2957763671875D);
/* 190 */     this.y = this.w;
/* 191 */     this.z = this.x;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(ceb ☃) {
/* 200 */     if (☃.d != null && this.a != null) {
/* 201 */       ☃.d.a(aea.a(this, this.a).c(), 1.0F);
/*     */     }
/*     */ 
/*     */     
/* 205 */     if (!this.m.B) {
/* 206 */       V();
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void x_() {}
/*     */ 
/*     */   
/*     */   protected void a(gy ☃) {
/* 216 */     if (☃.c("Owner", 10)) {
/* 217 */       this.b = ☃.p("Owner");
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b(gy ☃) {
/* 223 */     if (this.a != null) {
/* 224 */       gy gy1 = new gy();
/* 225 */       UUID uUID = this.a.bt();
/* 226 */       gy1.a("OwnerUUID", uUID);
/* 227 */       ☃.a("Owner", gy1);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private void f() {
/* 233 */     if (this.b != null && 
/* 234 */       this.b.b("OwnerUUID")) {
/* 235 */       UUID ☃ = this.b.a("OwnerUUID");
/* 236 */       List<aks> list = this.m.a(aks.class, bD().g(15.0D));
/* 237 */       for (aks aks1 : list) {
/* 238 */         if (aks1.bt().equals(☃)) {
/* 239 */           this.a = aks1;
/*     */           
/*     */           break;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 246 */     this.b = null;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\aos.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */