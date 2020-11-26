/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import java.util.Collection;
/*     */ import java.util.Collections;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.function.Consumer;
/*     */ import javax.annotation.Nullable;
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
/*     */ public class cfc
/*     */ {
/*  29 */   private final Map<String, cez> a = Maps.newHashMap();
/*  30 */   private final Map<cff, List<cez>> b = Maps.newHashMap();
/*  31 */   private final Map<String, Map<cez, cfb>> c = Maps.newHashMap();
/*  32 */   private final cez[] d = new cez[19];
/*  33 */   private final Map<String, cfa> e = Maps.newHashMap();
/*  34 */   private final Map<String, cfa> f = Maps.newHashMap();
/*     */ 
/*     */   
/*     */   private static String[] g;
/*     */ 
/*     */   
/*     */   public cez c(String ☃) {
/*  41 */     return this.a.get(☃);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public cez d(@Nullable String ☃) {
/*  46 */     return this.a.get(☃);
/*     */   }
/*     */   
/*     */   public cez a(String ☃, cff cff1, ij ij1, cff.a a1) {
/*  50 */     if (☃.length() > 16) {
/*  51 */       throw new IllegalArgumentException("The objective name '" + ☃ + "' is too long!");
/*     */     }
/*  53 */     if (this.a.containsKey(☃)) {
/*  54 */       throw new IllegalArgumentException("An objective with the name '" + ☃ + "' already exists!");
/*     */     }
/*     */     
/*  57 */     cez cez1 = new cez(this, ☃, cff1, ij1, a1);
/*     */     
/*  59 */     ((List<cez>)this.b.computeIfAbsent(cff1, ☃ -> Lists.newArrayList())).add(cez1);
/*  60 */     this.a.put(☃, cez1);
/*  61 */     a(cez1);
/*  62 */     return cez1;
/*     */   }
/*     */   
/*     */   public final void a(cff ☃, String str, Consumer<cfb> consumer) {
/*  66 */     ((List)this.b.getOrDefault(☃, Collections.emptyList())).forEach(cez1 -> ☃.accept(c(str, cez1)));
/*     */   }
/*     */   
/*     */   public boolean b(String ☃, cez cez1) {
/*  70 */     Map<cez, cfb> map = this.c.get(☃);
/*  71 */     if (map == null) {
/*  72 */       return false;
/*     */     }
/*  74 */     cfb cfb = map.get(cez1);
/*  75 */     return (cfb != null);
/*     */   }
/*     */   
/*     */   public cfb c(String ☃, cez cez1) {
/*  79 */     if (☃.length() > 40) {
/*  80 */       throw new IllegalArgumentException("The player name '" + ☃ + "' is too long!");
/*     */     }
/*  82 */     Map<cez, cfb> map = this.c.computeIfAbsent(☃, ☃ -> Maps.newHashMap());
/*     */     
/*  84 */     return map.computeIfAbsent(cez1, cez1 -> {
/*     */           cfb cfb = new cfb(this, cez1, ☃);
/*     */           cfb.c(0);
/*     */           return cfb;
/*     */         });
/*     */   }
/*     */   
/*     */   public Collection<cfb> i(cez ☃) {
/*  92 */     List<cfb> list = Lists.newArrayList();
/*     */     
/*  94 */     for (Map<cez, cfb> map : this.c.values()) {
/*  95 */       cfb cfb = map.get(☃);
/*  96 */       if (cfb != null) {
/*  97 */         list.add(cfb);
/*     */       }
/*     */     } 
/*     */     
/* 101 */     Collections.sort(list, cfb.a);
/*     */     
/* 103 */     return list;
/*     */   }
/*     */   
/*     */   public Collection<cez> c() {
/* 107 */     return this.a.values();
/*     */   }
/*     */   
/*     */   public Collection<String> d() {
/* 111 */     return this.a.keySet();
/*     */   }
/*     */   
/*     */   public Collection<String> e() {
/* 115 */     return Lists.newArrayList(this.c.keySet());
/*     */   }
/*     */   
/*     */   public void d(String ☃, @Nullable cez cez1) {
/* 119 */     if (cez1 == null) {
/* 120 */       Map<cez, cfb> map = this.c.remove(☃);
/* 121 */       if (map != null) {
/* 122 */         a(☃);
/*     */       }
/*     */     } else {
/* 125 */       Map<cez, cfb> map = this.c.get(☃);
/* 126 */       if (map != null) {
/* 127 */         cfb cfb = map.remove(cez1);
/* 128 */         if (map.size() < 1) {
/* 129 */           Map<cez, cfb> map1 = this.c.remove(☃);
/* 130 */           if (map1 != null) {
/* 131 */             a(☃);
/*     */           }
/* 133 */         } else if (cfb != null) {
/* 134 */           a(☃, cez1);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public Map<cez, cfb> e(String ☃) {
/* 141 */     Map<cez, cfb> map = this.c.get(☃);
/* 142 */     if (map == null) {
/* 143 */       map = Maps.newHashMap();
/*     */     }
/* 145 */     return map;
/*     */   }
/*     */   
/*     */   public void j(cez ☃) {
/* 149 */     this.a.remove(☃.b());
/*     */     
/* 151 */     for (int i = 0; i < 19; i++) {
/* 152 */       if (a(i) == ☃) {
/* 153 */         a(i, (cez)null);
/*     */       }
/*     */     } 
/*     */     
/* 157 */     List<cez> list = this.b.get(☃.c());
/* 158 */     if (list != null) {
/* 159 */       list.remove(☃);
/*     */     }
/*     */     
/* 162 */     for (Map<cez, cfb> map : this.c.values()) {
/* 163 */       map.remove(☃);
/*     */     }
/*     */     
/* 166 */     c(☃);
/*     */   }
/*     */   
/*     */   public void a(int ☃, @Nullable cez cez1) {
/* 170 */     this.d[☃] = cez1;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public cez a(int ☃) {
/* 175 */     return this.d[☃];
/*     */   }
/*     */   
/*     */   public cfa f(String ☃) {
/* 179 */     return this.e.get(☃);
/*     */   }
/*     */   
/*     */   public cfa g(String ☃) {
/* 183 */     if (☃.length() > 16) {
/* 184 */       throw new IllegalArgumentException("The team name '" + ☃ + "' is too long!");
/*     */     }
/* 186 */     cfa cfa = f(☃);
/* 187 */     if (cfa != null) {
/* 188 */       throw new IllegalArgumentException("A team with the name '" + ☃ + "' already exists!");
/*     */     }
/*     */     
/* 191 */     cfa = new cfa(this, ☃);
/* 192 */     this.e.put(☃, cfa);
/* 193 */     a(cfa);
/*     */     
/* 195 */     return cfa;
/*     */   }
/*     */   
/*     */   public void d(cfa ☃) {
/* 199 */     this.e.remove(☃.b());
/*     */ 
/*     */ 
/*     */     
/* 203 */     for (String str : ☃.g()) {
/* 204 */       this.f.remove(str);
/*     */     }
/*     */     
/* 207 */     c(☃);
/*     */   }
/*     */   
/*     */   public boolean a(String ☃, cfa cfa1) {
/* 211 */     if (☃.length() > 40) {
/* 212 */       throw new IllegalArgumentException("The player name '" + ☃ + "' is too long!");
/*     */     }
/*     */     
/* 215 */     if (i(☃) != null) {
/* 216 */       h(☃);
/*     */     }
/*     */     
/* 219 */     this.f.put(☃, cfa1);
/* 220 */     return cfa1.g().add(☃);
/*     */   }
/*     */   
/*     */   public boolean h(String ☃) {
/* 224 */     cfa cfa = i(☃);
/*     */     
/* 226 */     if (cfa != null) {
/* 227 */       b(☃, cfa);
/* 228 */       return true;
/*     */     } 
/* 230 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(String ☃, cfa cfa1) {
/* 235 */     if (i(☃) != cfa1) {
/* 236 */       throw new IllegalStateException("Player is either on another team or not on any team. Cannot remove from team '" + cfa1.b() + "'.");
/*     */     }
/*     */     
/* 239 */     this.f.remove(☃);
/* 240 */     cfa1.g().remove(☃);
/*     */   }
/*     */   
/*     */   public Collection<String> f() {
/* 244 */     return this.e.keySet();
/*     */   }
/*     */   
/*     */   public Collection<cfa> g() {
/* 248 */     return this.e.values();
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public cfa i(String ☃) {
/* 253 */     return this.f.get(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(cez ☃) {}
/*     */ 
/*     */   
/*     */   public void b(cez ☃) {}
/*     */ 
/*     */   
/*     */   public void c(cez ☃) {}
/*     */ 
/*     */   
/*     */   public void a(cfb ☃) {}
/*     */ 
/*     */   
/*     */   public void a(String ☃) {}
/*     */ 
/*     */   
/*     */   public void a(String ☃, cez cez1) {}
/*     */ 
/*     */   
/*     */   public void a(cfa ☃) {}
/*     */ 
/*     */   
/*     */   public void b(cfa ☃) {}
/*     */ 
/*     */   
/*     */   public void c(cfa ☃) {}
/*     */   
/*     */   public static String b(int ☃) {
/* 284 */     switch (☃) {
/*     */       case 0:
/* 286 */         return "list";
/*     */       case 1:
/* 288 */         return "sidebar";
/*     */       case 2:
/* 290 */         return "belowName";
/*     */     } 
/* 292 */     if (☃ >= 3 && ☃ <= 18) {
/* 293 */       a a = a.a(☃ - 3);
/* 294 */       if (a != null && a != a.v) {
/* 295 */         return "sidebar.team." + a.g();
/*     */       }
/*     */     } 
/* 298 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public static int j(String ☃) {
/* 303 */     if ("list".equalsIgnoreCase(☃))
/* 304 */       return 0; 
/* 305 */     if ("sidebar".equalsIgnoreCase(☃))
/* 306 */       return 1; 
/* 307 */     if ("belowName".equalsIgnoreCase(☃)) {
/* 308 */       return 2;
/*     */     }
/* 310 */     if (☃.startsWith("sidebar.team.")) {
/* 311 */       String str = ☃.substring("sidebar.team.".length());
/* 312 */       a a = a.c(str);
/* 313 */       if (a != null && a.b() >= 0) {
/* 314 */         return a.b() + 3;
/*     */       }
/*     */     } 
/* 317 */     return -1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static String[] h() {
/* 324 */     if (g == null) {
/* 325 */       g = new String[19];
/* 326 */       for (int ☃ = 0; ☃ < 19; ☃++) {
/* 327 */         g[☃] = b(☃);
/*     */       }
/*     */     } 
/* 330 */     return g;
/*     */   }
/*     */   
/*     */   public void a(aer ☃) {
/* 334 */     if (☃ == null || ☃ instanceof aog || ☃.aF()) {
/*     */       return;
/*     */     }
/* 337 */     String str = ☃.bu();
/* 338 */     d(str, null);
/* 339 */     h(str);
/*     */   }
/*     */   
/*     */   protected he i() {
/* 343 */     he ☃ = new he();
/*     */     
/* 345 */     this.c.values().stream().map(Map::values).forEach(collection -> collection.stream().filter(()).forEach(()));
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
/* 356 */     return ☃;
/*     */   }
/*     */   
/*     */   protected void a(he ☃) {
/* 360 */     for (int i = 0; i < ☃.size(); i++) {
/* 361 */       gy gy = ☃.e(i);
/*     */       
/* 363 */       cez cez1 = c(gy.l("Objective"));
/* 364 */       String str = gy.l("Name");
/* 365 */       if (str.length() > 40)
/*     */       {
/* 367 */         str = str.substring(0, 40);
/*     */       }
/* 369 */       cfb cfb = c(str, cez1);
/* 370 */       cfb.c(gy.h("Score"));
/* 371 */       if (gy.e("Locked"))
/* 372 */         cfb.a(gy.q("Locked")); 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\cfc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */