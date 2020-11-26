/*     */ import com.google.common.collect.Lists;
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
/*     */ public class aov
/*     */   extends aer
/*     */ {
/*     */   private afa a;
/*     */   private aer b;
/*     */   @Nullable
/*     */   private eq c;
/*     */   private int d;
/*     */   private double e;
/*     */   private double f;
/*     */   private double g;
/*     */   @Nullable
/*     */   private UUID h;
/*     */   private el aw;
/*     */   @Nullable
/*     */   private UUID ax;
/*     */   private el ay;
/*     */   
/*     */   public aov(axy ☃) {
/*  52 */     super(aev.ai, ☃);
/*  53 */     a(0.3125F, 0.3125F);
/*     */     
/*  55 */     this.R = true;
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
/*     */   public aov(axy ☃, afa afa1, aer aer1, eq.a a1) {
/*  69 */     this(☃);
/*  70 */     this.a = afa1;
/*     */     
/*  72 */     el el1 = new el(afa1);
/*  73 */     double d1 = el1.o() + 0.5D;
/*  74 */     double d2 = el1.p() + 0.5D;
/*  75 */     double d3 = el1.q() + 0.5D;
/*     */     
/*  77 */     b(d1, d2, d3, this.w, this.x);
/*     */     
/*  79 */     this.b = aer1;
/*     */     
/*  81 */     this.c = eq.b;
/*  82 */     a(a1);
/*     */   }
/*     */ 
/*     */   
/*     */   public wk bV() {
/*  87 */     return wk.f;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b(gy ☃) {
/*  92 */     if (this.a != null) {
/*  93 */       el el1 = new el(this.a);
/*     */       
/*  95 */       gy gy1 = hk.a(this.a.bt());
/*  96 */       gy1.b("X", el1.o());
/*  97 */       gy1.b("Y", el1.p());
/*  98 */       gy1.b("Z", el1.q());
/*  99 */       ☃.a("Owner", gy1);
/*     */     } 
/* 101 */     if (this.b != null) {
/* 102 */       el el1 = new el(this.b);
/*     */       
/* 104 */       gy gy1 = hk.a(this.b.bt());
/* 105 */       gy1.b("X", el1.o());
/* 106 */       gy1.b("Y", el1.p());
/* 107 */       gy1.b("Z", el1.q());
/* 108 */       ☃.a("Target", gy1);
/*     */     } 
/* 110 */     if (this.c != null) {
/* 111 */       ☃.b("Dir", this.c.a());
/*     */     }
/* 113 */     ☃.b("Steps", this.d);
/* 114 */     ☃.a("TXD", this.e);
/* 115 */     ☃.a("TYD", this.f);
/* 116 */     ☃.a("TZD", this.g);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(gy ☃) {
/* 121 */     this.d = ☃.h("Steps");
/* 122 */     this.e = ☃.k("TXD");
/* 123 */     this.f = ☃.k("TYD");
/* 124 */     this.g = ☃.k("TZD");
/* 125 */     if (☃.c("Dir", 99)) {
/* 126 */       this.c = eq.a(☃.h("Dir"));
/*     */     }
/* 128 */     if (☃.c("Owner", 10)) {
/* 129 */       gy gy1 = ☃.p("Owner");
/* 130 */       this.h = hk.b(gy1);
/* 131 */       this.aw = new el(gy1.h("X"), gy1.h("Y"), gy1.h("Z"));
/*     */     } 
/* 133 */     if (☃.c("Target", 10)) {
/* 134 */       gy gy1 = ☃.p("Target");
/* 135 */       this.ax = hk.b(gy1);
/* 136 */       this.ay = new el(gy1.h("X"), gy1.h("Y"), gy1.h("Z"));
/*     */     } 
/*     */   }
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
/*     */   private void a(@Nullable eq ☃) {
/* 150 */     this.c = ☃;
/*     */   }
/*     */   
/*     */   private void a(@Nullable eq.a ☃) {
/*     */     el el1;
/* 155 */     double d1 = 0.5D;
/* 156 */     if (this.b == null) {
/* 157 */       el1 = (new el(this)).b();
/*     */     } else {
/* 159 */       d1 = this.b.I * 0.5D;
/* 160 */       el1 = new el(this.b.q, this.b.r + d1, this.b.s);
/*     */     } 
/*     */     
/* 163 */     double d2 = el1.o() + 0.5D;
/* 164 */     double d3 = el1.p() + d1;
/* 165 */     double d4 = el1.q() + 0.5D;
/*     */     
/* 167 */     eq eq1 = null;
/* 168 */     if (el1.g(this.q, this.r, this.s) >= 4.0D) {
/* 169 */       el el2 = new el(this);
/* 170 */       List<eq> list = Lists.newArrayList();
/*     */       
/* 172 */       if (☃ != eq.a.a) {
/* 173 */         if (el2.o() < el1.o() && this.m.c(el2.f())) {
/* 174 */           list.add(eq.f);
/* 175 */         } else if (el2.o() > el1.o() && this.m.c(el2.e())) {
/* 176 */           list.add(eq.e);
/*     */         } 
/*     */       }
/* 179 */       if (☃ != eq.a.b) {
/* 180 */         if (el2.p() < el1.p() && this.m.c(el2.a())) {
/* 181 */           list.add(eq.b);
/* 182 */         } else if (el2.p() > el1.p() && this.m.c(el2.b())) {
/* 183 */           list.add(eq.a);
/*     */         } 
/*     */       }
/* 186 */       if (☃ != eq.a.c) {
/* 187 */         if (el2.q() < el1.q() && this.m.c(el2.d())) {
/* 188 */           list.add(eq.d);
/* 189 */         } else if (el2.q() > el1.q() && this.m.c(el2.c())) {
/* 190 */           list.add(eq.c);
/*     */         } 
/*     */       }
/*     */       
/* 194 */       eq1 = eq.a(this.T);
/* 195 */       if (list.isEmpty()) {
/* 196 */         int i = 5;
/* 197 */         while (!this.m.c(el2.a(eq1)) && i > 0) {
/* 198 */           eq1 = eq.a(this.T);
/* 199 */           i--;
/*     */         } 
/*     */       } else {
/* 202 */         eq1 = list.get(this.T.nextInt(list.size()));
/*     */       } 
/*     */       
/* 205 */       d2 = this.q + eq1.g();
/* 206 */       d3 = this.r + eq1.h();
/* 207 */       d4 = this.s + eq1.i();
/*     */     } 
/*     */     
/* 210 */     a(eq1);
/*     */     
/* 212 */     double d5 = d2 - this.q;
/* 213 */     double d6 = d3 - this.r;
/* 214 */     double d7 = d4 - this.s;
/*     */     
/* 216 */     double d8 = xq.a(d5 * d5 + d6 * d6 + d7 * d7);
/* 217 */     if (d8 == 0.0D) {
/* 218 */       this.e = 0.0D;
/* 219 */       this.f = 0.0D;
/* 220 */       this.g = 0.0D;
/*     */     } else {
/* 222 */       this.e = d5 / d8 * 0.15D;
/* 223 */       this.f = d6 / d8 * 0.15D;
/* 224 */       this.g = d7 / d8 * 0.15D;
/*     */     } 
/*     */     
/* 227 */     this.al = true;
/* 228 */     this.d = 10 + this.T.nextInt(5) * 10;
/*     */   }
/*     */ 
/*     */   
/*     */   public void R_() {
/* 233 */     if (!this.m.B && this.m.aj() == adi.a) {
/* 234 */       V();
/*     */       
/*     */       return;
/*     */     } 
/* 238 */     super.R_();
/*     */     
/* 240 */     if (!this.m.B) {
/* 241 */       if (this.b == null && this.ax != null) {
/* 242 */         List<afa> list = this.m.a(afa.class, new cea(this.ay.a(-2, -2, -2), this.ay.a(2, 2, 2)));
/* 243 */         for (afa afa1 : list) {
/* 244 */           if (afa1.bt().equals(this.ax)) {
/* 245 */             this.b = afa1;
/*     */             break;
/*     */           } 
/*     */         } 
/* 249 */         this.ax = null;
/*     */       } 
/* 251 */       if (this.a == null && this.h != null) {
/* 252 */         List<afa> list = this.m.a(afa.class, new cea(this.aw.a(-2, -2, -2), this.aw.a(2, 2, 2)));
/* 253 */         for (afa afa1 : list) {
/* 254 */           if (afa1.bt().equals(this.h)) {
/* 255 */             this.a = afa1;
/*     */             break;
/*     */           } 
/*     */         } 
/* 259 */         this.h = null;
/*     */       } 
/*     */       
/* 262 */       if (this.b != null && this.b.aF() && (!(this.b instanceof aog) || !((aog)this.b).t())) {
/* 263 */         this.e = xq.a(this.e * 1.025D, -1.0D, 1.0D);
/* 264 */         this.f = xq.a(this.f * 1.025D, -1.0D, 1.0D);
/* 265 */         this.g = xq.a(this.g * 1.025D, -1.0D, 1.0D);
/*     */         
/* 267 */         this.t += (this.e - this.t) * 0.2D;
/* 268 */         this.u += (this.f - this.u) * 0.2D;
/* 269 */         this.v += (this.g - this.v) * 0.2D;
/*     */       }
/* 271 */       else if (!aj()) {
/* 272 */         this.u -= 0.04D;
/*     */       } 
/*     */ 
/*     */       
/* 276 */       ceb ☃ = aou.a(this, true, false, this.a);
/* 277 */       if (☃ != null) {
/* 278 */         a(☃);
/*     */       }
/*     */     } 
/*     */     
/* 282 */     b(this.q + this.t, this.r + this.u, this.s + this.v);
/*     */     
/* 284 */     aou.a(this, 0.5F);
/*     */     
/* 286 */     if (this.m.B) {
/* 287 */       this.m.a(fm.r, this.q - this.t, this.r - this.u + 0.15D, this.s - this.v, 0.0D, 0.0D, 0.0D);
/*     */     }
/* 289 */     else if (this.b != null && !this.b.G) {
/* 290 */       if (this.d > 0) {
/* 291 */         this.d--;
/* 292 */         if (this.d == 0) {
/* 293 */           a((this.c == null) ? null : this.c.k());
/*     */         }
/*     */       } 
/*     */       
/* 297 */       if (this.c != null) {
/*     */         
/* 299 */         el ☃ = new el(this);
/* 300 */         eq.a a = this.c.k();
/* 301 */         if (this.m.q(☃.a(this.c))) {
/* 302 */           a(a);
/*     */         } else {
/* 304 */           el el1 = new el(this.b);
/* 305 */           if ((a == eq.a.a && ☃.o() == el1.o()) || (a == eq.a.c && ☃
/* 306 */             .q() == el1.q()) || (a == eq.a.b && ☃
/* 307 */             .p() == el1.p()))
/*     */           {
/* 309 */             a(a);
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean aV() {
/* 319 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float az() {
/* 329 */     return 1.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(ceb ☃) {
/* 338 */     if (☃.d == null) {
/* 339 */       ((td)this.m).a(fm.u, this.q, this.r, this.s, 2, 0.2D, 0.2D, 0.2D, 0.0D);
/* 340 */       a(wj.ig, 1.0F, 1.0F);
/*     */     } else {
/* 342 */       boolean bool = ☃.d.a(aea.a(this, this.a).c(), 4.0F);
/* 343 */       if (bool) {
/* 344 */         a(this.a, ☃.d);
/* 345 */         if (☃.d instanceof afa) {
/* 346 */           ((afa)☃.d).c(new aek(aem.y, 200));
/*     */         }
/*     */       } 
/*     */     } 
/* 350 */     V();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean aB() {
/* 355 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(aea ☃, float f) {
/* 360 */     if (!this.m.B) {
/* 361 */       a(wj.ih, 1.0F, 1.0F);
/* 362 */       ((td)this.m).a(fm.h, this.q, this.r, this.s, 15, 0.2D, 0.2D, 0.2D, 0.0D);
/* 363 */       V();
/*     */     } 
/* 365 */     return true;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\aov.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */