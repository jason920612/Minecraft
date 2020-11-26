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
/*     */ 
/*     */ public class bm
/*     */   implements s<bm.b>
/*     */ {
/*  23 */   private static final pc a = new pc("used_totem");
/*     */   
/*  25 */   private final Map<pm, a> b = Maps.newHashMap();
/*     */ 
/*     */   
/*     */   public pc a() {
/*  29 */     return a;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(pm ☃, s.a<b> a1) {
/*  34 */     a a2 = this.b.get(☃);
/*  35 */     if (a2 == null) {
/*  36 */       a2 = new a(☃);
/*  37 */       this.b.put(☃, a2);
/*     */     } 
/*  39 */     a2.a(a1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(pm ☃, s.a<b> a1) {
/*  44 */     a a2 = this.b.get(☃);
/*  45 */     if (a2 != null) {
/*  46 */       a2.b(a1);
/*  47 */       if (a2.a()) {
/*  48 */         this.b.remove(☃);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(pm ☃) {
/*  55 */     this.b.remove(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public b b(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext) {
/*  60 */     av av = av.a(☃.get("item"));
/*  61 */     return new b(av);
/*     */   }
/*     */   
/*     */   public void a(tf ☃, ate ate1) {
/*  65 */     a a = this.b.get(☃.L());
/*  66 */     if (a != null)
/*  67 */       a.a(ate1); 
/*     */   }
/*     */   
/*     */   public static class b
/*     */     extends y {
/*     */     private final av a;
/*     */     
/*     */     public b(av ☃) {
/*  75 */       super(bm.b());
/*  76 */       this.a = ☃;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static b a(axx ☃) {
/*  84 */       return new b(av.a.a().a(☃).b());
/*     */     }
/*     */     
/*     */     public boolean a(ate ☃) {
/*  88 */       return this.a.a(☃);
/*     */     }
/*     */ 
/*     */     
/*     */     public JsonElement b() {
/*  93 */       JsonObject ☃ = new JsonObject();
/*     */       
/*  95 */       ☃.add("item", this.a.a());
/*     */       
/*  97 */       return (JsonElement)☃;
/*     */     }
/*     */   }
/*     */   
/*     */   static class a {
/*     */     private final pm a;
/* 103 */     private final Set<s.a<bm.b>> b = Sets.newHashSet();
/*     */     
/*     */     public a(pm ☃) {
/* 106 */       this.a = ☃;
/*     */     }
/*     */     
/*     */     public boolean a() {
/* 110 */       return this.b.isEmpty();
/*     */     }
/*     */     
/*     */     public void a(s.a<bm.b> ☃) {
/* 114 */       this.b.add(☃);
/*     */     }
/*     */     
/*     */     public void b(s.a<bm.b> ☃) {
/* 118 */       this.b.remove(☃);
/*     */     }
/*     */     
/*     */     public void a(ate ☃) {
/* 122 */       List<s.a<bm.b>> list = null;
/* 123 */       for (s.a<bm.b> a1 : this.b) {
/* 124 */         if (((bm.b)a1.a()).a(☃)) {
/* 125 */           if (list == null) {
/* 126 */             list = Lists.newArrayList();
/*     */           }
/* 128 */           list.add(a1);
/*     */         } 
/*     */       } 
/* 131 */       if (list != null)
/* 132 */         for (s.a<bm.b> a1 : list)
/* 133 */           a1.a(this.a);  
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */