/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.gson.Gson;
/*     */ import com.google.gson.GsonBuilder;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonParseException;
/*     */ import java.io.IOException;
/*     */ import java.nio.charset.StandardCharsets;
/*     */ import java.util.Collection;
/*     */ import java.util.Map;
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
/*     */ 
/*     */ 
/*     */ public class avl
/*     */   implements vg
/*     */ {
/*  28 */   private static final Logger c = LogManager.getLogger();
/*  29 */   public static final int a = "recipes/".length();
/*     */   
/*  31 */   public static final int b = ".json".length();
/*     */   
/*  33 */   private final Map<pc, avk> d = Maps.newHashMap();
/*     */   
/*     */   private boolean e;
/*     */   
/*     */   public void a(vf ☃) {
/*  38 */     Gson gson = (new GsonBuilder()).setPrettyPrinting().disableHtmlEscaping().create();
/*     */     
/*  40 */     this.e = false;
/*  41 */     this.d.clear();
/*     */     
/*  43 */     for (pc pc1 : ☃.a("recipes", ☃ -> ☃.endsWith(".json"))) {
/*  44 */       String str = pc1.a();
/*  45 */       pc pc2 = new pc(pc1.b(), str.substring(a, str.length() - b));
/*     */       
/*  47 */       try (ve ☃ = ☃.a(pc1)) {
/*  48 */         JsonObject jsonObject = xj.<JsonObject>a(gson, IOUtils.toString(ve.b(), StandardCharsets.UTF_8), JsonObject.class);
/*  49 */         if (jsonObject == null) {
/*  50 */           c.error("Couldn't load recipe {} as it's null or empty", pc2);
/*     */         } else {
/*  52 */           a(avn.a(pc2, jsonObject));
/*     */         } 
/*  54 */       } catch (JsonParseException|IllegalArgumentException runtimeException) {
/*  55 */         c.error("Parsing error loading recipe {}", pc2, runtimeException);
/*  56 */         this.e = true;
/*  57 */       } catch (IOException iOException) {
/*  58 */         c.error("Couldn't read custom advancement {} from {}", pc2, pc1, iOException);
/*  59 */         this.e = true;
/*     */       } 
/*     */     } 
/*     */     
/*  63 */     c.info("Loaded {} recipes", Integer.valueOf(this.d.size()));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(avk ☃) {
/*  71 */     if (this.d.containsKey(☃.b())) {
/*  72 */       throw new IllegalStateException("Duplicate recipe ignored with ID " + ☃.b());
/*     */     }
/*     */     
/*  75 */     this.d.put(☃.b(), ☃);
/*     */   }
/*     */   
/*     */   public ate a(ade ☃, axy axy1) {
/*  79 */     for (avk avk : this.d.values()) {
/*  80 */       if (avk.a(☃, axy1)) {
/*  81 */         return avk.a(☃);
/*     */       }
/*     */     } 
/*     */     
/*  85 */     return ate.a;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public avk b(ade ☃, axy axy1) {
/*  90 */     for (avk avk : this.d.values()) {
/*  91 */       if (avk.a(☃, axy1)) {
/*  92 */         return avk;
/*     */       }
/*     */     } 
/*     */     
/*  96 */     return null;
/*     */   }
/*     */   
/*     */   public ez<ate> c(ade ☃, axy axy1) {
/* 100 */     for (avk avk : this.d.values()) {
/* 101 */       if (avk.a(☃, axy1)) {
/* 102 */         return avk.b(☃);
/*     */       }
/*     */     } 
/*     */     
/* 106 */     ez<ate> ez = ez.a(☃.T_(), ate.a);
/* 107 */     for (int i = 0; i < ez.size(); i++) {
/* 108 */       ez.set(i, ☃.a(i));
/*     */     }
/* 110 */     return ez;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public avk a(pc ☃) {
/* 115 */     return this.d.get(☃);
/*     */   }
/*     */   
/*     */   public Collection<avk> b() {
/* 119 */     return this.d.values();
/*     */   }
/*     */   
/*     */   public Collection<pc> c() {
/* 123 */     return this.d.keySet();
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\avl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */