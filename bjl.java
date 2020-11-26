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
/*     */ public class bjl
/*     */   extends bka
/*     */   implements pt
/*     */ {
/*  35 */   private ez<ate> j = ez.a(27, ate.a);
/*     */   
/*     */   protected float a;
/*     */   protected float e;
/*     */   protected int f;
/*     */   private int k;
/*     */   
/*     */   protected bjl(bjj<?> ☃) {
/*  43 */     super(☃);
/*     */   }
/*     */   
/*     */   public bjl() {
/*  47 */     this(bjj.b);
/*     */   }
/*     */ 
/*     */   
/*     */   public int T_() {
/*  52 */     return 27;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean P_() {
/*  57 */     for (ate ☃ : this.j) {
/*  58 */       if (!☃.a()) {
/*  59 */         return false;
/*     */       }
/*     */     } 
/*  62 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public ij N_() {
/*  67 */     ij ☃ = e();
/*  68 */     if (☃ != null) {
/*  69 */       return ☃;
/*     */     }
/*  71 */     return new ir("container.chest", new Object[0]);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(gy ☃) {
/*  76 */     super.b(☃);
/*     */     
/*  78 */     this.j = ez.a(T_(), ate.a);
/*  79 */     if (!d(☃)) {
/*  80 */       adf.b(☃, this.j);
/*     */     }
/*     */     
/*  83 */     if (☃.c("CustomName", 8)) {
/*  84 */       this.i = ij.a.a(☃.l("CustomName"));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public gy a(gy ☃) {
/*  90 */     super.a(☃);
/*  91 */     if (!e(☃)) {
/*  92 */       adf.a(☃, this.j);
/*     */     }
/*     */     
/*  95 */     ij ij = e();
/*  96 */     if (ij != null) {
/*  97 */       ☃.a("CustomName", ij.a.a(ij));
/*     */     }
/*     */     
/* 100 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public int f() {
/* 105 */     return 64;
/*     */   }
/*     */ 
/*     */   
/*     */   public void Y_() {
/* 110 */     int ☃ = this.d_.o();
/* 111 */     int i = this.d_.p();
/* 112 */     int j = this.d_.q();
/*     */     
/* 114 */     this.k++;
/* 115 */     if (!this.c_.B && this.f != 0 && (this.k + ☃ + i + j) % 200 == 0) {
/* 116 */       this.f = 0;
/*     */       
/* 118 */       float f1 = 5.0F;
/* 119 */       List<aog> list = this.c_.a(aog.class, new cea((☃ - 5.0F), (i - 5.0F), (j - 5.0F), ((☃ + 1) + 5.0F), ((i + 1) + 5.0F), ((j + 1) + 5.0F)));
/* 120 */       for (aog aog : list) {
/* 121 */         if (aog.bE instanceof apz) {
/* 122 */           ade ade = ((apz)aog.bE).d();
/* 123 */           if (ade == this || (ade instanceof add && ((add)ade).a(this))) {
/* 124 */             this.f++;
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 130 */     this.e = this.a;
/*     */     
/* 132 */     float f = 0.1F;
/* 133 */     if (this.f > 0 && this.a == 0.0F) {
/* 134 */       a(wj.av);
/*     */     }
/* 136 */     if ((this.f == 0 && this.a > 0.0F) || (this.f > 0 && this.a < 1.0F)) {
/* 137 */       float f1 = this.a;
/* 138 */       if (this.f > 0) {
/* 139 */         this.a += 0.1F;
/*     */       } else {
/* 141 */         this.a -= 0.1F;
/*     */       } 
/* 143 */       if (this.a > 1.0F) {
/* 144 */         this.a = 1.0F;
/*     */       }
/* 146 */       float f2 = 0.5F;
/* 147 */       if (this.a < 0.5F && f1 >= 0.5F) {
/* 148 */         a(wj.at);
/*     */       }
/* 150 */       if (this.a < 0.0F) {
/* 151 */         this.a = 0.0F;
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(wi ☃) {
/* 157 */     bmc bmc = (bmc)w().c(bdh.b);
/* 158 */     if (bmc == bmc.b) {
/*     */       return;
/*     */     }
/*     */ 
/*     */     
/* 163 */     double d1 = this.d_.o() + 0.5D;
/* 164 */     double d2 = this.d_.p() + 0.5D;
/* 165 */     double d3 = this.d_.q() + 0.5D;
/*     */     
/* 167 */     if (bmc == bmc.c) {
/* 168 */       eq eq = bdh.k(w());
/* 169 */       d1 += eq.g() * 0.5D;
/* 170 */       d3 += eq.i() * 0.5D;
/*     */     } 
/*     */     
/* 173 */     this.c_.a((aog)null, d1, d2, d3, ☃, wk.e, 0.5F, this.c_.s.nextFloat() * 0.1F + 0.9F);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c(int ☃, int i) {
/* 178 */     if (☃ == 1) {
/* 179 */       this.f = i;
/* 180 */       return true;
/*     */     } 
/* 182 */     return super.c(☃, i);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(aog ☃) {
/* 187 */     if (!☃.t()) {
/* 188 */       if (this.f < 0) {
/* 189 */         this.f = 0;
/*     */       }
/* 191 */       this.f++;
/* 192 */       p();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void c(aog ☃) {
/* 198 */     if (!☃.t()) {
/* 199 */       this.f--;
/* 200 */       p();
/*     */     } 
/*     */   }
/*     */   
/*     */   protected void p() {
/* 205 */     bcs ☃ = w().c();
/* 206 */     if (☃ instanceof bdh) {
/* 207 */       this.c_.a(this.d_, ☃, 1, this.f);
/* 208 */       this.c_.b(this.d_, ☃);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public String l() {
/* 214 */     return "minecraft:chest";
/*     */   }
/*     */ 
/*     */   
/*     */   public apv a(aof ☃, aog aog1) {
/* 219 */     d(aog1);
/* 220 */     return new apz(☃, this, aog1);
/*     */   }
/*     */ 
/*     */   
/*     */   protected ez<ate> q() {
/* 225 */     return this.j;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(ez<ate> ☃) {
/* 230 */     this.j = ☃;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static int a(axk ☃, el el1) {
/* 239 */     blc blc = ☃.a_(el1);
/* 240 */     if (blc.c().i()) {
/* 241 */       bji bji = ☃.f(el1);
/* 242 */       if (bji instanceof bjl) {
/* 243 */         return ((bjl)bji).f;
/*     */       }
/*     */     } 
/* 246 */     return 0;
/*     */   }
/*     */   
/*     */   public static void a(bjl ☃, bjl bjl1) {
/* 250 */     ez<ate> ez1 = ☃.q();
/* 251 */     ☃.a(bjl1.q());
/* 252 */     bjl1.a(ez1);
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bjl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */