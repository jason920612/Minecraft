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
/*     */ public class bh
/*     */   implements s<bh.b>
/*     */ {
/*  20 */   private static final pc a = new pc("summoned_entity");
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
/*     */   public void a(tf ☃, aer aer1) {
/*  62 */     a a = this.b.get(☃.L());
/*  63 */     if (a != null)
/*  64 */       a.a(☃, aer1); 
/*     */   }
/*     */   
/*     */   public static class b
/*     */     extends y {
/*     */     private final ao a;
/*     */     
/*     */     public b(ao ☃) {
/*  72 */       super(bh.b());
/*  73 */       this.a = ☃;
/*     */     }
/*     */     
/*     */     public static b a(ao.a ☃) {
/*  77 */       return new b(☃.b());
/*     */     }
/*     */     
/*     */     public boolean a(tf ☃, aer aer1) {
/*  81 */       return this.a.a(☃, aer1);
/*     */     }
/*     */ 
/*     */     
/*     */     public JsonElement b() {
/*  86 */       JsonObject ☃ = new JsonObject();
/*     */       
/*  88 */       ☃.add("entity", this.a.a());
/*     */       
/*  90 */       return (JsonElement)☃;
/*     */     }
/*     */   }
/*     */   
/*     */   static class a {
/*     */     private final pm a;
/*  96 */     private final Set<s.a<bh.b>> b = Sets.newHashSet();
/*     */     
/*     */     public a(pm ☃) {
/*  99 */       this.a = ☃;
/*     */     }
/*     */     
/*     */     public boolean a() {
/* 103 */       return this.b.isEmpty();
/*     */     }
/*     */     
/*     */     public void a(s.a<bh.b> ☃) {
/* 107 */       this.b.add(☃);
/*     */     }
/*     */     
/*     */     public void b(s.a<bh.b> ☃) {
/* 111 */       this.b.remove(☃);
/*     */     }
/*     */     
/*     */     public void a(tf ☃, aer aer1) {
/* 115 */       List<s.a<bh.b>> list = null;
/* 116 */       for (s.a<bh.b> a1 : this.b) {
/* 117 */         if (((bh.b)a1.a()).a(☃, aer1)) {
/* 118 */           if (list == null) {
/* 119 */             list = Lists.newArrayList();
/*     */           }
/* 121 */           list.add(a1);
/*     */         } 
/*     */       } 
/* 124 */       if (list != null)
/* 125 */         for (s.a<bh.b> a1 : list)
/* 126 */           a1.a(this.a);  
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */