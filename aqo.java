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
/*     */ public class aqo
/*     */   extends apv
/*     */ {
/*     */   private final axd a;
/*     */   private final aqn f;
/*     */   private final axy g;
/*     */   
/*     */   public aqo(aof ☃, axd axd1, axy axy1) {
/*  31 */     this.a = axd1;
/*  32 */     this.g = axy1;
/*     */     
/*  34 */     this.f = new aqn(☃.e, axd1);
/*  35 */     a(new aqx(this.f, 0, 36, 53));
/*  36 */     a(new aqx(this.f, 1, 62, 53));
/*  37 */     a(new aqp(☃.e, axd1, this.f, 2, 120, 53));
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
/*     */   public aqn d() {
/*  50 */     return this.f;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ade ☃) {
/*  55 */     this.f.i();
/*  56 */     super.a(☃);
/*     */   }
/*     */   
/*     */   public void d(int ☃) {
/*  60 */     this.f.d(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(aog ☃) {
/*  65 */     return (this.a.M_() == ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public ate b(aog ☃, int i) {
/*  70 */     ate ate = ate.a;
/*  71 */     aqx aqx = this.c.get(i);
/*  72 */     if (aqx != null && aqx.e()) {
/*  73 */       ate ate1 = aqx.d();
/*  74 */       ate = ate1.i();
/*     */       
/*  76 */       if (i == 2) {
/*  77 */         if (!a(ate1, 3, 39, true)) {
/*  78 */           return ate.a;
/*     */         }
/*  80 */         aqx.a(ate1, ate);
/*  81 */       } else if (i == 0 || i == 1) {
/*  82 */         if (!a(ate1, 3, 39, false)) {
/*  83 */           return ate.a;
/*     */         }
/*  85 */       } else if (i >= 3 && i < 30) {
/*  86 */         if (!a(ate1, 30, 39, false)) {
/*  87 */           return ate.a;
/*     */         }
/*  89 */       } else if (i >= 30 && i < 39 && 
/*  90 */         !a(ate1, 3, 30, false)) {
/*  91 */         return ate.a;
/*     */       } 
/*     */       
/*  94 */       if (ate1.a()) {
/*  95 */         aqx.d(ate.a);
/*     */       } else {
/*  97 */         aqx.f();
/*     */       } 
/*  99 */       if (ate1.C() == ate.C()) {
/* 100 */         return ate.a;
/*     */       }
/* 102 */       aqx.a(☃, ate1);
/*     */     } 
/*     */     
/* 105 */     return ate;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(aog ☃) {
/* 110 */     super.b(☃);
/* 111 */     this.a.a_(null);
/*     */     
/* 113 */     super.b(☃);
/* 114 */     if (this.g.B) {
/*     */       return;
/*     */     }
/*     */     
/* 118 */     ate ate = this.f.b(0);
/* 119 */     if (!ate.a()) {
/* 120 */       ☃.a(ate, false);
/*     */     }
/* 122 */     ate = this.f.b(1);
/* 123 */     if (!ate.a())
/* 124 */       ☃.a(ate, false); 
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\aqo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */