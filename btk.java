/*     */ import com.google.common.collect.Lists;
/*     */ import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
/*     */ import it.unimi.dsi.fastutil.objects.ObjectIterator;
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
/*     */ public class btk
/*     */   extends btl<btj>
/*     */ {
/*     */   private boolean b;
/*     */   private axm[] c;
/*     */   private long d;
/*     */   
/*     */   protected boolean a(bmy<?> ☃, Random random, int i, int j) {
/*  32 */     if (this.d != ☃.c()) {
/*  33 */       c();
/*     */     }
/*     */     
/*  36 */     if (!this.b) {
/*  37 */       a(☃);
/*  38 */       this.b = true;
/*     */     } 
/*  40 */     for (axm axm1 : this.c) {
/*  41 */       if (i == axm1.a && j == axm1.b) {
/*  42 */         return true;
/*     */       }
/*     */     } 
/*  45 */     return false;
/*     */   }
/*     */   
/*     */   private void c() {
/*  49 */     this.b = false;
/*  50 */     this.c = null;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean a(axz ☃) {
/*  55 */     return ☃.g().r();
/*     */   }
/*     */ 
/*     */   
/*     */   protected bxc a(axz ☃, bmy<?> bmy1, boz boz1, int i, int j) {
/*  60 */     ayu ayu = bmy1.b().a(new el((i << 4) + 9, 0, (j << 4) + 9), ayz.b);
/*  61 */     int k = 0;
/*     */     
/*  63 */     a a = new a(☃, boz1, i, j, ayu, k++);
/*     */     
/*  65 */     while (a.d().isEmpty() || ((bwx.m)a.d().get(0)).b == null)
/*     */     {
/*  67 */       a = new a(☃, boz1, i, j, ayu, k++);
/*     */     }
/*     */     
/*  70 */     return a;
/*     */   }
/*     */   
/*     */   public static class a
/*     */     extends bxc
/*     */   {
/*     */     public a() {}
/*     */     
/*     */     public a(axz ☃, boz boz1, int i, int j, ayu ayu1, int k) {
/*  79 */       super(i, j, ayu1, boz1, ☃.r_() + k);
/*     */       
/*  81 */       bwx.b();
/*     */       
/*  83 */       bwx.m m = new bwx.m(0, boz1, (i << 4) + 2, (j << 4) + 2);
/*  84 */       this.a.add(m);
/*  85 */       m.a(m, this.a, boz1);
/*     */       
/*  87 */       List<bxb> list = m.c;
/*  88 */       while (!list.isEmpty()) {
/*  89 */         int n = boz1.nextInt(list.size());
/*  90 */         bxb bxb = list.remove(n);
/*  91 */         bxb.a(m, this.a, boz1);
/*     */       } 
/*     */       
/*  94 */       a(☃);
/*  95 */       a(☃, boz1, 10);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected String a() {
/* 101 */     return "Stronghold";
/*     */   }
/*     */ 
/*     */   
/*     */   public int b() {
/* 106 */     return 8;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public el a(axy ☃, bmy<? extends bom> bmy1, el el1, int i, boolean bool) {
/* 112 */     if (!bmy1.b().a(this)) {
/* 113 */       return null;
/*     */     }
/*     */     
/* 116 */     if (this.d != ☃.r_()) {
/* 117 */       c();
/*     */     }
/*     */     
/* 120 */     if (!this.b) {
/* 121 */       a(bmy1);
/* 122 */       this.b = true;
/*     */     } 
/*     */     
/* 125 */     el el2 = null;
/* 126 */     el.a a = new el.a(0, 0, 0);
/* 127 */     double d = Double.MAX_VALUE;
/* 128 */     for (axm axm1 : this.c) {
/* 129 */       a.c((axm1.a << 4) + 8, 32, (axm1.b << 4) + 8);
/* 130 */       double d1 = a.n(el1);
/* 131 */       if (el2 == null) {
/* 132 */         el2 = new el(a);
/* 133 */         d = d1;
/*     */       }
/* 135 */       else if (d1 < d) {
/* 136 */         el2 = new el(a);
/* 137 */         d = d1;
/*     */       } 
/*     */     } 
/*     */     
/* 141 */     return el2;
/*     */   }
/*     */   
/*     */   private void a(bmy<?> ☃) {
/* 145 */     this.d = ☃.c();
/*     */     
/* 147 */     List<ayu> list = Lists.newArrayList();
/*     */     
/* 149 */     for (ayu ayu : fc.m) {
/* 150 */       if (ayu != null && ☃.a(ayu, (btl)bqo.m)) {
/* 151 */         list.add(ayu);
/*     */       }
/*     */     } 
/*     */     
/* 155 */     int i = ☃.a().e();
/* 156 */     int j = ☃.a().f();
/* 157 */     int k = ☃.a().g();
/* 158 */     this.c = new axm[j];
/*     */     
/* 160 */     int m = 0;
/* 161 */     Long2ObjectMap<bxc> long2ObjectMap = ☃.a(this);
/* 162 */     synchronized (long2ObjectMap) {
/* 163 */       for (ObjectIterator<bxc> objectIterator = long2ObjectMap.values().iterator(); objectIterator.hasNext(); ) { bxc bxc = objectIterator.next();
/* 164 */         if (m < this.c.length) {
/* 165 */           this.c[m++] = new axm(bxc.e(), bxc.f());
/*     */         } }
/*     */     
/*     */     } 
/*     */     
/* 170 */     Random random = new Random();
/* 171 */     random.setSeed(☃.c());
/*     */     
/* 173 */     double d = random.nextDouble() * Math.PI * 2.0D;
/*     */     
/* 175 */     int n = long2ObjectMap.size();
/* 176 */     if (n < this.c.length) {
/*     */       
/* 178 */       int i1 = 0;
/* 179 */       int i2 = 0;
/* 180 */       for (int i3 = 0; i3 < this.c.length; i3++) {
/* 181 */         double d1 = (4 * i + i * i2 * 6) + (random.nextDouble() - 0.5D) * i * 2.5D;
/* 182 */         int i4 = (int)Math.round(Math.cos(d) * d1);
/* 183 */         int i5 = (int)Math.round(Math.sin(d) * d1);
/*     */         
/* 185 */         el el = ☃.b().a((i4 << 4) + 8, (i5 << 4) + 8, 112, list, random);
/* 186 */         if (el != null) {
/* 187 */           i4 = el.o() >> 4;
/* 188 */           i5 = el.q() >> 4;
/*     */         } 
/*     */ 
/*     */         
/* 192 */         if (i3 >= n) {
/* 193 */           this.c[i3] = new axm(i4, i5);
/*     */         }
/*     */         
/* 196 */         d += 6.283185307179586D / k;
/*     */         
/* 198 */         if (++i1 == k) {
/* 199 */           i2++;
/* 200 */           i1 = 0;
/* 201 */           k += 2 * k / (i2 + 1);
/* 202 */           k = Math.min(k, this.c.length - i3);
/* 203 */           d += random.nextDouble() * Math.PI * 2.0D;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\btk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */