/*     */ import java.util.Map;
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
/*     */ public abstract class bxe
/*     */   extends bxb
/*     */ {
/*  20 */   private static final bxn d = new bxn();
/*     */   
/*     */   protected bxp a;
/*  23 */   protected bxn b = d.a(true).a(bct.a);
/*     */   
/*     */   protected el c;
/*     */ 
/*     */   
/*     */   public bxe() {}
/*     */   
/*     */   public bxe(int ☃) {
/*  31 */     super(☃);
/*     */   }
/*     */   
/*     */   protected void a(bxp ☃, el el1, bxn bxn1) {
/*  35 */     this.a = ☃;
/*  36 */     a(eq.c);
/*  37 */     this.c = el1;
/*  38 */     this.b = bxn1;
/*     */     
/*  40 */     b();
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(gy ☃) {
/*  45 */     ☃.b("TPX", this.c.o());
/*  46 */     ☃.b("TPY", this.c.p());
/*  47 */     ☃.b("TPZ", this.c.q());
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(gy ☃, bxm bxm1) {
/*  52 */     this.c = new el(☃.h("TPX"), ☃.h("TPY"), ☃.h("TPZ"));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(axz ☃, Random random, bwf bwf1, axm axm1) {
/*  57 */     this.b.a(bwf1);
/*     */     
/*  59 */     if (this.a.a(☃, this.c, this.b, 2)) {
/*  60 */       Map<el, String> map = this.a.a(this.c, this.b);
/*  61 */       for (Map.Entry<el, String> entry : map.entrySet()) {
/*  62 */         String str = entry.getValue();
/*  63 */         a(str, entry.getKey(), ☃, random, bwf1);
/*     */       } 
/*     */     } 
/*     */     
/*  67 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   private void b() {
/*     */     el el3;
/*  73 */     bhb ☃ = this.b.c();
/*  74 */     el el1 = this.b.d();
/*  75 */     el el2 = this.a.a(☃);
/*  76 */     bfz bfz = this.b.b();
/*     */     
/*  78 */     int i = el1.o();
/*  79 */     int j = el1.q();
/*  80 */     int k = el2.o() - 1;
/*  81 */     int m = el2.p() - 1;
/*  82 */     int n = el2.q() - 1;
/*     */     
/*  84 */     switch (null.a[☃.ordinal()]) {
/*     */       case 1:
/*  86 */         this.n = new bwf(0, 0, 0, k, m, n);
/*     */         break;
/*     */       case 2:
/*  89 */         this.n = new bwf(i + i - k, 0, j + j - n, i + i, m, j + j);
/*     */         break;
/*     */       case 3:
/*  92 */         this.n = new bwf(i - j, 0, i + j - n, i - j + k, m, i + j);
/*     */         break;
/*     */       case 4:
/*  95 */         this.n = new bwf(i + j - k, 0, j - i, i + j, m, j - i + n);
/*     */         break;
/*     */     } 
/*  98 */     switch (null.b[bfz.ordinal()]) {
/*     */ 
/*     */       
/*     */       case 2:
/* 102 */         el3 = el.a;
/* 103 */         if (☃ == bhb.b || ☃ == bhb.d) {
/* 104 */           el3 = el3.a(☃.a(eq.e), n);
/* 105 */         } else if (☃ == bhb.c) {
/* 106 */           el3 = el3.a(eq.f, k);
/*     */         } else {
/* 108 */           el3 = el3.a(eq.e, k);
/*     */         } 
/* 110 */         this.n.a(el3.o(), 0, el3.q());
/*     */         break;
/*     */       
/*     */       case 3:
/* 114 */         el3 = el.a;
/* 115 */         if (☃ == bhb.b || ☃ == bhb.d) {
/* 116 */           el3 = el3.a(☃.a(eq.c), k);
/* 117 */         } else if (☃ == bhb.c) {
/* 118 */           el3 = el3.a(eq.d, n);
/*     */         } else {
/* 120 */           el3 = el3.a(eq.c, n);
/*     */         } 
/* 122 */         this.n.a(el3.o(), 0, el3.q());
/*     */         break;
/*     */     } 
/*     */     
/* 126 */     this.n.a(this.c.o(), this.c.p(), this.c.q());
/*     */   }
/*     */   protected abstract void a(String paramString, el paramel, axz paramaxz, Random paramRandom, bwf parambwf);
/*     */   
/*     */   public void a(int ☃, int i, int j) {
/* 131 */     super.a(☃, i, j);
/* 132 */     this.c = this.c.a(☃, i, j);
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bxe.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */