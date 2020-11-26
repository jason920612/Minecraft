/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.collect.Sets;
/*     */ import com.google.common.io.Files;
/*     */ import com.google.gson.Gson;
/*     */ import com.google.gson.GsonBuilder;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonParseException;
/*     */ import com.google.gson.internal.Streams;
/*     */ import com.google.gson.reflect.TypeToken;
/*     */ import com.google.gson.stream.JsonReader;
/*     */ import com.mojang.datafixers.DSL;
/*     */ import com.mojang.datafixers.DataFixTypes;
/*     */ import com.mojang.datafixers.Dynamic;
/*     */ import com.mojang.datafixers.types.DynamicOps;
/*     */ import com.mojang.datafixers.types.JsonOps;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.io.StringReader;
/*     */ import java.nio.charset.StandardCharsets;
/*     */ import java.util.Comparator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import java.util.stream.Collector;
/*     */ import java.util.stream.Collectors;
/*     */ import java.util.stream.Stream;
/*     */ import javax.annotation.Nullable;
/*     */ import net.minecraft.server.MinecraftServer;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
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
/*     */ public class pm
/*     */ {
/*  47 */   private static final Logger a = LogManager.getLogger();
/*     */   
/*  49 */   private static final Gson b = (new GsonBuilder())
/*  50 */     .registerTypeAdapter(n.class, new n.a())
/*  51 */     .registerTypeAdapter(pc.class, new pc.a())
/*  52 */     .setPrettyPrinting()
/*  53 */     .create();
/*  54 */   private static final TypeToken<Map<pc, n>> c = new TypeToken<Map<pc, n>>() {
/*     */     
/*     */     };
/*     */   private final MinecraftServer d;
/*  58 */   private final Map<l, n> f = Maps.newLinkedHashMap(); private final File e;
/*  59 */   private final Set<l> g = Sets.newLinkedHashSet();
/*  60 */   private final Set<l> h = Sets.newLinkedHashSet();
/*  61 */   private final Set<l> i = Sets.newLinkedHashSet();
/*     */   private tf j;
/*     */   @Nullable
/*     */   private l k;
/*     */   private boolean l = true;
/*     */   
/*     */   public pm(MinecraftServer ☃, File file, tf tf1) {
/*  68 */     this.d = ☃;
/*  69 */     this.e = file;
/*  70 */     this.j = tf1;
/*  71 */     g();
/*     */   }
/*     */   
/*     */   public void a(tf ☃) {
/*  75 */     this.j = ☃;
/*     */   }
/*     */   
/*     */   public void a() {
/*  79 */     for (s<?> ☃ : p.a()) {
/*  80 */       ☃.a(this);
/*     */     }
/*     */   }
/*     */   
/*     */   public void b() {
/*  85 */     a();
/*  86 */     this.f.clear();
/*  87 */     this.g.clear();
/*  88 */     this.h.clear();
/*  89 */     this.i.clear();
/*  90 */     this.l = true;
/*  91 */     this.k = null;
/*  92 */     g();
/*     */   }
/*     */   
/*     */   private void d() {
/*  96 */     for (l ☃ : this.d.aA().b()) {
/*  97 */       c(☃);
/*     */     }
/*     */   }
/*     */   
/*     */   private void e() {
/* 102 */     List<l> ☃ = Lists.newArrayList();
/* 103 */     for (Map.Entry<l, n> entry : this.f.entrySet()) {
/* 104 */       if (((n)entry.getValue()).a()) {
/* 105 */         ☃.add(entry.getKey());
/* 106 */         this.i.add(entry.getKey());
/*     */       } 
/*     */     } 
/* 109 */     for (l l1 : ☃) {
/* 110 */       e(l1);
/*     */     }
/*     */   }
/*     */   
/*     */   private void f() {
/* 115 */     for (l ☃ : this.d.aA().b()) {
/* 116 */       if (☃.f().isEmpty()) {
/* 117 */         a(☃, "");
/* 118 */         ☃.d().a(this.j);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private void g() {
/* 124 */     if (this.e.isFile()) {
/* 125 */       try (JsonReader ☃ = new JsonReader(new StringReader(Files.toString(this.e, StandardCharsets.UTF_8)))) {
/* 126 */         ☃.setLenient(false);
/* 127 */         Dynamic<JsonElement> dynamic = new Dynamic((DynamicOps)JsonOps.INSTANCE, Streams.parse(☃));
/*     */ 
/*     */         
/* 130 */         if (!dynamic.get("DataVersion").flatMap(Dynamic::getNumberValue).isPresent()) {
/* 131 */           dynamic = dynamic.set("DataVersion", dynamic.createInt(1343));
/*     */         }
/* 133 */         dynamic = this.d.az().update((DSL.TypeReference)DataFixTypes.ADVANCEMENTS, dynamic, dynamic.getInt("DataVersion"), 1631);
/*     */         
/* 135 */         dynamic = dynamic.remove("DataVersion");
/*     */         
/* 137 */         Map<pc, n> map = (Map<pc, n>)b.getAdapter(c).fromJsonTree((JsonElement)dynamic.getValue());
/*     */         
/* 139 */         if (map == null) {
/* 140 */           throw new JsonParseException("Found null for advancements");
/*     */         }
/* 142 */         Stream<Map.Entry<pc, n>> stream = map.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue));
/* 143 */         for (Map.Entry<pc, n> entry : (Iterable<Map.Entry<pc, n>>)stream.collect((Collector)Collectors.toList())) {
/* 144 */           l l1 = this.d.aA().a(entry.getKey());
/* 145 */           if (l1 == null) {
/* 146 */             a.warn("Ignored advancement '{}' in progress file {} - it doesn't exist anymore?", entry.getKey(), this.e);
/*     */             continue;
/*     */           } 
/* 149 */           a(l1, entry.getValue());
/*     */         } 
/* 151 */       } catch (JsonParseException ☃) {
/* 152 */         a.error("Couldn't parse player advancements in {}", this.e, ☃);
/* 153 */       } catch (IOException ☃) {
/* 154 */         a.error("Couldn't access player advancements in {}", this.e, ☃);
/*     */       } 
/*     */     }
/*     */     
/* 158 */     f();
/* 159 */     e();
/* 160 */     d();
/*     */   }
/*     */   
/*     */   public void c() {
/* 164 */     Map<pc, n> ☃ = Maps.newHashMap();
/* 165 */     for (Map.Entry<l, n> entry : this.f.entrySet()) {
/* 166 */       n n = entry.getValue();
/* 167 */       if (n.b()) {
/* 168 */         ☃.put(((l)entry.getKey()).h(), n);
/*     */       }
/*     */     } 
/* 171 */     if (this.e.getParentFile() != null) {
/* 172 */       this.e.getParentFile().mkdirs();
/*     */     }
/*     */     try {
/* 175 */       Files.write(b.toJson(☃), this.e, StandardCharsets.UTF_8);
/* 176 */     } catch (IOException iOException) {
/* 177 */       a.error("Couldn't save player advancements to {}", this.e, iOException);
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean a(l ☃, String str) {
/* 182 */     boolean bool1 = false;
/*     */     
/* 184 */     n n = b(☃);
/* 185 */     boolean bool2 = n.a();
/*     */     
/* 187 */     if (n.a(str)) {
/* 188 */       d(☃);
/* 189 */       this.i.add(☃);
/* 190 */       bool1 = true;
/*     */       
/* 192 */       if (!bool2 && n.a()) {
/* 193 */         ☃.d().a(this.j);
/* 194 */         if (☃.c() != null && ☃.c().i() && this.j.m.X().b("announceAdvancements")) {
/* 195 */           this.d.ac().a(new ir("chat.type.advancement." + ☃.c().e().a(), new Object[] { this.j.O(), ☃.j() }));
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 200 */     if (n.a()) {
/* 201 */       e(☃);
/*     */     }
/*     */     
/* 204 */     return bool1;
/*     */   }
/*     */   
/*     */   public boolean b(l ☃, String str) {
/* 208 */     boolean bool = false;
/*     */     
/* 210 */     n n = b(☃);
/* 211 */     if (n.b(str)) {
/* 212 */       c(☃);
/* 213 */       this.i.add(☃);
/* 214 */       bool = true;
/*     */     } 
/*     */     
/* 217 */     if (!n.b()) {
/* 218 */       e(☃);
/*     */     }
/*     */     
/* 221 */     return bool;
/*     */   }
/*     */   
/*     */   private void c(l ☃) {
/* 225 */     n n = b(☃);
/* 226 */     if (n.a()) {
/*     */       return;
/*     */     }
/* 229 */     for (Map.Entry<String, q> entry : ☃.f().entrySet()) {
/* 230 */       r r = n.c(entry.getKey());
/* 231 */       if (r == null || r.a()) {
/*     */         continue;
/*     */       }
/* 234 */       t t = ((q)entry.getValue()).a();
/* 235 */       if (t != null) {
/* 236 */         s<t> s = p.a(t.a());
/* 237 */         if (s != null) {
/* 238 */           s.a(this, new s.a<>(t, ☃, entry.getKey()));
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private void d(l ☃) {
/* 245 */     n n = b(☃);
/* 246 */     for (Map.Entry<String, q> entry : ☃.f().entrySet()) {
/* 247 */       r r = n.c(entry.getKey());
/* 248 */       if (r == null || (!r.a() && !n.a())) {
/*     */         continue;
/*     */       }
/* 251 */       t t = ((q)entry.getValue()).a();
/* 252 */       if (t != null) {
/* 253 */         s<t> s = p.a(t.a());
/* 254 */         if (s != null) {
/* 255 */           s.b(this, new s.a<>(t, ☃, entry.getKey()));
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public void b(tf ☃) {
/* 262 */     if (this.l || !this.h.isEmpty() || !this.i.isEmpty()) {
/* 263 */       Map<pc, n> map = Maps.newHashMap();
/* 264 */       Set<l> set = Sets.newLinkedHashSet();
/* 265 */       Set<pc> set1 = Sets.newLinkedHashSet();
/* 266 */       for (l l1 : this.i) {
/* 267 */         if (this.g.contains(l1)) {
/* 268 */           map.put(l1.h(), this.f.get(l1));
/*     */         }
/*     */       } 
/* 271 */       for (l l1 : this.h) {
/* 272 */         if (this.g.contains(l1)) {
/* 273 */           set.add(l1); continue;
/*     */         } 
/* 275 */         set1.add(l1.h());
/*     */       } 
/*     */       
/* 278 */       if (this.l || !map.isEmpty() || !set.isEmpty() || !set1.isEmpty()) {
/* 279 */         ☃.a.a(new lz(this.l, set, set1, map));
/* 280 */         this.h.clear();
/* 281 */         this.i.clear();
/*     */       } 
/*     */     } 
/* 284 */     this.l = false;
/*     */   }
/*     */   
/*     */   public void a(@Nullable l ☃) {
/* 288 */     l l1 = this.k;
/* 289 */     if (☃ != null && ☃.b() == null && ☃.c() != null) {
/* 290 */       this.k = ☃;
/*     */     } else {
/* 292 */       this.k = null;
/*     */     } 
/* 294 */     if (l1 != this.k) {
/* 295 */       this.j.a.a(new lb((this.k == null) ? null : this.k.h()));
/*     */     }
/*     */   }
/*     */   
/*     */   public n b(l ☃) {
/* 300 */     n n = this.f.get(☃);
/* 301 */     if (n == null) {
/* 302 */       n = new n();
/* 303 */       a(☃, n);
/*     */     } 
/* 305 */     return n;
/*     */   }
/*     */   
/*     */   private void a(l ☃, n n1) {
/* 309 */     n1.a(☃.f(), ☃.i());
/* 310 */     this.f.put(☃, n1);
/*     */   }
/*     */   
/*     */   private void e(l ☃) {
/* 314 */     boolean bool1 = f(☃);
/* 315 */     boolean bool2 = this.g.contains(☃);
/*     */     
/* 317 */     if (bool1 && !bool2) {
/* 318 */       this.g.add(☃);
/* 319 */       this.h.add(☃);
/* 320 */       if (this.f.containsKey(☃)) {
/* 321 */         this.i.add(☃);
/*     */       }
/* 323 */     } else if (!bool1 && bool2) {
/* 324 */       this.g.remove(☃);
/* 325 */       this.h.add(☃);
/*     */     } 
/*     */     
/* 328 */     if (bool1 != bool2 && 
/* 329 */       ☃.b() != null) {
/* 330 */       e(☃.b());
/*     */     }
/*     */     
/* 333 */     for (l l1 : ☃.e()) {
/* 334 */       e(l1);
/*     */     }
/*     */   }
/*     */   
/*     */   private boolean f(l ☃) {
/* 339 */     for (int i = 0; ☃ != null && i <= 2; i++) {
/* 340 */       if (i == 0 && 
/* 341 */         g(☃)) {
/* 342 */         return true;
/*     */       }
/*     */ 
/*     */       
/* 346 */       if (☃.c() == null) {
/* 347 */         return false;
/*     */       }
/* 349 */       n n = b(☃);
/* 350 */       if (n.a())
/* 351 */         return true; 
/* 352 */       if (☃.c().j()) {
/* 353 */         return false;
/*     */       }
/*     */ 
/*     */       
/* 357 */       ☃ = ☃.b();
/*     */     } 
/*     */     
/* 360 */     return false;
/*     */   }
/*     */   
/*     */   private boolean g(l ☃) {
/* 364 */     n n = b(☃);
/* 365 */     if (n.a()) {
/* 366 */       return true;
/*     */     }
/*     */     
/* 369 */     for (l l1 : ☃.e()) {
/* 370 */       if (g(l1)) {
/* 371 */         return true;
/*     */       }
/*     */     } 
/* 374 */     return false;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\pm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */