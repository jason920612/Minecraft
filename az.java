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
/*     */ public class az
/*     */   implements s<az.b>
/*     */ {
/*     */   private final pc a;
/*  22 */   private final Map<pm, a> b = Maps.newHashMap();
/*     */   
/*     */   public az(pc ☃) {
/*  25 */     this.a = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public pc a() {
/*  30 */     return this.a;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(pm ☃, s.a<b> a1) {
/*  35 */     a a2 = this.b.get(☃);
/*  36 */     if (a2 == null) {
/*  37 */       a2 = new a(☃);
/*  38 */       this.b.put(☃, a2);
/*     */     } 
/*  40 */     a2.a(a1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(pm ☃, s.a<b> a1) {
/*  45 */     a a2 = this.b.get(☃);
/*  46 */     if (a2 != null) {
/*  47 */       a2.b(a1);
/*  48 */       if (a2.a()) {
/*  49 */         this.b.remove(☃);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(pm ☃) {
/*  56 */     this.b.remove(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public b b(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext) {
/*  61 */     ay ay = ay.a((JsonElement)☃);
/*  62 */     return new b(this.a, ay);
/*     */   }
/*     */   
/*     */   public void a(tf ☃) {
/*  66 */     a a = this.b.get(☃.L());
/*  67 */     if (a != null)
/*  68 */       a.a(☃.s(), ☃.q, ☃.r, ☃.s); 
/*     */   }
/*     */   
/*     */   public static class b
/*     */     extends y {
/*     */     private final ay a;
/*     */     
/*     */     public b(pc ☃, ay ay1) {
/*  76 */       super(☃);
/*  77 */       this.a = ay1;
/*     */     }
/*     */     
/*     */     public static b a(ay ☃) {
/*  81 */       return new b(az.a(p.p), ☃);
/*     */     }
/*     */     
/*     */     public static b c() {
/*  85 */       return new b(az.a(p.q), ay.a);
/*     */     }
/*     */     
/*     */     public boolean a(td ☃, double d1, double d2, double d3) {
/*  89 */       return this.a.a(☃, d1, d2, d3);
/*     */     }
/*     */ 
/*     */     
/*     */     public JsonElement b() {
/*  94 */       return this.a.a();
/*     */     }
/*     */   }
/*     */   
/*     */   static class a {
/*     */     private final pm a;
/* 100 */     private final Set<s.a<az.b>> b = Sets.newHashSet();
/*     */     
/*     */     public a(pm ☃) {
/* 103 */       this.a = ☃;
/*     */     }
/*     */     
/*     */     public boolean a() {
/* 107 */       return this.b.isEmpty();
/*     */     }
/*     */     
/*     */     public void a(s.a<az.b> ☃) {
/* 111 */       this.b.add(☃);
/*     */     }
/*     */     
/*     */     public void b(s.a<az.b> ☃) {
/* 115 */       this.b.remove(☃);
/*     */     }
/*     */     
/*     */     public void a(td ☃, double d1, double d2, double d3) {
/* 119 */       List<s.a<az.b>> list = null;
/* 120 */       for (s.a<az.b> a1 : this.b) {
/* 121 */         if (((az.b)a1.a()).a(☃, d1, d2, d3)) {
/* 122 */           if (list == null) {
/* 123 */             list = Lists.newArrayList();
/*     */           }
/* 125 */           list.add(a1);
/*     */         } 
/*     */       } 
/* 128 */       if (list != null)
/* 129 */         for (s.a<az.b> a1 : list)
/* 130 */           a1.a(this.a);  
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\az.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */