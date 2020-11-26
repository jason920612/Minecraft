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
/*     */ public class apx
/*     */   extends apv
/*     */ {
/*     */   private final ade a;
/*     */   private final a f;
/*     */   
/*     */   public apx(ade ☃, ade ade1) {
/*  20 */     this.a = ade1;
/*     */     
/*  22 */     this.f = new a(this, ade1, 0, 136, 110);
/*  23 */     a(this.f);
/*     */     
/*  25 */     int i = 36;
/*  26 */     int j = 137;
/*     */     int k;
/*  28 */     for (k = 0; k < 3; k++) {
/*  29 */       for (int m = 0; m < 9; m++) {
/*  30 */         a(new aqx(☃, m + k * 9 + 9, 36 + m * 18, 137 + k * 18));
/*     */       }
/*     */     } 
/*  33 */     for (k = 0; k < 9; k++) {
/*  34 */       a(new aqx(☃, k, 36 + k * 18, 195));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(aqb ☃) {
/*  40 */     super.a(☃);
/*  41 */     ☃.a(this, this.a);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ade d() {
/*  50 */     return this.a;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(aog ☃) {
/*  55 */     super.b(☃);
/*  56 */     if (☃.m.B) {
/*     */       return;
/*     */     }
/*     */     
/*  60 */     ate ate = this.f.a(this.f.a());
/*  61 */     if (!ate.a()) {
/*  62 */       ☃.a(ate, false);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(aog ☃) {
/*  68 */     return this.a.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public ate b(aog ☃, int i) {
/*  73 */     ate ate = ate.a;
/*  74 */     aqx aqx = this.c.get(i);
/*  75 */     if (aqx != null && aqx.e()) {
/*  76 */       ate ate1 = aqx.d();
/*  77 */       ate = ate1.i();
/*     */       
/*  79 */       if (i == 0) {
/*  80 */         if (!a(ate1, 1, 37, true)) {
/*  81 */           return ate.a;
/*     */         }
/*  83 */         aqx.a(ate1, ate);
/*  84 */       } else if (!this.f.e() && this.f.a(ate1) && ate1.C() == 1) {
/*  85 */         if (!a(ate1, 0, 1, false)) {
/*  86 */           return ate.a;
/*     */         }
/*  88 */       } else if (i >= 1 && i < 28) {
/*  89 */         if (!a(ate1, 28, 37, false)) {
/*  90 */           return ate.a;
/*     */         }
/*  92 */       } else if (i >= 28 && i < 37) {
/*  93 */         if (!a(ate1, 1, 28, false)) {
/*  94 */           return ate.a;
/*     */         }
/*     */       }
/*  97 */       else if (!a(ate1, 1, 37, false)) {
/*  98 */         return ate.a;
/*     */       } 
/*     */       
/* 101 */       if (ate1.a()) {
/* 102 */         aqx.d(ate.a);
/*     */       } else {
/* 104 */         aqx.f();
/*     */       } 
/* 106 */       if (ate1.C() == ate.C()) {
/* 107 */         return ate.a;
/*     */       }
/* 109 */       aqx.a(☃, ate1);
/*     */     } 
/*     */     
/* 112 */     return ate;
/*     */   }
/*     */   
/*     */   class a extends aqx {
/*     */     public a(apx this$0, ade ☃, int i, int j, int k) {
/* 117 */       super(☃, i, j, k);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a(ate ☃) {
/* 122 */       ata ata = ☃.b();
/* 123 */       return (ata == atf.dA || ata == atf.m || ata == atf.o || ata == atf.n);
/*     */     }
/*     */ 
/*     */     
/*     */     public int a() {
/* 128 */       return 1;
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\apx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */