/*    */ 
/*    */ 
/*    */ public class ayp<T>
/*    */   implements Comparable<ayp<T>>
/*    */ {
/*    */   private static long d;
/*    */   private final T e;
/*    */   public final el a;
/*    */   public final long b;
/*    */   public final ayq c;
/* 11 */   private final long f = d++;
/*    */   
/*    */   public ayp(el ☃, T t) {
/* 14 */     this(☃, t, 0L, ayq.d);
/*    */   }
/*    */   
/*    */   public ayp(el ☃, T t, long l, ayq ayq1) {
/* 18 */     this.a = ☃.h();
/* 19 */     this.e = t;
/* 20 */     this.b = l;
/* 21 */     this.c = ayq1;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean equals(Object ☃) {
/* 26 */     if (☃ instanceof ayp) {
/* 27 */       ayp ayp1 = (ayp)☃;
/* 28 */       return (this.a.equals(ayp1.a) && this.e == ayp1.e);
/*    */     } 
/* 30 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public int hashCode() {
/* 35 */     return this.a.hashCode();
/*    */   }
/*    */ 
/*    */   
/*    */   public int a(ayp ☃) {
/* 40 */     if (this.b < ☃.b) {
/* 41 */       return -1;
/*    */     }
/* 43 */     if (this.b > ☃.b) {
/* 44 */       return 1;
/*    */     }
/* 46 */     if (this.c.ordinal() < ☃.c.ordinal()) {
/* 47 */       return -1;
/*    */     }
/* 49 */     if (this.c.ordinal() > ☃.c.ordinal()) {
/* 50 */       return 1;
/*    */     }
/* 52 */     if (this.f < ☃.f) {
/* 53 */       return -1;
/*    */     }
/* 55 */     if (this.f > ☃.f) {
/* 56 */       return 1;
/*    */     }
/* 58 */     return 0;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 63 */     return (new StringBuilder()).append(this.e).append(": ").append(this.a).append(", ").append(this.b).append(", ").append(this.c).append(", ").append(this.f).toString();
/*    */   }
/*    */   
/*    */   public T a() {
/* 67 */     return this.e;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\ayp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */