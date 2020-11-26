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
/*     */ public class apy
/*     */   extends apv
/*     */ {
/*     */   private final ade a;
/*     */   private final aqx f;
/*     */   private int g;
/*     */   private int h;
/*     */   
/*     */   public apy(aof ☃, ade ade1) {
/*  30 */     this.a = ade1;
/*     */     
/*  32 */     a(new c(ade1, 0, 56, 51));
/*  33 */     a(new c(ade1, 1, 79, 58));
/*  34 */     a(new c(ade1, 2, 102, 51));
/*  35 */     this.f = a(new b(ade1, 3, 79, 17));
/*  36 */     a(new a(ade1, 4, 17, 17));
/*     */     int i;
/*  38 */     for (i = 0; i < 3; i++) {
/*  39 */       for (int j = 0; j < 9; j++) {
/*  40 */         a(new aqx(☃, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
/*     */       }
/*     */     } 
/*  43 */     for (i = 0; i < 9; i++) {
/*  44 */       a(new aqx(☃, i, 8 + i * 18, 142));
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(aqb ☃) {
/*  53 */     super.a(☃);
/*  54 */     ☃.a(this, this.a);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b() {
/*  59 */     super.b();
/*     */     
/*  61 */     for (int ☃ = 0; ☃ < this.e.size(); ☃++) {
/*  62 */       aqb aqb = this.e.get(☃);
/*  63 */       if (this.g != this.a.c(0)) {
/*  64 */         aqb.a(this, 0, this.a.c(0));
/*     */       }
/*  66 */       if (this.h != this.a.c(1)) {
/*  67 */         aqb.a(this, 1, this.a.c(1));
/*     */       }
/*     */     } 
/*  70 */     this.g = this.a.c(0);
/*  71 */     this.h = this.a.c(1);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(aog ☃) {
/*  81 */     return this.a.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public ate b(aog ☃, int i) {
/*  86 */     ate ate = ate.a;
/*  87 */     aqx aqx1 = this.c.get(i);
/*  88 */     if (aqx1 != null && aqx1.e()) {
/*  89 */       ate ate1 = aqx1.d();
/*  90 */       ate = ate1.i();
/*     */       
/*  92 */       if ((i >= 0 && i <= 2) || i == 3 || i == 4) {
/*  93 */         if (!a(ate1, 5, 41, true)) {
/*  94 */           return ate.a;
/*     */         }
/*  96 */         aqx1.a(ate1, ate);
/*  97 */       } else if (this.f.a(ate1)) {
/*  98 */         if (!a(ate1, 3, 4, false)) {
/*  99 */           return ate.a;
/*     */         }
/* 101 */       } else if (c.c_(ate) && ate.C() == 1) {
/* 102 */         if (!a(ate1, 0, 3, false)) {
/* 103 */           return ate.a;
/*     */         }
/* 105 */       } else if (a.b_(ate)) {
/* 106 */         if (!a(ate1, 4, 5, false)) {
/* 107 */           return ate.a;
/*     */         }
/* 109 */       } else if (i >= 5 && i < 32) {
/* 110 */         if (!a(ate1, 32, 41, false)) {
/* 111 */           return ate.a;
/*     */         }
/* 113 */       } else if (i >= 32 && i < 41) {
/* 114 */         if (!a(ate1, 5, 32, false)) {
/* 115 */           return ate.a;
/*     */         }
/*     */       }
/* 118 */       else if (!a(ate1, 5, 41, false)) {
/* 119 */         return ate.a;
/*     */       } 
/*     */       
/* 122 */       if (ate1.a()) {
/* 123 */         aqx1.d(ate.a);
/*     */       } else {
/* 125 */         aqx1.f();
/*     */       } 
/* 127 */       if (ate1.C() == ate.C()) {
/* 128 */         return ate.a;
/*     */       }
/* 130 */       aqx1.a(☃, ate1);
/*     */     } 
/*     */     
/* 133 */     return ate;
/*     */   }
/*     */   
/*     */   static class c extends aqx {
/*     */     public c(ade ☃, int i, int j, int k) {
/* 138 */       super(☃, i, j, k);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a(ate ☃) {
/* 143 */       return c_(☃);
/*     */     }
/*     */ 
/*     */     
/*     */     public int a() {
/* 148 */       return 1;
/*     */     }
/*     */ 
/*     */     
/*     */     public ate a(aog ☃, ate ate1) {
/* 153 */       aut aut = auv.d(ate1);
/* 154 */       if (☃ instanceof tf) {
/* 155 */         p.k.a((tf)☃, aut);
/*     */       }
/* 157 */       super.a(☃, ate1);
/* 158 */       return ate1;
/*     */     }
/*     */     
/*     */     public static boolean c_(ate ☃) {
/* 162 */       ata ata = ☃.b();
/* 163 */       return (ata == atf.cn || ata == atf.co || ata == atf.cp || ata == atf.cq);
/*     */     }
/*     */   }
/*     */   
/*     */   static class b extends aqx {
/*     */     public b(ade ☃, int i, int j, int k) {
/* 169 */       super(☃, i, j, k);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a(ate ☃) {
/* 174 */       return auu.a(☃);
/*     */     }
/*     */ 
/*     */     
/*     */     public int a() {
/* 179 */       return 64;
/*     */     }
/*     */   }
/*     */   
/*     */   static class a extends aqx {
/*     */     public a(ade ☃, int i, int j, int k) {
/* 185 */       super(☃, i, j, k);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a(ate ☃) {
/* 190 */       return b_(☃);
/*     */     }
/*     */     
/*     */     public static boolean b_(ate ☃) {
/* 194 */       return (☃.b() == atf.cu);
/*     */     }
/*     */ 
/*     */     
/*     */     public int a() {
/* 199 */       return 64;
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\apy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */