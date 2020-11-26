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
/*     */ public class avb
/*     */   extends avd
/*     */ {
/*     */   public avb(pc ☃) {
/*  16 */     super(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ade ☃, axy axy1) {
/*  21 */     if (!(☃ instanceof aqc)) {
/*  22 */       return false;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*  27 */     asc asc = null;
/*  28 */     ate ate1 = null;
/*  29 */     ate ate2 = null;
/*     */     
/*  31 */     for (int i = 0; i < ☃.T_(); i++) {
/*  32 */       ate ate = ☃.a(i);
/*  33 */       ata ata = ate.b();
/*  34 */       if (ata instanceof arh) {
/*     */ 
/*     */ 
/*     */         
/*  38 */         arh arh = (arh)ata;
/*     */         
/*  40 */         if (asc == null) {
/*  41 */           asc = arh.b();
/*  42 */         } else if (asc != arh.b()) {
/*  43 */           return false;
/*     */         } 
/*     */         
/*  46 */         boolean bool = (bje.a(ate) > 0);
/*     */         
/*  48 */         if (bool) {
/*  49 */           if (ate1 == null) {
/*  50 */             ate1 = ate;
/*     */           } else {
/*  52 */             return false;
/*     */           }
/*     */         
/*  55 */         } else if (ate2 == null) {
/*  56 */           ate2 = ate;
/*     */         } else {
/*  58 */           return false;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/*  63 */     return (ate1 != null && ate2 != null);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public ate a(ade ☃) {
/*  69 */     for (int i = 0; i < ☃.T_(); i++) {
/*  70 */       ate ate = ☃.a(i);
/*  71 */       if (!ate.a())
/*     */       {
/*     */         
/*  74 */         if (bje.a(ate) > 0) {
/*  75 */           ate ate1 = ate.i();
/*  76 */           ate1.e(1);
/*  77 */           return ate1;
/*     */         } 
/*     */       }
/*     */     } 
/*  81 */     return ate.a;
/*     */   }
/*     */ 
/*     */   
/*     */   public ez<ate> b(ade ☃) {
/*  86 */     ez<ate> ez = ez.a(☃.T_(), ate.a);
/*     */     
/*  88 */     for (int i = 0; i < ez.size(); i++) {
/*  89 */       ate ate = ☃.a(i);
/*  90 */       if (!ate.a()) {
/*  91 */         if (ate.b().p()) {
/*  92 */           ez.set(i, new ate(ate.b().o()));
/*  93 */         } else if (ate.m() && 
/*  94 */           bje.a(ate) > 0) {
/*  95 */           ate ate1 = ate.i();
/*  96 */           ate1.e(1);
/*  97 */           ez.set(i, ate1);
/*     */         } 
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/* 103 */     return ez;
/*     */   }
/*     */ 
/*     */   
/*     */   public avm<?> a() {
/* 108 */     return avn.l;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\avb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */