/*     */ import com.google.common.collect.Sets;
/*     */ import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bbt
/*     */   extends ayw
/*     */ {
/*     */   private final byl c;
/*     */   private final boz d;
/*  27 */   private final ayu[] e = new ayu[] { ayz.k, ayz.R, ayz.Q, ayz.P, ayz.S };
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public bbt(bbu ☃) {
/*  36 */     this.d = new boz(☃.a());
/*     */     
/*  38 */     this.d.a(17292);
/*  39 */     this.c = new byl(this.d);
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public ayu a(el ☃, @Nullable ayu ayu1) {
/*  45 */     return a(☃.o() >> 4, ☃.q() >> 4);
/*     */   }
/*     */   
/*     */   private ayu a(int ☃, int i) {
/*  49 */     if (☃ * ☃ + i * i <= 4096L) {
/*  50 */       return ayz.k;
/*     */     }
/*     */     
/*  53 */     float f = c(☃, i, 1, 1);
/*  54 */     if (f > 40.0F) {
/*  55 */       return ayz.R;
/*     */     }
/*     */     
/*  58 */     if (f >= 0.0F) {
/*  59 */       return ayz.Q;
/*     */     }
/*     */     
/*  62 */     if (f < -20.0F) {
/*  63 */       return ayz.P;
/*     */     }
/*     */     
/*  66 */     return ayz.S;
/*     */   }
/*     */ 
/*     */   
/*     */   public ayu[] a(int ☃, int i, int j, int k) {
/*  71 */     return b(☃, i, j, k);
/*     */   }
/*     */ 
/*     */   
/*     */   public ayu[] a(int ☃, int i, int j, int k, boolean bool) {
/*  76 */     ayu[] arrayOfAyu = new ayu[j * k];
/*     */     
/*  78 */     Long2ObjectOpenHashMap long2ObjectOpenHashMap = new Long2ObjectOpenHashMap();
/*     */     
/*  80 */     for (int m = 0; m < j; m++) {
/*  81 */       for (int n = 0; n < k; n++) {
/*  82 */         int i1 = m + ☃ >> 4;
/*  83 */         int i2 = n + i >> 4;
/*  84 */         long l = axm.a(i1, i2);
/*  85 */         ayu ayu1 = (ayu)long2ObjectOpenHashMap.get(l);
/*  86 */         if (ayu1 == null) {
/*  87 */           ayu1 = a(i1, i2);
/*  88 */           long2ObjectOpenHashMap.put(l, ayu1);
/*     */         } 
/*  90 */         arrayOfAyu[m + n * j] = ayu1;
/*     */       } 
/*     */     } 
/*     */     
/*  94 */     return arrayOfAyu;
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
/*     */   public Set<ayu> a(int ☃, int i, int j) {
/* 110 */     int k = ☃ - j >> 2;
/* 111 */     int m = i - j >> 2;
/* 112 */     int n = ☃ + j >> 2;
/* 113 */     int i1 = i + j >> 2;
/*     */     
/* 115 */     int i2 = n - k + 1;
/* 116 */     int i3 = i1 - m + 1;
/*     */     
/* 118 */     return Sets.newHashSet((Object[])b(k, m, i2, i3));
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public el a(int ☃, int i, int j, List<ayu> list, Random random) {
/* 124 */     int k = ☃ - j >> 2;
/* 125 */     int m = i - j >> 2;
/* 126 */     int n = ☃ + j >> 2;
/* 127 */     int i1 = i + j >> 2;
/*     */     
/* 129 */     int i2 = n - k + 1;
/* 130 */     int i3 = i1 - m + 1;
/* 131 */     ayu[] arrayOfAyu = b(k, m, i2, i3);
/* 132 */     el el = null;
/* 133 */     int i4 = 0;
/* 134 */     for (int i5 = 0; i5 < i2 * i3; i5++) {
/* 135 */       int i6 = k + i5 % i2 << 2;
/* 136 */       int i7 = m + i5 / i2 << 2;
/* 137 */       if (list.contains(arrayOfAyu[i5])) {
/* 138 */         if (el == null || random.nextInt(i4 + 1) == 0) {
/* 139 */           el = new el(i6, 0, i7);
/*     */         }
/* 141 */         i4++;
/*     */       } 
/*     */     } 
/*     */     
/* 145 */     return el;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public float c(int ☃, int i, int j, int k) {
/* 151 */     float f1 = (☃ * 2 + j);
/* 152 */     float f2 = (i * 2 + k);
/* 153 */     float f3 = 100.0F - xq.c(f1 * f1 + f2 * f2) * 8.0F;
/* 154 */     f3 = xq.a(f3, -100.0F, 80.0F);
/*     */ 
/*     */     
/* 157 */     for (int m = -12; m <= 12; m++) {
/* 158 */       for (int n = -12; n <= 12; n++) {
/* 159 */         long l1 = (☃ + m);
/* 160 */         long l2 = (i + n);
/* 161 */         if (l1 * l1 + l2 * l2 > 4096L && this.c.a(l1, l2) < -0.8999999761581421D) {
/* 162 */           float f4 = (xq.e((float)l1) * 3439.0F + xq.e((float)l2) * 147.0F) % 13.0F + 9.0F;
/* 163 */           f1 = (j - m * 2);
/* 164 */           f2 = (k - n * 2);
/* 165 */           float f5 = 100.0F - xq.c(f1 * f1 + f2 * f2) * f4;
/* 166 */           f5 = xq.a(f5, -100.0F, 80.0F);
/* 167 */           f3 = Math.max(f3, f5);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 172 */     return f3;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(btl<?> ☃) {
/* 177 */     return ((Boolean)this.a.computeIfAbsent(☃, ☃ -> { for (ayu ayu1 : this.e) { if (ayu1.a(☃)) return Boolean.valueOf(true);  }  return Boolean.valueOf(false); })).booleanValue();
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
/* 189 */     if (this.b.isEmpty()) {
/* 190 */       for (ayu ☃ : this.e) {
/* 191 */         this.b.add(☃.r().a());
/*     */       }
/*     */     }
/* 194 */     return this.b;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bbt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */