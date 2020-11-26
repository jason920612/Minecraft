/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.math.DoubleMath;
/*     */ import it.unimi.dsi.fastutil.doubles.DoubleList;
/*     */ import java.util.List;
/*     */ import javax.annotation.Nullable;
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
/*     */ public abstract class cew
/*     */ {
/*     */   protected final cem a;
/*     */   
/*     */   cew(cem ☃) {
/*  21 */     this.a = ☃;
/*     */   }
/*     */   
/*     */   public double b(eq.a ☃) {
/*  25 */     int i = this.a.a(☃);
/*  26 */     if (i >= this.a.c(☃)) {
/*  27 */       return Double.POSITIVE_INFINITY;
/*     */     }
/*  29 */     return a(☃, i);
/*     */   }
/*     */ 
/*     */   
/*     */   public double c(eq.a ☃) {
/*  34 */     int i = this.a.b(☃);
/*  35 */     if (i <= 0) {
/*  36 */       return Double.NEGATIVE_INFINITY;
/*     */     }
/*  38 */     return a(☃, i);
/*     */   }
/*     */ 
/*     */   
/*     */   public cea a() {
/*  43 */     if (b()) {
/*  44 */       throw new UnsupportedOperationException("No bounds for empty shape.");
/*     */     }
/*  46 */     return new cea(b(eq.a.a), b(eq.a.b), b(eq.a.c), c(eq.a.a), c(eq.a.b), c(eq.a.c));
/*     */   }
/*     */   
/*     */   protected double a(eq.a ☃, int i) {
/*  50 */     return a(☃).getDouble(i);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean b() {
/*  56 */     return this.a.a();
/*     */   }
/*     */   
/*     */   public cew a(double ☃, double d1, double d2) {
/*  60 */     if (b()) {
/*  61 */       return cet.a();
/*     */     }
/*  63 */     return new ceg(this.a, (DoubleList)new ces(
/*     */           
/*  65 */           a(eq.a.a), ☃), (DoubleList)new ces(
/*  66 */           a(eq.a.b), d1), (DoubleList)new ces(
/*  67 */           a(eq.a.c), d2));
/*     */   }
/*     */ 
/*     */   
/*     */   public cew c() {
/*  72 */     cew[] ☃ = { cet.a() };
/*  73 */     b((d1, d2, d3, d4, d5, d6) -> ☃[0] = cet.b(☃[0], cet.a(d1, d2, d3, d4, d5, d6), cei.OR));
/*     */ 
/*     */     
/*  76 */     return ☃[0];
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(cet.a ☃) {
/*  84 */     this.a.b((i, j, k, m, n, i1) -> ☃.consume(a(eq.a.a, i), a(eq.a.b, j), a(eq.a.c, k), a(eq.a.a, m), a(eq.a.b, n), a(eq.a.c, i1)), true);
/*     */   }
/*     */   
/*     */   public List<cea> d() {
/*  88 */     List<cea> ☃ = Lists.newArrayList();
/*  89 */     b((d1, d2, d3, d4, d5, d6) -> ☃.add(new cea(d1, d2, d3, d4, d5, d6)));
/*  90 */     return ☃;
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
/*     */   protected int a(eq.a ☃, double d) {
/* 121 */     return xq.a(0, this.a.c(☃) + 1, i -> (i < 0) ? false : ((i > this.a.c(☃)) ? true : ((d < a(☃, i))))) - 1;
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
/*     */   protected boolean b(double ☃, double d1, double d2) {
/* 136 */     return this.a.c(a(eq.a.a, ☃), a(eq.a.b, d1), a(eq.a.c, d2));
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public ceb a(cee ☃, cee cee1, el el1) {
/* 141 */     if (b()) {
/* 142 */       return null;
/*     */     }
/*     */     
/* 145 */     cee cee2 = cee1.d(☃);
/* 146 */     if (cee2.c() < 1.0E-7D) {
/* 147 */       return null;
/*     */     }
/*     */     
/* 150 */     cee cee3 = ☃.e(cee2.a(0.001D));
/* 151 */     cee cee4 = ☃.e(cee2.a(0.001D)).a(el1.o(), el1.p(), el1.q());
/*     */ 
/*     */     
/* 154 */     if (b(cee4.b, cee4.c, cee4.d)) {
/* 155 */       return new ceb(cee3, eq.a(cee2.b, cee2.c, cee2.d), el1);
/*     */     }
/*     */ 
/*     */     
/* 159 */     return cea.a(d(), ☃, cee1, el1);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public cew a(eq ☃) {
/* 166 */     if (b() || this == cet.b()) {
/* 167 */       return this;
/*     */     }
/* 169 */     eq.a a = ☃.k();
/* 170 */     eq.b b = ☃.c();
/* 171 */     DoubleList doubleList = a(a);
/* 172 */     if (doubleList.size() == 2 && DoubleMath.fuzzyEquals(doubleList.getDouble(0), 0.0D, 1.0E-7D) && DoubleMath.fuzzyEquals(doubleList.getDouble(1), 1.0D, 1.0E-7D)) {
/* 173 */       return this;
/*     */     }
/* 175 */     int i = a(a, (b == eq.b.a) ? 0.9999999D : 1.0E-7D);
/* 176 */     return new ceu(this, a, i);
/*     */   }
/*     */   
/*     */   public double a(eq.a ☃, cea cea1, double d) {
/* 180 */     return a(ej.a(☃, eq.a.a), cea1, d);
/*     */   }
/*     */   
/*     */   protected double a(ej ☃, cea cea1, double d) {
/* 184 */     if (b()) {
/* 185 */       return d;
/*     */     }
/* 187 */     if (Math.abs(d) < 1.0E-7D) {
/* 188 */       return 0.0D;
/*     */     }
/*     */     
/* 191 */     ej ej1 = ☃.a();
/* 192 */     eq.a a1 = ej1.a(eq.a.a);
/* 193 */     eq.a a2 = ej1.a(eq.a.b);
/* 194 */     eq.a a3 = ej1.a(eq.a.c);
/*     */     
/* 196 */     double d1 = cea1.b(a1);
/* 197 */     double d2 = cea1.a(a1);
/*     */     
/* 199 */     int i = a(a1, d2 + 1.0E-7D);
/* 200 */     int j = a(a1, d1 - 1.0E-7D);
/*     */     
/* 202 */     int k = Math.max(0, a(a2, cea1.a(a2) + 1.0E-7D));
/* 203 */     int m = Math.min(this.a.c(a2), a(a2, cea1.b(a2) - 1.0E-7D) + 1);
/*     */     
/* 205 */     int n = Math.max(0, a(a3, cea1.a(a3) + 1.0E-7D));
/* 206 */     int i1 = Math.min(this.a.c(a3), a(a3, cea1.b(a3) - 1.0E-7D) + 1);
/*     */     
/* 208 */     int i2 = this.a.c(a1);
/*     */     
/* 210 */     if (d > 0.0D) {
/* 211 */       for (int i3 = j + 1; i3 < i2; i3++) {
/* 212 */         for (int i4 = k; i4 < m; i4++) {
/* 213 */           for (int i5 = n; i5 < i1; i5++) {
/* 214 */             if (this.a.a(ej1, i3, i4, i5)) {
/* 215 */               double d3 = a(a1, i3) - d1;
/* 216 */               if (d3 >= -1.0E-7D) {
/* 217 */                 d = Math.min(d, d3);
/*     */               }
/* 219 */               return d;
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/* 224 */     } else if (d < 0.0D) {
/* 225 */       for (int i3 = i - 1; i3 >= 0; i3--) {
/* 226 */         for (int i4 = k; i4 < m; i4++) {
/* 227 */           for (int i5 = n; i5 < i1; i5++) {
/* 228 */             if (this.a.a(ej1, i3, i4, i5)) {
/* 229 */               double d3 = a(a1, i3 + 1) - d2;
/* 230 */               if (d3 <= 1.0E-7D) {
/* 231 */                 d = Math.max(d, d3);
/*     */               }
/* 233 */               return d;
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/* 239 */     return d;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 244 */     return b() ? "EMPTY" : ("VoxelShape[" + a() + "]");
/*     */   }
/*     */   
/*     */   protected abstract DoubleList a(eq.a parama);
/*     */ }


/* Location:              F:\dw\server.jar!\cew.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */