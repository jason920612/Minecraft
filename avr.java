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
/*     */ public class avr
/*     */   extends avd
/*     */ {
/*     */   public avr(pc ☃) {
/*  16 */     super(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ade ☃, axy axy1) {
/*  21 */     if (!(☃ instanceof aqc)) {
/*  22 */       return false;
/*     */     }
/*     */     
/*  25 */     ate ate1 = ate.a;
/*  26 */     ate ate2 = ate.a;
/*     */     
/*  28 */     for (int i = 0; i < ☃.T_(); i++) {
/*  29 */       ate ate = ☃.a(i);
/*  30 */       if (!ate.a())
/*     */       {
/*     */ 
/*     */         
/*  34 */         if (ate.b() instanceof arh) {
/*  35 */           if (!ate2.a())
/*     */           {
/*  37 */             return false;
/*     */           }
/*  39 */           ate2 = ate;
/*  40 */         } else if (ate.b() == atf.eK) {
/*  41 */           if (!ate1.a())
/*     */           {
/*  43 */             return false;
/*     */           }
/*  45 */           if (ate.b("BlockEntityTag") != null)
/*     */           {
/*  47 */             return false;
/*     */           }
/*  49 */           ate1 = ate;
/*     */         } else {
/*     */           
/*  52 */           return false;
/*     */         } 
/*     */       }
/*     */     } 
/*  56 */     if (ate1.a() || ate2.a())
/*     */     {
/*  58 */       return false;
/*     */     }
/*     */     
/*  61 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public ate a(ade ☃) {
/*  66 */     ate ate1 = ate.a;
/*  67 */     ate ate2 = ate.a;
/*     */     
/*  69 */     for (int i = 0; i < ☃.T_(); i++) {
/*  70 */       ate ate = ☃.a(i);
/*  71 */       if (!ate.a())
/*     */       {
/*     */ 
/*     */         
/*  75 */         if (ate.b() instanceof arh) {
/*  76 */           ate1 = ate;
/*  77 */         } else if (ate.b() == atf.eK) {
/*  78 */           ate2 = ate.i();
/*     */         } 
/*     */       }
/*     */     } 
/*  82 */     if (ate2.a()) {
/*  83 */       return ate2;
/*     */     }
/*     */     
/*  86 */     gy gy1 = ate1.b("BlockEntityTag");
/*  87 */     gy gy2 = (gy1 == null) ? new gy() : gy1.f();
/*     */     
/*  89 */     gy2.b("Base", ((arh)ate1.b()).b().a());
/*     */     
/*  91 */     ate2.a("BlockEntityTag", gy2);
/*     */     
/*  93 */     return ate2;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public avm<?> a() {
/* 103 */     return avn.n;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\avr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */