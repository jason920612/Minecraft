/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
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
/*     */ public class alr
/*     */   extends alf
/*     */ {
/*  18 */   private static final Logger b = LogManager.getLogger();
/*     */   
/*     */   private int c;
/*     */   
/*     */   private cbe d;
/*     */   private cee e;
/*     */   private afa f;
/*     */   private boolean g;
/*     */   
/*     */   public alr(ald ☃) {
/*  28 */     super(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void c() {
/*  33 */     if (this.f == null) {
/*  34 */       b.warn("Skipping player strafe phase because no player was found");
/*  35 */       this.a.dr().a(alt.a);
/*     */       
/*     */       return;
/*     */     } 
/*  39 */     if (this.d != null && this.d.b()) {
/*  40 */       double d2 = this.f.q;
/*  41 */       double d3 = this.f.s;
/*     */       
/*  43 */       double d4 = d2 - this.a.q;
/*  44 */       double d5 = d3 - this.a.s;
/*  45 */       double d6 = xq.a(d4 * d4 + d5 * d5);
/*  46 */       double d7 = Math.min(0.4000000059604645D + d6 / 80.0D - 1.0D, 10.0D);
/*     */       
/*  48 */       this.e = new cee(d2, this.f.r + d7, d3);
/*     */     } 
/*     */     
/*  51 */     double ☃ = (this.e == null) ? 0.0D : this.e.c(this.a.q, this.a.r, this.a.s);
/*  52 */     if (☃ < 100.0D || ☃ > 22500.0D) {
/*  53 */       j();
/*     */     }
/*     */     
/*  56 */     double d1 = 64.0D;
/*  57 */     if (this.f.h(this.a) < 4096.0D) {
/*  58 */       if (this.a.D(this.f)) {
/*  59 */         this.c++;
/*  60 */         cee cee1 = (new cee(this.f.q - this.a.q, 0.0D, this.f.s - this.a.s)).a();
/*  61 */         cee cee2 = (new cee(xq.a(this.a.w * 0.017453292F), 0.0D, -xq.b(this.a.w * 0.017453292F))).a();
/*  62 */         float f1 = (float)cee2.b(cee1);
/*  63 */         float f2 = (float)(Math.acos(f1) * 57.2957763671875D);
/*  64 */         f2 += 0.5F;
/*     */         
/*  66 */         if (this.c >= 5 && f2 >= 0.0F && f2 < 10.0F) {
/*  67 */           double d2 = 1.0D;
/*  68 */           cee cee3 = this.a.f(1.0F);
/*  69 */           double d3 = this.a.bD.q - cee3.b * 1.0D;
/*  70 */           double d4 = this.a.bD.r + (this.a.bD.I / 2.0F) + 0.5D;
/*  71 */           double d5 = this.a.bD.s - cee3.d * 1.0D;
/*     */           
/*  73 */           double d6 = this.f.q - d3;
/*  74 */           double d7 = this.f.r + (this.f.I / 2.0F) - d4 + (this.a.bD.I / 2.0F);
/*  75 */           double d8 = this.f.s - d5;
/*     */           
/*  77 */           this.a.m.a((aog)null, 1017, new el(this.a), 0);
/*  78 */           aon aon = new aon(this.a.m, this.a, d6, d7, d8);
/*  79 */           aon.b(d3, d4, d5, 0.0F, 0.0F);
/*  80 */           this.a.m.a(aon);
/*  81 */           this.c = 0;
/*     */           
/*  83 */           if (this.d != null) {
/*  84 */             while (!this.d.b()) {
/*  85 */               this.d.a();
/*     */             }
/*     */           }
/*     */           
/*  89 */           this.a.dr().a(alt.a);
/*     */         }
/*     */       
/*  92 */       } else if (this.c > 0) {
/*  93 */         this.c--;
/*     */       }
/*     */     
/*     */     }
/*  97 */     else if (this.c > 0) {
/*  98 */       this.c--;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private void j() {
/* 104 */     if (this.d == null || this.d.b()) {
/* 105 */       int ☃ = this.a.l();
/* 106 */       int i = ☃;
/*     */       
/* 108 */       if (this.a.ce().nextInt(8) == 0) {
/* 109 */         this.g = !this.g;
/* 110 */         i += 6;
/*     */       } 
/*     */       
/* 113 */       if (this.g) {
/* 114 */         i++;
/*     */       } else {
/* 116 */         i--;
/*     */       } 
/*     */       
/* 119 */       if (this.a.ds() == null || this.a.ds().c() <= 0) {
/*     */         
/* 121 */         i -= 12;
/* 122 */         i &= 0x7;
/* 123 */         i += 12;
/*     */       } else {
/*     */         
/* 126 */         i %= 12;
/* 127 */         if (i < 0) {
/* 128 */           i += 12;
/*     */         }
/*     */       } 
/*     */       
/* 132 */       this.d = this.a.a(☃, i, (cbc)null);
/*     */       
/* 134 */       if (this.d != null) {
/* 135 */         this.d.a();
/*     */       }
/*     */     } 
/*     */     
/* 139 */     k();
/*     */   }
/*     */   
/*     */   private void k() {
/* 143 */     if (this.d != null && !this.d.b()) {
/* 144 */       double d2; cee ☃ = this.d.f();
/*     */       
/* 146 */       this.d.a();
/* 147 */       double d1 = ☃.b;
/*     */       
/* 149 */       double d3 = ☃.d;
/*     */       
/*     */       do {
/* 152 */         d2 = ☃.c + (this.a.ce().nextFloat() * 20.0F);
/* 153 */       } while (d2 < ☃.c);
/*     */       
/* 155 */       this.e = new cee(d1, d2, d3);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void d() {
/* 161 */     this.c = 0;
/* 162 */     this.e = null;
/* 163 */     this.d = null;
/* 164 */     this.f = null;
/*     */   }
/*     */   
/*     */   public void a(afa ☃) {
/* 168 */     this.f = ☃;
/*     */     
/* 170 */     int i = this.a.l();
/* 171 */     int j = this.a.k(this.f.q, this.f.r, this.f.s);
/*     */     
/* 173 */     int k = xq.c(this.f.q);
/* 174 */     int m = xq.c(this.f.s);
/*     */     
/* 176 */     double d1 = k - this.a.q;
/* 177 */     double d2 = m - this.a.s;
/* 178 */     double d3 = xq.a(d1 * d1 + d2 * d2);
/* 179 */     double d4 = Math.min(0.4000000059604645D + d3 / 80.0D - 1.0D, 10.0D);
/* 180 */     int n = xq.c(this.f.r + d4);
/*     */     
/* 182 */     cbc cbc = new cbc(k, n, m);
/*     */     
/* 184 */     this.d = this.a.a(i, j, cbc);
/*     */     
/* 186 */     if (this.d != null) {
/* 187 */       this.d.a();
/*     */       
/* 189 */       k();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public cee g() {
/* 196 */     return this.e;
/*     */   }
/*     */ 
/*     */   
/*     */   public alt<alr> i() {
/* 201 */     return alt.b;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\alr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */