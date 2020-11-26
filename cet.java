/*     */ import com.google.common.annotations.VisibleForTesting;
/*     */ import com.google.common.math.DoubleMath;
/*     */ import com.google.common.math.IntMath;
/*     */ import it.unimi.dsi.fastutil.doubles.DoubleArrayList;
/*     */ import it.unimi.dsi.fastutil.doubles.DoubleList;
/*     */ import java.util.Iterator;
/*     */ import java.util.Objects;
/*     */ import java.util.stream.Stream;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class cet
/*     */ {
/*  20 */   private static final cew a = new ceg(new ceh(0, 0, 0), (DoubleList)new DoubleArrayList(new double[] { 0.0D }, ), (DoubleList)new DoubleArrayList(new double[] { 0.0D }, ), (DoubleList)new DoubleArrayList(new double[] { 0.0D }));
/*     */ 
/*     */   
/*     */   private static final cew b;
/*     */ 
/*     */   
/*     */   static {
/*  27 */     b = k.<cew>a(() -> {
/*     */           cem ☃ = new ceh(1, 1, 1);
/*     */           ☃.a(0, 0, 0, true, true);
/*     */           return new cek(☃);
/*     */         });
/*     */   }
/*     */   public static cew a() {
/*  34 */     return a;
/*     */   }
/*     */   
/*     */   public static cew b() {
/*  38 */     return b;
/*     */   }
/*     */   
/*     */   public static cew a(double ☃, double d1, double d2, double d3, double d4, double d5) {
/*  42 */     return a(new cea(☃, d1, d2, d3, d4, d5));
/*     */   }
/*     */   
/*     */   public static cew a(cea ☃) {
/*  46 */     int i = a(☃.a, ☃.d);
/*  47 */     int j = a(☃.b, ☃.e);
/*  48 */     int k = a(☃.c, ☃.f);
/*     */     
/*  50 */     if (i < 0 || j < 0 || k < 0) {
/*  51 */       return new ceg(b.a, new double[] { ☃.a, ☃.d }, new double[] { ☃.b, ☃.e }, new double[] { ☃.c, ☃.f });
/*     */     }
/*     */     
/*  54 */     if (i == 0 && j == 0 && k == 0) {
/*  55 */       return ☃.e(0.5D, 0.5D, 0.5D) ? b() : a();
/*     */     }
/*     */     
/*  58 */     int m = 1 << i;
/*  59 */     int n = 1 << j;
/*  60 */     int i1 = 1 << k;
/*     */     
/*  62 */     int i2 = (int)Math.round(☃.a * m);
/*  63 */     int i3 = (int)Math.round(☃.d * m);
/*  64 */     int i4 = (int)Math.round(☃.b * n);
/*  65 */     int i5 = (int)Math.round(☃.e * n);
/*  66 */     int i6 = (int)Math.round(☃.c * i1);
/*  67 */     int i7 = (int)Math.round(☃.f * i1);
/*     */     
/*  69 */     ceh ceh = new ceh(m, n, i1, i2, i4, i6, i3, i5, i7);
/*     */ 
/*     */     
/*     */     long l;
/*     */ 
/*     */     
/*  75 */     for (l = i2; l < i3; l++) {
/*  76 */       long l1; for (l1 = i4; l1 < i5; l1++) {
/*  77 */         long l2; for (l2 = i6; l2 < i7; l2++) {
/*  78 */           ceh.a((int)l, (int)l1, (int)l2, false, true);
/*     */         }
/*     */       } 
/*     */     } 
/*  82 */     return new cek(ceh);
/*     */   }
/*     */   
/*     */   private static int a(double ☃, double d1) {
/*  86 */     if (☃ < -1.0E-7D || d1 > 1.0000001D) {
/*  87 */       return -1;
/*     */     }
/*  89 */     for (int i = 0; i <= 3; i++) {
/*  90 */       double d2 = ☃ * (1 << i);
/*  91 */       double d3 = d1 * (1 << i);
/*  92 */       boolean bool1 = (Math.abs(d2 - Math.floor(d2)) < 1.0E-7D);
/*  93 */       boolean bool2 = (Math.abs(d3 - Math.floor(d3)) < 1.0E-7D);
/*  94 */       if (bool1 && bool2) {
/*  95 */         return i;
/*     */       }
/*     */     } 
/*  98 */     return -1;
/*     */   }
/*     */   
/*     */   protected static long a(int ☃, int i) {
/* 102 */     return ☃ * (i / IntMath.gcd(☃, i));
/*     */   }
/*     */   
/*     */   public static cew a(cew ☃, cew cew1) {
/* 106 */     return a(☃, cew1, cei.OR);
/*     */   }
/*     */   
/*     */   public static cew a(cew ☃, cew cew1, cei cei1) {
/* 110 */     return b(☃, cew1, cei1).c();
/*     */   }
/*     */   
/*     */   public static cew b(cew ☃, cew cew1, cei cei1) {
/* 114 */     if (cei1.apply(false, false)) {
/* 115 */       throw new IllegalArgumentException();
/*     */     }
/* 117 */     if (☃ == cew1) {
/* 118 */       return cei1.apply(true, true) ? ☃ : a();
/*     */     }
/* 120 */     boolean bool1 = cei1.apply(true, false);
/* 121 */     boolean bool2 = cei1.apply(false, true);
/*     */     
/* 123 */     if (☃.b()) {
/* 124 */       return bool2 ? cew1 : a();
/*     */     }
/* 126 */     if (cew1.b()) {
/* 127 */       return bool1 ? ☃ : a();
/*     */     }
/*     */     
/* 130 */     ceo ceo1 = a(1, ☃.a(eq.a.a), cew1.a(eq.a.a), bool1, bool2);
/* 131 */     ceo ceo2 = a(ceo1.a().size() - 1, ☃.a(eq.a.b), cew1.a(eq.a.b), bool1, bool2);
/* 132 */     ceo ceo3 = a((ceo1.a().size() - 1) * (ceo2.a().size() - 1), ☃.a(eq.a.c), cew1.a(eq.a.c), bool1, bool2);
/*     */     
/* 134 */     ceh ceh = ceh.a(☃.a, cew1.a, ceo1, ceo2, ceo3, cei1);
/* 135 */     if (ceo1 instanceof cel && ceo2 instanceof cel && ceo3 instanceof cel) {
/* 136 */       return new cek(ceh);
/*     */     }
/* 138 */     return new ceg(ceh, ceo1.a(), ceo2.a(), ceo3.a());
/*     */   }
/*     */   
/*     */   public static boolean c(cew ☃, cew cew1, cei cei1) {
/* 142 */     if (cei1.apply(false, false)) {
/* 143 */       throw new IllegalArgumentException();
/*     */     }
/* 145 */     if (☃ == cew1) {
/* 146 */       return cei1.apply(true, true);
/*     */     }
/* 148 */     if (☃.b()) {
/* 149 */       return cei1.apply(false, !cew1.b());
/*     */     }
/* 151 */     if (cew1.b()) {
/* 152 */       return cei1.apply(!☃.b(), false);
/*     */     }
/* 154 */     boolean bool1 = cei1.apply(true, false);
/* 155 */     boolean bool2 = cei1.apply(false, true);
/* 156 */     for (eq.a a : ej.d) {
/* 157 */       if (☃.c(a) < cew1.b(a) - 1.0E-7D) {
/* 158 */         return (bool1 || bool2);
/*     */       }
/* 160 */       if (cew1.c(a) < ☃.b(a) - 1.0E-7D) {
/* 161 */         return (bool1 || bool2);
/*     */       }
/*     */     } 
/* 164 */     ceo ceo1 = a(1, ☃.a(eq.a.a), cew1.a(eq.a.a), bool1, bool2);
/* 165 */     ceo ceo2 = a(ceo1.a().size() - 1, ☃.a(eq.a.b), cew1.a(eq.a.b), bool1, bool2);
/* 166 */     ceo ceo3 = a((ceo1.a().size() - 1) * (ceo2.a().size() - 1), ☃.a(eq.a.c), cew1.a(eq.a.c), bool1, bool2);
/* 167 */     return a(ceo1, ceo2, ceo3, ☃.a, cew1.a, cei1);
/*     */   }
/*     */   
/*     */   private static boolean a(ceo ☃, ceo ceo1, ceo ceo2, cem cem1, cem cem2, cei cei1) {
/* 171 */     return !☃.a((i, j, k) -> ☃.a(()));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static double a(eq.a ☃, cea cea1, Stream<cew> stream, double d) {
/* 181 */     Iterator<cew> iterator = stream.iterator();
/* 182 */     while (iterator.hasNext()) {
/* 183 */       if (Math.abs(d) < 1.0E-7D) {
/* 184 */         return 0.0D;
/*     */       }
/* 186 */       d = ((cew)iterator.next()).a(☃, cea1, d);
/*     */     } 
/* 188 */     return d;
/*     */   }
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
/*     */   public static boolean b(cew ☃, cew cew1, eq eq1) {
/* 217 */     if (☃ == b() || cew1 == b()) {
/* 218 */       return true;
/*     */     }
/*     */     
/* 221 */     eq.a a = eq1.k();
/* 222 */     eq.b b = eq1.c();
/*     */     
/* 224 */     cew cew2 = (b == eq.b.a) ? ☃ : cew1;
/* 225 */     cew cew3 = (b == eq.b.a) ? cew1 : ☃;
/*     */     
/* 227 */     if (!DoubleMath.fuzzyEquals(cew2.c(a), 1.0D, 1.0E-7D)) {
/* 228 */       cew2 = a();
/*     */     }
/* 230 */     if (!DoubleMath.fuzzyEquals(cew3.b(a), 0.0D, 1.0E-7D)) {
/* 231 */       cew3 = a();
/*     */     }
/*     */     
/* 234 */     return !c(b(), b(new ceu(cew2, a, cew2.a.c(a) - 1), new ceu(cew3, a, 0), cei.OR), cei.ONLY_FIRST);
/*     */   }
/*     */   
/*     */   @VisibleForTesting
/*     */   protected static ceo a(int ☃, DoubleList doubleList1, DoubleList doubleList2, boolean bool1, boolean bool2) {
/* 239 */     if (doubleList1 instanceof cej && doubleList2 instanceof cej) {
/* 240 */       int i = doubleList1.size() - 1;
/* 241 */       int j = doubleList2.size() - 1;
/* 242 */       long l = a(i, j);
/* 243 */       if (☃ * l <= 256L) {
/* 244 */         return new cel(i, j);
/*     */       }
/*     */     } 
/*     */     
/* 248 */     if (doubleList1.getDouble(doubleList1.size() - 1) < doubleList2.getDouble(0) - 1.0E-7D)
/* 249 */       return new cer(doubleList1, doubleList2, false); 
/* 250 */     if (doubleList2.getDouble(doubleList2.size() - 1) < doubleList1.getDouble(0) - 1.0E-7D) {
/* 251 */       return new cer(doubleList2, doubleList1, true);
/*     */     }
/*     */     
/* 254 */     if (Objects.equals(doubleList1, doubleList2)) {
/* 255 */       if (doubleList1 instanceof cen) {
/* 256 */         return (ceo)doubleList1;
/*     */       }
/* 258 */       if (doubleList2 instanceof cen) {
/* 259 */         return (ceo)doubleList2;
/*     */       }
/* 261 */       return new cen(doubleList1);
/*     */     } 
/*     */     
/* 264 */     return new cep(doubleList1, doubleList2, bool1, bool2);
/*     */   }
/*     */   
/*     */   public static interface a {
/*     */     void consume(double param1Double1, double param1Double2, double param1Double3, double param1Double4, double param1Double5, double param1Double6);
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\cet.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */