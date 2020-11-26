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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bja
/*     */   extends bhk
/*     */ {
/*     */   private static bli c;
/*     */   private static bli o;
/*     */   
/*     */   protected bja(bcs.c ☃) {
/*  31 */     super(bhk.b.b, ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(axy ☃, el el1, blc blc1, @Nullable afa afa1, ate ate1) {
/*  36 */     super.a(☃, el1, blc1, afa1, ate1);
/*     */     
/*  38 */     bji bji = ☃.f(el1);
/*  39 */     if (bji instanceof bkd) {
/*  40 */       a(☃, el1, (bkd)bji);
/*     */     }
/*     */   }
/*     */   
/*     */   public static void a(axy ☃, el el1, bkd bkd1) {
/*  45 */     bcs bcs = bkd1.w().c();
/*  46 */     boolean bool = (bcs == bct.fe || bcs == bct.fd);
/*  47 */     if (!bool || el1.p() < 2 || ☃.aj() == adi.a || ☃.B) {
/*     */       return;
/*     */     }
/*     */     
/*  51 */     bli bli1 = d();
/*  52 */     bli.b b = bli1.a(☃, el1);
/*  53 */     if (b == null) {
/*     */       return;
/*     */     }
/*     */     
/*     */     int i;
/*  58 */     for (i = 0; i < 3; i++) {
/*  59 */       bkd.a(☃, b.a(i, 0, 0).d());
/*     */     }
/*  61 */     for (i = 0; i < bli1.c(); i++) {
/*  62 */       for (int k = 0; k < bli1.b(); k++) {
/*  63 */         ☃.a(b.a(i, k, 0).d(), bct.a.p(), 2);
/*     */       }
/*     */     } 
/*     */     
/*  67 */     el el2 = b.a(1, 0, 0).d();
/*     */     
/*  69 */     alx alx = new alx(☃);
/*  70 */     el el3 = b.a(1, 2, 0).d();
/*  71 */     alx.b(el3.o() + 0.5D, el3.p() + 0.55D, el3.q() + 0.5D, (b.b().k() == eq.a.a) ? 0.0F : 90.0F, 0.0F);
/*  72 */     alx.aQ = (b.b().k() == eq.a.a) ? 0.0F : 90.0F;
/*  73 */     alx.l();
/*     */     
/*  75 */     for (tf tf : ☃.<tf>a(tf.class, alx.bD().g(50.0D))) {
/*  76 */       p.n.a(tf, alx);
/*     */     }
/*     */     
/*  79 */     ☃.a(alx);
/*     */     int j;
/*  81 */     for (j = 0; j < 120; j++) {
/*  82 */       ☃.a(fm.E, el2.o() + ☃.s.nextDouble(), (el2.p() - 2) + ☃.s.nextDouble() * 3.9D, el2.q() + ☃.s.nextDouble(), 0.0D, 0.0D, 0.0D);
/*     */     }
/*     */     
/*  85 */     for (j = 0; j < bli1.c(); j++) {
/*  86 */       for (int k = 0; k < bli1.b(); k++) {
/*  87 */         ☃.a(b.a(j, k, 0).d(), bct.a);
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public static boolean b(axy ☃, el el1, ate ate1) {
/*  93 */     if (ate1.b() == atf.dJ && el1.p() >= 2 && ☃.aj() != adi.a && !☃.B) {
/*  94 */       return (e().a(☃, el1) != null);
/*     */     }
/*     */     
/*  97 */     return false;
/*     */   }
/*     */   
/*     */   protected static bli d() {
/* 101 */     if (c == null)
/*     */     {
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
/* 113 */       c = blj.a().a(new String[] { "^^^", "###", "~#~" }).a('#', blh.a(blp.a(bct.df))).a('^', blh.a(blp.a(bct.fe).or(blp.a(bct.fd)))).a('~', blh.a(bln.a(bza.a))).b();
/*     */     }
/*     */     
/* 116 */     return c;
/*     */   }
/*     */   
/*     */   protected static bli e() {
/* 120 */     if (o == null)
/*     */     {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 129 */       o = blj.a().a(new String[] { "   ", "###", "~#~" }).a('#', blh.a(blp.a(bct.df))).a('~', blh.a(bln.a(bza.a))).b();
/*     */     }
/*     */     
/* 132 */     return o;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bja.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */