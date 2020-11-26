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
/*     */ public class ajf
/*     */ {
/*     */   private final el a;
/*     */   private final el b;
/*     */   private final eq c;
/*     */   private int d;
/*     */   private boolean e;
/*     */   private int f;
/*     */   
/*     */   public ajf(el ☃, int i, int j, int k) {
/*  21 */     this(☃, a(i, j), k);
/*     */   }
/*     */   
/*     */   private static eq a(int ☃, int i) {
/*  25 */     if (☃ < 0)
/*  26 */       return eq.e; 
/*  27 */     if (☃ > 0)
/*  28 */       return eq.f; 
/*  29 */     if (i < 0) {
/*  30 */       return eq.c;
/*     */     }
/*  32 */     return eq.d;
/*     */   }
/*     */ 
/*     */   
/*     */   public ajf(el ☃, eq eq1, int i) {
/*  37 */     this.a = ☃.h();
/*  38 */     this.c = eq1;
/*  39 */     this.b = ☃.a(eq1, 2);
/*  40 */     this.d = i;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int b(int ☃, int i, int j) {
/*  48 */     return (int)this.a.f(☃, i, j);
/*     */   }
/*     */   
/*     */   public int a(el ☃) {
/*  52 */     return (int)☃.n(d());
/*     */   }
/*     */   
/*     */   public int b(el ☃) {
/*  56 */     return (int)this.b.n(☃);
/*     */   }
/*     */   
/*     */   public boolean c(el ☃) {
/*  60 */     int i = ☃.o() - this.a.o();
/*  61 */     int j = ☃.q() - this.a.p();
/*  62 */     return (i * this.c.g() + j * this.c.i() >= 0);
/*     */   }
/*     */   
/*     */   public void a() {
/*  66 */     this.f = 0;
/*     */   }
/*     */   
/*     */   public void b() {
/*  70 */     this.f++;
/*     */   }
/*     */   
/*     */   public int c() {
/*  74 */     return this.f;
/*     */   }
/*     */   
/*     */   public el d() {
/*  78 */     return this.a;
/*     */   }
/*     */   
/*     */   public el e() {
/*  82 */     return this.b;
/*     */   }
/*     */   
/*     */   public int f() {
/*  86 */     return this.c.g() * 2;
/*     */   }
/*     */   
/*     */   public int g() {
/*  90 */     return this.c.i() * 2;
/*     */   }
/*     */   
/*     */   public int h() {
/*  94 */     return this.d;
/*     */   }
/*     */   
/*     */   public void a(int ☃) {
/*  98 */     this.d = ☃;
/*     */   }
/*     */   
/*     */   public boolean i() {
/* 102 */     return this.e;
/*     */   }
/*     */   
/*     */   public void a(boolean ☃) {
/* 106 */     this.e = ☃;
/*     */   }
/*     */   
/*     */   public eq j() {
/* 110 */     return this.c;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\ajf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */