/*     */ import java.util.EnumSet;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class cee
/*     */ {
/*  10 */   public static final cee a = new cee(0.0D, 0.0D, 0.0D);
/*     */   public final double b;
/*     */   public final double c;
/*     */   public final double d;
/*     */   
/*     */   public cee(double ☃, double d1, double d2) {
/*  16 */     this.b = ☃;
/*  17 */     this.c = d1;
/*  18 */     this.d = d2;
/*     */   }
/*     */   
/*     */   public cee(ff ☃) {
/*  22 */     this(☃.o(), ☃.p(), ☃.q());
/*     */   }
/*     */   
/*     */   public cee a(cee ☃) {
/*  26 */     return new cee(☃.b - this.b, ☃.c - this.c, ☃.d - this.d);
/*     */   }
/*     */   
/*     */   public cee a() {
/*  30 */     double ☃ = xq.a(this.b * this.b + this.c * this.c + this.d * this.d);
/*  31 */     if (☃ < 1.0E-4D) {
/*  32 */       return a;
/*     */     }
/*  34 */     return new cee(this.b / ☃, this.c / ☃, this.d / ☃);
/*     */   }
/*     */   
/*     */   public double b(cee ☃) {
/*  38 */     return this.b * ☃.b + this.c * ☃.c + this.d * ☃.d;
/*     */   }
/*     */   
/*     */   public cee c(cee ☃) {
/*  42 */     return new cee(this.c * ☃.d - this.d * ☃.c, this.d * ☃.b - this.b * ☃.d, this.b * ☃.c - this.c * ☃.b);
/*     */   }
/*     */   
/*     */   public cee d(cee ☃) {
/*  46 */     return a(☃.b, ☃.c, ☃.d);
/*     */   }
/*     */   
/*     */   public cee a(double ☃, double d1, double d2) {
/*  50 */     return b(-☃, -d1, -d2);
/*     */   }
/*     */   
/*     */   public cee e(cee ☃) {
/*  54 */     return b(☃.b, ☃.c, ☃.d);
/*     */   }
/*     */   
/*     */   public cee b(double ☃, double d1, double d2) {
/*  58 */     return new cee(this.b + ☃, this.c + d1, this.d + d2);
/*     */   }
/*     */   
/*     */   public double f(cee ☃) {
/*  62 */     double d1 = ☃.b - this.b;
/*  63 */     double d2 = ☃.c - this.c;
/*  64 */     double d3 = ☃.d - this.d;
/*  65 */     return xq.a(d1 * d1 + d2 * d2 + d3 * d3);
/*     */   }
/*     */   
/*     */   public double g(cee ☃) {
/*  69 */     double d1 = ☃.b - this.b;
/*  70 */     double d2 = ☃.c - this.c;
/*  71 */     double d3 = ☃.d - this.d;
/*  72 */     return d1 * d1 + d2 * d2 + d3 * d3;
/*     */   }
/*     */   
/*     */   public double c(double ☃, double d1, double d2) {
/*  76 */     double d3 = ☃ - this.b;
/*  77 */     double d4 = d1 - this.c;
/*  78 */     double d5 = d2 - this.d;
/*  79 */     return d3 * d3 + d4 * d4 + d5 * d5;
/*     */   }
/*     */   
/*     */   public cee a(double ☃) {
/*  83 */     return new cee(this.b * ☃, this.c * ☃, this.d * ☃);
/*     */   }
/*     */   
/*     */   public double b() {
/*  87 */     return xq.a(this.b * this.b + this.c * this.c + this.d * this.d);
/*     */   }
/*     */   
/*     */   public double c() {
/*  91 */     return this.b * this.b + this.c * this.c + this.d * this.d;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object ☃) {
/*  96 */     if (this == ☃) {
/*  97 */       return true;
/*     */     }
/*  99 */     if (!(☃ instanceof cee)) {
/* 100 */       return false;
/*     */     }
/*     */     
/* 103 */     cee cee1 = (cee)☃;
/*     */     
/* 105 */     if (Double.compare(cee1.b, this.b) != 0) {
/* 106 */       return false;
/*     */     }
/* 108 */     if (Double.compare(cee1.c, this.c) != 0) {
/* 109 */       return false;
/*     */     }
/* 111 */     return (Double.compare(cee1.d, this.d) == 0);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 118 */     long l = Double.doubleToLongBits(this.b);
/* 119 */     int ☃ = (int)(l ^ l >>> 32L);
/* 120 */     l = Double.doubleToLongBits(this.c);
/* 121 */     ☃ = 31 * ☃ + (int)(l ^ l >>> 32L);
/* 122 */     l = Double.doubleToLongBits(this.d);
/* 123 */     ☃ = 31 * ☃ + (int)(l ^ l >>> 32L);
/* 124 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 129 */     return "(" + this.b + ", " + this.c + ", " + this.d + ")";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public cee a(float ☃) {
/* 137 */     float f1 = xq.b(☃);
/* 138 */     float f2 = xq.a(☃);
/*     */     
/* 140 */     double d1 = this.b;
/* 141 */     double d2 = this.c * f1 + this.d * f2;
/* 142 */     double d3 = this.d * f1 - this.c * f2;
/*     */     
/* 144 */     return new cee(d1, d2, d3);
/*     */   }
/*     */   
/*     */   public cee b(float ☃) {
/* 148 */     float f1 = xq.b(☃);
/* 149 */     float f2 = xq.a(☃);
/*     */     
/* 151 */     double d1 = this.b * f1 + this.d * f2;
/* 152 */     double d2 = this.c;
/* 153 */     double d3 = this.d * f1 - this.b * f2;
/*     */     
/* 155 */     return new cee(d1, d2, d3);
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
/*     */   public cee a(EnumSet<eq.a> ☃) {
/* 184 */     double d1 = ☃.contains(eq.a.a) ? xq.c(this.b) : this.b;
/* 185 */     double d2 = ☃.contains(eq.a.b) ? xq.c(this.c) : this.c;
/* 186 */     double d3 = ☃.contains(eq.a.c) ? xq.c(this.d) : this.d;
/* 187 */     return new cee(d1, d2, d3);
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\cee.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */