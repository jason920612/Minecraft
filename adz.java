/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.List;
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
/*     */ public class adz
/*     */ {
/*  22 */   private final List<adx> a = Lists.newArrayList();
/*     */   private final afa b;
/*     */   private int c;
/*     */   private int d;
/*     */   private int e;
/*     */   private boolean f;
/*     */   private boolean g;
/*     */   private String h;
/*     */   
/*     */   public adz(afa ☃) {
/*  32 */     this.b = ☃;
/*     */   }
/*     */   
/*     */   public void a() {
/*  36 */     k();
/*     */     
/*  38 */     if (this.b.z_()) {
/*  39 */       bcs ☃ = this.b.m.a_(new el(this.b.q, (this.b.bD()).b, this.b.s)).c();
/*     */       
/*  41 */       if (☃ == bct.cz) {
/*  42 */         this.h = "ladder";
/*  43 */       } else if (☃ == bct.dM) {
/*  44 */         this.h = "vines";
/*     */       } 
/*  46 */     } else if (this.b.an()) {
/*  47 */       this.h = "water";
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(aea ☃, float f1, float f2) {
/*  52 */     g();
/*  53 */     a();
/*     */     
/*  55 */     adx adx = new adx(☃, this.b.U, f1, f2, this.h, this.b.M);
/*     */     
/*  57 */     this.a.add(adx);
/*  58 */     this.c = this.b.U;
/*  59 */     this.g = true;
/*     */     
/*  61 */     if (adx.f() && !this.f && this.b.aF()) {
/*  62 */       this.f = true;
/*  63 */       this.d = this.b.U;
/*  64 */       this.e = this.d;
/*  65 */       this.b.v_();
/*     */     } 
/*     */   }
/*     */   public ij b() {
/*     */     ij ij1;
/*  70 */     if (this.a.isEmpty()) {
/*  71 */       return new ir("death.attack.generic", new Object[] { this.b.O() });
/*     */     }
/*     */     
/*  74 */     adx ☃ = j();
/*  75 */     adx adx1 = this.a.get(this.a.size() - 1);
/*     */     
/*  77 */     ij ij2 = adx1.h();
/*  78 */     aer aer = adx1.a().k();
/*     */     
/*  80 */     if (☃ != null && adx1.a() == aea.k) {
/*  81 */       ij ij = ☃.h();
/*     */       
/*  83 */       if (☃.a() == aea.k || ☃.a() == aea.m) {
/*  84 */         ij1 = new ir("death.fell.accident." + a(☃), new Object[] { this.b.O() });
/*  85 */       } else if (ij != null && (ij2 == null || !ij.equals(ij2))) {
/*  86 */         aer aer1 = ☃.a().k();
/*  87 */         ate ate = (aer1 instanceof afa) ? ((afa)aer1).cB() : ate.a;
/*     */         
/*  89 */         if (!ate.a() && ate.s()) {
/*  90 */           ij1 = new ir("death.fell.assist.item", new Object[] { this.b.O(), ij, ate.A() });
/*     */         } else {
/*  92 */           ij1 = new ir("death.fell.assist", new Object[] { this.b.O(), ij });
/*     */         } 
/*  94 */       } else if (ij2 != null) {
/*  95 */         ate ate = (aer instanceof afa) ? ((afa)aer).cB() : ate.a;
/*  96 */         if (!ate.a() && ate.s()) {
/*  97 */           ij1 = new ir("death.fell.finish.item", new Object[] { this.b.O(), ij2, ate.A() });
/*     */         } else {
/*  99 */           ij1 = new ir("death.fell.finish", new Object[] { this.b.O(), ij2 });
/*     */         } 
/*     */       } else {
/* 102 */         ij1 = new ir("death.fell.killer", new Object[] { this.b.O() });
/*     */       } 
/*     */     } else {
/* 105 */       ij1 = adx1.a().c(this.b);
/*     */     } 
/*     */     
/* 108 */     return ij1;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public afa c() {
/* 113 */     afa ☃ = null;
/* 114 */     aog aog = null;
/* 115 */     float f1 = 0.0F;
/* 116 */     float f2 = 0.0F;
/*     */     
/* 118 */     for (adx adx : this.a) {
/* 119 */       if (adx.a().k() instanceof aog && (aog == null || adx.c() > f2)) {
/* 120 */         f2 = adx.c();
/* 121 */         aog = (aog)adx.a().k();
/*     */       } 
/*     */       
/* 124 */       if (adx.a().k() instanceof afa && (☃ == null || adx.c() > f1)) {
/* 125 */         f1 = adx.c();
/* 126 */         ☃ = (afa)adx.a().k();
/*     */       } 
/*     */     } 
/*     */     
/* 130 */     if (aog != null && f2 >= f1 / 3.0F) {
/* 131 */       return aog;
/*     */     }
/* 133 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   private adx j() {
/* 139 */     adx ☃ = null;
/* 140 */     adx adx1 = null;
/* 141 */     float f1 = 0.0F;
/* 142 */     float f2 = 0.0F;
/*     */     
/* 144 */     for (int i = 0; i < this.a.size(); i++) {
/* 145 */       adx adx2 = this.a.get(i);
/* 146 */       adx adx3 = (i > 0) ? this.a.get(i - 1) : null;
/*     */       
/* 148 */       if ((adx2.a() == aea.k || adx2.a() == aea.m) && adx2.j() > 0.0F && (☃ == null || adx2.j() > f2)) {
/* 149 */         if (i > 0) {
/* 150 */           ☃ = adx3;
/*     */         } else {
/* 152 */           ☃ = adx2;
/*     */         } 
/* 154 */         f2 = adx2.j();
/*     */       } 
/*     */       
/* 157 */       if (adx2.g() != null && (adx1 == null || adx2.c() > f1)) {
/* 158 */         adx1 = adx2;
/* 159 */         f1 = adx2.c();
/*     */       } 
/*     */     } 
/*     */     
/* 163 */     if (f2 > 5.0F && ☃ != null)
/* 164 */       return ☃; 
/* 165 */     if (f1 > 5.0F && adx1 != null) {
/* 166 */       return adx1;
/*     */     }
/* 168 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   private String a(adx ☃) {
/* 173 */     return (☃.g() == null) ? "generic" : ☃.g();
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
/*     */   public int f() {
/* 187 */     if (this.f) {
/* 188 */       return this.b.U - this.d;
/*     */     }
/* 190 */     return this.e - this.d;
/*     */   }
/*     */ 
/*     */   
/*     */   private void k() {
/* 195 */     this.h = null;
/*     */   }
/*     */   
/*     */   public void g() {
/* 199 */     int ☃ = this.f ? 300 : 100;
/*     */     
/* 201 */     if (this.g && (!this.b.aF() || this.b.U - this.c > ☃)) {
/* 202 */       boolean bool = this.f;
/* 203 */       this.g = false;
/* 204 */       this.f = false;
/* 205 */       this.e = this.b.U;
/*     */       
/* 207 */       if (bool) {
/* 208 */         this.b.f();
/*     */       }
/* 210 */       this.a.clear();
/*     */     } 
/*     */   }
/*     */   
/*     */   public afa h() {
/* 215 */     return this.b;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\adz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */