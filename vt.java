/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.io.Files;
/*     */ import com.google.gson.Gson;
/*     */ import com.google.gson.GsonBuilder;
/*     */ import com.google.gson.JsonDeserializationContext;
/*     */ import com.google.gson.JsonDeserializer;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonParseException;
/*     */ import com.google.gson.JsonSerializationContext;
/*     */ import com.google.gson.JsonSerializer;
/*     */ import java.io.BufferedReader;
/*     */ import java.io.BufferedWriter;
/*     */ import java.io.File;
/*     */ import java.io.FileNotFoundException;
/*     */ import java.io.IOException;
/*     */ import java.lang.reflect.ParameterizedType;
/*     */ import java.lang.reflect.Type;
/*     */ import java.nio.charset.StandardCharsets;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.commons.io.IOUtils;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class vt<K, V extends vs<K>>
/*     */ {
/*  34 */   protected static final Logger a = LogManager.getLogger();
/*     */   
/*     */   protected final Gson b;
/*     */   private final File c;
/*  38 */   private final Map<String, V> d = Maps.newHashMap();
/*     */   private boolean e = true;
/*     */   
/*     */   public vt(File ☃) {
/*  42 */     this.c = ☃;
/*  43 */     GsonBuilder gsonBuilder = (new GsonBuilder()).setPrettyPrinting();
/*  44 */     gsonBuilder.registerTypeHierarchyAdapter(vs.class, new a());
/*  45 */     this.b = gsonBuilder.create();
/*     */   }
/*     */   
/*     */   public boolean b() {
/*  49 */     return this.e;
/*     */   }
/*     */   
/*     */   public void a(boolean ☃) {
/*  53 */     this.e = ☃;
/*     */   }
/*     */   
/*     */   public File c() {
/*  57 */     return this.c;
/*     */   }
/*     */   
/*     */   public void a(V ☃) {
/*  61 */     this.d.put(a(☃.g()), ☃);
/*     */     try {
/*  63 */       f();
/*  64 */     } catch (IOException iOException) {
/*  65 */       a.warn("Could not save the list after adding a user.", iOException);
/*     */     } 
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public V b(K ☃) {
/*  71 */     h();
/*  72 */     return this.d.get(a(☃));
/*     */   }
/*     */   
/*     */   public void c(K ☃) {
/*  76 */     this.d.remove(a(☃));
/*     */     try {
/*  78 */       f();
/*  79 */     } catch (IOException iOException) {
/*  80 */       a.warn("Could not save the list after removing a user.", iOException);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void b(vs<K> ☃) {
/*  85 */     c(☃.g());
/*     */   }
/*     */   
/*     */   public String[] a() {
/*  89 */     return (String[])this.d.keySet().toArray((Object[])new String[this.d.size()]);
/*     */   }
/*     */   
/*     */   public boolean d() {
/*  93 */     return (this.d.size() < 1);
/*     */   }
/*     */   
/*     */   protected String a(K ☃) {
/*  97 */     return ☃.toString();
/*     */   }
/*     */   
/*     */   protected boolean d(K ☃) {
/* 101 */     return this.d.containsKey(a(☃));
/*     */   }
/*     */   
/*     */   private void h() {
/* 105 */     List<K> ☃ = Lists.newArrayList();
/* 106 */     for (vs<K> vs : this.d.values()) {
/* 107 */       if (vs.f()) {
/* 108 */         ☃.add(vs.g());
/*     */       }
/*     */     } 
/* 111 */     for (K k : ☃) {
/* 112 */       this.d.remove(a(k));
/*     */     }
/*     */   }
/*     */   
/*     */   protected vs<K> a(JsonObject ☃) {
/* 117 */     return new vs<>(null, ☃);
/*     */   }
/*     */   
/*     */   public Collection<V> e() {
/* 121 */     return this.d.values();
/*     */   }
/*     */   
/*     */   public void f() throws IOException {
/* 125 */     Collection<V> ☃ = this.d.values();
/* 126 */     String str = this.b.toJson(☃);
/* 127 */     BufferedWriter bufferedWriter = null;
/*     */     try {
/* 129 */       bufferedWriter = Files.newWriter(this.c, StandardCharsets.UTF_8);
/* 130 */       bufferedWriter.write(str);
/*     */     } finally {
/* 132 */       IOUtils.closeQuietly(bufferedWriter);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void g() throws FileNotFoundException {
/* 139 */     if (!this.c.exists()) {
/*     */       return;
/*     */     }
/* 142 */     BufferedReader ☃ = null;
/*     */     try {
/* 144 */       ☃ = Files.newReader(this.c, StandardCharsets.UTF_8);
/*     */       
/* 146 */       Collection<vs<K>> collection = xj.<Collection<vs<K>>>a(this.b, ☃, f);
/* 147 */       if (collection != null) {
/* 148 */         this.d.clear();
/* 149 */         for (vs<K> vs : collection) {
/* 150 */           if (vs.g() != null) {
/* 151 */             this.d.put(a(vs.g()), (V)vs);
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } finally {
/* 156 */       IOUtils.closeQuietly(☃);
/*     */     } 
/*     */   }
/*     */   
/*     */   class a
/*     */     implements JsonDeserializer<vs<K>>, JsonSerializer<vs<K>> {
/*     */     public JsonElement a(vs<K> ☃, Type type, JsonSerializationContext jsonSerializationContext) {
/* 163 */       JsonObject jsonObject = new JsonObject();
/* 164 */       ☃.a(jsonObject);
/* 165 */       return (JsonElement)jsonObject;
/*     */     }
/*     */     private a(vt this$0) {}
/*     */     
/*     */     public vs<K> a(JsonElement ☃, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
/* 170 */       if (☃.isJsonObject()) {
/* 171 */         JsonObject jsonObject = ☃.getAsJsonObject();
/* 172 */         return this.a.a(jsonObject);
/*     */       } 
/* 174 */       return null;
/*     */     }
/*     */   }
/*     */   
/* 178 */   private static final ParameterizedType f = new ParameterizedType()
/*     */     {
/*     */       public Type[] getActualTypeArguments() {
/* 181 */         return new Type[] { vs.class };
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       public Type getRawType() {
/* 188 */         return List.class;
/*     */       }
/*     */ 
/*     */       
/*     */       public Type getOwnerType() {
/* 193 */         return null;
/*     */       }
/*     */     };
/*     */ }


/* Location:              F:\dw\server.jar!\vt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */