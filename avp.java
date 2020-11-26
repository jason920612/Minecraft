/*     */ import com.google.common.annotations.VisibleForTesting;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.collect.Sets;
/*     */ import com.google.gson.JsonArray;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonParseException;
/*     */ import com.google.gson.JsonSyntaxException;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
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
/*     */ public class avp
/*     */   implements avk
/*     */ {
/*     */   private final int a;
/*     */   private final int b;
/*     */   private final ez<avh> c;
/*     */   private final ate d;
/*     */   private final pc e;
/*     */   private final String f;
/*     */   
/*     */   public avp(pc ☃, String str, int i, int j, ez<avh> ez1, ate ate1) {
/*  34 */     this.e = ☃;
/*  35 */     this.f = str;
/*  36 */     this.a = i;
/*  37 */     this.b = j;
/*  38 */     this.c = ez1;
/*  39 */     this.d = ate1;
/*     */   }
/*     */ 
/*     */   
/*     */   public pc b() {
/*  44 */     return this.e;
/*     */   }
/*     */ 
/*     */   
/*     */   public avm<?> a() {
/*  49 */     return avn.a;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ate d() {
/*  59 */     return this.d;
/*     */   }
/*     */ 
/*     */   
/*     */   public ez<avh> e() {
/*  64 */     return this.c;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(ade ☃, axy axy1) {
/*  74 */     if (!(☃ instanceof aqc)) {
/*  75 */       return false;
/*     */     }
/*     */     
/*  78 */     for (int i = 0; i <= ☃.U_() - this.a; i++) {
/*  79 */       for (int j = 0; j <= ☃.n() - this.b; j++) {
/*  80 */         if (a(☃, i, j, true)) {
/*  81 */           return true;
/*     */         }
/*  83 */         if (a(☃, i, j, false)) {
/*  84 */           return true;
/*     */         }
/*     */       } 
/*     */     } 
/*  88 */     return false;
/*     */   }
/*     */   
/*     */   private boolean a(ade ☃, int i, int j, boolean bool) {
/*  92 */     for (int k = 0; k < ☃.U_(); k++) {
/*  93 */       for (int m = 0; m < ☃.n(); m++) {
/*  94 */         int n = k - i;
/*  95 */         int i1 = m - j;
/*  96 */         avh avh = avh.a;
/*  97 */         if (n >= 0 && i1 >= 0 && n < this.a && i1 < this.b) {
/*  98 */           if (bool) {
/*  99 */             avh = this.c.get(this.a - n - 1 + i1 * this.a);
/*     */           } else {
/* 101 */             avh = this.c.get(n + i1 * this.a);
/*     */           } 
/*     */         }
/* 104 */         if (!avh.a(☃.a(k + m * ☃.U_()))) {
/* 105 */           return false;
/*     */         }
/*     */       } 
/*     */     } 
/* 109 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public ate a(ade ☃) {
/* 114 */     return d().i();
/*     */   }
/*     */   
/*     */   public int g() {
/* 118 */     return this.a;
/*     */   }
/*     */   
/*     */   public int h() {
/* 122 */     return this.b;
/*     */   }
/*     */   
/*     */   private static ez<avh> b(String[] ☃, Map<String, avh> map, int i, int j) {
/* 126 */     ez<avh> ez1 = ez.a(i * j, avh.a);
/* 127 */     Set<String> set = Sets.newHashSet(map.keySet());
/* 128 */     set.remove(" ");
/*     */     
/* 130 */     for (int k = 0; k < ☃.length; k++) {
/* 131 */       for (int m = 0; m < ☃[k].length(); m++) {
/* 132 */         String str = ☃[k].substring(m, m + 1);
/* 133 */         avh avh = map.get(str);
/* 134 */         if (avh == null) {
/* 135 */           throw new JsonSyntaxException("Pattern references symbol '" + str + "' but it's not defined in the key");
/*     */         }
/* 137 */         set.remove(str);
/* 138 */         ez1.set(m + i * k, avh);
/*     */       } 
/*     */     } 
/*     */     
/* 142 */     if (!set.isEmpty()) {
/* 143 */       throw new JsonSyntaxException("Key defines symbols that aren't used in pattern: " + set);
/*     */     }
/*     */     
/* 146 */     return ez1;
/*     */   }
/*     */   
/*     */   @VisibleForTesting
/*     */   static String[] a(String... ☃) {
/* 151 */     int i = Integer.MAX_VALUE;
/* 152 */     int j = 0;
/* 153 */     int k = 0;
/* 154 */     int m = 0;
/*     */     
/* 156 */     for (int n = 0; n < ☃.length; n++) {
/* 157 */       String str = ☃[n];
/*     */       
/* 159 */       i = Math.min(i, a(str));
/* 160 */       int i2 = b(str);
/* 161 */       j = Math.max(j, i2);
/*     */ 
/*     */       
/* 164 */       if (i2 < 0) {
/* 165 */         if (k == n) {
/* 166 */           k++;
/*     */         }
/* 168 */         m++;
/*     */       } else {
/* 170 */         m = 0;
/*     */       } 
/*     */     } 
/*     */     
/* 174 */     if (☃.length == m) {
/* 175 */       return new String[0];
/*     */     }
/* 177 */     String[] arrayOfString = new String[☃.length - m - k];
/* 178 */     for (int i1 = 0; i1 < arrayOfString.length; i1++) {
/* 179 */       arrayOfString[i1] = ☃[i1 + k].substring(i, j + 1);
/*     */     }
/*     */     
/* 182 */     return arrayOfString;
/*     */   }
/*     */   
/*     */   private static int a(String ☃) {
/* 186 */     int i = 0;
/* 187 */     while (i < ☃.length() && ☃.charAt(i) == ' ') {
/* 188 */       i++;
/*     */     }
/*     */     
/* 191 */     return i;
/*     */   }
/*     */   
/*     */   private static int b(String ☃) {
/* 195 */     int i = ☃.length() - 1;
/* 196 */     while (i >= 0 && ☃.charAt(i) == ' ') {
/* 197 */       i--;
/*     */     }
/*     */     
/* 200 */     return i;
/*     */   }
/*     */   
/*     */   private static String[] b(JsonArray ☃) {
/* 204 */     String[] arrayOfString = new String[☃.size()];
/* 205 */     if (arrayOfString.length > 3)
/* 206 */       throw new JsonSyntaxException("Invalid pattern: too many rows, 3 is maximum"); 
/* 207 */     if (arrayOfString.length == 0) {
/* 208 */       throw new JsonSyntaxException("Invalid pattern: empty pattern not allowed");
/*     */     }
/* 210 */     for (int i = 0; i < arrayOfString.length; i++) {
/* 211 */       String str = xj.a(☃.get(i), "pattern[" + i + "]");
/* 212 */       if (str.length() > 3)
/* 213 */         throw new JsonSyntaxException("Invalid pattern: too many columns, 3 is maximum"); 
/* 214 */       if (i > 0 && arrayOfString[0].length() != str.length()) {
/* 215 */         throw new JsonSyntaxException("Invalid pattern: each row must be the same width");
/*     */       }
/* 217 */       arrayOfString[i] = str;
/*     */     } 
/* 219 */     return arrayOfString;
/*     */   }
/*     */   
/*     */   private static Map<String, avh> c(JsonObject ☃) {
/* 223 */     Map<String, avh> map = Maps.newHashMap();
/* 224 */     for (Map.Entry<String, JsonElement> entry : (Iterable<Map.Entry<String, JsonElement>>)☃.entrySet()) {
/* 225 */       if (((String)entry.getKey()).length() != 1)
/* 226 */         throw new JsonSyntaxException("Invalid key entry: '" + (String)entry.getKey() + "' is an invalid symbol (must be 1 character only)."); 
/* 227 */       if (" ".equals(entry.getKey())) {
/* 228 */         throw new JsonSyntaxException("Invalid key entry: ' ' is a reserved symbol.");
/*     */       }
/* 230 */       map.put(entry.getKey(), avh.a(entry.getValue()));
/*     */     } 
/* 232 */     map.put(" ", avh.a);
/* 233 */     return map;
/*     */   }
/*     */   
/*     */   public static ate a(JsonObject ☃) {
/* 237 */     String str = xj.h(☃, "item");
/* 238 */     ata ata = fc.s.b(new pc(str));
/* 239 */     if (ata == null) {
/* 240 */       throw new JsonSyntaxException("Unknown item '" + str + "'");
/*     */     }
/* 242 */     if (☃.has("data")) {
/* 243 */       throw new JsonParseException("Disallowed data tag found");
/*     */     }
/* 245 */     int i = xj.a(☃, "count", 1);
/* 246 */     return new ate(ata, i);
/*     */   }
/*     */   
/*     */   public static class a
/*     */     implements avm<avp> {
/*     */     public avp b(pc ☃, JsonObject jsonObject) {
/* 252 */       String str = xj.a(jsonObject, "group", "");
/*     */       
/* 254 */       Map<String, avh> map = avp.b(xj.t(jsonObject, "key"));
/* 255 */       String[] arrayOfString = avp.a(avp.a(xj.u(jsonObject, "pattern")));
/*     */       
/* 257 */       int i = arrayOfString[0].length();
/* 258 */       int j = arrayOfString.length;
/*     */       
/* 260 */       ez<avh> ez = avp.a(arrayOfString, map, i, j);
/*     */       
/* 262 */       ate ate = avp.a(xj.t(jsonObject, "result"));
/*     */       
/* 264 */       return new avp(☃, str, i, j, ez, ate);
/*     */     }
/*     */ 
/*     */     
/*     */     public String a() {
/* 269 */       return "crafting_shaped";
/*     */     }
/*     */ 
/*     */     
/*     */     public avp b(pc ☃, hy hy1) {
/* 274 */       int i = hy1.g();
/* 275 */       int j = hy1.g();
/* 276 */       String str = hy1.e(32767);
/* 277 */       ez<avh> ez = ez.a(i * j, avh.a);
/* 278 */       for (int k = 0; k < ez.size(); k++) {
/* 279 */         ez.set(k, avh.b(hy1));
/*     */       }
/* 281 */       ate ate = hy1.k();
/* 282 */       return new avp(☃, str, i, j, ez, ate);
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(hy ☃, avp avp1) {
/* 287 */       ☃.d(avp.a(avp1));
/* 288 */       ☃.d(avp.b(avp1));
/* 289 */       ☃.a(avp.c(avp1));
/* 290 */       for (avh avh : avp.d(avp1)) {
/* 291 */         avh.a(☃);
/*     */       }
/* 293 */       ☃.a(avp.e(avp1));
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\avp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */