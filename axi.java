/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.List;
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
/*     */ public abstract class axi
/*     */ {
/*  28 */   private static final Logger a = LogManager.getLogger();
/*     */ 
/*     */ 
/*     */   
/*  32 */   private int b = 20;
/*  33 */   private final List<ayn> c = Lists.newArrayList();
/*  34 */   private ayn d = new ayn();
/*     */   private double e;
/*     */   private double f;
/*  37 */   private int g = 200;
/*  38 */   private int h = 800;
/*  39 */   private int i = 4;
/*     */   private aer j;
/*  41 */   private int k = 6;
/*  42 */   private int l = 16;
/*  43 */   private int m = 4;
/*     */   
/*     */   @Nullable
/*     */   private pc g() {
/*  47 */     String ☃ = this.d.b().l("id");
/*     */     try {
/*  49 */       return xw.b(☃) ? null : new pc(☃);
/*  50 */     } catch (i i) {
/*  51 */       el el = b();
/*  52 */       a.warn("Invalid entity id '{}' at spawner {}:[{},{},{}]", ☃, (a()).t.q(), Integer.valueOf(el.o()), Integer.valueOf(el.p()), Integer.valueOf(el.q()));
/*  53 */       return null;
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(aev<?> ☃) {
/*  58 */     this.d.b().a("id", fc.r.b(☃).toString());
/*     */   }
/*     */   
/*     */   private boolean h() {
/*  62 */     el ☃ = b();
/*  63 */     return a().b(☃.o() + 0.5D, ☃.p() + 0.5D, ☃.q() + 0.5D, this.l);
/*     */   }
/*     */   
/*     */   public void c() {
/*  67 */     if (!h()) {
/*  68 */       this.f = this.e;
/*     */       
/*     */       return;
/*     */     } 
/*  72 */     el ☃ = b();
/*  73 */     if ((a()).B) {
/*  74 */       double d1 = (☃.o() + (a()).s.nextFloat());
/*  75 */       double d2 = (☃.p() + (a()).s.nextFloat());
/*  76 */       double d3 = (☃.q() + (a()).s.nextFloat());
/*  77 */       a().a(fm.M, d1, d2, d3, 0.0D, 0.0D, 0.0D);
/*  78 */       a().a(fm.y, d1, d2, d3, 0.0D, 0.0D, 0.0D);
/*     */       
/*  80 */       if (this.b > 0) {
/*  81 */         this.b--;
/*     */       }
/*  83 */       this.f = this.e;
/*  84 */       this.e = (this.e + (1000.0F / (this.b + 200.0F))) % 360.0D;
/*     */     } else {
/*  86 */       if (this.b == -1) {
/*  87 */         i();
/*     */       }
/*     */       
/*  90 */       if (this.b > 0) {
/*  91 */         this.b--;
/*     */         
/*     */         return;
/*     */       } 
/*  95 */       boolean bool = false;
/*     */       
/*  97 */       for (int i = 0; i < this.i; i++) {
/*  98 */         gy gy = this.d.b();
/*  99 */         he he = gy.d("Pos", 6);
/*     */         
/* 101 */         axy axy = a();
/* 102 */         int j = he.size();
/* 103 */         double d1 = (j >= 1) ? he.k(0) : (☃.o() + (axy.s.nextDouble() - axy.s.nextDouble()) * this.m + 0.5D);
/* 104 */         double d2 = (j >= 2) ? he.k(1) : (☃.p() + axy.s.nextInt(3) - 1);
/* 105 */         double d3 = (j >= 3) ? he.k(2) : (☃.q() + (axy.s.nextDouble() - axy.s.nextDouble()) * this.m + 0.5D);
/*     */         
/* 107 */         aer aer1 = bnv.a(gy, axy, d1, d2, d3, false);
/* 108 */         if (aer1 == null) {
/* 109 */           i();
/*     */           
/*     */           return;
/*     */         } 
/* 113 */         int k = axy.a(aer1.getClass(), (new cea(☃.o(), ☃.p(), ☃.q(), (☃.o() + 1), (☃.p() + 1), (☃.q() + 1))).g(this.m)).size();
/* 114 */         if (k >= this.k) {
/* 115 */           i();
/*     */           
/*     */           return;
/*     */         } 
/* 119 */         afb afb = (aer1 instanceof afb) ? (afb)aer1 : null;
/*     */         
/* 121 */         aer1.b(aer1.q, aer1.r, aer1.s, axy.s.nextFloat() * 360.0F, 0.0F);
/*     */         
/* 123 */         if (afb == null || (afb.a(axy, true) && afb.M())) {
/* 124 */           if (this.d.b().d() == 1 && this.d.b().c("id", 8) && aer1 instanceof afb) {
/* 125 */             ((afb)aer1).a(axy.h(new el(aer1)), (afj)null, (gy)null);
/*     */           }
/*     */           
/* 128 */           bnv.a(aer1, axy);
/* 129 */           axy.b(2004, ☃, 0);
/*     */           
/* 131 */           if (afb != null) {
/* 132 */             afb.B();
/*     */           }
/*     */           
/* 135 */           bool = true;
/*     */         } 
/*     */       } 
/*     */       
/* 139 */       if (bool) {
/* 140 */         i();
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   private void i() {
/* 146 */     if (this.h <= this.g) {
/* 147 */       this.b = this.g;
/*     */     } else {
/* 149 */       this.b = this.g + (a()).s.nextInt(this.h - this.g);
/*     */     } 
/*     */     
/* 152 */     if (!this.c.isEmpty()) {
/* 153 */       a(xy.<ayn>a((a()).s, this.c));
/*     */     }
/*     */     
/* 156 */     a(1);
/*     */   }
/*     */   
/*     */   public void a(gy ☃) {
/* 160 */     this.b = ☃.g("Delay");
/*     */     
/* 162 */     this.c.clear();
/* 163 */     if (☃.c("SpawnPotentials", 9)) {
/* 164 */       he he = ☃.d("SpawnPotentials", 10);
/*     */       
/* 166 */       for (int i = 0; i < he.size(); i++) {
/* 167 */         this.c.add(new ayn(he.e(i)));
/*     */       }
/*     */     } 
/*     */     
/* 171 */     if (☃.c("SpawnData", 10)) {
/* 172 */       a(new ayn(1, ☃.p("SpawnData")));
/* 173 */     } else if (!this.c.isEmpty()) {
/* 174 */       a(xy.<ayn>a((a()).s, this.c));
/*     */     } 
/*     */     
/* 177 */     if (☃.c("MinSpawnDelay", 99)) {
/* 178 */       this.g = ☃.g("MinSpawnDelay");
/* 179 */       this.h = ☃.g("MaxSpawnDelay");
/* 180 */       this.i = ☃.g("SpawnCount");
/*     */     } 
/*     */     
/* 183 */     if (☃.c("MaxNearbyEntities", 99)) {
/* 184 */       this.k = ☃.g("MaxNearbyEntities");
/* 185 */       this.l = ☃.g("RequiredPlayerRange");
/*     */     } 
/*     */     
/* 188 */     if (☃.c("SpawnRange", 99)) {
/* 189 */       this.m = ☃.g("SpawnRange");
/*     */     }
/*     */     
/* 192 */     if (a() != null) {
/* 193 */       this.j = null;
/*     */     }
/*     */   }
/*     */   
/*     */   public gy b(gy ☃) {
/* 198 */     pc pc = g();
/* 199 */     if (pc == null) {
/* 200 */       return ☃;
/*     */     }
/* 202 */     ☃.a("Delay", (short)this.b);
/* 203 */     ☃.a("MinSpawnDelay", (short)this.g);
/* 204 */     ☃.a("MaxSpawnDelay", (short)this.h);
/* 205 */     ☃.a("SpawnCount", (short)this.i);
/* 206 */     ☃.a("MaxNearbyEntities", (short)this.k);
/* 207 */     ☃.a("RequiredPlayerRange", (short)this.l);
/* 208 */     ☃.a("SpawnRange", (short)this.m);
/* 209 */     ☃.a("SpawnData", this.d.b().f());
/*     */     
/* 211 */     he he = new he();
/*     */     
/* 213 */     if (this.c.isEmpty()) {
/* 214 */       he.a(this.d.a());
/*     */     } else {
/* 216 */       for (ayn ayn1 : this.c) {
/* 217 */         he.a(ayn1.a());
/*     */       }
/*     */     } 
/*     */     
/* 221 */     ☃.a("SpawnPotentials", he);
/*     */     
/* 223 */     return ☃;
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
/*     */   public boolean b(int ☃) {
/* 238 */     if (☃ == 1 && (a()).B) {
/* 239 */       this.b = this.g;
/* 240 */       return true;
/*     */     } 
/* 242 */     return false;
/*     */   }
/*     */   
/*     */   public void a(ayn ☃) {
/* 246 */     this.d = ☃;
/*     */   }
/*     */   
/*     */   public abstract void a(int paramInt);
/*     */   
/*     */   public abstract axy a();
/*     */   
/*     */   public abstract el b();
/*     */ }


/* Location:              F:\dw\server.jar!\axi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */