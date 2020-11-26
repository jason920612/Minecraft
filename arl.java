/*    */ import java.util.List;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ public class arl
/*    */   extends ata
/*    */ {
/*    */   private final apj.b a;
/*    */   
/*    */   public arl(apj.b ☃, ata.a a1) {
/* 25 */     super(a1);
/* 26 */     this.a = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public adn<ate> a(axy ☃, aog aog1, adk adk1) {
/* 31 */     ate ate = aog1.b(adk1);
/* 32 */     float f1 = 1.0F;
/*    */     
/* 34 */     float f2 = aog1.z + (aog1.x - aog1.z) * 1.0F;
/* 35 */     float f3 = aog1.y + (aog1.w - aog1.y) * 1.0F;
/*    */     
/* 37 */     double d1 = aog1.n + (aog1.q - aog1.n) * 1.0D;
/* 38 */     double d2 = aog1.o + (aog1.r - aog1.o) * 1.0D + aog1.bF();
/* 39 */     double d3 = aog1.p + (aog1.s - aog1.p) * 1.0D;
/*    */     
/* 41 */     cee cee1 = new cee(d1, d2, d3);
/*    */     
/* 43 */     float f4 = xq.b(-f3 * 0.017453292F - 3.1415927F);
/* 44 */     float f5 = xq.a(-f3 * 0.017453292F - 3.1415927F);
/* 45 */     float f6 = -xq.b(-f2 * 0.017453292F);
/* 46 */     float f7 = xq.a(-f2 * 0.017453292F);
/*    */     
/* 48 */     float f8 = f5 * f6;
/* 49 */     float f9 = f7;
/* 50 */     float f10 = f4 * f6;
/*    */     
/* 52 */     double d4 = 5.0D;
/* 53 */     cee cee2 = cee1.b(f8 * 5.0D, f9 * 5.0D, f10 * 5.0D);
/* 54 */     ceb ceb = ☃.a(cee1, cee2, cec.c);
/* 55 */     if (ceb == null) {
/* 56 */       return new adn<>(adm.b, ate);
/*    */     }
/*    */ 
/*    */     
/* 60 */     cee cee3 = aog1.f(1.0F);
/* 61 */     boolean bool = false;
/* 62 */     List<aer> list = ☃.a(aog1, aog1.bD().b(cee3.b * 5.0D, cee3.c * 5.0D, cee3.d * 5.0D).g(1.0D));
/* 63 */     for (int i = 0; i < list.size(); i++) {
/* 64 */       aer aer = list.get(i);
/* 65 */       if (aer.aB()) {
/*    */ 
/*    */ 
/*    */         
/* 69 */         cea cea = aer.bD().g(aer.aM());
/* 70 */         if (cea.b(cee1))
/* 71 */           bool = true; 
/*    */       } 
/*    */     } 
/* 74 */     if (bool) {
/* 75 */       return new adn<>(adm.b, ate);
/*    */     }
/*    */     
/* 78 */     if (ceb.a == ceb.a.b) {
/* 79 */       el el = ceb.a();
/* 80 */       bcs bcs = ☃.a_(el).c();
/*    */ 
/*    */       
/* 83 */       apj apj = new apj(☃, ceb.c.b, ceb.c.c, ceb.c.d);
/* 84 */       apj.a(this.a);
/* 85 */       apj.w = aog1.w;
/* 86 */       if (!☃.c(apj, apj.bD().g(-0.1D))) {
/* 87 */         return new adn<>(adm.c, ate);
/*    */       }
/* 89 */       if (!☃.B) {
/* 90 */         ☃.a(apj);
/*    */       }
/* 92 */       if (!aog1.bV.d) {
/* 93 */         ate.g(1);
/*    */       }
/* 95 */       aog1.b(ws.c.b(this));
/* 96 */       return new adn<>(adm.a, ate);
/*    */     } 
/*    */     
/* 99 */     return new adn<>(adm.b, ate);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\arl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */