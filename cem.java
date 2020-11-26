/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class cem
/*     */ {
/*   7 */   private static final eq.a[] d = eq.a.values();
/*     */   
/*     */   protected final int a;
/*     */   protected final int b;
/*     */   protected final int c;
/*     */   
/*     */   protected cem(int ☃, int i, int j) {
/*  14 */     this.a = ☃;
/*  15 */     this.b = i;
/*  16 */     this.c = j;
/*     */   }
/*     */   
/*     */   public boolean a(ej ☃, int i, int j, int k) {
/*  20 */     return c(☃
/*  21 */         .a(i, j, k, eq.a.a), ☃
/*  22 */         .a(i, j, k, eq.a.b), ☃
/*  23 */         .a(i, j, k, eq.a.c));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c(int ☃, int i, int j) {
/*  28 */     if (☃ < 0 || i < 0 || j < 0) {
/*  29 */       return false;
/*     */     }
/*  31 */     if (☃ >= this.a || i >= this.b || j >= this.c) {
/*  32 */       return false;
/*     */     }
/*  34 */     return b(☃, i, j);
/*     */   }
/*     */   
/*     */   public boolean b(ej ☃, int i, int j, int k) {
/*  38 */     return b(☃
/*  39 */         .a(i, j, k, eq.a.a), ☃
/*  40 */         .a(i, j, k, eq.a.b), ☃
/*  41 */         .a(i, j, k, eq.a.c));
/*     */   }
/*     */ 
/*     */   
/*     */   public abstract boolean b(int paramInt1, int paramInt2, int paramInt3);
/*     */   
/*     */   public abstract void a(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean1, boolean paramBoolean2);
/*     */   
/*     */   public boolean a() {
/*  50 */     for (eq.a ☃ : d) {
/*  51 */       if (a(☃) >= b(☃)) {
/*  52 */         return true;
/*     */       }
/*     */     } 
/*  55 */     return false;
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
/*     */   public abstract int a(eq.a parama);
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
/*     */   public abstract int b(eq.a parama);
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
/*     */   public int c(eq.a ☃) {
/* 102 */     return ☃.a(this.a, this.b, this.c);
/*     */   }
/*     */   
/*     */   public int b() {
/* 106 */     return c(eq.a.a);
/*     */   }
/*     */   
/*     */   public int c() {
/* 110 */     return c(eq.a.b);
/*     */   }
/*     */   
/*     */   public int d() {
/* 114 */     return c(eq.a.c);
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
/*     */   protected boolean a(int ☃, int i, int j, int k) {
/* 195 */     for (int m = ☃; m < i; m++) {
/* 196 */       if (!c(j, k, m)) {
/* 197 */         return false;
/*     */       }
/*     */     } 
/* 200 */     return true;
/*     */   }
/*     */   
/*     */   protected void a(int ☃, int i, int j, int k, boolean bool) {
/* 204 */     for (int m = ☃; m < i; m++) {
/* 205 */       a(j, k, m, false, bool);
/*     */     }
/*     */   }
/*     */   
/*     */   protected boolean a(int ☃, int i, int j, int k, int m) {
/* 210 */     for (int n = ☃; n < i; n++) {
/* 211 */       if (!a(j, k, n, m)) {
/* 212 */         return false;
/*     */       }
/*     */     } 
/* 215 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(b ☃, boolean bool) {
/* 223 */     cem cem1 = new ceh(this);
/* 224 */     for (int i = 0; i <= this.a; i++) {
/* 225 */       for (int j = 0; j <= this.b; j++) {
/* 226 */         int k = -1;
/* 227 */         for (int m = 0; m <= this.c; m++) {
/* 228 */           if (cem1.c(i, j, m)) {
/* 229 */             if (bool) {
/*     */               
/* 231 */               if (k == -1) {
/* 232 */                 k = m;
/*     */               }
/*     */             } else {
/* 235 */               ☃.consume(i, j, m, i + 1, j + 1, m + 1);
/*     */             } 
/* 237 */           } else if (k != -1) {
/*     */ 
/*     */             
/* 240 */             int n = i;
/* 241 */             int i1 = i;
/* 242 */             int i2 = j;
/* 243 */             int i3 = j;
/*     */ 
/*     */             
/* 246 */             cem1.a(k, m, i, j, false);
/*     */ 
/*     */             
/* 249 */             while (cem1.a(k, m, n - 1, i2)) {
/* 250 */               cem1.a(k, m, n - 1, i2, false);
/* 251 */               n--;
/*     */             } 
/* 253 */             while (cem1.a(k, m, i1 + 1, i2)) {
/* 254 */               cem1.a(k, m, i1 + 1, i2, false);
/* 255 */               i1++;
/*     */             } 
/*     */ 
/*     */             
/* 259 */             while (cem1.a(n, i1 + 1, k, m, i2 - 1)) {
/* 260 */               for (int i4 = n; i4 <= i1; i4++) {
/* 261 */                 cem1.a(k, m, i4, i2 - 1, false);
/*     */               }
/* 263 */               i2--;
/*     */             } 
/* 265 */             while (cem1.a(n, i1 + 1, k, m, i3 + 1)) {
/* 266 */               for (int i4 = n; i4 <= i1; i4++) {
/* 267 */                 cem1.a(k, m, i4, i3 + 1, false);
/*     */               }
/* 269 */               i3++;
/*     */             } 
/*     */             
/* 272 */             ☃.consume(n, i2, k, i1 + 1, i3 + 1, m);
/* 273 */             k = -1;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(a ☃) {
/* 282 */     a(☃, ej.a);
/* 283 */     a(☃, ej.b);
/* 284 */     a(☃, ej.c);
/*     */   }
/*     */   
/*     */   private void a(a ☃, ej ej1) {
/* 288 */     ej ej2 = ej1.a();
/*     */     
/* 290 */     eq.a a1 = ej2.a(eq.a.c);
/*     */     
/* 292 */     int i = c(ej2.a(eq.a.a));
/* 293 */     int j = c(ej2.a(eq.a.b));
/* 294 */     int k = c(a1);
/*     */     
/* 296 */     eq eq1 = eq.a(a1, eq.b.b);
/* 297 */     eq eq2 = eq.a(a1, eq.b.a);
/*     */     
/* 299 */     for (int m = 0; m < i; m++) {
/* 300 */       for (int n = 0; n < j; n++) {
/* 301 */         boolean bool = false;
/* 302 */         for (int i1 = 0; i1 <= k; i1++) {
/* 303 */           boolean bool1 = (i1 != k && b(ej2, m, n, i1));
/* 304 */           if (!bool && bool1) {
/* 305 */             ☃.consume(eq1, ej2
/*     */                 
/* 307 */                 .a(m, n, i1, eq.a.a), ej2
/* 308 */                 .a(m, n, i1, eq.a.b), ej2
/* 309 */                 .a(m, n, i1, eq.a.c));
/*     */           }
/*     */           
/* 312 */           if (bool && !bool1) {
/* 313 */             ☃.consume(eq2, ej2
/*     */                 
/* 315 */                 .a(m, n, i1 - 1, eq.a.a), ej2
/* 316 */                 .a(m, n, i1 - 1, eq.a.b), ej2
/* 317 */                 .a(m, n, i1 - 1, eq.a.c));
/*     */           }
/*     */           
/* 320 */           bool = bool1;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public static interface a {
/*     */     void consume(eq param1eq, int param1Int1, int param1Int2, int param1Int3);
/*     */   }
/*     */   
/*     */   public static interface b {
/*     */     void consume(int param1Int1, int param1Int2, int param1Int3, int param1Int4, int param1Int5, int param1Int6);
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\cem.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */