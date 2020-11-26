/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.List;
/*     */ import java.util.Objects;
/*     */ import java.util.Random;
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
/*     */ public class bpb
/*     */   extends bpa<brz>
/*     */ {
/*  26 */   private static final blc a = bct.J.p();
/*  27 */   private static final blc b = bct.ah.p();
/*     */   
/*     */   static class a extends el {
/*     */     private final int b;
/*     */     
/*     */     public a(el ☃, int i) {
/*  33 */       super(☃.o(), ☃.p(), ☃.q());
/*  34 */       this.b = i;
/*     */     }
/*     */     
/*     */     public int r() {
/*  38 */       return this.b;
/*     */     }
/*     */   }
/*     */   
/*     */   public bpb(boolean ☃) {
/*  43 */     super(☃);
/*     */   }
/*     */   
/*     */   private void a(axz ☃, el el1, float f) {
/*  47 */     int i = (int)(f + 0.618D);
/*     */     
/*  49 */     for (int j = -i; j <= i; j++) {
/*  50 */       for (int k = -i; k <= i; k++) {
/*  51 */         if (Math.pow(Math.abs(j) + 0.5D, 2.0D) + Math.pow(Math.abs(k) + 0.5D, 2.0D) <= (f * f)) {
/*  52 */           el el2 = el1.a(j, 0, k);
/*     */           
/*  54 */           blc blc1 = ☃.a_(el2);
/*  55 */           if (blc1.f() || blc1.d() == bza.z) {
/*  56 */             a(☃, el2, b);
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private float a(int ☃, int i) {
/*  65 */     if (i < ☃ * 0.3F) {
/*  66 */       return -1.0F;
/*     */     }
/*     */     
/*  69 */     float f1 = ☃ / 2.0F;
/*  70 */     float f2 = f1 - i;
/*     */     
/*  72 */     float f3 = xq.c(f1 * f1 - f2 * f2);
/*  73 */     if (f2 == 0.0F) {
/*  74 */       f3 = f1;
/*  75 */     } else if (Math.abs(f2) >= f1) {
/*  76 */       return 0.0F;
/*     */     } 
/*     */     
/*  79 */     return f3 * 0.5F;
/*     */   }
/*     */   
/*     */   private float a(int ☃) {
/*  83 */     if (☃ < 0 || ☃ >= 5)
/*  84 */       return -1.0F; 
/*  85 */     if (☃ == 0 || ☃ == 4) {
/*  86 */       return 2.0F;
/*     */     }
/*  88 */     return 3.0F;
/*     */   }
/*     */ 
/*     */   
/*     */   private void b(axz ☃, el el1) {
/*  93 */     for (int i = 0; i < 5; i++) {
/*  94 */       a(☃, el1.b(i), a(i));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   private int a(Set<el> ☃, axz axz1, el el1, el el2, boolean bool) {
/* 100 */     if (!bool && Objects.equals(el1, el2)) {
/* 101 */       return -1;
/*     */     }
/*     */     
/* 104 */     el el3 = el2.a(-el1.o(), -el1.p(), -el1.q());
/*     */     
/* 106 */     int i = a(el3);
/*     */     
/* 108 */     float f1 = el3.o() / i;
/* 109 */     float f2 = el3.p() / i;
/* 110 */     float f3 = el3.q() / i;
/*     */     
/* 112 */     for (int j = 0; j <= i; j++) {
/* 113 */       el el4 = el1.a((0.5F + j * f1), (0.5F + j * f2), (0.5F + j * f3));
/* 114 */       if (bool) {
/* 115 */         a(☃, axz1, el4, a.a(bfw.a, a(el1, el4)));
/*     */       }
/* 117 */       else if (!a(axz1.a_(el4).c())) {
/* 118 */         return j;
/*     */       } 
/*     */     } 
/*     */     
/* 122 */     return -1;
/*     */   }
/*     */   
/*     */   private int a(el ☃) {
/* 126 */     int i = xq.a(☃.o());
/* 127 */     int j = xq.a(☃.p());
/* 128 */     int k = xq.a(☃.q());
/*     */     
/* 130 */     if (k > i && k > j)
/* 131 */       return k; 
/* 132 */     if (j > i) {
/* 133 */       return j;
/*     */     }
/*     */     
/* 136 */     return i;
/*     */   }
/*     */   
/*     */   private eq.a a(el ☃, el el1) {
/* 140 */     eq.a a = eq.a.b;
/* 141 */     int i = Math.abs(el1.o() - ☃.o());
/* 142 */     int j = Math.abs(el1.q() - ☃.q());
/* 143 */     int k = Math.max(i, j);
/*     */     
/* 145 */     if (k > 0) {
/* 146 */       if (i == k) {
/* 147 */         a = eq.a.a;
/* 148 */       } else if (j == k) {
/* 149 */         a = eq.a.c;
/*     */       } 
/*     */     }
/* 152 */     return a;
/*     */   }
/*     */   
/*     */   private void a(axz ☃, int i, el el1, List<a> list) {
/* 156 */     for (a a : list) {
/* 157 */       if (b(i, a.r() - el1.p())) {
/* 158 */         b(☃, a);
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   private boolean b(int ☃, int i) {
/* 164 */     return (i >= ☃ * 0.2D);
/*     */   }
/*     */   
/*     */   private void a(Set<el> ☃, axz axz1, el el1, int i) {
/* 168 */     a(☃, axz1, el1, el1.b(i), true);
/*     */   }
/*     */   
/*     */   private void a(Set<el> ☃, axz axz1, int i, el el1, List<a> list) {
/* 172 */     for (a a : list) {
/* 173 */       int j = a.r();
/* 174 */       el el2 = new el(el1.o(), j, el1.q());
/*     */       
/* 176 */       if (!el2.equals(a) && 
/* 177 */         b(i, j - el1.p())) {
/* 178 */         a(☃, axz1, el2, a, true);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(Set<el> ☃, axz axz1, Random random, el el1) {
/* 187 */     Random random1 = new Random(random.nextLong());
/*     */     
/* 189 */     int i = b(☃, axz1, el1, 5 + random1.nextInt(12));
/* 190 */     if (i == -1) {
/* 191 */       return false;
/*     */     }
/*     */     
/* 194 */     a(axz1, el1.b());
/*     */     
/* 196 */     int j = (int)(i * 0.618D);
/* 197 */     if (j >= i) {
/* 198 */       j = i - 1;
/*     */     }
/*     */ 
/*     */     
/* 202 */     double d = 1.0D;
/* 203 */     int k = (int)(1.382D + Math.pow(1.0D * i / 13.0D, 2.0D));
/* 204 */     if (k < 1) {
/* 205 */       k = 1;
/*     */     }
/*     */     
/* 208 */     int m = el1.p() + j;
/* 209 */     int n = i - 5;
/*     */     
/* 211 */     List<a> list = Lists.newArrayList();
/* 212 */     list.add(new a(el1.b(n), m));
/*     */     
/* 214 */     for (; n >= 0; n--) {
/* 215 */       float f = a(i, n);
/* 216 */       if (f >= 0.0F)
/*     */       {
/*     */ 
/*     */         
/* 220 */         for (int i1 = 0; i1 < k; i1++) {
/* 221 */           double d1 = 1.0D;
/* 222 */           double d2 = 1.0D * f * (random1.nextFloat() + 0.328D);
/* 223 */           double d3 = (random1.nextFloat() * 2.0F) * Math.PI;
/*     */           
/* 225 */           double d4 = d2 * Math.sin(d3) + 0.5D;
/* 226 */           double d5 = d2 * Math.cos(d3) + 0.5D;
/*     */           
/* 228 */           el el2 = el1.a(d4, (n - 1), d5);
/* 229 */           el el3 = el2.b(5);
/*     */ 
/*     */           
/* 232 */           if (a(☃, axz1, el2, el3, false) == -1) {
/*     */             
/* 234 */             int i2 = el1.o() - el2.o();
/* 235 */             int i3 = el1.q() - el2.q();
/*     */             
/* 237 */             double d6 = el2.p() - Math.sqrt((i2 * i2 + i3 * i3)) * 0.381D;
/* 238 */             int i4 = (d6 > m) ? m : (int)d6;
/* 239 */             el el4 = new el(el1.o(), i4, el1.q());
/*     */ 
/*     */             
/* 242 */             if (a(☃, axz1, el4, el2, false) == -1)
/*     */             {
/* 244 */               list.add(new a(el2, el4.p())); } 
/*     */           } 
/*     */         } 
/*     */       }
/*     */     } 
/* 249 */     a(axz1, i, el1, list);
/* 250 */     a(☃, axz1, el1, j);
/* 251 */     a(☃, axz1, i, el1, list);
/*     */     
/* 253 */     return true;
/*     */   }
/*     */   
/*     */   private int b(Set<el> ☃, axz axz1, el el1, int i) {
/* 257 */     bcs bcs = axz1.a_(el1.b()).c();
/* 258 */     if (!bcs.d(bcs) && bcs != bct.i && bcs != bct.cq) {
/* 259 */       return -1;
/*     */     }
/*     */     
/* 262 */     int j = a(☃, axz1, el1, el1.b(i - 1), false);
/* 263 */     if (j == -1) {
/* 264 */       return i;
/*     */     }
/*     */     
/* 267 */     if (j < 6) {
/* 268 */       return -1;
/*     */     }
/*     */     
/* 271 */     return j;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bpb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */