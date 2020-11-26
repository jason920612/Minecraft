/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public enum bjf
/*     */ {
/*  10 */   a("base", "b"),
/*  11 */   b("square_bottom_left", "bl", "   ", "   ", "#  "),
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  16 */   c("square_bottom_right", "br", "   ", "   ", "  #"),
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  21 */   d("square_top_left", "tl", "#  ", "   ", "   "),
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  26 */   e("square_top_right", "tr", "  #", "   ", "   "),
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  31 */   f("stripe_bottom", "bs", "   ", "   ", "###"),
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  36 */   g("stripe_top", "ts", "###", "   ", "   "),
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  41 */   h("stripe_left", "ls", "#  ", "#  ", "#  "),
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  46 */   i("stripe_right", "rs", "  #", "  #", "  #"),
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  51 */   j("stripe_center", "cs", " # ", " # ", " # "),
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  56 */   k("stripe_middle", "ms", "   ", "###", "   "),
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  61 */   l("stripe_downright", "drs", "#  ", " # ", "  #"),
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  66 */   m("stripe_downleft", "dls", "  #", " # ", "#  "),
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  71 */   n("small_stripes", "ss", "# #", "# #", "   "),
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  76 */   o("cross", "cr", "# #", " # ", "# #"),
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  81 */   p("straight_cross", "sc", " # ", "###", " # "),
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  86 */   q("triangle_bottom", "bt", "   ", " # ", "# #"),
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  91 */   r("triangle_top", "tt", "# #", " # ", "   "),
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  96 */   s("triangles_bottom", "bts", "   ", "# #", " # "),
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 101 */   t("triangles_top", "tts", " # ", "# #", "   "),
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 106 */   u("diagonal_left", "ld", "## ", "#  ", "   "),
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 111 */   v("diagonal_up_right", "rd", "   ", "  #", " ##"),
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 116 */   w("diagonal_up_left", "lud", "   ", "#  ", "## "),
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 121 */   x("diagonal_right", "rud", " ##", "  #", "   "),
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 126 */   y("circle", "mc", "   ", " # ", "   "),
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 131 */   z("rhombus", "mr", " # ", "# #", " # "),
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 136 */   A("half_vertical", "vh", "## ", "## ", "## "),
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 141 */   B("half_horizontal", "hh", "###", "###", "   "),
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 146 */   C("half_vertical_right", "vhr", " ##", " ##", " ##"),
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 151 */   D("half_horizontal_bottom", "hhb", "   ", "###", "###"),
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 156 */   E("border", "bo", "###", "# #", "###"),
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 161 */   F("curly_border", "cbo", new ate(bct.dM)),
/* 162 */   G("creeper", "cre", new ate(atf.dL)),
/* 163 */   H("gradient", "gra", "# #", " # ", " # "),
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 168 */   I("gradient_up", "gru", " # ", " # ", "# #"),
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 173 */   J("bricks", "bri", new ate(bct.ca)),
/* 174 */   K("skull", "sku", new ate(atf.dJ)),
/* 175 */   L("flower", "flo", new ate(bct.by)),
/* 176 */   M("mojang", "moj", new ate(atf.au));
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 181 */   private final String[] P = new String[3];
/* 182 */   private ate Q = ate.a; private final String N;
/*     */   
/*     */   bjf(String ☃, String str1) {
/* 185 */     this.N = ☃;
/* 186 */     this.O = str1;
/*     */   }
/*     */   private final String O;
/*     */   
/*     */   bjf(String ☃, String str1, ate ate1) {
/* 191 */     this.Q = ate1;
/*     */   }
/*     */ 
/*     */   
/*     */   bjf(String ☃, String str1, String str2, String str3, String str4) {
/* 196 */     this.P[0] = str2;
/* 197 */     this.P[1] = str3;
/* 198 */     this.P[2] = str4;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String b() {
/* 206 */     return this.O;
/*     */   }
/*     */   
/*     */   public String[] c() {
/* 210 */     return this.P;
/*     */   }
/*     */   
/*     */   public boolean d() {
/* 214 */     return (!this.Q.a() || this.P[0] != null);
/*     */   }
/*     */   
/*     */   public boolean e() {
/* 218 */     return !this.Q.a();
/*     */   }
/*     */   
/*     */   public ate f() {
/* 222 */     return this.Q;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bjf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */