/*    */ import java.lang.reflect.Constructor;
/*    */ import java.util.Arrays;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class alt<T extends aln>
/*    */ {
/*  9 */   private static alt<?>[] l = (alt<?>[])new alt[0];
/* 10 */   public static final alt<alj> a = a(alj.class, "HoldingPattern");
/* 11 */   public static final alt<alr> b = a(alr.class, "StrafePlayer");
/* 12 */   public static final alt<all> c = a(all.class, "LandingApproach");
/* 13 */   public static final alt<alm> d = a(alm.class, "Landing");
/* 14 */   public static final alt<als> e = a(als.class, "Takeoff");
/* 15 */   public static final alt<alp> f = a(alp.class, "SittingFlaming");
/* 16 */   public static final alt<alq> g = a(alq.class, "SittingScanning");
/* 17 */   public static final alt<alo> h = a(alo.class, "SittingAttacking");
/* 18 */   public static final alt<alh> i = a(alh.class, "ChargingPlayer");
/* 19 */   public static final alt<ali> j = a(ali.class, "Dying");
/* 20 */   public static final alt<alk> k = a(alk.class, "Hover");
/*    */   
/*    */   private final Class<? extends aln> m;
/*    */   private final int n;
/*    */   private final String o;
/*    */   
/*    */   private alt(int ☃, Class<? extends aln> clazz, String str) {
/* 27 */     this.n = ☃;
/* 28 */     this.m = clazz;
/* 29 */     this.o = str;
/*    */   }
/*    */   
/*    */   public aln a(ald ☃) {
/*    */     try {
/* 34 */       Constructor<? extends aln> constructor = a();
/* 35 */       return constructor.newInstance(new Object[] { ☃ });
/* 36 */     } catch (Exception exception) {
/* 37 */       throw new Error(exception);
/*    */     } 
/*    */   }
/*    */   
/*    */   protected Constructor<? extends aln> a() throws NoSuchMethodException {
/* 42 */     return this.m.getConstructor(new Class[] { ald.class });
/*    */   }
/*    */   
/*    */   public int b() {
/* 46 */     return this.n;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 51 */     return this.o + " (#" + this.n + ")";
/*    */   }
/*    */   
/*    */   public static alt<?> a(int ☃) {
/* 55 */     if (☃ < 0 || ☃ >= l.length) {
/* 56 */       return a;
/*    */     }
/* 58 */     return l[☃];
/*    */   }
/*    */   
/*    */   public static int c() {
/* 62 */     return l.length;
/*    */   }
/*    */   
/*    */   private static <T extends aln> alt<T> a(Class<T> ☃, String str) {
/* 66 */     alt<T> alt1 = new alt<>(l.length, ☃, str);
/* 67 */     l = (alt<?>[])Arrays.<alt>copyOf((alt[])l, l.length + 1);
/* 68 */     l[alt1.b()] = alt1;
/* 69 */     return alt1;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\alt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */