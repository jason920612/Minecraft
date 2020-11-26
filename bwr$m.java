/*     */ import java.util.List;
/*     */ import java.util.Random;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ abstract class m
/*     */   extends bxb
/*     */ {
/*     */   public m() {}
/*     */   
/*     */   protected m(int ☃) {
/* 133 */     super(☃);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(gy ☃, bxm bxm1) {}
/*     */ 
/*     */   
/*     */   protected void a(gy ☃) {}
/*     */ 
/*     */   
/*     */   private int a(List<bwr.n> ☃) {
/* 145 */     boolean bool = false;
/* 146 */     int i = 0;
/* 147 */     for (bwr.n n : ☃) {
/* 148 */       if (n.d > 0 && n.c < n.d) {
/* 149 */         bool = true;
/*     */       }
/* 151 */       i += n.b;
/*     */     } 
/* 153 */     return bool ? i : -1;
/*     */   }
/*     */   
/*     */   private m a(bwr.q ☃, List<bwr.n> list, List<bxb> list1, Random random, int i, int j, int k, eq eq1, int n) {
/* 157 */     int i1 = a(list);
/* 158 */     boolean bool = (i1 > 0 && n <= 30);
/*     */     
/* 160 */     int i2 = 0;
/* 161 */     while (i2 < 5 && bool) {
/* 162 */       i2++;
/*     */       
/* 164 */       int i3 = random.nextInt(i1);
/* 165 */       for (bwr.n n1 : list) {
/* 166 */         i3 -= n1.b;
/* 167 */         if (i3 < 0) {
/* 168 */           if (!n1.a(n) || (n1 == ☃.a && !n1.e)) {
/*     */             break;
/*     */           }
/*     */           
/* 172 */           m m1 = bwr.a(n1, list1, random, i, j, k, eq1, n);
/* 173 */           if (m1 != null) {
/* 174 */             n1.c++;
/* 175 */             ☃.a = n1;
/*     */             
/* 177 */             if (!n1.a()) {
/* 178 */               list.remove(n1);
/*     */             }
/* 180 */             return m1;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/* 185 */     return bwr.b.a(list1, random, i, j, k, eq1, n);
/*     */   }
/*     */   
/*     */   private bxb a(bwr.q ☃, List<bxb> list, Random random, int i, int j, int k, @Nullable eq eq1, int n, boolean bool) {
/* 189 */     if (Math.abs(i - (☃.d()).a) > 112 || Math.abs(k - (☃.d()).c) > 112) {
/* 190 */       return bwr.b.a(list, random, i, j, k, eq1, n);
/*     */     }
/* 192 */     List<bwr.n> list1 = ☃.b;
/* 193 */     if (bool) {
/* 194 */       list1 = ☃.c;
/*     */     }
/* 196 */     bxb bxb1 = a(☃, list1, list, random, i, j, k, eq1, n + 1);
/* 197 */     if (bxb1 != null) {
/* 198 */       list.add(bxb1);
/* 199 */       ☃.d.add(bxb1);
/*     */     } 
/* 201 */     return bxb1;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   protected bxb a(bwr.q ☃, List<bxb> list, Random random, int i, int j, boolean bool) {
/* 206 */     eq eq = f();
/* 207 */     if (eq != null) {
/* 208 */       switch (bwr.null.a[eq.ordinal()]) {
/*     */         case 1:
/* 210 */           return a(☃, list, random, this.n.a + i, this.n.b + j, this.n.c - 1, eq, e(), bool);
/*     */         case 2:
/* 212 */           return a(☃, list, random, this.n.a + i, this.n.b + j, this.n.f + 1, eq, e(), bool);
/*     */         case 3:
/* 214 */           return a(☃, list, random, this.n.a - 1, this.n.b + j, this.n.c + i, eq, e(), bool);
/*     */         case 4:
/* 216 */           return a(☃, list, random, this.n.d + 1, this.n.b + j, this.n.c + i, eq, e(), bool);
/*     */       } 
/*     */     }
/* 219 */     return null;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   protected bxb b(bwr.q ☃, List<bxb> list, Random random, int i, int j, boolean bool) {
/* 224 */     eq eq = f();
/* 225 */     if (eq != null) {
/* 226 */       switch (bwr.null.a[eq.ordinal()]) {
/*     */         case 1:
/* 228 */           return a(☃, list, random, this.n.a - 1, this.n.b + i, this.n.c + j, eq.e, e(), bool);
/*     */         case 2:
/* 230 */           return a(☃, list, random, this.n.a - 1, this.n.b + i, this.n.c + j, eq.e, e(), bool);
/*     */         case 3:
/* 232 */           return a(☃, list, random, this.n.a + j, this.n.b + i, this.n.c - 1, eq.c, e(), bool);
/*     */         case 4:
/* 234 */           return a(☃, list, random, this.n.a + j, this.n.b + i, this.n.c - 1, eq.c, e(), bool);
/*     */       } 
/*     */     }
/* 237 */     return null;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   protected bxb c(bwr.q ☃, List<bxb> list, Random random, int i, int j, boolean bool) {
/* 242 */     eq eq = f();
/* 243 */     if (eq != null) {
/* 244 */       switch (bwr.null.a[eq.ordinal()]) {
/*     */         case 1:
/* 246 */           return a(☃, list, random, this.n.d + 1, this.n.b + i, this.n.c + j, eq.f, e(), bool);
/*     */         case 2:
/* 248 */           return a(☃, list, random, this.n.d + 1, this.n.b + i, this.n.c + j, eq.f, e(), bool);
/*     */         case 3:
/* 250 */           return a(☃, list, random, this.n.a + j, this.n.b + i, this.n.f + 1, eq.d, e(), bool);
/*     */         case 4:
/* 252 */           return a(☃, list, random, this.n.a + j, this.n.b + i, this.n.f + 1, eq.d, e(), bool);
/*     */       } 
/*     */     }
/* 255 */     return null;
/*     */   }
/*     */   
/*     */   protected static boolean a(bwf ☃) {
/* 259 */     return (☃ != null && ☃.b > 10);
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bwr$m.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */