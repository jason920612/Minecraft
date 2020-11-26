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
/*     */ public class a
/*     */   extends bxe
/*     */ {
/*     */   private String d;
/*     */   private bhb e;
/*     */   private boolean f;
/*     */   
/*     */   public a() {}
/*     */   
/*     */   public a(bxm ☃, String str, el el1, bhb bhb1, boolean bool) {
/*  53 */     super(0);
/*     */     
/*  55 */     this.d = str;
/*  56 */     this.c = el1;
/*  57 */     this.e = bhb1;
/*  58 */     this.f = bool;
/*     */     
/*  60 */     a(☃);
/*     */   }
/*     */   
/*     */   private void a(bxm ☃) {
/*  64 */     bxp bxp = ☃.a(new pc("end_city/" + this.d));
/*  65 */     bxn bxn = (this.f ? bwl.b() : bwl.c()).a().a(this.e);
/*     */     
/*  67 */     a(bxp, this.c, bxn);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(gy ☃) {
/*  72 */     super.a(☃);
/*     */     
/*  74 */     ☃.a("Template", this.d);
/*  75 */     ☃.a("Rot", this.e.name());
/*  76 */     ☃.a("OW", this.f);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(gy ☃, bxm bxm1) {
/*  81 */     super.a(☃, bxm1);
/*     */     
/*  83 */     this.d = ☃.l("Template");
/*  84 */     this.e = bhb.valueOf(☃.l("Rot"));
/*  85 */     this.f = ☃.q("OW");
/*     */     
/*  87 */     a(bxm1);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(String ☃, el el1, axz axz1, Random random, bwf bwf1) {
/*  92 */     if (☃.startsWith("Chest")) {
/*  93 */       el el2 = el1.b();
/*     */       
/*  95 */       if (bwf1.b(el2)) {
/*  96 */         bka.a(axz1, random, el2, ccl.c);
/*     */       }
/*  98 */     } else if (☃.startsWith("Sentry")) {
/*  99 */       anl anl = new anl(axz1.f());
/* 100 */       anl.b(el1.o() + 0.5D, el1.p() + 0.5D, el1.q() + 0.5D);
/* 101 */       anl.g(el1);
/* 102 */       axz1.a(anl);
/* 103 */     } else if (☃.startsWith("Elytra")) {
/* 104 */       amb amb = new amb(axz1.f(), el1, this.e.a(eq.d));
/* 105 */       amb.b(new ate(atf.eL));
/* 106 */       axz1.a(amb);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bwl$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */