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
/*     */ public class aq
/*     */   implements s<aq.b>
/*     */ {
/*  20 */   private static final pc a = new pc("filled_bucket");
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
/*  57 */     av av = av.a(☃.get("item"));
/*  58 */     return new b(av);
/*     */   }
/*     */   
/*     */   public void a(tf ☃, ate ate1) {
/*  62 */     a a = this.b.get(☃.L());
/*  63 */     if (a != null)
/*  64 */       a.a(ate1); 
/*     */   }
/*     */   
/*     */   public static class b
/*     */     extends y {
/*     */     private final av a;
/*     */     
/*     */     public b(av ☃) {
/*  72 */       super(aq.b());
/*  73 */       this.a = ☃;
/*     */     }
/*     */     
/*     */     public static b a(av ☃) {
/*  77 */       return new b(☃);
/*     */     }
/*     */     
/*     */     public boolean a(ate ☃) {
/*  81 */       if (!this.a.a(☃)) {
/*  82 */         return false;
/*     */       }
/*  84 */       return true;
/*     */     }
/*     */ 
/*     */     
/*     */     public JsonElement b() {
/*  89 */       JsonObject ☃ = new JsonObject();
/*     */       
/*  91 */       ☃.add("item", this.a.a());
/*     */       
/*  93 */       return (JsonElement)☃;
/*     */     }
/*     */   }
/*     */   
/*     */   static class a {
/*     */     private final pm a;
/*  99 */     private final Set<s.a<aq.b>> b = Sets.newHashSet();
/*     */     
/*     */     public a(pm ☃) {
/* 102 */       this.a = ☃;
/*     */     }
/*     */     
/*     */     public boolean a() {
/* 106 */       return this.b.isEmpty();
/*     */     }
/*     */     
/*     */     public void a(s.a<aq.b> ☃) {
/* 110 */       this.b.add(☃);
/*     */     }
/*     */     
/*     */     public void b(s.a<aq.b> ☃) {
/* 114 */       this.b.remove(☃);
/*     */     }
/*     */     
/*     */     public void a(ate ☃) {
/* 118 */       List<s.a<aq.b>> list = null;
/* 119 */       for (s.a<aq.b> a1 : this.b) {
/* 120 */         if (((aq.b)a1.a()).a(☃)) {
/* 121 */           if (list == null) {
/* 122 */             list = Lists.newArrayList();
/*     */           }
/* 124 */           list.add(a1);
/*     */         } 
/*     */       } 
/* 127 */       if (list != null)
/* 128 */         for (s.a<aq.b> a1 : list)
/* 129 */           a1.a(this.a);  
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\aq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */