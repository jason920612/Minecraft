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
/*     */ public class sx
/*     */   extends tg
/*     */ {
/*     */   private boolean c;
/*     */   private boolean d;
/*     */   private int e;
/*     */   private int f;
/*     */   
/*     */   public sx(axy ☃) {
/*  24 */     super(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a() {
/*  29 */     super.a();
/*  30 */     this.f++;
/*     */     
/*  32 */     long ☃ = this.a.V();
/*  33 */     long l1 = ☃ / 24000L + 1L;
/*     */     
/*  35 */     if (!this.c && this.f > 20) {
/*  36 */       this.c = true;
/*  37 */       this.b.a.a(new ke(5, 0.0F));
/*     */     } 
/*     */     
/*  40 */     this.d = (☃ > 120500L);
/*  41 */     if (this.d) {
/*  42 */       this.e++;
/*     */     }
/*     */     
/*  45 */     if (☃ % 24000L == 500L) {
/*  46 */       if (l1 <= 6L) {
/*  47 */         if (l1 == 6L) {
/*  48 */           this.b.a.a(new ke(5, 104.0F));
/*     */         } else {
/*  50 */           this.b.a(new ir("demo.day." + l1, new Object[0]));
/*     */         } 
/*     */       }
/*  53 */     } else if (l1 == 1L) {
/*  54 */       if (☃ == 100L) {
/*  55 */         this.b.a.a(new ke(5, 101.0F));
/*  56 */       } else if (☃ == 175L) {
/*  57 */         this.b.a.a(new ke(5, 102.0F));
/*  58 */       } else if (☃ == 250L) {
/*  59 */         this.b.a.a(new ke(5, 103.0F));
/*     */       } 
/*  61 */     } else if (l1 == 5L && 
/*  62 */       ☃ % 24000L == 22000L) {
/*  63 */       this.b.a(new ir("demo.day.warning", new Object[0]));
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private void f() {
/*  69 */     if (this.e > 100) {
/*  70 */       this.b.a(new ir("demo.reminder", new Object[0]));
/*  71 */       this.e = 0;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(el ☃, eq eq1) {
/*  77 */     if (this.d) {
/*  78 */       f();
/*     */       return;
/*     */     } 
/*  81 */     super.a(☃, eq1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(el ☃) {
/*  86 */     if (this.d) {
/*     */       return;
/*     */     }
/*  89 */     super.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(el ☃) {
/*  94 */     if (this.d) {
/*  95 */       return false;
/*     */     }
/*  97 */     return super.b(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public adm a(aog ☃, axy axy1, ate ate1, adk adk1) {
/* 102 */     if (this.d) {
/* 103 */       f();
/* 104 */       return adm.b;
/*     */     } 
/* 106 */     return super.a(☃, axy1, ate1, adk1);
/*     */   }
/*     */ 
/*     */   
/*     */   public adm a(aog ☃, axy axy1, ate ate1, adk adk1, el el1, eq eq1, float f1, float f2, float f3) {
/* 111 */     if (this.d) {
/* 112 */       f();
/* 113 */       return adm.b;
/*     */     } 
/* 115 */     return super.a(☃, axy1, ate1, adk1, el1, eq1, f1, f2, f3);
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\sx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */