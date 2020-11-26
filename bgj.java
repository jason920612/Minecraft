/*    */ import com.google.common.collect.Maps;
/*    */ import java.util.EnumMap;
/*    */ import java.util.Map;
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
/*    */ public class bgj
/*    */   extends bcs
/*    */ {
/* 17 */   private static final eq[] t = eq.values();
/*    */   
/* 19 */   public static final bmb a = bma.D;
/* 20 */   public static final bmb b = bma.E;
/* 21 */   public static final bmb c = bma.F;
/* 22 */   public static final bmb o = bma.G;
/* 23 */   public static final bmb p = bma.B;
/* 24 */   public static final bmb q = bma.C; public static final Map<eq, bmb> r;
/*    */   static {
/* 26 */     r = k.<Map<eq, bmb>>a(Maps.newEnumMap(eq.class), ☃ -> {
/*    */           ☃.put(eq.c, a);
/*    */           ☃.put(eq.f, b);
/*    */           ☃.put(eq.d, c);
/*    */           ☃.put(eq.e, o);
/*    */           ☃.put(eq.b, p);
/*    */           ☃.put(eq.a, q);
/*    */         });
/*    */   }
/*    */   protected final cew[] s;
/*    */   
/*    */   protected bgj(float ☃, bcs.c c1) {
/* 38 */     super(c1);
/*    */     
/* 40 */     this.s = a(☃);
/*    */   }
/*    */   
/*    */   private cew[] a(float ☃) {
/* 44 */     float f1 = 0.5F - ☃;
/* 45 */     float f2 = 0.5F + ☃;
/*    */     
/* 47 */     cew cew1 = bcs.a((f1 * 16.0F), (f1 * 16.0F), (f1 * 16.0F), (f2 * 16.0F), (f2 * 16.0F), (f2 * 16.0F));
/*    */     
/* 49 */     cew[] arrayOfCew1 = new cew[t.length];
/*    */     
/* 51 */     for (int i = 0; i < t.length; i++) {
/* 52 */       eq eq1 = t[i];
/* 53 */       arrayOfCew1[i] = cet.a(0.5D + 
/* 54 */           Math.min(-☃, eq1.g() * 0.5D), 0.5D + 
/* 55 */           Math.min(-☃, eq1.h() * 0.5D), 0.5D + 
/* 56 */           Math.min(-☃, eq1.i() * 0.5D), 0.5D + 
/* 57 */           Math.max(☃, eq1.g() * 0.5D), 0.5D + 
/* 58 */           Math.max(☃, eq1.h() * 0.5D), 0.5D + 
/* 59 */           Math.max(☃, eq1.i() * 0.5D));
/*    */     } 
/*    */ 
/*    */     
/* 63 */     cew[] arrayOfCew2 = new cew[64];
/* 64 */     for (int j = 0; j < 64; j++) {
/* 65 */       cew cew2 = cew1;
/* 66 */       for (int k = 0; k < t.length; k++) {
/* 67 */         if ((j & 1 << k) != 0) {
/* 68 */           cew2 = cet.a(cew2, arrayOfCew1[k]);
/*    */         }
/*    */       } 
/* 71 */       arrayOfCew2[j] = cew2;
/*    */     } 
/* 73 */     return arrayOfCew2;
/*    */   }
/*    */ 
/*    */   
/*    */   public cew a(blc ☃, axk axk1, el el1) {
/* 78 */     return this.s[k(☃)];
/*    */   }
/*    */   
/*    */   protected int k(blc ☃) {
/* 82 */     int i = 0;
/* 83 */     for (int j = 0; j < t.length; j++) {
/* 84 */       if (((Boolean)☃.c(r.get(t[j]))).booleanValue()) {
/* 85 */         i |= 1 << j;
/*    */       }
/*    */     } 
/* 88 */     return i;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bgj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */