/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class btv
/*     */   extends btl<btu>
/*     */ {
/*     */   public String a() {
/*  23 */     return "Village";
/*     */   }
/*     */ 
/*     */   
/*     */   public int b() {
/*  28 */     return 8;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean a(axz ☃) {
/*  33 */     return ☃.g().r();
/*     */   }
/*     */ 
/*     */   
/*     */   protected axm a(bmy<?> ☃, Random random, int i, int j, int k, int m) {
/*  38 */     int n = ☃.a().a();
/*  39 */     int i1 = ☃.a().b();
/*     */     
/*  41 */     int i2 = i + n * k;
/*  42 */     int i3 = j + n * m;
/*     */     
/*  44 */     int i4 = (i2 < 0) ? (i2 - n + 1) : i2;
/*  45 */     int i5 = (i3 < 0) ? (i3 - n + 1) : i3;
/*     */     
/*  47 */     int i6 = i4 / n;
/*  48 */     int i7 = i5 / n;
/*     */     
/*  50 */     ((boz)random).a(☃.c(), i6, i7, 10387312);
/*     */     
/*  52 */     i6 *= n;
/*  53 */     i7 *= n;
/*  54 */     i6 += random.nextInt(n - i1);
/*  55 */     i7 += random.nextInt(n - i1);
/*     */     
/*  57 */     return new axm(i6, i7);
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean a(bmy<?> ☃, Random random, int i, int j) {
/*  62 */     axm axm = a(☃, random, i, j, 0, 0);
/*     */     
/*  64 */     if (i == axm.a && j == axm.b) {
/*  65 */       ayu ayu = ☃.b().a(new el((i << 4) + 9, 0, (j << 4) + 9), ayz.b);
/*  66 */       return ☃.a(ayu, (btl)bqo.e);
/*     */     } 
/*     */     
/*  69 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected bxc a(axz ☃, bmy<?> bmy1, boz boz1, int i, int j) {
/*  74 */     ayu ayu = bmy1.b().a(new el((i << 4) + 9, 0, (j << 4) + 9), ayz.b);
/*  75 */     return new a(☃, bmy1, boz1, i, j, ayu);
/*     */   }
/*     */   
/*     */   public static class a
/*     */     extends bxc
/*     */   {
/*     */     private boolean e;
/*     */     
/*     */     public a() {}
/*     */     
/*     */     public a(axz ☃, bmy<?> bmy1, boz boz1, int i, int j, ayu ayu1) {
/*  86 */       super(i, j, ayu1, boz1, ☃.r_());
/*  87 */       btu btu = (btu)bmy1.b(ayu1, (btl)bqo.e);
/*     */       
/*  89 */       List<bxh.e> list = bxh.a(boz1, btu.a);
/*     */       
/*  91 */       bxh.k k = new bxh.k(0, boz1, (i << 4) + 2, (j << 4) + 2, list, btu);
/*  92 */       this.a.add(k);
/*  93 */       k.a(k, this.a, boz1);
/*     */       
/*  95 */       List<bxb> list1 = k.e;
/*  96 */       List<bxb> list2 = k.d;
/*  97 */       while (!list1.isEmpty() || !list2.isEmpty()) {
/*     */         
/*  99 */         if (list1.isEmpty()) {
/* 100 */           int i1 = boz1.nextInt(list2.size());
/* 101 */           bxb bxb1 = list2.remove(i1);
/* 102 */           bxb1.a(k, this.a, boz1); continue;
/*     */         } 
/* 104 */         int n = boz1.nextInt(list1.size());
/* 105 */         bxb bxb = list1.remove(n);
/* 106 */         bxb.a(k, this.a, boz1);
/*     */       } 
/*     */ 
/*     */       
/* 110 */       a(☃);
/*     */       
/* 112 */       int m = 0;
/* 113 */       for (bxb bxb : this.a) {
/* 114 */         if (!(bxb instanceof bxh.p)) {
/* 115 */           m++;
/*     */         }
/*     */       } 
/* 118 */       this.e = (m > 2);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean b() {
/* 123 */       return this.e;
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(gy ☃) {
/* 128 */       super.a(☃);
/*     */       
/* 130 */       ☃.a("Valid", this.e);
/*     */     }
/*     */ 
/*     */     
/*     */     public void b(gy ☃) {
/* 135 */       super.b(☃);
/* 136 */       this.e = ☃.q("Valid");
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\btv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */