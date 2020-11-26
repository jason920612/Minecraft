/*     */ import com.google.common.collect.Sets;
/*     */ import java.util.Collections;
/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ import java.util.Set;
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
/*     */ public class bau
/*     */   extends ayw
/*     */ {
/*  19 */   private final ayv c = new ayv(this);
/*     */   
/*     */   private final bzx d;
/*     */   private final bzx e;
/*  23 */   private final ayu[] f = new ayu[] { ayz.a, ayz.c, ayz.d, ayz.e, ayz.f, ayz.g, ayz.h, ayz.i, ayz.l, ayz.m, ayz.n, ayz.o, ayz.p, ayz.q, ayz.r, ayz.s, ayz.t, ayz.u, ayz.v, ayz.w, ayz.x, ayz.y, ayz.z, ayz.A, ayz.B, ayz.C, ayz.D, ayz.E, ayz.F, ayz.G, ayz.H, ayz.I, ayz.J, ayz.K, ayz.L, ayz.M, ayz.N, ayz.O, ayz.T, ayz.U, ayz.V, ayz.W, ayz.X, ayz.Y, ayz.Z, ayz.ab, ayz.ac, ayz.ad, ayz.ae, ayz.af, ayz.ag, ayz.ah, ayz.ai, ayz.aj, ayz.ak, ayz.al, ayz.am, ayz.an, ayz.ao, ayz.ap, ayz.aq, ayz.ar, ayz.as, ayz.at, ayz.au, ayz.av };
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public bau(bav ☃) {
/*  93 */     ccb ccb = ☃.a();
/*  94 */     bou bou = ☃.b();
/*  95 */     bzx[] arrayOfBzx = bzy.a(ccb.a(), ccb.t(), bou);
/*  96 */     this.d = arrayOfBzx[0];
/*  97 */     this.e = arrayOfBzx[1];
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public ayu a(el ☃, @Nullable ayu ayu1) {
/* 103 */     return this.c.a(☃.o(), ☃.q(), ayu1);
/*     */   }
/*     */ 
/*     */   
/*     */   public ayu[] a(int ☃, int i, int j, int k) {
/* 108 */     return this.d.a(☃, i, j, k, ayz.b);
/*     */   }
/*     */ 
/*     */   
/*     */   public ayu[] a(int ☃, int i, int j, int k, boolean bool) {
/* 113 */     if (bool && j == 16 && k == 16 && (☃ & 0xF) == 0 && (i & 0xF) == 0) {
/* 114 */       return this.c.b(☃, i);
/*     */     }
/*     */     
/* 117 */     return this.e.a(☃, i, j, k, ayz.b);
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
/*     */   public Set<ayu> a(int ☃, int i, int j) {
/* 149 */     int k = ☃ - j >> 2;
/* 150 */     int m = i - j >> 2;
/* 151 */     int n = ☃ + j >> 2;
/* 152 */     int i1 = i + j >> 2;
/*     */     
/* 154 */     int i2 = n - k + 1;
/* 155 */     int i3 = i1 - m + 1;
/*     */     
/* 157 */     Set<ayu> set = Sets.newHashSet();
/* 158 */     Collections.addAll(set, this.d.a(k, m, i2, i3, null));
/* 159 */     return set;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public el a(int ☃, int i, int j, List<ayu> list, Random random) {
/* 171 */     int k = ☃ - j >> 2;
/* 172 */     int m = i - j >> 2;
/* 173 */     int n = ☃ + j >> 2;
/* 174 */     int i1 = i + j >> 2;
/*     */     
/* 176 */     int i2 = n - k + 1;
/* 177 */     int i3 = i1 - m + 1;
/* 178 */     ayu[] arrayOfAyu = this.d.a(k, m, i2, i3, null);
/* 179 */     el el = null;
/* 180 */     int i4 = 0;
/* 181 */     for (int i5 = 0; i5 < i2 * i3; i5++) {
/* 182 */       int i6 = k + i5 % i2 << 2;
/* 183 */       int i7 = m + i5 / i2 << 2;
/* 184 */       if (list.contains(arrayOfAyu[i5])) {
/* 185 */         if (el == null || random.nextInt(i4 + 1) == 0) {
/* 186 */           el = new el(i6, 0, i7);
/*     */         }
/* 188 */         i4++;
/*     */       } 
/*     */     } 
/*     */     
/* 192 */     return el;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(btl<?> ☃) {
/* 197 */     return ((Boolean)this.a.computeIfAbsent(☃, ☃ -> { for (ayu ayu1 : this.f) { if (ayu1.a(☃)) return Boolean.valueOf(true);  }  return Boolean.valueOf(false); })).booleanValue();
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
/*     */   public Set<blc> b() {
/* 209 */     if (this.b.isEmpty()) {
/* 210 */       for (ayu ☃ : this.f) {
/* 211 */         this.b.add(☃.r().a());
/*     */       }
/*     */     }
/* 214 */     return this.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public void Y_() {
/* 219 */     this.c.a();
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bau.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */