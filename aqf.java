/*     */ import java.util.List;
/*     */ import java.util.Random;
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
/*     */ public class aqf
/*     */   extends apv
/*     */ {
/*  27 */   public ade a = new adt(this, new iq("Enchant"), 2)
/*     */     {
/*     */       public int f() {
/*  30 */         return 64;
/*     */       }
/*     */ 
/*     */       
/*     */       public void g() {
/*  35 */         super.g();
/*  36 */         this.a.a(this);
/*     */       }
/*     */     };
/*     */ 
/*     */   
/*     */   private final axy j;
/*     */   
/*     */   private final el k;
/*  44 */   private final Random l = new Random();
/*     */   
/*     */   public int f;
/*  47 */   public int[] g = new int[3];
/*  48 */   public int[] h = new int[] { -1, -1, -1 };
/*  49 */   public int[] i = new int[] { -1, -1, -1 };
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public aqf(aof ☃, axy axy1, el el1) {
/*  57 */     this.j = axy1;
/*  58 */     this.k = el1;
/*  59 */     this.f = ☃.e.du();
/*  60 */     a(new aqx(this, this.a, 0, 15, 47)
/*     */         {
/*     */           public boolean a(ate ☃) {
/*  63 */             return true;
/*     */           }
/*     */ 
/*     */           
/*     */           public int a() {
/*  68 */             return 1;
/*     */           }
/*     */         });
/*     */     
/*  72 */     a(new aqx(this, this.a, 1, 35, 47)
/*     */         {
/*     */           public boolean a(ate ☃) {
/*  75 */             return (☃.b() == atf.bs);
/*     */           }
/*     */         });
/*     */     int i;
/*  79 */     for (i = 0; i < 3; i++) {
/*  80 */       for (int j = 0; j < 9; j++) {
/*  81 */         a(new aqx(☃, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
/*     */       }
/*     */     } 
/*  84 */     for (i = 0; i < 9; i++) {
/*  85 */       a(new aqx(☃, i, 8 + i * 18, 142));
/*     */     }
/*     */   }
/*     */   
/*     */   protected void c(aqb ☃) {
/*  90 */     ☃.a(this, 0, this.g[0]);
/*  91 */     ☃.a(this, 1, this.g[1]);
/*  92 */     ☃.a(this, 2, this.g[2]);
/*  93 */     ☃.a(this, 3, this.f & 0xFFFFFFF0);
/*  94 */     ☃.a(this, 4, this.h[0]);
/*  95 */     ☃.a(this, 5, this.h[1]);
/*  96 */     ☃.a(this, 6, this.h[2]);
/*  97 */     ☃.a(this, 7, this.i[0]);
/*  98 */     ☃.a(this, 8, this.i[1]);
/*  99 */     ☃.a(this, 9, this.i[2]);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(aqb ☃) {
/* 104 */     super.a(☃);
/*     */     
/* 106 */     c(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b() {
/* 111 */     super.b();
/*     */     
/* 113 */     for (int ☃ = 0; ☃ < this.e.size(); ☃++) {
/* 114 */       aqb aqb = this.e.get(☃);
/* 115 */       c(aqb);
/*     */     } 
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
/*     */   public void a(ade ☃) {
/* 136 */     if (☃ == this.a) {
/* 137 */       ate ate = ☃.a(0);
/*     */       
/* 139 */       if (ate.a() || !ate.v()) {
/* 140 */         for (int i = 0; i < 3; i++) {
/* 141 */           this.g[i] = 0;
/* 142 */           this.h[i] = -1;
/* 143 */           this.i[i] = -1;
/*     */         }
/*     */       
/* 146 */       } else if (!this.j.B) {
/*     */         
/* 148 */         int i = 0;
/*     */         int j;
/* 150 */         for (j = -1; j <= 1; j++) {
/* 151 */           for (int k = -1; k <= 1; k++) {
/* 152 */             if (j != 0 || k != 0)
/*     */             {
/*     */ 
/*     */               
/* 156 */               if (this.j.c(this.k.a(k, 0, j)) && this.j.c(this.k.a(k, 1, j))) {
/* 157 */                 if (this.j.a_(this.k.a(k * 2, 0, j * 2)).c() == bct.cc) {
/* 158 */                   i++;
/*     */                 }
/* 160 */                 if (this.j.a_(this.k.a(k * 2, 1, j * 2)).c() == bct.cc) {
/* 161 */                   i++;
/*     */                 }
/*     */                 
/* 164 */                 if (k != 0 && j != 0) {
/* 165 */                   if (this.j.a_(this.k.a(k * 2, 0, j)).c() == bct.cc) {
/* 166 */                     i++;
/*     */                   }
/* 168 */                   if (this.j.a_(this.k.a(k * 2, 1, j)).c() == bct.cc) {
/* 169 */                     i++;
/*     */                   }
/* 171 */                   if (this.j.a_(this.k.a(k, 0, j * 2)).c() == bct.cc) {
/* 172 */                     i++;
/*     */                   }
/* 174 */                   if (this.j.a_(this.k.a(k, 1, j * 2)).c() == bct.cc)
/* 175 */                     i++; 
/*     */                 } 
/*     */               } 
/*     */             }
/*     */           } 
/*     */         } 
/* 181 */         this.l.setSeed(this.f);
/* 182 */         for (j = 0; j < 3; j++) {
/* 183 */           this.g[j] = awg.a(this.l, j, i, ate);
/* 184 */           this.h[j] = -1;
/* 185 */           this.i[j] = -1;
/*     */           
/* 187 */           if (this.g[j] < j + 1) {
/* 188 */             this.g[j] = 0;
/*     */           }
/*     */         } 
/* 191 */         for (j = 0; j < 3; j++) {
/* 192 */           if (this.g[j] > 0) {
/* 193 */             List<awh> list = a(ate, j, this.g[j]);
/* 194 */             if (list != null && !list.isEmpty()) {
/* 195 */               awh awh = list.get(this.l.nextInt(list.size()));
/* 196 */               this.h[j] = fc.q.a((T)awh.b);
/* 197 */               this.i[j] = awh.c;
/*     */             } 
/*     */           } 
/*     */         } 
/*     */         
/* 202 */         b();
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(aog ☃, int i) {
/* 210 */     ate ate1 = this.a.a(0);
/* 211 */     ate ate2 = this.a.a(1);
/*     */     
/* 213 */     int j = i + 1;
/*     */     
/* 215 */     if ((ate2.a() || ate2.C() < j) && !☃.bV.d) {
/* 216 */       return false;
/*     */     }
/* 218 */     if (this.g[i] > 0 && !ate1.a() && ((☃.bW >= j && ☃.bW >= this.g[i]) || ☃.bV.d)) {
/* 219 */       if (!this.j.B) {
/* 220 */         List<awh> list = a(ate1, i, this.g[i]);
/*     */         
/* 222 */         if (!list.isEmpty()) {
/* 223 */           ☃.a(ate1, j);
/*     */           
/* 225 */           boolean bool = (ate1.b() == atf.aS);
/* 226 */           if (bool) {
/* 227 */             ate1 = new ate(atf.dT);
/* 228 */             this.a.a(0, ate1);
/*     */           } 
/*     */           
/* 231 */           for (int k = 0; k < list.size(); k++) {
/* 232 */             awh awh = list.get(k);
/*     */             
/* 234 */             if (bool) {
/* 235 */               asi.a(ate1, awh);
/*     */             } else {
/* 237 */               ate1.a(awh.b, awh.c);
/*     */             } 
/*     */           } 
/*     */ 
/*     */           
/* 242 */           if (!☃.bV.d) {
/* 243 */             ate2.g(j);
/* 244 */             if (ate2.a()) {
/* 245 */               this.a.a(1, ate.a);
/*     */             }
/*     */           } 
/* 248 */           ☃.a(ws.ai);
/* 249 */           if (☃ instanceof tf) {
/* 250 */             p.i.a((tf)☃, ate1, j);
/*     */           }
/* 252 */           this.a.g();
/* 253 */           this.f = ☃.du();
/* 254 */           a(this.a);
/*     */           
/* 256 */           this.j.a((aog)null, this.k, wj.bM, wk.e, 1.0F, this.j.s.nextFloat() * 0.1F + 0.9F);
/*     */         } 
/*     */       } 
/* 259 */       return true;
/*     */     } 
/* 261 */     return false;
/*     */   }
/*     */   
/*     */   private List<awh> a(ate ☃, int i, int j) {
/* 265 */     this.l.setSeed((this.f + i));
/*     */     
/* 267 */     List<awh> list = awg.b(this.l, ☃, j, false);
/*     */     
/* 269 */     if (☃.b() == atf.aS && list.size() > 1)
/*     */     {
/* 271 */       list.remove(this.l.nextInt(list.size()));
/*     */     }
/* 273 */     return list;
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
/*     */   public void b(aog ☃) {
/* 286 */     super.b(☃);
/* 287 */     if (this.j.B) {
/*     */       return;
/*     */     }
/*     */     
/* 291 */     a(☃, ☃.m, this.a);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(aog ☃) {
/* 296 */     if (this.j.a_(this.k).c() != bct.eb) {
/* 297 */       return false;
/*     */     }
/* 299 */     if (☃.d(this.k.o() + 0.5D, this.k.p() + 0.5D, this.k.q() + 0.5D) > 64.0D) {
/* 300 */       return false;
/*     */     }
/* 302 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public ate b(aog ☃, int i) {
/* 307 */     ate ate = ate.a;
/* 308 */     aqx aqx = this.c.get(i);
/* 309 */     if (aqx != null && aqx.e()) {
/* 310 */       ate ate1 = aqx.d();
/* 311 */       ate = ate1.i();
/*     */       
/* 313 */       if (i == 0) {
/* 314 */         if (!a(ate1, 2, 38, true)) {
/* 315 */           return ate.a;
/*     */         }
/* 317 */       } else if (i == 1) {
/* 318 */         if (!a(ate1, 2, 38, true)) {
/* 319 */           return ate.a;
/*     */         }
/* 321 */       } else if (ate1.b() == atf.bs) {
/* 322 */         if (!a(ate1, 1, 2, true)) {
/* 323 */           return ate.a;
/*     */         }
/* 325 */       } else if (!((aqx)this.c.get(0)).e() && ((aqx)this.c.get(0)).a(ate1)) {
/* 326 */         if (ate1.m() && ate1.C() == 1) {
/* 327 */           ((aqx)this.c.get(0)).d(ate1.i());
/* 328 */           ate1.e(0);
/* 329 */         } else if (!ate1.a()) {
/* 330 */           ((aqx)this.c.get(0)).d(new ate(ate1.b()));
/* 331 */           ate1.g(1);
/*     */         } 
/*     */       } else {
/* 334 */         return ate.a;
/*     */       } 
/* 336 */       if (ate1.a()) {
/* 337 */         aqx.d(ate.a);
/*     */       } else {
/* 339 */         aqx.f();
/*     */       } 
/* 341 */       if (ate1.C() == ate.C()) {
/* 342 */         return ate.a;
/*     */       }
/* 344 */       aqx.a(☃, ate1);
/*     */     } 
/*     */     
/* 347 */     return ate;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\aqf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */