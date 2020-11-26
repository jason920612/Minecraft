/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.collect.Sets;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Random;
/*     */ import java.util.Set;
/*     */ import java.util.function.Predicate;
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
/*     */ public class ajz
/*     */   extends akg
/*     */   implements ajv
/*     */ {
/*  61 */   private static final or<Integer> bL = ou.a((Class)ajz.class, ot.b);
/*  62 */   private static final Predicate<afb> bM = new Predicate<afb>()
/*     */     {
/*     */       public boolean a(@Nullable afb ☃) {
/*  65 */         return (☃ != null && ajz.dJ().containsKey(☃.P()));
/*     */       }
/*     */     };
/*     */   
/*  69 */   private static final ata bN = atf.bP;
/*  70 */   private static final Set<ata> bO = Sets.newHashSet((Object[])new ata[] { atf.R, atf.bV, atf.bU, atf.eO }); private static final Map<aev<?>, wi> bP;
/*     */   public float bG;
/*     */   
/*     */   static {
/*  74 */     bP = k.<Map<aev<?>, wi>>a(Maps.newHashMap(), ☃ -> {
/*     */           ☃.put(aev.e, wj.fU);
/*     */           ☃.put(aev.g, wj.gm);
/*     */           ☃.put(aev.k, wj.fV);
/*     */           ☃.put(aev.o, wj.fW);
/*     */           ☃.put(aev.p, wj.fX);
/*     */           ☃.put(aev.r, wj.fY);
/*     */           ☃.put(aev.s, wj.fZ);
/*     */           ☃.put(aev.t, wj.ga);
/*     */           ☃.put(aev.v, wj.gb);
/*     */           ☃.put(aev.A, wj.gc);
/*     */           ☃.put(aev.E, wj.gd);
/*     */           ☃.put(aev.F, wj.ge);
/*     */           ☃.put(aev.M, wj.gf);
/*     */           ☃.put(aev.ab, wj.gv);
/*     */           ☃.put(aev.aM, wj.gg);
/*     */           ☃.put(aev.ac, wj.gh);
/*     */           ☃.put(aev.ah, wj.gi);
/*     */           ☃.put(aev.aj, wj.gj);
/*     */           ☃.put(aev.ak, wj.gk);
/*     */           ☃.put(aev.am, wj.gl);
/*     */           ☃.put(aev.ar, wj.gm);
/*     */           ☃.put(aev.at, wj.gn);
/*     */           ☃.put(aev.aA, wj.go);
/*     */           ☃.put(aev.aD, wj.gp);
/*     */           ☃.put(aev.aE, wj.gq);
/*     */           ☃.put(aev.aF, wj.gr);
/*     */           ☃.put(aev.aG, wj.gs);
/*     */           ☃.put(aev.aI, wj.gt);
/*     */           ☃.put(aev.aJ, wj.gu);
/*     */           ☃.put(aev.aL, wj.gw);
/*     */         });
/*     */   }
/*     */   
/*     */   public float bH;
/*     */   public float bI;
/*     */   public float bJ;
/* 111 */   public float bK = 1.0F;
/*     */   
/*     */   private boolean bQ;
/*     */   private el bR;
/*     */   
/*     */   public ajz(axy ☃) {
/* 117 */     super(aev.Y, ☃);
/* 118 */     a(0.5F, 0.9F);
/*     */     
/* 120 */     this.g = new afy(this);
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public afj a(adj ☃, @Nullable afj afj1, @Nullable gy gy1) {
/* 126 */     p(this.T.nextInt(5));
/*     */     
/* 128 */     return super.a(☃, afj1, gy1);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void n() {
/* 133 */     this.bE = new ahz(this);
/*     */     
/* 135 */     this.by.a(0, new aho(this, 1.25D));
/* 136 */     this.by.a(0, new agm(this));
/* 137 */     this.by.a(1, new ahb(this, (Class)aog.class, 8.0F));
/* 138 */     this.by.a(2, this.bE);
/* 139 */     this.by.a(2, new agq(this, 1.0D, 5.0F, 1.0F));
/* 140 */     this.by.a(2, new aig(this, 1.0D));
/* 141 */     this.by.a(3, new agy(this));
/* 142 */     this.by.a(3, new agp(this, 1.0D, 3.0F, 7.0F));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void bZ() {
/* 147 */     super.bZ();
/* 148 */     cz().b(ank.e);
/*     */     
/* 150 */     a(ank.a).a(6.0D);
/* 151 */     a(ank.e).a(0.4000000059604645D);
/* 152 */     a(ank.d).a(0.20000000298023224D);
/*     */   }
/*     */ 
/*     */   
/*     */   protected aiw b(axy ☃) {
/* 157 */     aiu aiu = new aiu(this, ☃);
/* 158 */     aiu.a(false);
/* 159 */     aiu.d(true);
/* 160 */     aiu.b(true);
/* 161 */     return aiu;
/*     */   }
/*     */ 
/*     */   
/*     */   public float bF() {
/* 166 */     return this.I * 0.6F;
/*     */   }
/*     */ 
/*     */   
/*     */   public void k() {
/* 171 */     b(this.m, this);
/*     */     
/* 173 */     if (this.bR == null || this.bR.f(this.q, this.r, this.s) > 12.0D || this.m.a_(this.bR).c() != bct.cW) {
/* 174 */       this.bQ = false;
/* 175 */       this.bR = null;
/*     */     } 
/*     */     
/* 178 */     super.k();
/*     */     
/* 180 */     dL();
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
/*     */   private void dL() {
/* 194 */     this.bJ = this.bG;
/* 195 */     this.bI = this.bH;
/*     */     
/* 197 */     this.bH = (float)(this.bH + (this.A ? -1 : 4) * 0.3D);
/* 198 */     this.bH = xq.a(this.bH, 0.0F, 1.0F);
/*     */     
/* 200 */     if (!this.A && this.bK < 1.0F) {
/* 201 */       this.bK = 1.0F;
/*     */     }
/* 203 */     this.bK = (float)(this.bK * 0.9D);
/*     */     
/* 205 */     if (!this.A && this.u < 0.0D) {
/* 206 */       this.u *= 0.6D;
/*     */     }
/*     */     
/* 209 */     this.bG += this.bK * 2.0F;
/*     */   }
/*     */   
/*     */   private static boolean b(axy ☃, aer aer1) {
/* 213 */     if (aer1.ai() || ☃.s.nextInt(50) != 0) {
/* 214 */       return false;
/*     */     }
/*     */     
/* 217 */     List<afb> list = ☃.a(afb.class, aer1.bD().g(20.0D), bM);
/* 218 */     if (!list.isEmpty()) {
/* 219 */       afb afb = list.get(☃.s.nextInt(list.size()));
/* 220 */       if (!afb.ai()) {
/* 221 */         wi wi = a(afb.P());
/* 222 */         ☃.a((aog)null, aer1.q, aer1.r, aer1.s, wi, aer1.bV(), 0.7F, b(☃.s));
/*     */         
/* 224 */         return true;
/*     */       } 
/*     */     } 
/*     */     
/* 228 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(aog ☃, adk adk1) {
/* 233 */     ate ate = ☃.b(adk1);
/*     */     
/* 235 */     if (!dy() && bO.contains(ate.b())) {
/* 236 */       if (!☃.bV.d) {
/* 237 */         ate.g(1);
/*     */       }
/*     */       
/* 240 */       if (!ai()) {
/* 241 */         this.m.a((aog)null, this.q, this.r, this.s, wj.fR, bV(), 1.0F, 1.0F + (this.T.nextFloat() - this.T.nextFloat()) * 0.2F);
/*     */       }
/*     */       
/* 244 */       if (!this.m.B) {
/* 245 */         if (this.T.nextInt(10) == 0) {
/* 246 */           c(☃);
/* 247 */           s(true);
/* 248 */           this.m.a(this, (byte)7);
/*     */         } else {
/* 250 */           s(false);
/* 251 */           this.m.a(this, (byte)6);
/*     */         } 
/*     */       }
/*     */       
/* 255 */       return true;
/* 256 */     }  if (ate.b() == bN) {
/* 257 */       if (!☃.bV.d) {
/* 258 */         ate.g(1);
/*     */       }
/*     */       
/* 261 */       c(new aek(aem.s, 900));
/* 262 */       if (☃.u() || !bl()) {
/* 263 */         a(aea.a(☃), Float.MAX_VALUE);
/*     */       }
/*     */       
/* 266 */       return true;
/* 267 */     }  if (!this.m.B && !F_() && dy() && f(☃)) {
/* 268 */       this.bE.a(!dA());
/*     */     }
/*     */     
/* 271 */     return super.a(☃, adk1);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean f(ate ☃) {
/* 276 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(axz ☃, boolean bool) {
/* 281 */     int i = xq.c(this.q);
/* 282 */     int j = xq.c((bD()).b);
/* 283 */     int k = xq.c(this.s);
/* 284 */     el el1 = new el(i, j, k);
/* 285 */     bcs bcs = ☃.a_(el1.b()).c();
/* 286 */     return (bcs instanceof bfr || bcs == bct.aR || bcs instanceof bfw || (bcs == bct.a && super.a(☃, bool)));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void c(float ☃, float f1) {}
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(double ☃, boolean bool, blc blc1, el el1) {}
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(ajq ☃) {
/* 300 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public aeo a(aeo ☃) {
/* 306 */     return null;
/*     */   }
/*     */   
/*     */   public static void a(axy ☃, aer aer1) {
/* 310 */     if (!aer1.ai() && !b(☃, aer1) && 
/* 311 */       ☃.s.nextInt(200) == 0) {
/* 312 */       ☃.a((aog)null, aer1.q, aer1.r, aer1.s, a(☃.s), aer1.bV(), 1.0F, b(☃.s));
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean B(aer ☃) {
/* 319 */     return ☃.a(aea.a(this), 3.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public wi D() {
/* 325 */     return a(this.T);
/*     */   }
/*     */   
/*     */   private static wi a(Random ☃) {
/* 329 */     if (☃.nextInt(1000) == 0) {
/*     */       
/* 331 */       List<aev<?>> list = Lists.newArrayList(bP.keySet());
/* 332 */       return a(list.get(☃.nextInt(list.size())));
/*     */     } 
/* 334 */     return wj.fP;
/*     */   }
/*     */   
/*     */   public static wi a(aev<?> ☃) {
/* 338 */     return bP.getOrDefault(☃, wj.fP);
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi d(aea ☃) {
/* 343 */     return wj.fT;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi cs() {
/* 348 */     return wj.fQ;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(el ☃, blc blc1) {
/* 353 */     a(wj.gx, 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   protected float e(float ☃) {
/* 358 */     a(wj.fS, 0.15F, 1.0F);
/* 359 */     return ☃ + this.bH / 2.0F;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean ah() {
/* 364 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   protected float cE() {
/* 369 */     return b(this.T);
/*     */   }
/*     */   
/*     */   private static float b(Random ☃) {
/* 373 */     return (☃.nextFloat() - ☃.nextFloat()) * 0.2F + 1.0F;
/*     */   }
/*     */ 
/*     */   
/*     */   public wk bV() {
/* 378 */     return wk.g;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean aC() {
/* 383 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void C(aer ☃) {
/* 388 */     if (☃ instanceof aog) {
/*     */       return;
/*     */     }
/* 391 */     super.C(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(aea ☃, float f) {
/* 396 */     if (b(☃)) {
/* 397 */       return false;
/*     */     }
/*     */     
/* 400 */     if (this.bE != null) {
/* 401 */       this.bE.a(false);
/*     */     }
/*     */     
/* 404 */     return super.a(☃, f);
/*     */   }
/*     */   
/*     */   public int dI() {
/* 408 */     return xq.a(((Integer)this.ab.<Integer>a(bL)).intValue(), 0, 4);
/*     */   }
/*     */   
/*     */   public void p(int ☃) {
/* 412 */     this.ab.b(bL, Integer.valueOf(☃));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void x_() {
/* 417 */     super.x_();
/* 418 */     this.ab.a(bL, Integer.valueOf(0));
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(gy ☃) {
/* 423 */     super.b(☃);
/*     */     
/* 425 */     ☃.b("Variant", dI());
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(gy ☃) {
/* 430 */     super.a(☃);
/*     */     
/* 432 */     p(☃.h("Variant"));
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   protected pc G() {
/* 438 */     return ccl.aE;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean F_() {
/* 443 */     return !this.A;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\ajz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */