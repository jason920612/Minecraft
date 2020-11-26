/*     */ import com.google.common.collect.Maps;
/*     */ import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
/*     */ import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
/*     */ import it.unimi.dsi.fastutil.longs.LongArrayList;
/*     */ import java.io.IOException;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Locale;
/*     */ import java.util.Map;
/*     */ import java.util.function.Function;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class bwp
/*     */ {
/*     */   private static final Map<String, String> b;
/*     */   private static final Map<String, String> c;
/*     */   private final boolean d;
/*  26 */   private static final Logger a = LogManager.getLogger(); private final Map<String, Long2ObjectMap<gy>> e; private final Map<String, bwz> f;
/*     */   static {
/*  28 */     b = k.<Map<String, String>>a(Maps.newHashMap(), ☃ -> {
/*     */           ☃.put("Village", "Village");
/*     */           
/*     */           ☃.put("Mineshaft", "Mineshaft");
/*     */           
/*     */           ☃.put("Mansion", "Mansion");
/*     */           ☃.put("Igloo", "Temple");
/*     */           ☃.put("Desert_Pyramid", "Temple");
/*     */           ☃.put("Jungle_Pyramid", "Temple");
/*     */           ☃.put("Swamp_Hut", "Temple");
/*     */           ☃.put("Stronghold", "Stronghold");
/*     */           ☃.put("Monument", "Monument");
/*     */           ☃.put("Fortress", "Fortress");
/*     */           ☃.put("EndCity", "EndCity");
/*     */         });
/*  43 */     c = k.<Map<String, String>>a(Maps.newHashMap(), ☃ -> {
/*     */           ☃.put("Iglu", "Igloo");
/*     */           ☃.put("TeDP", "Desert_Pyramid");
/*     */           ☃.put("TeJP", "Jungle_Pyramid");
/*     */           ☃.put("TeSH", "Swamp_Hut");
/*     */         });
/*     */   }
/*     */   public bwp(@Nullable cck ☃) {
/*     */     int i;
/*  52 */     this.e = Maps.newHashMap();
/*  53 */     this.f = Maps.newHashMap();
/*     */ 
/*     */     
/*  56 */     a(☃);
/*     */ 
/*     */     
/*  59 */     boolean bool = false;
/*  60 */     for (String str : b()) {
/*  61 */       i = bool | ((this.e.get(str) != null) ? 1 : 0);
/*     */     }
/*  63 */     this.d = i;
/*     */   }
/*     */   
/*     */   public void a(long ☃) {
/*  67 */     for (String str : a()) {
/*  68 */       bwz bwz = this.f.get(str);
/*  69 */       if (bwz != null && bwz.c(☃)) {
/*  70 */         bwz.d(☃);
/*  71 */         bwz.c();
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public gy a(gy ☃) {
/*  77 */     gy gy1 = ☃.p("Level");
/*     */     
/*  79 */     axm axm = new axm(gy1.h("xPos"), gy1.h("zPos"));
/*     */     
/*  81 */     if (a(axm.a, axm.b)) {
/*  82 */       ☃ = a(☃, axm);
/*     */     }
/*     */     
/*  85 */     gy gy2 = gy1.p("Structures");
/*  86 */     gy gy3 = gy2.p("References");
/*     */     
/*  88 */     for (String str : b()) {
/*  89 */       btl<?> btl = bqo.aF.get(str.toLowerCase(Locale.ROOT));
/*     */       
/*  91 */       if (!gy3.c(str, 12) && btl != null) {
/*     */ 
/*     */ 
/*     */         
/*  95 */         int i = btl.b();
/*  96 */         LongArrayList longArrayList = new LongArrayList();
/*     */         
/*  98 */         for (int j = axm.a - i; j <= axm.a + i; j++) {
/*  99 */           for (int k = axm.b - i; k <= axm.b + i; k++) {
/* 100 */             if (a(j, k, str)) {
/* 101 */               longArrayList.add(axm.a(j, k));
/*     */             }
/*     */           } 
/*     */         } 
/*     */         
/* 106 */         gy3.c(str, (List<Long>)longArrayList);
/*     */       } 
/*     */     } 
/* 109 */     gy2.a("References", gy3);
/* 110 */     gy1.a("Structures", gy2);
/* 111 */     ☃.a("Level", gy1);
/*     */     
/* 113 */     return ☃;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean a(int ☃, int i, String str) {
/* 121 */     if (!this.d) {
/* 122 */       return false;
/*     */     }
/*     */     
/* 125 */     if (this.e.get(str) != null && ((bwz)this.f.get(b.get(str))).b(axm.a(☃, i))) {
/* 126 */       return true;
/*     */     }
/*     */     
/* 129 */     return false;
/*     */   }
/*     */   
/*     */   private boolean a(int ☃, int i) {
/* 133 */     if (!this.d) {
/* 134 */       return false;
/*     */     }
/*     */     
/* 137 */     for (String str : b()) {
/* 138 */       if (this.e.get(str) != null && ((bwz)this.f.get(b.get(str))).c(axm.a(☃, i))) {
/* 139 */         return true;
/*     */       }
/*     */     } 
/* 142 */     return false;
/*     */   }
/*     */   
/*     */   private gy a(gy ☃, axm axm1) {
/* 146 */     gy gy1 = ☃.p("Level");
/* 147 */     gy gy2 = gy1.p("Structures");
/* 148 */     gy gy3 = gy2.p("Starts");
/*     */     
/* 150 */     for (String str : b()) {
/* 151 */       Long2ObjectMap<gy> long2ObjectMap = this.e.get(str);
/* 152 */       if (long2ObjectMap != null) {
/*     */ 
/*     */ 
/*     */         
/* 156 */         long l = axm1.a();
/*     */         
/* 158 */         if (((bwz)this.f.get(b.get(str))).c(l)) {
/*     */ 
/*     */ 
/*     */           
/* 162 */           gy gy4 = (gy)long2ObjectMap.get(l);
/* 163 */           if (gy4 != null)
/*     */           {
/*     */ 
/*     */             
/* 167 */             gy3.a(str, gy4); } 
/*     */         } 
/*     */       } 
/* 170 */     }  gy2.a("Starts", gy3);
/* 171 */     gy1.a("Structures", gy2);
/* 172 */     ☃.a("Level", gy1);
/*     */     
/* 174 */     return ☃;
/*     */   }
/*     */   
/*     */   private void a(@Nullable cck ☃) {
/* 178 */     if (☃ == null) {
/*     */       return;
/*     */     }
/*     */     
/* 182 */     for (String str1 : a()) {
/* 183 */       gy gy = new gy();
/*     */       try {
/* 185 */         gy = ☃.a(str1, 1493).p("data").p("Features");
/* 186 */         if (gy.isEmpty()) {
/*     */           continue;
/*     */         }
/* 189 */       } catch (IOException iOException) {}
/*     */ 
/*     */       
/* 192 */       for (String str3 : gy.c()) {
/* 193 */         gy gy1 = gy.p(str3);
/* 194 */         long l = axm.a(gy1.h("ChunkX"), gy1.h("ChunkZ"));
/*     */ 
/*     */         
/* 197 */         he he = gy1.d("Children", 10);
/* 198 */         if (!he.isEmpty()) {
/* 199 */           String str5 = he.e(0).l("id");
/* 200 */           String str6 = c.get(str5);
/* 201 */           if (str6 != null) {
/* 202 */             gy1.a("id", str6);
/*     */           }
/*     */         } 
/*     */         
/* 206 */         String str4 = gy1.l("id");
/*     */         
/* 208 */         ((Long2ObjectMap)this.e.computeIfAbsent(str4, ☃ -> new Long2ObjectOpenHashMap())).put(l, gy1);
/*     */       } 
/*     */       
/* 211 */       String str2 = str1 + "_index";
/* 212 */       bwz bwz = ☃.<bwz>a(bod.a, bwz::new, str2);
/*     */       
/* 214 */       if (bwz == null || bwz.a().isEmpty()) {
/*     */         
/* 216 */         bwz bwz1 = new bwz(str2);
/* 217 */         this.f.put(str1, bwz1);
/* 218 */         for (String str : gy.c()) {
/* 219 */           gy gy1 = gy.p(str);
/* 220 */           bwz1.a(axm.a(gy1.h("ChunkX"), gy1.h("ChunkZ")));
/*     */         } 
/* 222 */         ☃.a(bod.a, str2, bwz1);
/* 223 */         bwz1.c();
/*     */       } else {
/* 225 */         this.f.put(str1, bwz);
/*     */       } 
/*     */       continue;
/*     */     } 
/*     */   } protected abstract String[] a();
/*     */   public static bwp a(bod ☃, @Nullable cck cck1) {
/* 231 */     if (☃ == bod.a)
/* 232 */       return new b(cck1); 
/* 233 */     if (☃ == bod.b)
/* 234 */       return new a(cck1); 
/* 235 */     if (☃ == bod.c) {
/* 236 */       return new c(cck1);
/*     */     }
/* 238 */     throw new RuntimeException(String.format("Unknown dimension type : %s", new Object[] { ☃ }));
/*     */   }
/*     */   protected abstract String[] b();
/*     */   
/* 242 */   public static class b extends bwp { private static final String[] a = new String[] { "Monument", "Stronghold", "Village", "Mineshaft", "Temple", "Mansion" };
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 251 */     private static final String[] b = new String[] { "Village", "Mineshaft", "Mansion", "Igloo", "Desert_Pyramid", "Jungle_Pyramid", "Swamp_Hut", "Stronghold", "Monument" };
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
/*     */     public b(@Nullable cck ☃) {
/* 264 */       super(☃);
/*     */     }
/*     */ 
/*     */     
/*     */     protected String[] a() {
/* 269 */       return a;
/*     */     }
/*     */ 
/*     */     
/*     */     protected String[] b() {
/* 274 */       return b;
/*     */     } }
/*     */ 
/*     */   
/*     */   public static class a extends bwp {
/* 279 */     private static final String[] a = new String[] { "Fortress" };
/*     */ 
/*     */ 
/*     */     
/*     */     public a(@Nullable cck ☃) {
/* 284 */       super(☃);
/*     */     }
/*     */ 
/*     */     
/*     */     protected String[] a() {
/* 289 */       return a;
/*     */     }
/*     */ 
/*     */     
/*     */     protected String[] b() {
/* 294 */       return a;
/*     */     }
/*     */   }
/*     */   
/*     */   public static class c extends bwp {
/* 299 */     private static final String[] a = new String[] { "EndCity" };
/*     */ 
/*     */ 
/*     */     
/*     */     public c(@Nullable cck ☃) {
/* 304 */       super(☃);
/*     */     }
/*     */ 
/*     */     
/*     */     protected String[] a() {
/* 309 */       return a;
/*     */     }
/*     */ 
/*     */     
/*     */     protected String[] b() {
/* 314 */       return a;
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bwp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */