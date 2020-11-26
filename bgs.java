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
/*     */ public class bgs
/*     */ {
/*     */   private final axy a;
/*     */   private final el b;
/*     */   private final bco c;
/*     */   private blc d;
/*     */   private final boolean e;
/*  19 */   private final List<el> f = Lists.newArrayList();
/*     */   
/*     */   public bgs(axy ☃, el el1, blc blc1) {
/*  22 */     this.a = ☃;
/*  23 */     this.b = el1;
/*  24 */     this.d = blc1;
/*  25 */     this.c = (bco)blc1.c();
/*  26 */     bmn bmn = (bmn)blc1.c(this.c.e());
/*  27 */     this.e = this.c.d();
/*  28 */     a(bmn);
/*     */   }
/*     */   
/*     */   public List<el> a() {
/*  32 */     return this.f;
/*     */   }
/*     */   
/*     */   private void a(bmn ☃) {
/*  36 */     this.f.clear();
/*  37 */     switch (null.a[☃.ordinal()]) {
/*     */       case 1:
/*  39 */         this.f.add(this.b.c());
/*  40 */         this.f.add(this.b.d());
/*     */         break;
/*     */       case 2:
/*  43 */         this.f.add(this.b.e());
/*  44 */         this.f.add(this.b.f());
/*     */         break;
/*     */       case 3:
/*  47 */         this.f.add(this.b.e());
/*  48 */         this.f.add(this.b.f().a());
/*     */         break;
/*     */       case 4:
/*  51 */         this.f.add(this.b.e().a());
/*  52 */         this.f.add(this.b.f());
/*     */         break;
/*     */       case 5:
/*  55 */         this.f.add(this.b.c().a());
/*  56 */         this.f.add(this.b.d());
/*     */         break;
/*     */       case 6:
/*  59 */         this.f.add(this.b.c());
/*  60 */         this.f.add(this.b.d().a());
/*     */         break;
/*     */       case 7:
/*  63 */         this.f.add(this.b.f());
/*  64 */         this.f.add(this.b.d());
/*     */         break;
/*     */       case 8:
/*  67 */         this.f.add(this.b.e());
/*  68 */         this.f.add(this.b.d());
/*     */         break;
/*     */       case 9:
/*  71 */         this.f.add(this.b.e());
/*  72 */         this.f.add(this.b.c());
/*     */         break;
/*     */       case 10:
/*  75 */         this.f.add(this.b.f());
/*  76 */         this.f.add(this.b.c());
/*     */         break;
/*     */     } 
/*     */   }
/*     */   
/*     */   private void d() {
/*  82 */     for (int ☃ = 0; ☃ < this.f.size(); ☃++) {
/*  83 */       bgs bgs1 = b(this.f.get(☃));
/*  84 */       if (bgs1 == null || !bgs1.a(this)) {
/*  85 */         this.f.remove(☃--);
/*     */       } else {
/*  87 */         this.f.set(☃, bgs1.b);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private boolean a(el ☃) {
/*  93 */     return (bco.a(this.a, ☃) || bco.a(this.a, ☃.a()) || bco.a(this.a, ☃.b()));
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private bgs b(el ☃) {
/*  98 */     el el1 = ☃;
/*  99 */     blc blc1 = this.a.a_(el1);
/* 100 */     if (bco.k(blc1)) {
/* 101 */       return new bgs(this.a, el1, blc1);
/*     */     }
/*     */     
/* 104 */     el1 = ☃.a();
/* 105 */     blc1 = this.a.a_(el1);
/* 106 */     if (bco.k(blc1)) {
/* 107 */       return new bgs(this.a, el1, blc1);
/*     */     }
/*     */     
/* 110 */     el1 = ☃.b();
/* 111 */     blc1 = this.a.a_(el1);
/* 112 */     if (bco.k(blc1)) {
/* 113 */       return new bgs(this.a, el1, blc1);
/*     */     }
/*     */     
/* 116 */     return null;
/*     */   }
/*     */   
/*     */   private boolean a(bgs ☃) {
/* 120 */     return c(☃.b);
/*     */   }
/*     */   
/*     */   private boolean c(el ☃) {
/* 124 */     for (int i = 0; i < this.f.size(); i++) {
/* 125 */       el el1 = this.f.get(i);
/* 126 */       if (el1.o() == ☃.o() && el1.q() == ☃.q()) {
/* 127 */         return true;
/*     */       }
/*     */     } 
/* 130 */     return false;
/*     */   }
/*     */   
/*     */   protected int b() {
/* 134 */     int ☃ = 0;
/*     */     
/* 136 */     for (eq eq : eq.c.a) {
/* 137 */       if (a(this.b.a(eq))) {
/* 138 */         ☃++;
/*     */       }
/*     */     } 
/*     */     
/* 142 */     return ☃;
/*     */   }
/*     */   
/*     */   private boolean b(bgs ☃) {
/* 146 */     return (a(☃) || this.f.size() != 2);
/*     */   }
/*     */   
/*     */   private void c(bgs ☃) {
/* 150 */     this.f.add(☃.b);
/*     */     
/* 152 */     el el1 = this.b.c();
/* 153 */     el el2 = this.b.d();
/* 154 */     el el3 = this.b.e();
/* 155 */     el el4 = this.b.f();
/*     */     
/* 157 */     boolean bool1 = c(el1);
/* 158 */     boolean bool2 = c(el2);
/* 159 */     boolean bool3 = c(el3);
/* 160 */     boolean bool4 = c(el4);
/*     */     
/* 162 */     bmn bmn = null;
/*     */     
/* 164 */     if (bool1 || bool2) {
/* 165 */       bmn = bmn.a;
/*     */     }
/* 167 */     if (bool3 || bool4) {
/* 168 */       bmn = bmn.b;
/*     */     }
/* 170 */     if (!this.e) {
/* 171 */       if (bool2 && bool4 && !bool1 && !bool3) {
/* 172 */         bmn = bmn.g;
/*     */       }
/* 174 */       if (bool2 && bool3 && !bool1 && !bool4) {
/* 175 */         bmn = bmn.h;
/*     */       }
/* 177 */       if (bool1 && bool3 && !bool2 && !bool4) {
/* 178 */         bmn = bmn.i;
/*     */       }
/* 180 */       if (bool1 && bool4 && !bool2 && !bool3) {
/* 181 */         bmn = bmn.j;
/*     */       }
/*     */     } 
/* 184 */     if (bmn == bmn.a) {
/* 185 */       if (bco.a(this.a, el1.a())) {
/* 186 */         bmn = bmn.e;
/*     */       }
/* 188 */       if (bco.a(this.a, el2.a())) {
/* 189 */         bmn = bmn.f;
/*     */       }
/*     */     } 
/* 192 */     if (bmn == bmn.b) {
/* 193 */       if (bco.a(this.a, el4.a())) {
/* 194 */         bmn = bmn.c;
/*     */       }
/* 196 */       if (bco.a(this.a, el3.a())) {
/* 197 */         bmn = bmn.d;
/*     */       }
/*     */     } 
/*     */     
/* 201 */     if (bmn == null) {
/* 202 */       bmn = bmn.a;
/*     */     }
/*     */     
/* 205 */     this.d = this.d.a(this.c.e(), bmn);
/* 206 */     this.a.a(this.b, this.d, 3);
/*     */   }
/*     */   
/*     */   private boolean d(el ☃) {
/* 210 */     bgs bgs1 = b(☃);
/* 211 */     if (bgs1 == null) {
/* 212 */       return false;
/*     */     }
/*     */     
/* 215 */     bgs1.d();
/* 216 */     return bgs1.b(this);
/*     */   }
/*     */   
/*     */   public bgs a(boolean ☃, boolean bool1) {
/* 220 */     el el1 = this.b.c();
/* 221 */     el el2 = this.b.d();
/* 222 */     el el3 = this.b.e();
/* 223 */     el el4 = this.b.f();
/*     */     
/* 225 */     boolean bool2 = d(el1);
/* 226 */     boolean bool3 = d(el2);
/* 227 */     boolean bool4 = d(el3);
/* 228 */     boolean bool5 = d(el4);
/*     */     
/* 230 */     bmn bmn = null;
/*     */     
/* 232 */     if ((bool2 || bool3) && !bool4 && !bool5) {
/* 233 */       bmn = bmn.a;
/*     */     }
/* 235 */     if ((bool4 || bool5) && !bool2 && !bool3) {
/* 236 */       bmn = bmn.b;
/*     */     }
/*     */     
/* 239 */     if (!this.e) {
/* 240 */       if (bool3 && bool5 && !bool2 && !bool4) {
/* 241 */         bmn = bmn.g;
/*     */       }
/* 243 */       if (bool3 && bool4 && !bool2 && !bool5) {
/* 244 */         bmn = bmn.h;
/*     */       }
/* 246 */       if (bool2 && bool4 && !bool3 && !bool5) {
/* 247 */         bmn = bmn.i;
/*     */       }
/* 249 */       if (bool2 && bool5 && !bool3 && !bool4) {
/* 250 */         bmn = bmn.j;
/*     */       }
/*     */     } 
/* 253 */     if (bmn == null) {
/* 254 */       if (bool2 || bool3) {
/* 255 */         bmn = bmn.a;
/*     */       }
/* 257 */       if (bool4 || bool5) {
/* 258 */         bmn = bmn.b;
/*     */       }
/*     */       
/* 261 */       if (!this.e) {
/* 262 */         if (☃) {
/* 263 */           if (bool3 && bool5) {
/* 264 */             bmn = bmn.g;
/*     */           }
/* 266 */           if (bool4 && bool3) {
/* 267 */             bmn = bmn.h;
/*     */           }
/* 269 */           if (bool5 && bool2) {
/* 270 */             bmn = bmn.j;
/*     */           }
/* 272 */           if (bool2 && bool4) {
/* 273 */             bmn = bmn.i;
/*     */           }
/*     */         } else {
/* 276 */           if (bool2 && bool4) {
/* 277 */             bmn = bmn.i;
/*     */           }
/* 279 */           if (bool5 && bool2) {
/* 280 */             bmn = bmn.j;
/*     */           }
/* 282 */           if (bool4 && bool3) {
/* 283 */             bmn = bmn.h;
/*     */           }
/* 285 */           if (bool3 && bool5) {
/* 286 */             bmn = bmn.g;
/*     */           }
/*     */         } 
/*     */       }
/*     */     } 
/*     */     
/* 292 */     if (bmn == bmn.a) {
/* 293 */       if (bco.a(this.a, el1.a())) {
/* 294 */         bmn = bmn.e;
/*     */       }
/* 296 */       if (bco.a(this.a, el2.a())) {
/* 297 */         bmn = bmn.f;
/*     */       }
/*     */     } 
/* 300 */     if (bmn == bmn.b) {
/* 301 */       if (bco.a(this.a, el4.a())) {
/* 302 */         bmn = bmn.c;
/*     */       }
/* 304 */       if (bco.a(this.a, el3.a())) {
/* 305 */         bmn = bmn.d;
/*     */       }
/*     */     } 
/*     */     
/* 309 */     if (bmn == null) {
/* 310 */       bmn = bmn.a;
/*     */     }
/*     */     
/* 313 */     a(bmn);
/* 314 */     this.d = this.d.a(this.c.e(), bmn);
/*     */     
/* 316 */     if (bool1 || this.a.a_(this.b) != this.d) {
/* 317 */       this.a.a(this.b, this.d, 3);
/*     */       
/* 319 */       for (int i = 0; i < this.f.size(); i++) {
/* 320 */         bgs bgs1 = b(this.f.get(i));
/* 321 */         if (bgs1 != null) {
/*     */ 
/*     */           
/* 324 */           bgs1.d();
/*     */           
/* 326 */           if (bgs1.b(this)) {
/* 327 */             bgs1.c(this);
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/* 332 */     return this;
/*     */   }
/*     */   
/*     */   public blc c() {
/* 336 */     return this.d;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bgs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */