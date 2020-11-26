/*     */ import com.google.common.collect.Sets;
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
/*     */ public class cbg
/*     */ {
/*  14 */   private final caz a = new caz();
/*  15 */   private final Set<cbc> b = Sets.newHashSet();
/*  16 */   private final cbc[] c = new cbc[32];
/*     */   private cbd d;
/*     */   
/*     */   public cbg(cbd ☃) {
/*  20 */     this.d = ☃;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public cbe a(axk ☃, afb afb1, aer aer1, float f) {
/*  29 */     return a(☃, afb1, aer1.q, (aer1.bD()).b, aer1.s, f);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public cbe a(axk ☃, afb afb1, el el1, float f) {
/*  34 */     return a(☃, afb1, (el1.o() + 0.5F), (el1.p() + 0.5F), (el1.q() + 0.5F), f);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private cbe a(axk ☃, afb afb1, double d1, double d2, double d3, float f) {
/*  39 */     this.a.a();
/*  40 */     this.d.a(☃, afb1);
/*  41 */     cbc cbc1 = this.d.b();
/*  42 */     cbc cbc2 = this.d.a(d1, d2, d3);
/*     */     
/*  44 */     cbe cbe = a(cbc1, cbc2, f);
/*     */     
/*  46 */     this.d.a();
/*  47 */     return cbe;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   private cbe a(cbc ☃, cbc cbc1, float f) {
/*  58 */     ☃.e = 0.0F;
/*  59 */     ☃.f = ☃.c(cbc1);
/*  60 */     ☃.g = ☃.f;
/*     */     
/*  62 */     this.a.a();
/*  63 */     this.b.clear();
/*  64 */     this.a.a(☃);
/*     */     
/*  66 */     cbc cbc2 = ☃;
/*  67 */     int i = 0;
/*     */     
/*  69 */     while (!this.a.e() && ++i < 200) {
/*  70 */       cbc cbc3 = this.a.c();
/*     */       
/*  72 */       if (cbc3.equals(cbc1)) {
/*  73 */         cbc2 = cbc1;
/*     */         
/*     */         break;
/*     */       } 
/*  77 */       if (cbc3.c(cbc1) < cbc2.c(cbc1)) {
/*  78 */         cbc2 = cbc3;
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  84 */       cbc3.i = true;
/*     */       
/*  86 */       int j = this.d.a(this.c, cbc3, cbc1, f);
/*  87 */       for (int k = 0; k < j; k++) {
/*  88 */         cbc cbc4 = this.c[k];
/*     */         
/*  90 */         float f1 = cbc3.c(cbc4);
/*  91 */         cbc3.j += f1;
/*  92 */         cbc4.k = f1 + cbc4.l;
/*     */         
/*  94 */         float f2 = cbc3.e + cbc4.k;
/*  95 */         if (cbc4.j < f && (!cbc4.a() || f2 < cbc4.e)) {
/*  96 */           cbc4.h = cbc3;
/*  97 */           cbc4.e = f2;
/*  98 */           cbc4.f = cbc4.c(cbc1) + cbc4.l;
/*  99 */           if (cbc4.a()) {
/* 100 */             this.a.a(cbc4, cbc4.e + cbc4.f);
/*     */           } else {
/* 102 */             cbc4.g = cbc4.e + cbc4.f;
/* 103 */             this.a.a(cbc4);
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 109 */     if (cbc2 == ☃) {
/* 110 */       return null;
/*     */     }
/*     */     
/* 113 */     cbe cbe = a(☃, cbc2);
/*     */ 
/*     */ 
/*     */     
/* 117 */     return cbe;
/*     */   }
/*     */ 
/*     */   
/*     */   private cbe a(cbc ☃, cbc cbc1) {
/* 122 */     int i = 1;
/* 123 */     cbc cbc2 = cbc1;
/* 124 */     while (cbc2.h != null) {
/* 125 */       i++;
/* 126 */       cbc2 = cbc2.h;
/*     */     } 
/*     */     
/* 129 */     cbc[] arrayOfCbc = new cbc[i];
/* 130 */     cbc2 = cbc1;
/* 131 */     arrayOfCbc[--i] = cbc2;
/* 132 */     while (cbc2.h != null) {
/* 133 */       cbc2 = cbc2.h;
/* 134 */       arrayOfCbc[--i] = cbc2;
/*     */     } 
/* 136 */     return new cbe(arrayOfCbc);
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\cbg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */