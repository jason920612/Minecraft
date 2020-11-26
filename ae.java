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
/*     */ public class ae
/*     */   implements s<ae.b>
/*     */ {
/*  21 */   private static final pc a = new pc("consume_item");
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
/*  58 */     return new b(av.a(☃.get("item")));
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
/*  72 */       super(ae.b());
/*  73 */       this.a = ☃;
/*     */     }
/*     */     
/*     */     public static b c() {
/*  77 */       return new b(av.a);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static b a(axx ☃) {
/*  85 */       return new b(new av(null, ☃.h(), ba.d.e, ba.d.e, new al[0], null, bc.a));
/*     */     }
/*     */     
/*     */     public boolean a(ate ☃) {
/*  89 */       return this.a.a(☃);
/*     */     }
/*     */ 
/*     */     
/*     */     public JsonElement b() {
/*  94 */       JsonObject ☃ = new JsonObject();
/*     */       
/*  96 */       ☃.add("item", this.a.a());
/*     */       
/*  98 */       return (JsonElement)☃;
/*     */     }
/*     */   }
/*     */   
/*     */   static class a {
/*     */     private final pm a;
/* 104 */     private final Set<s.a<ae.b>> b = Sets.newHashSet();
/*     */     
/*     */     public a(pm ☃) {
/* 107 */       this.a = ☃;
/*     */     }
/*     */     
/*     */     public boolean a() {
/* 111 */       return this.b.isEmpty();
/*     */     }
/*     */     
/*     */     public void a(s.a<ae.b> ☃) {
/* 115 */       this.b.add(☃);
/*     */     }
/*     */     
/*     */     public void b(s.a<ae.b> ☃) {
/* 119 */       this.b.remove(☃);
/*     */     }
/*     */     
/*     */     public void a(ate ☃) {
/* 123 */       List<s.a<ae.b>> list = null;
/* 124 */       for (s.a<ae.b> a1 : this.b) {
/* 125 */         if (((ae.b)a1.a()).a(☃)) {
/* 126 */           if (list == null) {
/* 127 */             list = Lists.newArrayList();
/*     */           }
/* 129 */           list.add(a1);
/*     */         } 
/*     */       } 
/* 132 */       if (list != null)
/* 133 */         for (s.a<ae.b> a1 : list)
/* 134 */           a1.a(this.a);  
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\ae.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */