/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class cbe
/*     */ {
/*     */   private final cbc[] a;
/*  11 */   private cbc[] b = new cbc[0];
/*  12 */   private cbc[] c = new cbc[0];
/*     */   private cbc d;
/*     */   private int e;
/*     */   private int f;
/*     */   
/*     */   public cbe(cbc[] ☃) {
/*  18 */     this.a = ☃;
/*  19 */     this.f = ☃.length;
/*     */   }
/*     */   
/*     */   public void a() {
/*  23 */     this.e++;
/*     */   }
/*     */   
/*     */   public boolean b() {
/*  27 */     return (this.e >= this.f);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public cbc c() {
/*  32 */     if (this.f > 0) {
/*  33 */       return this.a[this.f - 1];
/*     */     }
/*  35 */     return null;
/*     */   }
/*     */   
/*     */   public cbc a(int ☃) {
/*  39 */     return this.a[☃];
/*     */   }
/*     */   
/*     */   public void a(int ☃, cbc cbc1) {
/*  43 */     this.a[☃] = cbc1;
/*     */   }
/*     */   
/*     */   public int d() {
/*  47 */     return this.f;
/*     */   }
/*     */   
/*     */   public void b(int ☃) {
/*  51 */     this.f = ☃;
/*     */   }
/*     */   
/*     */   public int e() {
/*  55 */     return this.e;
/*     */   }
/*     */   
/*     */   public void c(int ☃) {
/*  59 */     this.e = ☃;
/*     */   }
/*     */   
/*     */   public cee a(aer ☃, int i) {
/*  63 */     double d1 = (this.a[i]).a + (int)(☃.H + 1.0F) * 0.5D;
/*  64 */     double d2 = (this.a[i]).b;
/*  65 */     double d3 = (this.a[i]).c + (int)(☃.H + 1.0F) * 0.5D;
/*  66 */     return new cee(d1, d2, d3);
/*     */   }
/*     */   
/*     */   public cee a(aer ☃) {
/*  70 */     return a(☃, this.e);
/*     */   }
/*     */   
/*     */   public cee f() {
/*  74 */     cbc ☃ = this.a[this.e];
/*  75 */     return new cee(☃.a, ☃.b, ☃.c);
/*     */   }
/*     */   
/*     */   public boolean a(cbe ☃) {
/*  79 */     if (☃ == null) {
/*  80 */       return false;
/*     */     }
/*  82 */     if (☃.a.length != this.a.length) {
/*  83 */       return false;
/*     */     }
/*  85 */     for (int i = 0; i < this.a.length; i++) {
/*  86 */       if ((this.a[i]).a != (☃.a[i]).a || (this.a[i]).b != (☃.a[i]).b || (this.a[i]).c != (☃.a[i]).c) {
/*  87 */         return false;
/*     */       }
/*     */     } 
/*  90 */     return true;
/*     */   }
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
/*     */   @Nullable
/*     */   public cbc i() {
/* 125 */     return this.d;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\cbe.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */