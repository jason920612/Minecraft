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
/*     */ public class avc
/*     */   extends avd
/*     */ {
/*     */   public avc(pc ☃) {
/*  15 */     super(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ade ☃, axy axy1) {
/*  20 */     if (!(☃ instanceof aqc)) {
/*  21 */       return false;
/*     */     }
/*     */     
/*  24 */     int i = 0;
/*  25 */     ate ate = ate.a;
/*     */     
/*  27 */     for (int j = 0; j < ☃.T_(); j++) {
/*  28 */       ate ate1 = ☃.a(j);
/*  29 */       if (!ate1.a())
/*     */       {
/*     */ 
/*     */         
/*  33 */         if (ate1.b() == atf.dz) {
/*  34 */           if (!ate.a()) {
/*  35 */             return false;
/*     */           }
/*  37 */           ate = ate1;
/*  38 */         } else if (ate1.b() == atf.dy) {
/*  39 */           i++;
/*     */         } else {
/*  41 */           return false;
/*     */         } 
/*     */       }
/*     */     } 
/*  45 */     return (!ate.a() && ate.m() && i > 0);
/*     */   }
/*     */ 
/*     */   
/*     */   public ate a(ade ☃) {
/*  50 */     int i = 0;
/*  51 */     ate ate1 = ate.a;
/*     */     
/*  53 */     for (int j = 0; j < ☃.T_(); j++) {
/*  54 */       ate ate = ☃.a(j);
/*  55 */       if (!ate.a())
/*     */       {
/*     */ 
/*     */         
/*  59 */         if (ate.b() == atf.dz) {
/*  60 */           if (!ate1.a()) {
/*  61 */             return ate.a;
/*     */           }
/*  63 */           ate1 = ate;
/*  64 */         } else if (ate.b() == atf.dy) {
/*  65 */           i++;
/*     */         } else {
/*  67 */           return ate.a;
/*     */         } 
/*     */       }
/*     */     } 
/*  71 */     if (ate1.a() || !ate1.m() || i < 1 || aus.e(ate1) >= 2) {
/*  72 */       return ate.a;
/*     */     }
/*     */     
/*  75 */     ate ate2 = new ate(atf.dz, i);
/*     */     
/*  77 */     gy gy = ate1.n().f();
/*     */     
/*  79 */     gy.b("generation", aus.e(ate1) + 1);
/*  80 */     ate2.c(gy);
/*     */     
/*  82 */     return ate2;
/*     */   }
/*     */ 
/*     */   
/*     */   public ez<ate> b(ade ☃) {
/*  87 */     ez<ate> ez = ez.a(☃.T_(), ate.a);
/*     */     
/*  89 */     for (int i = 0; i < ez.size(); i++) {
/*  90 */       ate ate = ☃.a(i);
/*  91 */       if (ate.b().p()) {
/*  92 */         ez.set(i, new ate(ate.b().o()));
/*  93 */       } else if (ate.b() instanceof aus) {
/*  94 */         ate ate1 = ate.i();
/*  95 */         ate1.e(1);
/*  96 */         ez.set(i, ate1);
/*     */         
/*     */         break;
/*     */       } 
/*     */     } 
/* 101 */     return ez;
/*     */   }
/*     */ 
/*     */   
/*     */   public avm<?> a() {
/* 106 */     return avn.d;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\avc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */