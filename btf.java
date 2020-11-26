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
/*     */ public class btf
/*     */   extends bqo<brz>
/*     */ {
/*     */   private boolean a;
/*     */   private a b;
/*     */   private el c;
/*     */   
/*     */   public void a(a ☃) {
/*  27 */     this.b = ☃;
/*     */   }
/*     */   
/*     */   public void a(boolean ☃) {
/*  31 */     this.a = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(axz ☃, bmy<? extends bom> bmy1, Random random, el el1, brz brz1) {
/*  36 */     if (this.b == null) {
/*  37 */       throw new IllegalStateException("Decoration requires priming with a spike");
/*     */     }
/*     */     
/*  40 */     int i = this.b.c();
/*  41 */     for (el.a a1 : el.b(new el(el1.o() - i, 0, el1.q() - i), new el(el1.o() + i, this.b.d() + 10, el1.q() + i))) {
/*  42 */       if (a1.f(el1.o(), a1.p(), el1.q()) <= (i * i + 1) && a1.p() < this.b.d()) {
/*  43 */         a(☃, a1, bct.ce.p()); continue;
/*  44 */       }  if (a1.p() > 65) {
/*  45 */         a(☃, a1, bct.a.p());
/*     */       }
/*     */     } 
/*     */     
/*  49 */     if (this.b.e()) {
/*  50 */       int j = -2;
/*  51 */       int k = 2;
/*  52 */       int m = 3;
/*     */       
/*  54 */       el.a a1 = new el.a();
/*  55 */       for (int n = -2; n <= 2; n++) {
/*  56 */         for (int i1 = -2; i1 <= 2; i1++) {
/*  57 */           for (int i2 = 0; i2 <= 3; i2++) {
/*  58 */             boolean bool1 = (xq.a(n) == 2);
/*  59 */             boolean bool2 = (xq.a(i1) == 2);
/*  60 */             boolean bool3 = (i2 == 3);
/*     */             
/*  62 */             if (bool1 || bool2 || bool3) {
/*  63 */               boolean bool4 = (n == -2 || n == 2 || bool3);
/*  64 */               boolean bool5 = (i1 == -2 || i1 == 2 || bool3);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               
/*  70 */               blc blc = bct.dF.p().a(bfm.a, Boolean.valueOf((bool4 && i1 != -2))).a(bfm.c, Boolean.valueOf((bool4 && i1 != 2))).a(bfm.o, Boolean.valueOf((bool5 && n != -2))).a(bfm.b, Boolean.valueOf((bool5 && n != 2)));
/*     */               
/*  72 */               a(☃, a1.c(el1.o() + n, this.b.d() + i2, el1.q() + i1), blc);
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/*  79 */     alc alc = new alc(☃.f());
/*  80 */     alc.a(this.c);
/*  81 */     alc.l(this.a);
/*  82 */     alc.b((el1.o() + 0.5F), (this.b.d() + 1), (el1.q() + 0.5F), random.nextFloat() * 360.0F, 0.0F);
/*  83 */     ☃.a(alc);
/*  84 */     a(☃, new el(el1.o(), this.b.d(), el1.q()), bct.z.p());
/*     */     
/*  86 */     return true;
/*     */   }
/*     */   
/*     */   public void a(@Nullable el ☃) {
/*  90 */     this.c = ☃;
/*     */   }
/*     */   
/*     */   public static class a {
/*     */     private final int a;
/*     */     private final int b;
/*     */     private final int c;
/*     */     private final int d;
/*     */     private final boolean e;
/*     */     private final cea f;
/*     */     
/*     */     public a(int ☃, int i, int j, int k, boolean bool) {
/* 102 */       this.a = ☃;
/* 103 */       this.b = i;
/* 104 */       this.c = j;
/* 105 */       this.d = k;
/* 106 */       this.e = bool;
/*     */       
/* 108 */       this.f = new cea((☃ - j), 0.0D, (i - j), (☃ + j), 256.0D, (i + j));
/*     */     }
/*     */     
/*     */     public boolean a(el ☃) {
/* 112 */       int i = this.a - this.c;
/* 113 */       int j = this.b - this.c;
/* 114 */       return (☃.o() == (i & 0xFFFFFFF0) && ☃.q() == (j & 0xFFFFFFF0));
/*     */     }
/*     */     
/*     */     public int a() {
/* 118 */       return this.a;
/*     */     }
/*     */     
/*     */     public int b() {
/* 122 */       return this.b;
/*     */     }
/*     */     
/*     */     public int c() {
/* 126 */       return this.c;
/*     */     }
/*     */     
/*     */     public int d() {
/* 130 */       return this.d;
/*     */     }
/*     */     
/*     */     public boolean e() {
/* 134 */       return this.e;
/*     */     }
/*     */     
/*     */     public cea f() {
/* 138 */       return this.f;
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\btf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */