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
/*     */ public class bnk
/*     */ {
/*  14 */   private static final bno<blc> a = new bng<>(bcs.e, bct.a.p());
/*     */   
/*     */   private final int b;
/*     */   private int c;
/*     */   private int d;
/*     */   private int e;
/*     */   private final bnq<blc> f;
/*     */   private bne g;
/*     */   private bne h;
/*     */   
/*     */   public bnk(int ☃, boolean bool) {
/*  25 */     this.b = ☃;
/*  26 */     this.f = new bnq<>(a, bcs.e, hk::d, hk::a, bct.a.p());
/*  27 */     this.g = new bne();
/*  28 */     if (bool) {
/*  29 */       this.h = new bne();
/*     */     }
/*     */   }
/*     */   
/*     */   public blc a(int ☃, int i, int j) {
/*  34 */     return this.f.a(☃, i, j);
/*     */   }
/*     */   
/*     */   public byw b(int ☃, int i, int j) {
/*  38 */     return ((blc)this.f.a(☃, i, j)).s();
/*     */   }
/*     */   
/*     */   public void a(int ☃, int i, int j, blc blc1) {
/*  42 */     blc blc2 = a(☃, i, j);
/*  43 */     byw byw1 = b(☃, i, j);
/*  44 */     byw byw2 = blc1.s();
/*     */     
/*  46 */     if (!blc2.f()) {
/*  47 */       this.c--;
/*  48 */       if (blc2.t()) {
/*  49 */         this.d--;
/*     */       }
/*     */     } 
/*     */     
/*  53 */     if (!byw1.e()) {
/*  54 */       this.e--;
/*     */     }
/*     */     
/*  57 */     if (!blc1.f()) {
/*  58 */       this.c++;
/*  59 */       if (blc1.t()) {
/*  60 */         this.d++;
/*     */       }
/*     */     } 
/*     */     
/*  64 */     if (!byw2.e()) {
/*  65 */       this.e--;
/*     */     }
/*     */     
/*  68 */     this.f.a(☃, i, j, blc1);
/*     */   }
/*     */   
/*     */   public boolean a() {
/*  72 */     return (this.c == 0);
/*     */   }
/*     */   
/*     */   public boolean b() {
/*  76 */     return (c() || d());
/*     */   }
/*     */   
/*     */   public boolean c() {
/*  80 */     return (this.d > 0);
/*     */   }
/*     */   
/*     */   public boolean d() {
/*  84 */     return (this.e > 0);
/*     */   }
/*     */   
/*     */   public int e() {
/*  88 */     return this.b;
/*     */   }
/*     */   
/*     */   public void a(int ☃, int i, int j, int k) {
/*  92 */     this.h.a(☃, i, j, k);
/*     */   }
/*     */   
/*     */   public int c(int ☃, int i, int j) {
/*  96 */     return this.h.a(☃, i, j);
/*     */   }
/*     */   
/*     */   public void b(int ☃, int i, int j, int k) {
/* 100 */     this.g.a(☃, i, j, k);
/*     */   }
/*     */   
/*     */   public int d(int ☃, int i, int j) {
/* 104 */     return this.g.a(☃, i, j);
/*     */   }
/*     */   
/*     */   public void f() {
/* 108 */     this.c = 0;
/* 109 */     this.d = 0;
/* 110 */     this.e = 0;
/*     */     
/* 112 */     for (int ☃ = 0; ☃ < 16; ☃++) {
/* 113 */       for (int i = 0; i < 16; i++) {
/* 114 */         for (int j = 0; j < 16; j++) {
/* 115 */           blc blc = a(☃, i, j);
/* 116 */           byw byw = b(☃, i, j);
/*     */           
/* 118 */           if (!blc.f()) {
/* 119 */             this.c++;
/* 120 */             if (blc.t()) {
/* 121 */               this.d++;
/*     */             }
/*     */           } 
/* 124 */           if (!byw.e()) {
/* 125 */             this.c++;
/* 126 */             if (byw.h()) {
/* 127 */               this.e++;
/*     */             }
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public bnq<blc> g() {
/* 136 */     return this.f;
/*     */   }
/*     */   
/*     */   public bne h() {
/* 140 */     return this.g;
/*     */   }
/*     */   
/*     */   public bne i() {
/* 144 */     return this.h;
/*     */   }
/*     */   
/*     */   public void a(bne ☃) {
/* 148 */     this.g = ☃;
/*     */   }
/*     */   
/*     */   public void b(bne ☃) {
/* 152 */     this.h = ☃;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bnk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */