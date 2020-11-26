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
/*     */ 
/*     */ public class aw
/*     */   implements s<aw.b>
/*     */ {
/*  22 */   private final Map<pm, a> a = Maps.newHashMap();
/*     */   private final pc b;
/*     */   
/*     */   public aw(pc ☃) {
/*  26 */     this.b = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public pc a() {
/*  31 */     return this.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(pm ☃, s.a<b> a1) {
/*  36 */     a a2 = this.a.get(☃);
/*  37 */     if (a2 == null) {
/*  38 */       a2 = new a(☃);
/*  39 */       this.a.put(☃, a2);
/*     */     } 
/*  41 */     a2.a(a1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(pm ☃, s.a<b> a1) {
/*  46 */     a a2 = this.a.get(☃);
/*  47 */     if (a2 != null) {
/*  48 */       a2.b(a1);
/*  49 */       if (a2.a()) {
/*  50 */         this.a.remove(☃);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(pm ☃) {
/*  57 */     this.a.remove(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public b b(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext) {
/*  62 */     return new b(this.b, ao.a(☃.get("entity")), ah.a(☃.get("killing_blow")));
/*     */   }
/*     */   
/*     */   public void a(tf ☃, aer aer1, aea aea1) {
/*  66 */     a a = this.a.get(☃.L());
/*  67 */     if (a != null)
/*  68 */       a.a(☃, aer1, aea1); 
/*     */   }
/*     */   
/*     */   public static class b
/*     */     extends y {
/*     */     private final ao a;
/*     */     private final ah b;
/*     */     
/*     */     public b(pc ☃, ao ao1, ah ah1) {
/*  77 */       super(☃);
/*  78 */       this.a = ao1;
/*  79 */       this.b = ah1;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static b a(ao.a ☃) {
/*  87 */       return new b(aw.a(p.b), ☃.b(), ah.a);
/*     */     }
/*     */     
/*     */     public static b c() {
/*  91 */       return new b(aw.a(p.b), ao.a, ah.a);
/*     */     }
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
/*     */     public static b a(ao.a ☃, ah.a a1) {
/* 107 */       return new b(aw.a(p.b), ☃.b(), a1.b());
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static b d() {
/* 119 */       return new b(aw.a(p.c), ao.a, ah.a);
/*     */     }
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
/*     */     public boolean a(tf ☃, aer aer1, aea aea1) {
/* 139 */       if (!this.b.a(☃, aea1)) {
/* 140 */         return false;
/*     */       }
/* 142 */       return this.a.a(☃, aer1);
/*     */     }
/*     */ 
/*     */     
/*     */     public JsonElement b() {
/* 147 */       JsonObject ☃ = new JsonObject();
/*     */       
/* 149 */       ☃.add("entity", this.a.a());
/* 150 */       ☃.add("killing_blow", this.b.a());
/*     */       
/* 152 */       return (JsonElement)☃;
/*     */     }
/*     */   }
/*     */   
/*     */   static class a {
/*     */     private final pm a;
/* 158 */     private final Set<s.a<aw.b>> b = Sets.newHashSet();
/*     */     
/*     */     public a(pm ☃) {
/* 161 */       this.a = ☃;
/*     */     }
/*     */     
/*     */     public boolean a() {
/* 165 */       return this.b.isEmpty();
/*     */     }
/*     */     
/*     */     public void a(s.a<aw.b> ☃) {
/* 169 */       this.b.add(☃);
/*     */     }
/*     */     
/*     */     public void b(s.a<aw.b> ☃) {
/* 173 */       this.b.remove(☃);
/*     */     }
/*     */     
/*     */     public void a(tf ☃, aer aer1, aea aea1) {
/* 177 */       List<s.a<aw.b>> list = null;
/* 178 */       for (s.a<aw.b> a1 : this.b) {
/* 179 */         if (((aw.b)a1.a()).a(☃, aer1, aea1)) {
/* 180 */           if (list == null) {
/* 181 */             list = Lists.newArrayList();
/*     */           }
/* 183 */           list.add(a1);
/*     */         } 
/*     */       } 
/* 186 */       if (list != null)
/* 187 */         for (s.a<aw.b> a1 : list)
/* 188 */           a1.a(this.a);  
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\aw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */