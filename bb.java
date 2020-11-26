/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonNull;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonSyntaxException;
/*     */ import java.util.Collections;
/*     */ import java.util.Map;
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
/*     */ public class bb
/*     */ {
/*  21 */   public static final bb a = new bb(Collections.emptyMap());
/*     */   
/*     */   private final Map<aej, a> b;
/*     */   
/*     */   public bb(Map<aej, a> ☃) {
/*  26 */     this.b = ☃;
/*     */   }
/*     */   
/*     */   public static bb a() {
/*  30 */     return new bb(Maps.newHashMap());
/*     */   }
/*     */   
/*     */   public bb a(aej ☃) {
/*  34 */     this.b.put(☃, new a());
/*  35 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(aer ☃) {
/*  44 */     if (this == a) {
/*  45 */       return true;
/*     */     }
/*  47 */     if (☃ instanceof afa) {
/*  48 */       return a(((afa)☃).co());
/*     */     }
/*  50 */     return false;
/*     */   }
/*     */   
/*     */   public boolean a(afa ☃) {
/*  54 */     if (this == a) {
/*  55 */       return true;
/*     */     }
/*  57 */     return a(☃.co());
/*     */   }
/*     */   
/*     */   public boolean a(Map<aej, aek> ☃) {
/*  61 */     if (this == a) {
/*  62 */       return true;
/*     */     }
/*     */     
/*  65 */     for (Map.Entry<aej, a> entry : this.b.entrySet()) {
/*  66 */       aek aek = ☃.get(entry.getKey());
/*  67 */       if (!((a)entry.getValue()).a(aek)) {
/*  68 */         return false;
/*     */       }
/*     */     } 
/*     */     
/*  72 */     return true;
/*     */   }
/*     */   
/*     */   public static bb a(@Nullable JsonElement ☃) {
/*  76 */     if (☃ == null || ☃.isJsonNull()) {
/*  77 */       return a;
/*     */     }
/*  79 */     JsonObject jsonObject = xj.m(☃, "effects");
/*  80 */     Map<aej, a> map = Maps.newHashMap();
/*     */     
/*  82 */     for (Map.Entry<String, JsonElement> entry : (Iterable<Map.Entry<String, JsonElement>>)jsonObject.entrySet()) {
/*  83 */       pc pc = new pc(entry.getKey());
/*  84 */       aej aej = fc.t.b(pc);
/*  85 */       if (aej == null) {
/*  86 */         throw new JsonSyntaxException("Unknown effect '" + pc + "'");
/*     */       }
/*  88 */       a a = a.a(xj.m(entry.getValue(), entry.getKey()));
/*  89 */       map.put(aej, a);
/*     */     } 
/*     */     
/*  92 */     return new bb(map);
/*     */   }
/*     */   
/*     */   public JsonElement b() {
/*  96 */     if (this == a) {
/*  97 */       return (JsonElement)JsonNull.INSTANCE;
/*     */     }
/*     */     
/* 100 */     JsonObject ☃ = new JsonObject();
/*     */     
/* 102 */     for (Map.Entry<aej, a> entry : this.b.entrySet()) {
/* 103 */       ☃.add(fc.t.b(entry.getKey()).toString(), ((a)entry.getValue()).a());
/*     */     }
/*     */     
/* 106 */     return (JsonElement)☃;
/*     */   }
/*     */   
/*     */   public static class a {
/*     */     private final ba.d a;
/*     */     private final ba.d b;
/*     */     @Nullable
/*     */     private final Boolean c;
/*     */     @Nullable
/*     */     private final Boolean d;
/*     */     
/*     */     public a(ba.d ☃, ba.d d1, @Nullable Boolean bool1, @Nullable Boolean bool2) {
/* 118 */       this.a = ☃;
/* 119 */       this.b = d1;
/* 120 */       this.c = bool1;
/* 121 */       this.d = bool2;
/*     */     }
/*     */     
/*     */     public a() {
/* 125 */       this(ba.d.e, ba.d.e, null, null);
/*     */     }
/*     */     
/*     */     public boolean a(@Nullable aek ☃) {
/* 129 */       if (☃ == null) {
/* 130 */         return false;
/*     */       }
/* 132 */       if (!this.a.d(☃.c())) {
/* 133 */         return false;
/*     */       }
/* 135 */       if (!this.b.d(☃.b())) {
/* 136 */         return false;
/*     */       }
/* 138 */       if (this.c != null && this.c.booleanValue() != ☃.d()) {
/* 139 */         return false;
/*     */       }
/* 141 */       if (this.d != null && this.d.booleanValue() != ☃.e()) {
/* 142 */         return false;
/*     */       }
/* 144 */       return true;
/*     */     }
/*     */     
/*     */     public JsonElement a() {
/* 148 */       JsonObject ☃ = new JsonObject();
/*     */       
/* 150 */       ☃.add("amplifier", this.a.d());
/* 151 */       ☃.add("duration", this.b.d());
/* 152 */       ☃.addProperty("ambient", this.c);
/* 153 */       ☃.addProperty("visible", this.d);
/*     */       
/* 155 */       return (JsonElement)☃;
/*     */     }
/*     */     
/*     */     public static a a(JsonObject ☃) {
/* 159 */       ba.d d1 = ba.d.a(☃.get("amplifier"));
/* 160 */       ba.d d2 = ba.d.a(☃.get("duration"));
/* 161 */       Boolean bool1 = ☃.has("ambient") ? Boolean.valueOf(xj.j(☃, "ambient")) : null;
/* 162 */       Boolean bool2 = ☃.has("visible") ? Boolean.valueOf(xj.j(☃, "visible")) : null;
/* 163 */       return new a(d1, d2, bool1, bool2);
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */