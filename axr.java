/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.collect.Sets;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Random;
/*     */ import java.util.Set;
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
/*     */ public class axr
/*     */ {
/*     */   private final boolean a;
/*     */   private final boolean b;
/*  33 */   private final Random c = new Random();
/*     */   
/*     */   private final axy d;
/*     */   private final double e;
/*     */   private final double f;
/*     */   private final double g;
/*     */   private final aer h;
/*     */   private final float i;
/*     */   private aea j;
/*  42 */   private final List<el> k = Lists.newArrayList();
/*  43 */   private final Map<aog, cee> l = Maps.newHashMap();
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
/*     */   public axr(axy ☃, @Nullable aer aer1, double d1, double d2, double d3, float f, boolean bool1, boolean bool2) {
/*  59 */     this.d = ☃;
/*  60 */     this.h = aer1;
/*  61 */     this.i = f;
/*  62 */     this.e = d1;
/*  63 */     this.f = d2;
/*  64 */     this.g = d3;
/*  65 */     this.a = bool1;
/*  66 */     this.b = bool2;
/*  67 */     this.j = aea.a(this);
/*     */   }
/*     */   
/*     */   public void a() {
/*  71 */     Set<el> ☃ = Sets.newHashSet();
/*     */     
/*  73 */     int i = 16;
/*  74 */     for (int j = 0; j < 16; j++) {
/*  75 */       for (int i5 = 0; i5 < 16; i5++) {
/*  76 */         for (int i6 = 0; i6 < 16; i6++) {
/*  77 */           if (j == 0 || j == 15 || i5 == 0 || i5 == 15 || i6 == 0 || i6 == 15) {
/*     */ 
/*     */ 
/*     */             
/*  81 */             double d1 = (j / 15.0F * 2.0F - 1.0F);
/*  82 */             double d2 = (i5 / 15.0F * 2.0F - 1.0F);
/*  83 */             double d3 = (i6 / 15.0F * 2.0F - 1.0F);
/*  84 */             double d4 = Math.sqrt(d1 * d1 + d2 * d2 + d3 * d3);
/*     */             
/*  86 */             d1 /= d4;
/*  87 */             d2 /= d4;
/*  88 */             d3 /= d4;
/*     */             
/*  90 */             float f1 = this.i * (0.7F + this.d.s.nextFloat() * 0.6F);
/*  91 */             double d5 = this.e;
/*  92 */             double d6 = this.f;
/*  93 */             double d7 = this.g;
/*     */             
/*  95 */             float f2 = 0.3F;
/*  96 */             while (f1 > 0.0F) {
/*  97 */               el el = new el(d5, d6, d7);
/*  98 */               blc blc = this.d.a_(el);
/*  99 */               byw byw = this.d.b(el);
/*     */               
/* 101 */               if (!blc.f() || !byw.e()) {
/* 102 */                 float f3 = Math.max(blc.c().k(), byw.l());
/* 103 */                 if (this.h != null) {
/* 104 */                   f3 = this.h.a(this, this.d, el, blc, byw, f3);
/*     */                 }
/* 106 */                 f1 -= (f3 + 0.3F) * 0.3F;
/*     */               } 
/*     */               
/* 109 */               if (f1 > 0.0F && (this.h == null || this.h.a(this, this.d, el, blc, f1))) {
/* 110 */                 ☃.add(el);
/*     */               }
/*     */               
/* 113 */               d5 += d1 * 0.30000001192092896D;
/* 114 */               d6 += d2 * 0.30000001192092896D;
/* 115 */               d7 += d3 * 0.30000001192092896D;
/* 116 */               f1 -= 0.22500001F;
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/* 122 */     this.k.addAll(☃);
/*     */     
/* 124 */     float f = this.i * 2.0F;
/*     */     
/* 126 */     int k = xq.c(this.e - f - 1.0D);
/* 127 */     int m = xq.c(this.e + f + 1.0D);
/* 128 */     int n = xq.c(this.f - f - 1.0D);
/* 129 */     int i1 = xq.c(this.f + f + 1.0D);
/* 130 */     int i2 = xq.c(this.g - f - 1.0D);
/* 131 */     int i3 = xq.c(this.g + f + 1.0D);
/* 132 */     List<aer> list = this.d.a(this.h, new cea(k, n, i2, m, i1, i3));
/* 133 */     cee cee = new cee(this.e, this.f, this.g);
/*     */     
/* 135 */     for (int i4 = 0; i4 < list.size(); i4++) {
/* 136 */       aer aer1 = list.get(i4);
/* 137 */       if (!aer1.bL()) {
/*     */ 
/*     */         
/* 140 */         double d = aer1.e(this.e, this.f, this.g) / f;
/*     */         
/* 142 */         if (d <= 1.0D) {
/* 143 */           double d1 = aer1.q - this.e;
/* 144 */           double d2 = aer1.r + aer1.bF() - this.f;
/* 145 */           double d3 = aer1.s - this.g;
/*     */           
/* 147 */           double d4 = xq.a(d1 * d1 + d2 * d2 + d3 * d3);
/* 148 */           if (d4 != 0.0D) {
/*     */ 
/*     */ 
/*     */             
/* 152 */             d1 /= d4;
/* 153 */             d2 /= d4;
/* 154 */             d3 /= d4;
/*     */             
/* 156 */             double d5 = this.d.a(cee, aer1.bD());
/* 157 */             double d6 = (1.0D - d) * d5;
/* 158 */             aer1.a(b(), (int)((d6 * d6 + d6) / 2.0D * 7.0D * f + 1.0D));
/*     */             
/* 160 */             double d7 = d6;
/* 161 */             if (aer1 instanceof afa) {
/* 162 */               d7 = awq.a((afa)aer1, d6);
/*     */             }
/* 164 */             aer1.t += d1 * d7;
/* 165 */             aer1.u += d2 * d7;
/* 166 */             aer1.v += d3 * d7;
/*     */             
/* 168 */             if (aer1 instanceof aog) {
/* 169 */               aog aog = (aog)aer1;
/* 170 */               if (!aog.t() && (!aog.u() || !aog.bV.b))
/* 171 */                 this.l.put(aog, new cee(d1 * d6, d2 * d6, d3 * d6)); 
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   public void a(boolean ☃) {
/* 179 */     this.d.a((aog)null, this.e, this.f, this.g, wj.cR, wk.e, 4.0F, (1.0F + (this.d.s.nextFloat() - this.d.s.nextFloat()) * 0.2F) * 0.7F);
/* 180 */     if (this.i < 2.0F || !this.b) {
/* 181 */       this.d.a(fm.u, this.e, this.f, this.g, 1.0D, 0.0D, 0.0D);
/*     */     } else {
/* 183 */       this.d.a(fm.t, this.e, this.f, this.g, 1.0D, 0.0D, 0.0D);
/*     */     } 
/*     */     
/* 186 */     if (this.b) {
/* 187 */       for (el el : this.k) {
/* 188 */         blc blc = this.d.a_(el);
/* 189 */         bcs bcs = blc.c();
/*     */         
/* 191 */         if (☃) {
/* 192 */           double d1 = (el.o() + this.d.s.nextFloat());
/* 193 */           double d2 = (el.p() + this.d.s.nextFloat());
/* 194 */           double d3 = (el.q() + this.d.s.nextFloat());
/*     */           
/* 196 */           double d4 = d1 - this.e;
/* 197 */           double d5 = d2 - this.f;
/* 198 */           double d6 = d3 - this.g;
/*     */           
/* 200 */           double d7 = xq.a(d4 * d4 + d5 * d5 + d6 * d6);
/*     */           
/* 202 */           d4 /= d7;
/* 203 */           d5 /= d7;
/* 204 */           d6 /= d7;
/*     */           
/* 206 */           double d8 = 0.5D / (d7 / this.i + 0.1D);
/* 207 */           d8 *= (this.d.s.nextFloat() * this.d.s.nextFloat() + 0.3F);
/* 208 */           d4 *= d8;
/* 209 */           d5 *= d8;
/* 210 */           d6 *= d8;
/*     */           
/* 212 */           this.d.a(fm.J, (d1 + this.e) / 2.0D, (d2 + this.f) / 2.0D, (d3 + this.g) / 2.0D, d4, d5, d6);
/* 213 */           this.d.a(fm.M, d1, d2, d3, d4, d5, d6);
/*     */         } 
/*     */         
/* 216 */         if (!blc.f()) {
/* 217 */           if (bcs.a(this)) {
/* 218 */             blc.a(this.d, el, 1.0F / this.i, 0);
/*     */           }
/* 220 */           this.d.a(el, bct.a.p(), 3);
/* 221 */           bcs.a(this.d, el, this);
/*     */         } 
/*     */       } 
/*     */     }
/* 225 */     if (this.a) {
/* 226 */       for (el el : this.k) {
/* 227 */         if (this.d.a_(el).f() && this.d.a_(el.b()).f(this.d, el.b()) && this.c.nextInt(3) == 0) {
/* 228 */           this.d.a(el, bct.ch.p());
/*     */         }
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   public aea b() {
/* 235 */     return this.j;
/*     */   }
/*     */   
/*     */   public void a(aea ☃) {
/* 239 */     this.j = ☃;
/*     */   }
/*     */   
/*     */   public Map<aog, cee> c() {
/* 243 */     return this.l;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public afa d() {
/* 248 */     if (this.h == null) {
/* 249 */       return null;
/*     */     }
/* 251 */     if (this.h instanceof amn) {
/* 252 */       return ((amn)this.h).f();
/*     */     }
/* 254 */     if (this.h instanceof afa) {
/* 255 */       return (afa)this.h;
/*     */     }
/* 257 */     return null;
/*     */   }
/*     */   
/*     */   public void e() {
/* 261 */     this.k.clear();
/*     */   }
/*     */   
/*     */   public List<el> f() {
/* 265 */     return this.k;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\axr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */