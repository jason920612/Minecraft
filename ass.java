/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ass
/*     */   extends asv
/*     */ {
/*     */   private final boolean a;
/*     */   private final a b;
/*     */   
/*     */   public ass(a ☃, boolean bool, ata.a a1) {
/*  15 */     super(0, 0.0F, false, a1);
/*  16 */     this.b = ☃;
/*  17 */     this.a = bool;
/*     */   }
/*     */ 
/*     */   
/*     */   public int e(ate ☃) {
/*  22 */     a a1 = a.a(☃);
/*     */     
/*  24 */     if (this.a && a1.e()) {
/*  25 */       return a1.c();
/*     */     }
/*  27 */     return a1.a();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public float f(ate ☃) {
/*  33 */     if (this.a && this.b.e()) {
/*  34 */       return this.b.d();
/*     */     }
/*  36 */     return this.b.b();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(ate ☃, axy axy1, aog aog1) {
/*  42 */     a a1 = a.a(☃);
/*     */     
/*  44 */     if (a1 == a.d) {
/*  45 */       aog1.c(new aek(aem.s, 1200, 3));
/*  46 */       aog1.c(new aek(aem.q, 300, 2));
/*  47 */       aog1.c(new aek(aem.i, 300, 1));
/*     */     } 
/*     */     
/*  50 */     super.a(☃, axy1, aog1);
/*     */   }
/*     */   
/*     */   public enum a {
/*  54 */     a(2, 0.1F, 5, 0.6F),
/*  55 */     b(2, 0.1F, 6, 0.8F),
/*  56 */     c(1, 0.1F),
/*  57 */     d(1, 0.1F);
/*     */     
/*     */     private final int e;
/*     */     
/*     */     private final float f;
/*     */     private final int g;
/*     */     private final float h;
/*     */     private final boolean i;
/*     */     
/*     */     a(int ☃, float f1, int i, float f2) {
/*  67 */       this.e = ☃;
/*  68 */       this.f = f1;
/*  69 */       this.g = i;
/*  70 */       this.h = f2;
/*  71 */       this.i = (i != 0);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public int a() {
/*  79 */       return this.e;
/*     */     }
/*     */     
/*     */     public float b() {
/*  83 */       return this.f;
/*     */     }
/*     */     
/*     */     public int c() {
/*  87 */       return this.g;
/*     */     }
/*     */     
/*     */     public float d() {
/*  91 */       return this.h;
/*     */     }
/*     */     
/*     */     public boolean e() {
/*  95 */       return this.i;
/*     */     }
/*     */     
/*     */     public static a a(ate ☃) {
/*  99 */       ata ata = ☃.b();
/* 100 */       return (ata instanceof ass) ? ass.a((ass)ata) : a;
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\ass.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */