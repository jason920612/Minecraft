/*     */ 
/*     */ 
/*     */ public class awq
/*     */   extends awe
/*     */ {
/*     */   public final a a;
/*     */   
/*     */   public enum a
/*     */   {
/*  10 */     a("all", 1, 11),
/*  11 */     b("fire", 10, 8),
/*  12 */     c("fall", 5, 6),
/*  13 */     d("explosion", 5, 8),
/*  14 */     e("projectile", 3, 6);
/*     */     
/*     */     private final String f;
/*     */     private final int g;
/*     */     private final int h;
/*     */     
/*     */     a(String ☃, int i, int j) {
/*  21 */       this.f = ☃;
/*  22 */       this.g = i;
/*  23 */       this.h = j;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public int b() {
/*  31 */       return this.g;
/*     */     }
/*     */     
/*     */     public int c() {
/*  35 */       return this.h;
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public awq(awe.a ☃, a a1, aew... arrayOfAew) {
/*  42 */     super(☃, awf.b, arrayOfAew);
/*  43 */     this.a = a1;
/*     */     
/*  45 */     if (a1 == a.c) {
/*  46 */       this.b = awf.c;
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(int ☃) {
/*  52 */     return this.a.b() + (☃ - 1) * this.a.c();
/*     */   }
/*     */ 
/*     */   
/*     */   public int b(int ☃) {
/*  57 */     return a(☃) + this.a.c();
/*     */   }
/*     */ 
/*     */   
/*     */   public int a() {
/*  62 */     return 4;
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(int ☃, aea aea1) {
/*  67 */     if (aea1.h()) {
/*  68 */       return 0;
/*     */     }
/*     */     
/*  71 */     if (this.a == a.a) {
/*  72 */       return ☃;
/*     */     }
/*  74 */     if (this.a == a.b && aea1.p()) {
/*  75 */       return ☃ * 2;
/*     */     }
/*  77 */     if (this.a == a.c && aea1 == aea.k) {
/*  78 */       return ☃ * 3;
/*     */     }
/*  80 */     if (this.a == a.d && aea1.d()) {
/*  81 */       return ☃ * 2;
/*     */     }
/*  83 */     if (this.a == a.e && aea1.b()) {
/*  84 */       return ☃ * 2;
/*     */     }
/*  86 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(awe ☃) {
/*  91 */     if (☃ instanceof awq) {
/*  92 */       awq awq1 = (awq)☃;
/*     */       
/*  94 */       if (this.a == awq1.a) {
/*  95 */         return false;
/*     */       }
/*  97 */       if (this.a == a.c || awq1.a == a.c) {
/*  98 */         return true;
/*     */       }
/* 100 */       return false;
/*     */     } 
/* 102 */     return super.a(☃);
/*     */   }
/*     */   
/*     */   public static int a(afa ☃, int i) {
/* 106 */     int j = awg.a(awi.b, ☃);
/*     */     
/* 108 */     if (j > 0) {
/* 109 */       i -= xq.d(i * j * 0.15F);
/*     */     }
/*     */     
/* 112 */     return i;
/*     */   }
/*     */   
/*     */   public static double a(afa ☃, double d) {
/* 116 */     int i = awg.a(awi.d, ☃);
/*     */     
/* 118 */     if (i > 0) {
/* 119 */       d -= xq.c(d * (i * 0.15F));
/*     */     }
/*     */     
/* 122 */     return d;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\awq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */