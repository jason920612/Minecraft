/*     */ import com.google.common.collect.ImmutableSet;
/*     */ import java.util.Set;
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
/*     */ public abstract class r
/*     */   extends bxb
/*     */ {
/*  40 */   protected static final blc a = bct.hg.p();
/*  41 */   protected static final blc b = bct.hh.p();
/*  42 */   protected static final blc c = bct.hi.p();
/*     */   
/*  44 */   protected static final blc d = b;
/*     */   
/*  46 */   protected static final blc e = bct.hm.p();
/*     */ 
/*     */   
/*  49 */   protected static final blc f = bct.A.p();
/*  50 */   protected static final Set<bcs> g = (Set<bcs>)ImmutableSet.builder()
/*  51 */     .add(bct.cR)
/*  52 */     .add(bct.gp)
/*  53 */     .add(bct.gq)
/*  54 */     .add(f.c())
/*  55 */     .build();
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
/*  66 */   protected static final int h = b(2, 0, 0);
/*  67 */   protected static final int i = b(2, 2, 0);
/*  68 */   protected static final int j = b(0, 1, 0);
/*  69 */   protected static final int k = b(4, 1, 0);
/*     */ 
/*     */ 
/*     */   
/*     */   protected bws.v l;
/*     */ 
/*     */ 
/*     */   
/*     */   protected static final int b(int ☃, int i, int j) {
/*  78 */     return i * 25 + j * 5 + ☃;
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
/*     */   public r() {
/*  96 */     super(0);
/*     */   }
/*     */   
/*     */   public r(int ☃) {
/* 100 */     super(☃);
/*     */   }
/*     */   
/*     */   public r(eq ☃, bwf bwf1) {
/* 104 */     super(1);
/* 105 */     a(☃);
/* 106 */     this.n = bwf1;
/*     */   }
/*     */   
/*     */   protected r(int ☃, eq eq1, bws.v v1, int i, int j, int k) {
/* 110 */     super(☃);
/* 111 */     a(eq1);
/* 112 */     this.l = v1;
/*     */     
/* 114 */     int m = bws.v.a(v1);
/* 115 */     int n = m % 5;
/* 116 */     int i1 = m / 5 % 5;
/* 117 */     int i2 = m / 25;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 122 */     if (eq1 == eq.c || eq1 == eq.d) {
/* 123 */       this.n = new bwf(0, 0, 0, i * 8 - 1, j * 4 - 1, k * 8 - 1);
/*     */     } else {
/*     */       
/* 126 */       this.n = new bwf(0, 0, 0, k * 8 - 1, j * 4 - 1, i * 8 - 1);
/*     */     } 
/*     */     
/* 129 */     switch (bws.null.a[eq1.ordinal()]) {
/*     */       case 1:
/* 131 */         this.n.a(n * 8, i2 * 4, -(i1 + k) * 8 + 1);
/*     */         return;
/*     */       
/*     */       case 2:
/* 135 */         this.n.a(n * 8, i2 * 4, i1 * 8);
/*     */         return;
/*     */       case 3:
/* 138 */         this.n.a(-(i1 + k) * 8 + 1, i2 * 4, n * 8);
/*     */         return;
/*     */     } 
/* 141 */     this.n.a(i1 * 8, i2 * 4, n * 8);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(gy ☃) {}
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(gy ☃, bxm bxm1) {}
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(axz ☃, bwf bwf1, int i, int j, int k, int m, int n, int i1) {
/* 155 */     for (int i2 = j; i2 <= n; i2++) {
/* 156 */       for (int i3 = i; i3 <= m; i3++) {
/* 157 */         for (int i4 = k; i4 <= i1; i4++) {
/* 158 */           blc blc1 = a(☃, i3, i2, i4, bwf1);
/* 159 */           if (!g.contains(blc1.c())) {
/* 160 */             if (d(i2) >= ☃.k() && blc1 != f) {
/* 161 */               a(☃, bct.a.p(), i3, i2, i4, bwf1);
/*     */             } else {
/* 163 */               a(☃, f, i3, i2, i4, bwf1);
/*     */             } 
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   protected void a(axz ☃, bwf bwf1, int i, int j, boolean bool) {
/* 172 */     if (bool) {
/* 173 */       a(☃, bwf1, i + 0, 0, j + 0, i + 2, 0, j + 8 - 1, a, a, false);
/* 174 */       a(☃, bwf1, i + 5, 0, j + 0, i + 8 - 1, 0, j + 8 - 1, a, a, false);
/* 175 */       a(☃, bwf1, i + 3, 0, j + 0, i + 4, 0, j + 2, a, a, false);
/* 176 */       a(☃, bwf1, i + 3, 0, j + 5, i + 4, 0, j + 8 - 1, a, a, false);
/*     */       
/* 178 */       a(☃, bwf1, i + 3, 0, j + 2, i + 4, 0, j + 2, b, b, false);
/* 179 */       a(☃, bwf1, i + 3, 0, j + 5, i + 4, 0, j + 5, b, b, false);
/* 180 */       a(☃, bwf1, i + 2, 0, j + 3, i + 2, 0, j + 4, b, b, false);
/* 181 */       a(☃, bwf1, i + 5, 0, j + 3, i + 5, 0, j + 4, b, b, false);
/*     */     } else {
/* 183 */       a(☃, bwf1, i + 0, 0, j + 0, i + 8 - 1, 0, j + 8 - 1, a, a, false);
/*     */     } 
/*     */   }
/*     */   
/*     */   protected void a(axz ☃, bwf bwf1, int i, int j, int k, int m, int n, int i1, blc blc1) {
/* 188 */     for (int i2 = j; i2 <= n; i2++) {
/* 189 */       for (int i3 = i; i3 <= m; i3++) {
/* 190 */         for (int i4 = k; i4 <= i1; i4++) {
/* 191 */           if (a(☃, i3, i2, i4, bwf1) == f)
/*     */           {
/*     */             
/* 194 */             a(☃, blc1, i3, i2, i4, bwf1); } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   protected boolean a(bwf ☃, int i, int j, int k, int m) {
/* 201 */     int n = a(i, j);
/* 202 */     int i1 = b(i, j);
/* 203 */     int i2 = a(k, m);
/* 204 */     int i3 = b(k, m);
/* 205 */     return ☃.a(Math.min(n, i2), Math.min(i1, i3), Math.max(n, i2), Math.max(i1, i3));
/*     */   }
/*     */   
/*     */   protected boolean a(axz ☃, bwf bwf1, int i, int j, int k) {
/* 209 */     int m = a(i, k);
/* 210 */     int n = d(j);
/* 211 */     int i1 = b(i, k);
/*     */     
/* 213 */     if (bwf1.b(new el(m, n, i1))) {
/* 214 */       amv amv = new amv(☃.f());
/* 215 */       amv.c(amv.cw());
/* 216 */       amv.b(m + 0.5D, n, i1 + 0.5D, 0.0F, 0.0F);
/* 217 */       amv.a(☃.h(new el(amv)), (afj)null, (gy)null);
/* 218 */       ☃.a(amv);
/* 219 */       return true;
/*     */     } 
/* 221 */     return false;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bws$r.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */