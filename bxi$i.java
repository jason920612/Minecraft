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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class i
/*     */   extends bxe
/*     */ {
/*     */   private String d;
/*     */   private bhb e;
/*     */   private bfz f;
/*     */   
/*     */   public i() {}
/*     */   
/*     */   public i(bxm ☃, String str, el el1, bhb bhb1) {
/*  44 */     this(☃, str, el1, bhb1, bfz.a);
/*     */   }
/*     */   
/*     */   public i(bxm ☃, String str, el el1, bhb bhb1, bfz bfz1) {
/*  48 */     super(0);
/*     */     
/*  50 */     this.d = str;
/*  51 */     this.c = el1;
/*  52 */     this.e = bhb1;
/*  53 */     this.f = bfz1;
/*     */     
/*  55 */     a(☃);
/*     */   }
/*     */   
/*     */   private void a(bxm ☃) {
/*  59 */     bxp bxp = ☃.a(new pc("woodland_mansion/" + this.d));
/*  60 */     bxn bxn = (new bxn()).a(true).a(this.e).a(this.f);
/*     */     
/*  62 */     a(bxp, this.c, bxn);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(gy ☃) {
/*  67 */     super.a(☃);
/*     */     
/*  69 */     ☃.a("Template", this.d);
/*  70 */     ☃.a("Rot", this.b.c().name());
/*  71 */     ☃.a("Mi", this.b.b().name());
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(gy ☃, bxm bxm1) {
/*  76 */     super.a(☃, bxm1);
/*     */     
/*  78 */     this.d = ☃.l("Template");
/*  79 */     this.e = bhb.valueOf(☃.l("Rot"));
/*  80 */     this.f = bfz.valueOf(☃.l("Mi"));
/*     */     
/*  82 */     a(bxm1);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(String ☃, el el1, axz axz1, Random random, bwf bwf1) {
/*  87 */     if (☃.startsWith("Chest")) {
/*  88 */       bhb bhb1 = this.b.c();
/*  89 */       blc blc = bct.ck.p();
/*  90 */       if ("ChestWest".equals(☃)) {
/*  91 */         blc = blc.a(bdh.a, bhb1.a(eq.e));
/*  92 */       } else if ("ChestEast".equals(☃)) {
/*  93 */         blc = blc.a(bdh.a, bhb1.a(eq.f));
/*  94 */       } else if ("ChestSouth".equals(☃)) {
/*  95 */         blc = blc.a(bdh.a, bhb1.a(eq.d));
/*  96 */       } else if ("ChestNorth".equals(☃)) {
/*  97 */         blc = blc.a(bdh.a, bhb1.a(eq.c));
/*     */       } 
/*  99 */       a(axz1, bwf1, random, el1, ccl.o, blc);
/* 100 */     } else if ("Mage".equals(☃)) {
/* 101 */       amz amz = new amz(axz1.f());
/* 102 */       amz.di();
/* 103 */       amz.a(el1, 0.0F, 0.0F);
/* 104 */       axz1.a(amz);
/* 105 */       axz1.a(el1, bct.a.p(), 2);
/* 106 */     } else if ("Warrior".equals(☃)) {
/* 107 */       ant ant = new ant(axz1.f());
/* 108 */       ant.di();
/* 109 */       ant.a(el1, 0.0F, 0.0F);
/* 110 */       ant.a(axz1.h(new el(ant)), (afj)null, (gy)null);
/* 111 */       axz1.a(ant);
/* 112 */       axz1.a(el1, bct.a.p(), 2);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bxi$i.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */