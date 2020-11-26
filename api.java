/*     */ import java.util.Random;
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
/*     */ public abstract class api
/*     */   extends aph
/*     */   implements adq, ads
/*     */ {
/*  33 */   private ez<ate> a = ez.a(36, ate.a);
/*     */   private boolean b = true;
/*     */   private pc c;
/*     */   private long d;
/*     */   
/*     */   protected api(aev<?> ☃, axy axy1) {
/*  39 */     super(☃, axy1);
/*     */   }
/*     */   
/*     */   protected api(aev<?> ☃, double d1, double d2, double d3, axy axy1) {
/*  43 */     super(☃, axy1, d1, d2, d3);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(aea ☃) {
/*  48 */     super.a(☃);
/*     */     
/*  50 */     if (this.m.X().b("doEntityDrops")) {
/*  51 */       adh.a(this.m, this, this);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean P_() {
/*  57 */     for (ate ☃ : this.a) {
/*  58 */       if (!☃.a()) {
/*  59 */         return false;
/*     */       }
/*     */     } 
/*  62 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public ate a(int ☃) {
/*  67 */     f((aog)null);
/*  68 */     return this.a.get(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public ate a(int ☃, int i) {
/*  73 */     f((aog)null);
/*     */     
/*  75 */     return adf.a(this.a, ☃, i);
/*     */   }
/*     */ 
/*     */   
/*     */   public ate b(int ☃) {
/*  80 */     f((aog)null);
/*  81 */     ate ate = this.a.get(☃);
/*  82 */     if (ate.a()) {
/*  83 */       return ate.a;
/*     */     }
/*  85 */     this.a.set(☃, ate.a);
/*  86 */     return ate;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(int ☃, ate ate1) {
/*  91 */     f((aog)null);
/*  92 */     this.a.set(☃, ate1);
/*  93 */     if (!ate1.a() && ate1.C() > f()) {
/*  94 */       ate1.e(f());
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c(int ☃, ate ate1) {
/* 100 */     if (☃ >= 0 && ☃ < T_()) {
/* 101 */       a(☃, ate1);
/* 102 */       return true;
/*     */     } 
/*     */     
/* 105 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void g() {}
/*     */ 
/*     */   
/*     */   public boolean a(aog ☃) {
/* 114 */     if (this.G) {
/* 115 */       return false;
/*     */     }
/* 117 */     if (☃.h(this) > 64.0D) {
/* 118 */       return false;
/*     */     }
/* 120 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(aog ☃) {}
/*     */ 
/*     */ 
/*     */   
/*     */   public void c(aog ☃) {}
/*     */ 
/*     */   
/*     */   public boolean b(int ☃, ate ate1) {
/* 133 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int f() {
/* 138 */     return 64;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public aer a(bod ☃) {
/* 144 */     this.b = false;
/* 145 */     return super.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void V() {
/* 150 */     if (this.b) {
/* 151 */       adh.a(this.m, this, this);
/*     */     }
/*     */     
/* 154 */     super.V();
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(boolean ☃) {
/* 159 */     this.b = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b(gy ☃) {
/* 164 */     super.b(☃);
/*     */     
/* 166 */     if (this.c != null) {
/* 167 */       ☃.a("LootTable", this.c.toString());
/* 168 */       if (this.d != 0L) {
/* 169 */         ☃.a("LootTableSeed", this.d);
/*     */       }
/*     */     } else {
/* 172 */       adf.a(☃, this.a);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(gy ☃) {
/* 178 */     super.a(☃);
/* 179 */     this.a = ez.a(T_(), ate.a);
/*     */     
/* 181 */     if (☃.c("LootTable", 8)) {
/* 182 */       this.c = new pc(☃.l("LootTable"));
/* 183 */       this.d = ☃.i("LootTableSeed");
/*     */     } else {
/* 185 */       adf.b(☃, this.a);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(aog ☃, adk adk1) {
/* 191 */     if (!this.m.B) {
/* 192 */       ☃.a(this);
/*     */     }
/*     */     
/* 195 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void r() {
/* 200 */     float ☃ = 0.98F;
/*     */     
/* 202 */     if (this.c == null) {
/* 203 */       int i = 15 - apv.b(this);
/* 204 */       ☃ += i * 0.001F;
/*     */     } 
/*     */     
/* 207 */     this.t *= ☃;
/* 208 */     this.u *= 0.0D;
/* 209 */     this.v *= ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public int c(int ☃) {
/* 214 */     return 0;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(int ☃, int i) {}
/*     */ 
/*     */   
/*     */   public int h() {
/* 223 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean V_() {
/* 228 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(adp ☃) {}
/*     */ 
/*     */   
/*     */   public adp j() {
/* 237 */     return adp.a;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void f(@Nullable aog ☃) {
/* 245 */     if (this.c != null && this.m.z() != null) {
/* 246 */       Random random; ccq ccq = this.m.z().aN().a(this.c);
/* 247 */       this.c = null;
/*     */       
/* 249 */       if (this.d == 0L) {
/* 250 */         random = new Random();
/*     */       } else {
/* 252 */         random = new Random(this.d);
/*     */       } 
/* 254 */       ccr.a a = (new ccr.a((td)this.m)).a(new el(this));
/* 255 */       if (☃ != null) {
/* 256 */         a.a(☃.dJ());
/*     */       }
/* 258 */       ccq.a(this, random, a.a());
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void m() {
/* 264 */     f((aog)null);
/* 265 */     this.a.clear();
/*     */   }
/*     */   
/*     */   public void a(pc ☃, long l) {
/* 269 */     this.c = ☃;
/* 270 */     this.d = l;
/*     */   }
/*     */ 
/*     */   
/*     */   public pc Q_() {
/* 275 */     return this.c;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\api.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */