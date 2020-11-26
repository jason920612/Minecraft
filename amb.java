/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.commons.lang3.Validate;
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
/*     */ public class amb
/*     */   extends ama
/*     */ {
/*  33 */   private static final Logger d = LogManager.getLogger();
/*     */   
/*  35 */   private static final or<ate> e = ou.a((Class)amb.class, ot.g);
/*  36 */   private static final or<Integer> f = ou.a((Class)amb.class, ot.b);
/*     */ 
/*     */   
/*  39 */   private float g = 1.0F;
/*     */   
/*     */   public amb(axy ☃) {
/*  42 */     super(aev.H, ☃);
/*     */   }
/*     */   
/*     */   public amb(axy ☃, el el1, eq eq1) {
/*  46 */     super(aev.H, ☃, el1);
/*  47 */     a(eq1);
/*     */   }
/*     */ 
/*     */   
/*     */   public float bF() {
/*  52 */     return 0.0F;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void x_() {
/*  57 */     T().a(e, ate.a);
/*  58 */     T().a(f, Integer.valueOf(0));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(eq ☃) {
/*  63 */     Validate.notNull(☃);
/*     */     
/*  65 */     this.c = ☃;
/*  66 */     if (☃.k().c()) {
/*  67 */       this.x = 0.0F;
/*  68 */       this.w = (this.c.b() * 90);
/*     */     } else {
/*  70 */       this.x = (-90 * ☃.c().a());
/*  71 */       this.w = 0.0F;
/*     */     } 
/*  73 */     this.z = this.x;
/*  74 */     this.y = this.w;
/*     */     
/*  76 */     f();
/*     */   }
/*     */ 
/*     */   
/*     */   protected void f() {
/*  81 */     if (this.c == null) {
/*     */       return;
/*     */     }
/*     */     
/*  85 */     double ☃ = 0.46875D;
/*  86 */     this.q = this.b.o() + 0.5D - this.c.g() * 0.46875D;
/*  87 */     this.r = this.b.p() + 0.5D - this.c.h() * 0.46875D;
/*  88 */     this.s = this.b.q() + 0.5D - this.c.i() * 0.46875D;
/*     */     
/*  90 */     double d1 = k();
/*  91 */     double d2 = l();
/*  92 */     double d3 = k();
/*     */     
/*  94 */     eq.a a = this.c.k();
/*  95 */     switch (null.a[a.ordinal()]) {
/*     */       case 1:
/*  97 */         d1 = 1.0D;
/*     */         break;
/*     */       case 2:
/* 100 */         d2 = 1.0D;
/*     */         break;
/*     */       case 3:
/* 103 */         d3 = 1.0D;
/*     */         break;
/*     */     } 
/*     */     
/* 107 */     d1 /= 32.0D;
/* 108 */     d2 /= 32.0D;
/* 109 */     d3 /= 32.0D;
/* 110 */     a(new cea(this.q - d1, this.r - d2, this.s - d3, this.q + d1, this.r + d2, this.s + d3));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean i() {
/* 115 */     if (!this.m.c(this, bD())) {
/* 116 */       return false;
/*     */     }
/*     */     
/* 119 */     blc ☃ = this.m.a_(this.b.a(this.c.d()));
/* 120 */     if (!☃.d().b() && (!this.c.k().c() || !bea.x(☃))) {
/* 121 */       return false;
/*     */     }
/*     */     
/* 124 */     return this.m.a(this, bD(), a).isEmpty();
/*     */   }
/*     */ 
/*     */   
/*     */   public float aM() {
/* 129 */     return 0.0F;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(aea ☃, float f) {
/* 134 */     if (b(☃)) {
/* 135 */       return false;
/*     */     }
/*     */     
/* 138 */     if (!☃.d() && !o().a()) {
/* 139 */       if (!this.m.B) {
/* 140 */         b(☃.k(), false);
/* 141 */         a(wj.eB, 1.0F, 1.0F);
/*     */       } 
/* 143 */       return true;
/*     */     } 
/* 145 */     return super.a(☃, f);
/*     */   }
/*     */ 
/*     */   
/*     */   public int k() {
/* 150 */     return 12;
/*     */   }
/*     */ 
/*     */   
/*     */   public int l() {
/* 155 */     return 12;
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
/*     */   public void a(@Nullable aer ☃) {
/* 167 */     a(wj.ez, 1.0F, 1.0F);
/* 168 */     b(☃, true);
/*     */   }
/*     */ 
/*     */   
/*     */   public void m() {
/* 173 */     a(wj.eA, 1.0F, 1.0F);
/*     */   }
/*     */   
/*     */   public void b(@Nullable aer ☃, boolean bool) {
/* 177 */     if (!this.m.X().b("doEntityDrops")) {
/*     */       return;
/*     */     }
/*     */     
/* 181 */     ate ate = o();
/* 182 */     b(ate.a);
/*     */     
/* 184 */     if (☃ instanceof aog) {
/* 185 */       aog aog = (aog)☃;
/*     */       
/* 187 */       if (aog.bV.d) {
/* 188 */         c(ate);
/*     */         
/*     */         return;
/*     */       } 
/*     */     } 
/* 193 */     if (bool) {
/* 194 */       a(atf.dB);
/*     */     }
/* 196 */     if (!ate.a() && this.T.nextFloat() < this.g) {
/* 197 */       ate = ate.i();
/* 198 */       c(ate);
/* 199 */       a_(ate);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void c(ate ☃) {
/* 204 */     if (☃.b() == atf.bQ) {
/* 205 */       cbs cbs = atj.a(☃, this.m);
/* 206 */       cbs.a(this.b, Q());
/*     */     } 
/* 208 */     ☃.a((amb)null);
/*     */   }
/*     */   
/*     */   public ate o() {
/* 212 */     return T().<ate>a(e);
/*     */   }
/*     */   
/*     */   public void b(ate ☃) {
/* 216 */     a(☃, true);
/*     */   }
/*     */   
/*     */   private void a(ate ☃, boolean bool) {
/* 220 */     if (!☃.a()) {
/* 221 */       ☃ = ☃.i();
/* 222 */       ☃.e(1);
/* 223 */       ☃.a(this);
/*     */     } 
/* 225 */     T().b(e, ☃);
/* 226 */     if (!☃.a()) {
/* 227 */       a(wj.ey, 1.0F, 1.0F);
/*     */     }
/*     */     
/* 230 */     if (bool && this.b != null) {
/* 231 */       this.m.c(this.b, bct.a);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(or<?> ☃) {
/* 237 */     if (☃.equals(e)) {
/* 238 */       ate ate = o();
/* 239 */       if (!ate.a() && ate.y() != this) {
/* 240 */         ate.a(this);
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public int p() {
/* 246 */     return ((Integer)T().<Integer>a(f)).intValue();
/*     */   }
/*     */   
/*     */   public void a(int ☃) {
/* 250 */     a(☃, true);
/*     */   }
/*     */   
/*     */   private void a(int ☃, boolean bool) {
/* 254 */     T().b(f, Integer.valueOf(☃ % 8));
/*     */     
/* 256 */     if (bool && this.b != null) {
/* 257 */       this.m.c(this.b, bct.a);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(gy ☃) {
/* 263 */     super.b(☃);
/*     */     
/* 265 */     if (!o().a()) {
/* 266 */       ☃.a("Item", o().b(new gy()));
/* 267 */       ☃.a("ItemRotation", (byte)p());
/* 268 */       ☃.a("ItemDropChance", this.g);
/*     */     } 
/*     */     
/* 271 */     ☃.a("Facing", (byte)this.c.a());
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(gy ☃) {
/* 276 */     super.a(☃);
/* 277 */     gy gy1 = ☃.p("Item");
/* 278 */     if (gy1 != null && !gy1.isEmpty()) {
/* 279 */       ate ate = ate.a(gy1);
/* 280 */       if (ate.a()) {
/* 281 */         d.warn("Unable to load item from: {}", gy1);
/*     */       }
/* 283 */       a(ate, false);
/* 284 */       a(☃.f("ItemRotation"), false);
/*     */       
/* 286 */       if (☃.c("ItemDropChance", 99)) {
/* 287 */         this.g = ☃.j("ItemDropChance");
/*     */       }
/*     */     } 
/* 290 */     a(eq.a(☃.f("Facing")));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean b(aog ☃, adk adk1) {
/* 296 */     ate ate = ☃.b(adk1);
/* 297 */     if (!this.m.B) {
/* 298 */       if (o().a()) {
/* 299 */         if (!ate.a()) {
/* 300 */           b(ate);
/*     */           
/* 302 */           if (!☃.bV.d) {
/* 303 */             ate.g(1);
/*     */           }
/*     */         } 
/*     */       } else {
/* 307 */         a(wj.eC, 1.0F, 1.0F);
/* 308 */         a(p() + 1);
/*     */       } 
/*     */     }
/*     */     
/* 312 */     return true;
/*     */   }
/*     */   
/*     */   public int q() {
/* 316 */     if (o().a()) {
/* 317 */       return 0;
/*     */     }
/*     */     
/* 320 */     return p() % 8 + 1;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\amb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */