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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public enum a
/*     */ {
/*  54 */   a(2, 0.1F, 5, 0.6F),
/*  55 */   b(2, 0.1F, 6, 0.8F),
/*  56 */   c(1, 0.1F),
/*  57 */   d(1, 0.1F);
/*     */   
/*     */   private final int e;
/*     */   
/*     */   private final float f;
/*     */   private final int g;
/*     */   private final float h;
/*     */   private final boolean i;
/*     */   
/*     */   a(int ☃, float f1, int i, float f2) {
/*  67 */     this.e = ☃;
/*  68 */     this.f = f1;
/*  69 */     this.g = i;
/*  70 */     this.h = f2;
/*  71 */     this.i = (i != 0);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int a() {
/*  79 */     return this.e;
/*     */   }
/*     */   
/*     */   public float b() {
/*  83 */     return this.f;
/*     */   }
/*     */   
/*     */   public int c() {
/*  87 */     return this.g;
/*     */   }
/*     */   
/*     */   public float d() {
/*  91 */     return this.h;
/*     */   }
/*     */   
/*     */   public boolean e() {
/*  95 */     return this.i;
/*     */   }
/*     */   
/*     */   public static a a(ate ☃) {
/*  99 */     ata ata = ☃.b();
/* 100 */     return (ata instanceof ass) ? ass.a((ass)ata) : a;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\ass$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */