/*     */ 
/*     */ public class caz
/*     */ {
/*   4 */   private cbc[] a = new cbc[128];
/*     */   
/*     */   private int b;
/*     */   
/*     */   public cbc a(cbc ☃) {
/*   9 */     if (☃.d >= 0) {
/*  10 */       throw new IllegalStateException("OW KNOWS!");
/*     */     }
/*     */     
/*  13 */     if (this.b == this.a.length) {
/*  14 */       cbc[] arrayOfCbc = new cbc[this.b << 1];
/*  15 */       System.arraycopy(this.a, 0, arrayOfCbc, 0, this.b);
/*  16 */       this.a = arrayOfCbc;
/*     */     } 
/*     */ 
/*     */     
/*  20 */     this.a[this.b] = ☃;
/*  21 */     ☃.d = this.b;
/*  22 */     a(this.b++);
/*     */     
/*  24 */     return ☃;
/*     */   }
/*     */   
/*     */   public void a() {
/*  28 */     this.b = 0;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public cbc c() {
/*  36 */     cbc ☃ = this.a[0];
/*  37 */     this.a[0] = this.a[--this.b];
/*  38 */     this.a[this.b] = null;
/*  39 */     if (this.b > 0) {
/*  40 */       b(0);
/*     */     }
/*  42 */     ☃.d = -1;
/*  43 */     return ☃;
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
/*     */   public void a(cbc ☃, float f) {
/*  62 */     float f1 = ☃.g;
/*  63 */     ☃.g = f;
/*  64 */     if (f < f1) {
/*  65 */       a(☃.d);
/*     */     } else {
/*  67 */       b(☃.d);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void a(int ☃) {
/*  76 */     cbc cbc1 = this.a[☃];
/*  77 */     float f = cbc1.g;
/*  78 */     while (☃ > 0) {
/*  79 */       int i = ☃ - 1 >> 1;
/*  80 */       cbc cbc2 = this.a[i];
/*  81 */       if (f < cbc2.g) {
/*  82 */         this.a[☃] = cbc2;
/*  83 */         cbc2.d = ☃;
/*  84 */         ☃ = i;
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/*  89 */     this.a[☃] = cbc1;
/*  90 */     cbc1.d = ☃;
/*     */   }
/*     */   
/*     */   private void b(int ☃) {
/*  94 */     cbc cbc1 = this.a[☃];
/*  95 */     float f = cbc1.g; while (true) {
/*     */       cbc cbc3;
/*     */       float f2;
/*  98 */       int i = 1 + (☃ << 1);
/*  99 */       int j = i + 1;
/*     */       
/* 101 */       if (i >= this.b) {
/*     */         break;
/*     */       }
/*     */ 
/*     */       
/* 106 */       cbc cbc2 = this.a[i];
/* 107 */       float f1 = cbc2.g;
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 112 */       if (j >= this.b) {
/*     */         
/* 114 */         cbc3 = null;
/* 115 */         f2 = Float.POSITIVE_INFINITY;
/*     */       } else {
/* 117 */         cbc3 = this.a[j];
/* 118 */         f2 = cbc3.g;
/*     */       } 
/*     */ 
/*     */ 
/*     */       
/* 123 */       if (f1 < f2) {
/* 124 */         if (f1 < f) {
/* 125 */           this.a[☃] = cbc2;
/* 126 */           cbc2.d = ☃;
/* 127 */           ☃ = i;
/*     */           continue;
/*     */         } 
/*     */         break;
/*     */       } 
/* 132 */       if (f2 < f) {
/* 133 */         this.a[☃] = cbc3;
/* 134 */         cbc3.d = ☃;
/* 135 */         ☃ = j;
/*     */         
/*     */         continue;
/*     */       } 
/*     */       
/*     */       break;
/*     */     } 
/* 142 */     this.a[☃] = cbc1;
/* 143 */     cbc1.d = ☃;
/*     */   }
/*     */   
/*     */   public boolean e() {
/* 147 */     return (this.b == 0);
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\caz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */