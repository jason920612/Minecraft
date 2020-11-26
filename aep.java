/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.mojang.brigadier.StringReader;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.UUID;
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
/*     */ public class aep
/*     */   extends aer
/*     */ {
/*  36 */   private static final Logger a = LogManager.getLogger();
/*     */ 
/*     */ 
/*     */   
/*  40 */   private static final or<Float> b = ou.a((Class)aep.class, ot.c);
/*  41 */   private static final or<Integer> c = ou.a((Class)aep.class, ot.b);
/*  42 */   private static final or<Boolean> d = ou.a((Class)aep.class, ot.i);
/*  43 */   private static final or<fk> e = ou.a((Class)aep.class, ot.j);
/*     */   
/*  45 */   private aut f = auw.a;
/*  46 */   private final List<aek> g = Lists.newArrayList();
/*  47 */   private final Map<aer, Integer> h = Maps.newHashMap();
/*  48 */   private int aw = 600;
/*  49 */   private int ax = 20;
/*  50 */   private int ay = 20;
/*     */   private boolean az;
/*     */   private int aA;
/*     */   private float aB;
/*     */   private float aC;
/*     */   private afa aD;
/*     */   private UUID aE;
/*     */   
/*     */   public aep(axy ☃) {
/*  59 */     super(aev.a, ☃);
/*  60 */     this.R = true;
/*  61 */     this.aa = true;
/*  62 */     a(3.0F);
/*     */   }
/*     */   
/*     */   public aep(axy ☃, double d1, double d2, double d3) {
/*  66 */     this(☃);
/*  67 */     b(d1, d2, d3);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void x_() {
/*  72 */     T().a(c, Integer.valueOf(0));
/*  73 */     T().a(b, Float.valueOf(0.5F));
/*  74 */     T().a(d, Boolean.valueOf(false));
/*  75 */     T().a(e, fm.s);
/*     */   }
/*     */   
/*     */   public void a(float ☃) {
/*  79 */     double d1 = this.q;
/*  80 */     double d2 = this.r;
/*  81 */     double d3 = this.s;
/*  82 */     a(☃ * 2.0F, 0.5F);
/*  83 */     b(d1, d2, d3);
/*  84 */     if (!this.m.B) {
/*  85 */       T().b(b, Float.valueOf(☃));
/*     */     }
/*     */   }
/*     */   
/*     */   public float f() {
/*  90 */     return ((Float)T().<Float>a(b)).floatValue();
/*     */   }
/*     */   
/*     */   public void a(aut ☃) {
/*  94 */     this.f = ☃;
/*  95 */     if (!this.az) {
/*  96 */       x();
/*     */     }
/*     */   }
/*     */   
/*     */   private void x() {
/* 101 */     if (this.f == auw.a && this.g.isEmpty()) {
/* 102 */       T().b(c, Integer.valueOf(0));
/*     */     } else {
/* 104 */       T().b(c, Integer.valueOf(auv.a(auv.a(this.f, this.g))));
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(aek ☃) {
/* 109 */     this.g.add(☃);
/* 110 */     if (!this.az) {
/* 111 */       x();
/*     */     }
/*     */   }
/*     */   
/*     */   public int i() {
/* 116 */     return ((Integer)T().<Integer>a(c)).intValue();
/*     */   }
/*     */   
/*     */   public void a(int ☃) {
/* 120 */     this.az = true;
/* 121 */     T().b(c, Integer.valueOf(☃));
/*     */   }
/*     */   
/*     */   public fk k() {
/* 125 */     return T().<fk>a(e);
/*     */   }
/*     */   
/*     */   public void a(fk ☃) {
/* 129 */     T().b(e, ☃);
/*     */   }
/*     */   
/*     */   protected void a(boolean ☃) {
/* 133 */     T().b(d, Boolean.valueOf(☃));
/*     */   }
/*     */   
/*     */   public boolean l() {
/* 137 */     return ((Boolean)T().<Boolean>a(d)).booleanValue();
/*     */   }
/*     */   
/*     */   public int m() {
/* 141 */     return this.aw;
/*     */   }
/*     */   
/*     */   public void b(int ☃) {
/* 145 */     this.aw = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public void R_() {
/* 150 */     super.R_();
/* 151 */     boolean ☃ = l();
/*     */     
/* 153 */     float f = f();
/* 154 */     if (this.m.B) {
/* 155 */       fk fk = k();
/*     */       
/* 157 */       if (☃) {
/* 158 */         if (this.T.nextBoolean()) {
/* 159 */           for (int i = 0; i < 2; i++) {
/* 160 */             float f1 = this.T.nextFloat() * 6.2831855F;
/* 161 */             float f2 = xq.c(this.T.nextFloat()) * 0.2F;
/* 162 */             float f3 = xq.b(f1) * f2;
/* 163 */             float f4 = xq.a(f1) * f2;
/*     */             
/* 165 */             if (fk.b() == fm.s) {
/* 166 */               int j = this.T.nextBoolean() ? 16777215 : i();
/* 167 */               int k = j >> 16 & 0xFF;
/* 168 */               int m = j >> 8 & 0xFF;
/* 169 */               int n = j & 0xFF;
/* 170 */               this.m.b(fk, this.q + f3, this.r, this.s + f4, (k / 255.0F), (m / 255.0F), (n / 255.0F));
/*     */             } else {
/* 172 */               this.m.b(fk, this.q + f3, this.r, this.s + f4, 0.0D, 0.0D, 0.0D);
/*     */             } 
/*     */           } 
/*     */         }
/*     */       } else {
/* 177 */         float f1 = 3.1415927F * f * f;
/*     */         
/* 179 */         for (int i = 0; i < f1; i++) {
/* 180 */           float f2 = this.T.nextFloat() * 6.2831855F;
/* 181 */           float f3 = xq.c(this.T.nextFloat()) * f;
/* 182 */           float f4 = xq.b(f2) * f3;
/* 183 */           float f5 = xq.a(f2) * f3;
/*     */           
/* 185 */           if (fk.b() == fm.s) {
/* 186 */             int j = i();
/* 187 */             int k = j >> 16 & 0xFF;
/* 188 */             int m = j >> 8 & 0xFF;
/* 189 */             int n = j & 0xFF;
/* 190 */             this.m.b(fk, this.q + f4, this.r, this.s + f5, (k / 255.0F), (m / 255.0F), (n / 255.0F));
/*     */           } else {
/* 192 */             this.m.b(fk, this.q + f4, this.r, this.s + f5, (0.5D - this.T.nextDouble()) * 0.15D, 0.009999999776482582D, (0.5D - this.T.nextDouble()) * 0.15D);
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } else {
/* 197 */       if (this.U >= this.ax + this.aw) {
/* 198 */         V();
/*     */         
/*     */         return;
/*     */       } 
/* 202 */       boolean bool = (this.U < this.ax);
/* 203 */       if (☃ != bool) {
/* 204 */         a(bool);
/*     */       }
/* 206 */       if (bool) {
/*     */         return;
/*     */       }
/*     */       
/* 210 */       if (this.aC != 0.0F) {
/* 211 */         f += this.aC;
/* 212 */         if (f < 0.5F) {
/* 213 */           V();
/*     */           return;
/*     */         } 
/* 216 */         a(f);
/*     */       } 
/*     */       
/* 219 */       if (this.U % 5 == 0) {
/* 220 */         for (Iterator<Map.Entry<aer, Integer>> iterator = this.h.entrySet().iterator(); iterator.hasNext(); ) {
/* 221 */           Map.Entry<aer, Integer> entry = iterator.next();
/* 222 */           if (this.U >= ((Integer)entry.getValue()).intValue()) {
/* 223 */             iterator.remove();
/*     */           }
/*     */         } 
/* 226 */         List<aek> list = Lists.newArrayList();
/* 227 */         for (aek aek : this.f.a()) {
/* 228 */           list.add(new aek(aek.a(), aek.b() / 4, aek.c(), aek.d(), aek.e()));
/*     */         }
/* 230 */         list.addAll(this.g);
/*     */         
/* 232 */         if (list.isEmpty()) {
/* 233 */           this.h.clear();
/*     */         } else {
/* 235 */           List<afa> list1 = this.m.a(afa.class, bD());
/* 236 */           if (!list1.isEmpty()) {
/* 237 */             for (afa afa1 : list1) {
/* 238 */               if (this.h.containsKey(afa1) || !afa1.de()) {
/*     */                 continue;
/*     */               }
/* 241 */               double d1 = afa1.q - this.q;
/* 242 */               double d2 = afa1.s - this.s;
/* 243 */               double d3 = d1 * d1 + d2 * d2;
/* 244 */               if (d3 <= (f * f)) {
/* 245 */                 this.h.put(afa1, Integer.valueOf(this.U + this.ay));
/* 246 */                 for (aek aek : list) {
/* 247 */                   if (aek.a().a()) {
/* 248 */                     aek.a().a(this, t(), afa1, aek.c(), 0.5D); continue;
/*     */                   } 
/* 250 */                   afa1.c(new aek(aek));
/*     */                 } 
/*     */                 
/* 253 */                 if (this.aB != 0.0F) {
/* 254 */                   f += this.aB;
/* 255 */                   if (f < 0.5F) {
/* 256 */                     V();
/*     */                     return;
/*     */                   } 
/* 259 */                   a(f);
/*     */                 } 
/* 261 */                 if (this.aA != 0) {
/* 262 */                   this.aw += this.aA;
/* 263 */                   if (this.aw <= 0) {
/* 264 */                     V();
/*     */                     return;
/*     */                   } 
/*     */                 } 
/*     */               } 
/*     */             } 
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(float ☃) {
/* 281 */     this.aB = ☃;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void c(float ☃) {
/* 289 */     this.aC = ☃;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void d(int ☃) {
/* 314 */     this.ax = ☃;
/*     */   }
/*     */   
/*     */   public void a(@Nullable afa ☃) {
/* 318 */     this.aD = ☃;
/* 319 */     this.aE = (☃ == null) ? null : ☃.bt();
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public afa t() {
/* 324 */     if (this.aD == null && this.aE != null && this.m instanceof td) {
/* 325 */       aer ☃ = ((td)this.m).a(this.aE);
/* 326 */       if (☃ instanceof afa) {
/* 327 */         this.aD = (afa)☃;
/*     */       }
/*     */     } 
/*     */     
/* 331 */     return this.aD;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(gy ☃) {
/* 336 */     this.U = ☃.h("Age");
/* 337 */     this.aw = ☃.h("Duration");
/* 338 */     this.ax = ☃.h("WaitTime");
/* 339 */     this.ay = ☃.h("ReapplicationDelay");
/* 340 */     this.aA = ☃.h("DurationOnUse");
/* 341 */     this.aB = ☃.j("RadiusOnUse");
/* 342 */     this.aC = ☃.j("RadiusPerTick");
/* 343 */     a(☃.j("Radius"));
/* 344 */     this.aE = ☃.a("OwnerUUID");
/*     */     
/* 346 */     if (☃.c("Particle", 8)) {
/*     */       try {
/* 348 */         a(cm.b(new StringReader(☃.l("Particle"))));
/* 349 */       } catch (CommandSyntaxException commandSyntaxException) {
/* 350 */         a.warn("Couldn't load custom particle {}", ☃.l("Particle"), commandSyntaxException);
/*     */       } 
/*     */     }
/*     */     
/* 354 */     if (☃.c("Color", 99)) {
/* 355 */       a(☃.h("Color"));
/*     */     }
/*     */     
/* 358 */     if (☃.c("Potion", 8)) {
/* 359 */       a(auv.c(☃));
/*     */     }
/* 361 */     if (☃.c("Effects", 9)) {
/* 362 */       he he = ☃.d("Effects", 10);
/* 363 */       this.g.clear();
/* 364 */       for (int i = 0; i < he.size(); i++) {
/* 365 */         aek aek = aek.b(he.e(i));
/* 366 */         if (aek != null) {
/* 367 */           a(aek);
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b(gy ☃) {
/* 375 */     ☃.b("Age", this.U);
/* 376 */     ☃.b("Duration", this.aw);
/* 377 */     ☃.b("WaitTime", this.ax);
/* 378 */     ☃.b("ReapplicationDelay", this.ay);
/* 379 */     ☃.b("DurationOnUse", this.aA);
/* 380 */     ☃.a("RadiusOnUse", this.aB);
/* 381 */     ☃.a("RadiusPerTick", this.aC);
/* 382 */     ☃.a("Radius", f());
/*     */     
/* 384 */     ☃.a("Particle", k().a());
/*     */     
/* 386 */     if (this.aE != null) {
/* 387 */       ☃.a("OwnerUUID", this.aE);
/*     */     }
/*     */     
/* 390 */     if (this.az) {
/* 391 */       ☃.b("Color", i());
/*     */     }
/*     */     
/* 394 */     if (this.f != auw.a && this.f != null) {
/* 395 */       ☃.a("Potion", fc.j.b(this.f).toString());
/*     */     }
/* 397 */     if (!this.g.isEmpty()) {
/* 398 */       he he = new he();
/* 399 */       for (aek aek : this.g) {
/* 400 */         he.a(aek.a(new gy()));
/*     */       }
/* 402 */       ☃.a("Effects", he);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(or<?> ☃) {
/* 408 */     if (b.equals(☃)) {
/* 409 */       a(f());
/*     */     }
/* 411 */     super.a(☃);
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
/*     */   public bzc A_() {
/* 424 */     return bzc.d;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\aep.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */