/*     */ import java.util.Arrays;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import java.util.Locale;
/*     */ import java.util.Map;
/*     */ import java.util.regex.Pattern;
/*     */ import java.util.stream.Collectors;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ public enum a {
/*     */   private static final Map<String, a> w;
/*     */   private static final Pattern x;
/*     */   private final String y;
/*     */   private final char z;
/*  15 */   a("BLACK", '0', 0, Integer.valueOf(0)),
/*  16 */   b("DARK_BLUE", '1', 1, Integer.valueOf(170)),
/*  17 */   c("DARK_GREEN", '2', 2, Integer.valueOf(43520)),
/*  18 */   d("DARK_AQUA", '3', 3, Integer.valueOf(43690)),
/*  19 */   e("DARK_RED", '4', 4, Integer.valueOf(11141120)),
/*  20 */   f("DARK_PURPLE", '5', 5, Integer.valueOf(11141290)),
/*  21 */   g("GOLD", '6', 6, Integer.valueOf(16755200)),
/*  22 */   h("GRAY", '7', 7, Integer.valueOf(11184810)),
/*  23 */   i("DARK_GRAY", '8', 8, Integer.valueOf(5592405)),
/*  24 */   j("BLUE", '9', 9, Integer.valueOf(5592575)),
/*  25 */   k("GREEN", 'a', 10, Integer.valueOf(5635925)),
/*  26 */   l("AQUA", 'b', 11, Integer.valueOf(5636095)),
/*  27 */   m("RED", 'c', 12, Integer.valueOf(16733525)),
/*  28 */   n("LIGHT_PURPLE", 'd', 13, Integer.valueOf(16733695)),
/*  29 */   o("YELLOW", 'e', 14, Integer.valueOf(16777045)),
/*  30 */   p("WHITE", 'f', 15, Integer.valueOf(16777215)),
/*  31 */   q("OBFUSCATED", 'k', true),
/*  32 */   r("BOLD", 'l', true),
/*  33 */   s("STRIKETHROUGH", 'm', true),
/*  34 */   t("UNDERLINE", 'n', true),
/*  35 */   u("ITALIC", 'o', true),
/*  36 */   v("RESET", 'r', -1, null); private final boolean A; private final String B;
/*     */   
/*     */   static {
/*  39 */     w = (Map<String, a>)Arrays.<a>stream(values()).collect(Collectors.toMap(☃ -> d(☃.y), ☃ -> ☃));
/*  40 */     x = Pattern.compile("(?i)§[0-9A-FK-OR]");
/*     */   } private final int C; @Nullable
/*     */   private final Integer D; private static String d(String ☃) {
/*  43 */     return ☃.toLowerCase(Locale.ROOT).replaceAll("[^a-z]", "");
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
/*     */   a(String ☃, char c, boolean bool, int i, @Nullable Integer integer) {
/*  63 */     this.y = ☃;
/*  64 */     this.z = c;
/*  65 */     this.A = bool;
/*  66 */     this.C = i;
/*  67 */     this.D = integer;
/*     */     
/*  69 */     this.B = "§" + c;
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
/*     */ 
/*     */ 
/*     */   
/*     */   public int b() {
/* 101 */     return this.C;
/*     */   }
/*     */   
/*     */   public boolean c() {
/* 105 */     return this.A;
/*     */   }
/*     */   
/*     */   public boolean d() {
/* 109 */     return (!this.A && this != v);
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
/*     */   public String g() {
/* 122 */     return name().toLowerCase(Locale.ROOT);
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 127 */     return this.B;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static String b(@Nullable String ☃) {
/* 132 */     return (☃ == null) ? null : x.matcher(☃).replaceAll("");
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static a c(@Nullable String ☃) {
/* 137 */     if (☃ == null) {
/* 138 */       return null;
/*     */     }
/* 140 */     return w.get(d(☃));
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static a a(int ☃) {
/* 145 */     if (☃ < 0) {
/* 146 */       return v;
/*     */     }
/* 148 */     for (a a1 : values()) {
/* 149 */       if (a1.b() == ☃) {
/* 150 */         return a1;
/*     */       }
/*     */     } 
/* 153 */     return null;
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
/*     */   public static Collection<String> a(boolean ☃, boolean bool1) {
/* 168 */     List<String> list = Lists.newArrayList();
/*     */     
/* 170 */     for (a a1 : values()) {
/* 171 */       if (!a1.d() || ☃)
/*     */       {
/*     */         
/* 174 */         if (!a1.c() || bool1)
/*     */         {
/*     */           
/* 177 */           list.add(a1.g()); } 
/*     */       }
/*     */     } 
/* 180 */     return list;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */