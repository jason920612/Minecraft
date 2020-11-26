/*    */ import java.util.List;
/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class are
/*    */   extends ata
/*    */ {
/*    */   public are(ata.a ☃) {
/* 21 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public adm a(aup ☃) {
/* 26 */     eq eq = ☃.l();
/* 27 */     if (eq == eq.a) {
/* 28 */       return adm.c;
/*    */     }
/*    */     
/* 31 */     axy axy = ☃.k();
/* 32 */     ark ark = new ark(☃);
/* 33 */     el el1 = ark.a();
/*    */     
/* 35 */     el el2 = el1.a();
/* 36 */     if (!ark.b() || !axy.a_(el2).a(ark)) {
/* 37 */       return adm.c;
/*    */     }
/*    */     
/* 40 */     double d1 = el1.o();
/* 41 */     double d2 = el1.p();
/* 42 */     double d3 = el1.q();
/*    */     
/* 44 */     List<aer> list = axy.a((aer)null, new cea(d1, d2, d3, d1 + 1.0D, d2 + 2.0D, d3 + 1.0D));
/* 45 */     if (!list.isEmpty()) {
/* 46 */       return adm.c;
/*    */     }
/*    */     
/* 49 */     ate ate = ☃.i();
/* 50 */     if (!axy.B) {
/*    */       
/* 52 */       axy.g(el1);
/* 53 */       axy.g(el2);
/*    */       
/* 55 */       alz alz = new alz(axy, d1 + 0.5D, d2, d3 + 0.5D);
/* 56 */       float f = xq.d((xq.g(☃.h() - 180.0F) + 22.5F) / 45.0F) * 45.0F;
/* 57 */       alz.b(d1 + 0.5D, d2, d3 + 0.5D, f, 0.0F);
/* 58 */       a(alz, axy.s);
/* 59 */       aev.a(axy, ☃.j(), alz, ate.n());
/* 60 */       axy.a(alz);
/*    */       
/* 62 */       axy.a((aog)null, alz.q, alz.r, alz.s, wj.A, wk.e, 0.75F, 0.8F);
/*    */     } 
/*    */     
/* 65 */     ate.g(1);
/* 66 */     return adm.a;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private void a(alz ☃, Random random) {
/* 75 */     fd fd1 = ☃.r();
/* 76 */     float f1 = random.nextFloat() * 5.0F;
/* 77 */     float f2 = random.nextFloat() * 20.0F - 10.0F;
/* 78 */     fd fd2 = new fd(fd1.b() + f1, fd1.c() + f2, fd1.d());
/* 79 */     ☃.a(fd2);
/*    */     
/* 81 */     fd1 = ☃.s();
/* 82 */     f1 = random.nextFloat() * 10.0F - 5.0F;
/* 83 */     fd2 = new fd(fd1.b(), fd1.c() + f1, fd1.d());
/* 84 */     ☃.b(fd2);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\are.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */