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
/*     */ public class aqd
/*     */   extends aqr
/*     */ {
/*  22 */   public aqc a = new aqc(this, 3, 3);
/*  23 */   public aqt f = new aqt();
/*     */   
/*     */   private final axy g;
/*     */   private final el h;
/*     */   private final aog i;
/*     */   
/*     */   public aqd(aof ☃, axy axy1, el el1) {
/*  30 */     this.g = axy1;
/*  31 */     this.h = el1;
/*  32 */     this.i = ☃.e;
/*  33 */     a(new aqu(☃.e, this.a, this.f, 0, 124, 35));
/*     */     int i;
/*  35 */     for (i = 0; i < 3; i++) {
/*  36 */       for (int j = 0; j < 3; j++) {
/*  37 */         a(new aqx(this.a, j + i * 3, 30 + j * 18, 17 + i * 18));
/*     */       }
/*     */     } 
/*     */     
/*  41 */     for (i = 0; i < 3; i++) {
/*  42 */       for (int j = 0; j < 9; j++) {
/*  43 */         a(new aqx(☃, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
/*     */       }
/*     */     } 
/*  46 */     for (i = 0; i < 9; i++) {
/*  47 */       a(new aqx(☃, i, 8 + i * 18, 142));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ade ☃) {
/*  53 */     a(this.g, this.i, this.a, this.f);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(aoi ☃) {
/*  58 */     this.a.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void d() {
/*  63 */     this.a.m();
/*  64 */     this.f.m();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(avk ☃) {
/*  69 */     return ☃.a(this.a, this.i.m);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(aog ☃) {
/*  74 */     super.b(☃);
/*  75 */     if (this.g.B) {
/*     */       return;
/*     */     }
/*     */     
/*  79 */     a(☃, this.g, this.a);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(aog ☃) {
/*  84 */     if (this.g.a_(this.h).c() != bct.co) {
/*  85 */       return false;
/*     */     }
/*  87 */     return (☃.d(this.h.o() + 0.5D, this.h.p() + 0.5D, this.h.q() + 0.5D) <= 64.0D);
/*     */   }
/*     */ 
/*     */   
/*     */   public ate b(aog ☃, int i) {
/*  92 */     ate ate = ate.a;
/*  93 */     aqx aqx = this.c.get(i);
/*  94 */     if (aqx != null && aqx.e()) {
/*  95 */       ate ate1 = aqx.d();
/*  96 */       ate = ate1.i();
/*     */       
/*  98 */       if (i == 0) {
/*  99 */         ate1.b().b(ate1, this.g, ☃);
/* 100 */         if (!a(ate1, 10, 46, true)) {
/* 101 */           return ate.a;
/*     */         }
/* 103 */         aqx.a(ate1, ate);
/* 104 */       } else if (i >= 10 && i < 37) {
/* 105 */         if (!a(ate1, 37, 46, false)) {
/* 106 */           return ate.a;
/*     */         }
/* 108 */       } else if (i >= 37 && i < 46) {
/* 109 */         if (!a(ate1, 10, 37, false)) {
/* 110 */           return ate.a;
/*     */         }
/*     */       }
/* 113 */       else if (!a(ate1, 10, 46, false)) {
/* 114 */         return ate.a;
/*     */       } 
/*     */       
/* 117 */       if (ate1.a()) {
/* 118 */         aqx.d(ate.a);
/*     */       } else {
/* 120 */         aqx.f();
/*     */       } 
/* 122 */       if (ate1.C() == ate.C())
/*     */       {
/* 124 */         return ate.a;
/*     */       }
/* 126 */       ate ate2 = aqx.a(☃, ate1);
/* 127 */       if (i == 0) {
/* 128 */         ☃.a(ate2, false);
/*     */       }
/*     */     } 
/*     */     
/* 132 */     return ate;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ate ☃, aqx aqx1) {
/* 137 */     return (aqx1.d != this.f && super.a(☃, aqx1));
/*     */   }
/*     */ 
/*     */   
/*     */   public int e() {
/* 142 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public int f() {
/* 147 */     return this.a.U_();
/*     */   }
/*     */ 
/*     */   
/*     */   public int g() {
/* 152 */     return this.a.n();
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\aqd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */