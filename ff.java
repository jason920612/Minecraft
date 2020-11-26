/*     */ import com.google.common.base.MoreObjects;
/*     */ import javax.annotation.concurrent.Immutable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Immutable
/*     */ public class ff
/*     */   implements Comparable<ff>
/*     */ {
/*  11 */   public static final ff e = new ff(0, 0, 0);
/*     */   
/*     */   private final int a;
/*     */   private final int b;
/*     */   private final int c;
/*     */   
/*     */   public ff(int ☃, int i, int j) {
/*  18 */     this.a = ☃;
/*  19 */     this.b = i;
/*  20 */     this.c = j;
/*     */   }
/*     */   
/*     */   public ff(double ☃, double d1, double d2) {
/*  24 */     this(xq.c(☃), xq.c(d1), xq.c(d2));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object ☃) {
/*  29 */     if (this == ☃) {
/*  30 */       return true;
/*     */     }
/*  32 */     if (!(☃ instanceof ff)) {
/*  33 */       return false;
/*     */     }
/*     */     
/*  36 */     ff ff1 = (ff)☃;
/*     */     
/*  38 */     if (o() != ff1.o()) {
/*  39 */       return false;
/*     */     }
/*  41 */     if (p() != ff1.p()) {
/*  42 */       return false;
/*     */     }
/*  44 */     if (q() != ff1.q()) {
/*  45 */       return false;
/*     */     }
/*     */     
/*  48 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/*  53 */     return (p() + q() * 31) * 31 + o();
/*     */   }
/*     */ 
/*     */   
/*     */   public int l(ff ☃) {
/*  58 */     if (p() == ☃.p()) {
/*  59 */       if (q() == ☃.q()) {
/*  60 */         return o() - ☃.o();
/*     */       }
/*  62 */       return q() - ☃.q();
/*     */     } 
/*  64 */     return p() - ☃.p();
/*     */   }
/*     */   
/*     */   public int o() {
/*  68 */     return this.a;
/*     */   }
/*     */   
/*     */   public int p() {
/*  72 */     return this.b;
/*     */   }
/*     */   
/*     */   public int q() {
/*  76 */     return this.c;
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
/*     */   public ff d(ff ☃) {
/* 180 */     return new ff(p() * ☃.q() - q() * ☃.p(), q() * ☃.o() - o() * ☃.q(), o() * ☃.p() - p() * ☃.o());
/*     */   }
/*     */   
/*     */   public double h(int ☃, int i, int j) {
/* 184 */     double d1 = (o() - ☃);
/* 185 */     double d2 = (p() - i);
/* 186 */     double d3 = (q() - j);
/*     */     
/* 188 */     return Math.sqrt(d1 * d1 + d2 * d2 + d3 * d3);
/*     */   }
/*     */   
/*     */   public double m(ff ☃) {
/* 192 */     return h(☃.o(), ☃.p(), ☃.q());
/*     */   }
/*     */   
/*     */   public double f(double ☃, double d1, double d2) {
/* 196 */     double d3 = o() - ☃;
/* 197 */     double d4 = p() - d1;
/* 198 */     double d5 = q() - d2;
/* 199 */     return d3 * d3 + d4 * d4 + d5 * d5;
/*     */   }
/*     */   
/*     */   public double g(double ☃, double d1, double d2) {
/* 203 */     double d3 = o() + 0.5D - ☃;
/* 204 */     double d4 = p() + 0.5D - d1;
/* 205 */     double d5 = q() + 0.5D - d2;
/* 206 */     return d3 * d3 + d4 * d4 + d5 * d5;
/*     */   }
/*     */   
/*     */   public double n(ff ☃) {
/* 210 */     return f(☃.o(), ☃.p(), ☃.q());
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 215 */     return MoreObjects.toStringHelper(this)
/* 216 */       .add("x", o())
/* 217 */       .add("y", p())
/* 218 */       .add("z", q())
/* 219 */       .toString();
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\ff.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */