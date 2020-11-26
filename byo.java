/*     */ import it.unimi.dsi.fastutil.ints.IntArrayFIFOQueue;
/*     */ import it.unimi.dsi.fastutil.ints.IntPriorityQueue;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class byo
/*     */   implements byq
/*     */ {
/*  18 */   private static final Logger a = LogManager.getLogger();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  41 */   private static final eq[] b = eq.values();
/*     */   
/*  43 */   private final IntPriorityQueue c = (IntPriorityQueue)new IntArrayFIFOQueue(786);
/*     */   
/*     */   public int a(ayc ☃, el el1) {
/*  46 */     return ☃.a(a(), el1);
/*     */   }
/*     */   
/*     */   public void a(ayh ☃, el el1, int i) {
/*  50 */     ☃.a(a(), el1, i);
/*     */   }
/*     */   
/*     */   protected int a(axk ☃, el el1) {
/*  54 */     return ☃.a_(el1).b(☃, el1);
/*     */   }
/*     */   
/*     */   protected int b(axk ☃, el el1) {
/*  58 */     return ☃.a_(el1).e();
/*     */   }
/*     */   
/*     */   private int a(@Nullable eq ☃, int i, int j, int k, int m) {
/*  62 */     int n = 7;
/*  63 */     if (☃ != null) {
/*  64 */       n = ☃.ordinal();
/*     */     }
/*     */     
/*  67 */     return n << 24 | i << 18 | j << 10 | k << 4 | m << 0;
/*     */   }
/*     */   
/*     */   private int a(int ☃) {
/*  71 */     return ☃ >> 18 & 0x3F;
/*     */   }
/*     */   
/*     */   private int b(int ☃) {
/*  75 */     return ☃ >> 10 & 0xFF;
/*     */   }
/*     */   
/*     */   private int c(int ☃) {
/*  79 */     return ☃ >> 4 & 0x3F;
/*     */   }
/*     */   
/*     */   private int d(int ☃) {
/*  83 */     return ☃ >> 0 & 0xF;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private eq e(int ☃) {
/*  88 */     int i = ☃ >> 24 & 0x7;
/*  89 */     if (i == 7) {
/*  90 */       return null;
/*     */     }
/*  92 */     return eq.values()[☃ >> 24 & 0x7];
/*     */   }
/*     */   
/*     */   protected void a(axz ☃, axm axm1) {
/*  96 */     try (el.b ☃ = el.b.r()) {
/*  97 */       while (!this.c.isEmpty()) {
/*  98 */         int i = this.c.dequeueInt();
/*  99 */         int j = d(i);
/* 100 */         int k = a(i) - 16;
/* 101 */         int m = b(i);
/* 102 */         int n = c(i) - 16;
/* 103 */         eq eq1 = e(i);
/*     */         
/* 105 */         for (eq eq2 : b) {
/* 106 */           if (eq2 != eq1) {
/*     */ 
/*     */ 
/*     */             
/* 110 */             int i1 = k + eq2.g();
/* 111 */             int i2 = m + eq2.h();
/* 112 */             int i3 = n + eq2.i();
/*     */             
/* 114 */             if (i2 <= 255 && i2 >= 0) {
/*     */ 
/*     */ 
/*     */               
/* 118 */               b.f(i1 + axm1.d(), i2, i3 + axm1.e());
/* 119 */               int i4 = a(☃, b);
/* 120 */               int i5 = j - Math.max(i4, 1);
/*     */               
/* 122 */               if (i5 > 0 && i5 > a(☃, b)) {
/* 123 */                 a(☃, b, i5);
/* 124 */                 a(axm1, b, i5);
/*     */               } 
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   } protected void a(axm ☃, int i, int j, int k, int m) {
/* 132 */     int n = i - ☃.d() + 16;
/* 133 */     int i1 = k - ☃.e() + 16;
/* 134 */     this.c.enqueue(a((eq)null, n, j, i1, m));
/*     */   }
/*     */   
/*     */   protected void a(axm ☃, el el1, int i) {
/* 138 */     a(☃, el1.o(), el1.p(), el1.q(), i);
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\byo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */