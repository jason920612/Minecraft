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
/*     */ public class aml
/*     */   extends aer
/*     */ {
/*  36 */   private blc e = bct.D.p();
/*     */   public int a;
/*     */   public boolean b = true;
/*     */   private boolean f;
/*     */   private boolean g;
/*  41 */   private int h = 40;
/*  42 */   private float aw = 2.0F;
/*     */   
/*     */   public gy c;
/*  45 */   protected static final or<el> d = ou.a((Class)aml.class, ot.l);
/*     */   
/*     */   public aml(axy ☃) {
/*  48 */     super(aev.y, ☃);
/*     */   }
/*     */   
/*     */   public aml(axy ☃, double d1, double d2, double d3, blc blc1) {
/*  52 */     this(☃);
/*  53 */     this.e = blc1;
/*  54 */     this.j = true;
/*  55 */     a(0.98F, 0.98F);
/*  56 */     b(d1, d2 + ((1.0F - this.I) / 2.0F), d3);
/*     */     
/*  58 */     this.t = 0.0D;
/*  59 */     this.u = 0.0D;
/*  60 */     this.v = 0.0D;
/*     */     
/*  62 */     this.n = d1;
/*  63 */     this.o = d2;
/*  64 */     this.p = d3;
/*     */     
/*  66 */     a(new el(this));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean bk() {
/*  71 */     return false;
/*     */   }
/*     */   
/*     */   public void a(el ☃) {
/*  75 */     this.ab.b(d, ☃);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean ak() {
/*  84 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void x_() {
/*  89 */     this.ab.a(d, el.a);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean aB() {
/*  94 */     return !this.G;
/*     */   }
/*     */ 
/*     */   
/*     */   public void R_() {
/*  99 */     if (this.e.f()) {
/* 100 */       V();
/*     */       
/*     */       return;
/*     */     } 
/* 104 */     this.n = this.q;
/* 105 */     this.o = this.r;
/* 106 */     this.p = this.s;
/*     */     
/* 108 */     bcs ☃ = this.e.c();
/* 109 */     if (this.a++ == 0) {
/*     */       
/* 111 */       el el = new el(this);
/* 112 */       if (this.m.a_(el).c() == ☃) {
/* 113 */         this.m.g(el);
/* 114 */       } else if (!this.m.B) {
/* 115 */         V();
/*     */         
/*     */         return;
/*     */       } 
/*     */     } 
/* 120 */     if (!aj()) {
/* 121 */       this.u -= 0.03999999910593033D;
/*     */     }
/* 123 */     a(afe.a, this.t, this.u, this.v);
/*     */     
/* 125 */     if (!this.m.B) {
/* 126 */       el el = new el(this);
/*     */       
/* 128 */       boolean bool1 = this.e.c() instanceof bdo;
/* 129 */       boolean bool2 = (bool1 && this.m.b(el).a(ww.a));
/* 130 */       double d = this.t * this.t + this.u * this.u + this.v * this.v;
/*     */       
/* 132 */       if (bool1 && d > 1.0D) {
/*     */ 
/*     */         
/* 135 */         ceb ceb = this.m.a(new cee(this.n, this.o, this.p), new cee(this.q, this.r, this.s), cec.b);
/* 136 */         if (ceb != null && this.m.b(ceb.a()).a(ww.a)) {
/*     */           
/* 138 */           el = ceb.a();
/* 139 */           bool2 = true;
/*     */         } 
/*     */       } 
/*     */       
/* 143 */       if (this.A || bool2) {
/* 144 */         blc blc1 = this.m.a_(el);
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 149 */         if (!bool2 && bep.k(this.m.a_(new el(this.q, this.r - 0.009999999776482582D, this.s)))) {
/* 150 */           this.A = false;
/*     */           
/*     */           return;
/*     */         } 
/* 154 */         this.t *= 0.699999988079071D;
/* 155 */         this.v *= 0.699999988079071D;
/* 156 */         this.u *= -0.5D;
/*     */         
/* 158 */         if (blc1.c() != bct.bo) {
/* 159 */           V();
/*     */           
/* 161 */           if (!this.f) {
/* 162 */             if (blc1.d().e() && (bool2 || !bep.k(this.m.a_(el.b()))) && this.m.a(el, this.e, 3)) {
/* 163 */               if (☃ instanceof bep) {
/* 164 */                 ((bep)☃).a(this.m, el, this.e, blc1);
/*     */               }
/* 166 */               if (this.c != null && ☃ instanceof ben) {
/* 167 */                 bji bji = this.m.f(el);
/*     */                 
/* 169 */                 if (bji != null) {
/* 170 */                   gy gy1 = bji.a(new gy());
/* 171 */                   for (String str : this.c.c()) {
/* 172 */                     ho ho = this.c.c(str);
/* 173 */                     if ("x".equals(str) || "y".equals(str) || "z".equals(str)) {
/*     */                       continue;
/*     */                     }
/* 176 */                     gy1.a(str, ho.b());
/*     */                   } 
/* 178 */                   bji.b(gy1);
/* 179 */                   bji.g();
/*     */                 } 
/*     */               } 
/* 182 */             } else if (this.b && this.m.X().b("doEntityDrops")) {
/* 183 */               a(☃);
/*     */             } 
/* 185 */           } else if (☃ instanceof bep) {
/* 186 */             ((bep)☃).a(this.m, el);
/*     */           } 
/*     */         } 
/* 189 */       } else if ((this.a > 100 && !this.m.B && (el.p() < 1 || el.p() > 256)) || this.a > 600) {
/*     */         
/* 191 */         if (this.b && this.m.X().b("doEntityDrops")) {
/* 192 */           a(☃);
/*     */         }
/* 194 */         V();
/*     */       } 
/*     */     } 
/*     */     
/* 198 */     this.t *= 0.9800000190734863D;
/* 199 */     this.u *= 0.9800000190734863D;
/* 200 */     this.v *= 0.9800000190734863D;
/*     */   }
/*     */ 
/*     */   
/*     */   public void c(float ☃, float f1) {
/* 205 */     if (this.g) {
/* 206 */       int i = xq.f(☃ - 1.0F);
/* 207 */       if (i > 0) {
/* 208 */         List<aer> list = Lists.newArrayList(this.m.a(this, bD()));
/* 209 */         boolean bool = this.e.a(wv.y);
/* 210 */         aea aea = bool ? aea.q : aea.r;
/*     */         
/* 212 */         for (aer aer1 : list) {
/* 213 */           aer1.a(aea, Math.min(xq.d(i * this.aw), this.h));
/*     */         }
/*     */         
/* 216 */         if (bool && this.T.nextFloat() < 0.05000000074505806D + i * 0.05D) {
/* 217 */           blc blc1 = bce.a_(this.e);
/* 218 */           if (blc1 == null) {
/* 219 */             this.f = true;
/*     */           } else {
/* 221 */             this.e = blc1;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b(gy ☃) {
/* 230 */     ☃.a("BlockState", hk.a(this.e));
/* 231 */     ☃.b("Time", this.a);
/* 232 */     ☃.a("DropItem", this.b);
/* 233 */     ☃.a("HurtEntities", this.g);
/* 234 */     ☃.a("FallHurtAmount", this.aw);
/* 235 */     ☃.b("FallHurtMax", this.h);
/* 236 */     if (this.c != null) {
/* 237 */       ☃.a("TileEntityData", this.c);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(gy ☃) {
/* 243 */     this.e = hk.d(☃.p("BlockState"));
/*     */     
/* 245 */     this.a = ☃.h("Time");
/*     */     
/* 247 */     if (☃.c("HurtEntities", 99)) {
/* 248 */       this.g = ☃.q("HurtEntities");
/* 249 */       this.aw = ☃.j("FallHurtAmount");
/* 250 */       this.h = ☃.h("FallHurtMax");
/* 251 */     } else if (this.e.a(wv.y)) {
/* 252 */       this.g = true;
/*     */     } 
/*     */     
/* 255 */     if (☃.c("DropItem", 99)) {
/* 256 */       this.b = ☃.q("DropItem");
/*     */     }
/*     */     
/* 259 */     if (☃.c("TileEntityData", 10)) {
/* 260 */       this.c = ☃.p("TileEntityData");
/*     */     }
/*     */     
/* 263 */     if (this.e.f()) {
/* 264 */       this.e = bct.D.p();
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(boolean ☃) {
/* 273 */     this.g = ☃;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(c ☃) {
/* 283 */     super.a(☃);
/* 284 */     ☃.a("Immitating BlockState", this.e.toString());
/*     */   }
/*     */   
/*     */   public blc k() {
/* 288 */     return this.e;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean bM() {
/* 293 */     return true;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\aml.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */