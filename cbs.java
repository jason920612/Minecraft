/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
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
/*     */ public class cbs
/*     */   extends cbo
/*     */ {
/*     */   public int a;
/*     */   public int b;
/*     */   public bod c;
/*     */   public boolean d;
/*     */   public boolean e;
/*     */   public byte f;
/*     */   
/*     */   public class a
/*     */   {
/*     */     public final aog a;
/*     */     private boolean d = true;
/*     */     private int e;
/*     */     private int f;
/*  38 */     private int g = 127;
/*  39 */     private int h = 127;
/*     */     private int i;
/*     */     public int b;
/*     */     
/*     */     public a(cbs ☃, aog aog1) {
/*  44 */       this.a = aog1;
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public iv<?> a(ate ☃) {
/*  49 */       if (this.d) {
/*  50 */         this.d = false;
/*  51 */         return new kk(atj.e(☃), this.c.f, this.c.d, this.c.i.values(), this.c.g, this.e, this.f, this.g + 1 - this.e, this.h + 1 - this.f);
/*  52 */       }  if (this.i++ % 5 == 0) {
/*  53 */         return new kk(atj.e(☃), this.c.f, this.c.d, this.c.i.values(), this.c.g, 0, 0, 0, 0);
/*     */       }
/*     */       
/*  56 */       return null;
/*     */     }
/*     */     
/*     */     public void a(int ☃, int i) {
/*  60 */       if (this.d) {
/*  61 */         this.e = Math.min(this.e, ☃);
/*  62 */         this.f = Math.min(this.f, i);
/*  63 */         this.g = Math.max(this.g, ☃);
/*  64 */         this.h = Math.max(this.h, i);
/*     */       } else {
/*  66 */         this.d = true;
/*  67 */         this.e = ☃;
/*  68 */         this.f = i;
/*  69 */         this.g = ☃;
/*  70 */         this.h = i;
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
/*  82 */   public byte[] g = new byte[16384];
/*  83 */   public List<a> h = Lists.newArrayList();
/*  84 */   private final Map<aog, a> j = Maps.newHashMap();
/*  85 */   private final Map<String, cbp> k = Maps.newHashMap();
/*  86 */   public Map<String, cbq> i = Maps.newLinkedHashMap();
/*  87 */   private final Map<String, cbr> l = Maps.newHashMap();
/*     */   
/*     */   public cbs(String ☃) {
/*  90 */     super(☃);
/*     */   }
/*     */   
/*     */   public void a(int ☃, int i, int j, boolean bool1, boolean bool2, bod bod1) {
/*  94 */     this.f = (byte)j;
/*  95 */     a(☃, i, this.f);
/*  96 */     this.c = bod1;
/*  97 */     this.d = bool1;
/*  98 */     this.e = bool2;
/*     */     
/* 100 */     c();
/*     */   }
/*     */   
/*     */   public void a(double ☃, double d1, int i) {
/* 104 */     int j = 128 * (1 << i);
/*     */     
/* 106 */     int k = xq.c((☃ + 64.0D) / j);
/* 107 */     int m = xq.c((d1 + 64.0D) / j);
/*     */     
/* 109 */     this.a = k * j + j / 2 - 64;
/* 110 */     this.b = m * j + j / 2 - 64;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(gy ☃) {
/* 115 */     this.c = bod.a(☃.h("dimension"));
/* 116 */     this.a = ☃.h("xCenter");
/* 117 */     this.b = ☃.h("zCenter");
/* 118 */     this.f = (byte)xq.a(☃.f("scale"), 0, 4);
/*     */     
/* 120 */     this.d = (!☃.c("trackingPosition", 1) || ☃.q("trackingPosition"));
/* 121 */     this.e = ☃.q("unlimitedTracking");
/*     */     
/* 123 */     this.g = ☃.m("colors");
/* 124 */     if (this.g.length != 16384) {
/* 125 */       this.g = new byte[16384];
/*     */     }
/*     */     
/* 128 */     he he1 = ☃.d("banners", 10);
/* 129 */     for (int i = 0; i < he1.size(); i++) {
/* 130 */       cbp cbp = cbp.a(he1.e(i));
/* 131 */       this.k.put(cbp.f(), cbp);
/* 132 */       a(cbp.c(), null, cbp.f(), cbp.a().o(), cbp.a().q(), 180.0D, cbp.d());
/*     */     } 
/*     */     
/* 135 */     he he2 = ☃.d("frames", 10);
/* 136 */     for (int j = 0; j < he2.size(); j++) {
/* 137 */       cbr cbr = cbr.a(he2.e(j));
/* 138 */       this.l.put(cbr.e(), cbr);
/* 139 */       a(cbq.a.b, null, "frame-" + cbr.d(), cbr.b().o(), cbr.b().q(), cbr.c(), null);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public gy b(gy ☃) {
/* 145 */     ☃.b("dimension", this.c.c());
/* 146 */     ☃.b("xCenter", this.a);
/* 147 */     ☃.b("zCenter", this.b);
/* 148 */     ☃.a("scale", this.f);
/* 149 */     ☃.a("colors", this.g);
/* 150 */     ☃.a("trackingPosition", this.d);
/* 151 */     ☃.a("unlimitedTracking", this.e);
/*     */     
/* 153 */     he he1 = new he();
/* 154 */     for (cbp cbp : this.k.values()) {
/* 155 */       he1.a(cbp.e());
/*     */     }
/* 157 */     ☃.a("banners", he1);
/*     */     
/* 159 */     he he2 = new he();
/* 160 */     for (cbr cbr : this.l.values()) {
/* 161 */       he2.a(cbr.a());
/*     */     }
/* 163 */     ☃.a("frames", he2);
/*     */     
/* 165 */     return ☃;
/*     */   }
/*     */   
/*     */   public void a(aog ☃, ate ate1) {
/* 169 */     if (!this.j.containsKey(☃)) {
/* 170 */       a a = new a(this, ☃);
/* 171 */       this.j.put(☃, a);
/* 172 */       this.h.add(a);
/*     */     } 
/*     */     
/* 175 */     if (!☃.bB.h(ate1)) {
/* 176 */       this.i.remove(☃.N_().getString());
/*     */     }
/*     */     
/* 179 */     for (int i = 0; i < this.h.size(); i++) {
/* 180 */       a a = this.h.get(i);
/* 181 */       String str = a.a.N_().getString();
/*     */       
/* 183 */       if (a.a.G || (!a.a.bB.h(ate1) && !ate1.x())) {
/* 184 */         this.j.remove(a.a);
/* 185 */         this.h.remove(a);
/* 186 */         this.i.remove(str);
/* 187 */       } else if (!ate1.x() && a.a.ap == this.c && this.d) {
/* 188 */         a(cbq.a.a, a.a.m, str, a.a.q, a.a.s, a.a.w, null);
/*     */       } 
/*     */     } 
/*     */     
/* 192 */     if (ate1.x() && this.d) {
/* 193 */       amb amb = ate1.y();
/* 194 */       el el = amb.n();
/* 195 */       cbr cbr1 = this.l.get(cbr.a(el));
/*     */ 
/*     */       
/* 198 */       if (cbr1 != null && amb.Q() != cbr1.d() && this.l.containsKey(cbr1.e())) {
/* 199 */         this.i.remove("frame-" + cbr1.d());
/*     */       }
/* 201 */       cbr cbr2 = new cbr(el, amb.c.b() * 90, amb.Q());
/* 202 */       a(cbq.a.b, ☃.m, "frame-" + amb.Q(), el.o(), el.q(), (amb.c.b() * 90), null);
/* 203 */       this.l.put(cbr2.e(), cbr2);
/*     */     } 
/*     */     
/* 206 */     gy gy = ate1.n();
/* 207 */     if (gy != null && gy.c("Decorations", 9)) {
/* 208 */       he he = gy.d("Decorations", 10);
/* 209 */       for (int j = 0; j < he.size(); j++) {
/* 210 */         gy gy1 = he.e(j);
/* 211 */         if (!this.i.containsKey(gy1.l("id"))) {
/* 212 */           a(cbq.a.a(gy1.f("type")), ☃.m, gy1.l("id"), gy1.k("x"), gy1.k("z"), gy1.k("rot"), null);
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public static void a(ate ☃, el el1, String str, cbq.a a1) {
/*     */     he he;
/* 221 */     if (☃.m() && ☃.n().c("Decorations", 9)) {
/* 222 */       he = ☃.n().d("Decorations", 10);
/*     */     } else {
/* 224 */       he = new he();
/* 225 */       ☃.a("Decorations", he);
/*     */     } 
/* 227 */     gy gy = new gy();
/* 228 */     gy.a("type", a1.a());
/* 229 */     gy.a("id", str);
/* 230 */     gy.a("x", el1.o());
/* 231 */     gy.a("z", el1.q());
/* 232 */     gy.a("rot", 180.0D);
/* 233 */     he.a(gy);
/*     */ 
/*     */     
/* 236 */     if (a1.c()) {
/* 237 */       gy gy1 = ☃.a("display");
/* 238 */       gy1.b("MapColor", a1.d());
/*     */     } 
/*     */   }
/*     */   private void a(cbq.a ☃, @Nullable axz axz1, String str, double d1, double d2, double d3, @Nullable ij ij1) {
/*     */     byte b3;
/* 243 */     int i = 1 << this.f;
/* 244 */     float f1 = (float)(d1 - this.a) / i;
/* 245 */     float f2 = (float)(d2 - this.b) / i;
/* 246 */     byte b1 = (byte)(int)((f1 * 2.0F) + 0.5D);
/* 247 */     byte b2 = (byte)(int)((f2 * 2.0F) + 0.5D);
/*     */     
/* 249 */     int j = 63;
/*     */     
/* 251 */     if (f1 >= -63.0F && f2 >= -63.0F && f1 <= 63.0F && f2 <= 63.0F) {
/* 252 */       d3 += (d3 < 0.0D) ? -8.0D : 8.0D;
/* 253 */       b3 = (byte)(int)(d3 * 16.0D / 360.0D);
/*     */       
/* 255 */       if (this.c == bod.b && axz1 != null) {
/* 256 */         int k = (int)(axz1.g().f() / 10L);
/* 257 */         b3 = (byte)(k * k * 34187121 + k * 121 >> 15 & 0xF);
/*     */       } 
/* 259 */     } else if (☃ == cbq.a.a) {
/* 260 */       int k = 320;
/* 261 */       if (Math.abs(f1) < 320.0F && Math.abs(f2) < 320.0F) {
/* 262 */         ☃ = cbq.a.g;
/* 263 */       } else if (this.e) {
/* 264 */         ☃ = cbq.a.h;
/*     */       } else {
/* 266 */         this.i.remove(str);
/*     */         return;
/*     */       } 
/* 269 */       b3 = 0;
/* 270 */       if (f1 <= -63.0F) {
/* 271 */         b1 = Byte.MIN_VALUE;
/*     */       }
/* 273 */       if (f2 <= -63.0F) {
/* 274 */         b2 = Byte.MIN_VALUE;
/*     */       }
/* 276 */       if (f1 >= 63.0F) {
/* 277 */         b1 = Byte.MAX_VALUE;
/*     */       }
/* 279 */       if (f2 >= 63.0F) {
/* 280 */         b2 = Byte.MAX_VALUE;
/*     */       }
/*     */     } else {
/* 283 */       this.i.remove(str);
/*     */       
/*     */       return;
/*     */     } 
/* 287 */     this.i.put(str, new cbq(☃, b1, b2, b3, ij1));
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public iv<?> a(ate ☃, axk axk1, aog aog1) {
/* 292 */     a a = this.j.get(aog1);
/*     */     
/* 294 */     if (a == null) {
/* 295 */       return null;
/*     */     }
/*     */     
/* 298 */     return a.a(☃);
/*     */   }
/*     */   
/*     */   public void a(int ☃, int i) {
/* 302 */     c();
/* 303 */     for (a a : this.h) {
/* 304 */       a.a(☃, i);
/*     */     }
/*     */   }
/*     */   
/*     */   public a a(aog ☃) {
/* 309 */     a a = this.j.get(☃);
/*     */     
/* 311 */     if (a == null) {
/* 312 */       a = new a(this, ☃);
/* 313 */       this.j.put(☃, a);
/* 314 */       this.h.add(a);
/*     */     } 
/*     */     
/* 317 */     return a;
/*     */   }
/*     */   
/*     */   public void a(axz ☃, el el1) {
/* 321 */     float f1 = el1.o() + 0.5F;
/* 322 */     float f2 = el1.q() + 0.5F;
/* 323 */     int i = 1 << this.f;
/* 324 */     float f3 = (f1 - this.a) / i;
/* 325 */     float f4 = (f2 - this.b) / i;
/* 326 */     int j = 63;
/* 327 */     boolean bool = false;
/* 328 */     if (f3 >= -63.0F && f4 >= -63.0F && f3 <= 63.0F && f4 <= 63.0F) {
/* 329 */       cbp cbp = cbp.a(☃, el1);
/* 330 */       if (cbp == null) {
/*     */         return;
/*     */       }
/*     */       
/* 334 */       boolean bool1 = true;
/* 335 */       if (this.k.containsKey(cbp.f()) && (
/* 336 */         (cbp)this.k.get(cbp.f())).equals(cbp)) {
/* 337 */         this.k.remove(cbp.f());
/* 338 */         this.i.remove(cbp.f());
/* 339 */         bool1 = false;
/* 340 */         bool = true;
/*     */       } 
/*     */ 
/*     */       
/* 344 */       if (bool1) {
/* 345 */         this.k.put(cbp.f(), cbp);
/* 346 */         a(cbp.c(), ☃, cbp.f(), f1, f2, 180.0D, cbp.d());
/* 347 */         bool = true;
/*     */       } 
/*     */       
/* 350 */       if (bool) {
/* 351 */         c();
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(axk ☃, int i, int j) {
/* 357 */     for (Iterator<cbp> iterator = this.k.values().iterator(); iterator.hasNext(); ) {
/* 358 */       cbp cbp = iterator.next();
/* 359 */       if (cbp.a().o() == i && cbp.a().q() == j) {
/* 360 */         cbp cbp1 = cbp.a(☃, cbp.a());
/* 361 */         if (!cbp.equals(cbp1)) {
/* 362 */           iterator.remove();
/* 363 */           this.i.remove(cbp.f());
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(el ☃, int i) {
/* 374 */     this.i.remove("frame-" + i);
/* 375 */     this.l.remove(cbr.a(☃));
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\cbs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */