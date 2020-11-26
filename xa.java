/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.gson.Gson;
/*     */ import com.google.gson.JsonObject;
/*     */ import java.io.IOException;
/*     */ import java.nio.charset.StandardCharsets;
/*     */ import java.util.Collection;
/*     */ import java.util.Iterator;
/*     */ import java.util.Map;
/*     */ import java.util.function.Function;
/*     */ import java.util.function.Predicate;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.commons.io.IOUtils;
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
/*     */ public class xa<T>
/*     */ {
/*  26 */   private static final Logger a = LogManager.getLogger();
/*  27 */   private static final Gson b = new Gson();
/*     */   
/*  29 */   private static final int c = ".json".length();
/*     */   
/*  31 */   private final Map<pc, wz<T>> d = Maps.newHashMap();
/*     */   private final Function<pc, T> e;
/*     */   private final Predicate<pc> f;
/*     */   private final String g;
/*     */   private final boolean h;
/*     */   private final String i;
/*     */   
/*     */   public xa(Predicate<pc> ☃, Function<pc, T> function, String str1, boolean bool, String str2) {
/*  39 */     this.f = ☃;
/*  40 */     this.e = function;
/*  41 */     this.g = str1;
/*  42 */     this.h = bool;
/*  43 */     this.i = str2;
/*     */   }
/*     */   
/*     */   public void a(wz<T> ☃) {
/*  47 */     if (this.d.containsKey(☃.c())) {
/*  48 */       throw new IllegalArgumentException("Duplicate " + this.i + " tag '" + ☃.c() + "'");
/*     */     }
/*  50 */     this.d.put(☃.c(), ☃);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public wz<T> a(pc ☃) {
/*  55 */     return this.d.get(☃);
/*     */   }
/*     */   
/*     */   public wz<T> b(pc ☃) {
/*  59 */     wz<T> wz = this.d.get(☃);
/*  60 */     if (wz == null) {
/*  61 */       return new wz<>(☃);
/*     */     }
/*  63 */     return wz;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Collection<pc> a() {
/*  71 */     return this.d.keySet();
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
/*     */   public void b() {
/*  85 */     this.d.clear();
/*     */   }
/*     */   
/*     */   public void a(vf ☃) {
/*  89 */     Map<pc, wz.a<T>> map = Maps.newHashMap();
/*     */     
/*  91 */     for (pc pc1 : ☃.a(this.g, ☃ -> ☃.endsWith(".json"))) {
/*  92 */       String str = pc1.a();
/*  93 */       pc pc2 = new pc(pc1.b(), str.substring(this.g.length() + 1, str.length() - c));
/*     */       try {
/*  95 */         for (ve ve : ☃.b(pc1)) {
/*     */           try {
/*  97 */             JsonObject jsonObject = xj.<JsonObject>a(b, IOUtils.toString(ve.b(), StandardCharsets.UTF_8), JsonObject.class);
/*  98 */             if (jsonObject == null) {
/*  99 */               a.error("Couldn't load {} tag list {} from {} in data pack {} as it's empty or null", this.i, pc2, pc1, ve.d());
/*     */             } else {
/* 101 */               wz.a<T> a = map.getOrDefault(pc2, wz.a.a());
/* 102 */               a.a(this.f, this.e, jsonObject);
/* 103 */               map.put(pc2, a);
/*     */             } 
/* 105 */           } catch (IOException|RuntimeException exception) {
/* 106 */             a.error("Couldn't read {} tag list {} from {} in data pack {}", this.i, pc2, pc1, ve.d(), exception);
/*     */           } finally {
/* 108 */             IOUtils.closeQuietly(ve);
/*     */           } 
/*     */         } 
/* 111 */       } catch (IOException iOException) {
/* 112 */         a.error("Couldn't read {} tag list {} from {}", this.i, pc2, pc1, iOException);
/*     */       } 
/*     */     } 
/*     */     
/* 116 */     while (!map.isEmpty()) {
/* 117 */       boolean bool = false; Iterator<Map.Entry<pc, wz.a<T>>> iterator;
/* 118 */       for (iterator = map.entrySet().iterator(); iterator.hasNext(); ) {
/* 119 */         Map.Entry<pc, wz.a<T>> entry = iterator.next();
/* 120 */         if (((wz.a)entry.getValue()).a(this::a)) {
/* 121 */           bool = true;
/* 122 */           a(((wz.a<T>)entry.getValue()).b(entry.getKey()));
/* 123 */           iterator.remove();
/*     */         } 
/*     */       } 
/*     */       
/* 127 */       if (!bool) {
/* 128 */         for (iterator = map.entrySet().iterator(); iterator.hasNext(); ) { Map.Entry<pc, wz.a<T>> entry = iterator.next();
/* 129 */           a.error("Couldn't load {} tag {} as it either references another tag that doesn't exist, or ultimately references itself", this.i, entry.getKey()); }
/*     */         
/*     */         break;
/*     */       } 
/*     */     } 
/* 134 */     for (Map.Entry<pc, wz.a<T>> entry : map.entrySet()) {
/* 135 */       a(((wz.a<T>)entry.getValue()).a(this.h).b(entry.getKey()));
/*     */     }
/*     */   }
/*     */   
/*     */   public Map<pc, wz<T>> c() {
/* 140 */     return this.d;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\xa.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */