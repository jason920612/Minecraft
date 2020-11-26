/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Sets;
/*     */ import com.google.gson.JsonArray;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonParseException;
/*     */ import java.util.Collection;
/*     */ import java.util.Collections;
/*     */ import java.util.Set;
/*     */ import java.util.function.Function;
/*     */ import java.util.function.Predicate;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class a<T>
/*     */ {
/*  78 */   private final Set<wz.b<T>> a = Sets.newLinkedHashSet();
/*     */   private boolean b;
/*     */   
/*     */   public static <T> a<T> a() {
/*  82 */     return new a<>();
/*     */   }
/*     */   
/*     */   public a<T> a(wz.b<T> ☃) {
/*  86 */     this.a.add(☃);
/*  87 */     return this;
/*     */   }
/*     */   
/*     */   public a<T> a(T ☃) {
/*  91 */     this.a.add(new wz.d<>(Collections.singleton(☃)));
/*  92 */     return this;
/*     */   }
/*     */   
/*     */   @SafeVarargs
/*     */   public final a<T> a(T... ☃) {
/*  97 */     this.a.add(new wz.d<>(Lists.newArrayList((Object[])☃)));
/*  98 */     return this;
/*     */   }
/*     */   
/*     */   public a<T> a(Collection<T> ☃) {
/* 102 */     this.a.add(new wz.d<>(☃));
/* 103 */     return this;
/*     */   }
/*     */   
/*     */   public a<T> a(pc ☃) {
/* 107 */     this.a.add(new wz.c<>(☃));
/* 108 */     return this;
/*     */   }
/*     */   
/*     */   public a<T> a(wz<T> ☃) {
/* 112 */     this.a.add(new wz.c<>(☃));
/* 113 */     return this;
/*     */   }
/*     */   
/*     */   public a<T> a(boolean ☃) {
/* 117 */     this.b = ☃;
/* 118 */     return this;
/*     */   }
/*     */   
/*     */   public boolean a(Function<pc, wz<T>> ☃) {
/* 122 */     for (wz.b<T> b : this.a) {
/* 123 */       if (!b.a(☃)) {
/* 124 */         return false;
/*     */       }
/*     */     } 
/* 127 */     return true;
/*     */   }
/*     */   
/*     */   public wz<T> b(pc ☃) {
/* 131 */     return new wz<>(☃, this.a, this.b);
/*     */   }
/*     */   
/*     */   public a<T> a(Predicate<pc> ☃, Function<pc, T> function, JsonObject jsonObject) {
/* 135 */     JsonArray jsonArray = xj.u(jsonObject, "values");
/*     */     
/* 137 */     if (xj.a(jsonObject, "replace", false)) {
/* 138 */       this.a.clear();
/*     */     }
/*     */     
/* 141 */     for (JsonElement jsonElement : jsonArray) {
/* 142 */       String str = xj.a(jsonElement, "value");
/* 143 */       if (str.startsWith("#")) {
/* 144 */         a(new pc(str.substring(1))); continue;
/*     */       } 
/* 146 */       pc pc = new pc(str);
/* 147 */       T t = function.apply(pc);
/* 148 */       if (t == null || !☃.test(pc)) {
/* 149 */         throw new JsonParseException("Unknown value '" + pc + "'");
/*     */       }
/* 151 */       a(t);
/*     */     } 
/*     */ 
/*     */     
/* 155 */     return this;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\wz$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */