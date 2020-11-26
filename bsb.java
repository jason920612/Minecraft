/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Sets;
/*     */ import java.util.List;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bsb
/*     */   extends btl<bsa>
/*     */ {
/*  29 */   private static final List<ayu.e> b = Lists.newArrayList((Object[])new ayu.e[] { new ayu.e((aev)aev.C, 1, 2, 4) });
/*     */ 
/*     */   
/*     */   protected axm a(bmy<?> ☃, Random random, int i, int j, int k, int m) {
/*  33 */     int n = ☃.a().c();
/*  34 */     int i1 = ☃.a().d();
/*     */     
/*  36 */     int i2 = i + n * k;
/*  37 */     int i3 = j + n * m;
/*     */     
/*  39 */     int i4 = (i2 < 0) ? (i2 - n + 1) : i2;
/*  40 */     int i5 = (i3 < 0) ? (i3 - n + 1) : i3;
/*     */     
/*  42 */     int i6 = i4 / n;
/*  43 */     int i7 = i5 / n;
/*     */     
/*  45 */     ((boz)random).a(☃.c(), i6, i7, 10387313);
/*     */     
/*  47 */     i6 *= n;
/*  48 */     i7 *= n;
/*  49 */     i6 += (random.nextInt(n - i1) + random.nextInt(n - i1)) / 2;
/*  50 */     i7 += (random.nextInt(n - i1) + random.nextInt(n - i1)) / 2;
/*     */     
/*  52 */     return new axm(i6, i7);
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean a(bmy<?> ☃, Random random, int i, int j) {
/*  57 */     axm axm = a(☃, random, i, j, 0, 0);
/*     */     
/*  59 */     if (i == axm.a && j == axm.b) {
/*  60 */       Set<ayu> set1 = ☃.b().a(i * 16 + 9, j * 16 + 9, 16);
/*  61 */       for (ayu ayu : set1) {
/*  62 */         if (!☃.a(ayu, (btl)bqo.n)) {
/*  63 */           return false;
/*     */         }
/*     */       } 
/*     */       
/*  67 */       Set<ayu> set2 = ☃.b().a(i * 16 + 9, j * 16 + 9, 29);
/*  68 */       for (ayu ayu : set2) {
/*  69 */         if (ayu.p() != ayu.b.l && ayu.p() != ayu.b.n) {
/*  70 */           return false;
/*     */         }
/*     */       } 
/*     */       
/*  74 */       return true;
/*     */     } 
/*     */     
/*  77 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean a(axz ☃) {
/*  82 */     return ☃.g().r();
/*     */   }
/*     */ 
/*     */   
/*     */   protected bxc a(axz ☃, bmy<?> bmy1, boz boz1, int i, int j) {
/*  87 */     ayu ayu = bmy1.b().a(new el((i << 4) + 9, 0, (j << 4) + 9), ayz.b);
/*  88 */     return new a(☃, boz1, i, j, ayu);
/*     */   }
/*     */   
/*     */   public static class a extends bxc {
/*  92 */     private final Set<axm> e = Sets.newHashSet();
/*     */     
/*     */     private boolean f;
/*     */ 
/*     */     
/*     */     public a() {}
/*     */     
/*     */     public a(axz ☃, boz boz1, int i, int j, ayu ayu1) {
/* 100 */       super(i, j, ayu1, boz1, ☃.r_());
/* 101 */       b(☃, boz1, i, j);
/*     */     }
/*     */     
/*     */     private void b(axk ☃, Random random, int i, int j) {
/* 105 */       int k = i * 16 - 29;
/* 106 */       int m = j * 16 - 29;
/* 107 */       eq eq = eq.c.a.a(random);
/*     */       
/* 109 */       this.a.add(new bws.h(random, k, m, eq));
/* 110 */       a(☃);
/*     */       
/* 112 */       this.f = true;
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(axz ☃, Random random, bwf bwf1, axm axm1) {
/* 117 */       if (!this.f) {
/* 118 */         this.a.clear();
/* 119 */         b(☃, random, e(), f());
/*     */       } 
/* 121 */       super.a(☃, random, bwf1, axm1);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public void b(axm ☃) {
/* 134 */       super.b(☃);
/*     */       
/* 136 */       this.e.add(☃);
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(gy ☃) {
/* 141 */       super.a(☃);
/*     */       
/* 143 */       he he = new he();
/* 144 */       for (axm axm : this.e) {
/* 145 */         gy gy1 = new gy();
/* 146 */         gy1.b("X", axm.a);
/* 147 */         gy1.b("Z", axm.b);
/* 148 */         he.a(gy1);
/*     */       } 
/* 150 */       ☃.a("Processed", he);
/*     */     }
/*     */ 
/*     */     
/*     */     public void b(gy ☃) {
/* 155 */       super.b(☃);
/*     */       
/* 157 */       if (☃.c("Processed", 9)) {
/* 158 */         he he = ☃.d("Processed", 10);
/* 159 */         for (int i = 0; i < he.size(); i++) {
/* 160 */           gy gy1 = he.e(i);
/* 161 */           this.e.add(new axm(gy1.h("X"), gy1.h("Z")));
/*     */         } 
/*     */       } 
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected String a() {
/* 169 */     return "Monument";
/*     */   }
/*     */ 
/*     */   
/*     */   public int b() {
/* 174 */     return 8;
/*     */   }
/*     */ 
/*     */   
/*     */   public List<ayu.e> d() {
/* 179 */     return b;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bsb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */