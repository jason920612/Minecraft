/*     */ import com.google.common.collect.Sets;
/*     */ import java.util.EnumSet;
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
/*     */ public class cbb
/*     */   extends cbj
/*     */ {
/*     */   public void a(axk ☃, afb afb1) {
/*  19 */     super.a(☃, afb1);
/*  20 */     this.j = afb1.a(cba.g);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a() {
/*  25 */     this.b.a(cba.g, this.j);
/*  26 */     super.a();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public cbc b() {
/*     */     int ☃;
/*  33 */     if (e() && this.b.an()) {
/*  34 */       ☃ = (int)(this.b.bD()).b;
/*  35 */       el.a a = new el.a(xq.c(this.b.q), ☃, xq.c(this.b.s));
/*  36 */       bcs bcs = this.a.a_(a).c();
/*  37 */       while (bcs == bct.A) {
/*  38 */         ☃++;
/*  39 */         a.c(xq.c(this.b.q), ☃, xq.c(this.b.s));
/*  40 */         bcs = this.a.a_(a).c();
/*     */       } 
/*     */     } else {
/*  43 */       ☃ = xq.c((this.b.bD()).b + 0.5D);
/*     */     } 
/*     */     
/*  46 */     el el = new el(this.b);
/*  47 */     cba cba = a(this.b, el.o(), ☃, el.q());
/*     */     
/*  49 */     if (this.b.a(cba) < 0.0F) {
/*  50 */       Set<el> set = Sets.newHashSet();
/*  51 */       set.add(new el((this.b.bD()).a, ☃, (this.b.bD()).c));
/*  52 */       set.add(new el((this.b.bD()).a, ☃, (this.b.bD()).f));
/*  53 */       set.add(new el((this.b.bD()).d, ☃, (this.b.bD()).c));
/*  54 */       set.add(new el((this.b.bD()).d, ☃, (this.b.bD()).f));
/*     */       
/*  56 */       for (el el1 : set) {
/*  57 */         cba cba1 = a(this.b, el1);
/*  58 */         if (this.b.a(cba1) >= 0.0F) {
/*  59 */           return super.a(el1.o(), el1.p(), el1.q());
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/*  64 */     return super.a(el.o(), ☃, el.q());
/*     */   }
/*     */ 
/*     */   
/*     */   public cbc a(double ☃, double d1, double d2) {
/*  69 */     return super.a(xq.c(☃), xq.c(d1), xq.c(d2));
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(cbc[] ☃, cbc cbc1, cbc cbc2, float f) {
/*  74 */     int i = 0;
/*     */     
/*  76 */     cbc cbc3 = a(cbc1.a, cbc1.b, cbc1.c + 1);
/*  77 */     cbc cbc4 = a(cbc1.a - 1, cbc1.b, cbc1.c);
/*  78 */     cbc cbc5 = a(cbc1.a + 1, cbc1.b, cbc1.c);
/*  79 */     cbc cbc6 = a(cbc1.a, cbc1.b, cbc1.c - 1);
/*  80 */     cbc cbc7 = a(cbc1.a, cbc1.b + 1, cbc1.c);
/*  81 */     cbc cbc8 = a(cbc1.a, cbc1.b - 1, cbc1.c);
/*     */     
/*  83 */     if (cbc3 != null && !cbc3.i && cbc3.a(cbc2) < f) {
/*  84 */       ☃[i++] = cbc3;
/*     */     }
/*  86 */     if (cbc4 != null && !cbc4.i && cbc4.a(cbc2) < f) {
/*  87 */       ☃[i++] = cbc4;
/*     */     }
/*  89 */     if (cbc5 != null && !cbc5.i && cbc5.a(cbc2) < f) {
/*  90 */       ☃[i++] = cbc5;
/*     */     }
/*  92 */     if (cbc6 != null && !cbc6.i && cbc6.a(cbc2) < f) {
/*  93 */       ☃[i++] = cbc6;
/*     */     }
/*  95 */     if (cbc7 != null && !cbc7.i && cbc7.a(cbc2) < f) {
/*  96 */       ☃[i++] = cbc7;
/*     */     }
/*  98 */     if (cbc8 != null && !cbc8.i && cbc8.a(cbc2) < f) {
/*  99 */       ☃[i++] = cbc8;
/*     */     }
/*     */     
/* 102 */     boolean bool1 = (cbc6 == null || cbc6.l != 0.0F);
/* 103 */     boolean bool2 = (cbc3 == null || cbc3.l != 0.0F);
/* 104 */     boolean bool3 = (cbc5 == null || cbc5.l != 0.0F);
/* 105 */     boolean bool4 = (cbc4 == null || cbc4.l != 0.0F);
/* 106 */     boolean bool5 = (cbc7 == null || cbc7.l != 0.0F);
/* 107 */     boolean bool6 = (cbc8 == null || cbc8.l != 0.0F);
/*     */     
/* 109 */     if (bool1 && bool4) {
/* 110 */       cbc cbc9 = a(cbc1.a - 1, cbc1.b, cbc1.c - 1);
/* 111 */       if (cbc9 != null && !cbc9.i && cbc9.a(cbc2) < f) {
/* 112 */         ☃[i++] = cbc9;
/*     */       }
/*     */     } 
/* 115 */     if (bool1 && bool3) {
/* 116 */       cbc cbc9 = a(cbc1.a + 1, cbc1.b, cbc1.c - 1);
/* 117 */       if (cbc9 != null && !cbc9.i && cbc9.a(cbc2) < f) {
/* 118 */         ☃[i++] = cbc9;
/*     */       }
/*     */     } 
/* 121 */     if (bool2 && bool4) {
/* 122 */       cbc cbc9 = a(cbc1.a - 1, cbc1.b, cbc1.c + 1);
/* 123 */       if (cbc9 != null && !cbc9.i && cbc9.a(cbc2) < f) {
/* 124 */         ☃[i++] = cbc9;
/*     */       }
/*     */     } 
/* 127 */     if (bool2 && bool3) {
/* 128 */       cbc cbc9 = a(cbc1.a + 1, cbc1.b, cbc1.c + 1);
/* 129 */       if (cbc9 != null && !cbc9.i && cbc9.a(cbc2) < f) {
/* 130 */         ☃[i++] = cbc9;
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/* 135 */     if (bool1 && bool5) {
/* 136 */       cbc cbc9 = a(cbc1.a, cbc1.b + 1, cbc1.c - 1);
/* 137 */       if (cbc9 != null && !cbc9.i && cbc9.a(cbc2) < f) {
/* 138 */         ☃[i++] = cbc9;
/*     */       }
/*     */     } 
/* 141 */     if (bool2 && bool5) {
/* 142 */       cbc cbc9 = a(cbc1.a, cbc1.b + 1, cbc1.c + 1);
/* 143 */       if (cbc9 != null && !cbc9.i && cbc9.a(cbc2) < f) {
/* 144 */         ☃[i++] = cbc9;
/*     */       }
/*     */     } 
/* 147 */     if (bool3 && bool5) {
/* 148 */       cbc cbc9 = a(cbc1.a + 1, cbc1.b + 1, cbc1.c);
/* 149 */       if (cbc9 != null && !cbc9.i && cbc9.a(cbc2) < f) {
/* 150 */         ☃[i++] = cbc9;
/*     */       }
/*     */     } 
/* 153 */     if (bool4 && bool5) {
/* 154 */       cbc cbc9 = a(cbc1.a - 1, cbc1.b + 1, cbc1.c);
/* 155 */       if (cbc9 != null && !cbc9.i && cbc9.a(cbc2) < f) {
/* 156 */         ☃[i++] = cbc9;
/*     */       }
/*     */     } 
/*     */     
/* 160 */     if (bool1 && bool6) {
/* 161 */       cbc cbc9 = a(cbc1.a, cbc1.b - 1, cbc1.c - 1);
/* 162 */       if (cbc9 != null && !cbc9.i && cbc9.a(cbc2) < f) {
/* 163 */         ☃[i++] = cbc9;
/*     */       }
/*     */     } 
/* 166 */     if (bool2 && bool6) {
/* 167 */       cbc cbc9 = a(cbc1.a, cbc1.b - 1, cbc1.c + 1);
/* 168 */       if (cbc9 != null && !cbc9.i && cbc9.a(cbc2) < f) {
/* 169 */         ☃[i++] = cbc9;
/*     */       }
/*     */     } 
/* 172 */     if (bool3 && bool6) {
/* 173 */       cbc cbc9 = a(cbc1.a + 1, cbc1.b - 1, cbc1.c);
/* 174 */       if (cbc9 != null && !cbc9.i && cbc9.a(cbc2) < f) {
/* 175 */         ☃[i++] = cbc9;
/*     */       }
/*     */     } 
/* 178 */     if (bool4 && bool6) {
/* 179 */       cbc cbc9 = a(cbc1.a - 1, cbc1.b - 1, cbc1.c);
/* 180 */       if (cbc9 != null && !cbc9.i && cbc9.a(cbc2) < f) {
/* 181 */         ☃[i++] = cbc9;
/*     */       }
/*     */     } 
/*     */     
/* 185 */     return i;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   protected cbc a(int ☃, int i, int j) {
/* 191 */     cbc cbc = null;
/*     */     
/* 193 */     cba cba = a(this.b, ☃, i, j);
/*     */     
/* 195 */     float f = this.b.a(cba);
/*     */     
/* 197 */     if (f >= 0.0F) {
/* 198 */       cbc = super.a(☃, i, j);
/* 199 */       cbc.m = cba;
/* 200 */       cbc.l = Math.max(cbc.l, f);
/*     */       
/* 202 */       if (cba == cba.c) {
/* 203 */         cbc.l++;
/*     */       }
/*     */     } 
/*     */     
/* 207 */     if (cba == cba.b || cba == cba.c) {
/* 208 */       return cbc;
/*     */     }
/*     */     
/* 211 */     return cbc;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public cba a(axk ☃, int i, int j, int k, afb afb1, int m, int n, int i1, boolean bool1, boolean bool2) {
/* 217 */     EnumSet<cba> enumSet = EnumSet.noneOf(cba.class);
/* 218 */     cba cba1 = cba.a;
/*     */     
/* 220 */     el el = new el(afb1);
/*     */     
/* 222 */     cba1 = a(☃, i, j, k, m, n, i1, bool1, bool2, enumSet, cba1, el);
/*     */     
/* 224 */     if (enumSet.contains(cba.e)) {
/* 225 */       return cba.e;
/*     */     }
/*     */     
/* 228 */     cba cba2 = cba.a;
/* 229 */     for (cba cba : enumSet) {
/*     */       
/* 231 */       if (afb1.a(cba) < 0.0F) {
/* 232 */         return cba;
/*     */       }
/*     */ 
/*     */       
/* 236 */       if (afb1.a(cba) >= afb1.a(cba2)) {
/* 237 */         cba2 = cba;
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/* 242 */     if (cba1 == cba.b && afb1.a(cba2) == 0.0F) {
/* 243 */       return cba.b;
/*     */     }
/*     */     
/* 246 */     return cba2;
/*     */   }
/*     */ 
/*     */   
/*     */   public cba a(axk ☃, int i, int j, int k) {
/* 251 */     cba cba = b(☃, i, j, k);
/*     */     
/* 253 */     if (cba == cba.b && j >= 1) {
/* 254 */       bcs bcs = ☃.a_(new el(i, j - 1, k)).c();
/* 255 */       cba cba1 = b(☃, i, j - 1, k);
/*     */       
/* 257 */       if (cba1 == cba.k || bcs == bct.ik || cba1 == cba.f) {
/* 258 */         cba = cba.k;
/* 259 */       } else if (cba1 == cba.m) {
/* 260 */         cba = cba.m;
/*     */       } else {
/* 262 */         cba = (cba1 == cba.c || cba1 == cba.b || cba1 == cba.g) ? cba.b : cba.c;
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 267 */     cba = a(☃, i, j, k, cba);
/*     */     
/* 269 */     return cba;
/*     */   }
/*     */   
/*     */   private cba a(afb ☃, el el1) {
/* 273 */     return a(☃, el1.o(), el1.p(), el1.q());
/*     */   }
/*     */   
/*     */   private cba a(afb ☃, int i, int j, int k) {
/* 277 */     return a(this.a, i, j, k, ☃, this.d, this.e, this.f, d(), c());
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\cbb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */