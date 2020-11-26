/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.List;
/*     */ import java.util.Random;
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
/*     */ public class bjo
/*     */   extends bji
/*     */   implements pt
/*     */ {
/*  41 */   private static final bcs[] e = new bcs[] { bct.hg, bct.hh, bct.hm, bct.hi };
/*     */   
/*     */   public int a;
/*     */   
/*     */   private float f;
/*     */   private boolean g;
/*     */   private boolean h;
/*  48 */   private final List<el> i = Lists.newArrayList();
/*     */   
/*     */   private afa j;
/*     */   private UUID k;
/*     */   private long l;
/*     */   
/*     */   public bjo() {
/*  55 */     this(bjj.y);
/*     */   }
/*     */   
/*     */   public bjo(bjj<?> ☃) {
/*  59 */     super(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(gy ☃) {
/*  64 */     super.b(☃);
/*     */     
/*  66 */     if (☃.e("target_uuid")) {
/*  67 */       this.k = hk.b(☃.p("target_uuid"));
/*     */     } else {
/*  69 */       this.k = null;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public gy a(gy ☃) {
/*  75 */     super.a(☃);
/*     */     
/*  77 */     if (this.j != null) {
/*  78 */       ☃.a("target_uuid", hk.a(this.j.bt()));
/*     */     }
/*     */     
/*  81 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public ji Z_() {
/*  87 */     return new ji(this.d_, 5, aa_());
/*     */   }
/*     */ 
/*     */   
/*     */   public gy aa_() {
/*  92 */     return a(new gy());
/*     */   }
/*     */ 
/*     */   
/*     */   public void Y_() {
/*  97 */     this.a++;
/*     */     
/*  99 */     long ☃ = this.c_.V();
/* 100 */     if (☃ % 40L == 0L) {
/* 101 */       a(f());
/* 102 */       if (!this.c_.B && c()) {
/* 103 */         h();
/* 104 */         i();
/*     */       } 
/*     */     } 
/*     */     
/* 108 */     if (☃ % 80L == 0L && c()) {
/* 109 */       a(wj.aP);
/*     */     }
/*     */     
/* 112 */     if (☃ > this.l && c()) {
/* 113 */       this.l = ☃ + 60L + this.c_.m().nextInt(40);
/* 114 */       a(wj.aQ);
/*     */     } 
/*     */     
/* 117 */     if (this.c_.B) {
/* 118 */       j();
/* 119 */       m();
/* 120 */       if (c()) {
/* 121 */         this.f++;
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   private boolean f() {
/* 127 */     this.i.clear();
/*     */     
/*     */     int ☃;
/* 130 */     for (☃ = -1; ☃ <= 1; ☃++) {
/* 131 */       for (int i = -1; i <= 1; i++) {
/* 132 */         for (int j = -1; j <= 1; j++) {
/* 133 */           el el = this.d_.a(☃, i, j);
/* 134 */           if (!this.c_.B(el)) {
/* 135 */             return false;
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 142 */     for (☃ = -2; ☃ <= 2; ☃++) {
/* 143 */       for (int i = -2; i <= 2; i++) {
/* 144 */         for (int j = -2; j <= 2; j++) {
/* 145 */           int k = Math.abs(☃);
/* 146 */           int m = Math.abs(i);
/* 147 */           int n = Math.abs(j);
/* 148 */           if (k > 1 || m > 1 || n > 1)
/*     */           {
/*     */             
/* 151 */             if ((☃ == 0 && (m == 2 || n == 2)) || (i == 0 && (k == 2 || n == 2)) || (j == 0 && (k == 2 || m == 2))) {
/* 152 */               el el = this.d_.a(☃, i, j);
/* 153 */               blc blc = this.c_.a_(el);
/* 154 */               for (bcs bcs1 : e) {
/* 155 */                 if (blc.c() == bcs1) {
/* 156 */                   this.i.add(el);
/*     */                 }
/*     */               } 
/*     */             } 
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/* 164 */     b((this.i.size() >= 42));
/*     */     
/* 166 */     return (this.i.size() >= 16);
/*     */   }
/*     */   
/*     */   private void h() {
/* 170 */     int ☃ = this.i.size();
/* 171 */     int i = ☃ / 7 * 16;
/*     */ 
/*     */     
/* 174 */     int j = this.d_.o();
/* 175 */     int k = this.d_.p();
/* 176 */     int m = this.d_.q();
/* 177 */     cea cea = (new cea(j, k, m, (j + 1), (k + 1), (m + 1))).g(i).b(0.0D, this.c_.aa(), 0.0D);
/* 178 */     List<aog> list = this.c_.a(aog.class, cea);
/*     */     
/* 180 */     if (list.isEmpty()) {
/*     */       return;
/*     */     }
/*     */     
/* 184 */     for (aog aog : list) {
/* 185 */       if (this.d_.m(new el(aog)) <= i && aog.ao()) {
/* 186 */         aog.c(new aek(aem.C, 260, 0, true, true));
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   private void i() {
/* 192 */     afa ☃ = this.j;
/* 193 */     int i = this.i.size();
/* 194 */     if (i < 42) {
/* 195 */       this.j = null;
/* 196 */     } else if (this.j == null && this.k != null) {
/*     */       
/* 198 */       this.j = l();
/* 199 */       this.k = null;
/* 200 */     } else if (this.j == null) {
/* 201 */       List<afa> list = this.c_.a(afa.class, k(), ☃ -> (☃ instanceof amy && ☃.ao()));
/* 202 */       if (!list.isEmpty()) {
/* 203 */         this.j = list.get(this.c_.s.nextInt(list.size()));
/*     */       }
/* 205 */     } else if (!this.j.aF() || this.d_.m(new el(this.j)) > 8.0D) {
/* 206 */       this.j = null;
/*     */     } 
/*     */     
/* 209 */     if (this.j != null) {
/* 210 */       this.c_.a((aog)null, this.j.q, this.j.r, this.j.s, wj.aR, wk.e, 1.0F, 1.0F);
/* 211 */       this.j.a(aea.o, 4.0F);
/*     */     } 
/*     */     
/* 214 */     if (☃ != this.j) {
/* 215 */       blc blc = w();
/* 216 */       this.c_.a(this.d_, blc, blc, 2);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void j() {
/* 221 */     if (this.k == null) {
/* 222 */       this.j = null;
/* 223 */     } else if (this.j == null || !this.j.bt().equals(this.k)) {
/* 224 */       this.j = l();
/* 225 */       if (this.j == null) {
/* 226 */         this.k = null;
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   private cea k() {
/* 232 */     int ☃ = this.d_.o();
/* 233 */     int i = this.d_.p();
/* 234 */     int j = this.d_.q();
/* 235 */     return (new cea(☃, i, j, (☃ + 1), (i + 1), (j + 1))).g(8.0D);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private afa l() {
/* 240 */     List<afa> ☃ = this.c_.a(afa.class, k(), ☃ -> ☃.bt().equals(this.k));
/* 241 */     if (☃.size() == 1) {
/* 242 */       return ☃.get(0);
/*     */     }
/* 244 */     return null;
/*     */   }
/*     */   
/*     */   private void m() {
/* 248 */     Random ☃ = this.c_.s;
/*     */     
/* 250 */     float f = xq.a((this.a + 35) * 0.1F) / 2.0F + 0.5F;
/* 251 */     f = (f * f + f) * 0.3F;
/*     */     
/* 253 */     cee cee = new cee((this.d_.o() + 0.5F), (this.d_.p() + 1.5F + f), (this.d_.q() + 0.5F));
/* 254 */     for (el el1 : this.i) {
/* 255 */       if (☃.nextInt(50) != 0) {
/*     */         continue;
/*     */       }
/*     */       
/* 259 */       float f1 = -0.5F + ☃.nextFloat();
/* 260 */       float f2 = -2.0F + ☃.nextFloat();
/* 261 */       float f3 = -0.5F + ☃.nextFloat();
/* 262 */       el el2 = el1.b(this.d_);
/* 263 */       cee cee1 = (new cee(f1, f2, f3)).b(el2.o(), el2.p(), el2.q());
/* 264 */       this.c_.a(fm.W, cee.b, cee.c, cee.d, cee1.b, cee1.c, cee1.d);
/*     */     } 
/*     */     
/* 267 */     if (this.j != null) {
/* 268 */       cee cee1 = new cee(this.j.q, this.j.r + this.j.bF(), this.j.s);
/* 269 */       float f1 = (-0.5F + ☃.nextFloat()) * (3.0F + this.j.H);
/* 270 */       float f2 = -1.0F + ☃.nextFloat() * this.j.I;
/* 271 */       float f3 = (-0.5F + ☃.nextFloat()) * (3.0F + this.j.H);
/* 272 */       cee cee2 = new cee(f1, f2, f3);
/* 273 */       this.c_.a(fm.W, cee1.b, cee1.c, cee1.d, cee2.b, cee2.c, cee2.d);
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean c() {
/* 278 */     return this.g;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void a(boolean ☃) {
/* 286 */     if (☃ != this.g) {
/* 287 */       a(☃ ? wj.aO : wj.aS);
/*     */     }
/*     */     
/* 290 */     this.g = ☃;
/*     */   }
/*     */   
/*     */   private void b(boolean ☃) {
/* 294 */     this.h = ☃;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(wi ☃) {
/* 302 */     this.c_.a((aog)null, this.d_, ☃, wk.e, 1.0F, 1.0F);
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bjo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */