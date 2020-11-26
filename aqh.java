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
/*     */ public class aqh
/*     */   extends aqr
/*     */ {
/*     */   private final ade a;
/*     */   private final axy f;
/*     */   private int g;
/*     */   private int h;
/*     */   private int i;
/*     */   private int j;
/*     */   
/*     */   public aqh(aof ☃, ade ade1) {
/*  32 */     this.a = ade1;
/*  33 */     this.f = ☃.e.m;
/*     */     
/*  35 */     a(new aqx(ade1, 0, 56, 17));
/*  36 */     a(new aqg(ade1, 1, 56, 53));
/*  37 */     a(new aqi(☃.e, ade1, 2, 116, 35));
/*     */     int i;
/*  39 */     for (i = 0; i < 3; i++) {
/*  40 */       for (int j = 0; j < 9; j++) {
/*  41 */         a(new aqx(☃, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
/*     */       }
/*     */     } 
/*  44 */     for (i = 0; i < 9; i++) {
/*  45 */       a(new aqx(☃, i, 8 + i * 18, 142));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(aqb ☃) {
/*  51 */     super.a(☃);
/*  52 */     ☃.a(this, this.a);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(aoi ☃) {
/*  57 */     if (this.a instanceof aqy) {
/*  58 */       ((aqy)this.a).a(☃);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void d() {
/*  64 */     this.a.m();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(avk ☃) {
/*  69 */     return ☃.a(this.a, this.f);
/*     */   }
/*     */ 
/*     */   
/*     */   public int e() {
/*  74 */     return 2;
/*     */   }
/*     */ 
/*     */   
/*     */   public int f() {
/*  79 */     return 1;
/*     */   }
/*     */ 
/*     */   
/*     */   public int g() {
/*  84 */     return 1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b() {
/*  94 */     super.b();
/*     */     
/*  96 */     for (aqb ☃ : this.e) {
/*  97 */       if (this.g != this.a.c(2)) {
/*  98 */         ☃.a(this, 2, this.a.c(2));
/*     */       }
/* 100 */       if (this.i != this.a.c(0)) {
/* 101 */         ☃.a(this, 0, this.a.c(0));
/*     */       }
/* 103 */       if (this.j != this.a.c(1)) {
/* 104 */         ☃.a(this, 1, this.a.c(1));
/*     */       }
/* 106 */       if (this.h != this.a.c(3)) {
/* 107 */         ☃.a(this, 3, this.a.c(3));
/*     */       }
/*     */     } 
/*     */     
/* 111 */     this.g = this.a.c(2);
/* 112 */     this.i = this.a.c(0);
/* 113 */     this.j = this.a.c(1);
/* 114 */     this.h = this.a.c(3);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(aog ☃) {
/* 124 */     return this.a.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public ate b(aog ☃, int i) {
/* 129 */     ate ate = ate.a;
/* 130 */     aqx aqx = this.c.get(i);
/* 131 */     if (aqx != null && aqx.e()) {
/* 132 */       ate ate1 = aqx.d();
/* 133 */       ate = ate1.i();
/*     */       
/* 135 */       if (i == 2) {
/* 136 */         if (!a(ate1, 3, 39, true)) {
/* 137 */           return ate.a;
/*     */         }
/* 139 */         aqx.a(ate1, ate);
/* 140 */       } else if (i == 1 || i == 0) {
/* 141 */         if (!a(ate1, 3, 39, false)) {
/* 142 */           return ate.a;
/*     */         }
/* 144 */       } else if (a(ate1)) {
/* 145 */         if (!a(ate1, 0, 1, false)) {
/* 146 */           return ate.a;
/*     */         }
/* 148 */       } else if (bju.a(ate1)) {
/* 149 */         if (!a(ate1, 1, 2, false)) {
/* 150 */           return ate.a;
/*     */         }
/* 152 */       } else if (i >= 3 && i < 30) {
/* 153 */         if (!a(ate1, 30, 39, false)) {
/* 154 */           return ate.a;
/*     */         }
/* 156 */       } else if (i >= 30 && i < 39 && 
/* 157 */         !a(ate1, 3, 30, false)) {
/* 158 */         return ate.a;
/*     */       } 
/*     */       
/* 161 */       if (ate1.a()) {
/* 162 */         aqx.d(ate.a);
/*     */       } else {
/* 164 */         aqx.f();
/*     */       } 
/* 166 */       if (ate1.C() == ate.C()) {
/* 167 */         return ate.a;
/*     */       }
/* 169 */       aqx.a(☃, ate1);
/*     */     } 
/*     */     
/* 172 */     return ate;
/*     */   }
/*     */   
/*     */   private boolean a(ate ☃) {
/* 176 */     for (avk avk : this.f.E().b()) {
/* 177 */       if (avk instanceof avt && ((avh)avk.e().get(0)).a(☃)) {
/* 178 */         return true;
/*     */       }
/*     */     } 
/* 181 */     return false;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\aqh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */