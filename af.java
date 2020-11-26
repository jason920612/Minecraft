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
/*     */ public class af
/*     */   implements s<af.b>
/*     */ {
/*  21 */   private static final pc a = new pc("cured_zombie_villager");
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
/*  58 */     ao ao1 = ao.a(☃.get("zombie"));
/*  59 */     ao ao2 = ao.a(☃.get("villager"));
/*  60 */     return new b(ao1, ao2);
/*     */   }
/*     */   
/*     */   public void a(tf ☃, anw anw1, aob aob1) {
/*  64 */     a a = this.b.get(☃.L());
/*  65 */     if (a != null)
/*  66 */       a.a(☃, anw1, aob1); 
/*     */   }
/*     */   
/*     */   public static class b
/*     */     extends y {
/*     */     private final ao a;
/*     */     private final ao b;
/*     */     
/*     */     public b(ao ☃, ao ao1) {
/*  75 */       super(af.b());
/*  76 */       this.a = ☃;
/*  77 */       this.b = ao1;
/*     */     }
/*     */     
/*     */     public static b c() {
/*  81 */       return new b(ao.a, ao.a);
/*     */     }
/*     */     
/*     */     public boolean a(tf ☃, anw anw1, aob aob1) {
/*  85 */       if (!this.a.a(☃, anw1)) {
/*  86 */         return false;
/*     */       }
/*  88 */       if (!this.b.a(☃, aob1)) {
/*  89 */         return false;
/*     */       }
/*  91 */       return true;
/*     */     }
/*     */ 
/*     */     
/*     */     public JsonElement b() {
/*  96 */       JsonObject ☃ = new JsonObject();
/*     */       
/*  98 */       ☃.add("zombie", this.a.a());
/*  99 */       ☃.add("villager", this.b.a());
/*     */       
/* 101 */       return (JsonElement)☃;
/*     */     }
/*     */   }
/*     */   
/*     */   static class a {
/*     */     private final pm a;
/* 107 */     private final Set<s.a<af.b>> b = Sets.newHashSet();
/*     */     
/*     */     public a(pm ☃) {
/* 110 */       this.a = ☃;
/*     */     }
/*     */     
/*     */     public boolean a() {
/* 114 */       return this.b.isEmpty();
/*     */     }
/*     */     
/*     */     public void a(s.a<af.b> ☃) {
/* 118 */       this.b.add(☃);
/*     */     }
/*     */     
/*     */     public void b(s.a<af.b> ☃) {
/* 122 */       this.b.remove(☃);
/*     */     }
/*     */     
/*     */     public void a(tf ☃, anw anw1, aob aob1) {
/* 126 */       List<s.a<af.b>> list = null;
/* 127 */       for (s.a<af.b> a1 : this.b) {
/* 128 */         if (((af.b)a1.a()).a(☃, anw1, aob1)) {
/* 129 */           if (list == null) {
/* 130 */             list = Lists.newArrayList();
/*     */           }
/* 132 */           list.add(a1);
/*     */         } 
/*     */       } 
/* 135 */       if (list != null)
/* 136 */         for (s.a<af.b> a1 : list)
/* 137 */           a1.a(this.a);  
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\af.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */