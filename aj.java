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
/*     */ public class aj
/*     */   implements s<aj.b>
/*     */ {
/*  19 */   private static final pc a = new pc("effects_changed");
/*     */   
/*  21 */   private final Map<pm, a> b = Maps.newHashMap();
/*     */ 
/*     */   
/*     */   public pc a() {
/*  25 */     return a;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(pm ☃, s.a<b> a1) {
/*  30 */     a a2 = this.b.get(☃);
/*  31 */     if (a2 == null) {
/*  32 */       a2 = new a(☃);
/*  33 */       this.b.put(☃, a2);
/*     */     } 
/*  35 */     a2.a(a1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(pm ☃, s.a<b> a1) {
/*  40 */     a a2 = this.b.get(☃);
/*  41 */     if (a2 != null) {
/*  42 */       a2.b(a1);
/*  43 */       if (a2.a()) {
/*  44 */         this.b.remove(☃);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(pm ☃) {
/*  51 */     this.b.remove(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public b b(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext) {
/*  56 */     bb bb = bb.a(☃.get("effects"));
/*  57 */     return new b(bb);
/*     */   }
/*     */   
/*     */   public void a(tf ☃) {
/*  61 */     a a = this.b.get(☃.L());
/*  62 */     if (a != null)
/*  63 */       a.a(☃); 
/*     */   }
/*     */   
/*     */   public static class b
/*     */     extends y {
/*     */     private final bb a;
/*     */     
/*     */     public b(bb ☃) {
/*  71 */       super(aj.b());
/*  72 */       this.a = ☃;
/*     */     }
/*     */     
/*     */     public static b a(bb ☃) {
/*  76 */       return new b(☃);
/*     */     }
/*     */     
/*     */     public boolean a(tf ☃) {
/*  80 */       return this.a.a(☃);
/*     */     }
/*     */ 
/*     */     
/*     */     public JsonElement b() {
/*  85 */       JsonObject ☃ = new JsonObject();
/*     */       
/*  87 */       ☃.add("effects", this.a.b());
/*     */       
/*  89 */       return (JsonElement)☃;
/*     */     }
/*     */   }
/*     */   
/*     */   static class a {
/*     */     private final pm a;
/*  95 */     private final Set<s.a<aj.b>> b = Sets.newHashSet();
/*     */     
/*     */     public a(pm ☃) {
/*  98 */       this.a = ☃;
/*     */     }
/*     */     
/*     */     public boolean a() {
/* 102 */       return this.b.isEmpty();
/*     */     }
/*     */     
/*     */     public void a(s.a<aj.b> ☃) {
/* 106 */       this.b.add(☃);
/*     */     }
/*     */     
/*     */     public void b(s.a<aj.b> ☃) {
/* 110 */       this.b.remove(☃);
/*     */     }
/*     */     
/*     */     public void a(tf ☃) {
/* 114 */       List<s.a<aj.b>> list = null;
/* 115 */       for (s.a<aj.b> a1 : this.b) {
/* 116 */         if (((aj.b)a1.a()).a(☃)) {
/* 117 */           if (list == null) {
/* 118 */             list = Lists.newArrayList();
/*     */           }
/* 120 */           list.add(a1);
/*     */         } 
/*     */       } 
/* 123 */       if (list != null)
/* 124 */         for (s.a<aj.b> a1 : list)
/* 125 */           a1.a(this.a);  
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\aj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */