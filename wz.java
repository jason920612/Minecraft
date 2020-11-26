/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Sets;
/*     */ import com.google.gson.JsonArray;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonParseException;
/*     */ import java.util.Collection;
/*     */ import java.util.Collections;
/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ import java.util.Set;
/*     */ import java.util.function.Function;
/*     */ import java.util.function.Predicate;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class wz<T>
/*     */ {
/*     */   private final pc a;
/*     */   private final Set<T> b;
/*     */   private final Collection<b<T>> c;
/*     */   
/*     */   public wz(pc ☃) {
/*  27 */     this.a = ☃;
/*  28 */     this.b = Collections.emptySet();
/*  29 */     this.c = Collections.emptyList();
/*     */   }
/*     */   
/*     */   public wz(pc ☃, Collection<b<T>> collection, boolean bool) {
/*  33 */     this.a = ☃;
/*  34 */     this.b = bool ? Sets.newLinkedHashSet() : Sets.newHashSet();
/*  35 */     this.c = collection;
/*     */     
/*  37 */     for (b<T> b : collection) {
/*  38 */       b.a(this.b);
/*     */     }
/*     */   }
/*     */   
/*     */   public JsonObject a(Function<T, pc> ☃) {
/*  43 */     JsonObject jsonObject = new JsonObject();
/*  44 */     JsonArray jsonArray = new JsonArray();
/*     */     
/*  46 */     for (b<T> b : this.c) {
/*  47 */       b.a(jsonArray, ☃);
/*     */     }
/*     */     
/*  50 */     jsonObject.addProperty("replace", Boolean.valueOf(false));
/*  51 */     jsonObject.add("values", (JsonElement)jsonArray);
/*     */     
/*  53 */     return jsonObject;
/*     */   }
/*     */   
/*     */   public boolean a(T ☃) {
/*  57 */     return this.b.contains(☃);
/*     */   }
/*     */   
/*     */   public Collection<T> a() {
/*  61 */     return this.b;
/*     */   }
/*     */   
/*     */   public Collection<b<T>> b() {
/*  65 */     return this.c;
/*     */   }
/*     */   
/*     */   public T a(Random ☃) {
/*  69 */     List<T> list = Lists.newArrayList(a());
/*  70 */     return list.get(☃.nextInt(list.size()));
/*     */   }
/*     */   
/*     */   public pc c() {
/*  74 */     return this.a;
/*     */   }
/*     */   
/*     */   public static class a<T> {
/*  78 */     private final Set<wz.b<T>> a = Sets.newLinkedHashSet();
/*     */     private boolean b;
/*     */     
/*     */     public static <T> a<T> a() {
/*  82 */       return new a<>();
/*     */     }
/*     */     
/*     */     public a<T> a(wz.b<T> ☃) {
/*  86 */       this.a.add(☃);
/*  87 */       return this;
/*     */     }
/*     */     
/*     */     public a<T> a(T ☃) {
/*  91 */       this.a.add(new wz.d<>(Collections.singleton(☃)));
/*  92 */       return this;
/*     */     }
/*     */     
/*     */     @SafeVarargs
/*     */     public final a<T> a(T... ☃) {
/*  97 */       this.a.add(new wz.d<>(Lists.newArrayList((Object[])☃)));
/*  98 */       return this;
/*     */     }
/*     */     
/*     */     public a<T> a(Collection<T> ☃) {
/* 102 */       this.a.add(new wz.d<>(☃));
/* 103 */       return this;
/*     */     }
/*     */     
/*     */     public a<T> a(pc ☃) {
/* 107 */       this.a.add(new wz.c<>(☃));
/* 108 */       return this;
/*     */     }
/*     */     
/*     */     public a<T> a(wz<T> ☃) {
/* 112 */       this.a.add(new wz.c<>(☃));
/* 113 */       return this;
/*     */     }
/*     */     
/*     */     public a<T> a(boolean ☃) {
/* 117 */       this.b = ☃;
/* 118 */       return this;
/*     */     }
/*     */     
/*     */     public boolean a(Function<pc, wz<T>> ☃) {
/* 122 */       for (wz.b<T> b : this.a) {
/* 123 */         if (!b.a(☃)) {
/* 124 */           return false;
/*     */         }
/*     */       } 
/* 127 */       return true;
/*     */     }
/*     */     
/*     */     public wz<T> b(pc ☃) {
/* 131 */       return new wz<>(☃, this.a, this.b);
/*     */     }
/*     */     
/*     */     public a<T> a(Predicate<pc> ☃, Function<pc, T> function, JsonObject jsonObject) {
/* 135 */       JsonArray jsonArray = xj.u(jsonObject, "values");
/*     */       
/* 137 */       if (xj.a(jsonObject, "replace", false)) {
/* 138 */         this.a.clear();
/*     */       }
/*     */       
/* 141 */       for (JsonElement jsonElement : jsonArray) {
/* 142 */         String str = xj.a(jsonElement, "value");
/* 143 */         if (str.startsWith("#")) {
/* 144 */           a(new pc(str.substring(1))); continue;
/*     */         } 
/* 146 */         pc pc = new pc(str);
/* 147 */         T t = function.apply(pc);
/* 148 */         if (t == null || !☃.test(pc)) {
/* 149 */           throw new JsonParseException("Unknown value '" + pc + "'");
/*     */         }
/* 151 */         a(t);
/*     */       } 
/*     */ 
/*     */       
/* 155 */       return this;
/*     */     }
/*     */   }
/*     */   
/*     */   public static interface b<T> {
/*     */     default boolean a(Function<pc, wz<T>> ☃) {
/* 161 */       return true;
/*     */     }
/*     */     
/*     */     void a(Collection<T> param1Collection);
/*     */     
/*     */     void a(JsonArray param1JsonArray, Function<T, pc> param1Function);
/*     */   }
/*     */   
/*     */   public static class d<T> implements b<T> {
/*     */     private final Collection<T> a;
/*     */     
/*     */     public d(Collection<T> ☃) {
/* 173 */       this.a = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(Collection<T> ☃) {
/* 178 */       ☃.addAll(this.a);
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(JsonArray ☃, Function<T, pc> function) {
/* 183 */       for (T t : this.a) {
/* 184 */         pc pc = function.apply(t);
/* 185 */         if (pc == null) {
/* 186 */           throw new IllegalStateException("Unable to serialize an anonymous value to json!");
/*     */         }
/* 188 */         ☃.add(pc.toString());
/*     */       } 
/*     */     }
/*     */     
/*     */     public Collection<T> a() {
/* 193 */       return this.a;
/*     */     }
/*     */   }
/*     */   
/*     */   public static class c<T>
/*     */     implements b<T> {
/*     */     @Nullable
/*     */     private final pc a;
/*     */     @Nullable
/*     */     private wz<T> b;
/*     */     
/*     */     public c(pc ☃) {
/* 205 */       this.a = ☃;
/*     */     }
/*     */     
/*     */     public c(wz<T> ☃) {
/* 209 */       this.a = ☃.c();
/* 210 */       this.b = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a(Function<pc, wz<T>> ☃) {
/* 215 */       if (this.b == null) {
/* 216 */         this.b = ☃.apply(this.a);
/*     */       }
/*     */       
/* 219 */       return (this.b != null);
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(Collection<T> ☃) {
/* 224 */       if (this.b == null) {
/* 225 */         throw new IllegalStateException("Cannot build unresolved tag entry");
/*     */       }
/* 227 */       ☃.addAll(this.b.a());
/*     */     }
/*     */     
/*     */     public pc a() {
/* 231 */       if (this.b != null)
/* 232 */         return this.b.c(); 
/* 233 */       if (this.a != null) {
/* 234 */         return this.a;
/*     */       }
/* 236 */       throw new IllegalStateException("Cannot serialize an anonymous tag to json!");
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public void a(JsonArray ☃, Function<T, pc> function) {
/* 242 */       ☃.add("#" + a());
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\wz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */