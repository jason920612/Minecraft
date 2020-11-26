/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.collect.Sets;
/*     */ import com.google.gson.JsonDeserializationContext;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ax
/*     */   implements s<ax.b>
/*     */ {
/*  20 */   private static final pc a = new pc("levitation");
/*     */   
/*  22 */   private final Map<pm, a> b = Maps.newHashMap();
/*     */ 
/*     */   
/*     */   public pc a() {
/*  26 */     return a;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(pm ☃, s.a<b> a1) {
/*  31 */     a a2 = this.b.get(☃);
/*  32 */     if (a2 == null) {
/*  33 */       a2 = new a(☃);
/*  34 */       this.b.put(☃, a2);
/*     */     } 
/*  36 */     a2.a(a1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(pm ☃, s.a<b> a1) {
/*  41 */     a a2 = this.b.get(☃);
/*  42 */     if (a2 != null) {
/*  43 */       a2.b(a1);
/*  44 */       if (a2.a()) {
/*  45 */         this.b.remove(☃);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(pm ☃) {
/*  52 */     this.b.remove(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public b b(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext) {
/*  57 */     ai ai = ai.a(☃.get("distance"));
/*  58 */     ba.d d = ba.d.a(☃.get("duration"));
/*  59 */     return new b(ai, d);
/*     */   }
/*     */   
/*     */   public void a(tf ☃, cee cee1, int i) {
/*  63 */     a a = this.b.get(☃.L());
/*  64 */     if (a != null)
/*  65 */       a.a(☃, cee1, i); 
/*     */   }
/*     */   
/*     */   public static class b
/*     */     extends y {
/*     */     private final ai a;
/*     */     private final ba.d b;
/*     */     
/*     */     public b(ai ☃, ba.d d1) {
/*  74 */       super(ax.b());
/*  75 */       this.a = ☃;
/*  76 */       this.b = d1;
/*     */     }
/*     */     
/*     */     public static b a(ai ☃) {
/*  80 */       return new b(☃, ba.d.e);
/*     */     }
/*     */     
/*     */     public boolean a(tf ☃, cee cee1, int i) {
/*  84 */       if (!this.a.a(cee1.b, cee1.c, cee1.d, ☃.q, ☃.r, ☃.s)) {
/*  85 */         return false;
/*     */       }
/*  87 */       if (!this.b.d(i)) {
/*  88 */         return false;
/*     */       }
/*  90 */       return true;
/*     */     }
/*     */ 
/*     */     
/*     */     public JsonElement b() {
/*  95 */       JsonObject ☃ = new JsonObject();
/*     */       
/*  97 */       ☃.add("distance", this.a.a());
/*  98 */       ☃.add("duration", this.b.d());
/*     */       
/* 100 */       return (JsonElement)☃;
/*     */     }
/*     */   }
/*     */   
/*     */   static class a {
/*     */     private final pm a;
/* 106 */     private final Set<s.a<ax.b>> b = Sets.newHashSet();
/*     */     
/*     */     public a(pm ☃) {
/* 109 */       this.a = ☃;
/*     */     }
/*     */     
/*     */     public boolean a() {
/* 113 */       return this.b.isEmpty();
/*     */     }
/*     */     
/*     */     public void a(s.a<ax.b> ☃) {
/* 117 */       this.b.add(☃);
/*     */     }
/*     */     
/*     */     public void b(s.a<ax.b> ☃) {
/* 121 */       this.b.remove(☃);
/*     */     }
/*     */     
/*     */     public void a(tf ☃, cee cee1, int i) {
/* 125 */       List<s.a<ax.b>> list = null;
/* 126 */       for (s.a<ax.b> a1 : this.b) {
/* 127 */         if (((ax.b)a1.a()).a(☃, cee1, i)) {
/* 128 */           if (list == null) {
/* 129 */             list = Lists.newArrayList();
/*     */           }
/* 131 */           list.add(a1);
/*     */         } 
/*     */       } 
/* 134 */       if (list != null)
/* 135 */         for (s.a<ax.b> a1 : list)
/* 136 */           a1.a(this.a);  
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\ax.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */