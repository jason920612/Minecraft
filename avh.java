/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.gson.JsonArray;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonParseException;
/*     */ import com.google.gson.JsonSyntaxException;
/*     */ import it.unimi.dsi.fastutil.ints.IntArrayList;
/*     */ import it.unimi.dsi.fastutil.ints.IntComparators;
/*     */ import it.unimi.dsi.fastutil.ints.IntList;
/*     */ import java.util.Arrays;
/*     */ import java.util.Collection;
/*     */ import java.util.Collections;
/*     */ import java.util.Comparator;
/*     */ import java.util.List;
/*     */ import java.util.function.Predicate;
/*     */ import java.util.stream.Stream;
/*     */ import java.util.stream.StreamSupport;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class avh
/*     */   implements Predicate<ate>
/*     */ {
/*     */   private static final Predicate<? super c> b;
/*     */   
/*     */   static {
/*  33 */     b = (☃ -> !☃.a().stream().allMatch(ate::a));
/*     */   }
/*  35 */   public static final avh a = new avh(Stream.empty());
/*     */   
/*     */   private final c[] c;
/*     */   private ate[] d;
/*     */   private IntList e;
/*     */   
/*     */   private avh(Stream<? extends c> ☃) {
/*  42 */     this.c = (c[])☃.filter(b).toArray(☃ -> new c[☃]);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void f() {
/*  51 */     if (this.d == null) {
/*  52 */       this.d = (ate[])Arrays.<c>stream(this.c).flatMap(☃ -> ☃.a().stream()).distinct().toArray(☃ -> new ate[☃]);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(@Nullable ate ☃) {
/*  58 */     if (☃ == null) {
/*  59 */       return false;
/*     */     }
/*     */     
/*  62 */     if (this.c.length == 0) {
/*  63 */       return ☃.a();
/*     */     }
/*     */     
/*  66 */     f();
/*  67 */     for (ate ate1 : this.d) {
/*  68 */       if (ate1.b() == ☃.b()) {
/*  69 */         return true;
/*     */       }
/*     */     } 
/*  72 */     return false;
/*     */   }
/*     */   
/*     */   public IntList b() {
/*  76 */     if (this.e == null) {
/*  77 */       f();
/*  78 */       this.e = (IntList)new IntArrayList(this.d.length);
/*  79 */       for (ate ☃ : this.d) {
/*  80 */         this.e.add(aoi.c(☃));
/*     */       }
/*  82 */       this.e.sort((Comparator)IntComparators.NATURAL_COMPARATOR);
/*     */     } 
/*     */     
/*  85 */     return this.e;
/*     */   }
/*     */   
/*     */   public void a(hy ☃) {
/*  89 */     f();
/*  90 */     ☃.d(this.d.length);
/*  91 */     for (int i = 0; i < this.d.length; i++) {
/*  92 */       ☃.a(this.d[i]);
/*     */     }
/*     */   }
/*     */   
/*     */   public JsonElement c() {
/*  97 */     if (this.c.length == 1) {
/*  98 */       return (JsonElement)this.c[0].b();
/*     */     }
/* 100 */     JsonArray ☃ = new JsonArray();
/* 101 */     for (c c1 : this.c) {
/* 102 */       ☃.add((JsonElement)c1.b());
/*     */     }
/* 104 */     return (JsonElement)☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean d() {
/* 109 */     return (this.c.length == 0 && (this.d == null || this.d.length == 0) && (this.e == null || this.e.isEmpty()));
/*     */   }
/*     */   
/*     */   private static avh a(Stream<? extends c> ☃) {
/* 113 */     avh avh1 = new avh(☃);
/*     */     
/* 115 */     return (avh1.c.length == 0) ? a : avh1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static avh a(axx... ☃) {
/* 123 */     return a(Arrays.<axx>stream(☃).map(☃ -> new a(new ate(☃))));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static avh a(wz<ata> ☃) {
/* 131 */     return a(Stream.of(new b(☃)));
/*     */   }
/*     */   
/*     */   public static avh b(hy ☃) {
/* 135 */     int i = ☃.g();
/* 136 */     return a(Stream.<c>generate(() -> new a(☃.k())).limit(i));
/*     */   }
/*     */   
/*     */   public static avh a(@Nullable JsonElement ☃) {
/* 140 */     if (☃ == null || ☃.isJsonNull()) {
/* 141 */       throw new JsonSyntaxException("Item cannot be null");
/*     */     }
/* 143 */     if (☃.isJsonObject())
/* 144 */       return a(Stream.of(a(☃.getAsJsonObject()))); 
/* 145 */     if (☃.isJsonArray()) {
/* 146 */       JsonArray jsonArray = ☃.getAsJsonArray();
/* 147 */       if (jsonArray.size() == 0) {
/* 148 */         throw new JsonSyntaxException("Item array cannot be empty, at least one item must be defined");
/*     */       }
/* 150 */       return a(StreamSupport.stream(jsonArray.spliterator(), false).map(☃ -> a(xj.m(☃, "item"))));
/*     */     } 
/* 152 */     throw new JsonSyntaxException("Expected item to be object or array of objects");
/*     */   }
/*     */ 
/*     */   
/*     */   public static c a(JsonObject ☃) {
/* 157 */     if (☃.has("item") && ☃.has("tag")) {
/* 158 */       throw new JsonParseException("An ingredient entry is either a tag or an item, not both");
/*     */     }
/* 160 */     if (☃.has("item")) {
/* 161 */       pc pc = new pc(xj.h(☃, "item"));
/* 162 */       ata ata = fc.s.b(pc);
/* 163 */       if (ata == null) {
/* 164 */         throw new JsonSyntaxException("Unknown item '" + pc + "'");
/*     */       }
/* 166 */       return new a(new ate(ata));
/* 167 */     }  if (☃.has("tag")) {
/* 168 */       pc pc = new pc(xj.h(☃, "tag"));
/* 169 */       wz<ata> wz = wx.a().a(pc);
/* 170 */       if (wz == null) {
/* 171 */         throw new JsonSyntaxException("Unknown item tag '" + pc + "'");
/*     */       }
/* 173 */       return new b(wz);
/*     */     } 
/* 175 */     throw new JsonParseException("An ingredient entry needs either a tag or an item");
/*     */   }
/*     */   
/*     */   static interface c {
/*     */     Collection<ate> a();
/*     */     
/*     */     JsonObject b();
/*     */   }
/*     */   
/*     */   static class a
/*     */     implements c {
/*     */     private final ate a;
/*     */     
/*     */     private a(ate ☃) {
/* 189 */       this.a = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public Collection<ate> a() {
/* 194 */       return Collections.singleton(this.a);
/*     */     }
/*     */ 
/*     */     
/*     */     public JsonObject b() {
/* 199 */       JsonObject ☃ = new JsonObject();
/* 200 */       ☃.addProperty("item", fc.s.b(this.a.b()).toString());
/* 201 */       return ☃;
/*     */     }
/*     */   }
/*     */   
/*     */   static class b implements c {
/*     */     private final wz<ata> a;
/*     */     
/*     */     private b(wz<ata> ☃) {
/* 209 */       this.a = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public Collection<ate> a() {
/* 214 */       List<ate> ☃ = Lists.newArrayList();
/* 215 */       for (ata ata : this.a.a()) {
/* 216 */         ☃.add(new ate(ata));
/*     */       }
/* 218 */       return ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public JsonObject b() {
/* 223 */       JsonObject ☃ = new JsonObject();
/* 224 */       ☃.addProperty("tag", this.a.c().toString());
/* 225 */       return ☃;
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\avh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */