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
/*     */ public class bi
/*     */   implements s<bi.b>
/*     */ {
/*  20 */   private static final pc a = new pc("tame_animal");
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
/*  57 */     ao ao = ao.a(☃.get("entity"));
/*  58 */     return new b(ao);
/*     */   }
/*     */   
/*     */   public void a(tf ☃, ajq ajq1) {
/*  62 */     a a = this.b.get(☃.L());
/*  63 */     if (a != null)
/*  64 */       a.a(☃, ajq1); 
/*     */   }
/*     */   
/*     */   public static class b
/*     */     extends y {
/*     */     private final ao a;
/*     */     
/*     */     public b(ao ☃) {
/*  72 */       super(bi.b());
/*  73 */       this.a = ☃;
/*     */     }
/*     */     
/*     */     public static b c() {
/*  77 */       return new b(ao.a);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public boolean a(tf ☃, ajq ajq1) {
/*  85 */       return this.a.a(☃, ajq1);
/*     */     }
/*     */ 
/*     */     
/*     */     public JsonElement b() {
/*  90 */       JsonObject ☃ = new JsonObject();
/*     */       
/*  92 */       ☃.add("entity", this.a.a());
/*     */       
/*  94 */       return (JsonElement)☃;
/*     */     }
/*     */   }
/*     */   
/*     */   static class a {
/*     */     private final pm a;
/* 100 */     private final Set<s.a<bi.b>> b = Sets.newHashSet();
/*     */     
/*     */     public a(pm ☃) {
/* 103 */       this.a = ☃;
/*     */     }
/*     */     
/*     */     public boolean a() {
/* 107 */       return this.b.isEmpty();
/*     */     }
/*     */     
/*     */     public void a(s.a<bi.b> ☃) {
/* 111 */       this.b.add(☃);
/*     */     }
/*     */     
/*     */     public void b(s.a<bi.b> ☃) {
/* 115 */       this.b.remove(☃);
/*     */     }
/*     */     
/*     */     public void a(tf ☃, ajq ajq1) {
/* 119 */       List<s.a<bi.b>> list = null;
/* 120 */       for (s.a<bi.b> a1 : this.b) {
/* 121 */         if (((bi.b)a1.a()).a(☃, ajq1)) {
/* 122 */           if (list == null) {
/* 123 */             list = Lists.newArrayList();
/*     */           }
/* 125 */           list.add(a1);
/*     */         } 
/*     */       } 
/* 128 */       if (list != null)
/* 129 */         for (s.a<bi.b> a1 : list)
/* 130 */           a1.a(this.a);  
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */