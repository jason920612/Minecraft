/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class agx
/*     */   extends agt
/*     */ {
/*  13 */   private static final int[] a = new int[] { 0, 1, 4, 5, 6, 7 };
/*     */   
/*     */   private final aju b;
/*     */   
/*     */   private final int c;
/*     */   private boolean d;
/*     */   
/*     */   public agx(aju ☃, int i) {
/*  21 */     this.b = ☃;
/*  22 */     this.c = i;
/*  23 */     a(5);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a() {
/*  28 */     if (this.b.ce().nextInt(this.c) != 0) {
/*  29 */       return false;
/*     */     }
/*     */     
/*  32 */     eq ☃ = this.b.bB();
/*  33 */     int i = ☃.g();
/*  34 */     int j = ☃.i();
/*  35 */     el el = new el(this.b);
/*     */     
/*  37 */     for (int k : a) {
/*  38 */       if (!a(el, i, j, k) || !b(el, i, j, k)) {
/*  39 */         return false;
/*     */       }
/*     */     } 
/*     */     
/*  43 */     return true;
/*     */   }
/*     */   
/*     */   private boolean a(el ☃, int i, int j, int k) {
/*  47 */     el el1 = ☃.a(i * k, 0, j * k);
/*  48 */     return (this.b.m.b(el1).a(ww.a) && !this.b.m.a_(el1).d().c());
/*     */   }
/*     */   
/*     */   private boolean b(el ☃, int i, int j, int k) {
/*  52 */     return (this.b.m.a_(☃.a(i * k, 1, j * k)).f() && this.b.m
/*  53 */       .a_(☃.a(i * k, 2, j * k)).f());
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b() {
/*  58 */     return ((this.b.u * this.b.u >= 0.029999999329447746D || this.b.x == 0.0F || Math.abs(this.b.x) >= 10.0F || !this.b.an()) && !this.b.A);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean f() {
/*  63 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void c() {
/*  69 */     eq ☃ = this.b.bB();
/*  70 */     this.b.t += ☃.g() * 0.6D;
/*  71 */     this.b.u += 0.7D;
/*  72 */     this.b.v += ☃.i() * 0.6D;
/*     */     
/*  74 */     this.b.t().q();
/*     */   }
/*     */ 
/*     */   
/*     */   public void d() {
/*  79 */     this.b.x = 0.0F;
/*     */   }
/*     */ 
/*     */   
/*     */   public void e() {
/*  84 */     boolean ☃ = this.d;
/*  85 */     if (!☃) {
/*  86 */       byw byw = this.b.m.b(new el(this.b));
/*  87 */       this.d = byw.a(ww.a);
/*     */     } 
/*     */     
/*  90 */     if (this.d && !☃) {
/*  91 */       this.b.a(wj.bk, 1.0F, 1.0F);
/*     */     }
/*     */     
/*  94 */     if (this.b.u * this.b.u < 0.029999999329447746D && this.b.x != 0.0F) {
/*  95 */       this.b.x = a(this.b.x, 0.0F, 0.2F);
/*     */     } else {
/*  97 */       double d1 = Math.sqrt(this.b.t * this.b.t + this.b.u * this.b.u + this.b.v * this.b.v);
/*  98 */       double d2 = Math.sqrt(this.b.t * this.b.t + this.b.v * this.b.v);
/*  99 */       double d3 = Math.signum(-this.b.u) * Math.acos(d2 / d1) * 57.2957763671875D;
/* 100 */       this.b.x = (float)d3;
/*     */     } 
/*     */   }
/*     */   
/*     */   protected float a(float ☃, float f1, float f2) {
/* 105 */     float f = f1 - ☃;
/* 106 */     while (f < -180.0F) {
/* 107 */       f += 360.0F;
/*     */     }
/* 109 */     while (f >= 180.0F) {
/* 110 */       f -= 360.0F;
/*     */     }
/* 112 */     return ☃ + f2 * f;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\agx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */