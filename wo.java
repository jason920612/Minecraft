/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.collect.Sets;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonParseException;
/*     */ import com.google.gson.JsonPrimitive;
/*     */ import com.google.gson.internal.Streams;
/*     */ import com.google.gson.stream.JsonReader;
/*     */ import com.mojang.datafixers.DSL;
/*     */ import com.mojang.datafixers.DataFixTypes;
/*     */ import com.mojang.datafixers.DataFixer;
/*     */ import it.unimi.dsi.fastutil.objects.Object2IntMap;
/*     */ import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
/*     */ import it.unimi.dsi.fastutil.objects.ObjectIterator;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.io.StringReader;
/*     */ import java.util.Collection;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import javax.annotation.Nullable;
/*     */ import net.minecraft.server.MinecraftServer;
/*     */ import org.apache.commons.io.FileUtils;
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
/*     */ public class wo
/*     */   extends wt
/*     */ {
/*  37 */   private static final Logger b = LogManager.getLogger();
/*     */   
/*     */   private final MinecraftServer c;
/*     */   
/*     */   private final File d;
/*  42 */   private final Set<wp<?>> e = Sets.newHashSet();
/*  43 */   private int f = -300;
/*     */   
/*     */   public wo(MinecraftServer ☃, File file) {
/*  46 */     this.c = ☃;
/*  47 */     this.d = file;
/*  48 */     if (file.isFile()) {
/*     */       try {
/*  50 */         a(☃.az(), FileUtils.readFileToString(file));
/*  51 */       } catch (IOException iOException) {
/*  52 */         b.error("Couldn't read statistics file {}", file, iOException);
/*  53 */       } catch (JsonParseException jsonParseException) {
/*  54 */         b.error("Couldn't parse statistics file {}", file, jsonParseException);
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   public void a() {
/*     */     try {
/*  61 */       FileUtils.writeStringToFile(this.d, b());
/*  62 */     } catch (IOException ☃) {
/*  63 */       b.error("Couldn't save stats", ☃);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(aog ☃, wp<?> wp1, int i) {
/*  69 */     super.a(☃, wp1, i);
/*  70 */     this.e.add(wp1);
/*     */   }
/*     */   
/*     */   private Set<wp<?>> d() {
/*  74 */     Set<wp<?>> ☃ = Sets.newHashSet(this.e);
/*  75 */     this.e.clear();
/*  76 */     return ☃;
/*     */   }
/*     */   
/*     */   public void a(DataFixer ☃, String str) {
/*  80 */     try (JsonReader ☃ = new JsonReader(new StringReader(str))) {
/*  81 */       jsonReader.setLenient(false);
/*  82 */       JsonElement jsonElement = Streams.parse(jsonReader);
/*     */       
/*  84 */       if (!jsonElement.isJsonNull()) {
/*  85 */         gy gy = a(jsonElement.getAsJsonObject());
/*     */         
/*  87 */         if (!gy.c("DataVersion", 99)) {
/*  88 */           gy.b("DataVersion", 1343);
/*     */         }
/*  90 */         gy = hk.a(☃, (DSL.TypeReference)DataFixTypes.STATS, gy, gy.h("DataVersion"));
/*     */         
/*  92 */         if (gy.c("stats", 10)) {
/*  93 */           gy gy1 = gy.p("stats");
/*  94 */           for (String str1 : gy1.c()) {
/*  95 */             if (gy1.c(str1, 10)) {
/*  96 */               wr<?> wr = fc.w.b(new pc(str1));
/*  97 */               if (wr == null) {
/*  98 */                 b.warn("Invalid statistic type in {}: Don't know what {} is", this.d, str1); continue;
/*     */               } 
/* 100 */               gy gy2 = gy1.p(str1);
/* 101 */               for (String str2 : gy2.c()) {
/* 102 */                 if (gy2.c(str2, 99)) {
/* 103 */                   wp<?> wp = a(wr, str2);
/* 104 */                   if (wp == null) {
/* 105 */                     b.warn("Invalid statistic in {}: Don't know what {} is", this.d, str2); continue;
/*     */                   } 
/* 107 */                   this.a.put(wp, gy2.h(str2));
/*     */                   continue;
/*     */                 } 
/* 110 */                 b.warn("Invalid statistic value in {}: Don't know what {} is for key {}", this.d, gy2.c(str2), str2);
/*     */               }
/*     */             
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } else {
/*     */         
/* 118 */         b.error("Unable to parse Stat data from {}", this.d);
/*     */       } 
/* 120 */     } catch (JsonParseException|IOException exception) {
/* 121 */       b.error("Unable to parse Stat data from {}", this.d, exception);
/*     */     } 
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private <T> wp<T> a(wr<T> ☃, String str) {
/* 127 */     pc pc = pc.a(str);
/* 128 */     if (pc == null) {
/* 129 */       return null;
/*     */     }
/* 131 */     T t = ☃.a().b(pc);
/* 132 */     return (t == null) ? null : ☃.b(t);
/*     */   }
/*     */   
/*     */   private static gy a(JsonObject ☃) {
/* 136 */     gy gy = new gy();
/* 137 */     for (Map.Entry<String, JsonElement> entry : (Iterable<Map.Entry<String, JsonElement>>)☃.entrySet()) {
/* 138 */       JsonElement jsonElement = entry.getValue();
/* 139 */       if (jsonElement.isJsonObject()) {
/* 140 */         gy.a(entry.getKey(), a(jsonElement.getAsJsonObject())); continue;
/* 141 */       }  if (jsonElement.isJsonPrimitive()) {
/* 142 */         JsonPrimitive jsonPrimitive = jsonElement.getAsJsonPrimitive();
/* 143 */         if (jsonPrimitive.isNumber()) {
/* 144 */           gy.b(entry.getKey(), jsonPrimitive.getAsInt());
/*     */         }
/*     */       } 
/*     */     } 
/* 148 */     return gy;
/*     */   }
/*     */   
/*     */   protected String b() {
/* 152 */     Map<wr<?>, JsonObject> ☃ = Maps.newHashMap();
/* 153 */     for (ObjectIterator<Object2IntMap.Entry<wp<?>>> objectIterator = this.a.object2IntEntrySet().iterator(); objectIterator.hasNext(); ) { Object2IntMap.Entry<wp<?>> entry = objectIterator.next();
/* 154 */       wp<?> wp = (wp)entry.getKey();
/* 155 */       ((JsonObject)☃.computeIfAbsent(wp.a(), ☃ -> new JsonObject())).addProperty(b(wp).toString(), Integer.valueOf(entry.getIntValue())); }
/*     */ 
/*     */     
/* 158 */     JsonObject jsonObject1 = new JsonObject();
/* 159 */     for (Map.Entry<wr<?>, JsonObject> entry : ☃.entrySet()) {
/* 160 */       jsonObject1.add(fc.w.b(entry.getKey()).toString(), (JsonElement)entry.getValue());
/*     */     }
/*     */     
/* 163 */     JsonObject jsonObject2 = new JsonObject();
/* 164 */     jsonObject2.add("stats", (JsonElement)jsonObject1);
/* 165 */     jsonObject2.addProperty("DataVersion", Integer.valueOf(1631));
/*     */     
/* 167 */     return jsonObject2.toString();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private static <T> pc b(wp<T> ☃) {
/* 173 */     return ☃.a().a().b(☃.b());
/*     */   }
/*     */   
/*     */   public void c() {
/* 177 */     this.e.addAll((Collection<? extends wp<?>>)this.a.keySet());
/*     */   }
/*     */   
/*     */   public void a(tf ☃) {
/* 181 */     int i = this.c.ah();
/* 182 */     Object2IntOpenHashMap object2IntOpenHashMap = new Object2IntOpenHashMap();
/*     */     
/* 184 */     if (i - this.f > 300) {
/* 185 */       this.f = i;
/*     */       
/* 187 */       for (wp<?> wp : d()) {
/* 188 */         object2IntOpenHashMap.put(wp, a(wp));
/*     */       }
/*     */     } 
/*     */     
/* 192 */     ☃.a.a(new jg((Object2IntMap<wp<?>>)object2IntOpenHashMap));
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\wo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */