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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class a
/*     */   extends bxe
/*     */ {
/*     */   private bhb d;
/*     */   private pc e;
/*     */   private boolean f;
/*     */   
/*     */   public a() {}
/*     */   
/*     */   public a(bxm ☃, pc pc1, el el1, bhb bhb1, boolean bool) {
/*  82 */     super(0);
/*     */     
/*  84 */     this.c = el1;
/*  85 */     this.d = bhb1;
/*  86 */     this.e = pc1;
/*  87 */     this.f = bool;
/*  88 */     a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(gy ☃) {
/*  93 */     super.a(☃);
/*  94 */     ☃.a("Template", this.e.toString());
/*  95 */     ☃.a("isBeached", this.f);
/*  96 */     ☃.a("Rot", this.d.name());
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(gy ☃, bxm bxm1) {
/* 101 */     super.a(☃, bxm1);
/* 102 */     this.e = new pc(☃.l("Template"));
/* 103 */     this.f = ☃.q("isBeached");
/* 104 */     this.d = bhb.valueOf(☃.l("Rot"));
/* 105 */     a(bxm1);
/*     */   }
/*     */   
/*     */   private void a(bxm ☃) {
/* 109 */     bxp bxp = ☃.a(this.e);
/* 110 */     bxn bxn = (new bxn()).a(this.d).a(bct.a).a(bfz.a).a(bww.b());
/* 111 */     a(bxp, this.c, bxn);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(String ☃, el el1, axz axz1, Random random, bwf bwf1) {
/* 116 */     if ("map_chest".equals(☃)) {
/* 117 */       bka.a(axz1, random, el1.b(), ccl.s);
/* 118 */     } else if ("treasure_chest".equals(☃)) {
/* 119 */       bka.a(axz1, random, el1.b(), ccl.u);
/* 120 */     } else if ("supply_chest".equals(☃)) {
/* 121 */       bka.a(axz1, random, el1.b(), ccl.t);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(axz ☃, Random random, bwf bwf1, axm axm1) {
/* 127 */     int i = 256;
/* 128 */     int j = 0;
/* 129 */     el el = this.c.a(this.a.a().o() - 1, 0, this.a.a().q() - 1);
/* 130 */     for (el el1 : el.a(this.c, el)) {
/* 131 */       int m = ☃.a(this.f ? bor.a.a : bor.a.b, el1.o(), el1.q());
/* 132 */       j += m;
/* 133 */       i = Math.min(i, m);
/*     */     } 
/* 135 */     j /= this.a.a().o() * this.a.a().q();
/*     */     
/* 137 */     int k = this.f ? (i - this.a.a().p() / 2 - random.nextInt(3)) : j;
/* 138 */     this.c = new el(this.c.o(), k, this.c.q());
/* 139 */     return super.a(☃, random, bwf1, axm1);
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bww$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */