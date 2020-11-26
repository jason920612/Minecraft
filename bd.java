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
/*     */ public class bd
/*     */   implements s<bd.b>
/*     */ {
/*  21 */   private static final pc a = new pc("nether_travel");
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
/*  58 */     ay ay1 = ay.a(☃.get("entered"));
/*  59 */     ay ay2 = ay.a(☃.get("exited"));
/*  60 */     ai ai = ai.a(☃.get("distance"));
/*  61 */     return new b(ay1, ay2, ai);
/*     */   }
/*     */   
/*     */   public void a(tf ☃, cee cee1) {
/*  65 */     a a = this.b.get(☃.L());
/*  66 */     if (a != null)
/*  67 */       a.a(☃.s(), cee1, ☃.q, ☃.r, ☃.s); 
/*     */   }
/*     */   
/*     */   public static class b
/*     */     extends y {
/*     */     private final ay a;
/*     */     private final ay b;
/*     */     private final ai c;
/*     */     
/*     */     public b(ay ☃, ay ay1, ai ai1) {
/*  77 */       super(bd.b());
/*  78 */       this.a = ☃;
/*  79 */       this.b = ay1;
/*  80 */       this.c = ai1;
/*     */     }
/*     */     
/*     */     public static b a(ai ☃) {
/*  84 */       return new b(ay.a, ay.a, ☃);
/*     */     }
/*     */     
/*     */     public boolean a(td ☃, cee cee1, double d1, double d2, double d3) {
/*  88 */       if (!this.a.a(☃, cee1.b, cee1.c, cee1.d)) {
/*  89 */         return false;
/*     */       }
/*  91 */       if (!this.b.a(☃, d1, d2, d3)) {
/*  92 */         return false;
/*     */       }
/*  94 */       if (!this.c.a(cee1.b, cee1.c, cee1.d, d1, d2, d3)) {
/*  95 */         return false;
/*     */       }
/*  97 */       return true;
/*     */     }
/*     */ 
/*     */     
/*     */     public JsonElement b() {
/* 102 */       JsonObject ☃ = new JsonObject();
/*     */       
/* 104 */       ☃.add("entered", this.a.a());
/* 105 */       ☃.add("exited", this.b.a());
/* 106 */       ☃.add("distance", this.c.a());
/*     */       
/* 108 */       return (JsonElement)☃;
/*     */     }
/*     */   }
/*     */   
/*     */   static class a {
/*     */     private final pm a;
/* 114 */     private final Set<s.a<bd.b>> b = Sets.newHashSet();
/*     */     
/*     */     public a(pm ☃) {
/* 117 */       this.a = ☃;
/*     */     }
/*     */     
/*     */     public boolean a() {
/* 121 */       return this.b.isEmpty();
/*     */     }
/*     */     
/*     */     public void a(s.a<bd.b> ☃) {
/* 125 */       this.b.add(☃);
/*     */     }
/*     */     
/*     */     public void b(s.a<bd.b> ☃) {
/* 129 */       this.b.remove(☃);
/*     */     }
/*     */     
/*     */     public void a(td ☃, cee cee1, double d1, double d2, double d3) {
/* 133 */       List<s.a<bd.b>> list = null;
/* 134 */       for (s.a<bd.b> a1 : this.b) {
/* 135 */         if (((bd.b)a1.a()).a(☃, cee1, d1, d2, d3)) {
/* 136 */           if (list == null) {
/* 137 */             list = Lists.newArrayList();
/*     */           }
/* 139 */           list.add(a1);
/*     */         } 
/*     */       } 
/* 142 */       if (list != null)
/* 143 */         for (s.a<bd.b> a1 : list)
/* 144 */           a1.a(this.a);  
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */