/*     */ import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
/*     */ import java.util.Arrays;
/*     */ import java.util.Comparator;
/*     */ import java.util.Map;
/*     */ import java.util.stream.Collectors;
/*     */ 
/*     */ 
/*     */ public enum asc
/*     */   implements xv
/*     */ {
/*     */   private static final asc[] q;
/*     */   private static final Int2ObjectOpenHashMap<asc> r;
/*  13 */   a(0, "white", 16383998, bzb.j, 15790320),
/*  14 */   b(1, "orange", 16351261, bzb.q, 15435844),
/*  15 */   c(2, "magenta", 13061821, bzb.r, 12801229),
/*  16 */   d(3, "light_blue", 3847130, bzb.s, 6719955),
/*  17 */   e(4, "yellow", 16701501, bzb.t, 14602026),
/*  18 */   f(5, "lime", 8439583, bzb.u, 4312372),
/*  19 */   g(6, "pink", 15961002, bzb.v, 14188952),
/*  20 */   h(7, "gray", 4673362, bzb.w, 4408131),
/*  21 */   i(8, "light_gray", 10329495, bzb.x, 11250603),
/*  22 */   j(9, "cyan", 1481884, bzb.y, 2651799),
/*  23 */   k(10, "purple", 8991416, bzb.z, 8073150),
/*  24 */   l(11, "blue", 3949738, bzb.A, 2437522),
/*  25 */   m(12, "brown", 8606770, bzb.B, 5320730),
/*  26 */   n(13, "green", 6192150, bzb.C, 3887386),
/*  27 */   o(14, "red", 11546150, bzb.D, 11743532),
/*  28 */   p(15, "black", 1908001, bzb.E, 1973019);
/*     */   
/*     */   static {
/*  31 */     q = (asc[])Arrays.<asc>stream(values()).sorted(Comparator.comparingInt(asc::a)).toArray(☃ -> new asc[☃]);
/*  32 */     r = new Int2ObjectOpenHashMap((Map)Arrays.<asc>stream(values()).collect(Collectors.toMap(☃ -> Integer.valueOf(☃.y), ☃ -> ☃)));
/*     */   }
/*     */ 
/*     */   
/*     */   private final int s;
/*     */   
/*     */   private final String t;
/*     */   
/*     */   private final bzb u;
/*     */   
/*     */   asc(int ☃, String str1, int i, bzb bzb1, int j) {
/*  43 */     this.s = ☃;
/*  44 */     this.t = str1;
/*  45 */     this.v = i;
/*  46 */     this.u = bzb1;
/*     */     
/*  48 */     int k = (i & 0xFF0000) >> 16;
/*  49 */     int m = (i & 0xFF00) >> 8;
/*  50 */     int n = (i & 0xFF) >> 0;
/*  51 */     this.w = n << 16 | m << 8 | k << 0;
/*  52 */     this.x = new float[] { k / 255.0F, m / 255.0F, n / 255.0F };
/*  53 */     this.y = j;
/*     */   }
/*     */   private final int v; private final int w; private final float[] x; private final int y;
/*     */   public int a() {
/*  57 */     return this.s;
/*     */   }
/*     */   
/*     */   public String b() {
/*  61 */     return this.t;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float[] d() {
/*  69 */     return this.x;
/*     */   }
/*     */   
/*     */   public bzb e() {
/*  73 */     return this.u;
/*     */   }
/*     */   
/*     */   public int f() {
/*  77 */     return this.y;
/*     */   }
/*     */   
/*     */   public static asc a(int ☃) {
/*  81 */     if (☃ < 0 || ☃ >= q.length) {
/*  82 */       ☃ = 0;
/*     */     }
/*  84 */     return q[☃];
/*     */   }
/*     */   
/*     */   public static asc a(String ☃) {
/*  88 */     for (asc asc1 : values()) {
/*  89 */       if (asc1.t.equals(☃)) {
/*  90 */         return asc1;
/*     */       }
/*     */     } 
/*     */     
/*  94 */     return a;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 104 */     return this.t;
/*     */   }
/*     */ 
/*     */   
/*     */   public String m() {
/* 109 */     return this.t;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\asc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */