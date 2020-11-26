/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.Collection;
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
/*     */ 
/*     */ public class bua
/*     */   extends btl<btz>
/*     */ {
/*     */   protected axm a(bmy<?> ☃, Random random, int i, int j, int k, int m) {
/*  31 */     int n = ☃.a().p();
/*  32 */     int i1 = ☃.a().q();
/*     */     
/*  34 */     int i2 = i + n * k;
/*  35 */     int i3 = j + n * m;
/*     */     
/*  37 */     int i4 = (i2 < 0) ? (i2 - n + 1) : i2;
/*  38 */     int i5 = (i3 < 0) ? (i3 - n + 1) : i3;
/*     */     
/*  40 */     int i6 = i4 / n;
/*  41 */     int i7 = i5 / n;
/*     */     
/*  43 */     ((boz)random).a(☃.c(), i6, i7, 10387319);
/*     */     
/*  45 */     i6 *= n;
/*  46 */     i7 *= n;
/*  47 */     i6 += (random.nextInt(n - i1) + random.nextInt(n - i1)) / 2;
/*  48 */     i7 += (random.nextInt(n - i1) + random.nextInt(n - i1)) / 2;
/*     */     
/*  50 */     return new axm(i6, i7);
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean a(bmy<?> ☃, Random random, int i, int j) {
/*  55 */     axm axm = a(☃, random, i, j, 0, 0);
/*     */     
/*  57 */     if (i == axm.a && j == axm.b) {
/*  58 */       Set<ayu> set = ☃.b().a(i * 16 + 9, j * 16 + 9, 32);
/*  59 */       for (ayu ayu : set) {
/*  60 */         if (!☃.a(ayu, (btl)bqo.g)) {
/*  61 */           return false;
/*     */         }
/*     */       } 
/*  64 */       return true;
/*     */     } 
/*     */     
/*  67 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean a(axz ☃) {
/*  72 */     return ☃.g().r();
/*     */   }
/*     */ 
/*     */   
/*     */   protected bxc a(axz ☃, bmy<?> bmy1, boz boz1, int i, int j) {
/*  77 */     ayu ayu = bmy1.b().a(new el((i << 4) + 9, 0, (j << 4) + 9), ayz.b);
/*  78 */     return new a(☃, bmy1, boz1, i, j, ayu);
/*     */   }
/*     */ 
/*     */   
/*     */   protected String a() {
/*  83 */     return "Mansion";
/*     */   }
/*     */ 
/*     */   
/*     */   public int b() {
/*  88 */     return 8;
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
/*  99 */       super(i, j, ayu1, boz1, ☃.r_());
/*     */       
/* 101 */       bhb bhb = bhb.values()[boz1.nextInt((bhb.values()).length)];
/*     */       
/* 103 */       int k = 5;
/* 104 */       int m = 5;
/* 105 */       if (bhb == bhb.b) {
/* 106 */         k = -5;
/* 107 */       } else if (bhb == bhb.c) {
/* 108 */         k = -5;
/* 109 */         m = -5;
/* 110 */       } else if (bhb == bhb.d) {
/* 111 */         m = -5;
/*     */       } 
/*     */       
/* 114 */       bnr bnr = new bnr(new axm(i, j), bnt.a);
/* 115 */       bmy1.a(bnr);
/*     */       
/* 117 */       int n = bnr.a(bor.a.d, 7, 7);
/* 118 */       int i1 = bnr.a(bor.a.d, 7, 7 + m);
/* 119 */       int i2 = bnr.a(bor.a.d, 7 + k, 7);
/* 120 */       int i3 = bnr.a(bor.a.d, 7 + k, 7 + m);
/* 121 */       int i4 = Math.min(Math.min(n, i1), Math.min(i2, i3));
/*     */       
/* 123 */       if (i4 < 60) {
/* 124 */         this.e = false;
/*     */         
/*     */         return;
/*     */       } 
/* 128 */       el el = new el(i * 16 + 8, i4 + 1, j * 16 + 8);
/* 129 */       List<bxi.i> list = Lists.newLinkedList();
/* 130 */       bxi.a(☃.s_().h(), el, bhb, list, boz1);
/* 131 */       this.a.addAll((Collection)list);
/*     */       
/* 133 */       a(☃);
/*     */       
/* 135 */       this.e = true;
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(axz ☃, Random random, bwf bwf1, axm axm1) {
/* 140 */       super.a(☃, random, bwf1, axm1);
/*     */ 
/*     */       
/* 143 */       int i = this.b.b;
/* 144 */       for (int j = bwf1.a; j <= bwf1.d; j++) {
/* 145 */         for (int k = bwf1.c; k <= bwf1.f; k++) {
/* 146 */           el el = new el(j, i, k);
/* 147 */           if (!☃.c(el) && this.b.b(el)) {
/*     */             
/* 149 */             boolean bool = false;
/* 150 */             for (bxb bxb : this.a) {
/* 151 */               if (bxb.d().b(el)) {
/* 152 */                 bool = true;
/*     */                 break;
/*     */               } 
/*     */             } 
/* 156 */             if (bool)
/*     */             {
/*     */               
/* 159 */               for (int m = i - 1; m > 1; ) {
/* 160 */                 el el1 = new el(j, m, k);
/* 161 */                 if (☃.c(el1) || ☃.a_(el1).d().a()) {
/* 162 */                   ☃.a(el1, bct.m.p(), 2);
/*     */                   m--;
/*     */                 } 
/*     */               } 
/*     */             }
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean b() {
/* 174 */       return this.e;
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bua.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */