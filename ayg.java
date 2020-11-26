/*     */ 
/*     */ public class ayg
/*     */ {
/*   4 */   public static final ayg[] a = new ayg[16];
/*     */   
/*   6 */   public static final ayg b = (new ayg(0, "default", 1)).k();
/*   7 */   public static final ayg c = (new ayg(1, "flat")).a(true);
/*   8 */   public static final ayg d = new ayg(2, "largeBiomes");
/*   9 */   public static final ayg e = (new ayg(3, "amplified")).l();
/*  10 */   public static final ayg f = (new ayg(4, "customized", "normal", 0)).a(true).b(false);
/*  11 */   public static final ayg g = (new ayg(5, "buffet")).a(true);
/*  12 */   public static final ayg h = new ayg(6, "debug_all_block_states");
/*     */   
/*  14 */   public static final ayg i = (new ayg(8, "default_1_1", 0)).b(false);
/*     */   
/*     */   private final int j;
/*     */   private final String k;
/*     */   private final String l;
/*     */   private final int m;
/*     */   private boolean n;
/*     */   private boolean o;
/*     */   private boolean p;
/*     */   private boolean q;
/*     */   
/*     */   private ayg(int ☃, String str) {
/*  26 */     this(☃, str, str, 0);
/*     */   }
/*     */   
/*     */   private ayg(int ☃, String str, int i) {
/*  30 */     this(☃, str, str, i);
/*     */   }
/*     */   
/*     */   private ayg(int ☃, String str1, String str2, int i) {
/*  34 */     this.k = str1;
/*  35 */     this.l = str2;
/*  36 */     this.m = i;
/*  37 */     this.n = true;
/*  38 */     this.j = ☃;
/*  39 */     a[☃] = this;
/*     */   }
/*     */   
/*     */   public String a() {
/*  43 */     return this.k;
/*     */   }
/*     */   
/*     */   public String b() {
/*  47 */     return this.l;
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
/*     */   public int e() {
/*  59 */     return this.m;
/*     */   }
/*     */   
/*     */   public ayg a(int ☃) {
/*  63 */     if (this == b && ☃ == 0) {
/*  64 */       return i;
/*     */     }
/*  66 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ayg a(boolean ☃) {
/*  74 */     this.q = ☃;
/*  75 */     return this;
/*     */   }
/*     */   
/*     */   private ayg b(boolean ☃) {
/*  79 */     this.n = ☃;
/*  80 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private ayg k() {
/*  88 */     this.o = true;
/*  89 */     return this;
/*     */   }
/*     */   
/*     */   public boolean h() {
/*  93 */     return this.o;
/*     */   }
/*     */   
/*     */   public static ayg a(String ☃) {
/*  97 */     for (ayg ayg1 : a) {
/*  98 */       if (ayg1 != null && ayg1.k.equalsIgnoreCase(☃)) {
/*  99 */         return ayg1;
/*     */       }
/*     */     } 
/* 102 */     return null;
/*     */   }
/*     */   
/*     */   public int i() {
/* 106 */     return this.j;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private ayg l() {
/* 114 */     this.p = true;
/* 115 */     return this;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\ayg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */