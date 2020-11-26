/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class aql
/*     */   extends apv
/*     */ {
/*     */   private final ade a;
/*     */   private final ako f;
/*     */   
/*     */   public aql(ade ☃, ade ade1, ako ako1, aog aog1) {
/*  15 */     this.a = ade1;
/*  16 */     this.f = ako1;
/*  17 */     int i = 3;
/*  18 */     ade1.b(aog1);
/*     */     
/*  20 */     int j = -18;
/*     */ 
/*     */     
/*  23 */     a(new aqx(this, ade1, 0, 8, 18, ako1)
/*     */         {
/*     */           public boolean a(ate ☃) {
/*  26 */             return (☃.b() == atf.aA && !e() && this.a.dU());
/*     */           }
/*     */         });
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  35 */     a(new aqx(this, ade1, 1, 8, 36, ako1)
/*     */         {
/*     */           public boolean a(ate ☃) {
/*  38 */             return this.a.g(☃);
/*     */           }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*     */           public int a() {
/*  48 */             return 1;
/*     */           }
/*     */         });
/*     */     
/*  52 */     if (ako1 instanceof akn && ((akn)ako1).dz()) {
/*  53 */       for (int m = 0; m < 3; m++) {
/*  54 */         for (int n = 0; n < ((akn)ako1).dH(); n++) {
/*  55 */           a(new aqx(ade1, 2 + n + m * ((akn)ako1).dH(), 80 + n * 18, 18 + m * 18));
/*     */         }
/*     */       } 
/*     */     }
/*     */     int k;
/*  60 */     for (k = 0; k < 3; k++) {
/*  61 */       for (int m = 0; m < 9; m++) {
/*  62 */         a(new aqx(☃, m + k * 9 + 9, 8 + m * 18, 102 + k * 18 + -18));
/*     */       }
/*     */     } 
/*  65 */     for (k = 0; k < 9; k++) {
/*  66 */       a(new aqx(☃, k, 8 + k * 18, 142));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(aog ☃) {
/*  72 */     return (this.a.a(☃) && this.f.aF() && this.f.g(☃) < 8.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public ate b(aog ☃, int i) {
/*  77 */     ate ate = ate.a;
/*  78 */     aqx aqx = this.c.get(i);
/*  79 */     if (aqx != null && aqx.e()) {
/*  80 */       ate ate1 = aqx.d();
/*  81 */       ate = ate1.i();
/*     */       
/*  83 */       if (i < this.a.T_()) {
/*  84 */         if (!a(ate1, this.a.T_(), this.c.size(), true)) {
/*  85 */           return ate.a;
/*     */         }
/*     */       }
/*  88 */       else if (a(1).a(ate1) && !a(1).e()) {
/*  89 */         if (!a(ate1, 1, 2, false)) {
/*  90 */           return ate.a;
/*     */         }
/*  92 */       } else if (a(0).a(ate1)) {
/*  93 */         if (!a(ate1, 0, 1, false)) {
/*  94 */           return ate.a;
/*     */         }
/*  96 */       } else if (this.a.T_() <= 2 || !a(ate1, 2, this.a.T_(), false)) {
/*  97 */         return ate.a;
/*     */       } 
/*     */       
/* 100 */       if (ate1.a()) {
/* 101 */         aqx.d(ate.a);
/*     */       } else {
/* 103 */         aqx.f();
/*     */       } 
/*     */     } 
/* 106 */     return ate;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(aog ☃) {
/* 111 */     super.b(☃);
/* 112 */     this.a.c(☃);
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\aql.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */