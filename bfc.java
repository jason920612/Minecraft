/*    */ import java.util.List;
/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bfc
/*    */   extends bhu
/*    */   implements bcv
/*    */ {
/*    */   public bfc(bcs.c ☃) {
/* 15 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(axk ☃, el el1, blc blc1, boolean bool) {
/* 20 */     return ☃.a_(el1.a()).f();
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(axy ☃, Random random, el el1, blc blc1) {
/* 25 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(axy ☃, Random random, el el1, blc blc1) {
/* 30 */     el el2 = el1.a();
/*    */     
/* 32 */     blc blc2 = bct.aR.p();
/*    */     
/*    */     int i;
/* 35 */     label32: for (i = 0; i < 128; i++) {
/* 36 */       blc blc4; el el3 = el2;
/* 37 */       for (int j = 0; j < i / 16; ) {
/* 38 */         el3 = el3.a(random.nextInt(3) - 1, (random.nextInt(3) - 1) * random.nextInt(3) / 2, random.nextInt(3) - 1);
/* 39 */         if (☃.a_(el3.b()).c() == this) { if (☃.a_(el3).k())
/*    */             continue label32; 
/*    */           j++; }
/*    */         
/*    */         continue label32;
/*    */       } 
/* 45 */       blc blc3 = ☃.a_(el3);
/* 46 */       if (blc3.c() == blc2.c() && random.nextInt(10) == 0) {
/* 47 */         ((bcv)blc2.c()).b(☃, random, el3, blc3);
/*    */       }
/*    */       
/* 50 */       if (!blc3.f()) {
/*    */         continue;
/*    */       }
/*    */ 
/*    */       
/* 55 */       if (random.nextInt(8) == 0) {
/* 56 */         List<bqr<?>> list = ☃.d(el3).f();
/* 57 */         if (list.isEmpty()) {
/*    */           continue;
/*    */         }
/*    */         
/* 61 */         blc4 = ((bqr)list.get(0)).a(random, el3);
/*    */       } else {
/* 63 */         blc4 = blc2;
/*    */       } 
/*    */       
/* 66 */       if (blc4.a(☃, el3)) {
/* 67 */         ☃.a(el3, blc4, 3);
/*    */       }
/*    */       continue;
/*    */     } 
/*    */   }
/*    */   
/*    */   public boolean f(blc ☃) {
/* 74 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public axl c() {
/* 79 */     return axl.b;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bfc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */