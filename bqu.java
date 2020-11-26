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
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bqu
/*    */   extends bqo<brz>
/*    */ {
/* 22 */   private static final pc a = new pc("fossil/spine_1");
/* 23 */   private static final pc b = new pc("fossil/spine_2");
/* 24 */   private static final pc c = new pc("fossil/spine_3");
/* 25 */   private static final pc d = new pc("fossil/spine_4");
/*    */   
/* 27 */   private static final pc aH = new pc("fossil/spine_1_coal");
/* 28 */   private static final pc aI = new pc("fossil/spine_2_coal");
/* 29 */   private static final pc aJ = new pc("fossil/spine_3_coal");
/* 30 */   private static final pc aK = new pc("fossil/spine_4_coal");
/*    */   
/* 32 */   private static final pc aL = new pc("fossil/skull_1");
/* 33 */   private static final pc aM = new pc("fossil/skull_2");
/* 34 */   private static final pc aN = new pc("fossil/skull_3");
/* 35 */   private static final pc aO = new pc("fossil/skull_4");
/*    */   
/* 37 */   private static final pc aP = new pc("fossil/skull_1_coal");
/* 38 */   private static final pc aQ = new pc("fossil/skull_2_coal");
/* 39 */   private static final pc aR = new pc("fossil/skull_3_coal");
/* 40 */   private static final pc aS = new pc("fossil/skull_4_coal");
/*    */   
/* 42 */   private static final pc[] aT = new pc[] { a, b, c, d, aL, aM, aN, aO };
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
/* 53 */   private static final pc[] aU = new pc[] { aH, aI, aJ, aK, aP, aQ, aR, aS };
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
/*    */   public boolean a(axz ☃, bmy<? extends bom> bmy1, Random random, el el1, brz brz1) {
/* 67 */     Random random1 = ☃.m();
/* 68 */     bhb[] arrayOfBhb = bhb.values();
/* 69 */     bhb bhb = arrayOfBhb[random1.nextInt(arrayOfBhb.length)];
/*    */     
/* 71 */     int i = random1.nextInt(aT.length);
/*    */     
/* 73 */     bxm bxm = ☃.s_().h();
/* 74 */     bxp bxp1 = bxm.a(aT[i]);
/* 75 */     bxp bxp2 = bxm.a(aU[i]);
/* 76 */     axm axm = new axm(el1);
/* 77 */     bwf bwf = new bwf(axm.d(), 0, axm.e(), axm.f(), 256, axm.g());
/* 78 */     bxn bxn = (new bxn()).a(bhb).a(bwf).a(random1);
/*    */     
/* 80 */     el el2 = bxp1.a(bhb);
/* 81 */     int j = random1.nextInt(16 - el2.o());
/* 82 */     int k = random1.nextInt(16 - el2.q());
/*    */     
/* 84 */     int m = 256; int n;
/* 85 */     for (n = 0; n < el2.o(); n++) {
/* 86 */       for (int i1 = 0; i1 < el2.o(); i1++) {
/* 87 */         m = Math.min(m, ☃.a(bor.a.b, el1.o() + n + j, el1.q() + i1 + k));
/*    */       }
/*    */     } 
/* 90 */     n = Math.max(m - 15 - random1.nextInt(10), 10);
/*    */     
/* 92 */     el el3 = bxp1.a(el1.a(j, n, k), bfz.a, bhb);
/* 93 */     bxn.a(0.9F);
/* 94 */     bxp1.a(☃, el3, bxn, 4);
/* 95 */     bxn.a(0.1F);
/* 96 */     bxp2.a(☃, el3, bxn, 4);
/*    */     
/* 98 */     return true;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bqu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */