/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.mojang.authlib.GameProfile;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.UUID;
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
/*     */ public class ajg
/*     */ {
/*     */   private axy a;
/*  40 */   private final List<ajf> b = Lists.newArrayList();
/*     */   
/*  42 */   private el c = el.a;
/*  43 */   private el d = el.a;
/*     */   
/*     */   private int e;
/*     */   private int f;
/*     */   private int g;
/*     */   private int h;
/*     */   private int i;
/*  50 */   private final Map<String, Integer> j = Maps.newHashMap();
/*     */   
/*     */   class a {
/*     */     a(ajg this$0, afa ☃, int i) {
/*  54 */       this.a = ☃;
/*  55 */       this.b = i;
/*     */     }
/*     */     
/*     */     public afa a;
/*     */     public int b;
/*     */   }
/*     */   
/*  62 */   private final List<a> k = Lists.newArrayList();
/*     */   
/*     */   private int l;
/*     */   
/*     */   public ajg() {}
/*     */   
/*     */   public ajg(axy ☃) {
/*  69 */     this.a = ☃;
/*     */   }
/*     */   
/*     */   public void a(axy ☃) {
/*  73 */     this.a = ☃;
/*     */   }
/*     */   
/*     */   public void a(int ☃) {
/*  77 */     this.g = ☃;
/*  78 */     m();
/*  79 */     l();
/*     */     
/*  81 */     if (☃ % 20 == 0) {
/*  82 */       k();
/*     */     }
/*     */     
/*  85 */     if (☃ % 30 == 0) {
/*  86 */       j();
/*     */     }
/*     */     
/*  89 */     int i = this.h / 10;
/*  90 */     if (this.l < i && this.b.size() > 20 && this.a.s.nextInt(7000) == 0) {
/*  91 */       aer aer = f(this.d);
/*  92 */       if (aer != null) {
/*  93 */         this.l++;
/*     */       }
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
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   private aer f(el ☃) {
/* 120 */     for (int i = 0; i < 10; i++) {
/* 121 */       el el1 = ☃.a(this.a.s.nextInt(16) - 8, this.a.s.nextInt(6) - 3, this.a.s.nextInt(16) - 8);
/* 122 */       if (a(el1)) {
/*     */ 
/*     */         
/* 125 */         ajw ajw = aev.aC.b(this.a, null, null, null, el1, false, false);
/* 126 */         if (ajw != null) {
/* 127 */           if (ajw.a(this.a, false) && ajw.a(this.a)) {
/* 128 */             this.a.a(ajw);
/* 129 */             return ajw;
/*     */           } 
/* 131 */           ajw.V();
/*     */         } 
/*     */       } 
/*     */     } 
/* 135 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   private void j() {
/* 140 */     List<ajw> ☃ = this.a.a(ajw.class, new cea((this.d.o() - this.e), (this.d.p() - 4), (this.d.q() - this.e), (this.d.o() + this.e), (this.d.p() + 4), (this.d.q() + this.e)));
/* 141 */     this.l = ☃.size();
/*     */   }
/*     */   
/*     */   private void k() {
/* 145 */     List<aob> ☃ = this.a.a(aob.class, new cea((this.d.o() - this.e), (this.d.p() - 4), (this.d.q() - this.e), (this.d.o() + this.e), (this.d.p() + 4), (this.d.q() + this.e)));
/* 146 */     this.h = ☃.size();
/*     */     
/* 148 */     if (this.h == 0)
/*     */     {
/* 150 */       this.j.clear();
/*     */     }
/*     */   }
/*     */   
/*     */   public el a() {
/* 155 */     return this.d;
/*     */   }
/*     */   
/*     */   public int b() {
/* 159 */     return this.e;
/*     */   }
/*     */   
/*     */   public int c() {
/* 163 */     return this.b.size();
/*     */   }
/*     */   
/*     */   public int d() {
/* 167 */     return this.g - this.f;
/*     */   }
/*     */   
/*     */   public int e() {
/* 171 */     return this.h;
/*     */   }
/*     */   
/*     */   public boolean a(el ☃) {
/* 175 */     return (this.d.n(☃) < (this.e * this.e));
/*     */   }
/*     */   
/*     */   public List<ajf> f() {
/* 179 */     return this.b;
/*     */   }
/*     */   
/*     */   public ajf b(el ☃) {
/* 183 */     ajf ajf = null;
/* 184 */     int i = Integer.MAX_VALUE;
/* 185 */     for (ajf ajf1 : this.b) {
/* 186 */       int j = ajf1.a(☃);
/* 187 */       if (j < i) {
/* 188 */         ajf = ajf1;
/* 189 */         i = j;
/*     */       } 
/*     */     } 
/* 192 */     return ajf;
/*     */   }
/*     */   
/*     */   public ajf c(el ☃) {
/* 196 */     ajf ajf = null;
/* 197 */     int i = Integer.MAX_VALUE;
/* 198 */     for (ajf ajf1 : this.b) {
/* 199 */       int j = ajf1.a(☃);
/* 200 */       if (j > 256) {
/* 201 */         j *= 1000;
/*     */       } else {
/* 203 */         j = ajf1.c();
/*     */       } 
/*     */       
/* 206 */       if (j < i) {
/* 207 */         el el1 = ajf1.d();
/* 208 */         eq eq = ajf1.j();
/*     */         
/* 210 */         if (this.a.a_(el1.a(eq, 1)).a(this.a, el1.a(eq, 1), cbf.a) && this.a
/* 211 */           .a_(el1.a(eq, -1)).a(this.a, el1.a(eq, -1), cbf.a) && this.a
/* 212 */           .a_(el1.a().a(eq, 1)).a(this.a, el1.a().a(eq, 1), cbf.a) && this.a
/* 213 */           .a_(el1.a().a(eq, -1)).a(this.a, el1.a().a(eq, -1), cbf.a)) {
/*     */           
/* 215 */           ajf = ajf1;
/* 216 */           i = j;
/*     */         } 
/*     */       } 
/*     */     } 
/* 220 */     return ajf;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public ajf e(el ☃) {
/* 229 */     if (this.d.n(☃) > (this.e * this.e)) {
/* 230 */       return null;
/*     */     }
/* 232 */     for (ajf ajf : this.b) {
/* 233 */       if (ajf.d().o() == ☃.o() && ajf.d().q() == ☃.q() && Math.abs(ajf.d().p() - ☃.p()) <= 1) {
/* 234 */         return ajf;
/*     */       }
/*     */     } 
/* 237 */     return null;
/*     */   }
/*     */   
/*     */   public void a(ajf ☃) {
/* 241 */     this.b.add(☃);
/* 242 */     this.c = this.c.a(☃.d());
/* 243 */     n();
/* 244 */     this.f = ☃.h();
/*     */   }
/*     */   
/*     */   public boolean g() {
/* 248 */     return this.b.isEmpty();
/*     */   }
/*     */   
/*     */   public void a(afa ☃) {
/* 252 */     for (a a : this.k) {
/* 253 */       if (a.a == ☃) {
/* 254 */         a.b = this.g;
/*     */         return;
/*     */       } 
/*     */     } 
/* 258 */     this.k.add(new a(this, ☃, this.g));
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public afa b(afa ☃) {
/* 263 */     double d = Double.MAX_VALUE;
/* 264 */     a a = null;
/* 265 */     for (int i = 0; i < this.k.size(); i++) {
/* 266 */       a a1 = this.k.get(i);
/* 267 */       double d1 = a1.a.h(☃);
/* 268 */       if (d1 <= d) {
/*     */ 
/*     */         
/* 271 */         a = a1;
/* 272 */         d = d1;
/*     */       } 
/* 274 */     }  return (a == null) ? null : a.a;
/*     */   }
/*     */   
/*     */   public aog c(afa ☃) {
/* 278 */     double d = Double.MAX_VALUE;
/* 279 */     aog aog = null;
/*     */     
/* 281 */     for (String str : this.j.keySet()) {
/* 282 */       if (d(str)) {
/* 283 */         aog aog1 = this.a.a(str);
/* 284 */         if (aog1 != null) {
/* 285 */           double d1 = aog1.h(☃);
/* 286 */           if (d1 > d) {
/*     */             continue;
/*     */           }
/* 289 */           aog = aog1;
/* 290 */           d = d1;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 295 */     return aog;
/*     */   }
/*     */   
/*     */   private void l() {
/* 299 */     Iterator<a> ☃ = this.k.iterator();
/* 300 */     while (☃.hasNext()) {
/* 301 */       a a = ☃.next();
/* 302 */       if (!a.a.aF() || Math.abs(this.g - a.b) > 300) {
/* 303 */         ☃.remove();
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   private void m() {
/* 309 */     boolean ☃ = false;
/* 310 */     boolean bool1 = (this.a.s.nextInt(50) == 0);
/*     */     
/* 312 */     for (Iterator<ajf> iterator = this.b.iterator(); iterator.hasNext(); ) {
/* 313 */       ajf ajf = iterator.next();
/* 314 */       if (bool1) {
/* 315 */         ajf.a();
/*     */       }
/* 317 */       if (!g(ajf.d()) || Math.abs(this.g - ajf.h()) > 1200) {
/* 318 */         this.c = this.c.b(ajf.d());
/* 319 */         ☃ = true;
/* 320 */         ajf.a(true);
/* 321 */         iterator.remove();
/*     */       } 
/*     */     } 
/*     */     
/* 325 */     if (☃) {
/* 326 */       n();
/*     */     }
/*     */   }
/*     */   
/*     */   private boolean g(el ☃) {
/* 331 */     blc blc = this.a.a_(☃);
/* 332 */     bcs bcs = blc.c();
/* 333 */     if (bcs instanceof bed) {
/* 334 */       return (blc.d() == bza.w);
/*     */     }
/* 336 */     return false;
/*     */   }
/*     */   
/*     */   private void n() {
/* 340 */     int ☃ = this.b.size();
/* 341 */     if (☃ == 0) {
/* 342 */       this.d = el.a;
/* 343 */       this.e = 0;
/*     */       return;
/*     */     } 
/* 346 */     this.d = new el(this.c.o() / ☃, this.c.p() / ☃, this.c.q() / ☃);
/* 347 */     int i = 0;
/* 348 */     for (ajf ajf : this.b) {
/* 349 */       i = Math.max(ajf.a(this.d), i);
/*     */     }
/* 351 */     this.e = Math.max(32, (int)Math.sqrt(i) + 1);
/*     */   }
/*     */   
/*     */   public int a(String ☃) {
/* 355 */     Integer integer = this.j.get(☃);
/* 356 */     return (integer == null) ? 0 : integer.intValue();
/*     */   }
/*     */   
/*     */   public int a(String ☃, int i) {
/* 360 */     int j = a(☃);
/* 361 */     int k = xq.a(j + i, -30, 10);
/* 362 */     this.j.put(☃, Integer.valueOf(k));
/* 363 */     return k;
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
/*     */   public boolean d(String ☃) {
/* 375 */     return (a(☃) <= -15);
/*     */   }
/*     */   
/*     */   public void a(gy ☃) {
/* 379 */     this.h = ☃.h("PopSize");
/* 380 */     this.e = ☃.h("Radius");
/* 381 */     this.l = ☃.h("Golems");
/* 382 */     this.f = ☃.h("Stable");
/* 383 */     this.g = ☃.h("Tick");
/* 384 */     this.i = ☃.h("MTick");
/* 385 */     this.d = new el(☃.h("CX"), ☃.h("CY"), ☃.h("CZ"));
/* 386 */     this.c = new el(☃.h("ACX"), ☃.h("ACY"), ☃.h("ACZ"));
/*     */     
/* 388 */     he he1 = ☃.d("Doors", 10);
/* 389 */     for (int i = 0; i < he1.size(); i++) {
/* 390 */       gy gy1 = he1.e(i);
/*     */       
/* 392 */       ajf ajf = new ajf(new el(gy1.h("X"), gy1.h("Y"), gy1.h("Z")), gy1.h("IDX"), gy1.h("IDZ"), gy1.h("TS"));
/* 393 */       this.b.add(ajf);
/*     */     } 
/*     */     
/* 396 */     he he2 = ☃.d("Players", 10);
/* 397 */     for (int j = 0; j < he2.size(); j++) {
/* 398 */       gy gy1 = he2.e(j);
/* 399 */       if (gy1.e("UUID") && this.a != null && this.a.z() != null) {
/* 400 */         vl vl = this.a.z().ar();
/* 401 */         GameProfile gameProfile = vl.a(UUID.fromString(gy1.l("UUID")));
/* 402 */         if (gameProfile != null) {
/* 403 */           this.j.put(gameProfile.getName(), Integer.valueOf(gy1.h("S")));
/*     */         }
/*     */       } else {
/* 406 */         this.j.put(gy1.l("Name"), Integer.valueOf(gy1.h("S")));
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public void b(gy ☃) {
/* 412 */     ☃.b("PopSize", this.h);
/* 413 */     ☃.b("Radius", this.e);
/* 414 */     ☃.b("Golems", this.l);
/* 415 */     ☃.b("Stable", this.f);
/* 416 */     ☃.b("Tick", this.g);
/* 417 */     ☃.b("MTick", this.i);
/* 418 */     ☃.b("CX", this.d.o());
/* 419 */     ☃.b("CY", this.d.p());
/* 420 */     ☃.b("CZ", this.d.q());
/* 421 */     ☃.b("ACX", this.c.o());
/* 422 */     ☃.b("ACY", this.c.p());
/* 423 */     ☃.b("ACZ", this.c.q());
/*     */     
/* 425 */     he he1 = new he();
/* 426 */     for (ajf ajf : this.b) {
/* 427 */       gy gy1 = new gy();
/* 428 */       gy1.b("X", ajf.d().o());
/* 429 */       gy1.b("Y", ajf.d().p());
/* 430 */       gy1.b("Z", ajf.d().q());
/* 431 */       gy1.b("IDX", ajf.f());
/* 432 */       gy1.b("IDZ", ajf.g());
/* 433 */       gy1.b("TS", ajf.h());
/* 434 */       he1.a(gy1);
/*     */     } 
/* 436 */     ☃.a("Doors", he1);
/*     */     
/* 438 */     he he2 = new he();
/* 439 */     for (String str : this.j.keySet()) {
/* 440 */       gy gy1 = new gy();
/*     */       
/* 442 */       vl vl = this.a.z().ar();
/*     */       try {
/* 444 */         GameProfile gameProfile = vl.a(str);
/* 445 */         if (gameProfile != null) {
/* 446 */           gy1.a("UUID", gameProfile.getId().toString());
/* 447 */           gy1.b("S", ((Integer)this.j.get(str)).intValue());
/* 448 */           he2.a(gy1);
/*     */         } 
/* 450 */       } catch (RuntimeException runtimeException) {}
/*     */     } 
/*     */     
/* 453 */     ☃.a("Players", he2);
/*     */   }
/*     */   
/*     */   public void h() {
/* 457 */     this.i = this.g;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean i() {
/* 462 */     return (this.i == 0 || this.g - this.i >= 3600);
/*     */   }
/*     */   
/*     */   public void b(int ☃) {
/* 466 */     for (String str : this.j.keySet())
/* 467 */       a(str, ☃); 
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\ajg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */