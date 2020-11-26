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
/*     */ 
/*     */ public class bg
/*     */   implements s<bg.b>
/*     */ {
/*  21 */   private static final pc a = new pc("recipe_unlocked");
/*     */   
/*  23 */   private final Map<pm, a> b = Maps.newHashMap();
/*     */ 
/*     */   
/*     */   public pc a() {
/*  27 */     return a;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(pm ☃, s.a<b> a1) {
/*  32 */     a a2 = this.b.get(☃);
/*  33 */     if (a2 == null) {
/*  34 */       a2 = new a(☃);
/*  35 */       this.b.put(☃, a2);
/*     */     } 
/*  37 */     a2.a(a1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(pm ☃, s.a<b> a1) {
/*  42 */     a a2 = this.b.get(☃);
/*  43 */     if (a2 != null) {
/*  44 */       a2.b(a1);
/*  45 */       if (a2.a()) {
/*  46 */         this.b.remove(☃);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(pm ☃) {
/*  53 */     this.b.remove(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public b b(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext) {
/*  58 */     pc pc1 = new pc(xj.h(☃, "recipe"));
/*  59 */     return new b(pc1);
/*     */   }
/*     */   
/*     */   public void a(tf ☃, avk avk1) {
/*  63 */     a a = this.b.get(☃.L());
/*  64 */     if (a != null)
/*  65 */       a.a(avk1); 
/*     */   }
/*     */   
/*     */   public static class b
/*     */     extends y {
/*     */     private final pc a;
/*     */     
/*     */     public b(pc ☃) {
/*  73 */       super(bg.b());
/*  74 */       this.a = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public JsonElement b() {
/*  79 */       JsonObject ☃ = new JsonObject();
/*  80 */       ☃.addProperty("recipe", this.a.toString());
/*  81 */       return (JsonElement)☃;
/*     */     }
/*     */     
/*     */     public boolean a(avk ☃) {
/*  85 */       return this.a.equals(☃.b());
/*     */     }
/*     */   }
/*     */   
/*     */   static class a {
/*     */     private final pm a;
/*  91 */     private final Set<s.a<bg.b>> b = Sets.newHashSet();
/*     */     
/*     */     public a(pm ☃) {
/*  94 */       this.a = ☃;
/*     */     }
/*     */     
/*     */     public boolean a() {
/*  98 */       return this.b.isEmpty();
/*     */     }
/*     */     
/*     */     public void a(s.a<bg.b> ☃) {
/* 102 */       this.b.add(☃);
/*     */     }
/*     */     
/*     */     public void b(s.a<bg.b> ☃) {
/* 106 */       this.b.remove(☃);
/*     */     }
/*     */     
/*     */     public void a(avk ☃) {
/* 110 */       List<s.a<bg.b>> list = null;
/* 111 */       for (s.a<bg.b> a1 : this.b) {
/* 112 */         if (((bg.b)a1.a()).a(☃)) {
/* 113 */           if (list == null) {
/* 114 */             list = Lists.newArrayList();
/*     */           }
/* 116 */           list.add(a1);
/*     */         } 
/*     */       } 
/* 119 */       if (list != null)
/* 120 */         for (s.a<bg.b> a1 : list)
/* 121 */           a1.a(this.a);  
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */