/*     */ import com.google.common.collect.ImmutableMap;
/*     */ import java.util.List;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bwn
/*     */ {
/*  30 */   private static final pc a = new pc("igloo/top");
/*  31 */   private static final pc b = new pc("igloo/middle");
/*  32 */   private static final pc c = new pc("igloo/bottom");
/*     */   
/*  34 */   private static final Map<pc, el> d = (Map<pc, el>)ImmutableMap.of(a, new el(3, 5, 5), b, new el(1, 3, 1), c, new el(3, 6, 7));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  40 */   private static final Map<pc, el> e = (Map<pc, el>)ImmutableMap.of(a, new el(0, 0, 0), b, new el(2, -3, 4), c, new el(0, -3, -2));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void a() {
/*  47 */     bwy.a((Class)a.class, "Iglu");
/*     */   }
/*     */   
/*     */   public static void a(bxm ☃, el el1, bhb bhb1, List<bxb> list, Random random, brf brf1) {
/*  51 */     if (random.nextDouble() < 0.5D) {
/*  52 */       int i = random.nextInt(8) + 4;
/*  53 */       list.add(new a(☃, c, el1, bhb1, i * 3));
/*  54 */       for (int j = 0; j < i - 1; j++) {
/*  55 */         list.add(new a(☃, b, el1, bhb1, j * 3));
/*     */       }
/*     */     } 
/*     */     
/*  59 */     list.add(new a(☃, a, el1, bhb1, 0));
/*     */   }
/*     */   
/*     */   public static class a
/*     */     extends bxe
/*     */   {
/*     */     private pc d;
/*     */     private bhb e;
/*     */     
/*     */     public a() {}
/*     */     
/*     */     public a(bxm ☃, pc pc1, el el1, bhb bhb1, int i) {
/*  71 */       super(0);
/*  72 */       this.d = pc1;
/*  73 */       el el2 = (el)bwn.b().get(pc1);
/*  74 */       this.c = el1.a(el2.o(), el2.p() - i, el2.q());
/*  75 */       this.e = bhb1;
/*  76 */       a(☃);
/*     */     }
/*     */     
/*     */     private void a(bxm ☃) {
/*  80 */       bxp bxp = ☃.a(this.d);
/*  81 */       bxn bxn = (new bxn()).a(this.e).a(bfz.a).a((el)bwn.c().get(this.d));
/*  82 */       a(bxp, this.c, bxn);
/*     */     }
/*     */ 
/*     */     
/*     */     protected void a(gy ☃) {
/*  87 */       super.a(☃);
/*  88 */       ☃.a("Template", this.d.toString());
/*  89 */       ☃.a("Rot", this.e.name());
/*     */     }
/*     */ 
/*     */     
/*     */     protected void a(gy ☃, bxm bxm1) {
/*  94 */       super.a(☃, bxm1);
/*  95 */       this.d = new pc(☃.l("Template"));
/*  96 */       this.e = bhb.valueOf(☃.l("Rot"));
/*  97 */       a(bxm1);
/*     */     }
/*     */ 
/*     */     
/*     */     protected void a(String ☃, el el1, axz axz1, Random random, bwf bwf1) {
/* 102 */       if (!"chest".equals(☃)) {
/*     */         return;
/*     */       }
/*     */       
/* 106 */       axz1.a(el1, bct.a.p(), 3);
/* 107 */       bji bji = axz1.f(el1.b());
/* 108 */       if (bji instanceof bjl) {
/* 109 */         ((bjl)bji).a(ccl.n, random.nextLong());
/*     */       }
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a(axz ☃, Random random, bwf bwf1, axm axm1) {
/* 115 */       bxn bxn = (new bxn()).a(this.e).a(bfz.a).a((el)bwn.c().get(this.d));
/*     */       
/* 117 */       el el1 = (el)bwn.b().get(this.d);
/* 118 */       el el2 = this.c.a(bxp.a(bxn, new el(3 - el1.o(), 0, 0 - el1.q())));
/* 119 */       int i = ☃.a(bor.a.a, el2.o(), el2.q());
/* 120 */       el el3 = this.c;
/* 121 */       this.c = this.c.a(0, i - 90 - 1, 0);
/*     */       
/* 123 */       boolean bool = super.a(☃, random, bwf1, axm1);
/*     */       
/* 125 */       if (this.d.equals(bwn.d())) {
/* 126 */         el el = this.c.a(bxp.a(bxn, new el(3, 0, 5)));
/* 127 */         blc blc = ☃.a_(el.b());
/* 128 */         if (!blc.f() && blc.c() != bct.cz) {
/* 129 */           ☃.a(el, bct.cS.p(), 3);
/*     */         }
/*     */       } 
/*     */       
/* 133 */       this.c = el3;
/* 134 */       return bool;
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bwn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */