/*     */ import com.google.common.collect.Maps;
/*     */ import java.util.Map;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class afk
/*     */ {
/*     */   static class a
/*     */   {
/*     */     private final bor.a a;
/*     */     private final afk.b b;
/*     */     @Nullable
/*     */     private final wz<bcs> c;
/*     */     
/*     */     public a(bor.a ☃, afk.b b1, @Nullable wz<bcs> wz1) {
/*  21 */       this.a = ☃;
/*  22 */       this.b = b1;
/*  23 */       this.c = wz1;
/*     */     }
/*     */   }
/*     */   
/*  27 */   private static final Map<aev<?>, a> a = Maps.newHashMap();
/*     */   
/*     */   private static void a(aev<?> ☃, b b1, bor.a a1) {
/*  30 */     a(☃, b1, a1, null);
/*     */   }
/*     */   
/*     */   private static void a(aev<?> ☃, b b1, bor.a a1, @Nullable wz<bcs> wz1) {
/*  34 */     a.put(☃, new a(a1, b1, wz1));
/*     */   }
/*     */   
/*     */   static {
/*  38 */     a(aev.i, b.b, bor.a.e);
/*  39 */     a(aev.m, b.b, bor.a.e);
/*  40 */     a(aev.o, b.b, bor.a.e);
/*  41 */     a(aev.C, b.b, bor.a.e);
/*  42 */     a(aev.aa, b.b, bor.a.e);
/*  43 */     a(aev.af, b.b, bor.a.e);
/*  44 */     a(aev.as, b.b, bor.a.e);
/*  45 */     a(aev.au, b.b, bor.a.e);
/*     */     
/*  47 */     a(aev.W, b.a, bor.a.d, wv.A);
/*  48 */     a(aev.Y, b.a, bor.a.d, wv.A);
/*     */     
/*  50 */     a(aev.ac, b.a, bor.a.e, wv.E);
/*     */     
/*  52 */     a(aev.d, b.a, bor.a.e);
/*  53 */     a(aev.e, b.a, bor.a.e);
/*  54 */     a(aev.g, b.a, bor.a.e);
/*  55 */     a(aev.h, b.a, bor.a.e);
/*  56 */     a(aev.j, b.a, bor.a.e);
/*  57 */     a(aev.k, b.a, bor.a.e);
/*  58 */     a(aev.l, b.a, bor.a.e);
/*  59 */     a(aev.s, b.a, bor.a.e);
/*  60 */     a(aev.t, b.a, bor.a.e);
/*  61 */     a(aev.r, b.a, bor.a.e);
/*  62 */     a(aev.A, b.a, bor.a.e);
/*  63 */     a(aev.B, b.a, bor.a.e);
/*  64 */     a(aev.D, b.a, bor.a.e);
/*  65 */     a(aev.E, b.a, bor.a.e);
/*  66 */     a(aev.K, b.a, bor.a.e);
/*  67 */     a(aev.M, b.a, bor.a.e);
/*  68 */     a(aev.V, b.a, bor.a.e);
/*  69 */     a(aev.U, b.a, bor.a.e);
/*  70 */     a(aev.Z, b.a, bor.a.e);
/*  71 */     a(aev.ae, b.a, bor.a.e);
/*  72 */     a(aev.ag, b.a, bor.a.e);
/*  73 */     a(aev.aj, b.a, bor.a.e);
/*  74 */     a(aev.ak, b.a, bor.a.e);
/*  75 */     a(aev.al, b.a, bor.a.e);
/*  76 */     a(aev.am, b.a, bor.a.e);
/*  77 */     a(aev.ao, b.a, bor.a.e);
/*  78 */     a(aev.ar, b.a, bor.a.e);
/*  79 */     a(aev.at, b.a, bor.a.e);
/*  80 */     a(aev.av, b.a, bor.a.e);
/*  81 */     a(aev.aB, b.a, bor.a.e);
/*  82 */     a(aev.aC, b.a, bor.a.e);
/*  83 */     a(aev.aE, b.a, bor.a.e);
/*  84 */     a(aev.aF, b.a, bor.a.e);
/*  85 */     a(aev.aG, b.a, bor.a.e);
/*  86 */     a(aev.aI, b.a, bor.a.e);
/*  87 */     a(aev.aJ, b.a, bor.a.e);
/*  88 */     a(aev.aK, b.a, bor.a.e);
/*  89 */     a(aev.ab, b.a, bor.a.e);
/*  90 */     a(aev.aL, b.a, bor.a.e);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static b a(aev<? extends afb> ☃) {
/*  95 */     a a = a.get(☃);
/*  96 */     return (a == null) ? null : a.a(a);
/*     */   }
/*     */   
/*     */   public static bor.a b(@Nullable aev<? extends afb> ☃) {
/* 100 */     a a = a.get(☃);
/* 101 */     return (a == null) ? bor.a.e : a.b(a);
/*     */   }
/*     */   
/*     */   public static boolean a(aev<? extends afb> ☃, blc blc1) {
/* 105 */     a a = a.get(☃);
/* 106 */     if (a == null) {
/* 107 */       return false;
/*     */     }
/*     */     
/* 110 */     return (a.c(a) != null && blc1.a(a.c(a)));
/*     */   }
/*     */   
/*     */   public enum b {
/* 114 */     a,
/* 115 */     b;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\afk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */